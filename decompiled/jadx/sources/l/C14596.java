package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C14596 extends AbstractC13374 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f44685;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4309 = (AbstractC4308) obj;
        if (abstractC4308.m12929(abstractC4309)) {
            return Boolean.TRUE;
        }
        if (abstractC4309.mo12940()) {
            return (Boolean) abstractC4309.mo2962(this, abstractC4308);
        }
        switch (C11070.f33247[abstractC4308.mo3258().ordinal()]) {
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
                return Boolean.valueOf(abstractC4308.m12913(abstractC4309.mo3258()));
            case 12:
                boolean z = false;
                if (abstractC4309.m12913(EnumC9454.TYPEVAR)) {
                    return Boolean.valueOf(abstractC4308 == abstractC4309);
                }
                if (abstractC4309.mo12924() && !abstractC4309.mo12922() && ((Boolean) abstractC4308.mo2962(this, this.f44685.m17511(abstractC4309))).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
            default:
                throw new AssertionError("isSameType " + abstractC4308.mo3258());
        }
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12688(C0779 c0779, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (abstractC4308.m12913(EnumC9454.WILDCARD)) {
            return Boolean.FALSE;
        }
        if (c0779 == abstractC4308 || c0779.f14167 == abstractC4308 || abstractC4308.m12913(EnumC9454.ERROR) || abstractC4308.m12913(EnumC9454.UNKNOWN)) {
            return Boolean.TRUE;
        }
        c0779.m2967(EnumC19125.f60275, abstractC4308, this.f44685);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        boolean z;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (c5138 == abstractC4308) {
            return Boolean.TRUE;
        }
        if (abstractC4308.mo12940()) {
            return (Boolean) abstractC4308.mo2962(this, c5138);
        }
        if (abstractC4308.m12913(EnumC9454.ARRAY)) {
            AbstractC4308 abstractC4309 = c5138.f16077;
            C6319 c6319 = this.f44685;
            AbstractC4308 abstractC4308M17515 = c6319.m17515(abstractC4308);
            if (c6319.m17550(abstractC4309, abstractC4308M17515) || (c6319.m17530(abstractC4309, abstractC4308M17515) && c6319.m17530(abstractC4308M17515, abstractC4309))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2744(C10077 c10077, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (!abstractC4308.m12913(EnumC9454.FORALL)) {
            return Boolean.FALSE;
        }
        C10077 c10078 = (C10077) abstractC4308;
        C6319 c6319 = this.f44685;
        return Boolean.valueOf(c6319.m17507(c10077, c10078) && ((Boolean) c10077.f14167.mo2962(this, c6319.m17488(c10078.f14167, c10078.f30362, c10077.f30362))).booleanValue());
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7394(C10658 c10658, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        return Boolean.valueOf(this.f44685.m17506((AbstractC4308) c10658, abstractC4308, true) && ((Boolean) c10658.f32060.mo2962(this, abstractC4308.mo12923())).booleanValue());
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21836(C17713 c17713, Object obj) {
        return Boolean.valueOf(c17713 == ((AbstractC4308) obj));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        boolean z;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (!abstractC4308.m12913(EnumC9454.WILDCARD)) {
            return Boolean.FALSE;
        }
        C19831 c19832 = (C19831) abstractC4308;
        if (c19831.f64065 == c19832.f64065 || (c19831.mo12922() && abstractC4308.mo12922())) {
            if (this.f44685.m17550(c19831.f64066, c19832.f64066)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (c19955 == abstractC4308) {
            return Boolean.TRUE;
        }
        if (abstractC4308.mo12940()) {
            return (Boolean) abstractC4308.mo2962(this, c19955);
        }
        boolean zMo12924 = abstractC4308.mo12924();
        boolean z = false;
        C6319 c6319 = this.f44685;
        if (zMo12924 && !abstractC4308.mo12922()) {
            if (((Boolean) c19955.mo2962(this, c6319.m17511(abstractC4308))).booleanValue() && ((Boolean) c19955.mo2962(this, c6319.m17513(abstractC4308))).booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!c19955.mo5146() || !abstractC4308.mo5146()) {
            if (c19955.f13890 == abstractC4308.f13890 && ((Boolean) c19955.mo4958().mo2962(this, abstractC4308.mo4958())).booleanValue() && c6319.m17529(c19955.mo12938(), abstractC4308.mo12938())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (!((Boolean) c6319.m17562(c19955).mo2962(this, c6319.m17562(abstractC4308))).booleanValue()) {
            return Boolean.FALSE;
        }
        HashMap map = new HashMap();
        for (AbstractC4308 abstractC4309 : c6319.m17510(c19955)) {
            if (map.containsKey(abstractC4309)) {
                throw new AssertionError("Malformed intersection");
            }
            map.put(abstractC4309.f13890, abstractC4309);
        }
        for (AbstractC4308 abstractC43010 : c6319.m17510(abstractC4308)) {
            if (!map.containsKey(abstractC43010.f13890)) {
                return Boolean.FALSE;
            }
            if (!((Boolean) ((AbstractC4308) map.remove(abstractC43010.f13890)).mo2962(this, abstractC43010)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.valueOf(map.isEmpty());
    }

    public C14596(C6319 c6319) {
        this.f44685 = c6319;
    }
}
