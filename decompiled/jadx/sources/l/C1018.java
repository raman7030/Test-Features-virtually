package l;

/* JADX INFO: renamed from: l.֨ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B9F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1018 extends AbstractC15834 {
    public C1018(C3135 c3135, C10191 c10191, C21480 c21480, C20069 c20069) {
        super(c3135, c10191, c21480, c20069);
        int iM9558 = c3135.m9558();
        if (iM9558 == 5 || iM9558 == 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c3135.m9558());
        }
        if (c21480 != null && c3135.m9558() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    public C1018(C3135 c3135, C10191 c10191, C21480 c21480, C21480 c21481) {
        this(c3135, c10191, c21480, C20069.m46252(c21481));
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 mo3533() {
        return C13922.f41594;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8212(this);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo3529(C7573 c7573) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo3532() {
        C20069 c20069M37479 = m37479();
        int size = c20069M37479.size();
        if (size != 0) {
            InterfaceC1538 interfaceC1538M48637 = c20069M37479.m41004get(size - 1).m48637();
            if (!interfaceC1538M48637.mo5253()) {
                InterfaceC1538 interfaceC1538M48638 = c20069M37479.m41004get(0).m48637();
                if (size == 2 && interfaceC1538M48638.mo5253()) {
                    AbstractC13717 abstractC13717 = (AbstractC13717) interfaceC1538M48638;
                    C20069 c20069M46257 = c20069M37479.m46257();
                    return new C5252(C12307.m29854(m37484().m9562(), m37483(), c20069M46257, abstractC13717), m37480(), m37483(), c20069M46257, abstractC13717);
                }
            } else {
                AbstractC13717 abstractC13717M8291 = (AbstractC13717) interfaceC1538M48637;
                C20069 c20069M46258 = c20069M37479.m46258();
                try {
                    int iM9562 = m37484().m9562();
                    if (iM9562 == 15 && (abstractC13717M8291 instanceof C2635)) {
                        abstractC13717M8291 = C2635.m8291(-((C2635) abstractC13717M8291).mo2231());
                        iM9562 = 14;
                    }
                    AbstractC13717 abstractC13718 = abstractC13717M8291;
                    return new C5252(C12307.m29854(iM9562, m37483(), c20069M46258, abstractC13718), m37480(), m37483(), c20069M46258, abstractC13718);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return this;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C1018(m37484(), m37480(), c21480, c20069);
    }
}
