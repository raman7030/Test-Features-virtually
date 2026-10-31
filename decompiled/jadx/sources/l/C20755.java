package l;

/* JADX INFO: renamed from: l.᩷۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20755 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6643 f67235;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f67236;

    public C20755(int i, C6643 c6643) {
        this.f67236 = i;
        this.f67235 = c6643;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20755 m47429(int[] iArr, Object[] objArr, int i, int i2, C5855 c5855, C5855 c5856, boolean z) {
        C6643 c6643;
        int[] iArr2;
        if (z || c5855 == null || c5855.getClass() != C0085.class || c5855.f17958 != c5856 || ((C0085) c5855).f1019 <= 0 || i != i2 || iArr[i] != 6 || (iArr2 = (c6643 = (C6643) objArr[iArr[i + 2]]).f20612) == null || c6643.f20613 != null || c6643.f20614.length < 2) {
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
        return new C20755(i, c6643);
    }
}
