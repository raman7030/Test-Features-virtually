package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܺܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17556 extends AbstractC18898 {

    /* JADX INFO: renamed from: j */
    public final AbstractC14463 f52479j;

    /* JADX INFO: renamed from: k */
    public final IntFunction f52480k;

    /* JADX INFO: renamed from: l */
    public final long f52481l;

    /* JADX INFO: renamed from: m */
    public final long f52482m;

    /* JADX INFO: renamed from: n */
    public long f52483n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f52484o;

    @Override // p067l.AbstractC18898
    /* JADX INFO: renamed from: f */
    public final void mo39846f() {
        this.f56421i = true;
        if (this.f52484o) {
            mo33981d(AbstractC11111.m25599P(this.f52479j.mo17912m0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C17556 c17556;
        InterfaceC7324 interfaceC7324M25597L;
        InterfaceC7324 interfaceC7324Mo3497j;
        long jMin;
        AbstractC14874 abstractC14874 = this.f42404d;
        if (abstractC14874 != null) {
            this.f52483n = ((C17556) abstractC14874).f52483n + ((C17556) this.f42405e).f52483n;
            if (this.f56421i) {
                this.f52483n = 0L;
            } else {
                if (this.f52483n != 0) {
                    if (((C17556) this.f42404d).f52483n == 0) {
                        interfaceC7324M25597L = (InterfaceC7324) ((C17556) this.f42405e).m43001i();
                    } else {
                        interfaceC7324M25597L = AbstractC11111.m25597L(this.f52479j.mo17912m0(), (InterfaceC7324) ((C17556) this.f42404d).m43001i(), (InterfaceC7324) ((C17556) this.f42405e).m43001i());
                    }
                }
                interfaceC7324Mo3497j = interfaceC7324M25597L;
                if (m33980b()) {
                    if (this.f52482m >= 0) {
                        jMin = Math.min(interfaceC7324Mo3497j.count(), this.f52481l + this.f52482m);
                    } else {
                        jMin = this.f52483n;
                    }
                    interfaceC7324Mo3497j = interfaceC7324Mo3497j.mo3497j(this.f52481l, jMin, this.f52480k);
                }
                mo33981d(interfaceC7324Mo3497j);
                this.f52484o = true;
            }
            interfaceC7324M25597L = AbstractC11111.m25599P(this.f52479j.mo17912m0());
            interfaceC7324Mo3497j = interfaceC7324M25597L;
            if (m33980b()) {
                if (this.f52482m >= 0) {
                    jMin = Math.min(interfaceC7324Mo3497j.count(), this.f52481l + this.f52482m);
                } else {
                    jMin = this.f52483n;
                }
                interfaceC7324Mo3497j = interfaceC7324Mo3497j.mo3497j(this.f52481l, jMin, this.f52480k);
            }
            mo33981d(interfaceC7324Mo3497j);
            this.f52484o = true;
        }
        if (this.f52482m >= 0 && !m33980b()) {
            long j = this.f52481l + this.f52482m;
            long jM39965j = this.f52484o ? this.f52483n : m39965j(j);
            if (jM39965j >= j) {
                m43000g();
            } else {
                C17556 c17557 = (C17556) ((AbstractC14874) getCompleter());
                Object obj = this;
                while (true) {
                    if (c17557 == null) {
                        if (jM39965j >= j) {
                            break;
                        }
                    } else {
                        if (obj == c17557.f42405e && (c17556 = (C17556) c17557.f42404d) != null) {
                            long jM39965j2 = c17556.m39965j(j) + jM39965j;
                            if (jM39965j2 >= j) {
                                break;
                            } else {
                                jM39965j = jM39965j2;
                            }
                        }
                        obj = c17557;
                        c17557 = (C17556) ((AbstractC14874) c17557.getCompleter());
                    }
                }
                m43000g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C17556(AbstractC14463 abstractC14463, AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction, long j, long j2) {
        super(abstractC11111, interfaceC16847);
        this.f52479j = abstractC14463;
        this.f52480k = intFunction;
        this.f52481l = j;
        this.f52482m = j2;
    }

    public C17556(C17556 c17556, InterfaceC16847 interfaceC16847) {
        super(c17556, interfaceC16847);
        this.f52479j = c17556.f52479j;
        this.f52480k = c17556.f52480k;
        this.f52481l = c17556.f52481l;
        this.f52482m = c17556.f52482m;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: c */
    public final AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847) {
        return new C17556(this, interfaceC16847);
    }

    @Override // p067l.AbstractC18898
    /* JADX INFO: renamed from: h */
    public final Object mo8627h() {
        return AbstractC11111.m25599P(this.f52479j.mo17912m0());
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: a */
    public final Object mo8155a() {
        if (m33980b()) {
            EnumC9335 enumC9335 = EnumC9335.SIZED;
            AbstractC14463 abstractC14463 = this.f52479j;
            int i = abstractC14463.f41313j;
            int i2 = enumC9335.f25432e;
            InterfaceC10873 interfaceC10873Mo17909c0 = this.f52479j.mo17909c0((i & i2) == i2 ? abstractC14463.mo25628R(this.f42402b) : -1L, this.f52480k);
            InterfaceC2925 interfaceC2925Mo4008q0 = this.f52479j.mo4008q0(((AbstractC14463) this.f42401a).f41316m, interfaceC10873Mo17909c0);
            AbstractC11111 abstractC11111 = this.f42401a;
            abstractC11111.mo25626N(this.f42402b, abstractC11111.mo25630g0(interfaceC2925Mo4008q0));
            return interfaceC10873Mo17909c0.build();
        }
        InterfaceC10873 interfaceC10873Mo17909c1 = this.f52479j.mo17909c0(-1L, this.f52480k);
        if (this.f52481l == 0) {
            InterfaceC2925 interfaceC2925Mo4008q1 = this.f52479j.mo4008q0(((AbstractC14463) this.f42401a).f41316m, interfaceC10873Mo17909c1);
            AbstractC11111 abstractC11112 = this.f42401a;
            abstractC11112.mo25626N(this.f42402b, abstractC11112.mo25630g0(interfaceC2925Mo4008q1));
        } else {
            this.f42401a.mo25629f0(this.f42402b, interfaceC10873Mo17909c1);
        }
        InterfaceC7324 interfaceC7324Build = interfaceC10873Mo17909c1.build();
        this.f52483n = interfaceC7324Build.count();
        this.f52484o = true;
        this.f42402b = null;
        return interfaceC7324Build;
    }

    /* JADX INFO: renamed from: j */
    public final long m39965j(long j) {
        if (this.f52484o) {
            return this.f52483n;
        }
        C17556 c17556 = (C17556) this.f42404d;
        C17556 c17557 = (C17556) this.f42405e;
        if (c17556 == null || c17557 == null) {
            return this.f52483n;
        }
        long jM39965j = c17556.m39965j(j);
        return jM39965j >= j ? jM39965j : c17557.m39965j(j) + jM39965j;
    }
}
