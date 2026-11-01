package com.umeng.commonsdk.statistics.proto;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.AbstractC0690bu;
import com.umeng.analytics.pro.AbstractC0701ce;
import com.umeng.analytics.pro.AbstractC0702cf;
import com.umeng.analytics.pro.C0671bb;
import com.umeng.analytics.pro.C0677bh;
import com.umeng.analytics.pro.C0678bi;
import com.umeng.analytics.pro.C0679bj;
import com.umeng.analytics.pro.C0680bk;
import com.umeng.analytics.pro.C0682bm;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0685bp;
import com.umeng.analytics.pro.C0686bq;
import com.umeng.analytics.pro.C0687br;
import com.umeng.analytics.pro.C0691bv;
import com.umeng.analytics.pro.C0693bx;
import com.umeng.analytics.pro.C0695bz;
import com.umeng.analytics.pro.C0697ca;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.analytics.pro.C0703cg;
import com.umeng.analytics.pro.InterfaceC0664av;
import com.umeng.analytics.pro.InterfaceC0672bc;
import com.umeng.analytics.pro.InterfaceC0700cd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p067l.C19768;
import p067l.C21562;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c */
/* JADX INFO: compiled from: T578 */
/* JADX INFO: loaded from: classes.dex */
public class C0826c implements InterfaceC0664av, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map f3507d;

    /* JADX INFO: renamed from: e */
    public static final long f3508e = -5764118265293965743L;

    /* JADX INFO: renamed from: f */
    public static final C0695bz f3509f = new C0695bz("IdTracking");

    /* JADX INFO: renamed from: g */
    public static final C0685bp f3510g = new C0685bp("snapshots", C0698cb.f2569k, 1);

    /* JADX INFO: renamed from: h */
    public static final C0685bp f3511h = new C0685bp("journals", (byte) 15, 2);

    /* JADX INFO: renamed from: i */
    public static final C0685bp f3512i = new C0685bp("checksum", (byte) 11, 3);

    /* JADX INFO: renamed from: j */
    public static final Map f3513j;

    /* JADX INFO: renamed from: a */
    public Map f3514a;

    /* JADX INFO: renamed from: b */
    public List f3515b;

    /* JADX INFO: renamed from: c */
    public String f3516c;

    /* JADX INFO: renamed from: k */
    public e[] f3517k;

    static {
        HashMap map = new HashMap();
        f3513j = map;
        map.put(AbstractC0701ce.class, new b());
        map.put(AbstractC0702cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.SNAPSHOTS, new C0677bh("snapshots", (byte) 1, new C0680bk(C0698cb.f2569k, new C0678bi((byte) 11), new C0682bm((byte) 12, C0825b.class))));
        enumMap.put(e.JOURNALS, new C0677bh("journals", (byte) 2, new C0679bj((byte) 15, new C0682bm((byte) 12, C0824a.class))));
        enumMap.put(e.CHECKSUM, new C0677bh("checksum", (byte) 2, new C0678bi((byte) 11)));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(enumMap);
        f3507d = mapUnmodifiableMap;
        C0677bh.m2351a(C0826c.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    /* JADX INFO: compiled from: T578 */
    public enum e implements InterfaceC0672bc {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* JADX INFO: renamed from: d */
        public static final Map f3521d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final short f3523e;

        /* JADX INFO: renamed from: f */
        public final String f3524f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f3521d.put(eVar.mo2228b(), eVar);
            }
        }

        /* JADX INFO: renamed from: a */
        public static e m3223a(int i) {
            if (i == 1) {
                return SNAPSHOTS;
            }
            if (i == 2) {
                return JOURNALS;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* JADX INFO: renamed from: b */
        public static e m3225b(int i) {
            e eVarM3223a = m3223a(i);
            if (eVarM3223a != null) {
                return eVarM3223a;
            }
            throw new IllegalArgumentException(C19768.m44906(i, "Field ", " doesn't exist!"));
        }

        /* JADX INFO: renamed from: a */
        public static e m3224a(String str) {
            return (e) f3521d.get(str);
        }

        e(short s, String str) {
            this.f3523e = s;
            this.f3524f = str;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: a */
        public short mo2227a() {
            return this.f3523e;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: b */
        public String mo2228b() {
            return this.f3524f;
        }
    }

    public C0826c() {
        this.f3517k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public C0826c(Map map) {
        this();
        this.f3514a = map;
    }

    public C0826c(C0826c c0826c) {
        this.f3517k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (c0826c.m3207e()) {
            HashMap map = new HashMap();
            for (Map.Entry entry : c0826c.f3514a.entrySet()) {
                map.put((String) entry.getKey(), new C0825b((C0825b) entry.getValue()));
            }
            this.f3514a = map;
        }
        if (c0826c.m3212j()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c0826c.f3515b.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0824a((C0824a) it.next()));
            }
            this.f3515b = arrayList;
        }
        if (c0826c.m3215m()) {
            this.f3516c = c0826c.f3516c;
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0826c deepCopy() {
        return new C0826c(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void clear() {
        this.f3514a = null;
        this.f3515b = null;
        this.f3516c = null;
    }

    /* JADX INFO: renamed from: b */
    public int m3202b() {
        Map map = this.f3514a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* JADX INFO: renamed from: a */
    public void m3200a(String str, C0825b c0825b) {
        if (this.f3514a == null) {
            this.f3514a = new HashMap();
        }
        this.f3514a.put(str, c0825b);
    }

    /* JADX INFO: renamed from: c */
    public Map m3204c() {
        return this.f3514a;
    }

    /* JADX INFO: renamed from: a */
    public C0826c m3198a(Map map) {
        this.f3514a = map;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m3206d() {
        this.f3514a = null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3207e() {
        return this.f3514a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m3201a(boolean z) {
        if (z) {
            return;
        }
        this.f3514a = null;
    }

    /* JADX INFO: renamed from: f */
    public int m3208f() {
        List list = this.f3515b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: g */
    public Iterator m3209g() {
        List list = this.f3515b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m3199a(C0824a c0824a) {
        if (this.f3515b == null) {
            this.f3515b = new ArrayList();
        }
        this.f3515b.add(c0824a);
    }

    /* JADX INFO: renamed from: h */
    public List m3210h() {
        return this.f3515b;
    }

    /* JADX INFO: renamed from: a */
    public C0826c m3197a(List list) {
        this.f3515b = list;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m3211i() {
        this.f3515b = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3212j() {
        return this.f3515b != null;
    }

    /* JADX INFO: renamed from: b */
    public void m3203b(boolean z) {
        if (z) {
            return;
        }
        this.f3515b = null;
    }

    /* JADX INFO: renamed from: k */
    public String m3213k() {
        return this.f3516c;
    }

    /* JADX INFO: renamed from: a */
    public C0826c m3196a(String str) {
        this.f3516c = str;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void m3214l() {
        this.f3516c = null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m3215m() {
        return this.f3516c != null;
    }

    /* JADX INFO: renamed from: c */
    public void m3205c(boolean z) {
        if (z) {
            return;
        }
        this.f3516c = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.m3223a(i);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3513j.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3513j.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(snapshots:");
        Map map = this.f3514a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (m3212j()) {
            sb.append(", ");
            sb.append("journals:");
            List list = this.f3515b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m3215m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f3516c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public void m3216n() throws C0691bv {
        if (this.f3514a != null) {
            return;
        }
        throw new C0691bv("Required field 'snapshots' was not present! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    private void m3189a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C0684bo(new C0703cg(objectOutputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3188a(ObjectInputStream objectInputStream) throws IOException {
        try {
            read(new C0684bo(new C0703cg(objectInputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$b */
    /* JADX INFO: compiled from: T578 */
    public class b implements InterfaceC0700cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2220b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$a */
    /* JADX INFO: compiled from: T578 */
    public class a extends AbstractC0701ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0826c c0826c) throws C0691bv {
            abstractC0690bu.mo2385j();
            while (true) {
                C0685bp c0685bpMo2387l = abstractC0690bu.mo2387l();
                byte b = c0685bpMo2387l.f2531b;
                if (b != 0) {
                    short s = c0685bpMo2387l.f2532c;
                    int i = 0;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                C0693bx.m2431a(abstractC0690bu, b);
                            } else if (b == 11) {
                                c0826c.f3516c = abstractC0690bu.mo2401z();
                                c0826c.m3205c(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                        } else if (b == 15) {
                            C0686bq c0686bqMo2391p = abstractC0690bu.mo2391p();
                            c0826c.f3515b = new ArrayList(c0686bqMo2391p.f2534b);
                            while (i < c0686bqMo2391p.f2534b) {
                                C0824a c0824a = new C0824a();
                                c0824a.read(abstractC0690bu);
                                c0826c.f3515b.add(c0824a);
                                i++;
                            }
                            abstractC0690bu.mo2392q();
                            c0826c.m3203b(true);
                        } else {
                            C0693bx.m2431a(abstractC0690bu, b);
                        }
                    } else if (b == 13) {
                        C0687br c0687brMo2389n = abstractC0690bu.mo2389n();
                        c0826c.f3514a = new HashMap(c0687brMo2389n.f2537c * 2);
                        while (i < c0687brMo2389n.f2537c) {
                            String strMo2401z = abstractC0690bu.mo2401z();
                            C0825b c0825b = new C0825b();
                            c0825b.read(abstractC0690bu);
                            c0826c.f3514a.put(strMo2401z, c0825b);
                            i++;
                        }
                        abstractC0690bu.mo2390o();
                        c0826c.m3201a(true);
                    } else {
                        C0693bx.m2431a(abstractC0690bu, b);
                    }
                    abstractC0690bu.mo2388m();
                } else {
                    abstractC0690bu.mo2386k();
                    c0826c.m3216n();
                    return;
                }
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0826c c0826c) throws C0691bv {
            c0826c.m3216n();
            abstractC0690bu.mo2369a(C0826c.f3509f);
            if (c0826c.f3514a != null) {
                abstractC0690bu.mo2364a(C0826c.f3510g);
                abstractC0690bu.mo2366a(new C0687br((byte) 11, (byte) 12, c0826c.f3514a.size()));
                for (Map.Entry entry : c0826c.f3514a.entrySet()) {
                    abstractC0690bu.mo2370a((String) entry.getKey());
                    ((C0825b) entry.getValue()).write(abstractC0690bu);
                }
                abstractC0690bu.mo2380e();
                abstractC0690bu.mo2376c();
            }
            if (c0826c.f3515b != null && c0826c.m3212j()) {
                abstractC0690bu.mo2364a(C0826c.f3511h);
                abstractC0690bu.mo2365a(new C0686bq((byte) 12, c0826c.f3515b.size()));
                Iterator it = c0826c.f3515b.iterator();
                while (it.hasNext()) {
                    ((C0824a) it.next()).write(abstractC0690bu);
                }
                abstractC0690bu.mo2381f();
                abstractC0690bu.mo2376c();
            }
            if (c0826c.f3516c != null && c0826c.m3215m()) {
                abstractC0690bu.mo2364a(C0826c.f3512i);
                abstractC0690bu.mo2370a(c0826c.f3516c);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$d */
    /* JADX INFO: compiled from: T578 */
    public class d implements InterfaceC0700cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2220b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    /* JADX INFO: compiled from: T578 */
    public class c extends AbstractC0702cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0826c c0826c) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0697ca.mo2362a(c0826c.f3514a.size());
            for (Map.Entry entry : c0826c.f3514a.entrySet()) {
                c0697ca.mo2370a((String) entry.getKey());
                ((C0825b) entry.getValue()).write(c0697ca);
            }
            BitSet bitSet = new BitSet();
            if (c0826c.m3212j()) {
                bitSet.set(0);
            }
            if (c0826c.m3215m()) {
                bitSet.set(1);
            }
            c0697ca.m2435a(bitSet, 2);
            if (c0826c.m3212j()) {
                c0697ca.mo2362a(c0826c.f3515b.size());
                Iterator it = c0826c.f3515b.iterator();
                while (it.hasNext()) {
                    ((C0824a) it.next()).write(c0697ca);
                }
            }
            if (c0826c.m3215m()) {
                c0697ca.mo2370a(c0826c.f3516c);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0826c c0826c) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            C0687br c0687br = new C0687br((byte) 11, (byte) 12, c0697ca.mo2398w());
            c0826c.f3514a = new HashMap(c0687br.f2537c * 2);
            for (int i = 0; i < c0687br.f2537c; i++) {
                String strMo2401z = c0697ca.mo2401z();
                C0825b c0825b = new C0825b();
                c0825b.read(c0697ca);
                c0826c.f3514a.put(strMo2401z, c0825b);
            }
            c0826c.m3201a(true);
            BitSet bitSetM2436b = c0697ca.m2436b(2);
            if (bitSetM2436b.get(0)) {
                C0686bq c0686bq = new C0686bq((byte) 12, c0697ca.mo2398w());
                c0826c.f3515b = new ArrayList(c0686bq.f2534b);
                for (int i2 = 0; i2 < c0686bq.f2534b; i2++) {
                    C0824a c0824a = new C0824a();
                    c0824a.read(c0697ca);
                    c0826c.f3515b.add(c0824a);
                }
                c0826c.m3203b(true);
            }
            if (bitSetM2436b.get(1)) {
                c0826c.f3516c = c0697ca.mo2401z();
                c0826c.m3205c(true);
            }
        }
    }
}
