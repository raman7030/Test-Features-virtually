package p067l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.۟᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9729 implements InterfaceC24235, GetChars, AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public boolean f26868;

    /* JADX INFO: renamed from: ۙ */
    public Runnable f26869;

    /* JADX INFO: renamed from: ۛ */
    public final int f26870;

    /* JADX INFO: renamed from: ۤ */
    public final int f26871;

    /* JADX INFO: renamed from: ۨ */
    public C15763 f26872;

    /* JADX INFO: renamed from: ۫ */
    public int f26873 = -1;

    /* JADX INFO: renamed from: ۬ */
    public boolean f26874;

    /* JADX INFO: renamed from: ܰ */
    public C24501 f26875;

    /* JADX INFO: renamed from: ᩶ */
    public int f26876;

    /* JADX INFO: renamed from: ᩸ */
    public char[] f26877;

    /* JADX INFO: renamed from: ᩹ */
    public int f26878;

    /* JADX INFO: renamed from: ᩺ */
    public C14443 f26879;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f26868) {
            return;
        }
        this.f26868 = true;
        this.f26869 = null;
        C14443 c14443 = this.f26879;
        try {
            this.f26879 = null;
            this.f26877 = null;
            try {
                C15763 c15763 = this.f26872;
                if (c15763 != null) {
                    C15763.m35823(c15763);
                }
                this.f26872 = null;
                C24501 c24501 = this.f26875;
                if (c24501 != null) {
                    c24501.close();
                    this.f26875 = null;
                }
                if (c14443 != null) {
                    c14443.close();
                }
            } catch (Throwable th) {
                this.f26872 = null;
                C24501 c24502 = this.f26875;
                if (c24502 != null) {
                    c24502.close();
                    this.f26875 = null;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (c14443 != null) {
                try {
                    c14443.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C9729 m22742() {
        m22741();
        return m22734(new C14443(this.f26879.m34522(), this.f26879.m33057()), this.f26870);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C15763 m22750() {
        m22741();
        if (this.f26872 == null) {
            this.f26872 = new C15763(this);
        }
        return this.f26872;
    }

    public C9729(C14443 c14443, int i) {
        this.f26879 = c14443;
        this.f26871 = c14443.length();
        this.f26870 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9729 m22733(C14443 c14443) {
        return m22734(c14443, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9729 m22734(C14443 c14443, int i) {
        try {
            return new C9729(c14443, i);
        } catch (Error | RuntimeException e) {
            c14443.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m22747() {
        m22741();
        return this.f26870;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C14443 m22744() {
        return this.f26879;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        m22741();
        return this.f26871;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m22749() {
        m22741();
        return this.f26879.m34525();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m22745(int i) {
        m22741();
        C13773.m31392(i, i, this.f26871);
        return this.f26879.m34523(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m22748(int i) {
        m22741();
        return this.f26879.m34524(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24481 m22743(int i, int i2) {
        m22741();
        C13773.m31392(i, i2, this.f26871);
        return new C24481(this, i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22746(Runnable runnable) {
        m22741();
        this.f26869 = runnable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2;
        m22741();
        if (i < this.f26876 || i >= this.f26878) {
            if (i < 0 || i >= (i2 = this.f26871)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            m22735(this.f26873 > i ? Math.max(0, i - 1024) : i, Math.min(1024, i2 - i) + i, i);
        }
        return this.f26877[i - this.f26876];
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22735(int i, int i2, int i3) {
        m22736();
        this.f26873 = i3;
        this.f26878 = 0;
        this.f26876 = 0;
        if (this.f26875 == null) {
            C24501 c24501 = new C24501(this.f26879.m34522().f38940, 2048);
            this.f26875 = c24501;
            this.f26877 = c24501.m54003();
        }
        this.f26879.getChars(i, i2, this.f26877, 0);
        this.f26876 = i;
        this.f26878 = i2;
    }

    @Override // p067l.InterfaceC24235
    public final int indexOf(char c, int i, int i2) {
        m22741();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f26871, i2);
        while (iMax < iMin) {
            m22736();
            if (iMax < this.f26876 || iMax >= this.f26878) {
                m22735(iMax, Math.min(1024, iMin - iMax) + iMax, iMax);
            }
            int iMin2 = Math.min(iMin, this.f26878);
            while (iMax < iMin2) {
                if (this.f26877[iMax - this.f26876] == c) {
                    return iMax;
                }
                iMax++;
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC24235
    public final int lastIndexOf(char c, int i, int i2) {
        m22741();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f26871, i2);
        while (iMin > iMax) {
            m22736();
            int i3 = iMin - 1;
            if (i3 < this.f26876 || i3 >= this.f26878) {
                m22735(Math.max(iMax, iMin - 1024), iMin, i3);
            }
            int iMax2 = Math.max(iMax, this.f26876);
            while (iMin > iMax2) {
                iMin--;
                if (this.f26877[iMin - this.f26876] == c) {
                    return iMin;
                }
            }
        }
        return -1;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        m22741();
        C13773.m31392(i, i2, this.f26871);
        int i4 = i2 - i;
        C15113.m34521(cArr, i3, i4);
        if (i == i2) {
            return;
        }
        m22736();
        int i5 = this.f26876;
        if (i >= i5 && i2 <= this.f26878) {
            System.arraycopy(this.f26877, i - i5, cArr, i3, i4);
            return;
        }
        if (this.f26869 == null) {
            this.f26879.getChars(i, i2, cArr, i3);
            return;
        }
        while (i < i2) {
            m22736();
            int iMin = Math.min(4096, i2 - i) + i;
            this.f26879.getChars(i, iMin, cArr, i3);
            i3 += iMin - i;
            i = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        m22741();
        m22736();
        C13773.m31392(i, i2, this.f26871);
        if (i == i2) {
            return "";
        }
        int i3 = this.f26876;
        if (i >= i3 && i2 <= this.f26878) {
            return new String(this.f26877, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m22741();
        if (this.f26874) {
            return super.toString();
        }
        return this.f26869 != null ? subSequence(0, this.f26871) : this.f26879.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public void m22736() {
        Runnable runnable = this.f26869;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ */
    public void m22741() {
        if (this.f26868) {
            throw new IllegalStateException("Text reader is closed");
        }
    }
}
