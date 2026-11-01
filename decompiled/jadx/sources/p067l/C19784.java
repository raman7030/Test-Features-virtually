package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19784 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f60191;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f60192;

    /* JADX INFO: renamed from: ܽ */
    public C3847 f60193;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnTouchListenerC19113) abstractC5462).m43425((C15579) this.f60192.get(i), this.f60193);
    }

    public C19784(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList) {
        this.f60191 = abstractActivityC5549;
        this.f60192 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44966(C3847 c3847) {
        this.f60193 = c3847;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractActivityC5549 abstractActivityC5549 = this.f60191;
        return new ViewOnTouchListenerC19113(abstractActivityC5549, LayoutInflater.from(abstractActivityC5549).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f60192.size();
    }
}
