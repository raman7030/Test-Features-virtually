package p067l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۫ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13989 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ InterfaceC9768 f39480;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC5390 f39481;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ int f39482;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ long f39483;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14146 f39484;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ FutureC5767 f39485;

    public RunnableC13989(C14146 c14146, FutureC5767 futureC5767, InterfaceC9768 interfaceC9768, AbstractC5390 abstractC5390, int i, long j) {
        this.f39484 = c14146;
        this.f39485 = futureC5767;
        this.f39480 = interfaceC9768;
        this.f39481 = abstractC5390;
        this.f39482 = i;
        this.f39483 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C14146 c14146 = this.f39484;
        C8898 c8898 = c14146.f40252;
        FutureC5767 futureC5767 = this.f39485;
        if (futureC5767.isDone()) {
            return;
        }
        try {
            InterfaceC9768 interfaceC9768 = c14146.f40339;
            InterfaceC9768 interfaceC9769 = this.f39480;
            if (interfaceC9768 == interfaceC9769) {
                AbstractC5390 abstractC5390 = c14146.f40275;
                AbstractC5390 abstractC5391 = this.f39481;
                if (abstractC5390 == abstractC5391 && interfaceC9769.mo28581() == this.f39482) {
                    if (c14146.isAttachedToWindow() && c14146.f40262.f75992 && c8898.m20524() && interfaceC9769.length() != 0) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        long j = this.f39483;
                        if (jUptimeMillis < j) {
                            if (c14146.m32547() && ((!abstractC5391.mo11814() || c14146.m32543(abstractC5391)) && (c14146.f40261 == null || c14146.m32543(abstractC5391)))) {
                                int iMax = Math.max(0, c14146.m32472());
                                int iMax2 = Math.max(1, c14146.m32606());
                                long jMo11831 = abstractC5391.mo11831(iMax, iMax2);
                                if (jMo11831 >= 0) {
                                    int i2 = (int) (jMo11831 >>> 32);
                                    int i3 = (int) jMo11831;
                                    c8898.m20547(interfaceC9769, i2, i3);
                                    if (c8898.m20534(i2, i3)) {
                                        i = i3;
                                        long jMo11822 = abstractC5391.mo11822(iMax, iMax2);
                                        if (jMo11822 != 0) {
                                            c8898.m20539(interfaceC9769, (int) (jMo11822 >>> 32), (int) jMo11822);
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    if (c8898.m20543(i2, i)) {
                                        futureC5767.m12889((Object) null);
                                        return;
                                    }
                                }
                            }
                            C7050.m16213(this, Math.min(10L, Math.max(1L, j - SystemClock.uptimeMillis())));
                            return;
                        }
                    }
                    futureC5767.m12889((Object) null);
                    return;
                }
            }
            throw new CancellationException("Initial highlight preparation was superseded");
        } catch (Throwable th) {
            futureC5767.m12891(th);
        }
    }
}
