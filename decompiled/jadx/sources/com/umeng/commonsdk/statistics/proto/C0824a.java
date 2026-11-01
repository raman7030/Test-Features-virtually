package com.umeng.commonsdk.statistics.proto;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.AbstractC0690bu;
import com.umeng.analytics.pro.AbstractC0701ce;
import com.umeng.analytics.pro.AbstractC0702cf;
import com.umeng.analytics.pro.C0661as;
import com.umeng.analytics.pro.C0671bb;
import com.umeng.analytics.pro.C0677bh;
import com.umeng.analytics.pro.C0678bi;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0685bp;
import com.umeng.analytics.pro.C0691bv;
import com.umeng.analytics.pro.C0693bx;
import com.umeng.analytics.pro.C0695bz;
import com.umeng.analytics.pro.C0697ca;
import com.umeng.analytics.pro.C0703cg;
import com.umeng.analytics.pro.InterfaceC0664av;
import com.umeng.analytics.pro.InterfaceC0672bc;
import com.umeng.analytics.pro.InterfaceC0700cd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p067l.C17520;
import p067l.C19768;
import p067l.C21562;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a */
/* JADX INFO: compiled from: Q5XW */
/* JADX INFO: loaded from: classes.dex */
public class C0824a implements InterfaceC0664av, Serializable, Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Map f3464e;

    /* JADX INFO: renamed from: f */
    public static final long f3465f = 9132678615281394583L;

    /* JADX INFO: renamed from: g */
    public static final C0695bz f3466g = new C0695bz("IdJournal");

    /* JADX INFO: renamed from: h */
    public static final C0685bp f3467h = new C0685bp("domain", (byte) 11, 1);

    /* JADX INFO: renamed from: i */
    public static final C0685bp f3468i = new C0685bp("old_id", (byte) 11, 2);

    /* JADX INFO: renamed from: j */
    public static final C0685bp f3469j = new C0685bp("new_id", (byte) 11, 3);

    /* JADX INFO: renamed from: k */
    public static final C0685bp f3470k = new C0685bp("ts", (byte) 10, 4);

    /* JADX INFO: renamed from: l */
    public static final Map f3471l;

    /* JADX INFO: renamed from: m */
    public static final int f3472m = 0;

    /* JADX INFO: renamed from: a */
    public String f3473a;

    /* JADX INFO: renamed from: b */
    public String f3474b;

    /* JADX INFO: renamed from: c */
    public String f3475c;

    /* JADX INFO: renamed from: d */
    public long f3476d;

    /* JADX INFO: renamed from: n */
    public byte f3477n;

    /* JADX INFO: renamed from: o */
    public e[] f3478o;

    static {
        HashMap map = new HashMap();
        f3471l = map;
        map.put(AbstractC0701ce.class, new b());
        map.put(AbstractC0702cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new C0677bh("domain", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.OLD_ID, new C0677bh("old_id", (byte) 2, new C0678bi((byte) 11)));
        enumMap.put(e.NEW_ID, new C0677bh("new_id", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.TS, new C0677bh("ts", (byte) 1, new C0678bi((byte) 10)));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(enumMap);
        f3464e = mapUnmodifiableMap;
        C0677bh.m2351a(C0824a.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    /* JADX INFO: compiled from: Q5XW */
    public enum e implements InterfaceC0672bc {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* JADX INFO: renamed from: e */
        public static final Map f3483e = new HashMap();

        /* JADX INFO: renamed from: f */
        public final short f3485f;

        /* JADX INFO: renamed from: g */
        public final String f3486g;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f3483e.put(eVar.mo2228b(), eVar);
            }
        }

        /* JADX INFO: renamed from: a */
        public static e m3152a(int i) {
            if (i == 1) {
                return DOMAIN;
            }
            if (i == 2) {
                return OLD_ID;
            }
            if (i == 3) {
                return NEW_ID;
            }
            if (i != 4) {
                return null;
            }
            return TS;
        }

        /* JADX INFO: renamed from: b */
        public static e m3154b(int i) {
            e eVarM3152a = m3152a(i);
            if (eVarM3152a != null) {
                return eVarM3152a;
            }
            throw new IllegalArgumentException(C19768.m44906(i, "Field ", " doesn't exist!"));
        }

        /* JADX INFO: renamed from: a */
        public static e m3153a(String str) {
            return (e) f3483e.get(str);
        }

        e(short s, String str) {
            this.f3485f = s;
            this.f3486g = str;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: a */
        public short mo2227a() {
            return this.f3485f;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: b */
        public String mo2228b() {
            return this.f3486g;
        }
    }

    public C0824a() {
        this.f3477n = (byte) 0;
        this.f3478o = new e[]{e.OLD_ID};
    }

    public C0824a(String str, String str2, long j) {
        this();
        this.f3473a = str;
        this.f3475c = str2;
        this.f3476d = j;
        m3134d(true);
    }

    public C0824a(C0824a c0824a) {
        this.f3477n = (byte) 0;
        this.f3478o = new e[]{e.OLD_ID};
        this.f3477n = c0824a.f3477n;
        if (c0824a.m3135d()) {
            this.f3473a = c0824a.f3473a;
        }
        if (c0824a.m3138g()) {
            this.f3474b = c0824a.f3474b;
        }
        if (c0824a.m3141j()) {
            this.f3475c = c0824a.f3475c;
        }
        this.f3476d = c0824a.f3476d;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0824a deepCopy() {
        return new C0824a(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void clear() {
        this.f3473a = null;
        this.f3474b = null;
        this.f3475c = null;
        m3134d(false);
        this.f3476d = 0L;
    }

    /* JADX INFO: renamed from: b */
    public String m3129b() {
        return this.f3473a;
    }

    /* JADX INFO: renamed from: a */
    public C0824a m3126a(String str) {
        this.f3473a = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m3132c() {
        this.f3473a = null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3135d() {
        return this.f3473a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m3127a(boolean z) {
        if (z) {
            return;
        }
        this.f3473a = null;
    }

    /* JADX INFO: renamed from: e */
    public String m3136e() {
        return this.f3474b;
    }

    /* JADX INFO: renamed from: b */
    public C0824a m3128b(String str) {
        this.f3474b = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m3137f() {
        this.f3474b = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m3138g() {
        return this.f3474b != null;
    }

    /* JADX INFO: renamed from: b */
    public void m3130b(boolean z) {
        if (z) {
            return;
        }
        this.f3474b = null;
    }

    /* JADX INFO: renamed from: h */
    public String m3139h() {
        return this.f3475c;
    }

    /* JADX INFO: renamed from: c */
    public C0824a m3131c(String str) {
        this.f3475c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m3140i() {
        this.f3475c = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3141j() {
        return this.f3475c != null;
    }

    /* JADX INFO: renamed from: c */
    public void m3133c(boolean z) {
        if (z) {
            return;
        }
        this.f3475c = null;
    }

    /* JADX INFO: renamed from: k */
    public long m3142k() {
        return this.f3476d;
    }

    /* JADX INFO: renamed from: a */
    public C0824a m3125a(long j) {
        this.f3476d = j;
        m3134d(true);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void m3143l() {
        this.f3477n = C0661as.m2264b(this.f3477n, 0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m3144m() {
        return C0661as.m2260a(this.f3477n, 0);
    }

    /* JADX INFO: renamed from: d */
    public void m3134d(boolean z) {
        this.f3477n = C0661as.m2252a(this.f3477n, 0, z);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.m3152a(i);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3471l.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3471l.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(domain:");
        String str = this.f3473a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m3138g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f3474b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f3475c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        return C17520.m39893(sb, this.f3476d, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: n */
    public void m3145n() throws C0691bv {
        if (this.f3473a == null) {
            throw new C0691bv("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.f3475c != null) {
            return;
        }
        throw new C0691bv("Required field 'new_id' was not present! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    private void m3117a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C0684bo(new C0703cg(objectOutputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3116a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.f3477n = (byte) 0;
            read(new C0684bo(new C0703cg(objectInputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$b */
    /* JADX INFO: compiled from: Q5XW */
    public class b implements InterfaceC0700cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2220b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$a */
    /* JADX INFO: compiled from: Q5XW */
    public class a extends AbstractC0701ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0824a c0824a) throws C0691bv {
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
                            if (s != 4) {
                                C0693bx.m2431a(abstractC0690bu, b);
                            } else if (b == 10) {
                                c0824a.f3476d = abstractC0690bu.mo2399x();
                                c0824a.m3134d(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                        } else if (b == 11) {
                            c0824a.f3475c = abstractC0690bu.mo2401z();
                            c0824a.m3133c(true);
                        } else {
                            C0693bx.m2431a(abstractC0690bu, b);
                        }
                    } else if (b == 11) {
                        c0824a.f3474b = abstractC0690bu.mo2401z();
                        c0824a.m3130b(true);
                    } else {
                        C0693bx.m2431a(abstractC0690bu, b);
                    }
                } else if (b == 11) {
                    c0824a.f3473a = abstractC0690bu.mo2401z();
                    c0824a.m3127a(true);
                } else {
                    C0693bx.m2431a(abstractC0690bu, b);
                }
                abstractC0690bu.mo2388m();
            }
            abstractC0690bu.mo2386k();
            if (!c0824a.m3144m()) {
                throw new C0691bv("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            c0824a.m3145n();
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0824a c0824a) throws C0691bv {
            c0824a.m3145n();
            abstractC0690bu.mo2369a(C0824a.f3466g);
            if (c0824a.f3473a != null) {
                abstractC0690bu.mo2364a(C0824a.f3467h);
                abstractC0690bu.mo2370a(c0824a.f3473a);
                abstractC0690bu.mo2376c();
            }
            if (c0824a.f3474b != null && c0824a.m3138g()) {
                abstractC0690bu.mo2364a(C0824a.f3468i);
                abstractC0690bu.mo2370a(c0824a.f3474b);
                abstractC0690bu.mo2376c();
            }
            if (c0824a.f3475c != null) {
                abstractC0690bu.mo2364a(C0824a.f3469j);
                abstractC0690bu.mo2370a(c0824a.f3475c);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2364a(C0824a.f3470k);
            abstractC0690bu.mo2363a(c0824a.f3476d);
            abstractC0690bu.mo2376c();
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$d */
    /* JADX INFO: compiled from: Q5XW */
    public class d implements InterfaceC0700cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2220b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    /* JADX INFO: compiled from: Q5XW */
    public class c extends AbstractC0702cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0824a c0824a) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0697ca.mo2370a(c0824a.f3473a);
            c0697ca.mo2370a(c0824a.f3475c);
            c0697ca.mo2363a(c0824a.f3476d);
            BitSet bitSet = new BitSet();
            if (c0824a.m3138g()) {
                bitSet.set(0);
            }
            c0697ca.m2435a(bitSet, 1);
            if (c0824a.m3138g()) {
                c0697ca.mo2370a(c0824a.f3474b);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0824a c0824a) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0824a.f3473a = c0697ca.mo2401z();
            c0824a.m3127a(true);
            c0824a.f3475c = c0697ca.mo2401z();
            c0824a.m3133c(true);
            c0824a.f3476d = c0697ca.mo2399x();
            c0824a.m3134d(true);
            if (c0697ca.m2436b(1).get(0)) {
                c0824a.f3474b = c0697ca.mo2401z();
                c0824a.m3130b(true);
            }
        }
    }
}
