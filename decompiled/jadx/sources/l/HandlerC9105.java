package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۡ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9105 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ServiceC4166 serviceC4166;
        if (message.what != 0 || ServiceC4166.f13588 == null || (serviceC4166 = (ServiceC4166) ServiceC4166.f13588.get()) == null) {
            return;
        }
        ServiceC4166.m12603(serviceC4166);
    }
}
