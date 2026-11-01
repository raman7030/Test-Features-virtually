package p067l;

/* JADX INFO: renamed from: l.ܳ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16195 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public C16631 f47671;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C16631 c16631 = this.f47671;
        if (c16631 != null) {
            c16631.close();
            this.f47671 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C14443 m36889() {
        C14443 c14443;
        C16631 c16631 = this.f47671;
        if (c16631 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        c14443 = c16631.f48875;
        return new C14443(c14443.m34522(), c14443.m33057());
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m36890(C11996 c11996) {
        C16631 c16631 = this.f47671;
        if (c16631 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        C5864.m13167(c16631, c11996);
    }

    public C16195(C16631 c16631) {
        this.f47671 = c16631;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16631 m36888(C16195 c16195) {
        C16631 c16631 = c16195.f47671;
        if (c16631 != null) {
            return c16631;
        }
        throw new IllegalStateException("Session state is closed");
    }
}
