package p067l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۗۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5262 extends AbstractC24037 {
    @Override // p067l.AbstractC24037
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8182(C20408 c20408, InterfaceC15712 interfaceC15712, InterfaceC16855 interfaceC16855) {
        int i;
        InterfaceC3881 interfaceC3881Mo23970 = c20408.m46079().mo23970(C8591.class);
        if (interfaceC3881Mo23970 == null) {
            return null;
        }
        try {
            i = Integer.parseInt(interfaceC16855.name().substring(1));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i < 1 || i > 6) {
            return null;
        }
        AbstractC6564.f16937.m31139(interfaceC15712, Integer.valueOf(i));
        return interfaceC3881Mo23970.mo7539(c20408, interfaceC15712);
    }

    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8183() {
        return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
    }
}
