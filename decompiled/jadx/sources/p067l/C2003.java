package p067l;

import android.widget.AbsListView;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.᩻ۖ */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes.dex */
public final class C2003 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1303 f77902;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C2003(C1303 c1303) {
        this.f77902 = c1303;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C1303 c1303 = this.f77902;
        RunnableC1863 runnableC1863 = c1303.f31092;
        PopupWindow popupWindow = c1303.f31105;
        if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
            return;
        }
        c1303.f31090.removeCallbacks(runnableC1863);
        runnableC1863.run();
    }
}
