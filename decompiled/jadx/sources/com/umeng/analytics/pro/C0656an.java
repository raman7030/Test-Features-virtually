package com.umeng.analytics.pro;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;
import p067l.C19768;
import p067l.C21562;

/* JADX INFO: renamed from: com.umeng.analytics.pro.an */
/* JADX INFO: compiled from: O5QW */
/* JADX INFO: loaded from: classes.dex */
public class C0656an implements InterfaceC0664av, Serializable, Cloneable {

    /* JADX INFO: renamed from: A */
    public static final int f2366A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f2367B = 3;

    /* JADX INFO: renamed from: k */
    public static final Map f2368k;

    /* JADX INFO: renamed from: l */
    public static final long f2369l = 420342210744516016L;

    /* JADX INFO: renamed from: m */
    public static final C0695bz f2370m = new C0695bz("UMEnvelope");

    /* JADX INFO: renamed from: n */
    public static final C0685bp f2371n = new C0685bp("version", (byte) 11, 1);

    /* JADX INFO: renamed from: o */
    public static final C0685bp f2372o = new C0685bp("address", (byte) 11, 2);

    /* JADX INFO: renamed from: p */
    public static final C0685bp f2373p = new C0685bp("signature", (byte) 11, 3);

    /* JADX INFO: renamed from: q */
    public static final C0685bp f2374q = new C0685bp("serial_num", (byte) 8, 4);

    /* JADX INFO: renamed from: r */
    public static final C0685bp f2375r = new C0685bp("ts_secs", (byte) 8, 5);

    /* JADX INFO: renamed from: s */
    public static final C0685bp f2376s = new C0685bp(Name.LENGTH, (byte) 8, 6);

    /* JADX INFO: renamed from: t */
    public static final C0685bp f2377t = new C0685bp("entity", (byte) 11, 7);

    /* JADX INFO: renamed from: u */
    public static final C0685bp f2378u = new C0685bp("guid", (byte) 11, 8);

    /* JADX INFO: renamed from: v */
    public static final C0685bp f2379v = new C0685bp("checksum", (byte) 11, 9);

    /* JADX INFO: renamed from: w */
    public static final C0685bp f2380w = new C0685bp("codex", (byte) 8, 10);

    /* JADX INFO: renamed from: x */
    public static final Map f2381x;

    /* JADX INFO: renamed from: y */
    public static final int f2382y = 0;

    /* JADX INFO: renamed from: z */
    public static final int f2383z = 1;

    /* JADX INFO: renamed from: C */
    public byte f2384C;

    /* JADX INFO: renamed from: D */
    public e[] f2385D;

    /* JADX INFO: renamed from: a */
    public String f2386a;

    /* JADX INFO: renamed from: b */
    public String f2387b;

    /* JADX INFO: renamed from: c */
    public String f2388c;

    /* JADX INFO: renamed from: d */
    public int f2389d;

    /* JADX INFO: renamed from: e */
    public int f2390e;

    /* JADX INFO: renamed from: f */
    public int f2391f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f2392g;

    /* JADX INFO: renamed from: h */
    public String f2393h;

    /* JADX INFO: renamed from: i */
    public String f2394i;

    /* JADX INFO: renamed from: j */
    public int f2395j;

