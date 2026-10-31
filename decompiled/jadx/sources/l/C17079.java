package l;

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
public final class C17079 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f52367 = C1802.m5988(16);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f52368 = C1802.m5988(4);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11459 f52369;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f52370;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f52371;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f52372;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f52373;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f52374;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f52375;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16373 f52376 = new C16373(this);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f52377;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f52378;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7949 f52379;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52380;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f52381;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f52382;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40082(C17079 c17079, InterfaceC17889 interfaceC17889, AbstractC1557 abstractC1557, String str, AtomicInteger atomicInteger, AbstractC13921 abstractC13921, Set set, C17785 c17785) {
        C10730 c10730M38538;
        c17079.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo36977 = interfaceC17889.mo36978() ? interfaceC17889.mo36977() : null;
            if (strMo36977 != null) {
                c10730M38538 = c17079.f52376.m38538(strMo36977);
                if (c17079.f52371) {
                    set.remove(c17785);
                    return;
                }
                Boolean bool = c10730M38538.f32327;
                if (bool != null) {
                    C11003.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC1557.m5330(new C12182(interfaceC17889, str));
                        atomicInteger.incrementAndGet();
                    } else {
                        set.remove(c17785);
                        return;
                    }
                }
            } else {
                c10730M38538 = null;
            }
            try {
                InputStream inputStreamMo7636 = abstractC13921.mo7636((AbstractActivityC3346) null, interfaceC17889);
                if (inputStreamMo7636 != null) {
                    if (inputStreamMo7636 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo7636;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo7636);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c17079.m40087(bufferedInputStream)) {
                            if (c10730M38538 != null) {
                                c10730M38538.f32327 = Boolean.TRUE;
                                c10730M38538.f32326.countDown();
                            }
                            abstractC1557.m5330(new C12182(interfaceC17889, str));
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
            if (c10730M38538 != null) {
                if (!(c10730M38538.f32327 != null)) {
                    c10730M38538.f32327 = Boolean.FALSE;
                    c10730M38538.f32326.countDown();
                }
            }
            set.remove(c17785);
        } catch (Throwable th3) {
            set.remove(c17785);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40083(C17079 c17079, InterfaceC17889 interfaceC17889, AbstractC1557 abstractC1557, C12182 c12182, AbstractC13921 abstractC13921, Set set, C17785 c17785) {
        C10730 c10730M38538;
        c17079.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo36977 = interfaceC17889.mo36978() ? interfaceC17889.mo36977() : null;
            if (strMo36977 != null) {
                c10730M38538 = c17079.f52376.m38538(strMo36977);
                if (c17079.f52371) {
                    set.remove(c17785);
                    return;
                }
                Boolean bool = c10730M38538.f32327;
                if (bool != null) {
                    C11003.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC1557.m5330(c12182);
                    } else {
                        set.remove(c17785);
                        return;
                    }
                }
            } else {
                c10730M38538 = null;
            }
            try {
                InputStream inputStreamMo7636 = abstractC13921.mo7636((AbstractActivityC3346) null, interfaceC17889);
                if (inputStreamMo7636 != null) {
                    if (inputStreamMo7636 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo7636;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo7636);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c17079.m40087(bufferedInputStream)) {
                            if (c10730M38538 != null) {
                                c10730M38538.f32327 = Boolean.TRUE;
                                c10730M38538.f32326.countDown();
                            }
                            abstractC1557.m5330(c12182);
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
            if (c10730M38538 != null) {
                if (!(c10730M38538.f32327 != null)) {
                    c10730M38538.f32327 = Boolean.FALSE;
                    c10730M38538.f32326.countDown();
                }
            }
            set.remove(c17785);
        } catch (Throwable th3) {
            set.remove(c17785);
            throw th3;
        }
    }

    public C17079(final String str, EnumC8655 enumC8655, boolean z, long j, long j2, long j3, long j4, C11459 c11459) {
        InterfaceC7949 interfaceC7949;
        InterfaceC7949 interfaceC79410;
        InterfaceC7949 interfaceC7949M35540;
        if (str.isEmpty()) {
            interfaceC7949M35540 = new C15709();
        } else {
            switch (C0893.f3466[enumC8655.ordinal()]) {
                case 1:
                    interfaceC7949 = new InterfaceC7949() { // from class: l.ۖۙܳ
                        @Override // l.InterfaceC7949
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            int iCharCount = 0;
                            while (!C5127.m14679(iCharCount, str2, str)) {
                                if (iCharCount == str2.length()) {
                                    return false;
                                }
                                iCharCount += Character.charCount(str2.codePointAt(iCharCount));
                            }
                            return true;
                        }
                    };
                    interfaceC7949M35540 = interfaceC7949;
                    break;
                case 2:
                    interfaceC7949 = new InterfaceC7949() { // from class: l.ۘۙܳ
                        @Override // l.InterfaceC7949
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            return C5127.m14679(0, str2, str);
                        }
                    };
                    interfaceC7949M35540 = interfaceC7949;
                    break;
                case 3:
                    final int iCodePointCount = str.codePointCount(0, str.length());
                    interfaceC79410 = new InterfaceC7949() { // from class: l.ᩴۙܳ
                        @Override // l.InterfaceC7949
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            int iCodePointCount2 = str2.codePointCount(0, str2.length());
                            int i = iCodePointCount;
                            if (iCodePointCount2 < i) {
                                return false;
                            }
                            return C5127.m14679(str2.offsetByCodePoints(0, iCodePointCount2 - i), str2, str);
                        }
                    };
                    interfaceC7949M35540 = interfaceC79410;
                    break;
                case 4:
                    final int iCodePointCount2 = str.codePointCount(0, str.length());
                    interfaceC79410 = new InterfaceC7949() { // from class: l.᩵ۙܳ
                        @Override // l.InterfaceC7949
                        /* JADX INFO: renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            return str2.codePointCount(0, str2.length()) == iCodePointCount2 && C5127.m14679(0, str2, str);
                        }
                    };
                    interfaceC7949M35540 = interfaceC79410;
                    break;
                case 5:
                    interfaceC7949M35540 = C15003.m35540(str);
                    break;
                case 6:
                    final C12164 c12164Matcher = C11459.m28259(66, str).matcher((CharSequence) "");
                    interfaceC7949 = new InterfaceC7949() { // from class: l.֡ۙܳ
                        @Override // l.InterfaceC7949
                        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final boolean mo1332(String str2) {
                            C12164 c12164 = c12164Matcher;
                            c12164.m29615reset((CharSequence) str2);
                            return c12164.matches();
                        }
                    };
                    interfaceC7949M35540 = interfaceC7949;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported filename match mode: " + enumC8655);
            }
        }
        this.f52379 = interfaceC7949M35540;
        this.f52370 = z;
        this.f52381 = j;
        this.f52382 = j2;
        this.f52374 = j3;
        this.f52372 = j4;
        this.f52369 = c11459;
        this.f52375 = (j == -1 && j2 == -1) ? false : true;
        this.f52378 = (j3 == -1 && j4 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40090() {
        this.f52371 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40091(final AbstractC13921 abstractC13921, String str, final AbstractC1557 abstractC1557, List list) {
        List listMo7637;
        this.f52371 = false;
        this.f52380 = false;
        this.f52376.m38539();
        this.f52377 = str;
        String str2 = "/";
        if (str.equals("/")) {
            this.f52373 = "/";
        } else {
            this.f52373 = "./";
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        LinkedList linkedList = new LinkedList(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC10942());
        loop0: while (true) {
            if (linkedList.isEmpty()) {
                Set<C17785> set = setNewSetFromMap;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (!linkedHashMap2.isEmpty()) {
                    abstractC13921.mo7640(linkedHashMap2.keySet(), new C7243(this, linkedHashMap2, abstractC1557, atomicInteger));
                }
                for (C17785 c17785 : set) {
                    if (this.f52371) {
                        m40081(set);
                        break;
                    } else if (!c17785.f54398.isDone()) {
                        abstractC1557.mo5329(c17785.f54399, false);
                        try {
                            c17785.f54398.get();
                        } catch (Exception unused) {
                        }
                    }
                }
                break;
            }
            if (this.f52371) {
                m40081(setNewSetFromMap);
                break;
            }
            String strConcat = (String) linkedList.removeFirst();
            if (!strConcat.isEmpty() && !strConcat.endsWith(str2)) {
                strConcat = strConcat.concat(str2);
            }
            String str3 = strConcat;
            String strM23341 = C9045.m23341(new StringBuilder(), this.f52373, str3);
            boolean z = true;
            abstractC1557.mo5329(strM23341, true);
            try {
                listMo7637 = abstractC13921.mo7637(this.f52377 + str3, true);
            } catch (IOException unused2) {
                listMo7637 = Collections.EMPTY_LIST;
            }
            List<InterfaceC17889> list2 = listMo7637;
            for (final InterfaceC17889 interfaceC17889 : list2) {
                if (this.f52371) {
                    m40081(setNewSetFromMap);
                    break loop0;
                }
                if (atomicInteger.get() >= 10000) {
                    this.f52371 = z;
                    this.f52380 = z;
                    m40081(setNewSetFromMap);
                    break loop0;
                }
                if (m40089(interfaceC17889)) {
                    if (this.f52369 == null) {
                        abstractC1557.m5330(new C12182(interfaceC17889, strM23341));
                        atomicInteger.incrementAndGet();
                    } else if (!m40086(interfaceC17889)) {
                        continue;
                    } else if (abstractC13921.mo7652()) {
                        linkedHashMap.put(interfaceC17889, strM23341);
                    } else {
                        while (setNewSetFromMap.size() > 500) {
                            SystemClock.sleep(10L);
                            if (this.f52371) {
                                break loop0;
                            }
                        }
                        StringBuilder sbM15339 = C5368.m15339(strM23341);
                        sbM15339.append(interfaceC17889.getName());
                        final C17785 c17786 = new C17785(sbM15339.toString());
                        setNewSetFromMap.add(c17786);
                        final String str4 = strM23341;
                        c17786.f54398 = (abstractC13921 instanceof AbstractC3163 ? f52368 : f52367).submit(new Runnable() { // from class: l.᩺ۙܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C17079.m40082(this.f73514, interfaceC17889, abstractC1557, str4, atomicInteger, abstractC13921, setNewSetFromMap, c17786);
                            }
                        });
                        z = true;
                        linkedHashMap = linkedHashMap;
                        str2 = str2;
                        strM23341 = strM23341;
                        str3 = str3;
                    }
                }
            }
            String str5 = str3;
            Set set2 = setNewSetFromMap;
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            String str6 = str2;
            if (this.f52370) {
                for (InterfaceC17889 interfaceC178810 : list2) {
                    if (interfaceC178810.isDirectory() && !interfaceC178810.mo36978() && (!(interfaceC178810 instanceof C9555) || !interfaceC178810.getName().contains(".recycle") || !C21939.m49417() || !interfaceC178810.getPath().equals(C21939.m49419().mo23554()))) {
                        StringBuilder sbM153310 = C5368.m15339(str5);
                        sbM153310.append(interfaceC178810.getName());
                        sbM153310.append('/');
                        linkedList.addLast(sbM153310.toString());
                    }
                }
            }
            linkedHashMap = linkedHashMap3;
            str2 = str6;
            setNewSetFromMap = set2;
        }
        if (this.f52380) {
            C4925.m14315(new RunnableC5832());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40092(final AbstractC13921 abstractC13921, List list, final AbstractC1557 abstractC1557) {
        this.f52371 = false;
        this.f52376.m38539();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set<C17785> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC10942());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final C12182 c12182 = (C12182) it.next();
            abstractC1557.mo5329(c12182.m29662(), true);
            final InterfaceC17889 interfaceC17889M29658 = c12182.m29658();
            if (this.f52371) {
                m40081(setNewSetFromMap);
                return;
            }
            if (m40089(interfaceC17889M29658)) {
                if (this.f52369 == null) {
                    abstractC1557.m5330(c12182);
                } else if (!m40086(interfaceC17889M29658)) {
                    continue;
                } else if (abstractC13921.mo7652()) {
                    linkedHashMap.put(interfaceC17889M29658, c12182);
                } else {
                    while (setNewSetFromMap.size() > 500) {
                        SystemClock.sleep(10L);
                        if (this.f52371) {
                            return;
                        }
                    }
                    final C17785 c17785 = new C17785(c12182.m29663());
                    setNewSetFromMap.add(c17785);
                    c17785.f54398 = (abstractC13921 instanceof AbstractC3163 ? f52368 : f52367).submit(new Runnable() { // from class: l.ۤۙܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C17079.m40083(this.f30254, interfaceC17889M29658, abstractC1557, c12182, abstractC13921, setNewSetFromMap, c17785);
                        }
                    });
                    it = it;
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            abstractC13921.mo7640(linkedHashMap.keySet(), new C13592(this, linkedHashMap, abstractC1557));
        }
        for (C17785 c17786 : setNewSetFromMap) {
            if (this.f52371) {
                m40081(setNewSetFromMap);
                return;
            } else if (!c17786.f54398.isDone()) {
                abstractC1557.mo5329(c17786.f54399, false);
                try {
                    c17786.f54398.get();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40089(InterfaceC17889 interfaceC17889) {
        if (this.f52375) {
            if (interfaceC17889.isDirectory()) {
                return false;
            }
            long size = interfaceC17889.getSize();
            long j = this.f52381;
            if (j != -1 && j > size) {
                return false;
            }
            long j2 = this.f52382;
            if (j2 != -1 && size >= j2) {
                return false;
            }
        }
        if (this.f52378) {
            long time = interfaceC17889.getTime();
            long j3 = this.f52374;
            if (j3 != -1 && j3 > time) {
                return false;
            }
            long j4 = this.f52372;
            if (j4 != -1 && time >= j4) {
                return false;
            }
        }
        return this.f52379.mo1332(interfaceC17889.getName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40086(InterfaceC17889 interfaceC17889) {
        if (!interfaceC17889.mo36969() || interfaceC17889.getSize() <= 0) {
            return false;
        }
        String path = interfaceC17889.getPath();
        if (path.startsWith("/sys/devices/")) {
            return false;
        }
        if (path.startsWith("/proc/") && path.contains("/fd/")) {
            return false;
        }
        String strMo36977 = interfaceC17889.mo36977();
        if (strMo36977 != null) {
            return (!strMo36977.startsWith("/") || strMo36977.startsWith("/memfd:") || strMo36977.equals("/dmabuf:") || strMo36977.equals("/[aio] (deleted)") || strMo36977.startsWith("/sys/devices/")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40081(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C17785 c17785 = (C17785) it.next();
            if (!c17785.f54398.isDone()) {
                c17785.f54398.cancel(true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static BufferedInputStream m40080(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m40087(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[65536];
        inputStream.mark(65536);
        int i = inputStream.read(bArr);
        if (i == -1) {
            return false;
        }
        Charset charsetM35151 = C14776.m35151(C14776.m35152(i, bArr));
        inputStream.reset();
        return new C4131(new InputStreamReader(inputStream, charsetM35151)).m12410(this.f52369, new InterfaceC17066() { // from class: l.ۨۙܳ
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                return this.f34284.f52371;
            }
        }, false);
    }
}
