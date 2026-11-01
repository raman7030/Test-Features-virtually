package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.tencent.connect.common.AssistActivity;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ܳܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16243 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AssistActivity f47794;

    public C16243(AssistActivity assistActivity) {
        this.f47794 = assistActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = "#";
        Intent intent2 = new Intent();
        String stringExtra = intent.getStringExtra("key_action");
        AssistActivity assistActivity = this.f47794;
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C11060.m25469(assistActivity.f2089, "QQStayReceiver action: ".concat(stringExtra));
            intent2.putExtra("key_action", stringExtra);
        } else {
            intent2.putExtra("key_action", "action_share");
        }
        try {
            Uri uri = (Uri) intent.getParcelableExtra("uriData");
            String string = uri.toString();
            if (!string.contains("#")) {
                str = "?";
            }
            for (String str2 : string.substring(string.indexOf(str) + 1).split(C0233a.f1084p)) {
                String[] strArrSplit = str2.split("=");
                intent2.putExtra(strArrSplit[0], strArrSplit[1]);
            }
            intent2.setData(uri);
        } catch (Exception e) {
            C11060.m25469(assistActivity.f2089, "QQStayReceiver parse uri error : " + e.getMessage());
            intent2.putExtra(C0252o.f1208c, C0708d.f2599O);
            intent2.putExtra("response", "parse error.");
        }
        assistActivity.setResult(-1, intent2);
    }
}
