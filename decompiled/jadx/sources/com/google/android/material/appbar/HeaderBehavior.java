package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import l.C17648;
import l.C1814;
import l.C18333;

/* JADX INFO: loaded from: classes.dex */
public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public static final int INVALID_POINTER = -1;
    public int activePointerId;
    public Runnable flingRunnable;
    public boolean isBeingDragged;
    public int lastMotionY;
    public OverScroller scroller;
    public int touchSlop;
    public VelocityTracker velocityTracker;

    public boolean canDragView(View view) {
        return false;
    }

    public void onFlingFinished(C18333 c18333, View view) {
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    @Override // l.AbstractC6317
    public boolean onInterceptTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(c18333.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i = this.activePointerId;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = canDragView(view) && c18333.isPointInChildBounds(view, x, y2);
            this.isBeingDragged = z;
            if (z) {
                this.lastMotionY = y2;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[ADDED_TO_REGION] */
    @Override // l.AbstractC6317
    public boolean onTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.velocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.velocityTracker.computeCurrentVelocity(1000);
                fling(c18333, view, -getScrollRangeForDragFling(view), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                z = true;
            }
            this.isBeingDragged = false;
            this.activePointerId = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.isBeingDragged) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int i = this.lastMotionY - y;
            this.lastMotionY = y;
            scroll(c18333, view, i, getMaxDragOffset(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.activePointerId = motionEvent.getPointerId(i2);
                this.lastMotionY = (int) (motionEvent.getY(i2) + 0.5f);
            }
        }
        z = false;
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.isBeingDragged || z;
        z = false;
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.isBeingDragged) {
        }
    }

    public int setHeaderTopBottomOffset(C18333 c18333, View view, int i) {
        return setHeaderTopBottomOffset(c18333, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int setHeaderTopBottomOffset(C18333 c18333, View view, int i, int i2, int i3) {
        int iM6036;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (iM6036 = C1814.m6036(i, i2, i3))) {
            return 0;
        }
        setTopAndBottomOffset(iM6036);
        return topAndBottomOffset - iM6036;
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    public final int scroll(C18333 c18333, View view, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(c18333, view, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    public final boolean fling(C18333 c18333, View view, int i, int i2, float f) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(view.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.scroller.computeScrollOffset()) {
            FlingRunnable flingRunnable = new FlingRunnable(c18333, view);
            this.flingRunnable = flingRunnable;
            int i3 = C17648.f53953;
            view.postOnAnimation(flingRunnable);
            return true;
        }
        onFlingFinished(c18333, view);
        return false;
    }

    public int getMaxDragOffset(View view) {
        return -view.getHeight();
    }

    public int getScrollRangeForDragFling(View view) {
        return view.getHeight();
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public class FlingRunnable implements Runnable {
        public final View layout;
        public final C18333 parent;

        public FlingRunnable(C18333 c18333, View view) {
            this.parent = c18333;
            this.layout = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.layout == null || (overScroller = HeaderBehavior.this.scroller) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                HeaderBehavior headerBehavior = HeaderBehavior.this;
                headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
                View view = this.layout;
                int i = C17648.f53953;
                view.postOnAnimation(this);
                return;
            }
            HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
        }
    }
}
