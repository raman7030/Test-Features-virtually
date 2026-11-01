package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16426 extends AbstractC14409 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5028 f48275;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        c7251.f18916.mo5291(this, (Object) null);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        C4848 c4848M10283;
        C10485 c10486 = (C10485) c10485.m14780();
        EnumC17767 enumC17767 = EnumC17767.TYPEVAR;
        C5028 c5028 = this.f48275;
        int iM10698 = C5028.m10698(c5028, c10486, enumC17767);
        EnumMap enumMap = c5028.f11529;
        C8005 c8005 = c5028.f11526;
        if (iM10698 == -1) {
            AbstractC6462 abstractC6462Mo14803 = c10486.mo14803();
            while (abstractC6462Mo14803 instanceof C13956) {
                abstractC6462Mo14803 = ((C13956) abstractC6462Mo14803).mo14811();
            }
            if (abstractC6462Mo14803 == null || (!abstractC6462Mo14803.m14777(EnumC11353.CLASS) && !abstractC6462Mo14803.m14777(EnumC11353.TYPEVAR))) {
                c4848M10283 = C4848.m10283();
            } else {
                c4848M10283 = abstractC6462Mo14803.mo7388() ? c5028.f11524.m19505(abstractC6462Mo14803) : C4848.m10276of((Object) abstractC6462Mo14803);
            }
            c5028.f11528.m20955(c10486.f16705);
            Object obj2 = c4848M10283.f11034;
            boolean z = obj2 == null || ((AbstractC6462) obj2).m14777(EnumC11353.NONE) || ((AbstractC6462) c4848M10283.f11034).m14777(EnumC11353.ERROR);
            if ((c10486.f16705.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                ((Map) enumMap.get(EnumC17767.TYPEVAR)).put(c10486, c8005.m18548("where.typevar".concat(z ? ".1" : ""), c10486, c4848M10283, C23047.m51425(c10486.f16705.m17991()), c10486.f16705.m17991()));
                AbstractC3500 abstractC3500 = c5028.f11527;
                AbstractC7783 abstractC7783M17991 = c10486.f16705.m17991();
                abstractC3500.getClass();
                abstractC7783M17991.mo5228(abstractC3500, (Locale) null);
                m37320(c4848M10283);
                return null;
            }
            C1446.m31704(!z);
            C13370 c13370 = C13665.f38450;
            ((Map) enumMap.get(EnumC17767.TYPEVAR)).put(c10486, c8005.m18543(new C13370("compiler", "where.fresh.typevar", c10486, c4848M10283)));
            m37320(c4848M10283);
        }
        return null;
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5083(C11945 c11945, Object obj) {
        m37320(c11945.f33323);
        c11945.f16992.mo5291(this, (Object) null);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9477(C12497 c12497, Object obj) {
        m37320(c12497.f35030);
        c12497.f35031.mo5291(this, (Object) null);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11508(C13956 c13956, Object obj) {
        AbstractC6462 abstractC6462Mo14811 = c13956.mo14811();
        if (abstractC6462Mo14811 != null) {
            abstractC6462Mo14811.mo5291(this, (Object) null);
        }
        return null;
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4510(C16637 c16637, Object obj) {
        EnumC17767 enumC17767 = EnumC17767.CAPTURED;
        C5028 c5028 = this.f48275;
        if (C5028.m10698(c5028, c16637, enumC17767) == -1) {
            AbstractC6462 abstractC6462 = c16637.f29021;
            C21215 c21215 = c16637.f48907;
            ((Map) c5028.f11529.get(enumC17767)).put(c16637, c5028.f11526.m18548("where.captured".concat(abstractC6462 == c5028.f11525.f69204 ? ".1" : ""), c16637, c16637.mo14803(), c16637.f29021, c21215));
            c21215.mo5291(this, (Object) null);
            c16637.f29021.mo5291(this, (Object) null);
            c16637.mo14803().mo5291(this, (Object) null);
        }
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        c21215.f66703.mo5291(this, (Object) null);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        C21333 c21334;
        AbstractC6462 abstractC6462;
        boolean zMo7388 = c21333.mo7388();
        C5028 c5028 = this.f48275;
        if (zMo7388) {
            EnumC17767 enumC17767 = EnumC17767.INTERSECTION;
            int iM10698 = C5028.m10698(c5028, c21333, enumC17767);
            C8374 c8374 = c5028.f11524;
            if (iM10698 == -1) {
                AbstractC6462 abstractC6462M19502 = c8374.m19502(c21333);
                C4848 c4848M19450 = c8374.m19450(c21333);
                C8005 c8005 = c5028.f11526;
                c4848M19450.getClass();
                C4848 c4848 = new C4848(abstractC6462M19502, c4848M19450);
                C13370 c13370 = C13665.f38450;
                ((Map) c5028.f11529.get(enumC17767)).put(c21333, c8005.m18543(new C13370("compiler", "where.intersection", c21333, c4848)));
                abstractC6462M19502.mo5291(this, (Object) null);
                m37320(c4848M19450);
            }
        } else if (c21333.f16705.f20408.isEmpty() && (c21334 = (C21333) c21333.f16705.f20406) != null) {
            C4848 c4849 = c21334.f67261;
            if (c4849 != null && c4849.m10293()) {
                abstractC6462 = (AbstractC6462) c21334.f67261.f11034;
            } else {
                abstractC6462 = c21334.f67259;
            }
            abstractC6462.mo5291(this, (Object) null);
        }
        c5028.f11528.m20955(c21333.f16705);
        m37320(c21333.mo14802());
        try {
            if (c21333.mo7201() != AbstractC6462.f16700) {
                c21333.mo7201().mo5291(this, (Object) null);
            }
        } catch (C21865 unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37320(C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            ((AbstractC6462) it.next()).mo5291(this, (Object) null);
        }
    }

    public C16426(C5028 c5028) {
        this.f48275 = c5028;
    }
}
