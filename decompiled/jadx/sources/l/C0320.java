package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0320 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8082 f1703;

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

    public C0320(C8082 c8082) {
        this.f1703 = c8082;
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
        C8082 c8082 = this.f1703;
        if (view == null || view.getId() != R.id.MT_Protector) {
            view = LayoutInflater.from(c8082.getContext()).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        c8082.getContext().getPackageManager();
        throw null;
    }
}
