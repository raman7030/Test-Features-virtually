package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܰܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15609 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f44688;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC13599 f44689;

    public /* synthetic */ C15609(AbstractC13599 abstractC13599, int i) {
        this.f44688 = i;
        this.f44689 = abstractC13599;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f44688;
        AbstractC13599 abstractC13599 = this.f44689;
        switch (i) {
            case 0:
                C19003 c19003 = (C19003) abstractC13599;
                Integer numValueOf = Integer.valueOf(c19003.f38256);
                int i2 = c19003.f38256;
                EnumC21552 enumC21552 = EnumC21552.METHOD;
                int i3 = 8;
                return String.format("MethodData: {modifiers[%d]}:%s name[%d]=%s signature[%d]=%s", numValueOf, EnumC8140.m18880(i2, enumC21552).isEmpty() ? "<none>" : Boolean.valueOf(EnumC8140.m18880(c19003.f38256, enumC21552).isEmpty()), Integer.valueOf(c19003.f56657), ((C22161) c19003.f38259).f38266.m27987(c19003.f56657, new C4541(i3)), Integer.valueOf(c19003.f56664), ((C22161) c19003.f38259).f38266.m27987(c19003.f56664, new C4541(i3)));
            default:
                C14959 c14959 = (C14959) abstractC13599;
                return String.format(" chop_frame=%d offset=%d", Integer.valueOf(c14959.f42724), Integer.valueOf(c14959.f42726));
        }
    }
}
