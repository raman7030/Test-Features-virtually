package l;

import android.widget.AbsListView;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes.dex */
public final class C23397 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9287 f75156;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C23397(C9287 c9287) {
        this.f75156 = c9287;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C9287 c9287 = this.f75156;
        RunnableC20576 runnableC20576 = c9287.f28143;
        PopupWindow popupWindow = c9287.f28156;
        if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
            return;
        }
        c9287.f28141.removeCallbacks(runnableC20576);
        runnableC20576.run();
    }
}
