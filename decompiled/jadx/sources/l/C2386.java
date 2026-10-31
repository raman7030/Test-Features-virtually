package l;

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
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۖ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2386 extends ViewGroup {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Rect f7597;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3275 f7598;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4686 f7599;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C18490 f7600;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10331 f7601;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4686 f7602;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Rect f7603;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Parcelable f7604;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f7605;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C6495 f7606;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13132 f7607;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f7608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7609;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23552 f7610;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7611;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f7612;

    public C2386(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7603 = new Rect();
        this.f7597 = new Rect();
        this.f7599 = new C4686();
        this.f7609 = false;
        new C6097(this);
        this.f7612 = -1;
        this.f7608 = true;
        this.f7605 = -1;
        m7714(context, attributeSet);
    }

    public C2386(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7603 = new Rect();
        this.f7597 = new Rect();
        this.f7599 = new C4686();
        this.f7609 = false;
        new C6097(this);
        this.f7612 = -1;
        this.f7608 = true;
        this.f7605 = -1;
        m7714(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7714(Context context, AttributeSet attributeSet) {
        this.f7610 = new C23552(this);
        C20731 c20731 = new C20731(this, context);
        this.f7607 = c20731;
        int i = C17648.f53953;
        c20731.setId(View.generateViewId());
        this.f7607.setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        C10853 c10853 = new C10853(this, context);
        this.f7606 = c10853;
        this.f7607.setLayoutManager(c10853);
        this.f7607.setScrollingTouchSlop(1);
        int[] iArr = C5392.f16752;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C17648.m41302(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            this.f7606.setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            this.f7610.m52011();
            typedArrayObtainStyledAttributes.recycle();
            this.f7607.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f7607.addOnChildAttachStateChangeListener(new C13857());
            this.f7601 = new C10331(this);
            this.f7598 = new C3275();
            C6619 c6619 = new C6619(this);
            this.f7600 = c6619;
            c6619.attachToRecyclerView(this.f7607);
            this.f7607.addOnScrollListener(this.f7601);
            C4686 c4686 = new C4686();
            this.f7602 = c4686;
            this.f7601.m26121(c4686);
            C11742 c11742 = new C11742(this);
            C23030 c23030 = new C23030(this);
            this.f7602.m13741(c11742);
            this.f7602.m13741(c23030);
            C23552 c23552 = this.f7610;
            C13132 c13132 = this.f7607;
            c23552.getClass();
            c13132.setImportantForAccessibility(2);
            new C14379(c23552);
            C2386 c2386 = c23552.f75611;
            if (c2386.getImportantForAccessibility() == 0) {
                c2386.setImportantForAccessibility(1);
            }
            this.f7602.m13741(this.f7599);
            this.f7602.m13741(new C13152());
            C13132 c13133 = this.f7607;
            attachViewToParent(c13133, 0, c13133.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f7610.getClass();
        this.f7610.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C8736 c8736 = new C8736(super.onSaveInstanceState());
        c8736.f26596 = this.f7607.getId();
        int i = this.f7612;
        if (i == -1) {
            i = this.f7611;
        }
        c8736.f26598 = i;
        Parcelable parcelable = this.f7604;
        if (parcelable != null) {
            c8736.f26597 = parcelable;
            return c8736;
        }
        Object adapter = this.f7607.getAdapter();
        if (adapter instanceof InterfaceC21620) {
            c8736.f26597 = ((InterfaceC21620) adapter).m48842();
        }
        return c8736;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8736)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8736 c8736 = (C8736) parcelable;
        super.onRestoreInstanceState(c8736.getSuperState());
        this.f7612 = c8736.f26598;
        this.f7604 = c8736.f26597;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        AbstractC19902 adapter;
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C8736) {
            int i = ((C8736) parcelable).f26596;
            sparseArray.put(this.f7607.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        if (this.f7612 == -1 || (adapter = this.f7607.getAdapter()) == 0) {
            return;
        }
        if (this.f7604 != null) {
            if (adapter instanceof InterfaceC21620) {
                ((InterfaceC21620) adapter).m48843();
            }
            this.f7604 = null;
        }
        int iMax = Math.max(0, Math.min(this.f7612, adapter.getItemCount() - 1));
        this.f7611 = iMax;
        this.f7612 = -1;
        this.f7607.scrollToPosition(iMax);
        this.f7610.m52011();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19902 m7715() {
        return this.f7607.getAdapter();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7719(int i, boolean z) {
        AbstractC19902 adapter = this.f7607.getAdapter();
        if (adapter == null) {
            if (this.f7612 != -1) {
                this.f7612 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f7611 && this.f7601.m26123()) {
            return;
        }
        int i2 = this.f7611;
        if (iMin == i2 && z) {
            return;
        }
        double dM26119 = i2;
        this.f7611 = iMin;
        this.f7610.m52011();
        if (!this.f7601.m26123()) {
            dM26119 = this.f7601.m26119();
        }
        this.f7601.m26120(iMin, z);
        if (!z) {
            this.f7607.scrollToPosition(iMin);
            return;
        }
        double d = iMin;
        if (Math.abs(d - dM26119) > 3.0d) {
            this.f7607.scrollToPosition(d > dM26119 ? iMin - 3 : iMin + 3);
            C13132 c13132 = this.f7607;
            c13132.post(new RunnableC15790(c13132, iMin));
            return;
        }
        this.f7607.smoothScrollToPosition(iMin);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f7607, i, i2);
        int measuredWidth = this.f7607.getMeasuredWidth();
        int measuredHeight = this.f7607.getMeasuredHeight();
        int measuredState = this.f7607.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f7607.getMeasuredWidth();
        int measuredHeight = this.f7607.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f7603;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f7597;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f7607.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f7609) {
            m7725();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m7725() {
        C18490 c18490 = this.f7600;
        if (c18490 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = c18490.findSnapView(this.f7606);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f7606.getPosition(viewFindSnapView);
        if (position != this.f7611 && this.f7601.m26122() == 0) {
            this.f7602.onPageSelected(position);
        }
        this.f7609 = false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m7724() {
        return this.f7606.getOrientation() == 1 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7718() {
        return this.f7611;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7716(int i, boolean z) {
        this.f7598.getClass();
        m7719(i, z);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m7723() {
        this.f7598.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m7721() {
        return this.f7608;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m7722() {
        return this.f7605;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f7607.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f7607.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7717(AbstractC16496 abstractC16496) {
        this.f7599.m13741(abstractC16496);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7720(AbstractC16496 abstractC16496) {
        this.f7599.m13742(abstractC16496);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f7610.m52011();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C23552 c23552 = this.f7610;
        C14369 c14369M34264 = C14369.m34264(accessibilityNodeInfo);
        C2386 c2386 = c23552.f75611;
        if (c2386.f7607.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (c2386.m7724() == 1) {
            itemCount = c2386.f7607.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = c2386.f7607.getAdapter().getItemCount();
            itemCount = 1;
        }
        c14369M34264.m34284(C16486.m38850(itemCount, itemCount2, 0, false));
        AbstractC19902 adapter = c2386.f7607.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !c2386.f7608) {
            return;
        }
        if (c2386.f7611 > 0) {
            c14369M34264.m34275(8192);
        }
        if (c2386.f7611 < itemCount3 - 1) {
            c14369M34264.m34275(4096);
        }
        c14369M34264.m34313(true);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f7610.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C2386 c2386 = this.f7610.f75611;
        if (i == 8192 || i == 4096) {
            int i2 = i == 8192 ? c2386.f7611 - 1 : c2386.f7611 + 1;
            if (c2386.m7721()) {
                c2386.m7719(i2, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }
}
