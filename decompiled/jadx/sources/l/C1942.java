package l;

/* JADX INFO: renamed from: l.֫ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9JT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1942 extends AbstractC4600 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f6491 = C11321.m27961(C1942.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15888 f6492;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22239 f6493;

    public C1942(C22239 c22239, C15888 c15888) {
        this.f6493 = c22239;
        this.f6492 = c15888;
    }

    @Override // l.AbstractC4600
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo6402(AbstractC7859 abstractC7859) {
        return abstractC7859 instanceof C18732;
    }

    @Override // l.AbstractC4600
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6403(AbstractC7859 abstractC7859) {
        C15888 c15888 = this.f6492;
        C18732 c18732 = (C18732) abstractC7859;
        f6491.mo7100(c18732, "Decrypting packet {}");
        try {
            m6401(c18732);
        } finally {
            c15888.getClass();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6401(C18732 c18732) throws C2380 {
        C15888 c15888 = this.f6492;
        if (!c15888.m37663(c18732)) {
            this.f14665.m13513(new C0221(c18732.m21061()));
            return;
        }
        C15346 c15346M49948 = this.f6493.m49948(Long.valueOf(((C8854) c18732.m21061()).m22879()));
        if (c15346M49948 == null) {
            this.f14665.m13513(new C0221(c18732.m21061()));
            return;
        }
        byte[] bArrM37665 = c15888.m37665(c18732, c15346M49948.m36382().m48975());
        boolean zM22872 = C8854.m22872(bArrM37665);
        InterfaceC2148 interfaceC2148 = f6491;
        if (zM22872) {
            interfaceC2148.mo7079(c18732, "Encountered a nested encrypted packet in packet {}, disconnecting the transport");
            throw new C2380("Cannot nest an encrypted packet in encrypted packet " + c18732);
        }
        if (!C5161.m14745(bArrM37665)) {
            if (C23670.m52194(bArrM37665)) {
                try {
                    C21389 c21389 = new C21389(bArrM37665);
                    interfaceC2148.mo7082("Decrypted packet {} is packet {}.", c18732, c21389);
                    if (((C23670) c21389.m21061()).m52203() != ((C8854) c18732.m21061()).m22879()) {
                        interfaceC2148.mo7102("Mismatched sessionId between encrypted packet {} and decrypted contents {}", c18732, c21389);
                        this.f14665.m13513(new C0221(c21389.m21061()));
                        return;
                    } else {
                        this.f14665.m13513(c21389);
                        return;
                    }
                } catch (C13146 e) {
                    throw new C10951("Could not load SMB2 Packet", e);
                }
            }
            interfaceC2148.mo7079(c18732, "Could not determine the encrypted packet contents of packet {}");
            throw new C2380("Could not determine the encrypted packet data, disconnecting");
        }
        interfaceC2148.mo7100(c18732, "Packet {} is compressed.");
        try {
            this.f14665.m13513(new C15908(bArrM37665));
        } catch (C13146 e2) {
            throw new C10951("Could not load compression header", e2);
        }
    }
}
