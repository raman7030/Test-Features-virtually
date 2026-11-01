package p067l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.open.TDialog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩵ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC20939 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ TDialog f65738;

    /* JADX INFO: renamed from: ۧ */
    public C20268 f65739;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC20939(TDialog tDialog, C20268 c20268, Looper looper) {
        super(looper);
        this.f65738 = tDialog;
        this.f65739 = c20268;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C11060.m25464("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
        int i = message.what;
        C20268 c20268 = this.f65739;
        if (i == 1) {
            String str = (String) message.obj;
            c20268.getClass();
            try {
                c20268.mo5758(C19797.m45010(str));
                return;
            } catch (JSONException unused) {
                c20268.mo5757(new C21139(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c20268.mo5756();
            return;
        }
        TDialog tDialog = this.f65738;
        if (i != 3) {
            if (i != 5 || tDialog.f2138 == null || tDialog.f2138.get() == null) {
                return;
            }
            TDialog.m2036((Context) tDialog.f2138.get(), (String) message.obj);
            return;
        }
        if (tDialog.f2138 == null || tDialog.f2138.get() == null) {
            return;
        }
        Context context = (Context) tDialog.f2138.get();
        try {
            JSONObject jSONObjectM45010 = C19797.m45010((String) message.obj);
            int i2 = jSONObjectM45010.getInt("type");
            String string = jSONObjectM45010.getString("msg");
            if (i2 == 0) {
                Toast toast = TDialog.f2131;
                if (toast == null) {
                    TDialog.f2131 = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    TDialog.f2131.setText(string);
                    TDialog.f2131.setDuration(0);
                }
                TDialog.f2131.show();
                return;
            }
            if (i2 == 1) {
                Toast toast2 = TDialog.f2131;
                if (toast2 == null) {
                    TDialog.f2131 = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    TDialog.f2131.setText(string);
                    TDialog.f2131.setDuration(1);
                }
                TDialog.f2131.show();
            }
        } catch (JSONException unused2) {
        }
    }
}
