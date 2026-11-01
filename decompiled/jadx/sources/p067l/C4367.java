package p067l;

/* JADX INFO: renamed from: l.֫᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4367 implements InterfaceC21152 {
    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        InterfaceC16436 interfaceC16436 = (InterfaceC16436) obj;
        InterfaceC19790 interfaceC19790 = (InterfaceC19790) obj2;
        C13045.m29867(interfaceC16436, "acc");
        C13045.m29867(interfaceC19790, "element");
        InterfaceC16436 interfaceC16436Mo11137 = interfaceC16436.mo11137(interfaceC19790.getKey());
        C25154 c25154 = C25154.f80484;
        if (interfaceC16436Mo11137 == c25154) {
            return interfaceC19790;
        }
        C15585 c15585 = InterfaceC9551.f26257;
        C15585 c15586 = C15585.f44521;
        InterfaceC9551 interfaceC9551 = (InterfaceC9551) interfaceC16436Mo11137.mo11134(c15586);
        if (interfaceC9551 == null) {
            return new C8210(interfaceC19790, interfaceC16436Mo11137);
        }
        InterfaceC16436 interfaceC16436Mo11138 = interfaceC16436Mo11137.mo11137(c15586);
        return interfaceC16436Mo11138 == c25154 ? new C8210(interfaceC9551, interfaceC19790) : new C8210(interfaceC9551, new C8210(interfaceC19790, interfaceC16436Mo11138));
    }
}
