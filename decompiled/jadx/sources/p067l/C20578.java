package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20578 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC3142 f63605;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20578(ActivityC3142 activityC3142) {
        this.f63605 = activityC3142;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f63605.f5746.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C2471 c2471;
        ActivityC3142 activityC3142 = this.f63605;
        if (view == null) {
            view = activityC3142.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c2471 = new C2471(view);
            view.setTag(c2471);
        } else {
            c2471 = (C2471) view.getTag();
        }
        c2471.f3862.setText((CharSequence) activityC3142.f5746.get(i));
        return view;
    }
}
