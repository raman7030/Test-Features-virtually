package l;

/* JADX INFO: renamed from: l.ۜᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6924 extends AbstractC20372 {
    @Override // l.AbstractC20372
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18728(Object obj) {
        return ((InterfaceC9272) obj) instanceof C21036;
    }

    @Override // l.AbstractC20372
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo18729(Object obj) {
        InterfaceC9272 interfaceC9272 = (InterfaceC9272) obj;
        if (interfaceC9272 instanceof C21036) {
            return (C21036) interfaceC9272;
        }
        return new C21036(interfaceC9272.getName(), interfaceC9272.getValue());
    }
}
