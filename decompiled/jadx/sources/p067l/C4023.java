package p067l;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.֫ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAKB */
/* JADX INFO: loaded from: classes2.dex */
public class C4023 extends FrameLayout {

    /* JADX INFO: renamed from: ᩸ */
    public int f8795;

    public C4023(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Point point = C13076.f36764;
        this.f8795 = Math.min(Math.min(point.x, point.y) - C13076.m29939(64.0f), C13076.m29939(330.0f));
    }

    public C4023(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Point point = C13076.f36764;
        this.f8795 = Math.min(Math.min(point.x, point.y) - C13076.m29939(64.0f), C13076.m29939(330.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!isInEditMode()) {
            i = View.MeasureSpec.makeMeasureSpec(this.f8795, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
