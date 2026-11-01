package p067l;

import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.᩻ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class C24678 extends LinearLayout {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f78069;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24678(C5232 c5232, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f78069 = c5232;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C5232 c5232 = this.f78069;
        if (C5232.m11272(c5232) && c5232.f12288 != null) {
            i = View.MeasureSpec.makeMeasureSpec(c5232.f12288.getWidth(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C5232.m11272(this.f78069);
    }
}
