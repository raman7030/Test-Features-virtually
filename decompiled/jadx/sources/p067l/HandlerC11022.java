package p067l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۡ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11022 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ServiceC6328 serviceC6328;
        if (message.what != 0 || ServiceC6328.f16401 == null || (serviceC6328 = (ServiceC6328) ServiceC6328.f16401.get()) == null) {
            return;
        }
        ServiceC6328.m14477(serviceC6328);
    }
}
