package p067l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩳܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19567 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8838 f59561;

    public C19567(C8838 c8838, Context context) {
        this.f59561 = c8838;
        ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C8838 c8838 = this.f59561;
        if (c8838.isFocused()) {
            return false;
        }
        c8838.requestFocus();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C8838 c8838 = this.f59561;
        C6826 c6826 = c8838.f23995;
        int iM15623 = c6826.m15623(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c8838.m20443(), false);
        C12862 c12862 = c8838.f23986;
        if (c12862.m29468()) {
            if (c6826.m15636() || iM15623 < c12862.m29480() || iM15623 > c12862.m29466()) {
                c12862.m29454(iM15623, c6826.m15628());
                c8838.m20432(iM15623);
                c8838.m20438();
            } else {
                C8838.m20416(c8838);
            }
        } else {
            if (c12862.m29480() != iM15623 || c12862.m29474() != c6826.m15628()) {
                c12862.m29454(iM15623, c6826.m15628());
                c8838.m20432(iM15623);
            } else if (c6826.m15636()) {
                c8838.m20432(iM15623);
            } else {
                C8838.m20412(c8838, c8838.m20432(iM15623));
            }
            c8838.m20438();
        }
        c8838.m20413();
        c8838.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C8838 c8838 = this.f59561;
        C6826 c6826 = c8838.f23995;
        int iM15623 = c6826.m15623(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c8838.m20443(), false);
        C12862 c12862 = c8838.f23986;
        if (iM15623 >= c12862.m29477()) {
            return false;
        }
        if (!c12862.m29468() || c6826.m15636() || iM15623 < c12862.m29480() || iM15623 > c12862.m29466()) {
            c12862.m29471(iM15623, iM15623);
        }
        c8838.m20413();
        c8838.invalidate();
        C8838.m20412(c8838, c8838.m20432(iM15623));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (onDoubleTap(motionEvent)) {
            this.f59561.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C8838 c8838 = this.f59561;
        long jM20443 = c8838.m20443() + ((long) Math.round(f2));
        long jM15637 = c8838.f23995.m15637();
        if (jM20443 < 0) {
            jM20443 = 0;
        } else if (jM20443 > jM15637) {
            jM20443 = jM15637;
        }
        c8838.m20414();
        c8838.m20427(jM20443);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C8838 c8838 = this.f59561;
        c8838.f23998.m45429(c8838.m20443(), (int) (-f2), c8838.f23995.m15637(), c8838.f23989);
        c8838.m20414();
        c8838.invalidate();
        return true;
    }
}
