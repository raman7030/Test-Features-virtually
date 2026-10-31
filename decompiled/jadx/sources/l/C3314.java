package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3314 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10381 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f10382 = Pattern.compile(".*");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m10127(String str) {
        if (str.equals("*")) {
            return ".*";
        }
        String strReplace = str.replace(".", "\\.");
        if (!strReplace.endsWith("*")) {
            return strReplace;
        }
        return strReplace.substring(0, strReplace.length() - 1) + ".+";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m10126(String str) {
        String strM10127 = m10127(str);
        if (strM10127 == ".*") {
            return f10382;
        }
        return Pattern.compile(strM10127);
    }
}
