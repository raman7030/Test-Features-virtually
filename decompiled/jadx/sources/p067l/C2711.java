package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2711 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16792 f4551;

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C2711(C16792 c16792) {
        this.f4551 = c16792;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C16792 c16792 = this.f4551;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c16792.f49483);
        if (i == 0) {
            return new C20818(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C10088(c16792, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        String str;
        String string;
        C16792 c16792 = this.f4551;
        if (i == 0) {
            ((TextView) abstractC5462.itemView.findViewById(R.id.MT_Protector)).setText(c16792.f49485);
            return;
        }
        C15419 c15419 = (C15419) c16792.f49491.get(i - 1);
        C10088 c10088 = (C10088) abstractC5462;
        TextView textView = c10088.f28003;
        boolean zM35148 = c15419.m35148();
        EnumC8044 enumC8044 = c15419.f44086;
        textView.setText(zM35148 ? c16792.f49483.getString(R.string.MT_Protector) : c15419.f44088);
        TextView textView2 = c10088.f28001;
        if (c15419.m35148()) {
            string = c16792.m38037(enumC8044);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(c16792.m38037(enumC8044));
            sb.append(" · ");
            sb.append(c16792.f49483.getString(c15419.f44089 == EnumC8890.FILE ? R.string.MT_Protector : R.string.MT_Protector));
            if (c15419.f44087) {
                str = "";
            } else {
                str = " · " + c16792.f49483.getString(R.string.MT_Protector);
            }
            sb.append(str);
            string = sb.toString();
        }
        textView2.setText(string);
        c10088.f28002.setVisibility(c15419.m35148() ? 4 : 0);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f4551.f49491.size() + 1;
    }
}
