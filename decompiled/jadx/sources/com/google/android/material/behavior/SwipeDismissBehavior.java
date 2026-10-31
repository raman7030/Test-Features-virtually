package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import l.AbstractC6317;
import l.AbstractC8832;
import l.AbstractC9432;
import l.C13847;
import l.C15886;
import l.C17648;
import l.C18333;
import l.InterfaceC5198;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior extends AbstractC6317 {
    public static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    public static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    public static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    public boolean interceptingEvents;
    public OnDismissListener listener;
    public boolean requestingDisallowInterceptTouchEvent;
    public boolean sensitivitySet;
    public C15886 viewDragHelper;
    public float sensitivity = 0.0f;
    public int swipeDirection = 2;
    public float dragDismissThreshold = 0.5f;
    public float alphaStartSwipeDistance = 0.0f;
    public float alphaEndSwipeDistance = 0.5f;
    public final AbstractC8832 dragCallback = new AbstractC8832() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        public static final int INVALID_POINTER_ID = -1;
        public int activePointerId = -1;
        public int originalCapturedViewLeft;

        @Override // l.AbstractC8832
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }

        @Override // l.AbstractC8832
        public void onViewCaptured(View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // l.AbstractC8832
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // l.AbstractC8832
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.originalCapturedViewLeft;
                    if (left < i2) {
                        i = this.originalCapturedViewLeft - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.originalCapturedViewLeft - width;
                }
                z = true;
            } else {
                i = this.originalCapturedViewLeft;
                z = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.m37643(i, view.getTop())) {
                SettleRunnable settleRunnable = SwipeDismissBehavior.this.new SettleRunnable(view, z);
                int i3 = C17648.f53953;
                view.postOnAnimation(settleRunnable);
            } else {
                if (!z || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        private boolean shouldDismiss(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            int i = C17648.f53953;
            boolean z = view.getLayoutDirection() == 1;
            int i2 = SwipeDismissBehavior.this.swipeDirection;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    return f < 0.0f;
                }
                return f > 0.0f;
            }
            if (i2 == 1) {
                if (z) {
                    return f > 0.0f;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // l.AbstractC8832
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // l.AbstractC8832
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            int i3 = C17648.f53953;
            boolean z = view.getLayoutDirection() == 1;
            int i4 = SwipeDismissBehavior.this.swipeDirection;
            if (i4 == 0) {
                if (z) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i, width2);
        }

        @Override // l.AbstractC8832
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // l.AbstractC8832
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float fAbs = Math.abs(i - this.originalCapturedViewLeft);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, fAbs), 1.0f));
            }
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    public static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp(0.0f, f, 1.0f);
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    @Override // l.AbstractC6317
    public boolean onLayoutChild(C18333 c18333, View view, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(c18333, view, i);
        int i2 = C17648.f53953;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            updateAccessibilityActions(view);
        }
        return zOnLayoutChild;
    }

    @Override // l.AbstractC6317
    public boolean onInterceptTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = c18333.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (zIsPointInChildBounds) {
            ensureViewDragHelper(c18333);
            if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.m37645(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC6317
    public boolean onTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.m37638(motionEvent);
        return true;
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        C15886 c15886M37623;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                c15886M37623 = C15886.m37622(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                c15886M37623 = C15886.m37623(viewGroup, this.dragCallback);
            }
            this.viewDragHelper = c15886M37623;
        }
    }

    public class SettleRunnable implements Runnable {
        public final boolean dismiss;
        public final View view;

        public SettleRunnable(View view, boolean z) {
            this.view = view;
            this.dismiss = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            C15886 c15886 = SwipeDismissBehavior.this.viewDragHelper;
            if (c15886 != null && c15886.m37650()) {
                View view = this.view;
                int i = C17648.f53953;
                view.postOnAnimation(this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    private void updateAccessibilityActions(View view) {
        C17648.m41337(1048576, view);
        if (canSwipeDismissView(view)) {
            C17648.m41308(view, C13847.f41298, null, new InterfaceC5198() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // l.InterfaceC5198
                public boolean perform(View view2, AbstractC9432 abstractC9432) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    int i = C17648.f53953;
                    boolean z = view2.getLayoutDirection() == 1;
                    int i2 = SwipeDismissBehavior.this.swipeDirection;
                    C17648.m41325((!(i2 == 0 && z) && (i2 != 1 || z)) ? view2.getWidth() : -view2.getWidth(), view2);
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public int getDragState() {
        C15886 c15886 = this.viewDragHelper;
        if (c15886 != null) {
            return c15886.m37651();
        }
        return 0;
    }
}
