package l;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.m.u0.c;

/* JADX INFO: renamed from: l.ۗܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OBMG */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC3287 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 11) {
            C13164.f39371 = C13164.f39366.m52290(message.getData().getInt("type"), message.getData().getString(c.d));
            synchronized (C13164.f39367) {
                C13164.f39367.notify();
            }
        }
    }
}
