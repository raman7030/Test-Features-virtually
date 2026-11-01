package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩹ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes5.dex */
public class C1751 extends ViewGroup implements InterfaceC1203, InterfaceC0931 {
    public static final Class[] CONSTRUCTOR_PARAMS;
    public static final int EVENT_NESTED_SCROLL = 1;
    public static final int EVENT_PRE_DRAW = 0;
    public static final int EVENT_VIEW_REMOVED = 2;
    public static final String TAG = "CoordinatorLayout";
    public static final Comparator TOP_SORTED_CHILDREN_COMPARATOR;
    public static final int TYPE_ON_INTERCEPT = 0;
    public static final int TYPE_ON_TOUCH = 1;
    public static final String WIDGET_PACKAGE_NAME;
    public static final ThreadLocal sConstructors;
    public static final InterfaceC1139 sRectPool;
    public InterfaceC1666 mApplyWindowInsetsListener;
    public final int[] mBehaviorConsumed;
    public View mBehaviorTouchView;
    public final C1716 mChildDag;
    public final List mDependencySortedChildren;
    public boolean mDisallowInterceptReset;
    public boolean mDrawStatusBarBackground;
    public boolean mIsAttachedToWindow;
    public int[] mKeylines;
    public C1914 mLastInsets;
    public boolean mNeedsPreDrawListener;
    public final C1386 mNestedScrollingParentHelper;
    public View mNestedScrollingTarget;
    public final int[] mNestedScrollingV2ConsumedCompat;
    public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    public ViewTreeObserverOnPreDrawListenerC1225 mOnPreDrawListener;
    public Paint mScrimPaint;
    public Drawable mStatusBarBackground;
    public final List mTempDependenciesList;
    public final List mTempList1;

