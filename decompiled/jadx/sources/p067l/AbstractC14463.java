package p067l;

import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14463 extends AbstractC11111 implements InterfaceC14147 {

    /* JADX INFO: renamed from: h */
    public final AbstractC14463 f41311h;

    /* JADX INFO: renamed from: i */
    public final AbstractC14463 f41312i;

    /* JADX INFO: renamed from: j */
    public final int f41313j;

    /* JADX INFO: renamed from: k */
    public final AbstractC14463 f41314k;

    /* JADX INFO: renamed from: l */
    public int f41315l;

    /* JADX INFO: renamed from: m */
    public int f41316m;

    /* JADX INFO: renamed from: n */
    public InterfaceC16847 f41317n;

    /* JADX INFO: renamed from: o */
    public boolean f41318o;

    /* JADX INFO: renamed from: p */
    public final boolean f41319p;

    /* JADX INFO: renamed from: q */
    public Runnable f41320q;

    /* JADX INFO: renamed from: r */
    public boolean f41321r;

    /* JADX INFO: renamed from: k0 */
    public abstract InterfaceC7324 mo17910k0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction);

    /* JADX INFO: renamed from: l0 */
    public abstract boolean mo17911l0(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925);

    /* JADX INFO: renamed from: m0 */
    public abstract EnumC10521 mo17912m0();

    /* JADX INFO: renamed from: p0 */
    public abstract boolean mo4007p0();

    /* JADX INFO: renamed from: q0 */
    public abstract InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925);

    /* JADX INFO: renamed from: t0 */
    public abstract InterfaceC16847 mo17913t0(AbstractC14463 abstractC14463, Supplier supplier, boolean z);

    public AbstractC14463(AbstractC14463 abstractC14463, int i) {
        if (abstractC14463.f41318o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC14463.f41318o = true;
        abstractC14463.f41314k = this;
        this.f41312i = abstractC14463;
        this.f41313j = EnumC9335.f25413h & i;
        this.f41316m = EnumC9335.m21657l(i, abstractC14463.f41316m);
        AbstractC14463 abstractC14464 = abstractC14463.f41311h;
        this.f41311h = abstractC14464;
        if (mo4007p0()) {
            abstractC14464.f41319p = true;
        }
        this.f41315l = abstractC14463.f41315l + 1;
    }

    public AbstractC14463(InterfaceC16847 interfaceC16847, int i, boolean z) {
        this.f41312i = null;
        this.f41317n = interfaceC16847;
        this.f41311h = this;
        int i2 = EnumC9335.f25412g & i;
        this.f41313j = i2;
        this.f41316m = (~(i2 << 1)) & EnumC9335.f25417l;
        this.f41315l = 0;
        this.f41321r = z;
    }

    /* JADX INFO: renamed from: i0 */
    public final Object m33094i0(InterfaceC22373 interfaceC22373) {
        if (this.f41318o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f41318o = true;
        if (this.f41311h.f41321r) {
            return interfaceC22373.mo10393e(this, m33096r0(interfaceC22373.mo23312j()));
        }
        return interfaceC22373.mo10392b(this, m33096r0(interfaceC22373.mo23312j()));
    }

    /* JADX INFO: renamed from: j0 */
    public final InterfaceC7324 m33095j0(IntFunction intFunction) {
        if (this.f41318o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f41318o = true;
        if (this.f41311h.f41321r && this.f41312i != null && mo4007p0()) {
            this.f41315l = 0;
            AbstractC14463 abstractC14463 = this.f41312i;
            return mo12124n0(abstractC14463, abstractC14463.m33096r0(0), intFunction);
        }
        return mo25627Q(m33096r0(0), true, intFunction);
    }

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC16847 m33097s0() {
        AbstractC14463 abstractC14463 = this.f41311h;
        if (this != abstractC14463) {
            throw new IllegalStateException();
        }
        if (this.f41318o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f41318o = true;
        InterfaceC16847 interfaceC16847 = abstractC14463.f41317n;
        if (interfaceC16847 != null) {
            abstractC14463.f41317n = null;
            return interfaceC16847;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final InterfaceC14147 sequential() {
        this.f41311h.f41321r = false;
        return this;
    }

    public final InterfaceC14147 parallel() {
        this.f41311h.f41321r = true;
        return this;
    }

    @Override // p067l.InterfaceC14147, java.lang.AutoCloseable
    public final void close() {
        this.f41318o = true;
        this.f41317n = null;
        AbstractC14463 abstractC14463 = this.f41311h;
        Runnable runnable = abstractC14463.f41320q;
        if (runnable != null) {
            abstractC14463.f41320q = null;
            runnable.run();
        }
    }

    @Override // p067l.InterfaceC14147
    public final InterfaceC14147 onClose(Runnable runnable) {
        if (this.f41318o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        C12826.requireNonNull(runnable);
        AbstractC14463 abstractC14463 = this.f41311h;
        Runnable runnable2 = abstractC14463.f41320q;
        if (runnable2 != null) {
            runnable = new RunnableC22847(runnable2, runnable);
        }
        abstractC14463.f41320q = runnable;
        return this;
    }

    public InterfaceC16847 spliterator() {
        if (this.f41318o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f41318o = true;
        AbstractC14463 abstractC14463 = this.f41311h;
        if (this == abstractC14463) {
            InterfaceC16847 interfaceC16847 = abstractC14463.f41317n;
            if (interfaceC16847 != null) {
                abstractC14463.f41317n = null;
                return interfaceC16847;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return mo17913t0(this, new C3063(0, this), abstractC14463.f41321r);
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: Q */
    public final InterfaceC7324 mo25627Q(InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction) {
        if (this.f41311h.f41321r) {
            return mo17910k0(this, interfaceC16847, z, intFunction);
        }
        InterfaceC10873 interfaceC10873Mo17909c0 = mo17909c0(mo25628R(interfaceC16847), intFunction);
        mo25629f0(interfaceC16847, interfaceC10873Mo17909c0);
        return interfaceC10873Mo17909c0.build();
    }

    @Override // p067l.InterfaceC14147
    public final boolean isParallel() {
        return this.f41311h.f41321r;
    }

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC16847 m33096r0(int i) {
        int i2;
        int i3;
        AbstractC14463 abstractC14463 = this.f41311h;
        InterfaceC16847 interfaceC16847Mo12125o0 = abstractC14463.f41317n;
        if (interfaceC16847Mo12125o0 != null) {
            abstractC14463.f41317n = null;
            if (abstractC14463.f41321r && abstractC14463.f41319p) {
                AbstractC14463 abstractC14464 = abstractC14463.f41314k;
                int i4 = 1;
                while (abstractC14463 != this) {
                    int i5 = abstractC14464.f41313j;
                    if (abstractC14464.mo4007p0()) {
                        if (EnumC9335.SHORT_CIRCUIT.m21660s(i5)) {
                            i5 &= ~EnumC9335.f25426u;
                        }
                        interfaceC16847Mo12125o0 = abstractC14464.mo12125o0(abstractC14463, interfaceC16847Mo12125o0);
                        if (interfaceC16847Mo12125o0.hasCharacteristics(64)) {
                            i2 = (~EnumC9335.f25425t) & i5;
                            i3 = EnumC9335.f25424s;
                        } else {
                            i2 = (~EnumC9335.f25424s) & i5;
                            i3 = EnumC9335.f25425t;
                        }
                        i5 = i3 | i2;
                        i4 = 0;
                    }
                    abstractC14464.f41315l = i4;
                    abstractC14464.f41316m = EnumC9335.m21657l(i5, abstractC14463.f41316m);
                    i4++;
                    AbstractC14463 abstractC14465 = abstractC14464;
                    abstractC14464 = abstractC14464.f41314k;
                    abstractC14463 = abstractC14465;
                }
            }
            if (i != 0) {
                this.f41316m = EnumC9335.m21657l(i, this.f41316m);
            }
            return interfaceC16847Mo12125o0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: R */
    public final long mo25628R(InterfaceC16847 interfaceC16847) {
        if (EnumC9335.SIZED.m21660s(this.f41316m)) {
            return interfaceC16847.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: f0 */
    public final InterfaceC2925 mo25629f0(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        mo25625M(interfaceC16847, mo25630g0((InterfaceC2925) C12826.requireNonNull(interfaceC2925)));
        return interfaceC2925;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: M */
    public final void mo25625M(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        C12826.requireNonNull(interfaceC2925);
        if (!EnumC9335.SHORT_CIRCUIT.m21660s(this.f41316m)) {
            interfaceC2925.mo4231c(interfaceC16847.getExactSizeIfKnown());
            interfaceC16847.forEachRemaining(interfaceC2925);
            interfaceC2925.end();
            return;
        }
        mo25626N(interfaceC16847, interfaceC2925);
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: N */
    public final boolean mo25626N(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        AbstractC14463 abstractC14463 = this;
        while (abstractC14463.f41315l > 0) {
            abstractC14463 = abstractC14463.f41312i;
        }
        interfaceC2925.mo4231c(interfaceC16847.getExactSizeIfKnown());
        boolean zMo17911l0 = abstractC14463.mo17911l0(interfaceC16847, interfaceC2925);
        interfaceC2925.end();
        return zMo17911l0;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC2925 mo25630g0(InterfaceC2925 interfaceC2925) {
        C12826.requireNonNull(interfaceC2925);
        for (AbstractC14463 abstractC14463 = this; abstractC14463.f41315l > 0; abstractC14463 = abstractC14463.f41312i) {
            interfaceC2925 = abstractC14463.mo4008q0(abstractC14463.f41312i.f41316m, interfaceC2925);
        }
        return interfaceC2925;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC16847 mo25631h0(InterfaceC16847 interfaceC16847) {
        return this.f41315l == 0 ? interfaceC16847 : mo17913t0(this, new C3063(1, interfaceC16847), this.f41311h.f41321r);
    }

    /* JADX INFO: renamed from: n0 */
    public InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* JADX INFO: renamed from: o0 */
    public InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        return mo12124n0(abstractC14463, interfaceC16847, new C10500(13)).spliterator();
    }
}
