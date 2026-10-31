package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: renamed from: l.ܳ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerThreadC14856 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C24029 f45321;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RuntimeException f45322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Error f45323;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public RunnableC20662 f45324;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Handler f45325;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24029 m35255(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f45325 = handler;
        this.f45324 = new RunnableC20662(handler);
        synchronized (this) {
            z = false;
            this.f45325.obtainMessage(1, i, 0).sendToTarget();
            while (this.f45321 == null && this.f45322 == null && this.f45323 == null) {
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
        RuntimeException runtimeException = this.f45322;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f45323;
        if (error != null) {
            throw error;
        }
        C24029 c24029 = this.f45321;
        c24029.getClass();
        return c24029;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35256() {
        this.f45325.getClass();
        this.f45325.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            m35254(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                            return true;
                        } catch (RuntimeException e) {
                            C19956.m46034("Failed to initialize placeholder surface", e);
                            this.f45322 = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (Error e2) {
                        C19956.m46034("Failed to initialize placeholder surface", e2);
                        this.f45323 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (C2317 e3) {
                    C19956.m46034("Failed to initialize placeholder surface", e3);
                    this.f45322 = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    this.f45324.getClass();
                    this.f45324.m47278();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        C19956.m46034("Failed to release placeholder surface", th);
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m35254(int i) throws C2317 {
        this.f45324.getClass();
        this.f45324.m47277(i);
        this.f45321 = new C24029(this, this.f45324.m47276(), i != 0);
    }
}
