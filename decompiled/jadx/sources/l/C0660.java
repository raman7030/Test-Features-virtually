package l;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.֡᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X16C */
/* JADX INFO: loaded from: classes2.dex */
public class C0660 extends View {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public WindowManager f2556;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19712 f2557;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Point f2558;

    public C0660(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0660(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2558 = new Point();
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.f2556 = (WindowManager) context.getApplicationContext().getSystemService("window");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2702(C19712 c19712) {
        this.f2557 = c19712;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C19712 c19712 = this.f2557;
        if (c19712 == null || c19712.getPaddingBottom() == 0 || !z) {
            return;
        }
        Display defaultDisplay = this.f2556.getDefaultDisplay();
        Point point = this.f2558;
        defaultDisplay.getSize(point);
        c19712.m45416(((float) i4) > ((float) point.y) * 0.8f);
    }
}
