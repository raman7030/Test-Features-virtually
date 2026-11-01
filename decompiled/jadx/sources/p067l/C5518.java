package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5518 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f13190 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f13191 = Pattern.compile(".*");

    /* JADX INFO: renamed from: ۧ */
    public static String m12163(String str) {
        if (str.equals("*")) {
            return ".*";
        }
        String strReplace = str.replace(".", "\\.");
        if (!strReplace.endsWith("*")) {
            return strReplace;
        }
        return strReplace.substring(0, strReplace.length() - 1) + ".+";
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pattern m12162(String str) {
        String strM12163 = m12163(str);
        if (strM12163 == ".*") {
            return f13191;
        }
        return Pattern.compile(strM12163);
    }
}
