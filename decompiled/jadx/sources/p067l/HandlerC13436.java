package p067l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۨۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC13436 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C24164 c24164 = (C24164) ((WeakReference) message.obj).get();
        if (c24164 != null) {
            c24164.m53426();
        }
    }
}
