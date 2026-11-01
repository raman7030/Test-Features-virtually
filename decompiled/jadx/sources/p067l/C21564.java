package p067l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21564 {

    /* JADX INFO: renamed from: ֫ */
    public final C12828 f68002;

    /* JADX INFO: renamed from: ۧ */
    public final C12828 f68003;

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX INFO: renamed from: ֫ */
    public static void m48750(C12828 c12828) {
        Boolean bool;
        Boolean bool2;
        Iterator it = c12828.m29392("state").mo25500(true).iterator();
        while (it.hasNext()) {
            ((AbstractC17043) it.next()).mo25503();
        }
        Iterator it2 = c12828.m29392("dex/smali").mo25500(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC17043) it2.next()).mo25503();
        }
        Iterator it3 = c12828.m29392("arsc/xml").mo25500(true).iterator();
        while (it3.hasNext()) {
            ((AbstractC17043) it3.next()).mo25503();
        }
        for (AbstractC17043 abstractC17043 : c12828.m29392("dex/config").mo25500(true)) {
            if (abstractC17043.mo25093()) {
                String name = abstractC17043.getName();
                name.getClass();
                if (name.equals("dex_name_map") || name.equals("map")) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = Boolean.TRUE;
                }
            } else {
                bool2 = Boolean.TRUE;
            }
            if (bool2.booleanValue()) {
                abstractC17043.mo25503();
            }
        }
        for (AbstractC17043 abstractC17044 : c12828.m29392("arsc/config").mo25500(true)) {
            if (abstractC17044.mo25093()) {
                String name2 = abstractC17044.getName();
                name2.getClass();
                if (name2.equals("pkgsort") || name2.equals("name")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                abstractC17044.mo25503();
            }
        }
    }

    public C21564(C12828 c12828) {
        this.f68003 = c12828;
        this.f68002 = new C12828(c12828, "backup");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48753(String str) throws IOException {
        C12828 c12828 = this.f68002;
        if (c12828.m29402().mo25093()) {
            c12828.m29395();
        }
        if (!c12828.m29398()) {
            c12828.m29402().mo25497();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c12828.m29392(jCurrentTimeMillis + ".info").m38668(str);
        C10844 c10844 = new C10844(c12828.m29392(jCurrentTimeMillis + ".zip"));
        Charset charset = StandardCharsets.UTF_8;
        c10844.m25001();
        C12828 c12829 = this.f68003;
        m48751(c12829.m29392("state"), c10844, "");
        m48751(c12829.m29392("dex/config"), c10844, "dex/");
        m48751(c12829.m29392("dex/smali"), c10844, "dex/");
        m48751(c12829.m29392("arsc/config"), c10844, "arsc/");
        m48751(c12829.m29392("arsc/xml"), c10844, "arsc/");
        c10844.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48754(AbstractC17043 abstractC17043) {
        C12828 c12828 = this.f68003;
        C12828 c12829 = new C12828(c12828, "temp");
        try {
            C19561 c19561 = new C19561(abstractC17043);
            try {
                for (C5738 c5738 : c19561.m44469()) {
                    C18524.m42103(c5738.getName(), c5738.isDirectory());
                }
                c12829.m29395();
                c12829.m29402().m38666();
                for (C5738 c5739 : c19561.m44469()) {
                    AbstractC17043 abstractC17043M29392 = c12829.m29392(C18524.m42103(c5739.getName(), c5739.isDirectory()));
                    if (c5739.isDirectory()) {
                        abstractC17043M29392.m38666();
                    } else {
                        abstractC17043M29392.mo37342();
                        abstractC17043M29392.m38651(c19561.m44448(c5739));
                    }
                    abstractC17043M29392.mo20486(c5739.getTime());
                }
                c19561.close();
                AbstractC17043 abstractC17043M29393 = c12829.m29392("state");
                AbstractC17043 abstractC17043M29394 = c12828.m29392("state");
                abstractC17043M29394.mo25503();
                if (abstractC17043M29393.mo25094()) {
                    abstractC17043M29393.m38656(abstractC17043M29394, (Runnable) null);
                }
                AbstractC17043 abstractC17043M29395 = c12829.m29392("dex/config");
                AbstractC17043 abstractC17043M29396 = c12828.m29392("dex/config");
                abstractC17043M29396.mo25503();
                if (abstractC17043M29395.mo25094()) {
                    abstractC17043M29395.m38656(abstractC17043M29396, (Runnable) null);
                }
                AbstractC17043 abstractC17043M29397 = c12829.m29392("dex/smali");
                AbstractC17043 abstractC17043M29398 = c12828.m29392("dex/smali");
                abstractC17043M29398.mo25503();
                if (abstractC17043M29397.mo25094()) {
                    abstractC17043M29397.m38656(abstractC17043M29398, (Runnable) null);
                }
                AbstractC17043 abstractC17043M29399 = c12829.m29392("arsc/config");
                AbstractC17043 abstractC17043M293910 = c12828.m29392("arsc/config");
                abstractC17043M293910.mo25503();
                if (abstractC17043M29399.mo25094()) {
                    abstractC17043M29399.m38656(abstractC17043M293910, (Runnable) null);
                }
                AbstractC17043 abstractC17043M293911 = c12829.m29392("arsc/xml");
                AbstractC17043 abstractC17043M293912 = c12828.m29392("arsc/xml");
                abstractC17043M293912.mo25503();
                if (abstractC17043M293911.mo25094()) {
                    abstractC17043M293911.m38656(abstractC17043M293912, (Runnable) null);
                }
                c12829.m29395();
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c12829.m29395();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m48752() {
        List<AbstractC17043> list = (List) C7480.stream(this.f68002.m29402().mo25500(true)).filter(new C22905(0)).collect(C24205.toList());
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC17043 abstractC17043 : list) {
            String strMo25505 = abstractC17043.mo25505();
            AbstractC17043 abstractC17043M42109 = C18524.m42109(strMo25505.substring(0, strMo25505.length() - 3) + "info", new String[0]);
            if (abstractC17043M42109.mo25094()) {
                try {
                    String strM38647 = abstractC17043M42109.m38647();
                    if (!strM38647.isEmpty()) {
                        String name = abstractC17043.getName();
                        arrayList.add(new C23575(abstractC17043, abstractC17043M42109, strM38647, Long.parseLong(name.substring(0, name.length() - 4))));
                    }
                } catch (IOException | NumberFormatException unused) {
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48751(AbstractC17043 abstractC17043, C10844 c10844, String str) throws IOException {
        if (abstractC17043.mo25094()) {
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(abstractC17043.getName());
            sbM17248.append("/");
            String string = sbM17248.toString();
            C5738 c5738 = new C5738(string);
            c5738.setTime(abstractC17043.mo25091());
            c10844.m24987(c5738);
            c10844.m24997();
            for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
                if (abstractC17044.mo25087()) {
                    m48751(abstractC17044, c10844, string);
                } else {
                    StringBuilder sbM17249 = C7470.m17248(string);
                    sbM17249.append(abstractC17044.getName());
                    C5738 c5739 = new C5738(sbM17249.toString());
                    c5739.setTime(abstractC17044.mo25091());
                    c10844.m24987(c5739);
                    c10844.m24985(abstractC17044.mo29987());
                    c10844.m24997();
                }
            }
        }
    }
}
