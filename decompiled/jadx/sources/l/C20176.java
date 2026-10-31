package l;

/* JADX INFO: renamed from: l.᩶۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20176 implements InterfaceC7475 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12414 f65304;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f65305 = C10298.f31024;

    public C20176(AbstractC12414 abstractC12414) {
        this.f65304 = abstractC12414;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46408(Object obj) {
        this.f65305 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    @Override // l.InterfaceC7475
    /* JADX INFO: renamed from: ֫ */
    public final Object mo20098(InterfaceC11791 interfaceC11791) {
        C6502 c6502;
        Object obj = this.f65305;
        C15050 c15050 = C10298.f31024;
        if (obj != c15050) {
            return Boolean.valueOf(!(obj instanceof C17998));
        }
        AbstractC12414 abstractC12414 = this.f65304;
        Object objMo30584 = abstractC12414.mo30584();
        this.f65305 = objMo30584;
        if (objMo30584 != c15050) {
            return Boolean.valueOf(!(objMo30584 instanceof C17998));
        }
        InterfaceC11791 interfaceC11791M50339 = C22412.m50339(interfaceC11791);
        if (!(interfaceC11791M50339 instanceof C10819)) {
            c6502 = new C6502(interfaceC11791M50339, 1);
        } else {
            C6502 c6502M27041 = ((C10819) interfaceC11791M50339).m27041();
            if (c6502M27041 == null) {
                c6502 = new C6502(interfaceC11791M50339, 2);
            } else {
                c6502 = c6502M27041.m18008() ? c6502M27041 : null;
                if (c6502 == null) {
                    c6502 = new C6502(interfaceC11791M50339, 2);
                }
            }
        }
        C4653 c4653 = new C4653(this, c6502);
        while (!abstractC12414.mo30581(c4653)) {
            Object objMo30585 = abstractC12414.mo30584();
            this.f65305 = objMo30585;
            if (objMo30585 instanceof C17998) {
                c6502.mo8683(Boolean.FALSE);
            } else if (objMo30585 != c15050) {
                c6502.m18001((InterfaceC16233) null);
            }
            Object objM18002 = c6502.m18002();
            EnumC7041 enumC7041 = EnumC7041.COROUTINE_SUSPENDED;
            return objM18002;
        }
        c6502.m17996((InterfaceC16233) new C3242(abstractC12414, c4653));
        Object objM18003 = c6502.m18002();
        EnumC7041 enumC7042 = EnumC7041.COROUTINE_SUSPENDED;
        return objM18003;
    }

    @Override // l.InterfaceC7475
    public final Object next() {
        Object obj = this.f65305;
        if (obj instanceof C17998) {
            int i = C17998.f56146;
            C17292 c17292 = new C17292("Channel was closed");
            int i2 = C7996.f24682;
            throw c17292;
        }
        C15050 c15050 = C10298.f31024;
        if (obj != c15050) {
            this.f65305 = c15050;
            return obj;
        }
        throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
    }
}
