package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: renamed from: l.۟ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC7400 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10805 f22778;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7400(C10805 c10805, Looper looper) {
        super(looper);
        this.f22778 = c10805;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        C10805 c10805 = this.f22778;
        if (i == 1) {
            C10805.m27013(c10805, obj, obj2);
        } else {
            if (i != 2) {
                return;
            }
            C10805.m27008(c10805, obj, obj2);
        }
    }
}
