package p067l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alipay.sdk.p010m.p037n.C0171b;

/* JADX INFO: renamed from: l.ۢ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8XW */
/* JADX INFO: loaded from: classes3.dex */
public class C11691 implements InterfaceC22420 {
    @Override // p067l.InterfaceC22420
    /* JADX INFO: renamed from: ֫ */
    public void mo26857(View view, String str) {
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme(C0171b.f688a).build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
