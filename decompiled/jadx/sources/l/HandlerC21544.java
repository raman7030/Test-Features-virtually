package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩸ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC21544 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f69233;

    public HandlerC21544(C22249 c22249) {
        super(Looper.getMainLooper());
        this.f69233 = new WeakReference(c22249);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C22249 c22249 = (C22249) this.f69233.get();
        if (c22249 != null) {
            C22249.m49961(c22249);
        }
    }
}
