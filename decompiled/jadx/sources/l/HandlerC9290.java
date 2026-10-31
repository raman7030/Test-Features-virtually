package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۢۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9290 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2234 f28161;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9290(C2234 c2234, Looper looper) {
        super(looper);
        this.f28161 = c2234;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f28161.m7412();
        } else {
            super.handleMessage(message);
        }
    }
}
