package p067l;

/* JADX INFO: renamed from: l.᩷۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes4.dex */
public final class C22094 {

    /* JADX INFO: renamed from: ֫ */
    public final C8682 f69919;

    /* JADX INFO: renamed from: ۧ */
    public final int f69920;

    public C22094(int i, C8682 c8682) {
        this.f69920 = i;
        this.f69919 = c8682;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22094 m49756(int[] iArr, Object[] objArr, int i, int i2, C7933 c7933, C7933 c7934, boolean z) {
        C8682 c8682;
        int[] iArr2;
        if (z || c7933 == null || c7933.getClass() != C2449.class || c7933.f20809 != c7934 || ((C2449) c7933).f3793 <= 0 || i != i2 || iArr[i] != 6 || (iArr2 = (c8682 = (C8682) objArr[iArr[i + 2]]).f23488) == null || c8682.f23489 != null || c8682.f23490.length < 2) {
            return null;
        }
        for (int i3 : iArr2) {
            if ((i3 & (i3 - 1)) != 0) {
                return null;
            }
        }
        for (int i4 = 0; i4 < iArr.length; i4 += 8) {
            switch (iArr[i4]) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                    break;
                case 2:
                case 5:
                case 9:
                case 10:
                default:
                    return null;
            }
        }
        return new C22094(i, c8682);
    }
}
