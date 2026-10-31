package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۢۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9366 implements InterfaceC14303 {
    public final String toString() {
        return "Instant()";
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        Long lA = c10071.a(EnumC18496.INSTANT_SECONDS);
        InterfaceC2268 interfaceC2268 = c10071.a;
        EnumC18496 enumC18496 = EnumC18496.NANO_OF_SECOND;
        Long lValueOf = interfaceC2268.e(enumC18496) ? Long.valueOf(interfaceC2268.G(enumC18496)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = enumC18496.b.a(lValueOf != null ? lValueOf.longValue() : 0L, enumC18496);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jZ = AbstractC22791.z(j, 315569520000L) + 1;
            C22770 c22770Z = C22770.Z(AbstractC22791.O(j, 315569520000L) - 62167219200L, 0, C18078.f);
            if (jZ > 0) {
                sb.append('+');
                sb.append(jZ);
            }
            sb.append(c22770Z);
            if (c22770Z.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            C22770 c22770Z2 = C22770.Z(j4 - 62167219200L, 0, C18078.f);
            int length = sb.length();
            sb.append(c22770Z2);
            if (c22770Z2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (c22770Z2.a.a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        C4426 c4426 = new C4426();
        c4426.a(C6292.f);
        c4426.d('T');
        EnumC18496 enumC18496 = EnumC18496.HOUR_OF_DAY;
        c4426.l(enumC18496, 2);
        c4426.d(':');
        EnumC18496 enumC18497 = EnumC18496.MINUTE_OF_HOUR;
        c4426.l(enumC18497, 2);
        c4426.d(':');
        EnumC18496 enumC18498 = EnumC18496.SECOND_OF_MINUTE;
        c4426.l(enumC18498, 2);
        EnumC18496 enumC18499 = EnumC18496.NANO_OF_SECOND;
        int i2 = 1;
        c4426.b(enumC18499, 0, 9, true);
        c4426.d('Z');
        C17832 c17832 = c4426.q(Locale.getDefault(), EnumC17126.SMART, null).a;
        if (c17832.b) {
            c17832 = new C17832(c17832.a, false);
        }
        C3015 c3016 = new C3015(c3015.a);
        c3016.b = c3015.b;
        c3016.c = c3015.c;
        int iM = c17832.m(c3016, charSequence, i);
        if (iM < 0) {
            return iM;
        }
        long jLongValue = c3016.d(EnumC18496.YEAR).longValue();
        int iIntValue = c3016.d(EnumC18496.MONTH_OF_YEAR).intValue();
        int iIntValue2 = c3016.d(EnumC18496.DAY_OF_MONTH).intValue();
        int iIntValue3 = c3016.d(enumC18496).intValue();
        int iIntValue4 = c3016.d(enumC18497).intValue();
        Long lD = c3016.d(enumC18498);
        Long lD2 = c3016.d(enumC18499);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else {
            if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                c3015.c().d = true;
                iIntValue5 = 59;
            }
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % 10000;
        try {
            C22770 c22770 = C22770.c;
            C19056 c19056H0 = C19056.h0(i3, iIntValue, iIntValue2);
            C7248 c7248Z = C7248.Z(iIntValue3, iIntValue4, iIntValue5, 0);
            return c3015.f(enumC18499, iIntValue6, i, c3015.f(EnumC18496.INSTANT_SECONDS, AbstractC22791.Q(jLongValue / 10000, 315569520000L) + AbstractC22791.j(new C22770(c19056H0, c7248Z).e0(c19056H0.l0(i2), c7248Z), C18078.f), i, iM));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }
}
