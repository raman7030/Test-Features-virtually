package p067l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۛ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UI */
/* JADX INFO: loaded from: classes2.dex */
public final class C8437 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m19648(InterfaceC12262 interfaceC12262) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 != 0) {
            if (iMo4670 != 6) {
                if (iMo4670 != 2) {
                    if (iMo4670 != 3) {
                        if (iMo4670 != 4) {
                            if (iMo4670 != 16) {
                                if (iMo4670 != 17) {
                                    if (iMo4670 != 30) {
                                        if (iMo4670 != 31) {
                                            return false;
                                        }
                                        return !((InterfaceC6897) interfaceC12262).getValue();
                                    }
                                } else if (((InterfaceC14273) interfaceC12262).getValue() != 0.0d) {
                                    return false;
                                }
                            } else if (((InterfaceC24331) interfaceC12262).getValue() != 0.0f) {
                                return false;
                            }
                        } else if (((InterfaceC15613) interfaceC12262).getValue() != 0) {
                            return false;
                        }
                    } else if (((InterfaceC14943) interfaceC12262).getValue() != 0) {
                        return false;
                    }
                } else if (((InterfaceC19678) interfaceC12262).getValue() != 0) {
                    return false;
                }
            } else if (((InterfaceC9579) interfaceC12262).getValue() != 0) {
                return false;
            }
        } else if (((InterfaceC5556) interfaceC12262).getValue() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19647(Writer writer, InterfaceC12262 interfaceC12262) throws IOException {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 == 0) {
            writer.write(Byte.toString(((InterfaceC5556) interfaceC12262).getValue()));
            return;
        }
        if (iMo4670 == 6) {
            writer.write(Long.toString(((InterfaceC9579) interfaceC12262).getValue()));
            return;
        }
        if (iMo4670 == 2) {
            writer.write(Short.toString(((InterfaceC19678) interfaceC12262).getValue()));
            return;
        }
        if (iMo4670 == 3) {
            writer.write(Integer.toString(((InterfaceC14943) interfaceC12262).getValue()));
            return;
        }
        if (iMo4670 == 4) {
            writer.write(Integer.toString(((InterfaceC15613) interfaceC12262).getValue()));
            return;
        }
        if (iMo4670 == 16) {
            writer.write(Float.toString(((InterfaceC24331) interfaceC12262).getValue()));
            return;
        }
        if (iMo4670 == 17) {
            writer.write(Double.toString(((InterfaceC14273) interfaceC12262).getValue()));
            return;
        }
        switch (iMo4670) {
            case 21:
                C16010.m36385(writer, ((InterfaceC18336) interfaceC12262).getValue());
                return;
            case 22:
                C16010.m36388(writer, ((InterfaceC12973) interfaceC12262).getValue());
                return;
            case 23:
                writer.write(34);
                C15693.m35744(writer, ((InterfaceC19007) interfaceC12262).getValue());
                writer.write(34);
                return;
            case 24:
                writer.write(((InterfaceC16324) interfaceC12262).getValue());
                return;
            case 25:
                C16010.m36387(writer, ((InterfaceC13603) interfaceC12262).getValue(), false);
                return;
            case 26:
                C16010.m36386(writer, ((InterfaceC4255) interfaceC12262).getValue(), false);
                return;
            case 27:
                C16010.m36387(writer, ((InterfaceC8238) interfaceC12262).getValue(), false);
                return;
            case 28:
                writer.write("Array[");
                boolean z = true;
                for (InterfaceC12262 interfaceC12263 : ((InterfaceC21650) interfaceC12262).getValue()) {
                    if (z) {
                        z = false;
                    } else {
                        writer.write(", ");
                    }
                    m19647(writer, interfaceC12263);
                }
                writer.write(93);
                return;
            case 29:
                InterfaceC23661 interfaceC23661 = (InterfaceC23661) interfaceC12262;
                writer.write("Annotation[");
                writer.write(interfaceC23661.getType());
                for (InterfaceC11180 interfaceC11180 : interfaceC23661.getElements()) {
                    writer.write(", ");
                    writer.write(interfaceC11180.getName());
                    writer.write(61);
                    m19647(writer, interfaceC11180.getValue());
                }
                writer.write(93);
                return;
            case 30:
                writer.write("null");
                return;
            case 31:
                writer.write(Boolean.toString(((InterfaceC6897) interfaceC12262).getValue()));
                return;
            default:
                throw new IllegalArgumentException("Unknown encoded value type");
        }
    }
}
