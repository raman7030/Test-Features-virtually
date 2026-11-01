package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۫ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2Y5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14240 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f40550;

    /* JADX INFO: renamed from: ۧ */
    public long f40551;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC19785 f40552 = AbstractC19785.m44967();

    /* JADX INFO: renamed from: ֫ */
    public final long m32721() {
        long jNanoTime;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f40550) {
            ((C18443) this.f40552).getClass();
            jNanoTime = System.nanoTime() - this.f40551;
        } else {
            jNanoTime = 0;
        }
        return timeUnit.convert(jNanoTime, timeUnit);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C14240 m32720() {
        return new C14240();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32722() {
        C6194.m14035("This stopwatch is already running.", !this.f40550);
        this.f40550 = true;
        ((C18443) this.f40552).getClass();
        this.f40551 = System.nanoTime();
    }

    public final String toString() {
        long jNanoTime;
        String str;
        if (this.f40550) {
            ((C18443) this.f40552).getClass();
            jNanoTime = System.nanoTime() - this.f40551;
        } else {
            jNanoTime = 0;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb.append(" ");
        switch (C14910.f42523[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = C0655am.f2274aB;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = C0655am.f2279aG;
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }
}
