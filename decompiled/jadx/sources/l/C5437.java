package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5437 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f16938;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C5437(ActivityC8259 activityC8259) {
        this.f16938 = activityC8259;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC8259 activityC8259 = this.f16938;
        boolean z = activityC8259.f25415.f4345;
        C1203 c1203 = activityC8259.f25415;
        return z ? c1203.f4342 : c1203.f4340.f46672.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC8259 activityC8259 = this.f16938;
        if (view == null) {
            view = activityC8259.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        if (activityC8259.f25415.f4345) {
            textView.setText(activityC8259.f25415.f4340.f46672.m47858(activityC8259.f25415.f4344[i]));
            return view;
        }
        textView.setText(activityC8259.f25415.f4340.f46672.m47858(i));
        return view;
    }
}
