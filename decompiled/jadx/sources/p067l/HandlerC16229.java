package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC16229 extends Handler implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public int f47758;

    /* JADX INFO: renamed from: ۙ */
    public final int f47759;

    /* JADX INFO: renamed from: ۛ */
    public final long f47760;

    /* JADX INFO: renamed from: ۤ */
    public volatile boolean f47761;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C10866 f47762;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC24947 f47763;

    /* JADX INFO: renamed from: ۬ */
    public Thread f47764;

    /* JADX INFO: renamed from: ᩶ */
    public IOException f47765;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC19583 f47766;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f47767;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC16229(C10866 c10866, Looper looper, InterfaceC24947 interfaceC24947, InterfaceC19583 interfaceC19583, int i, long j) {
        super(looper);
        this.f47762 = c10866;
        this.f47763 = interfaceC24947;
        this.f47766 = interfaceC19583;
        this.f47759 = i;
        this.f47760 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36983(int i) {
        IOException iOException = this.f47765;
        if (iOException != null && this.f47758 > i) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36984(long j) {
        C10866 c10866 = this.f47762;
        C23877.m52960(c10866.f30118 == null);
        c10866.f30118 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            m36982();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36985(boolean z) {
        this.f47761 = z;
        this.f47765 = null;
        if (hasMessages(1)) {
            this.f47767 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f47767 = true;
                this.f47763.mo8653();
                Thread thread = this.f47764;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f47762.f30118 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC19583 interfaceC19583 = this.f47766;
            interfaceC19583.getClass();
            interfaceC19583.mo14660(this.f47763, jElapsedRealtime, jElapsedRealtime - this.f47760, true);
            this.f47766 = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f47767;
                this.f47764 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f47763.getClass().getSimpleName()));
                try {
                    this.f47763.mo8651();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f47764 = null;
                Thread.interrupted();
            }
            if (this.f47761) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f47761) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f47761) {
                return;
            }
            C21334.m48348("OutOfMemory error loading stream", e2);
            obtainMessage(3, new C11537(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f47761) {
                C21334.m48348("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f47761) {
                return;
            }
            C21334.m48348("Unexpected exception loading stream", e4);
            obtainMessage(3, new C11537(e4)).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        if (this.f47761) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            m36982();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f47762.f30118 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f47760;
        InterfaceC19583 interfaceC19583 = this.f47766;
        interfaceC19583.getClass();
        if (this.f47767) {
            interfaceC19583.mo14660(this.f47763, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC19583.mo14658(this.f47763, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                C21334.m48348("Unexpected exception handling load completed", e);
                this.f47762.f30120 = new C11537(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f47765 = iOException;
        int i3 = this.f47758 + 1;
        this.f47758 = i3;
        C18912 c18912Mo14657 = interfaceC19583.mo14657(this.f47763, jElapsedRealtime, j, iOException, i3);
        if (c18912Mo14657.f56445 == 3) {
            this.f47762.f30120 = this.f47765;
        } else if (c18912Mo14657.f56445 != 2) {
            if (c18912Mo14657.f56445 == 1) {
                this.f47758 = 1;
            }
            if (c18912Mo14657.f56444 != -9223372036854775807L) {
                jMin = c18912Mo14657.f56444;
            } else {
                jMin = Math.min((this.f47758 - 1) * 1000, OpenAuthTask.Duplex);
            }
            m36984(jMin);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36982() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f47760;
        InterfaceC19583 interfaceC19583 = this.f47766;
        interfaceC19583.getClass();
        interfaceC19583.mo14659(this.f47763, jElapsedRealtime, j, this.f47758);
        this.f47765 = null;
        C10866 c10866 = this.f47762;
        InterfaceExecutorC10195 interfaceExecutorC10195 = c10866.f30119;
        HandlerC16229 handlerC16229 = c10866.f30118;
        handlerC16229.getClass();
        interfaceExecutorC10195.execute(handlerC16229);
    }
}
