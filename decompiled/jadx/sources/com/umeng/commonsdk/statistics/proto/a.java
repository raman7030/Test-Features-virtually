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
import com.umeng.analytics.pro.bv;
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
import l.C15942;
import l.C18307;
import l.C20195;

/* JADX INFO: compiled from: Q5XW */
/* JADX INFO: loaded from: classes.dex */
public class a implements av, Serializable, Cloneable {
    public static final Map e;
    public static final long f = 9132678615281394583L;
    public static final bz g = new bz("IdJournal");
    public static final bp h = new bp("domain", (byte) 11, 1);
    public static final bp i = new bp("old_id", (byte) 11, 2);
    public static final bp j = new bp("new_id", (byte) 11, 3);
    public static final bp k = new bp("ts", (byte) 10, 4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f77954l;
    public static final int m = 0;
    public String a;
    public String b;
    public String c;
    public long d;
    public byte n;
    public e[] o;

    static {
        HashMap map = new HashMap();
        f77954l = map;
        map.put(ce.class, new b());
        map.put(cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new bh("domain", (byte) 1, new bi((byte) 11)));
        enumMap.put(e.OLD_ID, new bh("old_id", (byte) 2, new bi((byte) 11)));
        enumMap.put(e.NEW_ID, new bh("new_id", (byte) 1, new bi((byte) 11)));
        enumMap.put(e.TS, new bh("ts", (byte) 1, new bi((byte) 10)));
        Map mapUnmodifiableMap = C20195.unmodifiableMap(enumMap);
        e = mapUnmodifiableMap;
        bh.a(a.class, mapUnmodifiableMap);
    }

    /* JADX INFO: compiled from: Q5XW */
    public enum e implements bc {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");

        public static final Map e = new HashMap();
        public final short f;
        public final String g;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                e.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
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

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(C18307.m42645(i, "Field ", " doesn't exist!"));
        }

        public static e a(String str) {
            return (e) e.get(str);
        }

        e(short s, String str) {
            this.f = s;
            this.g = str;
        }

        @Override // com.umeng.analytics.pro.bc
        public short a() {
            return this.f;
        }

        @Override // com.umeng.analytics.pro.bc
        public String b() {
            return this.g;
        }
    }

    public a() {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
    }

    public a(String str, String str2, long j2) {
        this();
        this.a = str;
        this.c = str2;
        this.d = j2;
        d(true);
    }

    public a(a aVar) {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
        this.n = aVar.n;
        if (aVar.d()) {
            this.a = aVar.a;
        }
        if (aVar.g()) {
            this.b = aVar.b;
        }
        if (aVar.j()) {
            this.c = aVar.c;
        }
        this.d = aVar.d;
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a deepCopy() {
        return new a(this);
    }

    @Override // com.umeng.analytics.pro.av
    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
        d(false);
        this.d = 0L;
    }

    public String b() {
        return this.a;
    }

    public a a(String str) {
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

    public String e() {
        return this.b;
    }

    public a b(String str) {
        this.b = str;
        return this;
    }

    public void f() {
        this.b = null;
    }

    public boolean g() {
        return this.b != null;
    }

    public void b(boolean z) {
        if (z) {
            return;
        }
        this.b = null;
    }

    public String h() {
        return this.c;
    }

    public a c(String str) {
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

    public long k() {
        return this.d;
    }

    public a a(long j2) {
        this.d = j2;
        d(true);
        return this;
    }

    public void l() {
        this.n = as.b(this.n, 0);
    }

    public boolean m() {
        return as.a(this.n, 0);
    }

    public void d(boolean z) {
        this.n = as.a(this.n, 0, z);
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    @Override // com.umeng.analytics.pro.av
    public void read(bu buVar) {
        ((cd) f77954l.get(buVar.D())).b().b(buVar, this);
    }

    @Override // com.umeng.analytics.pro.av
    public void write(bu buVar) {
        ((cd) f77954l.get(buVar.D())).b().a(buVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(domain:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        return C15942.m37718(sb, this.d, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public void n() throws bv {
        if (this.a == null) {
            throw new bv("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new bv("Required field 'new_id' was not present! Struct: " + toString());
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
            this.n = (byte) 0;
            read(new bo(new cg(objectInputStream)));
        } catch (bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: compiled from: Q5XW */
    public class b implements cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0043a b() {
            return new C0043a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Q5XW */
    public class C0043a extends ce {
        public C0043a() {
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bu buVar, a aVar) throws bv {
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
                            if (s != 4) {
                                bx.a(buVar, b);
                            } else if (b == 10) {
                                aVar.d = buVar.x();
                                aVar.d(true);
                            } else {
                                bx.a(buVar, b);
                            }
                        } else if (b == 11) {
                            aVar.c = buVar.z();
                            aVar.c(true);
                        } else {
                            bx.a(buVar, b);
                        }
                    } else if (b == 11) {
                        aVar.b = buVar.z();
                        aVar.b(true);
                    } else {
                        bx.a(buVar, b);
                    }
                } else if (b == 11) {
                    aVar.a = buVar.z();
                    aVar.a(true);
                } else {
                    bx.a(buVar, b);
                }
                buVar.m();
            }
            buVar.k();
            if (!aVar.m()) {
                throw new bv("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            aVar.n();
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bu buVar, a aVar) throws bv {
            aVar.n();
            buVar.a(a.g);
            if (aVar.a != null) {
                buVar.a(a.h);
                buVar.a(aVar.a);
                buVar.c();
            }
            if (aVar.b != null && aVar.g()) {
                buVar.a(a.i);
                buVar.a(aVar.b);
                buVar.c();
            }
            if (aVar.c != null) {
                buVar.a(a.j);
                buVar.a(aVar.c);
                buVar.c();
            }
            buVar.a(a.k);
            buVar.a(aVar.d);
            buVar.c();
            buVar.d();
            buVar.b();
        }
    }

    /* JADX INFO: compiled from: Q5XW */
    public class d implements cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: Q5XW */
    public class c extends cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.cc
        public void a(bu buVar, a aVar) {
            ca caVar = (ca) buVar;
            caVar.a(aVar.a);
            caVar.a(aVar.c);
            caVar.a(aVar.d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            caVar.a(bitSet, 1);
            if (aVar.g()) {
                caVar.a(aVar.b);
            }
        }

        @Override // com.umeng.analytics.pro.cc
        public void b(bu buVar, a aVar) {
            ca caVar = (ca) buVar;
            aVar.a = caVar.z();
            aVar.a(true);
            aVar.c = caVar.z();
            aVar.c(true);
            aVar.d = caVar.x();
            aVar.d(true);
            if (caVar.b(1).get(0)) {
                aVar.b = caVar.z();
                aVar.b(true);
            }
        }
    }
}
