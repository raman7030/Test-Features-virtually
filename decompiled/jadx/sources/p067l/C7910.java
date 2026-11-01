package p067l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۛۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class C7910 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f20736 = true;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3847 f20737;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C7910(C3847 c3847) {
        this.f20737 = c3847;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18264() {
        this.f20736 = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM7556;
        AbstractC5462 childViewHolder;
        C3847 c3847 = this.f20737;
        AbstractC11934 abstractC11934 = c3847.f8274;
        if (!this.f20736 || (viewM7556 = c3847.m7556(motionEvent)) == null || (childViewHolder = c3847.f8256.getChildViewHolder(viewM7556)) == null) {
            return;
        }
        C14849 c14849 = c3847.f8256;
        int iMo5538 = abstractC11934.mo5538(childViewHolder);
        int i = C1717.f57146;
        if ((AbstractC11934.m27274(iMo5538, c14849.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i2 = c3847.f8268;
            if (pointerId == i2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c3847.f8280 = x;
                c3847.f8267 = y;
                c3847.f8283 = 0.0f;
                c3847.f8271 = 0.0f;
                if (abstractC11934.mo5541()) {
                    c3847.m7549(childViewHolder, 2);
                }
            }
        }
    }
}
