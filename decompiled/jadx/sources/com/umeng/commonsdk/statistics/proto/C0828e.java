package com.umeng.commonsdk.statistics.proto;

import com.alipay.sdk.p010m.p052u0.C0226b;
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
import p067l.C19768;
import p067l.C21562;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e */
/* JADX INFO: compiled from: 351Q */
/* JADX INFO: loaded from: classes.dex */
public class C0828e implements InterfaceC0664av, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map f3544d;

    /* JADX INFO: renamed from: e */
    public static final long f3545e = 7501688097813630241L;

    /* JADX INFO: renamed from: f */
    public static final C0695bz f3546f = new C0695bz("ImprintValue");

    /* JADX INFO: renamed from: g */
    public static final C0685bp f3547g = new C0685bp(C0226b.f1011d, (byte) 11, 1);

    /* JADX INFO: renamed from: h */
    public static final C0685bp f3548h = new C0685bp("ts", (byte) 10, 2);

    /* JADX INFO: renamed from: i */
    public static final C0685bp f3549i = new C0685bp("guid", (byte) 11, 3);

    /* JADX INFO: renamed from: j */
    public static final Map f3550j;

    /* JADX INFO: renamed from: k */
    public static final int f3551k = 0;

    /* JADX INFO: renamed from: a */
    public String f3552a;

    /* JADX INFO: renamed from: b */
    public long f3553b;

    /* JADX INFO: renamed from: c */
    public String f3554c;

    /* JADX INFO: renamed from: l */
    public byte f3555l;

    /* JADX INFO: renamed from: m */
    public e[] f3556m;

    /* JADX INFO: renamed from: k */
    public void m3284k() {
    }

    static {
        HashMap map = new HashMap();
        f3550j = map;
        map.put(AbstractC0701ce.class, new b());
        map.put(AbstractC0702cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VALUE, new C0677bh(C0226b.f1011d, (byte) 2, new C0678bi((byte) 11)));
        enumMap.put(e.TS, new C0677bh("ts", (byte) 2, new C0678bi((byte) 10)));
        enumMap.put(e.GUID, new C0677bh("guid", (byte) 2, new C0678bi((byte) 11)));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(enumMap);
        f3544d = mapUnmodifiableMap;
        C0677bh.m2351a(C0828e.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    /* JADX INFO: compiled from: 351Q */
    public enum e implements InterfaceC0672bc {
        VALUE(1, C0226b.f1011d),
        TS(2, "ts"),
        GUID(3, "guid");


        /* JADX INFO: renamed from: d */
        public static final Map f3560d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final short f3562e;

        /* JADX INFO: renamed from: f */
        public final String f3563f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f3560d.put(eVar.mo2228b(), eVar);
            }
        }

        /* JADX INFO: renamed from: a */
        public static e m3291a(int i) {
            if (i == 1) {
                return VALUE;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return GUID;
        }

        /* JADX INFO: renamed from: b */
        public static e m3293b(int i) {
            e eVarM3291a = m3291a(i);
            if (eVarM3291a != null) {
                return eVarM3291a;
            }
            throw new IllegalArgumentException(C19768.m44906(i, "Field ", " doesn't exist!"));
        }

        /* JADX INFO: renamed from: a */
        public static e m3292a(String str) {
            return (e) f3560d.get(str);
        }

        e(short s, String str) {
            this.f3562e = s;
            this.f3563f = str;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: a */
        public short mo2227a() {
            return this.f3562e;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: b */
        public String mo2228b() {
            return this.f3563f;
        }
    }

    public C0828e() {
        this.f3555l = (byte) 0;
        this.f3556m = new e[]{e.VALUE, e.TS, e.GUID};
    }

    public C0828e(long j, String str) {
        this();
        this.f3553b = j;
        m3274b(true);
        this.f3554c = str;
    }

    public C0828e(C0828e c0828e) {
        this.f3555l = (byte) 0;
        this.f3556m = new e[]{e.VALUE, e.TS, e.GUID};
        this.f3555l = c0828e.f3555l;
        if (c0828e.m3277d()) {
            this.f3552a = c0828e.f3552a;
        }
        this.f3553b = c0828e.f3553b;
        if (c0828e.m3283j()) {
            this.f3554c = c0828e.f3554c;
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0828e deepCopy() {
        return new C0828e(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void clear() {
        this.f3552a = null;
        m3274b(false);
        this.f3553b = 0L;
        this.f3554c = null;
    }

    /* JADX INFO: renamed from: b */
    public String m3273b() {
        return this.f3552a;
    }

    /* JADX INFO: renamed from: a */
    public C0828e m3270a(String str) {
        this.f3552a = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m3275c() {
        this.f3552a = null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3277d() {
        return this.f3552a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m3271a(boolean z) {
        if (z) {
            return;
        }
        this.f3552a = null;
    }

    /* JADX INFO: renamed from: e */
    public long m3278e() {
        return this.f3553b;
    }

    /* JADX INFO: renamed from: a */
    public C0828e m3269a(long j) {
        this.f3553b = j;
        m3274b(true);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m3279f() {
        this.f3555l = C0661as.m2264b(this.f3555l, 0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m3280g() {
        return C0661as.m2260a(this.f3555l, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m3274b(boolean z) {
        this.f3555l = C0661as.m2252a(this.f3555l, 0, z);
    }

    /* JADX INFO: renamed from: h */
    public String m3281h() {
        return this.f3554c;
    }

    /* JADX INFO: renamed from: b */
    public C0828e m3272b(String str) {
        this.f3554c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m3282i() {
        this.f3554c = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3283j() {
        return this.f3554c != null;
    }

    /* JADX INFO: renamed from: c */
    public void m3276c(boolean z) {
        if (z) {
            return;
        }
        this.f3554c = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.m3291a(i);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3550j.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) f3550j.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (m3277d()) {
            sb.append("value:");
            String str = this.f3552a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f3553b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f3554c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m3262a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C0684bo(new C0703cg(objectOutputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3261a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.f3555l = (byte) 0;
            read(new C0684bo(new C0703cg(objectInputStream)));
        } catch (C0671bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$b */
    /* JADX INFO: compiled from: 351Q */
    public class b implements InterfaceC0700cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2220b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$a */
    /* JADX INFO: compiled from: 351Q */
    public class a extends AbstractC0701ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0828e c0828e) {
            abstractC0690bu.mo2385j();
            while (true) {
                C0685bp c0685bpMo2387l = abstractC0690bu.mo2387l();
                byte b = c0685bpMo2387l.f2531b;
                if (b != 0) {
                    short s = c0685bpMo2387l.f2532c;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                C0693bx.m2431a(abstractC0690bu, b);
                            } else if (b == 11) {
                                c0828e.f3554c = abstractC0690bu.mo2401z();
                                c0828e.m3276c(true);
                            } else {
                                C0693bx.m2431a(abstractC0690bu, b);
                            }
                        } else if (b == 10) {
                            c0828e.f3553b = abstractC0690bu.mo2399x();
                            c0828e.m3274b(true);
                        } else {
                            C0693bx.m2431a(abstractC0690bu, b);
                        }
                    } else if (b == 11) {
                        c0828e.f3552a = abstractC0690bu.mo2401z();
                        c0828e.m3271a(true);
                    } else {
                        C0693bx.m2431a(abstractC0690bu, b);
                    }
                    abstractC0690bu.mo2388m();
                } else {
                    abstractC0690bu.mo2386k();
                    c0828e.m3284k();
                    return;
                }
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0828e c0828e) {
            c0828e.m3284k();
            abstractC0690bu.mo2369a(C0828e.f3546f);
            if (c0828e.f3552a != null && c0828e.m3277d()) {
                abstractC0690bu.mo2364a(C0828e.f3547g);
                abstractC0690bu.mo2370a(c0828e.f3552a);
                abstractC0690bu.mo2376c();
            }
            if (c0828e.m3280g()) {
                abstractC0690bu.mo2364a(C0828e.f3548h);
                abstractC0690bu.mo2363a(c0828e.f3553b);
                abstractC0690bu.mo2376c();
            }
            if (c0828e.f3554c != null && c0828e.m3283j()) {
                abstractC0690bu.mo2364a(C0828e.f3549i);
                abstractC0690bu.mo2370a(c0828e.f3554c);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$d */
    /* JADX INFO: compiled from: 351Q */
    public class d implements InterfaceC0700cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2220b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    /* JADX INFO: compiled from: 351Q */
    public class c extends AbstractC0702cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, C0828e c0828e) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            BitSet bitSet = new BitSet();
            if (c0828e.m3277d()) {
                bitSet.set(0);
            }
            if (c0828e.m3280g()) {
                bitSet.set(1);
            }
            if (c0828e.m3283j()) {
                bitSet.set(2);
            }
            c0697ca.m2435a(bitSet, 3);
            if (c0828e.m3277d()) {
                c0697ca.mo2370a(c0828e.f3552a);
            }
            if (c0828e.m3280g()) {
                c0697ca.mo2363a(c0828e.f3553b);
            }
            if (c0828e.m3283j()) {
                c0697ca.mo2370a(c0828e.f3554c);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, C0828e c0828e) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            BitSet bitSetM2436b = c0697ca.m2436b(3);
            if (bitSetM2436b.get(0)) {
                c0828e.f3552a = c0697ca.mo2401z();
                c0828e.m3271a(true);
            }
            if (bitSetM2436b.get(1)) {
                c0828e.f3553b = c0697ca.mo2399x();
                c0828e.m3274b(true);
            }
            if (bitSetM2436b.get(2)) {
                c0828e.f3554c = c0697ca.mo2401z();
                c0828e.m3276c(true);
            }
        }
    }
}
