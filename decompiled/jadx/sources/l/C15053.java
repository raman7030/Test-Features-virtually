package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15053 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45941 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21405 f45942;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C15053(C21405 c21405) {
        this.f45942 = c21405;
        m35590();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C21405 c21405 = this.f45942;
        int size = c21405.f68909.getNonActionItems().size();
        c21405.getClass();
        return this.f45941 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final C5882 getItem(int i) {
        C21405 c21405 = this.f45942;
        ArrayList nonActionItems = c21405.f68909.getNonActionItems();
        c21405.getClass();
        int i2 = this.f45941;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C5882) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C21405 c21405 = this.f45942;
            LayoutInflater layoutInflater = c21405.f68910;
            c21405.getClass();
            view = layoutInflater.inflate(R.layout.MT_Protector, viewGroup, false);
        }
        ((InterfaceC23935) view).initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35590() {
        C21405 c21405 = this.f45942;
        C5882 expandedItem = c21405.f68909.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c21405.f68909.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C5882) nonActionItems.get(i)) == expandedItem) {
                    this.f45941 = i;
                    return;
                }
            }
        }
        this.f45941 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m35590();
        super.notifyDataSetChanged();
    }
}
