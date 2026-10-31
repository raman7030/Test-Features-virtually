package l;

/* JADX INFO: renamed from: l.᩺ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S912 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22800 extends AbstractC7483 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo5985(C18981 c18981, InterfaceC14040 interfaceC14040, InterfaceC15243 interfaceC15243);

    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final void mo20106(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC15243 interfaceC15243) {
        if (interfaceC15243.mo36204()) {
            AbstractC7483.m20105(interfaceC3458, abstractC2143, interfaceC15243.mo36203());
        }
        Object objMo5985 = mo5985(interfaceC3458.mo10587(), interfaceC3458.mo10583(), interfaceC15243);
        if (objMo5985 != null) {
            C17820.m41747(interfaceC3458.builder(), objMo5985, interfaceC15243.start(), interfaceC15243.end());
        }
    }
}
