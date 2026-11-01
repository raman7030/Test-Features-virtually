package p067l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܺܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17593 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC10218 f52585;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C17593(ActivityC10218 activityC10218) {
        this.f52585 = activityC10218;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f52585.f28327.m12528(false);
    }
}
