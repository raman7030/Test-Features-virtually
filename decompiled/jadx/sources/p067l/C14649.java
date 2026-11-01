package p067l;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.۬ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8Y5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14649 extends AbstractC24037 {

    /* JADX INFO: renamed from: ֫ */
    public final C13979 f41834;

    public C14649(C13979 c13979) {
        this.f41834 = c13979;
    }

    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8183() {
        return Collections.singleton("img");
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14649 m33518() {
        return new C14649(new C13979(AbstractC4787.m10089()));
    }

    @Override // p067l.AbstractC24037
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8182(C20408 c20408, InterfaceC15712 interfaceC15712, InterfaceC16855 interfaceC16855) {
        InterfaceC3881 interfaceC3881Mo23970;
        String str = (String) interfaceC16855.attributes().get("src");
        if (TextUtils.isEmpty(str) || (interfaceC3881Mo23970 = c20408.m46079().mo23970(C10603.class)) == null) {
            return null;
        }
        c20408.m46076().getClass();
        C23524 c23524M31771 = this.f41834.m31771(interfaceC16855.attributes());
        AbstractC16817.f49560.m31139(interfaceC15712, str);
        AbstractC16817.f49561.m31139(interfaceC15712, c23524M31771);
        AbstractC16817.f49562.m31139(interfaceC15712, Boolean.FALSE);
        return interfaceC3881Mo23970.mo7539(c20408, interfaceC15712);
    }
}
