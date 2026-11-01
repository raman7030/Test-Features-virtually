package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7536 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC10218 f19778;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C7536(ActivityC10218 activityC10218) {
        this.f19778 = activityC10218;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC10218 activityC10218 = this.f19778;
        boolean z = activityC10218.f28325.f7114;
        C3512 c3512 = activityC10218.f28325;
        return z ? c3512.f7111 : c3512.f7109.f49796.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC10218 activityC10218 = this.f19778;
        if (view == null) {
            view = activityC10218.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        if (activityC10218.f28325.f7114) {
            textView.setText(activityC10218.f28325.f7109.f49796.m50188(activityC10218.f28325.f7113[i]));
            return view;
        }
        textView.setText(activityC10218.f28325.f7109.f49796.m50188(i));
        return view;
    }
}
