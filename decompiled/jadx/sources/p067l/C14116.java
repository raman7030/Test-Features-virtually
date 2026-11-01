package p067l;

/* JADX INFO: renamed from: l.۫ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14116 extends AbstractC24174 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC4410 f40068 = C13128.m30022(C14116.class);

    /* JADX INFO: renamed from: ۧ */
    public C11435 f40069;

    public C14116(C11435 c11435) {
        this.f40069 = c11435;
    }

    @Override // p067l.AbstractC24174
    /* JADX INFO: renamed from: ֫ */
    public final void mo18751(C19500 c19500) {
        C20152 c20152M26422 = this.f40069.m26422(Long.valueOf(((C24864) c19500.m23026()).m54604()));
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - c20152M26422.m45604().getTime());
        InterfaceC4410 interfaceC4410 = f40068;
        interfaceC4410.mo9185("Send/Recv of packet {} took << {} ms >>", c19500, lValueOf);
        if (c19500.m44325()) {
            interfaceC4410.mo9177("Received ASYNC packet {} with AsyncId << {} >>", c19500, Long.valueOf(((C24864) c19500.m23026()).m54613()));
            c20152M26422.m45602(((C24864) c19500.m23026()).m54613());
        } else {
            this.f17493.m15402(c19500);
        }
    }
}
