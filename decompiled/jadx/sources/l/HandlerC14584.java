package l;

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
public final class HandlerC14584 extends Handler implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f44650;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44651;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f44652;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f44653;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8941 f44654;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23757 f44655;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Thread f44656;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f44657;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC18113 f44658;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44659;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14584(C8941 c8941, Looper looper, InterfaceC23757 interfaceC23757, InterfaceC18113 interfaceC18113, int i, long j) {
        super(looper);
        this.f44654 = c8941;
        this.f44655 = interfaceC23757;
        this.f44658 = interfaceC18113;
        this.f44651 = i;
        this.f44652 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34832(int i) {
        IOException iOException = this.f44657;
        if (iOException != null && this.f44650 > i) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34833(long j) {
        C8941 c8941 = this.f44654;
        C22632.m50634(c8941.f27183 == null);
        c8941.f27183 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            m34831();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34834(boolean z) {
        this.f44653 = z;
        this.f44657 = null;
        if (hasMessages(1)) {
            this.f44659 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f44659 = true;
                this.f44655.mo6511();
                Thread thread = this.f44656;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f44654.f27183 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC18113 interfaceC18113 = this.f44658;
            interfaceC18113.getClass();
            interfaceC18113.mo12780(this.f44655, jElapsedRealtime, jElapsedRealtime - this.f44652, true);
            this.f44658 = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f44659;
                this.f44656 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f44655.getClass().getSimpleName()));
                try {
                    this.f44655.mo6509();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f44656 = null;
                Thread.interrupted();
            }
            if (this.f44653) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f44653) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f44653) {
                return;
            }
            C19956.m46034("OutOfMemory error loading stream", e2);
            obtainMessage(3, new C9647(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f44653) {
                C19956.m46034("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f44653) {
                return;
            }
            C19956.m46034("Unexpected exception loading stream", e4);
            obtainMessage(3, new C9647(e4)).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        if (this.f44653) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            m34831();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f44654.f27183 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f44652;
        InterfaceC18113 interfaceC18113 = this.f44658;
        interfaceC18113.getClass();
        if (this.f44659) {
            interfaceC18113.mo12780(this.f44655, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC18113.mo12778(this.f44655, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                C19956.m46034("Unexpected exception handling load completed", e);
                this.f44654.f27185 = new C9647(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f44657 = iOException;
        int i3 = this.f44650 + 1;
        this.f44650 = i3;
        C17407 c17407Mo12777 = interfaceC18113.mo12777(this.f44655, jElapsedRealtime, j, iOException, i3);
        if (c17407Mo12777.f53258 == 3) {
            this.f44654.f27185 = this.f44657;
        } else if (c17407Mo12777.f53258 != 2) {
            if (c17407Mo12777.f53258 == 1) {
                this.f44650 = 1;
            }
            if (c17407Mo12777.f53257 != -9223372036854775807L) {
                jMin = c17407Mo12777.f53257;
            } else {
                jMin = Math.min((this.f44650 - 1) * 1000, OpenAuthTask.Duplex);
            }
            m34833(jMin);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34831() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f44652;
        InterfaceC18113 interfaceC18113 = this.f44658;
        interfaceC18113.getClass();
        interfaceC18113.mo12779(this.f44655, jElapsedRealtime, j, this.f44650);
        this.f44657 = null;
        C8941 c8941 = this.f44654;
        InterfaceExecutorC8235 interfaceExecutorC8235 = c8941.f27184;
        HandlerC14584 handlerC14584 = c8941.f27183;
        handlerC14584.getClass();
        interfaceExecutorC8235.execute(handlerC14584);
    }
}
