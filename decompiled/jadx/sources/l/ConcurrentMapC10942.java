package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.u0.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentMapC10942 extends AbstractMap implements ConcurrentMap, Serializable, InterfaceC17291 {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final C18350 h;
    public static final long i;
    public static final long j;
    public static final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f77961l;
    public static final long m;
    public static final int n;
    public static final int o;
    public static final ObjectStreamField[] serialPersistentFields;
    public static final long serialVersionUID = 7249069246763182397L;
    public volatile transient C0357[] a;
    public volatile transient C0357[] b;
    public volatile transient long baseCount;
    public volatile transient C20820[] c;
    public volatile transient int cellsBusy;
    public transient C1769 d;
    public transient C20114 e;
    public transient C8825 f;
    public volatile transient int sizeCtl;
    public volatile transient int transferIndex;

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C1063[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C18350 c18350 = C18350.b;
        h = c18350;
        i = c18350.h(ConcurrentMapC10942.class, "sizeCtl");
        j = c18350.h(ConcurrentMapC10942.class, "transferIndex");
        k = c18350.h(ConcurrentMapC10942.class, "baseCount");
        f77961l = c18350.h(ConcurrentMapC10942.class, "cellsBusy");
        m = c18350.h(C20820.class, b.d);
        n = c18350.a(C0357[].class);
        int iB = c18350.b(C0357[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public static final int l(int i2) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final C0357 k(C0357[] c0357Arr, int i2) {
        return (C0357) h.f(c0357Arr, (((long) i2) << o) + ((long) n));
    }

    public static final boolean b(C0357[] c0357Arr, int i2, C0357 c0357) {
        C18350 c18350 = h;
        return AbstractC22791.E(c18350.a, c0357Arr, (((long) i2) << o) + ((long) n), c0357);
    }

    public static final void h(C0357[] c0357Arr, int i2, C0357 c0357) {
        h.j(c0357Arr, (((long) i2) << o) + ((long) n), c0357);
    }

    public ConcurrentMapC10942() {
    }

    public ConcurrentMapC10942(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentMapC10942(int i2, float f) {
        this(i2, f, 1);
    }

    public ConcurrentMapC10942(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((double) ((i2 < i3 ? i3 : i2) / f)) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int length;
        C0357 c0357K;
        Object obj2;
        int i2 = i(obj.hashCode());
        C0357[] c0357Arr = this.a;
        if (c0357Arr == null || (length = c0357Arr.length) <= 0 || (c0357K = k(c0357Arr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = c0357K.a;
        if (i3 == i2) {
            Object obj3 = c0357K.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return c0357K.c;
            }
        } else if (i3 < 0) {
            C0357 c0357A = c0357K.a(i2, obj);
            if (c0357A != null) {
                return c0357A.c;
            }
            return null;
        }
        while (true) {
            c0357K = c0357K.d;
            if (c0357K == null) {
                return null;
            }
            if (c0357K.a == i2 && ((obj2 = c0357K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c0357K.c;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        C0357[] c0357Arr = this.a;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 c0357A = c15173.a();
                if (c0357A == null) {
                    break;
                }
                Object obj2 = c0357A.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return f(obj, obj2, false);
    }

    public final Object f(Object obj, Object obj2, boolean z) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        C0357[] c0357ArrE = this.a;
        int i3 = 0;
        while (true) {
            if (c0357ArrE != null) {
                int length = c0357ArrE.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    C0357 c0357K = k(c0357ArrE, i4);
                    if (c0357K == null) {
                        if (b(c0357ArrE, i4, new C0357(i2, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i5 = c0357K.a;
                        if (i5 == -1) {
                            c0357ArrE = d(c0357ArrE, c0357K);
                        } else {
                            if (z && i5 == i2 && (((obj5 = c0357K.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = c0357K.c) != null)) {
                                return obj6;
                            }
                            synchronized (c0357K) {
                                if (k(c0357ArrE, i4) != c0357K) {
                                    obj3 = null;
                                } else if (i5 >= 0) {
                                    i3 = 1;
                                    while (true) {
                                        if (c0357K.a == i2 && ((obj4 = c0357K.b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                            obj3 = c0357K.c;
                                            if (!z) {
                                                c0357K.c = obj2;
                                            }
                                        } else {
                                            C0357 c0357 = c0357K.d;
                                            if (c0357 == null) {
                                                c0357K.d = new C0357(i2, obj, obj2);
                                                obj3 = null;
                                            } else {
                                                i3++;
                                                c0357K = c0357;
                                            }
                                        }
                                    }
                                } else if (c0357K instanceof C21525) {
                                    C22230 c22230E = ((C21525) c0357K).e(i2, obj, obj2);
                                    if (c22230E != null) {
                                        Object obj7 = c22230E.c;
                                        if (!z) {
                                            c22230E.c = obj2;
                                        }
                                        obj3 = obj7;
                                    } else {
                                        obj3 = null;
                                    }
                                    i3 = 2;
                                } else {
                                    if (c0357K instanceof C5297) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    obj3 = null;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(c0357ArrE, i4);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    }
                }
            }
            c0357ArrE = e();
        }
        a(1L, i3);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        o(map.size());
        for (Map.Entry entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return g(obj, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ad A[PHI: r8
      0x00ad: PHI (r8v3 boolean) = 
      (r8v1 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
     binds: [B:64:0x00ac, B:45:0x0074, B:47:0x007a, B:51:0x0082, B:53:0x0088, B:40:0x0067, B:30:0x0049, B:32:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        C0357 c0357K;
        boolean z;
        Object obj4;
        C22230 c22230B;
        Object obj5;
        int i3 = i(obj.hashCode());
        C0357[] c0357ArrD = this.a;
        while (c0357ArrD != null && (length = c0357ArrD.length) != 0 && (c0357K = k(c0357ArrD, (i2 = (length - 1) & i3))) != null) {
            int i4 = c0357K.a;
            if (i4 == -1) {
                c0357ArrD = d(c0357ArrD, c0357K);
            } else {
                synchronized (c0357K) {
                    if (k(c0357ArrD, i2) == c0357K) {
                        z = true;
                        if (i4 >= 0) {
                            C0357 c0357 = null;
                            while (true) {
                                if (c0357K.a == i3 && ((obj5 = c0357K.b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                    obj4 = c0357K.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            c0357K.c = obj2;
                                        } else if (c0357 != null) {
                                            c0357.d = c0357K.d;
                                        } else {
                                            h(c0357ArrD, i2, c0357K.d);
                                        }
                                    }
                                } else {
                                    C0357 c0358 = c0357K.d;
                                    if (c0358 != null) {
                                        c0357 = c0357K;
                                        c0357K = c0358;
                                    }
                                }
                                obj4 = null;
                            }
                        } else if (c0357K instanceof C21525) {
                            C21525 c21525 = (C21525) c0357K;
                            C22230 c22230 = c21525.e;
                            if (c22230 == null || (c22230B = c22230.b(i3, obj, null)) == null) {
                                obj4 = null;
                            } else {
                                obj4 = c22230B.c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    c22230B.c = obj2;
                                } else if (c21525.f(c22230B)) {
                                    h(c0357ArrD, i2, p(c21525.f));
                                }
                            }
                        } else {
                            if (c0357K instanceof C5297) {
                                throw new IllegalStateException("Recursive update");
                            }
                            z = false;
                            obj4 = null;
                        }
                    } else {
                        z = false;
                        obj4 = null;
                    }
                }
                if (z) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        long j2;
        C0357 c0357K;
        C0357[] c0357ArrD = this.a;
        long j3 = 0;
        loop0: while (true) {
            j2 = j3;
            int i2 = 0;
            while (true) {
                if (c0357ArrD == null || i2 >= c0357ArrD.length) {
                    break loop0;
                }
                c0357K = k(c0357ArrD, i2);
                if (c0357K == null) {
                    i2++;
                } else {
                    int i3 = c0357K.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (c0357K) {
                        if (k(c0357ArrD, i2) == c0357K) {
                            if (i3 < 0) {
                                c0357K = c0357K instanceof C21525 ? ((C21525) c0357K).f : null;
                            }
                            while (c0357K != null) {
                                j2--;
                                c0357K = c0357K.d;
                            }
                            h(c0357ArrD, i2, null);
                            i2++;
                        }
                    }
                }
            }
            c0357ArrD = d(c0357ArrD, c0357K);
            j3 = j2;
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C1769 c1769 = this.d;
        if (c1769 != null) {
            return c1769;
        }
        C1769 c17610 = new C1769(this, null);
        this.d = c17610;
        return c17610;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        C20114 c20114 = this.e;
        if (c20114 != null) {
            return c20114;
        }
        C20114 c20115 = new C20114(this);
        this.e = c20115;
        return c20115;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        C8825 c8825 = this.f;
        if (c8825 != null) {
            return c8825;
        }
        C8825 c8826 = new C8825(this);
        this.f = c8826;
        return c8826;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        C0357[] c0357Arr = this.a;
        int iHashCode = 0;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 c0357A = c15173.a();
                if (c0357A == null) {
                    break;
                }
                iHashCode += c0357A.c.hashCode() ^ c0357A.b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C0357[] c0357Arr = this.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        C15173 c15173 = new C15173(c0357Arr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C0357 c0357A = c15173.a();
        if (c0357A != null) {
            while (true) {
                Object obj = c0357A.b;
                Object obj2 = c0357A.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append(a.h);
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                c0357A = c15173.a();
                if (c0357A == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C0357[] c0357Arr = this.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        C15173 c15173 = new C15173(c0357Arr, length, 0, length);
        while (true) {
            C0357 c0357A = c15173.a();
            if (c0357A != null) {
                Object obj3 = c0357A.c;
                Object obj4 = map.get(c0357A.b);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    break;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        C1063[] c1063Arr = new C1063[16];
        for (int i6 = 0; i6 < 16; i6++) {
            c1063Arr[i6] = new C1063();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", c1063Arr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        C0357[] c0357Arr = this.a;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 c0357A = c15173.a();
                if (c0357A == null) {
                    break;
                }
                objectOutputStream.writeObject(c0357A.b);
                objectOutputStream.writeObject(c0357A.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j2;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        C0357 c0357 = null;
        long j4 = 0;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j4++;
            c0357 = new C0357(i(object.hashCode()), object, object2, c0357);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) (((double) (j4 / 0.75f)) + 1.0d);
        int iL = j5 >= 1073741824 ? 1073741824 : l((int) j5);
        C0357[] c0357Arr = new C0357[iL];
        int i2 = iL - 1;
        while (c0357 != null) {
            C0357 c0358 = c0357.d;
            int i3 = c0357.a;
            int i4 = i3 & i2;
            C0357 c0357K = k(c0357Arr, i4);
            if (c0357K == null) {
                z = true;
            } else {
                Object obj2 = c0357.b;
                if (c0357K.a >= 0) {
                    int i5 = 0;
                    C0357 c0359 = c0357K;
                    while (true) {
                        if (c0359 == null) {
                            z = true;
                            break;
                        }
                        if (c0359.a == i3 && ((obj = c0359.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i5++;
                            c0359 = c0359.d;
                        }
                    }
                    if (z && i5 >= 8) {
                        long j6 = j3 + 1;
                        c0357.d = c0357K;
                        C22230 c22230 = null;
                        C22230 c22231 = null;
                        C0357 c03510 = c0357;
                        while (c03510 != null) {
                            long j7 = j6;
                            C22230 c22232 = new C22230(c03510.a, c03510.b, c03510.c, null, null);
                            c22232.h = c22231;
                            if (c22231 == null) {
                                c22230 = c22232;
                            } else {
                                c22231.d = c22232;
                            }
                            c03510 = c03510.d;
                            c22231 = c22232;
                            j6 = j7;
                        }
                        h(c0357Arr, i4, new C21525(c22230));
                        j3 = j6;
                    }
                } else if (((C21525) c0357K).e(i3, obj2, c0357.c) == null) {
                    j3 += j2;
                }
                z = false;
            }
            j2 = 1;
            if (z) {
                j3++;
                c0357.d = c0357K;
                h(c0357Arr, i4, c0357);
            }
            c0357 = c0358;
        }
        this.a = c0357Arr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public Object putIfAbsent(Object obj, Object obj2) {
        return f(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C0357[] c0357Arr = this.a;
        if (c0357Arr == null) {
            return;
        }
        C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
        while (true) {
            C0357 c0357A = c15173.a();
            if (c0357A == null) {
                return;
            } else {
                biConsumer.accept(c0357A.b, c0357A.c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C0357[] c0357Arr = this.a;
        if (c0357Arr == null) {
            return;
        }
        C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
        while (true) {
            C0357 c0357A = c15173.a();
            if (c0357A == null) {
                return;
            }
            Object obj = c0357A.c;
            Object obj2 = c0357A.b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0050 */
    /* JADX WARN: Code duplicated, block: B:84:0x00df A[EDGE_INSN: B:84:0x00df->B:85:0x00e0 BREAK  A[LOOP:1: B:49:0x007b->B:66:0x00ac], PHI: r4 r5
      0x00df: PHI (r4v7 int) = (r4v1 int), (r4v1 int), (r4v17 int), (r4v17 int) binds: [B:46:0x0076, B:81:0x00d6, B:60:0x0096, B:56:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r5v10 java.lang.Object) = (r5v1 java.lang.Object), (r5v1 java.lang.Object), (r5v16 java.lang.Object), (r5v18 java.lang.Object) binds: [B:46:0x0076, B:81:0x00d6, B:60:0x0096, B:56:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objApply;
        C22230 c22230B;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null || function == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        C0357[] c0357ArrE = this.a;
        Object objApply2 = null;
        int i3 = 0;
        while (true) {
            if (c0357ArrE != null) {
                int length = c0357ArrE.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    C0357 c0357K = k(c0357ArrE, i4);
                    boolean z = true;
                    if (c0357K == null) {
                        C5297 c5297 = new C5297();
                        synchronized (c5297) {
                            if (b(c0357ArrE, i4, c5297)) {
                                try {
                                    Object objApply3 = function.apply(obj);
                                    h(c0357ArrE, i4, objApply3 != null ? new C0357(i2, obj, objApply3) : null);
                                    objApply2 = objApply3;
                                    i3 = 1;
                                } catch (Throwable th) {
                                    h(c0357ArrE, i4, null);
                                    throw th;
                                }
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i5 = c0357K.a;
                        if (i5 == -1) {
                            c0357ArrE = d(c0357ArrE, c0357K);
                        } else {
                            if (i5 == i2 && (((obj3 = c0357K.b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = c0357K.c) != null)) {
                                return obj4;
                            }
                            synchronized (c0357K) {
                                if (k(c0357ArrE, i4) != c0357K) {
                                    z = false;
                                    break;
                                }
                                if (i5 >= 0) {
                                    i3 = 1;
                                    while (true) {
                                        if (c0357K.a == i2 && ((obj2 = c0357K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            objApply2 = c0357K.c;
                                            z = false;
                                            break;
                                        }
                                        C0357 c0357 = c0357K.d;
                                        if (c0357 == null) {
                                            objApply2 = function.apply(obj);
                                            if (objApply2 == null) {
                                                z = false;
                                                break;
                                            }
                                            if (c0357K.d != null) {
                                                throw new IllegalStateException("Recursive update");
                                            }
                                            c0357K.d = new C0357(i2, obj, objApply2);
                                            break;
                                        }
                                        i3++;
                                        c0357K = c0357;
                                    }
                                } else if (c0357K instanceof C21525) {
                                    C21525 c21525 = (C21525) c0357K;
                                    C22230 c22230 = c21525.e;
                                    if (c22230 != null && (c22230B = c22230.b(i2, obj, null)) != null) {
                                        objApply = c22230B.c;
                                    } else {
                                        objApply = function.apply(obj);
                                        if (objApply != null) {
                                            c21525.e(i2, obj, objApply);
                                        }
                                        objApply2 = objApply;
                                        i3 = 2;
                                    }
                                    z = false;
                                    objApply2 = objApply;
                                    i3 = 2;
                                } else {
                                    if (!(c0357K instanceof C5297)) {
                                        z = false;
                                        break;
                                    }
                                    throw new IllegalStateException("Recursive update");
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(c0357ArrE, i4);
                                }
                                if (z) {
                                    break;
                                }
                                return objApply2;
                            }
                        }
                    }
                }
            }
            c0357ArrE = e();
        }
        if (objApply2 != null) {
            a(1L, i3);
        }
        return objApply2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C22230 c22230B;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        C0357[] c0357ArrE = this.a;
        Object objApply = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (c0357ArrE != null) {
                int length = c0357ArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    C0357 c0357K = k(c0357ArrE, i5);
                    if (c0357K == null) {
                        break;
                    }
                    int i6 = c0357K.a;
                    if (i6 == -1) {
                        c0357ArrE = d(c0357ArrE, c0357K);
                    } else {
                        synchronized (c0357K) {
                            if (k(c0357ArrE, i5) == c0357K) {
                                if (i6 >= 0) {
                                    i4 = 1;
                                    C0357 c0357 = null;
                                    while (true) {
                                        if (c0357K.a == i2 && ((obj2 = c0357K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            objApply = biFunction.apply(obj, c0357K.c);
                                            if (objApply != null) {
                                                c0357K.c = objApply;
                                                break;
                                            }
                                            C0357 c0358 = c0357K.d;
                                            if (c0357 != null) {
                                                c0357.d = c0358;
                                            } else {
                                                h(c0357ArrE, i5, c0358);
                                            }
                                            i3 = -1;
                                            break;
                                        }
                                        C0357 c0359 = c0357K.d;
                                        if (c0359 == null) {
                                            break;
                                        }
                                        i4++;
                                        c0357 = c0357K;
                                        c0357K = c0359;
                                    }
                                } else if (c0357K instanceof C21525) {
                                    C21525 c21525 = (C21525) c0357K;
                                    C22230 c22230 = c21525.e;
                                    if (c22230 != null && (c22230B = c22230.b(i2, obj, null)) != null) {
                                        objApply = biFunction.apply(obj, c22230B.c);
                                        if (objApply != null) {
                                            c22230B.c = objApply;
                                        } else {
                                            if (c21525.f(c22230B)) {
                                                h(c0357ArrE, i5, p(c21525.f));
                                            }
                                            i3 = -1;
                                        }
                                    }
                                    i4 = 2;
                                } else if (c0357K instanceof C5297) {
                                    throw new IllegalStateException("Recursive update");
                                }
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    }
                }
            }
            c0357ArrE = e();
        }
        if (i3 != 0) {
            a(i3, i4);
        }
        return objApply;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        int i2;
        C0357 c0357;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        C0357[] c0357ArrE = this.a;
        Object objApply = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (c0357ArrE != null) {
                int length = c0357ArrE.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    C0357 c0357K = k(c0357ArrE, i6);
                    if (c0357K == null) {
                        C5297 c5297 = new C5297();
                        synchronized (c5297) {
                            if (b(c0357ArrE, i6, c5297)) {
                                try {
                                    Object objApply2 = biFunction.apply(obj, null);
                                    if (objApply2 != null) {
                                        c0357 = new C0357(i3, obj, objApply2);
                                        i2 = 1;
                                    } else {
                                        i2 = i5;
                                        c0357 = null;
                                    }
                                    h(c0357ArrE, i6, c0357);
                                    i5 = i2;
                                    objApply = objApply2;
                                    i4 = 1;
                                } catch (Throwable th) {
                                    h(c0357ArrE, i6, null);
                                    throw th;
                                }
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    } else {
                        int i7 = c0357K.a;
                        if (i7 == -1) {
                            c0357ArrE = d(c0357ArrE, c0357K);
                        } else {
                            synchronized (c0357K) {
                                if (k(c0357ArrE, i6) == c0357K) {
                                    if (i7 >= 0) {
                                        i4 = 1;
                                        C0357 c0358 = null;
                                        while (true) {
                                            if (c0357K.a == i3 && ((obj2 = c0357K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                Object objApply3 = biFunction.apply(obj, c0357K.c);
                                                if (objApply3 != null) {
                                                    c0357K.c = objApply3;
                                                } else {
                                                    C0357 c0359 = c0357K.d;
                                                    if (c0358 != null) {
                                                        c0358.d = c0359;
                                                    } else {
                                                        h(c0357ArrE, i6, c0359);
                                                    }
                                                    i5 = -1;
                                                }
                                                objApply = objApply3;
                                                break;
                                            }
                                            C0357 c03510 = c0357K.d;
                                            if (c03510 == null) {
                                                objApply = biFunction.apply(obj, null);
                                                if (objApply == null) {
                                                    break;
                                                }
                                                if (c0357K.d != null) {
                                                    throw new IllegalStateException("Recursive update");
                                                }
                                                c0357K.d = new C0357(i3, obj, objApply);
                                                i5 = 1;
                                                break;
                                            }
                                            i4++;
                                            C0357 c03511 = c0357K;
                                            c0357K = c03510;
                                            c0358 = c03511;
                                        }
                                    } else if (c0357K instanceof C21525) {
                                        C21525 c21525 = (C21525) c0357K;
                                        C22230 c22230 = c21525.e;
                                        C22230 c22230B = c22230 != null ? c22230.b(i3, obj, null) : null;
                                        objApply = biFunction.apply(obj, c22230B == null ? null : c22230B.c);
                                        if (objApply != null) {
                                            if (c22230B != null) {
                                                c22230B.c = objApply;
                                            } else {
                                                c21525.e(i3, obj, objApply);
                                                i5 = 1;
                                            }
                                        } else if (c22230B != null) {
                                            if (c21525.f(c22230B)) {
                                                h(c0357ArrE, i6, p(c21525.f));
                                            }
                                            i5 = -1;
                                        }
                                        i4 = 1;
                                    } else if (c0357K instanceof C5297) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i4 != 0) {
                                if (i4 < 8) {
                                    break;
                                }
                                n(c0357ArrE, i6);
                                break;
                            }
                        }
                    }
                }
            }
            c0357ArrE = e();
        }
        if (i5 != 0) {
            a(i5, i4);
        }
        return objApply;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i2;
        Object obj3;
        if (obj == null || obj2 == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        C0357[] c0357ArrE = this.a;
        Object objApply = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (c0357ArrE != null) {
                int length = c0357ArrE.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    C0357 c0357K = k(c0357ArrE, i6);
                    i2 = 1;
                    if (c0357K == null) {
                        if (b(c0357ArrE, i6, new C0357(i3, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i7 = c0357K.a;
                        if (i7 == -1) {
                            c0357ArrE = d(c0357ArrE, c0357K);
                        } else {
                            synchronized (c0357K) {
                                if (k(c0357ArrE, i6) == c0357K) {
                                    if (i7 >= 0) {
                                        i4 = 1;
                                        C0357 c0357 = null;
                                        while (true) {
                                            if (c0357K.a == i3 && ((obj3 = c0357K.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                Object objApply2 = biFunction.apply(c0357K.c, obj2);
                                                if (objApply2 != null) {
                                                    c0357K.c = objApply2;
                                                } else {
                                                    C0357 c0358 = c0357K.d;
                                                    if (c0357 != null) {
                                                        c0357.d = c0358;
                                                    } else {
                                                        h(c0357ArrE, i6, c0358);
                                                    }
                                                    i5 = -1;
                                                }
                                                objApply = objApply2;
                                                break;
                                            }
                                            C0357 c0359 = c0357K.d;
                                            if (c0359 == null) {
                                                c0357K.d = new C0357(i3, obj, obj2);
                                                i5 = 1;
                                                objApply = obj2;
                                                break;
                                            }
                                            i4++;
                                            C0357 c03510 = c0357K;
                                            c0357K = c0359;
                                            c0357 = c03510;
                                        }
                                    } else if (c0357K instanceof C21525) {
                                        C21525 c21525 = (C21525) c0357K;
                                        C22230 c22230 = c21525.e;
                                        C22230 c22230B = c22230 == null ? null : c22230.b(i3, obj, null);
                                        objApply = c22230B == null ? obj2 : biFunction.apply(c22230B.c, obj2);
                                        if (objApply != null) {
                                            if (c22230B != null) {
                                                c22230B.c = objApply;
                                            } else {
                                                c21525.e(i3, obj, objApply);
                                                i5 = 1;
                                            }
                                        } else if (c22230B != null) {
                                            if (c21525.f(c22230B)) {
                                                h(c0357ArrE, i6, p(c21525.f));
                                            }
                                            i5 = -1;
                                        }
                                        i4 = 2;
                                    } else if (c0357K instanceof C5297) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(c0357ArrE, i6);
                                }
                                i2 = i5;
                                obj2 = objApply;
                                break;
                            }
                        }
                    }
                }
            }
            c0357ArrE = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj2;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public static C1769 newKeySet() {
        return new C1769(new ConcurrentMapC10942(), Boolean.TRUE);
    }

    public final C0357[] e() {
        while (true) {
            C0357[] c0357Arr = this.a;
            if (c0357Arr != null && c0357Arr.length != 0) {
                return c0357Arr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i2, -1)) {
                try {
                    C0357[] c0357Arr2 = this.a;
                    if (c0357Arr2 == null || c0357Arr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        C0357[] c0357Arr3 = new C0357[i3];
                        this.a = c0357Arr3;
                        i2 = i3 - (i3 >>> 2);
                        c0357Arr2 = c0357Arr3;
                    }
                    return c0357Arr2;
                } finally {
                    this.sizeCtl = i2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x014f A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #2 {all -> 0x0163, blocks: (B:94:0x014b, B:96:0x014f), top: B:129:0x014b }] */
    public final void a(long j2, int i2) {
        boolean zD;
        C4591 c4591;
        int i3;
        int i4;
        ConcurrentMapC10942 concurrentMapC10942;
        boolean z;
        ConcurrentMapC10942 concurrentMapC10943;
        int i5;
        C20820[] c20820Arr;
        boolean z2;
        C18350 c18350;
        long j3;
        long j4;
        boolean z3;
        int length;
        boolean z4;
        int length2;
        int length3;
        C20820 c20820;
        long j5;
        C0357[] c0357Arr;
        int length4;
        C0357[] c0357Arr2;
        C20820[] c20820Arr2 = this.c;
        if (c20820Arr2 != null) {
            if (c20820Arr2 != null) {
                zD = true;
            } else {
                zD = true;
            }
            c4591 = C14468.f;
            i3 = ((C14468) c4591.get()).b;
            if (i3 == 0) {
                C14468.d();
                i3 = ((C14468) c4591.get()).b;
                zD = true;
            }
            i4 = 0;
            concurrentMapC10942 = this;
            while (true) {
                z = false;
                int i6 = i3;
                concurrentMapC10943 = concurrentMapC10942;
                i5 = i6;
                while (true) {
                    c20820Arr = concurrentMapC10943.c;
                    if (c20820Arr == null) {
                    }
                    z2 = z;
                    if (concurrentMapC10943.cellsBusy != 0) {
                        c18350 = h;
                        j3 = k;
                        j4 = concurrentMapC10943.baseCount;
                        if (c18350.d(concurrentMapC10943, j3, j4, j4 + j2)) {
                            return;
                        }
                    } else {
                        c18350 = h;
                        j3 = k;
                        j4 = concurrentMapC10943.baseCount;
                        if (c18350.d(concurrentMapC10943, j3, j4, j4 + j2)) {
                            return;
                        }
                    }
                    z = z2;
                    concurrentMapC10943 = this;
                    i4 = 0;
                }
                if (concurrentMapC10943.c == c20820Arr) {
                    concurrentMapC10943.c = (C20820[]) Arrays.copyOf(c20820Arr, length << 1);
                }
                i4 = 0;
                concurrentMapC10943.cellsBusy = 0;
                ConcurrentMapC10942 concurrentMapC10944 = concurrentMapC10943;
                i3 = i5;
                concurrentMapC10942 = concurrentMapC10944;
            }
        } else {
            C18350 c18351 = h;
            long j6 = k;
            long j7 = this.baseCount;
            j5 = j7 + j2;
            if (!c18351.d(this, j6, j7, j5)) {
                if (c20820Arr2 != null || (length3 = c20820Arr2.length - 1) < 0 || (c20820 = c20820Arr2[length3 & ((C14468) C14468.f.get()).b]) == null) {
                    zD = true;
                } else {
                    C18350 c18352 = h;
                    long j8 = m;
                    long j9 = c20820.value;
                    zD = c18352.d(c20820, j8, j9, j9 + j2);
                    if (zD) {
                        if (i2 <= 1) {
                            return;
                        } else {
                            j5 = j();
                        }
                    }
                }
                c4591 = C14468.f;
                i3 = ((C14468) c4591.get()).b;
                if (i3 == 0) {
                    C14468.d();
                    i3 = ((C14468) c4591.get()).b;
                    zD = true;
                }
                i4 = 0;
                concurrentMapC10942 = this;
                while (true) {
                    z = false;
                    int i7 = i3;
                    concurrentMapC10943 = concurrentMapC10942;
                    i5 = i7;
                    while (true) {
                        c20820Arr = concurrentMapC10943.c;
                        if (c20820Arr == null && (length = c20820Arr.length) > 0) {
                            C20820 c20821 = c20820Arr[(length - 1) & i5];
                            if (c20821 != null) {
                                if (zD) {
                                    C18350 c18353 = h;
                                    long j10 = m;
                                    boolean z5 = z;
                                    long j11 = c20821.value;
                                    if (c18353.d(c20821, j10, j11, j11 + j2)) {
                                        return;
                                    }
                                    if (concurrentMapC10943.c == c20820Arr && length < g) {
                                        if (z5) {
                                            if (concurrentMapC10943.cellsBusy == 0) {
                                                if (c18353.c(concurrentMapC10943, f77961l, 0, 1)) {
                                                    break;
                                                }
                                            }
                                            z = z5;
                                        } else {
                                            z = true;
                                        }
                                    }
                                } else {
                                    zD = true;
                                }
                                int i8 = i5 ^ (i5 << 13);
                                int i9 = i8 ^ (i8 >>> 17);
                                i5 = i9 ^ (i9 << 5);
                                ((C14468) C14468.f.get()).b = i5;
                                z2 = z;
                                z = z2;
                                concurrentMapC10943 = this;
                                i4 = 0;
                            } else if (concurrentMapC10943.cellsBusy == 0) {
                                C20820 c20822 = new C20820(j2);
                                if (concurrentMapC10943.cellsBusy == 0) {
                                    if (h.c(concurrentMapC10943, f77961l, 0, 1)) {
                                        try {
                                            C20820[] c20820Arr3 = concurrentMapC10943.c;
                                            if (c20820Arr3 == null || (length2 = c20820Arr3.length) <= 0) {
                                                z4 = false;
                                            } else {
                                                int i10 = (length2 - 1) & i5;
                                                if (c20820Arr3[i10] == null) {
                                                    c20820Arr3[i10] = c20822;
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            }
                                            concurrentMapC10943.cellsBusy = i4;
                                            if (z4) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            concurrentMapC10943.cellsBusy = i4;
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = false;
                            int i11 = i5 ^ (i5 << 13);
                            int i12 = i11 ^ (i11 >>> 17);
                            i5 = i12 ^ (i12 << 5);
                            ((C14468) C14468.f.get()).b = i5;
                            z2 = z;
                            z = z2;
                            concurrentMapC10943 = this;
                            i4 = 0;
                        } else {
                            z2 = z;
                            if (concurrentMapC10943.cellsBusy != 0 && concurrentMapC10943.c == c20820Arr) {
                                if (h.c(concurrentMapC10943, f77961l, 0, 1)) {
                                    try {
                                        if (concurrentMapC10943.c == c20820Arr) {
                                            C20820[] c20820Arr4 = new C20820[2];
                                            c20820Arr4[i5 & 1] = new C20820(j2);
                                            concurrentMapC10943.c = c20820Arr4;
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        concurrentMapC10943.cellsBusy = 0;
                                        if (z3) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        concurrentMapC10943.cellsBusy = 0;
                                        throw th2;
                                    }
                                } else {
                                    c18350 = h;
                                    j3 = k;
                                    j4 = concurrentMapC10943.baseCount;
                                    if (c18350.d(concurrentMapC10943, j3, j4, j4 + j2)) {
                                        return;
                                    }
                                }
                            } else {
                                c18350 = h;
                                j3 = k;
                                j4 = concurrentMapC10943.baseCount;
                                if (c18350.d(concurrentMapC10943, j3, j4, j4 + j2)) {
                                    return;
                                }
                            }
                            z = z2;
                            concurrentMapC10943 = this;
                            i4 = 0;
                        }
                    }
                    try {
                        if (concurrentMapC10943.c == c20820Arr) {
                            concurrentMapC10943.c = (C20820[]) Arrays.copyOf(c20820Arr, length << 1);
                        }
                        i4 = 0;
                        concurrentMapC10943.cellsBusy = 0;
                        ConcurrentMapC10942 concurrentMapC10945 = concurrentMapC10943;
                        i3 = i5;
                        concurrentMapC10942 = concurrentMapC10945;
                    } catch (Throwable th3) {
                        concurrentMapC10943.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        }
        if (i2 < 0) {
            return;
        }
        while (true) {
            int i13 = this.sizeCtl;
            if (j5 < i13 || (c0357Arr = this.a) == null || (length4 = c0357Arr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i13 < 0) {
                if ((i13 >>> 16) != iNumberOfLeadingZeros || i13 == iNumberOfLeadingZeros + 1 || i13 == iNumberOfLeadingZeros + 65535 || (c0357Arr2 = this.b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (h.c(this, i, i13, i13 + 1)) {
                    m(c0357Arr, c0357Arr2);
                }
            } else if (h.c(this, i, i13, (iNumberOfLeadingZeros << 16) + 2)) {
                m(c0357Arr, null);
            }
            j5 = j();
        }
    }

    public final C0357[] d(C0357[] c0357Arr, C0357 c0357) {
        int i2;
        if (c0357 instanceof C2475) {
            C0357[] c0357Arr2 = ((C2475) c0357).e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(c0357Arr.length) | 32768;
            while (c0357Arr2 == this.b && this.a == c0357Arr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (h.c(this, i, i2, i2 + 1)) {
                    m(c0357Arr, c0357Arr2);
                    break;
                }
            }
            return c0357Arr2;
        }
        return this.a;
    }

    public final void o(int i2) {
        int length;
        int iL = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            C0357[] c0357Arr = this.a;
            if (c0357Arr == null || (length = c0357Arr.length) == 0) {
                int i4 = i3 > iL ? i3 : iL;
                if (h.c(this, i, i3, -1)) {
                    try {
                        if (this.a == c0357Arr) {
                            this.a = new C0357[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                        this.sizeCtl = i3;
                    } catch (Throwable th) {
                        this.sizeCtl = i3;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i3 || length >= 1073741824) {
                    return;
                }
                if (c0357Arr == this.a) {
                    if (h.c(this, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(c0357Arr, null);
                    }
                }
            }
        }
    }

    public final void m(C0357[] c0357Arr, C0357[] c0357Arr2) {
        C0357[] c0357Arr3;
        int i2;
        int i3;
        int i4;
        int i5;
        C0357 c21525;
        C0357 c21526;
        C0357 c0357;
        boolean zB;
        ConcurrentMapC10942 concurrentMapC10942 = this;
        C0357[] c0357Arr4 = c0357Arr;
        int length = c0357Arr4.length;
        int i6 = g;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        int i8 = i7 < 16 ? 16 : i7;
        if (c0357Arr2 == null) {
            try {
                C0357[] c0357Arr5 = new C0357[length << 1];
                concurrentMapC10942.b = c0357Arr5;
                concurrentMapC10942.transferIndex = length;
                c0357Arr3 = c0357Arr5;
            } catch (Throwable unused) {
                concurrentMapC10942.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c0357Arr3 = c0357Arr2;
        }
        int length2 = c0357Arr3.length;
        C2475 c2475 = new C2475(c0357Arr3);
        int i9 = 0;
        int i10 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                i9--;
                if (i9 < i10 && !z2) {
                    int i11 = concurrentMapC10942.transferIndex;
                    if (i11 <= 0) {
                        i9 = -1;
                    } else {
                        C18350 c18350 = h;
                        long j2 = j;
                        int i12 = i11 > i8 ? i11 - i8 : 0;
                        if (c18350.c(this, j2, i11, i12)) {
                            i9 = i11 - 1;
                            i10 = i12;
                        }
                    }
                }
                z = false;
            } else {
                C22230 c22230 = null;
                C0357 c0358 = null;
                if (i9 < 0 || i9 >= length || (i5 = i9 + length) >= length2) {
                    i2 = i8;
                    i3 = length2;
                    i4 = i10;
                    if (z2) {
                        this.b = null;
                        this.a = c0357Arr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentMapC10942 = this;
                    C18350 c18351 = h;
                    long j3 = i;
                    int i13 = concurrentMapC10942.sizeCtl;
                    if (c18351.c(this, j3, i13, i13 - 1)) {
                        if (i13 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i9 = length;
                        z = true;
                        z2 = true;
                    }
                } else {
                    C0357 c0357K = k(c0357Arr4, i9);
                    if (c0357K == null) {
                        zB = b(c0357Arr4, i9, c2475);
                    } else {
                        int i14 = c0357K.a;
                        if (i14 == -1) {
                            zB = true;
                        } else {
                            synchronized (c0357K) {
                                if (k(c0357Arr4, i9) == c0357K) {
                                    if (i14 >= 0) {
                                        int i15 = i14 & length;
                                        C0357 c0359 = c0357K;
                                        for (C0357 c03510 = c0357K.d; c03510 != null; c03510 = c03510.d) {
                                            int i16 = c03510.a & length;
                                            if (i16 != i15) {
                                                c0359 = c03510;
                                                i15 = i16;
                                            }
                                        }
                                        if (i15 == 0) {
                                            c0357 = null;
                                            c0358 = c0359;
                                        } else {
                                            c0357 = c0359;
                                        }
                                        while (c0357K != c0359) {
                                            int i17 = c0357K.a;
                                            Object obj = c0357K.b;
                                            C0357 c03511 = c0359;
                                            Object obj2 = c0357K.c;
                                            if ((i17 & length) == 0) {
                                                c0358 = new C0357(i17, obj, obj2, c0358);
                                            } else {
                                                c0357 = new C0357(i17, obj, obj2, c0357);
                                            }
                                            c0357K = c0357K.d;
                                            c0359 = c03511;
                                            i8 = i8;
                                        }
                                        i2 = i8;
                                        h(c0357Arr3, i9, c0358);
                                        h(c0357Arr3, i5, c0357);
                                        h(c0357Arr4, i9, c2475);
                                        i3 = length2;
                                        i4 = i10;
                                    } else {
                                        i2 = i8;
                                        if (c0357K instanceof C21525) {
                                            C21525 c21527 = (C21525) c0357K;
                                            C0357 c03512 = c21527.f;
                                            C22230 c22231 = null;
                                            C22230 c22232 = null;
                                            C22230 c22233 = null;
                                            int i18 = 0;
                                            int i19 = 0;
                                            while (c03512 != null) {
                                                int i20 = length2;
                                                int i21 = c03512.a;
                                                int i22 = i10;
                                                C22230 c22234 = new C22230(i21, c03512.b, c03512.c, null, null);
                                                if ((i21 & length) == 0) {
                                                    c22234.h = c22233;
                                                    if (c22233 == null) {
                                                        c22230 = c22234;
                                                    } else {
                                                        c22233.d = c22234;
                                                    }
                                                    i19++;
                                                    c22233 = c22234;
                                                } else {
                                                    c22234.h = c22232;
                                                    if (c22232 == null) {
                                                        c22231 = c22234;
                                                    } else {
                                                        c22232.d = c22234;
                                                    }
                                                    i18++;
                                                    c22232 = c22234;
                                                }
                                                c03512 = c03512.d;
                                                length2 = i20;
                                                i10 = i22;
                                            }
                                            i3 = length2;
                                            i4 = i10;
                                            if (i19 <= 6) {
                                                c21525 = p(c22230);
                                            } else {
                                                c21525 = i18 != 0 ? new C21525(c22230) : c21527;
                                            }
                                            if (i18 <= 6) {
                                                c21526 = p(c22231);
                                            } else {
                                                c21526 = i19 != 0 ? new C21525(c22231) : c21527;
                                            }
                                            h(c0357Arr3, i9, c21525);
                                            h(c0357Arr3, i5, c21526);
                                            c0357Arr4 = c0357Arr;
                                            h(c0357Arr4, i9, c2475);
                                        }
                                    }
                                    z = true;
                                } else {
                                    i2 = i8;
                                }
                                i3 = length2;
                                i4 = i10;
                            }
                            concurrentMapC10942 = this;
                        }
                    }
                    z = zB;
                    i2 = i8;
                    i3 = length2;
                    i4 = i10;
                }
                length2 = i3;
                i8 = i2;
                i10 = i4;
            }
        }
    }

    public final long j() {
        C20820[] c20820Arr = this.c;
        long j2 = this.baseCount;
        if (c20820Arr != null) {
            for (C20820 c20820 : c20820Arr) {
                if (c20820 != null) {
                    j2 += c20820.value;
                }
            }
        }
        return j2;
    }

    public final void n(C0357[] c0357Arr, int i2) {
        int length = c0357Arr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        C0357 c0357K = k(c0357Arr, i2);
        if (c0357K == null || c0357K.a < 0) {
            return;
        }
        synchronized (c0357K) {
            if (k(c0357Arr, i2) == c0357K) {
                C22230 c22230 = null;
                C22230 c22231 = null;
                while (c0357K != null) {
                    C22230 c22232 = new C22230(c0357K.a, c0357K.b, c0357K.c, null, null);
                    c22232.h = c22231;
                    if (c22231 == null) {
                        c22230 = c22232;
                    } else {
                        c22231.d = c22232;
                    }
                    c0357K = c0357K.d;
                    c22231 = c22232;
                }
                h(c0357Arr, i2, new C21525(c22230));
            }
        }
    }

    public static C0357 p(C22230 c22230) {
        C0357 c0357 = null;
        C0357 c0358 = null;
        for (C0357 c0359 = c22230; c0359 != null; c0359 = c0359.d) {
            C0357 c03510 = new C0357(c0359.a, c0359.b, c0359.c);
            if (c0358 == null) {
                c0357 = c03510;
            } else {
                c0358.d = c03510;
            }
            c0358 = c03510;
        }
        return c0357;
    }
}
