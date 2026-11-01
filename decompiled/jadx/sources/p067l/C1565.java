package p067l;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: l.ܳܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C1565 {
    /* JADX INFO: renamed from: ֫ */
    public static void m36975(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1037 m36974(Configuration configuration) {
        return C1037.m13894(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36976(Configuration configuration, C1037 c1037) {
        configuration.setLocales(LocaleList.forLanguageTags(c1037.m13900()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36977(C1037 c1037) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c1037.m13900()));
    }
}
