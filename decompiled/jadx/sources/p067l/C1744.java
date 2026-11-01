package p067l;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ᩳܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class C1744 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ View f59777;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f59778;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C1744(View view, View view2) {
        this.f59778 = view;
        this.f59777 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C1044.m14167(absListView, this.f59778, this.f59777);
    }
}
