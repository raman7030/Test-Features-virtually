package l;

/* JADX INFO: renamed from: l.۫ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12361 extends AbstractC22944 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f37052 = C11321.m27961(C12361.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9540 f37053;

    public C12361(C9540 c9540) {
        this.f37053 = c9540;
    }

    @Override // l.AbstractC22944
    /* JADX INFO: renamed from: ֫ */
    public final void mo16824(C18026 c18026) {
        C18712 c18712M24411 = this.f37053.m24411(Long.valueOf(((C23670) c18026.m21061()).m52201()));
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - c18712M24411.m43337().getTime());
        InterfaceC2148 interfaceC2148 = f37052;
        interfaceC2148.mo7090("Send/Recv of packet {} took << {} ms >>", c18026, lValueOf);
        if (c18026.m42074()) {
            interfaceC2148.mo7082("Received ASYNC packet {} with AsyncId << {} >>", c18026, Long.valueOf(((C23670) c18026.m21061()).m52210()));
            c18712M24411.m43335(((C23670) c18026.m21061()).m52210());
        } else {
            this.f14665.m13513(c18026);
        }
    }
}
