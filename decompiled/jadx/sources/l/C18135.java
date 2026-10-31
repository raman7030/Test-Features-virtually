package l;

/* JADX INFO: renamed from: l.ᩳܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18135 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56417;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56418;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f56419;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f56420;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f56421;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56422;

    public C18135(int i, int i2, int i3, int i4, int i5) {
        this.f56421 = i;
        this.f56420 = i2;
        this.f56422 = i3;
        this.f56417 = i4;
        this.f56418 = i5;
        this.f56419 = (i == -1 && i5 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18135 m42251(int i, int i2, int i3, int i4) {
        if (i2 != -1 && i2 < i) {
            i--;
        }
        int i5 = i;
        if (i4 != -1 && i4 < i3) {
            i3--;
        }
        int i6 = i3;
        return new C18135(i2, i5, i6, i5 == i6 ? i5 : -1, i4);
    }
}
