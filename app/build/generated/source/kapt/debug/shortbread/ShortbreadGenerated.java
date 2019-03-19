package shortbread;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import com.android.joshuamarotta.metronote.activities.HomeActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressLint({
        "NewApi",
        "ResourceType"
})
public final class ShortbreadGenerated {
    public static List<List<ShortcutInfo>> createShortcuts(Context context) {
        List<ShortcutInfo> enabledShortcuts = new ArrayList<>();
        List<ShortcutInfo> disabledShortcuts = new ArrayList<>();
        enabledShortcuts.add(new ShortcutInfo.Builder(context, "createEvent")
                .setShortLabel("Create Event")
                .setIcon(Icon.createWithResource(context, 2131230857))
                .setIntents(TaskStackBuilder.create(context)
                        .addParentStack(HomeActivity.class)
                        .addNextIntent(new Intent(context, HomeActivity.class)
                                .setAction(Intent.ACTION_VIEW)
                                .putExtra("shortbread_method", "transactCreateEventFragment"))
                        .getIntents())
                .setRank(0)
                .build());
        return Arrays.asList(enabledShortcuts, disabledShortcuts);
    }

    public static void callMethodShortcut(Activity activity) {
        if (activity instanceof HomeActivity) {
            if ("transactCreateEventFragment".equals(activity.getIntent().getStringExtra("shortbread_method"))) {
                ((HomeActivity) activity).transactCreateEventFragment();
            }
        }
    }
}
