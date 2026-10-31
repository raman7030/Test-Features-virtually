package l;

import android.content.res.AssetManager;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۜ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7017 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21654 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f21655 = new ThreadLocal();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f21656 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static volatile C17600 f21657;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m18966(AbstractC15440 abstractC15440) {
        String strM36489 = abstractC15440.m36489();
        C15068 c15068M24909 = C9840.m24909(strM36489, abstractC15440.mo23554());
        String strM35657 = c15068M24909.m35657();
        String lowerCase = strM35657.toLowerCase(Locale.ROOT);
        C15587 c15587M18956 = m18956(C16293.f50117.m36526("syntax/custom"), strM35657);
        C17600 c17600M18957 = m18957();
        C14777 c14777 = new C14777(c17600M18957);
        ((HashMap) c14777.f45139).putAll(c17600M18957.f53782);
        ((HashMap) c14777.f45139).put(lowerCase, c15068M24909);
        C17600 c17600 = new C17600(c14777);
        m18967(c15587M18956, strM36489, c15068M24909);
        c15068M24909.m35652(new CallableC10131(strM36489));
        m18970(c17600);
        C2204.m7301(true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m18982(C15068 c15068) {
        String strM35657 = c15068.m35657();
        String lowerCase = strM35657.toLowerCase(Locale.ROOT);
        C15587 c15587M18956 = m18956(C16293.f50117.m36526("syntax/custom"), strM35657);
        try {
            C10130 c10130 = new C10130();
            c10130.mo13231(65535);
            c10130.m25423((CharSequence) lowerCase);
            m18968(c15587M18956, c10130);
            C17600 c17600M18957 = m18957();
            C14777 c14777 = new C14777(c17600M18957);
            ((HashMap) c14777.f45139).putAll(c17600M18957.f53782);
            ((HashMap) c14777.f45139).remove(lowerCase);
            try {
                m18970(new C17600(c14777));
                C2204.m7301(true);
            } catch (Error | RuntimeException e) {
                try {
                    m18967(c15587M18956, c15068.m35656(), c15068);
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        } catch (IOException unused) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static synchronized void m18987() {
        final AssetManager assetManagerM14325 = C4925.m14325();
        C15587 c15587M36534 = C16293.f50117.m36526("syntax/online").m36534();
        C17600 c17600M18958 = null;
        if (c15587M36534.mo23113()) {
            final C15587 c15587M36535 = c15587M36534.m36526("init/styles.mtsx").m36534();
            final C15587 c15587M36536 = c15587M36534.m36526("init/builtins.mtsx").m36534();
            C15587 c15587M36537 = c15587M36534.m36526("VERSION").m36534();
            int i = -1;
            try {
                if (c15587M36537.mo23120()) {
                    i = c15587M36537.m36528().readInt();
                }
            } catch (Exception unused) {
            }
            if (i > 14) {
                final List list = (List) C5378.stream(c15587M36534.mo23549(true)).filter(new C21420(0)).collect(C22976.toList());
                try {
                    if (!c15587M36535.mo23119() || !c15587M36536.mo23119() || list.isEmpty()) {
                        throw new IOException("Incomplete online syntax package");
                    }
                    c17600M18958 = m18958(new InterfaceC23950() { // from class: l.᩶ۜܿ
                        @Override // l.InterfaceC23950
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo13233(C14777 c14777) throws IOException {
                            C7017.m18969(c15587M36535, c15587M36536, list, assetManagerM14325, c14777);
                        }
                    });
                } catch (Throwable th) {
                    try {
                        AbstractC15440 abstractC15440M36524 = c15587M36534.m36524("online_bad");
                        abstractC15440M36524.mo23552();
                        c15587M36534.mo23551(abstractC15440M36524);
                        abstractC15440M36524.m36526("_error.log").m36510(C3939.m11987(th));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (c17600M18958 == null) {
            try {
                c17600M18958 = m18958(new InterfaceC23950() { // from class: l.ۙۜܿ
                    @Override // l.InterfaceC23950
                    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                    public final void mo13233(C14777 c14777) throws IOException {
                        C7017.m18960(assetManagerM14325, c14777);
                    }
                });
            } catch (Exception e) {
                if (!(e instanceof RuntimeException)) {
                    throw new RuntimeException(e);
                }
                throw ((RuntimeException) e);
            }
        }
        m18970(c17600M18958);
        for (Map.Entry entry : c17600M18958.f53777.entrySet()) {
            if (!((C15068) entry.getValue()).m35654()) {
                String str = (String) entry.getKey();
                if (str.lastIndexOf(46) == 0) {
                    C2204.m7294(str);
                }
            }
        }
        C2204.m7301(false);
    }

    static {
        m18987();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11251 m18953(C15068 c15068) {
        C14777 c14777 = (C14777) f21655.get();
        C17600 c17600M18957 = c14777 == null ? m18957() : new C17600(c14777);
        C11003.requireNonNull(c15068);
        return new C11251(c17600M18957, c15068);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18972(int i) {
        return m18957().f53785 == i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m18974(C15068 c15068) {
        C17600 c17600M18957 = m18957();
        for (Map.Entry entry : c17600M18957.f53778.entrySet()) {
            if (entry.getValue() == c15068) {
                return "INTERNAL:" + ((String) entry.getKey());
            }
        }
        String strM35657 = c15068.m35657();
        if (strM35657 == null || C17600.m41136(c17600M18957, strM35657.toLowerCase(Locale.ROOT)) != c15068) {
            return null;
        }
        return strM35657;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15587 m18956(AbstractC15440 abstractC15440, String str) {
        return abstractC15440.m36526(str.toLowerCase(Locale.ROOT) + ".cache").m36534();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18971(String[] strArr, int i) {
        String str = strArr[1];
        AbstractC15440 abstractC15440M36527 = C16293.f50113.m36527();
        try {
            C17209 c17209M14323 = C4925.m14323();
            C9449 c9449 = new C9449();
            c9449.m24282(str);
            C18621 c18621Execute = c17209M14323.m40469(c9449.m24274()).execute();
            try {
                if (!c18621Execute.m43173()) {
                    throw new IOException("Code-" + c18621Execute.m43177() + ": " + c18621Execute.m43171());
                }
                AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
                if (abstractC0275M43170 == null) {
                    throw new IOException("Response body is null");
                }
                abstractC15440M36527.m36493(abstractC0275M43170.m1611());
                C18090 c18090 = new C18090(abstractC15440M36527);
                try {
                    for (C3545 c3545 : c18090.m42210()) {
                        C16999.m39860(c3545.getName(), c3545.isDirectory());
                    }
                    AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("syntax/online");
                    abstractC15440M36526.mo23552();
                    abstractC15440M36526.m36508();
                    for (C3545 c3546 : c18090.m42210()) {
                        if (!c3546.isDirectory()) {
                            AbstractC15440 abstractC15440M36528 = abstractC15440M36526.m36526(C16999.m39860(c3546.getName(), false));
                            abstractC15440M36528.mo35195();
                            abstractC15440M36528.m36493(c18090.m42189(c3546));
                        }
                    }
                    c18090.close();
                    C10130 c10130 = new C10130(4);
                    c10130.writeInt(i);
                    C16293.f50117.m36526("syntax/online/VERSION").m36496(c10130);
                    m18987();
                    c18621Execute.close();
                    abstractC15440M36527.mo23552();
                } catch (Throwable th) {
                    try {
                        c18090.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c18621Execute.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception unused) {
            abstractC15440M36527.mo23552();
        } catch (Throwable th5) {
            abstractC15440M36527.mo23552();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18969(C15587 c15587, C15587 c15588, List list, AssetManager assetManager, C14777 c14777) throws IOException {
        InputStream inputStreamMo27926 = c15587.mo27926();
        try {
            m18978(inputStreamMo27926);
            C7308 c7308 = c14777.f45141;
            C21834 c21834M14263 = c14777.f45141.f22433.m14263(C4900.f15475);
            C11003.requireNonNull(c21834M14263);
            c7308.f22434 = c21834M14263;
            inputStreamMo27926.close();
            InputStream inputStreamMo27927 = c15588.mo27926();
            try {
                m18961(inputStreamMo27927);
                inputStreamMo27927.close();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
                    C11003.requireNonNull(abstractC15440);
                    InterfaceC2078 interfaceC2078 = new InterfaceC2078() { // from class: l.۬ۜܿ
                        @Override // l.InterfaceC2078
                        public final InputStream getInputStream() {
                            return abstractC15440.mo27926();
                        }
                    };
                    String strM36517 = abstractC15440.m36517();
                    C14777 c14777M18973 = m18973();
                    m18963(interfaceC2078, "builtIn", strM36517, c14777M18973.f45138, c14777M18973.f45137, true);
                }
                ((HashMap) c14777.f45138).remove("Text".toLowerCase(Locale.ROOT));
                if (((HashMap) c14777.f45138).isEmpty()) {
                    throw new IOException("Online syntax package has no eligible root languages");
                }
                m18959(assetManager);
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                setNewSetFromMap.addAll(((HashMap) c14777.f45138).values());
                setNewSetFromMap.addAll(((HashMap) c14777.f45137).values());
                m18962("online", setNewSetFromMap);
                m18962("online internal", ((HashMap) c14777.f45140).values());
            } catch (Throwable th) {
                try {
                    inputStreamMo27927.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStreamMo27926.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18960(final AssetManager assetManager, C14777 c14777) throws IOException {
        InputStream inputStreamOpen = assetManager.open("syntax/init/styles.mtsx");
        try {
            m18978(inputStreamOpen);
            C7308 c7308 = c14777.f45141;
            C21834 c21834M14263 = c14777.f45141.f22433.m14263(C4900.f15475);
            C11003.requireNonNull(c21834M14263);
            c7308.f22434 = c21834M14263;
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            InputStream inputStreamOpen2 = assetManager.open("syntax/init/builtins.mtsx");
            try {
                m18961(inputStreamOpen2);
                if (inputStreamOpen2 != null) {
                    inputStreamOpen2.close();
                }
                String[] list = assetManager.list("syntax");
                C11003.requireNonNull(list);
                for (String str : list) {
                    if (str.endsWith(".mtsx") && str.indexOf(47) == -1) {
                        String strM36561 = C15472.m36561(5, 0, str);
                        final String strConcat = "syntax/".concat(str);
                        InterfaceC2078 interfaceC2078 = new InterfaceC2078() { // from class: l.ۗۜܿ
                            @Override // l.InterfaceC2078
                            public final InputStream getInputStream() {
                                return assetManager.open(strConcat);
                            }
                        };
                        C14777 c14777M18973 = m18973();
                        m18963(interfaceC2078, "builtIn", strM36561, c14777M18973.f45138, c14777M18973.f45137, false);
                    }
                }
                ((HashMap) c14777.f45138).remove("Text".toLowerCase(Locale.ROOT));
                m18959(assetManager);
            } catch (Throwable th) {
                if (inputStreamOpen2 != null) {
                    try {
                        inputStreamOpen2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17600 m18958(InterfaceC23950 interfaceC23950) {
        C14777 c14777 = new C14777(0);
        ThreadLocal threadLocal = f21655;
        C14777 c14778 = (C14777) threadLocal.get();
        threadLocal.set(c14777);
        try {
            interfaceC23950.mo13233(c14777);
            ((HashMap) c14777.f45139).putAll(C9840.m24912());
            C17600 c17600 = new C17600(c14777);
        } finally {
            if (c14778 == null) {
                threadLocal.remove();
            } else {
                threadLocal.set(c14778);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18970(C17600 c17600) {
        C17600 c17601 = f21657;
        c17600.f53785 = c17601 != null ? 1 + c17601.f53785 : 1;
        f21657 = c17600;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17600 m18957() {
        C17600 c17600 = f21657;
        C11003.requireNonNull(c17600, "Language registry is not initialized");
        return c17600;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7308 m18975() {
        C14777 c14777 = (C14777) f21655.get();
        return c14777 != null ? c14777.f45141 : m18957().f53780;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C14777 m18973() {
        C14777 c14777 = (C14777) f21655.get();
        C11003.requireNonNull(c14777, "Language registry is not loading");
        return c14777;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18959(final AssetManager assetManager) throws IOException {
        ((HashMap) m18973().f45140).clear();
        String[] list = assetManager.list("syntax/internal");
        C11003.requireNonNull(list);
        for (String str : list) {
            if (str.endsWith(".mtsx")) {
                String strM36561 = C15472.m36561(5, 0, str);
                final String strConcat = "syntax/internal/".concat(str);
                m18963(new InterfaceC2078() { // from class: l.ۛۜܿ
                    @Override // l.InterfaceC2078
                    public final InputStream getInputStream() {
                        return assetManager.open(strConcat);
                    }
                }, UMModuleRegister.INNER, strM36561, m18973().f45140, null, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18962(String str, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C15068 c15068 = (C15068) it.next();
            if (!C23097.m51264(c15068).m51276()) {
                StringBuilder sbM9834 = C3200.m9834("Syntax does not support early window completion: ", str, "/");
                sbM9834.append(c15068.m35657());
                throw new IllegalArgumentException(sbM9834.toString());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18978(InputStream inputStream) {
        C7308 c7308 = m18973().f45141;
        C4900 c4900 = c7308.f22433;
        String strM44263 = C19180.m44263("init/styles.mtsx", C22194.m49848(inputStream, StandardCharsets.UTF_8));
        C7308.m19589(c7308, strM44263);
        C15587 c15587M36534 = C16293.f50117.m36526("syntax/styles.cache").m36534();
        if (c15587M36534.mo23120()) {
            try {
                C12951 c12951M36528 = c15587M36534.m36528();
                if (c12951M36528.m31494() == 4104 && c12951M36528.readInt() == strM44263.hashCode() && strM44263.equals(c12951M36528.m31504())) {
                    int iM31494 = c12951M36528.m31494();
                    for (int i = 0; i < iM31494; i++) {
                        c4900.m14265(c12951M36528.m31504(), C21834.m49199(c12951M36528));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        c4900.m14264();
        C14562 c14562 = new C14562(new C1875(new C14502(new C11837(strM44263, new RunnableC0709()))));
        c14562.m43456(new C16894("init/styles.mtsx"));
        for (C2509 c2509 : c14562.m34769().m23037(C2509.class)) {
            c4900.m14265(C15068.m35649(c2509.m23038(46, 0)), C15068.m35644(c2509));
        }
        C10130 c10130 = new C10130();
        c10130.mo13231(o.a.h);
        c10130.writeInt(strM44263.hashCode());
        c10130.m25423((CharSequence) strM44263);
        c10130.mo13231(c4900.m14267());
        InterfaceC12063 it = c4900.m14266().iterator();
        while (it.hasNext()) {
            InterfaceC11544 interfaceC11544 = (InterfaceC11544) it.next();
            c10130.m25423((CharSequence) C4900.m14262(interfaceC11544.mo15639()));
            ((C21834) interfaceC11544.getValue()).m49204(c10130);
        }
        try {
            c15587M36534.m36496(c10130);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18961(InputStream inputStream) {
        C7308 c7308 = m18973().f45141;
        HashMap map = c7308.f22429;
        String strM44263 = C19180.m44263("init/builtins.mtsx", C22194.m49848(inputStream, StandardCharsets.UTF_8));
        C7308.m19586(c7308, strM44263);
        C15587 c15587M36534 = C16293.f50117.m36526("syntax/builtins.cache").m36534();
        if (c15587M36534.mo23120()) {
            try {
                C12951 c12951M36528 = c15587M36534.m36528();
                if (c12951M36528.m31494() == 4104 && c12951M36528.readInt() == strM44263.hashCode() && strM44263.equals(c12951M36528.m31504())) {
                    int iM31494 = c12951M36528.m31494();
                    for (int i = 0; i < iM31494; i++) {
                        map.put(c12951M36528.m31504(), AbstractC9693.m24637((AbstractC9693) null, c12951M36528));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        map.clear();
        C14562 c14562 = new C14562(new C1875(new C14502(new C11837(strM44263, new RunnableC0709()))));
        c14562.m43456(new C16894("init/builtins.mtsx"));
        for (C9565 c9565 : c14562.m34762().m23037(C9565.class)) {
            String text = ((C8859) c9565.m23039(C8859.class, 0)).m23038(50, 0).getText();
            List listM23037 = ((C6036) c9565.m23039(C6036.class, 0)).m23037(C22596.class);
            if (!listM23037.isEmpty()) {
                if (listM23037.size() != 1) {
                    C2370 c2370 = new C2370(null);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listM23037.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C15068.m35643(c2370, (C22596) it.next(), false));
                    }
                    c2370.m7685(arrayList);
                    map.put(text, c2370);
                } else {
                    map.put(text, C15068.m35643(null, (C22596) listM23037.get(0), false));
                }
            }
        }
        C10130 c10130 = new C10130();
        c10130.mo13231(o.a.h);
        c10130.writeInt(strM44263.hashCode());
        c10130.m25423((CharSequence) strM44263);
        c10130.mo13231(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c10130.m25423((CharSequence) entry.getKey());
            ((AbstractC9693) entry.getValue()).mo1516(c10130);
        }
        try {
            c15587M36534.m36496(c10130);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18963(final InterfaceC2078 interfaceC2078, String str, String str2, Map map, Map map2, boolean z) throws IOException {
        InputStream inputStream = interfaceC2078.getInputStream();
        try {
            Charset charset = StandardCharsets.UTF_8;
            String strM49848 = C22194.m49848(inputStream, charset);
            if (inputStream != null) {
                inputStream.close();
            }
            try {
                C19180.m44257(strM49848);
                String strM37867 = C16014.m37867(str2, ".mtsx");
                String strM44263 = C19180.m44263(strM37867, strM49848);
                int iM18951 = m18951(m18975(), strM44263);
                C15587 c15587M36534 = C16293.f50117.m36526(C20087.m46306("syntax/", str, "-", str2, ".cache")).m36534();
                if (c15587M36534.mo23120()) {
                    try {
                        C12951 c12951M36528 = c15587M36534.m36528();
                        if (c12951M36528.m31494() == 4104 && c12951M36528.readInt() == iM18951 && strM49848.equals(c12951M36528.m31504())) {
                            C15068 c15068 = (C15068) AbstractC9693.m24637((AbstractC9693) null, c12951M36528);
                            if (z) {
                                final byte[] bytes = strM49848.getBytes(charset);
                                c15068.m35652(new Callable() { // from class: l.᩺ۜܿ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return new String(bytes, StandardCharsets.UTF_8);
                                    }
                                });
                            } else {
                                c15068.m35652(new Callable() { // from class: l.᩹ۜܿ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() throws IOException {
                                        InputStream inputStream2 = interfaceC2078.getInputStream();
                                        try {
                                            String strM49849 = C22194.m49848(inputStream2, StandardCharsets.UTF_8);
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            return strM49849;
                                        } catch (Throwable th) {
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                });
                            }
                            c15068.m35660(iM18951);
                            m18965(c15068, map, map2);
                            return;
                        }
                    } catch (Exception unused) {
                    }
                }
                C16894 c16894 = new C16894(strM37867);
                C14502 c14502 = new C14502(new C11837(strM44263, new RunnableC0709()));
                c14502.m43456(c16894);
                C14562 c14562 = new C14562(new C1875(c14502));
                c14562.m43456(c16894);
                C15068 c15069 = new C15068(c14562.m34772());
                c15069.m35659();
                if (z) {
                    final byte[] bytes2 = strM49848.getBytes(StandardCharsets.UTF_8);
                    c15069.m35652(new Callable() { // from class: l.᩺ۜܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return new String(bytes2, StandardCharsets.UTF_8);
                        }
                    });
                } else {
                    c15069.m35652(new Callable() { // from class: l.᩹ۜܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws IOException {
                            InputStream inputStream2 = interfaceC2078.getInputStream();
                            try {
                                String strM49849 = C22194.m49848(inputStream2, StandardCharsets.UTF_8);
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return strM49849;
                            } catch (Throwable th) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                    });
                }
                c15069.m35660(iM18951);
                m18965(c15069, map, map2);
                C10130 c10130 = new C10130();
                c10130.mo13231(o.a.h);
                c10130.writeInt(iM18951);
                c10130.m25423((CharSequence) strM49848);
                c15069.mo1516(c10130);
                c15587M36534.m36496(c10130);
            } catch (IOException | C9134 unused2) {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18965(C15068 c15068, Map map, Map map2) {
        if (map != null && C13843.putIfAbsent(map, c15068.m35657().toLowerCase(Locale.ROOT), c15068) != null) {
            throw new IllegalArgumentException("Duplicate syntax name: " + c15068.m35657());
        }
        if (map2 == null || "Text".equalsIgnoreCase(c15068.m35657())) {
            return;
        }
        Iterator it = c15068.m35662().iterator();
        while (it.hasNext()) {
            map2.put(((String) it.next()).toLowerCase(Locale.ROOT), c15068);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18950(String str) {
        return str.length() + (str.hashCode() * 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18951(C7308 c7308, String str) {
        return str.length() + (str.hashCode() * 31) + (C7308.m19591(c7308) * 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18964(C15068 c15068, String str) {
        c15068.m35660(m18951(c15068.m35669(), str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18967(AbstractC15440 abstractC15440, String str, C15068 c15068) {
        int iM18951 = m18951(c15068.m35669(), C19180.m44263(abstractC15440.mo23554(), str));
        C10130 c10130 = new C10130();
        c10130.mo13231(o.a.h);
        c10130.writeInt(iM18951);
        c10130.m25423((CharSequence) str);
        c15068.mo1516(c10130);
        m18968(abstractC15440, c10130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18968(AbstractC15440 abstractC15440, C10130 c10130) {
        abstractC15440.mo35195();
        AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(".syntax_cache");
        try {
            abstractC15440M36520.m36496(c10130);
            abstractC15440M36520.m36501(abstractC15440, false, true, null);
        } finally {
            abstractC15440M36520.mo23552();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13657 m18976(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23120()) {
            try {
                C12951 c12951M36528 = abstractC15440.m36528();
                int iM31494 = c12951M36528.m31494();
                if (iM31494 == 65535) {
                    String strM31504 = c12951M36528.m31504();
                    if (c12951M36528.available() == 0) {
                        String lowerCase = strM31504.toLowerCase(Locale.ROOT);
                        if (!abstractC15440.getName().equals(m18956(abstractC15440.m36514(), lowerCase).getName())) {
                            throw new IOException("Custom language tombstone is in the wrong slot");
                        }
                        return C13657.m32817(lowerCase);
                    }
                    throw new IOException("Trailing bytes in custom language tombstone");
                }
                int i = c12951M36528.readInt();
                String strM31505 = c12951M36528.m31504();
                boolean z = iM31494 == 4102 && i == strM31505.hashCode();
                try {
                    int iM18951 = m18951(m18975(), C19180.m44263(abstractC15440.mo23554(), strM31505));
                    if (!z && iM31494 == 4104 && i == iM18951) {
                        try {
                            C15068 c15068 = (C15068) AbstractC9693.m24637((AbstractC9693) null, c12951M36528);
                            if (c12951M36528.available() != 0) {
                                throw new IOException("Trailing bytes in custom language cache");
                            }
                            c15068.mo1517(new C20982());
                            c15068.m35659();
                            C23097.m51264(c15068);
                            c15068.m35652(new CallableC10131(strM31505));
                            c15068.m35660(iM18951);
                            return C13657.m32818(c15068);
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        C15068 c15068M24909 = C9840.m24909(strM31505, abstractC15440.mo23554());
                        try {
                            m18967(abstractC15440, strM31505, c15068M24909);
                        } catch (IOException unused2) {
                        }
                        c15068M24909.m35652(new CallableC10131(strM31505));
                        return C13657.m32818(c15068M24909);
                    } catch (Exception e) {
                        if (z) {
                            return C13657.m32818(m18955(c12951M36528, strM31505, i, e));
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    if (z) {
                        return C13657.m32818(m18955(c12951M36528, strM31505, i, e2));
                    }
                    throw e2;
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15068 m18955(C12951 c12951, String str, int i, Exception exc) throws Exception {
        try {
            C15068 c15068 = (C15068) AbstractC9693.m24637((AbstractC9693) null, c12951);
            c15068.m35652(new CallableC10131(str));
            c15068.m35666();
            c15068.m35660(i);
            return c15068;
        } catch (Exception e) {
            exc.addSuppressed(e);
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C15068 m18983(String str) {
        C15068 c15068;
        if (str.startsWith("TEMPORARY:")) {
            String strSubstring = str.substring(10);
            try {
                C12951 c12951M36528 = C16293.f50113.m36526(strSubstring + ".mtsx.bin").m36528();
                if (c12951M36528.m31494() != 4104) {
                    c15068 = null;
                } else {
                    C15068 c15069 = new C15068(c12951M36528);
                    if (c12951M36528.available() != 0) {
                        throw new IOException("Trailing bytes in temporary language cache");
                    }
                    c15069.mo1517(new C20982());
                    c15069.m35659();
                    c15068 = c15069;
                }
                if (c15068 != null) {
                    return c15068;
                }
            } catch (Exception unused) {
            }
            str = "Text";
        }
        if (!str.startsWith("INTERNAL:")) {
            return C17600.m41136(m18957(), str.toLowerCase(Locale.ROOT));
        }
        return (C15068) m18957().f53778.get(str.substring(9).toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C15068 m18986(String str) {
        int iLastIndexOf;
        C17600 c17600M18957 = m18957();
        int iLastIndexOf2 = str.lastIndexOf(".");
        if (iLastIndexOf2 == -1) {
            return null;
        }
        String strSubstring = str.substring(iLastIndexOf2);
        Locale locale = Locale.ROOT;
        String lowerCase = strSubstring.toLowerCase(locale);
        if (lowerCase.length() == 1) {
            return null;
        }
        C15068 c15068M41132 = C17600.m41132(c17600M18957, lowerCase);
        if (c15068M41132 == null && lowerCase.equals(".bak") && (iLastIndexOf = str.lastIndexOf(46, iLastIndexOf2 - 1)) != -1) {
            String lowerCase2 = str.substring(iLastIndexOf, iLastIndexOf2).toLowerCase(locale);
            if (lowerCase2.length() > 1) {
                return C17600.m41132(c17600M18957, lowerCase2);
            }
        }
        return c15068M41132;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C21834 m18984() {
        return m18957().f53780.f22434;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static List m18979() {
        return m18957().f53784;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18985() {
        return new ArrayList(m18957().f53781);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m18980() {
        return (List) C5378.stream(m18957().f53779.values()).sorted(C8200.comparing(new C12247(0))).collect(C22976.toList());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC9693 m18952(AbstractC9693 abstractC9693, String str) {
        C11003.requireNonNull(abstractC9693, "Built-in parent is null");
        AbstractC9693 abstractC9694 = (AbstractC9693) abstractC9693.mo24638().m35669().f22429.get(str);
        if (abstractC9694 != null) {
            return abstractC9694.mo1512(abstractC9693);
        }
        throw new RuntimeException(C20094.m46315("Built-in matcher not found: ", str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17186 m18977(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_PYTHON_FORMATTER#":
                return InterfaceC17186.f52677;
            case "#BUILT_IN_SMALI_FORMATTER#":
                return InterfaceC17186.f52685;
            case "#BUILT_IN_LUA_FORMATTER#":
                return InterfaceC17186.f52681;
            case "#BUILT_IN_JS_FORMATTER#":
                return InterfaceC17186.f52684;
            case "#BUILT_IN_MTSX_FORMATTER#":
                return InterfaceC17186.f52686;
            case "#BUILT_IN_JSON_FORMATTER#":
                return InterfaceC17186.f52683;
            case "#BUILT_IN_XML_FORMATTER#":
                return InterfaceC17186.f52678;
            case "#BUILT_IN_TS_FORMATTER#":
                return InterfaceC17186.f52679;
            case "#BUILT_IN_JAVA_FORMATTER#":
                return InterfaceC17186.f52682;
            case "#BUILT_IN_HTML_FORMATTER#":
                return InterfaceC17186.f52680;
            case "#BUILT_IN_CSS_FORMATTER#":
                return InterfaceC17186.f52676;
            default:
                System.err.println("Unknown built-in code formatter: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6603 m18981(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_JS_SHRINKER#":
                return InterfaceC6603.f20332;
            case "#BUILT_IN_CSS_SHRINKER#":
                return InterfaceC6603.f20330;
            case "#BUILT_IN_HTML_SHRINKER#":
                return InterfaceC6603.f20331;
            case "#BUILT_IN_JSON_SHRINKER#":
                return InterfaceC6603.f20333;
            default:
                System.err.println("Unknown built-in code shrinker: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11459 m18954(int i, String str) {
        C18306 c18306 = new C18306(str, i);
        ConcurrentMapC10942 concurrentMapC10942 = f21656;
        C11459 c11459 = (C11459) concurrentMapC10942.get(c18306);
        if (c11459 != null) {
            return c11459;
        }
        C11459 c11459M28259 = C11459.m28259(i, str);
        C11459 c114510 = (C11459) concurrentMapC10942.putIfAbsent(c18306, c11459M28259);
        return c114510 != null ? c114510 : c11459M28259;
    }
}
