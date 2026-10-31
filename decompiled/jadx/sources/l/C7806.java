package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.۟᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7806 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f24115;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C7806(ActivityC6604 activityC6604) {
        this.f24115 = activityC6604;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f24115.f20339.m10504(false);
    }
}
