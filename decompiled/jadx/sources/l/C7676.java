package l;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۟᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7676 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f23716 = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m20561(C17714 c17714) {
        int iM41485 = c17714.m41485();
        if (m20560(c17714)) {
            return;
        }
        c17714.m41484(iM41485);
        throw C9080.m23440("Expected WEBVTT. Got " + c17714.m41474(StandardCharsets.UTF_8), (Throwable) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20560(C17714 c17714) {
        c17714.getClass();
        String strM41474 = c17714.m41474(StandardCharsets.UTF_8);
        return strM41474 != null && strM41474.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m20559(String str) {
        String str2 = C3603.f11424;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() == 3) {
                j2 += Long.parseLong(strTrim);
            } else {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m20557(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Matcher m20558(C17714 c17714) {
        String strM41474;
        while (true) {
            String strM41475 = c17714.m41474(StandardCharsets.UTF_8);
            if (strM41475 == null) {
                return null;
            }
            if (f23716.matcher(strM41475).matches()) {
                do {
                    strM41474 = c17714.m41474(StandardCharsets.UTF_8);
                    if (strM41474 == null) {
                        break;
                    }
                } while (!strM41474.isEmpty());
            } else {
                Matcher matcher = C23198.f74573.matcher(strM41475);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
