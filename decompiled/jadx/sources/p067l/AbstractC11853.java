package p067l;

/* JADX INFO: renamed from: l.ۤ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11853 implements InterfaceC10096 {

    /* JADX INFO: renamed from: ֫ */
    public C13864 f33054 = new C13864(null);

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23663 f33055;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo16465(InterfaceC5323 interfaceC5323, boolean z, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C8788 c8788, C3686 c3686);

    public AbstractC11853(C23663 c23663) {
        this.f33055 = c23663;
    }

    @Override // p067l.InterfaceC10096
    /* JADX INFO: renamed from: ֫ */
    public void mo13089(C4036 c4036, C8788 c8788, C4848 c4848, C4848 c4849, C3686 c3686) {
        Object obj;
        boolean zM41672 = c8788.f23844.m41672();
        AbstractC7257 abstractC7257 = ((C10545) c4036.f8849).f29208;
        if (abstractC7257 == null) {
            abstractC7257 = c4036.f8850;
        }
        AbstractC7257 abstractC7258 = abstractC7257;
        C4848 c4848M21401 = C9268.m21401(abstractC7258);
        C2733 c2733 = c8788.f23843;
        InterfaceC5323 interfaceC5323 = null;
        AbstractC6462 abstractC6462 = zM41672 ? (AbstractC6462) c4849.last() : null;
        if (abstractC6462 == null && c4848.m10289() != c4849.m10289()) {
            m27162(abstractC7258, EnumC22837.ARITY_MISMATCH, c2733, new Object[0]);
            throw null;
        }
        C4848 c48410 = c4848;
        C4848 c48411 = c4849;
        C4848 c48412 = c4848M21401;
        while (c48410.m10293() && (obj = c48411.f11034) != abstractC6462) {
            InterfaceC5323 interfaceC5324 = c48412 != null ? (InterfaceC5323) c48412.f11034 : interfaceC5323;
            C4848 c48413 = c48412;
            mo16465(interfaceC5324, false, (AbstractC6462) c48410.f11034, (AbstractC6462) obj, c8788, c3686);
            c48410 = c48410.f11035;
            c48411 = c48411.f11035;
            c48412 = c48413 != null ? c48413.f11035 : c48413;
            interfaceC5323 = null;
        }
        C4848 c48414 = c48412;
        if (c48411.f11034 != abstractC6462) {
            m27162(abstractC7258, EnumC22837.ARITY_MISMATCH, c2733, new Object[0]);
            throw null;
        }
        if (zM41672) {
            AbstractC6462 abstractC6462M19455 = this.f33055.f75323.m19455(abstractC6462);
            while (c48410.m10293()) {
                mo16465(c48414 != null ? (InterfaceC5323) c48414.f11034 : null, true, (AbstractC6462) c48410.f11034, abstractC6462M19455, c8788, c3686);
                c48410 = c48410.f11035;
                if (c48414 != null) {
                    c48414 = c48414.f11035;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27162(InterfaceC5323 interfaceC5323, EnumC22837 enumC22837, C2733 c2733, Object... objArr) {
        Object[] objArr2;
        C23663 c23663 = this.f33055;
        C8769 c8769 = c23663.f75312;
        C23623 c23623 = c23663.f75324;
        boolean z = c2733 != c8769.f23805;
        if (!z || enumC22837.f71923.equals(enumC22837.f71922)) {
            objArr2 = objArr;
        } else {
            Object[] objArr3 = new Object[objArr.length + 1];
            System.arraycopy(objArr, 0, objArr3, 1, objArr.length);
            objArr3[0] = c2733.f4594;
            objArr2 = objArr3;
        }
        String str = z ? enumC22837.f71923 : enumC22837.f71922;
        if (z) {
            C8769 c87610 = c23663.f75312;
            C18258 c18258M18545 = c23663.f75333.m18545(EnumC14710.FRAGMENT, c23623.m9345(), interfaceC5323, str, objArr2);
            c87610.getClass();
            throw C8769.m20286(c18258M18545);
        }
        C18258 c18258M18546 = c23663.f75333.m18545(EnumC14710.FRAGMENT, c23623.m9345(), interfaceC5323, str, objArr2);
        C13864 c13864 = this.f33054;
        c13864.f79374 = c18258M18546;
        throw c13864;
    }

    @Override // p067l.InterfaceC10096
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC10096 mo13088(C4848 c4848) {
        return this.f33055.f75319;
    }
}
