package l;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.֫ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAKB */
/* JADX INFO: loaded from: classes2.dex */
public class C1741 extends FrameLayout {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f6018;

    public C1741(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Point point = C11266.f33764;
        this.f6018 = Math.min(Math.min(point.x, point.y) - C11266.m27878(64.0f), C11266.m27878(330.0f));
    }

    public C1741(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Point point = C11266.f33764;
        this.f6018 = Math.min(Math.min(point.x, point.y) - C11266.m27878(64.0f), C11266.m27878(330.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!isInEditMode()) {
            i = View.MeasureSpec.makeMeasureSpec(this.f6018, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
