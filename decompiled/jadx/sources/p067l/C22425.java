package p067l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩷᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22425 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6331 f70764;

    public C22425(C6331 c6331) {
        this.f70764 = c6331;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        C2977 c2977 = this.f70764.f16411;
        if (c2977.f5227.isFinished()) {
            return false;
        }
        c2977.f5227.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C2977 c2977 = this.f70764.f16411;
        c2977.f5224 = 0.0f;
        if (c2977.f5237 == null) {
            return true;
        }
        if (c2977.f5223) {
            int i = ((int) (c2977.f5240.y / c2977.f5236.f52953)) + c2977.f5245;
            if (c2977.f5221 - 1 <= i && i <= c2977.f5230 + 1) {
                c2977.f5222.mo10774(c2977.f5237.m43493(c2977.f5250, c2977.f5221, c2977.f5251, c2977.f5230).trim());
            }
            c2977.m4988((MotionEvent) null);
            return true;
        }
        c2977.requestFocus();
        c2977.f5228.mo6924();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C2977 c2977 = this.f70764.f16411;
        if (c2977.f5237 == null) {
            return true;
        }
        float f3 = f2 + c2977.f5224;
        int i = (int) (f3 / c2977.f5236.f52953);
        c2977.f5224 = f3 - (c2977.f5236.f52953 * i);
        c2977.m4962(i);
        if (i < 0) {
            if (motionEvent2 == null || c2977.f5245 > (-c2977.f5237.m43507().m9120())) {
                return true;
            }
            C24587.m54228(c2977.f5234, (-f3) / c2977.getHeight(), motionEvent2.getX() / c2977.getWidth());
            c2977.postInvalidateOnAnimation();
            if (c2977.f5252.isFinished()) {
                return true;
            }
            c2977.f5252.onRelease();
            return true;
        }
        if (i <= 0 || motionEvent2 == null || c2977.f5245 < 0) {
            return true;
        }
        C24587.m54228(c2977.f5252, f3 / c2977.getHeight(), 1.0f - (motionEvent2.getX() / c2977.getWidth()));
        c2977.postInvalidateOnAnimation();
        if (c2977.f5234.isFinished()) {
            return true;
        }
        c2977.f5234.onRelease();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C2977 c2977 = this.f70764.f16411;
        c2977.performHapticFeedback(0);
        c2977.f5223 = false;
        c2977.m4988(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6331 c6331 = this.f70764;
        C2977 c2977 = c6331.f16411;
        if (c2977.f5237 == null) {
            return true;
        }
        float f3 = 1.0f / c2977.f5236.f52953;
        c2977.f5227.fling(0, (int) Math.ceil(c2977.f5245 / f3), 0, (int) ((-f2) * 1.2f), 0, 0, (int) (-Math.ceil(c2977.f5237.m43507().m9120() / f3)), 0);
        c2977.post(new RunnableC4990(c6331, f3));
        return true;
    }
}
