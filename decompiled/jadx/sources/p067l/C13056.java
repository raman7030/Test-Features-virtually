package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۧ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 797N */
/* JADX INFO: loaded from: classes3.dex */
public class C13056 extends ViewGroup {

    /* JADX INFO: renamed from: ۙ */
    public int f36708;

    /* JADX INFO: renamed from: ᩶ */
    public int f36709;

    /* JADX INFO: renamed from: ᩸ */
    public int f36710;

    /* JADX INFO: renamed from: ᩹ */
    public int f36711;

    public C13056(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C13056(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36711 = (int) ((context.getResources().getDisplayMetrics().density * 6.0f) + 0.5f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i6 += measuredWidth;
            if (i4 < measuredWidth) {
                i4 = measuredWidth;
            }
            if (i5 < measuredHeight) {
                i5 = measuredHeight;
            }
        }
        this.f36708 = i4;
        this.f36709 = i5;
        if (i6 <= size) {
            i3 = childCount;
        } else {
            i3 = 1;
            if (i4 != 0) {
                while ((i4 * i3 * 2) + this.f36711 <= size) {
                    i3 *= 2;
                }
            }
        }
        this.f36710 = i3;
        setMeasuredDimension(size, ((int) Math.ceil(childCount / i3)) * this.f36709);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = this.f36708;
        int i6 = this.f36709;
        int i7 = this.f36710;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9 += i7) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int i12 = i9 + i10;
                if (i12 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i12);
                int measuredWidth = (i7 >= childCount ? childAt.getMeasuredWidth() : i5) + i11;
                childAt.layout(i11, i8, measuredWidth, i8 + i6);
                i10++;
                i11 = measuredWidth;
            }
            i8 += i6;
        }
    }
}
