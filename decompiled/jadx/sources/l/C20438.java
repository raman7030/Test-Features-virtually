package l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C20438 extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence[] f65935;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f65936;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Context f65937;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C20438(Context context, boolean[] zArr, CharSequence[] charSequenceArr) {
        this.f65937 = context;
        this.f65936 = zArr;
        this.f65935 = charSequenceArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f65936.length;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f65937).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.setText(this.f65935[i]);
        boolean zIsChecked = checkedTextView.isChecked();
        boolean z = this.f65936[i];
        if (zIsChecked != z) {
            checkedTextView.setChecked(z);
            return view;
        }
        checkedTextView.refreshDrawableState();
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.f65936;
        boolean z = !zArr[i];
        zArr[i] = z;
        ((CheckedTextView) view).setChecked(z);
    }
}
