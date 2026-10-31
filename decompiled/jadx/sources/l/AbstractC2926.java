package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۗ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2926 extends AbstractC2489 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile long f9297;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f9299;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f9301;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4337 f9302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f9305;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile C9170 f9306;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f9304 = new Object();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Handler f9303 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f9298 = C1802.f6208;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f9300 = new AtomicLong();

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public void mo7982(C9170 c9170) {
        this.f9306 = c9170;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8929(CharSequence charSequence, InterfaceC19860 interfaceC19860) {
        synchronized (this.f9304) {
            try {
                if (this.f9305) {
                    return;
                }
                C7744 c7744Mo26562 = charSequence instanceof InterfaceC20445 ? ((InterfaceC20445) charSequence).mo26562() : null;
                long j = 1 + this.f9297;
                this.f9297 = j;
                C4337 c4337 = new C4337(this, j, c7744Mo26562 == null ? charSequence : c7744Mo26562, c7744Mo26562, interfaceC19860);
                C4337 c4338 = this.f9302;
                if (c4338 != null) {
                    c4338.close();
                }
                this.f9302 = c4337;
                if (this.f9301) {
                    return;
                }
                this.f9301 = true;
                try {
                    this.f9298.execute(new Runnable() { // from class: l.᩸֫ۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2926.m8924(this.f68615);
                        }
                    });
                } catch (Error e) {
                    e = e;
                    this.f9301 = false;
                    this.f9302 = null;
                    c4337.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    this.f9301 = false;
                    this.f9302 = null;
                    c4337.close();
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8924(final AbstractC2926 abstractC2926) {
        final C4337 c4337;
        final Runnable runnableMo11589;
        while (true) {
            synchronized (abstractC2926.f9304) {
                c4337 = abstractC2926.f9302;
                abstractC2926.f9302 = null;
                if (c4337 == null) {
                    abstractC2926.f9301 = false;
                    return;
                }
            }
            try {
                if (!c4337.mo1526() && (runnableMo11589 = c4337.f13970.mo11589(c4337.f13967, c4337)) != null && !c4337.mo1526()) {
                    abstractC2926.f9303.post(new Runnable() { // from class: l.᩹֫ۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2926.m8926(this.f70379, c4337, runnableMo11589);
                        }
                    });
                }
                try {
                    c4337.close();
                } catch (Throwable unused) {
                    c4337.mo1526();
                }
            } catch (Throwable th) {
                try {
                    c4337.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8926(AbstractC2926 abstractC2926, C4337 c4337, Runnable runnable) {
        if (c4337.mo1526()) {
            return;
        }
        if (abstractC2926.f9306 == null || abstractC2926.f9306.m23581()) {
            abstractC2926.f9299 = c4337.f13969;
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8930(final Runnable runnable) {
        final long jIncrementAndGet = this.f9300.incrementAndGet();
        final long j = this.f9297;
        final C9170 c9170 = this.f9306;
        Runnable runnable2 = new Runnable() { // from class: l.ܶ֫ۢ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2926.m8925(this.f45491, jIncrementAndGet, j, c9170, runnable);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            this.f9303.post(runnable2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8925(AbstractC2926 abstractC2926, long j, long j2, C9170 c9170, Runnable runnable) {
        if (!abstractC2926.f9305 && j == abstractC2926.f9300.get() && j2 == abstractC2926.f9297 && c9170 == abstractC2926.f9306) {
            if (c9170 == null || c9170.m23581()) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m8931() {
        if (this.f9305 || this.f9299 != this.f9297) {
            return false;
        }
        return this.f9306 == null || this.f9306.m23581();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f9304) {
            this.f9305 = true;
            this.f9297++;
            C4337 c4337 = this.f9302;
            if (c4337 != null) {
                c4337.close();
                this.f9302 = null;
            }
        }
        this.f7936 = null;
    }
}
