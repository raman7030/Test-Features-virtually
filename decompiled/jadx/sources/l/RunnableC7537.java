package l;

import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۟ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC7537 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f23289;

    public RunnableC7537(LoadingDialog loadingDialog) {
        this.f23289 = new WeakReference(loadingDialog);
    }

    @Override // java.lang.Runnable
    public void run() {
        LoadingDialog loadingDialog = (LoadingDialog) this.f23289.get();
        if (loadingDialog == null || !loadingDialog.delayShow) {
            return;
        }
        loadingDialog.delayShow = false;
        loadingDialog.dialog.show();
    }
}
