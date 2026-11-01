package p067l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: l.᩶ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21326 extends ListView {

    /* JADX INFO: renamed from: ᩸ */
    public final C5232 f67242;

    public C21326(C5232 c5232) {
        super(c5232.f12320);
        this.f67242 = c5232;
        setScrollBarDefaultDelayBeforeFade(ViewConfiguration.getScrollDefaultDelay() * 3);
        if (Build.VERSION.SDK_INT >= 23) {
            setScrollIndicators(3);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        C5232 c5232 = this.f67242;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(c5232.f12309.getHeight() - c5232.f12306.getHeight(), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C5232.m11272(this.f67242)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }
}
