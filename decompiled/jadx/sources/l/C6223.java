package l;

/* JADX INFO: renamed from: l.ۛᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6223 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f19070;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f19071;

    public C6223(C8353 c8353, int i) {
        this.f19070 = (c8353.f25628 & 1) != 0;
        this.f19071 = C11010.m27352(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C6223 c6223) {
        return AbstractC6497.m17946().mo17952(this.f19071, c6223.f19071).mo17952(this.f19070, c6223.f19070).mo17948();
    }
}
