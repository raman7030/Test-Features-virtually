package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13742 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ HashMap f38844;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C24470 f38845;

    public RunnableC13742(C24470 c24470, HashMap map) {
        this.f38845 = c24470;
        this.f38844 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C24470 c24470 = this.f38845;
        try {
            InterfaceC6856 interfaceC6856M48813 = C21609.m48810().m48813(this.f38844, "https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf");
            String strMo15698a = interfaceC6856M48813.mo15698a();
            C11060.m25469("openSDK_LOG.OpenConfig", "update: get config statusCode " + interfaceC6856M48813.mo15701d());
            C24470.m53968(c24470, C19797.m45010(strMo15698a));
        } catch (Exception e) {
            C11060.m25465("openSDK_LOG.OpenConfig", "get config error ", e);
        }
        c24470.f77442 = 0;
    }
}
