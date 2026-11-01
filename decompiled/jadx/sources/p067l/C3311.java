package p067l;

/* JADX INFO: renamed from: l.֨۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3311 {

    /* JADX INFO: renamed from: ܿ */
    public static final Object f6474 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public int f6477;

    /* JADX INFO: renamed from: ᩳ */
    public Object[] f6478 = new Object[64];

    /* JADX INFO: renamed from: ֫ */
    public int[] f6475 = new int[64];

    /* JADX INFO: renamed from: ۧ */
    public int f6476 = 63;

    /* JADX INFO: renamed from: ֫ */
    public final int m5768(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = (iIdentityHashCode >>> 15) ^ iIdentityHashCode;
        int i2 = (iIdentityHashCode ^ (iIdentityHashCode << 6)) | 1;
        int i3 = i & this.f6476;
        int i4 = -1;
        while (true) {
            Object obj2 = this.f6478[i3];
            if (obj2 == obj) {
                break;
            }
            if (obj2 != null) {
                if (obj2 == f6474 && i4 < 0) {
                    i4 = i3;
                }
                i3 = (i3 + i2) & this.f6476;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5769(AbstractC7257 abstractC7257) {
        int iM5768 = m5768((Object) abstractC7257);
        Object obj = this.f6478[iM5768];
        if (obj == null || obj == f6474) {
            return -1;
        }
        return this.f6475[iM5768];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5770(int i, Object obj) {
        int iM5768 = m5768(obj);
        Object[] objArr = this.f6478;
        Object obj2 = objArr[iM5768];
        Object obj3 = f6474;
        if (obj2 == null || obj2 == obj3) {
            objArr[iM5768] = obj;
            int[] iArr = this.f6475;
            iArr[iM5768] = i;
            if (obj2 != obj3) {
                this.f6477++;
            }
            if (this.f6477 * 3 < objArr.length * 2) {
                return;
            }
            int length = objArr.length << 1;
            this.f6478 = new Object[length];
            this.f6475 = new int[length];
            this.f6476 = length - 1;
            this.f6477 = 0;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    return;
                }
                Object obj4 = objArr[length2];
                if (obj4 != null && obj4 != obj3) {
                    m5770(iArr[length2], obj4);
                }
            }
        } else {
            int[] iArr2 = this.f6475;
            int i2 = iArr2[iM5768];
            iArr2[iM5768] = i;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m5771(AbstractC7257 abstractC7257) {
        Object obj;
        int iM5768 = m5768((Object) abstractC7257);
        Object[] objArr = this.f6478;
        Object obj2 = objArr[iM5768];
        if (obj2 == null || obj2 == (obj = f6474)) {
            return -1;
        }
        objArr[iM5768] = obj;
        return this.f6475[iM5768];
    }
}
