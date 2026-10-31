package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.֫᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC2089 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18317 f6966;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2089(C18317 c18317, Looper looper) {
        super(looper);
        this.f6966 = c18317;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1000 && i == 1001 && C18338.m42739(C22927.m51019())) {
            C18317 c18317 = this.f6966;
            c18317.f56954.execute(new RunnableC16905(c18317));
        }
        super.handleMessage(message);
    }
}
