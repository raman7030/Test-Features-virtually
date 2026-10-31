package l;

/* JADX INFO: renamed from: l.ܰۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9CP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13771 extends AbstractC22944 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f41072 = C11321.m27961(C13771.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9540 f41073;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7277 f41074;

    public C13771(C7277 c7277, C9540 c9540) {
        this.f41074 = c7277;
        this.f41073 = c9540;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    @Override // l.AbstractC22944
    /* JADX INFO: renamed from: ֫ */
    public final void mo16824(C18026 c18026) throws C2380 {
        Long lValueOf = Long.valueOf(((C23670) c18026.m21061()).m52201());
        C9540 c9540 = this.f41073;
        C18712 c18712M24411 = c9540.m24411(lValueOf);
        try {
            C7277 c7277 = this.f41074;
            AbstractC0803 abstractC0803M43340 = c18712M24411.m43340();
            c7277.getClass();
            C16614 c16614M19531 = C7277.m19531(abstractC0803M43340, c18026);
            C18712 c18712M24414 = c9540.m24414(Long.valueOf(((C23670) c16614M19531.mo3028()).m52201()));
            boolean zM39141 = c16614M19531.m39141();
            EnumC22799 enumC22799M52217 = ((C23670) c16614M19531.mo3028()).m52217();
            long jM52202 = ((C23670) c16614M19531.mo3028()).m52202();
            if (enumC22799M52217 == EnumC22799.SMB2_READ) {
                if (jM52202 == EnumC7462.STATUS_SUCCESS.getValue() || jM52202 == EnumC7462.STATUS_END_OF_FILE.getValue()) {
                    zM39141 = true;
                } else {
                    zM39141 = false;
                }
            } else if (enumC22799M52217 == EnumC22799.SMB2_WRITE) {
                if (jM52202 == EnumC7462.STATUS_SUCCESS.getValue()) {
                    zM39141 = true;
                } else {
                    zM39141 = false;
                }
            }
            if (zM39141) {
                boolean z = c16614M19531 instanceof C19064;
            }
            c18712M24414.m43339().m40458(c16614M19531);
        } catch (C13146 e) {
            f41072.mo7079(c18026, "Failed to deserialize SMB2 Packet Data of {}");
            throw new C2380("Unable to deserialize SMB2 Packet Data.", e);
        }
    }
}
