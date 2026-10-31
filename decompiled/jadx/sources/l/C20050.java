package l;

import android.os.Build;
import com.alipay.sdk.m.u0.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20050 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m46237(String str) {
        C20050 c20050 = C12993.f38911;
        if (!C11233.m27802((Object) C12993.f38910, (Object) str) || C12993.f38906.m22791()) {
            C12993.f38910 = str;
            C12993.f38908.mo1664(new AtomicReference(str));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46238(String str) {
        C11233.m27805(str, "primaryPath");
        if (Build.VERSION.SDK_INT < 33 || !((!C16999.m39886() && (str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb"))) || str.equalsIgnoreCase("Android/data/".concat(C4925.m14337())) || str.equalsIgnoreCase("Android/obb/".concat(C4925.m14337())))) {
            return C12993.f38909.containsKey(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46239(String str) {
        C11233.m27805(str, b.d);
        if (str.length() > 1 && C3016.m9238(str)) {
            str = str.substring(0, str.length() - 1);
            C11233.m27803(str, "substring(...)");
        }
        C12993.f38907 = str;
    }
}
