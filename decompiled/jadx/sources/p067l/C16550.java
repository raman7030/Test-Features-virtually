package p067l;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ܶ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAUB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16550 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C16550 f48614 = new C16550();

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        if (obj == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullNumberAsZero.f70155) != 0) {
                c8760.write(48);
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        if (obj instanceof BigInteger) {
            c8760.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        c8760.write(bigDecimal.toString());
        if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        c8760.write(46);
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        C9327 c9327 = c13351.f37485;
        int iM21614 = c9327.m21614();
        if (iM21614 == 2) {
            if (type == BigInteger.class) {
                String strM21616 = c9327.m21616();
                c9327.m21609(16);
                return new BigInteger(strM21616, 10);
            }
            BigDecimal bigDecimalM21617 = c9327.m21617();
            c9327.m21609(16);
            return bigDecimalM21617;
        }
        if (iM21614 == 3) {
            BigDecimal bigDecimalM21618 = c9327.m21617();
            c9327.m21609(16);
            if (type != BigInteger.class) {
                return bigDecimalM21618;
            }
            int iScale = bigDecimalM21618.scale();
            if (iScale < -100 || iScale > 100) {
                throw new NumberFormatException();
            }
            return bigDecimalM21618.toBigInteger();
        }
        Object objM30480 = c13351.m30480((Object) null);
        if (objM30480 == null) {
            return null;
        }
        if (type == BigInteger.class) {
            return C20831.m47045(objM30480);
        }
        return C20831.m47032(objM30480);
    }
}
