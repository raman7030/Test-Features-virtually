package p067l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ܰ۟ */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1520 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractViewOnTouchListenerC1205 f43825;

    public RunnableC1520(AbstractViewOnTouchListenerC1205 abstractViewOnTouchListenerC1205) {
        this.f43825 = abstractViewOnTouchListenerC1205;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractViewOnTouchListenerC1205 abstractViewOnTouchListenerC1205 = this.f43825;
        View view = abstractViewOnTouchListenerC1205.f25356;
        C1975 c1975 = abstractViewOnTouchListenerC1205.f25351;
        if (abstractViewOnTouchListenerC1205.f25357) {
            if (abstractViewOnTouchListenerC1205.f25360) {
                abstractViewOnTouchListenerC1205.f25360 = false;
                c1975.m53347();
            }
            if (!c1975.m53345()) {
                int iM53346 = c1975.m53346();
                c1975.m53344();
                if (iM53346 != 0 && abstractViewOnTouchListenerC1205.mo21572(iM53346)) {
                    if (abstractViewOnTouchListenerC1205.f25352) {
                        abstractViewOnTouchListenerC1205.f25352 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    c1975.m53339();
                    abstractViewOnTouchListenerC1205.mo21573(c1975.m53342());
                    int i = C1717.f57146;
                    view.postOnAnimation(this);
                    return;
                }
            }
            abstractViewOnTouchListenerC1205.f25357 = false;
        }
    }
}
