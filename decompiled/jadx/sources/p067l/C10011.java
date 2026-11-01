package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۠۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C10011 extends AbstractC6363 {

    /* JADX INFO: renamed from: ᩸ */
    public HashSet f27712 = new HashSet();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8374 f27713;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        if (this.f27713.m19486((AbstractC6462) c7251, abstractC7783.f20406, true)) {
            return abstractC7783.f20406;
        }
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        return c10485.f16705 == abstractC7783 ? c10485 : this.f27713.m19467(abstractC7783, c10485.mo14803());
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11508(C13956 c13956, Object obj) {
        return c13956;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        AbstractC6462 abstractC6462M19467;
        AbstractC6462 abstractC6462M19468;
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        C8374 c8374 = this.f27713;
        AbstractC21195 abstractC21195 = c21333.f16705;
        if (abstractC21195 == abstractC7783) {
            return c21333;
        }
        HashSet hashSet = this.f27712;
        if (!hashSet.add(abstractC21195)) {
            return null;
        }
        try {
            AbstractC6462 abstractC6462M19502 = c8374.m19502(c21333);
            if ((abstractC6462M19502.m14777(EnumC11353.CLASS) || abstractC6462M19502.m14777(EnumC11353.TYPEVAR)) && (abstractC6462M19467 = c8374.m19467(abstractC7783, abstractC6462M19502)) != null) {
                return abstractC6462M19467;
            }
            if ((abstractC7783.mo18003() & 512) != 0) {
                for (C4848 c4848M19450 = c8374.m19450(c21333); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
                    if (!((AbstractC6462) c4848M19450.f11034).m14777(EnumC11353.ERROR) && (abstractC6462M19468 = c8374.m19467(abstractC7783, (AbstractC6462) c4848M19450.f11034)) != null) {
                        return abstractC6462M19468;
                    }
                }
            }
            return null;
        } finally {
            hashSet.remove(abstractC21195);
        }
    }

    public C10011(C8374 c8374) {
        this.f27713 = c8374;
    }
}
