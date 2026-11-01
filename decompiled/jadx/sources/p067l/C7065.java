package p067l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ۙ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7065 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC22429 f18405;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C7065(ActivityC22429 activityC22429) {
        this.f18405 = activityC22429;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f18405.f70774.m12528(false);
    }
}
