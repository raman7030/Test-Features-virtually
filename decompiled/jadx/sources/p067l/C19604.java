package p067l;

/* JADX INFO: renamed from: l.ᩳܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19604 {

    /* JADX INFO: renamed from: ֫ */
    public final int f59631;

    /* JADX INFO: renamed from: ۧ */
    public final int f59632;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f59633;

    /* JADX INFO: renamed from: ܽ */
    public final int f59634;

    /* JADX INFO: renamed from: ܿ */
    public final int f59635;

    /* JADX INFO: renamed from: ᩳ */
    public final int f59636;

    public C19604(int i, int i2, int i3, int i4, int i5) {
        this.f59635 = i;
        this.f59634 = i2;
        this.f59636 = i3;
        this.f59631 = i4;
        this.f59632 = i5;
        this.f59633 = (i == -1 && i5 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19604 m44511(int i, int i2, int i3, int i4) {
        if (i2 != -1 && i2 < i) {
            i--;
        }
        int i5 = i;
        if (i4 != -1 && i4 < i3) {
            i3--;
        }
        int i6 = i3;
        return new C19604(i2, i5, i6, i5 == i6 ? i5 : -1, i4);
    }
}
