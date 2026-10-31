package l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes.dex */
public final class C22554 extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Context f72945;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f72946;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C22554(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList) {
        this.f72945 = abstractActivityC3346;
        this.f72946 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f72946.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f72946.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f72945).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        InterfaceC21849 interfaceC21849 = (InterfaceC21849) this.f72946.get(i);
        boolean zIsChecked = interfaceC21849.isChecked();
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.setText(interfaceC21849.getName());
        if (checkedTextView.isChecked() != zIsChecked) {
            checkedTextView.setChecked(zIsChecked);
            return view;
        }
        checkedTextView.refreshDrawableState();
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        InterfaceC21849 interfaceC21849 = (InterfaceC21849) this.f72946.get(i);
        boolean z = !interfaceC21849.isChecked();
        ((CheckedTextView) view).setChecked(z);
        interfaceC21849.setChecked(z);
    }
}
