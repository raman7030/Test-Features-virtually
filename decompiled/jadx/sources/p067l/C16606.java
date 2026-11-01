package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܶۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AL4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16606 {

    /* JADX INFO: renamed from: ֫ */
    public static String f48770;

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 f48771;

    /* JADX INFO: renamed from: ܽ */
    public static String f48772;

    /* JADX INFO: renamed from: ܿ */
    public static String f48773;

    /* JADX INFO: renamed from: ᩳ */
    public static int f48774;

    static {
        m37627();
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m37624() {
        return f48771;
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m37623() {
        return f48773;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m37626() {
        return f48772;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m37621(String str, String str2) {
        return !TextUtils.isEmpty(f48773) && str.equals(f48773) && str2.equals(f48772);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m37620() {
        return TextUtils.isEmpty(f48773);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m37622() {
        return f48770;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m37625() {
        return f48774;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37619(String str, String str2, String str3, String str4, String str5) {
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        if (abstractC17043M42109.mo25087()) {
            f48771 = abstractC17043M42109;
        } else {
            f48771 = C17853.f53287;
        }
        f48773 = str2;
        f48772 = str3;
        try {
            Charset.forName(str4);
            f48770 = str4;
        } catch (Exception unused) {
            f48770 = C0233a.f1077D;
        }
        Integer numM50681 = C22622.m50681(str5);
        if (numM50681 != null) {
            f48774 = numM50681.intValue();
        }
        ApplicationC21448.f67649.edit().putString("rmp", f48771.mo25505()).putString("rmun", f48773).putString("rmpw", f48772).putString("rmcs", f48770).mo27875(f48774, "rmpt").apply();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m37627() {
        String string = ApplicationC21448.f67649.getString("rmp", null);
        if (TextUtils.isEmpty(string)) {
            f48771 = C17853.f53287;
        } else {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(string, new String[0]);
            if (abstractC17043M42109.mo25087()) {
                f48771 = abstractC17043M42109;
            } else {
                f48771 = C17853.f53287;
            }
        }
        f48773 = ApplicationC21448.f67649.getString("rmun", "");
        f48772 = ApplicationC21448.f67649.getString("rmpw", "");
        f48770 = ApplicationC21448.f67649.getString("rmcs", C0233a.f1077D);
        int i = ApplicationC21448.f67649.getInt("rmpt", 2121);
        f48774 = C22622.m50682(i) ? i : 2121;
    }
}
