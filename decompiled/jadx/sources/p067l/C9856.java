package p067l;

/* JADX INFO: renamed from: l.۠ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9856 extends AbstractC3150 {

    /* JADX INFO: renamed from: ۗ */
    public C16262 f27335;

    /* JADX INFO: renamed from: ۙ */
    public final String f27336;

    /* JADX INFO: renamed from: ᩶ */
    public final C7174 f27337;

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f27335;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f27335.getName();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f27336;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23127(C9856 c9856) throws C8515 {
        C7174 c7174 = c9856.f27337;
        C24608 c24608 = c7174.f18731;
        C16262 c16262 = c9856.f27335;
        String strM37058 = c16262.m37058();
        EnumC15890 enumC15890 = EnumC15890.TYPES_ONLY;
        if (!(c24608.m54245(strM37058, c9856, enumC15890) instanceof C19244)) {
            throw new C8515(c9856, "\"" + c16262.m37058() + "\" is not a message type.", 0);
        }
        if (c7174.f18731.m54245(c16262.m37053(), c9856, enumC15890) instanceof C19244) {
            return;
        }
        throw new C8515(c9856, "\"" + c16262.m37053() + "\" is not a message type.", 0);
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this.f27337;
    }

    public C9856(C16262 c16262, C7174 c7174, C22598 c22598) {
        super(0);
        this.f5767 = c22598;
        this.f27335 = c16262;
        this.f27337 = c7174;
        this.f27336 = c22598.mo3542() + '.' + c16262.getName();
        c7174.f18731.m54247(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23126(C9856 c9856) {
        c9856.m5384(c9856.f27335.m37054().m25140());
    }
}
