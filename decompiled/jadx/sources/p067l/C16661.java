package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public class C16661 extends AbstractC4711 {
    public C16661() {
        throw null;
    }

    public C16661(EnumC12758 enumC12758, C17450 c17450, C17450 c17451) {
        super(enumC12758, new C8537(c17450, c17451));
    }

    @Override // p067l.AbstractC4711
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16661)) {
            return false;
        }
        C16661 c16661 = (C16661) obj;
        return this.f10653 == c16661.f10653 && ((C17450) ((C8537) this.f10654).f22916).equals(((C8537) c16661.f10654).f22916) && ((C17450) ((C8537) this.f10654).f22917).equals(((C8537) c16661.f10654).f22917);
    }

    @Override // p067l.AbstractC4711
    /* JADX INFO: renamed from: ֫ */
    public boolean mo9988(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16661)) {
            return false;
        }
        C16661 c16661 = (C16661) obj;
        return this.f10653 == c16661.f10653 && ((C17450) ((C8537) this.f10654).f22916).m39777(((C8537) c16661.f10654).f22916) && ((C17450) ((C8537) this.f10654).f22917).m39777(((C8537) c16661.f10654).f22917);
    }

    @Override // p067l.AbstractC4711
    public final String toString() {
        return this.f10653.toString() + "[" + ((C17450) ((C8537) this.f10654).f22916).toString() + "," + ((C17450) ((C8537) this.f10654).f22917).toString() + "]";
    }

    @Override // p067l.AbstractC4711
    /* JADX INFO: renamed from: ֫ */
    public void mo9987(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo9987(interfaceC2756);
        if (this.f10653 == EnumC12758.f35900) {
            ((C8121) interfaceC2756).m18811(((C17450) ((C8537) this.f10654).f22916).f23817);
        } else {
            ((C8121) interfaceC2756).m18818(((C17450) ((C8537) this.f10654).f22916).f23817);
        }
        ((C8121) interfaceC2756).m18818(((C17450) ((C8537) this.f10654).f22917).f23817);
    }
}
