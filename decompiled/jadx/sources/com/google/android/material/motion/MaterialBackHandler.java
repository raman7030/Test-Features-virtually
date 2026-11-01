package com.google.android.material.motion;

import p067l.C1840;

/* JADX INFO: loaded from: classes.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(C1840 c1840);

    void updateBackProgress(C1840 c1840);
}
