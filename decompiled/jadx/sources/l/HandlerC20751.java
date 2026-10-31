package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC20751 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC3817 abstractC3817 = (AbstractC3817) ((WeakReference) message.obj).get();
        if (abstractC3817 != null) {
            abstractC3817.f12053.mo1669(abstractC3817);
        }
    }
}
