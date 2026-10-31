package l;

/* JADX INFO: renamed from: l.֫᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB07 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2102 implements InterfaceC19763 {
    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo6973(Object obj, Object obj2) {
        InterfaceC14801 interfaceC14801 = (InterfaceC14801) obj;
        InterfaceC18330 interfaceC18330 = (InterfaceC18330) obj2;
        C11233.m27805(interfaceC14801, "acc");
        C11233.m27805(interfaceC18330, "element");
        InterfaceC14801 interfaceC14801Mo9085 = interfaceC14801.mo9085(interfaceC18330.getKey());
        C23974 c23974 = C23974.f77731;
        if (interfaceC14801Mo9085 == c23974) {
            return interfaceC18330;
        }
        C13906 c13906 = InterfaceC7557.f23344;
        C13906 c13907 = C13906.f41439;
        InterfaceC7557 interfaceC7557 = (InterfaceC7557) interfaceC14801Mo9085.mo9082(c13907);
        if (interfaceC7557 == null) {
            return new C6146(interfaceC18330, interfaceC14801Mo9085);
        }
        InterfaceC14801 interfaceC14801Mo9086 = interfaceC14801Mo9085.mo9085(c13907);
        return interfaceC14801Mo9086 == c23974 ? new C6146(interfaceC7557, interfaceC18330) : new C6146(interfaceC7557, new C6146(interfaceC18330, interfaceC14801Mo9086));
    }
}
