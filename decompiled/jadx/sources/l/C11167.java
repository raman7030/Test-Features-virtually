package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes3.dex */
public final class C11167 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Context f33528;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18222 f33529;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C11167(C18222 c18222, Context context) {
        this.f33529 = c18222;
        this.f33528 = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C18222 c18222 = this.f33529;
        if (c18222.f56633 == null) {
            return 0;
        }
        return c18222.f56633.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f33529.f56633.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f33528).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        C18222 c18222 = this.f33529;
        textView.setText((CharSequence) c18222.f56633.get(i));
        TextUtils.TruncateAt truncateAt = c18222.f56631;
        if (truncateAt != null) {
            textView.setEllipsize(truncateAt);
        }
        return view;
    }
}
