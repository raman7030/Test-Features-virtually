package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2823 extends AbstractC10065 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12700 f9037;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f9038;

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

    public C2823(C12700 c12700, ArrayList arrayList) {
        this.f9037 = c12700;
        this.f9038 = arrayList;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        return AbstractC10065.m25259(this.f9037.m30973() ? 3 : 0, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        ArrayList arrayList = this.f9038;
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, arrayList);
        this.f9037.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C16870.m39663(arrayList);
        return true;
    }
}
