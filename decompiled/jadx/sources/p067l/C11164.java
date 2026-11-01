package p067l;

import android.content.Context;
import android.os.Build;
import com.alipay.sdk.p010m.p058y.C0248k;
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
public final class C11164 {

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC11953 f30987;

    /* JADX INFO: renamed from: ۜ */
    public static C21545 f30988;

    /* JADX INFO: renamed from: ۡ */
    public static boolean f30989;

    /* JADX INFO: renamed from: ۢ */
    public static EnumC21893 f30990;

    /* JADX INFO: renamed from: ۧ */
    public static long f30991;

    /* JADX INFO: renamed from: ܳ */
    public static final boolean f30992;

    /* JADX INFO: renamed from: ܽ */
    public static final boolean f30993;

    /* JADX INFO: renamed from: ܿ */
    public static final boolean f30994;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f30995;

    /* JADX INFO: renamed from: ᩷ */
    public static long f30996;

    /* JADX INFO: renamed from: ᩻ */
    public static Future f30997;

    /* JADX INFO: renamed from: ۧ */
    public static synchronized void m25772() {
        if (f30990 != EnumC21893.FAILED) {
            return;
        }
        f30990 = EnumC21893.NONE;
    }

    /* JADX INFO: renamed from: ܳ */
    public static synchronized EnumC21893 m25774() {
        return f30990;
    }

