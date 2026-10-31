package l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۫ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12227 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7785 f36466;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3179 f36467;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36468;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f36469;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f36470;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC3575 f36471;

    public RunnableC12227(C12392 c12392, FutureC3575 futureC3575, InterfaceC7785 interfaceC7785, AbstractC3179 abstractC3179, int i, long j) {
        this.f36470 = c12392;
        this.f36471 = futureC3575;
        this.f36466 = interfaceC7785;
        this.f36467 = abstractC3179;
        this.f36468 = i;
        this.f36469 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C12392 c12392 = this.f36470;
        C6870 c6870 = c12392.f37235;
        FutureC3575 futureC3575 = this.f36471;
        if (futureC3575.isDone()) {
            return;
        }
        try {
            InterfaceC7785 interfaceC7785 = c12392.f37322;
            InterfaceC7785 interfaceC7786 = this.f36466;
            if (interfaceC7785 == interfaceC7786) {
                AbstractC3179 abstractC3179 = c12392.f37258;
                AbstractC3179 abstractC31710 = this.f36467;
                if (abstractC3179 == abstractC31710 && interfaceC7786.mo26548() == this.f36468) {
                    if (c12392.isAttachedToWindow() && c12392.f37245.f73267 && c6870.m18575() && interfaceC7786.length() != 0) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        long j = this.f36469;
                        if (jUptimeMillis < j) {
                            if (c12392.m30483() && ((!abstractC31710.mo9770() || c12392.m30479(abstractC31710)) && (c12392.f37244 == null || c12392.m30479(abstractC31710)))) {
                                int iMax = Math.max(0, c12392.m30408());
                                int iMax2 = Math.max(1, c12392.m30542());
                                long jMo9787 = abstractC31710.mo9787(iMax, iMax2);
                                if (jMo9787 >= 0) {
                                    int i2 = (int) (jMo9787 >>> 32);
                                    int i3 = (int) jMo9787;
                                    c6870.m18598(interfaceC7786, i2, i3);
                                    if (c6870.m18585(i2, i3)) {
                                        i = i3;
                                        long jMo9778 = abstractC31710.mo9778(iMax, iMax2);
                                        if (jMo9778 != 0) {
                                            c6870.m18590(interfaceC7786, (int) (jMo9778 >>> 32), (int) jMo9778);
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    if (c6870.m18594(i2, i)) {
                                        futureC3575.m10912((Object) null);
                                        return;
                                    }
                                }
                            }
                            C4925.m14316(this, Math.min(10L, Math.max(1L, j - SystemClock.uptimeMillis())));
                            return;
                        }
                    }
                    futureC3575.m10912((Object) null);
                    return;
                }
            }
            throw new CancellationException("Initial highlight preparation was superseded");
        } catch (Throwable th) {
            futureC3575.m10914(th);
        }
    }
}
