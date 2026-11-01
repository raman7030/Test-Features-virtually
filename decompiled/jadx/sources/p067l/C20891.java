package p067l;

/* JADX INFO: renamed from: l.᩵۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20891 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final C3455 f65603;

    /* JADX INFO: renamed from: ᩹ */
    public C20220 f65604;

    public C20891(C3455 c3455, C20220 c20220) {
        this.f65603 = c3455;
        this.f65604 = c20220;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12825 m47193() {
        C20220 c20220 = this.f65604;
        if (c20220 == null) {
            throw new IllegalStateException("Page lease is closed");
        }
        return c20220.f62517;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C22902 c22902;
        synchronized (this.f65603) {
            C20220 c20220 = this.f65604;
            c22902 = null;
            if (c20220 != null) {
                c20220.f62518--;
                C22902 c22903 = c20220.f62519.f28112;
                this.f65604 = null;
                this.f65603.notifyAll();
                c22902 = c22903;
            }
        }
        if (c22902 != null) {
            c22902.m51159();
        }
    }
}
