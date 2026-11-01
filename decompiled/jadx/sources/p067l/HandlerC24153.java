package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC24153 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public boolean f76616;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C12637 f76617;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m53403() {
        removeCallbacksAndMessages(null);
        this.f76616 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC24153(C12637 c12637, Looper looper) {
        super(looper);
        this.f76617 = c12637;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objM42888;
        C15435 c15435 = (C15435) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                objM42888 = ((C18828) this.f76617.f35472).m42888((C15317) c15435.f44120);
            } else if (i == 2) {
                objM42888 = ((C18828) this.f76617.f35472).m42887(this.f76617.f35489, (C7942) c15435.f44120);
            } else {
                throw new RuntimeException();
            }
        } catch (C8770 e) {
            boolean zM53402 = m53402(message, e);
            objM42888 = e;
            if (zM53402) {
                return;
            }
        } catch (Exception e2) {
            C21334.m48350("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objM42888 = e2;
        }
        Object obj = objM42888;
        InterfaceC12878 interfaceC12878 = this.f76617.f35490;
        long j = c15435.f44121;
        interfaceC12878.getClass();
        synchronized (this) {
            if (!this.f76616) {
                this.f76617.f35477.obtainMessage(message.what, Pair.create(c15435.f44120, obj)).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m53402(Message message, C8770 c8770) {
        IOException c3919;
        C15435 c15435 = (C15435) message.obj;
        if (c15435.f44118) {
            int i = c15435.f44119 + 1;
            c15435.f44119 = i;
            if (i <= this.f76617.f35490.mo29502(3)) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                if (!(c8770.getCause() instanceof IOException)) {
                    c3919 = new C3919(c8770.getCause());
                } else {
                    c3919 = (IOException) c8770.getCause();
                }
                long jMo29503 = this.f76617.f35490.mo29503(new C4160(c3919, c15435.f44119));
                if (jMo29503 != -9223372036854775807L) {
                    synchronized (this) {
                        if (this.f76616) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), jMo29503);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
