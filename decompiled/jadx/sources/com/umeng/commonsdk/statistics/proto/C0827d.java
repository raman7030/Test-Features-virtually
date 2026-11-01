package com.umeng.commonsdk.statistics.proto;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.AbstractC0690bu;
import com.umeng.analytics.pro.AbstractC0701ce;
import com.umeng.analytics.pro.AbstractC0702cf;
import com.umeng.analytics.pro.C0661as;
import com.umeng.analytics.pro.C0671bb;
import com.umeng.analytics.pro.C0677bh;
import com.umeng.analytics.pro.C0678bi;
import com.umeng.analytics.pro.C0680bk;
import com.umeng.analytics.pro.C0682bm;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0685bp;
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
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p067l.C19768;
import p067l.C21562;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d */
/* JADX INFO: compiled from: 05JA */
/* JADX INFO: loaded from: classes.dex */
public class C0827d implements InterfaceC0664av, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map f3525d;

    /* JADX INFO: renamed from: e */
    public static final long f3526e = 2846460275012375038L;

    /* JADX INFO: renamed from: f */
    public static final C0695bz f3527f = new C0695bz("Imprint");

    /* JADX INFO: renamed from: g */
    public static final C0685bp f3528g = new C0685bp("property", C0698cb.f2569k, 1);

    /* JADX INFO: renamed from: h */
    public static final C0685bp f3529h = new C0685bp("version", (byte) 8, 2);

    /* JADX INFO: renamed from: i */
    public static final C0685bp f3530i = new C0685bp("checksum", (byte) 11, 3);

    /* JADX INFO: renamed from: j */
    public static final Map f3531j;

    /* JADX INFO: renamed from: k */
    public static final int f3532k = 0;

    /* JADX INFO: renamed from: a */
    public Map f3533a;

    /* JADX INFO: renamed from: b */
    public int f3534b;

    /* JADX INFO: renamed from: c */
    public String f3535c;

    /* JADX INFO: renamed from: l */
    public byte f3536l;

    static {
        HashMap map = new HashMap();
        f3531j = map;
        map.put(AbstractC0701ce.class, new b());
        map.put(AbstractC0702cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.PROPERTY, new C0677bh("property", (byte) 1, new C0680bk(C0698cb.f2569k, new C0678bi((byte) 11), new C0682bm((byte) 12, C0828e.class))));
        enumMap.put(e.VERSION, new C0677bh("version", (byte) 1, new C0678bi((byte) 8)));
        enumMap.put(e.CHECKSUM, new C0677bh("checksum", (byte) 1, new C0678bi((byte) 11)));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(enumMap);
        f3525d = mapUnmodifiableMap;
        C0677bh.m2351a(C0827d.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    /* JADX INFO: compiled from: 05JA */
    public enum e implements InterfaceC0672bc {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* JADX INFO: renamed from: d */
        public static final Map f3540d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final short f3542e;

        /* JADX INFO: renamed from: f */
        public final String f3543f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f3540d.put(eVar.mo2228b(), eVar);
            }
        }

        /* JADX INFO: renamed from: a */
        public static e m3258a(int i) {
            if (i == 1) {
                return PROPERTY;
            }
            if (i == 2) {
                return VERSION;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* JADX INFO: renamed from: b */
        public static e m3260b(int i) {
            e eVarM3258a = m3258a(i);
            if (eVarM3258a != null) {
                return eVarM3258a;
            }
            throw new IllegalArgumentException(C19768.m44906(i, "Field ", " doesn't exist!"));
        }

        /* JADX INFO: renamed from: a */
        public static e m3259a(String str) {
            return (e) f3540d.get(str);
        }

        e(short s, String str) {
            this.f3542e = s;
            this.f3543f = str;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: a */
        public short mo2227a() {
            return this.f3542e;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: b */
        public String mo2228b() {
            return this.f3543f;
        }
    }

    public C0827d() {
        this.f3536l = (byte) 0;
    }

    public C0827d(Map map, int i, String str) {
        this();
        this.f3533a = map;
        this.f3534b = i;
        m3240b(true);
        this.f3535c = str;
    }

    public C0827d(C0827d c0827d) {
        this.f3536l = (byte) 0;
        this.f3536l = c0827d.f3536l;
        if (c0827d.m3244e()) {
            HashMap map = new HashMap();
            for (Map.Entry entry : c0827d.f3533a.entrySet()) {
                map.put((String) entry.getKey(), new C0828e((C0828e) entry.getValue()));
            }
            this.f3533a = map;
        }
        this.f3534b = c0827d.f3534b;
        if (c0827d.m3250k()) {
            this.f3535c = c0827d.f3535c;
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0827d deepCopy() {
        return new C0827d(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void clear() {
        this.f3533a = null;
        m3240b(false);
        this.f3534b = 0;
        this.f3535c = null;
    }

    /* JADX INFO: renamed from: b */
    public int m3238b() {
        Map map = this.f3533a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* JADX INFO: renamed from: a */
    public void m3236a(String str, C0828e c0828e) {
        if (this.f3533a == null) {
            this.f3533a = new HashMap();
        }
        this.f3533a.put(str, c0828e);
    }

    /* JADX INFO: renamed from: c */
    public Map m3241c() {
        return this.f3533a;
    }

    /* JADX INFO: renamed from: a */
    public C0827d m3235a(Map map) {
        this.f3533a = map;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m3243d() {
        this.f3533a = null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3244e() {
        return this.f3533a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m3237a(boolean z) {
        if (z) {
            return;
        }
        this.f3533a = null;
    }

    /* JADX INFO: renamed from: f */
    public int m3245f() {
        return this.f3534b;
    }

    /* JADX INFO: renamed from: a */
    public C0827d m3233a(int i) {
        this.f3534b = i;
        m3240b(true);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m3246g() {
        this.f3536l = C0661as.m2264b(this.f3536l, 0);
    }

    /* JADX INFO: renamed from: h */
    public boolean m3247h() {
        return C0661as.m2260a(this.f3536l, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m3240b(boolean z) {
        this.f3536l = C0661as.m2252a(this.f3536l, 0, z);
    }

    /* JADX INFO: renamed from: i */
    public String m3248i() {
        return this.f3535c;
    }

    /* JADX INFO: renamed from: a */
    public C0827d m3234a(String str) {
        this.f3535c = str;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void m3249j() {
        this.f3535c = null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m3250k() {
        return this.f3535c != null;
    }

    /* JADX INFO: renamed from: c */
    public void m3242c(boolean z) {
        if (z) {
            return;
        }
        this.f3535c = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.m3258a(i);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3531j.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3531j.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(property:");
        Map map = this.f3533a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f3534b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f3535c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public void m3251l() throws C0691bv {
        if (this.f3533a == null) {
            throw new C0691bv("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.f3535c != null) {
            return;
        }
        throw new C0691bv("Required field 'checksum' was not present! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    private void m3227a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C0684bo(new C0703cg(objectOutputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3226a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.f3536l = (byte) 0;
            read(new C0684bo(new C0703cg(objectInputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    /* JADX INFO: compiled from: 05JA */
    public class b implements InterfaceC0700cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2220b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$a */
    /* JADX INFO: compiled from: 05JA */
    public class a extends AbstractC0701ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0827d c0827d) throws C0691bv {
            abstractC0690bu.mo2385j();
            while (true) {
                C0685bp c0685bpMo2387l = abstractC0690bu.mo2387l();
                byte b = c0685bpMo2387l.f2531b;
                if (b == 0) {
                    break;
                }
                short s = c0685bpMo2387l.f2532c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C0693bx.m2431a(abstractC0690bu, b);
                        } else if (b == 11) {
                            c0827d.f3535c = abstractC0690bu.mo2401z();
                            c0827d.m3242c(true);
                        } else {
                            C0693bx.m2431a(abstractC0690bu, b);
                        }
                    } else if (b == 8) {
                        c0827d.f3534b = abstractC0690bu.mo2398w();
                        c0827d.m3240b(true);
                    } else {
                        C0693bx.m2431a(abstractC0690bu, b);
                    }
                } else if (b == 13) {
                    C0687br c0687brMo2389n = abstractC0690bu.mo2389n();
                    c0827d.f3533a = new HashMap(c0687brMo2389n.f2537c * 2);
                    for (int i = 0; i < c0687brMo2389n.f2537c; i++) {
                        String strMo2401z = abstractC0690bu.mo2401z();
                        C0828e c0828e = new C0828e();
                        c0828e.read(abstractC0690bu);
                        c0827d.f3533a.put(strMo2401z, c0828e);
                    }
                    abstractC0690bu.mo2390o();
                    c0827d.m3237a(true);
                } else {
                    C0693bx.m2431a(abstractC0690bu, b);
                }
                abstractC0690bu.mo2388m();
            }
            abstractC0690bu.mo2386k();
            if (!c0827d.m3247h()) {
                throw new C0691bv("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            c0827d.m3251l();
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0827d c0827d) throws C0691bv {
            c0827d.m3251l();
            abstractC0690bu.mo2369a(C0827d.f3527f);
            if (c0827d.f3533a != null) {
                abstractC0690bu.mo2364a(C0827d.f3528g);
                abstractC0690bu.mo2366a(new C0687br((byte) 11, (byte) 12, c0827d.f3533a.size()));
                for (Map.Entry entry : c0827d.f3533a.entrySet()) {
                    abstractC0690bu.mo2370a((String) entry.getKey());
                    ((C0828e) entry.getValue()).write(abstractC0690bu);
                }
                abstractC0690bu.mo2380e();
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2364a(C0827d.f3529h);
            abstractC0690bu.mo2362a(c0827d.f3534b);
            abstractC0690bu.mo2376c();
            if (c0827d.f3535c != null) {
                abstractC0690bu.mo2364a(C0827d.f3530i);
                abstractC0690bu.mo2370a(c0827d.f3535c);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$d */
    /* JADX INFO: compiled from: 05JA */
    public class d implements InterfaceC0700cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2220b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    /* JADX INFO: compiled from: 05JA */
    public class c extends AbstractC0702cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0827d c0827d) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0697ca.mo2362a(c0827d.f3533a.size());
            for (Map.Entry entry : c0827d.f3533a.entrySet()) {
                c0697ca.mo2370a((String) entry.getKey());
                ((C0828e) entry.getValue()).write(c0697ca);
            }
            c0697ca.mo2362a(c0827d.f3534b);
            c0697ca.mo2370a(c0827d.f3535c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0827d c0827d) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            C0687br c0687br = new C0687br((byte) 11, (byte) 12, c0697ca.mo2398w());
            c0827d.f3533a = new HashMap(c0687br.f2537c * 2);
            for (int i = 0; i < c0687br.f2537c; i++) {
                String strMo2401z = c0697ca.mo2401z();
                C0828e c0828e = new C0828e();
                c0828e.read(c0697ca);
                c0827d.f3533a.put(strMo2401z, c0828e);
            }
            c0827d.m3237a(true);
            c0827d.f3534b = c0697ca.mo2398w();
            c0827d.m3240b(true);
            c0827d.f3535c = c0697ca.mo2401z();
            c0827d.m3242c(true);
        }
    }
}
