package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p067l.AbstractC10762;
import p067l.AbstractC1155;
import p067l.AbstractC1310;
import p067l.C1529;
import p067l.C1717;
import p067l.C17466;
import p067l.C1751;
import p067l.InterfaceC1100;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior extends AbstractC1155 {
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
    public C17466 viewDragHelper;
    public float sensitivity = 0.0f;
    public int swipeDirection = 2;
    public float dragDismissThreshold = 0.5f;
    public float alphaStartSwipeDistance = 0.0f;
    public float alphaEndSwipeDistance = 0.5f;
    public final AbstractC10762 dragCallback = new AbstractC10762() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        public static final int INVALID_POINTER_ID = -1;
        public int activePointerId = -1;
        public int originalCapturedViewLeft;

        @Override // p067l.AbstractC10762
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }

        @Override // p067l.AbstractC10762
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

        @Override // p067l.AbstractC10762
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // p067l.AbstractC10762
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
            if (SwipeDismissBehavior.this.viewDragHelper.m39815(i, view.getTop())) {
                SettleRunnable settleRunnable = SwipeDismissBehavior.this.new SettleRunnable(view, z);
                int i3 = C1717.f57146;
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
            int i = C1717.f57146;
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

        @Override // p067l.AbstractC10762
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // p067l.AbstractC10762
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            int i3 = C1717.f57146;
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

        @Override // p067l.AbstractC10762
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p067l.AbstractC10762
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

    @Override // p067l.AbstractC1155
    public boolean onLayoutChild(C1751 c1751, View view, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(c1751, view, i);
        int i2 = C1717.f57146;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            updateAccessibilityActions(view);
        }
        return zOnLayoutChild;
    }

    @Override // p067l.AbstractC1155
    public boolean onInterceptTouchEvent(C1751 c1751, View view, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = c1751.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (zIsPointInChildBounds) {
            ensureViewDragHelper(c1751);
            if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.m39817(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC1155
    public boolean onTouchEvent(C1751 c1751, View view, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.m39810(motionEvent);
        return true;
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        C17466 c17466M39795;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                c17466M39795 = C17466.m39794(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                c17466M39795 = C17466.m39795(viewGroup, this.dragCallback);
            }
            this.viewDragHelper = c17466M39795;
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
            C17466 c17466 = SwipeDismissBehavior.this.viewDragHelper;
            if (c17466 != null && c17466.m39822()) {
                View view = this.view;
                int i = C1717.f57146;
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
        C1717.m43583(1048576, view);
        if (canSwipeDismissView(view)) {
            C1717.m43554(view, C1529.f44377, null, new InterfaceC1100() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // p067l.InterfaceC1100
                public boolean perform(View view2, AbstractC1310 abstractC1310) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    int i = C1717.f57146;
                    boolean z = view2.getLayoutDirection() == 1;
                    int i2 = SwipeDismissBehavior.this.swipeDirection;
                    C1717.m43571((!(i2 == 0 && z) && (i2 != 1 || z)) ? view2.getWidth() : -view2.getWidth(), view2);
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
        C17466 c17466 = this.viewDragHelper;
        if (c17466 != null) {
            return c17466.m39823();
        }
        return 0;
    }
}
