package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: renamed from: l.ۨ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes3.dex */
public final class C13517 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ActivityC18686 f37988;

    /* JADX INFO: renamed from: ᩸ */
    public DateFormat f37989 = DateFormat.getDateTimeInstance();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C4110 f37990;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C13517(C4110 c4110, ActivityC18686 activityC18686) {
        this.f37990 = c4110;
        this.f37988 = activityC18686;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.f37990.f9052).size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f37988).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        C23575 c23575 = (C23575) ((ArrayList) this.f37990.f9052).get(i);
        textView.setText(c23575.f75056);
        textView2.setText(this.f37989.format(new Date(c23575.f75053)));
        return view;
    }
}
