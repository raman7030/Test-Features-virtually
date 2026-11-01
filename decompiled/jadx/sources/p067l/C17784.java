package p067l;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.connect.common.AssistActivity;
import com.tencent.tauth.AuthActivity;

/* JADX INFO: renamed from: l.ܺ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17784 implements InterfaceC3032 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AuthActivity f53111;

    public C17784(AuthActivity authActivity) {
        this.f53111 = authActivity;
    }

    @Override // p067l.InterfaceC3032
    /* JADX INFO: renamed from: ֫ */
    public final void mo5130(Intent intent, Bundle bundle) {
        C11060.m25469("openSDK_LOG.AuthActivity", "-->handleActionUri--common channel. ");
        AuthActivity authActivity = this.f53111;
        Intent intent2 = new Intent(authActivity, (Class<?>) AssistActivity.class);
        intent2.putExtras(bundle);
        intent2.putExtra("key_request_code", 10114);
        intent2.setFlags(603979776);
        authActivity.startActivity(intent2);
    }
}
