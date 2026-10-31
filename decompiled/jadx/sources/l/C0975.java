package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0975 extends ArrayAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f3663;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C0975(Main main, ArrayList arrayList, ArrayList arrayList2) {
        super(main, R.layout.MT_Protector, android.R.id.text1, arrayList);
        this.f3663 = arrayList2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((Boolean) this.f3663.get(i)).booleanValue();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (isEnabled(i)) {
            view2.setAlpha(1.0f);
            return view2;
        }
        view2.setAlpha(0.3f);
        return view2;
    }
}
