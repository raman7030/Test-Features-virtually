package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.۟᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7744 implements InterfaceC23008, GetChars, AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f23955;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Runnable f23956;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f23957;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f23958;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14093 f23959;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23960 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f23961;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23287 f23962;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23963;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f23964;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f23965;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12704 f23966;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f23955) {
            return;
        }
        this.f23955 = true;
        this.f23956 = null;
        C12704 c12704 = this.f23966;
        try {
            this.f23966 = null;
            this.f23964 = null;
            try {
                C14093 c14093 = this.f23959;
                if (c14093 != null) {
                    C14093.m33698(c14093);
                }
                this.f23959 = null;
                C23287 c23287 = this.f23962;
                if (c23287 != null) {
                    c23287.close();
                    this.f23962 = null;
                }
                if (c12704 != null) {
                    c12704.close();
                }
            } catch (Throwable th) {
                this.f23959 = null;
                C23287 c23288 = this.f23962;
                if (c23288 != null) {
                    c23288.close();
                    this.f23962 = null;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (c12704 != null) {
                try {
                    c12704.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C7744 m20762() {
        m20761();
        return m20754(new C12704(this.f23966.m32420(), this.f23966.m30979()), this.f23957);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14093 m20770() {
        m20761();
        if (this.f23959 == null) {
            this.f23959 = new C14093(this);
        }
        return this.f23959;
    }

    public C7744(C12704 c12704, int i) {
        this.f23966 = c12704;
        this.f23958 = c12704.length();
        this.f23957 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7744 m20753(C12704 c12704) {
        return m20754(c12704, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7744 m20754(C12704 c12704, int i) {
        try {
            return new C7744(c12704, i);
        } catch (Error | RuntimeException e) {
            c12704.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m20767() {
        m20761();
        return this.f23957;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12704 m20764() {
        return this.f23966;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        m20761();
        return this.f23958;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m20769() {
        m20761();
        return this.f23966.m32423();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m20765(int i) {
        m20761();
        C11999.m29337(i, i, this.f23958);
        return this.f23966.m32421(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m20768(int i) {
        m20761();
        return this.f23966.m32422(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23266 m20763(int i, int i2) {
        m20761();
        C11999.m29337(i, i2, this.f23958);
        return new C23266(this, i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20766(Runnable runnable) {
        m20761();
        this.f23956 = runnable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2;
        m20761();
        if (i < this.f23963 || i >= this.f23965) {
            if (i < 0 || i >= (i2 = this.f23958)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            m20755(this.f23960 > i ? Math.max(0, i - 1024) : i, Math.min(1024, i2 - i) + i, i);
        }
        return this.f23964[i - this.f23963];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20755(int i, int i2, int i3) {
        m20756();
        this.f23960 = i3;
        this.f23965 = 0;
        this.f23963 = 0;
        if (this.f23962 == null) {
            C23287 c23287 = new C23287(this.f23966.m32420().f35930, 2048);
            this.f23962 = c23287;
            this.f23964 = c23287.m51607();
        }
        this.f23966.getChars(i, i2, this.f23964, 0);
        this.f23963 = i;
        this.f23965 = i2;
    }

    @Override // l.InterfaceC23008
    public final int indexOf(char c, int i, int i2) {
        m20761();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f23958, i2);
        while (iMax < iMin) {
            m20756();
            if (iMax < this.f23963 || iMax >= this.f23965) {
                m20755(iMax, Math.min(1024, iMin - iMax) + iMax, iMax);
            }
            int iMin2 = Math.min(iMin, this.f23965);
            while (iMax < iMin2) {
                if (this.f23964[iMax - this.f23963] == c) {
                    return iMax;
                }
                iMax++;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC23008
    public final int lastIndexOf(char c, int i, int i2) {
        m20761();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f23958, i2);
        while (iMin > iMax) {
            m20756();
            int i3 = iMin - 1;
            if (i3 < this.f23963 || i3 >= this.f23965) {
                m20755(Math.max(iMax, iMin - 1024), iMin, i3);
            }
            int iMax2 = Math.max(iMax, this.f23963);
            while (iMin > iMax2) {
                iMin--;
                if (this.f23964[iMin - this.f23963] == c) {
                    return iMin;
                }
            }
        }
        return -1;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        m20761();
        C11999.m29337(i, i2, this.f23958);
        int i4 = i2 - i;
        C13409.m32419(cArr, i3, i4);
        if (i == i2) {
            return;
        }
        m20756();
        int i5 = this.f23963;
        if (i >= i5 && i2 <= this.f23965) {
            System.arraycopy(this.f23964, i - i5, cArr, i3, i4);
            return;
        }
        if (this.f23956 == null) {
            this.f23966.getChars(i, i2, cArr, i3);
            return;
        }
        while (i < i2) {
            m20756();
            int iMin = Math.min(4096, i2 - i) + i;
            this.f23966.getChars(i, iMin, cArr, i3);
            i3 += iMin - i;
            i = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        m20761();
        m20756();
        C11999.m29337(i, i2, this.f23958);
        if (i == i2) {
            return "";
        }
        int i3 = this.f23963;
        if (i >= i3 && i2 <= this.f23965) {
            return new String(this.f23964, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m20761();
        if (this.f23961) {
            return super.toString();
        }
        return this.f23956 != null ? subSequence(0, this.f23958) : this.f23966.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m20756() {
        Runnable runnable = this.f23956;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m20761() {
        if (this.f23955) {
            throw new IllegalStateException("Text reader is closed");
        }
    }
}
