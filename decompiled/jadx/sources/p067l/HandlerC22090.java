package p067l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC22090 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC5996 abstractC5996 = (AbstractC5996) ((WeakReference) message.obj).get();
        if (abstractC5996 != null) {
            abstractC5996.f14860.mo4067(abstractC5996);
        }
    }
}
