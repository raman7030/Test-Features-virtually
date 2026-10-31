package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.᩶ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final class C20089 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12327 f65053;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20089(C12327 c12327) {
        this.f65053 = c12327;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f65053.f36917.m39014().size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return C12327.m29897(this.f65053, i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        try {
            return !this.f65053.f36917.m38994(i).mo36968();
        } catch (Exception unused) {
            return true;
        }
    }
}
