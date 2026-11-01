package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X992 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16298 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C11606 f47898;

    /* JADX INFO: renamed from: ᩸ */
    public String f47899;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f47900;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C16298(C11606 c11606) {
        this.f47898 = c11606;
        ArrayList arrayList = new ArrayList();
        this.f47900 = arrayList;
        arrayList.addAll(c11606.f32375);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37091(String str) {
        String lowerCase = str.toLowerCase();
        this.f47899 = lowerCase;
        C11606 c11606 = this.f47898;
        ArrayList arrayList = this.f47900;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c11606.f32375);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f47899;
        for (C22335 c22335 : (ArrayList) c11606.f32375) {
            if (c22335.f70505.toLowerCase().contains(str2) || c22335.f70507.packageName.toLowerCase().contains(str2)) {
                arrayList.add(c22335);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f47900.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C25016 c25016;
        if (view != null) {
            c25016 = (C25016) view.getTag();
        } else {
            view = C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c25016 = new C25016();
            c25016.f79856 = (TextView) view.findViewById(R.id.textView);
            c25016.f79854 = (TextView) view.findViewById(R.id.textView2);
            c25016.f79855 = (ImageView) view.findViewById(R.id.icon);
            c25016.f79853 = (CheckBox) view.findViewById(R.id.MT_Protector);
            view.setTag(c25016);
        }
        C22335 c22335 = (C22335) this.f47900.get(i);
        c25016.f79856.setText(c22335.f70505);
        c25016.f79854.setText(c22335.f70507.packageName);
        c25016.f79853.setChecked(c22335.f70508);
        ImageView imageView = c25016.f79855;
        c22335.f70506 = true;
        imageView.setImageDrawable(c22335.f70510);
        if (c22335.f70509) {
            synchronized (c22335.f70511.f32378) {
                c22335.f70511.f32378.addLast(c22335);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f47898.f32377.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
