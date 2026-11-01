package p067l;

import android.widget.ListView;

/* JADX INFO: renamed from: l.ۢ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5GK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11177 extends AbstractViewOnTouchListenerC1205 {

    /* JADX INFO: renamed from: ܿ֫ */
    public final ListView f31026;

    public C11177(ListView listView) {
        super(listView);
        this.f31026 = listView;
    }

    @Override // p067l.AbstractViewOnTouchListenerC1205
    /* JADX INFO: renamed from: ۧ */
    public final void mo21573(int i) {
        this.f31026.scrollListBy(i);
    }

    @Override // p067l.AbstractViewOnTouchListenerC1205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21572(int i) {
        ListView listView = this.f31026;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
