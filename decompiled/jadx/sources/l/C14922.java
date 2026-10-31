package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ܶ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAUB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14922 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C14922 f45499 = new C14922();

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
        if (obj instanceof BigInteger) {
            c6725.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        c6725.write(bigDecimal.toString());
        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        c6725.write(46);
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        int iM19646 = c7322.m19646();
        if (iM19646 == 2) {
            if (type == BigInteger.class) {
                String strM19648 = c7322.m19648();
                c7322.m19641(16);
                return new BigInteger(strM19648, 10);
            }
            BigDecimal bigDecimalM19649 = c7322.m19649();
            c7322.m19641(16);
            return bigDecimalM19649;
        }
        if (iM19646 == 3) {
            BigDecimal bigDecimalM196410 = c7322.m19649();
            c7322.m19641(16);
            if (type != BigInteger.class) {
                return bigDecimalM196410;
            }
            int iScale = bigDecimalM196410.scale();
            if (iScale < -100 || iScale > 100) {
                throw new NumberFormatException();
            }
            return bigDecimalM196410.toBigInteger();
        }
        Object objM28434 = c11556.m28434((Object) null);
        if (objM28434 == null) {
            return null;
        }
        if (type == BigInteger.class) {
            return C19426.m44751(objM28434);
        }
        return C19426.m44738(objM28434);
    }
}
