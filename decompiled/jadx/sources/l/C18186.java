package l;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18186 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f56564;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f56565;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C18186(View view, View view2) {
        this.f56565 = view;
        this.f56564 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C4075.m12250(absListView, this.f56565, this.f56564);
    }
}
