package p067l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes.dex */
public final class C23804 extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final Context f75672;

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f75673;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C23804(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList) {
        this.f75672 = abstractActivityC5549;
        this.f75673 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f75673.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f75673.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f75672).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        InterfaceC23134 interfaceC23134 = (InterfaceC23134) this.f75673.get(i);
        boolean zIsChecked = interfaceC23134.isChecked();
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.setText(interfaceC23134.getName());
        if (checkedTextView.isChecked() != zIsChecked) {
            checkedTextView.setChecked(zIsChecked);
            return view;
        }
        checkedTextView.refreshDrawableState();
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        InterfaceC23134 interfaceC23134 = (InterfaceC23134) this.f75673.get(i);
        boolean z = !interfaceC23134.isChecked();
        ((CheckedTextView) view).setChecked(z);
        interfaceC23134.setChecked(z);
    }
}
