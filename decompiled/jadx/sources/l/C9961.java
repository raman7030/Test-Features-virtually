package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۤ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9961 {
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:19:0x003e, B:32:0x0057, B:33:0x006a, B:36:0x0071, B:39:0x0078, B:42:0x0082, B:45:0x0093, B:23:0x0044, B:26:0x004b), top: B:52:0x003e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EDGE_INSN: B:59:0x0080->B:41:0x0080 BREAK  A[LOOP:0: B:33:0x006a->B:62:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25115(boolean z, C14192 c14192) {
        boolean zM25116;
        boolean z2;
        long jMax;
        long millis;
        boolean z3 = false;
        if (!C23216.m51521()) {
            if (c14192 != null && z) {
                C9255.m23757(c14192.f42844, EnumC12782.WAITING_BINDER);
            }
            if (!z) {
                zM25116 = C23216.m51528();
            } else {
                zM25116 = m25116();
            }
            if (zM25116) {
                if (c14192 != null) {
                    C9255.m23757(c14192.f42844, EnumC12782.WAITING_PERMISSION_OR_SERVICE);
                }
                if (m25114() == EnumC2905.GRANTED) {
                    return true;
                }
                C4316 c4316 = new C4316();
                C23216.m51511(c4316);
                try {
                    try {
                        C23216.m51523(21320);
                    } catch (RuntimeException unused) {
                        if (m25116()) {
                            try {
                                C23216.m51523(21320);
                            } catch (RuntimeException unused2) {
                                z2 = false;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            C23216.m51518(c4316);
                            return false;
                        }
                        jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                        while (!c4316.m12973()) {
                            if (!c4316.m12971()) {
                                if (m25114() == EnumC2905.GRANTED) {
                                    break;
                                }
                                millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                                if (millis <= 0) {
                                }
                            }
                            C23216.m51518(c4316);
                            return z3;
                        }
                        z3 = true;
                        C23216.m51518(c4316);
                        return z3;
                    }
                    z2 = true;
                    if (!z2) {
                        C23216.m51518(c4316);
                        return false;
                    }
                    jMax = Math.max(0L, 10000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                    while (!c4316.m12973()) {
                        if (!c4316.m12971()) {
                            if (m25114() == EnumC2905.GRANTED) {
                                break;
                                break;
                            }
                            millis = jMax - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                            if (millis <= 0 && c4316.m12972(Math.min(Math.max(1L, 200L), millis))) {
                            }
                        }
                        C23216.m51518(c4316);
                        return z3;
                    }
                    z3 = true;
                    C23216.m51518(c4316);
                    return z3;
                } catch (Throwable th) {
                    C23216.m51518(c4316);
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2905 m25114() {
        try {
            if (C23216.m51516() == 0) {
                return EnumC2905.GRANTED;
            }
            return EnumC2905.REQUESTABLE;
        } catch (RuntimeException unused) {
            return C23216.m51528() ? EnumC2905.REQUESTABLE : EnumC2905.NOT_READY;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m25116() {
        long jMax = Math.max(0L, 5000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        while (!C23216.m51528()) {
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