    /* JADX INFO: renamed from: ֫ */
    public static int m44973(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m44988(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m44991(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0 ? i | 48 : i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m44994(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    static {
        Package r0 = C1751.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C1681();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal();
        sRectPool = new C1979(12);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rect m44974() {
        Rect rect = (Rect) sRectPool.mo18732();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44977(Rect rect) {
        rect.setEmpty();
        sRectPool.mo18733(rect);
    }

    public C1751(Context context) {
        this(context, null);
    }

    public C1751(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1751(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new C1716();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C1386();
        int[] iArr = C1505.f43063;
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.MT_Protector);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, R.style.MT_Protector);
            } else {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.mKeylines;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        this.mStatusBarBackground = typedArray.getDrawable(1);
        typedArray.recycle();
        m44992();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1995(this));
        int i3 = C1717.f57146;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m44985(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC1225(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            int i = C1717.f57146;
            if (getFitsSystemWindows()) {
                C1717.m43585(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m44985(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                int i = C1717.f57146;
                C1248.m23650(drawable3, getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            int i2 = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0886.m5548(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public final C1914 setWindowInsets(C1914 c1914) {
        if (C12826.equals(this.mLastInsets, c1914)) {
            return c1914;
        }
        this.mLastInsets = c1914;
        boolean z = false;
        boolean z2 = c1914 != null && c1914.m51174() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        C1914 c1914M44976 = m44976(c1914);
        requestLayout();
        return c1914M44976;
    }

    public final C1914 getLastWindowInsets() {
        return this.mLastInsets;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44985(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC1155 abstractC1155 = ((C1540) childAt.getLayoutParams()).f45609;
            if (abstractC1155 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC1155.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    abstractC1155.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C1540) getChildAt(i2).getLayoutParams()).m35811();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44983(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44986(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.mTempList1;
        m44983(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C1540 c1540 = (C1540) view.getLayoutParams();
            AbstractC1155 abstractC1155 = c1540.f45609;
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && abstractC1155 != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = abstractC1155.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = abstractC1155.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zM35807 = c1540.m35807();
                boolean zM35809 = c1540.m35809(this, view);
                z = zM35809 && !zM35807;
                if (zM35809 && !z) {
                    break;
                }
            } else if (abstractC1155 != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC1155.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC1155.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m44985(true);
        }
        boolean zM44986 = m44986(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM44986;
        }
        m44985(true);
        return zM44986;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM44986;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zM44986 = m44986(motionEvent, 1);
            if (!zM44986) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zM44986) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            m44985(false);
            return zOnTouchEvent;
        }
        zM44986 = false;
        AbstractC1155 abstractC1155 = ((C1540) this.mBehaviorTouchView.getLayoutParams()).f45609;
        if (abstractC1155 != null) {
            zOnTouchEvent = abstractC1155.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zM44986) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m44985(false);
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        m44985(false);
        this.mDisallowInterceptReset = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m44972(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i < 0 || i >= iArr.length) {
            toString();
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC1155 m44975(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = sConstructors;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC1155) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(C21466.m48631("Could not inflate Behavior subclass ", str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1540 getResolvedLayoutParams(View view) {
        C1540 c1540 = (C1540) view.getLayoutParams();
        if (!c1540.f45600) {
            if (view instanceof InterfaceC1365) {
                c1540.m35805(((InterfaceC1365) view).getBehavior());
                c1540.f45600 = true;
                return c1540;
            }
            InterfaceC1435 interfaceC1435 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC1435 = (InterfaceC1435) superclass.getAnnotation(InterfaceC1435.class);
                if (interfaceC1435 != null) {
                    break;
                }
            }
            if (interfaceC1435 != null) {
                try {
                    c1540.m35805((AbstractC1155) interfaceC1435.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    interfaceC1435.value().getName();
                }
            }
            c1540.f45600 = true;
        }
        return c1540;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0066 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:32:0x0072
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: ۧ */
    private void m44989() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C1751.m44989():void");
    }

    public void getDescendantRect(View view, Rect rect) {
        C1576.m37360(this, view, rect);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        AbstractC1155 abstractC1155;
        C1540 c1540;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax;
        m44989();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i12 = C1717.f57146;
        int layoutDirection = getLayoutDirection();
        boolean z = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i13 = paddingLeft + paddingRight;
        int i14 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.mLastInsets != null && getFitsSystemWindows();
        int size3 = this.mDependencySortedChildren.size();
        int i15 = suggestedMinimumWidth;
        int i16 = suggestedMinimumHeight;
        C1751 c1751 = this;
        int iCombineMeasuredStates = 0;
        int i17 = 0;
        while (i17 < size3) {
            View view = (View) c1751.mDependencySortedChildren.get(i17);
            int i18 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i11 = size3;
                iCombineMeasuredStates = i18;
                i9 = i17;
            } else {
                C1540 c1541 = (C1540) view.getLayoutParams();
                int i19 = c1541.f45605;
                if (i19 < 0 || mode == 0) {
                    i3 = i17;
                    i4 = i16;
                } else {
                    int iM44972 = c1751.m44972(i19);
                    i3 = i17;
                    int absoluteGravity = Gravity.getAbsoluteGravity(m44994(c1541.f45604), layoutDirection) & 7;
                    i4 = i16;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - iM44972);
                    } else {
                        if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                            iMax = Math.max(0, iM44972 - paddingLeft);
                        }
                        if (z2 || view.getFitsSystemWindows()) {
                            i6 = i;
                            iMakeMeasureSpec = i2;
                        } else {
                            int iM51182 = c1751.mLastInsets.m51182() + c1751.mLastInsets.m51172();
                            int iM51183 = c1751.mLastInsets.m51183() + c1751.mLastInsets.m51174();
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - iM51182, mode);
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2 - iM51183, mode2);
                            i6 = iMakeMeasureSpec2;
                        }
                        abstractC1155 = c1541.f45609;
                        if (abstractC1155 != null) {
                            c1540 = c1541;
                            i9 = i3;
                            i8 = i18;
                            i10 = i4;
                            i7 = i15;
                            i11 = size3;
                            if (!abstractC1155.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                            }
                            C1540 c1542 = c1540;
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c1542).leftMargin + ((ViewGroup.MarginLayoutParams) c1542).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c1542).topMargin + ((ViewGroup.MarginLayoutParams) c1542).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                            i15 = iMax2;
                            i16 = iMax3;
                            c1751 = this;
                        } else {
                            c1540 = c1541;
                            i7 = i15;
                            i8 = i18;
                            i9 = i3;
                            i10 = i4;
                            i11 = size3;
                        }
                        onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                        C1540 c1543 = c1540;
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c1543).leftMargin + ((ViewGroup.MarginLayoutParams) c1543).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c1543).topMargin + ((ViewGroup.MarginLayoutParams) c1543).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax4;
                        i16 = iMax5;
                        c1751 = this;
                    }
                    i5 = iMax;
                    if (z2) {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    } else {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    }
                    abstractC1155 = c1541.f45609;
                    if (abstractC1155 != null) {
                        c1540 = c1541;
                        i9 = i3;
                        i8 = i18;
                        i10 = i4;
                        i7 = i15;
                        i11 = size3;
                        if (!abstractC1155.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                        }
                        C1540 c1544 = c1540;
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c1544).leftMargin + ((ViewGroup.MarginLayoutParams) c1544).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c1544).topMargin + ((ViewGroup.MarginLayoutParams) c1544).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax6;
                        i16 = iMax7;
                        c1751 = this;
                    } else {
                        c1540 = c1541;
                        i7 = i15;
                        i8 = i18;
                        i9 = i3;
                        i10 = i4;
                        i11 = size3;
                    }
                    onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                    C1540 c1545 = c1540;
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c1545).leftMargin + ((ViewGroup.MarginLayoutParams) c1545).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c1545).topMargin + ((ViewGroup.MarginLayoutParams) c1545).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax8;
                    i16 = iMax9;
                    c1751 = this;
                }
                i5 = 0;
                if (z2) {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                } else {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                }
                abstractC1155 = c1541.f45609;
                if (abstractC1155 != null) {
                    c1540 = c1541;
                    i9 = i3;
                    i8 = i18;
                    i10 = i4;
                    i7 = i15;
                    i11 = size3;
                    if (!abstractC1155.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                    }
                    C1540 c1546 = c1540;
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c1546).leftMargin + ((ViewGroup.MarginLayoutParams) c1546).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c1546).topMargin + ((ViewGroup.MarginLayoutParams) c1546).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax10;
                    i16 = iMax11;
                    c1751 = this;
                } else {
                    c1540 = c1541;
                    i7 = i15;
                    i8 = i18;
                    i9 = i3;
                    i10 = i4;
                    i11 = size3;
                }
                onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                C1540 c1547 = c1540;
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c1547).leftMargin + ((ViewGroup.MarginLayoutParams) c1547).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c1547).topMargin + ((ViewGroup.MarginLayoutParams) c1547).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                i15 = iMax12;
                i16 = iMax13;
                c1751 = this;
            }
            i17 = i9 + 1;
            size3 = i11;
        }
        int i20 = iCombineMeasuredStates;
        c1751.setMeasuredDimension(View.resolveSizeAndState(i15, i, (-16777216) & i20), View.resolveSizeAndState(i16, i2, i20 << 16));
    }

    /* JADX INFO: renamed from: ֫ */
    private C1914 m44976(C1914 c1914) {
        AbstractC1155 abstractC1155;
        if (c1914.m51178()) {
            return c1914;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int i2 = C1717.f57146;
            if (childAt.getFitsSystemWindows() && (abstractC1155 = ((C1540) childAt.getLayoutParams()).f45609) != null) {
                c1914 = abstractC1155.onApplyWindowInsets(this, childAt, c1914);
                if (c1914.m51178()) {
                    return c1914;
                }
            }
        }
        return c1914;
    }

    public void onLayoutChild(View view, int i) {
        C1540 c1540 = (C1540) view.getLayoutParams();
        View view2 = c1540.f45598;
        if (view2 == null && c1540.f45610 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            m44982(view, view2, i);
            return;
        }
        int i2 = c1540.f45605;
        if (i2 >= 0) {
            m44979(view, i2, i);
        } else {
            m44978(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC1155 abstractC1155;
        int i5 = C1717.f57146;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.mDependencySortedChildren.get(i6);
            if (view.getVisibility() != 8 && ((abstractC1155 = ((C1540) view.getLayoutParams()).f45609) == null || !abstractC1155.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        C1914 c1914 = this.mLastInsets;
        int iM51174 = c1914 != null ? c1914.m51174() : 0;
        if (iM51174 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM51174);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m44992();
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C1540) view.getLayoutParams()).f45597.set(rect);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C1540) view.getLayoutParams()).f45597);
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44980(View view, int i, Rect rect, Rect rect2, C1540 c1540, int i2, int i3) {
        int iWidth;
        int iHeight;
        int absoluteGravity = Gravity.getAbsoluteGravity(m44988(c1540.f45604), i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(m44991(c1540.f45594), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (i6 == 1) {
            iWidth = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            iWidth = rect.left;
        } else {
            iWidth = rect.right;
        }
        if (i7 == 16) {
            iHeight = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            iHeight = rect.top;
        } else {
            iHeight = rect.bottom;
        }
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44984(C1540 c1540, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1540).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c1540).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1540).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c1540).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C1540 c1540 = (C1540) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m44980(view, i, rect, rect2, c1540, measuredWidth, measuredHeight);
        m44984(c1540, rect2, measuredWidth, measuredHeight);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44982(View view, View view2, int i) {
        Rect rectM44974 = m44974();
        Rect rectM44975 = m44974();
        try {
            getDescendantRect(view2, rectM44974);
            getDesiredAnchoredChildRect(view, i, rectM44974, rectM44975);
            view.layout(rectM44975.left, rectM44975.top, rectM44975.right, rectM44975.bottom);
        } finally {
            m44977(rectM44974);
            m44977(rectM44975);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44979(View view, int i, int i2) {
        int i3;
        C1540 c1540 = (C1540) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(m44994(c1540.f45604), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iM44972 = m44972(i) - measuredWidth;
        if (i4 == 1) {
            iM44972 += measuredWidth / 2;
        } else if (i4 == 5) {
            iM44972 += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1540).leftMargin, Math.min(iM44972, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c1540).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1540).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1540).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44978(View view, int i) {
        C1540 c1540 = (C1540) view.getLayoutParams();
        Rect rectM44974 = m44974();
        rectM44974.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1540).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1540).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1540).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1540).bottomMargin);
        if (this.mLastInsets != null) {
            int i2 = C1717.f57146;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectM44974.left = this.mLastInsets.m51172() + rectM44974.left;
                rectM44974.top = this.mLastInsets.m51174() + rectM44974.top;
                rectM44974.right -= this.mLastInsets.m51182();
                rectM44974.bottom -= this.mLastInsets.m51183();
            }
        }
        Rect rectM44975 = m44974();
        Gravity.apply(m44991(c1540.f45604), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM44974, rectM44975, i);
        view.layout(rectM44975.left, rectM44975.top, rectM44975.right, rectM44975.bottom);
        m44977(rectM44974);
        m44977(rectM44975);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C1540 c1540 = (C1540) view.getLayoutParams();
        AbstractC1155 abstractC1155 = c1540.f45609;
        if (abstractC1155 != null) {
            float scrimOpacity = abstractC1155.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c1540.f45609.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(m44973(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    public final void onChildViewsChanged(int i) {
        int i2;
        AbstractC1155 abstractC1155;
        boolean zOnDependentViewChanged;
        int i3 = C1717.f57146;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect rectM44974 = m44974();
        Rect rectM44975 = m44974();
        Rect rectM44976 = m44974();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.mDependencySortedChildren.get(i4);
            C1540 c1540 = (C1540) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (c1540.f45602 == ((View) this.mDependencySortedChildren.get(i5))) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, rectM44975);
                if (c1540.f45606 != 0 && !rectM44975.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c1540.f45606, layoutDirection);
                    int i6 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i6 == 48) {
                        rectM44974.top = Math.max(rectM44974.top, rectM44975.bottom);
                    } else if (i6 == 80) {
                        rectM44974.bottom = Math.max(rectM44974.bottom, getHeight() - rectM44975.top);
                    }
                    int i7 = absoluteGravity & 7;
                    if (i7 == 3) {
                        rectM44974.left = Math.max(rectM44974.left, rectM44975.right);
                    } else if (i7 == 5) {
                        rectM44974.right = Math.max(rectM44974.right, getWidth() - rectM44975.left);
                    }
                }
                if (c1540.f45601 != 0 && view.getVisibility() == 0) {
                    m44981(view, rectM44974, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, rectM44976);
                    if (!rectM44976.equals(rectM44975)) {
                        recordLastChildRect(view, rectM44975);
                        for (i2 = i4 + 1; i2 < size; i2++) {
                            View view2 = (View) this.mDependencySortedChildren.get(i2);
                            C1540 c1541 = (C1540) view2.getLayoutParams();
                            abstractC1155 = c1541.f45609;
                            if (abstractC1155 == null && abstractC1155.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && c1541.m35814()) {
                                    c1541.m35813();
                                } else {
                                    if (i == 2) {
                                        abstractC1155.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    } else {
                                        zOnDependentViewChanged = abstractC1155.onDependentViewChanged(this, view2, view);
                                    }
                                    if (i == 1) {
                                        c1541.m35806(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        View view3 = (View) this.mDependencySortedChildren.get(i2);
                        C1540 c1542 = (C1540) view3.getLayoutParams();
                        abstractC1155 = c1542.f45609;
                        if (abstractC1155 == null) {
                        }
                    }
                }
            }
        }
        m44977(rectM44974);
        m44977(rectM44975);
        m44977(rectM44976);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44981(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        int i8 = C1717.f57146;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            C1540 c1540 = (C1540) view.getLayoutParams();
            AbstractC1155 abstractC1155 = c1540.f45609;
            Rect rectM44974 = m44974();
            Rect rectM44975 = m44974();
            rectM44975.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC1155 != null && abstractC1155.getInsetDodgeRect(this, view, rectM44974)) {
                if (!rectM44975.contains(rectM44974)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM44974.toShortString() + " | Bounds:" + rectM44975.toShortString());
                }
            } else {
                rectM44974.set(rectM44975);
            }
            m44977(rectM44975);
            if (!rectM44974.isEmpty()) {
                int absoluteGravity = Gravity.getAbsoluteGravity(c1540.f45601, i);
                boolean z3 = true;
                if ((absoluteGravity & 48) != 48 || (i6 = (rectM44974.top - ((ViewGroup.MarginLayoutParams) c1540).topMargin) - c1540.f45593) >= (i7 = rect.top)) {
                    z = false;
                } else {
                    m44993(view, i7 - i6);
                    z = true;
                }
                if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectM44974.bottom) - ((ViewGroup.MarginLayoutParams) c1540).bottomMargin) + c1540.f45593) < (i5 = rect.bottom)) {
                    m44993(view, height - i5);
                    z = true;
                }
                if (!z) {
                    m44993(view, 0);
                }
                if ((absoluteGravity & 3) != 3 || (i3 = (rectM44974.left - ((ViewGroup.MarginLayoutParams) c1540).leftMargin) - c1540.f45608) >= (i4 = rect.left)) {
                    z2 = false;
                } else {
                    m44990(view, i4 - i3);
                    z2 = true;
                }
                if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectM44974.right) - ((ViewGroup.MarginLayoutParams) c1540).rightMargin) + c1540.f45608) >= (i2 = rect.right)) {
                    z3 = z2;
                } else {
                    m44990(view, width - i2);
                }
                if (!z3) {
                    m44990(view, 0);
                }
                m44977(rectM44974);
                return;
            }
            m44977(rectM44974);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m44990(View view, int i) {
        C1540 c1540 = (C1540) view.getLayoutParams();
        int i2 = c1540.f45608;
        if (i2 != i) {
            C1717.m43571(i - i2, view);
            c1540.f45608 = i;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m44993(View view, int i) {
        C1540 c1540 = (C1540) view.getLayoutParams();
        int i2 = c1540.f45593;
        if (i2 != i) {
            C1717.m43578(i - i2, view);
            c1540.f45593 = i;
        }
    }

    public void dispatchDependentViewsChanged(View view) {
        List listM43461 = this.mChildDag.m43461(view);
        if (listM43461 == null || listM43461.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM43461.size(); i++) {
            View view2 = (View) listM43461.get(i);
            AbstractC1155 abstractC1155 = ((C1540) view2.getLayoutParams()).f45609;
            if (abstractC1155 != null) {
                abstractC1155.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public List getDependencies(View view) {
        ArrayList arrayListM43463 = this.mChildDag.m43463(view);
        this.mTempDependenciesList.clear();
        if (arrayListM43463 != null) {
            this.mTempDependenciesList.addAll(arrayListM43463);
        }
        return this.mTempDependenciesList;
    }

    public List getDependents(View view) {
        List listM43461 = this.mChildDag.m43461(view);
        this.mTempDependenciesList.clear();
        if (listM43461 != null) {
            this.mTempDependenciesList.addAll(listM43461);
        }
        return this.mTempDependenciesList;
    }

    public final List getDependencySortedChildren() {
        m44989();
        return C21562.unmodifiableList(this.mDependencySortedChildren);
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (m44987(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44987(View view) {
        return this.mChildDag.m43462(view);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC1225(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    public void offsetChildToAnchor(View view, int i) {
        AbstractC1155 abstractC1155;
        C1540 c1540 = (C1540) view.getLayoutParams();
        if (c1540.f45598 != null) {
            Rect rectM44974 = m44974();
            Rect rectM44975 = m44974();
            Rect rectM44976 = m44974();
            getDescendantRect(c1540.f45598, rectM44974);
            getChildRect(view, false, rectM44975);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m44980(view, i, rectM44974, rectM44976, c1540, measuredWidth, measuredHeight);
            boolean z = (rectM44976.left == rectM44975.left && rectM44976.top == rectM44975.top) ? false : true;
            m44984(c1540, rectM44976, measuredWidth, measuredHeight);
            int i2 = rectM44976.left - rectM44975.left;
            int i3 = rectM44976.top - rectM44975.top;
            if (i2 != 0) {
                C1717.m43571(i2, view);
            }
            if (i3 != 0) {
                C1717.m43578(i3, view);
            }
            if (z && (abstractC1155 = c1540.f45609) != null) {
                abstractC1155.onDependentViewChanged(this, view, c1540.f45598);
            }
            m44977(rectM44974);
            m44977(rectM44975);
            m44977(rectM44976);
        }
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect rectM44974 = m44974();
        getDescendantRect(view, rectM44974);
        try {
            return rectM44974.contains(i, i2);
        } finally {
            m44977(rectM44974);
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectM44974 = m44974();
        getChildRect(view, view.getParent() != this, rectM44974);
        Rect rectM44975 = m44974();
        getChildRect(view2, view2.getParent() != this, rectM44975);
        try {
            if (rectM44974.left <= rectM44975.right && rectM44974.top <= rectM44975.bottom && rectM44974.right >= rectM44975.left && rectM44974.bottom >= rectM44975.top) {
                z = true;
            }
            return z;
        } finally {
            m44977(rectM44974);
            m44977(rectM44975);
        }
    }

    @Override // android.view.ViewGroup
    public C1540 generateLayoutParams(AttributeSet attributeSet) {
        return new C1540(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C1540 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1540) {
            return new C1540((C1540) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1540((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1540(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C1540 generateDefaultLayoutParams() {
        return new C1540();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1540) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // p067l.InterfaceC1203
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1540 c1540 = (C1540) childAt.getLayoutParams();
                AbstractC1155 abstractC1155 = c1540.f45609;
                if (abstractC1155 != null) {
                    boolean zOnStartNestedScroll = abstractC1155.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    c1540.m35804(i2, zOnStartNestedScroll);
                    z |= zOnStartNestedScroll;
                } else {
                    c1540.m35804(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // p067l.InterfaceC1203
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC1155 abstractC1155;
        this.mNestedScrollingParentHelper.m29339(i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C1540 c1540 = (C1540) childAt.getLayoutParams();
            if (c1540.m35808(i2) && (abstractC1155 = c1540.f45609) != null) {
                abstractC1155.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // p067l.InterfaceC1203
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.m29341(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1540 c1540 = (C1540) childAt.getLayoutParams();
            if (c1540.m35808(i)) {
                AbstractC1155 abstractC1155 = c1540.f45609;
                if (abstractC1155 != null) {
                    abstractC1155.onStopNestedScroll(this, childAt, view, i);
                }
                c1540.m35804(i, false);
                c1540.m35813();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // p067l.InterfaceC1203
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // p067l.InterfaceC0931
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC1155 abstractC1155;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1540 c1540 = (C1540) childAt.getLayoutParams();
                if (c1540.m35808(i5) && (abstractC1155 = c1540.f45609) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1155.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    int iMax2 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i6 = iMax2;
                    iMax = i4 > 0 ? Math.max(iMax, iArr4[1]) : Math.min(iMax, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + iMax;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // p067l.InterfaceC1203
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC1155 abstractC1155;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1540 c1540 = (C1540) childAt.getLayoutParams();
                if (c1540.m35808(i3) && (abstractC1155 = c1540.f45609) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1155.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    int iMax2 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i4 = iMax2;
                    iMax = i2 > 0 ? Math.max(iMax, iArr4[1]) : Math.min(iMax, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = iMax;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC1155 abstractC1155;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1540 c1540 = (C1540) childAt.getLayoutParams();
                if (c1540.m35808(0) && (abstractC1155 = c1540.f45609) != null) {
                    zOnNestedFling |= abstractC1155.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC1155 abstractC1155;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1540 c1540 = (C1540) childAt.getLayoutParams();
                if (c1540.m35808(0) && (abstractC1155 = c1540.f45609) != null) {
                    zOnNestedPreFling |= abstractC1155.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m29337();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1401)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1401 c1401 = (C1401) parcelable;
        super.onRestoreInstanceState(c1401.getSuperState());
        SparseArray sparseArray = c1401.f36789;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1155 abstractC1155 = getResolvedLayoutParams(childAt).f45609;
            if (id != -1 && abstractC1155 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1155.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        C1401 c1401 = new C1401(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1155 abstractC1155 = ((C1540) childAt.getLayoutParams()).f45609;
            if (id != -1 && abstractC1155 != null && (parcelableOnSaveInstanceState = abstractC1155.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        c1401.f36789 = sparseArray;
        return c1401;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC1155 abstractC1155 = ((C1540) view.getLayoutParams()).f45609;
        if (abstractC1155 == null || !abstractC1155.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m44992() {
        int i = C1717.f57146;
        if (getFitsSystemWindows()) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new C1470(this);
            }
            C1717.m43556(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        C1717.m43556(this, (InterfaceC1666) null);
    }
}
