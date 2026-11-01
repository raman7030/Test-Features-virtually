package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8075 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean[] f21298;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ CharSequence[] f21299;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C8075(CharSequence[] charSequenceArr, boolean[] zArr) {
        this.f21299 = charSequenceArr;
        this.f21298 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f21299.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f21299[i];
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        CheckedTextView checkedTextView = (CheckedTextView) view;
        if (checkedTextView == null) {
            checkedTextView = (CheckedTextView) C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
        }
        checkedTextView.setText(this.f21299[i]);
        boolean zIsChecked = checkedTextView.isChecked();
        boolean z = this.f21298[i];
        if (zIsChecked != z) {
            checkedTextView.setChecked(z);
            return checkedTextView;
        }
        checkedTextView.refreshDrawableState();
        return checkedTextView;
    }
}
