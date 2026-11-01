package p067l;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܰܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4F7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15545 {

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f44415 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f44416 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: ֫ */
    public final String f44417;

    /* JADX INFO: renamed from: ۧ */
    public final String f44418;

    /* JADX INFO: renamed from: ܽ */
    public final String f44419;

    public C15545(String str, String str2, String str3) {
        this.f44418 = str;
        this.f44419 = str2;
        this.f44417 = str3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15545 m35336(String str) {
        Matcher matcher = f44415.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f44416.matcher(str);
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
                    strGroup3 = C17073.m38720(1, 1, strGroup3);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    StringBuilder sbM12525 = C5633.m12525("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \"");
                    sbM12525.append(str);
                    sbM12525.append('\"');
                    throw new IllegalArgumentException(sbM12525.toString());
                }
                str2 = strGroup3;
            }
        }
        return new C15545(str, lowerCase, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m35337() {
        return this.f44419;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Charset m35338(Charset charset) {
        try {
            String str = this.f44417;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String toString() {
        return this.f44418;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15545) && ((C15545) obj).f44418.equals(this.f44418);
    }

    public final int hashCode() {
        return this.f44418.hashCode();
    }
}
