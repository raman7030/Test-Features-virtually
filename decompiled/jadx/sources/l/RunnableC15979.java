package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܺܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15979 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f49313;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11747[] f49314;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f49315;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2575 f49316;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f49317;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9584 f49318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f49319;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f49320;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f49321;

    public RunnableC15979(C2575 c2575, int[] iArr, C11747[] c11747Arr) {
        this.f49316 = c2575;
        this.f49313 = c2575.f10015;
        this.f49315 = c2575.m9781();
        this.f49321 = c2575.f8140.get();
        this.f49319 = iArr;
        this.f49314 = c11747Arr;
        this.f49317 = new float[iArr.length];
        synchronized (c2575.f10037) {
            this.f49318 = c2575.f10037.m24488();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m37778() {
        if (this.f49320 || this.f49316.f10019 || this.f49313.mo26548() != this.f49315 || this.f49321 != this.f49316.f8140.get()) {
            throw new CancellationException();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        Runnable runnableC9631;
        final boolean z = false;
        try {
            try {
                m37778();
                C7744 c7744Mo26556 = this.f49313.mo26556();
                try {
                    if (c7744Mo26556.m20767() != this.f49315) {
                        c7744Mo26556.close();
                        runnableC9631 = new Runnable() { // from class: l.᩷ܰᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                RunnableC15979.m37780(this.f67657, false);
                            }
                        };
                    } else {
                        c7744Mo26556.m20766(new RunnableC17290(1, this));
                        C20873 c20873 = new C20873(c7744Mo26556);
                        for (int i = 0; i < this.f49319.length; i++) {
                            m37778();
                            this.f49317[i] = this.f49314[i].m28749(c20873, this.f49318);
                        }
                        c7744Mo26556.close();
                        runnableC9631 = new RunnableC9631(0, this);
                    }
                    C4925.m14315(runnableC9631);
                } catch (Throwable th) {
                    try {
                        c7744Mo26556.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Error | RuntimeException unused) {
                runnable = new Runnable() { // from class: l.ۡܰᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC15979.m37780(this.f27137, z);
                    }
                };
                C4925.m14315(runnable);
            }
        } catch (CancellationException unused2) {
            runnable = new Runnable() { // from class: l.ۡܰᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC15979.m37780(this.f27137, z);
                }
            };
            C4925.m14315(runnable);
        } catch (Throwable th3) {
            C4925.m14315(new Runnable() { // from class: l.ۡܰᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC15979.m37780(this.f27137, z);
                }
            });
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37780(RunnableC15979 runnableC15979, boolean z) {
        if (runnableC15979.f49316.f8144 != runnableC15979) {
            return;
        }
        runnableC15979.f49316.f8144 = null;
        C2575 c2575 = runnableC15979.f49316;
        if (c2575.f10021.f37258 == c2575 && c2575.f10015 == runnableC15979.f49313 && !c2575.f10019) {
            if (runnableC15979.f49320 || !runnableC15979.f49316.m9757() || runnableC15979.f49316.m9781() != runnableC15979.f49315 || runnableC15979.f49321 != runnableC15979.f49316.f8140.get()) {
                runnableC15979.f49316.f10021.invalidate();
                return;
            }
            if (z) {
                if (runnableC15979.f49316.f8143 == null) {
                    C2575 c2576 = runnableC15979.f49316;
                    c2576.f8143 = C16501.m38865(c2576.f8142);
                }
                for (int i = 0; i < runnableC15979.f49319.length; i++) {
                    runnableC15979.f49316.f8142.mo4099(runnableC15979.f49317[i], runnableC15979.f49319[i]);
                    runnableC15979.f49316.f8143.m38870(runnableC15979.f49319[i]);
                    C2575 c2577 = runnableC15979.f49316;
                    c2577.f8136 = Math.max(c2577.f8136, runnableC15979.f49317[i]);
                }
                C2575 c2578 = runnableC15979.f49316;
                c2578.f8147 = c2578.f8143.m38869();
                runnableC15979.f49316.f10021.invalidate();
            }
        }
    }
}
