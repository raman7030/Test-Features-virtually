package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes3.dex */
public final class C16098 {

    /* JADX INFO: renamed from: ֫ */
    public final int f47365;

    /* JADX INFO: renamed from: ۜ */
    public C18781 f47366;

    /* JADX INFO: renamed from: ۡ */
    public final int f47367;

    /* JADX INFO: renamed from: ۢ */
    public int[] f47368;

    /* JADX INFO: renamed from: ۧ */
    public final int f47369;

    /* JADX INFO: renamed from: ܳ */
    public boolean f47370;

    /* JADX INFO: renamed from: ܽ */
    public int[] f47371;

    /* JADX INFO: renamed from: ܿ */
    public C16689[] f47372;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f47373;

    /* JADX INFO: renamed from: ᩷ */
    public int f47374 = 1;

    /* JADX INFO: renamed from: ᩻ */
    public int[] f47375;

    public C16098(int i, int i2, int i3, C16689 c16689) {
        int[] iArr = new int[8];
        this.f47368 = iArr;
        int[] iArr2 = new int[8];
        this.f47371 = iArr2;
        int[] iArr3 = new int[8];
        this.f47375 = iArr3;
        C16689[] c16689Arr = new C16689[8];
        this.f47372 = c16689Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 < 0 || i3 < i2 || i3 > i) {
            throw new IndexOutOfBoundsException("Syntax context coverage is outside the document");
        }
        this.f47367 = i;
        this.f47369 = i2;
        this.f47365 = i3;
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = -1;
        C12826.requireNonNull(c16689, "rootLanguage");
        c16689Arr[0] = c16689;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m36631() {
        m36620();
        return this.f47374;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m36634() {
        m36620();
        return this.f47367;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m36625(int i) {
        m36620();
        return this.f47371[C12826.checkIndex(i, this.f47374)];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m36626(int i, int i2, int i3, C16689 c16689) {
        int i4;
        int i5;
        m36620();
        int iCheckIndex = C12826.checkIndex(i3, this.f47374);
        if (i < 0 || i2 < i || i2 > this.f47367) {
            throw new IllegalArgumentException(C19768.m44907("Invalid syntax context range: ", i, i2, ".."));
        }
        int[] iArr = this.f47368;
        if (i < iArr[iCheckIndex] || i2 > this.f47371[iCheckIndex]) {
            throw new IllegalArgumentException("Syntax context is outside its parent");
        }
        if (i == i2 || (i4 = this.f47369) == (i5 = this.f47365) || i2 <= i4 || i >= i5) {
            return iCheckIndex;
        }
        int i6 = this.f47374;
        if (i6 >= iArr.length) {
            int iMin = (int) Math.min(2147483647L, ((long) i6) + ((long) (i6 >> 1)));
            if (iMin <= this.f47374) {
                throw new OutOfMemoryError("Syntax context recorder capacity exceeded");
            }
            this.f47368 = Arrays.copyOf(this.f47368, iMin);
            this.f47371 = Arrays.copyOf(this.f47371, iMin);
            this.f47375 = Arrays.copyOf(this.f47375, iMin);
            this.f47372 = (C16689[]) Arrays.copyOf(this.f47372, iMin);
        }
        int i7 = this.f47374;
        this.f47374 = i7 + 1;
        this.f47368[i7] = i;
        this.f47371[i7] = i2;
        this.f47375[i7] = iCheckIndex;
        this.f47372[i7] = c16689;
        return i7;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36630(int i, int i2, int i3, int i4, C16689 c16689) {
        m36620();
        return this.f47374 == i && m36626(i2, i3, i4, c16689) == i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36629(int i, int i2) {
        m36620();
        int iCheckIndex = C12826.checkIndex(i, this.f47374);
        if (iCheckIndex == 0) {
            throw new IllegalArgumentException("Cannot update syntax context root");
        }
        int i3 = this.f47375[iCheckIndex];
        if (i2 > this.f47368[iCheckIndex]) {
            int[] iArr = this.f47371;
            if (i2 <= iArr[i3]) {
                iArr[iCheckIndex] = i2;
                this.f47370 = true;
                return;
            }
        }
        throw new IllegalArgumentException(C20778.m46922(i2, "Invalid syntax context end: "));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18781 m36627(int i, int i2, int i3, int i4) {
        m36620();
        if (i < 1 || i > i2 || i2 > this.f47374) {
            throw new IllegalArgumentException("Invalid syntax context clip nodes");
        }
        if (i3 < 0 || i4 < i3 || i4 > this.f47367) {
            throw new IllegalArgumentException("Invalid syntax context clip range");
        }
        C18781 c18781 = new C18781(this, i, i2, i3, i4);
        this.f47366 = c18781;
        return c18781;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36632(int i) {
        int i2;
        m36620();
        if (i < 1 || i > (i2 = this.f47374)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Invalid syntax context mark: ", ", size=");
            sbM34408.append(this.f47374);
            throw new IllegalArgumentException(sbM34408.toString());
        }
        Arrays.fill(this.f47372, i, i2, (Object) null);
        this.f47374 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19452 m36628() {
        m36620();
        int[] iArrCopyOf = Arrays.copyOf(this.f47368, this.f47374);
        int[] iArrCopyOf2 = Arrays.copyOf(this.f47371, this.f47374);
        int[] iArrCopyOf3 = Arrays.copyOf(this.f47375, this.f47374);
        C16689[] c16689Arr = (C16689[]) Arrays.copyOf(this.f47372, this.f47374);
        int i = this.f47365;
        int i2 = this.f47369;
        if (i2 != 0 || i != this.f47367) {
            iArrCopyOf[0] = 0;
            iArrCopyOf2[0] = i - i2;
            for (int i3 = 1; i3 < this.f47374; i3++) {
                iArrCopyOf[i3] = Math.max(iArrCopyOf[i3], i2) - i2;
                iArrCopyOf2[i3] = Math.min(iArrCopyOf2[i3], i) - i2;
            }
        }
        return new C19452(i - i2, this.f47374, iArrCopyOf, iArrCopyOf2, iArrCopyOf3, c16689Arr);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C9708 m36633() {
        m36620();
        C9708 c9708 = new C9708(this.f47367, this.f47369, this.f47365, this.f47374, this.f47368, this.f47371, this.f47375, this.f47372, this.f47370);
        this.f47373 = true;
        this.f47375 = null;
        this.f47371 = null;
        this.f47368 = null;
        this.f47372 = null;
        this.f47374 = 0;
        return c9708;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m36620() {
        if (this.f47373) {
            throw new IllegalStateException("Syntax context recorder is finished");
        }
        if (this.f47366 != null) {
            throw new IllegalStateException("Syntax context range clip is active");
        }
    }
}
