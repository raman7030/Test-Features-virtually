package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes.dex */
public final class C23413 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8597 f75186;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f75187;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C23413(ViewOnClickListenerC8597 viewOnClickListenerC8597, ArrayList arrayList) {
        this.f75186 = viewOnClickListenerC8597;
        this.f75187 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f75187.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C21421 c21421;
        if (view == null) {
            view = this.f75186.f26258.m10216(R.layout.MT_Protector);
            c21421 = new C21421(view);
            c21421.f68986.setSingleLine(false);
            TextView textView = c21421.f68984;
            textView.setVisibility(4);
            textView.setText((CharSequence) null);
            TextView textView2 = c21421.f68985;
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C21943.f70273);
            textView2.setSingleLine(false);
            textView2.setMaxLines(3);
            view.setTag(c21421);
        } else {
            c21421 = (C21421) view.getTag();
        }
        C10220 c10220 = (C10220) this.f75187.get(i);
        c21421.f68986.setText(((InterfaceC21211) c10220.f30697).getPath());
        c21421.f68985.setText((CharSequence) c10220.f30698);
        return view;
    }
}
