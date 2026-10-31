package com.umeng.commonsdk.statistics.proto;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.bb;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.bh;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bj;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bq;
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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.C18307;
import l.C20195;

/* JADX INFO: compiled from: T578 */
/* JADX INFO: loaded from: classes.dex */
public class c implements av, Serializable, Cloneable {
    public static final Map d;
    public static final long e = -5764118265293965743L;
    public static final bz f = new bz("IdTracking");
    public static final bp g = new bp("snapshots", cb.k, 1);
    public static final bp h = new bp("journals", (byte) 15, 2);
    public static final bp i = new bp("checksum", (byte) 11, 3);
    public static final Map j;
    public Map a;
    public List b;
    public String c;
    public e[] k;

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(ce.class, new b());
        map.put(cf.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.SNAPSHOTS, new bh("snapshots", (byte) 1, new bk(cb.k, new bi((byte) 11), new bm((byte) 12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put(e.JOURNALS, new bh("journals", (byte) 2, new bj((byte) 15, new bm((byte) 12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put(e.CHECKSUM, new bh("checksum", (byte) 2, new bi((byte) 11)));
        Map mapUnmodifiableMap = C20195.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        bh.a(c.class, mapUnmodifiableMap);
    }

    /* JADX INFO: compiled from: T578 */
    public enum e implements bc {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
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

    public c() {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public c(Map map) {
        this();
        this.a = map;
    }

    public c(c cVar) {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap map = new HashMap();
            for (Map.Entry entry : cVar.a.entrySet()) {
                map.put((String) entry.getKey(), new com.umeng.commonsdk.statistics.proto.b((com.umeng.commonsdk.statistics.proto.b) entry.getValue()));
            }
            this.a = map;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.b.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.umeng.commonsdk.statistics.proto.a((com.umeng.commonsdk.statistics.proto.a) it.next()));
            }
            this.b = arrayList;
        }
        if (cVar.m()) {
            this.c = cVar.c;
        }
    }

    @Override // com.umeng.analytics.pro.av
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c deepCopy() {
        return new c(this);
    }

    @Override // com.umeng.analytics.pro.av
    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public int b() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.b bVar) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, bVar);
    }

    public Map c() {
        return this.a;
    }

    public c a(Map map) {
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
        List list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Iterator g() {
        List list = this.b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public void a(com.umeng.commonsdk.statistics.proto.a aVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(aVar);
    }

    public List h() {
        return this.b;
    }

    public c a(List list) {
        this.b = list;
        return this;
    }

    public void i() {
        this.b = null;
    }

    public boolean j() {
        return this.b != null;
    }

    public void b(boolean z) {
        if (z) {
            return;
        }
        this.b = null;
    }

    public String k() {
        return this.c;
    }

    public c a(String str) {
        this.c = str;
        return this;
    }

    public void l() {
        this.c = null;
    }

    public boolean m() {
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
        StringBuilder sb = new StringBuilder("IdTracking(snapshots:");
        Map map = this.a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (j()) {
            sb.append(", ");
            sb.append("journals:");
            List list = this.b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    public void n() throws bv {
        if (this.a != null) {
            return;
        }
        throw new bv("Required field 'snapshots' was not present! Struct: " + toString());
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
            read(new bo(new cg(objectInputStream)));
        } catch (bb e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: compiled from: T578 */
    public class b implements cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: T578 */
    public class a extends ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bu buVar, c cVar) throws bv {
            buVar.j();
            while (true) {
                bp bpVarL = buVar.l();
                byte b = bpVarL.b;
                if (b != 0) {
                    short s = bpVarL.c;
                    int i = 0;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                bx.a(buVar, b);
                            } else if (b == 11) {
                                cVar.c = buVar.z();
                                cVar.c(true);
                            } else {
                                bx.a(buVar, b);
                            }
                        } else if (b == 15) {
                            bq bqVarP = buVar.p();
                            cVar.b = new ArrayList(bqVarP.b);
                            while (i < bqVarP.b) {
                                com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                                aVar.read(buVar);
                                cVar.b.add(aVar);
                                i++;
                            }
                            buVar.q();
                            cVar.b(true);
                        } else {
                            bx.a(buVar, b);
                        }
                    } else if (b == 13) {
                        br brVarN = buVar.n();
                        cVar.a = new HashMap(brVarN.c * 2);
                        while (i < brVarN.c) {
                            String strZ = buVar.z();
                            com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                            bVar.read(buVar);
                            cVar.a.put(strZ, bVar);
                            i++;
                        }
                        buVar.o();
                        cVar.a(true);
                    } else {
                        bx.a(buVar, b);
                    }
                    buVar.m();
                } else {
                    buVar.k();
                    cVar.n();
                    return;
                }
            }
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bu buVar, c cVar) throws bv {
            cVar.n();
            buVar.a(c.f);
            if (cVar.a != null) {
                buVar.a(c.g);
                buVar.a(new br((byte) 11, (byte) 12, cVar.a.size()));
                for (Map.Entry entry : cVar.a.entrySet()) {
                    buVar.a((String) entry.getKey());
                    ((com.umeng.commonsdk.statistics.proto.b) entry.getValue()).write(buVar);
                }
                buVar.e();
                buVar.c();
            }
            if (cVar.b != null && cVar.j()) {
                buVar.a(c.h);
                buVar.a(new bq((byte) 12, cVar.b.size()));
                Iterator it = cVar.b.iterator();
                while (it.hasNext()) {
                    ((com.umeng.commonsdk.statistics.proto.a) it.next()).write(buVar);
                }
                buVar.f();
                buVar.c();
            }
            if (cVar.c != null && cVar.m()) {
                buVar.a(c.i);
                buVar.a(cVar.c);
                buVar.c();
            }
            buVar.d();
            buVar.b();
        }
    }

    /* JADX INFO: compiled from: T578 */
    public class d implements cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0045c b() {
            return new C0045c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: T578 */
    public class C0045c extends cf {
        public C0045c() {
        }

        @Override // com.umeng.analytics.pro.cc
        public void a(bu buVar, c cVar) {
            ca caVar = (ca) buVar;
            caVar.a(cVar.a.size());
            for (Map.Entry entry : cVar.a.entrySet()) {
                caVar.a((String) entry.getKey());
                ((com.umeng.commonsdk.statistics.proto.b) entry.getValue()).write(caVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            caVar.a(bitSet, 2);
            if (cVar.j()) {
                caVar.a(cVar.b.size());
                Iterator it = cVar.b.iterator();
                while (it.hasNext()) {
                    ((com.umeng.commonsdk.statistics.proto.a) it.next()).write(caVar);
                }
            }
            if (cVar.m()) {
                caVar.a(cVar.c);
            }
        }

        @Override // com.umeng.analytics.pro.cc
        public void b(bu buVar, c cVar) {
            ca caVar = (ca) buVar;
            br brVar = new br((byte) 11, (byte) 12, caVar.w());
            cVar.a = new HashMap(brVar.c * 2);
            for (int i = 0; i < brVar.c; i++) {
                String strZ = caVar.z();
                com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                bVar.read(caVar);
                cVar.a.put(strZ, bVar);
            }
            cVar.a(true);
            BitSet bitSetB = caVar.b(2);
            if (bitSetB.get(0)) {
                bq bqVar = new bq((byte) 12, caVar.w());
                cVar.b = new ArrayList(bqVar.b);
                for (int i2 = 0; i2 < bqVar.b; i2++) {
                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                    aVar.read(caVar);
                    cVar.b.add(aVar);
                }
                cVar.b(true);
            }
            if (bitSetB.get(1)) {
                cVar.c = caVar.z();
                cVar.c(true);
            }
        }
    }
}
