package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9PR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21223 implements InterfaceC9374 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8522 f68393;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC17092 f68394;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f68395;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC17009 f68396;

    public C21223(AbstractC17009 abstractC17009, AbstractC17092 abstractC17092, InterfaceC8522 interfaceC8522) {
        this.f68396 = abstractC17009;
        this.f68395 = abstractC17092.mo40108(interfaceC8522);
        this.f68394 = abstractC17092;
        this.f68393 = interfaceC8522;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21223 m48177(AbstractC17009 abstractC17009, AbstractC17092 abstractC17092, InterfaceC8522 interfaceC8522) {
        return new C21223(abstractC17009, abstractC17092, interfaceC8522);
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24197() {
        InterfaceC8522 interfaceC8522 = this.f68393;
        if (!(interfaceC8522 instanceof AbstractC21760)) {
            return interfaceC8522.newBuilderForType().buildPartial();
        }
        EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC21760) ((AbstractC21760) interfaceC8522).m49080();
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24202(AbstractC21760 abstractC21760, AbstractC21760 abstractC21761) {
        AbstractC17009 abstractC17009 = this.f68396;
        if (!abstractC17009.mo7236(abstractC21760).equals(abstractC17009.mo7236(abstractC21761))) {
            return false;
        }
        if (!this.f68395) {
            return true;
        }
        AbstractC17092 abstractC17092 = this.f68394;
        return abstractC17092.mo40104((Object) abstractC21760).equals(abstractC17092.mo40104((Object) abstractC21761));
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final int mo24196(AbstractC21760 abstractC21760) {
        int iHashCode = this.f68396.mo7236(abstractC21760).hashCode();
        return this.f68395 ? (iHashCode * 53) + this.f68394.mo40104((Object) abstractC21760).hashCode() : iHashCode;
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24199(Object obj, Object obj2) {
        int i = C8668.f26436;
        AbstractC17009 abstractC17009 = this.f68396;
        abstractC17009.mo7242(obj, abstractC17009.mo7229(abstractC17009.mo7236(obj), abstractC17009.mo7236(obj2)));
        if (this.f68395) {
            AbstractC17092 abstractC17092 = this.f68394;
            C19210 c19210Mo40104 = abstractC17092.mo40104(obj2);
            if (c19210Mo40104.m44324()) {
                return;
            }
            abstractC17092.mo40109(obj).m44317(c19210Mo40104);
        }
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24200(Object obj, InterfaceC6633 interfaceC6633) {
        Iterator itM44319 = this.f68394.mo40104(obj).m44319();
        while (itM44319.hasNext()) {
            Map.Entry entry = (Map.Entry) itM44319.next();
            InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
            if (interfaceC18504.mo1140() != EnumC1694.MESSAGE || interfaceC18504.mo1129() || interfaceC18504.mo1143()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C21076) {
                ((C23939) interfaceC6633).m52758(interfaceC18504.getNumber(), ((C21076) entry).m47979().m38047());
            } else {
                ((C23939) interfaceC6633).m52758(interfaceC18504.getNumber(), entry.getValue());
            }
        }
        AbstractC17009 abstractC17009 = this.f68396;
        abstractC17009.mo7234(abstractC17009.mo7236(obj), interfaceC6633);
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24201(Object obj, InterfaceC10785 interfaceC10785, C17798 c17798) {
        AbstractC17009 abstractC17009 = this.f68396;
        Object objMo7228 = abstractC17009.mo7228(obj);
        AbstractC17092 abstractC17092 = this.f68394;
        C19210 c19210Mo40109 = abstractC17092.mo40109(obj);
        while (interfaceC10785.mo6774() != Integer.MAX_VALUE) {
            try {
                if (!m48178(interfaceC10785, c17798, abstractC17092, c19210Mo40109, abstractC17009, objMo7228)) {
                    return;
                }
            } finally {
                abstractC17009.mo7238(obj, objMo7228);
            }
        }
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24198(Object obj) {
        this.f68396.mo7243(obj);
        this.f68394.mo40110(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m48178(InterfaceC10785 interfaceC10785, C17798 c17798, AbstractC17092 abstractC17092, C19210 c19210, AbstractC17009 abstractC17009, Object obj) throws C2025 {
        int tag = interfaceC10785.getTag();
        InterfaceC8522 interfaceC8522 = this.f68393;
        if (tag != 11) {
            if ((tag & 7) == 2) {
                Object objMo40103 = abstractC17092.mo40103(c17798, interfaceC8522, tag >>> 3);
                if (objMo40103 != null) {
                    abstractC17092.mo40107(interfaceC10785, objMo40103, c17798, c19210);
                    return true;
                }
                return abstractC17009.m39893(obj, interfaceC10785);
            }
            return interfaceC10785.mo6801();
        }
        Object objMo40104 = null;
        AbstractC5886 abstractC5886Mo6777 = null;
        int iMo6796 = 0;
        while (interfaceC10785.mo6774() != Integer.MAX_VALUE) {
            int tag2 = interfaceC10785.getTag();
            if (tag2 == 16) {
                iMo6796 = interfaceC10785.mo6796();
                objMo40104 = abstractC17092.mo40103(c17798, interfaceC8522, iMo6796);
            } else if (tag2 == 26) {
                if (objMo40104 != null) {
                    abstractC17092.mo40107(interfaceC10785, objMo40104, c17798, c19210);
                } else {
                    abstractC5886Mo6777 = interfaceC10785.mo6777();
                }
            } else if (!interfaceC10785.mo6801()) {
                break;
            }
        }
        if (interfaceC10785.getTag() != 12) {
            throw C2025.m6579();
        }
        if (abstractC5886Mo6777 != null) {
            if (objMo40104 != null) {
                abstractC17092.mo40105(abstractC5886Mo6777, objMo40104, c17798, c19210);
                return true;
            }
            abstractC17009.mo7233(obj, iMo6796, abstractC5886Mo6777);
        }
        return true;
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo24203(Object obj) {
        return this.f68394.mo40104(obj).m44327();
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final int mo24195(AbstractC3770 abstractC3770) {
        AbstractC17009 abstractC17009 = this.f68396;
        int iMo7244 = abstractC17009.mo7244(abstractC17009.mo7236(abstractC3770));
        return this.f68395 ? iMo7244 + this.f68394.mo40104((Object) abstractC3770).m44323() : iMo7244;
    }
}
