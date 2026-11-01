package p067l;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۟᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9664 {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f26629 = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: ܽ */
    public static void m22541(C19203 c19203) {
        int iM43731 = c19203.m43731();
        if (m22540(c19203)) {
            return;
        }
        c19203.m43730(iM43731);
        throw C10998.m25387("Expected WEBVTT. Got " + c19203.m43720(StandardCharsets.UTF_8), (Throwable) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m22540(C19203 c19203) {
        c19203.getClass();
        String strM43720 = c19203.m43720(StandardCharsets.UTF_8);
        return strM43720 != null && strM43720.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m22539(String str) {
        String str2 = C5792.f14228;
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

    /* JADX INFO: renamed from: ֫ */
    public static float m22537(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Matcher m22538(C19203 c19203) {
        String strM43720;
        while (true) {
            String strM43721 = c19203.m43720(StandardCharsets.UTF_8);
            if (strM43721 == null) {
                return null;
            }
            if (f26629.matcher(strM43721).matches()) {
                do {
                    strM43720 = c19203.m43720(StandardCharsets.UTF_8);
                    if (strM43720 == null) {
                        break;
                    }
                } while (!strM43720.isEmpty());
            } else {
                Matcher matcher = C24416.f77316.matcher(strM43721);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
