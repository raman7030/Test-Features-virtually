package l;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B4EZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0568 extends C11816 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient byte[][] f2248;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient int[] f2249;

    @Override // l.C11816
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11816 mo2334() {
        throw null;
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11816 mo2337() {
        throw null;
    }

    public C0568(C12521 c12521, int i) {
        super(null);
        C21736.m49060(c12521.f37625, 0L, i);
        C18914 c18914 = c12521.f37624;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c18914.f59597;
            int i6 = c18914.f59600;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c18914 = c18914.f59599;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f2248 = new byte[i4][];
        this.f2249 = new int[i4 * 2];
        C18914 c18915 = c12521.f37624;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f2248;
            bArr[i7] = c18915.f59596;
            int i8 = c18915.f59597;
            int i9 = c18915.f59600;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f2249;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c18915.f59602 = true;
            i7++;
            c18915 = c18915.f59599;
        }
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String mo2335() {
        return m2323().mo2335();
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo2326() {
        return C3349.m10248(m2323().f35250);
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo2332() {
        return m2323().mo2332();
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11816 mo2330() {
        return m2323().mo2330();
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11816 mo2331() {
        return m2323().mo2331();
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte mo2325(int i) {
        byte[][] bArr = this.f2248;
        int length = bArr.length - 1;
        int[] iArr = this.f2249;
        C21736.m49060(iArr[length], i, 1L);
        int iM2324 = m2324(i);
        return bArr[iM2324][(i - (iM2324 == 0 ? 0 : iArr[iM2324 - 1])) + iArr[bArr.length + iM2324]];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m2324(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f2249, 0, this.f2248.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo2336() {
        return this.f2249[this.f2248.length - 1];
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] mo2333() {
        byte[][] bArr = this.f2248;
        int length = bArr.length - 1;
        int[] iArr = this.f2249;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[length2 + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2327(C12521 c12521) {
        byte[][] bArr = this.f2248;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f2249;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C18914 c18914 = new C18914(bArr[i], i3, (i3 + i4) - i2);
            C18914 c18915 = c12521.f37624;
            if (c18915 == null) {
                c18914.f59598 = c18914;
                c18914.f59599 = c18914;
                c12521.f37624 = c18914;
            } else {
                c18915.f59598.m43657(c18914);
            }
            i++;
            i2 = i4;
        }
        c12521.f37625 += (long) i2;
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2329(C11816 c11816, int i) {
        if (mo2336() - i >= 0) {
            int iM2324 = m2324(0);
            int i2 = 0;
            int i3 = 0;
            while (i > 0) {
                int[] iArr = this.f2249;
                int i4 = iM2324 == 0 ? 0 : iArr[iM2324 - 1];
                int iMin = Math.min(i, ((iArr[iM2324] - i4) + i4) - i2);
                byte[][] bArr = this.f2248;
                if (c11816.mo2328(i3, bArr[iM2324], (i2 - i4) + iArr[bArr.length + iM2324], iMin)) {
                    i2 += iMin;
                    i3 += iMin;
                    i -= iMin;
                    iM2324++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.C11816
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2328(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= mo2336() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int iM2324 = m2324(i);
            while (i3 > 0) {
                int[] iArr = this.f2249;
                int i4 = iM2324 == 0 ? 0 : iArr[iM2324 - 1];
                int iMin = Math.min(i3, ((iArr[iM2324] - i4) + i4) - i);
                byte[][] bArr2 = this.f2248;
                int i5 = (i - i4) + iArr[bArr2.length + iM2324];
                byte[] bArr3 = bArr2[iM2324];
                Charset charset = C21736.f69703;
                for (int i6 = 0; i6 < iMin; i6++) {
                    if (bArr3[i6 + i5] == bArr[i6 + i2]) {
                    }
                }
                i += iMin;
                i2 += iMin;
                i3 -= iMin;
                iM2324++;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C11816 m2323() {
        return new C11816(mo2333());
    }

    @Override // l.C11816
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11816)) {
            return false;
        }
        C11816 c11816 = (C11816) obj;
        return c11816.mo2336() == mo2336() && mo2329(c11816, mo2336());
    }

    @Override // l.C11816
    public final int hashCode() {
        int i = this.f35251;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f2248;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.f2249;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f35251 = i4;
        return i4;
    }

    @Override // l.C11816
    public final String toString() {
        return m2323().toString();
    }

    private Object writeReplace() {
        return m2323();
    }
}
