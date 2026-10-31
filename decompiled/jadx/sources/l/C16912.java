package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16912 extends AbstractC10065 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f51973;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18324 f51974;

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C16912(ArrayList arrayList, C18324 c18324) {
        this.f51973 = arrayList;
        this.f51974 = c18324;
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
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, this.f51973);
        this.f51974.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
