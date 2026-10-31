package com.umeng.commonsdk.statistics.proto;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.bb;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.bh;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bu;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cf;
import com.umeng.analytics.pro.cg;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import l.C18307;
import l.C20195;

/* JADX INFO: compiled from: 351Q */
/* JADX INFO: loaded from: classes.dex */
public class e implements av, Serializable, Cloneable {
    public static final Map d;
    public static final long e = 7501688097813630241L;
    public static final bz f = new bz("ImprintValue");
    public static final bp g = new bp(com.alipay.sdk.m.u0.b.d, (byte) 11, 1);
    public static final bp h = new bp("ts", (byte) 10, 2);
    public static final bp i = new bp("guid", (byte) 11, 3);
    public static final Map j;
    public static final int k = 0;
    public String a;
    public long b;
    public String c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f77957l;
    public EnumC0047e[] m;

    public void k() {
    }

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(ce.class, new b());
        map.put(cf.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0047e.class);
        enumMap.put(EnumC0047e.VALUE, new bh(com.alipay.sdk.m.u0.b.d, (byte) 2, new bi((byte) 11)));
        enumMap.put(EnumC0047e.TS, new bh("ts", (byte) 2, new bi((byte) 10)));
        enumMap.put(EnumC0047e.GUID, new bh("guid", (byte) 2, new bi((byte) 11)));
        Map mapUnmodifiableMap = C20195.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        bh.a(e.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: 351Q */
    public enum EnumC0047e implements bc {
        VALUE(1, com.alipay.sdk.m.u0.b.d),
        TS(2, "ts"),
        GUID(3, "guid");

        public static final Map d = new HashMap();
        public final short e;
        public final String f;

        static {
            for (EnumC0047e enumC0047e : EnumSet.allOf(EnumC0047e.class)) {
                d.put(enumC0047e.b(), enumC0047e);
            }
        }

        public static EnumC0047e a(int i) {
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

        public static EnumC0047e b(int i) {
            EnumC0047e enumC0047eA = a(i);
            if (enumC0047eA != null) {
                return enumC0047eA;
            }
            throw new IllegalArgumentException(C18307.m42645(i, "Field ", " doesn't exist!"));
        }

        public static EnumC0047e a(String str) {
            return (EnumC0047e) d.get(str);
        }

        EnumC0047e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        @Override // com.umeng.analytics.pro.bc
        public short a() {
            return this.e;
        }

        @Override // com.umeng.analytics.pro.bc
        public String b() {
            return this.f;
        }
    }

    public e() {
        this.f77957l = (byte) 0;
        this.m = new EnumC0047e[]{EnumC0047e.VALUE, EnumC0047e.TS, EnumC0047e.GUID};
    }

    public e(long j2, String str) {
        this();
        this.b = j2;
        b(true);
        this.c = str;
    }

    public e(e eVar) {
        this.f77957l = (byte) 0;
        this.m = new EnumC0047e[]{EnumC0047e.VALUE, EnumC0047e.TS, EnumC0047e.GUID};
        this.f77957l = eVar.f77957l;
        if (eVar.d()) {
            this.a = eVar.a;
        }
        this.b = eVar.b;
        if (eVar.j()) {
            this.c = eVar.c;
        }
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e deepCopy() {
        return new e(this);
    }

    @Override // com.umeng.analytics.pro.av
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0L;
        this.c = null;
    }

    public String b() {
        return this.a;
    }

    public e a(String str) {
        this.a = str;
        return this;
    }

    public void c() {
        this.a = null;
    }

    public boolean d() {
        return this.a != null;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    public long e() {
        return this.b;
    }

    public e a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    public void f() {
        this.f77957l = as.b(this.f77957l, 0);
    }

    public boolean g() {
        return as.a(this.f77957l, 0);
    }

    public void b(boolean z) {
        this.f77957l = as.a(this.f77957l, 0, z);
    }

    public String h() {
        return this.c;
    }

    public e b(String str) {
        this.c = str;
        return this;
    }

    public void i() {
        this.c = null;
    }

    public boolean j() {
        return this.c != null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC0047e fieldForId(int i2) {
        return EnumC0047e.a(i2);
    }

    @Override // com.umeng.analytics.pro.av
    public void read(bu buVar) {
        ((cd) j.get(buVar.D())).b().b(buVar, this);
    }

    @Override // com.umeng.analytics.pro.av
    public void write(bu buVar) {
        ((cd) j.get(buVar.D())).b().a(buVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (d()) {
            sb.append("value:");
            String str = this.a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new bo(new cg(objectOutputStream)));
        } catch (bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.f77957l = (byte) 0;
            read(new bo(new cg(objectInputStream)));
        } catch (bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: compiled from: 351Q */
    public class b implements cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: 351Q */
    public class a extends ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bu buVar, e eVar) {
            buVar.j();
            while (true) {
                bp bpVarL = buVar.l();
                byte b = bpVarL.b;
                if (b != 0) {
                    short s = bpVarL.c;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                bx.a(buVar, b);
                            } else if (b == 11) {
                                eVar.c = buVar.z();
                                eVar.c(true);
                            } else {
                                bx.a(buVar, b);
                            }
                        } else if (b == 10) {
                            eVar.b = buVar.x();
                            eVar.b(true);
                        } else {
                            bx.a(buVar, b);
                        }
                    } else if (b == 11) {
                        eVar.a = buVar.z();
                        eVar.a(true);
                    } else {
                        bx.a(buVar, b);
                    }
                    buVar.m();
                } else {
                    buVar.k();
                    eVar.k();
                    return;
                }
            }
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bu buVar, e eVar) {
            eVar.k();
            buVar.a(e.f);
            if (eVar.a != null && eVar.d()) {
                buVar.a(e.g);
                buVar.a(eVar.a);
                buVar.c();
            }
            if (eVar.g()) {
                buVar.a(e.h);
                buVar.a(eVar.b);
                buVar.c();
            }
            if (eVar.c != null && eVar.j()) {
                buVar.a(e.i);
                buVar.a(eVar.c);
                buVar.c();
            }
            buVar.d();
            buVar.b();
        }
    }

    /* JADX INFO: compiled from: 351Q */
    public class d implements cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: 351Q */
    public class c extends cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.cc
        public void a(bu buVar, e eVar) {
            ca caVar = (ca) buVar;
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            if (eVar.g()) {
                bitSet.set(1);
            }
            if (eVar.j()) {
                bitSet.set(2);
            }
            caVar.a(bitSet, 3);
            if (eVar.d()) {
                caVar.a(eVar.a);
            }
            if (eVar.g()) {
                caVar.a(eVar.b);
            }
            if (eVar.j()) {
                caVar.a(eVar.c);
            }
        }

        @Override // com.umeng.analytics.pro.cc
        public void b(bu buVar, e eVar) {
            ca caVar = (ca) buVar;
            BitSet bitSetB = caVar.b(3);
            if (bitSetB.get(0)) {
                eVar.a = caVar.z();
                eVar.a(true);
            }
            if (bitSetB.get(1)) {
                eVar.b = caVar.x();
                eVar.b(true);
            }
            if (bitSetB.get(2)) {
                eVar.c = caVar.z();
                eVar.c(true);
            }
        }
    }
}
