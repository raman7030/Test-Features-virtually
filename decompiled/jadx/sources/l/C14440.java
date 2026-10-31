package l;

import android.os.SystemClock;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܳۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes3.dex */
public final class C14440 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9503 f44261;

    public C14440(C9503 c9503) {
        this.f44261 = c9503;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C9503 c9503 = this.f44261;
        if (i != 0) {
            c9503.f28861 = true;
            c9503.f28853 = SystemClock.uptimeMillis();
        } else {
            c9503.f28869 = SystemClock.uptimeMillis();
            c9503.f28864.sendEmptyMessageDelayed(0, 1500L);
            c9503.f28861 = false;
        }
        if (c9503.f28873 != null) {
            c9503.f28873.onScrollStateChanged(absListView, i);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C9503 c9503 = this.f44261;
        c9503.f28853 = jUptimeMillis;
        if (c9503.f28873 != null) {
            c9503.f28873.onScroll(absListView, i, i2, i3);
        }
    }
}
