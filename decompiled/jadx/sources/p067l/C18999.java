package p067l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܿܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18999 extends AbstractC21921 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f56646s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ long f56647t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18999(AbstractC13204 abstractC13204, int i, long j, long j2) {
        super(abstractC13204, i);
        this.f56646s = j;
        this.f56647t = j2;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        long j;
        long j2;
        long jMo25628R = abstractC14463.mo25628R(interfaceC16847);
        if (jMo25628R > 0 && interfaceC16847.hasCharacteristics(16384)) {
            InterfaceC16847 interfaceC16847Mo25631h0 = abstractC14463.mo25631h0(interfaceC16847);
            long j3 = this.f56646s;
            return new C18227(interfaceC16847Mo25631h0, j3, AbstractC23592.m52401c(j3, this.f56647t));
        }
        if (EnumC9335.ORDERED.m21660s(abstractC14463.f41316m)) {
            return ((InterfaceC7324) new C17556(this, abstractC14463, interfaceC16847, new C24933(11), this.f56646s, this.f56647t).invoke()).spliterator();
        }
        InterfaceC16847 interfaceC16847Mo25631h1 = abstractC14463.mo25631h0(interfaceC16847);
        long j4 = this.f56646s;
        long j5 = this.f56647t;
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
        return new C3815(interfaceC16847Mo25631h1, j, j2);
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
            return AbstractC11111.m25593H(abstractC11111, AbstractC23592.m52400b(abstractC14463.mo17912m0(), interfaceC16847, this.f56646s, this.f56647t), true, intFunction);
        }
        if (!EnumC9335.ORDERED.m21660s(((AbstractC14463) abstractC11111).f41316m)) {
            InterfaceC16847 interfaceC16847Mo25631h0 = abstractC11111.mo25631h0(interfaceC16847);
            long j3 = this.f56646s;
            long j4 = this.f56647t;
            if (j3 <= jMo25628R) {
                long jMin = jMo25628R - j3;
                if (j4 >= 0) {
                    jMin = Math.min(j4, jMin);
                }
                j2 = jMin;
                j = 0;
            } else {
                j = j3;
                j2 = j4;
            }
            return AbstractC11111.m25593H(this, new C3815(interfaceC16847Mo25631h0, j, j2), true, intFunction);
        }
        return (InterfaceC7324) new C17556(this, abstractC11111, interfaceC16847, intFunction, this.f56646s, this.f56647t).invoke();
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        return new C14325(this, interfaceC2925);
    }
}
