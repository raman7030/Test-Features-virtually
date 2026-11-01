package p067l;

/* JADX INFO: renamed from: l.ۜᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8957 implements InterfaceC9116 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3080 f24274;

    /* JADX INFO: renamed from: ᩹ */
    public C22999 f24275;

    public AbstractC8957(AbstractC12310 abstractC12310) {
        this.f24274 = abstractC12310;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11799 mo10437() {
        return this.f24274.mo5198();
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC6434 mo10442() {
        return this.f24274.mo5203();
    }

    @Override // p067l.InterfaceC9116
    public InterfaceC3080 getType() {
        return this.f24274;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۘۧ */
    public final String mo20692() {
        return this.f24275.m51374();
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۟ */
    public final C22999 mo20693() {
        return this.f24275;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧۧ */
    public final String mo20694() {
        return getType().getTypeName() + this.f24275.m51374();
    }

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m20695() {
        return new C25050(this);
    }

    @Override // p067l.InterfaceC9116
    public final String getPath() {
        return getType().getPath() + this.f24275.m51374();
    }

    public final String toString() {
        return getPath();
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC9116 interfaceC9116 = (InterfaceC9116) interfaceC10457;
        if (!C12826.equals(this.f24275, interfaceC9116.mo20693())) {
            throw new RuntimeException(getPath() + " " + interfaceC9116.getPath());
        }
        try {
            C11996 c11996 = new C11996();
            this.f24275.m51371(c11996);
            C5290 c5290 = new C5290(c11996.m27458());
            if (!C22999.m51349(c5290.m11445(0), this.f24275.m51370()).equals(this.f24275)) {
                try {
                    C11996 c11997 = new C11996();
                    this.f24275.m51371(c11997);
                    throw new RuntimeException(this.f24275.m51374() + " " + C22999.m51349(new C5290(c11997.m27458()).m11445(0), this.f24275.m51370()).m51374());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (mo4716() != interfaceC9116.mo4716()) {
                throw new RuntimeException(getPath());
            }
            if (mo4720() != interfaceC9116.mo4720()) {
                throw new RuntimeException(getPath());
            }
            for (int i = 0; i <= mo4715(); i++) {
                if (mo4718(i)) {
                    if (!interfaceC9116.mo4718(i)) {
                        throw new RuntimeException(getPath());
                    }
                    mo4717(i).mo14241(interfaceC9116.mo4717(i));
                } else if (interfaceC9116.mo4718(i)) {
                    throw new RuntimeException(getPath());
                }
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ᩳ */
    public Iterable mo20696() {
        return m20695();
    }
}
