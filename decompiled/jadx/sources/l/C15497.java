package l;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܶ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C15497 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f47386;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f47387;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C15497(View view, View view2) {
        this.f47387 = view;
        this.f47386 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C4915.m14282((View) absListView, this.f47387, this.f47386);
    }
}
