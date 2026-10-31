package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes3.dex */
public class C12158 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] f36264;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22364 f36269;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f36270;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f36267 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f36271 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f36266 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36268 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f36272 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f36265 = false;

    public C12158(C3691 c3691, char[] cArr, int i) {
        this.f36264 = cArr;
        this.f36270 = i;
        this.f36269 = c3691.f11643;
        m29578();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m29596() {
        return this.f36270;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m29593() {
        return this.f36267 < this.f36270;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m29579() {
        EnumC12863 enumC12863;
        int i = this.f36267 + this.f36271;
        this.f36267 = i;
        boolean z = false;
        this.f36271 = 0;
        char[] cArr = this.f36264;
        int i2 = this.f36270;
        if (i2 <= i) {
            this.f36266 = (char) 26;
        } else {
            this.f36266 = cArr[i];
            this.f36271 = 1;
        }
        if (this.f36266 != '\\' || (this.f36272 && !this.f36265)) {
            this.f36272 = false;
            this.f36265 = false;
        } else {
            int i3 = i + this.f36271;
            this.f36266 = '\\';
            this.f36271 = 1;
            int i4 = i3;
            while (i4 < i2 && cArr[i4] == 'u') {
                i4++;
            }
            if (i4 == i3) {
                enumC12863 = EnumC12863.BACKSLASH;
            } else {
                int iDigit = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    iDigit = (iDigit << 4) | (i4 < i2 ? Character.digit(cArr[i4], 16) : -1);
                    if (iDigit < 0) {
                        break;
                    }
                    i4++;
                }
                this.f36271 = i4 - this.f36267;
                if (iDigit >= 0) {
                    this.f36266 = (char) iDigit;
                    enumC12863 = EnumC12863.VALID_ESCAPE;
                } else {
                    this.f36269.m7269(i4, C6241.f19254);
                    enumC12863 = EnumC12863.BROKEN_ESCAPE;
                }
            }
            int iOrdinal = enumC12863.ordinal();
            if (iOrdinal == 0) {
                this.f36265 = false;
                this.f36272 = !this.f36272;
            } else if (iOrdinal == 1) {
                this.f36265 = true;
                if (this.f36266 == '\\' && !this.f36272) {
                    z = true;
                }
                this.f36272 = z;
            } else if (iOrdinal == 2) {
                m29579();
            }
        }
        this.f36268 = this.f36266;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m29578() {
        m29579();
        if (m29594() || !Character.isHighSurrogate(this.f36266)) {
            return;
        }
        char c = this.f36266;
        int i = this.f36267;
        int i2 = this.f36271;
        m29579();
        char c2 = this.f36266;
        if (Character.isLowSurrogate(c2)) {
            this.f36267 = i;
            this.f36271 += i2;
            this.f36268 = Character.toCodePoint(c, c2);
        } else {
            this.f36267 = i;
            this.f36271 = i2;
            this.f36266 = c;
            this.f36268 = c;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29595() {
        return this.f36267;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29588(int i) {
        this.f36267 = i;
        this.f36271 = 0;
        this.f36272 = false;
        this.f36265 = false;
        m29578();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m29580() {
        return this.f36266;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29587() {
        return this.f36268;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m29590() {
        return 65535 < this.f36268;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m29594() {
        return this.f36266 <= 127;
    }

    /* JADX INFO: renamed from: ۜ */
    public char mo9118() {
        m29578();
        return this.f36266;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m29591(char c) {
        return this.f36266 == c;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29583(char c, char c2) {
        return m29591(c) || m29591(c2);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m29586() {
        while (true) {
            if (!m29591(' ') && !m29591('\t') && !m29591('\f')) {
                return;
            } else {
                mo9118();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29589(char c) {
        char c2 = this.f36266;
        return '0' <= c2 && c2 <= c;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29582(char c) {
        if (!m29591(c)) {
            return false;
        }
        mo9118();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29584(String str) {
        if (str.length() == 0 || !m29591(str.charAt(0))) {
            return false;
        }
        int i = this.f36267;
        m29578();
        for (int i2 = 1; i2 < str.length(); i2++) {
            if (!m29591(str.charAt(i2))) {
                m29588(i);
                return false;
            }
            m29578();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29581(int i) {
        if (m29589('9')) {
            int i2 = this.f36266 - '0';
            if (i2 < i) {
                return i2;
            }
            return -1;
        }
        int iDigit = m29590() ? Character.digit(this.f36268, i) : Character.digit(this.f36266, i);
        if (iDigit >= 0 && !m29594()) {
            this.f36269.m7269(this.f36267, C6241.f19210);
            this.f36266 = "0123456789abcdef".charAt(iDigit);
        }
        return iDigit;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] m29592() {
        char[] cArr = this.f36264;
        int length = cArr.length;
        int i = this.f36270;
        return i == length ? cArr : Arrays.copyOf(cArr, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m29585(int i, int i2) {
        return Arrays.copyOfRange(this.f36264, i, i2);
    }
}