    static {
        f30993 = new File("/system/bin/busybox").exists() || new File("/system/xbin/busybox").exists();
        f30994 = new File("/system/bin/toolbox").exists() || new File("/system/xbin/toolbox").exists();
        f30992 = new File("/system/bin/toybox").exists() || new File("/system/xbin/toybox").exists();
        f30987 = null;
        f30990 = EnumC21893.NONE;
        f30996 = 0L;
        f30991 = -1L;
        f30988 = new C21545();
        f30989 = true;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m25782() {
        InterfaceC11953 interfaceC11953 = f30987;
        return interfaceC11953 != null && interfaceC11953.mo27364();
    }

    /* JADX INFO: renamed from: ᩴ */
    public static void m25779() {
        EnumC24574 enumC24574;
        synchronized (C11164.class) {
            boolean z = f30995;
            if (z && m25782()) {
                return;
            }
            if (!z) {
                m25768();
                return;
            }
            if (m25780() || m25755()) {
                return;
            }
            synchronized (C11164.class) {
                if (f30995 && !m25782()) {
                    C8481 c8481M25776 = m25776();
                    if (c8481M25776 != null) {
                        f30991 = c8481M25776.f22754;
                    }
                    if (c8481M25776 == null) {
                        m25773(-1L, true);
                        return;
                    }
                    try {
                        c8481M25776.f22753.get(1200L, TimeUnit.MILLISECONDS);
                        enumC24574 = EnumC24574.COMPLETED;
                    } catch (InterruptedException e) {
                        C21306.m48188("Shell.auto recovery shizuku interrupted, generation=" + c8481M25776.f22754, e);
                        enumC24574 = EnumC24574.INTERRUPTED;
                    } catch (CancellationException unused) {
                        C21306.m48191("Shell.auto recovery shizuku canceled, generation=" + c8481M25776.f22754);
                        enumC24574 = EnumC24574.CANCELED;
                    } catch (ExecutionException e2) {
                        C21306.m48188("Shell.auto recovery shizuku error, generation=" + c8481M25776.f22754, e2);
                        enumC24574 = EnumC24574.FAILED;
                    } catch (TimeoutException unused2) {
                        C21306.m48191("Shell.auto recovery shizuku timeout, generation=" + c8481M25776.f22754);
                        enumC24574 = EnumC24574.TIMEOUT;
                    }
                    if (enumC24574 == EnumC24574.COMPLETED && m25763(c8481M25776.f22754)) {
                        return;
                    }
                    m25773(c8481M25776.f22754, enumC24574 != EnumC24574.TIMEOUT);
                    if (enumC24574 == EnumC24574.INTERRUPTED) {
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
    /* JADX INFO: renamed from: ۘ */
    public static void m25768() {
        InterfaceC11953 c14634;
        long j;
        InterfaceC11953 c14635;
        long j2;
        Future future;
        boolean z;
        boolean z2;
        C21223 c21223;
        do {
            synchronized (C11164.class) {
                if (m25782()) {
                    return;
                }
                boolean z3 = true;
                boolean z4 = !C17452.m39788() && ApplicationC21448.m48582();
                if (z4 && ApplicationC21448.f67650.getBoolean("get_root", true)) {
                    try {
                        String strM33522 = C14652.m33522(false);
                        if (strM33522 == null) {
                            C21306.m48191("Shell.create su: Permission denied");
                            c14634 = null;
                        } else {
                            C21306.m48191("Shell.create ".concat(strM33522));
                            c14634 = new C14634(strM33522, true);
                        }
                    } catch (Throwable th) {
                        C21306.m48188("Shell.error", th);
                    }
                    if (c14634 != null) {
                        Future future2 = null;
                        j = -1;
                        c14635 = c14634;
                        j2 = -1;
                        future = future2;
                        z = true;
                    } else {
                        Future future3 = null;
                        j = -1;
                        c14635 = c14634;
                        j2 = -1;
                        future = future3;
                        z = true;
                    }
                    if (future == null) {
                        if (c14635 == null) {
                            C21306.m48191("Shell.create sh");
                            c14635 = new C14634("sh", false);
                        }
                        if (z) {
                            f30991 = -1L;
                        } else {
                            f30991 = -1L;
                        }
                        m25761(c14635, z);
                    }
                    if (future != null) {
                        future.get();
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C11164.class) {
                                if (j == f30996) {
                                }
                            }
                        }
                    } else {
                        C5665.m12619();
                        C13294.m30368();
                        if (j2 >= 0) {
                            m25763(j2);
                            return;
                        }
                        return;
                    }
                } else {
                    c14634 = null;
                    if (c14634 != null && z4 && ApplicationC21448.f67650.getBoolean("get_adb", true)) {
                        EnumC21893 enumC21893M25774 = m25774();
                        if (enumC21893M25774 == EnumC21893.FAILED) {
                            m25772();
                            enumC21893M25774 = EnumC21893.NONE;
                        }
                        if (C21223.m47938()) {
                            try {
                                C21306.m48191("Shell.create shizuku (reuse prewarm)");
                                c21223 = new C21223(true, false);
                                c14634 = c21223;
                            } catch (Throwable th2) {
                                C21306.m48188("Shell.error", th2);
                            }
                            Future future4 = null;
                            j = -1;
                            c14635 = c14634;
                            j2 = -1;
                            future = future4;
                            z = true;
                        } else if (enumC21893M25774 == EnumC21893.WAITING_BINDER) {
                            long j3 = f30996;
                            C21306.m48191("Shell.skip shizuku while prewarm waiting binder, generation=" + j3);
                            z = false;
                            j2 = j3;
                            c14635 = c14634;
                            future = null;
                            j = -1;
                        } else {
                            if (enumC21893M25774 == EnumC21893.WAITING_PERMISSION_OR_SERVICE && (future4 = f30997) != null) {
                                j = f30996;
                                C21306.m48191("Shell.wait shizuku prewarm, generation=" + j);
                            } else {
                                try {
                                    C21306.m48191("Shell.create shizuku (no wait binder)");
                                    c21223 = new C21223(true, false);
                                    c14634 = c21223;
                                } catch (Throwable th3) {
                                    C21306.m48188("Shell.error", th3);
                                }
                                Future future5 = null;
                                j = -1;
                            }
                            c14635 = c14634;
                            j2 = -1;
                            future = future5;
                            z = true;
                        }
                    } else {
                        Future future6 = null;
                        j = -1;
                        c14635 = c14634;
                        j2 = -1;
                        future = future6;
                        z = true;
                    }
                    if (future == null) {
                        if (c14635 == null) {
                            C21306.m48191("Shell.create sh");
                            c14635 = new C14634("sh", false);
                        }
                        if (z && j2 >= 0) {
                            f30991 = j2;
                        } else {
                            f30991 = -1L;
                        }
                        m25761(c14635, z);
                    }
                    if (future != null) {
                        try {
                            future.get();
                        } catch (InterruptedException e) {
                            C21306.m48188("Shell.wait shizuku prewarm interrupted, generation=" + j, e);
                            z2 = true;
                        } catch (CancellationException unused) {
                            C21306.m48191("Shell.wait shizuku prewarm canceled, generation=" + j);
                            z2 = false;
                        } catch (ExecutionException e2) {
                            C21306.m48188("Shell.wait shizuku prewarm error, generation=" + j, e2);
                        }
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C11164.class) {
                                if (j == f30996 && f30997 == null && f30987 == null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        C5665.m12619();
                        C13294.m30368();
                        if (j2 >= 0) {
                            m25763(j2);
                            return;
                        }
                        return;
                    }
                }
                throw th;
            }
        } while (!z2);
        synchronized (C11164.class) {
            if (m25782()) {
                Thread.currentThread().interrupt();
                return;
            }
            C21306.m48191("Shell.create sh");
            f30991 = j;
            m25761((InterfaceC11953) new C14634("sh", false), false);
            C5665.m12619();
            C13294.m30368();
            if (j >= 0) {
                m25763(j);
            }
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m25775() {
        synchronized (C11164.class) {
            if (m25782()) {
                return;
            }
            if (!C17452.m39788() && ApplicationC21448.m48582()) {
                boolean zEquals = true;
                if (ApplicationC21448.f67650.getBoolean("get_adb", true)) {
                    Future future = f30997;
                    if (future == null || future.isDone()) {
                        boolean z = ApplicationC21448.f67650.getBoolean("get_root", true);
                        String string = ApplicationC21448.f67650.getString("last_shell_backend", "app");
                        if (z) {
                            zEquals = "shizuku".equals(string);
                        }
                        if (zEquals) {
                            m25767();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C8481 m25776() {
        if (C17452.m39788() || !ApplicationC21448.m48582()) {
            return null;
        }
        if (!ApplicationC21448.f67650.getBoolean("get_adb", true)) {
            return null;
        }
        Future future = f30997;
        if (future != null && !future.isDone()) {
            return new C8481(f30996, future);
        }
        InterfaceC11953 interfaceC11953 = f30987;
        boolean z = (interfaceC11953 instanceof C21223) && !((C21223) interfaceC11953).mo27364();
        boolean z2 = ApplicationC21448.f67650.getBoolean("get_root", true);
        String string = ApplicationC21448.f67650.getString("last_shell_backend", "app");
        if (!z) {
            if (!(z2 ? "shizuku".equals(string) : true)) {
                return null;
            }
        }
        return m25767();
    }

    /* JADX INFO: renamed from: ۖ */
    public static C8481 m25767() {
        final long j = f30996 + 1;
        f30996 = j;
        EnumC21893 enumC21893 = EnumC21893.WAITING_BINDER;
        f30990 = enumC21893;
        C21306.m48191("Shell.prewarm start, generation=" + j + ", state=" + enumC21893);
        f30988.getClass();
        Future<?> futureSubmit = C4081.f8987.submit(new Runnable() { // from class: l.ܿ֨ۢ
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                try {
                    C21306.m48191("Shell.prewarm shizuku, generation=" + j2);
                    C21223.m47929(new C15856(j2));
                    C11164.m25759(j2, true);
                } catch (Throwable th) {
                    try {
                        C21306.m48188("Shell.prewarm error, generation=" + j2, th);
                    } finally {
                        C11164.m25759(j2, false);
                    }
                }
            }
        });
        f30997 = futureSubmit;
        return new C8481(j, futureSubmit);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m25758(long j, EnumC14516 enumC14516) {
        EnumC21893 enumC21893;
        synchronized (C11164.class) {
            if (j != f30996) {
                return;
            }
            if (enumC14516 == EnumC14516.WAITING_BINDER) {
                enumC21893 = EnumC21893.WAITING_BINDER;
            } else {
                enumC21893 = EnumC21893.WAITING_PERMISSION_OR_SERVICE;
            }
            if (f30990 == enumC21893) {
                return;
            }
            f30990 = enumC21893;
            C21306.m48191("Shell.prewarm stage=" + enumC21893 + ", generation=" + j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX INFO: renamed from: ֫ */
    public static void m25759(long j, boolean z) {
        String str;
        InterfaceC11953 interfaceC11953;
        synchronized (C11164.class) {
            if (j != f30996) {
                C21306.m48191("Shell.prewarm result ignored: stale generation=" + j);
                return;
            }
            f30997 = null;
            f30990 = z ? EnumC21893.NONE : EnumC21893.FAILED;
            boolean z2 = (!z || (interfaceC11953 = f30987) == null || interfaceC11953.mo27365()) ? false : true;
            if (z2 && m25763(j)) {
                return;
            }
            synchronized (C11164.class) {
                if (f30991 != j) {
                    StringBuilder sb = new StringBuilder("Shell.prewarm result: ");
                    sb.append(z ? "success" : C0248k.f1176j);
                    sb.append(", generation=");
                    sb.append(j);
                    C21306.m48191(sb.toString());
                    return;
                }
                f30991 = -1L;
                InterfaceC11953 interfaceC11954 = f30987;
                if (interfaceC11954 != null) {
                    m25760(interfaceC11954);
                    StringBuilder sb2 = new StringBuilder("Shell.prewarm result: ");
                    sb2.append(z ? "success" : C0248k.f1176j);
                    sb2.append(", generation=");
                    sb2.append(j);
                    sb2.append(", backend=");
                    InterfaceC11953 interfaceC11955 = f30987;
                    if (interfaceC11955 == null) {
                        str = "app";
                    } else if (interfaceC11955.mo27366()) {
                        str = "root";
                    } else if (interfaceC11955.mo27367()) {
                        str = "shizuku";
                    } else {
                        str = "app";
                    }
                    sb2.append(str);
                    C21306.m48191(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Shell.prewarm result: ");
                    sb3.append(z ? "success" : C0248k.f1176j);
                    sb3.append(", generation=");
                    sb3.append(j);
                    sb3.append(", backend=app");
                    C21306.m48191(sb3.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25763(long j) {
        InterfaceC11953 interfaceC11953;
        synchronized (C11164.class) {
            if (j == f30996 && (interfaceC11953 = f30987) != null && !interfaceC11953.mo27365()) {
                if (!C21223.m47938()) {
                    return false;
                }
                try {
                    return m25764(j, new C21223(false, false), new RunnableC9288(2));
                } catch (IOException e) {
                    C21306.m48188("Shell.prewarm take over error, generation=" + j, e);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25764(long j, C21223 c21223, RunnableC9288 runnableC9288) {
        InterfaceC11953 interfaceC11953;
        boolean zM25766 = false;
        try {
            synchronized (C11164.class) {
                if (j == f30996 && (interfaceC11953 = f30987) != null && !interfaceC11953.mo27365()) {
                    zM25766 = m25766(c21223);
                    if (zM25766) {
                        synchronized (C11164.class) {
                            if (f30991 == j) {
                                f30991 = -1L;
                            }
                        }
                        C21306.m48191("Shell.prewarm result: success, generation=" + j + ", backend=shizuku");
                        runnableC9288.run();
                    }
                    if (!zM25766) {
                        c21223.close();
                    }
                    return zM25766;
                }
                c21223.close();
                return false;
            }
        } catch (Throwable th) {
            if (!zM25766) {
                c21223.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public static boolean m25780() {
        C14634 c14634;
        synchronized (C11164.class) {
            if (f30995 && !m25782()) {
                boolean z = !C17452.m39788() && ApplicationC21448.m48582() && ApplicationC21448.f67650.getBoolean("get_root", true);
                if (z) {
                    try {
                        String strM33522 = C14652.m33522(false);
                        if (strM33522 == null) {
                            C21306.m48191("Shell.create su: Permission denied");
                            c14634 = null;
                        } else {
                            C21306.m48191("Shell.create ".concat(strM33522));
                            c14634 = new C14634(strM33522, true);
                        }
                    } catch (Throwable th) {
                        C21306.m48188("Shell.error", th);
                    }
                    if (c14634 != null) {
                        synchronized (C11164.class) {
                            if (f30995 && !m25782()) {
                                m25761((InterfaceC11953) c14634, true);
                                C5665.m12619();
                                C13294.m30368();
                                return true;
                            }
                            c14634.close();
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public static boolean m25755() {
        synchronized (C11164.class) {
            if (f30995 && !m25782()) {
                if (!C17452.m39788() && ApplicationC21448.m48582() && ApplicationC21448.f67650.getBoolean("get_adb", true)) {
                    if (!C21223.m47938()) {
                        return false;
                    }
                    try {
                        C21223 c21223 = new C21223(false, false);
                        synchronized (C11164.class) {
                            if (f30995 && !m25782()) {
                                m25761((InterfaceC11953) c21223, true);
                                C5665.m12619();
                                C13294.m30368();
                                return true;
                            }
                            c21223.close();
                            return true;
                        }
                    } catch (IOException e) {
                        C21306.m48188("Shell.reuse shizuku error", e);
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25773(long j, boolean z) {
        synchronized (C11164.class) {
            if (f30995 && !m25782() && (j < 0 || j == f30996)) {
                if (!z) {
                    f30991 = j;
                } else if (f30991 == j) {
                    f30991 = -1L;
                }
                C21306.m48191("Shell.create sh");
                m25761(new C14634("sh", false), z);
                C5665.m12619();
                C13294.m30368();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25766(C21223 c21223) {
        boolean z;
        synchronized (C11164.class) {
            InterfaceC11953 interfaceC11953 = f30987;
            if (interfaceC11953 == null || !interfaceC11953.mo27365()) {
                m25761((InterfaceC11953) c21223, true);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C5665.m12619();
            C13294.m30368();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007d A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #1 {IOException -> 0x0092, blocks: (B:9:0x003a, B:11:0x0061, B:13:0x0067, B:15:0x0071, B:16:0x0074, B:18:0x007d, B:24:0x009e, B:26:0x010f, B:30:0x0149), top: B:36:0x0035 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x007d, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public static void m25761(InterfaceC11953 interfaceC11953, boolean z) {
        InterfaceC11953 interfaceC11954 = f30987;
        if (interfaceC11954 != null && interfaceC11954 != interfaceC11953) {
            interfaceC11954.close();
        }
        f30987 = interfaceC11953;
        f30995 = true;
        C21306.m48191("Shell.create success, uid=" + interfaceC11953.getUid());
        try {
            if (interfaceC11953.mo27366()) {
                C21306.m48191("Writing mtio");
                byte[] bArrM23615 = C10135.m23615("/assets/" + String.valueOf(m25778()));
                File file = new File(C7050.m16219(), "mtio");
                if (file.exists() && file.canExecute()) {
                    if (!Arrays.equals(bArrM23615, C22148.m49956(file))) {
                        C17425.m39675(file);
                        C17425.m39672(file, bArrM23615);
                        if (!file.setExecutable(true)) {
                            interfaceC11953.mo27362("chmod 755 " + file.getPath());
                        }
                    }
                } else {
                    C17425.m39672(file, bArrM23615);
                    if (!file.setExecutable(true)) {
                        interfaceC11953.mo27362("chmod 755 " + file.getPath());
                    }
                }
            } else if (interfaceC11953.mo27367()) {
                C21306.m48191("Writing mtio");
                byte[] bArrM23616 = C10135.m23615("/assets/" + String.valueOf(m25778()));
                File file2 = new File(C7050.f18354.getExternalCacheDir(), "mtio");
                C17425.m39672(file2, bArrM23616);
                String strConcat = "/data/local/tmp/".concat(C7050.m16234());
                String str = strConcat + "/mtio";
                C13964 c13964Mo27362 = interfaceC11953.mo27362("mkdir -p " + strConcat + " && cp -f " + file2.getAbsolutePath() + " " + str + " && chmod 711 " + str);
                if (c13964Mo27362.m31745()) {
                    C21306.m48191("Error: " + c13964Mo27362.f39429);
                    interfaceC11953.close();
                    C21306.m48191("Shell.create sh");
                    C14634 c14634 = new C14634("sh", false);
                    try {
                        f30987 = c14634;
                        C21306.m48191("Shell.create success, uid=" + c14634.getUid());
                        interfaceC11953 = c14634;
                        C17425.m39675(file2);
                    } catch (IOException unused) {
                        interfaceC11953 = c14634;
                    }
                } else {
                    C17425.m39675(file2);
                }
            }
        } catch (IOException unused2) {
        }
        if (z) {
            m25760(interfaceC11953);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX INFO: renamed from: ֫ */
    public static void m25760(InterfaceC11953 interfaceC11953) {
        String str;
        if (ApplicationC21448.f67650 == null) {
            return;
        }
        if (interfaceC11953 == null) {
            str = "app";
        } else if (interfaceC11953.mo27366()) {
            str = "root";
        } else if (interfaceC11953.mo27367()) {
            str = "shizuku";
        } else {
            str = "app";
        }
        ApplicationC21448.f67650.edit().putString("last_shell_backend", str).apply();
    }

    /* JADX INFO: renamed from: ܿ */
    public static InterfaceC11953 m25777() {
        return f30987;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m25781() {
        InterfaceC11953 interfaceC11953 = f30987;
        return interfaceC11953 != null && interfaceC11953.mo27366();
    }

    /* JADX INFO: renamed from: ۢ */
    public static boolean m25771() {
        InterfaceC11953 interfaceC11953 = f30987;
        return interfaceC11953 != null && interfaceC11953.mo27367();
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m25769() {
        InterfaceC11953 interfaceC11953 = f30987;
        return interfaceC11953 != null && interfaceC11953.mo27365();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25762(C12505 c12505) {
        ArrayList arrayList = new ArrayList();
        if (f30993) {
            StringBuilder sbM11879 = C5410.m11879("busybox mount -o remount,", "rw", " ");
            sbM11879.append(c12505.f35053);
            sbM11879.append(" ");
            sbM11879.append(c12505.f35054);
            arrayList.add(sbM11879.toString());
            arrayList.add("busybox mount -o remount,rw " + c12505.f35054);
            arrayList.add("busybox mount -o rw,remount " + c12505.f35053);
            arrayList.add("busybox mount -o rw,remount " + c12505.f35054);
        }
        if (f30994) {
            StringBuilder sbM118710 = C5410.m11879("toolbox mount -o remount,", "rw", " ");
            sbM118710.append(c12505.f35053);
            sbM118710.append(" ");
            sbM118710.append(c12505.f35054);
            arrayList.add(sbM118710.toString());
            arrayList.add("toolbox mount -o remount,rw " + c12505.f35054);
            arrayList.add("toolbox mount -o rw,remount " + c12505.f35053);
            arrayList.add("toolbox mount -o rw,remount " + c12505.f35054);
        }
        if (f30992) {
            StringBuilder sbM118711 = C5410.m11879("toybox mount -o remount,", "rw", " ");
            sbM118711.append(c12505.f35053);
            sbM118711.append(" ");
            sbM118711.append(c12505.f35054);
            arrayList.add(sbM118711.toString());
            arrayList.add("toybox mount -o remount,rw " + c12505.f35054);
            arrayList.add("toybox mount -o rw,remount " + c12505.f35053);
            arrayList.add("toybox mount -o rw,remount " + c12505.f35054);
        }
        StringBuilder sbM118712 = C5410.m11879("mount -o remount,", "rw", " ");
        sbM118712.append(c12505.f35053);
        sbM118712.append(" ");
        sbM118712.append(c12505.f35054);
        arrayList.add(sbM118712.toString());
        arrayList.add("mount -o remount,rw " + c12505.f35054);
        arrayList.add("mount -o rw,remount " + c12505.f35053);
        arrayList.add("mount -o rw,remount " + c12505.f35054);
        f30987.mo27362(C11567.m26623(arrayList, "\n"));
    }

    /* JADX INFO: renamed from: ۡ */
    public static C13964 m25770() {
        if (m25781()) {
            return f30987.mo27362("cat /proc/mounts");
        }
        try {
            File file = new File("/proc/mounts");
            Charset charset = StandardCharsets.UTF_8;
            return new C13964("", (String[]) C17425.m39678(file).toArray(new String[0]));
        } catch (IOException e) {
            return new C13964(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m25778() {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m25756(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ("`!#$&*(){}|[]\\ ;\"'<>?".indexOf(c) != -1) {
                sb.append('\\');
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25757() {
        Future future;
        InterfaceC11953 interfaceC11953;
        synchronized (C11164.class) {
            future = f30997;
            f30997 = null;
            f30990 = EnumC21893.NONE;
            interfaceC11953 = f30987;
            if (f30991 >= 0 && interfaceC11953 != null) {
                m25760(interfaceC11953);
            }
            f30991 = -1L;
            f30996++;
            f30987 = null;
            f30995 = false;
        }
        if (future != null) {
            future.cancel(true);
        }
        if (interfaceC11953 != null) {
            interfaceC11953.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25765(Context context) {
        if (C23058.m51448(context)) {
            return true;
        }
        if (!m25769()) {
            return false;
        }
        String str = "pm grant " + context.getPackageName() + " android.permission.SYSTEM_ALERT_WINDOW";
        if (f30989) {
            if (f30987.mo27361(2000L, str).f39429.isEmpty() && C23058.m51448(context)) {
                return true;
            }
            f30989 = false;
        }
        return false;
    }
}
