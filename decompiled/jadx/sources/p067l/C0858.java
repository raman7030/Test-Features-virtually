package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡ۢ */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0858 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1243 f4479;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    public C0858(C1243 c1243) {
        this.f4479 = c1243;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1243 c1243 = this.f4479;
        if (view == null || view.getId() != R.id.MT_Protector) {
            view = LayoutInflater.from(c1243.getContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        c1243.getContext().getPackageManager();
        throw null;
    }
}
