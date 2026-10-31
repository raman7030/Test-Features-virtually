package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8307 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4779 f25503;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f25504;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f25505;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C8307(C4779 c4779) {
        this.f25503 = c4779;
        ArrayList arrayList = new ArrayList();
        this.f25505 = arrayList;
        arrayList.addAll(c4779.f15162);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21908(String str) {
        String lowerCase = str.toLowerCase();
        this.f25504 = lowerCase;
        C4779 c4779 = this.f25503;
        ArrayList arrayList = this.f25505;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c4779.f15162);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f25504;
        for (C22418 c22418 : (ArrayList) c4779.f15162) {
            C11372 c11372 = c22418.f72648;
            if (c11372.f34030.toLowerCase().contains(str2) || String.valueOf(c11372.f34032).contains(str2) || (c11372.f34031 != null && c11372.m28131().toLowerCase().contains(str2))) {
                arrayList.add(c22418);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f25505.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C15361 c15361;
        if (view != null) {
            c15361 = (C15361) view.getTag();
        } else {
            view = C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c15361 = new C15361();
            c15361.f47074 = (TextView) view.findViewById(R.id.textView);
            c15361.f47072 = (TextView) view.findViewById(R.id.textView2);
            c15361.f47073 = (ImageView) view.findViewById(R.id.icon);
            c15361.f47075 = (RadioButton) view.findViewById(R.id.MT_Protector);
            view.setTag(c15361);
        }
        C22418 c22418 = (C22418) this.f25505.get(i);
        C11372 c11372 = c22418.f72648;
        c15361.f47074.setText(c11372.toString());
        c15361.f47075.setChecked(c22418.f72651 == this.f25503.f15157);
        if (c11372.f34031 == null) {
            c15361.f47072.setText(R.string.MT_Protector);
        } else {
            c15361.f47072.setText(c11372.m28131());
        }
        ImageView imageView = c15361.f47073;
        if (c22418.f72648.f34031 == null) {
            imageView.setImageDrawable(c22418.f72650.f15158);
        } else {
            c22418.f72646 = true;
            imageView.setImageDrawable(c22418.f72647);
            if (c22418.f72649) {
                synchronized (c22418.f72650.f15164) {
                    c22418.f72650.f15164.addLast(c22418);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f25503.f15161.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
