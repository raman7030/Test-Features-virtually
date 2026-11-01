package p067l;

/* JADX INFO: renamed from: l.֨ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 73Q2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3277 extends AbstractC17358 {

    /* JADX INFO: renamed from: ᩹ */
    public final C22978 f6376;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return 8;
    }

    public C3277(C22978 c22978) {
        this.f6376 = c22978;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_METHOD_HANDLE_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        c3948.m7852().m23291(this.f6376);
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        int iM5702 = m5702(c3948);
        C22978 c22978 = this.f6376;
        int iM51314 = c22978.m51314();
        if (c19705.m44765()) {
            c19705.m44760(0, m39359() + ' ' + c22978.toString());
            c19705.m44760(2, "type:     " + C16351.m37153(iM51314) + (" // " + C22978.m51311(iM51314)));
            c19705.m44760(2, "reserved: ".concat(C16351.m37153(0)));
            String str = " // " + c22978.m51315().toString();
            if (c22978.m51316()) {
                c19705.m44760(2, "fieldId:  " + C16351.m37153(iM5702) + str);
            } else {
                c19705.m44760(2, "methodId: " + C16351.m37153(iM5702) + str);
            }
            c19705.m44760(2, "reserved: ".concat(C16351.m37153(0)));
        }
        c19705.m44770(iM51314);
        c19705.m44770(0);
        c19705.m44770(m5702(c3948));
        c19705.m44770(0);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m5702(C3948 c3948) {
        C22978 c22978 = this.f6376;
        AbstractC15405 abstractC15405M51315 = c22978.m51315();
        if (c22978.m51316()) {
            return c3948.m7856().m20054((C10908) abstractC15405M51315);
        }
        if (c22978.m51313()) {
            if (abstractC15405M51315 instanceof C6214) {
                abstractC15405M51315 = ((C6214) abstractC15405M51315).m14065();
            }
            return c3948.m7857().m50874((AbstractC18283) abstractC15405M51315);
        }
        throw new IllegalStateException("Unhandled invocation type");
    }
}
