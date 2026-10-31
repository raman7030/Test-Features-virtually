package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 165A */
/* JADX INFO: loaded from: classes.dex */
public class C22524 extends AbstractC1357 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f72879;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f72880;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f72881;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public TextView f72882;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View f72883;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f72884;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f72885;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f72886;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f72887;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public LinearLayout f72888;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f72889;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public TextView f72890;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public C22524(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C22524(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, C3390.f10716, i, 0);
        setBackground(c22733M50796.m50815(0));
        this.f72885 = c22733M50796.m50806(5, 0);
        this.f72879 = c22733M50796.m50806(4, 0);
        this.f4923 = c22733M50796.m50811(3, 0);
        this.f72889 = c22733M50796.m50806(2, R.layout.MT_Protector);
        c22733M50796.m50813();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C17254 c17254 = this.f4922;
        if (c17254 != null) {
            c17254.m40550();
            C6296 c6296 = this.f4922.f52901;
            if (c6296 != null) {
                c6296.m42629();
            }
        }
    }

    @Override // l.AbstractC1357
    /* JADX INFO: renamed from: ֫ */
    public final void mo4722(int i) {
        this.f4923 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50510(View view) {
        LinearLayout linearLayout;
        View view2 = this.f72884;
        if (view2 != null) {
            removeView(view2);
        }
        this.f72884 = view;
        if (view != null && (linearLayout = this.f72888) != null) {
            removeView(linearLayout);
            this.f72888 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50515(CharSequence charSequence) {
        this.f72886 = charSequence;
        m50507();
        C17648.m41305(this, charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50511(CharSequence charSequence) {
        this.f72881 = charSequence;
        m50507();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence m50517() {
        return this.f72886;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence m50514() {
        return this.f72881;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m50507() {
        if (this.f72888 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f72888 = linearLayout;
            this.f72890 = (TextView) linearLayout.findViewById(R.id.MT_Protector);
            this.f72882 = (TextView) this.f72888.findViewById(R.id.MT_Protector);
            int i = this.f72885;
            if (i != 0) {
                this.f72890.setTextAppearance(getContext(), i);
            }
            int i2 = this.f72879;
            if (i2 != 0) {
                this.f72882.setTextAppearance(getContext(), i2);
            }
        }
        this.f72890.setText(this.f72886);
        this.f72882.setText(this.f72881);
        boolean zIsEmpty = TextUtils.isEmpty(this.f72886);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f72881);
        this.f72882.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f72888.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f72888.getParent() == null) {
            addView(this.f72888);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15530 m50508(int i, long j) {
        C15530 c15530 = this.f4918;
        if (c15530 != null) {
            c15530.m36598();
        }
        C5591 c5591 = this.f4919;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C15530 c15530M41298 = C17648.m41298(this);
            c15530M41298.m36599(1.0f);
            c15530M41298.m36600(j);
            c5591.f17305.f4918 = c15530M41298;
            c5591.f17304 = i;
            c15530M41298.m36602(c5591);
            return c15530M41298;
        }
        C15530 c15530M41299 = C17648.m41298(this);
        c15530M41299.m36599(0.0f);
        c15530M41299.m36600(j);
        c5591.f17305.f4918 = c15530M41299;
        c5591.f17304 = i;
        c15530M41299.m36602(c5591);
        return c15530M41299;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50512(AbstractC3557 abstractC3557) {
        View view = this.f72880;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f72889, (ViewGroup) this, false);
            this.f72880 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f72880);
        }
        View viewFindViewById = this.f72880.findViewById(R.id.MT_Protector);
        this.f72883 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC21819(abstractC3557));
        C3060 c3060Mo10836 = abstractC3557.mo10836();
        C17254 c17254 = this.f4922;
        if (c17254 != null) {
            c17254.m40550();
            C6296 c6296 = c17254.f52901;
            if (c6296 != null) {
                c6296.m42629();
            }
        }
        C17254 c17255 = new C17254(getContext());
        this.f4922 = c17255;
        c17255.m40553();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c3060Mo10836.addMenuPresenter(this.f4922, this.f4920);
        C8788 c8788 = (C8788) this.f4922.mo22488(this);
        this.f4916 = c8788;
        c8788.setBackground(null);
        addView(this.f4916, layoutParams);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50509() {
        if (this.f72880 == null) {
            m50518();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m50518() {
        removeAllViews();
        this.f72884 = null;
        this.f4916 = null;
        this.f4922 = null;
        View view = this.f72883;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50516() {
        C17254 c17254 = this.f4922;
        if (c17254 != null) {
            c17254.m40547();
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
        int size2 = this.f4923;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f72880;
        if (view != null) {
            int iM4719 = AbstractC1357.m4719(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f72880.getLayoutParams();
            paddingLeft = iM4719 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        C8788 c8788 = this.f4916;
        if (c8788 != null && c8788.getParent() == this) {
            paddingLeft = AbstractC1357.m4719(this.f4916, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f72888;
        if (linearLayout != null && this.f72884 == null) {
            if (this.f72887) {
                this.f72888.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f72888.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f72888.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC1357.m4719(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f72884;
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
            this.f72884.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f4923 <= 0) {
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
        int i5 = C22461.f72738;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f72880;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f72880.getLayoutParams();
            int i6 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z2 ? paddingRight - i6 : paddingRight + i6;
            int iM4718 = i8 + AbstractC1357.m4718(i8, paddingTop, paddingTop2, this.f72880, z2);
            paddingRight = z2 ? iM4718 - i7 : iM4718 + i7;
        }
        LinearLayout linearLayout = this.f72888;
        if (linearLayout != null && this.f72884 == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC1357.m4718(paddingRight, paddingTop, paddingTop2, this.f72888, z2);
        }
        View view2 = this.f72884;
        if (view2 != null) {
            AbstractC1357.m4718(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        C8788 c8788 = this.f4916;
        if (c8788 != null) {
            AbstractC1357.m4718(paddingLeft, paddingTop, paddingTop2, c8788, !z2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50513(boolean z) {
        if (z != this.f72887) {
            requestLayout();
        }
        this.f72887 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50519() {
        return this.f72887;
    }
}
