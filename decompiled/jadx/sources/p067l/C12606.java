package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12606 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C18107 f35395;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11400 f35396;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C17969 f35397;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C12606(C17969 c17969, C18107 c18107, C11400 c11400) {
        this.f35397 = c17969;
        this.f35395 = c18107;
        this.f35396 = c11400;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f35397.f53664.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C18640 c18640;
        C18107 c18107 = this.f35395;
        if (view == null) {
            view = c18107.m41282().getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c18640 = new C18640(0);
            c18640.f55646 = (TextView) view.findViewById(R.id.MT_Protector);
            c18640.f55645 = (TextView) view.findViewById(R.id.MT_Protector);
            c18640.f55647 = (TextView) view.findViewById(R.id.MT_Protector);
            c18640.f55644 = (ImageView) view.findViewById(R.id.MT_Protector);
            view.setTag(c18640);
        } else {
            c18640 = (C18640) view.getTag();
        }
        AbstractC18422 abstractC18422M41270 = c18107.m41270();
        C17969 c17969 = this.f35397;
        if (c17969.f53665.equals(abstractC18422M41270.mo8204())) {
            C13946 c13946 = (C13946) c17969.f53664.get(i);
            c18640.f55646.setText(C8597.m20011(100, c13946.m31723()));
            InterfaceC19370 interfaceC19370M31720 = c13946.m31720();
            StringBuilder sb = new StringBuilder(C18794.m42828(interfaceC19370M31720.getTime()));
            if (interfaceC19370M31720.mo26449()) {
                sb.append(EnumC2483.f3919);
                sb.append(C24158.m53411(interfaceC19370M31720.getSize()));
            }
            c18640.f55645.setText(sb.toString());
            c18640.f55647.setText(C8597.m20013(250, c13946.m31724()));
            c13946.m31722(abstractC18422M41270, c18640.f55644, C15957.f46181, this.f35396);
            view.setAlpha(c13946.f39335 ? 0.5f : 1.0f);
        }
        return view;
    }
}
