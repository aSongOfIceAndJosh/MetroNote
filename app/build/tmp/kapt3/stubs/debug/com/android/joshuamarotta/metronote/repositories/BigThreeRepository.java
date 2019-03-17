package com.android.joshuamarotta.metronote.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fH\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/android/joshuamarotta/metronote/repositories/BigThreeRepository;", "", "()V", "bigThree", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/android/joshuamarotta/metronote/models/BigThreeModel;", "getBigThree", "()Landroid/arch/lifecycle/LiveData;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "loadImageThumbnails", "Lcom/google/android/gms/tasks/Task;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "app_debug"})
public final class BigThreeRepository {
    private com.google.firebase.storage.FirebaseStorage storage;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.BigThreeModel>> bigThree = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.android.joshuamarotta.metronote.models.BigThreeModel>> getBigThree() {
        return null;
    }
    
    private final com.google.android.gms.tasks.Task<android.net.Uri> loadImageThumbnails() {
        return null;
    }
    
    public BigThreeRepository() {
        super();
    }
}