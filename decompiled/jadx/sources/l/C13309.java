package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 85M9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13309 implements Cloneable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Object f39839 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f39840;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39841;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f39842;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f39843;

    public C13309() {
        this(10);
    }

    public C13309(int i) {
        this.f39842 = false;
        if (i != 0) {
            int i2 = i * 4;
            for (int i3 = 4; i3 < 32; i3++) {
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
            }
            int i5 = i2 / 4;
            this.f39843 = new int[i5];
            this.f39840 = new Object[i5];
            return;
        }
        this.f39843 = C0609.f2364;
        this.f39840 = C0609.f2365;
    }

    public final C13309 clone() {
        try {
            C13309 c13309 = (C13309) super.clone();
            c13309.f39843 = (int[]) this.f39843.clone();
            c13309.f39840 = (Object[]) this.f39840.clone();
            return c13309;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m32284(int i, Integer num) {
        Object obj;
        int iM2486 = C0609.m2486(this.f39841, i, this.f39843);
        return (iM2486 < 0 || (obj = this.f39840[iM2486]) == f39839) ? num : obj;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32288(int i) {
        int iM2486 = C0609.m2486(this.f39841, i, this.f39843);
        if (iM2486 >= 0) {
            Object[] objArr = this.f39840;
            Object obj = objArr[iM2486];
            Object obj2 = f39839;
            if (obj != obj2) {
                objArr[iM2486] = obj2;
                this.f39842 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m32281() {
        int i = this.f39841;
        int[] iArr = this.f39843;
        Object[] objArr = this.f39840;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f39839) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f39842 = false;
        this.f39841 = i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32289(int i, Object obj) {
        int iM2486 = C0609.m2486(this.f39841, i, this.f39843);
        if (iM2486 >= 0) {
            this.f39840[iM2486] = obj;
            return;
        }
        int i2 = ~iM2486;
        int i3 = this.f39841;
        if (i2 < i3) {
            Object[] objArr = this.f39840;
            if (objArr[i2] == f39839) {
                this.f39843[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f39842 && i3 >= this.f39843.length) {
            m32281();
            i2 = ~C0609.m2486(this.f39841, i, this.f39843);
        }
        int i4 = this.f39841;
        if (i4 >= this.f39843.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f39843;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f39840;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f39843 = iArr;
            this.f39840 = objArr2;
        }
        int i9 = this.f39841 - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f39843;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.f39840;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f39841 - i2);
        }
        this.f39843[i2] = i;
        this.f39840[i2] = obj;
        this.f39841++;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32287() {
        if (this.f39842) {
            m32281();
        }
        return this.f39841;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32282(int i) {
        if (this.f39842) {
            m32281();
        }
        return this.f39843[i];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m32290(int i) {
        if (this.f39842) {
            m32281();
        }
        return this.f39840[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32283(C14369 c14369) {
        if (this.f39842) {
            m32281();
        }
        for (int i = 0; i < this.f39841; i++) {
            if (this.f39840[i] == c14369) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32285() {
        int i = this.f39841;
        Object[] objArr = this.f39840;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f39841 = 0;
        this.f39842 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32286(int i, Object obj) {
        int i2 = this.f39841;
        if (i2 != 0 && i <= this.f39843[i2 - 1]) {
            m32289(i, obj);
            return;
        }
        if (this.f39842 && i2 >= this.f39843.length) {
            m32281();
        }
        int i3 = this.f39841;
        if (i3 >= this.f39843.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f39843;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f39840;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f39843 = iArr;
            this.f39840 = objArr;
        }
        this.f39843[i3] = i;
        this.f39840[i3] = obj;
        this.f39841 = i3 + 1;
    }

    public final String toString() {
        if (m32287() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f39841 * 28);
        sb.append('{');
        for (int i = 0; i < this.f39841; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m32282(i));
            sb.append(a.h);
            Object objM32290 = m32290(i);
            if (objM32290 != this) {
                sb.append(objM32290);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
