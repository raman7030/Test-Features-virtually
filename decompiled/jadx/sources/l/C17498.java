package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܿܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17498 extends AbstractC20573 {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17498(AbstractC11401 abstractC11401, int i, long j, long j2) {
        super(abstractC11401, i);
        this.s = j;
        this.t = j2;
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 o0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        long j;
        long j2;
        long jR = abstractC12725.R(interfaceC15234);
        if (jR > 0 && interfaceC15234.hasCharacteristics(16384)) {
            InterfaceC15234 interfaceC15234H0 = abstractC12725.h0(interfaceC15234);
            long j3 = this.s;
            return new C16686(interfaceC15234H0, j3, AbstractC22331.c(j3, this.t));
        }
        if (EnumC7330.ORDERED.s(abstractC12725.m)) {
            return ((InterfaceC5214) new C15980(this, abstractC12725, interfaceC15234, new C23742(11), this.s, this.t).invoke()).spliterator();
        }
        InterfaceC15234 interfaceC15234H1 = abstractC12725.h0(interfaceC15234);
        long j4 = this.s;
        long j5 = this.t;
        if (j4 <= jR) {
            long jMin = jR - j4;
            if (j5 >= 0) {
                jMin = Math.min(j5, jMin);
            }
            j2 = jMin;
            j = 0;
        } else {
            j = j4;
            j2 = j5;
        }
        return new C1522(interfaceC15234H1, j, j2);
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        long j;
        long j2;
        long jR = abstractC9198.R(interfaceC15234);
        if (jR > 0 && interfaceC15234.hasCharacteristics(16384)) {
            AbstractC12725 abstractC12725 = (AbstractC12725) abstractC9198;
            while (abstractC12725.f77962l > 0) {
                abstractC12725 = abstractC12725.i;
            }
            return AbstractC9198.H(abstractC9198, AbstractC22331.b(abstractC12725.m0(), interfaceC15234, this.s, this.t), true, intFunction);
        }
        if (!EnumC7330.ORDERED.s(((AbstractC12725) abstractC9198).m)) {
            InterfaceC15234 interfaceC15234H0 = abstractC9198.h0(interfaceC15234);
            long j3 = this.s;
            long j4 = this.t;
            if (j3 <= jR) {
                long jMin = jR - j3;
                if (j4 >= 0) {
                    jMin = Math.min(j4, jMin);
                }
                j2 = jMin;
                j = 0;
            } else {
                j = j3;
                j2 = j4;
            }
            return AbstractC9198.H(this, new C1522(interfaceC15234H0, j, j2), true, intFunction);
        }
        return (InterfaceC5214) new C15980(this, abstractC9198, interfaceC15234, intFunction, this.s, this.t).invoke();
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        return new C12580(this, interfaceC0585);
    }
}
