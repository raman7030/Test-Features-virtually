package p067l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* JADX INFO: renamed from: l.ۢۜ */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnClickListenerC1309 extends C1567 implements InterfaceC2029, View.OnClickListener, InterfaceC1558 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC1064 f31500;

    /* JADX INFO: renamed from: ۙ */
    public C1134 f31501;

    /* JADX INFO: renamed from: ۛ */
    public int f31502;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC1869 f31503;

    /* JADX INFO: renamed from: ۨ */
    public CharSequence f31504;

    /* JADX INFO: renamed from: ۫ */
    public int f31505;

    /* JADX INFO: renamed from: ۬ */
    public int f31506;

    /* JADX INFO: renamed from: ᩶ */
    public Drawable f31507;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f31508;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractViewOnTouchListenerC1532 f31509;

    @Override // p067l.InterfaceC2029
    public final boolean prefersCondensedTitle() {
        return true;
    }

    public ViewOnClickListenerC1309(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC1309(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f31508 = m26260();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1010.f13521, i, 0);
        this.f31505 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f31506 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f31502 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f31508 = m26260();
        m26261();
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m26260() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f31502 = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // p067l.InterfaceC2029
    public final C1134 getItemData() {
        return this.f31501;
    }

    @Override // p067l.InterfaceC2029
    public final void initialize(C1134 c1134, int i) {
        this.f31501 = c1134;
        Drawable icon = c1134.getIcon();
        this.f31507 = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f31506;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, null, null, null);
        m26261();
        this.f31504 = c1134.m18373(this);
        m26261();
        setId(c1134.getItemId());
        setVisibility(c1134.isVisible() ? 0 : 8);
        setEnabled(c1134.isEnabled());
        if (c1134.hasSubMenu() && this.f31509 == null) {
            this.f31509 = new C1169(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1532 abstractViewOnTouchListenerC1532;
        if (this.f31501.hasSubMenu() && (abstractViewOnTouchListenerC1532 = this.f31509) != null && abstractViewOnTouchListenerC1532.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1064 interfaceC1064 = this.f31500;
        if (interfaceC1064 != null) {
            interfaceC1064.mo5681(this.f31501);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26262(InterfaceC1064 interfaceC1064) {
        this.f31500 = interfaceC1064;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26263(AbstractC1869 abstractC1869) {
        this.f31503 = abstractC1869;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m26261() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f31504);
        if (this.f31507 != null && (!this.f31501.m18385() || !this.f31508)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f31504 : null);
        CharSequence contentDescription = this.f31501.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f31501.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f31501.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C1781.m45965(this, z3 ? null : this.f31501.getTitle());
        } else {
            C1781.m45965(this, tooltipText);
        }
    }

    @Override // p067l.C1567, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f31502) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f31505;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f31507 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f31507.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // p067l.InterfaceC1558
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22603() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p067l.InterfaceC1558
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo22604() {
        return !TextUtils.isEmpty(getText()) && this.f31501.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
