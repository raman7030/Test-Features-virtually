package l;

/* JADX INFO: renamed from: l.ۤ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9980 implements InterfaceC8131 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12096 f30095 = new C12096(null);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f30096;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14561(InterfaceC3109 interfaceC3109, boolean z, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C6755 c6755, C1386 c1386);

    public AbstractC9980(C22406 c22406) {
        this.f30096 = c22406;
    }

    @Override // l.InterfaceC8131
    /* JADX INFO: renamed from: ֫ */
    public void mo11113(C1755 c1755, C6755 c6755, C2609 c2609, C2609 c26010, C1386 c1386) {
        Object obj;
        boolean zM39436 = c6755.f20969.m39436();
        AbstractC5144 abstractC5144 = ((C8604) c1755.f6073).f26292;
        if (abstractC5144 == null) {
            abstractC5144 = c1755.f6074;
        }
        AbstractC5144 abstractC5145 = abstractC5144;
        C2609 c2609M19435 = C7260.m19435(abstractC5145);
        C0384 c0384 = c6755.f20968;
        InterfaceC3109 interfaceC3109 = null;
        AbstractC4308 abstractC4308 = zM39436 ? (AbstractC4308) c26010.last() : null;
        if (abstractC4308 == null && c2609.m8245() != c26010.m8245()) {
            m25145(abstractC5145, EnumC21537.ARITY_MISMATCH, c0384, new Object[0]);
            throw null;
        }
        C2609 c26011 = c2609;
        C2609 c26012 = c26010;
        C2609 c26013 = c2609M19435;
        while (c26011.m8249() && (obj = c26012.f8240) != abstractC4308) {
            InterfaceC3109 interfaceC31010 = c26013 != null ? (InterfaceC3109) c26013.f8240 : interfaceC3109;
            C2609 c26014 = c26013;
            mo14561(interfaceC31010, false, (AbstractC4308) c26011.f8240, (AbstractC4308) obj, c6755, c1386);
            c26011 = c26011.f8241;
            c26012 = c26012.f8241;
            c26013 = c26014 != null ? c26014.f8241 : c26014;
            interfaceC3109 = null;
        }
        C2609 c26015 = c26013;
        if (c26012.f8240 != abstractC4308) {
            m25145(abstractC5145, EnumC21537.ARITY_MISMATCH, c0384, new Object[0]);
            throw null;
        }
        if (zM39436) {
            AbstractC4308 abstractC4308M17515 = this.f30096.f72597.m17515(abstractC4308);
            while (c26011.m8249()) {
                mo14561(c26015 != null ? (InterfaceC3109) c26015.f8240 : null, true, (AbstractC4308) c26011.f8240, abstractC4308M17515, c6755, c1386);
                c26011 = c26011.f8241;
                if (c26015 != null) {
                    c26015 = c26015.f8241;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25145(InterfaceC3109 interfaceC3109, EnumC21537 enumC21537, C0384 c0384, Object... objArr) {
        Object[] objArr2;
        C22406 c22406 = this.f30096;
        C6735 c6735 = c22406.f72586;
        C22364 c22364 = c22406.f72598;
        boolean z = c0384 != c6735.f20931;
        if (!z || enumC21537.f69223.equals(enumC21537.f69222)) {
            objArr2 = objArr;
        } else {
            Object[] objArr3 = new Object[objArr.length + 1];
            System.arraycopy(objArr, 0, objArr3, 1, objArr.length);
            objArr3[0] = c0384.f1817;
            objArr2 = objArr3;
        }
        String str = z ? enumC21537.f69223 : enumC21537.f69222;
        if (z) {
            C6735 c6736 = c22406.f72586;
            C16719 c16719M16619 = c22406.f72607.m16619(EnumC12986.FRAGMENT, c22364.m7266(), interfaceC3109, str, objArr2);
            c6736.getClass();
            throw C6735.m18338(c16719M16619);
        }
        C16719 c16719M166110 = c22406.f72607.m16619(EnumC12986.FRAGMENT, c22364.m7266(), interfaceC3109, str, objArr2);
        C12096 c12096 = this.f30095;
        c12096.f76628 = c16719M166110;
        throw c12096;
    }

    @Override // l.InterfaceC8131
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC8131 mo11112(C2609 c2609) {
        return this.f30096.f72593;
    }
}
