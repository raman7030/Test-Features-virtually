package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.᩸ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC21613 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20202 f69392;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC21613(C20202 c20202, Looper looper) {
        super(looper);
        this.f69392 = c20202;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C20202.m46438(this.f69392, message);
    }
}
