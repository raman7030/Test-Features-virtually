package l;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.connect.common.AssistActivity;
import com.tencent.tauth.AuthActivity;

/* JADX INFO: renamed from: l.ܺ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16220 implements InterfaceC0698 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AuthActivity f49941;

    public C16220(AuthActivity authActivity) {
        this.f49941 = authActivity;
    }

    @Override // l.InterfaceC0698
    /* JADX INFO: renamed from: ֫ */
    public final void mo2785(Intent intent, Bundle bundle) {
        C9145.m23518("openSDK_LOG.AuthActivity", "-->handleActionUri--common channel. ");
        AuthActivity authActivity = this.f49941;
        Intent intent2 = new Intent(authActivity, (Class<?>) AssistActivity.class);
        intent2.putExtras(bundle);
        intent2.putExtra("key_request_code", 10114);
        intent2.setFlags(603979776);
        authActivity.startActivity(intent2);
    }
}
