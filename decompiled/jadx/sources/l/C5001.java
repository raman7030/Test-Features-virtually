package l;

/* JADX INFO: renamed from: l.ۚ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5001 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f15747;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f15748;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f15749;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f15750;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f15751;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f15752;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f15753;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f15754;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f15755;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f15756;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f15757;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f15758;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f15759;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C10866 f15760;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f15761;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f15762;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14487() {
        this.f15750 = false;
        this.f15751 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14488(int i) {
        this.f15759 = i;
        this.f15750 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14489(C10866 c10866, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.f15760 = c10866;
        this.f15755 = i;
        this.f15759 = i2;
        this.f15762 = i3;
        this.f15749 = i4;
        this.f15754 = z;
        this.f15753 = z2;
        this.f15747 = z3;
        this.f15761 = z4;
        this.f15752 = i5;
        this.f15748 = i6;
        this.f15757 = i7;
        this.f15756 = i8;
        this.f15758 = i9;
        this.f15751 = true;
        this.f15750 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14490() {
        if (!this.f15750) {
            return false;
        }
        int i = this.f15759;
        return i == 7 || i == 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14486(C5001 c5001, C5001 c5002) {
        int i;
        int i2;
        int i3;
        boolean z;
        if (!c5001.f15751) {
            return false;
        }
        if (c5002.f15751) {
            C10866 c10866 = c5001.f15760;
            C22632.m50632(c10866);
            C10866 c10867 = c5002.f15760;
            C22632.m50632(c10867);
            int i4 = c10867.f32644;
            if (c5001.f15762 == c5002.f15762 && c5001.f15749 == c5002.f15749 && c5001.f15754 == c5002.f15754 && ((!c5001.f15753 || !c5002.f15753 || c5001.f15747 == c5002.f15747) && (((i = c5001.f15755) == (i2 = c5002.f15755) || (i != 0 && i2 != 0)) && (((i3 = c10866.f32644) != 0 || i4 != 0 || (c5001.f15748 == c5002.f15748 && c5001.f15757 == c5002.f15757)) && ((i3 != 1 || i4 != 1 || (c5001.f15756 == c5002.f15756 && c5001.f15758 == c5002.f15758)) && (z = c5001.f15761) == c5002.f15761 && (!z || c5001.f15752 == c5002.f15752)))))) {
                return false;
            }
        }
        return true;
    }
}
