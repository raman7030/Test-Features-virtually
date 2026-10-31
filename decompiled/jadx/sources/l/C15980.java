package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܺܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15980 extends AbstractC17392 {
    public final AbstractC12725 j;
    public final IntFunction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f77965l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // l.AbstractC17392
    public final void f() {
        this.i = true;
        if (this.o) {
            d(AbstractC9198.P(this.j.m0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C15980 c15980;
        InterfaceC5214 interfaceC5214L;
        InterfaceC5214 interfaceC5214J;
        long jMin;
        AbstractC13158 abstractC13158 = this.d;
        if (abstractC13158 != null) {
            this.n = ((C15980) abstractC13158).n + ((C15980) this.e).n;
            if (this.i) {
                this.n = 0L;
            } else {
                if (this.n != 0) {
                    if (((C15980) this.d).n == 0) {
                        interfaceC5214L = (InterfaceC5214) ((C15980) this.e).i();
                    } else {
                        interfaceC5214L = AbstractC9198.L(this.j.m0(), (InterfaceC5214) ((C15980) this.d).i(), (InterfaceC5214) ((C15980) this.e).i());
                    }
                }
                interfaceC5214J = interfaceC5214L;
                if (b()) {
                    if (this.m >= 0) {
                        jMin = Math.min(interfaceC5214J.count(), this.f77965l + this.m);
                    } else {
                        jMin = this.n;
                    }
                    interfaceC5214J = interfaceC5214J.j(this.f77965l, jMin, this.k);
                }
                d(interfaceC5214J);
                this.o = true;
            }
            interfaceC5214L = AbstractC9198.P(this.j.m0());
            interfaceC5214J = interfaceC5214L;
            if (b()) {
                if (this.m >= 0) {
                    jMin = Math.min(interfaceC5214J.count(), this.f77965l + this.m);
                } else {
                    jMin = this.n;
                }
                interfaceC5214J = interfaceC5214J.j(this.f77965l, jMin, this.k);
            }
            d(interfaceC5214J);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.f77965l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 >= j) {
                g();
            } else {
                C15980 c15981 = (C15980) ((AbstractC13158) getCompleter());
                Object obj = this;
                while (true) {
                    if (c15981 == null) {
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        if (obj == c15981.e && (c15980 = (C15980) c15981.d) != null) {
                            long j3 = c15980.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        obj = c15981;
                        c15981 = (C15980) ((AbstractC13158) c15981.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C15980(AbstractC12725 abstractC12725, AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction, long j, long j2) {
        super(abstractC9198, interfaceC15234);
        this.j = abstractC12725;
        this.k = intFunction;
        this.f77965l = j;
        this.m = j2;
    }

    public C15980(C15980 c15980, InterfaceC15234 interfaceC15234) {
        super(c15980, interfaceC15234);
        this.j = c15980.j;
        this.k = c15980.k;
        this.f77965l = c15980.f77965l;
        this.m = c15980.m;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C15980(this, interfaceC15234);
    }

    @Override // l.AbstractC17392
    public final Object h() {
        return AbstractC9198.P(this.j.m0());
    }

    @Override // l.AbstractC13158
    public final Object a() {
        if (b()) {
            EnumC7330 enumC7330 = EnumC7330.SIZED;
            AbstractC12725 abstractC12725 = this.j;
            int i = abstractC12725.j;
            int i2 = enumC7330.e;
            InterfaceC8948 interfaceC8948C0 = this.j.c0((i & i2) == i2 ? abstractC12725.R(this.b) : -1L, this.k);
            InterfaceC0585 interfaceC0585Q0 = this.j.q0(((AbstractC12725) this.a).m, interfaceC8948C0);
            AbstractC9198 abstractC9198 = this.a;
            abstractC9198.N(this.b, abstractC9198.g0(interfaceC0585Q0));
            return interfaceC8948C0.build();
        }
        InterfaceC8948 interfaceC8948C1 = this.j.c0(-1L, this.k);
        if (this.f77965l == 0) {
            InterfaceC0585 interfaceC0585Q1 = this.j.q0(((AbstractC12725) this.a).m, interfaceC8948C1);
            AbstractC9198 abstractC9199 = this.a;
            abstractC9199.N(this.b, abstractC9199.g0(interfaceC0585Q1));
        } else {
            this.a.f0(this.b, interfaceC8948C1);
        }
        InterfaceC5214 interfaceC5214Build = interfaceC8948C1.build();
        this.n = interfaceC5214Build.count();
        this.o = true;
        this.b = null;
        return interfaceC5214Build;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        C15980 c15980 = (C15980) this.d;
        C15980 c15981 = (C15980) this.e;
        if (c15980 == null || c15981 == null) {
            return this.n;
        }
        long j2 = c15980.j(j);
        return j2 >= j ? j2 : c15981.j(j) + j2;
    }
}
