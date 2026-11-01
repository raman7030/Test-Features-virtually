package p067l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۢ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11140 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ᩶ */
    public String f30881;

    /* JADX INFO: renamed from: ᩸ */
    public String f30882;

    /* JADX INFO: renamed from: ᩹ */
    public C17173 f30883;

    /* JADX INFO: renamed from: ۙ */
    public static final String[] f30877 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", AnnotationHandler.REQUIRED, "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: ۤ */
    public static final Pattern f30878 = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* JADX INFO: renamed from: ۫ */
    public static final Pattern f30879 = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* JADX INFO: renamed from: ۬ */
    public static final Pattern f30880 = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: ۗ */
    public static final Pattern f30876 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    public C11140(String str, String str2, C17173 c17173) {
        C18515.m42065((Object) str);
        String strTrim = str.trim();
        C18515.m42066(strTrim);
        this.f30882 = strTrim;
        this.f30881 = str2;
        this.f30883 = c17173;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30882;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f30882;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.f30881;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final String setValue(String str) {
        String str2;
        int iM38897;
        String str3 = this.f30881;
        C17173 c17173 = this.f30883;
        if (c17173 != null && (iM38897 = c17173.m38897((str2 = this.f30882))) != -1) {
            str3 = this.f30883.get(str2);
            this.f30883.f51127[iM38897] = str;
        }
        this.f30881 = str;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder sbM49323 = C21869.m49323();
        try {
            C2421 c2421M5236 = new C3092("").m5236();
            String str = this.f30882;
            String str2 = this.f30881;
            String strM25667 = m25667(str, c2421M5236.m3379());
            if (strM25667 != null) {
                m25668(strM25667, str2, sbM49323, c2421M5236);
            }
            return C21869.m49321(sbM49323);
        } catch (IOException e) {
            throw new C3763(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25668(String str, String str2, Appendable appendable, C2421 c2421) throws IOException {
        appendable.append(str);
        if (c2421.m3379() == EnumC20528.html) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f30877, C24550.m54147(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        C14492.m33143(appendable, str2, c2421, true, false, false, false);
        appendable.append('\"');
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25667(String str, EnumC20528 enumC20528) {
        if (enumC20528 == EnumC20528.xml) {
            Pattern pattern = f30878;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f30879.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (enumC20528 == EnumC20528.html) {
            Pattern pattern2 = f30880;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = f30876.matcher(str).replaceAll("");
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11140.class == obj.getClass()) {
            C11140 c11140 = (C11140) obj;
            String str = c11140.f30882;
            String str2 = this.f30882;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f30881;
            String str4 = c11140.f30881;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f30882;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30881;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C11140) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
