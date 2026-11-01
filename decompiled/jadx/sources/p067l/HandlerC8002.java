package p067l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.connect.auth.DialogC0602a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۛ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC8002 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogC0602a f21024;

    /* JADX INFO: renamed from: ۧ */
    public C12026 f21025;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8002(DialogC0602a dialogC0602a, C12026 c12026, Looper looper) {
        super(looper);
        this.f21024 = dialogC0602a;
        this.f21025 = c12026;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        C12026 c12026 = this.f21025;
        if (i == 1) {
            String str = (String) message.obj;
            c12026.getClass();
            try {
                c12026.mo5758(C19797.m45010(str));
                return;
            } catch (JSONException unused) {
                c12026.mo5757(new C21139(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c12026.mo5756();
            return;
        }
        if (i != 3) {
            return;
        }
        Context context = this.f21024.f2083;
        try {
            JSONObject jSONObjectM45010 = C19797.m45010((String) message.obj);
            int i2 = jSONObjectM45010.getInt("type");
            Toast.makeText(context.getApplicationContext(), jSONObjectM45010.getString("msg"), i2).show();
        } catch (JSONException unused2) {
        }
    }
}
