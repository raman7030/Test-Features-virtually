package com.google.android.material.motion;

import l.C20118;

/* JADX INFO: loaded from: classes.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(C20118 c20118);

    void updateBackProgress(C20118 c20118);
}
