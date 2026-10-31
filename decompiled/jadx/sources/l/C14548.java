package l;

/* JADX INFO: renamed from: l.ܳ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14548 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15007 f44565;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C15007 c15007 = this.f44565;
        if (c15007 != null) {
            c15007.close();
            this.f44565 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12704 m34740() {
        C12704 c12704;
        C15007 c15007 = this.f44565;
        if (c15007 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        c12704 = c15007.f45762;
        return new C12704(c12704.m32420(), c12704.m30979());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m34741(C10130 c10130) {
        C15007 c15007 = this.f44565;
        if (c15007 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        C3678.m11207(c15007, c10130);
    }

    public C14548(C15007 c15007) {
        this.f44565 = c15007;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15007 m34739(C14548 c14548) {
        C15007 c15007 = c14548.f44565;
        if (c15007 != null) {
            return c15007;
        }
        throw new IllegalStateException("Session state is closed");
    }
}
