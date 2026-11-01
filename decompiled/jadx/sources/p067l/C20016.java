package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20016 extends AbstractC4711 {

    /* JADX INFO: renamed from: ܽ */
    public final EnumC18121 f60844;

    public C20016(EnumC18121 enumC18121, C17450 c17450) {
        super(EnumC12758.f35900, c17450);
        this.f60844 = enumC18121;
    }

    @Override // p067l.AbstractC4711
    /* JADX INFO: renamed from: ֫ */
    public final void mo9987(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo9987(interfaceC2756);
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811(this.f60844.m41308().intValue());
        ((C17450) this.f10654).mo5157((InterfaceC2756) c8121);
    }

    @Override // p067l.AbstractC4711
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20016) && super.equals(obj) && this.f60844 == ((C20016) obj).f60844;
    }

    @Override // p067l.AbstractC4711
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9988(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20016) && super.mo9988(obj) && this.f60844 == ((C20016) obj).f60844;
    }

    @Override // p067l.AbstractC4711
    public final int hashCode() {
        return this.f60844.hashCode() + (super.hashCode() * 31);
    }
}
