package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14658 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C16156 f41839;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C14658(C16156 c16156) {
        this.f41839 = c16156;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.f41839.f47585).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((ArrayList) this.f41839.f47585).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        TextView textView2;
        C16156 c16156 = this.f41839;
        if (view == null) {
            view = c16156.f47584.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.MT_Protector);
            textView2 = (TextView) view.findViewById(R.id.MT_Protector);
            view.setTag(textView);
            textView.setTag(textView2);
        } else {
            textView = (TextView) view.getTag();
            textView2 = (TextView) textView.getTag();
        }
        C24874 c24874 = (C24874) ((ArrayList) c16156.f47585).get(i);
        textView.setText(c24874.f79459);
        textView2.setText(c24874.f79458);
        return view;
    }
}
