package p067l;

import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۤۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11968 extends AbstractC24037 {
    @Override // p067l.AbstractC24037
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8182(C20408 c20408, InterfaceC15712 interfaceC15712, InterfaceC16855 interfaceC16855) {
        InterfaceC3881 interfaceC3881Mo23970;
        String str = (String) interfaceC16855.attributes().get("href");
        if (TextUtils.isEmpty(str) || (interfaceC3881Mo23970 = c20408.m46079().mo23970(C4568.class)) == null) {
            return null;
        }
        AbstractC6564.f16939.m31139(interfaceC15712, str);
        return interfaceC3881Mo23970.mo7539(c20408, interfaceC15712);
    }

    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8183() {
        return Collections.singleton(C0655am.f2320av);
    }
}
