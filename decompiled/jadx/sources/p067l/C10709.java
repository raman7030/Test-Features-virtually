package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۡۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AK7 */
/* JADX INFO: loaded from: classes4.dex */
public class C10709 extends C14849 {

    /* JADX INFO: renamed from: ᩸ */
    public int f29669;

    public C10709(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C10709(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24638(int i) {
        this.f29669 = i;
    }

    @Override // p067l.C14849, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f29669 > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                int i4 = this.f29669;
                if (size > i4) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                }
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f29669, Integer.MIN_VALUE);
            } else if (mode == 1073741824 && size > (i3 = this.f29669)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }
}
