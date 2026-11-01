package p067l;

/* JADX INFO: renamed from: l.ۡۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10759 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16792 f29824;

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5541() {
        return false;
    }

    public C10759(C16792 c16792) {
        this.f29824 = c16792;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        return AbstractC11934.m27276(C16792.m38050(this.f29824, abstractC5462.getBindingAdapterPosition()) ? 3 : 0, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24771(AbstractC5462 abstractC5462) {
        return C16792.m38050(this.f29824, abstractC5462.getBindingAdapterPosition());
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        C16792 c16792 = this.f29824;
        if (!C16792.m38050(c16792, bindingAdapterPosition) || !C16792.m38050(c16792, bindingAdapterPosition2)) {
            return false;
        }
        int i = bindingAdapterPosition - 1;
        int i2 = bindingAdapterPosition2 - 1;
        C22711.m50822(((C15419) c16792.f49491.get(i)).f44088, ((C15419) c16792.f49491.get(i2)).f44088);
        C8123.m18819(i, i2, c16792.f49491);
        c16792.f49486.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
