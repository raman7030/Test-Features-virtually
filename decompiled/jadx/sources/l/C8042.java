package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۠۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C8042 extends AbstractC4203 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f24798 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f24799;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        if (this.f24799.m17546((AbstractC4308) c5138, abstractC5698.f17560, true)) {
            return abstractC5698.f17560;
        }
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        return c8541.f13890 == abstractC5698 ? c8541 : this.f24799.m17527(abstractC5698, c8541.mo12939());
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9465(C12193 c12193, Object obj) {
        return c12193;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        AbstractC4308 abstractC4308M17527;
        AbstractC4308 abstractC4308M17528;
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        C6319 c6319 = this.f24799;
        AbstractC19810 abstractC19810 = c19955.f13890;
        if (abstractC19810 == abstractC5698) {
            return c19955;
        }
        HashSet hashSet = this.f24798;
        if (!hashSet.add(abstractC19810)) {
            return null;
        }
        try {
            AbstractC4308 abstractC4308M17562 = c6319.m17562(c19955);
            if ((abstractC4308M17562.m12913(EnumC9454.CLASS) || abstractC4308M17562.m12913(EnumC9454.TYPEVAR)) && (abstractC4308M17527 = c6319.m17527(abstractC5698, abstractC4308M17562)) != null) {
                return abstractC4308M17527;
            }
            if ((abstractC5698.mo16084() & 512) != 0) {
                for (C2609 c2609M17510 = c6319.m17510(c19955); c2609M17510.m8249(); c2609M17510 = c2609M17510.f8241) {
                    if (!((AbstractC4308) c2609M17510.f8240).m12913(EnumC9454.ERROR) && (abstractC4308M17528 = c6319.m17527(abstractC5698, (AbstractC4308) c2609M17510.f8240)) != null) {
                        return abstractC4308M17528;
                    }
                }
            }
            return null;
        } finally {
            hashSet.remove(abstractC19810);
        }
    }

    public C8042(C6319 c6319) {
        this.f24799 = c6319;
    }
}
