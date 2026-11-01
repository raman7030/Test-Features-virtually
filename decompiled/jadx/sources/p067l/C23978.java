package p067l;

/* JADX INFO: renamed from: l.᩺ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23978 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f76172 = true;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9226 f76173;

    public C23978(C9226 c9226) {
        this.f76173 = c9226;
        c9226.f24974.m33382();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53151() {
        this.f76172 = false;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C9226.f24965.fine("JSyn synthesis thread starting.");
        try {
            this.f76173.f24972 = new C11909();
            while (this.f76172) {
                this.f76173.f24972.getClass();
                System.nanoTime();
                C9226.m21251(this.f76173);
                this.f76173.m21257();
                this.f76173.f24972.m27227();
                if (this.f76173.m21260()) {
                    Thread.sleep(2L);
                }
            }
        } catch (Throwable unused) {
            try {
                this.f76172 = false;
            } catch (Throwable th) {
                C9226.f24965.info("JSyn synthesis thread in finally code.");
                throw th;
            }
        }
        C9226.f24965.info("JSyn synthesis thread in finally code.");
        C9226.f24965.fine("JSyn synthesis thread exiting.");
    }
}
