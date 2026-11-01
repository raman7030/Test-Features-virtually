package p067l;

/* JADX INFO: renamed from: l.֫ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9JT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4214 extends AbstractC6740 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC4410 f9270 = C13128.m30022(C4214.class);

    /* JADX INFO: renamed from: ۧ */
    public C17468 f9271;

    /* JADX INFO: renamed from: ܽ */
    public C23504 f9272;

    public C4214(C23504 c23504, C17468 c17468) {
        this.f9272 = c23504;
        this.f9271 = c17468;
    }

    @Override // p067l.AbstractC6740
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8559(AbstractC9837 abstractC9837) {
        return abstractC9837 instanceof C20171;
    }

    @Override // p067l.AbstractC6740
    /* JADX INFO: renamed from: ۧ */
    public final void mo8560(AbstractC9837 abstractC9837) {
        C17468 c17468 = this.f9271;
        C20171 c20171 = (C20171) abstractC9837;
        f9270.mo9195(c20171, "Decrypting packet {}");
        try {
            m8558(c20171);
        } finally {
            c17468.getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8558(C20171 c20171) throws C4630 {
        C17468 c17468 = this.f9271;
        if (!c17468.m39835(c20171)) {
            this.f17493.m15402(new C2578(c20171.m23026()));
            return;
        }
        C16953 c16953M52276 = this.f9272.m52276(Long.valueOf(((C10783) c20171.m23026()).m24850()));
        if (c16953M52276 == null) {
            this.f17493.m15402(new C2578(c20171.m23026()));
            return;
        }
        byte[] bArrM39837 = c17468.m39837(c20171, c16953M52276.m38540().m51324());
        boolean zM24843 = C10783.m24843(bArrM39837);
        InterfaceC4410 interfaceC4410 = f9270;
        if (zM24843) {
            interfaceC4410.mo9174(c20171, "Encountered a nested encrypted packet in packet {}, disconnecting the transport");
            throw new C4630("Cannot nest an encrypted packet in encrypted packet " + c20171);
        }
        if (!C7273.m16653(bArrM39837)) {
            if (C24864.m54597(bArrM39837)) {
                try {
                    C22696 c22696 = new C22696(bArrM39837);
                    interfaceC4410.mo9177("Decrypted packet {} is packet {}.", c20171, c22696);
                    if (((C24864) c22696.m23026()).m54606() != ((C10783) c20171.m23026()).m24850()) {
                        interfaceC4410.mo9197("Mismatched sessionId between encrypted packet {} and decrypted contents {}", c20171, c22696);
                        this.f17493.m15402(new C2578(c22696.m23026()));
                        return;
                    } else {
                        this.f17493.m15402(c22696);
                        return;
                    }
                } catch (C14862 e) {
                    throw new C12776("Could not load SMB2 Packet", e);
                }
            }
            interfaceC4410.mo9174(c20171, "Could not determine the encrypted packet contents of packet {}");
            throw new C4630("Could not determine the encrypted packet data, disconnecting");
        }
        interfaceC4410.mo9195(c20171, "Packet {} is compressed.");
        try {
            this.f17493.m15402(new C17487(bArrM39837));
        } catch (C14862 e2) {
            throw new C12776("Could not load compression header", e2);
        }
    }
}
