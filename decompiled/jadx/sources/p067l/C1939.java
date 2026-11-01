package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۜ */
/* JADX INFO: compiled from: 85LT */
/* JADX INFO: loaded from: classes.dex */
public final class C1939 extends BaseAdapter {

    /* JADX INFO: renamed from: ۗ */
    public final int f74500;

    /* JADX INFO: renamed from: ۙ */
    public final LayoutInflater f74501;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f74502;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f74503;

    /* JADX INFO: renamed from: ᩸ */
    public C0994 f74504;

    /* JADX INFO: renamed from: ᩹ */
    public int f74505 = -1;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1939(C0994 c0994, LayoutInflater layoutInflater, boolean z, int i) {
        this.f74502 = z;
        this.f74501 = layoutInflater;
        this.f74504 = c0994;
        this.f74500 = i;
        m52025();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52026(boolean z) {
        this.f74503 = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z = this.f74502;
        C0994 c0994 = this.f74504;
        ArrayList nonActionItems = z ? c0994.getNonActionItems() : c0994.getVisibleItems();
        if (this.f74505 < 0) {
            return nonActionItems.size();
        }
        return nonActionItems.size() - 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C0994 m52027() {
        return this.f74504;
    }

    @Override // android.widget.Adapter
    public final C1134 getItem(int i) {
        boolean z = this.f74502;
        C0994 c0994 = this.f74504;
        ArrayList nonActionItems = z ? c0994.getNonActionItems() : c0994.getVisibleItems();
        int i2 = this.f74505;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1134) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f74501.inflate(this.f74500, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        C1239 c1239 = (C1239) view;
        c1239.m23279(this.f74504.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC2029 interfaceC2029 = (InterfaceC2029) view;
        if (this.f74503) {
            c1239.m23278();
        }
        interfaceC2029.initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52025() {
        C0994 c0994 = this.f74504;
        C1134 expandedItem = c0994.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c0994.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C1134) nonActionItems.get(i)) == expandedItem) {
                    this.f74505 = i;
                    return;
                }
            }
        }
        this.f74505 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m52025();
        super.notifyDataSetChanged();
    }
}
