package p067l;

/* JADX INFO: renamed from: l.ܶۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16594 extends AbstractC18408 implements InterfaceC21152 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C25114 f48738;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16594(C25114 c25114) {
        super(2);
        this.f48738 = c25114;
    }

    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        InterfaceC16436 interfaceC16436 = (InterfaceC16436) obj;
        InterfaceC19790 interfaceC19790 = (InterfaceC19790) obj2;
        if (!(interfaceC19790 instanceof InterfaceC3183)) {
            return interfaceC16436.mo15731(interfaceC19790);
        }
        C25114 c25114 = this.f48738;
        if (((InterfaceC16436) c25114.f80364).mo11134(interfaceC19790.getKey()) == null) {
            return interfaceC16436.mo15731(((InterfaceC3183) interfaceC19790).m5461());
        }
        c25114.f80364 = ((InterfaceC16436) c25114.f80364).mo11137(interfaceC19790.getKey());
        return interfaceC16436.mo15731(((InterfaceC3183) interfaceC19790).m5460());
    }
}
