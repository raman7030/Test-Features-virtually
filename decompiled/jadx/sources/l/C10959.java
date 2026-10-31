package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.ۧۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAUX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10959 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C10959 f32992 = new C10959();

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if (obj == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullNumberAsZero.f67472) != 0) {
                c6725.write(48);
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (Float.isNaN(fFloatValue)) {
                c6725.m18296();
                return;
            }
            if (Float.isInfinite(fFloatValue)) {
                c6725.m18296();
                return;
            }
            String string = Float.toString(fFloatValue);
            if (string.endsWith(".0")) {
                string = C15472.m36561(2, 0, string);
            }
            c6725.write(string);
            if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0) {
                c6725.write(70);
                return;
            }
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue)) {
            c6725.m18296();
            return;
        }
        if (Double.isInfinite(dDoubleValue)) {
            c6725.m18296();
            return;
        }
        String string2 = Double.toString(dDoubleValue);
        if (string2.endsWith(".0")) {
            string2 = C15472.m36561(2, 0, string2);
        }
        c6725.append((CharSequence) string2);
        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0) {
            c6725.write(68);
        }
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        int iM19646 = c7322.m19646();
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        if (iM19646 == 2) {
            if (type == cls4 || type == Double.class) {
                String strM19648 = c7322.m19648();
                c7322.m19641(16);
                return Double.valueOf(Double.parseDouble(strM19648));
            }
            if (type == cls3 || type == Float.class) {
                String strM19649 = c7322.m19648();
                c7322.m19641(16);
                return Float.valueOf(Float.parseFloat(strM19649));
            }
            long jM19632 = c7322.m19632();
            c7322.m19641(16);
            if (type != cls2 && type != Short.class) {
                if (type == cls || type == Byte.class) {
                    return Byte.valueOf((byte) jM19632);
                }
                if (jM19632 >= -2147483648L && jM19632 <= 2147483647L) {
                    return Integer.valueOf((int) jM19632);
                }
                return Long.valueOf(jM19632);
            }
            return Short.valueOf((short) jM19632);
        }
        if (iM19646 == 3) {
            if (type == cls4 || type == Double.class) {
                String strM196410 = c7322.m19648();
                c7322.m19641(16);
                return Double.valueOf(Double.parseDouble(strM196410));
            }
            if (type == cls3 || type == Float.class) {
                String strM196411 = c7322.m19648();
                c7322.m19641(16);
                return Float.valueOf(Float.parseFloat(strM196411));
            }
            BigDecimal bigDecimalM19649 = c7322.m19649();
            c7322.m19641(16);
            if (type == cls2 || type == Short.class) {
                return Short.valueOf(bigDecimalM19649.shortValueExact());
            }
            return (type == cls || type == Byte.class) ? Byte.valueOf(bigDecimalM19649.byteValueExact()) : bigDecimalM19649;
        }
        Object objM28434 = c11556.m28434((Object) null);
        if (objM28434 == null) {
            return null;
        }
        if (type == cls4 || type == Double.class) {
            return C19426.m44753(objM28434);
        }
        if (type == cls3 || type == Float.class) {
            return C19426.m44763(objM28434);
        }
        if (type != cls2 && type != Short.class) {
            if (type == cls || type == Byte.class) {
                return C19426.m44759(objM28434);
            }
            return C19426.m44738(objM28434);
        }
        return C19426.m44746(objM28434);
    }
}
