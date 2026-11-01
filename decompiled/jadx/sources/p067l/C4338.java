package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N155 */
/* JADX INFO: loaded from: classes2.dex */
public class C4338 extends BaseAdapter implements Filterable, InterfaceC1445 {

    /* JADX INFO: renamed from: ۗ */
    public final LayoutInflater f9691;

    /* JADX INFO: renamed from: ۙ */
    public C9308 f9692;

    /* JADX INFO: renamed from: ۛ */
    public ArrayList f9693;

    /* JADX INFO: renamed from: ۤ */
    public List f9694;

    /* JADX INFO: renamed from: ۨ */
    public final int f9695;

    /* JADX INFO: renamed from: ᩶ */
    public int f9698;

    /* JADX INFO: renamed from: ᩸ */
    public final Context f9699;

    /* JADX INFO: renamed from: ᩹ */
    public LayoutInflater f9700;

    /* JADX INFO: renamed from: ۬ */
    public final Object f9697 = new Object();

    /* JADX INFO: renamed from: ۫ */
    public boolean f9696 = true;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C4338(int i, Context context, List list) {
        this.f9699 = context;
        this.f9691 = LayoutInflater.from(context);
        this.f9698 = i;
        this.f9695 = i;
        this.f9694 = list;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8946(String str) {
        synchronized (this.f9697) {
            ArrayList arrayList = this.f9693;
            if (arrayList != null) {
                arrayList.add(str);
            } else {
                this.f9694.add(str);
            }
        }
        if (this.f9696) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8947(List list) {
        synchronized (this.f9697) {
            ArrayList arrayList = this.f9693;
            if (arrayList != null) {
                arrayList.addAll(list);
            } else {
                this.f9694.addAll(list);
            }
        }
        if (this.f9696) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8945() {
        synchronized (this.f9697) {
            ArrayList arrayList = this.f9693;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f9694.clear();
            }
        }
        if (this.f9696) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f9696 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8948() {
        this.f9696 = false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9694.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        try {
            return this.f9694.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m8939(this.f9691, i, view, viewGroup, this.f9695);
    }

    /* JADX INFO: renamed from: ֫ */
    private View m8939(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = layoutInflater.inflate(i2, viewGroup, false);
        }
        try {
            TextView textView = (TextView) view;
            Object item = getItem(i);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
                return view;
            }
            textView.setText(item == null ? "" : item.toString());
            return view;
        } catch (ClassCastException e) {
            throw new IllegalStateException("ArrayAdapter requires the resource ID to be a TextView", e);
        }
    }

    @Override // p067l.InterfaceC1445
    public final void setDropDownViewTheme(Resources.Theme theme) {
        if (theme == null) {
            this.f9700 = null;
            return;
        }
        LayoutInflater layoutInflater = this.f9691;
        if (theme == layoutInflater.getContext().getTheme()) {
            this.f9700 = layoutInflater;
        } else {
            this.f9700 = LayoutInflater.from(new C1473(this.f9699, theme));
        }
    }

    @Override // p067l.InterfaceC1445
    public final Resources.Theme getDropDownViewTheme() {
        LayoutInflater layoutInflater = this.f9700;
        if (layoutInflater == null) {
            return null;
        }
        return layoutInflater.getContext().getTheme();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.f9700;
        if (layoutInflater == null) {
            layoutInflater = this.f9691;
        }
        return m8939(layoutInflater, i, view, viewGroup, this.f9698);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f9692 == null) {
            this.f9692 = new C9308(this);
        }
        return this.f9692;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final CharSequence[] getAutofillOptions() {
        CharSequence[] autofillOptions = super.getAutofillOptions();
        if (autofillOptions != null) {
            return autofillOptions;
        }
        return null;
    }
}
