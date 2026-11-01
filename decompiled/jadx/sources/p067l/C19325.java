package p067l;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ᩳۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BIC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19325 {

    /* JADX INFO: renamed from: ֫ */
    public int f57691;

    /* JADX INFO: renamed from: ۡ */
    public StringReader f57694;

    /* JADX INFO: renamed from: ۢ */
    public boolean f57695;

    /* JADX INFO: renamed from: ܳ */
    public int f57697;

    /* JADX INFO: renamed from: ܺ */
    public int f57698;

    /* JADX INFO: renamed from: ܽ */
    public int f57699;

    /* JADX INFO: renamed from: ܿ */
    public char[] f57700;

    /* JADX INFO: renamed from: ᩳ */
    public int f57701;

    /* JADX INFO: renamed from: ᩻ */
    public String f57703;

    /* JADX INFO: renamed from: ۧ */
    public int f57696 = -1;

    /* JADX INFO: renamed from: ۖ */
    public String[] f57692 = new String[512];

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f57702 = null;

    /* JADX INFO: renamed from: ۜ */
    public int f57693 = 1;

    public C19325(StringReader stringReader, int i) {
        C18515.m42068(stringReader.markSupported());
        this.f57694 = stringReader;
        this.f57700 = new char[Math.min(i, 32768)];
        m44021();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public final void m44039() {
        StringReader stringReader = this.f57694;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
        } catch (IOException unused) {
        } finally {
            this.f57694 = null;
            this.f57700 = null;
            this.f57692 = null;
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m44021() {
        int i;
        int i2;
        boolean z;
        if (this.f57695 || (i = this.f57699) < this.f57701) {
            return;
        }
        int i3 = this.f57696;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f57694.skip(j);
            this.f57694.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                StringReader stringReader = this.f57694;
                char[] cArr = this.f57700;
                int i5 = stringReader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f57695 = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f57694.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C18515.m42068(z);
                this.f57691 = i4;
                this.f57698 += i;
                this.f57699 = i2;
                if (this.f57696 != -1) {
                    this.f57696 = 0;
                }
                this.f57701 = Math.min(i4, 24576);
            }
            m44020();
            this.f57703 = null;
        } catch (IOException e) {
            throw new C12481(e);
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m44023() {
        return this.f57698 + this.f57699;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44040(boolean z) {
        if (z && this.f57702 == null) {
            this.f57702 = new ArrayList(409);
            m44020();
        } else {
            if (z) {
                return;
            }
            this.f57702 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private int m44019(int i) {
        ArrayList arrayList = this.f57702;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: ᩶ */
    private void m44020() {
        ArrayList arrayList = this.f57702;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iM44019 = m44019(this.f57698);
                if (iM44019 == -1) {
                    iM44019 = 0;
                }
                Integer num = (Integer) this.f57702.get(iM44019);
                num.getClass();
                this.f57693 += iM44019;
                this.f57702.clear();
                this.f57702.add(num);
            }
            for (int i = this.f57699; i < this.f57691; i++) {
                if (this.f57700[i] == '\n') {
                    this.f57702.add(Integer.valueOf(this.f57698 + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44024(int i) {
        int iM44019;
        if (this.f57702 != null && (iM44019 = m44019(i)) != -1) {
            i -= ((Integer) this.f57702.get(iM44019)).intValue();
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m44037(int i) {
        if (this.f57702 == null) {
            return 1;
        }
        int iM44019 = m44019(i);
        if (iM44019 == -1) {
            return this.f57693;
        }
        return iM44019 + this.f57693 + 1;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m44030() {
        return m44037(m44023()) + ":" + m44024(m44023());
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m44031() {
        m44021();
        return this.f57699 >= this.f57691;
    }

    /* JADX INFO: renamed from: ܺ */
    public final char m44045() {
        m44021();
        int i = this.f57699;
        if (i >= this.f57691) {
            return (char) 65535;
        }
        return this.f57700[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final char m44046() {
        m44021();
        int i = this.f57699;
        char c = i >= this.f57691 ? (char) 65535 : this.f57700[i];
        this.f57699 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m44044() {
        int i = this.f57699;
        if (i < 1) {
            throw new C12481(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f57699 = i - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44028() {
        this.f57699++;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m44053() {
        if (this.f57691 - this.f57699 < 1024) {
            this.f57701 = 0;
        }
        m44021();
        this.f57696 = this.f57699;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m44056() {
        this.f57696 = -1;
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m44034() {
        int i = this.f57696;
        if (i == -1) {
            throw new C12481(new IOException("Mark invalid"));
        }
        this.f57699 = i;
        this.f57696 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44025(char c) {
        int i;
        m44021();
        int i2 = this.f57699;
        while (true) {
            if (i2 >= this.f57691) {
                i = -1;
                break;
            }
            if (c == this.f57700[i2]) {
                i = i2 - this.f57699;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strM44018 = m44018(this.f57700, this.f57692, this.f57699, i);
            this.f57699 += i;
            return strM44018;
        }
        m44021();
        char[] cArr = this.f57700;
        String[] strArr = this.f57692;
        int i3 = this.f57699;
        String strM44019 = m44018(cArr, strArr, i3, this.f57691 - i3);
        this.f57699 = this.f57691;
        return strM44019;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m44050(String str) {
        m44021();
        char cCharAt = str.charAt(0);
        int i = this.f57699;
        while (i < this.f57691) {
            if (cCharAt != this.f57700[i]) {
                do {
                    i++;
                    if (i >= this.f57691) {
                        break;
                    }
                } while (cCharAt != this.f57700[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f57691;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.f57700[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f57699;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m44035() {
        int iM44050 = m44050("]]>");
        if (iM44050 != -1) {
            String strM44018 = m44018(this.f57700, this.f57692, this.f57699, iM44050);
            this.f57699 += iM44050;
            return strM44018;
        }
        int i = this.f57691;
        int i2 = this.f57699;
        if (i - i2 >= 3) {
            int i3 = i - 2;
            String strM44019 = m44018(this.f57700, this.f57692, i2, i3 - i2);
            this.f57699 = i3;
            return strM44019;
        }
        m44021();
        char[] cArr = this.f57700;
        String[] strArr = this.f57692;
        int i4 = this.f57699;
        String strM440110 = m44018(cArr, strArr, i4, this.f57691 - i4);
        this.f57699 = this.f57691;
        return strM440110;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44027(char... cArr) {
        m44021();
        int i = this.f57699;
        int i2 = this.f57691;
        char[] cArr2 = this.f57700;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f57699 = i3;
        return i3 > i ? m44018(this.f57700, this.f57692, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m44038(char... cArr) {
        m44021();
        int i = this.f57699;
        int i2 = this.f57691;
        char[] cArr2 = this.f57700;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f57699 = i3;
        return i3 > i ? m44018(this.f57700, this.f57692, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m44051() {
        int i = this.f57699;
        int i2 = this.f57691;
        char[] cArr = this.f57700;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f57699 = i3;
        return i3 > i ? m44018(this.f57700, this.f57692, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44026(boolean z) {
        int i = this.f57699;
        int i2 = this.f57691;
        char[] cArr = this.f57700;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c == '\'') {
                    if (!z) {
                        break;
                    }
                    break;
                }
                continue;
                i3++;
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.f57699 = i3;
        return i3 > i ? m44018(this.f57700, this.f57692, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m44055() {
        int i = this.f57699;
        int i2 = this.f57691;
        char[] cArr = this.f57700;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f57699 = i3;
        return i3 > i ? m44018(this.f57700, this.f57692, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m44036() {
        m44021();
        int i = this.f57699;
        int i2 = this.f57691;
        char[] cArr = this.f57700;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f57699 = i3;
        return i3 > i ? m44018(this.f57700, this.f57692, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m44057() {
        char c;
        m44021();
        int i = this.f57699;
        while (true) {
            int i2 = this.f57699;
            if (i2 >= this.f57691 || (((c = this.f57700[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f57699++;
        }
        return m44018(this.f57700, this.f57692, i, this.f57699 - i);
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m44033() {
        int i;
        char c;
        char c2;
        m44021();
        int i2 = this.f57699;
        while (true) {
            int i3 = this.f57699;
            if (i3 >= this.f57691 || (((c2 = this.f57700[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f57699++;
        }
        while (true) {
            i = this.f57699;
            if (i >= this.f57691 || (c = this.f57700[i]) < '0' || c > '9') {
                break;
            }
            this.f57699 = i + 1;
        }
        return m44018(this.f57700, this.f57692, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m44043() {
        int i;
        char c;
        m44021();
        int i2 = this.f57699;
        while (true) {
            i = this.f57699;
            if (i >= this.f57691 || (((c = this.f57700[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f57699 = i + 1;
        }
        return m44018(this.f57700, this.f57692, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m44049() {
        int i;
        char c;
        m44021();
        int i2 = this.f57699;
        while (true) {
            i = this.f57699;
            if (i >= this.f57691 || (c = this.f57700[i]) < '0' || c > '9') {
                break;
            }
            this.f57699 = i + 1;
        }
        return m44018(this.f57700, this.f57692, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m44041(char c) {
        return !m44031() && this.f57700[this.f57699] == c;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44047(String str) {
        m44021();
        int length = str.length();
        if (length <= this.f57691 - this.f57699) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f57700[this.f57699 + i])) {
                }
            }
            this.f57699 = str.length() + this.f57699;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44048(char... cArr) {
        if (!m44031()) {
            m44021();
            char c = this.f57700[this.f57699];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m44052(char[] cArr) {
        m44021();
        return !m44031() && Arrays.binarySearch(cArr, this.f57700[this.f57699]) >= 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m44032() {
        if (m44031()) {
            return false;
        }
        char c = this.f57700[this.f57699];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m44054() {
        if (m44031()) {
            return false;
        }
        char c = this.f57700[this.f57699];
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m44022() {
        char c;
        return !m44031() && (c = this.f57700[this.f57699]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m44042(String str) {
        m44021();
        m44021();
        int length = str.length();
        if (length <= this.f57691 - this.f57699) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f57700[this.f57699 + i]) {
                }
            }
            this.f57699 = str.length() + this.f57699;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44029(String str) {
        if (str.equals(this.f57703)) {
            int i = this.f57697;
            if (i == -1) {
                return false;
            }
            if (i >= this.f57699) {
                return true;
            }
        }
        this.f57703 = str;
        Locale locale = Locale.ENGLISH;
        int iM44050 = m44050(str.toLowerCase(locale));
        if (iM44050 > -1) {
            this.f57697 = this.f57699 + iM44050;
            return true;
        }
        int iM44051 = m44050(str.toUpperCase(locale));
        boolean z = iM44051 > -1;
        this.f57697 = z ? this.f57699 + iM44051 : -1;
        return z;
    }

    public final String toString() {
        int i = this.f57691;
        int i2 = this.f57699;
        return i - i2 < 0 ? "" : new String(this.f57700, i2, i - i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m44018(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + cArr[i + i5];
        }
        int i6 = i4 & SecP521R1Field.P16;
        String str = strArr[i6];
        if (str != null && i2 == str.length()) {
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
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }
}
