package p067l;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۤۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4KI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12063 extends AbstractRunnableC8039 {
    @Override // p067l.AbstractRunnableC8039
    /* JADX INFO: renamed from: ֫ */
    public final void mo18633() {
        C4016 c4016 = this.f21153;
        long jM55467 = c4016.f8766.m55467(c4016.f8776);
        if (jM55467 >= 0) {
            this.f21153.f8764 = SystemClock.uptimeMillis() + jM55467;
            if (this.f21153.isVisible() && this.f21153.f8770) {
                C4016 c4017 = this.f21153;
                if (!c4017.f8762) {
                    c4017.f8775.remove(this);
                    C4016 c4018 = this.f21153;
                    c4018.f8771 = c4018.f8775.schedule(this, jM55467, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f21153.f8769.isEmpty() && this.f21153.f8766.m55480() == this.f21153.f8766.m55479() - 1) {
                C4016 c4019 = this.f21153;
                HandlerC5357 handlerC5357 = c4019.f8763;
                GifInfoHandle gifInfoHandle = c4019.f8766;
                int iM55483 = gifInfoHandle.m55483();
                if (iM55483 != 0 && iM55483 >= gifInfoHandle.m55489()) {
                    iM55483--;
                }
                handlerC5357.sendEmptyMessageAtTime(iM55483, this.f21153.f8764);
            }
        } else {
            C4016 c40110 = this.f21153;
            c40110.f8764 = Long.MIN_VALUE;
            c40110.f8770 = false;
        }
        if (!this.f21153.isVisible() || this.f21153.f8763.hasMessages(-1)) {
            return;
        }
        this.f21153.f8763.sendEmptyMessageAtTime(-1, 0L);
    }
}
