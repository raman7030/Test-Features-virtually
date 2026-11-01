package p067l;

/* JADX INFO: renamed from: l.ۚۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9183 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7363 extends AbstractC19433 {
    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final String mo4127() {
        return "ParameterWrapBytesString";
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final String mo17051(int i, String str) {
        if (i != 0) {
            return i != 1 ? str : "Ljava/lang/String;";
        }
        return "[B";
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4128(C3349 c3349, InterfaceC20568 interfaceC20568) {
        EnumC5850 enumC5850;
        Iterable<InterfaceC23920> iterableMo6074 = interfaceC20568.mo6074();
        int iMo6075 = interfaceC20568.mo6075() - c3349.getParameters().size();
        int i = iMo6075 + 1;
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC23920 interfaceC23920 : iterableMo6074) {
            EnumC3167 enumC3167Mo6217 = interfaceC23920.mo6217();
            if (!enumC3167Mo6217.m5446() || (enumC5850 = enumC3167Mo6217.f6090) == EnumC5850.Format22t || enumC5850 == EnumC5850.Format21t) {
                break;
            }
            if (enumC3167Mo6217 == EnumC3167.f6073) {
                InterfaceC3388 interfaceC3388 = (InterfaceC3388) interfaceC23920;
                InterfaceC22991 interfaceC22991 = (InterfaceC22991) interfaceC3388.getReference();
                if (interfaceC3388.mo4189() == iMo6075) {
                    if (interfaceC22991.getType().equals("[B")) {
                        z = true;
                    }
                } else if (interfaceC3388.mo4189() != i) {
                    continue;
                } else if (interfaceC22991.getType().equals("Ljava/lang/String;")) {
                    z2 = true;
                }
            }
        }
        return z && z2;
    }
}
