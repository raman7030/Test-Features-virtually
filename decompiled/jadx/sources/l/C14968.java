package l;

/* JADX INFO: renamed from: l.ܶۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14968 extends AbstractC16876 implements InterfaceC19763 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23932 f45625;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14968(C23932 c23932) {
        super(2);
        this.f45625 = c23932;
    }

    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        InterfaceC14801 interfaceC14801 = (InterfaceC14801) obj;
        InterfaceC18330 interfaceC18330 = (InterfaceC18330) obj2;
        if (!(interfaceC18330 instanceof InterfaceC0857)) {
            return interfaceC14801.mo13851(interfaceC18330);
        }
        C23932 c23932 = this.f45625;
        if (((InterfaceC14801) c23932.f77612).mo9082(interfaceC18330.getKey()) == null) {
            return interfaceC14801.mo13851(((InterfaceC0857) interfaceC18330).m3147());
        }
        c23932.f77612 = ((InterfaceC14801) c23932.f77612).mo9085(interfaceC18330.getKey());
        return interfaceC14801.mo13851(((InterfaceC0857) interfaceC18330).m3146());
    }
}
