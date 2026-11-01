package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16240 extends AbstractC15079 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f47792;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6463 = (AbstractC6462) obj;
        if (abstractC6462.m14793(abstractC6463)) {
            return Boolean.TRUE;
        }
        if (abstractC6463.mo14804()) {
            return (Boolean) abstractC6463.mo5291(this, abstractC6462);
        }
        switch (C12889.f36249[abstractC6462.mo5577().ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 15:
                return Boolean.valueOf(abstractC6462.m14777(abstractC6463.mo5577()));
            case 12:
                boolean z = false;
                if (abstractC6463.m14777(EnumC11353.TYPEVAR)) {
                    return Boolean.valueOf(abstractC6462 == abstractC6463);
                }
                if (abstractC6463.mo14788() && !abstractC6463.mo14786() && ((Boolean) abstractC6462.mo5291(this, this.f47792.m19451(abstractC6463))).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
            default:
                throw new AssertionError("isSameType " + abstractC6462.mo5577());
        }
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14564(C3108 c3108, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (abstractC6462.m14777(EnumC11353.WILDCARD)) {
            return Boolean.FALSE;
        }
        if (c3108 == abstractC6462 || c3108.f16992 == abstractC6462 || abstractC6462.m14777(EnumC11353.ERROR) || abstractC6462.m14777(EnumC11353.UNKNOWN)) {
            return Boolean.TRUE;
        }
        c3108.m5296(EnumC20544.f63507, abstractC6462, this.f47792);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        boolean z;
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (c7251 == abstractC6462) {
            return Boolean.TRUE;
        }
        if (abstractC6462.mo14804()) {
            return (Boolean) abstractC6462.mo5291(this, c7251);
        }
        if (abstractC6462.m14777(EnumC11353.ARRAY)) {
            AbstractC6462 abstractC6463 = c7251.f18916;
            C8374 c8374 = this.f47792;
            AbstractC6462 abstractC6462M19455 = c8374.m19455(abstractC6462);
            if (c8374.m19490(abstractC6463, abstractC6462M19455) || (c8374.m19470(abstractC6463, abstractC6462M19455) && c8374.m19470(abstractC6462M19455, abstractC6463))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5083(C11945 c11945, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (!abstractC6462.m14777(EnumC11353.FORALL)) {
            return Boolean.FALSE;
        }
        C11945 c11946 = (C11945) abstractC6462;
        C8374 c8374 = this.f47792;
        return Boolean.valueOf(c8374.m19447(c11945, c11946) && ((Boolean) c11945.f16992.mo5291(this, c8374.m19428(c11946.f16992, c11946.f33323, c11945.f33323))).booleanValue());
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9477(C12497 c12497, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        return Boolean.valueOf(this.f47792.m19446((AbstractC6462) c12497, abstractC6462, true) && ((Boolean) c12497.f35031.mo5291(this, abstractC6462.mo14787())).booleanValue());
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo11508(C13956 c13956, Object obj) {
        return Boolean.TRUE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo23806(C19202 c19202, Object obj) {
        return Boolean.valueOf(c19202 == ((AbstractC6462) obj));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        boolean z;
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (!abstractC6462.m14777(EnumC11353.WILDCARD)) {
            return Boolean.FALSE;
        }
        C21215 c21216 = (C21215) abstractC6462;
        if (c21215.f66702 == c21216.f66702 || (c21215.mo14786() && abstractC6462.mo14786())) {
            if (this.f47792.m19490(c21215.f66703, c21216.f66703)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (c21333 == abstractC6462) {
            return Boolean.TRUE;
        }
        if (abstractC6462.mo14804()) {
            return (Boolean) abstractC6462.mo5291(this, c21333);
        }
        boolean zMo14788 = abstractC6462.mo14788();
        boolean z = false;
        C8374 c8374 = this.f47792;
        if (zMo14788 && !abstractC6462.mo14786()) {
            if (((Boolean) c21333.mo5291(this, c8374.m19451(abstractC6462))).booleanValue() && ((Boolean) c21333.mo5291(this, c8374.m19453(abstractC6462))).booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!c21333.mo7388() || !abstractC6462.mo7388()) {
            if (c21333.f16705 == abstractC6462.f16705 && ((Boolean) c21333.mo7201().mo5291(this, abstractC6462.mo7201())).booleanValue() && c8374.m19469(c21333.mo14802(), abstractC6462.mo14802())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!((Boolean) c8374.m19502(c21333).mo5291(this, c8374.m19502(abstractC6462))).booleanValue()) {
            return Boolean.FALSE;
        }
        HashMap map = new HashMap();
        for (AbstractC6462 abstractC6463 : c8374.m19450(c21333)) {
            if (map.containsKey(abstractC6463)) {
                throw new AssertionError("Malformed intersection");
            }
            map.put(abstractC6463.f16705, abstractC6463);
        }
        for (AbstractC6462 abstractC6464 : c8374.m19450(abstractC6462)) {
            if (!map.containsKey(abstractC6464.f16705)) {
                return Boolean.FALSE;
            }
            if (!((Boolean) ((AbstractC6462) map.remove(abstractC6464.f16705)).mo5291(this, abstractC6464)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.valueOf(map.isEmpty());
    }

    public C16240(C8374 c8374) {
        this.f47792 = c8374;
    }
}
