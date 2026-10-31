package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N4W1 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC3145 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f9832;

    public HandlerC3145(C1734 c1734) {
        super(Looper.getMainLooper());
        this.f9832 = new WeakReference(c1734);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1734 c1734 = (C1734) this.f9832.get();
        if (c1734 == null) {
            return;
        }
        if (message.what == -1) {
            c1734.invalidateSelf();
            return;
        }
        Iterator it = c1734.f5992.iterator();
        while (it.hasNext()) {
            ((InterfaceC11943) it.next()).m29131();
        }
    }
}
