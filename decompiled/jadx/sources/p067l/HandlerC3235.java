package p067l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֨ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A151 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC3235 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC7259 f6267;

    /* JADX INFO: renamed from: ۧ */
    public final WeakReference f6268;

    public HandlerC3235(Object obj, InterfaceC7259 interfaceC7259) {
        this.f6268 = new WeakReference(obj);
        this.f6267 = interfaceC7259;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = this.f6268.get();
        if (obj != null) {
            this.f6267.mo9163(obj, message);
        } else {
            this.f6267 = null;
        }
    }
}
