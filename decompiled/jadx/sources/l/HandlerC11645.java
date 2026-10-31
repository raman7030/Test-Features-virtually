package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۨۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11645 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C22933 c22933 = (C22933) ((WeakReference) message.obj).get();
        if (c22933 != null) {
            c22933.m51035();
        }
    }
}
