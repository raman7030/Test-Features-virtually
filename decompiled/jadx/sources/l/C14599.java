package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.o;
import com.tencent.connect.common.AssistActivity;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ܳܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14599 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f44687;

    public C14599(AssistActivity assistActivity) {
        this.f44687 = assistActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = "#";
        Intent intent2 = new Intent();
        String stringExtra = intent.getStringExtra("key_action");
        AssistActivity assistActivity = this.f44687;
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C9145.m23518(assistActivity.f892, "QQStayReceiver action: ".concat(stringExtra));
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
            for (String str2 : string.substring(string.indexOf(str) + 1).split(a.p)) {
                String[] strArrSplit = str2.split("=");
                intent2.putExtra(strArrSplit[0], strArrSplit[1]);
            }
            intent2.setData(uri);
        } catch (Exception e) {
            C9145.m23518(assistActivity.f892, "QQStayReceiver parse uri error : " + e.getMessage());
            intent2.putExtra(o.c, d.O);
            intent2.putExtra("response", "parse error.");
        }
        assistActivity.setResult(-1, intent2);
    }
}
