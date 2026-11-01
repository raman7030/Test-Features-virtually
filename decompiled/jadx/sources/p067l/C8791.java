package p067l;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BIC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8791 {

    /* JADX INFO: renamed from: ֫ */
    public int f23850;

    /* JADX INFO: renamed from: ۜ */
    public final String[] f23851;

    /* JADX INFO: renamed from: ۧ */
    public int f23852;

    /* JADX INFO: renamed from: ܳ */
    public final StringReader f23853;

    /* JADX INFO: renamed from: ܽ */
    public int f23854;

    /* JADX INFO: renamed from: ܿ */
    public final char[] f23855;

    /* JADX INFO: renamed from: ᩳ */
    public int f23856;

    /* JADX INFO: renamed from: ᩻ */
    public int f23857;

    public C8791(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.f23851 = new String[128];
        if (stringReader.markSupported()) {
            this.f23853 = stringReader;
            this.f23855 = new char[4096];
            m20328();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    /* JADX INFO: renamed from: ۚ */
    private void m20328() {
        StringReader stringReader = this.f23853;
        int i = this.f23854;
        if (i < this.f23856) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(4096);
            int i2 = stringReader.read(this.f23855);
            stringReader.reset();
            if (i2 != -1) {
                this.f23850 = i2;
                this.f23857 += this.f23854;
                this.f23854 = 0;
                this.f23852 = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.f23856 = i2;
            }
        } catch (IOException e) {
            throw new C18178(e);
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m20351() {
        return this.f23857 + this.f23854;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m20337() {
        m20328();
        return this.f23854 >= this.f23850;
    }

    /* JADX INFO: renamed from: ۢ */
    public final char m20338() {
        m20328();
        int i = this.f23854;
        if (i >= this.f23850) {
            return (char) 65535;
        }
        return this.f23855[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final char m20339() {
        m20328();
        int i = this.f23854;
        char c = i >= this.f23850 ? (char) 65535 : this.f23855[i];
        this.f23854 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m20329() {
        this.f23854--;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20332() {
        this.f23854++;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m20344() {
        this.f23852 = this.f23854;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m20352() {
        this.f23854 = this.f23852;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m20330(char c) {
        char[] cArr;
        int i;
        m20328();
        int i2 = this.f23854;
        while (true) {
            int i3 = this.f23850;
            cArr = this.f23855;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.f23854;
                break;
            }
            i2++;
        }
        String[] strArr = this.f23851;
        if (i != -1) {
            String strM20327 = m20327(cArr, strArr, this.f23854, i);
            this.f23854 += i;
            return strM20327;
        }
        m20328();
        int i4 = this.f23854;
        String strM20328 = m20327(cArr, strArr, i4, this.f23850 - i4);
        this.f23854 = this.f23850;
        return strM20328;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m20345(String str) {
        m20328();
        char cCharAt = str.charAt(0);
        int i = this.f23854;
        while (i < this.f23850) {
            char[] cArr = this.f23855;
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.f23850) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f23850;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f23854;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m20353() {
        int iM20345 = m20345("]]>");
        String[] strArr = this.f23851;
        char[] cArr = this.f23855;
        if (iM20345 != -1) {
            String strM20327 = m20327(cArr, strArr, this.f23854, iM20345);
            this.f23854 += iM20345;
            return strM20327;
        }
        m20328();
        int i = this.f23854;
        String strM20328 = m20327(cArr, strArr, i, this.f23850 - i);
        this.f23854 = this.f23850;
        return strM20328;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m20331(char... cArr) {
        char[] cArr2;
        m20328();
        int i = this.f23854;
        int i2 = this.f23850;
        loop0: while (true) {
            int i3 = this.f23854;
            cArr2 = this.f23855;
            if (i3 >= i2) {
                break;
            }
            for (char c : cArr) {
                if (cArr2[this.f23854] == c) {
                    break loop0;
                }
            }
            this.f23854++;
        }
        int i4 = this.f23854;
        return i4 > i ? m20327(cArr2, this.f23851, i, i4 - i) : "";
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m20340(char... cArr) {
        char[] cArr2;
        m20328();
        int i = this.f23854;
        int i2 = this.f23850;
        while (true) {
            int i3 = this.f23854;
            cArr2 = this.f23855;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.f23854++;
        }
        int i4 = this.f23854;
        return i4 > i ? m20327(cArr2, this.f23851, i, i4 - i) : "";
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m20346() {
        int i;
        char[] cArr;
        char c;
        m20328();
        int i2 = this.f23854;
        int i3 = this.f23850;
        while (true) {
            i = this.f23854;
            cArr = this.f23855;
            if (i >= i3 || (c = cArr[i]) == '&' || c == '<' || c == 0) {
                break;
            }
            this.f23854 = i + 1;
        }
        return i > i2 ? m20327(cArr, this.f23851, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m20336() {
        int i;
        char[] cArr;
        char c;
        m20328();
        int i2 = this.f23854;
        int i3 = this.f23850;
        while (true) {
            i = this.f23854;
            cArr = this.f23855;
            if (i >= i3 || (c = cArr[i]) == '\t' || c == '\n' || c == '\r' || c == '\f' || c == ' ' || c == '/' || c == '>' || c == 0) {
                break;
            }
            this.f23854 = i + 1;
        }
        return i > i2 ? m20327(cArr, this.f23851, i2, i - i2) : "";
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m20343() {
        char[] cArr;
        char c;
        m20328();
        int i = this.f23854;
        while (true) {
            int i2 = this.f23854;
            int i3 = this.f23850;
            cArr = this.f23855;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f23854++;
        }
        return m20327(cArr, this.f23851, i, this.f23854 - i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m20354() {
        char[] cArr;
        int i;
        char c;
        char c2;
        m20328();
        int i2 = this.f23854;
        while (true) {
            int i3 = this.f23854;
            int i4 = this.f23850;
            cArr = this.f23855;
            if (i3 >= i4 || (((c2 = cArr[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f23854++;
        }
        while (true) {
            i = this.f23854;
            if (i >= this.f23850 || (c = cArr[i]) < '0' || c > '9') {
                break;
            }
            this.f23854 = i + 1;
        }
        return m20327(cArr, this.f23851, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m20348() {
        int i;
        char[] cArr;
        char c;
        m20328();
        int i2 = this.f23854;
        while (true) {
            i = this.f23854;
            int i3 = this.f23850;
            cArr = this.f23855;
            if (i >= i3 || (((c = cArr[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f23854 = i + 1;
        }
        return m20327(cArr, this.f23851, i2, i - i2);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m20349() {
        int i;
        char[] cArr;
        char c;
        m20328();
        int i2 = this.f23854;
        while (true) {
            i = this.f23854;
            int i3 = this.f23850;
            cArr = this.f23855;
            if (i >= i3 || (c = cArr[i]) < '0' || c > '9') {
                break;
            }
            this.f23854 = i + 1;
        }
        return m20327(cArr, this.f23851, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m20341(char c) {
        return !m20337() && this.f23855[this.f23854] == c;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m20342(String str) {
        m20328();
        int length = str.length();
        if (length <= this.f23850 - this.f23854) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f23855[this.f23854 + i])) {
                }
            }
            this.f23854 = str.length() + this.f23854;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m20347(char... cArr) {
        if (!m20337()) {
            m20328();
            char c = this.f23855[this.f23854];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m20350(char[] cArr) {
        m20328();
        return !m20337() && Arrays.binarySearch(cArr, this.f23855[this.f23854]) >= 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m20335() {
        if (m20337()) {
            return false;
        }
        char c = this.f23855[this.f23854];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m20334() {
        char c;
        return !m20337() && (c = this.f23855[this.f23854]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20333(String str) {
        m20328();
        m20328();
        int length = str.length();
        if (length <= this.f23850 - this.f23854) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f23855[this.f23854 + i]) {
                }
            }
            this.f23854 = str.length() + this.f23854;
            return true;
        }
        return false;
    }

    public final String toString() {
        int i = this.f23854;
        return new String(this.f23855, i, this.f23850 - i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20327(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = i;
        while (i4 < i2) {
            i5 = (i5 * 31) + cArr[i6];
            i4++;
            i6++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] == str.charAt(i3)) {
                    i7 = i10;
                    i8 = i9;
                    i3 = i11;
                }
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }
}
