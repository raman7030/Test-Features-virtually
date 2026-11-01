package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p052u0.C0226b;
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
public class ConcurrentMapC12768 extends AbstractMap implements ConcurrentMap, Serializable, InterfaceC18802 {

    /* JADX INFO: renamed from: g */
    public static final int f35939g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h */
    public static final C19809 f35940h;

    /* JADX INFO: renamed from: i */
    public static final long f35941i;

    /* JADX INFO: renamed from: j */
    public static final long f35942j;

    /* JADX INFO: renamed from: k */
    public static final long f35943k;

    /* JADX INFO: renamed from: l */
    public static final long f35944l;

    /* JADX INFO: renamed from: m */
    public static final long f35945m;

    /* JADX INFO: renamed from: n */
    public static final int f35946n;

    /* JADX INFO: renamed from: o */
    public static final int f35947o;
    public static final ObjectStreamField[] serialPersistentFields;
    public static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a */
    public volatile transient C2708[] f35948a;

    /* JADX INFO: renamed from: b */
    public volatile transient C2708[] f35949b;
    public volatile transient long baseCount;

    /* JADX INFO: renamed from: c */
    public volatile transient C22156[] f35950c;
    public volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d */
    public transient C4050 f35951d;

    /* JADX INFO: renamed from: e */
    public transient C21485 f35952e;

    /* JADX INFO: renamed from: f */
    public transient C10756 f35953f;
    public volatile transient int sizeCtl;
    public volatile transient int transferIndex;

