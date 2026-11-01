package p067l;

import bin.p000mt.plugin.api.p002ui.dialog.LoadingDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۟ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC9532 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final WeakReference f26202;

    public RunnableC9532(LoadingDialog loadingDialog) {
        this.f26202 = new WeakReference(loadingDialog);
    }

    @Override // java.lang.Runnable
    public void run() {
        LoadingDialog loadingDialog = (LoadingDialog) this.f26202.get();
        if (loadingDialog == null || !loadingDialog.delayShow) {
            return;
        }
        loadingDialog.delayShow = false;
        loadingDialog.dialog.show();
    }
}
