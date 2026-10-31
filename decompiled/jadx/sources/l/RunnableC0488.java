package l;

import android.app.Dialog;

/* JADX INFO: renamed from: l.֡ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0488 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Dialog f2101;

    public RunnableC0488(Dialog dialog) {
        this.f2101 = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2101.dismiss();
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.DialogUtils", "dismiss dialog exception", e);
        }
    }
}
