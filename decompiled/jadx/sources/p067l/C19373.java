package p067l;

/* JADX INFO: renamed from: l.ᩳۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BIJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19373 implements InterfaceC18702 {

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ InterfaceC10354 f57830;

    public C19373(InterfaceC10354 interfaceC10354) {
        this.f57830 = interfaceC10354;
    }

    @Override // p067l.InterfaceC18702
    /* JADX INFO: renamed from: ֫ */
    public final void mo42670(C14146 c14146, CharSequence charSequence, C20438 c20438) throws Exception {
        C5962 c5962;
        InterfaceC10354 interfaceC10354 = this.f57830;
        try {
            interfaceC10354.mo13645(charSequence, new C5660(c14146.m32425(), c14146.m32593()), c20438);
        } catch (Exception e) {
            if (interfaceC10354 == C23765.f75572 && (e instanceof C20233)) {
                C20233 c20233 = (C20233) e;
                String message = c20233.getMessage();
                if (c20233.f62552 == EnumC2797.SYNTAX) {
                    message = "line " + c20233.f62554 + ":" + (c20233.f62553 + 1) + ": " + message;
                }
                throw new C20807(message);
            }
            if (interfaceC10354 == C23765.f75576 && (e instanceof C2701)) {
                C2701 c2701 = (C2701) e;
                c5962 = new C5962(null, c2701.f4537, c2701.f4536, c2701.getMessage());
                c5962.initCause((Throwable) c2701);
            } else if (interfaceC10354 == C23765.f75581 && (e instanceof C12800)) {
                C12800 c12800 = (C12800) e;
                c5962 = new C5962(null, c12800.m29350(), c12800.m29349(), c12800.getMessage());
                c5962.initCause((Throwable) c12800);
            }
        }
    }
}
