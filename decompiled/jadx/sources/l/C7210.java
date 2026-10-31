package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7210 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11026 f22065;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22066 = new ArrayList();

    public C7210(C11026 c11026) {
        this.f22065 = c11026;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC1853) abstractC3255).m6162((C20864) this.f22066.get(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19296(List list) {
        ArrayList arrayList = this.f22066;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19295() {
        this.f22066.clear();
        notifyDataSetChanged();
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC1853(this.f22065, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f22066.size();
    }
}
