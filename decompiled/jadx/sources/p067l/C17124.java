package p067l;

/* JADX INFO: renamed from: l.ܶ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17124 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final C20891 f50589;

    /* JADX INFO: renamed from: ᩹ */
    public final C12825 f50590;

    public C17124(C12825 c12825, C20891 c20891) {
        this.f50589 = c20891;
        this.f50590 = c20891 != null ? c20891.m47193() : c12825;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C20891 c20891 = this.f50589;
        if (c20891 != null) {
            c20891.close();
        }
    }
}
