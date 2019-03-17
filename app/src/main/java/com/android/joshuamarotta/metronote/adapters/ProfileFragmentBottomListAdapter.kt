package com.android.joshuamarotta.metronote.adapters

import android.content.Context
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.drawable.Drawable
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.joshuamarotta.metronote.R
import com.android.joshuamarotta.metronote.models.BigThreeModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.profile_fragment_event_button.view.*
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.load.DataSource


class ProfileFragmentBottomListAdapter internal constructor(context: Context, private val profileFragmentClickFuntion: (Int) -> Unit) : RecyclerView.Adapter<ProfileFragmentBottomListAdapter.BigThreeViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var properties = emptyList<BigThreeModel>() // Cached copy of events

    inner class BigThreeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val propertyTitle = itemView.profile_fragment_button_text_view
        val propertyImage = itemView.profile_fragment_button_image_view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BigThreeViewHolder {
        val itemView = inflater.inflate(R.layout.profile_fragment_event_button, parent, false)
        val bigThreeViewHolder = BigThreeViewHolder(itemView)
        bigThreeViewHolder.itemView.setOnClickListener {
            profileFragmentClickFuntion(bigThreeViewHolder.adapterPosition)
        }
        return bigThreeViewHolder
    }

    override fun getItemCount() = properties.size

    override fun onBindViewHolder(holder: ProfileFragmentBottomListAdapter.BigThreeViewHolder, position: Int) {
        val current = properties[position]
        holder.propertyTitle.text = current.title
        current.imageUri?.let { loadImageViaGlide(holder, it) }
    }

    internal fun setBigThreeProperties(bigThreeModels: List<BigThreeModel>) {
        this.properties = bigThreeModels
        notifyDataSetChanged()
    }

    private fun loadImageViaGlide(holder: ProfileFragmentBottomListAdapter.BigThreeViewHolder, uri: Uri) {
        val colorMatrix = ColorMatrix()
        colorMatrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(colorMatrix)

        //TODO - clean up view references here!
        Glide.with(holder.propertyImage)
            .load(uri.toString())
            .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
            .listener(object: RequestListener<Drawable> {
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean) =  false
                override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                    holder.itemView.profile_fragment_button_image_view.colorFilter = filter
                    holder.itemView.profile_fragment_root_layout.visibility = View.VISIBLE
                    /*if (position == itemCount-3) {
                        rootView.rotateloading_profile_fragment_recycler_view.visibility = View.GONE
                        rootView.rotateloading_profile_fragment_recycler_view.stop()
                    }*/
                    return false
                }

            })
            .into(holder.itemView.profile_fragment_button_image_view)

    }
}