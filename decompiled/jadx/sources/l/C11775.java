package l;

/* JADX INFO: renamed from: l.ۨܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C11775 extends AbstractC13374 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35139;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f35140;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        throw new AssertionError();
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2744(C10077 c10077, Object obj) {
        AbstractC4308 abstractC4308 = c10077.f14167;
        AbstractC4308 abstractC4309 = (AbstractC4308) obj;
        boolean zM12913 = abstractC4309.m12913(EnumC9454.FORALL);
        C6319 c6319 = this.f35140;
        boolean z = false;
        if (!zM12913) {
            if (!this.f35139) {
                z = abstractC4309.m12913(EnumC9454.METHOD) && c6319.m17529(((C10658) abstractC4308).f32059, abstractC4309.mo12933());
            }
            return Boolean.valueOf(z);
        }
        C10077 c10078 = (C10077) abstractC4309;
        return Boolean.valueOf(c6319.m17507(c10077, c10078) && ((Boolean) abstractC4308.mo2962(this, c6319.m17488(c10078.f14167, c10078.f30362, c10077.f30362))).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7394(C10658 c10658, Object obj) {
        boolean z;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (abstractC4308.m12913(EnumC9454.METHOD)) {
            if (this.f35140.m17529(c10658.f32059, abstractC4308.mo12933())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return Boolean.FALSE;
    }

    public C11775(C6319 c6319, boolean z) {
        this.f35140 = c6319;
        this.f35139 = z;
    }
}
