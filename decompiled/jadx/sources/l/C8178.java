package l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8178 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f25176;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f25177;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f25178;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C8178(AbstractActivityC3346 abstractActivityC3346) {
        this.f25177 = abstractActivityC3346;
        this.f25176 = LayoutInflater.from(abstractActivityC3346);
        m21665();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21665() {
        this.f25178 = ServiceC1618.m5491();
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f25178.isEmpty();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f25178.isEmpty()) {
            return 1;
        }
        return this.f25178.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f25178.isEmpty()) {
            return null;
        }
        return this.f25178.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !this.f25178.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21664() {
        return this.f25178.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16826 m21663(int i) {
        return (C16826) this.f25178.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String strM40572;
        if (view == null) {
            view = this.f25176.inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        if (this.f25178.isEmpty()) {
            textView.setText(R.string.MT_Protector);
            textView2.setVisibility(8);
            return view;
        }
        C16826 c16826 = (C16826) this.f25178.get(i);
        String strM39568 = c16826.m39568();
        boolean zIsEmpty = TextUtils.isEmpty(strM39568);
        AbstractActivityC3346 abstractActivityC3346 = this.f25177;
        if (zIsEmpty) {
            strM39568 = abstractActivityC3346.getString(R.string.MT_Protector);
        }
        textView.setText(strM39568);
        String string = abstractActivityC3346.getString(c16826.m39573() ? R.string.MT_Protector : R.string.MT_Protector);
        long jM39572 = c16826.m39572();
        if (jM39572 <= 0) {
            strM40572 = abstractActivityC3346.getString(R.string.MT_Protector);
        } else {
            strM40572 = C17283.m40572(jM39572);
        }
        textView2.setText(abstractActivityC3346.getString(R.string.MT_Protector, string, strM40572));
        textView2.setVisibility(0);
        return view;
    }
}
