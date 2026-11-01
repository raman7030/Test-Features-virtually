package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bin.p000mt.plugin.api.util.UIUpdaterGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֫᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 87OT */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC4427 extends Handler {
    public HandlerC4427(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        UIUpdaterGroup uIUpdaterGroup = (UIUpdaterGroup) ((WeakReference) message.obj).get();
        if (uIUpdaterGroup != null) {
            uIUpdaterGroup.processPendingUpdates();
        }
    }
}
