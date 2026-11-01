package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18139 {

    /* JADX INFO: renamed from: ֫ */
    public final String f54166;

    /* JADX INFO: renamed from: ۧ */
    public final String f54167;

    /* JADX INFO: renamed from: ܽ */
    public final String f54168;

    public C18139(String str, String str2, String str3) {
        this.f54168 = str2;
        this.f54166 = str;
        this.f54167 = m41318(str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m41318(String str) {
        if (!C5595.m12400(str)) {
            return str;
        }
        String strReplace = str.replace('/', '\\');
        if (strReplace.charAt(0) != '\\') {
            return strReplace;
        }
        if (strReplace.length() > 1 && strReplace.charAt(1) == '\\') {
            return strReplace.substring(2);
        }
        return strReplace.substring(1);
    }

    public C18139(C18139 c18139, String str) {
        this.f54166 = c18139.f54166;
        if (C5595.m12400(c18139.f54168)) {
            this.f54168 = c18139.f54168;
            if (C5595.m12400(c18139.f54167)) {
                this.f54167 = c18139.f54167 + "\\" + m41318(str);
                return;
            }
            this.f54167 = m41318(str);
            return;
        }
        throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m41324() {
        StringBuilder sb = new StringBuilder("\\\\");
        sb.append(this.f54166);
        String str = this.f54168;
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) != '\\') {
                sb.append("\\");
            }
            sb.append(str);
            String str2 = this.f54167;
            if (C5595.m12400(str2)) {
                sb.append("\\");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return m41324();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18139.class == obj.getClass()) {
            C18139 c18139 = (C18139) obj;
            if (C21274.m48064(this.f54166, c18139.f54166) && C21274.m48064(this.f54168, c18139.f54168) && C21274.m48064(this.f54167, c18139.f54167)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54166, this.f54168, this.f54167});
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m41319() {
        return this.f54166;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m41323() {
        return this.f54168;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m41321() {
        return this.f54167;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41320(C18139 c18139) {
        return C21274.m48064(this.f54166, c18139.f54166);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m41322(C18139 c18139) {
        return m41320(c18139) && C21274.m48064(this.f54168, c18139.f54168);
    }
}
