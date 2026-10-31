package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes.dex */
public final class C22314 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f72331;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C22314(C3264 c3264) {
        this.f72331 = c3264;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3264 c3264 = this.f72331;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c3264.f10236);
        if (i == 0) {
            return new C21609(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C4675(c3264, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C3264 c3264 = this.f72331;
        if (i == 0) {
            C3264.m9983(c3264, abstractC3255.itemView);
            return;
        }
        C18673 c18673 = (C18673) c3264.f10243.f62726.get(i - 1);
        C4675 c4675 = (C4675) abstractC3255;
        c4675.f14859.setText(c18673.f59008);
        c4675.f14858.setText(c18673.f59011);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f72331.f10243.f62726.size() + 1;
    }
}
