package p067l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩵ۨ */
/* JADX INFO: compiled from: V32V */
/* JADX INFO: loaded from: classes4.dex */
public final class C1806 {

    /* JADX INFO: renamed from: ֫ */
    public static Map f65477 = C21562.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: ֫ */
    public static float m47068(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1771.m45617(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        C0861 c0861 = (C0861) f65477.get(velocityTracker);
        if (c0861 != null) {
            return c0861.m4241(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47069(VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0861 c0861 = (C0861) f65477.get(velocityTracker);
        if (c0861 != null) {
            c0861.m4242();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47070(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = f65477;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new C0861());
            }
            ((C0861) map.get(velocityTracker)).m4243(motionEvent);
        }
    }
}
