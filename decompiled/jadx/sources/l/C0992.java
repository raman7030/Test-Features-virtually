package l;

/* JADX INFO: renamed from: l.֨۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0992 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f3699 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f3702;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object[] f3703 = new Object[64];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f3700 = new int[64];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f3701 = 63;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m3465(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = (iIdentityHashCode >>> 15) ^ iIdentityHashCode;
        int i2 = (iIdentityHashCode ^ (iIdentityHashCode << 6)) | 1;
        int i3 = i & this.f3701;
        int i4 = -1;
        while (true) {
            Object obj2 = this.f3703[i3];
            if (obj2 == obj) {
                break;
            }
            if (obj2 != null) {
                if (obj2 == f3699 && i4 < 0) {
                    i4 = i3;
                }
                i3 = (i3 + i2) & this.f3701;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m3466(AbstractC5144 abstractC5144) {
        int iM3465 = m3465((Object) abstractC5144);
        Object obj = this.f3703[iM3465];
        if (obj == null || obj == f3699) {
            return -1;
        }
        return this.f3700[iM3465];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3467(int i, Object obj) {
        int iM3465 = m3465(obj);
        Object[] objArr = this.f3703;
        Object obj2 = objArr[iM3465];
        Object obj3 = f3699;
        if (obj2 == null || obj2 == obj3) {
            objArr[iM3465] = obj;
            int[] iArr = this.f3700;
            iArr[iM3465] = i;
            if (obj2 != obj3) {
                this.f3702++;
            }
            if (this.f3702 * 3 < objArr.length * 2) {
                return;
            }
            int length = objArr.length << 1;
            this.f3703 = new Object[length];
            this.f3700 = new int[length];
            this.f3701 = length - 1;
            this.f3702 = 0;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    return;
                }
                Object obj4 = objArr[length2];
                if (obj4 != null && obj4 != obj3) {
                    m3467(iArr[length2], obj4);
                }
            }
        } else {
            int[] iArr2 = this.f3700;
            int i2 = iArr2[iM3465];
            iArr2[iM3465] = i;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3468(AbstractC5144 abstractC5144) {
        Object obj;
        int iM3465 = m3465((Object) abstractC5144);
        Object[] objArr = this.f3703;
        Object obj2 = objArr[iM3465];
        if (obj2 == null || obj2 == (obj = f3699)) {
            return -1;
        }
        objArr[iM3465] = obj;
        return this.f3700[iM3465];
    }
}
