package p067l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۤ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11835 {
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EDGE_INSN: B:59:0x0080->B:41:0x0080 BREAK  A[LOOP:0: B:33:0x006a->B:62:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m27132(boolean z, C15856 c15856) {
        boolean zM27133;
        boolean z2;
        long jMax;
        long millis;
        boolean z3 = false;
        if (!C24433.m53918()) {
            if (c15856 != null && z) {
                C11164.m25758(c15856.f45931, EnumC14516.WAITING_BINDER);
            }
            if (!z) {
                zM27133 = C24433.m53925();
            } else {
                zM27133 = m27133();
            }
            if (zM27133) {
                if (c15856 != null) {
                    C11164.m25758(c15856.f45931, EnumC14516.WAITING_PERMISSION_OR_SERVICE);
                }
                if (m27131() == EnumC5129.GRANTED) {
                    return true;
                }
                C6470 c6470 = new C6470();
                C24433.m53908(c6470);
                try {
                    try {
                        C24433.m53920(21320);
                    } catch (RuntimeException unused) {
                        if (m27133()) {
                            try {
                                C24433.m53920(21320);
                            } catch (RuntimeException unused2) {
                                z2 = false;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            C24433.m53915(c6470);
                            return false;
                        }
                        jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                        while (!c6470.m14837()) {
                            if (!c6470.m14835()) {
                                if (m27131() == EnumC5129.GRANTED) {
                                    break;
                                }
                                millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                                if (millis <= 0) {
                                }
                            }
                            C24433.m53915(c6470);
                            return z3;
                        }
                        z3 = true;
                        C24433.m53915(c6470);
                        return z3;
                    }
                    z2 = true;
                    if (!z2) {
                        C24433.m53915(c6470);
                        return false;
                    }
                    jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                    while (!c6470.m14837()) {
                        if (!c6470.m14835()) {
                            if (m27131() == EnumC5129.GRANTED) {
                                break;
                                break;
                            }
                            millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                            if (millis <= 0 && c6470.m14836(Math.min(Math.max(1L, 200L), millis))) {
                            }
                        }
                        C24433.m53915(c6470);
                        return z3;
                    }
                    z3 = true;
                    C24433.m53915(c6470);
                    return z3;
                } catch (Throwable th) {
                    C24433.m53915(c6470);
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5129 m27131() {
        try {
            if (C24433.m53913() == 0) {
                return EnumC5129.GRANTED;
            }
            return EnumC5129.REQUESTABLE;
        } catch (RuntimeException unused) {
            return C24433.m53925() ? EnumC5129.REQUESTABLE : EnumC5129.NOT_READY;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m27133() {
        long jMax = Math.max(0L, 5000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        while (!C24433.m53925()) {
            long millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            if (millis <= 0) {
                return false;
            }
            try {
                Thread.sleep(Math.min(Math.max(1L, 200L), millis));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return true;
    }
}