    static {
        HashMap map = new HashMap();
        f2381x = map;
        map.put(AbstractC0701ce.class, new b());
        map.put(AbstractC0702cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VERSION, new C0677bh("version", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.ADDRESS, new C0677bh("address", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.SIGNATURE, new C0677bh("signature", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.SERIAL_NUM, new C0677bh("serial_num", (byte) 1, new C0678bi((byte) 8)));
        enumMap.put(e.TS_SECS, new C0677bh("ts_secs", (byte) 1, new C0678bi((byte) 8)));
        enumMap.put(e.LENGTH, new C0677bh(Name.LENGTH, (byte) 1, new C0678bi((byte) 8)));
        enumMap.put(e.ENTITY, new C0677bh("entity", (byte) 1, new C0678bi((byte) 11, true)));
        enumMap.put(e.GUID, new C0677bh("guid", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.CHECKSUM, new C0677bh("checksum", (byte) 1, new C0678bi((byte) 11)));
        enumMap.put(e.CODEX, new C0677bh("codex", (byte) 2, new C0678bi((byte) 8)));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(enumMap);
        f2368k = mapUnmodifiableMap;
        C0677bh.m2351a(C0656an.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.an$e */
    /* JADX INFO: compiled from: O5QW */
    public enum e implements InterfaceC0672bc {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, Name.LENGTH),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");


        /* JADX INFO: renamed from: k */
        public static final Map f2406k = new HashMap();

        /* JADX INFO: renamed from: l */
        public final short f2408l;

        /* JADX INFO: renamed from: m */
        public final String f2409m;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f2406k.put(eVar.mo2228b(), eVar);
            }
        }

        /* JADX INFO: renamed from: a */
        public static e m2224a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static e m2226b(int i) {
            e eVarM2224a = m2224a(i);
            if (eVarM2224a != null) {
                return eVarM2224a;
            }
            throw new IllegalArgumentException(C19768.m44906(i, "Field ", " doesn't exist!"));
        }

        /* JADX INFO: renamed from: a */
        public static e m2225a(String str) {
            return (e) f2406k.get(str);
        }

        e(short s, String str) {
            this.f2408l = s;
            this.f2409m = str;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: a */
        public short mo2227a() {
            return this.f2408l;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: b */
        public String mo2228b() {
            return this.f2409m;
        }
    }

    public C0656an() {
        this.f2384C = (byte) 0;
        this.f2385D = new e[]{e.CODEX};
    }

    public C0656an(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f2386a = str;
        this.f2387b = str2;
        this.f2388c = str3;
        this.f2389d = i;
        m2183d(true);
        this.f2390e = i2;
        m2188e(true);
        this.f2391f = i3;
        m2190f(true);
        this.f2392g = byteBuffer;
        this.f2393h = str4;
        this.f2394i = str5;
    }

    public C0656an(C0656an c0656an) {
        this.f2384C = (byte) 0;
        this.f2385D = new e[]{e.CODEX};
        this.f2384C = c0656an.f2384C;
        if (c0656an.m2184d()) {
            this.f2386a = c0656an.f2386a;
        }
        if (c0656an.m2192g()) {
            this.f2387b = c0656an.f2387b;
        }
        if (c0656an.m2198j()) {
            this.f2388c = c0656an.f2388c;
        }
        this.f2389d = c0656an.f2389d;
        this.f2390e = c0656an.f2390e;
        this.f2391f = c0656an.f2391f;
        if (c0656an.m2211w()) {
            this.f2392g = C0665aw.m2296d(c0656an.f2392g);
        }
        if (c0656an.m2214z()) {
            this.f2393h = c0656an.f2393h;
        }
        if (c0656an.m2162C()) {
            this.f2394i = c0656an.f2394i;
        }
        this.f2395j = c0656an.f2395j;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0656an deepCopy() {
        return new C0656an(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void clear() {
        this.f2386a = null;
        this.f2387b = null;
        this.f2388c = null;
        m2183d(false);
        this.f2389d = 0;
        m2188e(false);
        this.f2390e = 0;
        m2190f(false);
        this.f2391f = 0;
        this.f2392g = null;
        this.f2393h = null;
        this.f2394i = null;
        m2197j(false);
        this.f2395j = 0;
    }

    /* JADX INFO: renamed from: b */
    public String m2175b() {
        return this.f2386a;
    }

    /* JADX INFO: renamed from: a */
    public C0656an m2169a(String str) {
        this.f2386a = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m2179c() {
        this.f2386a = null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2184d() {
        return this.f2386a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m2172a(boolean z) {
        if (z) {
            return;
        }
        this.f2386a = null;
    }

    /* JADX INFO: renamed from: e */
    public String m2187e() {
        return this.f2387b;
    }

    /* JADX INFO: renamed from: b */
    public C0656an m2174b(String str) {
        this.f2387b = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m2189f() {
        this.f2387b = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m2192g() {
        return this.f2387b != null;
    }

    /* JADX INFO: renamed from: b */
    public void m2176b(boolean z) {
        if (z) {
            return;
        }
        this.f2387b = null;
    }

    /* JADX INFO: renamed from: h */
    public String m2193h() {
        return this.f2388c;
    }

    /* JADX INFO: renamed from: c */
    public C0656an m2178c(String str) {
        this.f2388c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m2195i() {
        this.f2388c = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m2198j() {
        return this.f2388c != null;
    }

    /* JADX INFO: renamed from: c */
    public void m2180c(boolean z) {
        if (z) {
            return;
        }
        this.f2388c = null;
    }

    /* JADX INFO: renamed from: k */
    public int m2199k() {
        return this.f2389d;
    }

    /* JADX INFO: renamed from: a */
    public C0656an m2168a(int i) {
        this.f2389d = i;
        m2183d(true);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void m2200l() {
        this.f2384C = C0661as.m2264b(this.f2384C, 0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m2201m() {
        return C0661as.m2260a(this.f2384C, 0);
    }

    /* JADX INFO: renamed from: d */
    public void m2183d(boolean z) {
        this.f2384C = C0661as.m2252a(this.f2384C, 0, z);
    }

    /* JADX INFO: renamed from: n */
    public int m2202n() {
        return this.f2390e;
    }

    /* JADX INFO: renamed from: b */
    public C0656an m2173b(int i) {
        this.f2390e = i;
        m2188e(true);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public void m2203o() {
        this.f2384C = C0661as.m2264b(this.f2384C, 1);
    }

    /* JADX INFO: renamed from: p */
    public boolean m2204p() {
        return C0661as.m2260a(this.f2384C, 1);
    }

    /* JADX INFO: renamed from: e */
    public void m2188e(boolean z) {
        this.f2384C = C0661as.m2252a(this.f2384C, 1, z);
    }

    /* JADX INFO: renamed from: q */
    public int m2205q() {
        return this.f2391f;
    }

    /* JADX INFO: renamed from: c */
    public C0656an m2177c(int i) {
        this.f2391f = i;
        m2190f(true);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m2206r() {
        this.f2384C = C0661as.m2264b(this.f2384C, 2);
    }

    /* JADX INFO: renamed from: s */
    public boolean m2207s() {
        return C0661as.m2260a(this.f2384C, 2);
    }

    /* JADX INFO: renamed from: f */
    public void m2190f(boolean z) {
        this.f2384C = C0661as.m2252a(this.f2384C, 2, z);
    }

    /* JADX INFO: renamed from: t */
    public byte[] m2208t() {
        m2170a(C0665aw.m2295c(this.f2392g));
        ByteBuffer byteBuffer = this.f2392g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    /* JADX INFO: renamed from: u */
    public ByteBuffer m2209u() {
        return this.f2392g;
    }

    /* JADX INFO: renamed from: a */
    public C0656an m2171a(byte[] bArr) {
        m2170a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0656an m2170a(ByteBuffer byteBuffer) {
        this.f2392g = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public void m2210v() {
        this.f2392g = null;
    }

    /* JADX INFO: renamed from: w */
    public boolean m2211w() {
        return this.f2392g != null;
    }

    /* JADX INFO: renamed from: g */
    public void m2191g(boolean z) {
        if (z) {
            return;
        }
        this.f2392g = null;
    }

    /* JADX INFO: renamed from: x */
    public String m2212x() {
        return this.f2393h;
    }

    /* JADX INFO: renamed from: d */
    public C0656an m2182d(String str) {
        this.f2393h = str;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m2213y() {
        this.f2393h = null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m2214z() {
        return this.f2393h != null;
    }

    /* JADX INFO: renamed from: h */
    public void m2194h(boolean z) {
        if (z) {
            return;
        }
        this.f2393h = null;
    }

    /* JADX INFO: renamed from: A */
    public String m2160A() {
        return this.f2394i;
    }

    /* JADX INFO: renamed from: e */
    public C0656an m2186e(String str) {
        this.f2394i = str;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public void m2161B() {
        this.f2394i = null;
    }

    /* JADX INFO: renamed from: C */
    public boolean m2162C() {
        return this.f2394i != null;
    }

    /* JADX INFO: renamed from: i */
    public void m2196i(boolean z) {
        if (z) {
            return;
        }
        this.f2394i = null;
    }

    /* JADX INFO: renamed from: D */
    public int m2163D() {
        return this.f2395j;
    }

    /* JADX INFO: renamed from: d */
    public C0656an m2181d(int i) {
        this.f2395j = i;
        m2197j(true);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public void m2164E() {
        this.f2384C = C0661as.m2264b(this.f2384C, 3);
    }

    /* JADX INFO: renamed from: F */
    public boolean m2165F() {
        return C0661as.m2260a(this.f2384C, 3);
    }

    /* JADX INFO: renamed from: j */
    public void m2197j(boolean z) {
        this.f2384C = C0661as.m2252a(this.f2384C, 3, z);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.m2224a(i);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f2381x.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f2381x.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f2386a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f2387b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f2388c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f2389d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f2390e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f2391f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f2392g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C0665aw.m2291a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f2393h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f2394i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (m2165F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f2395j);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: G */
    public void m2166G() throws C0691bv {
        if (this.f2386a == null) {
            throw new C0691bv("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f2387b == null) {
            throw new C0691bv("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f2388c == null) {
            throw new C0691bv("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.f2392g == null) {
            throw new C0691bv("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.f2393h == null) {
            throw new C0691bv("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.f2394i != null) {
            return;
        }
        throw new C0691bv("Required field 'checksum' was not present! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    private void m2159a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C0684bo(new C0703cg(objectOutputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2158a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.f2384C = (byte) 0;
            read(new C0684bo(new C0703cg(objectInputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.an$b */
    /* JADX INFO: compiled from: O5QW */
    public class b implements InterfaceC0700cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2220b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.an$a */
    /* JADX INFO: compiled from: O5QW */
    public class a extends AbstractC0701ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0656an c0656an) throws C0691bv {
            abstractC0690bu.mo2385j();
            while (true) {
                C0685bp c0685bpMo2387l = abstractC0690bu.mo2387l();
                byte b = c0685bpMo2387l.f2531b;
                if (b != 0) {
                    switch (c0685bpMo2387l.f2532c) {
                        case 1:
                            if (b == 11) {
                                c0656an.f2386a = abstractC0690bu.mo2401z();
                                c0656an.m2172a(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 2:
                            if (b == 11) {
                                c0656an.f2387b = abstractC0690bu.mo2401z();
                                c0656an.m2176b(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 3:
                            if (b == 11) {
                                c0656an.f2388c = abstractC0690bu.mo2401z();
                                c0656an.m2180c(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 4:
                            if (b == 8) {
                                c0656an.f2389d = abstractC0690bu.mo2398w();
                                c0656an.m2183d(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 5:
                            if (b == 8) {
                                c0656an.f2390e = abstractC0690bu.mo2398w();
                                c0656an.m2188e(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 6:
                            if (b == 8) {
                                c0656an.f2391f = abstractC0690bu.mo2398w();
                                c0656an.m2190f(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 7:
                            if (b == 11) {
                                c0656an.f2392g = abstractC0690bu.mo2358A();
                                c0656an.m2191g(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 8:
                            if (b == 11) {
                                c0656an.f2393h = abstractC0690bu.mo2401z();
                                c0656an.m2194h(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 9:
                            if (b == 11) {
                                c0656an.f2394i = abstractC0690bu.mo2401z();
                                c0656an.m2196i(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        case 10:
                            if (b == 8) {
                                c0656an.f2395j = abstractC0690bu.mo2398w();
                                c0656an.m2197j(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                            break;
                        default:
                            C0693bx.m2431a(abstractC0690bu, b);
                            break;
                    }
                    abstractC0690bu.mo2388m();
                } else {
                    abstractC0690bu.mo2386k();
                    if (!c0656an.m2201m()) {
                        throw new C0691bv("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!c0656an.m2204p()) {
                        throw new C0691bv("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (!c0656an.m2207s()) {
                        throw new C0691bv("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
                    c0656an.m2166G();
                    return;
                }
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0656an c0656an) throws C0691bv {
            c0656an.m2166G();
            abstractC0690bu.mo2369a(C0656an.f2370m);
            if (c0656an.f2386a != null) {
                abstractC0690bu.mo2364a(C0656an.f2371n);
                abstractC0690bu.mo2370a(c0656an.f2386a);
                abstractC0690bu.mo2376c();
            }
            if (c0656an.f2387b != null) {
                abstractC0690bu.mo2364a(C0656an.f2372o);
                abstractC0690bu.mo2370a(c0656an.f2387b);
                abstractC0690bu.mo2376c();
            }
            if (c0656an.f2388c != null) {
                abstractC0690bu.mo2364a(C0656an.f2373p);
                abstractC0690bu.mo2370a(c0656an.f2388c);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2364a(C0656an.f2374q);
            abstractC0690bu.mo2362a(c0656an.f2389d);
            abstractC0690bu.mo2376c();
            abstractC0690bu.mo2364a(C0656an.f2375r);
            abstractC0690bu.mo2362a(c0656an.f2390e);
            abstractC0690bu.mo2376c();
            abstractC0690bu.mo2364a(C0656an.f2376s);
            abstractC0690bu.mo2362a(c0656an.f2391f);
            abstractC0690bu.mo2376c();
            if (c0656an.f2392g != null) {
                abstractC0690bu.mo2364a(C0656an.f2377t);
                abstractC0690bu.mo2371a(c0656an.f2392g);
                abstractC0690bu.mo2376c();
            }
            if (c0656an.f2393h != null) {
                abstractC0690bu.mo2364a(C0656an.f2378u);
                abstractC0690bu.mo2370a(c0656an.f2393h);
                abstractC0690bu.mo2376c();
            }
            if (c0656an.f2394i != null) {
                abstractC0690bu.mo2364a(C0656an.f2379v);
                abstractC0690bu.mo2370a(c0656an.f2394i);
                abstractC0690bu.mo2376c();
            }
            if (c0656an.m2165F()) {
                abstractC0690bu.mo2364a(C0656an.f2380w);
                abstractC0690bu.mo2362a(c0656an.f2395j);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.an$d */
    /* JADX INFO: compiled from: O5QW */
    public class d implements InterfaceC0700cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2220b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.an$c */
    /* JADX INFO: compiled from: O5QW */
    public class c extends AbstractC0702cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0656an c0656an) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0697ca.mo2370a(c0656an.f2386a);
            c0697ca.mo2370a(c0656an.f2387b);
            c0697ca.mo2370a(c0656an.f2388c);
            c0697ca.mo2362a(c0656an.f2389d);
            c0697ca.mo2362a(c0656an.f2390e);
            c0697ca.mo2362a(c0656an.f2391f);
            c0697ca.mo2371a(c0656an.f2392g);
            c0697ca.mo2370a(c0656an.f2393h);
            c0697ca.mo2370a(c0656an.f2394i);
            BitSet bitSet = new BitSet();
            if (c0656an.m2165F()) {
                bitSet.set(0);
            }
            c0697ca.m2435a(bitSet, 1);
            if (c0656an.m2165F()) {
                c0697ca.mo2362a(c0656an.f2395j);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0656an c0656an) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0656an.f2386a = c0697ca.mo2401z();
            c0656an.m2172a(true);
            c0656an.f2387b = c0697ca.mo2401z();
            c0656an.m2176b(true);
            c0656an.f2388c = c0697ca.mo2401z();
            c0656an.m2180c(true);
            c0656an.f2389d = c0697ca.mo2398w();
            c0656an.m2183d(true);
            c0656an.f2390e = c0697ca.mo2398w();
            c0656an.m2188e(true);
            c0656an.f2391f = c0697ca.mo2398w();
            c0656an.m2190f(true);
            c0656an.f2392g = c0697ca.mo2358A();
            c0656an.m2191g(true);
            c0656an.f2393h = c0697ca.mo2401z();
            c0656an.m2194h(true);
            c0656an.f2394i = c0697ca.mo2401z();
            c0656an.m2196i(true);
            if (c0697ca.m2436b(1).get(0)) {
                c0656an.f2395j = c0697ca.mo2398w();
                c0656an.m2197j(true);
            }
        }
    }
}