    /* JADX INFO: renamed from: i */
    public static final int m29311i(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C3379[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C19809 c19809 = C19809.f60241b;
        f35940h = c19809;
        f35941i = c19809.m45040h(ConcurrentMapC12768.class, "sizeCtl");
        f35942j = c19809.m45040h(ConcurrentMapC12768.class, "transferIndex");
        f35943k = c19809.m45040h(ConcurrentMapC12768.class, "baseCount");
        f35944l = c19809.m45040h(ConcurrentMapC12768.class, "cellsBusy");
        f35945m = c19809.m45040h(C22156.class, C0226b.f1011d);
        f35946n = c19809.m45034a(C2708[].class);
        int iM45035b = c19809.m45035b(C2708[].class);
        if (((iM45035b - 1) & iM45035b) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f35947o = 31 - Integer.numberOfLeadingZeros(iM45035b);
    }

    /* JADX INFO: renamed from: l */
    public static final int m29313l(int i) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    /* JADX INFO: renamed from: c */
    public static Class m29309c(Object obj) {
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

    /* JADX INFO: renamed from: k */
    public static final C2708 m29312k(C2708[] c2708Arr, int i) {
        return (C2708) f35940h.m45039f(c2708Arr, (((long) i) << f35947o) + ((long) f35946n));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m29308b(C2708[] c2708Arr, int i, C2708 c2708) {
        C19809 c19809 = f35940h;
        return AbstractC24029.m53215E(c19809.f60242a, c2708Arr, (((long) i) << f35947o) + ((long) f35946n), c2708);
    }

    /* JADX INFO: renamed from: h */
    public static final void m29310h(C2708[] c2708Arr, int i, C2708 c2708) {
        f35940h.m45042j(c2708Arr, (((long) i) << f35947o) + ((long) f35946n), c2708);
    }

    public ConcurrentMapC12768() {
    }

    public ConcurrentMapC12768(int i) {
        this(i, 0.75f, 1);
    }

    public ConcurrentMapC12768(int i, float f) {
        this(i, f, 1);
    }

    public ConcurrentMapC12768(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((double) ((i < i2 ? i2 : i) / f)) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? 1073741824 : m29313l((int) j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long jM29320j = m29320j();
        if (jM29320j < 0) {
            return 0;
        }
        if (jM29320j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM29320j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return m29320j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int length;
        C2708 c2708M29312k;
        Object obj2;
        int iM29311i = m29311i(obj.hashCode());
        C2708[] c2708Arr = this.f35948a;
        if (c2708Arr == null || (length = c2708Arr.length) <= 0 || (c2708M29312k = m29312k(c2708Arr, (length - 1) & iM29311i)) == null) {
            return null;
        }
        int i = c2708M29312k.f4544a;
        if (i == iM29311i) {
            Object obj3 = c2708M29312k.f4545b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return c2708M29312k.f4546c;
            }
        } else if (i < 0) {
            C2708 c2708Mo4197a = c2708M29312k.mo4197a(iM29311i, obj);
            if (c2708Mo4197a != null) {
                return c2708Mo4197a.f4546c;
            }
            return null;
        }
        while (true) {
            c2708M29312k = c2708M29312k.f4547d;
            if (c2708M29312k == null) {
                return null;
            }
            if (c2708M29312k.f4544a == iM29311i && ((obj2 = c2708M29312k.f4545b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c2708M29312k.f4546c;
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
        C2708[] c2708Arr = this.f35948a;
        if (c2708Arr != null) {
            C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
            while (true) {
                C2708 c2708M38035a = c16789.m38035a();
                if (c2708M38035a == null) {
                    break;
                }
                Object obj2 = c2708M38035a.f4546c;
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
        return m29318f(obj, obj2, false);
    }

    /* JADX INFO: renamed from: f */
    public final Object m29318f(Object obj, Object obj2, boolean z) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int iM29311i = m29311i(obj.hashCode());
        C2708[] c2708ArrM29317e = this.f35948a;
        int i = 0;
        while (true) {
            if (c2708ArrM29317e != null) {
                int length = c2708ArrM29317e.length;
                if (length != 0) {
                    int i2 = (length - 1) & iM29311i;
                    C2708 c2708M29312k = m29312k(c2708ArrM29317e, i2);
                    if (c2708M29312k == null) {
                        if (m29308b(c2708ArrM29317e, i2, new C2708(iM29311i, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i3 = c2708M29312k.f4544a;
                        if (i3 == -1) {
                            c2708ArrM29317e = m29316d(c2708ArrM29317e, c2708M29312k);
                        } else {
                            if (z && i3 == iM29311i && (((obj5 = c2708M29312k.f4545b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = c2708M29312k.f4546c) != null)) {
                                return obj6;
                            }
                            synchronized (c2708M29312k) {
                                if (m29312k(c2708ArrM29317e, i2) != c2708M29312k) {
                                    obj3 = null;
                                } else if (i3 >= 0) {
                                    i = 1;
                                    while (true) {
                                        if (c2708M29312k.f4544a == iM29311i && ((obj4 = c2708M29312k.f4545b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                            obj3 = c2708M29312k.f4546c;
                                            if (!z) {
                                                c2708M29312k.f4546c = obj2;
                                            }
                                        } else {
                                            C2708 c2708 = c2708M29312k.f4547d;
                                            if (c2708 == null) {
                                                c2708M29312k.f4547d = new C2708(iM29311i, obj, obj2);
                                                obj3 = null;
                                            } else {
                                                i++;
                                                c2708M29312k = c2708;
                                            }
                                        }
                                    }
                                } else if (c2708M29312k instanceof C22826) {
                                    C23496 c23496M51033e = ((C22826) c2708M29312k).m51033e(iM29311i, obj, obj2);
                                    if (c23496M51033e != null) {
                                        Object obj7 = c23496M51033e.f4546c;
                                        if (!z) {
                                            c23496M51033e.f4546c = obj2;
                                        }
                                        obj3 = obj7;
                                    } else {
                                        obj3 = null;
                                    }
                                    i = 2;
                                } else {
                                    if (c2708M29312k instanceof C7403) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    obj3 = null;
                                }
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    m29322n(c2708ArrM29317e, i2);
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
            c2708ArrM29317e = m29317e();
        }
        m29315a(1L, i);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m29323o(map.size());
        for (Map.Entry entry : map.entrySet()) {
            m29318f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return m29319g(obj, null, null);
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
    /* JADX INFO: renamed from: g */
    public final Object m29319g(Object obj, Object obj2, Object obj3) {
        int length;
        int i;
        C2708 c2708M29312k;
        boolean z;
        Object obj4;
        C23496 c23496M52230b;
        Object obj5;
        int iM29311i = m29311i(obj.hashCode());
        C2708[] c2708ArrM29316d = this.f35948a;
        while (c2708ArrM29316d != null && (length = c2708ArrM29316d.length) != 0 && (c2708M29312k = m29312k(c2708ArrM29316d, (i = (length - 1) & iM29311i))) != null) {
            int i2 = c2708M29312k.f4544a;
            if (i2 == -1) {
                c2708ArrM29316d = m29316d(c2708ArrM29316d, c2708M29312k);
            } else {
                synchronized (c2708M29312k) {
                    if (m29312k(c2708ArrM29316d, i) == c2708M29312k) {
                        z = true;
                        if (i2 >= 0) {
                            C2708 c2708 = null;
                            while (true) {
                                if (c2708M29312k.f4544a == iM29311i && ((obj5 = c2708M29312k.f4545b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                    obj4 = c2708M29312k.f4546c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            c2708M29312k.f4546c = obj2;
                                        } else if (c2708 != null) {
                                            c2708.f4547d = c2708M29312k.f4547d;
                                        } else {
                                            m29310h(c2708ArrM29316d, i, c2708M29312k.f4547d);
                                        }
                                    }
                                } else {
                                    C2708 c2709 = c2708M29312k.f4547d;
                                    if (c2709 != null) {
                                        c2708 = c2708M29312k;
                                        c2708M29312k = c2709;
                                    }
                                }
                                obj4 = null;
                            }
                        } else if (c2708M29312k instanceof C22826) {
                            C22826 c22826 = (C22826) c2708M29312k;
                            C23496 c23496 = c22826.f71904e;
                            if (c23496 == null || (c23496M52230b = c23496.m52230b(iM29311i, obj, null)) == null) {
                                obj4 = null;
                            } else {
                                obj4 = c23496M52230b.f4546c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    c23496M52230b.f4546c = obj2;
                                } else if (c22826.m51034f(c23496M52230b)) {
                                    m29310h(c2708ArrM29316d, i, m29314p(c22826.f71905f));
                                }
                            }
                        } else {
                            if (c2708M29312k instanceof C7403) {
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
                        m29315a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        long j;
        C2708 c2708M29312k;
        C2708[] c2708ArrM29316d = this.f35948a;
        long j2 = 0;
        loop0: while (true) {
            j = j2;
            int i = 0;
            while (true) {
                if (c2708ArrM29316d == null || i >= c2708ArrM29316d.length) {
                    break loop0;
                }
                c2708M29312k = m29312k(c2708ArrM29316d, i);
                if (c2708M29312k == null) {
                    i++;
                } else {
                    int i2 = c2708M29312k.f4544a;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (c2708M29312k) {
                        if (m29312k(c2708ArrM29316d, i) == c2708M29312k) {
                            if (i2 < 0) {
                                c2708M29312k = c2708M29312k instanceof C22826 ? ((C22826) c2708M29312k).f71905f : null;
                            }
                            while (c2708M29312k != null) {
                                j--;
                                c2708M29312k = c2708M29312k.f4547d;
                            }
                            m29310h(c2708ArrM29316d, i, null);
                            i++;
                        }
                    }
                }
            }
            c2708ArrM29316d = m29316d(c2708ArrM29316d, c2708M29312k);
            j2 = j;
        }
        if (j != 0) {
            m29315a(j, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C4050 c4050 = this.f35951d;
        if (c4050 != null) {
            return c4050;
        }
        C4050 c4051 = new C4050(this, null);
        this.f35951d = c4051;
        return c4051;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        C21485 c21485 = this.f35952e;
        if (c21485 != null) {
            return c21485;
        }
        C21485 c21486 = new C21485(this);
        this.f35952e = c21486;
        return c21486;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        C10756 c10756 = this.f35953f;
        if (c10756 != null) {
            return c10756;
        }
        C10756 c10757 = new C10756(this);
        this.f35953f = c10757;
        return c10757;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        C2708[] c2708Arr = this.f35948a;
        int iHashCode = 0;
        if (c2708Arr != null) {
            C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
            while (true) {
                C2708 c2708M38035a = c16789.m38035a();
                if (c2708M38035a == null) {
                    break;
                }
                iHashCode += c2708M38035a.f4546c.hashCode() ^ c2708M38035a.f4545b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C2708[] c2708Arr = this.f35948a;
        int length = c2708Arr == null ? 0 : c2708Arr.length;
        C16789 c16789 = new C16789(c2708Arr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C2708 c2708M38035a = c16789.m38035a();
        if (c2708M38035a != null) {
            while (true) {
                Object obj = c2708M38035a.f4545b;
                Object obj2 = c2708M38035a.f4546c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append(C0184a.f880h);
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                c2708M38035a = c16789.m38035a();
                if (c2708M38035a == null) {
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
        C2708[] c2708Arr = this.f35948a;
        int length = c2708Arr == null ? 0 : c2708Arr.length;
        C16789 c16789 = new C16789(c2708Arr, length, 0, length);
        while (true) {
            C2708 c2708M38035a = c16789.m38035a();
            if (c2708M38035a != null) {
                Object obj3 = c2708M38035a.f4546c;
                Object obj4 = map.get(c2708M38035a.f4545b);
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
        int i = 1;
        int i2 = 0;
        while (i < 16) {
            i2++;
            i <<= 1;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        C3379[] c3379Arr = new C3379[16];
        for (int i5 = 0; i5 < 16; i5++) {
            c3379Arr[i5] = new C3379();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", c3379Arr);
        putFieldPutFields.put("segmentShift", i3);
        putFieldPutFields.put("segmentMask", i4);
        objectOutputStream.writeFields();
        C2708[] c2708Arr = this.f35948a;
        if (c2708Arr != null) {
            C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
            while (true) {
                C2708 c2708M38035a = c16789.m38035a();
                if (c2708M38035a == null) {
                    break;
                }
                objectOutputStream.writeObject(c2708M38035a.f4545b);
                objectOutputStream.writeObject(c2708M38035a.f4546c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        C2708 c2708 = null;
        long j3 = 0;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j = 1;
            if (object == null || object2 == null) {
                break;
            }
            j3++;
            c2708 = new C2708(m29311i(object.hashCode()), object, object2, c2708);
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j4 = (long) (((double) (j3 / 0.75f)) + 1.0d);
        int iM29313l = j4 >= 1073741824 ? 1073741824 : m29313l((int) j4);
        C2708[] c2708Arr = new C2708[iM29313l];
        int i = iM29313l - 1;
        while (c2708 != null) {
            C2708 c2709 = c2708.f4547d;
            int i2 = c2708.f4544a;
            int i3 = i2 & i;
            C2708 c2708M29312k = m29312k(c2708Arr, i3);
            if (c2708M29312k == null) {
                z = true;
            } else {
                Object obj2 = c2708.f4545b;
                if (c2708M29312k.f4544a >= 0) {
                    int i4 = 0;
                    C2708 c27010 = c2708M29312k;
                    while (true) {
                        if (c27010 == null) {
                            z = true;
                            break;
                        }
                        if (c27010.f4544a == i2 && ((obj = c27010.f4545b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i4++;
                            c27010 = c27010.f4547d;
                        }
                    }
                    if (z && i4 >= 8) {
                        long j5 = j2 + 1;
                        c2708.f4547d = c2708M29312k;
                        C23496 c23496 = null;
                        C23496 c23497 = null;
                        C2708 c27011 = c2708;
                        while (c27011 != null) {
                            long j6 = j5;
                            C23496 c23498 = new C23496(c27011.f4544a, c27011.f4545b, c27011.f4546c, null, null);
                            c23498.f74855h = c23497;
                            if (c23497 == null) {
                                c23496 = c23498;
                            } else {
                                c23497.f4547d = c23498;
                            }
                            c27011 = c27011.f4547d;
                            c23497 = c23498;
                            j5 = j6;
                        }
                        m29310h(c2708Arr, i3, new C22826(c23496));
                        j2 = j5;
                    }
                } else if (((C22826) c2708M29312k).m51033e(i2, obj2, c2708.f4546c) == null) {
                    j2 += j;
                }
                z = false;
            }
            j = 1;
            if (z) {
                j2++;
                c2708.f4547d = c2708M29312k;
                m29310h(c2708Arr, i3, c2708);
            }
            c2708 = c2709;
        }
        this.f35948a = c2708Arr;
        this.sizeCtl = iM29313l - (iM29313l >>> 2);
        this.baseCount = j2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public Object putIfAbsent(Object obj, Object obj2) {
        return m29318f(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || m29319g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return m29319g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return m29319g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C2708[] c2708Arr = this.f35948a;
        if (c2708Arr == null) {
            return;
        }
        C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
        while (true) {
            C2708 c2708M38035a = c16789.m38035a();
            if (c2708M38035a == null) {
                return;
            } else {
                biConsumer.accept(c2708M38035a.f4545b, c2708M38035a.f4546c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C2708[] c2708Arr = this.f35948a;
        if (c2708Arr == null) {
            return;
        }
        C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
        while (true) {
            C2708 c2708M38035a = c16789.m38035a();
            if (c2708M38035a == null) {
                return;
            }
            Object obj = c2708M38035a.f4546c;
            Object obj2 = c2708M38035a.f4545b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (m29319g(obj2, objApply, obj) != null) {
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
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objApply;
        C23496 c23496M52230b;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null || function == null) {
            throw null;
        }
        int iM29311i = m29311i(obj.hashCode());
        C2708[] c2708ArrM29317e = this.f35948a;
        Object objApply2 = null;
        int i = 0;
        while (true) {
            if (c2708ArrM29317e != null) {
                int length = c2708ArrM29317e.length;
                if (length != 0) {
                    int i2 = (length - 1) & iM29311i;
                    C2708 c2708M29312k = m29312k(c2708ArrM29317e, i2);
                    boolean z = true;
                    if (c2708M29312k == null) {
                        C7403 c7403 = new C7403();
                        synchronized (c7403) {
                            if (m29308b(c2708ArrM29317e, i2, c7403)) {
                                try {
                                    Object objApply3 = function.apply(obj);
                                    m29310h(c2708ArrM29317e, i2, objApply3 != null ? new C2708(iM29311i, obj, objApply3) : null);
                                    objApply2 = objApply3;
                                    i = 1;
                                } catch (Throwable th) {
                                    m29310h(c2708ArrM29317e, i2, null);
                                    throw th;
                                }
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    } else {
                        int i3 = c2708M29312k.f4544a;
                        if (i3 == -1) {
                            c2708ArrM29317e = m29316d(c2708ArrM29317e, c2708M29312k);
                        } else {
                            if (i3 == iM29311i && (((obj3 = c2708M29312k.f4545b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = c2708M29312k.f4546c) != null)) {
                                return obj4;
                            }
                            synchronized (c2708M29312k) {
                                if (m29312k(c2708ArrM29317e, i2) != c2708M29312k) {
                                    z = false;
                                    break;
                                }
                                if (i3 >= 0) {
                                    i = 1;
                                    while (true) {
                                        if (c2708M29312k.f4544a == iM29311i && ((obj2 = c2708M29312k.f4545b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            objApply2 = c2708M29312k.f4546c;
                                            z = false;
                                            break;
                                        }
                                        C2708 c2708 = c2708M29312k.f4547d;
                                        if (c2708 == null) {
                                            objApply2 = function.apply(obj);
                                            if (objApply2 == null) {
                                                z = false;
                                                break;
                                            }
                                            if (c2708M29312k.f4547d != null) {
                                                throw new IllegalStateException("Recursive update");
                                            }
                                            c2708M29312k.f4547d = new C2708(iM29311i, obj, objApply2);
                                            break;
                                        }
                                        i++;
                                        c2708M29312k = c2708;
                                    }
                                } else if (c2708M29312k instanceof C22826) {
                                    C22826 c22826 = (C22826) c2708M29312k;
                                    C23496 c23496 = c22826.f71904e;
                                    if (c23496 != null && (c23496M52230b = c23496.m52230b(iM29311i, obj, null)) != null) {
                                        objApply = c23496M52230b.f4546c;
                                    } else {
                                        objApply = function.apply(obj);
                                        if (objApply != null) {
                                            c22826.m51033e(iM29311i, obj, objApply);
                                        }
                                        objApply2 = objApply;
                                        i = 2;
                                    }
                                    z = false;
                                    objApply2 = objApply;
                                    i = 2;
                                } else {
                                    if (!(c2708M29312k instanceof C7403)) {
                                        z = false;
                                        break;
                                    }
                                    throw new IllegalStateException("Recursive update");
                                }
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    m29322n(c2708ArrM29317e, i2);
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
            c2708ArrM29317e = m29317e();
        }
        if (objApply2 != null) {
            m29315a(1L, i);
        }
        return objApply2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C23496 c23496M52230b;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iM29311i = m29311i(obj.hashCode());
        C2708[] c2708ArrM29317e = this.f35948a;
        Object objApply = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (c2708ArrM29317e != null) {
                int length = c2708ArrM29317e.length;
                if (length != 0) {
                    int i3 = (length - 1) & iM29311i;
                    C2708 c2708M29312k = m29312k(c2708ArrM29317e, i3);
                    if (c2708M29312k == null) {
                        break;
                    }
                    int i4 = c2708M29312k.f4544a;
                    if (i4 == -1) {
                        c2708ArrM29317e = m29316d(c2708ArrM29317e, c2708M29312k);
                    } else {
                        synchronized (c2708M29312k) {
                            if (m29312k(c2708ArrM29317e, i3) == c2708M29312k) {
                                if (i4 >= 0) {
                                    i2 = 1;
                                    C2708 c2708 = null;
                                    while (true) {
                                        if (c2708M29312k.f4544a == iM29311i && ((obj2 = c2708M29312k.f4545b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            objApply = biFunction.apply(obj, c2708M29312k.f4546c);
                                            if (objApply != null) {
                                                c2708M29312k.f4546c = objApply;
                                                break;
                                            }
                                            C2708 c2709 = c2708M29312k.f4547d;
                                            if (c2708 != null) {
                                                c2708.f4547d = c2709;
                                            } else {
                                                m29310h(c2708ArrM29317e, i3, c2709);
                                            }
                                            i = -1;
                                            break;
                                        }
                                        C2708 c27010 = c2708M29312k.f4547d;
                                        if (c27010 == null) {
                                            break;
                                        }
                                        i2++;
                                        c2708 = c2708M29312k;
                                        c2708M29312k = c27010;
                                    }
                                } else if (c2708M29312k instanceof C22826) {
                                    C22826 c22826 = (C22826) c2708M29312k;
                                    C23496 c23496 = c22826.f71904e;
                                    if (c23496 != null && (c23496M52230b = c23496.m52230b(iM29311i, obj, null)) != null) {
                                        objApply = biFunction.apply(obj, c23496M52230b.f4546c);
                                        if (objApply != null) {
                                            c23496M52230b.f4546c = objApply;
                                        } else {
                                            if (c22826.m51034f(c23496M52230b)) {
                                                m29310h(c2708ArrM29317e, i3, m29314p(c22826.f71905f));
                                            }
                                            i = -1;
                                        }
                                    }
                                    i2 = 2;
                                } else if (c2708M29312k instanceof C7403) {
                                    throw new IllegalStateException("Recursive update");
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            c2708ArrM29317e = m29317e();
        }
        if (i != 0) {
            m29315a(i, i2);
        }
        return objApply;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        int i;
        C2708 c2708;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iM29311i = m29311i(obj.hashCode());
        C2708[] c2708ArrM29317e = this.f35948a;
        Object objApply = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (c2708ArrM29317e != null) {
                int length = c2708ArrM29317e.length;
                if (length != 0) {
                    int i4 = (length - 1) & iM29311i;
                    C2708 c2708M29312k = m29312k(c2708ArrM29317e, i4);
                    if (c2708M29312k == null) {
                        C7403 c7403 = new C7403();
                        synchronized (c7403) {
                            if (m29308b(c2708ArrM29317e, i4, c7403)) {
                                try {
                                    Object objApply2 = biFunction.apply(obj, null);
                                    if (objApply2 != null) {
                                        c2708 = new C2708(iM29311i, obj, objApply2);
                                        i = 1;
                                    } else {
                                        i = i3;
                                        c2708 = null;
                                    }
                                    m29310h(c2708ArrM29317e, i4, c2708);
                                    i3 = i;
                                    objApply = objApply2;
                                    i2 = 1;
                                } catch (Throwable th) {
                                    m29310h(c2708ArrM29317e, i4, null);
                                    throw th;
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    } else {
                        int i5 = c2708M29312k.f4544a;
                        if (i5 == -1) {
                            c2708ArrM29317e = m29316d(c2708ArrM29317e, c2708M29312k);
                        } else {
                            synchronized (c2708M29312k) {
                                if (m29312k(c2708ArrM29317e, i4) == c2708M29312k) {
                                    if (i5 >= 0) {
                                        i2 = 1;
                                        C2708 c2709 = null;
                                        while (true) {
                                            if (c2708M29312k.f4544a == iM29311i && ((obj2 = c2708M29312k.f4545b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                Object objApply3 = biFunction.apply(obj, c2708M29312k.f4546c);
                                                if (objApply3 != null) {
                                                    c2708M29312k.f4546c = objApply3;
                                                } else {
                                                    C2708 c27010 = c2708M29312k.f4547d;
                                                    if (c2709 != null) {
                                                        c2709.f4547d = c27010;
                                                    } else {
                                                        m29310h(c2708ArrM29317e, i4, c27010);
                                                    }
                                                    i3 = -1;
                                                }
                                                objApply = objApply3;
                                                break;
                                            }
                                            C2708 c27011 = c2708M29312k.f4547d;
                                            if (c27011 == null) {
                                                objApply = biFunction.apply(obj, null);
                                                if (objApply == null) {
                                                    break;
                                                }
                                                if (c2708M29312k.f4547d != null) {
                                                    throw new IllegalStateException("Recursive update");
                                                }
                                                c2708M29312k.f4547d = new C2708(iM29311i, obj, objApply);
                                                i3 = 1;
                                                break;
                                            }
                                            i2++;
                                            C2708 c27012 = c2708M29312k;
                                            c2708M29312k = c27011;
                                            c2709 = c27012;
                                        }
                                    } else if (c2708M29312k instanceof C22826) {
                                        C22826 c22826 = (C22826) c2708M29312k;
                                        C23496 c23496 = c22826.f71904e;
                                        C23496 c23496M52230b = c23496 != null ? c23496.m52230b(iM29311i, obj, null) : null;
                                        objApply = biFunction.apply(obj, c23496M52230b == null ? null : c23496M52230b.f4546c);
                                        if (objApply != null) {
                                            if (c23496M52230b != null) {
                                                c23496M52230b.f4546c = objApply;
                                            } else {
                                                c22826.m51033e(iM29311i, obj, objApply);
                                                i3 = 1;
                                            }
                                        } else if (c23496M52230b != null) {
                                            if (c22826.m51034f(c23496M52230b)) {
                                                m29310h(c2708ArrM29317e, i4, m29314p(c22826.f71905f));
                                            }
                                            i3 = -1;
                                        }
                                        i2 = 1;
                                    } else if (c2708M29312k instanceof C7403) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 < 8) {
                                    break;
                                }
                                m29322n(c2708ArrM29317e, i4);
                                break;
                            }
                        }
                    }
                }
            }
            c2708ArrM29317e = m29317e();
        }
        if (i3 != 0) {
            m29315a(i3, i2);
        }
        return objApply;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i;
        Object obj3;
        if (obj == null || obj2 == null || biFunction == null) {
            throw null;
        }
        int iM29311i = m29311i(obj.hashCode());
        C2708[] c2708ArrM29317e = this.f35948a;
        Object objApply = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (c2708ArrM29317e != null) {
                int length = c2708ArrM29317e.length;
                if (length != 0) {
                    int i4 = (length - 1) & iM29311i;
                    C2708 c2708M29312k = m29312k(c2708ArrM29317e, i4);
                    i = 1;
                    if (c2708M29312k == null) {
                        if (m29308b(c2708ArrM29317e, i4, new C2708(iM29311i, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i5 = c2708M29312k.f4544a;
                        if (i5 == -1) {
                            c2708ArrM29317e = m29316d(c2708ArrM29317e, c2708M29312k);
                        } else {
                            synchronized (c2708M29312k) {
                                if (m29312k(c2708ArrM29317e, i4) == c2708M29312k) {
                                    if (i5 >= 0) {
                                        i2 = 1;
                                        C2708 c2708 = null;
                                        while (true) {
                                            if (c2708M29312k.f4544a == iM29311i && ((obj3 = c2708M29312k.f4545b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                Object objApply2 = biFunction.apply(c2708M29312k.f4546c, obj2);
                                                if (objApply2 != null) {
                                                    c2708M29312k.f4546c = objApply2;
                                                } else {
                                                    C2708 c2709 = c2708M29312k.f4547d;
                                                    if (c2708 != null) {
                                                        c2708.f4547d = c2709;
                                                    } else {
                                                        m29310h(c2708ArrM29317e, i4, c2709);
                                                    }
                                                    i3 = -1;
                                                }
                                                objApply = objApply2;
                                                break;
                                            }
                                            C2708 c27010 = c2708M29312k.f4547d;
                                            if (c27010 == null) {
                                                c2708M29312k.f4547d = new C2708(iM29311i, obj, obj2);
                                                i3 = 1;
                                                objApply = obj2;
                                                break;
                                            }
                                            i2++;
                                            C2708 c27011 = c2708M29312k;
                                            c2708M29312k = c27010;
                                            c2708 = c27011;
                                        }
                                    } else if (c2708M29312k instanceof C22826) {
                                        C22826 c22826 = (C22826) c2708M29312k;
                                        C23496 c23496 = c22826.f71904e;
                                        C23496 c23496M52230b = c23496 == null ? null : c23496.m52230b(iM29311i, obj, null);
                                        objApply = c23496M52230b == null ? obj2 : biFunction.apply(c23496M52230b.f4546c, obj2);
                                        if (objApply != null) {
                                            if (c23496M52230b != null) {
                                                c23496M52230b.f4546c = objApply;
                                            } else {
                                                c22826.m51033e(iM29311i, obj, objApply);
                                                i3 = 1;
                                            }
                                        } else if (c23496M52230b != null) {
                                            if (c22826.m51034f(c23496M52230b)) {
                                                m29310h(c2708ArrM29317e, i4, m29314p(c22826.f71905f));
                                            }
                                            i3 = -1;
                                        }
                                        i2 = 2;
                                    } else if (c2708M29312k instanceof C7403) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m29322n(c2708ArrM29317e, i4);
                                }
                                i = i3;
                                obj2 = objApply;
                                break;
                            }
                        }
                    }
                }
            }
            c2708ArrM29317e = m29317e();
        }
        if (i != 0) {
            m29315a(i, i2);
        }
        return obj2;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public static C4050 newKeySet() {
        return new C4050(new ConcurrentMapC12768(), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public final C2708[] m29317e() {
        while (true) {
            C2708[] c2708Arr = this.f35948a;
            if (c2708Arr != null && c2708Arr.length != 0) {
                return c2708Arr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (f35940h.m45036c(this, f35941i, i, -1)) {
                try {
                    C2708[] c2708Arr2 = this.f35948a;
                    if (c2708Arr2 == null || c2708Arr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        C2708[] c2708Arr3 = new C2708[i2];
                        this.f35948a = c2708Arr3;
                        i = i2 - (i2 >>> 2);
                        c2708Arr2 = c2708Arr3;
                    }
                    return c2708Arr2;
                } finally {
                    this.sizeCtl = i;
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
    /* JADX INFO: renamed from: a */
    public final void m29315a(long j, int i) {
        boolean zM45037d;
        C6732 c6732;
        int i2;
        int i3;
        ConcurrentMapC12768 concurrentMapC12768;
        boolean z;
        ConcurrentMapC12768 concurrentMapC12769;
        int i4;
        C22156[] c22156Arr;
        boolean z2;
        C19809 c19809;
        long j2;
        long j3;
        boolean z3;
        int length;
        boolean z4;
        int length2;
        int length3;
        C22156 c22156;
        long jM29320j;
        C2708[] c2708Arr;
        int length4;
        C2708[] c2708Arr2;
        C22156[] c22156Arr2 = this.f35950c;
        if (c22156Arr2 != null) {
            if (c22156Arr2 != null) {
                zM45037d = true;
            } else {
                zM45037d = true;
            }
            c6732 = C16119.f47437f;
            i2 = ((C16119) c6732.get()).f47440b;
            if (i2 == 0) {
                C16119.m36696d();
                i2 = ((C16119) c6732.get()).f47440b;
                zM45037d = true;
            }
            i3 = 0;
            concurrentMapC12768 = this;
            while (true) {
                z = false;
                int i5 = i2;
                concurrentMapC12769 = concurrentMapC12768;
                i4 = i5;
                while (true) {
                    c22156Arr = concurrentMapC12769.f35950c;
                    if (c22156Arr == null) {
                    }
                    z2 = z;
                    if (concurrentMapC12769.cellsBusy != 0) {
                        c19809 = f35940h;
                        j2 = f35943k;
                        j3 = concurrentMapC12769.baseCount;
                        if (c19809.m45037d(concurrentMapC12769, j2, j3, j3 + j)) {
                            return;
                        }
                    } else {
                        c19809 = f35940h;
                        j2 = f35943k;
                        j3 = concurrentMapC12769.baseCount;
                        if (c19809.m45037d(concurrentMapC12769, j2, j3, j3 + j)) {
                            return;
                        }
                    }
                    z = z2;
                    concurrentMapC12769 = this;
                    i3 = 0;
                }
                if (concurrentMapC12769.f35950c == c22156Arr) {
                    concurrentMapC12769.f35950c = (C22156[]) Arrays.copyOf(c22156Arr, length << 1);
                }
                i3 = 0;
                concurrentMapC12769.cellsBusy = 0;
                ConcurrentMapC12768 concurrentMapC127610 = concurrentMapC12769;
                i2 = i4;
                concurrentMapC12768 = concurrentMapC127610;
            }
        } else {
            C19809 c198010 = f35940h;
            long j4 = f35943k;
            long j5 = this.baseCount;
            jM29320j = j5 + j;
            if (!c198010.m45037d(this, j4, j5, jM29320j)) {
                if (c22156Arr2 != null || (length3 = c22156Arr2.length - 1) < 0 || (c22156 = c22156Arr2[length3 & ((C16119) C16119.f47437f.get()).f47440b]) == null) {
                    zM45037d = true;
                } else {
                    C19809 c198011 = f35940h;
                    long j6 = f35945m;
                    long j7 = c22156.value;
                    zM45037d = c198011.m45037d(c22156, j6, j7, j7 + j);
                    if (zM45037d) {
                        if (i <= 1) {
                            return;
                        } else {
                            jM29320j = m29320j();
                        }
                    }
                }
                c6732 = C16119.f47437f;
                i2 = ((C16119) c6732.get()).f47440b;
                if (i2 == 0) {
                    C16119.m36696d();
                    i2 = ((C16119) c6732.get()).f47440b;
                    zM45037d = true;
                }
                i3 = 0;
                concurrentMapC12768 = this;
                while (true) {
                    z = false;
                    int i6 = i2;
                    concurrentMapC12769 = concurrentMapC12768;
                    i4 = i6;
                    while (true) {
                        c22156Arr = concurrentMapC12769.f35950c;
                        if (c22156Arr == null && (length = c22156Arr.length) > 0) {
                            C22156 c22157 = c22156Arr[(length - 1) & i4];
                            if (c22157 != null) {
                                if (zM45037d) {
                                    C19809 c198012 = f35940h;
                                    long j8 = f35945m;
                                    boolean z5 = z;
                                    long j9 = c22157.value;
                                    if (c198012.m45037d(c22157, j8, j9, j9 + j)) {
                                        return;
                                    }
                                    if (concurrentMapC12769.f35950c == c22156Arr && length < f35939g) {
                                        if (z5) {
                                            if (concurrentMapC12769.cellsBusy == 0) {
                                                if (c198012.m45036c(concurrentMapC12769, f35944l, 0, 1)) {
                                                    break;
                                                }
                                            }
                                            z = z5;
                                        } else {
                                            z = true;
                                        }
                                    }
                                } else {
                                    zM45037d = true;
                                }
                                int i7 = i4 ^ (i4 << 13);
                                int i8 = i7 ^ (i7 >>> 17);
                                i4 = i8 ^ (i8 << 5);
                                ((C16119) C16119.f47437f.get()).f47440b = i4;
                                z2 = z;
                                z = z2;
                                concurrentMapC12769 = this;
                                i3 = 0;
                            } else if (concurrentMapC12769.cellsBusy == 0) {
                                C22156 c22158 = new C22156(j);
                                if (concurrentMapC12769.cellsBusy == 0) {
                                    if (f35940h.m45036c(concurrentMapC12769, f35944l, 0, 1)) {
                                        try {
                                            C22156[] c22156Arr3 = concurrentMapC12769.f35950c;
                                            if (c22156Arr3 == null || (length2 = c22156Arr3.length) <= 0) {
                                                z4 = false;
                                            } else {
                                                int i9 = (length2 - 1) & i4;
                                                if (c22156Arr3[i9] == null) {
                                                    c22156Arr3[i9] = c22158;
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            }
                                            concurrentMapC12769.cellsBusy = i3;
                                            if (z4) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            concurrentMapC12769.cellsBusy = i3;
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = false;
                            int i10 = i4 ^ (i4 << 13);
                            int i11 = i10 ^ (i10 >>> 17);
                            i4 = i11 ^ (i11 << 5);
                            ((C16119) C16119.f47437f.get()).f47440b = i4;
                            z2 = z;
                            z = z2;
                            concurrentMapC12769 = this;
                            i3 = 0;
                        } else {
                            z2 = z;
                            if (concurrentMapC12769.cellsBusy != 0 && concurrentMapC12769.f35950c == c22156Arr) {
                                if (f35940h.m45036c(concurrentMapC12769, f35944l, 0, 1)) {
                                    try {
                                        if (concurrentMapC12769.f35950c == c22156Arr) {
                                            C22156[] c22156Arr4 = new C22156[2];
                                            c22156Arr4[i4 & 1] = new C22156(j);
                                            concurrentMapC12769.f35950c = c22156Arr4;
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        concurrentMapC12769.cellsBusy = 0;
                                        if (z3) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        concurrentMapC12769.cellsBusy = 0;
                                        throw th2;
                                    }
                                } else {
                                    c19809 = f35940h;
                                    j2 = f35943k;
                                    j3 = concurrentMapC12769.baseCount;
                                    if (c19809.m45037d(concurrentMapC12769, j2, j3, j3 + j)) {
                                        return;
                                    }
                                }
                            } else {
                                c19809 = f35940h;
                                j2 = f35943k;
                                j3 = concurrentMapC12769.baseCount;
                                if (c19809.m45037d(concurrentMapC12769, j2, j3, j3 + j)) {
                                    return;
                                }
                            }
                            z = z2;
                            concurrentMapC12769 = this;
                            i3 = 0;
                        }
                    }
                    try {
                        if (concurrentMapC12769.f35950c == c22156Arr) {
                            concurrentMapC12769.f35950c = (C22156[]) Arrays.copyOf(c22156Arr, length << 1);
                        }
                        i3 = 0;
                        concurrentMapC12769.cellsBusy = 0;
                        ConcurrentMapC12768 concurrentMapC127611 = concurrentMapC12769;
                        i2 = i4;
                        concurrentMapC12768 = concurrentMapC127611;
                    } catch (Throwable th3) {
                        concurrentMapC12769.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        }
        if (i < 0) {
            return;
        }
        while (true) {
            int i12 = this.sizeCtl;
            if (jM29320j < i12 || (c2708Arr = this.f35948a) == null || (length4 = c2708Arr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i12 < 0) {
                if ((i12 >>> 16) != iNumberOfLeadingZeros || i12 == iNumberOfLeadingZeros + 1 || i12 == iNumberOfLeadingZeros + 65535 || (c2708Arr2 = this.f35949b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (f35940h.m45036c(this, f35941i, i12, i12 + 1)) {
                    m29321m(c2708Arr, c2708Arr2);
                }
            } else if (f35940h.m45036c(this, f35941i, i12, (iNumberOfLeadingZeros << 16) + 2)) {
                m29321m(c2708Arr, null);
            }
            jM29320j = m29320j();
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2708[] m29316d(C2708[] c2708Arr, C2708 c2708) {
        int i;
        if (c2708 instanceof C4721) {
            C2708[] c2708Arr2 = ((C4721) c2708).f10674e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(c2708Arr.length) | 32768;
            while (c2708Arr2 == this.f35949b && this.f35948a == c2708Arr && (i = this.sizeCtl) < 0 && (i >>> 16) == iNumberOfLeadingZeros && i != iNumberOfLeadingZeros + 1 && i != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (f35940h.m45036c(this, f35941i, i, i + 1)) {
                    m29321m(c2708Arr, c2708Arr2);
                    break;
                }
            }
            return c2708Arr2;
        }
        return this.f35948a;
    }

    /* JADX INFO: renamed from: o */
    public final void m29323o(int i) {
        int length;
        int iM29313l = i >= 536870912 ? 1073741824 : m29313l(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                return;
            }
            C2708[] c2708Arr = this.f35948a;
            if (c2708Arr == null || (length = c2708Arr.length) == 0) {
                int i3 = i2 > iM29313l ? i2 : iM29313l;
                if (f35940h.m45036c(this, f35941i, i2, -1)) {
                    try {
                        if (this.f35948a == c2708Arr) {
                            this.f35948a = new C2708[i3];
                            i2 = i3 - (i3 >>> 2);
                        }
                        this.sizeCtl = i2;
                    } catch (Throwable th) {
                        this.sizeCtl = i2;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iM29313l <= i2 || length >= 1073741824) {
                    return;
                }
                if (c2708Arr == this.f35948a) {
                    if (f35940h.m45036c(this, f35941i, i2, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m29321m(c2708Arr, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m29321m(C2708[] c2708Arr, C2708[] c2708Arr2) {
        C2708[] c2708Arr3;
        int i;
        int i2;
        int i3;
        int i4;
        C2708 c22826;
        C2708 c22827;
        C2708 c2708;
        boolean zM29308b;
        ConcurrentMapC12768 concurrentMapC12768 = this;
        C2708[] c2708Arr4 = c2708Arr;
        int length = c2708Arr4.length;
        int i5 = f35939g;
        int i6 = i5 > 1 ? (length >>> 3) / i5 : length;
        int i7 = i6 < 16 ? 16 : i6;
        if (c2708Arr2 == null) {
            try {
                C2708[] c2708Arr5 = new C2708[length << 1];
                concurrentMapC12768.f35949b = c2708Arr5;
                concurrentMapC12768.transferIndex = length;
                c2708Arr3 = c2708Arr5;
            } catch (Throwable unused) {
                concurrentMapC12768.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c2708Arr3 = c2708Arr2;
        }
        int length2 = c2708Arr3.length;
        C4721 c4721 = new C4721(c2708Arr3);
        int i8 = 0;
        int i9 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                i8--;
                if (i8 < i9 && !z2) {
                    int i10 = concurrentMapC12768.transferIndex;
                    if (i10 <= 0) {
                        i8 = -1;
                    } else {
                        C19809 c19809 = f35940h;
                        long j = f35942j;
                        int i11 = i10 > i7 ? i10 - i7 : 0;
                        if (c19809.m45036c(this, j, i10, i11)) {
                            i8 = i10 - 1;
                            i9 = i11;
                        }
                    }
                }
                z = false;
            } else {
                C23496 c23496 = null;
                C2708 c2709 = null;
                if (i8 < 0 || i8 >= length || (i4 = i8 + length) >= length2) {
                    i = i7;
                    i2 = length2;
                    i3 = i9;
                    if (z2) {
                        this.f35949b = null;
                        this.f35948a = c2708Arr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentMapC12768 = this;
                    C19809 c198010 = f35940h;
                    long j2 = f35941i;
                    int i12 = concurrentMapC12768.sizeCtl;
                    if (c198010.m45036c(this, j2, i12, i12 - 1)) {
                        if (i12 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i8 = length;
                        z = true;
                        z2 = true;
                    }
                } else {
                    C2708 c2708M29312k = m29312k(c2708Arr4, i8);
                    if (c2708M29312k == null) {
                        zM29308b = m29308b(c2708Arr4, i8, c4721);
                    } else {
                        int i13 = c2708M29312k.f4544a;
                        if (i13 == -1) {
                            zM29308b = true;
                        } else {
                            synchronized (c2708M29312k) {
                                if (m29312k(c2708Arr4, i8) == c2708M29312k) {
                                    if (i13 >= 0) {
                                        int i14 = i13 & length;
                                        C2708 c27010 = c2708M29312k;
                                        for (C2708 c27011 = c2708M29312k.f4547d; c27011 != null; c27011 = c27011.f4547d) {
                                            int i15 = c27011.f4544a & length;
                                            if (i15 != i14) {
                                                c27010 = c27011;
                                                i14 = i15;
                                            }
                                        }
                                        if (i14 == 0) {
                                            c2708 = null;
                                            c2709 = c27010;
                                        } else {
                                            c2708 = c27010;
                                        }
                                        while (c2708M29312k != c27010) {
                                            int i16 = c2708M29312k.f4544a;
                                            Object obj = c2708M29312k.f4545b;
                                            C2708 c27012 = c27010;
                                            Object obj2 = c2708M29312k.f4546c;
                                            if ((i16 & length) == 0) {
                                                c2709 = new C2708(i16, obj, obj2, c2709);
                                            } else {
                                                c2708 = new C2708(i16, obj, obj2, c2708);
                                            }
                                            c2708M29312k = c2708M29312k.f4547d;
                                            c27010 = c27012;
                                            i7 = i7;
                                        }
                                        i = i7;
                                        m29310h(c2708Arr3, i8, c2709);
                                        m29310h(c2708Arr3, i4, c2708);
                                        m29310h(c2708Arr4, i8, c4721);
                                        i2 = length2;
                                        i3 = i9;
                                    } else {
                                        i = i7;
                                        if (c2708M29312k instanceof C22826) {
                                            C22826 c22828 = (C22826) c2708M29312k;
                                            C2708 c27013 = c22828.f71905f;
                                            C23496 c23497 = null;
                                            C23496 c23498 = null;
                                            C23496 c23499 = null;
                                            int i17 = 0;
                                            int i18 = 0;
                                            while (c27013 != null) {
                                                int i19 = length2;
                                                int i20 = c27013.f4544a;
                                                int i21 = i9;
                                                C23496 c234910 = new C23496(i20, c27013.f4545b, c27013.f4546c, null, null);
                                                if ((i20 & length) == 0) {
                                                    c234910.f74855h = c23499;
                                                    if (c23499 == null) {
                                                        c23496 = c234910;
                                                    } else {
                                                        c23499.f4547d = c234910;
                                                    }
                                                    i18++;
                                                    c23499 = c234910;
                                                } else {
                                                    c234910.f74855h = c23498;
                                                    if (c23498 == null) {
                                                        c23497 = c234910;
                                                    } else {
                                                        c23498.f4547d = c234910;
                                                    }
                                                    i17++;
                                                    c23498 = c234910;
                                                }
                                                c27013 = c27013.f4547d;
                                                length2 = i19;
                                                i9 = i21;
                                            }
                                            i2 = length2;
                                            i3 = i9;
                                            if (i18 <= 6) {
                                                c22826 = m29314p(c23496);
                                            } else {
                                                c22826 = i17 != 0 ? new C22826(c23496) : c22828;
                                            }
                                            if (i17 <= 6) {
                                                c22827 = m29314p(c23497);
                                            } else {
                                                c22827 = i18 != 0 ? new C22826(c23497) : c22828;
                                            }
                                            m29310h(c2708Arr3, i8, c22826);
                                            m29310h(c2708Arr3, i4, c22827);
                                            c2708Arr4 = c2708Arr;
                                            m29310h(c2708Arr4, i8, c4721);
                                        }
                                    }
                                    z = true;
                                } else {
                                    i = i7;
                                }
                                i2 = length2;
                                i3 = i9;
                            }
                            concurrentMapC12768 = this;
                        }
                    }
                    z = zM29308b;
                    i = i7;
                    i2 = length2;
                    i3 = i9;
                }
                length2 = i2;
                i7 = i;
                i9 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final long m29320j() {
        C22156[] c22156Arr = this.f35950c;
        long j = this.baseCount;
        if (c22156Arr != null) {
            for (C22156 c22156 : c22156Arr) {
                if (c22156 != null) {
                    j += c22156.value;
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: n */
    public final void m29322n(C2708[] c2708Arr, int i) {
        int length = c2708Arr.length;
        if (length < 64) {
            m29323o(length << 1);
            return;
        }
        C2708 c2708M29312k = m29312k(c2708Arr, i);
        if (c2708M29312k == null || c2708M29312k.f4544a < 0) {
            return;
        }
        synchronized (c2708M29312k) {
            if (m29312k(c2708Arr, i) == c2708M29312k) {
                C23496 c23496 = null;
                C23496 c23497 = null;
                while (c2708M29312k != null) {
                    C23496 c23498 = new C23496(c2708M29312k.f4544a, c2708M29312k.f4545b, c2708M29312k.f4546c, null, null);
                    c23498.f74855h = c23497;
                    if (c23497 == null) {
                        c23496 = c23498;
                    } else {
                        c23497.f4547d = c23498;
                    }
                    c2708M29312k = c2708M29312k.f4547d;
                    c23497 = c23498;
                }
                m29310h(c2708Arr, i, new C22826(c23496));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C2708 m29314p(C23496 c23496) {
        C2708 c2708 = null;
        C2708 c2709 = null;
        for (C2708 c27010 = c23496; c27010 != null; c27010 = c27010.f4547d) {
            C2708 c27011 = new C2708(c27010.f4544a, c27010.f4545b, c27010.f4546c);
            if (c2709 == null) {
                c2708 = c27011;
            } else {
                c2709.f4547d = c27011;
            }
            c2709 = c27011;
        }
        return c2708;
    }
}
