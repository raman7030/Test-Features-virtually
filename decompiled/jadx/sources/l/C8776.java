package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۡۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AK7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8776 extends C13132 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26743;

    public C8776(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8776(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22668(int i) {
        this.f26743 = i;
    }

    @Override // l.C13132, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f26743 > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                int i4 = this.f26743;
                if (size > i4) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                }
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f26743, Integer.MIN_VALUE);
            } else if (mode == 1073741824 && size > (i3 = this.f26743)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }
}
