package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֨ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A151 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0912 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5146 f3492;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f3493;

    public HandlerC0912(Object obj, InterfaceC5146 interfaceC5146) {
        this.f3493 = new WeakReference(obj);
        this.f3492 = interfaceC5146;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = this.f3493.get();
        if (obj != null) {
            this.f3492.mo7068(obj, message);
        } else {
            this.f3492 = null;
        }
    }
}
