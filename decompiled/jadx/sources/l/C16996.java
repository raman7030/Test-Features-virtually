package l;

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
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܿ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C16996 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f52130 = "MIUI BACKUP\n".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m39850(long j, long j2) {
        return j2 > C13132.FOREVER_NS - j ? C13132.FOREVER_NS : j + j2;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m39854(AbstractC13921 abstractC13921) {
        return m39853(abstractC13921).mo23554();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1474 m39851(AbstractC13921 abstractC13921) throws C17702, IOException {
        LinkedHashMap linkedHashMapM39855 = m39855(abstractC13921);
        LinkedHashMap linkedHashMap = new LinkedHashMap(linkedHashMapM39855.size());
        for (AbstractC15440 abstractC15440 : linkedHashMapM39855.values()) {
            linkedHashMap.put(abstractC15440.mo23554(), m39852(abstractC15440));
        }
        HashMap map = new HashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C11003.requireNonNull(key);
            Object value = entry.getValue();
            C11003.requireNonNull(value);
            map.put(key, value);
        }
        return new C1474(C20195.unmodifiableMap(map));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[LOOP:1: B:23:0x0079->B:25:0x007f, LOOP_END] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m39855(AbstractC13921 abstractC13921) throws C17702, IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC15440 abstractC15440M39853 = m39853(abstractC13921);
        linkedHashMap.put(abstractC15440M39853.mo23554(), abstractC15440M39853);
        if (abstractC13921 instanceof C19247) {
            C19247 c19247 = (C19247) abstractC13921;
            if (c19247.m44395()) {
                try {
                    C12951 c12951 = new C12951(c19247.m44388());
                    int i = c12951.readInt();
                    if (i <= 0 || i > 10000) {
                        throw new IOException("Invalid ZIP split volume count: " + i);
                    }
                    AbstractC15440 abstractC15440M36514 = abstractC15440M39853.m36514();
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC15440 abstractC15440M36526 = abstractC15440M36514.m36526(c12951.m31506());
                        c12951.readLong();
                        linkedHashMap.put(abstractC15440M36526.mo23554(), abstractC15440M36526);
                    }
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Invalid ZIP split metadata", e);
                }
            } else if (abstractC13921 instanceof C2346) {
                for (AbstractC15440 abstractC15440 : ((C2346) abstractC13921).m7655()) {
                    linkedHashMap.put(abstractC15440.mo23554(), abstractC15440);
                }
            }
        } else if (abstractC13921 instanceof C2346) {
            while (r6.hasNext()) {
                linkedHashMap.put(abstractC15440.mo23554(), abstractC15440);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12616 m39852(AbstractC15440 abstractC15440) throws FileNotFoundException {
        if (!abstractC15440.mo23120() || !abstractC15440.mo23119()) {
            throw new FileNotFoundException(abstractC15440.mo23554());
        }
        return new C12616(abstractC15440.mo23554(), abstractC15440.mo23127(), abstractC15440.mo23117());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6266 m39839(AbstractC13921 abstractC13921, C0914 c0914) {
        try {
            if (abstractC13921 instanceof C19247) {
                m39848((C19247) abstractC13921, c0914);
            } else if (abstractC13921 instanceof C17626) {
                m39845((C17626) abstractC13921, c0914);
            } else if (abstractC13921 instanceof C2346) {
                m39842((C2346) abstractC13921, c0914);
            } else if (abstractC13921 instanceof C11518) {
                m39844((C11518) abstractC13921, c0914);
            } else {
                throw new C17702();
            }
            if (!c0914.m3271()) {
                return new C6266(EnumC10647.VALID, null, null);
            }
            return new C6266(EnumC10647.CANCELED, null, null);
        } catch (C10500 e) {
            return new C6266(EnumC10647.INVALID, e.f31497, null);
        } catch (C16290 unused) {
            return new C6266(EnumC10647.CANCELED, null, null);
        } catch (C17702 unused2) {
            return new C6266(EnumC10647.UNSUPPORTED, null, null);
        } catch (Exception e2) {
            return new C6266(EnumC10647.FAILED, null, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39848(final C19247 c19247, final C0914 c0914) throws Exception {
        int iMax;
        int i;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            ArrayList<C3545> arrayList = new ArrayList(c19247.m44383());
            C5378.removeIf(arrayList, new C3152(1));
            C6083.sort(arrayList, C8200.comparingLong(new C15437()));
            Iterator it = arrayList.iterator();
            long jM39850 = 0;
            while (it.hasNext()) {
                jM39850 = m39850(jM39850, Math.max(1L, ((C3545) it.next()).getSize()));
            }
            final C14026 c14026 = new C14026(Math.max(1L, jM39850), c0914);
            ArrayList<C3545> arrayList2 = new ArrayList();
            ArrayList<C3545> arrayList3 = new ArrayList();
            for (C3545 c3545 : arrayList) {
                if (!c3545.m10808() && (c3545.m10767() == 0 || c3545.m10767() == 8)) {
                    arrayList2.add(c3545);
                } else {
                    arrayList3.add(c3545);
                }
            }
            boolean zMo36530 = c19247.m44380().mo36530();
            boolean zM44395 = c19247.m44395();
            int size = arrayList2.size();
            if (!zMo36530) {
                iMax = 1;
            } else if (size < 2) {
                iMax = 1;
            } else {
                iMax = Math.max(1, Math.min(size, Math.min(zM44395 ? 2 : 4, Math.max(1, iAvailableProcessors))));
            }
            if (iMax <= 1) {
                arrayList3.addAll(arrayList2);
                C6083.sort(arrayList3, C8200.comparingLong(new C15437()));
            } else {
                long jM39851 = 0;
                for (C3545 c3546 : arrayList2) {
                    jM39851 = m39850(jM39851, Math.max(1L, Math.max(c3546.m10793(), c3546.getSize())));
                }
                long jM39852 = 0;
                long j = iMax;
                int i2 = 0;
                long jMax = Math.max(1L, ((long) (jM39851 % j == 0 ? 0 : 1)) + (jM39851 / j));
                ArrayList<List> arrayList4 = new ArrayList(iMax);
                ArrayList arrayList5 = new ArrayList();
                while (i2 < arrayList2.size()) {
                    int size2 = arrayList2.size() - i2;
                    int size3 = iMax - arrayList4.size();
                    if (!arrayList5.isEmpty() && size3 > 1 && size2 >= (i = size3 - 1) && (jM39852 >= jMax || size2 == i)) {
                        arrayList4.add(arrayList5);
                        arrayList5 = new ArrayList();
                        jM39852 = 0;
                    }
                    C3545 c3547 = (C3545) arrayList2.get(i2);
                    arrayList5.add(c3547);
                    jM39852 = m39850(jM39852, Math.max(1L, Math.max(c3547.m10793(), c3547.getSize())));
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
                            C16996.m39847(c19247, list, c0914, atomicBoolean, c14026, atomicReference);
                        }
                    }));
                }
                executorServiceNewFixedThreadPool.shutdown();
                while (!executorServiceNewFixedThreadPool.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    try {
                        c14026.m33641();
                        if (c0914.m3271() || atomicReference.get() != null) {
                            atomicBoolean.set(true);
                            Iterator it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                ((Future) it2.next()).cancel(true);
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        c0914.cancel();
                        atomicBoolean.set(true);
                        executorServiceNewFixedThreadPool.shutdownNow();
                        throw new C16290();
                    }
                }
                if (c0914.m3271()) {
                    throw new C16290();
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
                C18090 c18090M42168 = C18090.m42168(c19247.m44380(), c19247.m44388());
                try {
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean();
                    byte[] bArr = new byte[65536];
                    for (C3545 c3548 : arrayList3) {
                        m39843(c0914, atomicBoolean2);
                        m39846(c18090M42168, c19247, c3548, bArr, c14026, true, c0914, atomicBoolean2);
                    }
                    c18090M42168.close();
                } catch (Throwable th2) {
                    try {
                        c18090M42168.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            c14026.m33639();
            c14026.m33641();
        } catch (IOException e) {
            throw new C10500(null, e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39847(C19247 c19247, List list, C0914 c0914, AtomicBoolean atomicBoolean, C14026 c14026, AtomicReference atomicReference) {
        byte[] bArr = new byte[65536];
        try {
            C18090 c18090M42168 = C18090.m42168(c19247.m44380(), c19247.m44388());
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3545 c3545 = (C3545) it.next();
                    m39843(c0914, atomicBoolean);
                    m39846(c18090M42168, c19247, c3545, bArr, c14026, false, c0914, atomicBoolean);
                }
                c18090M42168.close();
            } catch (Throwable th) {
                try {
                    c18090M42168.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (!(th3 instanceof C16290)) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39846(C18090 c18090, C19247 c19247, C3545 c3545, byte[] bArr, C14026 c14026, boolean z, final C0914 c0914, AtomicBoolean atomicBoolean) throws Throwable {
        boolean zM29464;
        String str;
        boolean z2;
        boolean z3;
        BufferedInputStream bufferedInputStream;
        long jM39850;
        int i;
        List list;
        boolean z4;
        String str2;
        int i2 = -1;
        if (!c3545.m10808()) {
            try {
                InputStream inputStreamM42202 = c18090.m42202(c3545);
                while (true) {
                    try {
                        int i3 = inputStreamM42202.read(bArr);
                        if (i3 == -1) {
                            break;
                        }
                        m39843(c0914, atomicBoolean);
                        c14026.m33637(i3);
                        if (z) {
                            c14026.m33641();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamM42202.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                m39843(c0914, atomicBoolean);
                if (c3545.getSize() == 0) {
                    c14026.m33637(1L);
                }
                inputStreamM42202.close();
                return;
            } catch (C16290 e) {
                throw e;
            } catch (IOException e2) {
                if (m39849(e2)) {
                    throw new C17702(e2);
                }
                throw new C10500(c3545.getName(), e2);
            }
        }
        ?? r8 = 0;
        if (C22523.m50505(c3545)) {
            String strM44390 = c19247.m44390();
            List listM50498 = null;
            while (true) {
                m39843(c0914, atomicBoolean);
                if (strM44390 == null || strM44390.isEmpty()) {
                    if (listM50498 == null) {
                        listM50498 = C22523.m50498(c18090, c3545, new InterfaceC17066() { // from class: l.᩹᩵ܳ
                            @Override // l.InterfaceC17066
                            /* JADX INFO: renamed from: ᩻ */
                            public final boolean mo1526() {
                                return c0914.m3271();
                            }
                        });
                    }
                    AtomicReference atomicReference = new AtomicReference();
                    C12079 c12079 = new C12079((AbstractActivityC3346) r8, new C20378(atomicReference));
                    c12079.m29463(new C8383(c0914));
                    if (!c12079.m29465(listM50498)) {
                        c0914.cancel();
                        throw new C16290();
                    }
                    strM44390 = (String) atomicReference.get();
                    list = listM50498;
                    z4 = true;
                } else {
                    list = listM50498;
                    z4 = false;
                }
                String str3 = strM44390;
                c18090.m42192(str3);
                long jM39851 = 0;
                try {
                    try {
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(c18090.m42202(c3545));
                            try {
                                try {
                                    if (!C22523.m50506(c3545, bufferedInputStream2)) {
                                        throw new C3979(c3545.getName());
                                    }
                                    while (true) {
                                        int i4 = bufferedInputStream2.read(bArr);
                                        if (i4 == i2) {
                                            break;
                                        }
                                        m39843(c0914, atomicBoolean);
                                        str2 = str3;
                                        long j = i4;
                                        try {
                                            jM39851 = m39850(jM39851, j);
                                            c14026.m33640(j);
                                            c14026.m33641();
                                            str3 = str2;
                                            i2 = -1;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        th = th3;
                                    }
                                    str2 = str3;
                                    m39843(c0914, atomicBoolean);
                                    c14026.m33638(c3545.getSize(), jM39851);
                                    C10395.m26221(c19247.m44391(), str2);
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
                        } catch (C3979 unused) {
                            c14026.m33636();
                            c14026.m33641();
                            C10395.m26214(c19247.m44391(), r8);
                            if (z4) {
                                C22523.m50500();
                            }
                            listM50498 = list;
                            strM44390 = null;
                            i2 = -1;
                            r8 = 0;
                        }
                    } catch (C3979 unused2) {
                        r8 = str3;
                        c14026.m33636();
                        c14026.m33641();
                        C10395.m26214(c19247.m44391(), r8);
                        if (z4) {
                            C22523.m50500();
                        }
                        listM50498 = list;
                        strM44390 = null;
                        i2 = -1;
                        r8 = 0;
                    }
                } catch (C16290 e3) {
                    throw e3;
                } catch (IOException e4) {
                    if (m39849(e4)) {
                        throw new C17702(e4);
                    }
                    throw new C10500(c3545.getName(), e4);
                }
                listM50498 = list;
                strM44390 = null;
                i2 = -1;
                r8 = 0;
            }
        } else {
            AbstractActivityC3346 abstractActivityC3346 = null;
            Iterator itM26216 = null;
            while (true) {
                m39843(c0914, atomicBoolean);
                String strM44391 = c19247.m44390();
                try {
                    try {
                        if (strM44391 == null || strM44391.isEmpty()) {
                            if (itM26216 == null) {
                                itM26216 = C10395.m26216();
                            }
                            if (itM26216.hasNext()) {
                                str = (String) itM26216.next();
                                c19247.m44389(str);
                                z2 = false;
                                z3 = true;
                            } else {
                                C12079 c120710 = new C12079(abstractActivityC3346, new C7385(1, c19247));
                                c120710.m29463(new C8383(c0914));
                                zM29464 = c120710.m29464();
                                if (!zM29464) {
                                    c0914.cancel();
                                    throw new C16290();
                                }
                                strM44391 = c19247.m44390();
                            }
                            c18090.m42192(str);
                            bufferedInputStream = new BufferedInputStream(c18090.m42202(c3545));
                            if (C22523.m50506(c3545, bufferedInputStream)) {
                                throw new C3979(c3545.getName());
                            }
                            jM39850 = 0;
                            while (true) {
                                i = bufferedInputStream.read(bArr);
                                if (i != -1) {
                                    break;
                                }
                                m39843(c0914, atomicBoolean);
                                long j2 = i;
                                jM39850 = m39850(jM39850, j2);
                                c14026.m33640(j2);
                                c14026.m33641();
                            }
                            m39843(c0914, atomicBoolean);
                            c14026.m33638(c3545.getSize(), jM39850);
                            if (z3) {
                                C22523.m50501(str, c19247.m44391());
                            }
                            bufferedInputStream.close();
                            break;
                        }
                        zM29464 = false;
                        if (C22523.m50506(c3545, bufferedInputStream)) {
                            throw new C3979(c3545.getName());
                        }
                        jM39850 = 0;
                        while (true) {
                            i = bufferedInputStream.read(bArr);
                            if (i != -1) {
                                break;
                                break;
                            }
                            m39843(c0914, atomicBoolean);
                            long j3 = i;
                            jM39850 = m39850(jM39850, j3);
                            c14026.m33640(j3);
                            c14026.m33641();
                        }
                        m39843(c0914, atomicBoolean);
                        c14026.m33638(c3545.getSize(), jM39850);
                        if (z3) {
                            C22523.m50501(str, c19247.m44391());
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
                    bufferedInputStream = new BufferedInputStream(c18090.m42202(c3545));
                } catch (C3979 unused3) {
                    c14026.m33636();
                    c14026.m33641();
                    abstractActivityC3346 = null;
                    c19247.m44389(null);
                    if (z2) {
                        C22523.m50500();
                    }
                } catch (C16290 e5) {
                    throw e5;
                } catch (IOException e6) {
                    if (m39849(e6)) {
                        throw new C17702(e6);
                    }
                    boolean zM10792 = c3545.m10792();
                    if (z3 && zM10792) {
                        c14026.m33636();
                        c14026.m33641();
                        abstractActivityC3346 = null;
                        c19247.m44389(null);
                    } else {
                        throw new C10500(c3545.getName(), e6);
                    }
                }
                z3 = false;
                String str4 = strM44391;
                z2 = zM29464;
                str = str4;
                c18090.m42192(str);
            }
        }
        if (z) {
            c14026.m33641();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39845(C17626 c17626, C0914 c0914) {
        String strM4741;
        C8414 c8414;
        Throwable th;
        AbstractC15440 abstractC15440M41201 = c17626.m41201();
        C13321 c13321 = new C13321(abstractC15440M41201.mo27926(), abstractC15440M41201.mo23127(), c0914);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(c13321, 65536);
            Throwable th2 = null;
            try {
                try {
                    try {
                        InputStream inputStreamM30664 = C12498.m30664(bufferedInputStream, new C1327(bufferedInputStream));
                        if (inputStreamM30664 == null) {
                            inputStreamM30664 = bufferedInputStream;
                        }
                        BufferedInputStream bufferedInputStream2 = inputStreamM30664 instanceof BufferedInputStream ? (BufferedInputStream) inputStreamM30664 : new BufferedInputStream(inputStreamM30664, 65536);
                        m39841(bufferedInputStream2);
                        if (c17626.m41203().isEmpty()) {
                            c8414 = new C8414(bufferedInputStream2, 512, null);
                        } else {
                            c8414 = new C8414(bufferedInputStream2, 512, c17626.m41203());
                        }
                        c8414.m22021();
                        while (true) {
                            try {
                                try {
                                    C1358 c1358M22022 = c8414.m22022();
                                    if (c1358M22022 == null) {
                                        byte[] bArr = new byte[65536];
                                        while (true) {
                                            int i = bufferedInputStream2.read(bArr);
                                            if (i != -1) {
                                                m39843(c0914, (AtomicBoolean) null);
                                                for (int i2 = 0; i2 < i; i2++) {
                                                    if (bArr[i2] != 0) {
                                                        throw new IOException("Non-zero data after TAR end marker");
                                                    }
                                                }
                                            } else {
                                                m39843(c0914, (AtomicBoolean) null);
                                                c8414.close();
                                                bufferedInputStream.close();
                                                c13321.close();
                                                return;
                                            }
                                        }
                                    } else {
                                        strM4741 = c1358M22022.m4741();
                                        try {
                                            byte[] bArr2 = new byte[65536];
                                            long j = 0;
                                            while (true) {
                                                int i3 = c8414.read(bArr2);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                m39843(c0914, (AtomicBoolean) null);
                                                j += (long) i3;
                                            }
                                            m39843(c0914, (AtomicBoolean) null);
                                            if (c1358M22022.m4765() >= 0 && j != c1358M22022.m4765()) {
                                                throw new C10500(strM4741, new IOException("Unexpected TAR entry size: " + j + " != " + c1358M22022.m4765()));
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                c8414.close();
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
                                    strM4741 = null;
                                    c8414.close();
                                    throw th;
                                }
                            } catch (IOException e2) {
                                C1358 c1358M22023 = c8414.m22023();
                                if (c1358M22023 != null && !c1358M22023.m4757()) {
                                    c1358M22023.m4741();
                                    throw e2;
                                }
                                throw e2;
                            }
                            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                                if (C7677.class.isInstance(cause)) {
                                    th2 = (Throwable) C7677.class.cast(cause);
                                    break;
                                }
                            }
                            C7677 c7677 = (C7677) th2;
                            if (c7677 != null) {
                                throw c7677;
                            }
                            if (m39849(e)) {
                                throw new C17702(e);
                            }
                            throw new C10500(strM4741, e);
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
                    strM4741 = null;
                }
            } catch (RuntimeException e4) {
                if (m39849(e4)) {
                    throw new C17702(e4);
                }
                throw e4;
            } catch (C10500 e5) {
            } catch (C16290 e6) {
                throw e6;
            }
        } catch (Throwable th8) {
            try {
                c13321.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39844(C11518 c11518, C0914 c0914) throws C10500, IOException {
        Throwable th = null;
        try {
            c11518.mo7646(false);
            C12223 c12223M28349 = c11518.m28349();
            AbstractC15440 abstractC15440M28350 = c11518.m28350();
            InputStream inputStreamMo27926 = abstractC15440M28350.mo27926();
            try {
                try {
                    InputStream inputStreamM37683 = c12223M28349.m29722().m37683(new C13321(inputStreamMo27926, abstractC15440M28350.mo23127(), c0914));
                    try {
                        byte[] bArr = new byte[65536];
                        while (inputStreamM37683.read(bArr) != -1) {
                            m39843(c0914, (AtomicBoolean) null);
                        }
                        m39843(c0914, (AtomicBoolean) null);
                        inputStreamM37683.close();
                        if (inputStreamMo27926 != null) {
                            inputStreamMo27926.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamM37683 != null) {
                            try {
                                inputStreamM37683.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (C16290 e) {
                    throw e;
                } catch (IOException e2) {
                    for (Throwable cause = e2; cause != null; cause = cause.getCause()) {
                        if (C7677.class.isInstance(cause)) {
                            th = (Throwable) C7677.class.cast(cause);
                            break;
                        }
                    }
                    C7677 c7677 = (C7677) th;
                    if (c7677 != null) {
                        throw c7677;
                    }
                    if (m39849(e2)) {
                        throw new C17702(e2);
                    }
                    throw new C10500(c12223M28349.getName(), e2);
                } catch (RuntimeException e3) {
                    if (m39849(e3)) {
                        throw new C17702(e3);
                    }
                    throw e3;
                }
            } catch (Throwable th4) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e4) {
            throw new C10500(null, e4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39841(BufferedInputStream bufferedInputStream) throws IOException {
        int i;
        byte[] bArr = f52130;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m39842(C2346 c2346, C0914 c0914) throws C10500, IOException {
        try {
            if (!c2346.m7647(new C8383(c0914))) {
                c0914.cancel();
                throw new C16290();
            }
            List listM7657 = c2346.m7657();
            AtomicReference atomicReference = new AtomicReference();
            AtomicInteger atomicInteger = new AtomicInteger();
            C4855 c4855 = new C4855(c2346, listM7657, atomicReference, c0914, atomicInteger);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC14029(2, c4855));
            executorServiceNewSingleThreadExecutor.shutdown();
            while (true) {
                try {
                    try {
                        try {
                            break;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            c0914.cancel();
                            throw new C16290();
                        }
                    } catch (Throwable th) {
                        executorServiceNewSingleThreadExecutor.shutdownNow();
                        throw th;
                    }
                } catch (ExecutionException e) {
                    if (c0914.m3271()) {
                        throw new C16290();
                    }
                    Throwable cause = e.getCause();
                    Exception exc = cause instanceof Exception ? (Exception) cause : new Exception(cause);
                    if (m39849(exc)) {
                        throw new C17702(exc);
                    }
                    if (!(exc instanceof SevenZipException)) {
                        throw exc;
                    }
                    IOException iOExceptionM39837 = m39837((SevenZipException) exc);
                    if (iOExceptionM39837 == null) {
                        throw new C10500((String) atomicReference.get(), (IOException) exc);
                    }
                    throw iOExceptionM39837;
                } catch (TimeoutException unused2) {
                    if (!c0914.m3271()) {
                        c0914.mo11538(atomicInteger.get());
                    }
                }
            }
            if (c0914.m3271()) {
                throw new C16290();
            }
            c0914.mo11538(100);
            executorServiceNewSingleThreadExecutor.shutdownNow();
        } catch (SevenZipException e2) {
            if (c0914.m3271()) {
                throw new C16290();
            }
            IOException iOExceptionM39838 = m39837(e2);
            if (iOExceptionM39838 == null) {
                throw new C10500(null, e2);
            }
            throw iOExceptionM39838;
        } catch (IOException e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39843(InterfaceC3444 interfaceC3444, AtomicBoolean atomicBoolean) throws C16290 {
        if (((C0914) interfaceC3444).m3271() || Thread.currentThread().isInterrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new C16290();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39849(Exception exc) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m39837(SevenZipException sevenZipException) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39853(AbstractC13921 abstractC13921) throws C17702 {
        if (abstractC13921 instanceof C19247) {
            return ((C19247) abstractC13921).m44380();
        }
        if (abstractC13921 instanceof C17626) {
            return ((C17626) abstractC13921).m41201();
        }
        if (abstractC13921 instanceof C2346) {
            return ((C2346) abstractC13921).m7648();
        }
        if (abstractC13921 instanceof C11518) {
            return ((C11518) abstractC13921).m28350();
        }
        throw new C17702();
    }
}
