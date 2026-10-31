package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.֨֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0813 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Executor f2958;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f2959;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f2960;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f2961;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f2962;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Handler f2963;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f2964;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC5357 f2965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15629 f2966;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2225 f2967;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f2968;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C10567 f2969;

    /* JADX WARN: Multi-variable type inference failed */
    public C0813(InterfaceC7785 interfaceC7785) {
        C15629 c15629 = new C15629();
        Executor executorM17745 = C6417.m17745();
        C23721 c23721Mo1601 = interfaceC7785.mo1601();
        C11003.requireNonNull(c23721Mo1601);
        C2225 c2225 = new C2225(0, c23721Mo1601);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2963 = handler;
        RunnableC5357 runnableC5357 = new RunnableC5357(1, this);
        this.f2965 = runnableC5357;
        this.f2968 = 600000L;
        this.f2960 = -1L;
        this.f2969 = (C10567) interfaceC7785;
        this.f2966 = c15629;
        this.f2958 = executorM17745;
        this.f2967 = c2225;
        handler.postDelayed(runnableC5357, 2000L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3048(final C0813 c0813) {
        if (c0813.f2959) {
            return;
        }
        c0813.f2966.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jM52371 = c0813.f2969.mo1601().m52371();
        if (jM52371 != c0813.f2960) {
            c0813.f2960 = jM52371;
            c0813.f2964 = jUptimeMillis;
        }
        if (!c0813.f2962 && jUptimeMillis - c0813.f2964 >= 10000 && jUptimeMillis >= c0813.f2961) {
            c0813.f2962 = true;
            try {
                FutureC3575.m10897(new C3636(c0813, jM52371), c0813.f2958).m10927((InterfaceC21423) new C7166()).m10910(new InterfaceC8017() { // from class: l.ᩴ֫ܿ
                    @Override // l.InterfaceC8017
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo4663(Object obj, Throwable th) {
                        C0813 c0814 = this.f57232;
                        c0814.f2963.post(new RunnableC0107(c0814, th, (EnumC13555) obj, 0));
                    }
                });
                return;
            } catch (RuntimeException unused) {
                c0813.f2962 = false;
                c0813.f2961 = jUptimeMillis + 600000;
                if (c0813.f2959) {
                    return;
                }
            }
        } else if (c0813.f2959) {
            return;
        }
        c0813.f2963.postDelayed(c0813.f2965, 2000L);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m3047(final C0813 c0813, final long j) {
        if (c0813.f2959 || c0813.f2969.mo1601().m52371() != j) {
            return FutureC3575.m10905(EnumC13555.SKIPPED);
        }
        C2225 c2225 = c0813.f2967;
        return ((C23721) c2225.f7279).m52332(new BooleanSupplier() { // from class: l.᩵֫ܿ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C0813.m3051(this.f60372, j);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m3051(C0813 c0813, long j) {
        return c0813.f2959 || c0813.f2969.mo1601().m52371() != j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3049(EnumC13555 enumC13555, C0813 c0813, Throwable th) {
        c0813.f2962 = false;
        if (c0813.f2959) {
            return;
        }
        long j = 600000;
        if (th == null) {
            int i = C5047.f15876[enumC13555.ordinal()];
            if (i == 1) {
                c0813.f2968 = 600000L;
            } else if (i == 2) {
                long j2 = c0813.f2968;
                c0813.f2968 = Math.min(3600000L, 2 * j2);
                j = j2;
            } else if (i == 3) {
                j = 3600000;
            } else {
                if (i != 4) {
                    throw new IncompatibleClassChangeError();
                }
                j = 30000;
            }
        }
        c0813.f2966.getClass();
        c0813.f2961 = SystemClock.uptimeMillis() + j;
        if (enumC13555 == EnumC13555.COMPACTED) {
            C10567 c10567 = c0813.f2969;
            for (C6768 c6768 : (C6768[]) c10567.getSpans(0, c10567.length(), C6768.class)) {
                c6768.m18415(c0813.f2969);
            }
        }
        if (c0813.f2959) {
            return;
        }
        c0813.f2963.postDelayed(c0813.f2965, 2000L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2959 = true;
        this.f2963.removeCallbacks(this.f2965);
    }
}
