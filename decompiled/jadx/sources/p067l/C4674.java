package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: renamed from: l.ۖۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S593 */
/* JADX INFO: loaded from: classes2.dex */
public class C4674 extends View {

    /* JADX INFO: renamed from: ֫֫ */
    public final RectF f10512;

    /* JADX INFO: renamed from: ۗ */
    public float f10513;

    /* JADX INFO: renamed from: ۙ */
    public float f10514;

    /* JADX INFO: renamed from: ۛ */
    public final float f10515;

    /* JADX INFO: renamed from: ۜ֫ */
    public Paint f10516;

    /* JADX INFO: renamed from: ۟ */
    public Paint f10517;

    /* JADX INFO: renamed from: ۤ */
    public int f10518;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f10519;

    /* JADX INFO: renamed from: ۨ */
    public String f10520;

    /* JADX INFO: renamed from: ۫ */
    public boolean f10521;

    /* JADX INFO: renamed from: ۬ */
    public boolean f10522;

    /* JADX INFO: renamed from: ܰ */
    public float f10523;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f10524;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f10525;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f10526;

    /* JADX INFO: renamed from: ᩳ֫ */
    public Paint f10527;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f10528;

    /* JADX INFO: renamed from: ᩷֫ */
    public final RectF f10529;

    /* JADX INFO: renamed from: ᩸ */
    public String f10530;

    /* JADX INFO: renamed from: ᩹ */
    public int f10531;

    /* JADX INFO: renamed from: ᩺ */
    public int f10532;

    /* JADX INFO: renamed from: ᩻֫ */
    public float f10533;

