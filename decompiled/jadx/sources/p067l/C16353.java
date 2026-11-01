package p067l;

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
public final class C16353 {

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList f48047;

    static {
        m37160();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m37158() {
        return !f48047.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37157(C14146 c14146) {
        String string = ApplicationC21448.f67649.getString("stid", null);
        if (!TextUtils.isEmpty(string)) {
            for (InterfaceC18365 interfaceC18365 : f48047) {
                if (interfaceC18365.mo41840().equals(string)) {
                    if (interfaceC18365.mo41842(c14146)) {
                        return;
                    }
                    f48047 = m37159();
                    return;
                }
            }
        }
        if (f48047.isEmpty() || ((InterfaceC18365) f48047.get(0)).mo41842(c14146)) {
            return;
        }
        f48047 = m37159();
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m37156() {
        return f48047;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m37160() {
        f48047 = m37159();
    }

    /* JADX INFO: renamed from: ܽ */
    public static ArrayList m37159() {
        PackageManager packageManager;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new C19707(C7050.m16217()));
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            PackageManager packageManagerM16217 = C7050.m16217();
            Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
            intent.setType("text/plain");
            List<ResolveInfo> listQueryIntentActivities = packageManagerM16217.queryIntentActivities(intent, 65536);
            int size = arrayList.size();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(packageManagerM16217);
                if (charSequenceLoadLabel != null) {
                    String string = charSequenceLoadLabel.toString();
                    String str = resolveInfo.activityInfo.name;
                    if (string.equalsIgnoreCase("Translate") || string.equalsIgnoreCase("翻译") || string.equalsIgnoreCase("翻譯") || string.equalsIgnoreCase("Перевести") || string.equalsIgnoreCase("Перакласці") || string.equalsIgnoreCase("Tərcümə etmək") || string.equalsIgnoreCase("Traducir") || string.equalsIgnoreCase("Menerjemahkan") || string.equalsIgnoreCase("Çevir")) {
                        packageManager = packageManagerM16217;
                        arrayList.add(size, new C19036(resolveInfo));
                        size++;
                    } else {
                        if (str.contains("Translate")) {
                            packageManager = packageManagerM16217;
                        } else {
                            packageManager = packageManagerM16217;
                            if (str.contains("Translation") || str.contains("Translator") || str.contains(".translate.") || C11567.m26630((CharSequence) string, (CharSequence) "Translate") || C11567.m26630((CharSequence) string, (CharSequence) "翻译") || C11567.m26630((CharSequence) string, (CharSequence) "翻譯") || C11567.m26630((CharSequence) string, (CharSequence) "Перевести") || C11567.m26630((CharSequence) string, (CharSequence) "Перакласці") || C11567.m26630((CharSequence) string, (CharSequence) "Tərcümə etmək") || C11567.m26630((CharSequence) string, (CharSequence) "Traducir") || C11567.m26630((CharSequence) string, (CharSequence) "Menerjemahkan") || C11567.m26630((CharSequence) string, (CharSequence) "Çevir")) {
                            }
                        }
                        arrayList.add(new C19036(resolveInfo));
                    }
                } else {
                    packageManager = packageManagerM16217;
                }
                packageManagerM16217 = packageManager;
            }
        }
        return arrayList;
    }
}
