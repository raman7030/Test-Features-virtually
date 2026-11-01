package p067l;

/* JADX INFO: renamed from: l.֨ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3205 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC21312 f6217;

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

    public C3205(ActivityC21312 activityC21312) {
        this.f6217 = activityC21312;
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
        C14486.m33128(bindingAdapterPosition, bindingAdapterPosition2);
        this.f6217.f67169.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
