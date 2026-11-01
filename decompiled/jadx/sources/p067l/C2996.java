package p067l;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.֡᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X16C */
/* JADX INFO: loaded from: classes2.dex */
public class C2996 extends View {

    /* JADX INFO: renamed from: ᩶ */
    public WindowManager f5329;

    /* JADX INFO: renamed from: ᩸ */
    public C21103 f5330;

    /* JADX INFO: renamed from: ᩹ */
    public Point f5331;

    public C2996(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2996(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5331 = new Point();
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.f5329 = (WindowManager) context.getApplicationContext().getSystemService("window");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5041(C21103 c21103) {
        this.f5330 = c21103;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C21103 c21103 = this.f5330;
        if (c21103 == null || c21103.getPaddingBottom() == 0 || !z) {
            return;
        }
        Display defaultDisplay = this.f5329.getDefaultDisplay();
        Point point = this.f5331;
        defaultDisplay.getSize(point);
        c21103.m47720(((float) i4) > ((float) point.y) * 0.8f);
    }
}
