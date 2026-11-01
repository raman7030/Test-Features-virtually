package p067l;

/* JADX INFO: renamed from: l.ۚۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes3.dex */
public final class C7248 extends AbstractC15285 {
    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        int[] iArr = (int[]) DialogInterfaceOnDismissListenerC16634.f48889.clone();
        int[] iArr2 = DialogInterfaceOnDismissListenerC16634.f48889;
        int i = iArr2[bindingAdapterPosition];
        iArr2[bindingAdapterPosition] = iArr2[bindingAdapterPosition2];
        iArr2[bindingAdapterPosition2] = i;
        C21993.m49555(new C2553(iArr)).m42393(c14849.getAdapter());
        return true;
    }
}
