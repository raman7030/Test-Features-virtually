package p067l;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܿۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18600 {

    /* JADX INFO: renamed from: ᩴ */
    public static final ThreadPoolExecutor f55549 = C4081.m8185(16);

    /* JADX INFO: renamed from: ᩵ */
    public static final ThreadPoolExecutor f55550 = C4081.m8185(4);

    /* JADX INFO: renamed from: ֫ */
    public final C13259 f55551;

    /* JADX INFO: renamed from: ۖ */
    public final boolean f55552;

    /* JADX INFO: renamed from: ۘ */
    public boolean f55553;

    /* JADX INFO: renamed from: ۜ */
    public final long f55554;

    /* JADX INFO: renamed from: ۡ */
    public String f55555;

    /* JADX INFO: renamed from: ۢ */
    public final long f55556;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f55557;

    /* JADX INFO: renamed from: ܳ */
    public final C17929 f55558 = new C17929(this);

    /* JADX INFO: renamed from: ܺ */
    public String f55559;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f55560;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9923 f55561;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f55562;

    /* JADX INFO: renamed from: ᩷ */
    public final long f55563;

    /* JADX INFO: renamed from: ᩻ */
    public final long f55564;

    /* JADX INFO: renamed from: ֫ */
    public static void m42327(C18600 c18600, InterfaceC19370 interfaceC19370, AbstractC3848 abstractC3848, String str, AtomicInteger atomicInteger, AbstractC15599 abstractC15599, Set set, C19271 c19271) {
        C12566 c12566M40755;
        c18600.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo39143 = interfaceC19370.mo39144() ? interfaceC19370.mo39143() : null;
            if (strMo39143 != null) {
                c12566M40755 = c18600.f55558.m40755(strMo39143);
                if (c18600.f55553) {
                    set.remove(c19271);
                    return;
                }
                Boolean bool = c12566M40755.f35301;
                if (bool != null) {
                    C12826.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC3848.m7559(new C13946(interfaceC19370, str));
                        atomicInteger.incrementAndGet();
                    } else {
                        set.remove(c19271);
                        return;
                    }
                }
            } else {
                c12566M40755 = null;
            }
            try {
                InputStream inputStreamMo9707 = abstractC15599.mo9707((AbstractActivityC5549) null, interfaceC19370);
                if (inputStreamMo9707 != null) {
                    if (inputStreamMo9707 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo9707;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo9707);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c18600.m42332(bufferedInputStream)) {
                            if (c12566M40755 != null) {
                                c12566M40755.f35301 = Boolean.TRUE;
                                c12566M40755.f35300.countDown();
                            }
                            abstractC3848.m7559(new C13946(interfaceC19370, str));
                            atomicInteger.incrementAndGet();
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
            if (c12566M40755 != null) {
                if (!(c12566M40755.f35301 != null)) {
                    c12566M40755.f35301 = Boolean.FALSE;
                    c12566M40755.f35300.countDown();
                }
            }
            set.remove(c19271);
        } catch (Throwable th3) {
            set.remove(c19271);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42328(C18600 c18600, InterfaceC19370 interfaceC19370, AbstractC3848 abstractC3848, C13946 c13946, AbstractC15599 abstractC15599, Set set, C19271 c19271) {
        C12566 c12566M40755;
        c18600.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo39143 = interfaceC19370.mo39144() ? interfaceC19370.mo39143() : null;
            if (strMo39143 != null) {
                c12566M40755 = c18600.f55558.m40755(strMo39143);
                if (c18600.f55553) {
                    set.remove(c19271);
                    return;
                }
                Boolean bool = c12566M40755.f35301;
                if (bool != null) {
                    C12826.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC3848.m7559(c13946);
                    } else {
                        set.remove(c19271);
                        return;
                    }
                }
            } else {
                c12566M40755 = null;
            }
            try {
                InputStream inputStreamMo9707 = abstractC15599.mo9707((AbstractActivityC5549) null, interfaceC19370);
                if (inputStreamMo9707 != null) {
                    if (inputStreamMo9707 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo9707;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo9707);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c18600.m42332(bufferedInputStream)) {
                            if (c12566M40755 != null) {
                                c12566M40755.f35301 = Boolean.TRUE;
                                c12566M40755.f35300.countDown();
                            }
                            abstractC3848.m7559(c13946);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Exception unused) {
            }
            if (c12566M40755 != null) {
                if (!(c12566M40755.f35301 != null)) {
                    c12566M40755.f35301 = Boolean.FALSE;
                    c12566M40755.f35300.countDown();
                }
            }
            set.remove(c19271);
        } catch (Throwable th3) {
            set.remove(c19271);
            throw th3;
        }
    }

    public C18600(final String str, EnumC10594 enumC10594, boolean z, long j, long j2, long j3, long j4, C13259 c13259) {
        InterfaceC9923 interfaceC9923;
        InterfaceC9923 interfaceC9924;
        InterfaceC9923 interfaceC9923M37696;
        if (str.isEmpty()) {
            interfaceC9923M37696 = new C17298();
        } else {
            switch (C3217.f6239[enumC10594.ordinal()]) {
                case 1:
                    interfaceC9923 = new InterfaceC9923() { // from class: l.ۖۙܳ
                        @Override // p067l.InterfaceC9923
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo3740(String str2) {
                            int iCharCount = 0;
                            while (!C7241.m16587(iCharCount, str2, str)) {
                                if (iCharCount == str2.length()) {
                                    return false;
                                }
                                iCharCount += Character.charCount(str2.codePointAt(iCharCount));
                            }
                            return true;
                        }
                    };
                    interfaceC9923M37696 = interfaceC9923;
                    break;
                case 2:
                    interfaceC9923 = new InterfaceC9923() { // from class: l.ۘۙܳ
                        @Override // p067l.InterfaceC9923
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo3740(String str2) {
                            return C7241.m16587(0, str2, str);
                        }
                    };
                    interfaceC9923M37696 = interfaceC9923;
                    break;
                case 3:
                    final int iCodePointCount = str.codePointCount(0, str.length());
                    interfaceC9924 = new InterfaceC9923() { // from class: l.ᩴۙܳ
                        @Override // p067l.InterfaceC9923
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo3740(String str2) {
                            int iCodePointCount2 = str2.codePointCount(0, str2.length());
                            int i = iCodePointCount;
                            if (iCodePointCount2 < i) {
                                return false;
                            }
                            return C7241.m16587(str2.offsetByCodePoints(0, iCodePointCount2 - i), str2, str);
                        }
                    };
                    interfaceC9923M37696 = interfaceC9924;
                    break;
                case 4:
                    final int iCodePointCount2 = str.codePointCount(0, str.length());
                    interfaceC9924 = new InterfaceC9923() { // from class: l.᩵ۙܳ
                        @Override // p067l.InterfaceC9923
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo3740(String str2) {
                            return str2.codePointCount(0, str2.length()) == iCodePointCount2 && C7241.m16587(0, str2, str);
                        }
                    };
                    interfaceC9923M37696 = interfaceC9924;
                    break;
                case 5:
                    interfaceC9923M37696 = C16627.m37696(str);
                    break;
                case 6:
                    final C13929 c13929Matcher = C13259.m30303(66, str).matcher((CharSequence) "");
                    interfaceC9923 = new InterfaceC9923() { // from class: l.֡ۙܳ
                        @Override // p067l.InterfaceC9923
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo3740(String str2) {
                            C13929 c13929 = c13929Matcher;
                            c13929.m56473reset((CharSequence) str2);
                            return c13929.matches();
                        }
                    };
                    interfaceC9923M37696 = interfaceC9923;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported filename match mode: " + enumC10594);
            }
        }
        this.f55561 = interfaceC9923M37696;
        this.f55552 = z;
        this.f55563 = j;
        this.f55564 = j2;
        this.f55556 = j3;
        this.f55554 = j4;
        this.f55551 = c13259;
        this.f55557 = (j == -1 && j2 == -1) ? false : true;
        this.f55560 = (j3 == -1 && j4 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42335() {
        this.f55553 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42336(final AbstractC15599 abstractC15599, String str, final AbstractC3848 abstractC3848, List list) {
        List listMo9708;
        this.f55553 = false;
        this.f55562 = false;
        this.f55558.m40756();
        this.f55559 = str;
        String str2 = "/";
        if (str.equals("/")) {
            this.f55555 = "/";
        } else {
            this.f55555 = "./";
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        LinkedList linkedList = new LinkedList(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC12768());
        loop0: while (true) {
            if (linkedList.isEmpty()) {
                Set<C19271> set = setNewSetFromMap;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (!linkedHashMap2.isEmpty()) {
                    abstractC15599.mo9711(linkedHashMap2.keySet(), new C9252(this, linkedHashMap2, abstractC3848, atomicInteger));
                }
                for (C19271 c19271 : set) {
                    if (this.f55553) {
                        m42326(set);
                        break;
                    } else if (!c19271.f57592.isDone()) {
                        abstractC3848.mo7558(c19271.f57593, false);
                        try {
                            c19271.f57592.get();
                        } catch (Exception unused) {
                        }
                    }
                }
                break;
            }
            if (this.f55553) {
                m42326(setNewSetFromMap);
                break;
            }
            String strConcat = (String) linkedList.removeFirst();
            if (!strConcat.isEmpty() && !strConcat.endsWith(str2)) {
                strConcat = strConcat.concat(str2);
            }
            String str3 = strConcat;
            String strM25286 = C10965.m25286(new StringBuilder(), this.f55555, str3);
            boolean z = true;
            abstractC3848.mo7558(strM25286, true);
            try {
                listMo9708 = abstractC15599.mo9708(this.f55559 + str3, true);
            } catch (IOException unused2) {
                listMo9708 = Collections.EMPTY_LIST;
            }
            List<InterfaceC19370> list2 = listMo9708;
            for (final InterfaceC19370 interfaceC19370 : list2) {
                if (this.f55553) {
                    m42326(setNewSetFromMap);
                    break loop0;
                }
                if (atomicInteger.get() >= 10000) {
                    this.f55553 = z;
                    this.f55562 = z;
                    m42326(setNewSetFromMap);
                    break loop0;
                }
                if (m42334(interfaceC19370)) {
                    if (this.f55551 == null) {
                        abstractC3848.m7559(new C13946(interfaceC19370, strM25286));
                        atomicInteger.incrementAndGet();
                    } else if (!m42331(interfaceC19370)) {
                        continue;
                    } else if (abstractC15599.mo9723()) {
                        linkedHashMap.put(interfaceC19370, strM25286);
                    } else {
                        while (setNewSetFromMap.size() > 500) {
                            SystemClock.sleep(10L);
                            if (this.f55553) {
                                break loop0;
                            }
                        }
                        StringBuilder sbM17248 = C7470.m17248(strM25286);
                        sbM17248.append(interfaceC19370.getName());
                        final C19271 c19272 = new C19271(sbM17248.toString());
                        setNewSetFromMap.add(c19272);
                        final String str4 = strM25286;
                        c19272.f57592 = (abstractC15599 instanceof AbstractC5375 ? f55550 : f55549).submit(new Runnable() { // from class: l.᩺ۙܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18600.m42327(this.f76240, interfaceC19370, abstractC3848, str4, atomicInteger, abstractC15599, setNewSetFromMap, c19272);
                            }
                        });
                        z = true;
                        linkedHashMap = linkedHashMap;
                        str2 = str2;
                        strM25286 = strM25286;
                        str3 = str3;
                    }
                }
            }
            String str5 = str3;
            Set set2 = setNewSetFromMap;
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            String str6 = str2;
            if (this.f55552) {
                for (InterfaceC19370 interfaceC19371 : list2) {
                    if (interfaceC19371.isDirectory() && !interfaceC19371.mo39144() && (!(interfaceC19371 instanceof C11450) || !interfaceC19371.getName().contains(".recycle") || !C23219.m51754() || !interfaceC19371.getPath().equals(C23219.m51756().mo25505()))) {
                        StringBuilder sbM17249 = C7470.m17248(str5);
                        sbM17249.append(interfaceC19371.getName());
                        sbM17249.append('/');
                        linkedList.addLast(sbM17249.toString());
                    }
                }
            }
            linkedHashMap = linkedHashMap3;
            str2 = str6;
            setNewSetFromMap = set2;
        }
        if (this.f55562) {
            C7050.m16212(new RunnableC7911());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42337(final AbstractC15599 abstractC15599, List list, final AbstractC3848 abstractC3848) {
        this.f55553 = false;
        this.f55558.m40756();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set<C19271> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC12768());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final C13946 c13946 = (C13946) it.next();
            abstractC3848.mo7558(c13946.m31724(), true);
            final InterfaceC19370 interfaceC19370M31720 = c13946.m31720();
            if (this.f55553) {
                m42326(setNewSetFromMap);
                return;
            }
            if (m42334(interfaceC19370M31720)) {
                if (this.f55551 == null) {
                    abstractC3848.m7559(c13946);
                } else if (!m42331(interfaceC19370M31720)) {
                    continue;
                } else if (abstractC15599.mo9723()) {
                    linkedHashMap.put(interfaceC19370M31720, c13946);
                } else {
                    while (setNewSetFromMap.size() > 500) {
                        SystemClock.sleep(10L);
                        if (this.f55553) {
                            return;
                        }
                    }
                    final C19271 c19271 = new C19271(c13946.m31725());
                    setNewSetFromMap.add(c19271);
                    c19271.f57592 = (abstractC15599 instanceof AbstractC5375 ? f55550 : f55549).submit(new Runnable() { // from class: l.ۤۙܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18600.m42328(this.f33212, interfaceC19370M31720, abstractC3848, c13946, abstractC15599, setNewSetFromMap, c19271);
                        }
                    });
                    it = it;
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            abstractC15599.mo9711(linkedHashMap.keySet(), new C15286(this, linkedHashMap, abstractC3848));
        }
        for (C19271 c19272 : setNewSetFromMap) {
            if (this.f55553) {
                m42326(setNewSetFromMap);
                return;
            } else if (!c19272.f57592.isDone()) {
                abstractC3848.mo7558(c19272.f57593, false);
                try {
                    c19272.f57592.get();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m42334(InterfaceC19370 interfaceC19370) {
        if (this.f55557) {
            if (interfaceC19370.isDirectory()) {
                return false;
            }
            long size = interfaceC19370.getSize();
            long j = this.f55563;
            if (j != -1 && j > size) {
                return false;
            }
            long j2 = this.f55564;
            if (j2 != -1 && size >= j2) {
                return false;
            }
        }
        if (this.f55560) {
            long time = interfaceC19370.getTime();
            long j3 = this.f55556;
            if (j3 != -1 && j3 > time) {
                return false;
            }
            long j4 = this.f55554;
            if (j4 != -1 && time >= j4) {
                return false;
            }
        }
        return this.f55561.mo3740(interfaceC19370.getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42331(InterfaceC19370 interfaceC19370) {
        if (!interfaceC19370.mo39135() || interfaceC19370.getSize() <= 0) {
            return false;
        }
        String path = interfaceC19370.getPath();
        if (path.startsWith("/sys/devices/")) {
            return false;
        }
        if (path.startsWith("/proc/") && path.contains("/fd/")) {
            return false;
        }
        String strMo39143 = interfaceC19370.mo39143();
        if (strMo39143 != null) {
            return (!strMo39143.startsWith("/") || strMo39143.startsWith("/memfd:") || strMo39143.equals("/dmabuf:") || strMo39143.equals("/[aio] (deleted)") || strMo39143.startsWith("/sys/devices/")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42326(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C19271 c19271 = (C19271) it.next();
            if (!c19271.f57592.isDone()) {
                c19271.f57592.cancel(true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static BufferedInputStream m42325(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public boolean m42332(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[65536];
        inputStream.mark(65536);
        int i = inputStream.read(bArr);
        if (i == -1) {
            return false;
        }
        Charset charsetM37298 = C16412.m37298(C16412.m37299(i, bArr));
        inputStream.reset();
        return new C6295(new InputStreamReader(inputStream, charsetM37298)).m14300(this.f55551, new InterfaceC18588() { // from class: l.ۨۙܳ
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return this.f37280.f55553;
            }
        }, false);
    }
}
