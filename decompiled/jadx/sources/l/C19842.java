package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩶֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public class C19842 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f64100;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f64101;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f64102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64103;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7678 f64104;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m45635(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public C19842(String str) {
        this.f64103 = 0;
        this.f64101 = 0;
        this.f64104 = new C7678();
        String strTrim = str.trim();
        this.f64100 = strTrim;
        this.f64101 = strTrim.length();
        this.f64102 = 0;
    }

    public C19842(String str, int i) {
        this.f64101 = 0;
        this.f64104 = new C7678();
        this.f64100 = str;
        this.f64103 = i;
        this.f64101 = str.length();
        while (true) {
            int i2 = this.f64103;
            if (i2 >= this.f64101 || str.charAt(i2) > ' ') {
                break;
            } else {
                this.f64103++;
            }
        }
        while (true) {
            int i3 = this.f64101;
            if (i3 <= this.f64103 || str.charAt(i3 - 1) > ' ') {
                break;
            } else {
                this.f64101--;
            }
        }
        this.f64102 = this.f64103;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45644() {
        return this.f64103 == this.f64101;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m45643() {
        while (true) {
            int i = this.f64103;
            if (i >= this.f64101 || !m45635((int) this.f64100.charAt(i))) {
                return;
            } else {
                this.f64103++;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m45649() {
        m45643();
        int i = this.f64103;
        if (i == this.f64101 || this.f64100.charAt(i) != ',') {
            return false;
        }
        this.f64103++;
        m45643();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m45648() {
        int i = this.f64103;
        int i2 = this.f64101;
        int i3 = this.f64102;
        C7678 c7678 = this.f64104;
        float fM20562 = c7678.m20562(i, i2, i3, this.f64100);
        if (!Float.isNaN(fM20562)) {
            this.f64103 = c7678.m20563();
        }
        return fM20562;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m45636(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        m45649();
        return m45648();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Integer m45646() {
        int i = this.f64103;
        if (i == this.f64101) {
            return null;
        }
        this.f64103 = i + 1;
        return Integer.valueOf(this.f64100.charAt(i));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0769 m45647() {
        float fM45648 = m45648();
        if (Float.isNaN(fM45648)) {
            return null;
        }
        EnumC7265 enumC7265M45642 = m45642();
        if (enumC7265M45642 == null) {
            return new C0769(fM45648, EnumC7265.px);
        }
        return new C0769(fM45648, enumC7265M45642);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Boolean m45638(Object obj) {
        if (obj == null) {
            return null;
        }
        m45649();
        int i = this.f64103;
        if (i == this.f64101) {
            return null;
        }
        char cCharAt = this.f64100.charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f64103++;
        return Boolean.valueOf(cCharAt == '1');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45640(char c) {
        int i = this.f64103;
        boolean z = i < this.f64101 && this.f64100.charAt(i) == c;
        if (z) {
            this.f64103++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45641(String str) {
        int length = str.length();
        int i = this.f64103;
        boolean z = i <= this.f64101 - length && this.f64100.substring(i, i + length).equals(str);
        if (z) {
            this.f64103 += length;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45637() {
        int i = this.f64103;
        int i2 = this.f64101;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.f64103 = i3;
        if (i3 < i2) {
            return this.f64100.charAt(i3);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m45650() {
        return m45639(false, ' ');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m45639(boolean z, char c) {
        if (m45644()) {
            return null;
        }
        int i = this.f64103;
        String str = this.f64100;
        char cCharAt = str.charAt(i);
        if ((!z && m45635((int) cCharAt)) || cCharAt == c) {
            return null;
        }
        int i2 = this.f64103;
        int iM45637 = m45637();
        while (iM45637 != -1 && iM45637 != c && (z || !m45635(iM45637))) {
            iM45637 = m45637();
        }
        return str.substring(i2, this.f64103);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC7265 m45642() {
        if (m45644()) {
            return null;
        }
        int i = this.f64103;
        String str = this.f64100;
        if (str.charAt(i) == '%') {
            this.f64103++;
            return EnumC7265.percent;
        }
        int i2 = this.f64103;
        if (i2 > this.f64101 - 2) {
            return null;
        }
        try {
            EnumC7265 enumC7265ValueOf = EnumC7265.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
            this.f64103 += 2;
            return enumC7265ValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m45645() {
        if (m45644()) {
            return null;
        }
        int i = this.f64103;
        String str = this.f64100;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iM45637 = m45637();
        while (iM45637 != -1 && iM45637 != cCharAt) {
            iM45637 = m45637();
        }
        if (iM45637 == -1) {
            this.f64103 = i;
            return null;
        }
        int i2 = this.f64103;
        this.f64103 = i2 + 1;
        return str.substring(i + 1, i2);
    }
}
