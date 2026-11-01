package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܺܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17555 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC9768 f52470;

    /* JADX INFO: renamed from: ۙ */
    public final C13533[] f52471;

    /* JADX INFO: renamed from: ۛ */
    public final int f52472;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C4816 f52473;

    /* JADX INFO: renamed from: ۫ */
    public final float[] f52474;

    /* JADX INFO: renamed from: ۬ */
    public final C11477 f52475;

    /* JADX INFO: renamed from: ᩶ */
    public final int[] f52476;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f52477;

    /* JADX INFO: renamed from: ᩹ */
    public final int f52478;

    public RunnableC17555(C4816 c4816, int[] iArr, C13533[] c13533Arr) {
        this.f52473 = c4816;
        this.f52470 = c4816.f12815;
        this.f52472 = c4816.m11825();
        this.f52478 = c4816.f10930.get();
        this.f52476 = iArr;
        this.f52471 = c13533Arr;
        this.f52474 = new float[iArr.length];
        synchronized (c4816.f12837) {
            this.f52475 = c4816.f12837.m26500();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m39962() {
        if (this.f52477 || this.f52473.f12819 || this.f52470.mo28581() != this.f52472 || this.f52478 != this.f52473.f10930.get()) {
            throw new CancellationException();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        Runnable runnableC11522;
        final boolean z = false;
        try {
            try {
                m39962();
                C9729 c9729Mo28589 = this.f52470.mo28589();
                try {
                    if (c9729Mo28589.m22747() != this.f52472) {
                        c9729Mo28589.close();
                        runnableC11522 = new Runnable() { // from class: l.᩷ܰᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                RunnableC17555.m39964(this.f70342, false);
                            }
                        };
                    } else {
                        c9729Mo28589.m22746(new RunnableC18801(1, this));
                        C22206 c22206 = new C22206(c9729Mo28589);
                        for (int i = 0; i < this.f52476.length; i++) {
                            m39962();
                            this.f52474[i] = this.f52471[i].m30797(c22206, this.f52475);
                        }
                        c9729Mo28589.close();
                        runnableC11522 = new RunnableC11522(0, this);
                    }
                    C7050.m16212(runnableC11522);
                } catch (Throwable th) {
                    try {
                        c9729Mo28589.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Error | RuntimeException unused) {
                runnable = new Runnable() { // from class: l.ۡܰᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC17555.m39964(this.f30069, z);
                    }
                };
                C7050.m16212(runnable);
            }
        } catch (CancellationException unused2) {
            runnable = new Runnable() { // from class: l.ۡܰᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC17555.m39964(this.f30069, z);
                }
            };
            C7050.m16212(runnable);
        } catch (Throwable th3) {
            C7050.m16212(new Runnable() { // from class: l.ۡܰᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC17555.m39964(this.f30069, z);
                }
            });
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39964(RunnableC17555 runnableC17555, boolean z) {
        if (runnableC17555.f52473.f10934 != runnableC17555) {
            return;
        }
        runnableC17555.f52473.f10934 = null;
        C4816 c4816 = runnableC17555.f52473;
        if (c4816.f12821.f40275 == c4816 && c4816.f12815 == runnableC17555.f52470 && !c4816.f12819) {
            if (runnableC17555.f52477 || !runnableC17555.f52473.m11801() || runnableC17555.f52473.m11825() != runnableC17555.f52472 || runnableC17555.f52478 != runnableC17555.f52473.f10930.get()) {
                runnableC17555.f52473.f12821.invalidate();
                return;
            }
            if (z) {
                if (runnableC17555.f52473.f10933 == null) {
                    C4816 c4817 = runnableC17555.f52473;
                    c4817.f10933 = C18051.m41091(c4817.f10932);
                }
                for (int i = 0; i < runnableC17555.f52476.length; i++) {
                    runnableC17555.f52473.f10932.mo6343(runnableC17555.f52474[i], runnableC17555.f52476[i]);
                    runnableC17555.f52473.f10933.m41096(runnableC17555.f52476[i]);
                    C4816 c4818 = runnableC17555.f52473;
                    c4818.f10926 = Math.max(c4818.f10926, runnableC17555.f52474[i]);
                }
                C4816 c4819 = runnableC17555.f52473;
                c4819.f10937 = c4819.f10933.m41095();
                runnableC17555.f52473.f12821.invalidate();
            }
        }
    }
}
