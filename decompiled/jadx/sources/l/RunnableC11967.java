package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11967 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f35834;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f35835;

    public RunnableC11967(C23255 c23255, HashMap map) {
        this.f35835 = c23255;
        this.f35834 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23255 c23255 = this.f35835;
        try {
            InterfaceC4722 interfaceC4722M46492 = C20245.m46489().m46492(this.f35834, "https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf");
            String strA = interfaceC4722M46492.a();
            C9145.m23518("openSDK_LOG.OpenConfig", "update: get config statusCode " + interfaceC4722M46492.d());
            C23255.m51572(c23255, C18338.m42748(strA));
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.OpenConfig", "get config error ", e);
        }
        c23255.f74699 = 0;
    }
}
