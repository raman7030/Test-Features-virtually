package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85LT */
/* JADX INFO: loaded from: classes.dex */
public final class C22110 extends BaseAdapter {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f71778;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f71779;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f71780;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71781;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3060 f71782;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f71783 = -1;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C22110(C3060 c3060, LayoutInflater layoutInflater, boolean z, int i) {
        this.f71780 = z;
        this.f71779 = layoutInflater;
        this.f71782 = c3060;
        this.f71778 = i;
        m49687();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49688(boolean z) {
        this.f71781 = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z = this.f71780;
        C3060 c3060 = this.f71782;
        ArrayList nonActionItems = z ? c3060.getNonActionItems() : c3060.getVisibleItems();
        if (this.f71783 < 0) {
            return nonActionItems.size();
        }
        return nonActionItems.size() - 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3060 m49689() {
        return this.f71782;
    }

    @Override // android.widget.Adapter
    public final C5882 getItem(int i) {
        boolean z = this.f71780;
        C3060 c3060 = this.f71782;
        ArrayList nonActionItems = z ? c3060.getNonActionItems() : c3060.getVisibleItems();
        int i2 = this.f71783;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C5882) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f71779.inflate(this.f71778, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        C7999 c7999 = (C7999) view;
        c7999.m21313(this.f71782.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC23935 interfaceC23935 = (InterfaceC23935) view;
        if (this.f71781) {
            c7999.m21312();
        }
        interfaceC23935.initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49687() {
        C3060 c3060 = this.f71782;
        C5882 expandedItem = c3060.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c3060.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C5882) nonActionItems.get(i)) == expandedItem) {
                    this.f71783 = i;
                    return;
                }
            }
        }
        this.f71783 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m49687();
        super.notifyDataSetChanged();
    }
}
