package l;

import com.alipay.sdk.m.y.q;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 26A8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11569 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28462(C3438 c3438, InterfaceC10410 interfaceC10410) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 == 0) {
            byte value = ((InterfaceC3354) interfaceC10410).getValue();
            if (value < 0) {
                c3438.getClass();
                c3438.write("-0x", 0, 3);
                c3438.mo10511(-value);
                c3438.write(116);
                return;
            }
            c3438.getClass();
            c3438.write("0x", 0, 2);
            c3438.mo10511(value);
            c3438.write(116);
            return;
        }
        if (iMo2302 == 6) {
            long value2 = ((InterfaceC7587) interfaceC10410).getValue();
            if (value2 < 0) {
                c3438.getClass();
                c3438.write("-0x", 0, 3);
                c3438.mo10511(-value2);
                c3438.write(76);
                return;
            }
            c3438.getClass();
            c3438.write("0x", 0, 2);
            c3438.mo10511(value2);
            c3438.write(76);
            return;
        }
        if (iMo2302 == 2) {
            short value3 = ((InterfaceC18213) interfaceC10410).getValue();
            if (value3 < 0) {
                c3438.getClass();
                c3438.write("-0x", 0, 3);
                c3438.mo10511(-value3);
                c3438.write(115);
                return;
            }
            c3438.getClass();
            c3438.write("0x", 0, 2);
            c3438.mo10511(value3);
            c3438.write(115);
            return;
        }
        if (iMo2302 == 3) {
            char value4 = ((InterfaceC13231) interfaceC10410).getValue();
            c3438.write(39);
            C14020.m33623(c3438, value4);
            c3438.write(39);
            return;
        }
        if (iMo2302 == 4) {
            C20241.m46486(c3438, ((InterfaceC13936) interfaceC10410).getValue());
            return;
        }
        if (iMo2302 == 16) {
            c3438.write(Float.toString(((InterfaceC23109) interfaceC10410).getValue()));
            c3438.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            return;
        }
        if (iMo2302 == 17) {
            c3438.write(Double.toString(((InterfaceC12526) interfaceC10410).getValue()));
            return;
        }
        switch (iMo2302) {
            case 21:
                C14354.m34252(c3438, ((InterfaceC16801) interfaceC10410).getValue());
                return;
            case 22:
                C14354.m34255(c3438, ((InterfaceC11158) interfaceC10410).getValue());
                return;
            case 23:
                if (interfaceC10410 instanceof C1510) {
                    ((C1510) interfaceC10410).m5193(c3438);
                    return;
                }
                String value5 = ((InterfaceC17507) interfaceC10410).getValue();
                c3438.write(34);
                C14020.m33624(c3438, value5);
                c3438.write(34);
                return;
            case 24:
                c3438.write(((InterfaceC14684) interfaceC10410).getValue());
                return;
            case 25:
                InterfaceC11821 interfaceC11821 = (InterfaceC11821) interfaceC10410;
                C14354.m34254(c3438, interfaceC11821.getValue(), interfaceC11821.getValue().mo8192().equals(null));
                return;
            case 26:
                InterfaceC1985 interfaceC1985 = (InterfaceC1985) interfaceC10410;
                C14354.m34253(c3438, interfaceC1985.getValue(), interfaceC1985.getValue().mo3566().equals(null));
                return;
            case 27:
                InterfaceC6176 interfaceC6176 = (InterfaceC6176) interfaceC10410;
                boolean zEquals = interfaceC6176.getValue().mo8192().equals(null);
                c3438.getClass();
                c3438.write(".enum ", 0, 6);
                C14354.m34254(c3438, interfaceC6176.getValue(), zEquals);
                return;
            case 28:
                c3438.write(123);
                List<InterfaceC10410> value6 = ((InterfaceC20288) interfaceC10410).getValue();
                if (value6.size() == 0) {
                    c3438.write(q.h);
                    return;
                }
                c3438.write(10);
                c3438.m10512();
                boolean z = true;
                for (InterfaceC10410 interfaceC10411 : value6) {
                    if (!z) {
                        c3438.write(",\n", 0, 2);
                    }
                    m28462(c3438, interfaceC10411);
                    z = false;
                }
                c3438.m10508();
                c3438.write("\n}", 0, 2);
                return;
            case 29:
                InterfaceC22404 interfaceC22404 = (InterfaceC22404) interfaceC10410;
                c3438.getClass();
                c3438.write(".subannotation ", 0, 15);
                c3438.write(interfaceC22404.getType());
                c3438.write(10);
                AbstractC5924.m16612(c3438, interfaceC22404.getElements());
                c3438.write(".end subannotation", 0, 18);
                return;
            case 30:
                c3438.getClass();
                c3438.write("null", 0, 4);
                return;
            case 31:
                if (((InterfaceC4765) interfaceC10410).getValue()) {
                    c3438.getClass();
                    c3438.write("true", 0, 4);
                    return;
                } else {
                    c3438.getClass();
                    c3438.write("false", 0, 5);
                    return;
                }
            default:
                throw new IllegalArgumentException("Unknown encoded value type: " + interfaceC10410.mo2302());
        }
    }
}
