package p067l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۬ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14975 extends AbstractC9099 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f42782s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ long f42783t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14975(AbstractC8428 abstractC8428, int i, long j, long j2) {
        super(abstractC8428, i);
        this.f42782s = j;
        this.f42783t = j2;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        long j;
        long j2;
        long jMo25628R = abstractC14463.mo25628R(interfaceC16847);
        if (jMo25628R > 0 && interfaceC16847.hasCharacteristics(16384)) {
            InterfaceC20202 interfaceC20202 = (InterfaceC20202) abstractC14463.mo25631h0(interfaceC16847);
            long j3 = this.f42782s;
            return new C2825(interfaceC20202, j3, AbstractC23592.m52401c(j3, this.f42783t));
        }
        if (EnumC9335.ORDERED.m21660s(abstractC14463.f41316m)) {
            return ((InterfaceC7324) new C17556(this, abstractC14463, interfaceC16847, new C24933(20), this.f42782s, this.f42783t).invoke()).spliterator();
        }
        InterfaceC20202 interfaceC20203 = (InterfaceC20202) abstractC14463.mo25631h0(interfaceC16847);
        long j4 = this.f42782s;
        long j5 = this.f42783t;
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
        return new C12689(interfaceC20203, j, j2);
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
            return AbstractC11111.m25595J(abstractC11111, AbstractC23592.m52400b(abstractC14463.mo17912m0(), interfaceC16847, this.f42782s, this.f42783t), true);
        }
        if (!EnumC9335.ORDERED.m21660s(((AbstractC14463) abstractC11111).f41316m)) {
            InterfaceC20202 interfaceC20202 = (InterfaceC20202) abstractC11111.mo25631h0(interfaceC16847);
            long j3 = this.f42782s;
            long j4 = this.f42783t;
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
            return AbstractC11111.m25595J(this, new C12689(interfaceC20202, j2, j), true);
        }
        return (InterfaceC7324) new C17556(this, abstractC11111, interfaceC16847, intFunction, this.f42782s, this.f42783t).invoke();
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        return new C21012(this, interfaceC2925);
    }
}
