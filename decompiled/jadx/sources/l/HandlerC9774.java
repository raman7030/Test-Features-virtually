package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۢᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9774 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C11233.m27805(message, "msg");
        int i = message.what;
        if (i == 0) {
            C9068.f27496.m23394();
        } else {
            if (i != 1) {
                return;
            }
            C9068.m23421();
        }
    }
}
