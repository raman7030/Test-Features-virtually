package p067l;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13473 {

    /* JADX INFO: renamed from: ֫ */
    public final int f37817;

    /* JADX INFO: renamed from: ۜ */
    public final String f37818;

    /* JADX INFO: renamed from: ۧ */
    public final int f37819;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f37820;

    /* JADX INFO: renamed from: ܽ */
    public final char[] f37821;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f37822;

    /* JADX INFO: renamed from: ᩳ */
    public final int f37823;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean[] f37824;

    /* JADX INFO: renamed from: ᩻ */
    public final int f37825;

    public C13473(String str, char[] cArr, byte[] bArr, boolean z) {
        str.getClass();
        this.f37818 = str;
        cArr.getClass();
        this.f37821 = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iM17906 = C7754.m17906(length);
            this.f37817 = iM17906;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM17906);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f37823 = i;
            this.f37819 = iM17906 >> iNumberOfTrailingZeros;
            this.f37825 = cArr.length - 1;
            this.f37822 = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f37819; i2++) {
                int i3 = this.f37817;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[C7754.m17907(i2 * 8, i3)] = true;
            }
            this.f37824 = zArr;
            this.f37820 = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13473(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                throw new IllegalArgumentException(C12229.m28208("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw new IllegalArgumentException(C12229.m28208("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m30616(int i) {
        return this.f37821[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m30620(int i) {
        return this.f37824[i % this.f37823];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30617(char c) throws C9449 {
        if (c > 127) {
            throw new C9449(C1514.m34687(new StringBuilder("Unrecognized character: 0x"), c));
        }
        byte b = this.f37822[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new C9449(C1514.m34687(new StringBuilder("Unrecognized character: 0x"), c));
        }
        throw new C9449("Unrecognized character: " + c);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13473 m30618() {
        boolean z;
        char[] cArr = this.f37821;
        for (char c : cArr) {
            if (C16726.m37958(c)) {
                int length = cArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    char c2 = cArr[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        z = true;
                        break;
                    }
                    i++;
                }
                C6194.m14035("Cannot call lowerCase() on a mixed-case alphabet", !z);
                char[] cArr2 = new char[cArr.length];
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c3 = cArr[i2];
                    if (C16726.m37958(c3)) {
                        c3 = (char) (c3 ^ ' ');
                    }
                    cArr2[i2] = c3;
                }
                C13473 c13473 = new C13473(C10965.m25286(new StringBuilder(), this.f37818, ".lowerCase()"), cArr2);
                if (!this.f37820 || c13473.f37820) {
                    return c13473;
                }
                byte[] bArr = c13473.f37822;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i3 = 65; i3 <= 90; i3++) {
                    int i4 = i3 | 32;
                    byte b = bArr[i3];
                    byte b2 = bArr[i4];
                    if (b == -1) {
                        bArrCopyOf[i3] = b2;
                    } else {
                        char c4 = (char) i3;
                        char c5 = (char) i4;
                        if (!(b2 == -1)) {
                            throw new IllegalStateException(C12229.m28208("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                        }
                        bArrCopyOf[i4] = b;
                    }
                }
                return new C13473(C10965.m25286(new StringBuilder(), c13473.f37818, ".ignoreCase()"), c13473.f37821, bArrCopyOf, true);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m30619(char c) {
        byte[] bArr = this.f37822;
        return c < bArr.length && bArr[c] != -1;
    }

    public final String toString() {
        return this.f37818;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13473)) {
            return false;
        }
        C13473 c13473 = (C13473) obj;
        return this.f37820 == c13473.f37820 && Arrays.equals(this.f37821, c13473.f37821);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37821) + (this.f37820 ? 1231 : 1237);
    }
}
