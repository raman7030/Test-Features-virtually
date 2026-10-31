package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܺܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16019 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f49422;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C16019(ActivityC8259 activityC8259) {
        this.f49422 = activityC8259;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f49422.f25417.m10504(false);
    }
}
