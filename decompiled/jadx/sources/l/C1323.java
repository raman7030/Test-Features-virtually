package l;

/* JADX INFO: renamed from: l.֨᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1323 extends AbstractC5144 implements InterfaceC15823 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f4737;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2609 f4738;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C0052 f4739;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23189 f4740;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC13896 f4741;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22484 f4742;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC12117 f4743;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8630 f4744;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f4745;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C7814 f4746;

    public C1323() {
        throw null;
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1367(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return EnumC3329.COMPILATION_UNIT;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C3587 m4616() {
        for (AbstractC5144 abstractC5144 : this.f4738) {
            if (abstractC5144.m14709(EnumC18550.f57554)) {
                return (C3587) abstractC5144;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C7820 m4619() {
        if (this.f4738.isEmpty() || !((AbstractC5144) this.f4738.f8240).m14709(EnumC18550.f57502)) {
            return null;
        }
        return (C7820) this.f4738.f8240;
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m4615() {
        C7820 c7820M4619 = m4619();
        if (c7820M4619 != null) {
            return c7820M4619.f24199;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m4617() {
        C18837 c18837 = new C18837();
        for (AbstractC5144 abstractC5144 : this.f4738) {
            if (abstractC5144.m14709(EnumC18550.f57491)) {
                c18837.m43511((C10643) abstractC5144);
            } else if (!abstractC5144.m14709(EnumC18550.f57502) && !abstractC5144.m14709(EnumC18550.f57540)) {
                break;
            }
        }
        return c18837.m43517();
    }

    @Override // l.InterfaceC15823
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 mo4614() {
        return this.f4745;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C2609 m4618() {
        C2609 c2609 = this.f4738;
        while (!c2609.isEmpty() && (((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57554) || ((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57502) || ((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57491))) {
            c2609 = c2609.f8241;
        }
        return c2609;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11781(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57509;
    }
}
