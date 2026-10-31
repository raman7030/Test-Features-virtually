package l;

import android.content.ComponentName;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7848 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14903 f24336;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C7848(ActivityC14903 activityC14903) {
        this.f24336 = activityC14903;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f24336.f45468.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ActivityC14903 activityC14903 = this.f24336;
        if (view == null) {
            view = activityC14903.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C18342.m42765(view);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        C2204 c2204 = (C2204) activityC14903.f45468.get(i);
        Boolean boolValueOf = (Boolean) activityC14903.f45466.m32284(i, (Integer) null);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c2204.m7311());
            activityC14903.f45466.m32289(i, boolValueOf);
        }
        textView.setText(c2204.m7319());
        StringBuilder sb = new StringBuilder();
        if (c2204.m7318() != null) {
            sb.append(activityC14903.getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(c2204.m7318().m23785());
        } else {
            ComponentName componentNameMo8896 = c2204.m7316().mo8896();
            sb.append(componentNameMo8896.getPackageName());
            sb.append("/");
            sb.append(componentNameMo8896.getShortClassName());
        }
        textView2.setText(sb.toString());
        textView2.setTextColor(boolValueOf.booleanValue() ? C21943.f70284 : C21943.f70293);
        return view;
    }
}
