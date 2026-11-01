package com.umeng.analytics.pro;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p067l.C7470;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bf */
/* JADX INFO: compiled from: Y48R */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0675bf implements InterfaceC0664av {

    /* JADX INFO: renamed from: c */
    public static final Map f2465c;

    /* JADX INFO: renamed from: a */
    public Object f2466a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0672bc f2467b;

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0672bc m2328a(short s);

    /* JADX INFO: renamed from: a */
    public abstract Object m2331a(AbstractC0690bu abstractC0690bu, C0685bp c0685bp);

    /* JADX INFO: renamed from: a */
    public abstract Object m2332a(AbstractC0690bu abstractC0690bu, short s);

    /* JADX INFO: renamed from: a */
    public abstract void m2335a(AbstractC0690bu abstractC0690bu);

    /* JADX INFO: renamed from: b */
    public abstract void m2337b(InterfaceC0672bc interfaceC0672bc, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void m2338b(AbstractC0690bu abstractC0690bu);

    /* JADX INFO: renamed from: c */
    public abstract C0685bp m2341c(InterfaceC0672bc interfaceC0672bc);

    /* JADX INFO: renamed from: d */
    public abstract C0695bz m2343d();

    public AbstractC0675bf() {
        this.f2467b = null;
        this.f2466a = null;
    }

    static {
        HashMap map = new HashMap();
        f2465c = map;
        map.put(AbstractC0701ce.class, new b());
        map.put(AbstractC0702cf.class, new d());
    }

    public AbstractC0675bf(InterfaceC0672bc interfaceC0672bc, Object obj) {
        m2334a(interfaceC0672bc, obj);
    }

    public AbstractC0675bf(AbstractC0675bf abstractC0675bf) {
        if (!abstractC0675bf.getClass().equals(getClass())) {
            throw new ClassCastException();
        }
        this.f2467b = abstractC0675bf.f2467b;
        this.f2466a = m2323a(abstractC0675bf.f2466a);
    }

    /* JADX INFO: renamed from: a */
    public static Object m2323a(Object obj) {
        if (obj instanceof InterfaceC0664av) {
            return ((InterfaceC0664av) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return C0665aw.m2296d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return m2324a((List) obj);
        }
        if (obj instanceof Set) {
            return m2326a((Set) obj);
        }
        return obj instanceof Map ? m2325a((Map) obj) : obj;
    }

    /* JADX INFO: renamed from: a */
    public static Map m2325a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(m2323a(entry.getKey()), m2323a(entry.getValue()));
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static Set m2326a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m2323a(it.next()));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public static List m2324a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m2323a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0672bc m2327a() {
        return this.f2467b;
    }

    /* JADX INFO: renamed from: b */
    public Object m2336b() {
        return this.f2466a;
    }

    /* JADX INFO: renamed from: a */
    public Object m2330a(InterfaceC0672bc interfaceC0672bc) {
        if (interfaceC0672bc != this.f2467b) {
            throw new IllegalArgumentException("Cannot get the value of field " + interfaceC0672bc + " because union's set field is " + this.f2467b);
        }
        return m2336b();
    }

    /* JADX INFO: renamed from: a */
    public Object m2329a(int i) {
        return m2330a(m2328a((short) i));
    }

    /* JADX INFO: renamed from: c */
    public boolean m2342c() {
        return this.f2467b != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2340b(InterfaceC0672bc interfaceC0672bc) {
        return this.f2467b == interfaceC0672bc;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2339b(int i) {
        return m2340b(m2328a((short) i));
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f2465c.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    /* JADX INFO: renamed from: a */
    public void m2334a(InterfaceC0672bc interfaceC0672bc, Object obj) {
        m2337b(interfaceC0672bc, obj);
        this.f2467b = interfaceC0672bc;
        this.f2466a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m2333a(int i, Object obj) {
        m2334a(m2328a((short) i), obj);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f2465c.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sbM17248 = C7470.m17248("<");
        sbM17248.append(getClass().getSimpleName());
        sbM17248.append(" ");
        if (m2327a() != null) {
            Object objM2336b = m2336b();
            sbM17248.append(m2341c(m2327a()).f2530a);
            sbM17248.append(":");
            if (objM2336b instanceof ByteBuffer) {
                C0665aw.m2291a((ByteBuffer) objM2336b, sbM17248);
            } else {
                sbM17248.append(objM2336b.toString());
            }
        }
        sbM17248.append(">");
        return sbM17248.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public final void clear() {
        this.f2467b = null;
        this.f2466a = null;
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.bf$b */
    /* JADX INFO: compiled from: Y48R */
    public class b implements InterfaceC0700cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2220b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.bf$a */
    /* JADX INFO: compiled from: Y48R */
    public class a extends AbstractC0701ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, AbstractC0675bf abstractC0675bf) {
            abstractC0675bf.f2467b = null;
            abstractC0675bf.f2466a = null;
            abstractC0690bu.mo2385j();
            C0685bp c0685bpMo2387l = abstractC0690bu.mo2387l();
            Object objM2331a = abstractC0675bf.m2331a(abstractC0690bu, c0685bpMo2387l);
            abstractC0675bf.f2466a = objM2331a;
            if (objM2331a != null) {
                abstractC0675bf.f2467b = abstractC0675bf.m2328a(c0685bpMo2387l.f2532c);
            }
            abstractC0690bu.mo2388m();
            abstractC0690bu.mo2387l();
            abstractC0690bu.mo2386k();
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, AbstractC0675bf abstractC0675bf) throws C0691bv {
            if (abstractC0675bf.m2327a() == null || abstractC0675bf.m2336b() == null) {
                throw new C0691bv("Cannot write a TUnion with no set value!");
            }
            abstractC0690bu.mo2369a(abstractC0675bf.m2343d());
            abstractC0690bu.mo2364a(abstractC0675bf.m2341c(abstractC0675bf.f2467b));
            abstractC0675bf.m2335a(abstractC0690bu);
            abstractC0690bu.mo2376c();
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.bf$d */
    /* JADX INFO: compiled from: Y48R */
    public class d implements InterfaceC0700cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2220b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.bf$c */
    /* JADX INFO: compiled from: Y48R */
    public class c extends AbstractC0702cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, AbstractC0675bf abstractC0675bf) {
            abstractC0675bf.f2467b = null;
            abstractC0675bf.f2466a = null;
            short sMo2397v = abstractC0690bu.mo2397v();
            Object objM2332a = abstractC0675bf.m2332a(abstractC0690bu, sMo2397v);
            abstractC0675bf.f2466a = objM2332a;
            if (objM2332a != null) {
                abstractC0675bf.f2467b = abstractC0675bf.m2328a(sMo2397v);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, AbstractC0675bf abstractC0675bf) throws C0691bv {
            if (abstractC0675bf.m2327a() == null || abstractC0675bf.m2336b() == null) {
                throw new C0691bv("Cannot write a TUnion with no set value!");
            }
            abstractC0690bu.mo2372a(abstractC0675bf.f2467b.mo2227a());
            abstractC0675bf.m2338b(abstractC0690bu);
        }
    }
}
