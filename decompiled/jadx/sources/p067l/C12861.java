package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes3.dex */
public final class C12861 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC18224 f36178;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C12861(ActivityC18224 activityC18224) {
        this.f36178 = activityC18224;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36178.f54395.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC18224 activityC18224 = this.f36178;
        if (view == null) {
            view = activityC18224.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C19801.m45027(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText((CharSequence) activityC18224.f54395.get(i));
        return view;
    }
}
