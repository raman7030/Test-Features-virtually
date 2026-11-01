package p067l;

import com.tencent.connect.auth.DialogC0602a;

/* JADX INFO: renamed from: l.۬۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC14707 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14037 f41938;

    public RunnableC14707(C14037 c14037) {
        this.f41938 = c14037;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogC0602a dialogC0602a = this.f41938.f39597;
        if (dialogC0602a.f2072 != null) {
            dialogC0602a.f2072.loadUrl(dialogC0602a.f2071);
        }
    }
}
