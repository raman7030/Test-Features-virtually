package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L5EF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11236 implements InterfaceC9825, InterfaceC14762, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Rect f33689;

    @Override // l.InterfaceC14762
    public final boolean collapseItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    @Override // l.InterfaceC14762
    public final boolean expandItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    @Override // l.InterfaceC14762
    public final int getId() {
        return 0;
    }

    @Override // l.InterfaceC14762
    public final void initForMenu(Context context, C3060 c3060) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8532(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8533(View view);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8534(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8535(C3060 c3060);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8536(boolean z);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8537(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8538(boolean z);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo8539(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27809(Rect rect) {
        this.f33689 = rect;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect m27808() {
        return this.f33689;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C22110) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C22110) listAdapter).f71782.performItemAction((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC5177) ? 0 : 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27807(ListAdapter listAdapter, Context context, int i) {
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
