package l;

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

/* JADX INFO: renamed from: l.ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnClickListenerC9411 extends C14615 implements InterfaceC23935, View.OnClickListener, InterfaceC14431 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC4471 f28553;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5882 f28554;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f28555;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC20700 f28556;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence f28557;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f28558;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f28559;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f28560;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f28561;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractViewOnTouchListenerC13909 f28562;

    @Override // l.InterfaceC23935
    public final boolean prefersCondensedTitle() {
        return true;
    }

    public ViewOnClickListenerC9411(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC9411(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f28561 = m24250();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10714, i, 0);
        this.f28558 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f28559 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f28555 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f28561 = m24250();
        m24251();
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m24250() {
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
        this.f28555 = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // l.InterfaceC23935
    public final C5882 getItemData() {
        return this.f28554;
    }

    @Override // l.InterfaceC23935
    public final void initialize(C5882 c5882, int i) {
        this.f28554 = c5882;
        Drawable icon = c5882.getIcon();
        this.f28560 = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f28559;
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
        m24251();
        this.f28557 = c5882.m16447(this);
        m24251();
        setId(c5882.getItemId());
        setVisibility(c5882.isVisible() ? 0 : 8);
        setEnabled(c5882.isEnabled());
        if (c5882.hasSubMenu() && this.f28562 == null) {
            this.f28562 = new C6588(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC13909 abstractViewOnTouchListenerC13909;
        if (this.f28554.hasSubMenu() && (abstractViewOnTouchListenerC13909 = this.f28562) != null && abstractViewOnTouchListenerC13909.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC4471 interfaceC4471 = this.f28553;
        if (interfaceC4471 != null) {
            interfaceC4471.mo3362(this.f28554);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24252(InterfaceC4471 interfaceC4471) {
        this.f28553 = interfaceC4471;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24253(AbstractC20700 abstractC20700) {
        this.f28556 = abstractC20700;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24251() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f28557);
        if (this.f28560 != null && (!this.f28554.m16459() || !this.f28561)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f28557 : null);
        CharSequence contentDescription = this.f28554.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f28554.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f28554.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C18934.m43699(this, z3 ? null : this.f28554.getTitle());
        } else {
            C18934.m43699(this, tooltipText);
        }
    }

    @Override // l.C14615, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f28555) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f28558;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f28560 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f28560.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // l.InterfaceC14431
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20623() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC14431
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo20624() {
        return !TextUtils.isEmpty(getText()) && this.f28554.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
