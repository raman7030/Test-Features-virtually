package p067l;

/* JADX INFO: renamed from: l.ۚ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X598 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7668 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20110;

    /* JADX INFO: renamed from: ۧ */
    public final String f20111;

    /* JADX INFO: renamed from: ܳ */
    public final C3644 f20112;

    /* JADX INFO: renamed from: ܽ */
    public final C3644 f20113;

    /* JADX INFO: renamed from: ܿ */
    public C7668 f20114;

    /* JADX INFO: renamed from: ᩳ */
    public final C3644 f20115;

    public C7668(C3644 c3644, C3644 c3645, C3644 c3646, int i, String str) {
        this.f20112 = c3644;
        this.f20113 = c3645;
        this.f20115 = c3646;
        this.f20110 = i;
        this.f20111 = str;
    }

    public C7668(C7668 c7668, C3644 c3644, C3644 c3645) {
        this(c3644, c3645, c7668.f20115, c7668.f20110, c7668.f20111);
        this.f20114 = c7668.f20114;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7668 m17759(C7668 c7668, C3644 c3644, C3644 c3645) {
        if (c7668 == null) {
            return null;
        }
        C3644 c3646 = c7668.f20112;
        C7668 c7668M17759 = m17759(c7668.f20114, c3644, c3645);
        c7668.f20114 = c7668M17759;
        int i = c3646.f7644;
        C3644 c3647 = c7668.f20113;
        int i2 = c3647.f7644;
        int i3 = c3644.f7644;
        int i4 = c3645 == null ? Integer.MAX_VALUE : c3645.f7644;
        if (i3 >= i2 || i4 <= i) {
            return c7668;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c7668M17759 : new C7668(c7668, c3645, c3647);
        }
        if (i4 >= i2) {
            return new C7668(c7668, c3646, c3644);
        }
        c7668.f20114 = new C7668(c7668, c3645, c3647);
        return new C7668(c7668, c3646, c3644);
    }
}
