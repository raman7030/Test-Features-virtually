package p067l;

/* JADX INFO: renamed from: l.۠ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9907 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public C16612 f27469;

    public C9907(C16612 c16612) {
        this.f27469 = c16612;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C16612 c16612;
        synchronized (this) {
            c16612 = this.f27469;
            this.f27469 = null;
        }
        if (c16612 != null) {
            C16612.m37668(c16612, (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23205(Throwable th) {
        C16612 c16612;
        synchronized (this) {
            c16612 = this.f27469;
            this.f27469 = null;
        }
        if (c16612 != null) {
            C16612.m37668(c16612, th);
        }
    }
}
