package l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.connect.auth.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۛ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5928 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f18170;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10162 f18171;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5928(a aVar, C10162 c10162, Looper looper) {
        super(looper);
        this.f18170 = aVar;
        this.f18171 = c10162;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        C10162 c10162 = this.f18171;
        if (i == 1) {
            String str = (String) message.obj;
            c10162.getClass();
            try {
                c10162.mo3455(C18338.m42748(str));
                return;
            } catch (JSONException unused) {
                c10162.mo3454(new C19750(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c10162.mo3453();
            return;
        }
        if (i != 3) {
            return;
        }
        Context context = this.f18170.f886;
        try {
            JSONObject jSONObjectM42748 = C18338.m42748((String) message.obj);
            int i2 = jSONObjectM42748.getInt("type");
            Toast.makeText(context.getApplicationContext(), jSONObjectM42748.getString("msg"), i2).show();
        } catch (JSONException unused2) {
        }
    }
}
