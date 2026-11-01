package p067l;

/* JADX INFO: renamed from: l.᩶۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21544 implements InterfaceC9473 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14167 f67952;

    /* JADX INFO: renamed from: ۧ */
    public Object f67953 = C12156.f33987;

    public C21544(AbstractC14167 abstractC14167) {
        this.f67952 = abstractC14167;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48727(Object obj) {
        this.f67953 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    @Override // p067l.InterfaceC9473
    /* JADX INFO: renamed from: ֫ */
    public final Object mo22073(InterfaceC13575 interfaceC13575) {
        C8548 c8548;
        Object obj = this.f67953;
        C16672 c16672 = C12156.f33987;
        if (obj != c16672) {
            return Boolean.valueOf(!(obj instanceof C19474));
        }
        AbstractC14167 abstractC14167 = this.f67952;
        Object objMo32648 = abstractC14167.mo32648();
        this.f67953 = objMo32648;
        if (objMo32648 != c16672) {
            return Boolean.valueOf(!(objMo32648 instanceof C19474));
        }
        InterfaceC13575 interfaceC13575M52679 = C23669.m52679(interfaceC13575);
        if (!(interfaceC13575M52679 instanceof C12651)) {
            c8548 = new C8548(interfaceC13575M52679, 1);
        } else {
            C8548 c8548M29086 = ((C12651) interfaceC13575M52679).m29086();
            if (c8548M29086 == null) {
                c8548 = new C8548(interfaceC13575M52679, 2);
            } else {
                c8548 = c8548M29086.m19957() ? c8548M29086 : null;
                if (c8548 == null) {
                    c8548 = new C8548(interfaceC13575M52679, 2);
                }
            }
        }
        C6791 c6791 = new C6791(this, c8548);
        while (!abstractC14167.mo32645(c6791)) {
            Object objMo32649 = abstractC14167.mo32648();
            this.f67953 = objMo32649;
            if (objMo32649 instanceof C19474) {
                c8548.mo10744(Boolean.FALSE);
            } else if (objMo32649 != c16672) {
                c8548.m19950((InterfaceC17797) null);
            }
            Object objM19951 = c8548.m19951();
            EnumC9061 enumC9061 = EnumC9061.COROUTINE_SUSPENDED;
            return objM19951;
        }
        c8548.m19945((InterfaceC17797) new C5450(abstractC14167, c6791));
        Object objM19952 = c8548.m19951();
        EnumC9061 enumC9062 = EnumC9061.COROUTINE_SUSPENDED;
        return objM19952;
    }

    @Override // p067l.InterfaceC9473
    public final Object next() {
        Object obj = this.f67953;
        if (obj instanceof C19474) {
            int i = C19474.f59343;
            C18803 c18803 = new C18803("Channel was closed");
            int i2 = C9968.f27596;
            throw c18803;
        }
        C16672 c16672 = C12156.f33987;
        if (obj != c16672) {
            this.f67953 = c16672;
            return obj;
        }
        throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
    }
}
