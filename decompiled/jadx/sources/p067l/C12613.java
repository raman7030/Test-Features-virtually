package p067l;

/* JADX INFO: renamed from: l.ۧۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12613 extends AbstractC15285 {
    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int adapterPosition = abstractC5462.getAdapterPosition();
        int adapterPosition2 = abstractC5463.getAdapterPosition();
        int i = DialogInterfaceOnDismissListenerC18647.f55660[adapterPosition];
        if (adapterPosition > adapterPosition2) {
            System.arraycopy(DialogInterfaceOnDismissListenerC18647.f55660, adapterPosition2, DialogInterfaceOnDismissListenerC18647.f55660, adapterPosition2 + 1, adapterPosition - adapterPosition2);
        } else {
            System.arraycopy(DialogInterfaceOnDismissListenerC18647.f55660, adapterPosition + 1, DialogInterfaceOnDismissListenerC18647.f55660, adapterPosition, adapterPosition2 - adapterPosition);
        }
        DialogInterfaceOnDismissListenerC18647.f55660[adapterPosition2] = i;
        c14849.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }
}
