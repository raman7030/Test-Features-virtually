package p067l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.֫ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAN9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4067 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final Activity f8946;

    /* JADX INFO: renamed from: ᩹ */
    public C18975 f8947;

    /* JADX INFO: renamed from: ᩶ */
    public final ReentrantLock f8945 = new ReentrantLock();

    /* JADX INFO: renamed from: ۙ */
    public final LinkedHashSet f8944 = new LinkedHashSet();

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8138(InterfaceC1489 interfaceC1489) {
        C13045.m29867(interfaceC1489, MessageHandler.Properties.Listener);
        ReentrantLock reentrantLock = this.f8945;
        reentrantLock.lock();
        try {
            this.f8944.remove(interfaceC1489);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C4067(Activity activity) {
        this.f8946 = activity;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        C13045.m29867(windowLayoutInfo, C0226b.f1011d);
        ReentrantLock reentrantLock = this.f8945;
        reentrantLock.lock();
        try {
            this.f8947 = C18148.m41328(this.f8946, windowLayoutInfo);
            Iterator it = this.f8944.iterator();
            while (it.hasNext()) {
                ((InterfaceC1489) it.next()).accept(this.f8947);
            }
            C10027 c10027 = C10027.f27775;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8137(C12941 c12941) {
        ReentrantLock reentrantLock = this.f8945;
        reentrantLock.lock();
        try {
            C18975 c18975 = this.f8947;
            if (c18975 != null) {
                c12941.accept(c18975);
            }
            this.f8944.add(c12941);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8139() {
        return this.f8944.isEmpty();
    }
}
