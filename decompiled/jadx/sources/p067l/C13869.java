package p067l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.۫֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13869 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static C13869 f39184 = new C13869();

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        Number number = (Number) obj;
        if (number == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullNumberAsZero.f70155) != 0) {
                c8760.write(48);
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        if (obj instanceof Long) {
            c8760.m20249(number.longValue());
        } else {
            c8760.writeInt(number.intValue());
        }
        if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) != 0) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                c8760.write(66);
                return;
            }
            if (cls == Short.class) {
                c8760.write(83);
                return;
            }
            if (cls == Long.class) {
                long jLongValue = number.longValue();
                if (jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class) {
                    return;
                }
                c8760.write(76);
            }
        }
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        Object objValueOf;
        C9327 c9327 = c13351.f37485;
        int iM21614 = c9327.m21614();
        if (iM21614 == 8) {
            c9327.m21609(16);
            return null;
        }
        Class cls = Long.TYPE;
        if (iM21614 == 2) {
            if (type == cls || type == Long.class) {
                objValueOf = Long.valueOf(c9327.m21600());
            } else {
                try {
                    objValueOf = Integer.valueOf(c9327.m21619());
                } catch (NumberFormatException e) {
                    throw new C16702(C7470.m17246(obj, "int value overflow, field : "), (Throwable) e);
                }
            }
            c9327.m21609(16);
            return objValueOf;
        }
        if (iM21614 == 3) {
            BigDecimal bigDecimalM21617 = c9327.m21617();
            c9327.m21609(16);
            return (type == cls || type == Long.class) ? Long.valueOf(bigDecimalM21617.longValueExact()) : Integer.valueOf(bigDecimalM21617.intValueExact());
        }
        Object objM30480 = c13351.m30480((Object) null);
        try {
            return (type == cls || type == Long.class) ? C20831.m47056(objM30480) : C20831.m47039(objM30480);
        } catch (Exception e2) {
            throw new C16702("cast error, field : " + obj + ", value " + objM30480, (Throwable) e2);
        }
    }
}
