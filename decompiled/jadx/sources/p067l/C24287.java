package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public class C24287 extends AbstractC14409 {
    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return Integer.valueOf(abstractC6462.mo5577().ordinal());
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14564(C3108 c3108, Object obj) {
        return Integer.valueOf(System.identityHashCode(c3108));
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        return Integer.valueOf(((Integer) c7251.f18916.mo5291(this, (Object) null)).intValue() + 12);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public /* bridge */ /* synthetic */ Object mo4509(C10485 c10485, Object obj) {
        return mo8448(c10485);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9477(C12497 c12497, Object obj) {
        int iOrdinal = EnumC11353.METHOD.ordinal();
        for (C4848 c4848 = c12497.f35030; c4848.f11035 != null; c4848 = c4848.f11035) {
            iOrdinal = (iOrdinal << 5) + ((Integer) ((AbstractC6462) c4848.f11034).mo5291(this, (Object) null)).intValue();
        }
        return Integer.valueOf(((Integer) c12497.f35031.mo5291(this, (Object) null)).intValue() + (iOrdinal << 5));
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo11508(C13956 c13956, Object obj) {
        return 0;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        int iHashCode = c21215.f66702.hashCode();
        AbstractC6462 abstractC6462 = c21215.f66703;
        if (abstractC6462 != null) {
            iHashCode = (iHashCode * 127) + ((Integer) abstractC6462.mo5291(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        int iHashCode = c21333.f16705.mo18002().hashCode() + (((Integer) c21333.mo7201().mo5291(this, (Object) null)).intValue() * 127);
        Iterator it = c21333.mo14802().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 127) + ((Integer) ((AbstractC6462) it.next()).mo5291(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    /* JADX INFO: renamed from: ֫ */
    public Integer mo8448(C10485 c10485) {
        return Integer.valueOf(System.identityHashCode(c10485));
    }
}
