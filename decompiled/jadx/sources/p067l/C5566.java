package p067l;

import bin.p000mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۗܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1W7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5566 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f13456;

    /* JADX INFO: renamed from: ۧ */
    public static C20778 f13457;

    /* JADX INFO: renamed from: ܽ */
    public static C13717 f13458;

    /* JADX INFO: renamed from: ֫ */
    public static void m12321(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, InterfaceC14797 interfaceC14797) {
        C19561 c19561 = new C19561(abstractC17043);
        try {
            if (c19561.m44468()) {
                throw new C3924(R.string.MT_Protector);
            }
            ArrayList<C5738> arrayList = new ArrayList();
            boolean z = false;
            long jM12774 = 0;
            for (C5738 c5738 : c19561.m44469()) {
                if (m12323(c5738.m12794())) {
                    jM12774 += c5738.m12774();
                    arrayList.add(c5738);
                } else {
                    z = true;
                }
            }
            if (z) {
                C10844 c10844 = new C10844(abstractC17044);
                try {
                    c10844.m24999();
                    C25012 c25012 = new C25012(jM12774, interfaceC14797);
                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    for (C5738 c5739 : arrayList) {
                        if (c10844.m24998(c5739)) {
                            c25012.m54925(c5739.m12774());
                        } else {
                            c10844.m24994(c5739);
                            C14196 c14196M44465 = c19561.m44465(c5739);
                            while (true) {
                                int i = c14196M44465.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                c10844.m24984(i, bArr);
                                c25012.m54924(i);
                                if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                                    c10844.close();
                                    c19561.close();
                                    return;
                                }
                            }
                        }
                    }
                    c10844.close();
                } catch (Throwable th) {
                    try {
                        c10844.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                OutputStream outputStreamMo25506 = abstractC17044.mo25506(false);
                try {
                    InterfaceC9866 interfaceC9866M44473 = c19561.m44473();
                    interfaceC9866M44473.seek(0L);
                    C25012 c25013 = new C25012(interfaceC9866M44473.length(), interfaceC14797);
                    byte[] bArr2 = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    while (true) {
                        int i2 = interfaceC9866M44473.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo25506.write(bArr2, 0, i2);
                            c25013.m54924(i2);
                            if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                                outputStreamMo25506.close();
                                c19561.close();
                                return;
                            }
                        } else {
                            if (outputStreamMo25506 == null) {
                                break;
                            }
                            outputStreamMo25506.close();
                            break;
                        }
                        try {
                            c19561.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    if (outputStreamMo25506 != null) {
                        try {
                            outputStreamMo25506.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            }
            c19561.close();
        } catch (Throwable th6) {
            c19561.close();
            throw th6;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x020e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x021d */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m12322(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, AbstractC14973 abstractC14973, String str, boolean z, boolean z2, final InterfaceC14797 interfaceC14797) throws Throwable {
        ExecutorService executorService;
        Throwable th;
        ExecutorService executorService2;
        Throwable th2;
        ExecutorService executorService3 = null;
        try {
            C19561 c19561 = new C19561(abstractC17043);
            try {
                C10844 c10844 = new C10844(abstractC17044);
                if (interfaceC14797 != null) {
                    try {
                        interfaceC14797.mo14983();
                    } catch (Throwable th3) {
                        th = th3;
                        executorService = executorService3;
                        th = th;
                        try {
                            c10844.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                }
                c10844.m24999();
                C20778 c20778 = f13457;
                C12826.requireNonNull(c20778);
                C9433 c9433M46925 = c20778.m46925(c19561);
                EnumC15467 enumC15467M19058 = C8268.m19058(abstractC14973.m34296().getPublicKey(), c9433M46925.f25762);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jM12774 = 0;
                for (C5738 c5738 : c19561.m44469()) {
                    String strM12794 = c5738.m12794();
                    if (m12323(strM12794)) {
                        jM12774 = c5738.m12774() + (c5738.getSize() * 3) + jM12774;
                        linkedHashMap.put(strM12794, c5738);
                    } else if (f13456 && strM12794.endsWith("/")) {
                        linkedHashMap.put(strM12794, c5738);
                    }
                }
                long j = (jM12774 / 100) * 25;
                final C25012 c25012 = new C25012(jM12774 + j, interfaceC14797);
                C6907 c6907 = new C6907();
                final ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
                final C16207 c16207M44455 = c19561.m44455();
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(linkedHashMap.values());
                ExecutorService executorService4 = C4081.f8990;
                int i = C19110.f57020;
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
                int i2 = 0;
                while (i2 < i) {
                    try {
                        final EnumC15467 enumC15467 = enumC15467M19058;
                        C9433 c9433 = c9433M46925;
                        int i3 = i2;
                        final ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                        EnumC15467 enumC15468 = enumC15467M19058;
                        executorService2 = executorServiceNewFixedThreadPool;
                        int i4 = i;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        try {
                            executorService2.submit(new Callable() { // from class: l.᩹ܽᩳ
                                @Override // java.util.concurrent.Callable
                                public final Object call() throws NoSuchAlgorithmException, IOException {
                                    C25012 c25013 = c25012;
                                    MessageDigest messageDigest = MessageDigest.getInstance(enumC15467.m35209());
                                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                                    C19561 c19561M36902 = c16207M44455.m36902();
                                    while (true) {
                                        C5738 c5739 = (C5738) concurrentLinkedQueue2.poll();
                                        if (c5739 == null) {
                                            return null;
                                        }
                                        if (!c5739.isDirectory()) {
                                            try {
                                                InputStream inputStreamM44448 = c19561M36902.m44448(c5739);
                                                while (true) {
                                                    int i5 = inputStreamM44448.read(bArr);
                                                    if (i5 <= 0) {
                                                        concurrentMapC12768.put(c5739.m12794(), messageDigest.digest());
                                                        break;
                                                    }
                                                    messageDigest.update(bArr, 0, i5);
                                                    c25013.m54924(i5 * 3);
                                                    InterfaceC14797 interfaceC14798 = interfaceC14797;
                                                    if (interfaceC14798 != null && interfaceC14798.mo3924()) {
                                                        return null;
                                                    }
                                                }
                                            } catch (IOException e) {
                                                ZipException zipException = new ZipException(C7050.m16203(R.string.MT_Protector, c5739.m12794()));
                                                zipException.initCause(e);
                                                throw zipException;
                                            }
                                        }
                                    }
                                }
                            });
                            i2 = i3 + 1;
                            c9433M46925 = c9433;
                            executorServiceNewFixedThreadPool = executorService2;
                            i = i4;
                            concurrentLinkedQueue = concurrentLinkedQueue3;
                            enumC15467M19058 = enumC15468;
                        } catch (Throwable th5) {
                            th2 = th5;
                            th = th2;
                            executorService = executorService2;
                            c10844.close();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        executorService2 = executorServiceNewFixedThreadPool;
                        th = th2;
                        executorService = executorService2;
                        c10844.close();
                        throw th;
                    }
                }
                EnumC15467 enumC15469 = enumC15467M19058;
                C9433 c9434 = c9433M46925;
                executorService2 = executorServiceNewFixedThreadPool;
                try {
                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    for (C5738 c5739 : linkedHashMap.values()) {
                        if (c5739.isDirectory()) {
                            c10844.m24987(c5739);
                        } else if (!c10844.m24998(c5739)) {
                            c10844.m24994(c5739);
                            C14196 c14196M44465 = c19561.m44465(c5739);
                            while (true) {
                                int i5 = c14196M44465.read(bArr);
                                if (i5 <= 0) {
                                    break;
                                }
                                c10844.m24984(i5, bArr);
                                c25012.m54924(i5);
                                if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                                    break;
                                }
                            }
                        } else {
                            c25012.m54925(c5739.m12774());
                        }
                    }
                    C4081.m8189(executorService2);
                    if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                        try {
                            c10844.close();
                            try {
                                c19561.close();
                                if (executorService2.isShutdown()) {
                                    return;
                                }
                                executorService2.shutdownNow();
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                executorService = executorService2;
                                if (executorService != null && !executorService.isShutdown()) {
                                    executorService.shutdownNow();
                                }
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            executorService = executorService2;
                            Throwable th9 = th;
                            try {
                                c19561.close();
                                throw th9;
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                                throw th9;
                            }
                        }
                    }
                    c6907.m15827(concurrentMapC12768, abstractC14973, enumC15469, c9434, str, z, z2, j, c25012);
                    if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                        c10844.close();
                        c19561.close();
                        if (executorService2.isShutdown()) {
                            return;
                        }
                        executorService2.shutdownNow();
                        return;
                    }
                    OutputStream outputStreamM24981 = c10844.m24981();
                    C13717 c13717 = f13458;
                    if (c13717 == null) {
                        c10844.m24986("META-INF/MANIFEST.MF");
                        c6907.f17977.writeTo(outputStreamM24981);
                        c10844.m24986(c6907.f17979);
                        c6907.f17978.writeTo(outputStreamM24981);
                        c10844.m24986(c6907.f17980);
                        c6907.f17981.writeTo(outputStreamM24981);
                    } else {
                        long j2 = c13717.f38711;
                        C5738 c57310 = new C5738("META-INF/MANIFEST.MF");
                        c57310.setTime(j2);
                        c10844.m24987(c57310);
                        c6907.f17977.writeTo(outputStreamM24981);
                        C5738 c57311 = new C5738(c6907.f17979);
                        c57311.setTime(j2);
                        c10844.m24987(c57311);
                        c6907.f17978.writeTo(outputStreamM24981);
                        C5738 c57312 = new C5738(c6907.f17980);
                        c57312.setTime(j2);
                        c10844.m24987(c57312);
                        c6907.f17981.writeTo(outputStreamM24981);
                    }
                    c10844.close();
                    c19561.close();
                    if (executorService2.isShutdown()) {
                        return;
                    }
                    executorService2.shutdownNow();
                } catch (Throwable th11) {
                    th = th11;
                    executorService3 = executorService2;
                    executorService = executorService3;
                    th = th;
                    c10844.close();
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                executorService = null;
            }
        } catch (Throwable th13) {
            th = th13;
            executorService = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12323(String str) {
        if (str.endsWith("/")) {
            return false;
        }
        if (!str.startsWith("META-INF/")) {
            return true;
        }
        boolean z = str.indexOf(47, 9) != -1;
        String lowerCase = str.substring(9).toLowerCase(Locale.US);
        return ("manifest.mf".equals(lowerCase) || lowerCase.endsWith(".sf") || lowerCase.endsWith(".rsa") || lowerCase.endsWith(".dsa") || lowerCase.endsWith(".ec") || (lowerCase.startsWith("sig-") && !z)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12320(EnumC15467 enumC15467) {
        int i = C21660.f68229[enumC15467.ordinal()];
        if (i == 1) {
            return "SHA1-Digest";
        }
        if (i == 2) {
            return "SHA-256-Digest";
        }
        throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC15467);
    }
}
