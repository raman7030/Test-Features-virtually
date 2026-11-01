package p067l;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.p010m.p052u0.C0227c;

/* JADX INFO: renamed from: l.ۗܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OBMG */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5492 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 11) {
            C14879.f42433 = C14879.f42428.m54693(message.getData().getInt("type"), message.getData().getString(C0227c.f1027d));
            synchronized (C14879.f42429) {
                C14879.f42429.notify();
            }
        }
    }
}
