package p067l;

/* JADX INFO: renamed from: l.ۘܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 165B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6242 extends C20324 {

    /* JADX INFO: renamed from: ۜ */
    public InterfaceC8924 f15806;

    /* JADX INFO: renamed from: ۢ */
    public C16299 f15807;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC8924 f15808;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC22336 f15809;

    @Override // p067l.C20324, p067l.InterfaceC23676
    public final int getType() {
        return 0;
    }

    @Override // p067l.C20324, p067l.AbstractC4901, p067l.InterfaceC23676
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo10401() {
        return false;
    }

    @Override // p067l.C20324, p067l.InterfaceC23676
    public final String getText() {
        InterfaceC22336 interfaceC22336 = this.f15809;
        InterfaceC8924 interfaceC8924 = this.f15808;
        InterfaceC8924 interfaceC8925 = this.f15806;
        if (interfaceC8925 != null) {
            int iMo12375 = interfaceC8925.mo12375();
            int iMo12376 = interfaceC8924.mo12375();
            if (interfaceC8924.getType() == -1) {
                iMo12376 = interfaceC22336.size();
            }
            return interfaceC22336.mo34324(iMo12375, iMo12376);
        }
        if (!(interfaceC8925 instanceof InterfaceC23676)) {
            return "<unknown>";
        }
        ((InterfaceC6912) interfaceC22336).getClass();
        return "n/a";
    }

    @Override // p067l.C20324
    public final String toString() {
        C16299 c16299 = this.f15807;
        if (c16299 instanceof C12948) {
            return C5410.m11876(((C12948) c16299).f26484, ">", new StringBuilder("<missing type: "));
        }
        if (c16299 instanceof C11607) {
            return "<extraneous: " + ((C11607) c16299).f47905 + ", resync=" + getText() + ">";
        }
        if (c16299 instanceof C9614) {
            return "<mismatched token: " + c16299.f47905 + ", resync=" + getText() + ">";
        }
        if (!(c16299 instanceof C18311)) {
            return "<error: " + getText() + ">";
        }
        return "<unexpected: " + c16299.f47905 + ", resync=" + getText() + ">";
    }
}
