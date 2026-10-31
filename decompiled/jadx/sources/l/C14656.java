package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X992 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14656 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9719 f44788;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f44789;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f44790;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C14656(C9719 c9719) {
        this.f44788 = c9719;
        ArrayList arrayList = new ArrayList();
        this.f44790 = arrayList;
        arrayList.addAll(c9719.f29425);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34944(String str) {
        String lowerCase = str.toLowerCase();
        this.f44789 = lowerCase;
        C9719 c9719 = this.f44788;
        ArrayList arrayList = this.f44790;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c9719.f29425);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f44789;
        for (C21008 c21008 : (ArrayList) c9719.f29425) {
            if (c21008.f67820.toLowerCase().contains(str2) || c21008.f67822.packageName.toLowerCase().contains(str2)) {
                arrayList.add(c21008);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f44790.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C23829 c23829;
        if (view != null) {
            c23829 = (C23829) view.getTag();
        } else {
            view = C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c23829 = new C23829();
            c23829.f77105 = (TextView) view.findViewById(R.id.textView);
            c23829.f77103 = (TextView) view.findViewById(R.id.textView2);
            c23829.f77104 = (ImageView) view.findViewById(R.id.icon);
            c23829.f77102 = (CheckBox) view.findViewById(R.id.MT_Protector);
            view.setTag(c23829);
        }
        C21008 c21008 = (C21008) this.f44790.get(i);
        c23829.f77105.setText(c21008.f67820);
        c23829.f77103.setText(c21008.f67822.packageName);
        c23829.f77102.setChecked(c21008.f67823);
        ImageView imageView = c23829.f77104;
        c21008.f67821 = true;
        imageView.setImageDrawable(c21008.f67825);
        if (c21008.f67824) {
            synchronized (c21008.f67826.f29428) {
                c21008.f67826.f29428.addLast(c21008);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f44788.f29427.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
