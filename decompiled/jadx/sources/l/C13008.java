package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.FrameLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I98E */
/* JADX INFO: loaded from: classes3.dex */
public class C13008 extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3131 f38942;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38943;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final GradientDrawable f38944;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f38945;

    public C13008(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C13008(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f38944 = gradientDrawable;
        setClickable(true);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        float f = context.getResources().getDisplayMetrics().density;
        gradientDrawable.setCornerRadius(2.5f * f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        layerDrawable.setLayerInset(0, i2, i2, i2, i2);
        setBackground(layerDrawable);
        C14615 c14615 = new C14615(context);
        c14615.setGravity(17);
        c14615.setMinEms(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(c14615, layoutParams);
        if (isInEditMode()) {
            this.f38943 = (C21238.m48210(getContext().getTheme(), R.attr.MT_Protector) & 16777215) | Integer.MIN_VALUE;
        } else {
            int iM24461 = C9584.m24461(C21943.m49424(-13948117, -1), 1728053247 & C21943.f70257);
            if (C21943.m49431()) {
                float[] fArr = new float[3];
                C7466.m20004(iM24461, fArr);
                fArr[2] = fArr[2] * 1.05f;
                iM24461 = Color.HSVToColor(fArr);
            }
            this.f38943 = iM24461;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19743.f63786);
        CharSequence text = typedArrayObtainStyledAttributes.getText(3);
        if (text != null) {
            c14615.setText(text);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            c14615.setTextSize(0, dimension);
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            c14615.setTextColor(colorStateList);
        }
        m31590(typedArrayObtainStyledAttributes.getBoolean(2, false), false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        m31590(z, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31590(boolean z, boolean z2) {
        if (z != this.f38945) {
            this.f38945 = z;
            this.f38944.setColor(z ? this.f38943 : 0);
            InterfaceC3131 interfaceC3131 = this.f38942;
            if (interfaceC3131 != null) {
                interfaceC3131.mo9554(this, z, z2);
            }
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f38945;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m31590(!this.f38945, true);
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        m31590(!this.f38945, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31589(InterfaceC3131 interfaceC3131) {
        this.f38942 = interfaceC3131;
    }
}
