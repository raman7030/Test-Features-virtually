package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.֨֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3141 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final Executor f5729;

    /* JADX INFO: renamed from: ۙ */
    public volatile boolean f5730;

    /* JADX INFO: renamed from: ۛ */
    public long f5731;

    /* JADX INFO: renamed from: ۤ */
    public long f5732;

    /* JADX INFO: renamed from: ۨ */
    public boolean f5733;

    /* JADX INFO: renamed from: ۫ */
    public final Handler f5734;

    /* JADX INFO: renamed from: ۬ */
    public long f5735;

    /* JADX INFO: renamed from: ܰ */
    public final RunnableC7460 f5736;

    /* JADX INFO: renamed from: ᩶ */
    public final C17222 f5737;

    /* JADX INFO: renamed from: ᩸ */
    public final C4483 f5738;

    /* JADX INFO: renamed from: ᩹ */
    public long f5739;

    /* JADX INFO: renamed from: ᩺ */
    public final C12412 f5740;

    /* JADX WARN: Multi-variable type inference failed */
    public C3141(InterfaceC9768 interfaceC9768) {
        C17222 c17222 = new C17222();
        Executor executorM19692 = C8467.m19692();
        C24913 c24913Mo3999 = interfaceC9768.mo3999();
        C12826.requireNonNull(c24913Mo3999);
        C4483 c4483 = new C4483(0, c24913Mo3999);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f5734 = handler;
        RunnableC7460 runnableC7460 = new RunnableC7460(1, this);
        this.f5736 = runnableC7460;
        this.f5739 = 600000L;
        this.f5731 = -1L;
        this.f5740 = (C12412) interfaceC9768;
        this.f5737 = c17222;
        this.f5729 = executorM19692;
        this.f5738 = c4483;
        handler.postDelayed(runnableC7460, 2000L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m5361(final C3141 c3141) {
        if (c3141.f5730) {
            return;
        }
        c3141.f5737.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jM54774 = c3141.f5740.mo3999().m54774();
        if (jM54774 != c3141.f5731) {
            c3141.f5731 = jM54774;
            c3141.f5735 = jUptimeMillis;
        }
        if (!c3141.f5733 && jUptimeMillis - c3141.f5735 >= 10000 && jUptimeMillis >= c3141.f5732) {
            c3141.f5733 = true;
            try {
                FutureC5767.m12874(new C5824(c3141, jM54774), c3141.f5729).m12904((InterfaceC22729) new C9179()).m12887(new InterfaceC9988() { // from class: l.ᩴ֫ܿ
                    @Override // p067l.InterfaceC9988
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo6895(Object obj, Throwable th) {
                        C3141 c3142 = this.f60450;
                        c3142.f5734.post(new RunnableC2470(c3142, th, (EnumC15251) obj, 0));
                    }
                });
                return;
            } catch (RuntimeException unused) {
                c3141.f5733 = false;
                c3141.f5732 = jUptimeMillis + 600000;
                if (c3141.f5730) {
                    return;
                }
            }
        } else if (c3141.f5730) {
            return;
        }
        c3141.f5734.postDelayed(c3141.f5736, 2000L);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ֫ */
    public static FutureC5767 m5360(final C3141 c3141, final long j) {
        if (c3141.f5730 || c3141.f5740.mo3999().m54774() != j) {
            return FutureC5767.m12882(EnumC15251.SKIPPED);
        }
        C4483 c4483 = c3141.f5738;
        return ((C24913) c4483.f10067).m54735(new BooleanSupplier() { // from class: l.᩵֫ܿ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C3141.m5364(this.f63603, j);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m5364(C3141 c3141, long j) {
        return c3141.f5730 || c3141.f5740.mo3999().m54774() != j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.۟᩺ᩳ, l.ۤ᩸ᩳ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m5362(EnumC15251 enumC15251, C3141 c3141, Throwable th) {
        c3141.f5733 = false;
        if (c3141.f5730) {
            return;
        }
        long j = 600000;
        if (th == null) {
            int i = C7165.f18708[enumC15251.ordinal()];
            if (i == 1) {
                c3141.f5739 = 600000L;
            } else if (i == 2) {
                long j2 = c3141.f5739;
                c3141.f5739 = Math.min(3600000L, 2 * j2);
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
        c3141.f5737.getClass();
        c3141.f5732 = SystemClock.uptimeMillis() + j;
        if (enumC15251 == EnumC15251.COMPACTED) {
            C12412 c12412 = c3141.f5740;
            for (C8801 c8801 : (C8801[]) c12412.getSpans(0, c12412.length(), C8801.class)) {
                c8801.m20363(c3141.f5740);
            }
        }
        if (c3141.f5730) {
            return;
        }
        c3141.f5734.postDelayed(c3141.f5736, 2000L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f5730 = true;
        this.f5734.removeCallbacks(this.f5736);
    }
}
