package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 26A8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13363 {
    /* JADX INFO: renamed from: ֫ */
    public static void m30508(C5636 c5636, InterfaceC12262 interfaceC12262) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 == 0) {
            byte value = ((InterfaceC5556) interfaceC12262).getValue();
            if (value < 0) {
                c5636.getClass();
                c5636.write("-0x", 0, 3);
                c5636.mo12535(-value);
                c5636.write(116);
                return;
            }
            c5636.getClass();
            c5636.write("0x", 0, 2);
            c5636.mo12535(value);
            c5636.write(116);
            return;
        }
        if (iMo4670 == 6) {
            long value2 = ((InterfaceC9579) interfaceC12262).getValue();
            if (value2 < 0) {
                c5636.getClass();
                c5636.write("-0x", 0, 3);
                c5636.mo12535(-value2);
                c5636.write(76);
                return;
            }
            c5636.getClass();
            c5636.write("0x", 0, 2);
            c5636.mo12535(value2);
            c5636.write(76);
            return;
        }
        if (iMo4670 == 2) {
            short value3 = ((InterfaceC19678) interfaceC12262).getValue();
            if (value3 < 0) {
                c5636.getClass();
                c5636.write("-0x", 0, 3);
                c5636.mo12535(-value3);
                c5636.write(115);
                return;
            }
            c5636.getClass();
            c5636.write("0x", 0, 2);
            c5636.mo12535(value3);
            c5636.write(115);
            return;
        }
        if (iMo4670 == 3) {
            char value4 = ((InterfaceC14943) interfaceC12262).getValue();
            c5636.write(39);
            C15693.m35743(c5636, value4);
            c5636.write(39);
            return;
        }
        if (iMo4670 == 4) {
            C21605.m48807(c5636, ((InterfaceC15613) interfaceC12262).getValue());
            return;
        }
        if (iMo4670 == 16) {
            c5636.write(Float.toString(((InterfaceC24331) interfaceC12262).getValue()));
            c5636.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            return;
        }
        if (iMo4670 == 17) {
            c5636.write(Double.toString(((InterfaceC14273) interfaceC12262).getValue()));
            return;
        }
        switch (iMo4670) {
            case 21:
                C16010.m36385(c5636, ((InterfaceC18336) interfaceC12262).getValue());
                return;
            case 22:
                C16010.m36388(c5636, ((InterfaceC12973) interfaceC12262).getValue());
                return;
            case 23:
                if (interfaceC12262 instanceof C3803) {
                    ((C3803) interfaceC12262).m7419(c5636);
                    return;
                }
                String value5 = ((InterfaceC19007) interfaceC12262).getValue();
                c5636.write(34);
                C15693.m35744(c5636, value5);
                c5636.write(34);
                return;
            case 24:
                c5636.write(((InterfaceC16324) interfaceC12262).getValue());
                return;
            case 25:
                InterfaceC13603 interfaceC13603 = (InterfaceC13603) interfaceC12262;
                C16010.m36387(c5636, interfaceC13603.getValue(), interfaceC13603.getValue().mo10231().equals(null));
                return;
            case 26:
                InterfaceC4255 interfaceC4255 = (InterfaceC4255) interfaceC12262;
                C16010.m36386(c5636, interfaceC4255.getValue(), interfaceC4255.getValue().mo5853().equals(null));
                return;
            case 27:
                InterfaceC8238 interfaceC8238 = (InterfaceC8238) interfaceC12262;
                boolean zEquals = interfaceC8238.getValue().mo10231().equals(null);
                c5636.getClass();
                c5636.write(".enum ", 0, 6);
                C16010.m36387(c5636, interfaceC8238.getValue(), zEquals);
                return;
            case 28:
                c5636.write(123);
                List<InterfaceC12262> value6 = ((InterfaceC21650) interfaceC12262).getValue();
                if (value6.size() == 0) {
                    c5636.write(C0254q.f1218h);
                    return;
                }
                c5636.write(10);
                c5636.m12536();
                boolean z = true;
                for (InterfaceC12262 interfaceC12263 : value6) {
                    if (!z) {
                        c5636.write(",\n", 0, 2);
                    }
                    m30508(c5636, interfaceC12263);
                    z = false;
                }
                c5636.m12532();
                c5636.write("\n}", 0, 2);
                return;
            case 29:
                InterfaceC23661 interfaceC23661 = (InterfaceC23661) interfaceC12262;
                c5636.getClass();
                c5636.write(".subannotation ", 0, 15);
                c5636.write(interfaceC23661.getType());
                c5636.write(10);
                AbstractC7998.m18538(c5636, interfaceC23661.getElements());
                c5636.write(".end subannotation", 0, 18);
                return;
            case 30:
                c5636.getClass();
                c5636.write("null", 0, 4);
                return;
            case 31:
                if (((InterfaceC6897) interfaceC12262).getValue()) {
                    c5636.getClass();
                    c5636.write("true", 0, 4);
                    return;
                } else {
                    c5636.getClass();
                    c5636.write("false", 0, 5);
                    return;
                }
            default:
                throw new IllegalArgumentException("Unknown encoded value type: " + interfaceC12262.mo4670());
        }
    }
}
