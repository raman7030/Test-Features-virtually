package p067l;

/* JADX INFO: renamed from: l.᩷᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C22407 extends AbstractC11934 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C24397 f70684;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C11007 f70685;

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

    public C22407(C11007 c11007, C24397 c24397) {
        this.f70685 = c11007;
        this.f70684 = c24397;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        return AbstractC11934.m27276(3, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        C11007 c11007 = this.f70685;
        if (c11007.m25407()) {
            return false;
        }
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        if (!this.f70684.m53809(bindingAdapterPosition, bindingAdapterPosition2)) {
            return false;
        }
        c11007.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C20946.f65824.mo4062(Object.class);
        return true;
    }
}
