package p067l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes3.dex */
public final class C12982 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public Context f36528;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C19687 f36529;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C12982(C19687 c19687, Context context) {
        this.f36529 = c19687;
        this.f36528 = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C19687 c19687 = this.f36529;
        if (c19687.f59846 == null) {
            return 0;
        }
        return c19687.f59846.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f36529.f59846.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f36528).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        C19687 c19687 = this.f36529;
        textView.setText((CharSequence) c19687.f59846.get(i));
        TextUtils.TruncateAt truncateAt = c19687.f59844;
        if (truncateAt != null) {
            textView.setEllipsize(truncateAt);
        }
        return view;
    }
}
