package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public class C15039 extends AbstractC2465 {
    public C15039() {
        throw null;
    }

    public C15039(EnumC10932 enumC10932, C15869 c15869, C15869 c158610) {
        super(enumC10932, new C6491(c15869, c158610));
    }

    @Override // l.AbstractC2465
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15039)) {
            return false;
        }
        C15039 c15039 = (C15039) obj;
        return this.f7865 == c15039.f7865 && ((C15869) ((C6491) this.f7866).f20042).equals(((C6491) c15039.f7866).f20042) && ((C15869) ((C6491) this.f7866).f20043).equals(((C6491) c15039.f7866).f20043);
    }

    @Override // l.AbstractC2465
    /* JADX INFO: renamed from: ֫ */
    public boolean mo7940(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15039)) {
            return false;
        }
        C15039 c15039 = (C15039) obj;
        return this.f7865 == c15039.f7865 && ((C15869) ((C6491) this.f7866).f20042).m37605(((C6491) c15039.f7866).f20042) && ((C15869) ((C6491) this.f7866).f20043).m37605(((C6491) c15039.f7866).f20043);
    }

    @Override // l.AbstractC2465
    public final String toString() {
        return this.f7865.toString() + "[" + ((C15869) ((C6491) this.f7866).f20042).toString() + "," + ((C15869) ((C6491) this.f7866).f20043).toString() + "]";
    }

    @Override // l.AbstractC2465
    /* JADX INFO: renamed from: ֫ */
    public void mo7939(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo7939(interfaceC0408);
        if (this.f7865 == EnumC10932.f32922) {
            ((C6053) interfaceC0408).m16882(((C15869) ((C6491) this.f7866).f20042).f20943);
        } else {
            ((C6053) interfaceC0408).m16889(((C15869) ((C6491) this.f7866).f20042).f20943);
        }
        ((C6053) interfaceC0408).m16889(((C15869) ((C6491) this.f7866).f20043).f20943);
    }
}
