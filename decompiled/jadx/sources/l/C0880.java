package l;

/* JADX INFO: renamed from: l.֨ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0880 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19932 f3444;

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo3225() {
        return false;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo3227() {
        return false;
    }

    public C0880(ActivityC19932 activityC19932) {
        this.f3444 = activityC19932;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo3224(AbstractC3255 abstractC3255) {
        return AbstractC10065.m25259(3, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        C12749.m31044(bindingAdapterPosition, bindingAdapterPosition2);
        this.f3444.f64532.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
