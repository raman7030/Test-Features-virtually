package p067l;

import android.app.Dialog;

/* JADX INFO: renamed from: l.֡ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2832 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Dialog f4873;

    public RunnableC2832(Dialog dialog) {
        this.f4873 = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4873.dismiss();
        } catch (Exception e) {
            C11060.m25465("openSDK_LOG.DialogUtils", "dismiss dialog exception", e);
        }
    }
}
