package p067l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.۟᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9788 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC8645 f27032;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C9788(ActivityC8645 activityC8645) {
        this.f27032 = activityC8645;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f27032.f23216.m12528(false);
    }
}
