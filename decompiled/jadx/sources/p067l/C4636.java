package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۖ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4636 extends ViewGroup {

    /* JADX INFO: renamed from: ֫֫ */
    public final Rect f10388;

    /* JADX INFO: renamed from: ۗ */
    public C5481 f10389;

    /* JADX INFO: renamed from: ۙ */
    public C6822 f10390;

    /* JADX INFO: renamed from: ۛ */
    public C19941 f10391;

    /* JADX INFO: renamed from: ۟ */
    public C12187 f10392;

    /* JADX INFO: renamed from: ۤ */
    public C6822 f10393;

    /* JADX INFO: renamed from: ۧ֫ */
    public final Rect f10394;

    /* JADX INFO: renamed from: ۨ */
    public Parcelable f10395;

    /* JADX INFO: renamed from: ۫ */
    public int f10396;

    /* JADX INFO: renamed from: ۬ */
    public C8541 f10397;

    /* JADX INFO: renamed from: ܰ */
    public C14849 f10398;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f10399;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f10400;

    /* JADX INFO: renamed from: ᩸ */
    public C24752 f10401;

    /* JADX INFO: renamed from: ᩹ */
    public int f10402;

    /* JADX INFO: renamed from: ᩺ */
    public int f10403;

    public C4636(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10394 = new Rect();
        this.f10388 = new Rect();
        this.f10390 = new C6822();
        this.f10400 = false;
        new C8163(this);
        this.f10403 = -1;
        this.f10399 = true;
        this.f10396 = -1;
        m9775(context, attributeSet);
    }

    public C4636(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10394 = new Rect();
        this.f10388 = new Rect();
        this.f10390 = new C6822();
        this.f10400 = false;
        new C8163(this);
        this.f10403 = -1;
        this.f10399 = true;
        this.f10396 = -1;
        m9775(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m9775(Context context, AttributeSet attributeSet) {
        this.f10401 = new C24752(this);
        C22071 c22071 = new C22071(this, context);
        this.f10398 = c22071;
        int i = C1717.f57146;
        c22071.setId(View.generateViewId());
        this.f10398.setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        C12683 c12683 = new C12683(this, context);
        this.f10397 = c12683;
        this.f10398.setLayoutManager(c12683);
        this.f10398.setScrollingTouchSlop(1);
        int[] iArr = C7493.f19590;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C1717.m43548(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            this.f10397.setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            this.f10401.m54413();
            typedArrayObtainStyledAttributes.recycle();
            this.f10398.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f10398.addOnChildAttachStateChangeListener(new C15538());
            this.f10392 = new C12187(this);
            this.f10389 = new C5481();
            C8659 c8659 = new C8659(this);
            this.f10391 = c8659;
            c8659.attachToRecyclerView(this.f10398);
            this.f10398.addOnScrollListener(this.f10392);
            C6822 c6822 = new C6822();
            this.f10393 = c6822;
            this.f10392.m28146(c6822);
            C13528 c13528 = new C13528(this);
            C24256 c24256 = new C24256(this);
            this.f10393.m15616(c13528);
            this.f10393.m15616(c24256);
            C24752 c24752 = this.f10401;
            C14849 c14849 = this.f10398;
            c24752.getClass();
            c14849.setImportantForAccessibility(2);
            new C16034(c24752);
            C4636 c4636 = c24752.f78357;
            if (c4636.getImportantForAccessibility() == 0) {
                c4636.setImportantForAccessibility(1);
            }
            this.f10393.m15616(this.f10390);
            this.f10393.m15616(new C14868());
            C14849 c148410 = this.f10398;
            attachViewToParent(c148410, 0, c148410.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f10401.getClass();
        this.f10401.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C10671 c10671 = new C10671(super.onSaveInstanceState());
        c10671.f29521 = this.f10398.getId();
        int i = this.f10403;
        if (i == -1) {
            i = this.f10402;
        }
        c10671.f29523 = i;
        Parcelable parcelable = this.f10395;
        if (parcelable != null) {
            c10671.f29522 = parcelable;
            return c10671;
        }
        Object adapter = this.f10398.getAdapter();
        if (adapter instanceof InterfaceC22916) {
            c10671.f29522 = ((InterfaceC22916) adapter).m51190();
        }
        return c10671;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10671)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10671 c10671 = (C10671) parcelable;
        super.onRestoreInstanceState(c10671.getSuperState());
        this.f10403 = c10671.f29523;
        this.f10395 = c10671.f29522;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        AbstractC21283 adapter;
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C10671) {
            int i = ((C10671) parcelable).f29521;
            sparseArray.put(this.f10398.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        if (this.f10403 == -1 || (adapter = this.f10398.getAdapter()) == 0) {
            return;
        }
        if (this.f10395 != null) {
            if (adapter instanceof InterfaceC22916) {
                ((InterfaceC22916) adapter).m51191();
            }
            this.f10395 = null;
        }
        int iMax = Math.max(0, Math.min(this.f10403, adapter.getItemCount() - 1));
        this.f10402 = iMax;
        this.f10403 = -1;
        this.f10398.scrollToPosition(iMax);
        this.f10401.m54413();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21283 m9776() {
        return this.f10398.getAdapter();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9780(int i, boolean z) {
        AbstractC21283 adapter = this.f10398.getAdapter();
        if (adapter == null) {
            if (this.f10403 != -1) {
                this.f10403 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f10402 && this.f10392.m28148()) {
            return;
        }
        int i2 = this.f10402;
        if (iMin == i2 && z) {
            return;
        }
        double dM28144 = i2;
        this.f10402 = iMin;
        this.f10401.m54413();
        if (!this.f10392.m28148()) {
            dM28144 = this.f10392.m28144();
        }
        this.f10392.m28145(iMin, z);
        if (!z) {
            this.f10398.scrollToPosition(iMin);
            return;
        }
        double d = iMin;
        if (Math.abs(d - dM28144) > 3.0d) {
            this.f10398.scrollToPosition(d > dM28144 ? iMin - 3 : iMin + 3);
            C14849 c14849 = this.f10398;
            c14849.post(new RunnableC17375(c14849, iMin));
            return;
        }
        this.f10398.smoothScrollToPosition(iMin);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f10398, i, i2);
        int measuredWidth = this.f10398.getMeasuredWidth();
        int measuredHeight = this.f10398.getMeasuredHeight();
        int measuredState = this.f10398.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f10398.getMeasuredWidth();
        int measuredHeight = this.f10398.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f10394;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f10388;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f10398.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f10400) {
            m9786();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m9786() {
        C19941 c19941 = this.f10391;
        if (c19941 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = c19941.findSnapView(this.f10397);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f10397.getPosition(viewFindSnapView);
        if (position != this.f10402 && this.f10392.m28147() == 0) {
            this.f10393.onPageSelected(position);
        }
        this.f10400 = false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m9785() {
        return this.f10397.getOrientation() == 1 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m9779() {
        return this.f10402;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9777(int i, boolean z) {
        this.f10389.getClass();
        m9780(i, z);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m9784() {
        this.f10389.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m9782() {
        return this.f10399;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m9783() {
        return this.f10396;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f10398.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f10398.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9778(AbstractC18046 abstractC18046) {
        this.f10390.m15616(abstractC18046);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9781(AbstractC18046 abstractC18046) {
        this.f10390.m15617(abstractC18046);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f10401.m54413();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C24752 c24752 = this.f10401;
        C1555 c1555M36397 = C1555.m36397(accessibilityNodeInfo);
        C4636 c4636 = c24752.f78357;
        if (c4636.f10398.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (c4636.m9785() == 1) {
            itemCount = c4636.f10398.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = c4636.f10398.getAdapter().getItemCount();
            itemCount = 1;
        }
        c1555M36397.m36417(C1660.m41076(itemCount, itemCount2, 0, false));
        AbstractC21283 adapter = c4636.f10398.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !c4636.f10399) {
            return;
        }
        if (c4636.f10402 > 0) {
            c1555M36397.m36408(8192);
        }
        if (c4636.f10402 < itemCount3 - 1) {
            c1555M36397.m36408(4096);
        }
        c1555M36397.m36446(true);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f10401.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C4636 c4636 = this.f10401.f78357;
        if (i == 8192 || i == 4096) {
            int i2 = i == 8192 ? c4636.f10402 - 1 : c4636.f10402 + 1;
            if (c4636.m9782()) {
                c4636.m9780(i2, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }
}
