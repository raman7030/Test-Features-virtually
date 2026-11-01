package p067l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩷ */
/* JADX INFO: compiled from: 165A */
/* JADX INFO: loaded from: classes.dex */
public class C1959 extends AbstractC0909 {

    /* JADX INFO: renamed from: ֫֫ */
    public int f75606;

    /* JADX INFO: renamed from: ۛ */
    public View f75607;

    /* JADX INFO: renamed from: ۟ */
    public CharSequence f75608;

    /* JADX INFO: renamed from: ۧ֫ */
    public TextView f75609;

    /* JADX INFO: renamed from: ۨ */
    public View f75610;

    /* JADX INFO: renamed from: ܰ */
    public View f75611;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f75612;

    /* JADX INFO: renamed from: ܽ֫ */
    public CharSequence f75613;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f75614;

    /* JADX INFO: renamed from: ᩳ֫ */
    public LinearLayout f75615;

    /* JADX INFO: renamed from: ᩺ */
    public int f75616;

    /* JADX INFO: renamed from: ᩻֫ */
    public TextView f75617;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public C1959(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1959(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, C1010.f13523, i, 0);
        setBackground(c1970M53129.m53148(0));
        this.f75612 = c1970M53129.m53139(5, 0);
        this.f75606 = c1970M53129.m53139(4, 0);
        this.f7695 = c1970M53129.m53144(3, 0);
        this.f75616 = c1970M53129.m53139(2, R.layout.MT_Protector);
        c1970M53129.m53146();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1698 c1698 = this.f7694;
        if (c1698 != null) {
            c1698.m42799();
            C1154 c1154 = this.f7694.f56083;
            if (c1154 != null) {
                c1154.m44889();
            }
        }
    }

    @Override // p067l.AbstractC0909
    /* JADX INFO: renamed from: ֫ */
    public final void mo6960(int i) {
        this.f7695 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52852(View view) {
        LinearLayout linearLayout;
        View view2 = this.f75611;
        if (view2 != null) {
            removeView(view2);
        }
        this.f75611 = view;
        if (view != null && (linearLayout = this.f75615) != null) {
            removeView(linearLayout);
            this.f75615 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52857(CharSequence charSequence) {
        this.f75613 = charSequence;
        m52849();
        C1717.m43551(this, charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52853(CharSequence charSequence) {
        this.f75608 = charSequence;
        m52849();
    }

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence m52859() {
        return this.f75613;
    }

    /* JADX INFO: renamed from: ۧ */
    public final CharSequence m52856() {
        return this.f75608;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m52849() {
        if (this.f75615 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f75615 = linearLayout;
            this.f75617 = (TextView) linearLayout.findViewById(R.id.MT_Protector);
            this.f75609 = (TextView) this.f75615.findViewById(R.id.MT_Protector);
            int i = this.f75612;
            if (i != 0) {
                this.f75617.setTextAppearance(getContext(), i);
            }
            int i2 = this.f75606;
            if (i2 != 0) {
                this.f75609.setTextAppearance(getContext(), i2);
            }
        }
        this.f75617.setText(this.f75613);
        this.f75609.setText(this.f75608);
        boolean zIsEmpty = TextUtils.isEmpty(this.f75613);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f75608);
        this.f75609.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f75615.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f75615.getParent() == null) {
            addView(this.f75615);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1612 m52850(int i, long j) {
        C1612 c1612 = this.f7690;
        if (c1612 != null) {
            c1612.m38758();
        }
        C1119 c1119 = this.f7691;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1612 c1612M43544 = C1717.m43544(this);
            c1612M43544.m38759(1.0f);
            c1612M43544.m38760(j);
            c1119.f20149.f7690 = c1612M43544;
            c1119.f20148 = i;
            c1612M43544.m38762(c1119);
            return c1612M43544;
        }
        C1612 c1612M43545 = C1717.m43544(this);
        c1612M43545.m38759(0.0f);
        c1612M43545.m38760(j);
        c1119.f20149.f7690 = c1612M43545;
        c1119.f20148 = i;
        c1612M43545.m38762(c1119);
        return c1612M43545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52854(AbstractC1018 abstractC1018) {
        View view = this.f75607;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f75616, (ViewGroup) this, false);
            this.f75607 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f75607);
        }
        View viewFindViewById = this.f75607.findViewById(R.id.MT_Protector);
        this.f75610 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1924(abstractC1018));
        C0994 c0994Mo12816 = abstractC1018.mo12816();
        C1698 c1698 = this.f7694;
        if (c1698 != null) {
            c1698.m42799();
            C1154 c1154 = c1698.f56083;
            if (c1154 != null) {
                c1154.m44889();
            }
        }
        C1698 c1699 = new C1698(getContext());
        this.f7694 = c1699;
        c1699.m42802();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0994Mo12816.addMenuPresenter(this.f7694, this.f7692);
        C1278 c1278 = (C1278) this.f7694.mo24457(this);
        this.f7688 = c1278;
        c1278.setBackground(null);
        addView(this.f7688, layoutParams);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52851() {
        if (this.f75607 == null) {
            m52860();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m52860() {
        removeAllViews();
        this.f75611 = null;
        this.f7688 = null;
        this.f7694 = null;
        View view = this.f75610;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m52858() {
        C1698 c1698 = this.f7694;
        if (c1698 != null) {
            c1698.m42796();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f7695;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f75607;
        if (view != null) {
            int iM6957 = AbstractC0909.m6957(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f75607.getLayoutParams();
            paddingLeft = iM6957 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        C1278 c1278 = this.f7688;
        if (c1278 != null && c1278.getParent() == this) {
            paddingLeft = AbstractC0909.m6957(this.f7688, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f75615;
        if (linearLayout != null && this.f75611 == null) {
            if (this.f75614) {
                this.f75615.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f75615.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f75615.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC0909.m6957(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f75611;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f75611.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f7695 <= 0) {
            int childCount = getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i7) {
                    i7 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i7);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C1956.f75466;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f75607;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f75607.getLayoutParams();
            int i6 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z2 ? paddingRight - i6 : paddingRight + i6;
            int iM6956 = i8 + AbstractC0909.m6956(i8, paddingTop, paddingTop2, this.f75607, z2);
            paddingRight = z2 ? iM6956 - i7 : iM6956 + i7;
        }
        LinearLayout linearLayout = this.f75615;
        if (linearLayout != null && this.f75611 == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC0909.m6956(paddingRight, paddingTop, paddingTop2, this.f75615, z2);
        }
        View view2 = this.f75611;
        if (view2 != null) {
            AbstractC0909.m6956(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        C1278 c1278 = this.f7688;
        if (c1278 != null) {
            AbstractC0909.m6956(paddingLeft, paddingTop, paddingTop2, c1278, !z2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52855(boolean z) {
        if (z != this.f75614) {
            requestLayout();
        }
        this.f75614 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52861() {
        return this.f75614;
    }
}
