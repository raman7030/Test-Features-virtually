package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ۢܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9671 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8965 f29272;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C9671(C8965 c8965) {
        this.f29272 = c8965;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f29272.f27234.f25417.m10504(false);
    }
}
