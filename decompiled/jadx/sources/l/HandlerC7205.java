package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۟ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC7205 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1848 c1848 = (C1848) ((WeakReference) message.obj).get();
        if (c1848 != null) {
            c1848.m6142();
        }
    }
}
