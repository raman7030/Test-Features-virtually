package p067l;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.umeng.analytics.pro.C0719o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C14849 extends ViewGroup implements InterfaceC1973 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final float FLING_DESTRETCH_FACTOR = 4.0f;
    public static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    public static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    public static final float INFLEXION = 0.35f;
    public static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    public static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    public static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    public static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    public static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static boolean sDebugAssertionsEnabled;
    public static final C23567 sDefaultEdgeEffectFactory;
    public static final Interpolator sQuinticInterpolator;
    public static boolean sVerboseLoggingEnabled;
    public C12168 mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public AbstractC21283 mAdapter;
    public C3649 mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public InterfaceC14576 mChildDrawingOrderCallback;
    public C23766 mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public C13906 mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public RunnableC7240 mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public InterfaceC22227 mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public AbstractC23964 mItemAnimator;
    public InterfaceC7871 mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastAutoMeasureNonExactMeasuredHeight;
    public int mLastAutoMeasureNonExactMeasuredWidth;
    public boolean mLastAutoMeasureSkippedDueToExact;
    public int mLastTouchX;
    public int mLastTouchY;
    public AbstractC18873 mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final C20215 mObserver;
    public List mOnChildAttachStateListeners;
    public AbstractC8815 mOnFlingListener;
    public final ArrayList mOnItemTouchListeners;
    public final List mPendingAccessibilityImportanceChange;
    public C2779 mPendingSavedState;
    public final float mPhysicalCoef;
    public boolean mPostedAnimatorRunner;
    public C20652 mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final C4792 mRecycler;
    public InterfaceC6133 mRecyclerListener;
    public final List mRecyclerListeners;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public AbstractC11498 mScrollListener;
    public List mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public C1518 mScrollingChildHelper;
    public final C22897 mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final RunnableC6803 mViewFlinger;
    public final InterfaceC20196 mViewInfoProcessCallback;
    public final C20867 mViewInfoStore;
    public static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setEdgeEffectFactory(C13906 c13906) {
        c13906.getClass();
        this.mEdgeEffectFactory = c13906;
        invalidateGlows();
    }

    static {
        int i = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = true;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC7200();
        sDefaultEdgeEffectFactory = new C23567();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33911(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33929(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public C14849(Context context) {
        this(context, null);
    }

    public C14849(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.p000mt.plus.R.attr.MT_Protector);
    }

    public C14849(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C20215(this);
        this.mRecycler = new C4792(this);
        this.mViewInfoStore = new C20867();
        this.mUpdateChildViewsRunnable = new RunnableC20612(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C9684();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC6803(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C20652() : null;
        C22897 c22897 = new C22897();
        c22897.f72054 = -1;
        c22897.f72065 = 0;
        c22897.f72053 = 0;
        c22897.f72056 = 1;
        c22897.f72066 = 0;
        c22897.f72061 = false;
        c22897.f72063 = false;
        c22897.f72055 = false;
        c22897.f72060 = false;
        c22897.f72057 = false;
        c22897.f72058 = false;
        this.mState = c22897;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C15246(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC2505(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C3176(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C1892.m50454(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C1892.m50455(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m53110(this.mItemAnimatorListener);
        initAdapterManager();
        m33923();
        m33941();
        int i2 = C1717.f57146;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C12168(this));
        int[] iArr = C2978.f5261;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C1717.m43548(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        m33901(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C1717.m43548(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(bin.p000mt.plus.R.id.MT_Protector, Boolean.TRUE);
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m33941() {
        if (C1717.m43541(this) == 0) {
            C1717.m43559((ViewGroup) this, 8);
        }
    }

    public C12168 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C12168 c12168) {
        this.mAccessibilityDelegate = c12168;
        C1717.m43555(this, c12168);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33901(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM33895 = m33895(context, strTrim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> clsAsSubclass = Class.forName(strM33895, false, classLoader).asSubclass(AbstractC18873.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM33895, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC18873) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM33895, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM33895, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM33895, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM33895, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM33895, e7);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m33895(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return C14849.class.getPackage().getName() + '.' + str;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m33923() {
        this.mChildHelper = new C23766(new C9882(this));
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C3649(new C16587(this));
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void swapAdapter(AbstractC21283 abstractC21283, boolean z) {
        setLayoutFrozen(false);
        m33910(abstractC21283, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(AbstractC21283 abstractC21283) {
        setLayoutFrozen(false);
        m33910(abstractC21283, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        AbstractC23964 abstractC23964 = this.mItemAnimator;
        if (abstractC23964 != null) {
            abstractC23964.mo22575();
        }
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        C4792 c4792 = this.mRecycler;
        c4792.f10865.clear();
        c4792.m10113();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33910(AbstractC21283 abstractC21283, boolean z, boolean z2) {
        AbstractC21283 abstractC21284 = this.mAdapter;
        if (abstractC21284 != null) {
            abstractC21284.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m6945();
        AbstractC21283 abstractC21285 = this.mAdapter;
        this.mAdapter = abstractC21283;
        if (abstractC21283 != null) {
            abstractC21283.registerAdapterDataObserver(this.mObserver);
            abstractC21283.onAttachedToRecyclerView(this);
        }
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.onAdapterChanged(abstractC21285, this.mAdapter);
        }
        this.mRecycler.m10105(abstractC21285, this.mAdapter, z);
        this.mState.f72061 = true;
    }

    public AbstractC21283 getAdapter() {
        return this.mAdapter;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC6133 interfaceC6133) {
        this.mRecyclerListener = interfaceC6133;
    }

    public void addRecyclerListener(InterfaceC6133 interfaceC6133) {
        C1524.m35170("'listener' arg cannot be null.", interfaceC6133 != null);
        this.mRecyclerListeners.add(interfaceC6133);
    }

    public void removeRecyclerListener(InterfaceC6133 interfaceC6133) {
        this.mRecyclerListeners.remove(interfaceC6133);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            return abstractC18873.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC24908 interfaceC24908) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC24908);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC24908 interfaceC24908) {
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC24908);
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(AbstractC18873 abstractC18873) {
        if (abstractC18873 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC23964 abstractC23964 = this.mItemAnimator;
            if (abstractC23964 != null) {
                abstractC23964.mo22575();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            C4792 c4792 = this.mRecycler;
            c4792.f10865.clear();
            c4792.m10113();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            C4792 c4793 = this.mRecycler;
            c4793.f10865.clear();
            c4793.m10113();
        }
        C23766 c23766 = this.mChildHelper;
        C14849 c14849 = c23766.f75583.f27406;
        c23766.f75582.m51510();
        ArrayList arrayList = c23766.f75584;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            AbstractC5462 abstractC5462M33925 = m33925((View) arrayList.get(size));
            if (abstractC5462M33925 != null) {
                abstractC5462M33925.onLeftHiddenState(c14849);
            }
            arrayList.remove(size);
        }
        int childCount = c14849.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c14849.getChildAt(i);
            c14849.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c14849.removeAllViews();
        this.mLayout = abstractC18873;
        if (abstractC18873 != null) {
            if (abstractC18873.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC18873 + " is already attached to a RecyclerView:" + abstractC18873.mRecyclerView.exceptionLabel());
            }
            abstractC18873.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m10110();
        requestLayout();
    }

    public void setOnFlingListener(AbstractC8815 abstractC8815) {
        this.mOnFlingListener = abstractC8815;
    }

    public AbstractC8815 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C2779 c2779 = new C2779(super.onSaveInstanceState());
        C2779 c27710 = this.mPendingSavedState;
        if (c27710 == null) {
            AbstractC18873 abstractC18873 = this.mLayout;
            if (abstractC18873 != null) {
                c2779.f4691 = abstractC18873.onSaveInstanceState();
                return c2779;
            }
            c2779.f4691 = null;
            return c2779;
        }
        c2779.f4691 = c27710.f4691;
        return c2779;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2779)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2779 c2779 = (C2779) parcelable;
        this.mPendingSavedState = c2779;
        super.onRestoreInstanceState(c2779.getSuperState());
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33904(AbstractC5462 abstractC5462) {
        View view = abstractC5462.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m10109(getChildViewHolder(view));
        if (abstractC5462.isTmpDetached()) {
            this.mChildHelper.m52814(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m52815(view, -1, true);
        } else {
            this.mChildHelper.m52813(view);
        }
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zM52823 = this.mChildHelper.m52823(view);
        if (zM52823) {
            AbstractC5462 abstractC5462M33925 = m33925(view);
            this.mRecycler.m10109(abstractC5462M33925);
            this.mRecycler.m10102(abstractC5462M33925);
            if (sVerboseLoggingEnabled) {
                C12826.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!zM52823);
        return zM52823;
    }

    public AbstractC18873 getLayoutManager() {
        return this.mLayout;
    }

    public C17531 getRecycledViewPool() {
        return this.mRecycler.m10100();
    }

    public void setRecycledViewPool(C17531 c17531) {
        this.mRecycler.m10104(c17531);
    }

    public void setViewCacheExtension(AbstractC21556 abstractC21556) {
        this.mRecycler.getClass();
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m10115(i);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i;
        if (i != 2) {
            m33920();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void addItemDecoration(AbstractC9212 abstractC9212, int i) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC9212);
        } else {
            this.mItemDecorations.add(i, abstractC9212);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(AbstractC9212 abstractC9212) {
        addItemDecoration(abstractC9212, -1);
    }

    public AbstractC9212 getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return (AbstractC9212) this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(AbstractC9212 abstractC9212) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC9212);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC14576 interfaceC14576) {
        if (interfaceC14576 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC14576;
        setChildrenDrawingOrderEnabled(interfaceC14576 != null);
    }

    @Deprecated
    public void setOnScrollListener(AbstractC11498 abstractC11498) {
        this.mScrollListener = abstractC11498;
    }

    public void addOnScrollListener(AbstractC11498 abstractC11498) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC11498);
    }

    public void removeOnScrollListener(AbstractC11498 abstractC11498) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC11498);
        }
    }

    public void clearOnScrollListeners() {
        List list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null) {
            return;
        }
        abstractC18873.scrollToPosition(i);
        awakenScrollBars();
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void smoothScrollToPosition(int i) {
        AbstractC18873 abstractC18873;
        if (this.mLayoutSuppressed || (abstractC18873 = this.mLayout) == null) {
            return;
        }
        abstractC18873.smoothScrollToPosition(this, this.mState, i);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null || this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC18873.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public void nestedScrollBy(int i, int i2) {
        m33899(i, i2, (MotionEvent) null, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33899(int i, int i2, MotionEvent motionEvent, int i3) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = abstractC18873.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iM33893 = i - m33893(i, height);
        int iM33924 = i2 - m33924(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM33893 : 0, zCanScrollVertically ? iM33924 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iM33893 -= iArr2[0];
            iM33924 -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iM33893 : 0, zCanScrollVertically ? iM33924 : 0, motionEvent, i3);
        RunnableC7240 runnableC7240 = this.mGapWorker;
        if (runnableC7240 != null && (iM33893 != 0 || iM33924 != 0)) {
            runnableC7240.m16585(this, iM33893, iM33924);
        }
        stopNestedScroll(i3);
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = C1107.f19501;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = C1107.f19501;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
        } else {
            if (!this.mAdapterHelper.m6943()) {
                return;
            }
            if (this.mAdapterHelper.m6938(4) && !this.mAdapterHelper.m6938(11)) {
                int i2 = C1107.f19501;
                Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m6946();
                if (!this.mLayoutWasDefered) {
                    if (m33921()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m6935();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else {
                if (this.mAdapterHelper.m6943()) {
                    int i3 = C1107.f19501;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m33921() {
        int iM52811 = this.mChildHelper.m52811();
        for (int i = 0; i < iM52811; i++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52818(i));
            if (abstractC5462M33925 != null && !abstractC5462M33925.shouldIgnore() && abstractC5462M33925.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & C0719o.a.f2912r) != 8194) {
                m33898(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m33893(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C24587.m54227(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -C24587.m54229(this.mLeftGlow, -width, 1.0f - height);
                if (C24587.m54227(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && C24587.m54227(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fM54229 = C24587.m54229(this.mRightGlow, width, height);
                    if (C24587.m54227(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fM54229;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: ۧ */
    private int m33924(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C24587.m54227(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -C24587.m54229(this.mTopGlow, -height, width);
                if (C24587.m54227(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && C24587.m54227(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fM54229 = C24587.m54229(this.mBottomGlow, height, 1.0f - width);
                    if (C24587.m54227(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fM54229;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null && abstractC18873.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null && abstractC18873.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null && abstractC18873.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null && abstractC18873.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null && abstractC18873.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null && abstractC18873.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null || this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC18873.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.m15598(i, i2, interpolator, i3);
            return;
        }
        scrollBy(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public boolean fling(int i, int i2) {
        int i3;
        int i4;
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null || this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = abstractC18873.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            i3 = i;
            i = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect != null && C24587.m54227(edgeEffect) != 0.0f) {
                int i5 = -i;
                if (m33916(this.mLeftGlow, i5, getWidth())) {
                    this.mLeftGlow.onAbsorb(i5);
                    i = 0;
                }
            } else {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || C24587.m54227(edgeEffect2) == 0.0f) {
                    i3 = i;
                    i = 0;
                } else if (m33916(this.mRightGlow, i, getWidth())) {
                    this.mRightGlow.onAbsorb(i);
                    i = 0;
                }
            }
            i3 = 0;
        }
        if (i2 == 0) {
            i4 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 != null && C24587.m54227(edgeEffect3) != 0.0f) {
                int i6 = -i2;
                if (m33916(this.mTopGlow, i6, getHeight())) {
                    this.mTopGlow.onAbsorb(i6);
                    i2 = 0;
                }
            } else {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || C24587.m54227(edgeEffect4) == 0.0f) {
                    i4 = i2;
                    i2 = 0;
                } else if (m33916(this.mBottomGlow, i2, getHeight())) {
                    this.mBottomGlow.onAbsorb(i2);
                    i2 = 0;
                }
            }
            i4 = 0;
        }
        if (i != 0 || i2 != 0) {
            int i7 = this.mMaxFlingVelocity;
            i = Math.max(-i7, Math.min(i, i7));
            int i8 = this.mMaxFlingVelocity;
            i2 = Math.max(-i8, Math.min(i2, i8));
            this.mViewFlinger.m15597(i, i2);
        }
        if (i3 == 0 && i4 == 0) {
            return (i == 0 && i2 == 0) ? false : true;
        }
        float f = i3;
        float f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            AbstractC8815 abstractC8815 = this.mOnFlingListener;
            if (abstractC8815 != null && abstractC8815.onFling(i3, i4)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i9 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i9, Math.min(i3, i9));
                int i10 = this.mMaxFlingVelocity;
                this.mViewFlinger.m15597(iMax, Math.max(-i10, Math.min(i4, i10)));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m33916(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return m33892(-i) < C24587.m54227(edgeEffect) * ((float) i2);
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return m33894(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return m33894(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    /* JADX INFO: renamed from: ֫ */
    private int m33894(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C24587.m54227(edgeEffect) != 0.0f) {
            int iRound = Math.round(C24587.m54229(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || C24587.m54227(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(C24587.m54229(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public void stopScroll() {
        setScrollState(0);
        m33920();
    }

    /* JADX INFO: renamed from: ۚ */
    private void m33920() {
        RunnableC6803 runnableC6803 = this.mViewFlinger;
        runnableC6803.f17668.removeCallbacks(runnableC6803);
        runnableC6803.f17666.abortAnimation();
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX INFO: renamed from: ֫ */
    private void m33898(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= 0.0f) {
            if (f2 > 0.0f) {
                ensureRightGlow();
                C24587.m54229(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < 0.0f) {
                ensureTopGlow();
                C24587.m54229(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                C24587.m54229(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            int i = C1717.f57146;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        C24587.m54229(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < 0.0f) {
            ensureTopGlow();
            C24587.m54229(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            C24587.m54229(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        int i2 = C1717.f57146;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ۘ */
    private void m33919() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            int i = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            int i3 = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        int i3 = C1717.f57146;
        postInvalidateOnAnimation();
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((C23567) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((C23567) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((C23567) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((C23567) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public C13906 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return m33915(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m33903(viewOnFocusSearchFailed, (View) null);
        return view;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m33915(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            m33903(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33903(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C16190) {
            C16190 c16190 = (C16190) layoutParams;
            if (!c16190.f47658) {
                Rect rect = c16190.f47657;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null || !abstractC18873.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.m10111();
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = RunnableC7240.f18883;
            RunnableC7240 runnableC7240 = (RunnableC7240) threadLocal.get();
            this.mGapWorker = runnableC7240;
            if (runnableC7240 == null) {
                this.mGapWorker = new RunnableC7240();
                int i = C1717.f57146;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC7240 runnableC7241 = this.mGapWorker;
                runnableC7241.f18887 = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC7241);
            }
            ArrayList arrayList = this.mGapWorker.f18886;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC7240 runnableC7240;
        super.onDetachedFromWindow();
        AbstractC23964 abstractC23964 = this.mItemAnimator;
        if (abstractC23964 != null) {
            abstractC23964.mo22575();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C6114.f15366.mo18732() != null) {
        }
        this.mRecycler.m10114();
        C11848.m27156(this);
        if (!ALLOW_THREAD_GAP_WORK || (runnableC7240 = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = runnableC7240.f18886.remove(this);
        if (sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(exceptionLabel());
        throw new IllegalStateException(sbM17248.toString());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException("" + exceptionLabel());
        }
    }

    public void addOnItemTouchListener(InterfaceC22227 interfaceC22227) {
        this.mOnItemTouchListeners.add(interfaceC22227);
    }

    public void removeOnItemTouchListener(InterfaceC22227 interfaceC22227) {
        this.mOnItemTouchListeners.remove(interfaceC22227);
        if (this.mInterceptingOnItemTouchListener == interfaceC22227) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m33914(MotionEvent motionEvent) {
        InterfaceC22227 interfaceC22227 = this.mInterceptingOnItemTouchListener;
        if (interfaceC22227 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m33930(motionEvent);
        }
        interfaceC22227.mo13250(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m33930(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC22227 interfaceC22227 = (InterfaceC22227) this.mOnItemTouchListeners.get(i);
            if (interfaceC22227.mo13255(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC22227;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (m33930(motionEvent)) {
            m33897();
            return true;
        }
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC18873.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (m33938(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m33897();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            m33935(motionEvent);
        }
        return this.mScrollState == 1;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m33938(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || C24587.m54227(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            C24587.m54229(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && C24587.m54227(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C24587.m54229(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && C24587.m54227(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C24587.m54229(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || C24587.m54227(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        C24587.m54229(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC22227) this.mOnItemTouchListeners.get(i)).mo13251(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[PHI: r0
      0x00c2: PHI (r0v39 int) = (r0v26 int), (r0v43 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (m33914(motionEvent)) {
            m33897();
            return true;
        }
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC18873.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (zCanScrollVertically) {
                i = zCanScrollHorizontally;
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            i = zCanScrollHorizontally;
            startNestedScroll(i, 0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                m33940();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMin = this.mLastTouchX - x2;
                int iMin2 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        if (iMin > 0) {
                            iMin = Math.max(0, iMin - this.mTouchSlop);
                        } else {
                            iMin = Math.min(0, iMin + this.mTouchSlop);
                        }
                        if (iMin != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (zCanScrollVertically) {
                        if (iMin2 > 0) {
                            iMin2 = Math.max(0, iMin2 - this.mTouchSlop);
                        } else {
                            iMin2 = Math.min(0, iMin2 + this.mTouchSlop);
                        }
                        if (iMin2 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iM33893 = iMin - m33893(iMin, motionEvent.getY());
                    int iM33924 = iMin2 - m33924(iMin2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM33893 : 0, zCanScrollVertically ? iM33924 : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iM33893 -= iArr4[0];
                        iM33924 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i2 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i2 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i3 = iM33924;
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iM33893 : 0, zCanScrollVertically ? i3 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC7240 runnableC7240 = this.mGapWorker;
                    if (runnableC7240 != null && (iM33893 != 0 || i3 != 0)) {
                        runnableC7240.m16585(this, iM33893, i3);
                    }
                }
            } else if (actionMasked == 3) {
                m33897();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                m33935(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m33940() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        m33919();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33897() {
        m33940();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m33935(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue;
                } else if (this.mLayout.canScrollHorizontally()) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                m33899((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC18873.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f72056 == 1) {
                m33934();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f72060 = true;
            m33937();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f72060 = true;
                m33937();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            m33932();
            onExitLayoutOrScroll();
            C22897 c22897 = this.mState;
            if (c22897.f72058) {
                c22897.f72063 = true;
            } else {
                this.mAdapterHelper.m6941();
                this.mState.f72063 = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f72058) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC21283 abstractC21283 = this.mAdapter;
        if (abstractC21283 != null) {
            this.mState.f72066 = abstractC21283.getItemCount();
        } else {
            this.mState.f72066 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f72063 = false;
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i3 = C1717.f57146;
        setMeasuredDimension(AbstractC18873.m42942(i, paddingRight, getMinimumWidth()), AbstractC18873.m42942(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(AbstractC23964 abstractC23964) {
        AbstractC23964 abstractC23965 = this.mItemAnimator;
        if (abstractC23965 != null) {
            abstractC23965.mo22575();
            this.mItemAnimator.m53110((InterfaceC7871) null);
        }
        this.mItemAnimator = abstractC23964;
        if (abstractC23964 != null) {
            abstractC23964.m53110(this.mItemAnimatorListener);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                m33926();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33926() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public AbstractC23964 getItemAnimator() {
        return this.mItemAnimator;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        int i = C1717.f57146;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    /* JADX INFO: renamed from: ۡ */
    private boolean m33922() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    /* JADX INFO: renamed from: ܺ */
    private void m33932() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m6945();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (m33922()) {
            this.mAdapterHelper.m6946();
        } else {
            this.mAdapterHelper.m6941();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f72057 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C22897 c22897 = this.mState;
        c22897.f72058 = c22897.f72057 && z2 && !this.mDataSetHasChangedAfterLayout && m33922();
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f72060 = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f72056 == 1) {
            m33934();
            this.mLayout.setExactMeasureSpecsFrom(this);
            m33937();
        } else {
            C3649 c3649 = this.mAdapterHelper;
            if ((!c3649.f7666.isEmpty() && !c3649.f7667.isEmpty()) || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
                m33937();
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
            }
        }
        m33936();
    }

    /* JADX INFO: renamed from: ֡ */
    private void m33891() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC5462 abstractC5462FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC5462FindContainingViewHolder == null) {
            m33939();
            return;
        }
        this.mState.f72059 = this.mAdapter.hasStableIds() ? abstractC5462FindContainingViewHolder.getItemId() : -1L;
        C22897 c22897 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = abstractC5462FindContainingViewHolder.isRemoved() ? abstractC5462FindContainingViewHolder.mOldPosition : abstractC5462FindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        c22897.f72062 = absoluteAdapterPosition;
        this.mState.f72064 = m33933(abstractC5462FindContainingViewHolder.itemView);
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m33939() {
        C22897 c22897 = this.mState;
        c22897.f72059 = -1L;
        c22897.f72062 = -1;
        c22897.f72064 = -1;
    }

    /* JADX INFO: renamed from: ܳ */
    private View m33931() {
        AbstractC5462 abstractC5462FindViewHolderForAdapterPosition;
        C22897 c22897 = this.mState;
        int i = c22897.f72062;
        if (i == -1) {
            i = 0;
        }
        int iM51124 = c22897.m51124();
        for (int i2 = i; i2 < iM51124; i2++) {
            AbstractC5462 abstractC5462FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC5462FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC5462FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC5462FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM51124, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC5462FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC5462FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC5462FindViewHolderForAdapterPosition.itemView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX INFO: renamed from: ۖ */
    private void m33918() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f75584.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m52811() == 0) {
                requestFocus();
                return;
            }
        }
        View viewM33931 = null;
        AbstractC5462 abstractC5462FindViewHolderForItemId = (this.mState.f72059 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f72059);
        if (abstractC5462FindViewHolderForItemId != null) {
            if (this.mChildHelper.f75584.contains(abstractC5462FindViewHolderForItemId.itemView) || !abstractC5462FindViewHolderForItemId.itemView.hasFocusable()) {
                if (this.mChildHelper.m52811() > 0) {
                    viewM33931 = m33931();
                }
            } else {
                viewM33931 = abstractC5462FindViewHolderForItemId.itemView;
            }
        } else if (this.mChildHelper.m52811() > 0) {
            viewM33931 = m33931();
        }
        if (viewM33931 != null) {
            int i = this.mState.f72064;
            if (i != -1 && (viewFindViewById = viewM33931.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewM33931 = viewFindViewById;
            }
            viewM33931.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private int m33933(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void fillRemainingScrollValues(C22897 c22897) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f17666;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c22897.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c22897.getClass();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m33934() {
        C6114 c6114;
        this.mState.m51125(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f72060 = false;
        startInterceptRequestLayout();
        C20867 c20867 = this.mViewInfoStore;
        c20867.f65553.clear();
        c20867.f65554.m17609();
        onEnterLayoutOrScroll();
        m33932();
        m33891();
        C22897 c22897 = this.mState;
        c22897.f72055 = c22897.f72057 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c22897.f72063 = c22897.f72058;
        c22897.f72066 = this.mAdapter.getItemCount();
        m33912(this.mMinMaxLayoutPositions);
        if (this.mState.f72057) {
            int iM52811 = this.mChildHelper.m52811();
            for (int i = 0; i < iM52811; i++) {
                AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52818(i));
                if (!abstractC5462M33925.shouldIgnore() && (!abstractC5462M33925.isInvalid() || this.mAdapter.hasStableIds())) {
                    AbstractC23964 abstractC23964 = this.mItemAnimator;
                    AbstractC23964.m53106(abstractC5462M33925);
                    abstractC5462M33925.getUnmodifiedPayloads();
                    abstractC23964.getClass();
                    C13236 c13236 = new C13236();
                    c13236.m30296(abstractC5462M33925);
                    C1012 c1012 = this.mViewInfoStore.f65553;
                    C6114 c6114M13913 = (C6114) c1012.getOrDefault(abstractC5462M33925, null);
                    if (c6114M13913 == null) {
                        c6114M13913 = C6114.m13913();
                        c1012.put(abstractC5462M33925, c6114M13913);
                    }
                    c6114M13913.f15369 = c13236;
                    c6114M13913.f15367 |= 4;
                    if (this.mState.f72055 && abstractC5462M33925.isUpdated() && !abstractC5462M33925.isRemoved() && !abstractC5462M33925.shouldIgnore() && !abstractC5462M33925.isInvalid()) {
                        this.mViewInfoStore.f65554.m17611(getChangedHolderKey(abstractC5462M33925), abstractC5462M33925);
                    }
                }
            }
        }
        if (this.mState.f72058) {
            saveOldPositions();
            C22897 c22898 = this.mState;
            boolean z = c22898.f72061;
            c22898.f72061 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c22898);
            this.mState.f72061 = z;
            for (int i2 = 0; i2 < this.mChildHelper.m52811(); i2++) {
                AbstractC5462 abstractC5462M33926 = m33925(this.mChildHelper.m52818(i2));
                if (!abstractC5462M33926.shouldIgnore() && ((c6114 = (C6114) this.mViewInfoStore.f65553.getOrDefault(abstractC5462M33926, null)) == null || (c6114.f15367 & 4) == 0)) {
                    AbstractC23964.m53106(abstractC5462M33926);
                    boolean zHasAnyOfTheFlags = abstractC5462M33926.hasAnyOfTheFlags(8192);
                    AbstractC23964 abstractC23965 = this.mItemAnimator;
                    abstractC5462M33926.getUnmodifiedPayloads();
                    abstractC23965.getClass();
                    C13236 c13237 = new C13236();
                    c13237.m30296(abstractC5462M33926);
                    if (!zHasAnyOfTheFlags) {
                        C1012 c1013 = this.mViewInfoStore.f65553;
                        C6114 c6114M13914 = (C6114) c1013.getOrDefault(abstractC5462M33926, null);
                        if (c6114M13914 == null) {
                            c6114M13914 = C6114.m13913();
                            c1013.put(abstractC5462M33926, c6114M13914);
                        }
                        c6114M13914.f15367 |= 2;
                        c6114M13914.f15369 = c13237;
                    } else {
                        recordAnimationInfoIfBouncedHiddenView(abstractC5462M33926, c13237);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f72056 = 2;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m33937() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m51125(6);
        this.mAdapterHelper.m6941();
        this.mState.f72066 = this.mAdapter.getItemCount();
        this.mState.f72053 = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f4691;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C22897 c22897 = this.mState;
        c22897.f72063 = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c22897);
        C22897 c22898 = this.mState;
        c22898.f72061 = false;
        c22898.f72057 = c22898.f72057 && this.mItemAnimator != null;
        c22898.f72056 = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m33936() {
        C13236 c13236;
        C13236 c13237;
        C3176 c3176;
        boolean zMo22570;
        int i;
        int i2;
        C3176 c3177;
        this.mState.m51125(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C22897 c22897 = this.mState;
        c22897.f72056 = 1;
        if (c22897.f72057) {
            for (int iM52811 = this.mChildHelper.m52811() - 1; iM52811 >= 0; iM52811--) {
                AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52818(iM52811));
                if (!abstractC5462M33925.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(abstractC5462M33925);
                    this.mItemAnimator.getClass();
                    C13236 c13238 = new C13236();
                    c13238.m30296(abstractC5462M33925);
                    AbstractC5462 abstractC5462 = (AbstractC5462) this.mViewInfoStore.f65554.m17612(changedHolderKey, null);
                    if (abstractC5462 == null || abstractC5462.shouldIgnore()) {
                        this.mViewInfoStore.m47160(abstractC5462M33925, c13238);
                    } else {
                        C6114 c6114 = (C6114) this.mViewInfoStore.f65553.getOrDefault(abstractC5462, null);
                        boolean z = (c6114 == null || (c6114.f15367 & 1) == 0) ? false : true;
                        C6114 c6115 = (C6114) this.mViewInfoStore.f65553.getOrDefault(abstractC5462M33925, null);
                        boolean z2 = (c6115 == null || (c6115.f15367 & 1) == 0) ? false : true;
                        if (z && abstractC5462 == abstractC5462M33925) {
                            this.mViewInfoStore.m47160(abstractC5462M33925, c13238);
                        } else {
                            C13236 c13236M47161 = this.mViewInfoStore.m47161(abstractC5462);
                            this.mViewInfoStore.m47160(abstractC5462M33925, c13238);
                            C13236 c13236M47159 = this.mViewInfoStore.m47159(abstractC5462M33925);
                            if (c13236M47161 == null) {
                                m33900(changedHolderKey, abstractC5462M33925, abstractC5462);
                            } else {
                                m33905(abstractC5462, abstractC5462M33925, c13236M47161, c13236M47159, z, z2);
                            }
                        }
                    }
                }
            }
            C20867 c20867 = this.mViewInfoStore;
            InterfaceC20196 interfaceC20196 = this.mViewInfoProcessCallback;
            C1012 c1012 = c20867.f65553;
            for (int size = c1012.size() - 1; size >= 0; size--) {
                AbstractC5462 abstractC5463 = (AbstractC5462) c1012.m12522(size);
                C6114 c6116 = (C6114) c1012.m12523(size);
                int i3 = c6116.f15367;
                if ((i3 & 3) == 3) {
                    c3177 = (C3176) interfaceC20196;
                } else {
                    if ((i3 & 1) != 0) {
                        C13236 c13239 = c6116.f15369;
                        if (c13239 == null) {
                            c3177 = (C3176) interfaceC20196;
                        } else {
                            C13236 c132310 = c6116.f15368;
                            C14849 c14849 = ((C3176) interfaceC20196).f6104;
                            c14849.mRecycler.m10109(abstractC5463);
                            c14849.animateDisappearance(abstractC5463, c13239, c132310);
                        }
                    } else {
                        if ((i3 & 14) == 14) {
                            c13236 = c6116.f15369;
                            c13237 = c6116.f15368;
                            c3176 = (C3176) interfaceC20196;
                        } else if ((i3 & 12) == 12) {
                            C13236 c132311 = c6116.f15369;
                            C13236 c132312 = c6116.f15368;
                            C3176 c3178 = (C3176) interfaceC20196;
                            c3178.getClass();
                            abstractC5463.setIsRecyclable(false);
                            C14849 c148410 = c3178.f6104;
                            if (c148410.mDataSetHasChangedAfterLayout) {
                                AbstractC13509 abstractC13509 = (AbstractC13509) c148410.mItemAnimator;
                                abstractC13509.getClass();
                                int i4 = c132311.f37201;
                                int i5 = c132311.f37202;
                                if (abstractC5463.shouldIgnore()) {
                                    int i6 = c132311.f37201;
                                    i2 = c132311.f37202;
                                    i = i6;
                                } else {
                                    i = c132312.f37201;
                                    i2 = c132312.f37202;
                                }
                                if (abstractC13509.mo22572(abstractC5463, abstractC5463, i4, i5, i, i2)) {
                                    c148410.postAnimationRunner();
                                }
                            } else {
                                AbstractC13509 abstractC135010 = (AbstractC13509) c148410.mItemAnimator;
                                abstractC135010.getClass();
                                int i7 = c132311.f37201;
                                int i8 = c132312.f37201;
                                if (i7 == i8 && c132311.f37202 == c132312.f37202) {
                                    abstractC135010.m53109(abstractC5463);
                                    zMo22570 = false;
                                } else {
                                    zMo22570 = abstractC135010.mo22570(abstractC5463, i7, c132311.f37202, i8, c132312.f37202);
                                }
                                if (zMo22570) {
                                    c148410.postAnimationRunner();
                                }
                            }
                        } else if ((i3 & 4) != 0) {
                            C13236 c132313 = c6116.f15369;
                            C14849 c148411 = ((C3176) interfaceC20196).f6104;
                            c148411.mRecycler.m10109(abstractC5463);
                            c148411.animateDisappearance(abstractC5463, c132313, null);
                        } else if ((i3 & 8) != 0) {
                            c13236 = c6116.f15369;
                            c13237 = c6116.f15368;
                            c3176 = (C3176) interfaceC20196;
                        }
                        c3176.f6104.animateAppearance(abstractC5463, c13236, c13237);
                    }
                    c6116.f15367 = 0;
                    c6116.f15369 = null;
                    c6116.f15368 = null;
                    C6114.f15366.mo18733(c6116);
                }
                C14849 c148412 = c3177.f6104;
                c148412.mLayout.removeAndRecycleView(abstractC5463.itemView, c148412.mRecycler);
                c6116.f15367 = 0;
                c6116.f15369 = null;
                c6116.f15368 = null;
                C6114.f15366.mo18733(c6116);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C22897 c22898 = this.mState;
        c22898.f72065 = c22898.f72066;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c22898.f72057 = false;
        c22898.f72058 = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f10869;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC18873.mPrefetchMaxCountObserved = 0;
            abstractC18873.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m10110();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C20867 c20868 = this.mViewInfoStore;
        c20868.f65553.clear();
        c20868.f65554.m17609();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (m33913(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        m33918();
        m33939();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33900(long j, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int iM52811 = this.mChildHelper.m52811();
        for (int i = 0; i < iM52811; i++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52818(i));
            if (abstractC5462M33925 != abstractC5462 && getChangedHolderKey(abstractC5462M33925) == j) {
                AbstractC21283 abstractC21283 = this.mAdapter;
                if (abstractC21283 != null && abstractC21283.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC5462M33925 + " \n View Holder 2:" + abstractC5462 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC5462M33925 + " \n View Holder 2:" + abstractC5462 + exceptionLabel());
            }
        }
        C12826.toString(abstractC5463);
        C12826.toString(abstractC5462);
        exceptionLabel();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC5462 abstractC5462, C13236 c13236) {
        abstractC5462.setFlags(0, 8192);
        if (this.mState.f72055 && abstractC5462.isUpdated() && !abstractC5462.isRemoved() && !abstractC5462.shouldIgnore()) {
            this.mViewInfoStore.f65554.m17611(getChangedHolderKey(abstractC5462), abstractC5462);
        }
        C1012 c1012 = this.mViewInfoStore.f65553;
        C6114 c6114M13913 = (C6114) c1012.getOrDefault(abstractC5462, null);
        if (c6114M13913 == null) {
            c6114M13913 = C6114.m13913();
            c1012.put(abstractC5462, c6114M13913);
        }
        c6114M13913.f15369 = c13236;
        c6114M13913.f15367 |= 4;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33912(int[] iArr) {
        int iM52811 = this.mChildHelper.m52811();
        if (iM52811 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM52811; i3++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52818(i3));
            if (!abstractC5462M33925.shouldIgnore()) {
                int layoutPosition = abstractC5462M33925.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m33913(int i, int i2) {
        m33912(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC5462 abstractC5462M33925 = m33925(view);
        if (abstractC5462M33925 != null) {
            if (abstractC5462M33925.isTmpDetached()) {
                abstractC5462M33925.clearTmpDetachFlag();
            } else if (!abstractC5462M33925.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC5462M33925 + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public long getChangedHolderKey(AbstractC5462 abstractC5462) {
        return this.mAdapter.hasStableIds() ? abstractC5462.getItemId() : abstractC5462.mPosition;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public void animateAppearance(AbstractC5462 abstractC5462, C13236 c13236, C13236 c13237) {
        boolean zMo22570;
        abstractC5462.setIsRecyclable(false);
        AbstractC13509 abstractC13509 = (AbstractC13509) this.mItemAnimator;
        if (c13236 != null) {
            abstractC13509.getClass();
            int i = c13236.f37201;
            int i2 = c13237.f37201;
            if (i != i2 || c13236.f37202 != c13237.f37202) {
                zMo22570 = abstractC13509.mo22570(abstractC5462, i, c13236.f37202, i2, c13237.f37202);
            } else {
                abstractC13509.mo22578(abstractC5462);
                zMo22570 = true;
            }
        } else {
            abstractC13509.mo22578(abstractC5462);
            zMo22570 = true;
        }
        if (zMo22570) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC5462 abstractC5462, C13236 c13236, C13236 c13237) {
        boolean zMo22570;
        m33904(abstractC5462);
        abstractC5462.setIsRecyclable(false);
        AbstractC13509 abstractC13509 = (AbstractC13509) this.mItemAnimator;
        abstractC13509.getClass();
        int i = c13236.f37201;
        int i2 = c13236.f37202;
        View view = abstractC5462.itemView;
        int left = c13237 == null ? view.getLeft() : c13237.f37201;
        int top = c13237 == null ? view.getTop() : c13237.f37202;
        if (!abstractC5462.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zMo22570 = abstractC13509.mo22570(abstractC5462, i, i2, left, top);
        } else {
            abstractC13509.mo22577(abstractC5462);
            zMo22570 = true;
        }
        if (zMo22570) {
            postAnimationRunner();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33905(AbstractC5462 abstractC5462, AbstractC5462 abstractC5463, C13236 c13236, C13236 c13237, boolean z, boolean z2) {
        int i;
        int i2;
        abstractC5462.setIsRecyclable(false);
        if (z) {
            m33904(abstractC5462);
        }
        if (abstractC5462 != abstractC5463) {
            if (z2) {
                m33904(abstractC5463);
            }
            abstractC5462.mShadowedHolder = abstractC5463;
            m33904(abstractC5462);
            this.mRecycler.m10109(abstractC5462);
            abstractC5463.setIsRecyclable(false);
            abstractC5463.mShadowingHolder = abstractC5462;
        }
        AbstractC13509 abstractC13509 = (AbstractC13509) this.mItemAnimator;
        abstractC13509.getClass();
        int i3 = c13236.f37201;
        int i4 = c13236.f37202;
        if (abstractC5463.shouldIgnore()) {
            int i5 = c13236.f37201;
            i2 = c13236.f37202;
            i = i5;
        } else {
            i = c13237.f37201;
            i2 = c13237.f37202;
        }
        if (abstractC13509.mo22572(abstractC5462, abstractC5463, i3, i4, i, i2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C1107.f19501;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void markItemDecorInsetsDirty() {
        int iM52816 = this.mChildHelper.m52816();
        for (int i = 0; i < iM52816; i++) {
            ((C16190) this.mChildHelper.m52819(i).getLayoutParams()).f47658 = true;
        }
        ArrayList arrayList = this.mRecycler.f10867;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16190 c16190 = (C16190) ((AbstractC5462) arrayList.get(i2)).itemView.getLayoutParams();
            if (c16190 != null) {
                c16190.f47658 = true;
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC9212) this.mItemDecorations.get(i)).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo22579()) ? z : true) {
            int i2 = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC9212) this.mItemDecorations.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C16190) && this.mLayout.checkLayoutParams((C16190) layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC18873.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC18873.generateLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC18873.generateLayoutParams(layoutParams);
    }

    public boolean isAnimating() {
        AbstractC23964 abstractC23964 = this.mItemAnimator;
        return abstractC23964 != null && abstractC23964.mo22579();
    }

    public void saveOldPositions() {
        int iM52816 = this.mChildHelper.m52816();
        for (int i = 0; i < iM52816; i++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i));
            if (sDebugAssertionsEnabled && abstractC5462M33925.mPosition == -1 && !abstractC5462M33925.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!abstractC5462M33925.shouldIgnore()) {
                abstractC5462M33925.saveOldPosition();
            }
        }
    }

    public void clearOldPositions() {
        int iM52816 = this.mChildHelper.m52816();
        for (int i = 0; i < iM52816; i++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i));
            if (!abstractC5462M33925.shouldIgnore()) {
                abstractC5462M33925.clearOldPosition();
            }
        }
        C4792 c4792 = this.mRecycler;
        ArrayList arrayList = c4792.f10865;
        ArrayList arrayList2 = c4792.f10867;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC5462) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC5462) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c4792.f10869;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC5462) c4792.f10869.get(i4)).clearOldPosition();
            }
        }
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM52816 = this.mChildHelper.m52816();
        int i10 = -1;
        if (i < i2) {
            i3 = -1;
            i5 = i;
            i4 = i2;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i11 = 0; i11 < iM52816; i11++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i11));
            if (abstractC5462M33925 != null && (i9 = abstractC5462M33925.mPosition) >= i5 && i9 <= i4) {
                if (sVerboseLoggingEnabled) {
                    abstractC5462M33925.toString();
                }
                if (abstractC5462M33925.mPosition == i) {
                    abstractC5462M33925.offsetPosition(i2 - i, false);
                } else {
                    abstractC5462M33925.offsetPosition(i3, false);
                }
                this.mState.f72061 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f10867;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i10 = 1;
            i6 = i;
            i7 = i2;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC5462 abstractC5462 = (AbstractC5462) arrayList.get(i12);
            if (abstractC5462 != null && (i8 = abstractC5462.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC5462.offsetPosition(i2 - i, false);
                } else {
                    abstractC5462.offsetPosition(i10, false);
                }
                if (sVerboseLoggingEnabled) {
                    abstractC5462.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iM52816 = this.mChildHelper.m52816();
        for (int i3 = 0; i3 < iM52816; i3++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i3));
            if (abstractC5462M33925 != null && !abstractC5462M33925.shouldIgnore() && abstractC5462M33925.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC5462M33925.toString();
                }
                abstractC5462M33925.offsetPosition(i2, false);
                this.mState.f72061 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f10867;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC5462 abstractC5462 = (AbstractC5462) arrayList.get(i4);
            if (abstractC5462 != null && abstractC5462.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC5462.toString();
                }
                abstractC5462.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM52816 = this.mChildHelper.m52816();
        for (int i4 = 0; i4 < iM52816; i4++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i4));
            if (abstractC5462M33925 != null && !abstractC5462M33925.shouldIgnore()) {
                int i5 = abstractC5462M33925.mPosition;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC5462M33925.toString();
                    }
                    abstractC5462M33925.offsetPosition(-i2, z);
                    this.mState.f72061 = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        abstractC5462M33925.toString();
                    }
                    abstractC5462M33925.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f72061 = true;
                }
            }
        }
        C4792 c4792 = this.mRecycler;
        ArrayList arrayList = c4792.f10867;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5462 abstractC5462 = (AbstractC5462) arrayList.get(size);
            if (abstractC5462 != null) {
                int i6 = abstractC5462.mPosition;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC5462.toString();
                    }
                    abstractC5462.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC5462.addFlags(8);
                    c4792.m10112(size);
                }
            }
        }
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iM52816 = this.mChildHelper.m52816();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM52816; i6++) {
            View viewM52819 = this.mChildHelper.m52819(i6);
            AbstractC5462 abstractC5462M33925 = m33925(viewM52819);
            if (abstractC5462M33925 != null && !abstractC5462M33925.shouldIgnore() && (i4 = abstractC5462M33925.mPosition) >= i && i4 < i5) {
                abstractC5462M33925.addFlags(2);
                abstractC5462M33925.addChangePayload(obj);
                ((C16190) viewM52819.getLayoutParams()).f47658 = true;
            }
        }
        C4792 c4792 = this.mRecycler;
        ArrayList arrayList = c4792.f10867;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5462 abstractC5462 = (AbstractC5462) arrayList.get(size);
            if (abstractC5462 != null && (i3 = abstractC5462.mPosition) >= i && i3 < i5) {
                abstractC5462.addFlags(2);
                c4792.m10112(size);
            }
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC5462 abstractC5462) {
        AbstractC23964 abstractC23964 = this.mItemAnimator;
        return abstractC23964 == null || abstractC23964.mo22571(abstractC5462, abstractC5462.getUnmodifiedPayloads());
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void markKnownViewsInvalid() {
        int iM52816 = this.mChildHelper.m52816();
        for (int i = 0; i < iM52816; i++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i));
            if (abstractC5462M33925 != null && !abstractC5462M33925.shouldIgnore()) {
                abstractC5462M33925.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C4792 c4792 = this.mRecycler;
        ArrayList arrayList = c4792.f10867;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC5462 abstractC5462 = (AbstractC5462) arrayList.get(i2);
            if (abstractC5462 != null) {
                abstractC5462.addFlags(6);
                abstractC5462.addChangePayload(null);
            }
        }
        AbstractC21283 abstractC21283 = c4792.f10866.mAdapter;
        if (abstractC21283 == null || !abstractC21283.hasStableIds()) {
            c4792.m10113();
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public AbstractC5462 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m33925(view);
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public AbstractC5462 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC5462 m33925(View view) {
        if (view == null) {
            return null;
        }
        return ((C16190) view.getLayoutParams()).f47660;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        AbstractC5462 abstractC5462M33925 = m33925(view);
        if (abstractC5462M33925 != null) {
            return abstractC5462M33925.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        AbstractC5462 abstractC5462M33925 = m33925(view);
        if (abstractC5462M33925 != null) {
            return abstractC5462M33925.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        AbstractC5462 abstractC5462M33925;
        AbstractC21283 abstractC21283 = this.mAdapter;
        if (abstractC21283 == null || !abstractC21283.hasStableIds() || (abstractC5462M33925 = m33925(view)) == null) {
            return -1L;
        }
        return abstractC5462M33925.getItemId();
    }

    @Deprecated
    public AbstractC5462 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC5462 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC5462 findViewHolderForAdapterPosition(int i) {
        AbstractC5462 abstractC5462 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM52816 = this.mChildHelper.m52816();
        for (int i2 = 0; i2 < iM52816; i2++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i2));
            if (abstractC5462M33925 != null && !abstractC5462M33925.isRemoved() && getAdapterPositionInRecyclerView(abstractC5462M33925) == i) {
                C23766 c23766 = this.mChildHelper;
                if (!c23766.f75584.contains(abstractC5462M33925.itemView)) {
                    return abstractC5462M33925;
                }
                abstractC5462 = abstractC5462M33925;
            }
        }
        return abstractC5462;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public AbstractC5462 findViewHolderForPosition(int i, boolean z) {
        C23766 c23766;
        int iM52816 = this.mChildHelper.m52816();
        AbstractC5462 abstractC5462 = null;
        for (int i2 = 0; i2 < iM52816; i2++) {
            AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i2));
            if (abstractC5462M33925 != null && !abstractC5462M33925.isRemoved()) {
                if (z) {
                    if (abstractC5462M33925.mPosition != i) {
                        continue;
                    } else {
                        c23766 = this.mChildHelper;
                        if (c23766.f75584.contains(abstractC5462M33925.itemView)) {
                            return abstractC5462M33925;
                        }
                        abstractC5462 = abstractC5462M33925;
                    }
                } else if (abstractC5462M33925.getLayoutPosition() != i) {
                    continue;
                } else {
                    c23766 = this.mChildHelper;
                    if (c23766.f75584.contains(abstractC5462M33925.itemView)) {
                        return abstractC5462M33925;
                    }
                    abstractC5462 = abstractC5462M33925;
                }
            }
        }
        return abstractC5462;
    }

    public AbstractC5462 findViewHolderForItemId(long j) {
        AbstractC21283 abstractC21283 = this.mAdapter;
        AbstractC5462 abstractC5462 = null;
        if (abstractC21283 != null && abstractC21283.hasStableIds()) {
            int iM52816 = this.mChildHelper.m52816();
            for (int i = 0; i < iM52816; i++) {
                AbstractC5462 abstractC5462M33925 = m33925(this.mChildHelper.m52819(i));
                if (abstractC5462M33925 != null && !abstractC5462M33925.isRemoved() && abstractC5462M33925.getItemId() == j) {
                    C23766 c23766 = this.mChildHelper;
                    if (!c23766.f75584.contains(abstractC5462M33925.itemView)) {
                        return abstractC5462M33925;
                    }
                    abstractC5462 = abstractC5462M33925;
                }
            }
        }
        return abstractC5462;
    }

    public View findChildViewUnder(float f, float f2) {
        int iM52811 = this.mChildHelper.m52811();
        while (true) {
            iM52811--;
            if (iM52811 < 0) {
                return null;
            }
            View viewM52818 = this.mChildHelper.m52818(iM52811);
            float translationX = viewM52818.getTranslationX();
            float translationY = viewM52818.getTranslationY();
            if (f >= viewM52818.getLeft() + translationX && f <= viewM52818.getRight() + translationX && f2 >= viewM52818.getTop() + translationY && f2 <= viewM52818.getBottom() + translationY) {
                return viewM52818;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int iM52811 = this.mChildHelper.m52811();
        for (int i2 = 0; i2 < iM52811; i2++) {
            this.mChildHelper.m52818(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int iM52811 = this.mChildHelper.m52811();
        for (int i2 = 0; i2 < iM52811; i2++) {
            this.mChildHelper.m52818(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        m33902(view, rect);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33902(View view, Rect rect) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        Rect rect2 = c16190.f47657;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c16190).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c16190).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c16190).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c16190).bottomMargin);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        boolean z = c16190.f47658;
        Rect rect = c16190.f47657;
        if (!z || (this.mState.f72063 && (c16190.f47660.isUpdated() || c16190.f47660.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((AbstractC9212) this.mItemDecorations.get(i)).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c16190.f47658 = false;
        return rect;
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC11498 abstractC11498 = this.mScrollListener;
        if (abstractC11498 != null) {
            abstractC11498.onScrolled(this, i, i2);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AbstractC11498) this.mScrollListeners.get(size)).onScrolled(this, i, i2);
                }
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* JADX INFO: renamed from: ֫ */
    private float m33892(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * 0.015f)));
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC18873 abstractC18873 = this.mLayout;
        if (abstractC18873 != null) {
            abstractC18873.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC11498 abstractC11498 = this.mScrollListener;
        if (abstractC11498 != null) {
            abstractC11498.onScrollStateChanged(this, i);
        }
        List list = this.mScrollListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC11498) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m6943();
    }

    public void repositionShadowingViews() {
        AbstractC5462 abstractC5462;
        int iM52811 = this.mChildHelper.m52811();
        for (int i = 0; i < iM52811; i++) {
            View viewM52818 = this.mChildHelper.m52818(i);
            AbstractC5462 childViewHolder = getChildViewHolder(viewM52818);
            if (childViewHolder != null && (abstractC5462 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC5462.itemView;
                int left = viewM52818.getLeft();
                int top = viewM52818.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14849 m33896(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C14849) {
            return (C14849) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C14849 c14849M33896 = m33896(viewGroup.getChildAt(i));
            if (c14849M33896 != null) {
                return c14849M33896;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33927(AbstractC5462 abstractC5462) {
        WeakReference weakReference = abstractC5462.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC5462.itemView) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC5462.mNestedRecyclerView = null;
        }
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public void dispatchChildDetached(View view) {
        AbstractC5462 abstractC5462M33925 = m33925(view);
        onChildDetachedFromWindow(view);
        AbstractC21283 abstractC21283 = this.mAdapter;
        if (abstractC21283 != null && abstractC5462M33925 != null) {
            abstractC21283.onViewDetachedFromWindow(abstractC5462M33925);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC24908) this.mOnChildAttachStateListeners.get(size)).mo7547(view);
            }
        }
    }

    public void dispatchChildAttached(View view) {
        AbstractC5462 abstractC5462M33925 = m33925(view);
        onChildAttachedToWindow(view);
        AbstractC21283 abstractC21283 = this.mAdapter;
        if (abstractC21283 != null && abstractC5462M33925 != null) {
            abstractC21283.onViewAttachedToWindow(abstractC5462M33925);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC24908) this.mOnChildAttachStateListeners.get(size)).mo7554(view);
            }
        }
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC5462 abstractC5462, int i) {
        if (isComputingLayout()) {
            abstractC5462.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC5462);
            return false;
        }
        View view = abstractC5462.itemView;
        int i2 = C1717.f57146;
        view.setImportantForAccessibility(i);
        return true;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC5462 abstractC5462 = (AbstractC5462) this.mPendingAccessibilityImportanceChange.get(size);
                if (abstractC5462.itemView.getParent() == this && !abstractC5462.shouldIgnore() && (i = abstractC5462.mPendingAccessibilityState) != -1) {
                    View view = abstractC5462.itemView;
                    int i2 = C1717.f57146;
                    view.setImportantForAccessibility(i);
                    abstractC5462.mPendingAccessibilityState = -1;
                }
            } else {
                this.mPendingAccessibilityImportanceChange.clear();
                return;
            }
        }
    }

    public int getAdapterPositionInRecyclerView(AbstractC5462 abstractC5462) {
        if (abstractC5462.hasAnyOfTheFlags(524) || !abstractC5462.isBound()) {
            return -1;
        }
        C3649 c3649 = this.mAdapterHelper;
        int i = abstractC5462.mPosition;
        ArrayList arrayList = c3649.f7667;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7673 c7673 = (C7673) arrayList.get(i2);
            int i3 = c7673.f20122;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c7673.f20125;
                    if (i4 <= i) {
                        int i5 = c7673.f20123;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c7673.f20125;
                    if (i6 == i) {
                        i = c7673.f20123;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c7673.f20123 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c7673.f20125 <= i) {
                i += c7673.f20123;
            }
        }
        return i;
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C5899(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector), resources.getDimensionPixelSize(bin.p000mt.plus.R.dimen.MT_Protector), resources.getDimensionPixelOffset(bin.p000mt.plus.R.dimen.MT_Protector));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        m33942().m34859(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return m33942().m34860();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m33942().m34864(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        return m33942().m34864(i, i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m33942().m34868(0);
    }

    public void stopNestedScroll(int i) {
        m33942().m34868(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m33942().m34863(0);
    }

    public boolean hasNestedScrollingParent(int i) {
        return m33942().m34863(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m33942().m34865(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m33942().m34866(i, i2, i3, i4, iArr, i5);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m33942().m34858(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m33942().m34867(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m33942().m34867(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m33942().m34862(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return m33942().m34861(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    /* JADX INFO: renamed from: ᩻ */
    private C1518 m33942() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1518(this);
        }
        return this.mScrollingChildHelper;
    }
}
