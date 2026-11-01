package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۧ᩷ */
/* JADX INFO: compiled from: L5EF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1399 implements InterfaceC1329, InterfaceC1574, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public Rect f36689;

    @Override // p067l.InterfaceC1574
    public final boolean collapseItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final boolean expandItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final int getId() {
        return 0;
    }

    @Override // p067l.InterfaceC1574
    public final void initForMenu(Context context, C0994 c0994) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10595(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10596(View view);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10597(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10598(C0994 c0994);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10599(boolean z);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo10600(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo10601(boolean z);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo10602(int i);

    /* JADX INFO: renamed from: ֫ */
    public final void m29871(Rect rect) {
        this.f36689 = rect;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Rect m29870() {
        return this.f36689;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1939) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1939) listAdapter).f74504.performItemAction((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC1099) ? 0 : 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m29869(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }
}
