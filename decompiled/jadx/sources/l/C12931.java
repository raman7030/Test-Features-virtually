package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12931 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14507 f38798;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C12931(C14507 c14507) {
        this.f38798 = c14507;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.f38798.f44484).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((ArrayList) this.f38798.f44484).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        TextView textView2;
        C14507 c14507 = this.f38798;
        if (view == null) {
            view = c14507.f44483.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.MT_Protector);
            textView2 = (TextView) view.findViewById(R.id.MT_Protector);
            view.setTag(textView);
            textView.setTag(textView2);
        } else {
            textView = (TextView) view.getTag();
            textView2 = (TextView) textView.getTag();
        }
        C23680 c23680 = (C23680) ((ArrayList) c14507.f44484).get(i);
        textView.setText(c23680.f76709);
        textView2.setText(c23680.f76708);
        return view;
    }
}
