package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩹ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6VJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22109 extends C6659 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public View f71774;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public int f71775;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public View f71776;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public int f71777;

    public C22109(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71777 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49686(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f71776 = viewGroup.getChildAt(0);
        this.f71774 = viewGroup2.getChildAt(0);
        this.f71777 = -1;
        requestLayout();
    }

    @Override // l.C0452, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        View view = this.f71776;
        if (view != null && size > 0) {
            if (this.f71777 != size) {
                this.f71777 = size;
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view.getMeasuredHeight();
                View view2 = this.f71774;
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iMax = Math.max(measuredHeight, view2.getMeasuredHeight());
                this.f71775 = iMax;
                this.f71775 = getPaddingBottom() + getPaddingTop() + iMax;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(View.resolveSize(this.f71775, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
