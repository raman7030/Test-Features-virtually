package l;

import android.content.Context;
import android.os.Build;
import com.alipay.sdk.m.y.k;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۢ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E68Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C9255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10085 f28041;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C20177 f28042;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean f28043;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static EnumC20544 f28044;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f28045;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final boolean f28046;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f28047;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final boolean f28048;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f28049;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f28050;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Future f28051;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m23771() {
        if (f28044 != EnumC20544.FAILED) {
            return;
        }
        f28044 = EnumC20544.NONE;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized EnumC20544 m23773() {
        return f28044;
    }

    static {
        f28047 = new File("/system/bin/busybox").exists() || new File("/system/xbin/busybox").exists();
        f28048 = new File("/system/bin/toolbox").exists() || new File("/system/xbin/toolbox").exists();
        f28046 = new File("/system/bin/toybox").exists() || new File("/system/xbin/toybox").exists();
        f28041 = null;
        f28044 = EnumC20544.NONE;
        f28050 = 0L;
        f28045 = -1L;
        f28042 = new C20177();
        f28043 = true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m23781() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25345();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m23778() {
        EnumC23365 enumC23365;
        synchronized (C9255.class) {
            boolean z = f28049;
            if (z && m23781()) {
                return;
            }
            if (!z) {
                m23767();
                return;
            }
            if (m23779() || m23754()) {
                return;
            }
            synchronized (C9255.class) {
                if (f28049 && !m23781()) {
                    C6432 c6432M23775 = m23775();
                    if (c6432M23775 != null) {
                        f28045 = c6432M23775.f19882;
                    }
                    if (c6432M23775 == null) {
                        m23772(-1L, true);
                        return;
                    }
                    try {
                        c6432M23775.f19881.get(1200L, TimeUnit.MILLISECONDS);
                        enumC23365 = EnumC23365.COMPLETED;
                    } catch (InterruptedException e) {
                        C19926.m45875("Shell.auto recovery shizuku interrupted, generation=" + c6432M23775.f19882, e);
                        enumC23365 = EnumC23365.INTERRUPTED;
                    } catch (CancellationException unused) {
                        C19926.m45878("Shell.auto recovery shizuku canceled, generation=" + c6432M23775.f19882);
                        enumC23365 = EnumC23365.CANCELED;
                    } catch (ExecutionException e2) {
                        C19926.m45875("Shell.auto recovery shizuku error, generation=" + c6432M23775.f19882, e2);
                        enumC23365 = EnumC23365.FAILED;
                    } catch (TimeoutException unused2) {
                        C19926.m45878("Shell.auto recovery shizuku timeout, generation=" + c6432M23775.f19882);
                        enumC23365 = EnumC23365.TIMEOUT;
                    }
                    if (enumC23365 == EnumC23365.COMPLETED && m23762(c6432M23775.f19882)) {
                        return;
                    }
                    m23772(c6432M23775.f19882, enumC23365 != EnumC23365.TIMEOUT);
                    if (enumC23365 == EnumC23365.INTERRUPTED) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5 A[PHI: r5
      0x00d5: PHI (r5v2 l.ۤۚۢ) = (r5v1 l.ۤۚۢ), (r5v1 l.ۤۚۢ), (r5v1 l.ۤۚۢ), (r5v1 l.ۤۚۢ), (r5v10 l.ۤۚۢ), (r5v1 l.ۤۚۢ) binds: [B:27:0x0051, B:28:0x0053, B:30:0x005d, B:39:0x007f, B:37:0x007c, B:52:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x000d, B:10:0x0015, B:16:0x0023, B:29:0x0055, B:31:0x005f, B:33:0x0067, B:34:0x006c, B:40:0x0085, B:42:0x0089, B:58:0x00e2, B:62:0x00f4, B:64:0x00f9, B:63:0x00f7, B:65:0x00fc, B:43:0x00a5, B:45:0x00a9, B:47:0x00ad, B:52:0x00d0, B:39:0x007f, B:24:0x0049, B:18:0x002d, B:20:0x0033, B:21:0x0039, B:36:0x0072, B:49:0x00c4), top: B:123:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x000d, B:10:0x0015, B:16:0x0023, B:29:0x0055, B:31:0x005f, B:33:0x0067, B:34:0x006c, B:40:0x0085, B:42:0x0089, B:58:0x00e2, B:62:0x00f4, B:64:0x00f9, B:63:0x00f7, B:65:0x00fc, B:43:0x00a5, B:45:0x00a9, B:47:0x00ad, B:52:0x00d0, B:39:0x007f, B:24:0x0049, B:18:0x002d, B:20:0x0033, B:21:0x0039, B:36:0x0072, B:49:0x00c4), top: B:123:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m23767() {
        InterfaceC10085 c12906;
        long j;
        InterfaceC10085 c12907;
        long j2;
        Future future;
        boolean z;
        boolean z2;
        C19839 c19839;
        do {
            synchronized (C9255.class) {
                if (m23781()) {
                    return;
                }
                boolean z3 = true;
                boolean z4 = !C15871.m37616() && ApplicationC20075.m46266();
                if (z4 && ApplicationC20075.f65010.getBoolean("get_root", true)) {
                    try {
                        String strM31436 = C12925.m31436(false);
                        if (strM31436 == null) {
                            C19926.m45878("Shell.create su: Permission denied");
                            c12906 = null;
                        } else {
                            C19926.m45878("Shell.create ".concat(strM31436));
                            c12906 = new C12906(strM31436, true);
                        }
                    } catch (Throwable th) {
                        C19926.m45875("Shell.error", th);
                    }
                    if (c12906 != null) {
                        Future future2 = null;
                        j = -1;
                        c12907 = c12906;
                        j2 = -1;
                        future = future2;
                        z = true;
                    } else {
                        Future future3 = null;
                        j = -1;
                        c12907 = c12906;
                        j2 = -1;
                        future = future3;
                        z = true;
                    }
                    if (future == null) {
                        if (c12907 == null) {
                            C19926.m45878("Shell.create sh");
                            c12907 = new C12906("sh", false);
                        }
                        if (z) {
                            f28045 = -1L;
                        } else {
                            f28045 = -1L;
                        }
                        m23760(c12907, z);
                    }
                    if (future != null) {
                        future.get();
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C9255.class) {
                                if (j == f28050) {
                                }
                            }
                        }
                    } else {
                        C3468.m10611();
                        C11496.m28324();
                        if (j2 >= 0) {
                            m23762(j2);
                            return;
                        }
                        return;
                    }
                } else {
                    c12906 = null;
                    if (c12906 != null && z4 && ApplicationC20075.f65010.getBoolean("get_adb", true)) {
                        EnumC20544 enumC20544M23773 = m23773();
                        if (enumC20544M23773 == EnumC20544.FAILED) {
                            m23771();
                            enumC20544M23773 = EnumC20544.NONE;
                        }
                        if (C19839.m45627()) {
                            try {
                                C19926.m45878("Shell.create shizuku (reuse prewarm)");
                                c19839 = new C19839(true, false);
                                c12906 = c19839;
                            } catch (Throwable th2) {
                                C19926.m45875("Shell.error", th2);
                            }
                            Future future4 = null;
                            j = -1;
                            c12907 = c12906;
                            j2 = -1;
                            future = future4;
                            z = true;
                        } else if (enumC20544M23773 == EnumC20544.WAITING_BINDER) {
                            long j3 = f28050;
                            C19926.m45878("Shell.skip shizuku while prewarm waiting binder, generation=" + j3);
                            z = false;
                            j2 = j3;
                            c12907 = c12906;
                            future = null;
                            j = -1;
                        } else {
                            if (enumC20544M23773 == EnumC20544.WAITING_PERMISSION_OR_SERVICE && (future4 = f28051) != null) {
                                j = f28050;
                                C19926.m45878("Shell.wait shizuku prewarm, generation=" + j);
                            } else {
                                try {
                                    C19926.m45878("Shell.create shizuku (no wait binder)");
                                    c19839 = new C19839(true, false);
                                    c12906 = c19839;
                                } catch (Throwable th3) {
                                    C19926.m45875("Shell.error", th3);
                                }
                                Future future5 = null;
                                j = -1;
                            }
                            c12907 = c12906;
                            j2 = -1;
                            future = future5;
                            z = true;
                        }
                    } else {
                        Future future6 = null;
                        j = -1;
                        c12907 = c12906;
                        j2 = -1;
                        future = future6;
                        z = true;
                    }
                    if (future == null) {
                        if (c12907 == null) {
                            C19926.m45878("Shell.create sh");
                            c12907 = new C12906("sh", false);
                        }
                        if (z && j2 >= 0) {
                            f28045 = j2;
                        } else {
                            f28045 = -1L;
                        }
                        m23760(c12907, z);
                    }
                    if (future != null) {
                        try {
                            future.get();
                        } catch (InterruptedException e) {
                            C19926.m45875("Shell.wait shizuku prewarm interrupted, generation=" + j, e);
                            z2 = true;
                        } catch (CancellationException unused) {
                            C19926.m45878("Shell.wait shizuku prewarm canceled, generation=" + j);
                            z2 = false;
                        } catch (ExecutionException e2) {
                            C19926.m45875("Shell.wait shizuku prewarm error, generation=" + j, e2);
                        }
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C9255.class) {
                                if (j == f28050 && f28051 == null && f28041 == null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        C3468.m10611();
                        C11496.m28324();
                        if (j2 >= 0) {
                            m23762(j2);
                            return;
                        }
                        return;
                    }
                }
                throw th;
            }
        } while (!z2);
        synchronized (C9255.class) {
            if (m23781()) {
                Thread.currentThread().interrupt();
                return;
            }
            C19926.m45878("Shell.create sh");
            f28045 = j;
            m23760((InterfaceC10085) new C12906("sh", false), false);
            C3468.m10611();
            C11496.m28324();
            if (j >= 0) {
                m23762(j);
            }
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m23774() {
        synchronized (C9255.class) {
            if (m23781()) {
                return;
            }
            if (!C15871.m37616() && ApplicationC20075.m46266()) {
                boolean zEquals = true;
                if (ApplicationC20075.f65010.getBoolean("get_adb", true)) {
                    Future future = f28051;
                    if (future == null || future.isDone()) {
                        boolean z = ApplicationC20075.f65010.getBoolean("get_root", true);
                        String string = ApplicationC20075.f65010.getString("last_shell_backend", "app");
                        if (z) {
                            zEquals = "shizuku".equals(string);
                        }
                        if (zEquals) {
                            m23766();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C6432 m23775() {
        if (C15871.m37616() || !ApplicationC20075.m46266()) {
            return null;
        }
        if (!ApplicationC20075.f65010.getBoolean("get_adb", true)) {
            return null;
        }
        Future future = f28051;
        if (future != null && !future.isDone()) {
            return new C6432(f28050, future);
        }
        InterfaceC10085 interfaceC10085 = f28041;
        boolean z = (interfaceC10085 instanceof C19839) && !((C19839) interfaceC10085).mo25345();
        boolean z2 = ApplicationC20075.f65010.getBoolean("get_root", true);
        String string = ApplicationC20075.f65010.getString("last_shell_backend", "app");
        if (!z) {
            if (!(z2 ? "shizuku".equals(string) : true)) {
                return null;
            }
        }
        return m23766();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C6432 m23766() {
        final long j = f28050 + 1;
        f28050 = j;
        EnumC20544 enumC20544 = EnumC20544.WAITING_BINDER;
        f28044 = enumC20544;
        C19926.m45878("Shell.prewarm start, generation=" + j + ", state=" + enumC20544);
        f28042.getClass();
        Future<?> futureSubmit = C1802.f6208.submit(new Runnable() { // from class: l.ܿ֨ۢ
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                try {
                    C19926.m45878("Shell.prewarm shizuku, generation=" + j2);
                    C19839.m45618(new C14192(j2));
                    C9255.m23758(j2, true);
                } catch (Throwable th) {
                    try {
                        C19926.m45875("Shell.prewarm error, generation=" + j2, th);
                    } finally {
                        C9255.m23758(j2, false);
                    }
                }
            }
        });
        f28051 = futureSubmit;
        return new C6432(j, futureSubmit);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23757(long j, EnumC12782 enumC12782) {
        EnumC20544 enumC20544;
        synchronized (C9255.class) {
            if (j != f28050) {
                return;
            }
            if (enumC12782 == EnumC12782.WAITING_BINDER) {
                enumC20544 = EnumC20544.WAITING_BINDER;
            } else {
                enumC20544 = EnumC20544.WAITING_PERMISSION_OR_SERVICE;
            }
            if (f28044 == enumC20544) {
                return;
            }
            f28044 = enumC20544;
            C19926.m45878("Shell.prewarm stage=" + enumC20544 + ", generation=" + j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23758(long j, boolean z) {
        String str;
        InterfaceC10085 interfaceC10085;
        synchronized (C9255.class) {
            if (j != f28050) {
                C19926.m45878("Shell.prewarm result ignored: stale generation=" + j);
                return;
            }
            f28051 = null;
            f28044 = z ? EnumC20544.NONE : EnumC20544.FAILED;
            boolean z2 = (!z || (interfaceC10085 = f28041) == null || interfaceC10085.mo25346()) ? false : true;
            if (z2 && m23762(j)) {
                return;
            }
            synchronized (C9255.class) {
                if (f28045 != j) {
                    StringBuilder sb = new StringBuilder("Shell.prewarm result: ");
                    sb.append(z ? "success" : k.j);
                    sb.append(", generation=");
                    sb.append(j);
                    C19926.m45878(sb.toString());
                    return;
                }
                f28045 = -1L;
                InterfaceC10085 interfaceC10086 = f28041;
                if (interfaceC10086 != null) {
                    m23759(interfaceC10086);
                    StringBuilder sb2 = new StringBuilder("Shell.prewarm result: ");
                    sb2.append(z ? "success" : k.j);
                    sb2.append(", generation=");
                    sb2.append(j);
                    sb2.append(", backend=");
                    InterfaceC10085 interfaceC10087 = f28041;
                    if (interfaceC10087 == null) {
                        str = "app";
                    } else if (interfaceC10087.mo25347()) {
                        str = "root";
                    } else if (interfaceC10087.mo25348()) {
                        str = "shizuku";
                    } else {
                        str = "app";
                    }
                    sb2.append(str);
                    C19926.m45878(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Shell.prewarm result: ");
                    sb3.append(z ? "success" : k.j);
                    sb3.append(", generation=");
                    sb3.append(j);
                    sb3.append(", backend=app");
                    C19926.m45878(sb3.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23762(long j) {
        InterfaceC10085 interfaceC10085;
        synchronized (C9255.class) {
            if (j == f28050 && (interfaceC10085 = f28041) != null && !interfaceC10085.mo25346()) {
                if (!C19839.m45627()) {
                    return false;
                }
                try {
                    return m23763(j, new C19839(false, false), new RunnableC7281(2));
                } catch (IOException e) {
                    C19926.m45875("Shell.prewarm take over error, generation=" + j, e);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23763(long j, C19839 c19839, RunnableC7281 runnableC7281) {
        InterfaceC10085 interfaceC10085;
        boolean zM23765 = false;
        try {
            synchronized (C9255.class) {
                if (j == f28050 && (interfaceC10085 = f28041) != null && !interfaceC10085.mo25346()) {
                    zM23765 = m23765(c19839);
                    if (zM23765) {
                        synchronized (C9255.class) {
                            if (f28045 == j) {
                                f28045 = -1L;
                            }
                        }
                        C19926.m45878("Shell.prewarm result: success, generation=" + j + ", backend=shizuku");
                        runnableC7281.run();
                    }
                    if (!zM23765) {
                        c19839.close();
                    }
                    return zM23765;
                }
                c19839.close();
                return false;
            }
        } catch (Throwable th) {
            if (!zM23765) {
                c19839.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m23779() {
        C12906 c12906;
        synchronized (C9255.class) {
            if (f28049 && !m23781()) {
                boolean z = !C15871.m37616() && ApplicationC20075.m46266() && ApplicationC20075.f65010.getBoolean("get_root", true);
                if (z) {
                    try {
                        String strM31436 = C12925.m31436(false);
                        if (strM31436 == null) {
                            C19926.m45878("Shell.create su: Permission denied");
                            c12906 = null;
                        } else {
                            C19926.m45878("Shell.create ".concat(strM31436));
                            c12906 = new C12906(strM31436, true);
                        }
                    } catch (Throwable th) {
                        C19926.m45875("Shell.error", th);
                    }
                    if (c12906 != null) {
                        synchronized (C9255.class) {
                            if (f28049 && !m23781()) {
                                m23760((InterfaceC10085) c12906, true);
                                C3468.m10611();
                                C11496.m28324();
                                return true;
                            }
                            c12906.close();
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m23754() {
        synchronized (C9255.class) {
            if (f28049 && !m23781()) {
                if (!C15871.m37616() && ApplicationC20075.m46266() && ApplicationC20075.f65010.getBoolean("get_adb", true)) {
                    if (!C19839.m45627()) {
                        return false;
                    }
                    try {
                        C19839 c19839 = new C19839(false, false);
                        synchronized (C9255.class) {
                            if (f28049 && !m23781()) {
                                m23760((InterfaceC10085) c19839, true);
                                C3468.m10611();
                                C11496.m28324();
                                return true;
                            }
                            c19839.close();
                            return true;
                        }
                    } catch (IOException e) {
                        C19926.m45875("Shell.reuse shizuku error", e);
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23772(long j, boolean z) {
        synchronized (C9255.class) {
            if (f28049 && !m23781() && (j < 0 || j == f28050)) {
                if (!z) {
                    f28045 = j;
                } else if (f28045 == j) {
                    f28045 = -1L;
                }
                C19926.m45878("Shell.create sh");
                m23760(new C12906("sh", false), z);
                C3468.m10611();
                C11496.m28324();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23765(C19839 c19839) {
        boolean z;
        synchronized (C9255.class) {
            InterfaceC10085 interfaceC10085 = f28041;
            if (interfaceC10085 == null || !interfaceC10085.mo25346()) {
                m23760((InterfaceC10085) c19839, true);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C3468.m10611();
            C11496.m28324();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007d A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #1 {IOException -> 0x0092, blocks: (B:9:0x003a, B:11:0x0061, B:13:0x0067, B:15:0x0071, B:16:0x0074, B:18:0x007d, B:24:0x009e, B:26:0x010f, B:30:0x0149), top: B:36:0x0035 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x007d, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23760(InterfaceC10085 interfaceC10085, boolean z) {
        InterfaceC10085 interfaceC10086 = f28041;
        if (interfaceC10086 != null && interfaceC10086 != interfaceC10085) {
            interfaceC10086.close();
        }
        f28041 = interfaceC10085;
        f28049 = true;
        C19926.m45878("Shell.create success, uid=" + interfaceC10085.getUid());
        try {
            if (interfaceC10085.mo25347()) {
                C19926.m45878("Writing mtio");
                byte[] bArrM21646 = C8172.m21646("/assets/" + String.valueOf(m23777()));
                File file = new File(C4925.m14322(), "mtio");
                if (file.exists() && file.canExecute()) {
                    if (!Arrays.equals(bArrM21646, C20812.m47628(file))) {
                        C15843.m37503(file);
                        C15843.m37500(file, bArrM21646);
                        if (!file.setExecutable(true)) {
                            interfaceC10085.mo25343("chmod 755 " + file.getPath());
                        }
                    }
                } else {
                    C15843.m37500(file, bArrM21646);
                    if (!file.setExecutable(true)) {
                        interfaceC10085.mo25343("chmod 755 " + file.getPath());
                    }
                }
            } else if (interfaceC10085.mo25348()) {
                C19926.m45878("Writing mtio");
                byte[] bArrM21647 = C8172.m21646("/assets/" + String.valueOf(m23777()));
                File file2 = new File(C4925.f15522.getExternalCacheDir(), "mtio");
                C15843.m37500(file2, bArrM21647);
                String strConcat = "/data/local/tmp/".concat(C4925.m14337());
                String str = strConcat + "/mtio";
                C12201 c12201Mo25343 = interfaceC10085.mo25343("mkdir -p " + strConcat + " && cp -f " + file2.getAbsolutePath() + " " + str + " && chmod 711 " + str);
                if (c12201Mo25343.m29683()) {
                    C19926.m45878("Error: " + c12201Mo25343.f36414);
                    interfaceC10085.close();
                    C19926.m45878("Shell.create sh");
                    C12906 c12906 = new C12906("sh", false);
                    try {
                        f28041 = c12906;
                        C19926.m45878("Shell.create success, uid=" + c12906.getUid());
                        interfaceC10085 = c12906;
                        C15843.m37503(file2);
                    } catch (IOException unused) {
                        interfaceC10085 = c12906;
                    }
                } else {
                    C15843.m37503(file2);
                }
            }
        } catch (IOException unused2) {
        }
        if (z) {
            m23759(interfaceC10085);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23759(InterfaceC10085 interfaceC10085) {
        String str;
        if (ApplicationC20075.f65010 == null) {
            return;
        }
        if (interfaceC10085 == null) {
            str = "app";
        } else if (interfaceC10085.mo25347()) {
            str = "root";
        } else if (interfaceC10085.mo25348()) {
            str = "shizuku";
        } else {
            str = "app";
        }
        ApplicationC20075.f65010.edit().putString("last_shell_backend", str).apply();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10085 m23776() {
        return f28041;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m23780() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25347();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m23770() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25348();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m23768() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25346();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23761(C10666 c10666) {
        ArrayList arrayList = new ArrayList();
        if (f28047) {
            StringBuilder sbM9834 = C3200.m9834("busybox mount -o remount,", "rw", " ");
            sbM9834.append(c10666.f32082);
            sbM9834.append(" ");
            sbM9834.append(c10666.f32083);
            arrayList.add(sbM9834.toString());
            arrayList.add("busybox mount -o remount,rw " + c10666.f32083);
            arrayList.add("busybox mount -o rw,remount " + c10666.f32082);
            arrayList.add("busybox mount -o rw,remount " + c10666.f32083);
        }
        if (f28048) {
            StringBuilder sbM9835 = C3200.m9834("toolbox mount -o remount,", "rw", " ");
            sbM9835.append(c10666.f32082);
            sbM9835.append(" ");
            sbM9835.append(c10666.f32083);
            arrayList.add(sbM9835.toString());
            arrayList.add("toolbox mount -o remount,rw " + c10666.f32083);
            arrayList.add("toolbox mount -o rw,remount " + c10666.f32082);
            arrayList.add("toolbox mount -o rw,remount " + c10666.f32083);
        }
        if (f28046) {
            StringBuilder sbM9836 = C3200.m9834("toybox mount -o remount,", "rw", " ");
            sbM9836.append(c10666.f32082);
            sbM9836.append(" ");
            sbM9836.append(c10666.f32083);
            arrayList.add(sbM9836.toString());
            arrayList.add("toybox mount -o remount,rw " + c10666.f32083);
            arrayList.add("toybox mount -o rw,remount " + c10666.f32082);
            arrayList.add("toybox mount -o rw,remount " + c10666.f32083);
        }
        StringBuilder sbM9837 = C3200.m9834("mount -o remount,", "rw", " ");
        sbM9837.append(c10666.f32082);
        sbM9837.append(" ");
        sbM9837.append(c10666.f32083);
        arrayList.add(sbM9837.toString());
        arrayList.add("mount -o remount,rw " + c10666.f32083);
        arrayList.add("mount -o rw,remount " + c10666.f32082);
        arrayList.add("mount -o rw,remount " + c10666.f32083);
        f28041.mo25343(C9679.m24609(arrayList, "\n"));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C12201 m23769() {
        if (m23780()) {
            return f28041.mo25343("cat /proc/mounts");
        }
        try {
            File file = new File("/proc/mounts");
            Charset charset = StandardCharsets.UTF_8;
            return new C12201("", (String[]) C15843.m37506(file).toArray(new String[0]));
        } catch (IOException e) {
            return new C12201(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m23777() {
        ArrayList<String> arrayList = new ArrayList();
        Collections.addAll(arrayList, Build.SUPPORTED_ABIS);
        for (String str : arrayList) {
            str.getClass();
            switch (str) {
                case "x86_64":
                    return 4;
                case "x86":
                    return 3;
                case "armeabi-v7a":
                    return 0;
                case "arm64-v8a":
                    return 2;
                default:
                    break;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23755(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ("`!#$&*(){}|[]\\ ;\"'<>?".indexOf(c) != -1) {
                sb.append('\\');
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23756() {
        Future future;
        InterfaceC10085 interfaceC10085;
        synchronized (C9255.class) {
            future = f28051;
            f28051 = null;
            f28044 = EnumC20544.NONE;
            interfaceC10085 = f28041;
            if (f28045 >= 0 && interfaceC10085 != null) {
                m23759(interfaceC10085);
            }
            f28045 = -1L;
            f28050++;
            f28041 = null;
            f28049 = false;
        }
        if (future != null) {
            future.cancel(true);
        }
        if (interfaceC10085 != null) {
            interfaceC10085.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23764(Context context) {
        if (C21769.m49098(context)) {
            return true;
        }
        if (!m23768()) {
            return false;
        }
        String str = "pm grant " + context.getPackageName() + " android.permission.SYSTEM_ALERT_WINDOW";
        if (f28043) {
            if (f28041.mo25342(2000L, str).f36414.isEmpty() && C21769.m49098(context)) {
                return true;
            }
            f28043 = false;
        }
        return false;
    }
}
