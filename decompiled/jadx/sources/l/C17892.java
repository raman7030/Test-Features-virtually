package l;

/* JADX INFO: renamed from: l.ᩳۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BIJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17892 implements InterfaceC17186 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8402 f54633;

    public C17892(InterfaceC8402 interfaceC8402) {
        this.f54633 = interfaceC8402;
    }

    @Override // l.InterfaceC17186
    /* JADX INFO: renamed from: ֫ */
    public final void mo40425(C12392 c12392, CharSequence charSequence, C19012 c19012) throws Exception {
        C3781 c3781;
        InterfaceC8402 interfaceC8402 = this.f54633;
        try {
            interfaceC8402.mo11709(charSequence, new C3463(c12392.m30361(), c12392.m30529()), c19012);
        } catch (Exception e) {
            if (interfaceC8402 == C22513.f72846 && (e instanceof C18797)) {
                C18797 c18797 = (C18797) e;
                String message = c18797.getMessage();
                if (c18797.f59329 == EnumC0451.SYNTAX) {
                    message = "line " + c18797.f59331 + ":" + (c18797.f59330 + 1) + ": " + message;
                }
                throw new C19401(message);
            }
            if (interfaceC8402 == C22513.f72850 && (e instanceof C0350)) {
                C0350 c0350 = (C0350) e;
                c3781 = new C3781(null, c0350.f1761, c0350.f1760, c0350.getMessage());
                c3781.initCause((Throwable) c0350);
            } else if (interfaceC8402 == C22513.f72855 && (e instanceof C10976)) {
                C10976 c10976 = (C10976) e;
                c3781 = new C3781(null, c10976.m27288(), c10976.m27287(), c10976.getMessage());
                c3781.initCause((Throwable) c10976);
            }
        }
    }
}
