package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.۫֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12101 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12101 f36173 = new C12101();

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        Number number = (Number) obj;
        if (number == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullNumberAsZero.f67472) != 0) {
                c6725.write(48);
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        if (obj instanceof Long) {
            c6725.m18301(number.longValue());
        } else {
            c6725.writeInt(number.intValue());
        }
        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                c6725.write(66);
                return;
            }
            if (cls == Short.class) {
                c6725.write(83);
                return;
            }
            if (cls == Long.class) {
                long jLongValue = number.longValue();
                if (jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class) {
                    return;
                }
                c6725.write(76);
            }
        }
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        Object objValueOf;
        C7322 c7322 = c11556.f34488;
        int iM19646 = c7322.m19646();
        if (iM19646 == 8) {
            c7322.m19641(16);
            return null;
        }
        Class cls = Long.TYPE;
        if (iM19646 == 2) {
            if (type == cls || type == Long.class) {
                objValueOf = Long.valueOf(c7322.m19632());
            } else {
                try {
                    objValueOf = Integer.valueOf(c7322.m19651());
                } catch (NumberFormatException e) {
                    throw new C15082(C5368.m15337(obj, "int value overflow, field : "), (Throwable) e);
                }
            }
            c7322.m19641(16);
            return objValueOf;
        }
        if (iM19646 == 3) {
            BigDecimal bigDecimalM19649 = c7322.m19649();
            c7322.m19641(16);
            return (type == cls || type == Long.class) ? Long.valueOf(bigDecimalM19649.longValueExact()) : Integer.valueOf(bigDecimalM19649.intValueExact());
        }
        Object objM28434 = c11556.m28434((Object) null);
        try {
            return (type == cls || type == Long.class) ? C19426.m44762(objM28434) : C19426.m44745(objM28434);
        } catch (Exception e2) {
            throw new C15082("cast error, field : " + obj + ", value " + objM28434, (Throwable) e2);
        }
    }
}
