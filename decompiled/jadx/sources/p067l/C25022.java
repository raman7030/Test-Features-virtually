package p067l;

/* JADX INFO: renamed from: l.᩻ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15YU */
/* JADX INFO: loaded from: classes.dex */
public final class C25022 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC21730 f79881 = new C16304();

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC18987 m54943(InterfaceC12262 interfaceC12262) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 == 0) {
            InterfaceC5556 interfaceC5556 = (InterfaceC5556) interfaceC12262;
            return interfaceC5556 instanceof C12953 ? (C12953) interfaceC5556 : new C12953(interfaceC5556.getValue());
        }
        if (iMo4670 == 6) {
            InterfaceC9579 interfaceC9579 = (InterfaceC9579) interfaceC12262;
            return interfaceC9579 instanceof C17645 ? (C17645) interfaceC9579 : new C17645(interfaceC9579.getValue());
        }
        if (iMo4670 == 2) {
            InterfaceC19678 interfaceC19678 = (InterfaceC19678) interfaceC12262;
            return interfaceC19678 instanceof C2893 ? (C2893) interfaceC19678 : new C2893(interfaceC19678.getValue());
        }
        if (iMo4670 == 3) {
            InterfaceC14943 interfaceC14943 = (InterfaceC14943) interfaceC12262;
            return interfaceC14943 instanceof C18316 ? (C18316) interfaceC14943 : new C18316(interfaceC14943.getValue());
        }
        if (iMo4670 == 4) {
            InterfaceC15613 interfaceC15613 = (InterfaceC15613) interfaceC12262;
            return interfaceC15613 instanceof C10941 ? (C10941) interfaceC15613 : new C10941(interfaceC15613.getValue());
        }
        if (iMo4670 == 16) {
            InterfaceC24331 interfaceC24331 = (InterfaceC24331) interfaceC12262;
            return interfaceC24331 instanceof C11612 ? (C11612) interfaceC24331 : new C11612(interfaceC24331.getValue());
        }
        if (iMo4670 == 17) {
            InterfaceC14273 interfaceC14273 = (InterfaceC14273) interfaceC12262;
            return interfaceC14273 instanceof C19658 ? (C19658) interfaceC14273 : new C19658(interfaceC14273.getValue());
        }
        switch (iMo4670) {
            case 21:
                InterfaceC18336 interfaceC18336 = (InterfaceC18336) interfaceC12262;
                return interfaceC18336 instanceof C20329 ? (C20329) interfaceC18336 : new C20329(C5596.m12402(interfaceC18336.getValue()));
            case 22:
                InterfaceC12973 interfaceC12973 = (InterfaceC12973) interfaceC12262;
                return interfaceC12973 instanceof C6247 ? (C6247) interfaceC12973 : new C6247(C6937.m15899(interfaceC12973.getValue()));
            case 23:
                InterfaceC19007 interfaceC19007 = (InterfaceC19007) interfaceC12262;
                return interfaceC19007 instanceof C7588 ? (C7588) interfaceC19007 : new C7588(interfaceC19007.getValue());
            case 24:
                InterfaceC16324 interfaceC16324 = (InterfaceC16324) interfaceC12262;
                return interfaceC16324 instanceof C3564 ? (C3564) interfaceC16324 : new C3564(interfaceC16324.getValue());
            case 25:
                InterfaceC13603 interfaceC13603 = (InterfaceC13603) interfaceC12262;
                return interfaceC13603 instanceof C22341 ? (C22341) interfaceC13603 : new C22341(C21690.m48963(interfaceC13603.getValue()));
            case 26:
                InterfaceC4255 interfaceC4255 = (InterfaceC4255) interfaceC12262;
                return interfaceC4255 instanceof C4906 ? (C4906) interfaceC4255 : new C4906(C14983.m34337(interfaceC4255.getValue()));
            case 27:
                InterfaceC8238 interfaceC8238 = (InterfaceC8238) interfaceC12262;
                return interfaceC8238 instanceof C8929 ? (C8929) interfaceC8238 : new C8929(C21690.m48963(interfaceC8238.getValue()));
            case 28:
                InterfaceC21650 interfaceC21650 = (InterfaceC21650) interfaceC12262;
                return interfaceC21650 instanceof C9619 ? (C9619) interfaceC21650 : new C9619(interfaceC21650.getValue());
            case 29:
                InterfaceC23661 interfaceC23661 = (InterfaceC23661) interfaceC12262;
                return interfaceC23661 instanceof C15653 ? (C15653) interfaceC23661 : new C15653(interfaceC23661.getType(), interfaceC23661.getElements());
            case 30:
                return C21000.f65921;
            case 31:
                return ((InterfaceC6897) interfaceC12262).getValue() ? C4235.f9360 : C4235.f9361;
            default:
                C6194.m14030(false);
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC18987 m54942(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return new C11612(0.0f);
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return new C2893((short) 0);
            }
            if (cCharAt == 'I') {
                return new C10941(0);
            }
            if (cCharAt == 'J') {
                return new C17645(0L);
            }
            if (cCharAt == 'Z') {
                return C4235.f9361;
            }
            if (cCharAt != '[') {
                switch (cCharAt) {
                    case 'B':
                        return new C12953((byte) 0);
                    case 'C':
                        return new C18316((char) 0);
                    case 'D':
                        return new C19658(0.0d);
                    default:
                        throw new C17034(null, "Unrecognized type: %s", str);
                }
            }
        }
        return C21000.f65921;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m54941(Iterable iterable) {
        return f79881.m49011(iterable);
    }
}
