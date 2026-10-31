package l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩳܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18096 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f56349;

    public C18096(C6807 c6807, Context context) {
        this.f56349 = c6807;
        ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C6807 c6807 = this.f56349;
        if (c6807.isFocused()) {
            return false;
        }
        c6807.requestFocus();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C6807 c6807 = this.f56349;
        C4690 c4690 = c6807.f21118;
        int iM13748 = c4690.m13748(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c6807.m18494(), false);
        C11041 c11041 = c6807.f21109;
        if (c11041.m27406()) {
            if (c4690.m13761() || iM13748 < c11041.m27418() || iM13748 > c11041.m27404()) {
                c11041.m27392(iM13748, c4690.m13753());
                c6807.m18483(iM13748);
                c6807.m18489();
            } else {
                C6807.m18467(c6807);
            }
        } else {
            if (c11041.m27418() != iM13748 || c11041.m27412() != c4690.m13753()) {
                c11041.m27392(iM13748, c4690.m13753());
                c6807.m18483(iM13748);
            } else if (c4690.m13761()) {
                c6807.m18483(iM13748);
            } else {
                C6807.m18463(c6807, c6807.m18483(iM13748));
            }
            c6807.m18489();
        }
        c6807.m18464();
        c6807.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C6807 c6807 = this.f56349;
        C4690 c4690 = c6807.f21118;
        int iM13748 = c4690.m13748(motionEvent.getX(), ((long) ((int) motionEvent.getY())) + c6807.m18494(), false);
        C11041 c11041 = c6807.f21109;
        if (iM13748 >= c11041.m27415()) {
            return false;
        }
        if (!c11041.m27406() || c4690.m13761() || iM13748 < c11041.m27418() || iM13748 > c11041.m27404()) {
            c11041.m27409(iM13748, iM13748);
        }
        c6807.m18464();
        c6807.invalidate();
        C6807.m18463(c6807, c6807.m18483(iM13748));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (onDoubleTap(motionEvent)) {
            this.f56349.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C6807 c6807 = this.f56349;
        long jM18494 = c6807.m18494() + ((long) Math.round(f2));
        long jM13762 = c6807.f21118.m13762();
        if (jM18494 < 0) {
            jM18494 = 0;
        } else if (jM18494 > jM13762) {
            jM18494 = jM13762;
        }
        c6807.m18465();
        c6807.m18478(jM18494);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        C6807 c6807 = this.f56349;
        c6807.f21121.m43164(c6807.m18494(), (int) (-f2), c6807.f21118.m13762(), c6807.f21112);
        c6807.m18465();
        c6807.invalidate();
        return true;
    }
}
