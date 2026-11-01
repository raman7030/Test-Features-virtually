package p067l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: renamed from: l.ܳ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerThreadC16488 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: ۗ */
    public C25206 f48437;

    /* JADX INFO: renamed from: ۙ */
    public RuntimeException f48438;

    /* JADX INFO: renamed from: ᩶ */
    public Error f48439;

    /* JADX INFO: renamed from: ᩸ */
    public RunnableC22005 f48440;

    /* JADX INFO: renamed from: ᩹ */
    public Handler f48441;

    /* JADX INFO: renamed from: ֫ */
    public final C25206 m37411(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f48441 = handler;
        this.f48440 = new RunnableC22005(handler);
        synchronized (this) {
            z = false;
            this.f48441.obtainMessage(1, i, 0).sendToTarget();
            while (this.f48437 == null && this.f48438 == null && this.f48439 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f48438;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f48439;
        if (error != null) {
            throw error;
        }
        C25206 c25206 = this.f48437;
        c25206.getClass();
        return c25206;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37412() {
        this.f48441.getClass();
        this.f48441.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            m37410(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                            return true;
                        } catch (RuntimeException e) {
                            C21334.m48348("Failed to initialize placeholder surface", e);
                            this.f48438 = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (Error e2) {
                        C21334.m48348("Failed to initialize placeholder surface", e2);
                        this.f48439 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (C4570 e3) {
                    C21334.m48348("Failed to initialize placeholder surface", e3);
                    this.f48438 = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    this.f48440.getClass();
                    this.f48440.m49605();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        C21334.m48348("Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m37410(int i) throws C4570 {
        this.f48440.getClass();
        this.f48440.m49604(i);
        this.f48437 = new C25206(this, this.f48440.m49603(), i != 0);
    }
}
