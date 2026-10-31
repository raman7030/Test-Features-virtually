package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۤۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10111 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4342 f30447;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC3575 f30448;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30449;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21565 f30450;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f30451;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public FutureC3575 f30452;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f30453;

    public RunnableC10111(C12392 c12392, FutureC3575 futureC3575, C21565 c21565, C4342 c4342) {
        this.f30451 = c12392;
        this.f30448 = futureC3575;
        this.f30450 = c21565;
        this.f30447 = c4342;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12392 c12392 = this.f30451;
        FutureC3575 futureC3575 = this.f30448;
        if (futureC3575.isDone()) {
            FutureC3575 futureC3576 = this.f30452;
            if (futureC3576 != null) {
                futureC3576.cancel(false);
            }
            this.f30452 = null;
            return;
        }
        C21565 c21565 = this.f30450;
        if (c21565 != null) {
            try {
                if (c12392.f37222 == c21565) {
                    InterfaceC7785 interfaceC7785 = c12392.f37322;
                    C4342 c4342 = this.f30447;
                    if (interfaceC7785 == c4342 && !c12392.f37256) {
                        Throwable thM30417 = c12392.m30417();
                        if (thM30417 != null) {
                            throw new C13452(thM30417);
                        }
                        if (this.f30453 != c12392.f37258 || this.f30449 != c4342.mo26548() || !c12392.m30399()) {
                            FutureC3575 futureC3577 = this.f30452;
                            if (futureC3577 != null) {
                                futureC3577.cancel(false);
                            }
                            this.f30452 = null;
                        }
                        if (c12392.m30399() && c12392.f37258.m9757()) {
                            if (this.f30452 == null) {
                                this.f30453 = c12392.f37258;
                                this.f30449 = c4342.mo26548();
                                this.f30452 = c12392.m30474((InterfaceC7785) c4342);
                            }
                            if (this.f30452.isDone()) {
                                this.f30452.m10930();
                                futureC3575.m10912((Object) null);
                                return;
                            }
                        }
                        C4925.m14316(this, 10L);
                        return;
                    }
                }
            } catch (Throwable th) {
                FutureC3575 futureC3578 = this.f30452;
                if (futureC3578 != null) {
                    futureC3578.cancel(false);
                }
                this.f30452 = null;
                futureC3575.m10914(th);
                return;
            }
        }
        throw new CancellationException("Session preparation is no longer active");
    }
}
