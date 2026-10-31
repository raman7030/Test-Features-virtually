package l;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: l.ۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5239 implements ListAdapter, SpinnerAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public SpinnerAdapter f16423;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ListAdapter f16424;

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    public C5239(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f16423 = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f16424 = (ListAdapter) spinnerAdapter;
        }
        if (theme != null) {
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C19351.m44573((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof InterfaceC12150) {
                InterfaceC12150 interfaceC12150 = (InterfaceC12150) spinnerAdapter;
                if (interfaceC12150.getDropDownViewTheme() == null) {
                    interfaceC12150.setDropDownViewTheme(theme);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f16423;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f16423;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f16423;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f16423;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f16423;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f16423;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f16423;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f16424;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f16424;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }
}
