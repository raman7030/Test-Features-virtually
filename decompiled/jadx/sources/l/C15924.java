package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15924 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Locale[] f49184 = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37698(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f49184;
            for (Locale locale3 : localeArr) {
                if (!locale3.equals(locale)) {
                }
            }
            for (Locale locale4 : localeArr) {
                if (!locale4.equals(locale2)) {
                }
            }
            String strM1788 = C0341.m1788(locale);
            if (strM1788.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            } else {
                return strM1788.equals(C0341.m1788(locale2));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Locale m37697(String str) {
        return Locale.forLanguageTag(str);
    }
}
