package com.google.android.material.bottomsheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l.AbstractC6317;
import l.AbstractC7152;
import l.AbstractC8832;
import l.AbstractC9432;
import l.C11007;
import l.C13847;
import l.C14077;
import l.C15886;
import l.C17648;
import l.C17931;
import l.C1814;
import l.C18333;
import l.C18637;
import l.C19343;
import l.C19370;
import l.C20118;
import l.C21610;
import l.C23575;
import l.C3820;
import l.C9045;
import l.InterfaceC5198;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior extends AbstractC6317 implements MaterialBackHandler {
    public static final int CORNER_ANIMATION_DURATION = 500;
    public static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int DEF_STYLE_RES = C18637.f58679;
    public static final float HIDE_FRICTION = 0.1f;
    public static final float HIDE_THRESHOLD = 0.5f;
    public static final int INVALID_POSITION = -1;
    public static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    public static final String TAG = "BottomSheetBehavior";
    public static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    public static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    public WeakReference accessibilityDelegateViewRef;
    public int activePointerId;
    public ColorStateList backgroundTint;
    public MaterialBottomContainerBackHelper bottomContainerBackHelper;
    public final ArrayList callbacks;
    public int childHeight;
    public int collapsedOffset;
    public final AbstractC8832 dragCallback;
    public boolean draggable;
    public float elevation;
    public final SparseIntArray expandHalfwayActionIds;
    public boolean expandedCornersRemoved;
    public int expandedOffset;
    public boolean fitToContents;
    public int fitToContentsOffset;
    public int gestureInsetBottom;
    public boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio;
    public float hideFriction;
    public boolean hideable;
    public boolean ignoreEvents;
    public Map importantForAccessibilityMap;
    public int initialY;
    public int insetBottom;
    public int insetTop;
    public ValueAnimator interpolatorAnimator;
    public int lastNestedScrollDy;
    public int lastStableState;
    public boolean marginLeftSystemWindowInsets;
    public boolean marginRightSystemWindowInsets;
    public boolean marginTopSystemWindowInsets;
    public MaterialShapeDrawable materialShapeDrawable;
    public int maxHeight;
    public int maxWidth;
    public float maximumVelocity;
    public boolean nestedScrolled;
    public WeakReference nestedScrollingChildRef;
    public boolean paddingBottomSystemWindowInsets;
    public boolean paddingLeftSystemWindowInsets;
    public boolean paddingRightSystemWindowInsets;
    public boolean paddingTopSystemWindowInsets;
    public int parentHeight;
    public int parentWidth;
    public int peekHeight;
    public boolean peekHeightAuto;
    public int peekHeightGestureInsetBuffer;
    public int peekHeightMin;
    public int saveFlags;
    public ShapeAppearanceModel shapeAppearanceModelDefault;
    public boolean shouldRemoveExpandedCorners;
    public int significantVelocityThreshold;
    public boolean skipCollapsed;
    public int state;
    public final StateSettlingTracker stateSettlingTracker;
    public boolean touchingScrollingChild;
    public boolean updateImportantForAccessibilityOnSiblings;
    public VelocityTracker velocityTracker;
    public C15886 viewDragHelper;
    public WeakReference viewRef;

    public abstract class BottomSheetCallback {
        public void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // l.AbstractC6317
    public void onNestedScroll(C18333 c18333, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
        return false;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new AbstractC8832() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            public long viewCapturedMillis;

            @Override // l.AbstractC8832
            public boolean tryCaptureView(View view, int i) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = bottomSheetBehavior.state;
                if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.activePointerId == i) {
                    WeakReference weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }

            @Override // l.AbstractC8832
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            @Override // l.AbstractC8832
            public void onViewDragStateChanged(int i) {
                if (i == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            /* JADX WARN: Code duplicated, block: B:54:0x0103  */
            /* JADX WARN: Code duplicated, block: B:62:0x0127  */
            @Override // l.AbstractC8832
            public void onViewReleased(View view, float f, float f2) {
                int i = 6;
                if (f2 < 0.0f) {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i = 3;
                    } else {
                        int top = view.getTop();
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                        if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                            if (!bottomSheetBehavior.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top * 100.0f) / bottomSheetBehavior.parentHeight)) {
                                i = 4;
                            }
                        } else if (top <= BottomSheetBehavior.this.halfExpandedOffset) {
                        }
                        i = 3;
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior2.hideable && bottomSheetBehavior2.shouldHide(view, f2)) {
                        if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                            i = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                            i = 3;
                        }
                    } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                        if (BottomSheetBehavior.this.fitToContents) {
                            i = 4;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i = 4;
                            }
                        }
                    } else {
                        int top3 = view.getTop();
                        if (BottomSheetBehavior.this.fitToContents) {
                            if (Math.abs(top3 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                                i = 3;
                            } else {
                                i = 4;
                            }
                        } else {
                            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                            int i2 = bottomSheetBehavior3.halfExpandedOffset;
                            if (top3 < i2) {
                                if (top3 < Math.abs(top3 - bottomSheetBehavior3.collapsedOffset)) {
                                    i = 3;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i = 4;
                                }
                            } else if (Math.abs(top3 - i2) >= Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i = 4;
                            }
                        }
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // l.AbstractC8832
            public int clampViewPositionVertical(View view, int i, int i2) {
                return C1814.m6036(i, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // l.AbstractC8832
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // l.AbstractC8832
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new AbstractC8832() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            public long viewCapturedMillis;

            @Override // l.AbstractC8832
            public boolean tryCaptureView(View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.state;
                if (i3 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    WeakReference weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }

            @Override // l.AbstractC8832
            public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.dispatchOnSlide(i3);
            }

            @Override // l.AbstractC8832
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            /* JADX WARN: Code duplicated, block: B:54:0x0103  */
            /* JADX WARN: Code duplicated, block: B:62:0x0127  */
            @Override // l.AbstractC8832
            public void onViewReleased(View view, float f, float f2) {
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                        if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                            if (!bottomSheetBehavior.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top * 100.0f) / bottomSheetBehavior.parentHeight)) {
                                i2 = 4;
                            }
                        } else if (top <= BottomSheetBehavior.this.halfExpandedOffset) {
                        }
                        i2 = 3;
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior2.hideable && bottomSheetBehavior2.shouldHide(view, f2)) {
                        if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                            i2 = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                            i2 = 3;
                        }
                    } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                        if (BottomSheetBehavior.this.fitToContents) {
                            i2 = 4;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i2 = 4;
                            }
                        }
                    } else {
                        int top3 = view.getTop();
                        if (BottomSheetBehavior.this.fitToContents) {
                            if (Math.abs(top3 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                                i2 = 3;
                            } else {
                                i2 = 4;
                            }
                        } else {
                            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                            int i3 = bottomSheetBehavior3.halfExpandedOffset;
                            if (top3 < i3) {
                                if (top3 < Math.abs(top3 - bottomSheetBehavior3.collapsedOffset)) {
                                    i2 = 3;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i2 = 4;
                                }
                            } else if (Math.abs(top3 - i3) >= Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i2 = 4;
                            }
                        }
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i2, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // l.AbstractC8832
            public int clampViewPositionVertical(View view, int i2, int i3) {
                return C1814.m6036(i2, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // l.AbstractC8832
            public int clampViewPositionHorizontal(View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // l.AbstractC8832
            public int getViewVerticalDragRange(View view) {
                if (BottomSheetBehavior.this.canBeHiddenByDragging()) {
                    return BottomSheetBehavior.this.parentHeight;
                }
                return BottomSheetBehavior.this.collapsedOffset;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(C23575.f76094);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19343.f62316);
        if (typedArrayObtainStyledAttributes.hasValue(C19343.f61463)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f61463);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C19343.f62185)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, C17931.f54787, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C19343.f60879, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(C19343.f60932)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f60932, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C19343.f61251)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f61251, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C19343.f61092);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f61092, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(C19343.f61198, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(C19343.f61304, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(C19343.f62528, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(C19343.f61622, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(C19343.f61995, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(C19343.f61835, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(C19343.f62369, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(C19343.f62475);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f62475, 0));
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(C19343.f61782, 500));
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f61410, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f60961, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f61651, false);
        this.paddingTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f62077, true);
        this.marginLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f61729, false);
        this.marginRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f62581, false);
        this.marginTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f61888, false);
        this.shouldRemoveExpandedCorners = typedArrayObtainStyledAttributes.getBoolean(C19343.f61917, true);
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // l.AbstractC6317
    public Parcelable onSaveInstanceState(C18333 c18333, View view) {
        return new SavedState(super.onSaveInstanceState(c18333, view), this);
    }

    @Override // l.AbstractC6317
    public void onRestoreInstanceState(C18333 c18333, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c18333, view, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i;
            this.lastStableState = i;
        }
    }

    @Override // l.AbstractC6317
    public void onAttachedToLayoutParams(C14077 c14077) {
        super.onAttachedToLayoutParams(c14077);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // l.AbstractC6317
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // l.AbstractC6317
    public boolean onMeasureChild(C18333 c18333, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, c18333.getPaddingRight() + c18333.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, c18333.getPaddingBottom() + c18333.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // l.AbstractC6317
    public boolean onLayoutChild(C18333 c18333, View view, int i) {
        int i2 = C17648.f53953;
        if (c18333.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = c18333.getResources().getDimensionPixelSize(C23575.f75889);
            setWindowInsetsListener(view);
            C17648.m41307(view, new InsetsAnimationCallback(view));
            this.viewRef = new WeakReference(view);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(view);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable == null) {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    C17648.m41303(view, colorStateList);
                }
            } else {
                view.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float fM41320 = this.elevation;
                if (fM41320 == -1.0f) {
                    fM41320 = C17648.m41320(view);
                }
                materialShapeDrawable2.setElevation(fM41320);
            }
            updateAccessibilityActions();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = C15886.m37623(c18333, this.dragCallback);
        }
        int top = view.getTop();
        c18333.onLayoutChild(view, i);
        this.parentWidth = c18333.getWidth();
        this.parentHeight = c18333.getHeight();
        int height = view.getHeight();
        this.childHeight = height;
        int iMin = this.parentHeight;
        int i3 = iMin - height;
        int i4 = this.insetTop;
        if (i3 < i4) {
            if (this.paddingTopSystemWindowInsets) {
                int i5 = this.maxHeight;
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.childHeight = iMin;
            } else {
                int iMin2 = iMin - i4;
                int i6 = this.maxHeight;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.childHeight = iMin2;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i7 = this.state;
        if (i7 == 3) {
            C17648.m41332(getExpandedOffset(), view);
        } else if (i7 == 6) {
            C17648.m41332(this.halfExpandedOffset, view);
        } else if (this.hideable && i7 == 5) {
            C17648.m41332(this.parentHeight, view);
        } else if (i7 == 4) {
            C17648.m41332(this.collapsedOffset, view);
        } else if (i7 == 1 || i7 == 2) {
            C17648.m41332(top - view.getTop(), view);
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference(findScrollingChild(view));
        for (int i8 = 0; i8 < this.callbacks.size(); i8++) {
            ((BottomSheetCallback) this.callbacks.get(i8)).onLayout(view);
        }
        return true;
    }

    @Override // l.AbstractC6317
    public boolean onInterceptTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        int i;
        C15886 c15886;
        if (!view.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference weakReference = this.nestedScrollingChildRef;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && c18333.isPointInChildBounds(view2, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !c18333.isPointInChildBounds(view, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (c15886 = this.viewDragHelper) != null && c15886.m37645(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.nestedScrollingChildRef;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.ignoreEvents || this.state == 1 || c18333.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i = this.initialY) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.viewDragHelper.m37640())) ? false : true;
    }

    @Override // l.AbstractC6317
    public boolean onTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.m37638(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.m37640()) {
            this.viewDragHelper.m37637(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
        }
        return !this.ignoreEvents;
    }

    @Override // l.AbstractC6317
    public boolean onStartNestedScroll(C18333 c18333, View view, View view2, View view3, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    @Override // l.AbstractC6317
    public void onNestedPreScroll(C18333 c18333, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.nestedScrollingChildRef;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view2 == view3) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    C17648.m41332(-expandedOffset, view);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    C17648.m41332(-i2, view);
                    setStateInternal(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                if (i4 <= this.collapsedOffset || canBeHiddenByDragging()) {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    C17648.m41332(-i2, view);
                    setStateInternal(1);
                } else {
                    int i5 = top - this.collapsedOffset;
                    iArr[1] = i5;
                    C17648.m41332(-i5, view);
                    setStateInternal(4);
                }
            }
            dispatchOnSlide(view.getTop());
            this.lastNestedScrollDy = i2;
            this.nestedScrolled = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    @Override // l.AbstractC6317
    public void onStopNestedScroll(C18333 c18333, View view, View view2, int i) {
        WeakReference weakReference;
        int i2 = 3;
        if (view.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view2 == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents && view.getTop() > this.halfExpandedOffset) {
                    i2 = 6;
                }
            } else if (this.hideable && shouldHide(view, getYVelocity())) {
                i2 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = view.getTop();
                if (this.fitToContents) {
                    if (Math.abs(top - this.fitToContentsOffset) >= Math.abs(top - this.collapsedOffset)) {
                        i2 = 4;
                    }
                } else {
                    int i3 = this.halfExpandedOffset;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.collapsedOffset)) {
                            if (shouldSkipHalfExpandedStateWhenDragging()) {
                                i2 = 4;
                            } else {
                                i2 = 6;
                            }
                        }
                    } else if (Math.abs(top - i3) < Math.abs(top - this.collapsedOffset)) {
                        i2 = 6;
                    } else {
                        i2 = 4;
                    }
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.halfExpandedOffset) < Math.abs(top2 - this.collapsedOffset)) {
                        i2 = 6;
                    }
                }
                i2 = 4;
            }
            startSettling(view, i2, false);
            this.nestedScrolled = false;
        }
    }

    @Override // l.AbstractC6317
    public boolean onNestedPreFling(C18333 c18333, View view, View view2, float f, float f2) {
        WeakReference weakReference;
        return isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view2 == weakReference.get() && (this.state != 3 || super.onNestedPreFling(c18333, view, view2, f, f2));
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public final void setPeekHeight(int i, boolean z) {
        if (i == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        View view;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (view = (View) this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                setState(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public void setHalfExpandedRatio(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i;
        updateDrawableForTargetState(this.state, true);
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float calculateSlideOffset() {
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(((View) this.viewRef.get()).getTop());
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public void setSignificantVelocityThreshold(int i) {
        this.significantVelocityThreshold = i;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(C9045.m23341(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.hideable || i != 5) {
            final int i2 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
            WeakReference weakReference = this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                setStateInternal(i);
            } else {
                final View view = (View) this.viewRef.get();
                runAfterLayout(view, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BottomSheetBehavior.this.startSettling(view, i2, false);
                    }
                });
            }
        }
    }

    private void runAfterLayout(View view, Runnable runnable) {
        if (isLayouting(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean isLayouting(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested()) {
            return false;
        }
        int i = C17648.f53953;
        return view.isAttachedToWindow();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        if (this.shouldRemoveExpandedCorners != z) {
            this.shouldRemoveExpandedCorners = z;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    public int getState() {
        return this.state;
    }

    public void setStateInternal(int i) {
        View view;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.lastStableState = i;
        }
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i, true);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            ((BottomSheetCallback) this.callbacks.get(i2)).onStateChanged(view, i);
        }
        updateAccessibilityActions();
    }

    private void updateDrawableForTargetState(int i, boolean z) {
        boolean zIsExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i == 2 || this.expandedCornersRemoved == (zIsExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = zIsExpandedAndShouldRemoveCorners;
        if (z && (valueAnimator = this.interpolatorAnimator) != null) {
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            } else {
                this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.getInterpolation(), zIsExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
                this.interpolatorAnimator.start();
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.interpolatorAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.interpolatorAnimator.cancel();
        }
        this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
    }

    private float calculateCornerInterpolation(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private boolean isAtTopOfScreen() {
        WeakReference weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.viewRef.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3) {
            return this.shouldRemoveExpandedCorners || isAtTopOfScreen();
        }
        return false;
    }

    private int calculatePeekHeight() {
        int i;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i = this.gestureInsetBottom) > 0) {
            return Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
        }
        return this.peekHeight + this.insetBottom;
    }

    private void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - iCalculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private float calculateSlideOffsetWithTop(int i) {
        float f;
        float expandedOffset;
        int i2 = this.collapsedOffset;
        if (i > i2 || i2 == getExpandedOffset()) {
            int i3 = this.collapsedOffset;
            f = i3 - i;
            expandedOffset = this.parentHeight - i3;
        } else {
            int i4 = this.collapsedOffset;
            f = i4 - i;
            expandedOffset = i4 - getExpandedOffset();
        }
        return f / expandedOffset;
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    public boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f * this.hideFriction) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(C20118 c20118) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(c20118);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(C20118 c20118) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(c20118);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        C20118 c20118OnHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (c20118OnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.hideable ? 5 : 4);
        } else if (this.hideable) {
            this.bottomContainerBackHelper.finishBackProgressNotPersistent(c20118OnHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.setStateInternal(5);
                    WeakReference weakReference = BottomSheetBehavior.this.viewRef;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    ((View) BottomSheetBehavior.this.viewRef.get()).requestLayout();
                }
            });
        } else {
            this.bottomContainerBackHelper.finishBackProgressPersistent(c20118OnHandleBackInvoked, null);
            setState(4);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    public MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C17648.m41338(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    private void setWindowInsetsListener(View view) {
        final boolean z = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Code duplicated, block: B:33:0x009a  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                public C21610 onApplyWindowInsets(View view2, C21610 c21610, ViewUtils.RelativePadding relativePadding) {
                    boolean z2;
                    C11007 c11007M48815 = c21610.m48815(7);
                    C11007 c11007M48816 = c21610.m48815(32);
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i = c11007M48815.f33111;
                    int i2 = c11007M48815.f33110;
                    int i3 = c11007M48815.f33109;
                    bottomSheetBehavior.insetTop = i;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                    int paddingBottom = view2.getPaddingBottom();
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        BottomSheetBehavior.this.insetBottom = c21610.m48835();
                        paddingBottom = relativePadding.bottom + BottomSheetBehavior.this.insetBottom;
                    }
                    if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        paddingLeft = (zIsLayoutRtl ? relativePadding.end : relativePadding.start) + i3;
                    }
                    if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        paddingRight = (zIsLayoutRtl ? relativePadding.start : relativePadding.end) + i2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    boolean z3 = true;
                    if (!BottomSheetBehavior.this.marginLeftSystemWindowInsets || marginLayoutParams.leftMargin == i3) {
                        z2 = false;
                    } else {
                        marginLayoutParams.leftMargin = i3;
                        z2 = true;
                    }
                    if (BottomSheetBehavior.this.marginRightSystemWindowInsets && marginLayoutParams.rightMargin != i2) {
                        marginLayoutParams.rightMargin = i2;
                        z2 = true;
                    }
                    if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                        int i4 = marginLayoutParams.topMargin;
                        int i5 = c11007M48815.f33111;
                        if (i4 != i5) {
                            marginLayoutParams.topMargin = i5;
                        } else {
                            z3 = z2;
                        }
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        view2.setLayoutParams(marginLayoutParams);
                    }
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z) {
                        BottomSheetBehavior.this.gestureInsetBottom = c11007M48816.f33108;
                    }
                    if (!BottomSheetBehavior.this.paddingBottomSystemWindowInsets && !z) {
                        return c21610;
                    }
                    BottomSheetBehavior.this.updatePeekHeight(false);
                    return c21610;
                }
            });
        }
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z) {
        int topOffsetForState = getTopOffsetForState(i);
        C15886 c15886 = this.viewDragHelper;
        if (c15886 != null && (!z ? c15886.m37639(view, view.getLeft(), topOffsetForState) : c15886.m37643(view.getLeft(), topOffsetForState))) {
            setStateInternal(2);
            updateDrawableForTargetState(i, true);
            this.stateSettlingTracker.continueSettlingToState(i);
            return;
        }
        setStateInternal(i);
    }

    private int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.collapsedOffset;
        }
        if (i == 5) {
            return this.parentHeight;
        }
        if (i == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException(C19370.m44628(i, "Invalid state to get top offset: "));
    }

    public void dispatchOnSlide(int i) {
        View view = (View) this.viewRef.get();
        if (view == null || this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            ((BottomSheetCallback) this.callbacks.get(i2)).onSlide(view, fCalculateSlideOffsetWithTop);
        }
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    public void setHideableInternal(boolean z) {
        this.hideable = z;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public class StateSettlingTracker {
        public final Runnable continueSettlingRunnable;
        public boolean isContinueSettlingRunnablePosted;
        public int targetState;

        public StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    C15886 c15886 = BottomSheetBehavior.this.viewDragHelper;
                    if (c15886 != null && c15886.m37650()) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            View view = (View) BottomSheetBehavior.this.viewRef.get();
            Runnable runnable = this.continueSettlingRunnable;
            int i2 = C17648.f53953;
            view.postOnAnimation(runnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public class SavedState extends AbstractC7152 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = bottomSheetBehavior.peekHeight;
            this.fitToContents = bottomSheetBehavior.fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = bottomSheetBehavior.skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // l.AbstractC7152, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }
    }

    public static BottomSheetBehavior from(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C14077)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC6317 abstractC6317M33687 = ((C14077) layoutParams).m33687();
        if (!(abstractC6317M33687 instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior) abstractC6317M33687;
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    private void updateImportantForAccessibility(boolean z) {
        Map map;
        int iIntValue;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof C18333) {
            C18333 c18333 = (C18333) parent;
            int childCount = c18333.getChildCount();
            if (z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = c18333.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (z) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            int i2 = C17648.f53953;
                            iIntValue = 4;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        iIntValue = ((Integer) this.importantForAccessibilityMap.get(childAt)).intValue();
                        int i3 = C17648.f53953;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
            if (!z) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                ((View) this.viewRef.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public void setAccessibilityDelegateView(View view) {
        WeakReference weakReference;
        if (view == null && (weakReference = this.accessibilityDelegateViewRef) != null) {
            clearAccessibilityAction((View) weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        } else {
            this.accessibilityDelegateViewRef = new WeakReference(view);
            updateAccessibilityActions(view, 1);
        }
    }

    private void updateAccessibilityActions() {
        WeakReference weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions((View) weakReference2.get(), 1);
        }
    }

    private void updateAccessibilityActions(View view, int i) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, C3820.f12213, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, C13847.f41298, 5);
        }
        int i2 = this.state;
        if (i2 == 3) {
            replaceAccessibilityActionForState(view, C13847.f41306, this.fitToContents ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            replaceAccessibilityActionForState(view, C13847.f41305, this.fitToContents ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            replaceAccessibilityActionForState(view, C13847.f41306, 4);
            replaceAccessibilityActionForState(view, C13847.f41305, 3);
        }
    }

    private void clearAccessibilityAction(View view, int i) {
        if (view == null) {
            return;
        }
        C17648.m41337(524288, view);
        C17648.m41337(262144, view);
        C17648.m41337(1048576, view);
        int i2 = this.expandHalfwayActionIds.get(i, -1);
        if (i2 != -1) {
            C17648.m41337(i2, view);
            this.expandHalfwayActionIds.delete(i);
        }
    }

    private void replaceAccessibilityActionForState(View view, C13847 c13847, int i) {
        C17648.m41308(view, c13847, null, createAccessibilityViewCommandForState(i));
    }

    private int addAccessibilityActionForState(View view, int i, int i2) {
        return C17648.m41294(view, view.getResources().getString(i), createAccessibilityViewCommandForState(i2));
    }

    private InterfaceC5198 createAccessibilityViewCommandForState(final int i) {
        return new InterfaceC5198() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // l.InterfaceC5198
            public boolean perform(View view, AbstractC9432 abstractC9432) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }
}
