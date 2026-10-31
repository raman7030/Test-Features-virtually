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
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import l.C18307;
import l.C20195;
import l.C3200;

/* JADX INFO: compiled from: T5ZW */
/* JADX INFO: loaded from: classes.dex */
public class b implements av, Serializable, Cloneable {
    public static final Map d;
    public static final long e = -6496538196005191531L;
    public static final bz f = new bz("IdSnapshot");
    public static final bp g = new bp("identity", (byte) 11, 1);
    public static final bp h = new bp("ts", (byte) 10, 2);
    public static final bp i = new bp("version", (byte) 8, 3);
    public static final Map j;
    public static final int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77955l = 1;
    public String a;
    public long b;
    public int c;
    public byte m;

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(ce.class, new C0044b());
        map.put(cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new bh("identity", (byte) 1, new bi((byte) 11)));
        enumMap.put(e.TS, new bh("ts", (byte) 1, new bi((byte) 10)));
        enumMap.put(e.VERSION, new bh("version", (byte) 1, new bi((byte) 8)));
        Map mapUnmodifiableMap = C20195.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        bh.a(b.class, mapUnmodifiableMap);
    }

    /* JADX INFO: compiled from: T5ZW */
    public enum e implements bc {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");

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

    public b() {
        this.m = (byte) 0;
    }

    public b(String str, long j2, int i2) {
        this();
        this.a = str;
        this.b = j2;
        b(true);
        this.c = i2;
        c(true);
    }

    public b(b bVar) {
        this.m = (byte) 0;
        this.m = bVar.m;
        if (bVar.d()) {
            this.a = bVar.a;
        }
        this.b = bVar.b;
        this.c = bVar.c;
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deepCopy() {
        return new b(this);
    }

    @Override // com.umeng.analytics.pro.av
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0L;
        c(false);
        this.c = 0;
    }

    public String b() {
        return this.a;
    }

    public b a(String str) {
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

    public b a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    public void f() {
        this.m = as.b(this.m, 0);
    }

    public boolean g() {
        return as.a(this.m, 0);
    }

    public void b(boolean z) {
        this.m = as.a(this.m, 0, z);
    }

    public int h() {
        return this.c;
    }

    public b a(int i2) {
        this.c = i2;
        c(true);
        return this;
    }

    public void i() {
        this.m = as.b(this.m, 1);
    }

    public boolean j() {
        return as.a(this.m, 1);
    }

    public void c(boolean z) {
        this.m = as.a(this.m, 1, z);
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
        StringBuilder sb = new StringBuilder("IdSnapshot(identity:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("version:");
        return C3200.m9831(this.c, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    public void k() throws bv {
        if (this.a != null) {
            return;
        }
        throw new bv("Required field 'identity' was not present! Struct: " + toString());
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
            this.m = (byte) 0;
            read(new bo(new cg(objectInputStream)));
        } catch (bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: T5ZW */
    public class C0044b implements cd {
        public C0044b() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: T5ZW */
    public class a extends ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bu buVar, b bVar) throws bv {
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
                        } else if (b == 8) {
                            bVar.c = buVar.w();
                            bVar.c(true);
                        } else {
                            bx.a(buVar, b);
                        }
                    } else if (b == 10) {
                        bVar.b = buVar.x();
                        bVar.b(true);
                    } else {
                        bx.a(buVar, b);
                    }
                } else if (b == 11) {
                    bVar.a = buVar.z();
                    bVar.a(true);
                } else {
                    bx.a(buVar, b);
                }
                buVar.m();
            }
            buVar.k();
            if (!bVar.g()) {
                throw new bv("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (!bVar.j()) {
                throw new bv("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            bVar.k();
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bu buVar, b bVar) throws bv {
            bVar.k();
            buVar.a(b.f);
            if (bVar.a != null) {
                buVar.a(b.g);
                buVar.a(bVar.a);
                buVar.c();
            }
            buVar.a(b.h);
            buVar.a(bVar.b);
            buVar.c();
            buVar.a(b.i);
            buVar.a(bVar.c);
            buVar.c();
            buVar.d();
            buVar.b();
        }
    }

    /* JADX INFO: compiled from: T5ZW */
    public class d implements cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: T5ZW */
    public class c extends cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.cc
        public void a(bu buVar, b bVar) {
            ca caVar = (ca) buVar;
            caVar.a(bVar.a);
            caVar.a(bVar.b);
            caVar.a(bVar.c);
        }

        @Override // com.umeng.analytics.pro.cc
        public void b(bu buVar, b bVar) {
            ca caVar = (ca) buVar;
            bVar.a = caVar.z();
            bVar.a(true);
            bVar.b = caVar.x();
            bVar.b(true);
            bVar.c = caVar.w();
            bVar.c(true);
        }
    }
}
