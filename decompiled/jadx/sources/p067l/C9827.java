package p067l;

import android.content.ComponentName;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9827 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC16532 f27252;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C9827(ActivityC16532 activityC16532) {
        this.f27252 = activityC16532;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27252.f48583.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ActivityC16532 activityC16532 = this.f27252;
        if (view == null) {
            view = activityC16532.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C19801.m45027(view);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        C4463 c4463 = (C4463) activityC16532.f48583.get(i);
        Boolean boolValueOf = (Boolean) activityC16532.f48581.m34385(i, (Integer) null);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c4463.m9390());
            activityC16532.f48581.m34390(i, boolValueOf);
        }
        textView.setText(c4463.m9398());
        StringBuilder sb = new StringBuilder();
        if (c4463.m9397() != null) {
            sb.append(activityC16532.getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(c4463.m9397().m25786());
        } else {
            ComponentName componentNameMo10963 = c4463.m9395().mo10963();
            sb.append(componentNameMo10963.getPackageName());
            sb.append("/");
            sb.append(componentNameMo10963.getShortClassName());
        }
        textView2.setText(sb.toString());
        textView2.setTextColor(boolValueOf.booleanValue() ? C23223.f72995 : C23223.f73004);
        return view;
    }
}
