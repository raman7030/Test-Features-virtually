package p067l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩷ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC22311 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof C10911) {
            C10911 c10911 = (C10911) obj;
            try {
                try {
                    c10911.f30245 = c10911.f30243.call();
                    c10911.f30246 = false;
                } catch (Throwable th) {
                    c10911.f30246 = false;
                    throw th;
                }
            } catch (Exception e) {
                c10911.f30244 = e;
                c10911.f30246 = false;
            } catch (Throwable th2) {
                c10911.f30244 = new Exception(th2);
                c10911.f30246 = false;
            }
        }
    }
}
