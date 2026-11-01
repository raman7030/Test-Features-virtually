package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes3.dex */
public class C13923 {

    /* JADX INFO: renamed from: ֫ */
    public final char[] f39275;

    /* JADX INFO: renamed from: ܿ */
    public final C23623 f39280;

    /* JADX INFO: renamed from: ᩳ */
    public final int f39281;

    /* JADX INFO: renamed from: ܳ */
    public int f39278 = 0;

    /* JADX INFO: renamed from: ᩷ */
    public int f39282 = 0;

    /* JADX INFO: renamed from: ۧ */
    public char f39277 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f39279 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f39283 = false;

    /* JADX INFO: renamed from: ۜ */
    public boolean f39276 = false;

    public C13923(C5876 c5876, char[] cArr, int i) {
        this.f39275 = cArr;
        this.f39281 = i;
        this.f39280 = c5876.f14446;
        m31643();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m31661() {
        return this.f39281;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m31658() {
        return this.f39278 < this.f39281;
    }

    /* JADX INFO: renamed from: ܺ */
    private void m31644() {
        EnumC14593 enumC14593;
        int i = this.f39278 + this.f39282;
        this.f39278 = i;
        boolean z = false;
        this.f39282 = 0;
        char[] cArr = this.f39275;
        int i2 = this.f39281;
        if (i2 <= i) {
            this.f39277 = (char) 26;
        } else {
            this.f39277 = cArr[i];
            this.f39282 = 1;
        }
        if (this.f39277 != '\\' || (this.f39283 && !this.f39276)) {
            this.f39283 = false;
            this.f39276 = false;
        } else {
            int i3 = i + this.f39282;
            this.f39277 = '\\';
            this.f39282 = 1;
            int i4 = i3;
            while (i4 < i2 && cArr[i4] == 'u') {
                i4++;
            }
            if (i4 == i3) {
                enumC14593 = EnumC14593.BACKSLASH;
            } else {
                int iDigit = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    iDigit = (iDigit << 4) | (i4 < i2 ? Character.digit(cArr[i4], 16) : -1);
                    if (iDigit < 0) {
                        break;
                    }
                    i4++;
                }
                this.f39282 = i4 - this.f39278;
                if (iDigit >= 0) {
                    this.f39277 = (char) iDigit;
                    enumC14593 = EnumC14593.VALID_ESCAPE;
                } else {
                    this.f39280.m9348(i4, C8300.f22119);
                    enumC14593 = EnumC14593.BROKEN_ESCAPE;
                }
            }
            int iOrdinal = enumC14593.ordinal();
            if (iOrdinal == 0) {
                this.f39276 = false;
                this.f39283 = !this.f39283;
            } else if (iOrdinal == 1) {
                this.f39276 = true;
                if (this.f39277 == '\\' && !this.f39283) {
                    z = true;
                }
                this.f39283 = z;
            } else if (iOrdinal == 2) {
                m31644();
            }
        }
        this.f39279 = this.f39277;
    }

    /* JADX INFO: renamed from: ۡ */
    private void m31643() {
        m31644();
        if (m31659() || !Character.isHighSurrogate(this.f39277)) {
            return;
        }
        char c = this.f39277;
        int i = this.f39278;
        int i2 = this.f39282;
        m31644();
        char c2 = this.f39277;
        if (Character.isLowSurrogate(c2)) {
            this.f39278 = i;
            this.f39282 += i2;
            this.f39279 = Character.toCodePoint(c, c2);
        } else {
            this.f39278 = i;
            this.f39282 = i2;
            this.f39277 = c;
            this.f39279 = c;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m31660() {
        return this.f39278;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31653(int i) {
        this.f39278 = i;
        this.f39282 = 0;
        this.f39283 = false;
        this.f39276 = false;
        m31643();
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m31645() {
        return this.f39277;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31652() {
        return this.f39279;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m31655() {
        return 65535 < this.f39279;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m31659() {
        return this.f39277 <= 127;
    }

    /* JADX INFO: renamed from: ۜ */
    public char mo11169() {
        m31643();
        return this.f39277;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m31656(char c) {
        return this.f39277 == c;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31648(char c, char c2) {
        return m31656(c) || m31656(c2);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m31651() {
        while (true) {
            if (!m31656(' ') && !m31656('\t') && !m31656('\f')) {
                return;
            } else {
                mo11169();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m31654(char c) {
        char c2 = this.f39277;
        return '0' <= c2 && c2 <= c;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31647(char c) {
        if (!m31656(c)) {
            return false;
        }
        mo11169();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31649(String str) {
        if (str.length() == 0 || !m31656(str.charAt(0))) {
            return false;
        }
        int i = this.f39278;
        m31643();
        for (int i2 = 1; i2 < str.length(); i2++) {
            if (!m31656(str.charAt(i2))) {
                m31653(i);
                return false;
            }
            m31643();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31646(int i) {
        if (m31654('9')) {
            int i2 = this.f39277 - '0';
            if (i2 < i) {
                return i2;
            }
            return -1;
        }
        int iDigit = m31655() ? Character.digit(this.f39279, i) : Character.digit(this.f39277, i);
        if (iDigit >= 0 && !m31659()) {
            this.f39280.m9348(this.f39278, C8300.f22075);
            this.f39277 = "0123456789abcdef".charAt(iDigit);
        }
        return iDigit;
    }

    /* JADX INFO: renamed from: ܽ */
    public final char[] m31657() {
        char[] cArr = this.f39275;
        int length = cArr.length;
        int i = this.f39281;
        return i == length ? cArr : Arrays.copyOf(cArr, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final char[] m31650(int i, int i2) {
        return Arrays.copyOfRange(this.f39275, i, i2);
    }
}
