package p067l;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B4EZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2908 extends C13598 {

    /* JADX INFO: renamed from: ۫ */
    public final transient byte[][] f5023;

    /* JADX INFO: renamed from: ۬ */
    public final transient int[] f5024;

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ܿ */
    public final C13598 mo4705() {
        throw null;
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ᩻ */
    public final C13598 mo4708() {
        throw null;
    }

    public C2908(C14268 c14268, int i) {
        super(null);
        C23026.m51409(c14268.f40649, 0L, i);
        C20344 c20344 = c14268.f40648;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c20344.f62828;
            int i6 = c20344.f62831;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c20344 = c20344.f62830;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f5023 = new byte[i4][];
        this.f5024 = new int[i4 * 2];
        C20344 c20345 = c14268.f40648;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f5023;
            bArr[i7] = c20345.f62827;
            int i8 = c20345.f62828;
            int i9 = c20345.f62831;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f5024;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c20345.f62833 = true;
            i7++;
            c20345 = c20345.f62830;
        }
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ᩴ */
    public final String mo4706() {
        return m4694().mo4706();
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ֫ */
    public final String mo4697() {
        return C5551.m12284(m4694().f38252);
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ۧ */
    public final String mo4703() {
        return m4694().mo4703();
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ۡ */
    public final C13598 mo4701() {
        return m4694().mo4701();
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ۢ */
    public final C13598 mo4702() {
        return m4694().mo4702();
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ֫ */
    public final byte mo4696(int i) {
        byte[][] bArr = this.f5023;
        int length = bArr.length - 1;
        int[] iArr = this.f5024;
        C23026.m51409(iArr[length], i, 1L);
        int iM4695 = m4695(i);
        return bArr[iM4695][(i - (iM4695 == 0 ? 0 : iArr[iM4695 - 1])) + iArr[bArr.length + iM4695]];
    }

    /* JADX INFO: renamed from: ۧ */
    private int m4695(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f5024, 0, this.f5023.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4707() {
        return this.f5024[this.f5023.length - 1];
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ܺ */
    public final byte[] mo4704() {
        byte[][] bArr = this.f5023;
        int length = bArr.length - 1;
        int[] iArr = this.f5024;
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

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ֫ */
    public final void mo4698(C14268 c14268) {
        byte[][] bArr = this.f5023;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f5024;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C20344 c20344 = new C20344(bArr[i], i3, (i3 + i4) - i2);
            C20344 c20345 = c14268.f40648;
            if (c20345 == null) {
                c20344.f62829 = c20344;
                c20344.f62830 = c20344;
                c14268.f40648 = c20344;
            } else {
                c20345.f62829.m45923(c20344);
            }
            i++;
            i2 = i4;
        }
        c14268.f40649 += (long) i2;
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4700(C13598 c13598, int i) {
        if (mo4707() - i >= 0) {
            int iM4695 = m4695(0);
            int i2 = 0;
            int i3 = 0;
            while (i > 0) {
                int[] iArr = this.f5024;
                int i4 = iM4695 == 0 ? 0 : iArr[iM4695 - 1];
                int iMin = Math.min(i, ((iArr[iM4695] - i4) + i4) - i2);
                byte[][] bArr = this.f5023;
                if (c13598.mo4699(i3, bArr[iM4695], (i2 - i4) + iArr[bArr.length + iM4695], iMin)) {
                    i2 += iMin;
                    i3 += iMin;
                    i -= iMin;
                    iM4695++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p067l.C13598
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4699(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= mo4707() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int iM4695 = m4695(i);
            while (i3 > 0) {
                int[] iArr = this.f5024;
                int i4 = iM4695 == 0 ? 0 : iArr[iM4695 - 1];
                int iMin = Math.min(i3, ((iArr[iM4695] - i4) + i4) - i);
                byte[][] bArr2 = this.f5023;
                int i5 = (i - i4) + iArr[bArr2.length + iM4695];
                byte[] bArr3 = bArr2[iM4695];
                Charset charset = C23026.f72410;
                for (int i6 = 0; i6 < iMin; i6++) {
                    if (bArr3[i6 + i5] == bArr[i6 + i2]) {
                    }
                }
                i += iMin;
                i2 += iMin;
                i3 -= iMin;
                iM4695++;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡ */
    private C13598 m4694() {
        return new C13598(mo4704());
    }

    @Override // p067l.C13598
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13598)) {
            return false;
        }
        C13598 c13598 = (C13598) obj;
        return c13598.mo4707() == mo4707() && mo4700(c13598, mo4707());
    }

    @Override // p067l.C13598
    public final int hashCode() {
        int i = this.f38253;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f5023;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.f5024;
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
        this.f38253 = i4;
        return i4;
    }

    @Override // p067l.C13598
    public final String toString() {
        return m4694().toString();
    }

    private Object writeReplace() {
        return m4694();
    }
}
