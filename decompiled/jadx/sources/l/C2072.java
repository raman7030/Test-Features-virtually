package l;

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
public class C2072 extends BaseAdapter implements Filterable, InterfaceC12150 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f6907;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7302 f6908;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ArrayList f6909;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f6910;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f6911;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6914;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Context f6915;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LayoutInflater f6916;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f6913 = new Object();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f6912 = true;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C2072(int i, Context context, List list) {
        this.f6915 = context;
        this.f6907 = LayoutInflater.from(context);
        this.f6914 = i;
        this.f6911 = i;
        this.f6910 = list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6820(String str) {
        synchronized (this.f6913) {
            ArrayList arrayList = this.f6909;
            if (arrayList != null) {
                arrayList.add(str);
            } else {
                this.f6910.add(str);
            }
        }
        if (this.f6912) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6821(List list) {
        synchronized (this.f6913) {
            ArrayList arrayList = this.f6909;
            if (arrayList != null) {
                arrayList.addAll(list);
            } else {
                this.f6910.addAll(list);
            }
        }
        if (this.f6912) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6819() {
        synchronized (this.f6913) {
            ArrayList arrayList = this.f6909;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f6910.clear();
            }
        }
        if (this.f6912) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f6912 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6822() {
        this.f6912 = false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6910.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        try {
            return this.f6910.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m6813(this.f6907, i, view, viewGroup, this.f6911);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private View m6813(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2) {
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

    @Override // l.InterfaceC12150
    public final void setDropDownViewTheme(Resources.Theme theme) {
        if (theme == null) {
            this.f6916 = null;
            return;
        }
        LayoutInflater layoutInflater = this.f6907;
        if (theme == layoutInflater.getContext().getTheme()) {
            this.f6916 = layoutInflater;
        } else {
            this.f6916 = LayoutInflater.from(new C12729(this.f6915, theme));
        }
    }

    @Override // l.InterfaceC12150
    public final Resources.Theme getDropDownViewTheme() {
        LayoutInflater layoutInflater = this.f6916;
        if (layoutInflater == null) {
            return null;
        }
        return layoutInflater.getContext().getTheme();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.f6916;
        if (layoutInflater == null) {
            layoutInflater = this.f6907;
        }
        return m6813(layoutInflater, i, view, viewGroup, this.f6914);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f6908 == null) {
            this.f6908 = new C7302(this);
        }
        return this.f6908;
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
