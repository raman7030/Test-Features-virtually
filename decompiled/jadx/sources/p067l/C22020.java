package p067l;

/* JADX INFO: renamed from: l.᩷ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WG */
/* JADX INFO: loaded from: classes5.dex */
public final class C22020 implements InterfaceC7365 {

    /* JADX INFO: renamed from: ۫ */
    public static final InterfaceC4410 f69305 = C13128.m30022(C22020.class);

    /* JADX INFO: renamed from: ۗ */
    public final C5807 f69306;

    /* JADX INFO: renamed from: ۙ */
    public int f69307;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f69308;

    /* JADX INFO: renamed from: ᩶ */
    public final C9239 f69309;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC15983 f69310;

    /* JADX INFO: renamed from: ᩹ */
    public final C23991 f69311;

    public C22020(C14642 c14642, C5807 c5807) throws Exception {
        C19218 c19218 = c14642.f41801;
        boolean z = c19218.m43766() == 2;
        this.f69308 = z;
        if (c19218.m43768().getHost().isEmpty()) {
            this.f69311 = new C23991(c5807.m13070(), c5807.m13069(), Integer.MIN_VALUE);
            this.f69309 = new C9239(c5807.m13070());
        } else if (z) {
            this.f69311 = new C23991(c5807.m13070(), c19218.m43768().getHost(), -1);
            this.f69309 = new C9239(c5807.m13070());
        } else {
            throw new C5255("The requested list operations is invalid: " + c19218.m43768());
        }
        c5807.m13064();
        this.f69306 = c5807;
        try {
            c5807.m13063(this.f69311, this.f69309, new EnumC2572[0]);
            m49620();
            InterfaceC15983 interfaceC15983M49619 = m49619();
            if (interfaceC15983M49619 == null) {
                c5807.m13077();
                this.f69310 = null;
            }
            this.f69310 = interfaceC15983M49619;
        } catch (Exception e) {
            this.f69306.m13077();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m49620() throws C5255 {
        int iM43253 = this.f69309.m43253();
        if (iM43253 == 2184) {
            throw new C2453();
        }
        if (iM43253 != 0 && iM43253 != 234) {
            throw new C5255(iM43253, true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC15983 m49619() throws C5255 {
        C9239 c9239 = this.f69309;
        if (this.f69307 < (c9239.m43253() == 234 ? c9239.m43258() - 1 : c9239.m43258())) {
            InterfaceC15983[] interfaceC15983ArrM43252 = c9239.m43252();
            int i = this.f69307;
            InterfaceC15983 interfaceC15983 = interfaceC15983ArrM43252[i];
            this.f69307 = i + 1;
            interfaceC15983.getClass();
            return interfaceC15983;
        }
        if (!this.f69308 || c9239.m43253() != 234) {
            return null;
        }
        String strM21279 = c9239.m21279();
        C23991 c23991 = this.f69311;
        c23991.m53162(0, strM21279);
        c9239.reset();
        c23991.m44789((byte) -41);
        this.f69306.m13063(c23991, c9239, new EnumC2572[0]);
        m49620();
        this.f69307 = 0;
        return m49619();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69310 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC15983 interfaceC15983 = this.f69310;
        try {
            InterfaceC15983 interfaceC15983M49619 = m49619();
            if (interfaceC15983M49619 != null) {
                this.f69310 = interfaceC15983M49619;
                return interfaceC15983;
            }
            this.f69306.m13077();
            this.f69310 = null;
            return interfaceC15983;
        } catch (C20777 e) {
            f69305.mo9178("Enumeration failed", (Throwable) e);
            this.f69310 = null;
            return interfaceC15983;
        }
    }

    @Override // p067l.InterfaceC7365, java.lang.AutoCloseable
    public final void close() {
        if (this.f69310 != null) {
            this.f69306.m13077();
            this.f69310 = null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
