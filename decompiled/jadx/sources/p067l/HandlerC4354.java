package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.֫᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC4354 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C19777 f9750;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4354(C19777 c19777, Looper looper) {
        super(looper);
        this.f9750 = c19777;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1000 && i == 1001 && C19797.m45001(C24158.m53410())) {
            C19777 c19777 = this.f9750;
            c19777.f60172.execute(new RunnableC18435(c19777));
        }
        super.handleMessage(message);
    }
}
