package l;

/* JADX INFO: renamed from: l.ۘܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 165B */
/* JADX INFO: loaded from: classes3.dex */
public final class C4076 extends C18893 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC6898 f12991;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14658 f12992;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC6898 f12993;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC21010 f12994;

    @Override // l.C18893, l.InterfaceC22420
    public final int getType() {
        return 0;
    }

    @Override // l.C18893, l.AbstractC2665, l.InterfaceC22420
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo8355() {
        return false;
    }

    @Override // l.C18893, l.InterfaceC22420
    public final String getText() {
        InterfaceC21010 interfaceC21010 = this.f12994;
        InterfaceC6898 interfaceC6898 = this.f12993;
        InterfaceC6898 interfaceC6899 = this.f12991;
        if (interfaceC6899 != null) {
            int iMo10336 = interfaceC6899.mo10336();
            int iMo10337 = interfaceC6898.mo10336();
            if (interfaceC6898.getType() == -1) {
                iMo10337 = interfaceC21010.size();
            }
            return interfaceC21010.mo32225(iMo10336, iMo10337);
        }
        if (!(interfaceC6899 instanceof InterfaceC22420)) {
            return "<unknown>";
        }
        ((InterfaceC4781) interfaceC21010).getClass();
        return "n/a";
    }

    @Override // l.C18893
    public final String toString() {
        C14658 c14658 = this.f12992;
        if (c14658 instanceof C11132) {
            return C3200.m9831(((C11132) c14658).f23571, ">", new StringBuilder("<missing type: "));
        }
        if (c14658 instanceof C9721) {
            return "<extraneous: " + ((C9721) c14658).f44795 + ", resync=" + getText() + ">";
        }
        if (c14658 instanceof C7624) {
            return "<mismatched token: " + c14658.f44795 + ", resync=" + getText() + ">";
        }
        if (!(c14658 instanceof C16775)) {
            return "<error: " + getText() + ">";
        }
        return "<unexpected: " + c14658.f44795 + ", resync=" + getText() + ">";
    }
}
