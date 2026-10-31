package l;

import java.net.ServerSocket;

/* JADX INFO: renamed from: l.ۙۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8538 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4399 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ServiceC7926 f14086;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ServerSocket f14087;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                C19922 c19922 = new C19922(this.f14087.accept(), new C22038());
                c19922.start();
                this.f14086.m21231(c19922);
            } catch (Exception unused) {
                return;
            }
        }
    }
}
