package l;

/* JADX INFO: renamed from: l.ۤᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10457 extends AbstractC18197 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f31392;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f31393;

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean mo26321(AbstractC18197 abstractC18197) {
        return false;
    }

    public C10457(int i, C13312 c13312, int i2, C23156 c23156, int i3) {
        int i4;
        super(i, c13312, i2);
        this.f31393 = C11010.m27352(i3, c23156.f74426) ? 1 : 0;
        C8353 c8353 = this.f56580;
        int i5 = c8353.f25633;
        int i6 = -1;
        if (i5 != -1 && (i4 = c8353.f25609) != -1) {
            i6 = i5 * i4;
        }
        this.f31392 = i6;
    }

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo26319() {
        return this.f31393;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C10457 c10457) {
        return Integer.compare(this.f31392, c10457.f31392);
    }
}
