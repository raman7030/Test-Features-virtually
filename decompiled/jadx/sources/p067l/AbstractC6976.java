package p067l;

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
public abstract class AbstractC6976 extends BaseAdapter implements SectionIndexer, InterfaceC8317 {

    /* JADX INFO: renamed from: ᩸ */
    public final BaseAdapter f18146;

    /* JADX INFO: renamed from: ᩹ */
    public C12341 f18147;

    public AbstractC6976(BaseAdapter baseAdapter) {
        this.f18146 = baseAdapter;
    }

    /* JADX INFO: renamed from: ֫ */
    public final BaseAdapter m15991() {
        return this.f18146;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15992(AbsListView absListView) {
        mo12527(new C12341(absListView));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12341 m15993() {
        return this.f18147;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12527(C12341 c12341) {
        this.f18147 = c12341;
        SpinnerAdapter spinnerAdapter = this.f18146;
        if (spinnerAdapter instanceof InterfaceC8317) {
            ((InterfaceC8317) spinnerAdapter).mo12527(c12341);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f18146.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f18146.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f18146.getItemId(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f18146.getView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.f18146.areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.f18146.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.f18146.getItemViewType(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.f18146.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f18146.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.f18146.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.f18146.isEnabled(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.f18146.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        this.f18146.notifyDataSetInvalidated();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f18146.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f18146.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        SpinnerAdapter spinnerAdapter = this.f18146;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getPositionForSection(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        SpinnerAdapter spinnerAdapter = this.f18146;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getSectionForPosition(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        Object[] objArr = new Object[0];
        SpinnerAdapter spinnerAdapter = this.f18146;
        return spinnerAdapter instanceof SectionIndexer ? ((SectionIndexer) spinnerAdapter).getSections() : objArr;
    }
}
