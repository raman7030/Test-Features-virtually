package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܺ۫ */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes4.dex */
public final class C1632 {

    /* JADX INFO: renamed from: ֫ */
    public static final Locale[] f52331 = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39873(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f52331;
            for (Locale locale3 : localeArr) {
                if (!locale3.equals(locale)) {
                }
            }
            for (Locale locale4 : localeArr) {
                if (!locale4.equals(locale2)) {
                }
            }
            String strM4187 = C0859.m4187(locale);
            if (strM4187.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            } else {
                return strM4187.equals(C0859.m4187(locale2));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Locale m39872(String str) {
        return Locale.forLanguageTag(str);
    }
}
