package p067l;

import android.content.res.AssetManager;
import com.umeng.analytics.pro.C0719o;
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
public final class C9038 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f24535 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final ThreadLocal f24536 = new ThreadLocal();

    /* JADX INFO: renamed from: ܽ */
    public static final ConcurrentMapC12768 f24537 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩳ */
    public static volatile C19096 f24538;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m20923(AbstractC17043 abstractC17043) {
        String strM38647 = abstractC17043.m38647();
        C16689 c16689M26924 = C11721.m26924(strM38647, abstractC17043.mo25505());
        String strM37815 = c16689M26924.m37815();
        String lowerCase = strM37815.toLowerCase(Locale.ROOT);
        C17182 c17182M20913 = m20913(C17853.f53284.m38684("syntax/custom"), strM37815);
        C19096 c19096M20914 = m20914();
        C16413 c16413 = new C16413(c19096M20914);
        ((HashMap) c16413.f48253).putAll(c19096M20914.f56976);
        ((HashMap) c16413.f48253).put(lowerCase, c16689M26924);
        C19096 c19096 = new C19096(c16413);
        m20924(c17182M20913, strM38647, c16689M26924);
        c16689M26924.m37810(new CallableC11997(strM38647));
        m20927(c19096);
        C4463.m9380(true);
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized boolean m20939(C16689 c16689) {
        String strM37815 = c16689.m37815();
        String lowerCase = strM37815.toLowerCase(Locale.ROOT);
        C17182 c17182M20913 = m20913(C17853.f53284.m38684("syntax/custom"), strM37815);
        try {
            C11996 c11996 = new C11996();
            c11996.mo15113(65535);
            c11996.m27443((CharSequence) lowerCase);
            m20925(c17182M20913, c11996);
            C19096 c19096M20914 = m20914();
            C16413 c16413 = new C16413(c19096M20914);
            ((HashMap) c16413.f48253).putAll(c19096M20914.f56976);
            ((HashMap) c16413.f48253).remove(lowerCase);
            try {
                m20927(new C19096(c16413));
                C4463.m9380(true);
            } catch (Error | RuntimeException e) {
                try {
                    m20924(c17182M20913, c16689.m37814(), c16689);
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

    /* JADX INFO: renamed from: ᩻ */
    public static synchronized void m20944() {
        final AssetManager assetManagerM16222 = C7050.m16222();
        C17182 c17182M38692 = C17853.f53284.m38684("syntax/online").m38692();
        C19096 c19096M20915 = null;
        if (c17182M38692.mo25087()) {
            final C17182 c17182M38693 = c17182M38692.m38684("init/styles.mtsx").m38692();
            final C17182 c17182M38694 = c17182M38692.m38684("init/builtins.mtsx").m38692();
            C17182 c17182M38695 = c17182M38692.m38684("VERSION").m38692();
            int i = -1;
            try {
                if (c17182M38695.mo25094()) {
                    i = c17182M38695.m38686().readInt();
                }
            } catch (Exception unused) {
            }
            if (i > 14) {
                final List list = (List) C7480.stream(c17182M38692.mo25500(true)).filter(new C22726(0)).collect(C24205.toList());
                try {
                    if (!c17182M38693.mo25093() || !c17182M38694.mo25093() || list.isEmpty()) {
                        throw new IOException("Incomplete online syntax package");
                    }
                    c19096M20915 = m20915(new InterfaceC25131() { // from class: l.᩶ۜܿ
                        @Override // p067l.InterfaceC25131
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo15115(C16413 c16413) throws IOException {
                            C9038.m20926(c17182M38693, c17182M38694, list, assetManagerM16222, c16413);
                        }
                    });
                } catch (Throwable th) {
                    try {
                        AbstractC17043 abstractC17043M38682 = c17182M38692.m38682("online_bad");
                        abstractC17043M38682.mo25503();
                        c17182M38692.mo25502(abstractC17043M38682);
                        abstractC17043M38682.m38684("_error.log").m38668(C6112.m13907(th));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (c19096M20915 == null) {
            try {
                c19096M20915 = m20915(new InterfaceC25131() { // from class: l.ۙۜܿ
                    @Override // p067l.InterfaceC25131
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo15115(C16413 c16413) throws IOException {
                        C9038.m20917(assetManagerM16222, c16413);
                    }
                });
            } catch (Exception e) {
                if (!(e instanceof RuntimeException)) {
                    throw new RuntimeException(e);
                }
                throw ((RuntimeException) e);
            }
        }
        m20927(c19096M20915);
        for (Map.Entry entry : c19096M20915.f56971.entrySet()) {
            if (!((C16689) entry.getValue()).m37812()) {
                String str = (String) entry.getKey();
                if (str.lastIndexOf(46) == 0) {
                    C4463.m9373(str);
                }
            }
        }
        C4463.m9380(false);
    }

    static {
        m20944();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13062 m20910(C16689 c16689) {
        C16413 c16413 = (C16413) f24536.get();
        C19096 c19096M20914 = c16413 == null ? m20914() : new C19096(c16413);
        C12826.requireNonNull(c16689);
        return new C13062(c19096M20914, c16689);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20929(int i) {
        return m20914().f56979 == i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m20931(C16689 c16689) {
        C19096 c19096M20914 = m20914();
        for (Map.Entry entry : c19096M20914.f56972.entrySet()) {
            if (entry.getValue() == c16689) {
                return "INTERNAL:" + ((String) entry.getKey());
            }
        }
        String strM37815 = c16689.m37815();
        if (strM37815 == null || C19096.m43382(c19096M20914, strM37815.toLowerCase(Locale.ROOT)) != c16689) {
            return null;
        }
        return strM37815;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17182 m20913(AbstractC17043 abstractC17043, String str) {
        return abstractC17043.m38684(str.toLowerCase(Locale.ROOT) + ".cache").m38692();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20928(String[] strArr, int i) {
        String str = strArr[1];
        AbstractC17043 abstractC17043M38685 = C17853.f53280.m38685();
        try {
            C18724 c18724M16220 = C7050.m16220();
            C11349 c11349 = new C11349();
            c11349.m26292(str);
            C20066 c20066Execute = c18724M16220.m42716(c11349.m26284()).execute();
            try {
                if (!c20066Execute.m45439()) {
                    throw new IOException("Code-" + c20066Execute.m45443() + ": " + c20066Execute.m45437());
                }
                AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
                if (abstractC2630M45436 == null) {
                    throw new IOException("Response body is null");
                }
                abstractC17043M38685.m38651(abstractC2630M45436.m4011());
                C19561 c19561 = new C19561(abstractC17043M38685);
                try {
                    for (C5738 c5738 : c19561.m44469()) {
                        C18524.m42103(c5738.getName(), c5738.isDirectory());
                    }
                    AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("syntax/online");
                    abstractC17043M38684.mo25503();
                    abstractC17043M38684.m38666();
                    for (C5738 c5739 : c19561.m44469()) {
                        if (!c5739.isDirectory()) {
                            AbstractC17043 abstractC17043M38686 = abstractC17043M38684.m38684(C18524.m42103(c5739.getName(), false));
                            abstractC17043M38686.mo37342();
                            abstractC17043M38686.m38651(c19561.m44448(c5739));
                        }
                    }
                    c19561.close();
                    C11996 c11996 = new C11996(4);
                    c11996.writeInt(i);
                    C17853.f53284.m38684("syntax/online/VERSION").m38654(c11996);
                    m20944();
                    c20066Execute.close();
                    abstractC17043M38685.mo25503();
                } catch (Throwable th) {
                    try {
                        c19561.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c20066Execute.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception unused) {
            abstractC17043M38685.mo25503();
        } catch (Throwable th5) {
            abstractC17043M38685.mo25503();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20926(C17182 c17182, C17182 c17183, List list, AssetManager assetManager, C16413 c16413) throws IOException {
        InputStream inputStreamMo29987 = c17182.mo29987();
        try {
            m20935(inputStreamMo29987);
            C9314 c9314 = c16413.f48255;
            C23120 c23120M16160 = c16413.f48255.f25324.m16160(C7026.f18308);
            C12826.requireNonNull(c23120M16160);
            c9314.f25325 = c23120M16160;
            inputStreamMo29987.close();
            InputStream inputStreamMo29988 = c17183.mo29987();
            try {
                m20918(inputStreamMo29988);
                inputStreamMo29988.close();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
                    C12826.requireNonNull(abstractC17043);
                    InterfaceC4344 interfaceC4344 = new InterfaceC4344() { // from class: l.۬ۜܿ
                        @Override // p067l.InterfaceC4344
                        public final InputStream getInputStream() {
                            return abstractC17043.mo29987();
                        }
                    };
                    String strM38675 = abstractC17043.m38675();
                    C16413 c16413M20930 = m20930();
                    m20920(interfaceC4344, "builtIn", strM38675, c16413M20930.f48252, c16413M20930.f48251, true);
                }
                ((HashMap) c16413.f48252).remove("Text".toLowerCase(Locale.ROOT));
                if (((HashMap) c16413.f48252).isEmpty()) {
                    throw new IOException("Online syntax package has no eligible root languages");
                }
                m20916(assetManager);
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                setNewSetFromMap.addAll(((HashMap) c16413.f48252).values());
                setNewSetFromMap.addAll(((HashMap) c16413.f48251).values());
                m20919("online", setNewSetFromMap);
                m20919("online internal", ((HashMap) c16413.f48254).values());
            } catch (Throwable th) {
                try {
                    inputStreamMo29988.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStreamMo29987.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20917(final AssetManager assetManager, C16413 c16413) throws IOException {
        InputStream inputStreamOpen = assetManager.open("syntax/init/styles.mtsx");
        try {
            m20935(inputStreamOpen);
            C9314 c9314 = c16413.f48255;
            C23120 c23120M16160 = c16413.f48255.f25324.m16160(C7026.f18308);
            C12826.requireNonNull(c23120M16160);
            c9314.f25325 = c23120M16160;
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            InputStream inputStreamOpen2 = assetManager.open("syntax/init/builtins.mtsx");
            try {
                m20918(inputStreamOpen2);
                if (inputStreamOpen2 != null) {
                    inputStreamOpen2.close();
                }
                String[] list = assetManager.list("syntax");
                C12826.requireNonNull(list);
                for (String str : list) {
                    if (str.endsWith(".mtsx") && str.indexOf(47) == -1) {
                        String strM38720 = C17073.m38720(5, 0, str);
                        final String strConcat = "syntax/".concat(str);
                        InterfaceC4344 interfaceC4344 = new InterfaceC4344() { // from class: l.ۗۜܿ
                            @Override // p067l.InterfaceC4344
                            public final InputStream getInputStream() {
                                return assetManager.open(strConcat);
                            }
                        };
                        C16413 c16413M20930 = m20930();
                        m20920(interfaceC4344, "builtIn", strM38720, c16413M20930.f48252, c16413M20930.f48251, false);
                    }
                }
                ((HashMap) c16413.f48252).remove("Text".toLowerCase(Locale.ROOT));
                m20916(assetManager);
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

    /* JADX INFO: renamed from: ֫ */
    public static C19096 m20915(InterfaceC25131 interfaceC25131) {
        C16413 c16413 = new C16413(0);
        ThreadLocal threadLocal = f24536;
        C16413 c16414 = (C16413) threadLocal.get();
        threadLocal.set(c16413);
        try {
            interfaceC25131.mo15115(c16413);
            ((HashMap) c16413.f48253).putAll(C11721.m26927());
            C19096 c19096 = new C19096(c16413);
        } finally {
            if (c16414 == null) {
                threadLocal.remove();
            } else {
                threadLocal.set(c16414);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20927(C19096 c19096) {
        C19096 c19097 = f24538;
        c19096.f56979 = c19097 != null ? 1 + c19097.f56979 : 1;
        f24538 = c19096;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19096 m20914() {
        C19096 c19096 = f24538;
        C12826.requireNonNull(c19096, "Language registry is not initialized");
        return c19096;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9314 m20932() {
        C16413 c16413 = (C16413) f24536.get();
        return c16413 != null ? c16413.f48255 : m20914().f56974;
    }

    /* JADX INFO: renamed from: ۜ */
    public static C16413 m20930() {
        C16413 c16413 = (C16413) f24536.get();
        C12826.requireNonNull(c16413, "Language registry is not loading");
        return c16413;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20916(final AssetManager assetManager) throws IOException {
        ((HashMap) m20930().f48254).clear();
        String[] list = assetManager.list("syntax/internal");
        C12826.requireNonNull(list);
        for (String str : list) {
            if (str.endsWith(".mtsx")) {
                String strM38720 = C17073.m38720(5, 0, str);
                final String strConcat = "syntax/internal/".concat(str);
                m20920(new InterfaceC4344() { // from class: l.ۛۜܿ
                    @Override // p067l.InterfaceC4344
                    public final InputStream getInputStream() {
                        return assetManager.open(strConcat);
                    }
                }, UMModuleRegister.INNER, strM38720, m20930().f48254, null, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20919(String str, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16689 c16689 = (C16689) it.next();
            if (!C24320.m53658(c16689).m53670()) {
                StringBuilder sbM11879 = C5410.m11879("Syntax does not support early window completion: ", str, "/");
                sbM11879.append(c16689.m37815());
                throw new IllegalArgumentException(sbM11879.toString());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m20935(InputStream inputStream) {
        C9314 c9314 = m20930().f48255;
        C7026 c7026 = c9314.f25324;
        String strM46558 = C20597.m46558("init/styles.mtsx", C23461.m52175(inputStream, StandardCharsets.UTF_8));
        C9314.m21557(c9314, strM46558);
        C17182 c17182M38692 = C17853.f53284.m38684("syntax/styles.cache").m38692();
        if (c17182M38692.mo25094()) {
            try {
                C14677 c14677M38686 = c17182M38692.m38686();
                if (c14677M38686.m33581() == 4104 && c14677M38686.readInt() == strM46558.hashCode() && strM46558.equals(c14677M38686.m33591())) {
                    int iM33581 = c14677M38686.m33581();
                    for (int i = 0; i < iM33581; i++) {
                        c7026.m16162(c14677M38686.m33591(), C23120.m51550(c14677M38686));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        c7026.m16161();
        C16208 c16208 = new C16208(new C4150(new C16151(new C13618(strM46558, new RunnableC3043()))));
        c16208.m45725(new C18425("init/styles.mtsx"));
        for (C4753 c4753 : c16208.m36918().m25011(C4753.class)) {
            c7026.m16162(C16689.m37807(c4753.m25012(46, 0)), C16689.m37802(c4753));
        }
        C11996 c11996 = new C11996();
        c11996.mo15113(C0719o.a.f2902h);
        c11996.writeInt(strM46558.hashCode());
        c11996.m27443((CharSequence) strM46558);
        c11996.mo15113(c7026.m16164());
        InterfaceC13833 it = c7026.m16163().iterator();
        while (it.hasNext()) {
            InterfaceC13340 interfaceC13340 = (InterfaceC13340) it.next();
            c11996.m27443((CharSequence) C7026.m16159(interfaceC13340.mo17550()));
            ((C23120) interfaceC13340.getValue()).m51555(c11996);
        }
        try {
            c17182M38692.m38654(c11996);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20918(InputStream inputStream) {
        C9314 c9314 = m20930().f48255;
        HashMap map = c9314.f25320;
        String strM46558 = C20597.m46558("init/builtins.mtsx", C23461.m52175(inputStream, StandardCharsets.UTF_8));
        C9314.m21554(c9314, strM46558);
        C17182 c17182M38692 = C17853.f53284.m38684("syntax/builtins.cache").m38692();
        if (c17182M38692.mo25094()) {
            try {
                C14677 c14677M38686 = c17182M38692.m38686();
                if (c14677M38686.m33581() == 4104 && c14677M38686.readInt() == strM46558.hashCode() && strM46558.equals(c14677M38686.m33591())) {
                    int iM33581 = c14677M38686.m33581();
                    for (int i = 0; i < iM33581; i++) {
                        map.put(c14677M38686.m33591(), AbstractC11581.m26651((AbstractC11581) null, c14677M38686));
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        map.clear();
        C16208 c16208 = new C16208(new C4150(new C16151(new C13618(strM46558, new RunnableC3043()))));
        c16208.m45725(new C18425("init/builtins.mtsx"));
        for (C11459 c11459 : c16208.m36911().m25011(C11459.class)) {
            String text = ((C10788) c11459.m25013(C10788.class, 0)).m25012(50, 0).getText();
            List listM25011 = ((C8105) c11459.m25013(C8105.class, 0)).m25011(C23844.class);
            if (!listM25011.isEmpty()) {
                if (listM25011.size() != 1) {
                    C4621 c4621 = new C4621(null);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listM25011.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C16689.m37801(c4621, (C23844) it.next(), false));
                    }
                    c4621.m9746(arrayList);
                    map.put(text, c4621);
                } else {
                    map.put(text, C16689.m37801(null, (C23844) listM25011.get(0), false));
                }
            }
        }
        C11996 c11996 = new C11996();
        c11996.mo15113(C0719o.a.f2902h);
        c11996.writeInt(strM46558.hashCode());
        c11996.m27443((CharSequence) strM46558);
        c11996.mo15113(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c11996.m27443((CharSequence) entry.getKey());
            ((AbstractC11581) entry.getValue()).mo3914(c11996);
        }
        try {
            c17182M38692.m38654(c11996);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20920(final InterfaceC4344 interfaceC4344, String str, String str2, Map map, Map map2, boolean z) throws IOException {
        InputStream inputStream = interfaceC4344.getInputStream();
        try {
            Charset charset = StandardCharsets.UTF_8;
            String strM52175 = C23461.m52175(inputStream, charset);
            if (inputStream != null) {
                inputStream.close();
            }
            try {
                C20597.m46552(strM52175);
                String strM40053 = C17588.m40053(str2, ".mtsx");
                String strM46558 = C20597.m46558(strM40053, strM52175);
                int iM20908 = m20908(m20932(), strM46558);
                C17182 c17182M38692 = C17853.f53284.m38684(C21459.m48622("syntax/", str, "-", str2, ".cache")).m38692();
                if (c17182M38692.mo25094()) {
                    try {
                        C14677 c14677M38686 = c17182M38692.m38686();
                        if (c14677M38686.m33581() == 4104 && c14677M38686.readInt() == iM20908 && strM52175.equals(c14677M38686.m33591())) {
                            C16689 c16689 = (C16689) AbstractC11581.m26651((AbstractC11581) null, c14677M38686);
                            if (z) {
                                final byte[] bytes = strM52175.getBytes(charset);
                                c16689.m37810(new Callable() { // from class: l.᩺ۜܿ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return new String(bytes, StandardCharsets.UTF_8);
                                    }
                                });
                            } else {
                                c16689.m37810(new Callable() { // from class: l.᩹ۜܿ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() throws IOException {
                                        InputStream inputStream2 = interfaceC4344.getInputStream();
                                        try {
                                            String strM52176 = C23461.m52175(inputStream2, StandardCharsets.UTF_8);
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            return strM52176;
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
                            c16689.m37818(iM20908);
                            m20922(c16689, map, map2);
                            return;
                        }
                    } catch (Exception unused) {
                    }
                }
                C18425 c18425 = new C18425(strM40053);
                C16151 c16151 = new C16151(new C13618(strM46558, new RunnableC3043()));
                c16151.m45725(c18425);
                C16208 c16208 = new C16208(new C4150(c16151));
                c16208.m45725(c18425);
                C16689 c166810 = new C16689(c16208.m36921());
                c166810.m37817();
                if (z) {
                    final byte[] bytes2 = strM52175.getBytes(StandardCharsets.UTF_8);
                    c166810.m37810(new Callable() { // from class: l.᩺ۜܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return new String(bytes2, StandardCharsets.UTF_8);
                        }
                    });
                } else {
                    c166810.m37810(new Callable() { // from class: l.᩹ۜܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws IOException {
                            InputStream inputStream2 = interfaceC4344.getInputStream();
                            try {
                                String strM52176 = C23461.m52175(inputStream2, StandardCharsets.UTF_8);
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return strM52176;
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
                c166810.m37818(iM20908);
                m20922(c166810, map, map2);
                C11996 c11996 = new C11996();
                c11996.mo15113(C0719o.a.f2902h);
                c11996.writeInt(iM20908);
                c11996.m27443((CharSequence) strM52175);
                c166810.mo3914(c11996);
                c17182M38692.m38654(c11996);
            } catch (IOException | C11050 unused2) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m20922(C16689 c16689, Map map, Map map2) {
        if (map != null && C15525.putIfAbsent(map, c16689.m37815().toLowerCase(Locale.ROOT), c16689) != null) {
            throw new IllegalArgumentException("Duplicate syntax name: " + c16689.m37815());
        }
        if (map2 == null || "Text".equalsIgnoreCase(c16689.m37815())) {
            return;
        }
        Iterator it = c16689.m37820().iterator();
        while (it.hasNext()) {
            map2.put(((String) it.next()).toLowerCase(Locale.ROOT), c16689);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m20907(String str) {
        return str.length() + (str.hashCode() * 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m20908(C9314 c9314, String str) {
        return str.length() + (str.hashCode() * 31) + (C9314.m21559(c9314) * 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20921(C16689 c16689, String str) {
        c16689.m37818(m20908(c16689.m37827(), str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20924(AbstractC17043 abstractC17043, String str, C16689 c16689) {
        int iM20908 = m20908(c16689.m37827(), C20597.m46558(abstractC17043.mo25505(), str));
        C11996 c11996 = new C11996();
        c11996.mo15113(C0719o.a.f2902h);
        c11996.writeInt(iM20908);
        c11996.m27443((CharSequence) str);
        c16689.mo3914(c11996);
        m20925(abstractC17043, c11996);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20925(AbstractC17043 abstractC17043, C11996 c11996) {
        abstractC17043.mo37342();
        AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".syntax_cache");
        try {
            abstractC17043M38678.m38654(c11996);
            abstractC17043M38678.m38659(abstractC17043, false, true, null);
        } finally {
            abstractC17043M38678.mo25503();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15348 m20933(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo25094()) {
            try {
                C14677 c14677M38686 = abstractC17043.m38686();
                int iM33581 = c14677M38686.m33581();
                if (iM33581 == 65535) {
                    String strM33591 = c14677M38686.m33591();
                    if (c14677M38686.available() == 0) {
                        String lowerCase = strM33591.toLowerCase(Locale.ROOT);
                        if (!abstractC17043.getName().equals(m20913(abstractC17043.m38672(), lowerCase).getName())) {
                            throw new IOException("Custom language tombstone is in the wrong slot");
                        }
                        return C15348.m34932(lowerCase);
                    }
                    throw new IOException("Trailing bytes in custom language tombstone");
                }
                int i = c14677M38686.readInt();
                String strM33592 = c14677M38686.m33591();
                boolean z = iM33581 == 4102 && i == strM33592.hashCode();
                try {
                    int iM20908 = m20908(m20932(), C20597.m46558(abstractC17043.mo25505(), strM33592));
                    if (!z && iM33581 == 4104 && i == iM20908) {
                        try {
                            C16689 c16689 = (C16689) AbstractC11581.m26651((AbstractC11581) null, c14677M38686);
                            if (c14677M38686.available() != 0) {
                                throw new IOException("Trailing bytes in custom language cache");
                            }
                            c16689.mo3915(new C22310());
                            c16689.m37817();
                            C24320.m53658(c16689);
                            c16689.m37810(new CallableC11997(strM33592));
                            c16689.m37818(iM20908);
                            return C15348.m34933(c16689);
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        C16689 c16689M26924 = C11721.m26924(strM33592, abstractC17043.mo25505());
                        try {
                            m20924(abstractC17043, strM33592, c16689M26924);
                        } catch (IOException unused2) {
                        }
                        c16689M26924.m37810(new CallableC11997(strM33592));
                        return C15348.m34933(c16689M26924);
                    } catch (Exception e) {
                        if (z) {
                            return C15348.m34933(m20912(c14677M38686, strM33592, i, e));
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    if (z) {
                        return C15348.m34933(m20912(c14677M38686, strM33592, i, e2));
                    }
                    throw e2;
                }
            } catch (Exception unused3) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16689 m20912(C14677 c14677, String str, int i, Exception exc) throws Exception {
        try {
            C16689 c16689 = (C16689) AbstractC11581.m26651((AbstractC11581) null, c14677);
            c16689.m37810(new CallableC11997(str));
            c16689.m37824();
            c16689.m37818(i);
            return c16689;
        } catch (Exception e) {
            exc.addSuppressed(e);
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C16689 m20940(String str) {
        C16689 c16689;
        if (str.startsWith("TEMPORARY:")) {
            String strSubstring = str.substring(10);
            try {
                C14677 c14677M38686 = C17853.f53280.m38684(strSubstring + ".mtsx.bin").m38686();
                if (c14677M38686.m33581() != 4104) {
                    c16689 = null;
                } else {
                    C16689 c166810 = new C16689(c14677M38686);
                    if (c14677M38686.available() != 0) {
                        throw new IOException("Trailing bytes in temporary language cache");
                    }
                    c166810.mo3915(new C22310());
                    c166810.m37817();
                    c16689 = c166810;
                }
                if (c16689 != null) {
                    return c16689;
                }
            } catch (Exception unused) {
            }
            str = "Text";
        }
        if (!str.startsWith("INTERNAL:")) {
            return C19096.m43382(m20914(), str.toLowerCase(Locale.ROOT));
        }
        return (C16689) m20914().f56972.get(str.substring(9).toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C16689 m20943(String str) {
        int iLastIndexOf;
        C19096 c19096M20914 = m20914();
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
        C16689 c16689M43378 = C19096.m43378(c19096M20914, lowerCase);
        if (c16689M43378 == null && lowerCase.equals(".bak") && (iLastIndexOf = str.lastIndexOf(46, iLastIndexOf2 - 1)) != -1) {
            String lowerCase2 = str.substring(iLastIndexOf, iLastIndexOf2).toLowerCase(locale);
            if (lowerCase2.length() > 1) {
                return C19096.m43378(c19096M20914, lowerCase2);
            }
        }
        return c16689M43378;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C23120 m20941() {
        return m20914().f56974.f25325;
    }

    /* JADX INFO: renamed from: ܳ */
    public static List m20936() {
        return m20914().f56978;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList m20942() {
        return new ArrayList(m20914().f56975);
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m20937() {
        return (List) C7480.stream(m20914().f56973.values()).sorted(C10162.comparing(new C14008(0))).collect(C24205.toList());
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC11581 m20909(AbstractC11581 abstractC11581, String str) {
        C12826.requireNonNull(abstractC11581, "Built-in parent is null");
        AbstractC11581 abstractC11582 = (AbstractC11581) abstractC11581.mo26652().m37827().f25320.get(str);
        if (abstractC11582 != null) {
            return abstractC11582.mo3910(abstractC11581);
        }
        throw new RuntimeException(C21466.m48631("Built-in matcher not found: ", str));
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC18702 m20934(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_PYTHON_FORMATTER#":
                return InterfaceC18702.f55858;
            case "#BUILT_IN_SMALI_FORMATTER#":
                return InterfaceC18702.f55866;
            case "#BUILT_IN_LUA_FORMATTER#":
                return InterfaceC18702.f55862;
            case "#BUILT_IN_JS_FORMATTER#":
                return InterfaceC18702.f55865;
            case "#BUILT_IN_MTSX_FORMATTER#":
                return InterfaceC18702.f55867;
            case "#BUILT_IN_JSON_FORMATTER#":
                return InterfaceC18702.f55864;
            case "#BUILT_IN_XML_FORMATTER#":
                return InterfaceC18702.f55859;
            case "#BUILT_IN_TS_FORMATTER#":
                return InterfaceC18702.f55860;
            case "#BUILT_IN_JAVA_FORMATTER#":
                return InterfaceC18702.f55863;
            case "#BUILT_IN_HTML_FORMATTER#":
                return InterfaceC18702.f55861;
            case "#BUILT_IN_CSS_FORMATTER#":
                return InterfaceC18702.f55857;
            default:
                System.err.println("Unknown built-in code formatter: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC8644 m20938(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "#BUILT_IN_JS_SHRINKER#":
                return InterfaceC8644.f23209;
            case "#BUILT_IN_CSS_SHRINKER#":
                return InterfaceC8644.f23207;
            case "#BUILT_IN_HTML_SHRINKER#":
                return InterfaceC8644.f23208;
            case "#BUILT_IN_JSON_SHRINKER#":
                return InterfaceC8644.f23210;
            default:
                System.err.println("Unknown built-in code shrinker: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13259 m20911(int i, String str) {
        C19767 c19767 = new C19767(str, i);
        ConcurrentMapC12768 concurrentMapC12768 = f24537;
        C13259 c13259 = (C13259) concurrentMapC12768.get(c19767);
        if (c13259 != null) {
            return c13259;
        }
        C13259 c13259M30303 = C13259.m30303(i, str);
        C13259 c132510 = (C13259) concurrentMapC12768.putIfAbsent(c19767, c13259M30303);
        return c132510 != null ? c132510 : c13259M30303;
    }
}
