package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ᩴܺ */
/* JADX INFO: compiled from: N518 */
/* JADX INFO: loaded from: classes4.dex */
public class C1777 extends FrameLayout {

    /* JADX INFO: renamed from: ۗ */
    public TypedValue f62674;

    /* JADX INFO: renamed from: ۙ */
    public TypedValue f62675;

    /* JADX INFO: renamed from: ۤ */
    public TypedValue f62676;

    /* JADX INFO: renamed from: ۫ */
    public TypedValue f62677;

    /* JADX INFO: renamed from: ۬ */
    public TypedValue f62678;

    /* JADX INFO: renamed from: ᩶ */
    public TypedValue f62679;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC1042 f62680;

    /* JADX INFO: renamed from: ᩹ */
    public final Rect f62681;

    public C1777(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1777(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62681 = new Rect();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45816(InterfaceC1042 interfaceC1042) {
        this.f62680 = interfaceC1042;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45815(int i, int i2, int i3, int i4) {
        this.f62681.set(i, i2, i3, i4);
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
        Rect rect = this.f62681;
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f62678 : this.f62674;
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
            TypedValue typedValue2 = z3 ? this.f62679 : this.f62675;
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
            TypedValue typedValue3 = z3 ? this.f62676 : this.f62677;
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

    /* JADX INFO: renamed from: ܿ */
    public final TypedValue m45820() {
        if (this.f62677 == null) {
            this.f62677 = new TypedValue();
        }
        return this.f62677;
    }

    /* JADX INFO: renamed from: ܳ */
    public final TypedValue m45818() {
        if (this.f62676 == null) {
            this.f62676 = new TypedValue();
        }
        return this.f62676;
    }

    /* JADX INFO: renamed from: ܽ */
    public final TypedValue m45819() {
        if (this.f62674 == null) {
            this.f62674 = new TypedValue();
        }
        return this.f62674;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final TypedValue m45821() {
        if (this.f62678 == null) {
            this.f62678 = new TypedValue();
        }
        return this.f62678;
    }

    /* JADX INFO: renamed from: ֫ */
    public final TypedValue m45814() {
        if (this.f62679 == null) {
            this.f62679 = new TypedValue();
        }
        return this.f62679;
    }

    /* JADX INFO: renamed from: ۧ */
    public final TypedValue m45817() {
        if (this.f62675 == null) {
            this.f62675 = new TypedValue();
        }
        return this.f62675;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1042 interfaceC1042 = this.f62680;
        if (interfaceC1042 != null) {
            interfaceC1042.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1042 interfaceC1042 = this.f62680;
        if (interfaceC1042 != null) {
            interfaceC1042.onDetachedFromWindow();
        }
    }
}
