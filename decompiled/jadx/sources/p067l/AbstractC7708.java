package p067l;

/* JADX INFO: renamed from: l.ۚ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7708 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20228;

    /* JADX INFO: renamed from: ۧ */
    public final int f20229;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo17842(C21199 c21199);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo17843();

    public AbstractC7708(int i, int i2) {
        this.f20228 = i;
        this.f20229 = i2;
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        C21199 c21199Mo30143 = c211910.mo30143();
        if (c21199Mo30143 == null || (c21199Mo30143 instanceof C3092)) {
            return false;
        }
        int iMo17842 = mo17842(c211910);
        int i = this.f20229;
        int i2 = this.f20228;
        if (i2 == 0) {
            return iMo17842 == i;
        }
        int i3 = iMo17842 - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    public String toString() {
        int i = this.f20229;
        int i2 = this.f20228;
        if (i2 == 0) {
            return String.format(":%s(%d)", mo17843(), Integer.valueOf(i));
        }
        return i == 0 ? String.format(":%s(%dn)", mo17843(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", mo17843(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
