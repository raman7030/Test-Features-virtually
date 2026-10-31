package l;

/* JADX INFO: renamed from: l.ۧۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C10779 extends AbstractC13591 {
    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int adapterPosition = abstractC3255.getAdapterPosition();
        int adapterPosition2 = abstractC3256.getAdapterPosition();
        int i = DialogInterfaceOnDismissListenerC17128.f52477[adapterPosition];
        if (adapterPosition > adapterPosition2) {
            System.arraycopy(DialogInterfaceOnDismissListenerC17128.f52477, adapterPosition2, DialogInterfaceOnDismissListenerC17128.f52477, adapterPosition2 + 1, adapterPosition - adapterPosition2);
        } else {
            System.arraycopy(DialogInterfaceOnDismissListenerC17128.f52477, adapterPosition + 1, DialogInterfaceOnDismissListenerC17128.f52477, adapterPosition, adapterPosition2 - adapterPosition);
        }
        DialogInterfaceOnDismissListenerC17128.f52477[adapterPosition2] = i;
        c13132.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }
}
