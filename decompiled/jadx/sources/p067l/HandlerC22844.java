package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩸ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC22844 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f71933;

    public HandlerC22844(C23514 c23514) {
        super(Looper.getMainLooper());
        this.f71933 = new WeakReference(c23514);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C23514 c23514 = (C23514) this.f71933.get();
        if (c23514 != null) {
            C23514.m52289(c23514);
        }
    }
}
