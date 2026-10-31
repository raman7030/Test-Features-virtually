package l;

import android.content.Context;
import android.webkit.CookieSyncManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0989 extends C2816 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8045 f3690;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4227 f3691;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f3692;

    public C0989(C8045 c8045, Context context, InterfaceC4227 interfaceC4227) {
        this.f3690 = c8045;
        this.f3692 = context;
        this.f3691 = interfaceC4227;
        C9145.m23513("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3455(JSONObject jSONObject) {
        C8045 c8045 = this.f3690;
        C9145.m23513("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            Context context = this.f3692;
            if (string != null) {
                C21451 unused = c8045.f76946;
                if (string3 != null) {
                    c8045.f76946.m48594(string, string2);
                    c8045.f76946.m48593(string3);
                    C8751.m22651(context, c8045.f76946);
                }
            }
            String string4 = jSONObject.getString("pf");
            if (string4 != null) {
                try {
                    context.getSharedPreferences("pfStore", 0).edit().putString("pf", string4).commit();
                } catch (Exception e) {
                    C9145.m23514("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e);
                }
            }
            CookieSyncManager.getInstance().sync();
        } catch (JSONException e2) {
            C9145.m23514("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e2);
        }
        this.f3691.mo3455(jSONObject);
        c8045.m21378();
        C9145.m23515();
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3454(C19750 c19750) {
        C9145.m23513("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
        this.f3691.mo3454(c19750);
        C9145.m23515();
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3453() {
        C9145.m23513("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
        this.f3691.mo3453();
        C9145.m23515();
    }
}
