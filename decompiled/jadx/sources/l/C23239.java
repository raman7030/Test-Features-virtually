package l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes.dex */
public final class C23239 extends BaseAdapter {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f74667;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1742 f74668;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f74670;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f74671 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f74669 = C1742.f6021;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C23239(C1742 c1742) {
        this.f74668 = c1742;
        float[] fArr = new float[3];
        C7466.m20004(C21943.f70257, fArr);
        fArr[2] = fArr[2] * 1.2f;
        this.f74667 = Color.HSVToColor(fArr);
        C7466.m20004(C21943.f70284, fArr);
        fArr[2] = C21943.m49423(1.2f, 0.95f) * fArr[2];
        this.f74670 = Color.HSVToColor(fArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51563(String str) {
        if (str == null || str.isEmpty()) {
            this.f74669 = C1742.f6021;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = this.f74671;
        arrayList.clear();
        for (C7717 c7717 : C1742.f6021) {
            if (C9679.m24616(c7717.f23850, (CharSequence) str) || C9679.m24616(c7717.f23849, (CharSequence) str)) {
                arrayList.add(new C7717(c7717.f23850, c7717.f23849, str, this.f74667, this.f74670));
            }
        }
        this.f74669 = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f74669.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14066 c14066;
        if (view != null) {
            c14066 = (C14066) view.getTag();
        } else {
            view = C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c14066 = new C14066();
            c14066.f42493 = (TextView) view.findViewById(R.id.textView);
            c14066.f42492 = (TextView) view.findViewById(R.id.textView2);
            view.setTag(c14066);
        }
        C7717 c7717 = (C7717) this.f74669.get(i);
        c14066.f42493.setText(c7717.f23850);
        c14066.f42492.setText(c7717.f23849);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f74668.f6023.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
