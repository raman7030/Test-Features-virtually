package p067l;

/* JADX INFO: renamed from: l.ᩳۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19249 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC11203 f57526;

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5539() {
        return false;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5541() {
        return false;
    }

    public C19249(ActivityC11203 activityC11203) {
        this.f57526 = activityC11203;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        return AbstractC11934.m27276(3, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        ActivityC11203 activityC11203 = this.f57526;
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, activityC11203.f31126);
        activityC11203.f31127.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        int i = C3826.f8197;
        C4081.m8188(new RunnableC20282(1), C3826.class, 500L);
        return true;
    }
}
