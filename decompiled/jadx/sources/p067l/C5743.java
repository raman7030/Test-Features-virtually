package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5743 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC8425 f14090;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C5743(ActivityC8425 activityC8425) {
        this.f14090 = activityC8425;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f14090.f22581.f30810.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC8425 activityC8425 = this.f14090;
        if (view == null) {
            view = activityC8425.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C19801.m45027(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText(((C22508) activityC8425.f22581.f30810.get(i)).m50470());
        return view;
    }
}
