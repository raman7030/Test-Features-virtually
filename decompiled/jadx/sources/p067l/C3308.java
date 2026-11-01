package p067l;

import android.content.Context;
import android.webkit.CookieSyncManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3308 extends C5045 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10014 f6465;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6386 f6466;

    /* JADX INFO: renamed from: ܽ */
    public final Context f6467;

    public C3308(C10014 c10014, Context context, InterfaceC6386 interfaceC6386) {
        this.f6465 = c10014;
        this.f6467 = context;
        this.f6466 = interfaceC6386;
        C11060.m25464("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5758(JSONObject jSONObject) {
        C10014 c10014 = this.f6465;
        C11060.m25464("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            Context context = this.f6467;
            if (string != null) {
                C22755 unused = c10014.f79699;
                if (string3 != null) {
                    c10014.f79699.m50931(string, string2);
                    c10014.f79699.m50930(string3);
                    C10685.m24621(context, c10014.f79699);
                }
            }
            String string4 = jSONObject.getString("pf");
            if (string4 != null) {
                try {
                    context.getSharedPreferences("pfStore", 0).edit().putString("pf", string4).commit();
                } catch (Exception e) {
                    C11060.m25465("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e);
                }
            }
            CookieSyncManager.getInstance().sync();
        } catch (JSONException e2) {
            C11060.m25465("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e2);
        }
        this.f6466.mo5758(jSONObject);
        c10014.m23345();
        C11060.m25466();
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5757(C21139 c21139) {
        C11060.m25464("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
        this.f6466.mo5757(c21139);
        C11060.m25466();
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5756() {
        C11060.m25464("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
        this.f6466.mo5756();
        C11060.m25466();
    }
}
