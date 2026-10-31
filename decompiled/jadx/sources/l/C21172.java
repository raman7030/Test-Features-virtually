package l;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C21172 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f68234;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21877 f68235;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11999 f68236;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f68237;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23993[] f68238;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f68239;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f68240;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15525 f68241;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f68242;

    public C21172(C11999 c11999, int i) {
        this(c11999, 0, c11999.m29347(), i);
    }

    public C21172(C11999 c11999, int i, int i2, int i3) {
        C11999.m29337(i, i2, c11999.m29347());
        this.f68236 = c11999;
        this.f68242 = i;
        this.f68234 = i2;
        AbstractC20466 abstractC20466 = c11999.f35929;
        int i4 = abstractC20466 == null ? 0 : abstractC20466.f65975;
        this.f68238 = new C23993[i4];
        this.f68240 = new int[i4];
        C21605 c21605 = c11999.f35930;
        if (c21605 != null) {
            c21605.m48811();
        }
        try {
            m48112(i3);
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    public final int position() {
        if (this.f68236 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        return this.f68237 - this.f68242;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48112(int i) {
        AbstractC20466[] abstractC20466Arr;
        int i2;
        if (this.f68236 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        int i3 = this.f68234;
        int i4 = this.f68242;
        C11999.m29337(i, i, i3 - i4);
        C15525 c15525 = this.f68241;
        if (c15525 != null) {
            c15525.close();
            this.f68241 = null;
        }
        int i5 = i + i4;
        this.f68237 = i5;
        AbstractC20466 abstractC20466 = this.f68236.f35929;
        if (abstractC20466 == null) {
            this.f68235 = null;
            this.f68239 = 0;
            return;
        }
        int i6 = 0;
        while (abstractC20466 instanceof C23993) {
            C23993 c23993 = (C23993) abstractC20466;
            int i7 = 0;
            while (true) {
                abstractC20466Arr = c23993.f77779;
                if (i7 >= abstractC20466Arr.length - 1 || i5 < (i2 = abstractC20466Arr[i7].f65976)) {
                    break;
                }
                i7++;
                i5 -= i2;
            }
            this.f68238[i6] = c23993;
            this.f68240[i6] = i7;
            abstractC20466 = abstractC20466Arr[i7];
            i6++;
        }
        this.f68235 = (C21877) abstractC20466;
        this.f68239 = i5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48113(char[] cArr, int i, int i2) {
        if (this.f68236 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        C13409.m32419(cArr, i, i2);
        int iMin = Math.min(i2, this.f68234 - this.f68237);
        while (iMin > 0) {
            if (this.f68239 == this.f68235.f65976) {
                m48111();
            }
            int iMin2 = Math.min(iMin, this.f68235.f65976 - this.f68239);
            if (this.f68241 == null) {
                this.f68241 = this.f68235.m49269();
            }
            C11002 c11002 = this.f68241.f47458;
            int i3 = this.f68239;
            c11002.m27313(i3, i3 + iMin2, cArr, i);
            this.f68239 += iMin2;
            this.f68237 += iMin2;
            i += iMin2;
            iMin -= iMin2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48114() {
        if (this.f68236 != null) {
            return this.f68237 < this.f68234;
        }
        throw new IllegalStateException("Text cursor is closed");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char m48115() {
        if (!m48114()) {
            throw new NoSuchElementException();
        }
        if (this.f68239 == this.f68235.f65976) {
            m48111();
        }
        if (this.f68241 == null) {
            this.f68241 = this.f68235.m49269();
        }
        char cM27310 = this.f68241.f47458.m27310(this.f68239);
        this.f68239++;
        this.f68237++;
        return cM27310;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48111() {
        C15525 c15525 = this.f68241;
        if (c15525 != null) {
            c15525.close();
            this.f68241 = null;
        }
        C23993[] c23993Arr = this.f68238;
        int length = c23993Arr.length;
        while (true) {
            length--;
            if (length >= 0) {
                C23993 c23993 = c23993Arr[length];
                int[] iArr = this.f68240;
                int i = iArr[length] + 1;
                if (i >= 0) {
                    AbstractC20466[] abstractC20466Arr = c23993.f77779;
                    if (i < abstractC20466Arr.length) {
                        iArr[length] = i;
                        AbstractC20466 abstractC20466 = abstractC20466Arr[i];
                        while (true) {
                            length++;
                            if (abstractC20466 instanceof C23993) {
                                C23993 c23994 = (C23993) abstractC20466;
                                AbstractC20466[] abstractC20466Arr2 = c23994.f77779;
                                c23993Arr[length] = c23994;
                                iArr[length] = 0;
                                abstractC20466 = abstractC20466Arr2[0];
                            } else {
                                this.f68235 = (C21877) abstractC20466;
                                this.f68239 = 0;
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
        C11999 c11999 = this.f68236;
        if (c11999 == null) {
            return;
        }
        C21605 c21605 = c11999.f35930;
        this.f68236 = null;
        this.f68235 = null;
        Arrays.fill(this.f68238, (Object) null);
        try {
            C15525 c15525 = this.f68241;
            if (c15525 != null) {
                c15525.close();
                this.f68241 = null;
            }
        } finally {
            if (c21605 != null) {
                c21605.m48812();
            }
        }
    }
}
