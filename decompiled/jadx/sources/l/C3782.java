package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3782 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f11948;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f11949;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19305 f11950;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C3782(C19305 c19305, ActivityC6604 activityC6604, boolean[] zArr) {
        this.f11950 = c19305;
        this.f11949 = activityC6604;
        this.f11948 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11950.f60720.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C21421 c21421;
        ActivityC6604 activityC6604 = this.f11949;
        if (view == null) {
            view = activityC6604.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c21421 = new C21421(view);
            c21421.f68986.setSingleLine();
            view.setTag(c21421);
        } else {
            c21421 = (C21421) view.getTag();
        }
        c21421.f68985.setVisibility(8);
        c21421.f68985.setText((CharSequence) null);
        C18906 c18906 = (C18906) this.f11950.f60720.get(i);
        c21421.f68984.setText(String.format("%04X", Integer.valueOf(c18906.mo47883())));
        C19096.m43984(activityC6604.f20336, c18906, c21421);
        view.setBackgroundColor(this.f11948[i] ? C21943.f70286 : 0);
        return view;
    }
}
