package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V32V */
/* JADX INFO: loaded from: classes4.dex */
public final class C19434 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map f62861 = C20195.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m44773(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C18728.m43350(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        C0382 c0382 = (C0382) f62861.get(velocityTracker);
        if (c0382 != null) {
            return c0382.m1850(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44774(VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0382 c0382 = (C0382) f62861.get(velocityTracker);
        if (c0382 != null) {
            c0382.m1851();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44775(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = f62861;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new C0382());
            }
            ((C0382) map.get(velocityTracker)).m1852(motionEvent);
        }
    }
}
