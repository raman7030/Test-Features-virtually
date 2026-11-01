package p067l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.ۧۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAUX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12784 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C12784 f35984 = new C12784();

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
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (Float.isNaN(fFloatValue)) {
                c8760.m20244();
                return;
            }
            if (Float.isInfinite(fFloatValue)) {
                c8760.m20244();
                return;
            }
            String string = Float.toString(fFloatValue);
            if (string.endsWith(".0")) {
                string = C17073.m38720(2, 0, string);
            }
            c8760.write(string);
            if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) != 0) {
                c8760.write(70);
                return;
            }
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue)) {
            c8760.m20244();
            return;
        }
        if (Double.isInfinite(dDoubleValue)) {
            c8760.m20244();
            return;
        }
        String string2 = Double.toString(dDoubleValue);
        if (string2.endsWith(".0")) {
            string2 = C17073.m38720(2, 0, string2);
        }
        c8760.append((CharSequence) string2);
        if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) != 0) {
            c8760.write(68);
        }
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        C9327 c9327 = c13351.f37485;
        int iM21614 = c9327.m21614();
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        if (iM21614 == 2) {
            if (type == cls4 || type == Double.class) {
                String strM21616 = c9327.m21616();
                c9327.m21609(16);
                return Double.valueOf(Double.parseDouble(strM21616));
            }
            if (type == cls3 || type == Float.class) {
                String strM21617 = c9327.m21616();
                c9327.m21609(16);
                return Float.valueOf(Float.parseFloat(strM21617));
            }
            long jM21600 = c9327.m21600();
            c9327.m21609(16);
            if (type != cls2 && type != Short.class) {
                if (type == cls || type == Byte.class) {
                    return Byte.valueOf((byte) jM21600);
                }
                if (jM21600 >= -2147483648L && jM21600 <= 2147483647L) {
                    return Integer.valueOf((int) jM21600);
                }
                return Long.valueOf(jM21600);
            }
            return Short.valueOf((short) jM21600);
        }
        if (iM21614 == 3) {
            if (type == cls4 || type == Double.class) {
                String strM21618 = c9327.m21616();
                c9327.m21609(16);
                return Double.valueOf(Double.parseDouble(strM21618));
            }
            if (type == cls3 || type == Float.class) {
                String strM21619 = c9327.m21616();
                c9327.m21609(16);
                return Float.valueOf(Float.parseFloat(strM21619));
            }
            BigDecimal bigDecimalM21617 = c9327.m21617();
            c9327.m21609(16);
            if (type == cls2 || type == Short.class) {
                return Short.valueOf(bigDecimalM21617.shortValueExact());
            }
            return (type == cls || type == Byte.class) ? Byte.valueOf(bigDecimalM21617.byteValueExact()) : bigDecimalM21617;
        }
        Object objM30480 = c13351.m30480((Object) null);
        if (objM30480 == null) {
            return null;
        }
        if (type == cls4 || type == Double.class) {
            return C20831.m47047(objM30480);
        }
        if (type == cls3 || type == Float.class) {
            return C20831.m47057(objM30480);
        }
        if (type != cls2 && type != Short.class) {
            if (type == cls || type == Byte.class) {
                return C20831.m47053(objM30480);
            }
            return C20831.m47032(objM30480);
        }
        return C20831.m47040(objM30480);
    }
}