    public C4674(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4674(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10518 = 100;
        this.f10531 = 0;
        this.f10519 = "%";
        this.f10520 = "";
        int iRgb = Color.rgb(66, 145, 241);
        int iRgb2 = Color.rgb(66, 145, 241);
        int iArgb = Color.argb(180, 194, 194, 194);
        this.f10529 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f10512 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f10522 = true;
        this.f10528 = true;
        this.f10521 = true;
        float f = (getResources().getDisplayMetrics().density * 1.5f) + 0.5f;
        float f2 = (getResources().getDisplayMetrics().density * 1.0f) + 0.5f;
        float f3 = getResources().getDisplayMetrics().scaledDensity * 10.0f;
        float f4 = (getResources().getDisplayMetrics().density * 3.0f) + 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21133.f66420);
        this.f10532 = typedArrayObtainStyledAttributes.getColor(3, iRgb2);
        this.f10524 = typedArrayObtainStyledAttributes.getColor(9, iArgb);
        this.f10525 = typedArrayObtainStyledAttributes.getColor(4, iRgb);
        this.f10526 = typedArrayObtainStyledAttributes.getDimension(6, f3);
        this.f10523 = typedArrayObtainStyledAttributes.getDimension(2, f);
        this.f10533 = typedArrayObtainStyledAttributes.getDimension(8, f2);
        this.f10515 = typedArrayObtainStyledAttributes.getDimension(5, f4);
        if (typedArrayObtainStyledAttributes.getInt(7, 0) != 0) {
            this.f10521 = false;
        }
        m9907(typedArrayObtainStyledAttributes.getInt(0, 0));
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        if (i2 > 0) {
            this.f10518 = i2;
            invalidate();
        }
        typedArrayObtainStyledAttributes.recycle();
        m9906();
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return (int) this.f10526;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max((int) this.f10526, Math.max((int) this.f10523, (int) this.f10533));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m9905(i, true), m9905(i2, false));
    }

    /* JADX INFO: renamed from: ֫ */
    private int m9905(int i, boolean z) {
        int paddingTop;
        int paddingBottom;
        int suggestedMinimumHeight;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (z) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i2 = paddingBottom + paddingTop;
        if (mode == 1073741824) {
            return size;
        }
        if (z) {
            suggestedMinimumHeight = (int) this.f10526;
        } else {
            suggestedMinimumHeight = getSuggestedMinimumHeight();
        }
        int i3 = suggestedMinimumHeight + i2;
        if (mode != Integer.MIN_VALUE) {
            return i3;
        }
        if (z) {
            return Math.max(i3, size);
        }
        return Math.min(i3, size);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.f10521;
        RectF rectF = this.f10512;
        RectF rectF2 = this.f10529;
        if (z) {
            this.f10530 = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf((this.f10531 * 100) / this.f10518));
            String str = this.f10520 + this.f10530 + this.f10519;
            this.f10530 = str;
            float fMeasureText = this.f10527.measureText(str);
            int i = this.f10531;
            float f = this.f10515;
            if (i == 0) {
                this.f10528 = false;
                this.f10513 = getPaddingLeft();
            } else {
                this.f10528 = true;
                rectF.left = getPaddingLeft();
                rectF.top = (getHeight() / 2.0f) - (this.f10523 / 2.0f);
                rectF.right = (((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f10518 * 1.0f)) * this.f10531) - f) + getPaddingLeft();
                rectF.bottom = (this.f10523 / 2.0f) + (getHeight() / 2.0f);
                this.f10513 = rectF.right + f;
            }
            this.f10514 = (int) ((getHeight() / 2.0f) - ((this.f10527.ascent() + this.f10527.descent()) / 2.0f));
            if (this.f10513 + fMeasureText >= getWidth() - getPaddingRight()) {
                float width = (getWidth() - getPaddingRight()) - fMeasureText;
                this.f10513 = width;
                rectF.right = width - f;
            }
            float f2 = this.f10513 + fMeasureText + f;
            if (f2 >= getWidth() - getPaddingRight()) {
                this.f10522 = false;
            } else {
                this.f10522 = true;
                rectF2.left = f2;
                rectF2.right = getWidth() - getPaddingRight();
                rectF2.top = ((-this.f10533) / 2.0f) + (getHeight() / 2.0f);
                rectF2.bottom = (this.f10533 / 2.0f) + (getHeight() / 2.0f);
            }
        } else {
            rectF.left = getPaddingLeft();
            rectF.top = (getHeight() / 2.0f) - (this.f10523 / 2.0f);
            rectF.right = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f10518 * 1.0f)) * this.f10531) + getPaddingLeft();
            rectF.bottom = (this.f10523 / 2.0f) + (getHeight() / 2.0f);
            rectF2.left = rectF.right;
            rectF2.right = getWidth() - getPaddingRight();
            rectF2.top = ((-this.f10533) / 2.0f) + (getHeight() / 2.0f);
            rectF2.bottom = (this.f10533 / 2.0f) + (getHeight() / 2.0f);
        }
        if (this.f10528) {
            canvas.drawRect(rectF, this.f10517);
        }
        if (this.f10522) {
            canvas.drawRect(rectF2, this.f10516);
        }
        if (this.f10521) {
            canvas.drawText(this.f10530, this.f10513, this.f10514, this.f10527);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m9906() {
        Paint paint = new Paint(1);
        this.f10517 = paint;
        paint.setColor(this.f10532);
        Paint paint2 = new Paint(1);
        this.f10516 = paint2;
        paint2.setColor(this.f10524);
        Paint paint3 = new Paint(1);
        this.f10527 = paint3;
        paint3.setColor(this.f10525);
        this.f10527.setTextSize(this.f10526);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9907(int i) {
        if (i > this.f10518 || i < 0) {
            return;
        }
        this.f10531 = i;
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9909(int i) {
        this.f10525 = i;
        this.f10527.setColor(i);
        invalidate();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m9910(int i) {
        this.f10532 = i;
        this.f10517.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", this.f10525);
        bundle.putFloat("text_size", this.f10526);
        bundle.putFloat("reached_bar_height", this.f10523);
        bundle.putFloat("unreached_bar_height", this.f10533);
        bundle.putInt("reached_bar_color", this.f10532);
        bundle.putInt("unreached_bar_color", this.f10524);
        bundle.putInt("max", this.f10518);
        bundle.putInt("progress", this.f10531);
        bundle.putString("suffix", this.f10519);
        bundle.putString("prefix", this.f10520);
        bundle.putBoolean("text_visibility", this.f10521);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f10525 = bundle.getInt("text_color");
            this.f10526 = bundle.getFloat("text_size");
            this.f10523 = bundle.getFloat("reached_bar_height");
            this.f10533 = bundle.getFloat("unreached_bar_height");
            this.f10532 = bundle.getInt("reached_bar_color");
            this.f10524 = bundle.getInt("unreached_bar_color");
            m9906();
            int i = bundle.getInt("max");
            if (i > 0) {
                this.f10518 = i;
                invalidate();
            }
            m9907(bundle.getInt("progress"));
            String string = bundle.getString("prefix");
            if (string == null) {
                this.f10520 = "";
            } else {
                this.f10520 = string;
            }
            String string2 = bundle.getString("suffix");
            if (string2 == null) {
                this.f10519 = "";
            } else {
                this.f10519 = string2;
            }
            m9908(bundle.getBoolean("text_visibility") ? EnumC17413.Visible : EnumC17413.Invisible);
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9908(EnumC17413 enumC17413) {
        this.f10521 = enumC17413 == EnumC17413.Visible;
        invalidate();
    }
}
