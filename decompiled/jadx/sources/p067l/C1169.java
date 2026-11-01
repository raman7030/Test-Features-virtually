package p067l;

/* JADX INFO: renamed from: l.ۜۜ */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes3.dex */
public final class C1169 extends AbstractViewOnTouchListenerC1532 {

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ ViewOnClickListenerC1309 f23173;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169(ViewOnClickListenerC1309 viewOnClickListenerC1309) {
        super(viewOnClickListenerC1309);
        this.f23173 = viewOnClickListenerC1309;
    }

    @Override // p067l.AbstractViewOnTouchListenerC1532
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1329 mo13521() {
        AbstractC1869 abstractC1869 = this.f23173.f31503;
        if (abstractC1869 != null) {
            return abstractC1869.mo31182();
        }
        return null;
    }

    @Override // p067l.AbstractViewOnTouchListenerC1532
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13522() {
        InterfaceC1329 interfaceC1329Mo13521;
        ViewOnClickListenerC1309 viewOnClickListenerC1309 = this.f23173;
        InterfaceC1064 interfaceC1064 = viewOnClickListenerC1309.f31500;
        return interfaceC1064 != null && interfaceC1064.mo5681(viewOnClickListenerC1309.f31501) && (interfaceC1329Mo13521 = mo13521()) != null && interfaceC1329Mo13521.isShowing();
    }
}
