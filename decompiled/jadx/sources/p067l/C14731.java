package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I98E */
/* JADX INFO: loaded from: classes3.dex */
public class C14731 extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC5344 f41989;

    /* JADX INFO: renamed from: ᩶ */
    public final int f41990;

    /* JADX INFO: renamed from: ᩸ */
    public final GradientDrawable f41991;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f41992;

    public C14731(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C14731(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f41991 = gradientDrawable;
        setClickable(true);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        float f = context.getResources().getDisplayMetrics().density;
        gradientDrawable.setCornerRadius(2.5f * f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        layerDrawable.setLayerInset(0, i2, i2, i2, i2);
        setBackground(layerDrawable);
        C1567 c1567 = new C1567(context);
        c1567.setGravity(17);
        c1567.setMinEms(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(c1567, layoutParams);
        if (isInEditMode()) {
            this.f41990 = (C22553.m50541(getContext().getTheme(), R.attr.MT_Protector) & 16777215) | Integer.MIN_VALUE;
        } else {
            int iM26473 = C11477.m26473(C23223.m51761(-13948117, -1), 1728053247 & C23223.f72969);
            if (C23223.m51768()) {
                float[] fArr = new float[3];
                C9464.m21979(iM26473, fArr);
                fArr[2] = fArr[2] * 1.05f;
                iM26473 = Color.HSVToColor(fArr);
            }
            this.f41990 = iM26473;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21133.f66421);
        CharSequence text = typedArrayObtainStyledAttributes.getText(3);
        if (text != null) {
            c1567.setText(text);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            c1567.setTextSize(0, dimension);
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            c1567.setTextColor(colorStateList);
        }
        m33675(typedArrayObtainStyledAttributes.getBoolean(2, false), false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        m33675(z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33675(boolean z, boolean z2) {
        if (z != this.f41992) {
            this.f41992 = z;
            this.f41991.setColor(z ? this.f41990 : 0);
            InterfaceC5344 interfaceC5344 = this.f41989;
            if (interfaceC5344 != null) {
                interfaceC5344.mo11597(this, z, z2);
            }
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f41992;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m33675(!this.f41992, true);
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        m33675(!this.f41992, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33674(InterfaceC5344 interfaceC5344) {
        this.f41989 = interfaceC5344;
    }
}
