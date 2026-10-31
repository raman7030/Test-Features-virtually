package l;

import com.umeng.analytics.pro.am;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۫ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2Y5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12491 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f37527;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f37528;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC18325 f37529 = AbstractC18325.m42705();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m30656() {
        long jNanoTime;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f37527) {
            ((C16913) this.f37529).getClass();
            jNanoTime = System.nanoTime() - this.f37528;
        } else {
            jNanoTime = 0;
        }
        return timeUnit.convert(jNanoTime, timeUnit);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12491 m30655() {
        return new C12491();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30657() {
        C4025.m12115("This stopwatch is already running.", !this.f37527);
        this.f37527 = true;
        ((C16913) this.f37529).getClass();
        this.f37528 = System.nanoTime();
    }

    public final String toString() {
        long jNanoTime;
        String str;
        if (this.f37527) {
            ((C16913) this.f37529).getClass();
            jNanoTime = System.nanoTime() - this.f37528;
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
        switch (C13196.f39459[timeUnit.ordinal()]) {
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
                str = am.aB;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = am.aG;
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
