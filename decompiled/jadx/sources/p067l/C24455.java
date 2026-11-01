package p067l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes.dex */
public final class C24455 extends BaseAdapter {

    /* JADX INFO: renamed from: ۗ */
    public int f77410;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C4024 f77411;

    /* JADX INFO: renamed from: ᩸ */
    public int f77413;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f77414 = new ArrayList();

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f77412 = C4024.f8798;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C24455(C4024 c4024) {
        this.f77411 = c4024;
        float[] fArr = new float[3];
        C9464.m21979(C23223.f72969, fArr);
        fArr[2] = fArr[2] * 1.2f;
        this.f77410 = Color.HSVToColor(fArr);
        C9464.m21979(C23223.f72995, fArr);
        fArr[2] = C23223.m51760(1.2f, 0.95f) * fArr[2];
        this.f77413 = Color.HSVToColor(fArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53960(String str) {
        if (str == null || str.isEmpty()) {
            this.f77412 = C4024.f8798;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = this.f77414;
        arrayList.clear();
        for (C9703 c9703 : C4024.f8798) {
            if (C11567.m26630(c9703.f26763, (CharSequence) str) || C11567.m26630(c9703.f26762, (CharSequence) str)) {
                arrayList.add(new C9703(c9703.f26763, c9703.f26762, str, this.f77410, this.f77413));
            }
        }
        this.f77412 = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f77412.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C15737 c15737;
        if (view != null) {
            c15737 = (C15737) view.getTag();
        } else {
            view = C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c15737 = new C15737();
            c15737.f45579 = (TextView) view.findViewById(R.id.textView);
            c15737.f45578 = (TextView) view.findViewById(R.id.textView2);
            view.setTag(c15737);
        }
        C9703 c9703 = (C9703) this.f77412.get(i);
        c15737.f45579.setText(c9703.f26763);
        c15737.f45578.setText(c9703.f26762);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f77411.f8800.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
