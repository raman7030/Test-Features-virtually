package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashSet;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܺ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17194 implements InterfaceC16642 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC21890 f51180;

    /* JADX INFO: renamed from: ۧ */
    public final String f51181;

    /* JADX INFO: renamed from: ܳ */
    public final C11161 f51182;

    /* JADX INFO: renamed from: ܽ */
    public final C11161 f51183;

    /* JADX INFO: renamed from: ܿ */
    public final long f51184;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC16716 f51185;

    public C17194(InterfaceC16716 interfaceC16716, EnumC21890 enumC21890, C11161 c11161, C11161 c11162, long j, String str) {
        this.f51185 = interfaceC16716;
        this.f51180 = enumC21890;
        this.f51183 = c11161;
        this.f51182 = c11162;
        this.f51184 = j;
        this.f51181 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17194 m38920(C4455 c4455, long j, InterfaceC16716 interfaceC16716, InterfaceC16716 interfaceC16717, C24905 c24905, C3310 c3310, C17984 c17984) {
        ThreadPoolExecutor threadPoolExecutorM29024 = C12601.m29024();
        C7074 c7074M9343 = c4455.m9343();
        C23168 c23168M38922 = m38922(c4455, j);
        EnumC21890 enumC21890M38921 = m38921(c7074M9343, c23168M38922);
        if (enumC21890M38921 != null && c23168M38922 != null) {
            try {
                C23168 c23168 = c23168M38922.f75742;
                C11161 c11161M38919 = c23168 == null ? null : m38919(c7074M9343, c23168, interfaceC16716, c24905, c3310, c17984, threadPoolExecutorM29024);
                C11161 c11161M389110 = m38919(c7074M9343, c23168M38922, interfaceC16716, c24905, c3310, c17984, threadPoolExecutorM29024);
                if ((enumC21890M38921 != EnumC21890.FRAGMENTED_MP4 || c11161M38919 != null) && c11161M389110 != null) {
                    return new C17194(interfaceC16717, enumC21890M38921, c11161M38919, c11161M389110, Math.max(0L, j - ((c7074M9343.f18433 - c4455.m9341()) + c23168M38922.f75743)), m38918(c4455, c23168M38922));
                }
            } catch (IOException | RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC21890 m38921(C7074 c7074, C23168 c23168) {
        if (c23168 == null) {
            return null;
        }
        C23168 c23169 = c23168.f75742;
        if (!c7074.f34778 || !c7074.f18444.isEmpty()) {
            return null;
        }
        if ((c7074.f18429 != 1 && !c7074.f18446) || !c23168.f72778.isEmpty()) {
            return null;
        }
        boolean z = c23169 != null;
        HashSet hashSet = new HashSet();
        for (C23168 c231610 : c7074.f18427) {
            int i = c231610.f75741;
            C23168 c231611 = c231610.f75742;
            if (i != 0 || c231610.f75746 != null || c231610.f75745 != null || !c231610.f72778.isEmpty()) {
                return null;
            }
            if (z) {
                if (c231611 == null) {
                    return null;
                }
                hashSet.add(C10486.m24199(c7074.f34777, c231611.f75749) + ":" + c231611.f75748 + ":" + c231611.f75747);
            } else if (c231611 != null) {
                return null;
            }
        }
        if (!z) {
            return EnumC21890.MPEG_TS;
        }
        if (hashSet.size() == 1 && c23169 != null && c23169.f75746 == null && c23169.f75745 == null) {
            return EnumC21890.FRAGMENTED_MP4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23168 m38922(C4455 c4455, long j) {
        C7074 c7074M9343 = c4455.m9343();
        long jM9341 = c7074M9343.f18433 - c4455.m9341();
        C23168 c23168 = null;
        for (C23168 c23169 : c7074M9343.f18427) {
            long j2 = c23169.f75743 + jM9341;
            if (j < j2) {
                break;
            }
            if (j < j2 + c23169.f75740) {
                return c23169;
            }
            c23168 = c23169;
        }
        return c23168;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:104:0x0170  */
    /* JADX WARN: Code duplicated, block: B:109:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00fb A[EXC_TOP_SPLITTER, LOOP:0: B:113:0x00fb->B:117:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0123 A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0127 A[Catch: all -> 0x0132, DONT_GENERATE, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0129 A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x012c A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012f A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0151  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if (r23.m5766(r11, r21).m4027() == false) goto L46;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11161 m38919(C7074 c7074, C23168 c23168, InterfaceC16716 interfaceC16716, C24905 c24905, C3310 c3310, C17984 c17984, ThreadPoolExecutor threadPoolExecutor) throws IOException {
        String strM50054;
        long j;
        final long j2;
        final C10490 c10490;
        Throwable th;
        InterruptedIOException interruptedIOException;
        final Uri uriM24199 = C10486.m24199(c7074.f34777, c23168.f75749);
        long j3 = c23168.f75748;
        long jM4026 = c23168.f75747;
        String scheme = uriM24199.getScheme();
        if (!C0170a.f680s.equalsIgnoreCase(scheme) && !C0171b.f688a.equalsIgnoreCase(scheme)) {
            if (c17984 != null) {
                InterfaceC19370 interfaceC19370M40962 = c17984.m40962(uriM24199);
                String strM50055 = C22224.m50055(c17984.m40968(), interfaceC19370M40962, c24905.m54689());
                if (jM4026 == -1) {
                    jM4026 = interfaceC19370M40962.getSize();
                }
                strM50054 = strM50055;
            }
            return null;
        }
        strM50054 = C22224.m50054(uriM24199, interfaceC16716);
        C17762 c17762M54691 = c24905.m54691();
        String scheme2 = uriM24199.getScheme();
        boolean z = false;
        boolean z2 = C0170a.f680s.equalsIgnoreCase(scheme2) || C0171b.f688a.equalsIgnoreCase(scheme2);
        if (jM4026 < 0 && c17762M54691 != null) {
            long jM34406 = C15033.m34406(c17762M54691.mo40351(strM50054));
            if (jM34406 > j3) {
                jM4026 = jM34406 - j3;
            }
        }
        if (jM4026 >= 0 || !z2) {
            j = jM4026;
            if (j > 0) {
                if (c17762M54691 != null && c17762M54691.m40360(strM50054, j3, j)) {
                    z = true;
                }
                if (!z) {
                    if (z2) {
                        if (!Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException("Visitor range probe was canceled");
                        }
                        if (j3 > 0) {
                            j2 = j3;
                        } else {
                            j2 = 1;
                            if (j <= 1) {
                                j2 = 0;
                            }
                        }
                        c10490 = new C10490(interfaceC16716.mo8449());
                        if (!Thread.currentThread().isInterrupted()) {
                            interruptedIOException = new InterruptedIOException("Visitor range probe was canceled");
                            try {
                                c10490.f29045.close();
                                throw interruptedIOException;
                            } catch (Throwable th2) {
                                interruptedIOException.addSuppressed(th2);
                                throw interruptedIOException;
                            }
                        }
                        try {
                            threadPoolExecutor.execute(new Runnable() { // from class: l.ۜ֨ۜ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z3;
                                    C10490 c10491 = c10490;
                                    Uri uri = uriM24199;
                                    long j4 = j2;
                                    try {
                                        synchronized (c10491) {
                                            z3 = c10491.f29042;
                                        }
                                        if (!z3) {
                                            InterfaceC22753 interfaceC22753 = c10491.f29045;
                                            C6659 c6659 = new C6659();
                                            c6659.m15164(uri);
                                            c6659.m15169(j4);
                                            c6659.m15163(1L);
                                            interfaceC22753.mo4020(c6659.m15161());
                                        }
                                        try {
                                            c10491.f29045.close();
                                            th = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        Throwable th4 = th;
                                        synchronized (c10491) {
                                            c10491.f29043 = th4;
                                            c10491.f29044 = true;
                                            c10491.notifyAll();
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            c10491.f29045.close();
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                        }
                                        synchronized (c10491) {
                                            c10491.f29043 = th5;
                                            c10491.f29044 = true;
                                            c10491.notifyAll();
                                        }
                                    }
                                }
                            });
                            synchronized (c10490) {
                                while (!c10490.f29044) {
                                    try {
                                        c10490.wait();
                                    } catch (InterruptedException unused) {
                                        c10490.f29042 = true;
                                        Thread.currentThread().interrupt();
                                        throw new InterruptedIOException("Visitor range probe was canceled");
                                    }
                                }
                                th = c10490.f29043;
                                if (!(th instanceof IOException)) {
                                    throw ((IOException) th);
                                }
                                if (!(th instanceof RuntimeException)) {
                                    throw ((RuntimeException) th);
                                }
                                if (!(th instanceof Error)) {
                                    throw ((Error) th);
                                }
                            }
                        } catch (RuntimeException e) {
                            try {
                                c10490.f29045.close();
                            } catch (Throwable th3) {
                                e.addSuppressed(th3);
                            }
                            if (e instanceof RejectedExecutionException) {
                                throw new IOException("Visitor range probe capacity is exhausted", e);
                            }
                            throw e;
                        }
                    }
                }
                return new C11161(j3, j, uriM24199, z ? C11221.m25970(c24905) : null, strM50054);
            }
        } else {
            C2639 c2639M5766 = c3310.m5766(uriM24199, interfaceC16716);
            if (c2639M5766.m4027() && c2639M5766.m4026() != -1) {
                jM4026 = c2639M5766.m4026() - j3;
                j = jM4026;
                if (j > 0) {
                    if (c17762M54691 != null) {
                        z = true;
                    }
                    if (!z) {
                        if (z2) {
                            if (!Thread.currentThread().isInterrupted()) {
                                throw new InterruptedIOException("Visitor range probe was canceled");
                            }
                            if (j3 > 0) {
                                j2 = j3;
                            } else {
                                j2 = 1;
                                if (j <= 1) {
                                    j2 = 0;
                                }
                            }
                            c10490 = new C10490(interfaceC16716.mo8449());
                            if (!Thread.currentThread().isInterrupted()) {
                                interruptedIOException = new InterruptedIOException("Visitor range probe was canceled");
                                c10490.f29045.close();
                                throw interruptedIOException;
                            }
                            threadPoolExecutor.execute(new Runnable() { // from class: l.ۜ֨ۜ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z3;
                                    C10490 c10491 = c10490;
                                    Uri uri = uriM24199;
                                    long j4 = j2;
                                    try {
                                        synchronized (c10491) {
                                            z3 = c10491.f29042;
                                        }
                                        if (!z3) {
                                            InterfaceC22753 interfaceC22753 = c10491.f29045;
                                            C6659 c6659 = new C6659();
                                            c6659.m15164(uri);
                                            c6659.m15169(j4);
                                            c6659.m15163(1L);
                                            interfaceC22753.mo4020(c6659.m15161());
                                        }
                                        try {
                                            c10491.f29045.close();
                                            th = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                        Throwable th5 = th;
                                        synchronized (c10491) {
                                            c10491.f29043 = th5;
                                            c10491.f29044 = true;
                                            c10491.notifyAll();
                                        }
                                    } catch (Throwable th6) {
                                        try {
                                            c10491.f29045.close();
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                        }
                                        synchronized (c10491) {
                                            c10491.f29043 = th6;
                                            c10491.f29044 = true;
                                            c10491.notifyAll();
                                        }
                                    }
                                }
                            });
                            synchronized (c10490) {
                                while (!c10490.f29044) {
                                    c10490.wait();
                                }
                                th = c10490.f29043;
                                if (!(th instanceof IOException)) {
                                    throw ((IOException) th);
                                }
                                if (!(th instanceof RuntimeException)) {
                                    throw ((RuntimeException) th);
                                }
                                if (!(th instanceof Error)) {
                                    throw ((Error) th);
                                }
                            }
                        }
                    }
                    return new C11161(j3, j, uriM24199, z ? C11221.m25970(c24905) : null, strM50054);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10609 m38928() throws IOException {
        C11161 c11161;
        C11161 c11162 = this.f51182;
        if (this.f51180 != EnumC21890.FRAGMENTED_MP4 || (c11161 = this.f51183) == null) {
            throw new IOException("HLS preview does not have an initialization segment");
        }
        InterfaceC16716 interfaceC16716 = c11161.f30975;
        InterfaceC16716 interfaceC16717 = this.f51185;
        C6998 c6998 = new C6998(c11161.f30978, c11161.f30976, c11161.f30977, interfaceC16716 != null ? c11161.f30975 : interfaceC16717, c11161.f30974);
        try {
            if (c11162.f30975 != null) {
                interfaceC16717 = c11162.f30975;
            }
            return new C10609(c6998, new C6998(c11162.f30978, c11162.f30976, c11162.f30977, interfaceC16717, c11162.f30974));
        } catch (Throwable th) {
            c6998.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9501 m38927() {
        C11161 c11161 = this.f51182;
        InterfaceC16716 interfaceC16716 = c11161.f30975 != null ? c11161.f30975 : this.f51185;
        C6659 c6659 = new C6659();
        c6659.m15164(c11161.f30977);
        c6659.m15169(c11161.f30978);
        c6659.m15165(c11161.f30974);
        return new C19108(interfaceC16716.mo8449(), c6659.m15161(), c11161.f30976, new C21545());
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC21890 m38924() {
        return this.f51180;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m38926() {
        return this.f51184;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m38925() {
        return this.f51181;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17194 m38923(C4455 c4455, long j) {
        C23168 c23168M38922 = m38922(c4455, j);
        if (c23168M38922 == null || !this.f51181.equals(m38918(c4455, c23168M38922))) {
            return null;
        }
        long jMax = Math.max(0L, j - ((c4455.m9343().f18433 - c4455.m9341()) + c23168M38922.f75743));
        return new C17194(this.f51185, this.f51180, this.f51183, this.f51182, jMax, this.f51181);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38918(C4455 c4455, C23168 c23168) {
        return c4455.m9344() + ":" + c4455.m9342() + ":" + C10486.m24199(c4455.m9343().f34777, c23168.f75749) + ":" + c23168.f75748 + ":" + c23168.f75747;
    }
}
