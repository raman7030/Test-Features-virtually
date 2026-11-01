package p067l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10141 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶ */
    public final LayoutInflater f28086;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f28087;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f28088;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C10141(AbstractActivityC5549 abstractActivityC5549) {
        this.f28087 = abstractActivityC5549;
        this.f28086 = LayoutInflater.from(abstractActivityC5549);
        m23634();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23634() {
        this.f28088 = ServiceC3906.m7721();
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f28088.isEmpty();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f28088.isEmpty()) {
            return 1;
        }
        return this.f28088.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f28088.isEmpty()) {
            return null;
        }
        return this.f28088.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !this.f28088.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23633() {
        return this.f28088.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18360 m23632(int i) {
        return (C18360) this.f28088.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String strM42823;
        if (view == null) {
            view = this.f28086.inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        if (this.f28088.isEmpty()) {
            textView.setText(R.string.MT_Protector);
            textView2.setVisibility(8);
            return view;
        }
        C18360 c18360 = (C18360) this.f28088.get(i);
        String strM41804 = c18360.m41804();
        boolean zIsEmpty = TextUtils.isEmpty(strM41804);
        AbstractActivityC5549 abstractActivityC5549 = this.f28087;
        if (zIsEmpty) {
            strM41804 = abstractActivityC5549.getString(R.string.MT_Protector);
        }
        textView.setText(strM41804);
        String string = abstractActivityC5549.getString(c18360.m41809() ? R.string.MT_Protector : R.string.MT_Protector);
        long jM41808 = c18360.m41808();
        if (jM41808 <= 0) {
            strM42823 = abstractActivityC5549.getString(R.string.MT_Protector);
        } else {
            strM42823 = C18794.m42823(jM41808);
        }
        textView2.setText(abstractActivityC5549.getString(R.string.MT_Protector, string, strM42823));
        textView2.setVisibility(0);
        return view;
    }
}
