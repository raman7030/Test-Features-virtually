package p067l;

/* JADX INFO: renamed from: l.ۜᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8949 extends AbstractC21730 {
    @Override // p067l.AbstractC21730
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20677(Object obj) {
        return ((InterfaceC11180) obj) instanceof C22361;
    }

    @Override // p067l.AbstractC21730
    /* JADX INFO: renamed from: ۧ */
    public final Object mo20678(Object obj) {
        InterfaceC11180 interfaceC11180 = (InterfaceC11180) obj;
        if (interfaceC11180 instanceof C22361) {
            return (C22361) interfaceC11180;
        }
        return new C22361(interfaceC11180.getName(), interfaceC11180.getValue());
    }
}
