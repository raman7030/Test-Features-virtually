package l;

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
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes5.dex */
public class C18333 extends ViewGroup implements InterfaceC7273, InterfaceC1794 {
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
    public static final InterfaceC5986 sRectPool;
    public InterfaceC16610 mApplyWindowInsetsListener;
    public final int[] mBehaviorConsumed;
    public View mBehaviorTouchView;
    public final C17627 mChildDag;
    public final List mDependencySortedChildren;
    public boolean mDisallowInterceptReset;
    public boolean mDrawStatusBarBackground;
    public boolean mIsAttachedToWindow;
    public int[] mKeylines;
    public C21610 mLastInsets;
    public boolean mNeedsPreDrawListener;
    public final C10967 mNestedScrollingParentHelper;
    public View mNestedScrollingTarget;
    public final int[] mNestedScrollingV2ConsumedCompat;
    public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    public ViewTreeObserverOnPreDrawListenerC7728 mOnPreDrawListener;
    public Paint mScrimPaint;
    public Drawable mStatusBarBackground;
    public final List mTempDependenciesList;
    public final List mTempList1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42711(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m42726(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m42729(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0 ? i | 48 : i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m42732(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    static {
        Package r0 = C18333.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C16921();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal();
        sRectPool = new C22919(12);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rect m42712() {
        Rect rect = (Rect) sRectPool.mo16806();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42715(Rect rect) {
        rect.setEmpty();
        sRectPool.mo16807(rect);
    }

    public C18333(Context context) {
        this(context, null);
    }

    public C18333(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C18333(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new C17627();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C10967();
        int[] iArr = C13372.f39996;
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
        m42730();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC23250(this));
        int i3 = C17648.f53953;
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
        m42723(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC7728(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            int i = C17648.f53953;
            if (getFitsSystemWindows()) {
                C17648.m41339(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m42723(false);
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
                int i = C17648.f53953;
                C8184.m21681(drawable3, getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            int i2 = C17648.f53953;
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
        setStatusBarBackground(i != 0 ? C0881.m3234(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public final C21610 setWindowInsets(C21610 c21610) {
        if (C11003.equals(this.mLastInsets, c21610)) {
            return c21610;
        }
        this.mLastInsets = c21610;
        boolean z = false;
        boolean z2 = c21610 != null && c21610.m48826() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        C21610 c21610M42714 = m42714(c21610);
        requestLayout();
        return c21610M42714;
    }

    public final C21610 getLastWindowInsets() {
        return this.mLastInsets;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42723(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC6317 abstractC6317 = ((C14077) childAt.getLayoutParams()).f42523;
            if (abstractC6317 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC6317.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    abstractC6317.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C14077) getChildAt(i2).getLayoutParams()).m33686();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42721(List list) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42724(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.mTempList1;
        m42721(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C14077 c14077 = (C14077) view.getLayoutParams();
            AbstractC6317 abstractC6317 = c14077.f42523;
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && abstractC6317 != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = abstractC6317.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = abstractC6317.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zM33682 = c14077.m33682();
                boolean zM33684 = c14077.m33684(this, view);
                z = zM33684 && !zM33682;
                if (zM33684 && !z) {
                    break;
                }
            } else if (abstractC6317 != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC6317.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC6317.onTouchEvent(this, view, motionEventObtain);
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
            m42723(true);
        }
        boolean zM42724 = m42724(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM42724;
        }
        m42723(true);
        return zM42724;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM42724;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zM42724 = m42724(motionEvent, 1);
            if (!zM42724) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zM42724) {
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
            m42723(false);
            return zOnTouchEvent;
        }
        zM42724 = false;
        AbstractC6317 abstractC6317 = ((C14077) this.mBehaviorTouchView.getLayoutParams()).f42523;
        if (abstractC6317 != null) {
            zOnTouchEvent = abstractC6317.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zM42724) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m42723(false);
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        m42723(false);
        this.mDisallowInterceptReset = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m42710(int i) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6317 m42713(Context context, AttributeSet attributeSet, String str) {
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
            return (AbstractC6317) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(C20094.m46315("Could not inflate Behavior subclass ", str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14077 getResolvedLayoutParams(View view) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        if (!c14077.f42514) {
            if (view instanceof InterfaceC10551) {
                c14077.m33680(((InterfaceC10551) view).getBehavior());
                c14077.f42514 = true;
                return c14077;
            }
            InterfaceC11962 interfaceC11962 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC11962 = (InterfaceC11962) superclass.getAnnotation(InterfaceC11962.class);
                if (interfaceC11962 != null) {
                    break;
                }
            }
            if (interfaceC11962 != null) {
                try {
                    c14077.m33680((AbstractC6317) interfaceC11962.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    interfaceC11962.value().getName();
                }
            }
            c14077.f42514 = true;
        }
        return c14077;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42727() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18333.m42727():void");
    }

    public void getDescendantRect(View view, Rect rect) {
        C14804.m35212(this, view, rect);
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
        AbstractC6317 abstractC6317;
        C14077 c14077;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax;
        m42727();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i12 = C17648.f53953;
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
        C18333 c18333 = this;
        int iCombineMeasuredStates = 0;
        int i17 = 0;
        while (i17 < size3) {
            View view = (View) c18333.mDependencySortedChildren.get(i17);
            int i18 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i11 = size3;
                iCombineMeasuredStates = i18;
                i9 = i17;
            } else {
                C14077 c14078 = (C14077) view.getLayoutParams();
                int i19 = c14078.f42519;
                if (i19 < 0 || mode == 0) {
                    i3 = i17;
                    i4 = i16;
                } else {
                    int iM42710 = c18333.m42710(i19);
                    i3 = i17;
                    int absoluteGravity = Gravity.getAbsoluteGravity(m42732(c14078.f42518), layoutDirection) & 7;
                    i4 = i16;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - iM42710);
                    } else {
                        if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                            iMax = Math.max(0, iM42710 - paddingLeft);
                        }
                        if (z2 || view.getFitsSystemWindows()) {
                            i6 = i;
                            iMakeMeasureSpec = i2;
                        } else {
                            int iM48834 = c18333.mLastInsets.m48834() + c18333.mLastInsets.m48824();
                            int iM48835 = c18333.mLastInsets.m48835() + c18333.mLastInsets.m48826();
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - iM48834, mode);
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2 - iM48835, mode2);
                            i6 = iMakeMeasureSpec2;
                        }
                        abstractC6317 = c14078.f42523;
                        if (abstractC6317 != null) {
                            c14077 = c14078;
                            i9 = i3;
                            i8 = i18;
                            i10 = i4;
                            i7 = i15;
                            i11 = size3;
                            if (!abstractC6317.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                            }
                            C14077 c14079 = c14077;
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c14079).leftMargin + ((ViewGroup.MarginLayoutParams) c14079).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c14079).topMargin + ((ViewGroup.MarginLayoutParams) c14079).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                            i15 = iMax2;
                            i16 = iMax3;
                            c18333 = this;
                        } else {
                            c14077 = c14078;
                            i7 = i15;
                            i8 = i18;
                            i9 = i3;
                            i10 = i4;
                            i11 = size3;
                        }
                        onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                        C14077 c140710 = c14077;
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c140710).leftMargin + ((ViewGroup.MarginLayoutParams) c140710).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c140710).topMargin + ((ViewGroup.MarginLayoutParams) c140710).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax4;
                        i16 = iMax5;
                        c18333 = this;
                    }
                    i5 = iMax;
                    if (z2) {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    } else {
                        i6 = i;
                        iMakeMeasureSpec = i2;
                    }
                    abstractC6317 = c14078.f42523;
                    if (abstractC6317 != null) {
                        c14077 = c14078;
                        i9 = i3;
                        i8 = i18;
                        i10 = i4;
                        i7 = i15;
                        i11 = size3;
                        if (!abstractC6317.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                        }
                        C14077 c140711 = c14077;
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c140711).leftMargin + ((ViewGroup.MarginLayoutParams) c140711).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c140711).topMargin + ((ViewGroup.MarginLayoutParams) c140711).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                        i15 = iMax6;
                        i16 = iMax7;
                        c18333 = this;
                    } else {
                        c14077 = c14078;
                        i7 = i15;
                        i8 = i18;
                        i9 = i3;
                        i10 = i4;
                        i11 = size3;
                    }
                    onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                    C14077 c140712 = c14077;
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c140712).leftMargin + ((ViewGroup.MarginLayoutParams) c140712).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c140712).topMargin + ((ViewGroup.MarginLayoutParams) c140712).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax8;
                    i16 = iMax9;
                    c18333 = this;
                }
                i5 = 0;
                if (z2) {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                } else {
                    i6 = i;
                    iMakeMeasureSpec = i2;
                }
                abstractC6317 = c14078.f42523;
                if (abstractC6317 != null) {
                    c14077 = c14078;
                    i9 = i3;
                    i8 = i18;
                    i10 = i4;
                    i7 = i15;
                    i11 = size3;
                    if (!abstractC6317.onMeasureChild(this, view, i6, i5, iMakeMeasureSpec, 0)) {
                    }
                    C14077 c140713 = c14077;
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c140713).leftMargin + ((ViewGroup.MarginLayoutParams) c140713).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c140713).topMargin + ((ViewGroup.MarginLayoutParams) c140713).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                    i15 = iMax10;
                    i16 = iMax11;
                    c18333 = this;
                } else {
                    c14077 = c14078;
                    i7 = i15;
                    i8 = i18;
                    i9 = i3;
                    i10 = i4;
                    i11 = size3;
                }
                onMeasureChild(view, i6, i5, iMakeMeasureSpec, 0);
                C14077 c140714 = c14077;
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i13 + ((ViewGroup.MarginLayoutParams) c140714).leftMargin + ((ViewGroup.MarginLayoutParams) c140714).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i14 + ((ViewGroup.MarginLayoutParams) c140714).topMargin + ((ViewGroup.MarginLayoutParams) c140714).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i8, view.getMeasuredState());
                i15 = iMax12;
                i16 = iMax13;
                c18333 = this;
            }
            i17 = i9 + 1;
            size3 = i11;
        }
        int i20 = iCombineMeasuredStates;
        c18333.setMeasuredDimension(View.resolveSizeAndState(i15, i, (-16777216) & i20), View.resolveSizeAndState(i16, i2, i20 << 16));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21610 m42714(C21610 c21610) {
        AbstractC6317 abstractC6317;
        if (c21610.m48830()) {
            return c21610;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int i2 = C17648.f53953;
            if (childAt.getFitsSystemWindows() && (abstractC6317 = ((C14077) childAt.getLayoutParams()).f42523) != null) {
                c21610 = abstractC6317.onApplyWindowInsets(this, childAt, c21610);
                if (c21610.m48830()) {
                    return c21610;
                }
            }
        }
        return c21610;
    }

    public void onLayoutChild(View view, int i) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        View view2 = c14077.f42512;
        if (view2 == null && c14077.f42524 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            m42720(view, view2, i);
            return;
        }
        int i2 = c14077.f42519;
        if (i2 >= 0) {
            m42717(view, i2, i);
        } else {
            m42716(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC6317 abstractC6317;
        int i5 = C17648.f53953;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.mDependencySortedChildren.get(i6);
            if (view.getVisibility() != 8 && ((abstractC6317 = ((C14077) view.getLayoutParams()).f42523) == null || !abstractC6317.onLayoutChild(this, view, layoutDirection))) {
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
        C21610 c21610 = this.mLastInsets;
        int iM48826 = c21610 != null ? c21610.m48826() : 0;
        if (iM48826 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM48826);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m42730();
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C14077) view.getLayoutParams()).f42511.set(rect);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C14077) view.getLayoutParams()).f42511);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42718(View view, int i, Rect rect, Rect rect2, C14077 c14077, int i2, int i3) {
        int iWidth;
        int iHeight;
        int absoluteGravity = Gravity.getAbsoluteGravity(m42726(c14077.f42518), i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(m42729(c14077.f42508), i);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42722(C14077 c14077, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c14077).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c14077).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14077).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c14077).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m42718(view, i, rect, rect2, c14077, measuredWidth, measuredHeight);
        m42722(c14077, rect2, measuredWidth, measuredHeight);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42720(View view, View view2, int i) {
        Rect rectM42712 = m42712();
        Rect rectM42713 = m42712();
        try {
            getDescendantRect(view2, rectM42712);
            getDesiredAnchoredChildRect(view, i, rectM42712, rectM42713);
            view.layout(rectM42713.left, rectM42713.top, rectM42713.right, rectM42713.bottom);
        } finally {
            m42715(rectM42712);
            m42715(rectM42713);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42717(View view, int i, int i2) {
        int i3;
        C14077 c14077 = (C14077) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(m42732(c14077.f42518), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iM42710 = m42710(i) - measuredWidth;
        if (i4 == 1) {
            iM42710 += measuredWidth / 2;
        } else if (i4 == 5) {
            iM42710 += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c14077).leftMargin, Math.min(iM42710, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c14077).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14077).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c14077).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42716(View view, int i) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        Rect rectM42712 = m42712();
        rectM42712.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c14077).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14077).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c14077).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c14077).bottomMargin);
        if (this.mLastInsets != null) {
            int i2 = C17648.f53953;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectM42712.left = this.mLastInsets.m48824() + rectM42712.left;
                rectM42712.top = this.mLastInsets.m48826() + rectM42712.top;
                rectM42712.right -= this.mLastInsets.m48834();
                rectM42712.bottom -= this.mLastInsets.m48835();
            }
        }
        Rect rectM42713 = m42712();
        Gravity.apply(m42729(c14077.f42518), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM42712, rectM42713, i);
        view.layout(rectM42713.left, rectM42713.top, rectM42713.right, rectM42713.bottom);
        m42715(rectM42712);
        m42715(rectM42713);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        AbstractC6317 abstractC6317 = c14077.f42523;
        if (abstractC6317 != null) {
            float scrimOpacity = abstractC6317.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c14077.f42523.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(m42711(Math.round(scrimOpacity * 255.0f), 0, 255));
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
        AbstractC6317 abstractC6317;
        boolean zOnDependentViewChanged;
        int i3 = C17648.f53953;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect rectM42712 = m42712();
        Rect rectM42713 = m42712();
        Rect rectM42714 = m42712();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.mDependencySortedChildren.get(i4);
            C14077 c14077 = (C14077) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (c14077.f42516 == ((View) this.mDependencySortedChildren.get(i5))) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, rectM42713);
                if (c14077.f42520 != 0 && !rectM42713.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c14077.f42520, layoutDirection);
                    int i6 = absoluteGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i6 == 48) {
                        rectM42712.top = Math.max(rectM42712.top, rectM42713.bottom);
                    } else if (i6 == 80) {
                        rectM42712.bottom = Math.max(rectM42712.bottom, getHeight() - rectM42713.top);
                    }
                    int i7 = absoluteGravity & 7;
                    if (i7 == 3) {
                        rectM42712.left = Math.max(rectM42712.left, rectM42713.right);
                    } else if (i7 == 5) {
                        rectM42712.right = Math.max(rectM42712.right, getWidth() - rectM42713.left);
                    }
                }
                if (c14077.f42515 != 0 && view.getVisibility() == 0) {
                    m42719(view, rectM42712, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, rectM42714);
                    if (!rectM42714.equals(rectM42713)) {
                        recordLastChildRect(view, rectM42713);
                        for (i2 = i4 + 1; i2 < size; i2++) {
                            View view2 = (View) this.mDependencySortedChildren.get(i2);
                            C14077 c14078 = (C14077) view2.getLayoutParams();
                            abstractC6317 = c14078.f42523;
                            if (abstractC6317 == null && abstractC6317.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && c14078.m33689()) {
                                    c14078.m33688();
                                } else {
                                    if (i == 2) {
                                        abstractC6317.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    } else {
                                        zOnDependentViewChanged = abstractC6317.onDependentViewChanged(this, view2, view);
                                    }
                                    if (i == 1) {
                                        c14078.m33681(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        View view3 = (View) this.mDependencySortedChildren.get(i2);
                        C14077 c14079 = (C14077) view3.getLayoutParams();
                        abstractC6317 = c14079.f42523;
                        if (abstractC6317 == null) {
                        }
                    }
                }
            }
        }
        m42715(rectM42712);
        m42715(rectM42713);
        m42715(rectM42714);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42719(View view, Rect rect, int i) {
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
        int i8 = C17648.f53953;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            C14077 c14077 = (C14077) view.getLayoutParams();
            AbstractC6317 abstractC6317 = c14077.f42523;
            Rect rectM42712 = m42712();
            Rect rectM42713 = m42712();
            rectM42713.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC6317 != null && abstractC6317.getInsetDodgeRect(this, view, rectM42712)) {
                if (!rectM42713.contains(rectM42712)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM42712.toShortString() + " | Bounds:" + rectM42713.toShortString());
                }
            } else {
                rectM42712.set(rectM42713);
            }
            m42715(rectM42713);
            if (!rectM42712.isEmpty()) {
                int absoluteGravity = Gravity.getAbsoluteGravity(c14077.f42515, i);
                boolean z3 = true;
                if ((absoluteGravity & 48) != 48 || (i6 = (rectM42712.top - ((ViewGroup.MarginLayoutParams) c14077).topMargin) - c14077.f42507) >= (i7 = rect.top)) {
                    z = false;
                } else {
                    m42731(view, i7 - i6);
                    z = true;
                }
                if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectM42712.bottom) - ((ViewGroup.MarginLayoutParams) c14077).bottomMargin) + c14077.f42507) < (i5 = rect.bottom)) {
                    m42731(view, height - i5);
                    z = true;
                }
                if (!z) {
                    m42731(view, 0);
                }
                if ((absoluteGravity & 3) != 3 || (i3 = (rectM42712.left - ((ViewGroup.MarginLayoutParams) c14077).leftMargin) - c14077.f42522) >= (i4 = rect.left)) {
                    z2 = false;
                } else {
                    m42728(view, i4 - i3);
                    z2 = true;
                }
                if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectM42712.right) - ((ViewGroup.MarginLayoutParams) c14077).rightMargin) + c14077.f42522) >= (i2 = rect.right)) {
                    z3 = z2;
                } else {
                    m42728(view, width - i2);
                }
                if (!z3) {
                    m42728(view, 0);
                }
                m42715(rectM42712);
                return;
            }
            m42715(rectM42712);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42728(View view, int i) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        int i2 = c14077.f42522;
        if (i2 != i) {
            C17648.m41325(i - i2, view);
            c14077.f42522 = i;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m42731(View view, int i) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        int i2 = c14077.f42507;
        if (i2 != i) {
            C17648.m41332(i - i2, view);
            c14077.f42507 = i;
        }
    }

    public void dispatchDependentViewsChanged(View view) {
        List listM41215 = this.mChildDag.m41215(view);
        if (listM41215 == null || listM41215.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM41215.size(); i++) {
            View view2 = (View) listM41215.get(i);
            AbstractC6317 abstractC6317 = ((C14077) view2.getLayoutParams()).f42523;
            if (abstractC6317 != null) {
                abstractC6317.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public List getDependencies(View view) {
        ArrayList arrayListM41217 = this.mChildDag.m41217(view);
        this.mTempDependenciesList.clear();
        if (arrayListM41217 != null) {
            this.mTempDependenciesList.addAll(arrayListM41217);
        }
        return this.mTempDependenciesList;
    }

    public List getDependents(View view) {
        List listM41215 = this.mChildDag.m41215(view);
        this.mTempDependenciesList.clear();
        if (listM41215 != null) {
            this.mTempDependenciesList.addAll(listM41215);
        }
        return this.mTempDependenciesList;
    }

    public final List getDependencySortedChildren() {
        m42727();
        return C20195.unmodifiableList(this.mDependencySortedChildren);
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (m42725(getChildAt(i))) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42725(View view) {
        return this.mChildDag.m41216(view);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC7728(this);
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
        AbstractC6317 abstractC6317;
        C14077 c14077 = (C14077) view.getLayoutParams();
        if (c14077.f42512 != null) {
            Rect rectM42712 = m42712();
            Rect rectM42713 = m42712();
            Rect rectM42714 = m42712();
            getDescendantRect(c14077.f42512, rectM42712);
            getChildRect(view, false, rectM42713);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m42718(view, i, rectM42712, rectM42714, c14077, measuredWidth, measuredHeight);
            boolean z = (rectM42714.left == rectM42713.left && rectM42714.top == rectM42713.top) ? false : true;
            m42722(c14077, rectM42714, measuredWidth, measuredHeight);
            int i2 = rectM42714.left - rectM42713.left;
            int i3 = rectM42714.top - rectM42713.top;
            if (i2 != 0) {
                C17648.m41325(i2, view);
            }
            if (i3 != 0) {
                C17648.m41332(i3, view);
            }
            if (z && (abstractC6317 = c14077.f42523) != null) {
                abstractC6317.onDependentViewChanged(this, view, c14077.f42512);
            }
            m42715(rectM42712);
            m42715(rectM42713);
            m42715(rectM42714);
        }
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect rectM42712 = m42712();
        getDescendantRect(view, rectM42712);
        try {
            return rectM42712.contains(i, i2);
        } finally {
            m42715(rectM42712);
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectM42712 = m42712();
        getChildRect(view, view.getParent() != this, rectM42712);
        Rect rectM42713 = m42712();
        getChildRect(view2, view2.getParent() != this, rectM42713);
        try {
            if (rectM42712.left <= rectM42713.right && rectM42712.top <= rectM42713.bottom && rectM42712.right >= rectM42713.left && rectM42712.bottom >= rectM42713.top) {
                z = true;
            }
            return z;
        } finally {
            m42715(rectM42712);
            m42715(rectM42713);
        }
    }

    @Override // android.view.ViewGroup
    public C14077 generateLayoutParams(AttributeSet attributeSet) {
        return new C14077(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C14077 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C14077) {
            return new C14077((C14077) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C14077((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C14077(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C14077 generateDefaultLayoutParams() {
        return new C14077();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C14077) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // l.InterfaceC7273
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C14077 c14077 = (C14077) childAt.getLayoutParams();
                AbstractC6317 abstractC6317 = c14077.f42523;
                if (abstractC6317 != null) {
                    boolean zOnStartNestedScroll = abstractC6317.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    c14077.m33679(i2, zOnStartNestedScroll);
                    z |= zOnStartNestedScroll;
                } else {
                    c14077.m33679(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // l.InterfaceC7273
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC6317 abstractC6317;
        this.mNestedScrollingParentHelper.m27277(i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C14077 c14077 = (C14077) childAt.getLayoutParams();
            if (c14077.m33683(i2) && (abstractC6317 = c14077.f42523) != null) {
                abstractC6317.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // l.InterfaceC7273
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.m27279(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C14077 c14077 = (C14077) childAt.getLayoutParams();
            if (c14077.m33683(i)) {
                AbstractC6317 abstractC6317 = c14077.f42523;
                if (abstractC6317 != null) {
                    abstractC6317.onStopNestedScroll(this, childAt, view, i);
                }
                c14077.m33679(i, false);
                c14077.m33688();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // l.InterfaceC7273
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // l.InterfaceC1794
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC6317 abstractC6317;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C14077 c14077 = (C14077) childAt.getLayoutParams();
                if (c14077.m33683(i5) && (abstractC6317 = c14077.f42523) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC6317.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
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

    @Override // l.InterfaceC7273
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC6317 abstractC6317;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C14077 c14077 = (C14077) childAt.getLayoutParams();
                if (c14077.m33683(i3) && (abstractC6317 = c14077.f42523) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC6317.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
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
        AbstractC6317 abstractC6317;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C14077 c14077 = (C14077) childAt.getLayoutParams();
                if (c14077.m33683(0) && (abstractC6317 = c14077.f42523) != null) {
                    zOnNestedFling |= abstractC6317.onNestedFling(this, childAt, view, f, f2, z);
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
        AbstractC6317 abstractC6317;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C14077 c14077 = (C14077) childAt.getLayoutParams();
                if (c14077.m33683(0) && (abstractC6317 = c14077.f42523) != null) {
                    zOnNestedPreFling |= abstractC6317.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m27275();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C11278)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C11278 c11278 = (C11278) parcelable;
        super.onRestoreInstanceState(c11278.getSuperState());
        SparseArray sparseArray = c11278.f33790;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC6317 abstractC6317 = getResolvedLayoutParams(childAt).f42523;
            if (id != -1 && abstractC6317 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC6317.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        C11278 c11278 = new C11278(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC6317 abstractC6317 = ((C14077) childAt.getLayoutParams()).f42523;
            if (id != -1 && abstractC6317 != null && (parcelableOnSaveInstanceState = abstractC6317.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        c11278.f33790 = sparseArray;
        return c11278;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC6317 abstractC6317 = ((C14077) view.getLayoutParams()).f42523;
        if (abstractC6317 == null || !abstractC6317.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m42730() {
        int i = C17648.f53953;
        if (getFitsSystemWindows()) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new C12667(this);
            }
            C17648.m41310(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        C17648.m41310(this, (InterfaceC16610) null);
    }
}
