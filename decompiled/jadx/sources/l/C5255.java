package l;

/* JADX INFO: renamed from: l.ۚۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9183 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5255 extends AbstractC17955 {
    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫ */
    public final String mo1729() {
        return "ParameterWrapBytesString";
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo15148(int i, String str) {
        if (i != 0) {
            return i != 1 ? str : "Ljava/lang/String;";
        }
        return "[B";
    }

    @Override // l.AbstractC17955
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1730(C1032 c1032, InterfaceC19150 interfaceC19150) {
        EnumC3664 enumC3664;
        Iterable<InterfaceC22677> iterableMo3817 = interfaceC19150.mo3817();
        int iMo3818 = interfaceC19150.mo3818() - c1032.getParameters().size();
        int i = iMo3818 + 1;
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC22677 interfaceC22677 : iterableMo3817) {
            EnumC0841 enumC0841Mo3975 = interfaceC22677.mo3975();
            if (!enumC0841Mo3975.m3132() || (enumC3664 = enumC0841Mo3975.f3316) == EnumC3664.Format22t || enumC3664 == EnumC3664.Format21t) {
                break;
            }
            if (enumC0841Mo3975 == EnumC0841.f3299) {
                InterfaceC1073 interfaceC1073 = (InterfaceC1073) interfaceC22677;
                InterfaceC21699 interfaceC21699 = (InterfaceC21699) interfaceC1073.getReference();
                if (interfaceC1073.mo1790() == iMo3818) {
                    if (interfaceC21699.getType().equals("[B")) {
                        z = true;
                    }
                } else if (interfaceC1073.mo1790() != i) {
                    continue;
                } else if (interfaceC21699.getType().equals("Ljava/lang/String;")) {
                    z2 = true;
                }
            }
        }
        return z && z2;
    }
}
