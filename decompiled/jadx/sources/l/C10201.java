package l;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۤۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4KI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10201 extends AbstractRunnableC5967 {
    @Override // l.AbstractRunnableC5967
    /* JADX INFO: renamed from: ֫ */
    public final void mo16707() {
        C1734 c1734 = this.f18300;
        long jM52903 = c1734.f5989.m52903(c1734.f5999);
        if (jM52903 >= 0) {
            this.f18300.f5987 = SystemClock.uptimeMillis() + jM52903;
            if (this.f18300.isVisible() && this.f18300.f5993) {
                C1734 c1735 = this.f18300;
                if (!c1735.f5985) {
                    c1735.f5998.remove(this);
                    C1734 c1736 = this.f18300;
                    c1736.f5994 = c1736.f5998.schedule(this, jM52903, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f18300.f5992.isEmpty() && this.f18300.f5989.m52916() == this.f18300.f5989.m52915() - 1) {
                C1734 c1737 = this.f18300;
                HandlerC3145 handlerC3145 = c1737.f5986;
                GifInfoHandle gifInfoHandle = c1737.f5989;
                int iM52919 = gifInfoHandle.m52919();
                if (iM52919 != 0 && iM52919 >= gifInfoHandle.m52925()) {
                    iM52919--;
                }
                handlerC3145.sendEmptyMessageAtTime(iM52919, this.f18300.f5987);
            }
        } else {
            C1734 c1738 = this.f18300;
            c1738.f5987 = Long.MIN_VALUE;
            c1738.f5993 = false;
        }
        if (!this.f18300.isVisible() || this.f18300.f5986.hasMessages(-1)) {
            return;
        }
        this.f18300.f5986.sendEmptyMessageAtTime(-1, 0L);
    }
}
