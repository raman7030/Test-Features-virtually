package p067l;

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
public final class C25052 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m54988(AbstractC17043 abstractC17043) {
        C19561 c19561 = new C19561(abstractC17043);
        try {
            Iterator it = c19561.m44469().iterator();
            while (it.hasNext()) {
                C5738 c5738 = (C5738) it.next();
                String name = c5738.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    if (c19561.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF") != null) {
                        try {
                            byte[] encoded = new C19588(c19561.m44452(c5738, (C20689) null)).m44505()[0].getEncoded();
                            c19561.close();
                            return encoded;
                        } catch (Exception unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            c19561.close();
            return null;
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m54986(AbstractC17043 abstractC17043, C23515 c23515, InterfaceC18588 interfaceC18588) {
        C16808 c16808 = c23515.f74934;
        C16808 c16809 = c23515.f74933;
        C16808 c168010 = c23515.f74931;
        C19561 c19561 = new C19561(abstractC17043);
        try {
            boolean zM44504 = false;
            byte[] bArrM44452 = null;
            for (C5738 c5738 : c19561.m44469()) {
                String name = c5738.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    C5738 entry = c19561.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF");
                    if (entry != null) {
                        try {
                            C19588 c19588 = new C19588(c19561.m44452(c5738, (C20689) null));
                            bArrM44452 = c19561.m44452(entry, (C20689) null);
                            zM44504 = c19588.m44504(bArrM44452);
                        } catch (Exception unused) {
                        }
                        if (zM44504) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            C5738 entry2 = c19561.getEntry("META-INF/MANIFEST.MF");
            byte[] bArrM44453 = entry2 != null ? c19561.m44452(entry2, (C20689) null) : null;
            if (zM44504 && bArrM44453 != null) {
                C16334 c16334 = new C16334(bArrM44453);
                C16334 c16335 = new C16334(bArrM44452);
                String strM29668 = c16335.f48001.m29668("X-Android-APK-Signed");
                if (strM29668 != null) {
                    for (String str : strM29668.split(",")) {
                        String strTrim = str.trim();
                        switch (strTrim.hashCode()) {
                            case 50:
                                if (strTrim.equals("2") && c16808.f49535.m51053()) {
                                    c16808.f49535 = EnumC22845.MISSING;
                                }
                                break;
                            case 51:
                                if (strTrim.equals("3") && c16809.f49535.m51053()) {
                                    c16809.f49535 = EnumC22845.MISSING;
                                }
                                break;
                            case 52:
                                if (strTrim.equals("4") && c168010.f49535.m51053()) {
                                    c168010.f49535 = EnumC22845.MISSING;
                                }
                                break;
                        }
                    }
                }
                if (!interfaceC18588.mo3924()) {
                    if (m54985(c16335, c16334, bArrM44453)) {
                        try {
                            boolean zM54987 = m54987(c19561, c16334, interfaceC18588);
                            c19561.close();
                            return zM54987;
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    c19561.close();
                    return false;
                }
            }
            c19561.close();
            return false;
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54985(C16334 c16334, C16334 c16335, byte[] bArr) {
        C19017 c19017 = new C19017(new C24341());
        C19017 c19018 = new C19017(new C15623());
        C19017 c19019 = new C19017(new C4606(1));
        C19017 c190110 = new C19017(new C5947(1));
        C12943 c12943 = c16334.f48001;
        String strM29668 = c12943.m29668("SHA-256-Digest-Manifest");
        if (strM29668 != null) {
            if (Base64.encodeToString(((MessageDigest) c19018.m43193()).digest(bArr), 2).equals(strM29668)) {
                return true;
            }
        } else {
            String strM29669 = c12943.m29668("SHA1-Digest-Manifest");
            if (strM29669 != null) {
                if (Base64.encodeToString(((MessageDigest) c19017.m43193()).digest(bArr), 2).equals(strM29669)) {
                    return true;
                }
            } else {
                String strM296610 = c12943.m29668("SHA-512-Digest-Manifest");
                if (strM296610 != null) {
                    if (Base64.encodeToString(((MessageDigest) c190110.m43193()).digest(bArr), 2).equals(strM296610)) {
                        return true;
                    }
                } else {
                    String strM296611 = c12943.m29668("SHA-384-Digest-Manifest");
                    if (strM296611 != null && Base64.encodeToString(((MessageDigest) c19019.m43193()).digest(bArr), 2).equals(strM296611)) {
                        return true;
                    }
                }
            }
        }
        for (C12943 c12944 : c16334.f48002.values()) {
            C12943 c12945 = (C12943) c16335.f48002.get(c12944.m29670());
            if (c12945 == null) {
                return false;
            }
            String strM296612 = c12944.m29668("SHA256-Digest");
            if (strM296612 != null) {
                ((MessageDigest) c19018.m43193()).update(bArr, c12945.m29672(), c12945.m29671());
                if (!Base64.encodeToString(((MessageDigest) c19018.m43193()).digest(), 2).equals(strM296612)) {
                    return false;
                }
            } else {
                String strM296613 = c12944.m29668("SHA1-Digest");
                if (strM296613 != null) {
                    ((MessageDigest) c19017.m43193()).update(bArr, c12945.m29672(), c12945.m29671());
                    if (!Base64.encodeToString(((MessageDigest) c19017.m43193()).digest(), 2).equals(strM296613)) {
                        return false;
                    }
                } else {
                    String strM296614 = c12944.m29668("SHA512-Digest");
                    if (strM296614 != null) {
                        ((MessageDigest) c190110.m43193()).update(bArr, c12945.m29672(), c12945.m29671());
                        if (!Base64.encodeToString(((MessageDigest) c190110.m43193()).digest(), 2).equals(strM296614)) {
                            return false;
                        }
                    } else {
                        String strM296615 = c12944.m29668("SHA384-Digest");
                        if (strM296615 == null) {
                            return false;
                        }
                        ((MessageDigest) c19019.m43193()).update(bArr, c12945.m29672(), c12945.m29671());
                        if (!Base64.encodeToString(((MessageDigest) c19019.m43193()).digest(), 2).equals(strM296615)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54987(C19561 c19561, C16334 c16334, InterfaceC18588 interfaceC18588) throws IOException {
        long jM12774;
        ThreadLocal threadLocal;
        final HashMap map = new HashMap(c19561.m44466());
        C7480.stream(c19561.m44469()).filter(new C14953()).forEach(new Consumer() { // from class: l.۫ܽᩳ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                C5738 c5738 = (C5738) obj;
                map.put(c5738.m12794(), c5738);
            }
        });
        C9589 c9589 = new C9589();
        C12983 c12983 = new C12983();
        C18346 c18346 = new C18346();
        C19688 c19688 = new C19688();
        C16207 c16207M44455 = c19561.m44455();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = null;
        AtomicReference atomicReference = new AtomicReference(null);
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        long j2 = 0;
        for (C12943 c12943 : c16334.f48002.values()) {
            String strM29670 = c12943.m29670();
            C5738 c5738 = (C5738) map.remove(strM29670);
            if (c5738 == null) {
                if (C5566.m12323(strM29670)) {
                    return false;
                }
            } else {
                String strM29668 = c12943.m29668("SHA-256-Digest");
                if (strM29668 != null) {
                    threadLocal = c12983;
                } else {
                    strM29668 = c12943.m29668("SHA1-Digest");
                    if (strM29668 != null) {
                        threadLocal = c9589;
                    } else {
                        strM29668 = c12943.m29668("SHA-512-Digest");
                        if (strM29668 != null) {
                            threadLocal = c19688;
                        } else {
                            strM29668 = c12943.m29668("SHA-384-Digest");
                            if (strM29668 == null) {
                                C12826.toString((List) C7480.stream(c12943.m29669()).map(new C12272(0)).collect(C24205.toList()));
                                return false;
                            }
                            threadLocal = c18346;
                        }
                    }
                }
                long jM12775 = c5738.m12774() + j2;
                C9589 c95810 = c9589;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new RunnableC4265(c5738, threadLocal, strM29668, interfaceC18588, atomicBoolean, c16207M44455, atomicReference));
                arrayList2 = arrayList3;
                j2 = jM12775;
                c9589 = c95810;
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
        Collections.sort(arrayList4, C10162.comparingLong(new C8248()));
        ArrayList<List> arrayList6 = new ArrayList();
        long j3 = j2 / ((long) ((int) ((C19110.f57020 + 1) * 1.5f)));
        int i2 = 0;
        ArrayList arrayList7 = arrayList5;
        while (i2 < arrayList4.size()) {
            RunnableC4265 runnableC4265 = (RunnableC4265) arrayList4.get(i2);
            if (arrayList7 == null) {
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(runnableC4265);
                jM12774 = runnableC4265.f9460.m12774();
                arrayList6.add(arrayList8);
                arrayList7 = arrayList8;
            } else {
                jM12774 = runnableC4265.f9460.m12774() + j;
                if (jM12774 > j3) {
                    i2--;
                    arrayList7 = arrayList5;
                } else {
                    arrayList7.add(runnableC4265);
                }
                i2++;
            }
            j = jM12774;
            i2++;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(arrayList6.size());
        for (final List list : arrayList6) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۨܽᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RunnableC4265) it2.next()).run();
                    }
                }
            });
        }
        C4081.m8189(executorServiceNewFixedThreadPool);
        c19561.m44450();
        if (interfaceC18588.mo3924()) {
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
