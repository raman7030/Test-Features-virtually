package p067l;

/* JADX INFO: renamed from: l.ܰ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E8KH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15770 implements InterfaceC23996 {

    /* JADX INFO: renamed from: ۗ */
    public final C10820 f45658;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC4114 f45659;

    /* JADX INFO: renamed from: ۬ */
    public boolean f45660;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC23996 f45661;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f45662 = true;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC24488 f45663;

    public C15770(InterfaceC24488 interfaceC24488, InterfaceC17980 interfaceC17980) {
        this.f45663 = interfaceC24488;
        this.f45658 = new C10820(interfaceC17980);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35840() {
        this.f45660 = true;
        this.f45658.m24937();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35843() {
        this.f45660 = false;
        this.f45658.m24939();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35841(long j) {
        this.f45658.m24938(j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35844(InterfaceC4114 interfaceC4114) throws C19735 {
        InterfaceC23996 interfaceC23996;
        InterfaceC23996 interfaceC23996Mo8292 = interfaceC4114.mo8292();
        if (interfaceC23996Mo8292 == null || interfaceC23996Mo8292 == (interfaceC23996 = this.f45661)) {
            return;
        }
        if (interfaceC23996 != null) {
            throw C19735.m44863(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f45661 = interfaceC23996Mo8292;
        this.f45659 = interfaceC4114;
        interfaceC23996Mo8292.mo15343(this.f45658.mo15356());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35842(InterfaceC4114 interfaceC4114) {
        if (interfaceC4114 == this.f45659) {
            this.f45661 = null;
            this.f45659 = null;
            this.f45662 = true;
        }
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15359() {
        if (this.f45662) {
            return this.f45658.mo15359();
        }
        InterfaceC23996 interfaceC23996 = this.f45661;
        interfaceC23996.getClass();
        return interfaceC23996.mo15359();
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo15351() {
        if (this.f45662) {
            this.f45658.getClass();
            return false;
        }
        InterfaceC23996 interfaceC23996 = this.f45661;
        interfaceC23996.getClass();
        return interfaceC23996.mo15351();
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ֫ */
    public final void mo15343(C4963 c4963) {
        InterfaceC23996 interfaceC23996 = this.f45661;
        if (interfaceC23996 != null) {
            interfaceC23996.mo15343(c4963);
            c4963 = this.f45661.mo15356();
        }
        this.f45658.mo15343(c4963);
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ܽ */
    public final C4963 mo15356() {
        InterfaceC23996 interfaceC23996 = this.f45661;
        if (interfaceC23996 != null) {
            return interfaceC23996.mo15356();
        }
        return this.f45658.mo15356();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX INFO: renamed from: ֫ */
    public final long m35839(boolean z) {
        C4963 c4963Mo15356;
        InterfaceC4114 interfaceC4114 = this.f45659;
        C10820 c10820 = this.f45658;
        if (interfaceC4114 == null || interfaceC4114.mo8296() || ((z && this.f45659.getState() != 2) || (!this.f45659.mo8299() && (z || this.f45659.mo8302())))) {
            this.f45662 = true;
            if (this.f45660) {
                c10820.m24937();
            }
        } else {
            InterfaceC23996 interfaceC23996 = this.f45661;
            interfaceC23996.getClass();
            long jMo15359 = interfaceC23996.mo15359();
            if (!this.f45662) {
                c10820.m24938(jMo15359);
                c4963Mo15356 = interfaceC23996.mo15356();
                if (!c4963Mo15356.equals(c10820.mo15356())) {
                    c10820.mo15343(c4963Mo15356);
                    ((C21315) this.f45663).m48315(c4963Mo15356);
                }
            } else if (jMo15359 < c10820.mo15359()) {
                c10820.m24939();
            } else {
                this.f45662 = false;
                if (this.f45660) {
                    c10820.m24937();
                }
                c10820.m24938(jMo15359);
                c4963Mo15356 = interfaceC23996.mo15356();
                if (!c4963Mo15356.equals(c10820.mo15356())) {
                    c10820.mo15343(c4963Mo15356);
                    ((C21315) this.f45663).m48315(c4963Mo15356);
                }
            }
        }
        return mo15359();
    }
}
