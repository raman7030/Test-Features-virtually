package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N518 */
/* JADX INFO: loaded from: classes4.dex */
public class C18850 extends FrameLayout {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TypedValue f59445;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TypedValue f59446;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TypedValue f59447;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TypedValue f59448;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TypedValue f59449;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TypedValue f59450;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC4033 f59451;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f59452;

    public C18850(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18850(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59452 = new Rect();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43550(InterfaceC4033 interfaceC4033) {
        this.f59451 = interfaceC4033;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43549(int i, int i2, int i3, int i4) {
        this.f59452.set(i, i2, i3, i4);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f59452;
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f59449 : this.f59445;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f59450 : this.f59446;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f59447 : this.f59448;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43554() {
        if (this.f59448 == null) {
            this.f59448 = new TypedValue();
        }
        return this.f59448;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43552() {
        if (this.f59447 == null) {
            this.f59447 = new TypedValue();
        }
        return this.f59447;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43553() {
        if (this.f59445 == null) {
            this.f59445 = new TypedValue();
        }
        return this.f59445;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43555() {
        if (this.f59449 == null) {
            this.f59449 = new TypedValue();
        }
        return this.f59449;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TypedValue m43548() {
        if (this.f59450 == null) {
            this.f59450 = new TypedValue();
        }
        return this.f59450;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TypedValue m43551() {
        if (this.f59446 == null) {
            this.f59446 = new TypedValue();
        }
        return this.f59446;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC4033 interfaceC4033 = this.f59451;
        if (interfaceC4033 != null) {
            interfaceC4033.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC4033 interfaceC4033 = this.f59451;
        if (interfaceC4033 != null) {
            interfaceC4033.onDetachedFromWindow();
        }
    }
}
