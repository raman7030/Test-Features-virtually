package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܶۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AL4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14981 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f45657;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 f45658;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f45659;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String f45660;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f45661;

    static {
        m35471();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m35468() {
        return f45658;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m35467() {
        return f45660;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m35470() {
        return f45659;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35465(String str, String str2) {
        return !TextUtils.isEmpty(f45660) && str.equals(f45660) && str2.equals(f45659);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35464() {
        return TextUtils.isEmpty(f45660);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35466() {
        return f45657;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m35469() {
        return f45661;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35463(String str, String str2, String str3, String str4, String str5) {
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        if (abstractC15440M39866.mo23113()) {
            f45658 = abstractC15440M39866;
        } else {
            f45658 = C16293.f50120;
        }
        f45660 = str2;
        f45659 = str3;
        try {
            Charset.forName(str4);
            f45657 = str4;
        } catch (Exception unused) {
            f45657 = a.D;
        }
        Integer numM48346 = C21311.m48346(str5);
        if (numM48346 != null) {
            f45661 = numM48346.intValue();
        }
        ApplicationC20075.f65008.edit().putString("rmp", f45658.mo23554()).putString("rmun", f45660).putString("rmpw", f45659).putString("rmcs", f45657).mo25853(f45661, "rmpt").apply();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m35471() {
        String string = ApplicationC20075.f65008.getString("rmp", null);
        if (TextUtils.isEmpty(string)) {
            f45658 = C16293.f50120;
        } else {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(string, new String[0]);
            if (abstractC15440M39866.mo23113()) {
                f45658 = abstractC15440M39866;
            } else {
                f45658 = C16293.f50120;
            }
        }
        f45660 = ApplicationC20075.f65008.getString("rmun", "");
        f45659 = ApplicationC20075.f65008.getString("rmpw", "");
        f45657 = ApplicationC20075.f65008.getString("rmcs", a.D);
        int i = ApplicationC20075.f65008.getInt("rmpt", 2121);
        f45661 = C21311.m48347(i) ? i : 2121;
    }
}
