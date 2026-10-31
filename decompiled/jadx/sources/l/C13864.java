package l;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܰܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4F7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13864 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f41334 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f41335 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f41336;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f41337;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f41338;

    public C13864(String str, String str2, String str3) {
        this.f41337 = str;
        this.f41338 = str2;
        this.f41336 = str3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13864 m33217(String str) {
        Matcher matcher = f41334.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f41335.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = C15472.m36561(1, 1, strGroup3);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    StringBuilder sbM10501 = C3435.m10501("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \"");
                    sbM10501.append(str);
                    sbM10501.append('\"');
                    throw new IllegalArgumentException(sbM10501.toString());
                }
                str2 = strGroup3;
            }
        }
        return new C13864(str, lowerCase, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m33218() {
        return this.f41338;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Charset m33219(Charset charset) {
        try {
            String str = this.f41336;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String toString() {
        return this.f41337;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13864) && ((C13864) obj).f41337.equals(this.f41337);
    }

    public final int hashCode() {
        return this.f41337.hashCode();
    }
}
