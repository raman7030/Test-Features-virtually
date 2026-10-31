package com.umeng.commonsdk.statistics.proto;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.bb;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.bh;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.br;
import com.umeng.analytics.pro.bu;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cf;
import com.umeng.analytics.pro.cg;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import l.C18307;
import l.C20195;

/* JADX INFO: compiled from: 05JA */
/* JADX INFO: loaded from: classes.dex */
public class d implements av, Serializable, Cloneable {
    public static final Map d;
    public static final long e = 2846460275012375038L;
    public static final bz f = new bz("Imprint");
    public static final bp g = new bp("property", cb.k, 1);
    public static final bp h = new bp("version", (byte) 8, 2);
    public static final bp i = new bp("checksum", (byte) 11, 3);
    public static final Map j;
    public static final int k = 0;
    public Map a;
    public int b;
    public String c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f77956l;

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(ce.class, new b());
        map.put(cf.class, new C0046d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.PROPERTY, new bh("property", (byte) 1, new bk(cb.k, new bi((byte) 11), new bm((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put(e.VERSION, new bh("version", (byte) 1, new bi((byte) 8)));
        enumMap.put(e.CHECKSUM, new bh("checksum", (byte) 1, new bi((byte) 11)));
        Map mapUnmodifiableMap = C20195.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        bh.a(d.class, mapUnmodifiableMap);
    }

    /* JADX INFO: compiled from: 05JA */
    public enum e implements bc {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");

        public static final Map d = new HashMap();
        public final short e;
        public final String f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
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

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(C18307.m42645(i, "Field ", " doesn't exist!"));
        }

        public static e a(String str) {
            return (e) d.get(str);
        }

        e(short s, String str) {
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

    public d() {
        this.f77956l = (byte) 0;
    }

    public d(Map map, int i2, String str) {
        this();
        this.a = map;
        this.b = i2;
        b(true);
        this.c = str;
    }

    public d(d dVar) {
        this.f77956l = (byte) 0;
        this.f77956l = dVar.f77956l;
        if (dVar.e()) {
            HashMap map = new HashMap();
            for (Map.Entry entry : dVar.a.entrySet()) {
                map.put((String) entry.getKey(), new com.umeng.commonsdk.statistics.proto.e((com.umeng.commonsdk.statistics.proto.e) entry.getValue()));
            }
            this.a = map;
        }
        this.b = dVar.b;
        if (dVar.k()) {
            this.c = dVar.c;
        }
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d deepCopy() {
        return new d(this);
    }

    @Override // com.umeng.analytics.pro.av
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0;
        this.c = null;
    }

    public int b() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, eVar);
    }

    public Map c() {
        return this.a;
    }

    public d a(Map map) {
        this.a = map;
        return this;
    }

    public void d() {
        this.a = null;
    }

    public boolean e() {
        return this.a != null;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    public int f() {
        return this.b;
    }

    public d a(int i2) {
        this.b = i2;
        b(true);
        return this;
    }

    public void g() {
        this.f77956l = as.b(this.f77956l, 0);
    }

    public boolean h() {
        return as.a(this.f77956l, 0);
    }

    public void b(boolean z) {
        this.f77956l = as.a(this.f77956l, 0, z);
    }

    public String i() {
        return this.c;
    }

    public d a(String str) {
        this.c = str;
        return this;
    }

    public void j() {
        this.c = null;
    }

    public boolean k() {
        return this.c != null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
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
        StringBuilder sb = new StringBuilder("Imprint(property:");
        Map map = this.a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    public void l() throws bv {
        if (this.a == null) {
            throw new bv("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new bv("Required field 'checksum' was not present! Struct: " + toString());
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
            this.f77956l = (byte) 0;
            read(new bo(new cg(objectInputStream)));
        } catch (bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: compiled from: 05JA */
    public class b implements cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: 05JA */
    public class a extends ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bu buVar, d dVar) throws bv {
            buVar.j();
            while (true) {
                bp bpVarL = buVar.l();
                byte b = bpVarL.b;
                if (b == 0) {
                    break;
                }
                short s = bpVarL.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            bx.a(buVar, b);
                        } else if (b == 11) {
                            dVar.c = buVar.z();
                            dVar.c(true);
                        } else {
                            bx.a(buVar, b);
                        }
                    } else if (b == 8) {
                        dVar.b = buVar.w();
                        dVar.b(true);
                    } else {
                        bx.a(buVar, b);
                    }
                } else if (b == 13) {
                    br brVarN = buVar.n();
                    dVar.a = new HashMap(brVarN.c * 2);
                    for (int i = 0; i < brVarN.c; i++) {
                        String strZ = buVar.z();
                        com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                        eVar.read(buVar);
                        dVar.a.put(strZ, eVar);
                    }
                    buVar.o();
                    dVar.a(true);
                } else {
                    bx.a(buVar, b);
                }
                buVar.m();
            }
            buVar.k();
            if (!dVar.h()) {
                throw new bv("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            dVar.l();
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bu buVar, d dVar) throws bv {
            dVar.l();
            buVar.a(d.f);
            if (dVar.a != null) {
                buVar.a(d.g);
                buVar.a(new br((byte) 11, (byte) 12, dVar.a.size()));
                for (Map.Entry entry : dVar.a.entrySet()) {
                    buVar.a((String) entry.getKey());
                    ((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).write(buVar);
                }
                buVar.e();
                buVar.c();
            }
            buVar.a(d.h);
            buVar.a(dVar.b);
            buVar.c();
            if (dVar.c != null) {
                buVar.a(d.i);
                buVar.a(dVar.c);
                buVar.c();
            }
            buVar.d();
            buVar.b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: 05JA */
    public class C0046d implements cd {
        public C0046d() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: 05JA */
    public class c extends cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.cc
        public void a(bu buVar, d dVar) {
            ca caVar = (ca) buVar;
            caVar.a(dVar.a.size());
            for (Map.Entry entry : dVar.a.entrySet()) {
                caVar.a((String) entry.getKey());
                ((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).write(caVar);
            }
            caVar.a(dVar.b);
            caVar.a(dVar.c);
        }

        @Override // com.umeng.analytics.pro.cc
        public void b(bu buVar, d dVar) {
            ca caVar = (ca) buVar;
            br brVar = new br((byte) 11, (byte) 12, caVar.w());
            dVar.a = new HashMap(brVar.c * 2);
            for (int i = 0; i < brVar.c; i++) {
                String strZ = caVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(caVar);
                dVar.a.put(strZ, eVar);
            }
            dVar.a(true);
            dVar.b = caVar.w();
            dVar.b(true);
            dVar.c = caVar.z();
            dVar.c(true);
        }
    }
}
