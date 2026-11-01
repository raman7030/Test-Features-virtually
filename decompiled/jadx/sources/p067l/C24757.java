package p067l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩻۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PS */
/* JADX INFO: loaded from: classes.dex */
public final class C24757 {

    /* JADX INFO: renamed from: ֫ */
    public final C18897 f78365;

    /* JADX INFO: renamed from: ۖ */
    public final int f78366;

    /* JADX INFO: renamed from: ۘ */
    public final C12273 f78367;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f78369;

    /* JADX INFO: renamed from: ۢ */
    public final C19568 f78370;

    /* JADX INFO: renamed from: ۧ */
    public final RunnableC16214 f78371;

    /* JADX INFO: renamed from: ܳ */
    public float f78372;

    /* JADX INFO: renamed from: ܺ */
    public int[] f78373;

    /* JADX INFO: renamed from: ܿ */
    public int f78375;

    /* JADX INFO: renamed from: ᩳ */
    public final C22076 f78376;

    /* JADX INFO: renamed from: ᩷ */
    public final C16039 f78377;

    /* JADX INFO: renamed from: ᩻ */
    public final C11477 f78378;

    /* JADX INFO: renamed from: ۜ */
    public final AtomicInteger f78368 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܽ */
    public final AtomicReference f78374 = new AtomicReference();

    public C24757(C19568 c19568, C22076 c22076, C12273 c12273, C11477 c11477, int i, C16039 c16039, boolean z, C18897 c18897, RunnableC16214 runnableC16214) {
        this.f78370 = c19568;
        this.f78376 = c22076;
        this.f78367 = c12273;
        this.f78378 = c11477;
        this.f78366 = i;
        this.f78375 = i;
        this.f78377 = c16039;
        this.f78369 = z;
        this.f78372 = c12273.getFloat(i);
        this.f78365 = c18897;
        this.f78371 = runnableC16214;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54420(int[] iArr) {
        this.f78373 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54419(Executor executor, int i) {
        int[] iArr = this.f78373;
        int size = iArr == null ? this.f78376.size() : iArr.length;
        int iMax = Math.max(1, (size / Math.max(1, i)) + 1);
        final int i2 = 0;
        while (i2 < size) {
            try {
                final int iMin = Math.min(iMax, size - i2) + i2;
                this.f78368.incrementAndGet();
                try {
                    executor.execute(new Runnable() { // from class: l.ᩳ۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C24757.m54416(this.f57881, i2, iMin);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    AtomicReference atomicReference = this.f78374;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                    m54417();
                }
                i2 = iMin;
            } catch (Throwable th) {
                m54417();
                throw th;
            }
        }
        m54417();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54416(final C24757 c24757, int i, int i2) {
        AtomicReference atomicReference;
        C16039 c16039;
        try {
            try {
                if (!c24757.f78365.getAsBoolean() && c24757.f78374.get() == null) {
                    C9729 c9729M11841 = ((C4816) c24757.f78370.f59563).m11841();
                    try {
                        c9729M11841.m22746(new Runnable() { // from class: l.ܿ۟ᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C24757.m54415(this.f55939);
                            }
                        });
                        C22206 c22206 = new C22206(c9729M11841);
                        C15543 c15543M49686 = c24757.f78376.m49686();
                        while (i < i2) {
                            int[] iArr = c24757.f78373;
                            int i3 = iArr == null ? i : iArr[i];
                            if (!c24757.f78365.getAsBoolean() && c24757.f78374.get() == null) {
                                if (((i3 != c24757.f78366 && ((c16039 = c24757.f78377) == null || !c16039.m36489(i3))) || c24757.f78367.getFloat(i3) < 0.0f) && (!c24757.f78369 || c24757.f78367.getFloat(i3) < 0.0f)) {
                                    float fM30797 = c15543M49686.m35335(i3).m30797(c22206, c24757.f78378);
                                    if (c24757.f78365.getAsBoolean()) {
                                        c9729M11841.close();
                                        c24757.m54417();
                                        return;
                                    } else {
                                        c24757.f78367.mo6343(fM30797, i3);
                                        synchronized (c24757) {
                                            if (fM30797 > c24757.f78372) {
                                                c24757.f78372 = fM30797;
                                                c24757.f78375 = i3;
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                            c9729M11841.close();
                            c24757.m54417();
                            return;
                        }
                        c9729M11841.close();
                        c24757.m54417();
                        return;
                    } catch (Throwable th) {
                        try {
                            c9729M11841.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                c24757.m54417();
            } catch (Throwable th3) {
                c24757.m54417();
                throw th3;
            }
        } catch (Error e) {
            e = e;
            atomicReference = c24757.f78374;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            c24757.m54417();
        } catch (CancellationException unused) {
            c24757.m54417();
        } catch (RuntimeException e2) {
            e = e2;
            atomicReference = c24757.f78374;
            while (!atomicReference.compareAndSet(null, e)) {
            }
            c24757.m54417();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m54415(C24757 c24757) {
        if (c24757.f78365.getAsBoolean()) {
            throw new CancellationException();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m54417() {
        if (this.f78368.decrementAndGet() == 0) {
            this.f78371.run();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m54421() {
        return this.f78375;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Throwable m54418() {
        return (Throwable) this.f78374.get();
    }
}
