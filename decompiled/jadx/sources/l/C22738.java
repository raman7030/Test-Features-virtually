package l;

/* JADX INFO: renamed from: l.᩺ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22738 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f73445 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7216 f73446;

    public C22738(C7216 c7216) {
        this.f73446 = c7216;
        c7216.f22089.m31296();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50818() {
        this.f73445 = false;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C7216.f22080.fine("JSyn synthesis thread starting.");
        try {
            this.f73446.f22087 = new C10039();
            while (this.f73445) {
                this.f73446.f22087.getClass();
                System.nanoTime();
                C7216.m19303(this.f73446);
                this.f73446.m19309();
                this.f73446.f22087.m25210();
                if (this.f73446.m19312()) {
                    Thread.sleep(2L);
                }
            }
        } catch (Throwable unused) {
            try {
                this.f73445 = false;
            } catch (Throwable th) {
                C7216.f22080.info("JSyn synthesis thread in finally code.");
                throw th;
            }
        }
        C7216.f22080.info("JSyn synthesis thread in finally code.");
        C7216.f22080.fine("JSyn synthesis thread exiting.");
    }
}
