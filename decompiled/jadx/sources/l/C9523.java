package l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import bin.mt.plus.R;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XALX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9523 implements InterfaceC18882 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Locale f28917;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m24408(String str) {
        if (str == null) {
            return null;
        }
        return C15472.m36561(1, 1, str);
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public int mo6409(long j) {
        return 0;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public void mo6411() {
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ܿ */
    public boolean mo6412() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m24406(String str) {
        int iLastIndexOf;
        if (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
            if (str.endsWith("/")) {
                return str;
            }
        }
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24390(int i) {
        return new String(new char[]{'0', 'x', "0123456789abcdef".charAt((i >>> 28) & 15), "0123456789abcdef".charAt((i >>> 24) & 15), "0123456789abcdef".charAt((i >>> 20) & 15), "0123456789abcdef".charAt((i >>> 16) & 15), "0123456789abcdef".charAt((i >>> 12) & 15), "0123456789abcdef".charAt((i >>> 8) & 15), "0123456789abcdef".charAt((i >>> 4) & 15), "0123456789abcdef".charAt(i & 15)});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24393(String str, String str2) {
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        if (str.isEmpty()) {
            return str2;
        }
        if (str.endsWith("/")) {
            return C16014.m37867(str, str2);
        }
        return str + '/' + str2;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public int mo6410(C3002 c3002, C21843 c21843, int i) {
        c21843.m12693(4);
        return -4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24401(StringBuilder sb, int i) {
        if (i < 0 || i >= 1000) {
            sb.append(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i)));
            return;
        }
        sb.append((i / 100) % 10);
        sb.append((i / 10) % 10);
        sb.append(i % 10);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24392(String str) {
        if (str.equals("/")) {
            return C4925.m14327(R.string.MT_Protector);
        }
        if (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        String strM14289 = C4918.m14289(str);
        return strM14289 == null ? m24404(str) : strM14289;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24404(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24402(ActivityC10176 activityC10176, String str) {
        Locale localeM24395 = m24395((Context) activityC10176, str);
        m24398((ContextWrapper) activityC10176, str);
        m24399(activityC10176, localeM24395);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24391(Context context) {
        SharedPreferences sharedPreferencesM41265 = ApplicationC20075.f65010;
        if (sharedPreferencesM41265 == null && context != null) {
            sharedPreferencesM41265 = C17638.m41265(context);
        }
        return sharedPreferencesM41265 == null ? "auto" : sharedPreferencesM41265.getString("custom_language", "auto");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Locale m24394(Application application) {
        return m24395((Context) application, (String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24397(ContextWrapper contextWrapper) {
        m24399(contextWrapper, m24395((Context) contextWrapper, (String) null));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24405() {
        return m24395((Context) null, (String) null).getLanguage().equals("zh");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m24407() {
        Locale localeM24395 = m24395((Context) null, (String) null);
        return localeM24395.getLanguage().equals("zh") && localeM24395.getCountry().equals("CN");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Locale m24396(Resources resources) {
        Locale localeM11977 = C20865.m47679(resources.getConfiguration()).m11977(0);
        if (localeM11977 != null) {
            return localeM11977;
        }
        Locale locale = resources.getConfiguration().locale;
        return locale != null ? locale : Locale.getDefault();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Context m24403(Context context) {
        if (f28917 == null) {
            f28917 = m24396(Resources.getSystem());
        }
        Locale localeM24395 = m24395(context, (String) null);
        if (C11003.equals(localeM24395, m24396(context.getResources()))) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeM24395);
        configuration.setLayoutDirection(localeM24395);
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m24409() {
        Locale localeM24396 = m24396(Resources.getSystem());
        if (localeM24396 != null) {
            f28917 = localeM24396;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24399(ContextWrapper contextWrapper, Locale locale) {
        m24400(contextWrapper.getResources(), locale);
        Resources resources = contextWrapper.getResources();
        try {
            Resources resourcesM14338 = C4925.m14338();
            if (resourcesM14338 != resources) {
                m24400(resourcesM14338, locale);
            }
        } catch (Throwable unused) {
        }
        C18237.m42477(locale);
        C15297.m36317(locale.getLanguage());
        C15297.m36314(locale.getCountry());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24400(Resources resources, Locale locale) {
        if (C11003.equals(locale, m24396(resources))) {
            return;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Locale m24395(Context context, String str) {
        if (str == null) {
            str = m24391(context);
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
                Locale locale = f28917;
                return locale != null ? locale : Locale.getDefault();
            default:
                throw new IllegalArgumentException("Unknown language name: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24398(ContextWrapper contextWrapper, String str) {
        C3931 c3931M11975;
        if (str == null) {
            str = m24391((Context) contextWrapper);
        }
        if ("auto".equals(str)) {
            c3931M11975 = C3931.m11976();
        } else {
            c3931M11975 = C3931.m11975(m24395((Context) contextWrapper, str));
        }
        if (C11003.equals(c3931M11975.m11980(), AbstractC13246.m32147().m11980())) {
            return;
        }
        AbstractC13246.m32138(c3931M11975);
    }
}
