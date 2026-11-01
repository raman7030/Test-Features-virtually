package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ۨܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5UC */
/* JADX INFO: loaded from: classes3.dex */
public class C13612 extends ListView {

    /* JADX INFO: renamed from: ᩸ */
    public int f38298;

    public C13612(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C13612(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30968(int i) {
        this.f38298 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30967() {
        return this.f38298;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f38298 > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i3 = this.f38298;
            if (size > i3) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i2));
            }
        }
        super.onMeasure(i, i2);
    }
}
