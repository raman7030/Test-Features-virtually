package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBB2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20775 extends AbstractC15834 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 f67282;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f67283;

    public C20775(C3135 c3135, C10191 c10191, C20069 c20069, ArrayList arrayList, AbstractC13717 abstractC13717) {
        super(c3135, c10191, null, c20069);
        if (c3135.m9558() != 1) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c3135.m9558());
        }
        this.f67283 = arrayList;
        this.f67282 = abstractC13717;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10711 mo3533() {
        return C13922.f41594;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList m47475() {
        return this.f67283;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m47474() {
        return this.f67282;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8219(this);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3529(C7573 c7573) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C20775(m37484(), m37480(), c20069, this.f67283, this.f67282);
    }
}
