package l;

/* JADX INFO: renamed from: l.ᩳ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18304 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f56906;

    public C18304(InterfaceC10711 interfaceC10711) {
        super(4, (interfaceC10711.size() * 2) + 4);
        this.f56906 = interfaceC10711;
    }

    public final int hashCode() {
        C13922 c13922 = C13922.f41594;
        InterfaceC10711 interfaceC10711 = this.f56906;
        int size = interfaceC10711.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + interfaceC10711.getType(i).hashCode();
        }
        return iHashCode;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_TYPE_LIST;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C16892 c16892M5632 = c1662.m5632();
        InterfaceC10711 interfaceC10711 = this.f56906;
        int size = interfaceC10711.size();
        for (int i = 0; i < size; i++) {
            c16892M5632.m39751(interfaceC10711.getType(i));
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 m42643() {
        return this.f56906;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        C16892 c16892M5632 = c1662.m5632();
        InterfaceC10711 interfaceC10711 = this.f56906;
        int size = interfaceC10711.size();
        if (c18241.m42506()) {
            c18241.m42501(0, m9391() + " type_list");
            c18241.m42501(4, "  size: ".concat(C14712.m35008(size)));
            for (int i = 0; i < size; i++) {
                C7573 type = interfaceC10711.getType(i);
                c18241.m42501(2, EnumC0121.f1143 + C14712.m35006(c16892M5632.m39747(type)) + " // " + type.mo2463());
            }
        }
        c18241.m42514(size);
        for (int i2 = 0; i2 < size; i2++) {
            c18241.m42511(c16892M5632.m39747(interfaceC10711.getType(i2)));
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ֫ */
    public final int mo2861(AbstractC3073 abstractC3073) {
        InterfaceC10711 interfaceC10711 = ((C18304) abstractC3073).f56906;
        C13922 c13922 = C13922.f41594;
        InterfaceC10711 interfaceC10712 = this.f56906;
        int size = interfaceC10712.size();
        int size2 = interfaceC10711.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC10712.getType(i).compareTo(interfaceC10711.getType(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }
}
