package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۢۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11197 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4491 f31110;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC11197(C4491 c4491, Looper looper) {
        super(looper);
        this.f31110 = c4491;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f31110.m9494();
        } else {
            super.handleMessage(message);
        }
    }
}
