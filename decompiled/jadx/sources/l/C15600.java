package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashSet;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܺ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15600 implements InterfaceC15019 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC20541 f48048;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f48049;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9252 f48050;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9252 f48051;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f48052;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f48053;

    public C15600(InterfaceC15097 interfaceC15097, EnumC20541 enumC20541, C9252 c9252, C9252 c9253, long j, String str) {
        this.f48053 = interfaceC15097;
        this.f48048 = enumC20541;
        this.f48051 = c9252;
        this.f48050 = c9253;
        this.f48052 = j;
        this.f48049 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15600 m36759(C2196 c2196, long j, InterfaceC15097 interfaceC15097, InterfaceC15097 interfaceC15098, C23713 c23713, C0991 c0991, C16431 c16431) {
        ThreadPoolExecutor threadPoolExecutorM26979 = C10767.m26979();
        C4951 c4951M7264 = c2196.m7264();
        C21885 c21885M36761 = m36761(c2196, j);
        EnumC20541 enumC20541M36760 = m36760(c4951M7264, c21885M36761);
        if (enumC20541M36760 != null && c21885M36761 != null) {
            try {
                C21885 c21885 = c21885M36761.f73015;
                C9252 c9252M36758 = c21885 == null ? null : m36758(c4951M7264, c21885, interfaceC15097, c23713, c0991, c16431, threadPoolExecutorM26979);
                C9252 c9252M36759 = m36758(c4951M7264, c21885M36761, interfaceC15097, c23713, c0991, c16431, threadPoolExecutorM26979);
                if ((enumC20541M36760 != EnumC20541.FRAGMENTED_MP4 || c9252M36758 != null) && c9252M36759 != null) {
                    return new C15600(interfaceC15098, enumC20541M36760, c9252M36758, c9252M36759, Math.max(0L, j - ((c4951M7264.f15599 - c2196.m7262()) + c21885M36761.f73016)), m36757(c2196, c21885M36761));
                }
            } catch (IOException | RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20541 m36760(C4951 c4951, C21885 c21885) {
        if (c21885 == null) {
            return null;
        }
        C21885 c21886 = c21885.f73015;
        if (!c4951.f31807 || !c4951.f15610.isEmpty()) {
            return null;
        }
        if ((c4951.f15595 != 1 && !c4951.f15612) || !c21885.f70066.isEmpty()) {
            return null;
        }
        boolean z = c21886 != null;
        HashSet hashSet = new HashSet();
        for (C21885 c21887 : c4951.f15593) {
            int i = c21887.f73014;
            C21885 c21888 = c21887.f73015;
            if (i != 0 || c21887.f73019 != null || c21887.f73018 != null || !c21887.f70066.isEmpty()) {
                return null;
            }
            if (z) {
                if (c21888 == null) {
                    return null;
                }
                hashSet.add(C8542.m22231(c4951.f31806, c21888.f73022) + ":" + c21888.f73021 + ":" + c21888.f73020);
            } else if (c21888 != null) {
                return null;
            }
        }
        if (!z) {
            return EnumC20541.MPEG_TS;
        }
        if (hashSet.size() == 1 && c21886 != null && c21886.f73019 == null && c21886.f73018 == null) {
            return EnumC20541.FRAGMENTED_MP4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21885 m36761(C2196 c2196, long j) {
        C4951 c4951M7264 = c2196.m7264();
        long jM7262 = c4951M7264.f15599 - c2196.m7262();
        C21885 c21885 = null;
        for (C21885 c21886 : c4951M7264.f15593) {
            long j2 = c21886.f73016 + jM7262;
            if (j < j2) {
                break;
            }
            if (j < j2 + c21886.f73013) {
                return c21886;
            }
            c21885 = c21886;
        }
        return c21885;
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
    
        if (r23.m3463(r11, r21).m1627() == false) goto L46;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9252 m36758(C4951 c4951, C21885 c21885, InterfaceC15097 interfaceC15097, C23713 c23713, C0991 c0991, C16431 c16431, ThreadPoolExecutor threadPoolExecutor) throws IOException {
        String strM47724;
        long j;
        final long j2;
        final C8546 c8546;
        Throwable th;
        InterruptedIOException interruptedIOException;
        final Uri uriM22231 = C8542.m22231(c4951.f31806, c21885.f73022);
        long j3 = c21885.f73021;
        long jM1626 = c21885.f73020;
        String scheme = uriM22231.getScheme();
        if (!a.s.equalsIgnoreCase(scheme) && !b.a.equalsIgnoreCase(scheme)) {
            if (c16431 != null) {
                InterfaceC17889 interfaceC17889M38737 = c16431.m38737(uriM22231);
                String strM47725 = C20892.m47725(c16431.m38743(), interfaceC17889M38737, c23713.m52286());
                if (jM1626 == -1) {
                    jM1626 = interfaceC17889M38737.getSize();
                }
                strM47724 = strM47725;
            }
            return null;
        }
        strM47724 = C20892.m47724(uriM22231, interfaceC15097);
        C16197 c16197M52288 = c23713.m52288();
        String scheme2 = uriM22231.getScheme();
        boolean z = false;
        boolean z2 = a.s.equalsIgnoreCase(scheme2) || b.a.equalsIgnoreCase(scheme2);
        if (jM1626 < 0 && c16197M52288 != null) {
            long jM32306 = C13325.m32306(c16197M52288.mo38139(strM47724));
            if (jM32306 > j3) {
                jM1626 = jM32306 - j3;
            }
        }
        if (jM1626 >= 0 || !z2) {
            j = jM1626;
            if (j > 0) {
                if (c16197M52288 != null && c16197M52288.m38148(strM47724, j3, j)) {
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
                        c8546 = new C8546(interfaceC15097.mo6247());
                        if (!Thread.currentThread().isInterrupted()) {
                            interruptedIOException = new InterruptedIOException("Visitor range probe was canceled");
                            try {
                                c8546.f26130.close();
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
                                    C8546 c8547 = c8546;
                                    Uri uri = uriM22231;
                                    long j4 = j2;
                                    try {
                                        synchronized (c8547) {
                                            z3 = c8547.f26127;
                                        }
                                        if (!z3) {
                                            InterfaceC21449 interfaceC21449 = c8547.f26130;
                                            C4515 c4515 = new C4515();
                                            c4515.m13281(uri);
                                            c4515.m13286(j4);
                                            c4515.m13280(1L);
                                            interfaceC21449.mo1620(c4515.m13278());
                                        }
                                        try {
                                            c8547.f26130.close();
                                            th = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        Throwable th4 = th;
                                        synchronized (c8547) {
                                            c8547.f26128 = th4;
                                            c8547.f26129 = true;
                                            c8547.notifyAll();
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            c8547.f26130.close();
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                        }
                                        synchronized (c8547) {
                                            c8547.f26128 = th5;
                                            c8547.f26129 = true;
                                            c8547.notifyAll();
                                        }
                                    }
                                }
                            });
                            synchronized (c8546) {
                                while (!c8546.f26129) {
                                    try {
                                        c8546.wait();
                                    } catch (InterruptedException unused) {
                                        c8546.f26127 = true;
                                        Thread.currentThread().interrupt();
                                        throw new InterruptedIOException("Visitor range probe was canceled");
                                    }
                                }
                                th = c8546.f26128;
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
                                c8546.f26130.close();
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
                return new C9252(j3, j, uriM22231, z ? C9315.m23961(c23713) : null, strM47724);
            }
        } else {
            C0285 c0285M3463 = c0991.m3463(uriM22231, interfaceC15097);
            if (c0285M3463.m1627() && c0285M3463.m1626() != -1) {
                jM1626 = c0285M3463.m1626() - j3;
                j = jM1626;
                if (j > 0) {
                    if (c16197M52288 != null) {
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
                            c8546 = new C8546(interfaceC15097.mo6247());
                            if (!Thread.currentThread().isInterrupted()) {
                                interruptedIOException = new InterruptedIOException("Visitor range probe was canceled");
                                c8546.f26130.close();
                                throw interruptedIOException;
                            }
                            threadPoolExecutor.execute(new Runnable() { // from class: l.ۜ֨ۜ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z3;
                                    C8546 c8547 = c8546;
                                    Uri uri = uriM22231;
                                    long j4 = j2;
                                    try {
                                        synchronized (c8547) {
                                            z3 = c8547.f26127;
                                        }
                                        if (!z3) {
                                            InterfaceC21449 interfaceC21449 = c8547.f26130;
                                            C4515 c4515 = new C4515();
                                            c4515.m13281(uri);
                                            c4515.m13286(j4);
                                            c4515.m13280(1L);
                                            interfaceC21449.mo1620(c4515.m13278());
                                        }
                                        try {
                                            c8547.f26130.close();
                                            th = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                        Throwable th5 = th;
                                        synchronized (c8547) {
                                            c8547.f26128 = th5;
                                            c8547.f26129 = true;
                                            c8547.notifyAll();
                                        }
                                    } catch (Throwable th6) {
                                        try {
                                            c8547.f26130.close();
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                        }
                                        synchronized (c8547) {
                                            c8547.f26128 = th6;
                                            c8547.f26129 = true;
                                            c8547.notifyAll();
                                        }
                                    }
                                }
                            });
                            synchronized (c8546) {
                                while (!c8546.f26129) {
                                    c8546.wait();
                                }
                                th = c8546.f26128;
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
                    return new C9252(j3, j, uriM22231, z ? C9315.m23961(c23713) : null, strM47724);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8671 m36767() throws IOException {
        C9252 c9252;
        C9252 c9253 = this.f48050;
        if (this.f48048 != EnumC20541.FRAGMENTED_MP4 || (c9252 = this.f48051) == null) {
            throw new IOException("HLS preview does not have an initialization segment");
        }
        InterfaceC15097 interfaceC15097 = c9252.f28029;
        InterfaceC15097 interfaceC15098 = this.f48053;
        C4871 c4871 = new C4871(c9252.f28032, c9252.f28030, c9252.f28031, interfaceC15097 != null ? c9252.f28029 : interfaceC15098, c9252.f28028);
        try {
            if (c9253.f28029 != null) {
                interfaceC15098 = c9253.f28029;
            }
            return new C8671(c4871, new C4871(c9253.f28032, c9253.f28030, c9253.f28031, interfaceC15098, c9253.f28028));
        } catch (Throwable th) {
            c4871.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 m36766() {
        C9252 c9252 = this.f48050;
        InterfaceC15097 interfaceC15097 = c9252.f28029 != null ? c9252.f28029 : this.f48053;
        C4515 c4515 = new C4515();
        c4515.m13281(c9252.f28031);
        c4515.m13286(c9252.f28032);
        c4515.m13282(c9252.f28028);
        return new C17613(interfaceC15097.mo6247(), c4515.m13278(), c9252.f28030, new C20177());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC20541 m36763() {
        return this.f48048;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m36765() {
        return this.f48052;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m36764() {
        return this.f48049;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15600 m36762(C2196 c2196, long j) {
        C21885 c21885M36761 = m36761(c2196, j);
        if (c21885M36761 == null || !this.f48049.equals(m36757(c2196, c21885M36761))) {
            return null;
        }
        long jMax = Math.max(0L, j - ((c2196.m7264().f15599 - c2196.m7262()) + c21885M36761.f73016));
        return new C15600(this.f48053, this.f48048, this.f48051, this.f48050, jMax, this.f48049);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36757(C2196 c2196, C21885 c21885) {
        return c2196.m7265() + ":" + c2196.m7263() + ":" + C8542.m22231(c2196.m7264().f31806, c21885.f73022) + ":" + c21885.f73021 + ":" + c21885.f73020;
    }
}
