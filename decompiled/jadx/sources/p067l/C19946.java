package p067l;

/* JADX INFO: renamed from: l.ᩴۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19946 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C7245 f60547;

    /* JADX INFO: renamed from: ᩸ */
    public final int f60548;

    /* JADX INFO: renamed from: ᩹ */
    public volatile C2510 f60549;

    public C19946(C2510 c2510, int i, C7245 c7245) {
        this.f60549 = c2510;
        this.f60548 = i;
        this.f60547 = c7245;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7245 m45272(InterfaceC3221 interfaceC3221) {
        C2510 c2510 = this.f60549;
        if (c2510 == null) {
            throw new IllegalStateException("Text batch is no longer active");
        }
        return C2510.m3636(c2510, this, interfaceC3221);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C2510 c2510 = this.f60549;
        if (c2510 != null) {
            c2510.m3649();
        }
    }
}
