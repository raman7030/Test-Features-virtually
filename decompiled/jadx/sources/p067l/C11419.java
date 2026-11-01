package p067l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import bin.p000mt.plus.R;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XALX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11419 implements InterfaceC20314 {

    /* JADX INFO: renamed from: ֫ */
    public static Locale f31864;

    /* JADX INFO: renamed from: ᩳ */
    public static String m26418(String str) {
        if (str == null) {
            return null;
        }
        return C17073.m38720(1, 1, str);
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public int mo8566(long j) {
        return 0;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public void mo8568() {
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ܿ */
    public boolean mo8569() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m26416(String str) {
        int iLastIndexOf;
        if (str.length() > 1 && str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
            if (str.endsWith("/")) {
                return str;
            }
        }
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26400(int i) {
        return new String(new char[]{'0', 'x', "0123456789abcdef".charAt((i >>> 28) & 15), "0123456789abcdef".charAt((i >>> 24) & 15), "0123456789abcdef".charAt((i >>> 20) & 15), "0123456789abcdef".charAt((i >>> 16) & 15), "0123456789abcdef".charAt((i >>> 12) & 15), "0123456789abcdef".charAt((i >>> 8) & 15), "0123456789abcdef".charAt((i >>> 4) & 15), "0123456789abcdef".charAt(i & 15)});
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26403(String str, String str2) {
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        if (str.isEmpty()) {
            return str2;
        }
        if (str.endsWith("/")) {
            return C17588.m40053(str, str2);
        }
        return str + '/' + str2;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public int mo8567(C5221 c5221, C23128 c23128, int i) {
        c23128.m14569(4);
        return -4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26411(StringBuilder sb, int i) {
        if (i < 0 || i >= 1000) {
            sb.append(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i)));
            return;
        }
        sb.append((i / 100) % 10);
        sb.append((i / 10) % 10);
        sb.append(i % 10);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26402(String str) {
        if (str.equals("/")) {
            return C7050.m16224(R.string.MT_Protector);
        }
        if (str.length() > 1 && str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        String strM16186 = C7043.m16186(str);
        return strM16186 == null ? m26414(str) : strM16186;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m26414(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26412(ActivityC12040 activityC12040, String str) {
        Locale localeM26405 = m26405((Context) activityC12040, str);
        m26408((ContextWrapper) activityC12040, str);
        m26409(activityC12040, localeM26405);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26401(Context context) {
        SharedPreferences sharedPreferencesM43511 = ApplicationC21448.f67650;
        if (sharedPreferencesM43511 == null && context != null) {
            sharedPreferencesM43511 = C19132.m43511(context);
        }
        return sharedPreferencesM43511 == null ? "auto" : sharedPreferencesM43511.getString("custom_language", "auto");
    }

    /* JADX INFO: renamed from: ֫ */
    public static Locale m26404(Application application) {
        return m26405((Context) application, (String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26407(ContextWrapper contextWrapper) {
        m26409(contextWrapper, m26405((Context) contextWrapper, (String) null));
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m26415() {
        return m26405((Context) null, (String) null).getLanguage().equals("zh");
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m26417() {
        Locale localeM26405 = m26405((Context) null, (String) null);
        return localeM26405.getLanguage().equals("zh") && localeM26405.getCountry().equals("CN");
    }

    /* JADX INFO: renamed from: ֫ */
    public static Locale m26406(Resources resources) {
        Locale localeM13897 = C1877.m50008(resources.getConfiguration()).m13897(0);
        if (localeM13897 != null) {
            return localeM13897;
        }
        Locale locale = resources.getConfiguration().locale;
        return locale != null ? locale : Locale.getDefault();
    }

    /* JADX INFO: renamed from: ۧ */
    public static Context m26413(Context context) {
        if (f31864 == null) {
            f31864 = m26406(Resources.getSystem());
        }
        Locale localeM26405 = m26405(context, (String) null);
        if (C12826.equals(localeM26405, m26406(context.getResources()))) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeM26405);
        configuration.setLayoutDirection(localeM26405);
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m26419() {
        Locale localeM26406 = m26406(Resources.getSystem());
        if (localeM26406 != null) {
            f31864 = localeM26406;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26409(ContextWrapper contextWrapper, Locale locale) {
        m26410(contextWrapper.getResources(), locale);
        Resources resources = contextWrapper.getResources();
        try {
            Resources resourcesM16235 = C7050.m16235();
            if (resourcesM16235 != resources) {
                m26410(resourcesM16235, locale);
            }
        } catch (Throwable unused) {
        }
        C19701.m44736(locale);
        C16907.m38478(locale.getLanguage());
        C16907.m38475(locale.getCountry());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26410(Resources resources, Locale locale) {
        if (C12826.equals(locale, m26406(resources))) {
            return;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    /* JADX INFO: renamed from: ֫ */
    public static Locale m26405(Context context, String str) {
        if (str == null) {
            str = m26401(context);
        }
        str.getClass();
        switch (str) {
            case "zh-rCN":
                return Locale.SIMPLIFIED_CHINESE;
            case "zh-rTW":
                return Locale.TRADITIONAL_CHINESE;
            case "az":
            case "be":
            case "es":
            case "in":
            case "it":
            case "ru":
            case "tr":
            case "uk":
                return new Locale(str);
            case "en":
                return Locale.ENGLISH;
            case "auto":
                Locale locale = f31864;
                return locale != null ? locale : Locale.getDefault();
            default:
                throw new IllegalArgumentException("Unknown language name: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26408(ContextWrapper contextWrapper, String str) {
        C1037 c1037M13895;
        if (str == null) {
            str = m26401((Context) contextWrapper);
        }
        if ("auto".equals(str)) {
            c1037M13895 = C1037.m13896();
        } else {
            c1037M13895 = C1037.m13895(m26405((Context) contextWrapper, str));
        }
        if (C12826.equals(c1037M13895.m13900(), AbstractC1499.m34246().m13900())) {
            return;
        }
        AbstractC1499.m34237(c1037M13895);
    }
}
