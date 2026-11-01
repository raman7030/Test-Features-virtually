package p067l;

/* JADX INFO: renamed from: l.ۚܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7554 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC5542 f19824;

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

    public C7554(ActivityC5542 activityC5542) {
        this.f19824 = activityC5542;
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
        synchronized (this.f19824.f13365) {
            C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, this.f19824.f13365);
        }
        this.f19824.f13367.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C12248.m28248();
        return true;
    }
}
