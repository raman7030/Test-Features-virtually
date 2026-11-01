package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ۛۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C7930 extends FrameLayout {

    /* JADX INFO: renamed from: ۙ */
    public static final /* synthetic */ int f20801 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public float f20802;

    /* JADX INFO: renamed from: ᩸ */
    public final RunnableC11954 f20803;

    /* JADX INFO: renamed from: ᩹ */
    public int f20804;

    public C7930(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20804 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C23976.f76167, 0, 0);
            try {
                this.f20804 = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f20803 = new RunnableC11954(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18335(float f) {
        if (this.f20802 != f) {
            this.f20802 = f;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m18334() {
        return this.f20804;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18336(int i) {
        if (this.f20804 != i) {
            this.f20804 = i;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f20802 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f20802 / f5) - 1.0f;
        float fAbs = Math.abs(f6);
        RunnableC11954 runnableC11954 = this.f20803;
        if (fAbs <= 0.01f) {
            runnableC11954.m27368(this.f20802, f5, false);
            return;
        }
        int i3 = this.f20804;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f20802;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f20802;
                    } else {
                        f2 = this.f20802;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f20802;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f20802;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f20802;
            measuredWidth = (int) (f4 * f);
        }
        runnableC11954.m27368(this.f20802, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
