package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes.dex */
public final class C24620 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnClickListenerC10539 f77932;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ArrayList f77933;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C24620(ViewOnClickListenerC10539 viewOnClickListenerC10539, ArrayList arrayList) {
        this.f77932 = viewOnClickListenerC10539;
        this.f77933 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f77933.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C22727 c22727;
        if (view == null) {
            view = this.f77932.f29174.m12252(R.layout.MT_Protector);
            c22727 = new C22727(view);
            c22727.f71684.setSingleLine(false);
            TextView textView = c22727.f71682;
            textView.setVisibility(4);
            textView.setText((CharSequence) null);
            TextView textView2 = c22727.f71683;
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C23223.f72984);
            textView2.setSingleLine(false);
            textView2.setMaxLines(3);
            view.setTag(c22727);
        } else {
            c22727 = (C22727) view.getTag();
        }
        C1349 c1349 = (C1349) this.f77933.get(i);
        c22727.f71684.setText(((InterfaceC22528) c1349.f33658).getPath());
        c22727.f71683.setText((CharSequence) c1349.f33659);
        return view;
    }
}
