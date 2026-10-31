package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes3.dex */
public final class C14446 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44271;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C17269 f44272;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f44273;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f44274;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f44275;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44276;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f44277;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15068[] f44278;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f44279;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f44280 = 1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f44281;

    public C14446(int i, int i2, int i3, C15068 c15068) {
        int[] iArr = new int[8];
        this.f44274 = iArr;
        int[] iArr2 = new int[8];
        this.f44277 = iArr2;
        int[] iArr3 = new int[8];
        this.f44281 = iArr3;
        C15068[] c15068Arr = new C15068[8];
        this.f44278 = c15068Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 < 0 || i3 < i2 || i3 > i) {
            throw new IndexOutOfBoundsException("Syntax context coverage is outside the document");
        }
        this.f44273 = i;
        this.f44275 = i2;
        this.f44271 = i3;
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = -1;
        C11003.requireNonNull(c15068, "rootLanguage");
        c15068Arr[0] = c15068;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34498() {
        m34487();
        return this.f44280;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m34501() {
        m34487();
        return this.f44273;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34492(int i) {
        m34487();
        return this.f44277[C11003.checkIndex(i, this.f44280)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34493(int i, int i2, int i3, C15068 c15068) {
        int i4;
        int i5;
        m34487();
        int iCheckIndex = C11003.checkIndex(i3, this.f44280);
        if (i < 0 || i2 < i || i2 > this.f44273) {
            throw new IllegalArgumentException(C18307.m42646("Invalid syntax context range: ", i, i2, ".."));
        }
        int[] iArr = this.f44274;
        if (i < iArr[iCheckIndex] || i2 > this.f44277[iCheckIndex]) {
            throw new IllegalArgumentException("Syntax context is outside its parent");
        }
        if (i == i2 || (i4 = this.f44275) == (i5 = this.f44271) || i2 <= i4 || i >= i5) {
            return iCheckIndex;
        }
        int i6 = this.f44280;
        if (i6 >= iArr.length) {
            int iMin = (int) Math.min(2147483647L, ((long) i6) + ((long) (i6 >> 1)));
            if (iMin <= this.f44280) {
                throw new OutOfMemoryError("Syntax context recorder capacity exceeded");
            }
            this.f44274 = Arrays.copyOf(this.f44274, iMin);
            this.f44277 = Arrays.copyOf(this.f44277, iMin);
            this.f44281 = Arrays.copyOf(this.f44281, iMin);
            this.f44278 = (C15068[]) Arrays.copyOf(this.f44278, iMin);
        }
        int i7 = this.f44280;
        this.f44280 = i7 + 1;
        this.f44274[i7] = i;
        this.f44277[i7] = i2;
        this.f44281[i7] = iCheckIndex;
        this.f44278[i7] = c15068;
        return i7;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34497(int i, int i2, int i3, int i4, C15068 c15068) {
        m34487();
        return this.f44280 == i && m34493(i2, i3, i4, c15068) == i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34496(int i, int i2) {
        m34487();
        int iCheckIndex = C11003.checkIndex(i, this.f44280);
        if (iCheckIndex == 0) {
            throw new IllegalArgumentException("Cannot update syntax context root");
        }
        int i3 = this.f44281[iCheckIndex];
        if (i2 > this.f44274[iCheckIndex]) {
            int[] iArr = this.f44277;
            if (i2 <= iArr[i3]) {
                iArr[iCheckIndex] = i2;
                this.f44276 = true;
                return;
            }
        }
        throw new IllegalArgumentException(C19370.m44628(i2, "Invalid syntax context end: "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17269 m34494(int i, int i2, int i3, int i4) {
        m34487();
        if (i < 1 || i > i2 || i2 > this.f44280) {
            throw new IllegalArgumentException("Invalid syntax context clip nodes");
        }
        if (i3 < 0 || i4 < i3 || i4 > this.f44273) {
            throw new IllegalArgumentException("Invalid syntax context clip range");
        }
        C17269 c17269 = new C17269(this, i, i2, i3, i4);
        this.f44272 = c17269;
        return c17269;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34499(int i) {
        int i2;
        m34487();
        if (i < 1 || i > (i2 = this.f44280)) {
            StringBuilder sbM32308 = C13325.m32308(i, "Invalid syntax context mark: ", ", size=");
            sbM32308.append(this.f44280);
            throw new IllegalArgumentException(sbM32308.toString());
        }
        Arrays.fill(this.f44278, i, i2, (Object) null);
        this.f44280 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17975 m34495() {
        m34487();
        int[] iArrCopyOf = Arrays.copyOf(this.f44274, this.f44280);
        int[] iArrCopyOf2 = Arrays.copyOf(this.f44277, this.f44280);
        int[] iArrCopyOf3 = Arrays.copyOf(this.f44281, this.f44280);
        C15068[] c15068Arr = (C15068[]) Arrays.copyOf(this.f44278, this.f44280);
        int i = this.f44271;
        int i2 = this.f44275;
        if (i2 != 0 || i != this.f44273) {
            iArrCopyOf[0] = 0;
            iArrCopyOf2[0] = i - i2;
            for (int i3 = 1; i3 < this.f44280; i3++) {
                iArrCopyOf[i3] = Math.max(iArrCopyOf[i3], i2) - i2;
                iArrCopyOf2[i3] = Math.min(iArrCopyOf2[i3], i) - i2;
            }
        }
        return new C17975(i - i2, this.f44280, iArrCopyOf, iArrCopyOf2, iArrCopyOf3, c15068Arr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7722 m34500() {
        m34487();
        C7722 c7722 = new C7722(this.f44273, this.f44275, this.f44271, this.f44280, this.f44274, this.f44277, this.f44281, this.f44278, this.f44276);
        this.f44279 = true;
        this.f44281 = null;
        this.f44277 = null;
        this.f44274 = null;
        this.f44278 = null;
        this.f44280 = 0;
        return c7722;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m34487() {
        if (this.f44279) {
            throw new IllegalStateException("Syntax context recorder is finished");
        }
        if (this.f44272 != null) {
            throw new IllegalStateException("Syntax context range clip is active");
        }
    }
}
