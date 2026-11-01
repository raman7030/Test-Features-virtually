package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۜ */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1589 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public int f49059 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1904 f49060;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1589(C1904 c1904) {
        this.f49060 = c1904;
        m37748();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1904 c1904 = this.f49060;
        int size = c1904.f71607.getNonActionItems().size();
        c1904.getClass();
        return this.f49059 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final C1134 getItem(int i) {
        C1904 c1904 = this.f49060;
        ArrayList nonActionItems = c1904.f71607.getNonActionItems();
        c1904.getClass();
        int i2 = this.f49059;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1134) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C1904 c1904 = this.f49060;
            LayoutInflater layoutInflater = c1904.f71608;
            c1904.getClass();
            view = layoutInflater.inflate(R.layout.MT_Protector, viewGroup, false);
        }
        ((InterfaceC2029) view).initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37748() {
        C1904 c1904 = this.f49060;
        C1134 expandedItem = c1904.f71607.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c1904.f71607.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C1134) nonActionItems.get(i)) == expandedItem) {
                    this.f49059 = i;
                    return;
                }
            }
        }
        this.f49059 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m37748();
        super.notifyDataSetChanged();
    }
}
