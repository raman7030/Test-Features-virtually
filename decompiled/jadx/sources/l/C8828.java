package l;

/* JADX INFO: renamed from: l.ۡۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8828 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15176 f26900;

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C8828(C15176 c15176) {
        this.f26900 = c15176;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        return AbstractC10065.m25259(C15176.m35891(this.f26900, abstractC3255.getBindingAdapterPosition()) ? 3 : 0, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo22801(AbstractC3255 abstractC3255) {
        return C15176.m35891(this.f26900, abstractC3255.getBindingAdapterPosition());
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        C15176 c15176 = this.f26900;
        if (!C15176.m35891(c15176, bindingAdapterPosition) || !C15176.m35891(c15176, bindingAdapterPosition2)) {
            return false;
        }
        int i = bindingAdapterPosition - 1;
        int i2 = bindingAdapterPosition2 - 1;
        C21404.m48486(((C13732) c15176.f46366.get(i)).f41009, ((C13732) c15176.f46366.get(i2)).f41009);
        C6055.m16890(i, i2, c15176.f46366);
        c15176.f46361.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
