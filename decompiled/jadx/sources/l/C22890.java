package l;

/* JADX INFO: renamed from: l.᩺ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBBP */
/* JADX INFO: loaded from: classes.dex */
public final class C22890 extends AbstractC15834 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f73810;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50977(InterfaceC10711 interfaceC10711) {
        StringBuilder sbM32307 = C13325.m32307(100, "catch");
        int size = interfaceC10711.size();
        for (int i = 0; i < size; i++) {
            sbM32307.append(" ");
            sbM32307.append(interfaceC10711.getType(i).mo2463());
        }
        return sbM32307.toString();
    }

    public C22890(C3135 c3135, C10191 c10191, C20069 c20069, InterfaceC10711 interfaceC10711) {
        super(c3135, c10191, null, c20069);
        if (c3135.m9558() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c3135.m9558());
        }
        if (interfaceC10711 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f73810 = interfaceC10711;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ᩳ */
    public final String mo11590() {
        return m50977(this.f73810);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10711 mo3533() {
        return this.f73810;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8220(this);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3529(C7573 c7573) {
        return new C22890(m37484(), m37480(), m37479(), this.f73810.mo26890(c7573));
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C22890(m37484(), m37480(), c20069, this.f73810);
    }
}
