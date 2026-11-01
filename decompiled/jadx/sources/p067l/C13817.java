package p067l;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N8XS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13817 {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f39045 = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f39046 = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: ܽ */
    public static final C19965 f39047;

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f39048;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f39048 = Pattern.compile("[ \t\r\n]+");
        f39047 = new C19965();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m31480(String str) {
        String str2;
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '<') {
                if (cCharAt == '>') {
                    str2 = "&gt;";
                } else if (sb != null) {
                    sb.append(cCharAt);
                }
            } else {
                str2 = "&lt;";
            }
            if (sb == null) {
                sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i);
            }
            sb.append(str2);
        }
        return sb != null ? sb.toString() : str;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m31482(String str) {
        if (!f39045.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f39046.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f39047.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb.append(C11806.m27055(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m31481(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f39048.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }
}
