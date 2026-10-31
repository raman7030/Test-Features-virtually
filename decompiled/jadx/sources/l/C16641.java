package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16641 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f51099;

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3225() {
        return false;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C16641(ArrayList arrayList) {
        this.f51099 = arrayList;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        return AbstractC10065.m25259(3, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, this.f51099);
        AbstractC19902 adapter = c13132.getAdapter();
        C11003.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
