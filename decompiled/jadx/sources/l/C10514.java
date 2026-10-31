package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3922 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10514 implements InterfaceC20392 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22508 f31525;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f31526 = new HashMap();

    @Override // l.InterfaceC20392
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20392 mo26417(Class cls, InterfaceC4869 interfaceC4869) {
        this.f31526.put(cls, interfaceC4869);
        return this;
    }

    @Override // l.InterfaceC20392
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20392 mo26418(InterfaceC22508 interfaceC22508) {
        this.f31525 = interfaceC22508;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3458 m26416(C18981 c18981, InterfaceC14040 interfaceC14040) {
        InterfaceC22508 c6986 = this.f31525;
        if (c6986 == null) {
            c6986 = new C6986();
        }
        return new C6280(c18981, interfaceC14040, new C17820(), C20195.unmodifiableMap(this.f31526), c6986);
    }
}
