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
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p067l.C19768;
import p067l.C21562;
import p067l.C5410;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b */
/* JADX INFO: compiled from: T5ZW */
/* JADX INFO: loaded from: classes.dex */
public class C0825b implements InterfaceC0664av, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map f3487d;

    /* JADX INFO: renamed from: e */
    public static final long f3488e = -6496538196005191531L;

    /* JADX INFO: renamed from: f */
    public static final C0695bz f3489f = new C0695bz("IdSnapshot");

    /* JADX INFO: renamed from: g */
    public static final C0685bp f3490g = new C0685bp("identity", (byte) 11, 1);

    /* JADX INFO: renamed from: h */
    public static final C0685bp f3491h = new C0685bp("ts", (byte) 10, 2);

    /* JADX INFO: renamed from: i */
    public static final C0685bp f3492i = new C0685bp("version", (byte) 8, 3);

    /* JADX INFO: renamed from: j */
    public static final Map f3493j;

    /* JADX INFO: renamed from: k */
    public static final int f3494k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f3495l = 1;

    /* JADX INFO: renamed from: a */
    public String f3496a;

    /* JADX INFO: renamed from: b */
    public long f3497b;

    /* JADX INFO: renamed from: c */
    public int f3498c;

    /* JADX INFO: renamed from: m */
    public byte f3499m;

    static {
        HashMap map = new HashMap();
        f3493j = map;
        map.put(AbstractC0701ce.class, new b());
        map.put(AbstractC0702cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new C0677bh("identity", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.TS, new C0677bh("ts", (byte) 1, new C0678bi((byte) 10)));
        enumMap.put(e.VERSION, new C0677bh("version", (byte) 1, new C0678bi((byte) 8)));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(enumMap);
        f3487d = mapUnmodifiableMap;
        C0677bh.m2351a(C0825b.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    /* JADX INFO: compiled from: T5ZW */
    public enum e implements InterfaceC0672bc {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");


        /* JADX INFO: renamed from: d */
        public static final Map f3503d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final short f3505e;

        /* JADX INFO: renamed from: f */
        public final String f3506f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f3503d.put(eVar.mo2228b(), eVar);
            }
        }

        /* JADX INFO: renamed from: a */
        public static e m3185a(int i) {
            if (i == 1) {
                return IDENTITY;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
        }

        /* JADX INFO: renamed from: b */
        public static e m3187b(int i) {
            e eVarM3185a = m3185a(i);
            if (eVarM3185a != null) {
                return eVarM3185a;
            }
            throw new IllegalArgumentException(C19768.m44906(i, "Field ", " doesn't exist!"));
        }

        /* JADX INFO: renamed from: a */
        public static e m3186a(String str) {
            return (e) f3503d.get(str);
        }

        e(short s, String str) {
            this.f3505e = s;
            this.f3506f = str;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: a */
        public short mo2227a() {
            return this.f3505e;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: b */
        public String mo2228b() {
            return this.f3506f;
        }
    }

    public C0825b() {
        this.f3499m = (byte) 0;
    }

    public C0825b(String str, long j, int i) {
        this();
        this.f3496a = str;
        this.f3497b = j;
        m3168b(true);
        this.f3498c = i;
        m3170c(true);
    }

    public C0825b(C0825b c0825b) {
        this.f3499m = (byte) 0;
        this.f3499m = c0825b.f3499m;
        if (c0825b.m3171d()) {
            this.f3496a = c0825b.f3496a;
        }
        this.f3497b = c0825b.f3497b;
        this.f3498c = c0825b.f3498c;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0825b deepCopy() {
        return new C0825b(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void clear() {
        this.f3496a = null;
        m3168b(false);
        this.f3497b = 0L;
        m3170c(false);
        this.f3498c = 0;
    }

    /* JADX INFO: renamed from: b */
    public String m3167b() {
        return this.f3496a;
    }

    /* JADX INFO: renamed from: a */
    public C0825b m3164a(String str) {
        this.f3496a = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m3169c() {
        this.f3496a = null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3171d() {
        return this.f3496a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m3165a(boolean z) {
        if (z) {
            return;
        }
        this.f3496a = null;
    }

    /* JADX INFO: renamed from: e */
    public long m3172e() {
        return this.f3497b;
    }

    /* JADX INFO: renamed from: a */
    public C0825b m3163a(long j) {
        this.f3497b = j;
        m3168b(true);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m3173f() {
        this.f3499m = C0661as.m2264b(this.f3499m, 0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m3174g() {
        return C0661as.m2260a(this.f3499m, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m3168b(boolean z) {
        this.f3499m = C0661as.m2252a(this.f3499m, 0, z);
    }

    /* JADX INFO: renamed from: h */
    public int m3175h() {
        return this.f3498c;
    }

    /* JADX INFO: renamed from: a */
    public C0825b m3162a(int i) {
        this.f3498c = i;
        m3170c(true);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m3176i() {
        this.f3499m = C0661as.m2264b(this.f3499m, 1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m3177j() {
        return C0661as.m2260a(this.f3499m, 1);
    }

    /* JADX INFO: renamed from: c */
    public void m3170c(boolean z) {
        this.f3499m = C0661as.m2252a(this.f3499m, 1, z);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.m3185a(i);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3493j.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3493j.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(identity:");
        String str = this.f3496a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f3497b);
        sb.append(", ");
        sb.append("version:");
        return C5410.m11876(this.f3498c, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX INFO: renamed from: k */
    public void m3178k() throws C0691bv {
        if (this.f3496a != null) {
            return;
        }
        throw new C0691bv("Required field 'identity' was not present! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    private void m3156a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C0684bo(new C0703cg(objectOutputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3155a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.f3499m = (byte) 0;
            read(new C0684bo(new C0703cg(objectInputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$b */
    /* JADX INFO: compiled from: T5ZW */
    public class b implements InterfaceC0700cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2220b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$a */
    /* JADX INFO: compiled from: T5ZW */
    public class a extends AbstractC0701ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0825b c0825b) throws C0691bv {
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
                        } else if (b == 8) {
                            c0825b.f3498c = abstractC0690bu.mo2398w();
                            c0825b.m3170c(true);
                        } else {
                            C0693bx.m2431a(abstractC0690bu, b);
                        }
                    } else if (b == 10) {
                        c0825b.f3497b = abstractC0690bu.mo2399x();
                        c0825b.m3168b(true);
                    } else {
                        C0693bx.m2431a(abstractC0690bu, b);
                    }
                } else if (b == 11) {
                    c0825b.f3496a = abstractC0690bu.mo2401z();
                    c0825b.m3165a(true);
                } else {
                    C0693bx.m2431a(abstractC0690bu, b);
                }
                abstractC0690bu.mo2388m();
            }
            abstractC0690bu.mo2386k();
            if (!c0825b.m3174g()) {
                throw new C0691bv("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (!c0825b.m3177j()) {
                throw new C0691bv("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            c0825b.m3178k();
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0825b c0825b) throws C0691bv {
            c0825b.m3178k();
            abstractC0690bu.mo2369a(C0825b.f3489f);
            if (c0825b.f3496a != null) {
                abstractC0690bu.mo2364a(C0825b.f3490g);
                abstractC0690bu.mo2370a(c0825b.f3496a);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2364a(C0825b.f3491h);
            abstractC0690bu.mo2363a(c0825b.f3497b);
            abstractC0690bu.mo2376c();
            abstractC0690bu.mo2364a(C0825b.f3492i);
            abstractC0690bu.mo2362a(c0825b.f3498c);
            abstractC0690bu.mo2376c();
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$d */
    /* JADX INFO: compiled from: T5ZW */
    public class d implements InterfaceC0700cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2220b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    /* JADX INFO: compiled from: T5ZW */
    public class c extends AbstractC0702cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0825b c0825b) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0697ca.mo2370a(c0825b.f3496a);
            c0697ca.mo2363a(c0825b.f3497b);
            c0697ca.mo2362a(c0825b.f3498c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0825b c0825b) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0825b.f3496a = c0697ca.mo2401z();
            c0825b.m3165a(true);
            c0825b.f3497b = c0697ca.mo2399x();
            c0825b.m3168b(true);
            c0825b.f3498c = c0697ca.mo2398w();
            c0825b.m3170c(true);
        }
    }
}
