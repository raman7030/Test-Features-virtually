package p067l;

import android.os.Build;
import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21424 {
    /* JADX INFO: renamed from: ֫ */
    public static final void m48553(String str) {
        C21424 c21424 = C14717.f41957;
        if (!C13045.m29864((Object) C14717.f41956, (Object) str) || C14717.f41952.m24761()) {
            C14717.f41956 = str;
            C14717.f41954.mo4062(new AtomicReference(str));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m48554(String str) {
        C13045.m29867(str, "primaryPath");
        if (Build.VERSION.SDK_INT < 33 || !((!C18524.m42129() && (str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb"))) || str.equalsIgnoreCase("Android/data/".concat(C7050.m16234())) || str.equalsIgnoreCase("Android/obb/".concat(C7050.m16234())))) {
            return C14717.f41955.containsKey(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m48555(String str) {
        C13045.m29867(str, C0226b.f1011d);
        if (str.length() > 1 && C5235.m11296(str)) {
            str = str.substring(0, str.length() - 1);
            C13045.m29865(str, "substring(...)");
        }
        C14717.f41953 = str;
    }
}
