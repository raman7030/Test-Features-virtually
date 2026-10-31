package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ᩳۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BIC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17842 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f54493;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public StringReader f54496;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f54497;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f54499;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f54500;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54501;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public char[] f54502;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f54503;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f54505;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f54498 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String[] f54494 = new String[512];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f54504 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f54495 = 1;

    public C17842(StringReader stringReader, int i) {
        C16990.m39825(stringReader.markSupported());
        this.f54496 = stringReader;
        this.f54502 = new char[Math.min(i, 32768)];
        m41775();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41793() {
        StringReader stringReader = this.f54496;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
        } catch (IOException unused) {
        } finally {
            this.f54496 = null;
            this.f54502 = null;
            this.f54494 = null;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m41775() {
        int i;
        int i2;
        boolean z;
        if (this.f54497 || (i = this.f54501) < this.f54503) {
            return;
        }
        int i3 = this.f54498;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f54496.skip(j);
            this.f54496.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                StringReader stringReader = this.f54496;
                char[] cArr = this.f54502;
                int i5 = stringReader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f54497 = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f54496.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C16990.m39825(z);
                this.f54493 = i4;
                this.f54500 += i;
                this.f54501 = i2;
                if (this.f54498 != -1) {
                    this.f54498 = 0;
                }
                this.f54503 = Math.min(i4, 24576);
            }
            m41774();
            this.f54505 = null;
        } catch (IOException e) {
            throw new C10641(e);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m41777() {
        return this.f54500 + this.f54501;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41794(boolean z) {
        if (z && this.f54504 == null) {
            this.f54504 = new ArrayList(409);
            m41774();
        } else {
            if (z) {
                return;
            }
            this.f54504 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m41773(int i) {
        ArrayList arrayList = this.f54504;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m41774() {
        ArrayList arrayList = this.f54504;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iM41773 = m41773(this.f54500);
                if (iM41773 == -1) {
                    iM41773 = 0;
                }
                Integer num = (Integer) this.f54504.get(iM41773);
                num.getClass();
                this.f54495 += iM41773;
                this.f54504.clear();
                this.f54504.add(num);
            }
            for (int i = this.f54501; i < this.f54493; i++) {
                if (this.f54502[i] == '\n') {
                    this.f54504.add(Integer.valueOf(this.f54500 + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41778(int i) {
        int iM41773;
        if (this.f54504 != null && (iM41773 = m41773(i)) != -1) {
            i -= ((Integer) this.f54504.get(iM41773)).intValue();
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41791(int i) {
        if (this.f54504 == null) {
            return 1;
        }
        int iM41773 = m41773(i);
        if (iM41773 == -1) {
            return this.f54495;
        }
        return iM41773 + this.f54495 + 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m41784() {
        return m41791(m41777()) + ":" + m41778(m41777());
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m41785() {
        m41775();
        return this.f54501 >= this.f54493;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char m41799() {
        m41775();
        int i = this.f54501;
        if (i >= this.f54493) {
            return (char) 65535;
        }
        return this.f54502[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char m41800() {
        m41775();
        int i = this.f54501;
        char c = i >= this.f54493 ? (char) 65535 : this.f54502[i];
        this.f54501 = i + 1;
        return c;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m41798() {
        int i = this.f54501;
        if (i < 1) {
            throw new C10641(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f54501 = i - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41782() {
        this.f54501++;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41807() {
        if (this.f54493 - this.f54501 < 1024) {
            this.f54503 = 0;
        }
        m41775();
        this.f54498 = this.f54501;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m41810() {
        this.f54498 = -1;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m41788() {
        int i = this.f54498;
        if (i == -1) {
            throw new C10641(new IOException("Mark invalid"));
        }
        this.f54501 = i;
        this.f54498 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41779(char c) {
        int i;
        m41775();
        int i2 = this.f54501;
        while (true) {
            if (i2 >= this.f54493) {
                i = -1;
                break;
            }
            if (c == this.f54502[i2]) {
                i = i2 - this.f54501;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strM41772 = m41772(this.f54502, this.f54494, this.f54501, i);
            this.f54501 += i;
            return strM41772;
        }
        m41775();
        char[] cArr = this.f54502;
        String[] strArr = this.f54494;
        int i3 = this.f54501;
        String strM41773 = m41772(cArr, strArr, i3, this.f54493 - i3);
        this.f54501 = this.f54493;
        return strM41773;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41804(String str) {
        m41775();
        char cCharAt = str.charAt(0);
        int i = this.f54501;
        while (i < this.f54493) {
            if (cCharAt != this.f54502[i]) {
                do {
                    i++;
                    if (i >= this.f54493) {
                        break;
                    }
                } while (cCharAt != this.f54502[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f54493;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.f54502[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f54501;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m41789() {
        int iM41804 = m41804("]]>");
        if (iM41804 != -1) {
            String strM41772 = m41772(this.f54502, this.f54494, this.f54501, iM41804);
            this.f54501 += iM41804;
            return strM41772;
        }
        int i = this.f54493;
        int i2 = this.f54501;
        if (i - i2 >= 3) {
            int i3 = i - 2;
            String strM41773 = m41772(this.f54502, this.f54494, i2, i3 - i2);
            this.f54501 = i3;
            return strM41773;
        }
        m41775();
        char[] cArr = this.f54502;
        String[] strArr = this.f54494;
        int i4 = this.f54501;
        String strM41774 = m41772(cArr, strArr, i4, this.f54493 - i4);
        this.f54501 = this.f54493;
        return strM41774;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41781(char... cArr) {
        m41775();
        int i = this.f54501;
        int i2 = this.f54493;
        char[] cArr2 = this.f54502;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f54501 = i3;
        return i3 > i ? m41772(this.f54502, this.f54494, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m41792(char... cArr) {
        m41775();
        int i = this.f54501;
        int i2 = this.f54493;
        char[] cArr2 = this.f54502;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f54501 = i3;
        return i3 > i ? m41772(this.f54502, this.f54494, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m41805() {
        int i = this.f54501;
        int i2 = this.f54493;
        char[] cArr = this.f54502;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f54501 = i3;
        return i3 > i ? m41772(this.f54502, this.f54494, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41780(boolean z) {
        int i = this.f54501;
        int i2 = this.f54493;
        char[] cArr = this.f54502;
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
        this.f54501 = i3;
        return i3 > i ? m41772(this.f54502, this.f54494, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m41809() {
        int i = this.f54501;
        int i2 = this.f54493;
        char[] cArr = this.f54502;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f54501 = i3;
        return i3 > i ? m41772(this.f54502, this.f54494, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m41790() {
        m41775();
        int i = this.f54501;
        int i2 = this.f54493;
        char[] cArr = this.f54502;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f54501 = i3;
        return i3 > i ? m41772(this.f54502, this.f54494, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m41811() {
        char c;
        m41775();
        int i = this.f54501;
        while (true) {
            int i2 = this.f54501;
            if (i2 >= this.f54493 || (((c = this.f54502[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f54501++;
        }
        return m41772(this.f54502, this.f54494, i, this.f54501 - i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m41787() {
        int i;
        char c;
        char c2;
        m41775();
        int i2 = this.f54501;
        while (true) {
            int i3 = this.f54501;
            if (i3 >= this.f54493 || (((c2 = this.f54502[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f54501++;
        }
        while (true) {
            i = this.f54501;
            if (i >= this.f54493 || (c = this.f54502[i]) < '0' || c > '9') {
                break;
            }
            this.f54501 = i + 1;
        }
        return m41772(this.f54502, this.f54494, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m41797() {
        int i;
        char c;
        m41775();
        int i2 = this.f54501;
        while (true) {
            i = this.f54501;
            if (i >= this.f54493 || (((c = this.f54502[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f54501 = i + 1;
        }
        return m41772(this.f54502, this.f54494, i2, i - i2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m41803() {
        int i;
        char c;
        m41775();
        int i2 = this.f54501;
        while (true) {
            i = this.f54501;
            if (i >= this.f54493 || (c = this.f54502[i]) < '0' || c > '9') {
                break;
            }
            this.f54501 = i + 1;
        }
        return m41772(this.f54502, this.f54494, i2, i - i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41795(char c) {
        return !m41785() && this.f54502[this.f54501] == c;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m41801(String str) {
        m41775();
        int length = str.length();
        if (length <= this.f54493 - this.f54501) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f54502[this.f54501 + i])) {
                }
            }
            this.f54501 = str.length() + this.f54501;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m41802(char... cArr) {
        if (!m41785()) {
            m41775();
            char c = this.f54502[this.f54501];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m41806(char[] cArr) {
        m41775();
        return !m41785() && Arrays.binarySearch(cArr, this.f54502[this.f54501]) >= 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m41786() {
        if (m41785()) {
            return false;
        }
        char c = this.f54502[this.f54501];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m41808() {
        if (m41785()) {
            return false;
        }
        char c = this.f54502[this.f54501];
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m41776() {
        char c;
        return !m41785() && (c = this.f54502[this.f54501]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41796(String str) {
        m41775();
        m41775();
        int length = str.length();
        if (length <= this.f54493 - this.f54501) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f54502[this.f54501 + i]) {
                }
            }
            this.f54501 = str.length() + this.f54501;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41783(String str) {
        if (str.equals(this.f54505)) {
            int i = this.f54499;
            if (i == -1) {
                return false;
            }
            if (i >= this.f54501) {
                return true;
            }
        }
        this.f54505 = str;
        Locale locale = Locale.ENGLISH;
        int iM41804 = m41804(str.toLowerCase(locale));
        if (iM41804 > -1) {
            this.f54499 = this.f54501 + iM41804;
            return true;
        }
        int iM41805 = m41804(str.toUpperCase(locale));
        boolean z = iM41805 > -1;
        this.f54499 = z ? this.f54501 + iM41805 : -1;
        return z;
    }

    public final String toString() {
        int i = this.f54493;
        int i2 = this.f54501;
        return i - i2 < 0 ? "" : new String(this.f54502, i2, i - i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41772(char[] cArr, String[] strArr, int i, int i2) {
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
