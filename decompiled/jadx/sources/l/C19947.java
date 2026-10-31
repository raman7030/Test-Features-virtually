package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: l.᩶ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19947 extends ListView {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3013 f64606;

    public C19947(C3013 c3013) {
        super(c3013.f9522);
        this.f64606 = c3013;
        setScrollBarDefaultDelayBeforeFade(ViewConfiguration.getScrollDefaultDelay() * 3);
        if (Build.VERSION.SDK_INT >= 23) {
            setScrollIndicators(3);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        C3013 c3013 = this.f64606;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(c3013.f9511.getHeight() - c3013.f9508.getHeight(), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C3013.m9221(this.f64606)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }
}
