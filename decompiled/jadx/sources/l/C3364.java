package l;

import bin.mt.plus.R;
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
public final class C3364 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f10648;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19370 f10649;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C11940 f10650;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10284(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, InterfaceC13077 interfaceC13077) {
        C18090 c18090 = new C18090(abstractC15440);
        try {
            if (c18090.m42209()) {
                throw new C1637(R.string.MT_Protector);
            }
            ArrayList<C3545> arrayList = new ArrayList();
            boolean z = false;
            long jM10793 = 0;
            for (C3545 c3545 : c18090.m42210()) {
                if (m10286(c3545.m10813())) {
                    jM10793 += c3545.m10793();
                    arrayList.add(c3545);
                } else {
                    z = true;
                }
            }
            if (z) {
                C8918 c8918 = new C8918(abstractC15441);
                try {
                    c8918.m23025();
                    C23825 c23825 = new C23825(jM10793, interfaceC13077);
                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    for (C3545 c3546 : arrayList) {
                        if (c8918.m23024(c3546)) {
                            c23825.m52516(c3546.m10793());
                        } else {
                            c8918.m23020(c3546);
                            C12445 c12445M42206 = c18090.m42206(c3546);
                            while (true) {
                                int i = c12445M42206.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                c8918.m23010(i, bArr);
                                c23825.m52515(i);
                                if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                                    c8918.close();
                                    c18090.close();
                                    return;
                                }
                            }
                        }
                    }
                    c8918.close();
                } catch (Throwable th) {
                    try {
                        c8918.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                OutputStream outputStreamMo23555 = abstractC15441.mo23555(false);
                try {
                    InterfaceC7889 interfaceC7889M42214 = c18090.m42214();
                    interfaceC7889M42214.seek(0L);
                    C23825 c23826 = new C23825(interfaceC7889M42214.length(), interfaceC13077);
                    byte[] bArr2 = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    while (true) {
                        int i2 = interfaceC7889M42214.read(bArr2);
                        if (i2 != -1) {
                            outputStreamMo23555.write(bArr2, 0, i2);
                            c23826.m52515(i2);
                            if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                                outputStreamMo23555.close();
                                c18090.close();
                                return;
                            }
                        } else {
                            if (outputStreamMo23555 == null) {
                                break;
                            }
                            outputStreamMo23555.close();
                            break;
                        }
                        try {
                            c18090.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    if (outputStreamMo23555 != null) {
                        try {
                            outputStreamMo23555.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            }
            c18090.close();
        } catch (Throwable th6) {
            c18090.close();
            throw th6;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x020e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x021d */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m10285(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, AbstractC13262 abstractC13262, String str, boolean z, boolean z2, final InterfaceC13077 interfaceC13077) throws Throwable {
        ExecutorService executorService;
        Throwable th;
        ExecutorService executorService2;
        Throwable th2;
        ExecutorService executorService3 = null;
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                C8918 c8918 = new C8918(abstractC15441);
                if (interfaceC13077 != null) {
                    try {
                        interfaceC13077.mo13119();
                    } catch (Throwable th3) {
                        th = th3;
                        executorService = executorService3;
                        th = th;
                        try {
                            c8918.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                }
                c8918.m23025();
                C19370 c19370 = f10649;
                C11003.requireNonNull(c19370);
                C7433 c7433M44631 = c19370.m44631(c18090);
                EnumC13782 enumC13782M17126 = C6207.m17126(abstractC13262.m32197().getPublicKey(), c7433M44631.f22849);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jM10793 = 0;
                for (C3545 c3545 : c18090.m42210()) {
                    String strM10813 = c3545.m10813();
                    if (m10286(strM10813)) {
                        jM10793 = c3545.m10793() + (c3545.getSize() * 3) + jM10793;
                        linkedHashMap.put(strM10813, c3545);
                    } else if (f10648 && strM10813.endsWith("/")) {
                        linkedHashMap.put(strM10813, c3545);
                    }
                }
                long j = (jM10793 / 100) * 25;
                final C23825 c23825 = new C23825(jM10793 + j, interfaceC13077);
                C4775 c4775 = new C4775();
                final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
                final C14561 c14561M42196 = c18090.m42196();
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(linkedHashMap.values());
                ExecutorService executorService4 = C1802.f6211;
                int i = C17615.f53826;
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
                int i2 = 0;
                while (i2 < i) {
                    try {
                        final EnumC13782 enumC13782 = enumC13782M17126;
                        C7433 c7433 = c7433M44631;
                        int i3 = i2;
                        final ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                        EnumC13782 enumC13783 = enumC13782M17126;
                        executorService2 = executorServiceNewFixedThreadPool;
                        int i4 = i;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        try {
                            executorService2.submit(new Callable() { // from class: l.᩹ܽᩳ
                                @Override // java.util.concurrent.Callable
                                public final Object call() throws NoSuchAlgorithmException, IOException {
                                    C23825 c23826 = c23825;
                                    MessageDigest messageDigest = MessageDigest.getInstance(enumC13782.m33093());
                                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                                    C18090 c18090M34753 = c14561M42196.m34753();
                                    while (true) {
                                        C3545 c3546 = (C3545) concurrentLinkedQueue2.poll();
                                        if (c3546 == null) {
                                            return null;
                                        }
                                        if (!c3546.isDirectory()) {
                                            try {
                                                InputStream inputStreamM42189 = c18090M34753.m42189(c3546);
                                                while (true) {
                                                    int i5 = inputStreamM42189.read(bArr);
                                                    if (i5 <= 0) {
                                                        concurrentMapC10942.put(c3546.m10813(), messageDigest.digest());
                                                        break;
                                                    }
                                                    messageDigest.update(bArr, 0, i5);
                                                    c23826.m52515(i5 * 3);
                                                    InterfaceC13077 interfaceC13078 = interfaceC13077;
                                                    if (interfaceC13078 != null && interfaceC13078.mo1526()) {
                                                        return null;
                                                    }
                                                }
                                            } catch (IOException e) {
                                                ZipException zipException = new ZipException(C4925.m14306(R.string.MT_Protector, c3546.m10813()));
                                                zipException.initCause(e);
                                                throw zipException;
                                            }
                                        }
                                    }
                                }
                            });
                            i2 = i3 + 1;
                            c7433M44631 = c7433;
                            executorServiceNewFixedThreadPool = executorService2;
                            i = i4;
                            concurrentLinkedQueue = concurrentLinkedQueue3;
                            enumC13782M17126 = enumC13783;
                        } catch (Throwable th5) {
                            th2 = th5;
                            th = th2;
                            executorService = executorService2;
                            c8918.close();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        executorService2 = executorServiceNewFixedThreadPool;
                        th = th2;
                        executorService = executorService2;
                        c8918.close();
                        throw th;
                    }
                }
                EnumC13782 enumC13784 = enumC13782M17126;
                C7433 c7434 = c7433M44631;
                executorService2 = executorServiceNewFixedThreadPool;
                try {
                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    for (C3545 c3546 : linkedHashMap.values()) {
                        if (c3546.isDirectory()) {
                            c8918.m23013(c3546);
                        } else if (!c8918.m23024(c3546)) {
                            c8918.m23020(c3546);
                            C12445 c12445M42206 = c18090.m42206(c3546);
                            while (true) {
                                int i5 = c12445M42206.read(bArr);
                                if (i5 <= 0) {
                                    break;
                                }
                                c8918.m23010(i5, bArr);
                                c23825.m52515(i5);
                                if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                                    break;
                                }
                            }
                        } else {
                            c23825.m52516(c3546.m10793());
                        }
                    }
                    C1802.m5992(executorService2);
                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                        try {
                            c8918.close();
                            try {
                                c18090.close();
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
                                c18090.close();
                                throw th9;
                            } catch (Throwable th10) {
                                th9.addSuppressed(th10);
                                throw th9;
                            }
                        }
                    }
                    c4775.m13947(concurrentMapC10942, abstractC13262, enumC13784, c7434, str, z, z2, j, c23825);
                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                        c8918.close();
                        c18090.close();
                        if (executorService2.isShutdown()) {
                            return;
                        }
                        executorService2.shutdownNow();
                        return;
                    }
                    OutputStream outputStreamM23007 = c8918.m23007();
                    C11940 c11940 = f10650;
                    if (c11940 == null) {
                        c8918.m23012("META-INF/MANIFEST.MF");
                        c4775.f15147.writeTo(outputStreamM23007);
                        c8918.m23012(c4775.f15149);
                        c4775.f15148.writeTo(outputStreamM23007);
                        c8918.m23012(c4775.f15150);
                        c4775.f15151.writeTo(outputStreamM23007);
                    } else {
                        long j2 = c11940.f35700;
                        C3545 c3547 = new C3545("META-INF/MANIFEST.MF");
                        c3547.setTime(j2);
                        c8918.m23013(c3547);
                        c4775.f15147.writeTo(outputStreamM23007);
                        C3545 c3548 = new C3545(c4775.f15149);
                        c3548.setTime(j2);
                        c8918.m23013(c3548);
                        c4775.f15148.writeTo(outputStreamM23007);
                        C3545 c3549 = new C3545(c4775.f15150);
                        c3549.setTime(j2);
                        c8918.m23013(c3549);
                        c4775.f15151.writeTo(outputStreamM23007);
                    }
                    c8918.close();
                    c18090.close();
                    if (executorService2.isShutdown()) {
                        return;
                    }
                    executorService2.shutdownNow();
                } catch (Throwable th11) {
                    th = th11;
                    executorService3 = executorService2;
                    executorService = executorService3;
                    th = th;
                    c8918.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10286(String str) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10283(EnumC13782 enumC13782) {
        int i = C20298.f65554[enumC13782.ordinal()];
        if (i == 1) {
            return "SHA1-Digest";
        }
        if (i == 2) {
            return "SHA-256-Digest";
        }
        throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC13782);
    }
}
