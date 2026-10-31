package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ۛۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5852 extends FrameLayout {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17950 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f17951;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC10086 f17952;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17953;

    public C5852(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17953 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C22736.f73440, 0, 0);
            try {
                this.f17953 = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f17952 = new RunnableC10086(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16410(float f) {
        if (this.f17951 != f) {
            this.f17951 = f;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m16409() {
        return this.f17953;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16411(int i) {
        if (this.f17953 != i) {
            this.f17953 = i;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f17951 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f17951 / f5) - 1.0f;
        float fAbs = Math.abs(f6);
        RunnableC10086 runnableC10086 = this.f17952;
        if (fAbs <= 0.01f) {
            runnableC10086.m25349(this.f17951, f5, false);
            return;
        }
        int i3 = this.f17953;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f17951;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f17951;
                    } else {
                        f2 = this.f17951;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f17951;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f17951;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f17951;
            measuredWidth = (int) (f4 * f);
        }
        runnableC10086.m25349(this.f17951, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
