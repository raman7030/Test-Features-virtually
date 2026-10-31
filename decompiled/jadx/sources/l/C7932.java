package l;

/* JADX INFO: renamed from: l.۠ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7932 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14987 f24555;

    public C7932(C14987 c14987) {
        this.f24555 = c14987;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14987 c14987;
        synchronized (this) {
            c14987 = this.f24555;
            this.f24555 = null;
        }
        if (c14987 != null) {
            C14987.m35512(c14987, (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21239(Throwable th) {
        C14987 c14987;
        synchronized (this) {
            c14987 = this.f24555;
            this.f24555 = null;
        }
        if (c14987 != null) {
            C14987.m35512(c14987, th);
        }
    }
}
