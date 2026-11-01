package p067l;

/* JADX INFO: renamed from: l.᩻ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 54VR */
/* JADX INFO: loaded from: classes.dex */
public final class C24625 {

    /* JADX INFO: renamed from: ᩳ */
    public static final Object f77957 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public int[] f77958;

    /* JADX INFO: renamed from: ۧ */
    public int f77959 = 0;

    /* JADX INFO: renamed from: ܽ */
    public Object[] f77960;

    public C24625(int i) {
        this.f77958 = new int[i];
        this.f77960 = new Object[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m54285(int i) {
        Object obj;
        int iM54282 = m54282(this.f77959, i, this.f77958);
        if (iM54282 < 0 || (obj = this.f77960[iM54282]) == f77957) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54286(int i, Object obj) {
        int iM54282 = m54282(this.f77959, i, this.f77958);
        if (iM54282 >= 0) {
            this.f77960[iM54282] = obj;
            return;
        }
        int i2 = ~iM54282;
        int i3 = this.f77959;
        if (i2 < i3) {
            Object[] objArr = this.f77960;
            if (objArr[i2] == f77957) {
                this.f77958[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        int[] iArr = this.f77958;
        if (i3 >= iArr.length) {
            int iMax = Math.max(i3 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr2 = new Object[iMax];
            int[] iArr3 = this.f77958;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr3 = this.f77960;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f77958 = iArr2;
            this.f77960 = objArr2;
        }
        int i4 = this.f77959 - i2;
        if (i4 != 0) {
            int[] iArr4 = this.f77958;
            int i5 = i2 + 1;
            System.arraycopy(iArr4, i2, iArr4, i5, i4);
            Object[] objArr4 = this.f77960;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f77959 - i2);
        }
        this.f77958[i2] = i;
        this.f77960[i2] = obj;
        this.f77959++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54284(int i, Object obj) {
        int i2 = this.f77959;
        if (i2 != 0 && i <= this.f77958[i2 - 1]) {
            m54286(i, obj);
            return;
        }
        int[] iArr = this.f77958;
        if (i2 >= iArr.length) {
            int iMax = Math.max(i2 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr = new Object[iMax];
            int[] iArr3 = this.f77958;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr2 = this.f77960;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f77958 = iArr2;
            this.f77960 = objArr;
        }
        this.f77958[i2] = i;
        this.f77960[i2] = obj;
        this.f77959 = i2 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54283(int i) {
        int[] iArr = this.f77958;
        if (iArr.length < i) {
            int[] iArr2 = new int[i];
            Object[] objArr = new Object[i];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr2 = this.f77960;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f77958 = iArr2;
            this.f77960 = objArr;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m54282(int i, int i2, int[] iArr) {
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
}
