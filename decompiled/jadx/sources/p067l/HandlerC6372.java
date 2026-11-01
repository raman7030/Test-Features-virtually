package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۘ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC6372 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC23136 f16495;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6372(AbstractC23136 abstractC23136, Looper looper) {
        super(looper);
        this.f16495 = abstractC23136;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f16495.m51588();
    }
}
