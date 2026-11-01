package p067l;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C22491 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final int f70917;

    /* JADX INFO: renamed from: ۙ */
    public C23161 f70918;

    /* JADX INFO: renamed from: ۛ */
    public C13773 f70919;

    /* JADX INFO: renamed from: ۤ */
    public int f70920;

    /* JADX INFO: renamed from: ۫ */
    public final C25172[] f70921;

    /* JADX INFO: renamed from: ۬ */
    public int f70922;

    /* JADX INFO: renamed from: ᩶ */
    public final int[] f70923;

    /* JADX INFO: renamed from: ᩸ */
    public C17124 f70924;

    /* JADX INFO: renamed from: ᩹ */
    public final int f70925;

    public C22491(C13773 c13773, int i) {
        this(c13773, 0, c13773.m31402(), i);
    }

    public C22491(C13773 c13773, int i, int i2, int i3) {
        C13773.m31392(i, i2, c13773.m31402());
        this.f70919 = c13773;
        this.f70925 = i;
        this.f70917 = i2;
        AbstractC21820 abstractC21820 = c13773.f38939;
        int i4 = abstractC21820 == null ? 0 : abstractC21820.f68651;
        this.f70921 = new C25172[i4];
        this.f70923 = new int[i4];
        C22902 c22902 = c13773.f38940;
        if (c22902 != null) {
            c22902.m51158();
        }
        try {
            m50442(i3);
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    public final int position() {
        if (this.f70919 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        return this.f70920 - this.f70925;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50442(int i) {
        AbstractC21820[] abstractC21820Arr;
        int i2;
        if (this.f70919 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        int i3 = this.f70917;
        int i4 = this.f70925;
        C13773.m31392(i, i, i3 - i4);
        C17124 c17124 = this.f70924;
        if (c17124 != null) {
            c17124.close();
            this.f70924 = null;
        }
        int i5 = i + i4;
        this.f70920 = i5;
        AbstractC21820 abstractC21820 = this.f70919.f38939;
        if (abstractC21820 == null) {
            this.f70918 = null;
            this.f70922 = 0;
            return;
        }
        int i6 = 0;
        while (abstractC21820 instanceof C25172) {
            C25172 c25172 = (C25172) abstractC21820;
            int i7 = 0;
            while (true) {
                abstractC21820Arr = c25172.f80530;
                if (i7 >= abstractC21820Arr.length - 1 || i5 < (i2 = abstractC21820Arr[i7].f68652)) {
                    break;
                }
                i7++;
                i5 -= i2;
            }
            this.f70921[i6] = c25172;
            this.f70923[i6] = i7;
            abstractC21820 = abstractC21820Arr[i7];
            i6++;
        }
        this.f70918 = (C23161) abstractC21820;
        this.f70922 = i5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50443(char[] cArr, int i, int i2) {
        if (this.f70919 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        C15113.m34521(cArr, i, i2);
        int iMin = Math.min(i2, this.f70917 - this.f70920);
        while (iMin > 0) {
            if (this.f70922 == this.f70918.f68652) {
                m50441();
            }
            int iMin2 = Math.min(iMin, this.f70918.f68652 - this.f70922);
            if (this.f70924 == null) {
                this.f70924 = this.f70918.m51621();
            }
            C12825 c12825 = this.f70924.f50590;
            int i3 = this.f70922;
            c12825.m29375(i3, i3 + iMin2, cArr, i);
            this.f70922 += iMin2;
            this.f70920 += iMin2;
            i += iMin2;
            iMin -= iMin2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50444() {
        if (this.f70919 != null) {
            return this.f70920 < this.f70917;
        }
        throw new IllegalStateException("Text cursor is closed");
    }

    /* JADX INFO: renamed from: ܽ */
    public final char m50445() {
        if (!m50444()) {
            throw new NoSuchElementException();
        }
        if (this.f70922 == this.f70918.f68652) {
            m50441();
        }
        if (this.f70924 == null) {
            this.f70924 = this.f70918.m51621();
        }
        char cM29372 = this.f70924.f50590.m29372(this.f70922);
        this.f70922++;
        this.f70920++;
        return cM29372;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m50441() {
        C17124 c17124 = this.f70924;
        if (c17124 != null) {
            c17124.close();
            this.f70924 = null;
        }
        C25172[] c25172Arr = this.f70921;
        int length = c25172Arr.length;
        while (true) {
            length--;
            if (length >= 0) {
                C25172 c25172 = c25172Arr[length];
                int[] iArr = this.f70923;
                int i = iArr[length] + 1;
                if (i >= 0) {
                    AbstractC21820[] abstractC21820Arr = c25172.f80530;
                    if (i < abstractC21820Arr.length) {
                        iArr[length] = i;
                        AbstractC21820 abstractC21820 = abstractC21820Arr[i];
                        while (true) {
                            length++;
                            if (abstractC21820 instanceof C25172) {
                                C25172 c25173 = (C25172) abstractC21820;
                                AbstractC21820[] abstractC21820Arr2 = c25173.f80530;
                                c25172Arr[length] = c25173;
                                iArr[length] = 0;
                                abstractC21820 = abstractC21820Arr2[0];
                            } else {
                                this.f70918 = (C23161) abstractC21820;
                                this.f70922 = 0;
                                return;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError("Missing adjacent leaf");
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C13773 c13773 = this.f70919;
        if (c13773 == null) {
            return;
        }
        C22902 c22902 = c13773.f38940;
        this.f70919 = null;
        this.f70918 = null;
        Arrays.fill(this.f70921, (Object) null);
        try {
            C17124 c17124 = this.f70924;
            if (c17124 != null) {
                c17124.close();
                this.f70924 = null;
            }
        } finally {
            if (c22902 != null) {
                c22902.m51159();
            }
        }
    }
}
