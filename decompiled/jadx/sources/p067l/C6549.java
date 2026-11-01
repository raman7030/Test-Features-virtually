package p067l;

import java.net.ServerSocket;

/* JADX INFO: renamed from: l.ۙۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8538 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6549 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public ServiceC9901 f16902;

    /* JADX INFO: renamed from: ᩹ */
    public ServerSocket f16903;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                C21302 c21302 = new C21302(this.f16903.accept(), new C23313());
                c21302.start();
                this.f16902.m23197(c21302);
            } catch (Exception unused) {
                return;
            }
        }
    }
}
