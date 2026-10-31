package l;

/* JADX INFO: renamed from: l.ۨ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54VR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11905 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f35578 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f35579;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f35580 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object[] f35581;

    public C11905(int i) {
        this.f35579 = new int[i];
        this.f35581 = new Object[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29031(int i, int i2, int[] iArr) {
        int i3 = -1;
        int i4 = i;
        while (i4 - i3 > 1) {
            int i5 = (i4 + i3) / 2;
            if (iArr[i5] < i2) {
                i3 = i5;
            } else {
                i4 = i5;
            }
        }
        if (i4 == i) {
            return ~i;
        }
        return iArr[i4] == i2 ? i4 : ~i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m29032(int i) {
        Object obj;
        int iM29031 = m29031(this.f35580, i, this.f35579);
        if (iM29031 < 0 || (obj = this.f35581[iM29031]) == f35578) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29033(int i, Comparable comparable) {
        int iM29031 = m29031(this.f35580, i, this.f35579);
        if (iM29031 >= 0) {
            this.f35581[iM29031] = comparable;
            return;
        }
        int i2 = ~iM29031;
        int i3 = this.f35580;
        if (i2 < i3) {
            Object[] objArr = this.f35581;
            if (objArr[i2] == f35578) {
                this.f35579[i2] = i;
                objArr[i2] = comparable;
                return;
            }
        }
        int[] iArr = this.f35579;
        if (i3 >= iArr.length) {
            int iMax = Math.max(i3 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr2 = new Object[iMax];
            int[] iArr3 = this.f35579;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr3 = this.f35581;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f35579 = iArr2;
            this.f35581 = objArr2;
        }
        int i4 = this.f35580 - i2;
        if (i4 != 0) {
            int[] iArr4 = this.f35579;
            int i5 = i2 + 1;
            System.arraycopy(iArr4, i2, iArr4, i5, i4);
            Object[] objArr4 = this.f35581;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f35580 - i2);
        }
        this.f35579[i2] = i;
        this.f35581[i2] = comparable;
        this.f35580++;
    }
}
