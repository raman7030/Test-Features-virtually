package l;

/* JADX INFO: renamed from: l.᩻ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15YU */
/* JADX INFO: loaded from: classes.dex */
public final class C23836 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC20372 f77130 = new C14663();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17486 m52534(InterfaceC10410 interfaceC10410) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 == 0) {
            InterfaceC3354 interfaceC3354 = (InterfaceC3354) interfaceC10410;
            return interfaceC3354 instanceof C11137 ? (C11137) interfaceC3354 : new C11137(interfaceC3354.getValue());
        }
        if (iMo2302 == 6) {
            InterfaceC7587 interfaceC7587 = (InterfaceC7587) interfaceC10410;
            return interfaceC7587 instanceof C16074 ? (C16074) interfaceC7587 : new C16074(interfaceC7587.getValue());
        }
        if (iMo2302 == 2) {
            InterfaceC18213 interfaceC18213 = (InterfaceC18213) interfaceC10410;
            return interfaceC18213 instanceof C0552 ? (C0552) interfaceC18213 : new C0552(interfaceC18213.getValue());
        }
        if (iMo2302 == 3) {
            InterfaceC13231 interfaceC13231 = (InterfaceC13231) interfaceC10410;
            return interfaceC13231 instanceof C16780 ? (C16780) interfaceC13231 : new C16780(interfaceC13231.getValue());
        }
        if (iMo2302 == 4) {
            InterfaceC13936 interfaceC13936 = (InterfaceC13936) interfaceC10410;
            return interfaceC13936 instanceof C9020 ? (C9020) interfaceC13936 : new C9020(interfaceC13936.getValue());
        }
        if (iMo2302 == 16) {
            InterfaceC23109 interfaceC23109 = (InterfaceC23109) interfaceC10410;
            return interfaceC23109 instanceof C9726 ? (C9726) interfaceC23109 : new C9726(interfaceC23109.getValue());
        }
        if (iMo2302 == 17) {
            InterfaceC12526 interfaceC12526 = (InterfaceC12526) interfaceC10410;
            return interfaceC12526 instanceof C18192 ? (C18192) interfaceC12526 : new C18192(interfaceC12526.getValue());
        }
        switch (iMo2302) {
            case 21:
                InterfaceC16801 interfaceC16801 = (InterfaceC16801) interfaceC10410;
                return interfaceC16801 instanceof C18898 ? (C18898) interfaceC16801 : new C18898(C3396.m10363(interfaceC16801.getValue()));
            case 22:
                InterfaceC11158 interfaceC11158 = (InterfaceC11158) interfaceC10410;
                return interfaceC11158 instanceof C4081 ? (C4081) interfaceC11158 : new C4081(C4807.m14019(interfaceC11158.getValue()));
            case 23:
                InterfaceC17507 interfaceC17507 = (InterfaceC17507) interfaceC10410;
                return interfaceC17507 instanceof C5492 ? (C5492) interfaceC17507 : new C5492(interfaceC17507.getValue());
            case 24:
                InterfaceC14684 interfaceC14684 = (InterfaceC14684) interfaceC10410;
                return interfaceC14684 instanceof C1258 ? (C1258) interfaceC14684 : new C1258(interfaceC14684.getValue());
            case 25:
                InterfaceC11821 interfaceC11821 = (InterfaceC11821) interfaceC10410;
                return interfaceC11821 instanceof C21015 ? (C21015) interfaceC11821 : new C21015(C20330.m46640(interfaceC11821.getValue()));
            case 26:
                InterfaceC1985 interfaceC1985 = (InterfaceC1985) interfaceC10410;
                return interfaceC1985 instanceof C2670 ? (C2670) interfaceC1985 : new C2670(C13273.m32238(interfaceC1985.getValue()));
            case 27:
                InterfaceC6176 interfaceC6176 = (InterfaceC6176) interfaceC10410;
                return interfaceC6176 instanceof C6903 ? (C6903) interfaceC6176 : new C6903(C20330.m46640(interfaceC6176.getValue()));
            case 28:
                InterfaceC20288 interfaceC20288 = (InterfaceC20288) interfaceC10410;
                return interfaceC20288 instanceof C7629 ? (C7629) interfaceC20288 : new C7629(interfaceC20288.getValue());
            case 29:
                InterfaceC22404 interfaceC22404 = (InterfaceC22404) interfaceC10410;
                return interfaceC22404 instanceof C13978 ? (C13978) interfaceC22404 : new C13978(interfaceC22404.getType(), interfaceC22404.getElements());
            case 30:
                return C19604.f63303;
            case 31:
                return ((InterfaceC4765) interfaceC10410).getValue() ? C1964.f6581 : C1964.f6582;
            default:
                C4025.m12110(false);
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17486 m52533(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return new C9726(0.0f);
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return new C0552((short) 0);
            }
            if (cCharAt == 'I') {
                return new C9020(0);
            }
            if (cCharAt == 'J') {
                return new C16074(0L);
            }
            if (cCharAt == 'Z') {
                return C1964.f6582;
            }
            if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                        return new C11137((byte) 0);
                    case 'C':
                        return new C16780((char) 0);
                    case 'D':
                        return new C18192(0.0d);
                    default:
                        throw new C15431(null, "Unrecognized type: %s", str);
                }
            }
        }
        return C19604.f63303;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m52532(Iterable iterable) {
        return f77130.m46688(iterable);
    }
}
