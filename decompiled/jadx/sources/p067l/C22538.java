package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9PR */
/* JADX INFO: loaded from: classes5.dex */
public final class C22538 implements InterfaceC11277 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10467 f71076;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18612 f71077;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f71078;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC18533 f71079;

    public C22538(AbstractC18533 abstractC18533, AbstractC18612 abstractC18612, InterfaceC10467 interfaceC10467) {
        this.f71079 = abstractC18533;
        this.f71078 = abstractC18612.mo42353(interfaceC10467);
        this.f71077 = abstractC18612;
        this.f71076 = interfaceC10467;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22538 m50508(AbstractC18533 abstractC18533, AbstractC18612 abstractC18612, InterfaceC10467 interfaceC10467) {
        return new C22538(abstractC18533, abstractC18612, interfaceC10467);
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final Object mo26207() {
        InterfaceC10467 interfaceC10467 = this.f71076;
        if (!(interfaceC10467 instanceof AbstractC23049)) {
            return interfaceC10467.newBuilderForType().buildPartial();
        }
        EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC23049) ((AbstractC23049) interfaceC10467).m51429();
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26212(AbstractC23049 abstractC23049, AbstractC23049 abstractC230410) {
        AbstractC18533 abstractC18533 = this.f71079;
        if (!abstractC18533.mo9315(abstractC23049).equals(abstractC18533.mo9315(abstractC230410))) {
            return false;
        }
        if (!this.f71078) {
            return true;
        }
        AbstractC18612 abstractC18612 = this.f71077;
        return abstractC18612.mo42349((Object) abstractC23049).equals(abstractC18612.mo42349((Object) abstractC230410));
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final int mo26206(AbstractC23049 abstractC23049) {
        int iHashCode = this.f71079.mo9315(abstractC23049).hashCode();
        return this.f71078 ? (iHashCode * 53) + this.f71077.mo42349((Object) abstractC23049).hashCode() : iHashCode;
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26209(Object obj, Object obj2) {
        int i = C10606.f29361;
        AbstractC18533 abstractC18533 = this.f71079;
        abstractC18533.mo9321(obj, abstractC18533.mo9308(abstractC18533.mo9315(obj), abstractC18533.mo9315(obj2)));
        if (this.f71078) {
            AbstractC18612 abstractC18612 = this.f71077;
            C20625 c20625Mo42349 = abstractC18612.mo42349(obj2);
            if (c20625Mo42349.m46619()) {
                return;
            }
            abstractC18612.mo42354(obj).m46612(c20625Mo42349);
        }
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26210(Object obj, InterfaceC8672 interfaceC8672) {
        Iterator itM46614 = this.f71077.mo42349(obj).m46614();
        while (itM46614.hasNext()) {
            Map.Entry entry = (Map.Entry) itM46614.next();
            InterfaceC19954 interfaceC19954 = (InterfaceC19954) entry.getKey();
            if (interfaceC19954.mo3541() != EnumC3978.MESSAGE || interfaceC19954.mo3530() || interfaceC19954.mo3544()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C22399) {
                ((C25120) interfaceC8672).m55164(interfaceC19954.getNumber(), ((C22399) entry).m50309().m40239());
            } else {
                ((C25120) interfaceC8672).m55164(interfaceC19954.getNumber(), entry.getValue());
            }
        }
        AbstractC18533 abstractC18533 = this.f71079;
        abstractC18533.mo9313(abstractC18533.mo9315(obj), interfaceC8672);
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26211(Object obj, InterfaceC12618 interfaceC12618, C19283 c19283) {
        AbstractC18533 abstractC18533 = this.f71079;
        Object objMo9307 = abstractC18533.mo9307(obj);
        AbstractC18612 abstractC18612 = this.f71077;
        C20625 c20625Mo42354 = abstractC18612.mo42354(obj);
        while (interfaceC12618.mo8900() != Integer.MAX_VALUE) {
            try {
                if (!m50509(interfaceC12618, c19283, abstractC18612, c20625Mo42354, abstractC18533, objMo9307)) {
                    return;
                }
            } finally {
                abstractC18533.mo9317(obj, objMo9307);
            }
        }
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26208(Object obj) {
        this.f71079.mo9322(obj);
        this.f71077.mo42355(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m50509(InterfaceC12618 interfaceC12618, C19283 c19283, AbstractC18612 abstractC18612, C20625 c20625, AbstractC18533 abstractC18533, Object obj) throws C4293 {
        int tag = interfaceC12618.getTag();
        InterfaceC10467 interfaceC10467 = this.f71076;
        if (tag != 11) {
            if ((tag & 7) == 2) {
                Object objMo42348 = abstractC18612.mo42348(c19283, interfaceC10467, tag >>> 3);
                if (objMo42348 != null) {
                    abstractC18612.mo42352(interfaceC12618, objMo42348, c19283, c20625);
                    return true;
                }
                return abstractC18533.m42136(obj, interfaceC12618);
            }
            return interfaceC12618.mo8927();
        }
        Object objMo42349 = null;
        AbstractC7962 abstractC7962Mo8903 = null;
        int iMo8922 = 0;
        while (interfaceC12618.mo8900() != Integer.MAX_VALUE) {
            int tag2 = interfaceC12618.getTag();
            if (tag2 == 16) {
                iMo8922 = interfaceC12618.mo8922();
                objMo42349 = abstractC18612.mo42348(c19283, interfaceC10467, iMo8922);
            } else if (tag2 == 26) {
                if (objMo42349 != null) {
                    abstractC18612.mo42352(interfaceC12618, objMo42349, c19283, c20625);
                } else {
                    abstractC7962Mo8903 = interfaceC12618.mo8903();
                }
            } else if (!interfaceC12618.mo8927()) {
                break;
            }
        }
        if (interfaceC12618.getTag() != 12) {
            throw C4293.m8705();
        }
        if (abstractC7962Mo8903 != null) {
            if (objMo42349 != null) {
                abstractC18612.mo42350(abstractC7962Mo8903, objMo42349, c19283, c20625);
                return true;
            }
            abstractC18533.mo9312(obj, iMo8922, abstractC7962Mo8903);
        }
        return true;
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo26213(Object obj) {
        return this.f71077.mo42349(obj).m46622();
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final int mo26205(AbstractC5951 abstractC5951) {
        AbstractC18533 abstractC18533 = this.f71079;
        int iMo9323 = abstractC18533.mo9323(abstractC18533.mo9315(abstractC5951));
        return this.f71078 ? iMo9323 + this.f71077.mo42349((Object) abstractC5951).m46618() : iMo9323;
    }
}
