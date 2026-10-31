package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14714 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f44933;

    static {
        m35013();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m35011() {
        return !f44933.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35010(C12392 c12392) {
        String string = ApplicationC20075.f65008.getString("stid", null);
        if (!TextUtils.isEmpty(string)) {
            for (InterfaceC16831 interfaceC16831 : f44933) {
                if (interfaceC16831.mo39604().equals(string)) {
                    if (interfaceC16831.mo39606(c12392)) {
                        return;
                    }
                    f44933 = m35012();
                    return;
                }
            }
        }
        if (f44933.isEmpty() || ((InterfaceC16831) f44933.get(0)).mo39606(c12392)) {
            return;
        }
        f44933 = m35012();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m35009() {
        return f44933;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m35013() {
        f44933 = m35012();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35012() {
        PackageManager packageManager;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new C18243(C4925.m14320()));
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            PackageManager packageManagerM14320 = C4925.m14320();
            Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
            intent.setType("text/plain");
            List<ResolveInfo> listQueryIntentActivities = packageManagerM14320.queryIntentActivities(intent, 65536);
            int size = arrayList.size();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(packageManagerM14320);
                if (charSequenceLoadLabel != null) {
                    String string = charSequenceLoadLabel.toString();
                    String str = resolveInfo.activityInfo.name;
                    if (string.equalsIgnoreCase("Translate") || string.equalsIgnoreCase("翻译") || string.equalsIgnoreCase("翻譯") || string.equalsIgnoreCase("Перевести") || string.equalsIgnoreCase("Перакласці") || string.equalsIgnoreCase("Tərcümə etmək") || string.equalsIgnoreCase("Traducir") || string.equalsIgnoreCase("Menerjemahkan") || string.equalsIgnoreCase("Çevir")) {
                        packageManager = packageManagerM14320;
                        arrayList.add(size, new C17537(resolveInfo));
                        size++;
                    } else {
                        if (str.contains("Translate")) {
                            packageManager = packageManagerM14320;
                        } else {
                            packageManager = packageManagerM14320;
                            if (str.contains("Translation") || str.contains("Translator") || str.contains(".translate.") || C9679.m24616((CharSequence) string, (CharSequence) "Translate") || C9679.m24616((CharSequence) string, (CharSequence) "翻译") || C9679.m24616((CharSequence) string, (CharSequence) "翻譯") || C9679.m24616((CharSequence) string, (CharSequence) "Перевести") || C9679.m24616((CharSequence) string, (CharSequence) "Перакласці") || C9679.m24616((CharSequence) string, (CharSequence) "Tərcümə etmək") || C9679.m24616((CharSequence) string, (CharSequence) "Traducir") || C9679.m24616((CharSequence) string, (CharSequence) "Menerjemahkan") || C9679.m24616((CharSequence) string, (CharSequence) "Çevir")) {
                            }
                        }
                        arrayList.add(new C17537(resolveInfo));
                    }
                } else {
                    packageManager = packageManagerM14320;
                }
                packageManagerM14320 = packageManager;
            }
        }
        return arrayList;
    }
}
