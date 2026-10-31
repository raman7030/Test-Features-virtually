package l;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29255 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29257 = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29256 = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24596(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f29256.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24597(String str, String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                C19956.m46033("Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f29257.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j3 = (j2 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            C19956.m46037("Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j3);
        } catch (NumberFormatException unused2) {
            C19956.m46033("Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }
}
