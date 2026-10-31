package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19160 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0814 f60374;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C19160(ActivityC0814 activityC0814) {
        this.f60374 = activityC0814;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f60374.f2975.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0108 c0108;
        ActivityC0814 activityC0814 = this.f60374;
        if (view == null) {
            view = activityC0814.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c0108 = new C0108(view);
            view.setTag(c0108);
        } else {
            c0108 = (C0108) view.getTag();
        }
        c0108.f1088.setText((CharSequence) activityC0814.f2975.get(i));
        return view;
    }
}
