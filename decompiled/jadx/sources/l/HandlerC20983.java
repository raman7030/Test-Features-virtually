package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩷ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC20983 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof C8988) {
            C8988 c8988 = (C8988) obj;
            try {
                try {
                    c8988.f27311 = c8988.f27309.call();
                    c8988.f27312 = false;
                } catch (Throwable th) {
                    c8988.f27312 = false;
                    throw th;
                }
            } catch (Exception e) {
                c8988.f27310 = e;
                c8988.f27312 = false;
            } catch (Throwable th2) {
                c8988.f27310 = new Exception(th2);
                c8988.f27312 = false;
            }
        }
    }
}
