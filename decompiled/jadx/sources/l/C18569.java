package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18569 extends AbstractC2465 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC16575 f57621;

    public C18569(EnumC16575 enumC16575, C15869 c15869) {
        super(EnumC10932.f32922, c15869);
        this.f57621 = enumC16575;
    }

    @Override // l.AbstractC2465
    /* JADX INFO: renamed from: ֫ */
    public final void mo7939(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo7939(interfaceC0408);
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882(this.f57621.m39082().intValue());
        ((C15869) this.f7866).mo2828((InterfaceC0408) c6053);
    }

    @Override // l.AbstractC2465
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18569) && super.equals(obj) && this.f57621 == ((C18569) obj).f57621;
    }

    @Override // l.AbstractC2465
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7940(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18569) && super.mo7940(obj) && this.f57621 == ((C18569) obj).f57621;
    }

    @Override // l.AbstractC2465
    public final int hashCode() {
        return this.f57621.hashCode() + (super.hashCode() * 31);
    }
}
