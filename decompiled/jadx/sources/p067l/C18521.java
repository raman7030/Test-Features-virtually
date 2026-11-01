package p067l;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܿ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C18521 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f55310 = "MIUI BACKUP\n".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ۧ */
    public static long m42093(long j, long j2) {
        return j2 > C14849.FOREVER_NS - j ? C14849.FOREVER_NS : j + j2;
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m42097(AbstractC15599 abstractC15599) {
        return m42096(abstractC15599).mo25505();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C3769 m42094(AbstractC15599 abstractC15599) throws C19192, IOException {
        LinkedHashMap linkedHashMapM42098 = m42098(abstractC15599);
        LinkedHashMap linkedHashMap = new LinkedHashMap(linkedHashMapM42098.size());
        for (AbstractC17043 abstractC17043 : linkedHashMapM42098.values()) {
            linkedHashMap.put(abstractC17043.mo25505(), m42095(abstractC17043));
        }
        HashMap map = new HashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C12826.requireNonNull(key);
            Object value = entry.getValue();
            C12826.requireNonNull(value);
            map.put(key, value);
        }
        return new C3769(C21562.unmodifiableMap(map));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[LOOP:1: B:23:0x0079->B:25:0x007f, LOOP_END] */
    /* JADX INFO: renamed from: ᩳ */
    public static LinkedHashMap m42098(AbstractC15599 abstractC15599) throws C19192, IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC17043 abstractC17043M42096 = m42096(abstractC15599);
        linkedHashMap.put(abstractC17043M42096.mo25505(), abstractC17043M42096);
        if (abstractC15599 instanceof C20661) {
            C20661 c20661 = (C20661) abstractC15599;
            if (c20661.m46689()) {
                try {
                    C14677 c14677 = new C14677(c20661.m46682());
                    int i = c14677.readInt();
                    if (i <= 0 || i > 10000) {
                        throw new IOException("Invalid ZIP split volume count: " + i);
                    }
                    AbstractC17043 abstractC17043M38672 = abstractC17043M42096.m38672();
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC17043 abstractC17043M38684 = abstractC17043M38672.m38684(c14677.m33593());
                        c14677.readLong();
                        linkedHashMap.put(abstractC17043M38684.mo25505(), abstractC17043M38684);
                    }
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Invalid ZIP split metadata", e);
                }
            } else if (abstractC15599 instanceof C4598) {
                for (AbstractC17043 abstractC17043 : ((C4598) abstractC15599).m9726()) {
                    linkedHashMap.put(abstractC17043.mo25505(), abstractC17043);
                }
            }
        } else if (abstractC15599 instanceof C4598) {
            while (r6.hasNext()) {
                linkedHashMap.put(abstractC17043.mo25505(), abstractC17043);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14359 m42095(AbstractC17043 abstractC17043) throws FileNotFoundException {
        if (!abstractC17043.mo25094() || !abstractC17043.mo25093()) {
            throw new FileNotFoundException(abstractC17043.mo25505());
        }
        return new C14359(abstractC17043.mo25505(), abstractC17043.mo25101(), abstractC17043.mo25091());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8324 m42082(AbstractC15599 abstractC15599, C3237 c3237) {
        try {
            if (abstractC15599 instanceof C20661) {
                m42091((C20661) abstractC15599, c3237);
            } else if (abstractC15599 instanceof C19121) {
                m42088((C19121) abstractC15599, c3237);
            } else if (abstractC15599 instanceof C4598) {
                m42085((C4598) abstractC15599, c3237);
            } else if (abstractC15599 instanceof C13315) {
                m42087((C13315) abstractC15599, c3237);
            } else {
                throw new C19192();
            }
            if (!c3237.m5590()) {
                return new C8324(EnumC12487.VALID, null, null);
            }
            return new C8324(EnumC12487.CANCELED, null, null);
        } catch (C12348 e) {
            return new C8324(EnumC12487.INVALID, e.f34459, null);
        } catch (C17850 unused) {
            return new C8324(EnumC12487.CANCELED, null, null);
        } catch (C19192 unused2) {
            return new C8324(EnumC12487.UNSUPPORTED, null, null);
        } catch (Exception e2) {
            return new C8324(EnumC12487.FAILED, null, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX INFO: renamed from: ֫ */
    public static void m42091(final C20661 c20661, final C3237 c3237) throws Exception {
        int iMax;
        int i;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            ArrayList<C5738> arrayList = new ArrayList(c20661.m46677());
            C7480.removeIf(arrayList, new C5364(1));
            C8150.sort(arrayList, C10162.comparingLong(new C17040()));
            Iterator it = arrayList.iterator();
            long jM42093 = 0;
            while (it.hasNext()) {
                jM42093 = m42093(jM42093, Math.max(1L, ((C5738) it.next()).getSize()));
            }
            final C15699 c15699 = new C15699(Math.max(1L, jM42093), c3237);
            ArrayList<C5738> arrayList2 = new ArrayList();
            ArrayList<C5738> arrayList3 = new ArrayList();
            for (C5738 c5738 : arrayList) {
                if (!c5738.m12789() && (c5738.m12748() == 0 || c5738.m12748() == 8)) {
                    arrayList2.add(c5738);
                } else {
                    arrayList3.add(c5738);
                }
            }
            boolean zMo38688 = c20661.m46674().mo38688();
            boolean zM46689 = c20661.m46689();
            int size = arrayList2.size();
            if (!zMo38688) {
                iMax = 1;
            } else if (size < 2) {
                iMax = 1;
            } else {
                iMax = Math.max(1, Math.min(size, Math.min(zM46689 ? 2 : 4, Math.max(1, iAvailableProcessors))));
            }
            if (iMax <= 1) {
                arrayList3.addAll(arrayList2);
                C8150.sort(arrayList3, C10162.comparingLong(new C17040()));
            } else {
                long jM42094 = 0;
                for (C5738 c5739 : arrayList2) {
                    jM42094 = m42093(jM42094, Math.max(1L, Math.max(c5739.m12774(), c5739.getSize())));
                }
                long jM42095 = 0;
                long j = iMax;
                int i2 = 0;
                long jMax = Math.max(1L, ((long) (jM42094 % j == 0 ? 0 : 1)) + (jM42094 / j));
                ArrayList<List> arrayList4 = new ArrayList(iMax);
                ArrayList arrayList5 = new ArrayList();
                while (i2 < arrayList2.size()) {
                    int size2 = arrayList2.size() - i2;
                    int size3 = iMax - arrayList4.size();
                    if (!arrayList5.isEmpty() && size3 > 1 && size2 >= (i = size3 - 1) && (jM42095 >= jMax || size2 == i)) {
                        arrayList4.add(arrayList5);
                        arrayList5 = new ArrayList();
                        jM42095 = 0;
                    }
                    C5738 c57310 = (C5738) arrayList2.get(i2);
                    arrayList5.add(c57310);
                    jM42095 = m42093(jM42095, Math.max(1L, Math.max(c57310.m12774(), c57310.getSize())));
                    i2++;
                    jMax = jMax;
                }
                if (!arrayList5.isEmpty()) {
                    arrayList4.add(arrayList5);
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(arrayList4.size());
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final AtomicReference atomicReference = new AtomicReference();
                ArrayList arrayList6 = new ArrayList(arrayList4.size());
                for (final List list : arrayList4) {
                    arrayList6.add(executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.᩸᩵ܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18521.m42090(c20661, list, c3237, atomicBoolean, c15699, atomicReference);
                        }
                    }));
                }
                executorServiceNewFixedThreadPool.shutdown();
                while (!executorServiceNewFixedThreadPool.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    try {
                        c15699.m35761();
                        if (c3237.m5590() || atomicReference.get() != null) {
                            atomicBoolean.set(true);
                            Iterator it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                ((Future) it2.next()).cancel(true);
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        c3237.cancel();
                        atomicBoolean.set(true);
                        executorServiceNewFixedThreadPool.shutdownNow();
                        throw new C17850();
                    }
                }
                if (c3237.m5590()) {
                    throw new C17850();
                }
                Throwable th = (Throwable) atomicReference.get();
                if (th != null) {
                    if (th instanceof Exception) {
                        throw ((Exception) th);
                    }
                    throw new Exception(th);
                }
            }
            if (!arrayList3.isEmpty()) {
                C19561 c19561M44427 = C19561.m44427(c20661.m46674(), c20661.m46682());
                try {
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean();
                    byte[] bArr = new byte[65536];
                    for (C5738 c57311 : arrayList3) {
                        m42086(c3237, atomicBoolean2);
                        m42089(c19561M44427, c20661, c57311, bArr, c15699, true, c3237, atomicBoolean2);
                    }
                    c19561M44427.close();
                } catch (Throwable th2) {
                    try {
                        c19561M44427.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            c15699.m35759();
            c15699.m35761();
        } catch (IOException e) {
            throw new C12348(null, e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42090(C20661 c20661, List list, C3237 c3237, AtomicBoolean atomicBoolean, C15699 c15699, AtomicReference atomicReference) {
        byte[] bArr = new byte[65536];
        try {
            C19561 c19561M44427 = C19561.m44427(c20661.m46674(), c20661.m46682());
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C5738 c5738 = (C5738) it.next();
                    m42086(c3237, atomicBoolean);
                    m42089(c19561M44427, c20661, c5738, bArr, c15699, false, c3237, atomicBoolean);
                }
                c19561M44427.close();
            } catch (Throwable th) {
                try {
                    c19561M44427.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (!(th3 instanceof C17850)) {
                while (!atomicReference.compareAndSet(null, th3) && atomicReference.get() == null) {
                }
            }
            atomicBoolean.set(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x017a A[EDGE_INSN: B:185:0x017a->B:89:0x017a BREAK  A[LOOP:3: B:86:0x0164->B:88:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b A[Catch: all -> 0x01a0, LOOP:3: B:86:0x0164->B:88:0x016b, LOOP_END, TryCatch #0 {all -> 0x01a0, blocks: (B:83:0x015c, B:86:0x0164, B:88:0x016b, B:89:0x017a, B:91:0x0186, B:96:0x0196, B:97:0x019f), top: B:154:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0186 A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:83:0x015c, B:86:0x0164, B:88:0x016b, B:89:0x017a, B:91:0x0186, B:96:0x0196, B:97:0x019f), top: B:154:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0196 A[Catch: all -> 0x01a0, TRY_ENTER, TryCatch #0 {all -> 0x01a0, blocks: (B:83:0x015c, B:86:0x0164, B:88:0x016b, B:89:0x017a, B:91:0x0186, B:96:0x0196, B:97:0x019f), top: B:154:0x015c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9, types: [l.ۗܺ᩷] */
    /* JADX INFO: renamed from: ֫ */
    public static void m42089(C19561 c19561, C20661 c20661, C5738 c5738, byte[] bArr, C15699 c15699, boolean z, final C3237 c3237, AtomicBoolean atomicBoolean) throws Throwable {
        boolean zM31526;
        String str;
        boolean z2;
        boolean z3;
        BufferedInputStream bufferedInputStream;
        long jM42093;
        int i;
        List list;
        boolean z4;
        String str2;
        int i2 = -1;
        if (!c5738.m12789()) {
            try {
                InputStream inputStreamM44461 = c19561.m44461(c5738);
                while (true) {
                    try {
                        int i3 = inputStreamM44461.read(bArr);
                        if (i3 == -1) {
                            break;
                        }
                        m42086(c3237, atomicBoolean);
                        c15699.m35757(i3);
                        if (z) {
                            c15699.m35761();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamM44461.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                m42086(c3237, atomicBoolean);
                if (c5738.getSize() == 0) {
                    c15699.m35757(1L);
                }
                inputStreamM44461.close();
                return;
            } catch (C17850 e) {
                throw e;
            } catch (IOException e2) {
                if (m42092(e2)) {
                    throw new C19192(e2);
                }
                throw new C12348(c5738.getName(), e2);
            }
        }
        ?? r8 = 0;
        if (C23775.m52847(c5738)) {
            String strM46684 = c20661.m46684();
            List listM52840 = null;
            while (true) {
                m42086(c3237, atomicBoolean);
                if (strM46684 == null || strM46684.isEmpty()) {
                    if (listM52840 == null) {
                        listM52840 = C23775.m52840(c19561, c5738, new InterfaceC18588() { // from class: l.᩹᩵ܳ
                            @Override // p067l.InterfaceC18588
                            /* JADX INFO: renamed from: ᩻ */
                            public final boolean mo3924() {
                                return c3237.m5590();
                            }
                        });
                    }
                    AtomicReference atomicReference = new AtomicReference();
                    C13848 c13848 = new C13848((AbstractActivityC5549) r8, new C21736(atomicReference));
                    c13848.m31525(new C10336(c3237));
                    if (!c13848.m31527(listM52840)) {
                        c3237.cancel();
                        throw new C17850();
                    }
                    strM46684 = (String) atomicReference.get();
                    list = listM52840;
                    z4 = true;
                } else {
                    list = listM52840;
                    z4 = false;
                }
                String str3 = strM46684;
                c19561.m44451(str3);
                long jM42094 = 0;
                try {
                    try {
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(c19561.m44461(c5738));
                            try {
                                try {
                                    if (!C23775.m52848(c5738, bufferedInputStream2)) {
                                        throw new C6150(c5738.getName());
                                    }
                                    while (true) {
                                        int i4 = bufferedInputStream2.read(bArr);
                                        if (i4 == i2) {
                                            break;
                                        }
                                        m42086(c3237, atomicBoolean);
                                        str2 = str3;
                                        long j = i4;
                                        try {
                                            jM42094 = m42093(jM42094, j);
                                            c15699.m35760(j);
                                            c15699.m35761();
                                            str3 = str2;
                                            i2 = -1;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        th = th3;
                                    }
                                    str2 = str3;
                                    m42086(c3237, atomicBoolean);
                                    c15699.m35758(c5738.getSize(), jM42094);
                                    C12248.m28250(c20661.m46685(), str2);
                                    bufferedInputStream2.close();
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            Throwable th6 = th;
                            try {
                                bufferedInputStream2.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        } catch (C6150 unused) {
                            c15699.m35756();
                            c15699.m35761();
                            C12248.m28243(c20661.m46685(), r8);
                            if (z4) {
                                C23775.m52842();
                            }
                            listM52840 = list;
                            strM46684 = null;
                            i2 = -1;
                            r8 = 0;
                        }
                    } catch (C6150 unused2) {
                        r8 = str3;
                        c15699.m35756();
                        c15699.m35761();
                        C12248.m28243(c20661.m46685(), r8);
                        if (z4) {
                            C23775.m52842();
                        }
                        listM52840 = list;
                        strM46684 = null;
                        i2 = -1;
                        r8 = 0;
                    }
                } catch (C17850 e3) {
                    throw e3;
                } catch (IOException e4) {
                    if (m42092(e4)) {
                        throw new C19192(e4);
                    }
                    throw new C12348(c5738.getName(), e4);
                }
                listM52840 = list;
                strM46684 = null;
                i2 = -1;
                r8 = 0;
            }
        } else {
            AbstractActivityC5549 abstractActivityC5549 = null;
            Iterator itM28245 = null;
            while (true) {
                m42086(c3237, atomicBoolean);
                String strM46685 = c20661.m46684();
                try {
                    try {
                        if (strM46685 == null || strM46685.isEmpty()) {
                            if (itM28245 == null) {
                                itM28245 = C12248.m28245();
                            }
                            if (itM28245.hasNext()) {
                                str = (String) itM28245.next();
                                c20661.m46683(str);
                                z2 = false;
                                z3 = true;
                            } else {
                                C13848 c13849 = new C13848(abstractActivityC5549, new C9387(1, c20661));
                                c13849.m31525(new C10336(c3237));
                                zM31526 = c13849.m31526();
                                if (!zM31526) {
                                    c3237.cancel();
                                    throw new C17850();
                                }
                                strM46685 = c20661.m46684();
                            }
                            c19561.m44451(str);
                            bufferedInputStream = new BufferedInputStream(c19561.m44461(c5738));
                            if (C23775.m52848(c5738, bufferedInputStream)) {
                                throw new C6150(c5738.getName());
                            }
                            jM42093 = 0;
                            while (true) {
                                i = bufferedInputStream.read(bArr);
                                if (i != -1) {
                                    break;
                                }
                                m42086(c3237, atomicBoolean);
                                long j2 = i;
                                jM42093 = m42093(jM42093, j2);
                                c15699.m35760(j2);
                                c15699.m35761();
                            }
                            m42086(c3237, atomicBoolean);
                            c15699.m35758(c5738.getSize(), jM42093);
                            if (z3) {
                                C23775.m52843(str, c20661.m46685());
                            }
                            bufferedInputStream.close();
                            break;
                        }
                        zM31526 = false;
                        if (C23775.m52848(c5738, bufferedInputStream)) {
                            throw new C6150(c5738.getName());
                        }
                        jM42093 = 0;
                        while (true) {
                            i = bufferedInputStream.read(bArr);
                            if (i != -1) {
                                break;
                                break;
                            }
                            m42086(c3237, atomicBoolean);
                            long j3 = i;
                            jM42093 = m42093(jM42093, j3);
                            c15699.m35760(j3);
                            c15699.m35761();
                        }
                        m42086(c3237, atomicBoolean);
                        c15699.m35758(c5738.getSize(), jM42093);
                        if (z3) {
                            C23775.m52843(str, c20661.m46685());
                        }
                        bufferedInputStream.close();
                        break;
                    } catch (Throwable th8) {
                        try {
                            bufferedInputStream.close();
                            throw th8;
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                            throw th8;
                        }
                    }
                    bufferedInputStream = new BufferedInputStream(c19561.m44461(c5738));
                } catch (C6150 unused3) {
                    c15699.m35756();
                    c15699.m35761();
                    abstractActivityC5549 = null;
                    c20661.m46683(null);
                    if (z2) {
                        C23775.m52842();
                    }
                } catch (C17850 e5) {
                    throw e5;
                } catch (IOException e6) {
                    if (m42092(e6)) {
                        throw new C19192(e6);
                    }
                    boolean zM12773 = c5738.m12773();
                    if (z3 && zM12773) {
                        c15699.m35756();
                        c15699.m35761();
                        abstractActivityC5549 = null;
                        c20661.m46683(null);
                    } else {
                        throw new C12348(c5738.getName(), e6);
                    }
                }
                z3 = false;
                String str4 = strM46685;
                z2 = zM31526;
                str = str4;
                c19561.m44451(str);
            }
        }
        if (z) {
            c15699.m35761();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42088(C19121 c19121, C3237 c3237) {
        String strM6979;
        C10365 c10365;
        Throwable th;
        AbstractC17043 abstractC17043M43447 = c19121.m43447();
        C15029 c15029 = new C15029(abstractC17043M43447.mo29987(), abstractC17043M43447.mo25101(), c3237);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(c15029, 65536);
            Throwable th2 = null;
            try {
                try {
                    try {
                        InputStream inputStreamM32739 = C14247.m32739(bufferedInputStream, new C3630(bufferedInputStream));
                        if (inputStreamM32739 == null) {
                            inputStreamM32739 = bufferedInputStream;
                        }
                        BufferedInputStream bufferedInputStream2 = inputStreamM32739 instanceof BufferedInputStream ? (BufferedInputStream) inputStreamM32739 : new BufferedInputStream(inputStreamM32739, 65536);
                        m42084(bufferedInputStream2);
                        if (c19121.m43449().isEmpty()) {
                            c10365 = new C10365(bufferedInputStream2, 512, null);
                        } else {
                            c10365 = new C10365(bufferedInputStream2, 512, c19121.m43449());
                        }
                        c10365.m23991();
                        while (true) {
                            try {
                                try {
                                    C3659 c3659M23992 = c10365.m23992();
                                    if (c3659M23992 == null) {
                                        byte[] bArr = new byte[65536];
                                        while (true) {
                                            int i = bufferedInputStream2.read(bArr);
                                            if (i != -1) {
                                                m42086(c3237, (AtomicBoolean) null);
                                                for (int i2 = 0; i2 < i; i2++) {
                                                    if (bArr[i2] != 0) {
                                                        throw new IOException("Non-zero data after TAR end marker");
                                                    }
                                                }
                                            } else {
                                                m42086(c3237, (AtomicBoolean) null);
                                                c10365.close();
                                                bufferedInputStream.close();
                                                c15029.close();
                                                return;
                                            }
                                        }
                                    } else {
                                        strM6979 = c3659M23992.m6979();
                                        try {
                                            byte[] bArr2 = new byte[65536];
                                            long j = 0;
                                            while (true) {
                                                int i3 = c10365.read(bArr2);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                m42086(c3237, (AtomicBoolean) null);
                                                j += (long) i3;
                                            }
                                            m42086(c3237, (AtomicBoolean) null);
                                            if (c3659M23992.m7003() >= 0 && j != c3659M23992.m7003()) {
                                                throw new C12348(strM6979, new IOException("Unexpected TAR entry size: " + j + " != " + c3659M23992.m7003()));
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                c10365.close();
                                                throw th;
                                            } catch (Throwable th4) {
                                                try {
                                                    th.addSuppressed(th4);
                                                    throw th;
                                                } catch (IOException e) {
                                                    e = e;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    strM6979 = null;
                                    c10365.close();
                                    throw th;
                                }
                            } catch (IOException e2) {
                                C3659 c3659M23993 = c10365.m23993();
                                if (c3659M23993 != null && !c3659M23993.m6995()) {
                                    c3659M23993.m6979();
                                    throw e2;
                                }
                                throw e2;
                            }
                            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                                if (C9665.class.isInstance(cause)) {
                                    th2 = (Throwable) C9665.class.cast(cause);
                                    break;
                                }
                            }
                            C9665 c9665 = (C9665) th2;
                            if (c9665 != null) {
                                throw c9665;
                            }
                            if (m42092(e)) {
                                throw new C19192(e);
                            }
                            throw new C12348(strM6979, e);
                        }
                    } catch (Throwable th6) {
                        try {
                            bufferedInputStream.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    strM6979 = null;
                }
            } catch (RuntimeException e4) {
                if (m42092(e4)) {
                    throw new C19192(e4);
                }
                throw e4;
            } catch (C12348 e5) {
            } catch (C17850 e6) {
                throw e6;
            }
        } catch (Throwable th8) {
            try {
                c15029.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42087(C13315 c13315, C3237 c3237) throws C12348, IOException {
        Throwable th = null;
        try {
            c13315.mo9717(false);
            C13985 c13985M30395 = c13315.m30395();
            AbstractC17043 abstractC17043M30396 = c13315.m30396();
            InputStream inputStreamMo29987 = abstractC17043M30396.mo29987();
            try {
                try {
                    InputStream inputStreamM39857 = c13985M30395.m31784().m39857(new C15029(inputStreamMo29987, abstractC17043M30396.mo25101(), c3237));
                    try {
                        byte[] bArr = new byte[65536];
                        while (inputStreamM39857.read(bArr) != -1) {
                            m42086(c3237, (AtomicBoolean) null);
                        }
                        m42086(c3237, (AtomicBoolean) null);
                        inputStreamM39857.close();
                        if (inputStreamMo29987 != null) {
                            inputStreamMo29987.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamM39857 != null) {
                            try {
                                inputStreamM39857.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (C17850 e) {
                    throw e;
                } catch (IOException e2) {
                    for (Throwable cause = e2; cause != null; cause = cause.getCause()) {
                        if (C9665.class.isInstance(cause)) {
                            th = (Throwable) C9665.class.cast(cause);
                            break;
                        }
                    }
                    C9665 c9665 = (C9665) th;
                    if (c9665 != null) {
                        throw c9665;
                    }
                    if (m42092(e2)) {
                        throw new C19192(e2);
                    }
                    throw new C12348(c13985M30395.getName(), e2);
                } catch (RuntimeException e3) {
                    if (m42092(e3)) {
                        throw new C19192(e3);
                    }
                    throw e3;
                }
            } catch (Throwable th4) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e4) {
            throw new C12348(null, e4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42084(BufferedInputStream bufferedInputStream) throws IOException {
        int i;
        byte[] bArr = f55310;
        bufferedInputStream.mark(bArr.length + 2048);
        for (byte b : bArr) {
            if (bufferedInputStream.read() != (b & 255)) {
                bufferedInputStream.reset();
                return;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 2048 && i2 < 8 && (i = bufferedInputStream.read()) != -1; i3++) {
            if (i == 10) {
                i2++;
            }
        }
        if (i2 != 8) {
            bufferedInputStream.reset();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        r1.get(100, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m42085(C4598 c4598, C3237 c3237) throws C12348, IOException {
        try {
            if (!c4598.m9718(new C10336(c3237))) {
                c3237.cancel();
                throw new C17850();
            }
            List listM9728 = c4598.m9728();
            AtomicReference atomicReference = new AtomicReference();
            AtomicInteger atomicInteger = new AtomicInteger();
            C6983 c6983 = new C6983(c4598, listM9728, atomicReference, c3237, atomicInteger);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC15702(2, c6983));
            executorServiceNewSingleThreadExecutor.shutdown();
            while (true) {
                try {
                    try {
                        try {
                            break;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            c3237.cancel();
                            throw new C17850();
                        }
                    } catch (Throwable th) {
                        executorServiceNewSingleThreadExecutor.shutdownNow();
                        throw th;
                    }
                } catch (ExecutionException e) {
                    if (c3237.m5590()) {
                        throw new C17850();
                    }
                    Throwable cause = e.getCause();
                    Exception exc = cause instanceof Exception ? (Exception) cause : new Exception(cause);
                    if (m42092(exc)) {
                        throw new C19192(exc);
                    }
                    if (!(exc instanceof SevenZipException)) {
                        throw exc;
                    }
                    IOException iOExceptionM42080 = m42080((SevenZipException) exc);
                    if (iOExceptionM42080 == null) {
                        throw new C12348((String) atomicReference.get(), (IOException) exc);
                    }
                    throw iOExceptionM42080;
                } catch (TimeoutException unused2) {
                    if (!c3237.m5590()) {
                        c3237.mo13474(atomicInteger.get());
                    }
                }
            }
            if (c3237.m5590()) {
                throw new C17850();
            }
            c3237.mo13474(100);
            executorServiceNewSingleThreadExecutor.shutdownNow();
        } catch (SevenZipException e2) {
            if (c3237.m5590()) {
                throw new C17850();
            }
            IOException iOExceptionM42081 = m42080(e2);
            if (iOExceptionM42081 == null) {
                throw new C12348(null, e2);
            }
            throw iOExceptionM42081;
        } catch (IOException e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42086(InterfaceC5642 interfaceC5642, AtomicBoolean atomicBoolean) throws C17850 {
        if (((C3237) interfaceC5642).m5590() || Thread.currentThread().isInterrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new C17850();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42092(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            String simpleName = cause.getClass().getSimpleName();
            Locale locale = Locale.ROOT;
            if (simpleName.toLowerCase(locale).contains("unsupported")) {
                return true;
            }
            String message = cause.getMessage();
            if (message != null) {
                String lowerCase = message.toLowerCase(locale);
                if (lowerCase.contains("unsupported compression method") || lowerCase.contains("unsupported encryption method") || lowerCase.contains("unsupported method") || lowerCase.contains("unsupportedmethod") || lowerCase.contains("not implemented") || lowerCase.contains("e_notimpl") || lowerCase.contains("dictionary mismatch") || lowerCase.contains("dictionary required") || lowerCase.contains("requires a dictionary")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static IOException m42080(SevenZipException sevenZipException) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.add(sevenZipException);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (hashSet.add(th)) {
                if ((th instanceof IOException) && !(th instanceof SevenZipException)) {
                    return (IOException) th;
                }
                if (th.getCause() != null) {
                    arrayDeque.add(th.getCause());
                }
                if (th instanceof SevenZipException) {
                    SevenZipException sevenZipException2 = (SevenZipException) th;
                    if (sevenZipException2.getCauseLastThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastThrown());
                    }
                    if (sevenZipException2.getCauseFirstPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseFirstPotentialThrown());
                    }
                    if (sevenZipException2.getCauseLastPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastPotentialThrown());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m42096(AbstractC15599 abstractC15599) throws C19192 {
        if (abstractC15599 instanceof C20661) {
            return ((C20661) abstractC15599).m46674();
        }
        if (abstractC15599 instanceof C19121) {
            return ((C19121) abstractC15599).m43447();
        }
        if (abstractC15599 instanceof C4598) {
            return ((C4598) abstractC15599).m9719();
        }
        if (abstractC15599 instanceof C13315) {
            return ((C13315) abstractC15599).m30396();
        }
        throw new C19192();
    }
}
