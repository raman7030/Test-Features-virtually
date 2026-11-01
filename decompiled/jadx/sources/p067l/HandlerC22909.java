package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.᩸ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC22909 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C21568 f72095;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22909(C21568 c21568, Looper looper) {
        super(looper);
        this.f72095 = c21568;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C21568.m48757(this.f72095, message);
    }
}
