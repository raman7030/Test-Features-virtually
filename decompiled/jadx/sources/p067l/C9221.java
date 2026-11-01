package p067l;

import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9221 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12848 f24950;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f24951 = new ArrayList();

    public C9221(C12848 c12848) {
        this.f24950 = c12848;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnClickListenerC4130) abstractC5462).m8364((C22198) this.f24951.get(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21244(List list) {
        ArrayList arrayList = this.f24951;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21243() {
        this.f24951.clear();
        notifyDataSetChanged();
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC4130(this.f24950, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f24951.size();
    }
}
