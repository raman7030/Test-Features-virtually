package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23769 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC21758 f75592;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C23769(ActivityC21758 activityC21758) {
        this.f75592 = activityC21758;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f75592.f68513.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC21758 activityC21758 = this.f75592;
        if (view == null) {
            view = activityC21758.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C19801.m45027(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText(((C21249) activityC21758.f68513.get(i)).m48007());
        return view;
    }
}
