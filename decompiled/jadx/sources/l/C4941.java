package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ۙ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4941 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f15573;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C4941(ActivityC21107 activityC21107) {
        this.f15573 = activityC21107;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f15573.f68092.m10504(false);
    }
}
