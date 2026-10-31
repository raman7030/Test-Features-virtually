package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۛ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6385 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17701(InterfaceC10410 interfaceC10410) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 != 0) {
            if (iMo2302 != 6) {
                if (iMo2302 != 2) {
                    if (iMo2302 != 3) {
                        if (iMo2302 != 4) {
                            if (iMo2302 != 16) {
                                if (iMo2302 != 17) {
                                    if (iMo2302 != 30) {
                                        if (iMo2302 != 31) {
                                            return false;
                                        }
                                        return !((InterfaceC4765) interfaceC10410).getValue();
                                    }
                                } else if (((InterfaceC12526) interfaceC10410).getValue() != 0.0d) {
                                    return false;
                                }
                            } else if (((InterfaceC23109) interfaceC10410).getValue() != 0.0f) {
                                return false;
                            }
                        } else if (((InterfaceC13936) interfaceC10410).getValue() != 0) {
                            return false;
                        }
                    } else if (((InterfaceC13231) interfaceC10410).getValue() != 0) {
                        return false;
                    }
                } else if (((InterfaceC18213) interfaceC10410).getValue() != 0) {
                    return false;
                }
            } else if (((InterfaceC7587) interfaceC10410).getValue() != 0) {
                return false;
            }
        } else if (((InterfaceC3354) interfaceC10410).getValue() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17700(Writer writer, InterfaceC10410 interfaceC10410) throws IOException {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 == 0) {
            writer.write(Byte.toString(((InterfaceC3354) interfaceC10410).getValue()));
            return;
        }
        if (iMo2302 == 6) {
            writer.write(Long.toString(((InterfaceC7587) interfaceC10410).getValue()));
            return;
        }
        if (iMo2302 == 2) {
            writer.write(Short.toString(((InterfaceC18213) interfaceC10410).getValue()));
            return;
        }
        if (iMo2302 == 3) {
            writer.write(Integer.toString(((InterfaceC13231) interfaceC10410).getValue()));
            return;
        }
        if (iMo2302 == 4) {
            writer.write(Integer.toString(((InterfaceC13936) interfaceC10410).getValue()));
            return;
        }
        if (iMo2302 == 16) {
            writer.write(Float.toString(((InterfaceC23109) interfaceC10410).getValue()));
            return;
        }
        if (iMo2302 == 17) {
            writer.write(Double.toString(((InterfaceC12526) interfaceC10410).getValue()));
            return;
        }
        switch (iMo2302) {
            case 21:
                C14354.m34252(writer, ((InterfaceC16801) interfaceC10410).getValue());
                return;
            case 22:
                C14354.m34255(writer, ((InterfaceC11158) interfaceC10410).getValue());
                return;
            case 23:
                writer.write(34);
                C14020.m33624(writer, ((InterfaceC17507) interfaceC10410).getValue());
                writer.write(34);
                return;
            case 24:
                writer.write(((InterfaceC14684) interfaceC10410).getValue());
                return;
            case 25:
                C14354.m34254(writer, ((InterfaceC11821) interfaceC10410).getValue(), false);
                return;
            case 26:
                C14354.m34253(writer, ((InterfaceC1985) interfaceC10410).getValue(), false);
                return;
            case 27:
                C14354.m34254(writer, ((InterfaceC6176) interfaceC10410).getValue(), false);
                return;
            case 28:
                writer.write("Array[");
                boolean z = true;
                for (InterfaceC10410 interfaceC10411 : ((InterfaceC20288) interfaceC10410).getValue()) {
                    if (z) {
                        z = false;
                    } else {
                        writer.write(", ");
                    }
                    m17700(writer, interfaceC10411);
                }
                writer.write(93);
                return;
            case 29:
                InterfaceC22404 interfaceC22404 = (InterfaceC22404) interfaceC10410;
                writer.write("Annotation[");
                writer.write(interfaceC22404.getType());
                for (InterfaceC9272 interfaceC9272 : interfaceC22404.getElements()) {
                    writer.write(", ");
                    writer.write(interfaceC9272.getName());
                    writer.write(61);
                    m17700(writer, interfaceC9272.getValue());
                }
                writer.write(93);
                return;
            case 30:
                writer.write("null");
                return;
            case 31:
                writer.write(Boolean.toString(((InterfaceC4765) interfaceC10410).getValue()));
                return;
            default:
                throw new IllegalArgumentException("Unknown encoded value type");
        }
    }
}
