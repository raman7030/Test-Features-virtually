package p067l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.᩶᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21840 extends AbstractC3496 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f68723s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ long f68724t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21840(AbstractC7758 abstractC7758, int i, long j, long j2) {
        super(abstractC7758, i);
        this.f68723s = j;
        this.f68724t = j2;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        long j;
        long j2;
        long jMo25628R = abstractC14463.mo25628R(interfaceC16847);
        if (jMo25628R > 0 && interfaceC16847.hasCharacteristics(16384)) {
            InterfaceC10124 interfaceC10124 = (InterfaceC10124) abstractC14463.mo25631h0(interfaceC16847);
            long j3 = this.f68723s;
            return new C16236(interfaceC10124, j3, AbstractC23592.m52401c(j3, this.f68724t));
        }
        if (EnumC9335.ORDERED.m21660s(abstractC14463.f41316m)) {
            return ((InterfaceC7324) new C17556(this, abstractC14463, interfaceC16847, new C24933(22), this.f68723s, this.f68724t).invoke()).spliterator();
        }
        InterfaceC10124 interfaceC10125 = (InterfaceC10124) abstractC14463.mo25631h0(interfaceC16847);
        long j4 = this.f68723s;
        long j5 = this.f68724t;
        if (j4 <= jMo25628R) {
            long jMin = jMo25628R - j4;
            if (j5 >= 0) {
                jMin = Math.min(j5, jMin);
            }
            j2 = jMin;
            j = 0;
        } else {
            j = j4;
            j2 = j5;
        }
        return new C6828(interfaceC10125, j, j2);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        long j;
        long j2;
        long jMo25628R = abstractC11111.mo25628R(interfaceC16847);
        if (jMo25628R > 0 && interfaceC16847.hasCharacteristics(16384)) {
            AbstractC14463 abstractC14463 = (AbstractC14463) abstractC11111;
            while (abstractC14463.f41315l > 0) {
                abstractC14463 = abstractC14463.f41312i;
            }
            return AbstractC11111.m25594I(abstractC11111, AbstractC23592.m52400b(abstractC14463.mo17912m0(), interfaceC16847, this.f68723s, this.f68724t), true);
        }
        if (!EnumC9335.ORDERED.m21660s(((AbstractC14463) abstractC11111).f41316m)) {
            InterfaceC10124 interfaceC10124 = (InterfaceC10124) abstractC11111.mo25631h0(interfaceC16847);
            long j3 = this.f68723s;
            long j4 = this.f68724t;
            if (j3 <= jMo25628R) {
                long jMin = jMo25628R - j3;
                if (j4 >= 0) {
                    jMin = Math.min(j4, jMin);
                }
                j = jMin;
                j2 = 0;
            } else {
                j = j4;
                j2 = j3;
            }
            return AbstractC11111.m25594I(this, new C6828(interfaceC10124, j2, j), true);
        }
        return (InterfaceC7324) new C17556(this, abstractC11111, interfaceC16847, intFunction, this.f68723s, this.f68724t).invoke();
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        return new C5076(this, interfaceC2925);
    }
}
