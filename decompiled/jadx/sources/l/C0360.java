package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0360 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15176 f1772;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C0360(C15176 c15176) {
        this.f1772 = c15176;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C15176 c15176 = this.f1772;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c15176.f46358);
        if (i == 0) {
            return new C19412(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C8122(c15176, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        String str;
        String string;
        C15176 c15176 = this.f1772;
        if (i == 0) {
            ((TextView) abstractC3255.itemView.findViewById(R.id.MT_Protector)).setText(c15176.f46360);
            return;
        }
        C13732 c13732 = (C13732) c15176.f46366.get(i - 1);
        C8122 c8122 = (C8122) abstractC3255;
        TextView textView = c8122.f25090;
        boolean zM33034 = c13732.m33034();
        EnumC5972 enumC5972 = c13732.f41007;
        textView.setText(zM33034 ? c15176.f46358.getString(R.string.MT_Protector) : c13732.f41009);
        TextView textView2 = c8122.f25088;
        if (c13732.m33034()) {
            string = c15176.m35878(enumC5972);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(c15176.m35878(enumC5972));
            sb.append(" · ");
            sb.append(c15176.f46358.getString(c13732.f41010 == EnumC6862.FILE ? R.string.MT_Protector : R.string.MT_Protector));
            if (c13732.f41008) {
                str = "";
            } else {
                str = " · " + c15176.f46358.getString(R.string.MT_Protector);
            }
            sb.append(str);
            string = sb.toString();
        }
        textView2.setText(string);
        c8122.f25089.setVisibility(c13732.m33034() ? 4 : 0);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f1772.f46366.size() + 1;
    }
}
