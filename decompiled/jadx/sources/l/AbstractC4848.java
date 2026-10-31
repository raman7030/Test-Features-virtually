package l;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.ۙ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64UN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4848 extends BaseAdapter implements SectionIndexer, InterfaceC6259 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BaseAdapter f15314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10493 f15315;

    public AbstractC4848(BaseAdapter baseAdapter) {
        this.f15314 = baseAdapter;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BaseAdapter m14111() {
        return this.f15314;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14112(AbsListView absListView) {
        mo10503(new C10493(absListView));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10493 m14113() {
        return this.f15315;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10503(C10493 c10493) {
        this.f15315 = c10493;
        SpinnerAdapter spinnerAdapter = this.f15314;
        if (spinnerAdapter instanceof InterfaceC6259) {
            ((InterfaceC6259) spinnerAdapter).mo10503(c10493);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f15314.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f15314.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f15314.getItemId(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f15314.getView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.f15314.areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.f15314.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.f15314.getItemViewType(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.f15314.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f15314.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.f15314.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.f15314.isEnabled(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.f15314.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        this.f15314.notifyDataSetInvalidated();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f15314.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f15314.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        SpinnerAdapter spinnerAdapter = this.f15314;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getPositionForSection(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        SpinnerAdapter spinnerAdapter = this.f15314;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getSectionForPosition(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        Object[] objArr = new Object[0];
        SpinnerAdapter spinnerAdapter = this.f15314;
        return spinnerAdapter instanceof SectionIndexer ? ((SectionIndexer) spinnerAdapter).getSections() : objArr;
    }
}
