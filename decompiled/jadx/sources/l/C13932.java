package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܰܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13932 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41607;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11817 f41608;

    public /* synthetic */ C13932(AbstractC11817 abstractC11817, int i) {
        this.f41607 = i;
        this.f41608 = abstractC11817;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f41607;
        AbstractC11817 abstractC11817 = this.f41608;
        switch (i) {
            case 0:
                C17503 c17503 = (C17503) abstractC11817;
                Integer numValueOf = Integer.valueOf(c17503.f35254);
                int i2 = c17503.f35254;
                EnumC20185 enumC20185 = EnumC20185.METHOD;
                int i3 = 8;
                return String.format("MethodData: {modifiers[%d]}:%s name[%d]=%s signature[%d]=%s", numValueOf, EnumC6073.m16951(i2, enumC20185).isEmpty() ? "<none>" : Boolean.valueOf(EnumC6073.m16951(c17503.f35254, enumC20185).isEmpty()), Integer.valueOf(c17503.f53467), ((C20826) c17503.f35257).f35264.m25965(c17503.f53467, new C2286(i3)), Integer.valueOf(c17503.f53474), ((C20826) c17503.f35257).f35264.m25965(c17503.f53474, new C2286(i3)));
            default:
                C13248 c13248 = (C13248) abstractC11817;
                return String.format(" chop_frame=%d offset=%d", Integer.valueOf(c13248.f39660), Integer.valueOf(c13248.f39662));
        }
    }
}
