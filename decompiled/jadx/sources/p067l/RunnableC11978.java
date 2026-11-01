package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۤۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11978 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C6495 f33406;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ FutureC5767 f33407;

    /* JADX INFO: renamed from: ۫ */
    public int f33408;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C22864 f33409;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C14146 f33410;

    /* JADX INFO: renamed from: ᩸ */
    public FutureC5767 f33411;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC5390 f33412;

    public RunnableC11978(C14146 c14146, FutureC5767 futureC5767, C22864 c22864, C6495 c6495) {
        this.f33410 = c14146;
        this.f33407 = futureC5767;
        this.f33409 = c22864;
        this.f33406 = c6495;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14146 c14146 = this.f33410;
        FutureC5767 futureC5767 = this.f33407;
        if (futureC5767.isDone()) {
            FutureC5767 futureC5768 = this.f33411;
            if (futureC5768 != null) {
                futureC5768.cancel(false);
            }
            this.f33411 = null;
            return;
        }
        C22864 c22864 = this.f33409;
        if (c22864 != null) {
            try {
                if (c14146.f40239 == c22864) {
                    InterfaceC9768 interfaceC9768 = c14146.f40339;
                    C6495 c6495 = this.f33406;
                    if (interfaceC9768 == c6495 && !c14146.f40273) {
                        Throwable thM32481 = c14146.m32481();
                        if (thM32481 != null) {
                            throw new C15154(thM32481);
                        }
                        if (this.f33412 != c14146.f40275 || this.f33408 != c6495.mo28581() || !c14146.m32463()) {
                            FutureC5767 futureC5769 = this.f33411;
                            if (futureC5769 != null) {
                                futureC5769.cancel(false);
                            }
                            this.f33411 = null;
                        }
                        if (c14146.m32463() && c14146.f40275.m11801()) {
                            if (this.f33411 == null) {
                                this.f33412 = c14146.f40275;
                                this.f33408 = c6495.mo28581();
                                this.f33411 = c14146.m32538((InterfaceC9768) c6495);
                            }
                            if (this.f33411.isDone()) {
                                this.f33411.m12907();
                                futureC5767.m12889((Object) null);
                                return;
                            }
                        }
                        C7050.m16213(this, 10L);
                        return;
                    }
                }
            } catch (Throwable th) {
                FutureC5767 futureC57610 = this.f33411;
                if (futureC57610 != null) {
                    futureC57610.cancel(false);
                }
                this.f33411 = null;
                futureC5767.m12891(th);
                return;
            }
        }
        throw new CancellationException("Session preparation is no longer active");
    }
}
