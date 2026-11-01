package p067l;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܶ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C17097 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ View f50517;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f50518;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C17097(View view, View view2) {
        this.f50518 = view;
        this.f50517 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C7040.m16179((View) absListView, this.f50518, this.f50517);
    }
}
