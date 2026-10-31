package l;

import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes.dex */
public final class C23867 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m52579(AbstractC15440 abstractC15440) {
        C18090 c18090 = new C18090(abstractC15440);
        try {
            Iterator it = c18090.m42210().iterator();
            while (it.hasNext()) {
                C3545 c3545 = (C3545) it.next();
                String name = c3545.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    if (c18090.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF") != null) {
                        try {
                            byte[] encoded = new C18118(c18090.m42193(c3545, (C19277) null)).m42246()[0].getEncoded();
                            c18090.close();
                            return encoded;
                        } catch (Exception unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            c18090.close();
            return null;
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52577(AbstractC15440 abstractC15440, C22250 c22250, InterfaceC17066 interfaceC17066) {
        C15193 c15193 = c22250.f72209;
        C15193 c15194 = c22250.f72208;
        C15193 c15195 = c22250.f72206;
        C18090 c18090 = new C18090(abstractC15440);
        try {
            boolean zM42245 = false;
            byte[] bArrM42193 = null;
            for (C3545 c3545 : c18090.m42210()) {
                String name = c3545.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    C3545 entry = c18090.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF");
                    if (entry != null) {
                        try {
                            C18118 c18118 = new C18118(c18090.m42193(c3545, (C19277) null));
                            bArrM42193 = c18090.m42193(entry, (C19277) null);
                            zM42245 = c18118.m42245(bArrM42193);
                        } catch (Exception unused) {
                        }
                        if (zM42245) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            C3545 entry2 = c18090.getEntry("META-INF/MANIFEST.MF");
            byte[] bArrM42194 = entry2 != null ? c18090.m42193(entry2, (C19277) null) : null;
            if (zM42245 && bArrM42194 != null) {
                C14694 c14694 = new C14694(bArrM42194);
                C14694 c14695 = new C14694(bArrM42193);
                String strM27606 = c14695.f44887.m27606("X-Android-APK-Signed");
                if (strM27606 != null) {
                    for (String str : strM27606.split(",")) {
                        String strTrim = str.trim();
                        switch (strTrim.hashCode()) {
                            case 50:
                                if (strTrim.equals("2") && c15193.f46410.m48708()) {
                                    c15193.f46410 = EnumC21545.MISSING;
                                }
                                break;
                            case 51:
                                if (strTrim.equals("3") && c15194.f46410.m48708()) {
                                    c15194.f46410 = EnumC21545.MISSING;
                                }
                                break;
                            case 52:
                                if (strTrim.equals("4") && c15195.f46410.m48708()) {
                                    c15195.f46410 = EnumC21545.MISSING;
                                }
                                break;
                        }
                    }
                }
                if (!interfaceC17066.mo1526()) {
                    if (m52576(c14695, c14694, bArrM42194)) {
                        try {
                            boolean zM52578 = m52578(c18090, c14694, interfaceC17066);
                            c18090.close();
                            return zM52578;
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    c18090.close();
                    return false;
                }
            }
            c18090.close();
            return false;
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52576(C14694 c14694, C14694 c14695, byte[] bArr) {
        C17517 c17517 = new C17517(new C23119());
        C17517 c17518 = new C17517(new C13946());
        C17517 c17519 = new C17517(new C2354(1));
        C17517 c175110 = new C17517(new C3765(1));
        C11126 c11126 = c14694.f44887;
        String strM27606 = c11126.m27606("SHA-256-Digest-Manifest");
        if (strM27606 != null) {
            if (Base64.encodeToString(((MessageDigest) c17518.m40934()).digest(bArr), 2).equals(strM27606)) {
                return true;
            }
        } else {
            String strM27607 = c11126.m27606("SHA1-Digest-Manifest");
            if (strM27607 != null) {
                if (Base64.encodeToString(((MessageDigest) c17517.m40934()).digest(bArr), 2).equals(strM27607)) {
                    return true;
                }
            } else {
                String strM27608 = c11126.m27606("SHA-512-Digest-Manifest");
                if (strM27608 != null) {
                    if (Base64.encodeToString(((MessageDigest) c175110.m40934()).digest(bArr), 2).equals(strM27608)) {
                        return true;
                    }
                } else {
                    String strM27609 = c11126.m27606("SHA-384-Digest-Manifest");
                    if (strM27609 != null && Base64.encodeToString(((MessageDigest) c17519.m40934()).digest(bArr), 2).equals(strM27609)) {
                        return true;
                    }
                }
            }
        }
        for (C11126 c11127 : c14694.f44888.values()) {
            C11126 c11128 = (C11126) c14695.f44888.get(c11127.m27608());
            if (c11128 == null) {
                return false;
            }
            String strM276010 = c11127.m27606("SHA256-Digest");
            if (strM276010 != null) {
                ((MessageDigest) c17518.m40934()).update(bArr, c11128.m27610(), c11128.m27609());
                if (!Base64.encodeToString(((MessageDigest) c17518.m40934()).digest(), 2).equals(strM276010)) {
                    return false;
                }
            } else {
                String strM276011 = c11127.m27606("SHA1-Digest");
                if (strM276011 != null) {
                    ((MessageDigest) c17517.m40934()).update(bArr, c11128.m27610(), c11128.m27609());
                    if (!Base64.encodeToString(((MessageDigest) c17517.m40934()).digest(), 2).equals(strM276011)) {
                        return false;
                    }
                } else {
                    String strM276012 = c11127.m27606("SHA512-Digest");
                    if (strM276012 != null) {
                        ((MessageDigest) c175110.m40934()).update(bArr, c11128.m27610(), c11128.m27609());
                        if (!Base64.encodeToString(((MessageDigest) c175110.m40934()).digest(), 2).equals(strM276012)) {
                            return false;
                        }
                    } else {
                        String strM276013 = c11127.m27606("SHA384-Digest");
                        if (strM276013 == null) {
                            return false;
                        }
                        ((MessageDigest) c17519.m40934()).update(bArr, c11128.m27610(), c11128.m27609());
                        if (!Base64.encodeToString(((MessageDigest) c17519.m40934()).digest(), 2).equals(strM276013)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52578(C18090 c18090, C14694 c14694, InterfaceC17066 interfaceC17066) throws IOException {
        long jM10793;
        ThreadLocal threadLocal;
        final HashMap map = new HashMap(c18090.m42207());
        C5378.stream(c18090.m42210()).filter(new C13241()).forEach(new Consumer() { // from class: l.۫ܽᩳ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C3545 c3545 = (C3545) obj;
                map.put(c3545.m10813(), c3545);
            }
        });
        C7597 c7597 = new C7597();
        C11168 c11168 = new C11168();
        C16811 c16811 = new C16811();
        C18223 c18223 = new C18223();
        C14561 c14561M42196 = c18090.m42196();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = null;
        AtomicReference atomicReference = new AtomicReference(null);
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        long j2 = 0;
        for (C11126 c11126 : c14694.f44888.values()) {
            String strM27608 = c11126.m27608();
            C3545 c3545 = (C3545) map.remove(strM27608);
            if (c3545 == null) {
                if (C3364.m10286(strM27608)) {
                    return false;
                }
            } else {
                String strM27606 = c11126.m27606("SHA-256-Digest");
                if (strM27606 != null) {
                    threadLocal = c11168;
                } else {
                    strM27606 = c11126.m27606("SHA1-Digest");
                    if (strM27606 != null) {
                        threadLocal = c7597;
                    } else {
                        strM27606 = c11126.m27606("SHA-512-Digest");
                        if (strM27606 != null) {
                            threadLocal = c18223;
                        } else {
                            strM27606 = c11126.m27606("SHA-384-Digest");
                            if (strM27606 == null) {
                                C11003.toString((List) C5378.stream(c11126.m27607()).map(new C10420(0)).collect(C22976.toList()));
                                return false;
                            }
                            threadLocal = c16811;
                        }
                    }
                }
                long jM10794 = c3545.m10793() + j2;
                C7597 c7598 = c7597;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new RunnableC1995(c3545, threadLocal, strM27606, interfaceC17066, atomicBoolean, c14561M42196, atomicReference));
                arrayList2 = arrayList3;
                j2 = jM10794;
                c7597 = c7598;
                arrayList = arrayList;
            }
        }
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = arrayList;
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((String) it.next()).startsWith("META-INF/")) {
                i++;
            }
        }
        if (i != 0) {
            return false;
        }
        Collections.sort(arrayList4, C8200.comparingLong(new C6186()));
        ArrayList<List> arrayList6 = new ArrayList();
        long j3 = j2 / ((long) ((int) ((C17615.f53826 + 1) * 1.5f)));
        int i2 = 0;
        ArrayList arrayList7 = arrayList5;
        while (i2 < arrayList4.size()) {
            RunnableC1995 runnableC1995 = (RunnableC1995) arrayList4.get(i2);
            if (arrayList7 == null) {
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(runnableC1995);
                jM10793 = runnableC1995.f6680.m10793();
                arrayList6.add(arrayList8);
                arrayList7 = arrayList8;
            } else {
                jM10793 = runnableC1995.f6680.m10793() + j;
                if (jM10793 > j3) {
                    i2--;
                    arrayList7 = arrayList5;
                } else {
                    arrayList7.add(runnableC1995);
                }
                i2++;
            }
            j = jM10793;
            i2++;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(arrayList6.size());
        for (final List list : arrayList6) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۨܽᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RunnableC1995) it2.next()).run();
                    }
                }
            });
        }
        C1802.m5992(executorServiceNewFixedThreadPool);
        c18090.m42191();
        if (interfaceC17066.mo1526()) {
            return false;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            throw new IOException(th);
        }
        return !atomicBoolean.get();
    }
}
