package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֫ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1791 extends AbstractC13158 {
    public final AbstractC12725 h;
    public final IntFunction i;
    public final boolean j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f77959l;

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC5214 interfaceC5214L;
        AbstractC13158 abstractC13158 = this.d;
        if (abstractC13158 != null) {
            if (this.j) {
                C1791 c1791 = (C1791) abstractC13158;
                long j = c1791.f77959l;
                this.f77959l = j;
                if (j == c1791.k) {
                    this.f77959l = j + ((C1791) this.e).f77959l;
                }
            }
            C1791 c1792 = (C1791) abstractC13158;
            long j2 = c1792.k;
            C1791 c1793 = (C1791) this.e;
            this.k = j2 + c1793.k;
            if (c1792.k == 0) {
                interfaceC5214L = (InterfaceC5214) c1793.f;
            } else {
                interfaceC5214L = c1793.k == 0 ? (InterfaceC5214) c1792.f : AbstractC9198.L(this.h.m0(), (InterfaceC5214) ((C1791) this.d).f, (InterfaceC5214) ((C1791) this.e).f);
            }
            InterfaceC5214 interfaceC5214J = interfaceC5214L;
            if (b() && this.j) {
                interfaceC5214J = interfaceC5214J.j(this.f77959l, interfaceC5214J.count(), this.i);
            }
            this.f = interfaceC5214J;
        }
        super.onCompletion(countedCompleter);
    }

    public C1791(AbstractC12725 abstractC12725, AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        super(abstractC9198, interfaceC15234);
        this.h = abstractC12725;
        this.i = intFunction;
        this.j = EnumC7330.ORDERED.s(((AbstractC12725) abstractC9198).m);
    }

    public C1791(C1791 c1791, InterfaceC15234 interfaceC15234) {
        super(c1791, interfaceC15234);
        this.h = c1791.h;
        this.i = c1791.i;
        this.j = c1791.j;
    }

    @Override // l.AbstractC13158
    public final AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C1791(this, interfaceC15234);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // l.AbstractC13158
    public final Object a() {
        long jR;
        boolean zB = b();
        if (zB || !this.j) {
            jR = -1;
        } else {
            EnumC7330 enumC7330 = EnumC7330.SIZED;
            AbstractC12725 abstractC12725 = this.h;
            int i = abstractC12725.j;
            int i2 = enumC7330.e;
            if ((i & i2) == i2) {
                jR = abstractC12725.R(this.b);
            } else {
                jR = -1;
            }
        }
        InterfaceC8948 interfaceC8948C0 = this.a.c0(jR, this.i);
        InterfaceC19868 interfaceC19868D = ((InterfaceC2228) this.h).d(interfaceC8948C0, this.j && !zB);
        this.a.f0(this.b, interfaceC19868D);
        InterfaceC5214 interfaceC5214Build = interfaceC8948C0.build();
        this.k = interfaceC5214Build.count();
        this.f77959l = interfaceC19868D.h();
        return interfaceC5214Build;
    }
}
