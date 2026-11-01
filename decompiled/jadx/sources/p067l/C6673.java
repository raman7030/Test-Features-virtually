package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6673 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final TimeUnit f17218a;

    /* JADX INFO: renamed from: b */
    public final long f17219b;

    /* JADX INFO: renamed from: c */
    public C6398 f17220c;

    /* JADX INFO: renamed from: d */
    public String f17221d;

    /* JADX INFO: renamed from: n */
    public static long m15188n(long j, long j2, long j3) {
        if (j > j3) {
            return C14849.FOREVER_NS;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public C6673(long j, TimeUnit timeUnit, C6398 c6398) {
        this.f17219b = j;
        this.f17218a = timeUnit;
        this.f17220c = c6398;
    }

    public static C6673 from(long j, TimeUnit timeUnit) {
        C12826.requireNonNull(timeUnit, "unit");
        return new C6673(j, timeUnit, null);
    }

    public static C6673 fromMillis(long j) {
        return new C6673(j, TimeUnit.MILLISECONDS, null);
    }

    public static C6673 from(C6398 c6398) {
        C12826.requireNonNull(c6398, "instant");
        return new C6673(0L, null, c6398);
    }

    /* JADX INFO: renamed from: to */
    public long m15191to(TimeUnit timeUnit) {
        C12826.requireNonNull(timeUnit, "unit");
        TimeUnit timeUnit2 = this.f17218a;
        if (timeUnit2 != null) {
            return timeUnit.convert(this.f17219b, timeUnit2);
        }
        long jConvert = timeUnit.convert(this.f17220c.getEpochSecond(), TimeUnit.SECONDS);
        if (jConvert == Long.MIN_VALUE || jConvert == C14849.FOREVER_NS) {
            return jConvert;
        }
        long jConvert2 = timeUnit.convert(this.f17220c.getNano(), TimeUnit.NANOSECONDS);
        long j = jConvert + jConvert2;
        if (((jConvert2 ^ j) & (jConvert ^ j)) >= 0) {
            return j;
        }
        if (jConvert < 0) {
            return Long.MIN_VALUE;
        }
        return C14849.FOREVER_NS;
    }

    public long toMillis() {
        TimeUnit timeUnit = this.f17218a;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.f17219b);
        }
        long epochSecond = this.f17220c.getEpochSecond();
        int nano = this.f17220c.getNano();
        long j = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
            return j + ((long) (nano / BasicLabelFormatter.MILLION));
        }
        if (epochSecond < 0) {
            return Long.MIN_VALUE;
        }
        return C14849.FOREVER_NS;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    public C6398 toInstant() {
        long jM15188n;
        int iM53225O;
        if (this.f17220c == null) {
            switch (AbstractC7539.f19783a[this.f17218a.ordinal()]) {
                case 1:
                    jM15188n = m15188n(this.f17219b, 86400L, 106751991167300L);
                    iM53225O = 0;
                    if (jM15188n <= -31557014167219200L) {
                        this.f17220c = C6398.f16562c;
                    } else if (jM15188n >= 31556889864403199L) {
                        this.f17220c = C6398.f16563d;
                    } else {
                        this.f17220c = C6398.ofEpochSecond(jM15188n, iM53225O);
                    }
                    break;
                case 2:
                    jM15188n = m15188n(this.f17219b, 3600L, 2562047788015215L);
                    iM53225O = 0;
                    if (jM15188n <= -31557014167219200L) {
                        this.f17220c = C6398.f16562c;
                    } else if (jM15188n >= 31556889864403199L) {
                        this.f17220c = C6398.f16563d;
                    } else {
                        this.f17220c = C6398.ofEpochSecond(jM15188n, iM53225O);
                    }
                    break;
                case 3:
                    jM15188n = m15188n(this.f17219b, 60L, 153722867280912930L);
                    iM53225O = 0;
                    if (jM15188n <= -31557014167219200L) {
                        this.f17220c = C6398.f16562c;
                    } else if (jM15188n >= 31556889864403199L) {
                        this.f17220c = C6398.f16563d;
                    } else {
                        this.f17220c = C6398.ofEpochSecond(jM15188n, iM53225O);
                    }
                    break;
                case 4:
                    jM15188n = this.f17219b;
                    iM53225O = 0;
                    if (jM15188n <= -31557014167219200L) {
                        this.f17220c = C6398.f16562c;
                    } else if (jM15188n >= 31556889864403199L) {
                        this.f17220c = C6398.f16563d;
                    } else {
                        this.f17220c = C6398.ofEpochSecond(jM15188n, iM53225O);
                    }
                    break;
                case 5:
                    jM15188n = AbstractC24029.m53257z(this.f17219b, 1000L);
                    iM53225O = ((int) AbstractC24029.m53225O(this.f17219b, 1000L)) * BasicLabelFormatter.MILLION;
                    if (jM15188n <= -31557014167219200L) {
                        this.f17220c = C6398.f16562c;
                    } else if (jM15188n >= 31556889864403199L) {
                        this.f17220c = C6398.f16563d;
                    } else {
                        this.f17220c = C6398.ofEpochSecond(jM15188n, iM53225O);
                    }
                    break;
                case 6:
                    jM15188n = AbstractC24029.m53257z(this.f17219b, 1000000L);
                    iM53225O = ((int) AbstractC24029.m53225O(this.f17219b, 1000000L)) * 1000;
                    if (jM15188n <= -31557014167219200L) {
                        this.f17220c = C6398.f16562c;
                    } else if (jM15188n >= 31556889864403199L) {
                        this.f17220c = C6398.f16563d;
                    } else {
                        this.f17220c = C6398.ofEpochSecond(jM15188n, iM53225O);
                    }
                    break;
                case 7:
                    jM15188n = AbstractC24029.m53257z(this.f17219b, 1000000000L);
                    iM53225O = (int) AbstractC24029.m53225O(this.f17219b, 1000000000L);
                    if (jM15188n <= -31557014167219200L) {
                        this.f17220c = C6398.f16562c;
                    } else if (jM15188n >= 31556889864403199L) {
                        this.f17220c = C6398.f16563d;
                    } else {
                        this.f17220c = C6398.ofEpochSecond(jM15188n, iM53225O);
                    }
                    break;
                default:
                    throw new AssertionError("Unit not handled");
            }
        }
        return this.f17220c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6673) && compareTo((C6673) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    /* JADX INFO: renamed from: s */
    public final long m15190s(long j) {
        TimeUnit timeUnit = this.f17218a;
        if (timeUnit != null) {
            return timeUnit.toNanos(this.f17219b - timeUnit.convert(j, TimeUnit.DAYS));
        }
        return TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - TimeUnit.DAYS.toSeconds(j));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C6673 c6673) {
        long days;
        long days2;
        TimeUnit timeUnit = this.f17218a;
        if (timeUnit != null && timeUnit == c6673.f17218a) {
            return Long.compare(this.f17219b, c6673.f17219b);
        }
        long epochSecond = toInstant().getEpochSecond();
        int iCompare = Long.compare(epochSecond, c6673.toInstant().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(toInstant().getNano(), c6673.toInstant().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        TimeUnit timeUnit2 = this.f17218a;
        if (timeUnit2 != null) {
            days = timeUnit2.toDays(this.f17219b);
        } else {
            days = TimeUnit.SECONDS.toDays(toInstant().getEpochSecond());
        }
        TimeUnit timeUnit3 = c6673.f17218a;
        if (timeUnit3 != null) {
            days2 = timeUnit3.toDays(c6673.f17219b);
        } else {
            days2 = TimeUnit.SECONDS.toDays(c6673.toInstant().getEpochSecond());
        }
        if (days == days2) {
            return Long.compare(m15190s(days), c6673.m15190s(days2));
        }
        return Long.compare(days, days2);
    }

    /* JADX INFO: renamed from: l */
    public static void m15187l(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public final String toString() {
        long epochSecond;
        int nano;
        long jM53257z;
        C24009 c24009M53183Z;
        if (this.f17221d == null) {
            if (this.f17220c == null && this.f17218a.compareTo(TimeUnit.SECONDS) >= 0) {
                epochSecond = this.f17218a.toSeconds(this.f17219b);
                nano = 0;
            } else {
                epochSecond = toInstant().getEpochSecond();
                nano = toInstant().getNano();
            }
            if (epochSecond >= -62167219200L) {
                long j = epochSecond - 253402300800L;
                jM53257z = AbstractC24029.m53257z(j, 315569520000L) + 1;
                c24009M53183Z = C24009.m53183Z(AbstractC24029.m53225O(j, 315569520000L) - 62167219200L, nano, C19550.f59517f);
            } else {
                long j2 = epochSecond + 62167219200L;
                jM53257z = j2 / 315569520000L;
                c24009M53183Z = C24009.m53183Z((j2 % 315569520000L) - 62167219200L, nano, C19550.f59517f);
            }
            int i = (((int) jM53257z) * 10000) + c24009M53183Z.f76253a.f63259a;
            if (i <= 0) {
                i--;
            }
            int i2 = c24009M53183Z.f76254b.f25136d;
            StringBuilder sb = new StringBuilder(64);
            sb.append(i < 0 ? "-" : "");
            int iAbs = Math.abs(i);
            if (iAbs < 10000) {
                m15187l(sb, 1000, Math.abs(iAbs));
            } else {
                sb.append(String.valueOf(iAbs));
            }
            sb.append('-');
            m15187l(sb, 10, c24009M53183Z.f76253a.f63260b);
            sb.append('-');
            m15187l(sb, 10, c24009M53183Z.f76253a.f63261c);
            sb.append('T');
            m15187l(sb, 10, c24009M53183Z.f76254b.f25133a);
            sb.append(':');
            m15187l(sb, 10, c24009M53183Z.f76254b.f25134b);
            sb.append(':');
            m15187l(sb, 10, c24009M53183Z.f76254b.f25135c);
            if (i2 != 0) {
                sb.append('.');
                int i3 = 100000000;
                while (i2 % 10 == 0) {
                    i2 /= 10;
                    i3 /= 10;
                }
                m15187l(sb, i3, i2);
            }
            sb.append('Z');
            this.f17221d = sb.toString();
        }
        return this.f17221d;
    }
}
