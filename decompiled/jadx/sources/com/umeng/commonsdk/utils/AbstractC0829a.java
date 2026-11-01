package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.umeng.commonsdk.utils.a */
/* JADX INFO: compiled from: 3BM5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0829a {

    /* JADX INFO: renamed from: e */
    public static final int f3564e = 1;

    /* JADX INFO: renamed from: a */
    public final long f3565a;

    /* JADX INFO: renamed from: b */
    public final long f3566b;

    /* JADX INFO: renamed from: c */
    public long f3567c;

    /* JADX INFO: renamed from: f */
    public HandlerThread f3569f;

    /* JADX INFO: renamed from: g */
    public Handler f3570g;

    /* JADX INFO: renamed from: d */
    public boolean f3568d = false;

    /* JADX INFO: renamed from: h */
    public Handler.Callback f3571h = new Handler.Callback() { // from class: com.umeng.commonsdk.utils.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (AbstractC0829a.this) {
                if (AbstractC0829a.this.f3568d) {
                    return true;
                }
                long jElapsedRealtime = AbstractC0829a.this.f3567c - SystemClock.elapsedRealtime();
                if (jElapsedRealtime <= 0) {
                    AbstractC0829a.this.m3303c();
                    if (AbstractC0829a.this.f3569f != null) {
                        AbstractC0829a.this.f3569f.quit();
                    }
                } else if (jElapsedRealtime < AbstractC0829a.this.f3566b) {
                    AbstractC0829a.this.f3570g.sendMessageDelayed(AbstractC0829a.this.f3570g.obtainMessage(1), jElapsedRealtime);
                } else {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    AbstractC0829a.this.m3301a(jElapsedRealtime);
                    long jElapsedRealtime3 = (jElapsedRealtime2 + AbstractC0829a.this.f3566b) - SystemClock.elapsedRealtime();
                    while (jElapsedRealtime3 < 0) {
                        jElapsedRealtime3 += AbstractC0829a.this.f3566b;
                    }
                    AbstractC0829a.this.f3570g.sendMessageDelayed(AbstractC0829a.this.f3570g.obtainMessage(1), jElapsedRealtime3);
                }
                return false;
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public abstract void m3301a(long j);

    /* JADX INFO: renamed from: c */
    public abstract void m3303c();

    public AbstractC0829a(long j, long j2) {
        this.f3565a = j;
        this.f3566b = j2;
        if (!m3298d()) {
            HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
            this.f3569f = handlerThread;
            handlerThread.start();
            this.f3570g = new Handler(this.f3569f.getLooper(), this.f3571h);
            return;
        }
        this.f3570g = new Handler(this.f3571h);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3300a() {
        this.f3568d = true;
        this.f3570g.removeMessages(1);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized AbstractC0829a m3302b() {
        this.f3568d = false;
        if (this.f3565a <= 0) {
            m3303c();
            return this;
        }
        this.f3567c = SystemClock.elapsedRealtime() + this.f3565a;
        Handler handler = this.f3570g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    /* JADX INFO: renamed from: d */
    private boolean m3298d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }
}
