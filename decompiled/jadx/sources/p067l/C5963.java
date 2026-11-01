package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5963 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ boolean[] f14754;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC8645 f14755;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C20716 f14756;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C5963(C20716 c20716, ActivityC8645 activityC8645, boolean[] zArr) {
        this.f14756 = c20716;
        this.f14755 = activityC8645;
        this.f14754 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f14756.f63950.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C22727 c22727;
        ActivityC8645 activityC8645 = this.f14755;
        if (view == null) {
            view = activityC8645.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c22727 = new C22727(view);
            c22727.f71684.setSingleLine();
            view.setTag(c22727);
        } else {
            c22727 = (C22727) view.getTag();
        }
        c22727.f71683.setVisibility(8);
        c22727.f71683.setText((CharSequence) null);
        C20337 c20337 = (C20337) this.f14756.f63950.get(i);
        c22727.f71682.setText(String.format("%04X", Integer.valueOf(c20337.mo50213())));
        C20518.m46278(activityC8645.f23213, c20337, c22727);
        view.setBackgroundColor(this.f14754[i] ? C23223.f72997 : 0);
        return view;
    }
}
