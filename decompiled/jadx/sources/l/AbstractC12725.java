package l;

import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12725 extends AbstractC9198 implements InterfaceC12393 {
    public final AbstractC12725 h;
    public final AbstractC12725 i;
    public final int j;
    public final AbstractC12725 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77962l;
    public int m;
    public InterfaceC15234 n;
    public boolean o;
    public final boolean p;
    public Runnable q;
    public boolean r;

    public abstract InterfaceC5214 k0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction);

    public abstract boolean l0(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585);

    public abstract EnumC8578 m0();

    public abstract boolean p0();

    public abstract InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585);

    public abstract InterfaceC15234 t0(AbstractC12725 abstractC12725, Supplier supplier, boolean z);

    public AbstractC12725(AbstractC12725 abstractC12725, int i) {
        if (abstractC12725.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC12725.o = true;
        abstractC12725.k = this;
        this.i = abstractC12725;
        this.j = EnumC7330.h & i;
        this.m = EnumC7330.l(i, abstractC12725.m);
        AbstractC12725 abstractC12726 = abstractC12725.h;
        this.h = abstractC12726;
        if (p0()) {
            abstractC12726.p = true;
        }
        this.f77962l = abstractC12725.f77962l + 1;
    }

    public AbstractC12725(InterfaceC15234 interfaceC15234, int i, boolean z) {
        this.i = null;
        this.n = interfaceC15234;
        this.h = this;
        int i2 = EnumC7330.g & i;
        this.j = i2;
        this.m = (~(i2 << 1)) & EnumC7330.f77960l;
        this.f77962l = 0;
        this.r = z;
    }

    public final Object i0(InterfaceC21048 interfaceC21048) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r) {
            return interfaceC21048.e(this, r0(interfaceC21048.j()));
        }
        return interfaceC21048.b(this, r0(interfaceC21048.j()));
    }

    public final InterfaceC5214 j0(IntFunction intFunction) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r && this.i != null && p0()) {
            this.f77962l = 0;
            AbstractC12725 abstractC12725 = this.i;
            return n0(abstractC12725, abstractC12725.r0(0), intFunction);
        }
        return Q(r0(0), true, intFunction);
    }

    public final InterfaceC15234 s0() {
        AbstractC12725 abstractC12725 = this.h;
        if (this != abstractC12725) {
            throw new IllegalStateException();
        }
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        InterfaceC15234 interfaceC15234 = abstractC12725.n;
        if (interfaceC15234 != null) {
            abstractC12725.n = null;
            return interfaceC15234;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final InterfaceC12393 sequential() {
        this.h.r = false;
        return this;
    }

    public final InterfaceC12393 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.InterfaceC12393, java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        AbstractC12725 abstractC12725 = this.h;
        Runnable runnable = abstractC12725.q;
        if (runnable != null) {
            abstractC12725.q = null;
            runnable.run();
        }
    }

    @Override // l.InterfaceC12393
    public final InterfaceC12393 onClose(Runnable runnable) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        C11003.requireNonNull(runnable);
        AbstractC12725 abstractC12725 = this.h;
        Runnable runnable2 = abstractC12725.q;
        if (runnable2 != null) {
            runnable = new RunnableC21547(runnable2, runnable);
        }
        abstractC12725.q = runnable;
        return this;
    }

    public InterfaceC15234 spliterator() {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        AbstractC12725 abstractC12725 = this.h;
        if (this == abstractC12725) {
            InterfaceC15234 interfaceC15234 = abstractC12725.n;
            if (interfaceC15234 != null) {
                abstractC12725.n = null;
                return interfaceC15234;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return t0(this, new C0730(0, this), abstractC12725.r);
    }

    @Override // l.AbstractC9198
    public final InterfaceC5214 Q(InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction) {
        if (this.h.r) {
            return k0(this, interfaceC15234, z, intFunction);
        }
        InterfaceC8948 interfaceC8948C0 = c0(R(interfaceC15234), intFunction);
        f0(interfaceC15234, interfaceC8948C0);
        return interfaceC8948C0.build();
    }

    @Override // l.InterfaceC12393
    public final boolean isParallel() {
        return this.h.r;
    }

    public final InterfaceC15234 r0(int i) {
        int i2;
        int i3;
        AbstractC12725 abstractC12725 = this.h;
        InterfaceC15234 interfaceC15234O0 = abstractC12725.n;
        if (interfaceC15234O0 != null) {
            abstractC12725.n = null;
            if (abstractC12725.r && abstractC12725.p) {
                AbstractC12725 abstractC12726 = abstractC12725.k;
                int i4 = 1;
                while (abstractC12725 != this) {
                    int i5 = abstractC12726.j;
                    if (abstractC12726.p0()) {
                        if (EnumC7330.SHORT_CIRCUIT.s(i5)) {
                            i5 &= ~EnumC7330.u;
                        }
                        interfaceC15234O0 = abstractC12726.o0(abstractC12725, interfaceC15234O0);
                        if (interfaceC15234O0.hasCharacteristics(64)) {
                            i2 = (~EnumC7330.t) & i5;
                            i3 = EnumC7330.s;
                        } else {
                            i2 = (~EnumC7330.s) & i5;
                            i3 = EnumC7330.t;
                        }
                        i5 = i3 | i2;
                        i4 = 0;
                    }
                    abstractC12726.f77962l = i4;
                    abstractC12726.m = EnumC7330.l(i5, abstractC12725.m);
                    i4++;
                    AbstractC12725 abstractC12727 = abstractC12726;
                    abstractC12726 = abstractC12726.k;
                    abstractC12725 = abstractC12727;
                }
            }
            if (i != 0) {
                this.m = EnumC7330.l(i, this.m);
            }
            return interfaceC15234O0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // l.AbstractC9198
    public final long R(InterfaceC15234 interfaceC15234) {
        if (EnumC7330.SIZED.s(this.m)) {
            return interfaceC15234.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // l.AbstractC9198
    public final InterfaceC0585 f0(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        M(interfaceC15234, g0((InterfaceC0585) C11003.requireNonNull(interfaceC0585)));
        return interfaceC0585;
    }

    @Override // l.AbstractC9198
    public final void M(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        C11003.requireNonNull(interfaceC0585);
        if (!EnumC7330.SHORT_CIRCUIT.s(this.m)) {
            interfaceC0585.c(interfaceC15234.getExactSizeIfKnown());
            interfaceC15234.forEachRemaining(interfaceC0585);
            interfaceC0585.end();
            return;
        }
        N(interfaceC15234, interfaceC0585);
    }

    @Override // l.AbstractC9198
    public final boolean N(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        AbstractC12725 abstractC12725 = this;
        while (abstractC12725.f77962l > 0) {
            abstractC12725 = abstractC12725.i;
        }
        interfaceC0585.c(interfaceC15234.getExactSizeIfKnown());
        boolean zL0 = abstractC12725.l0(interfaceC15234, interfaceC0585);
        interfaceC0585.end();
        return zL0;
    }

    @Override // l.AbstractC9198
    public final InterfaceC0585 g0(InterfaceC0585 interfaceC0585) {
        C11003.requireNonNull(interfaceC0585);
        for (AbstractC12725 abstractC12725 = this; abstractC12725.f77962l > 0; abstractC12725 = abstractC12725.i) {
            interfaceC0585 = abstractC12725.q0(abstractC12725.i.m, interfaceC0585);
        }
        return interfaceC0585;
    }

    @Override // l.AbstractC9198
    public final InterfaceC15234 h0(InterfaceC15234 interfaceC15234) {
        return this.f77962l == 0 ? interfaceC15234 : t0(this, new C0730(1, interfaceC15234), this.h.r);
    }

    public InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public InterfaceC15234 o0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        return n0(abstractC12725, interfaceC15234, new C8556(13)).spliterator();
    }
}
