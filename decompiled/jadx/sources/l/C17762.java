package l;

/* JADX INFO: renamed from: l.ᩳۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17762 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9296 f54332;

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

    public C17762(ActivityC9296 activityC9296) {
        this.f54332 = activityC9296;
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
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        ActivityC9296 activityC9296 = this.f54332;
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, activityC9296.f28177);
        activityC9296.f28178.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        int i = C1534.f5415;
        C1802.m5991(new RunnableC18848(1), C1534.class, 500L);
        return true;
    }
}
