package com.umeng.analytics.pro;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.C5368;

/* JADX INFO: compiled from: Y48R */
/* JADX INFO: loaded from: classes.dex */
public abstract class bf implements av {
    public static final Map c;
    public Object a;
    public bc b;

    public abstract bc a(short s);

    public abstract Object a(bu buVar, bp bpVar);

    public abstract Object a(bu buVar, short s);

    public abstract void a(bu buVar);

    public abstract void b(bc bcVar, Object obj);

    public abstract void b(bu buVar);

    public abstract bp c(bc bcVar);

    public abstract bz d();

    public bf() {
        this.b = null;
        this.a = null;
    }

    static {
        HashMap map = new HashMap();
        c = map;
        map.put(ce.class, new b());
        map.put(cf.class, new d());
    }

    public bf(bc bcVar, Object obj) {
        a(bcVar, obj);
    }

    public bf(bf bfVar) {
        if (!bfVar.getClass().equals(getClass())) {
            throw new ClassCastException();
        }
        this.b = bfVar.b;
        this.a = a(bfVar.a);
    }

    public static Object a(Object obj) {
        if (obj instanceof av) {
            return ((av) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return aw.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map) obj) : obj;
    }

    public static Map a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(a(entry.getKey()), a(entry.getValue()));
        }
        return map2;
    }

    public static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public bc a() {
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    public Object a(bc bcVar) {
        if (bcVar != this.b) {
            throw new IllegalArgumentException("Cannot get the value of field " + bcVar + " because union's set field is " + this.b);
        }
        return b();
    }

    public Object a(int i) {
        return a(a((short) i));
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean b(bc bcVar) {
        return this.b == bcVar;
    }

    public boolean b(int i) {
        return b(a((short) i));
    }

    @Override // com.umeng.analytics.pro.av
    public void read(bu buVar) {
        ((cd) c.get(buVar.D())).b().b(buVar, this);
    }

    public void a(bc bcVar, Object obj) {
        b(bcVar, obj);
        this.b = bcVar;
        this.a = obj;
    }

    public void a(int i, Object obj) {
        a(a((short) i), obj);
    }

    @Override // com.umeng.analytics.pro.av
    public void write(bu buVar) {
        ((cd) c.get(buVar.D())).b().a(buVar, this);
    }

    public String toString() {
        StringBuilder sbM15339 = C5368.m15339("<");
        sbM15339.append(getClass().getSimpleName());
        sbM15339.append(" ");
        if (a() != null) {
            Object objB = b();
            sbM15339.append(c(a()).a);
            sbM15339.append(":");
            if (objB instanceof ByteBuffer) {
                aw.a((ByteBuffer) objB, sbM15339);
            } else {
                sbM15339.append(objB.toString());
            }
        }
        sbM15339.append(">");
        return sbM15339.toString();
    }

    @Override // com.umeng.analytics.pro.av
    public final void clear() {
        this.b = null;
        this.a = null;
    }

    /* JADX INFO: compiled from: Y48R */
    public class b implements cd {
        public b() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: Y48R */
    public class a extends ce {
        public a() {
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bu buVar, bf bfVar) {
            bfVar.b = null;
            bfVar.a = null;
            buVar.j();
            bp bpVarL = buVar.l();
            Object objA = bfVar.a(buVar, bpVarL);
            bfVar.a = objA;
            if (objA != null) {
                bfVar.b = bfVar.a(bpVarL.c);
            }
            buVar.m();
            buVar.l();
            buVar.k();
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bu buVar, bf bfVar) throws bv {
            if (bfVar.a() == null || bfVar.b() == null) {
                throw new bv("Cannot write a TUnion with no set value!");
            }
            buVar.a(bfVar.d());
            buVar.a(bfVar.c(bfVar.b));
            bfVar.a(buVar);
            buVar.c();
            buVar.d();
            buVar.b();
        }
    }

    /* JADX INFO: compiled from: Y48R */
    public class d implements cd {
        public d() {
        }

        @Override // com.umeng.analytics.pro.cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: Y48R */
    public class c extends cf {
        public c() {
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bu buVar, bf bfVar) {
            bfVar.b = null;
            bfVar.a = null;
            short sV = buVar.v();
            Object objA = bfVar.a(buVar, sV);
            bfVar.a = objA;
            if (objA != null) {
                bfVar.b = bfVar.a(sV);
            }
        }

        @Override // com.umeng.analytics.pro.cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bu buVar, bf bfVar) throws bv {
            if (bfVar.a() == null || bfVar.b() == null) {
                throw new bv("Cannot write a TUnion with no set value!");
            }
            buVar.a(bfVar.b.a());
            bfVar.b(buVar);
        }
    }
}
