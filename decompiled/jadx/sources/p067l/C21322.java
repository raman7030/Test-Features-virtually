package p067l;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21322 implements InterfaceC22227 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C3847 f67235;

    public C21322(C3847 c3847) {
        this.f67235 = c3847;
    }

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13255(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C3847 c3847 = this.f67235;
        c3847.f8264.m5650(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C24003 c24003 = null;
        if (actionMasked == 0) {
            c3847.f8268 = motionEvent.getPointerId(0);
            c3847.f8280 = motionEvent.getX();
            c3847.f8267 = motionEvent.getY();
            VelocityTracker velocityTracker = c3847.f8269;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c3847.f8269 = VelocityTracker.obtain();
            if (c3847.f8257 == null) {
                ArrayList arrayList = c3847.f8278;
                if (!arrayList.isEmpty()) {
                    View viewM7556 = c3847.m7556(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C24003 c24004 = (C24003) arrayList.get(size);
                        if (c24004.f76224.itemView == viewM7556) {
                            c24003 = c24004;
                            break;
                        }
                    }
                }
                if (c24003 != null) {
                    AbstractC5462 abstractC5462 = c24003.f76224;
                    c3847.f8280 -= c24003.f76228;
                    c3847.f8267 -= c24003.f76222;
                    c3847.m7550(abstractC5462, true);
                    if (c3847.f8277.remove(abstractC5462.itemView)) {
                        c3847.f8274.mo27280(c3847.f8256, abstractC5462);
                    }
                    c3847.m7549(abstractC5462, c24003.f76221);
                    c3847.m7553(c3847.f8265, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c3847.f8268 = -1;
            c3847.m7549((AbstractC5462) null, 0);
        } else {
            int i = c3847.f8268;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c3847.m7546(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c3847.f8269;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c3847.f8257 != null;
    }

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ֫ */
    public final void mo13250(MotionEvent motionEvent) {
        C3847 c3847 = this.f67235;
        Runnable runnable = c3847.f8263;
        c3847.f8264.m5650(motionEvent);
        VelocityTracker velocityTracker = c3847.f8269;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c3847.f8268 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c3847.f8268);
        if (iFindPointerIndex >= 0) {
            c3847.m7546(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC5462 abstractC5462 = c3847.f8257;
        if (abstractC5462 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c3847.m7553(c3847.f8265, iFindPointerIndex, motionEvent);
                    c3847.m7548(abstractC5462);
                    c3847.f8256.removeCallbacks(runnable);
                    ((RunnableC23333) runnable).run();
                    c3847.f8256.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c3847.f8268) {
                    c3847.f8268 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c3847.m7553(c3847.f8265, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c3847.f8269;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c3847.m7549((AbstractC5462) null, 0);
        c3847.f8268 = -1;
    }

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ֫ */
    public final void mo13251(boolean z) {
        if (z) {
            this.f67235.m7549((AbstractC5462) null, 0);
        }
    }
}
