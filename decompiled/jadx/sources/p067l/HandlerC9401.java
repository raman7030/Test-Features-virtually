package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: renamed from: l.۟ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9401 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12637 f25690;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9401(C12637 c12637, Looper looper) {
        super(looper);
        this.f25690 = c12637;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        C12637 c12637 = this.f25690;
        if (i == 1) {
            C12637.m29058(c12637, obj, obj2);
        } else {
            if (i != 2) {
                return;
            }
            C12637.m29053(c12637, obj, obj2);
        }
    }
}
