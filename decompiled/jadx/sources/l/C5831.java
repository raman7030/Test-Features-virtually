package l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۛۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class C5831 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f17884 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1556 f17885;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C5831(C1556 c1556) {
        this.f17885 = c1556;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16339() {
        this.f17884 = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM5327;
        AbstractC3255 childViewHolder;
        C1556 c1556 = this.f17885;
        AbstractC10065 abstractC10065 = c1556.f5493;
        if (!this.f17884 || (viewM5327 = c1556.m5327(motionEvent)) == null || (childViewHolder = c1556.f5475.getChildViewHolder(viewM5327)) == null) {
            return;
        }
        C13132 c13132 = c1556.f5475;
        int iMo3224 = abstractC10065.mo3224(childViewHolder);
        int i = C17648.f53953;
        if ((AbstractC10065.m25257(iMo3224, c13132.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i2 = c1556.f5487;
            if (pointerId == i2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c1556.f5499 = x;
                c1556.f5486 = y;
                c1556.f5502 = 0.0f;
                c1556.f5490 = 0.0f;
                if (abstractC10065.mo3227()) {
                    c1556.m5320(childViewHolder, 2);
                }
            }
        }
    }
}
