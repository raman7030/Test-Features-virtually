package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۢۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11270 implements InterfaceC15962 {
    public final String toString() {
        return "Instant()";
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        Long lM27302a = c11940.m27302a(EnumC19947.INSTANT_SECONDS);
        InterfaceC4524 interfaceC4524 = c11940.f33253a;
        EnumC19947 enumC19947 = EnumC19947.NANO_OF_SECOND;
        Long lValueOf = interfaceC4524.mo6951e(enumC19947) ? Long.valueOf(interfaceC4524.mo6949G(enumC19947)) : null;
        int i = 0;
        if (lM27302a == null) {
            return false;
        }
        long jLongValue = lM27302a.longValue();
        int iM53121a = enumC19947.f60552b.m53121a(lValueOf != null ? lValueOf.longValue() : 0L, enumC19947);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jM53257z = AbstractC24029.m53257z(j, 315569520000L) + 1;
            C24009 c24009M53183Z = C24009.m53183Z(AbstractC24029.m53225O(j, 315569520000L) - 62167219200L, 0, C19550.f59517f);
            if (jM53257z > 0) {
                sb.append('+');
                sb.append(jM53257z);
            }
            sb.append(c24009M53183Z);
            if (c24009M53183Z.f76254b.f25135c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            C24009 c24009M53183Z2 = C24009.m53183Z(j4 - 62167219200L, 0, C19550.f59517f);
            int length = sb.length();
            sb.append(c24009M53183Z2);
            if (c24009M53183Z2.f76254b.f25135c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (c24009M53183Z2.f76253a.f63259a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iM53121a > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iM53121a <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iM53121a / i2;
                sb.append((char) (i3 + 48));
                iM53121a -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        C6575 c6575 = new C6575();
        c6575.m15012a(C8349.f22318f);
        c6575.m15015d('T');
        EnumC19947 enumC19947 = EnumC19947.HOUR_OF_DAY;
        c6575.m15023l(enumC19947, 2);
        c6575.m15015d(':');
        EnumC19947 enumC19948 = EnumC19947.MINUTE_OF_HOUR;
        c6575.m15023l(enumC19948, 2);
        c6575.m15015d(':');
        EnumC19947 enumC19949 = EnumC19947.SECOND_OF_MINUTE;
        c6575.m15023l(enumC19949, 2);
        EnumC19947 enumC199410 = EnumC19947.NANO_OF_SECOND;
        int i2 = 1;
        c6575.m15013b(enumC199410, 0, 9, true);
        c6575.m15015d('Z');
        C19316 c19316 = c6575.m15028q(Locale.getDefault(), EnumC18645.SMART, null).f22321a;
        if (c19316.f57677b) {
            c19316 = new C19316(c19316.f57676a, false);
        }
        C5234 c5235 = new C5234(c5234.f12334a);
        c5235.f12335b = c5234.f12335b;
        c5235.f12336c = c5234.f12336c;
        int iMo9637m = c19316.mo9637m(c5235, charSequence, i);
        if (iMo9637m < 0) {
            return iMo9637m;
        }
        long jLongValue = c5235.m11289d(EnumC19947.YEAR).longValue();
        int iIntValue = c5235.m11289d(EnumC19947.MONTH_OF_YEAR).intValue();
        int iIntValue2 = c5235.m11289d(EnumC19947.DAY_OF_MONTH).intValue();
        int iIntValue3 = c5235.m11289d(enumC19947).intValue();
        int iIntValue4 = c5235.m11289d(enumC19948).intValue();
        Long lM11289d = c5235.m11289d(enumC19949);
        Long lM11289d2 = c5235.m11289d(enumC199410);
        int iIntValue5 = lM11289d != null ? lM11289d.intValue() : 0;
        int iIntValue6 = lM11289d2 != null ? lM11289d2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else {
            if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                c5234.m11288c().f53684d = true;
                iIntValue5 = 59;
            }
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % 10000;
        try {
            C24009 c24009 = C24009.f76251c;
            C20480 c20480M46187h0 = C20480.m46187h0(i3, iIntValue, iIntValue2);
            C9257 c9257M21346Z = C9257.m21346Z(iIntValue3, iIntValue4, iIntValue5, 0);
            return c5234.m11291f(enumC199410, iIntValue6, i, c5234.m11291f(EnumC19947.INSTANT_SECONDS, AbstractC24029.m53227Q(jLongValue / 10000, 315569520000L) + AbstractC24029.m53241j(new C24009(c20480M46187h0, c9257M21346Z).m53190e0(c20480M46187h0.m46201l0(i2), c9257M21346Z), C19550.f59517f), i, iMo9637m));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }
}
