package p067l;

import android.os.SystemClock;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܳۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes3.dex */
public final class C16092 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C11400 f47355;

    public C16092(C11400 c11400) {
        this.f47355 = c11400;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C11400 c11400 = this.f47355;
        if (i != 0) {
            c11400.f31808 = true;
            c11400.f31800 = SystemClock.uptimeMillis();
        } else {
            c11400.f31816 = SystemClock.uptimeMillis();
            c11400.f31811.sendEmptyMessageDelayed(0, 1500L);
            c11400.f31808 = false;
        }
        if (c11400.f31820 != null) {
            c11400.f31820.onScrollStateChanged(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C11400 c11400 = this.f47355;
        c11400.f31800 = jUptimeMillis;
        if (c11400.f31820 != null) {
            c11400.f31820.onScroll(absListView, i, i2, i3);
        }
    }
}
