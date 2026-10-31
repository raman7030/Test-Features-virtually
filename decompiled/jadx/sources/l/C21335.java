package l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.᩸ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes4.dex */
public final class C21335 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f68758 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48368(C10402 c10402, C16828 c16828) {
        C11813 c11813M39590 = c16828.m39590();
        if (c11813M39590 != null) {
            c10402.m26232(c11813M39590);
            c10402.setTag(null);
            return;
        }
        C17534 c17534M39598 = c16828.m39598();
        if (c17534M39598 != null) {
            C19883 c19883M9975 = c17534M39598.m40975() ? C19883.f64181 : C3256.m9975(new C15688(C9523.m24404(c16828.m39588()), "/", null, 0L, 0L, true));
            C11813 c11813 = c19883M9975.f64250;
            c16828.m39585(c19883M9975, c11813);
            c10402.m26232(c11813);
            c10402.setTag(null);
            return;
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(c16828.m39588(), new String[0]);
        if (!abstractC15440M39866.mo36530()) {
            C19883 c19883M39597 = c16828.m39597();
            if (c19883M39597 == null) {
                c19883M39597 = C19883.f64236;
            }
            c10402.m26232(c19883M39597.f64250);
            C22040 c22040M45867 = C19924.m45867(c16828);
            c10402.setTag(c22040M45867.m49585());
            C19924.m45869(c16828, c22040M45867, c10402);
            if (c22040M45867.m49587()) {
                C1802.f6208.submit(new RunnableC14983(c16828, abstractC15440M39866, c22040M45867));
                return;
            }
            return;
        }
        C9555 c9555 = abstractC15440M39866.mo23120() ? new C9555(abstractC15440M39866) : null;
        if (c9555 == null) {
            C19883 c19883 = C19883.f64236;
            C11813 c11814 = c19883.f64250;
            c16828.m39585(c19883, c11814);
            c10402.m26232(c11814);
            c10402.setTag(null);
            return;
        }
        C20844 c20844 = C20844.f67485;
        C19883 c19883Mo11258 = c20844.mo11258(c9555);
        c16828.m39584(c19883Mo11258);
        C11813 c11815 = c19883Mo11258.f64250;
        c10402.m26232(c11815);
        int iMo9351 = c20844.mo9351(c9555);
        if (iMo9351 == 0) {
            c16828.m39585(c19883Mo11258, c11815);
            c10402.setTag(null);
            return;
        }
        C22040 c22040M45868 = C19924.m45867(c16828);
        c10402.setTag(c22040M45868.m49585());
        C19924.m45869(c16828, c22040M45868, c10402);
        if (c22040M45868.m49587()) {
            f68758.submit(new RunnableC5106(c16828, c9555, iMo9351, c19883Mo11258, c22040M45868));
        }
    }
}
