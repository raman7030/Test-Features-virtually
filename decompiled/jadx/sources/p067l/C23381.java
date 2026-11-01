package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩹ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6VJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23381 extends C8697 {

    /* JADX INFO: renamed from: ֫ۧ */
    public View f74496;

    /* JADX INFO: renamed from: ۧۧ */
    public int f74497;

    /* JADX INFO: renamed from: ܽۧ */
    public View f74498;

    /* JADX INFO: renamed from: ᩳۧ */
    public int f74499;

    public C23381(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74499 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52024(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f74498 = viewGroup.getChildAt(0);
        this.f74496 = viewGroup2.getChildAt(0);
        this.f74499 = -1;
        requestLayout();
    }

    @Override // p067l.C2798, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        View view = this.f74498;
        if (view != null && size > 0) {
            if (this.f74499 != size) {
                this.f74499 = size;
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view.getMeasuredHeight();
                View view2 = this.f74496;
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iMax = Math.max(measuredHeight, view2.getMeasuredHeight());
                this.f74497 = iMax;
                this.f74497 = getPaddingBottom() + getPaddingTop() + iMax;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(View.resolveSize(this.f74497, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
