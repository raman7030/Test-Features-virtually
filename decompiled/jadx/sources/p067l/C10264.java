package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10264 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C6911 f28414;

    /* JADX INFO: renamed from: ᩸ */
    public String f28415;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f28416;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C10264(C6911 c6911) {
        this.f28414 = c6911;
        ArrayList arrayList = new ArrayList();
        this.f28416 = arrayList;
        arrayList.addAll(c6911.f17994);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23878(String str) {
        String lowerCase = str.toLowerCase();
        this.f28415 = lowerCase;
        C6911 c6911 = this.f28414;
        ArrayList arrayList = this.f28416;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c6911.f17994);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f28415;
        for (C23675 c23675 : (ArrayList) c6911.f17994) {
            C13176 c13176 = c23675.f75375;
            if (c13176.f37027.toLowerCase().contains(str2) || String.valueOf(c13176.f37029).contains(str2) || (c13176.f37028 != null && c13176.m30175().toLowerCase().contains(str2))) {
                arrayList.add(c23675);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f28416.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C16968 c16968;
        if (view != null) {
            c16968 = (C16968) view.getTag();
        } else {
            view = C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c16968 = new C16968();
            c16968.f50201 = (TextView) view.findViewById(R.id.textView);
            c16968.f50199 = (TextView) view.findViewById(R.id.textView2);
            c16968.f50200 = (ImageView) view.findViewById(R.id.icon);
            c16968.f50202 = (RadioButton) view.findViewById(R.id.MT_Protector);
            view.setTag(c16968);
        }
        C23675 c23675 = (C23675) this.f28416.get(i);
        C13176 c13176 = c23675.f75375;
        c16968.f50201.setText(c13176.toString());
        c16968.f50202.setChecked(c23675.f75378 == this.f28414.f17989);
        if (c13176.f37028 == null) {
            c16968.f50199.setText(R.string.MT_Protector);
        } else {
            c16968.f50199.setText(c13176.m30175());
        }
        ImageView imageView = c16968.f50200;
        if (c23675.f75375.f37028 == null) {
            imageView.setImageDrawable(c23675.f75377.f17990);
        } else {
            c23675.f75373 = true;
            imageView.setImageDrawable(c23675.f75374);
            if (c23675.f75376) {
                synchronized (c23675.f75377.f17996) {
                    c23675.f75377.f17996.addLast(c23675);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f28414.f17993.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
