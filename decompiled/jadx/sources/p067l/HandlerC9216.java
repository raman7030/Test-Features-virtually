package p067l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۟ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC9216 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C4125 c4125 = (C4125) ((WeakReference) message.obj).get();
        if (c4125 != null) {
            c4125.m8340();
        }
    }
}
