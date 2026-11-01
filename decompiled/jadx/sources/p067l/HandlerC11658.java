package p067l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۢᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11658 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C13045.m29867(message, "msg");
        int i = message.what;
        if (i == 0) {
            C10987.f30433.m25340();
        } else {
            if (i != 1) {
                return;
            }
            C10987.m25367();
        }
    }
}
