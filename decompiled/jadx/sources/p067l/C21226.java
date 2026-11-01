package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩶֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public class C21226 {

    /* JADX INFO: renamed from: ֫ */
    public String f66737;

    /* JADX INFO: renamed from: ۧ */
    public int f66738;

    /* JADX INFO: renamed from: ܽ */
    public final int f66739;

    /* JADX INFO: renamed from: ܿ */
    public int f66740;

    /* JADX INFO: renamed from: ᩳ */
    public C9666 f66741;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m47946(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public C21226(String str) {
        this.f66740 = 0;
        this.f66738 = 0;
        this.f66741 = new C9666();
        String strTrim = str.trim();
        this.f66737 = strTrim;
        this.f66738 = strTrim.length();
        this.f66739 = 0;
    }

    public C21226(String str, int i) {
        this.f66738 = 0;
        this.f66741 = new C9666();
        this.f66737 = str;
        this.f66740 = i;
        this.f66738 = str.length();
        while (true) {
            int i2 = this.f66740;
            if (i2 >= this.f66738 || str.charAt(i2) > ' ') {
                break;
            } else {
                this.f66740++;
            }
        }
        while (true) {
            int i3 = this.f66738;
            if (i3 <= this.f66740 || str.charAt(i3 - 1) > ' ') {
                break;
            } else {
                this.f66738--;
            }
        }
        this.f66739 = this.f66740;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m47955() {
        return this.f66740 == this.f66738;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m47954() {
        while (true) {
            int i = this.f66740;
            if (i >= this.f66738 || !m47946((int) this.f66737.charAt(i))) {
                return;
            } else {
                this.f66740++;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m47960() {
        m47954();
        int i = this.f66740;
        if (i == this.f66738 || this.f66737.charAt(i) != ',') {
            return false;
        }
        this.f66740++;
        m47954();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m47959() {
        int i = this.f66740;
        int i2 = this.f66738;
        int i3 = this.f66739;
        C9666 c9666 = this.f66741;
        float fM22542 = c9666.m22542(i, i2, i3, this.f66737);
        if (!Float.isNaN(fM22542)) {
            this.f66740 = c9666.m22543();
        }
        return fM22542;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m47947(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        m47960();
        return m47959();
    }

    /* JADX INFO: renamed from: ܽ */
    public final Integer m47957() {
        int i = this.f66740;
        if (i == this.f66738) {
            return null;
        }
        this.f66740 = i + 1;
        return Integer.valueOf(this.f66737.charAt(i));
    }

    /* JADX INFO: renamed from: ܿ */
    public final C3099 m47958() {
        float fM47959 = m47959();
        if (Float.isNaN(fM47959)) {
            return null;
        }
        EnumC9273 enumC9273M47953 = m47953();
        if (enumC9273M47953 == null) {
            return new C3099(fM47959, EnumC9273.px);
        }
        return new C3099(fM47959, enumC9273M47953);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Boolean m47949(Object obj) {
        if (obj == null) {
            return null;
        }
        m47960();
        int i = this.f66740;
        if (i == this.f66738) {
            return null;
        }
        char cCharAt = this.f66737.charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f66740++;
        return Boolean.valueOf(cCharAt == '1');
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47951(char c) {
        int i = this.f66740;
        boolean z = i < this.f66738 && this.f66737.charAt(i) == c;
        if (z) {
            this.f66740++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47952(String str) {
        int length = str.length();
        int i = this.f66740;
        boolean z = i <= this.f66738 - length && this.f66737.substring(i, i + length).equals(str);
        if (z) {
            this.f66740 += length;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m47948() {
        int i = this.f66740;
        int i2 = this.f66738;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.f66740 = i3;
        if (i3 < i2) {
            return this.f66737.charAt(i3);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m47961() {
        return m47950(false, ' ');
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m47950(boolean z, char c) {
        if (m47955()) {
            return null;
        }
        int i = this.f66740;
        String str = this.f66737;
        char cCharAt = str.charAt(i);
        if ((!z && m47946((int) cCharAt)) || cCharAt == c) {
            return null;
        }
        int i2 = this.f66740;
        int iM47948 = m47948();
        while (iM47948 != -1 && iM47948 != c && (z || !m47946(iM47948))) {
            iM47948 = m47948();
        }
        return str.substring(i2, this.f66740);
    }

    /* JADX INFO: renamed from: ۜ */
    public final EnumC9273 m47953() {
        if (m47955()) {
            return null;
        }
        int i = this.f66740;
        String str = this.f66737;
        if (str.charAt(i) == '%') {
            this.f66740++;
            return EnumC9273.percent;
        }
        int i2 = this.f66740;
        if (i2 > this.f66738 - 2) {
            return null;
        }
        try {
            EnumC9273 enumC9273ValueOf = EnumC9273.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
            this.f66740 += 2;
            return enumC9273ValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m47956() {
        if (m47955()) {
            return null;
        }
        int i = this.f66740;
        String str = this.f66737;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iM47948 = m47948();
        while (iM47948 != -1 && iM47948 != cCharAt) {
            iM47948 = m47948();
        }
        if (iM47948 == -1) {
            this.f66740 = i;
            return null;
        }
        int i2 = this.f66740;
        this.f66740 = i2 + 1;
        return str.substring(i + 1, i2);
    }
}
