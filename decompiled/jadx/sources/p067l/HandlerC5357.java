package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N4W1 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5357 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f12635;

    public HandlerC5357(C4016 c4016) {
        super(Looper.getMainLooper());
        this.f12635 = new WeakReference(c4016);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C4016 c4016 = (C4016) this.f12635.get();
        if (c4016 == null) {
            return;
        }
        if (message.what == -1) {
            c4016.invalidateSelf();
            return;
        }
        Iterator it = c4016.f8769.iterator();
        while (it.hasNext()) {
            ((InterfaceC13719) it.next()).m31185();
        }
    }
}
