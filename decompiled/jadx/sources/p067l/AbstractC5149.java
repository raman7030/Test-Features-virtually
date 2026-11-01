package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۗ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5149 extends AbstractC4734 {

    /* JADX INFO: renamed from: ۗ */
    public volatile long f12096;

    /* JADX INFO: renamed from: ۛ */
    public long f12098;

    /* JADX INFO: renamed from: ۨ */
    public boolean f12100;

    /* JADX INFO: renamed from: ۫ */
    public C6490 f12101;

    /* JADX INFO: renamed from: ᩶ */
    public volatile boolean f12104;

    /* JADX INFO: renamed from: ᩺ */
    public volatile C11084 f12105;

    /* JADX INFO: renamed from: ܰ */
    public final Object f12103 = new Object();

    /* JADX INFO: renamed from: ۬ */
    public final Handler f12102 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۙ */
    public final ExecutorService f12097 = C4081.f8987;

    /* JADX INFO: renamed from: ۤ */
    public final AtomicLong f12099 = new AtomicLong();

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public void mo10030(C11084 c11084) {
        this.f12105 = c11084;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10997(CharSequence charSequence, InterfaceC21243 interfaceC21243) {
        synchronized (this.f12103) {
            try {
                if (this.f12104) {
                    return;
                }
                C9729 c9729Mo28595 = charSequence instanceof InterfaceC21800 ? ((InterfaceC21800) charSequence).mo28595() : null;
                long j = 1 + this.f12096;
                this.f12096 = j;
                C6490 c6490 = new C6490(this, j, c9729Mo28595 == null ? charSequence : c9729Mo28595, c9729Mo28595, interfaceC21243);
                C6490 c6491 = this.f12101;
                if (c6491 != null) {
                    c6491.close();
                }
                this.f12101 = c6490;
                if (this.f12100) {
                    return;
                }
                this.f12100 = true;
                try {
                    this.f12097.execute(new Runnable() { // from class: l.᩸֫ۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5149.m10992(this.f71298);
                        }
                    });
                } catch (Error e) {
                    e = e;
                    this.f12100 = false;
                    this.f12101 = null;
                    c6490.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    this.f12100 = false;
                    this.f12101 = null;
                    c6490.close();
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10992(final AbstractC5149 abstractC5149) {
        final C6490 c6490;
        final Runnable runnableMo13525;
        while (true) {
            synchronized (abstractC5149.f12103) {
                c6490 = abstractC5149.f12101;
                abstractC5149.f12101 = null;
                if (c6490 == null) {
                    abstractC5149.f12100 = false;
                    return;
                }
            }
            try {
                if (!c6490.mo3924() && (runnableMo13525 = c6490.f16784.mo13525(c6490.f16781, c6490)) != null && !c6490.mo3924()) {
                    abstractC5149.f12102.post(new Runnable() { // from class: l.᩹֫ۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5149.m10994(this.f73090, c6490, runnableMo13525);
                        }
                    });
                }
                try {
                    c6490.close();
                } catch (Throwable unused) {
                    c6490.mo3924();
                }
            } catch (Throwable th) {
                try {
                    c6490.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m10994(AbstractC5149 abstractC5149, C6490 c6490, Runnable runnable) {
        if (c6490.mo3924()) {
            return;
        }
        if (abstractC5149.f12105 == null || abstractC5149.f12105.m25532()) {
            abstractC5149.f12098 = c6490.f16783;
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10998(final Runnable runnable) {
        final long jIncrementAndGet = this.f12099.incrementAndGet();
        final long j = this.f12096;
        final C11084 c11084 = this.f12105;
        Runnable runnable2 = new Runnable() { // from class: l.ܶ֫ۢ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC5149.m10993(this.f48606, jIncrementAndGet, j, c11084, runnable);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            this.f12102.post(runnable2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m10993(AbstractC5149 abstractC5149, long j, long j2, C11084 c11084, Runnable runnable) {
        if (!abstractC5149.f12104 && j == abstractC5149.f12099.get() && j2 == abstractC5149.f12096 && c11084 == abstractC5149.f12105) {
            if (c11084 == null || c11084.m25532()) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m10999() {
        if (this.f12104 || this.f12098 != this.f12096) {
            return false;
        }
        return this.f12105 == null || this.f12105.m25532();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f12103) {
            this.f12104 = true;
            this.f12096++;
            C6490 c6490 = this.f12101;
            if (c6490 != null) {
                c6490.close();
                this.f12101 = null;
            }
        }
        this.f10724 = null;
    }
}
