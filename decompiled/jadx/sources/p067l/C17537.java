package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܺ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17537 implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final long[] f52414i = new long[0];

    /* JADX INFO: renamed from: j */
    public static final C10833[] f52415j = new C10833[0];

    /* JADX INFO: renamed from: k */
    public static final C24009[] f52416k = new C24009[0];

    /* JADX INFO: renamed from: l */
    public static final C8821[] f52417l = new C8821[0];
    public static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a */
    public final long[] f52418a;

    /* JADX INFO: renamed from: b */
    public final C19550[] f52419b;

    /* JADX INFO: renamed from: c */
    public final long[] f52420c;

    /* JADX INFO: renamed from: d */
    public final C24009[] f52421d;

    /* JADX INFO: renamed from: e */
    public final C19550[] f52422e;

    /* JADX INFO: renamed from: f */
    public final C10833[] f52423f;

    /* JADX INFO: renamed from: g */
    public final TimeZone f52424g;

    /* JADX INFO: renamed from: h */
    public final transient ConcurrentMapC12768 f52425h = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: a */
    public static Object m39912a(C24009 c24009, C8821 c8821) {
        C24009 c240010 = c8821.f23948b;
        if (c8821.m20383l()) {
            if (c24009.m53185X(c240010)) {
                return c8821.f23949c;
            }
            if (!c24009.m53185X(c8821.f23948b.m53187b0(c8821.f23950d.f59520b - c8821.f23949c.f59520b))) {
                return c8821.f23950d;
            }
        } else {
            if (!c24009.m53185X(c240010)) {
                return c8821.f23950d;
            }
            if (c24009.m53185X(c8821.f23948b.m53187b0(c8821.f23950d.f59520b - c8821.f23949c.f59520b))) {
                return c8821.f23949c;
            }
        }
        return c8821;
    }

    public C17537(long[] jArr, C19550[] c19550Arr, long[] jArr2, C19550[] c19550Arr2, C10833[] c10833Arr) {
        this.f52418a = jArr;
        this.f52419b = c19550Arr;
        this.f52420c = jArr2;
        this.f52422e = c19550Arr2;
        this.f52423f = c10833Arr;
        if (jArr2.length == 0) {
            this.f52421d = f52416k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jArr2.length) {
                int i2 = i + 1;
                C8821 c8821 = new C8821(jArr2[i], c19550Arr2[i], c19550Arr2[i2]);
                if (c8821.m20383l()) {
                    arrayList.add(c8821.f23948b);
                    arrayList.add(c8821.f23948b.m53187b0(c8821.f23950d.f59520b - c8821.f23949c.f59520b));
                } else {
                    arrayList.add(c8821.f23948b.m53187b0(c8821.f23950d.f59520b - c8821.f23949c.f59520b));
                    arrayList.add(c8821.f23948b);
                }
                i = i2;
            }
            this.f52421d = (C24009[]) arrayList.toArray(new C24009[arrayList.size()]);
        }
        this.f52424g = null;
    }

    public C17537(C19550 c19550) {
        C19550[] c19550Arr = {c19550};
        this.f52419b = c19550Arr;
        long[] jArr = f52414i;
        this.f52418a = jArr;
        this.f52420c = jArr;
        this.f52421d = f52416k;
        this.f52422e = c19550Arr;
        this.f52423f = f52415j;
        this.f52424g = null;
    }

    public C17537(TimeZone timeZone) {
        C19550[] c19550Arr = {m39914h(timeZone.getRawOffset())};
        this.f52419b = c19550Arr;
        long[] jArr = f52414i;
        this.f52418a = jArr;
        this.f52420c = jArr;
        this.f52421d = f52416k;
        this.f52422e = c19550Arr;
        this.f52423f = f52415j;
        this.f52424g = timeZone;
    }

    /* JADX INFO: renamed from: h */
    public static C19550 m39914h(int i) {
        return C19550.m44395e0(i / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C24914(this.f52424g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX INFO: renamed from: c */
    public static int m39913c(long j, C19550 c19550) {
        return C20480.m46188i0(AbstractC24029.m53257z(j + ((long) c19550.f59520b), 86400)).f63259a;
    }

    /* JADX INFO: renamed from: d */
    public final C19550 m39916d(C6398 c6398) {
        TimeZone timeZone = this.f52424g;
        if (timeZone != null) {
            return m39914h(timeZone.getOffset(c6398.toEpochMilli()));
        }
        if (this.f52420c.length == 0) {
            return this.f52419b[0];
        }
        long epochSecond = c6398.getEpochSecond();
        if (this.f52423f.length > 0) {
            long[] jArr = this.f52420c;
            if (epochSecond > jArr[jArr.length - 1]) {
                C19550[] c19550Arr = this.f52422e;
                C8821[] c8821ArrM39915b = m39915b(m39913c(epochSecond, c19550Arr[c19550Arr.length - 1]));
                C8821 c8821 = null;
                for (int i = 0; i < c8821ArrM39915b.length; i++) {
                    c8821 = c8821ArrM39915b[i];
                    if (epochSecond < c8821.f23947a) {
                        return c8821.f23949c;
                    }
                }
                return c8821.f23950d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f52420c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f52422e[iBinarySearch + 1];
    }

    /* JADX INFO: renamed from: f */
    public final List m39918f(C24009 c24009) {
        Object objM39917e = m39917e(c24009);
        if (!(objM39917e instanceof C8821)) {
            return Collections.singletonList((C19550) objM39917e);
        }
        C8821 c8821 = (C8821) objM39917e;
        return c8821.m20383l() ? Collections.EMPTY_LIST : AbstractC24029.m53212B(new Object[]{c8821.f23949c, c8821.f23950d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r9.m53184V(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r9.f76254b.m21356h0() <= r0.f76254b.m21356h0()) goto L44;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m39917e(C24009 c24009) {
        Object obj = null;
        int i = 0;
        if (this.f52424g != null) {
            C8821[] c8821ArrM39915b = m39915b(c24009.f76253a.f63259a);
            if (c8821ArrM39915b.length == 0) {
                return m39914h(this.f52424g.getOffset(AbstractC24029.m53241j(c24009, this.f52419b[0]) * 1000));
            }
            int length = c8821ArrM39915b.length;
            while (i < length) {
                C8821 c8821 = c8821ArrM39915b[i];
                Object objM39912a = m39912a(c24009, c8821);
                if ((objM39912a instanceof C8821) || objM39912a.equals(c8821.f23949c)) {
                    return objM39912a;
                }
                i++;
                obj = objM39912a;
            }
            return obj;
        }
        if (this.f52420c.length == 0) {
            return this.f52419b[0];
        }
        if (this.f52423f.length > 0) {
            C24009[] c24009Arr = this.f52421d;
            C24009 c240010 = c24009Arr[c24009Arr.length - 1];
            if (c240010 == null) {
                long jMo16118H = c24009.f76253a.mo16118H();
                long jMo16118H2 = c240010.f76253a.mo16118H();
                if (jMo16118H <= jMo16118H2) {
                    if (jMo16118H == jMo16118H2) {
                    }
                }
                C8821[] c8821ArrM39915b2 = m39915b(c24009.f76253a.f63259a);
                int length2 = c8821ArrM39915b2.length;
                while (i < length2) {
                    C8821 c8822 = c8821ArrM39915b2[i];
                    Object objM39912a2 = m39912a(c24009, c8822);
                    if ((objM39912a2 instanceof C8821) || objM39912a2.equals(c8822.f23949c)) {
                        return objM39912a2;
                    }
                    i++;
                    obj = objM39912a2;
                }
                return obj;
            }
            c24009.getClass();
        }
        int iBinarySearch = Arrays.binarySearch(this.f52421d, c24009);
        if (iBinarySearch == -1) {
            return this.f52422e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f52421d;
            if (iBinarySearch < objArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i2])) {
                    iBinarySearch = i2;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.f52422e[(iBinarySearch / 2) + 1];
        }
        C24009[] c24009Arr2 = this.f52421d;
        C24009 c240011 = c24009Arr2[iBinarySearch];
        C24009 c240012 = c24009Arr2[iBinarySearch + 1];
        C19550[] c19550Arr = this.f52422e;
        int i3 = iBinarySearch / 2;
        C19550 c19550 = c19550Arr[i3];
        C19550 c19551 = c19550Arr[i3 + 1];
        return c19551.f59520b > c19550.f59520b ? new C8821(c240011, c19550, c19551) : new C8821(c240012, c19550, c19551);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C8821[] m39915b(int i) {
        C20480 c20480M46184W;
        C8821[] c8821Arr = f52417l;
        Integer numValueOf = Integer.valueOf(i);
        C8821[] c8821Arr2 = (C8821[]) this.f52425h.get(numValueOf);
        if (c8821Arr2 != null) {
            return c8821Arr2;
        }
        long j = 1;
        int i2 = 0;
        if (this.f52424g != null) {
            if (i < 1800) {
                return c8821Arr;
            }
            C24009 c24009 = C24009.f76251c;
            C20480 c20480M46187h0 = C20480.m46187h0(i - 1, 12, 31);
            EnumC19947.HOUR_OF_DAY.m45273T(0);
            long jM53241j = AbstractC24029.m53241j(new C24009(c20480M46187h0, C9257.f25132h[0]), this.f52419b[0]);
            int offset = this.f52424g.getOffset(jM53241j * 1000);
            long j2 = 31968000 + jM53241j;
            while (jM53241j < j2) {
                long j3 = jM53241j + 7776000;
                long j4 = j;
                if (offset != this.f52424g.getOffset(j3 * 1000)) {
                    for (long j5 = j4; j3 - jM53241j > j5; j5 = 1) {
                        long jM53257z = AbstractC24029.m53257z(j3 + jM53241j, 2L);
                        long j6 = jM53241j;
                        if (this.f52424g.getOffset(jM53257z * 1000) == offset) {
                            jM53241j = jM53257z;
                        } else {
                            j3 = jM53257z;
                            jM53241j = j6;
                        }
                    }
                    long j7 = jM53241j;
                    jM53241j = this.f52424g.getOffset(j7 * 1000) != offset ? j7 : j3;
                    C19550 c19550M39914h = m39914h(offset);
                    int offset2 = this.f52424g.getOffset(jM53241j * 1000);
                    C19550 c19550M39914h2 = m39914h(offset2);
                    if (m39913c(jM53241j, c19550M39914h2) == i) {
                        c8821Arr = (C8821[]) Arrays.copyOf(c8821Arr, c8821Arr.length + 1);
                        c8821Arr[c8821Arr.length - 1] = new C8821(jM53241j, c19550M39914h, c19550M39914h2);
                    }
                    offset = offset2;
                } else {
                    jM53241j = j3;
                }
                j = 1;
            }
            if (1916 <= i && i < 2100) {
                this.f52425h.putIfAbsent(numValueOf, c8821Arr);
            }
            return c8821Arr;
        }
        C10833[] c10833Arr = this.f52423f;
        C8821[] c8821Arr3 = new C8821[c10833Arr.length];
        int i3 = 0;
        while (i3 < c10833Arr.length) {
            C10833 c10833 = c10833Arr[i3];
            byte b = c10833.f30011b;
            if (b < 0) {
                EnumC12571 enumC12571 = c10833.f30010a;
                long j8 = i;
                int iM28962W = enumC12571.m28962W(C10361.f28676c.mo10582S(j8)) + 1 + c10833.f30011b;
                C20480 c20480 = C20480.f63257d;
                EnumC19947.YEAR.m45273T(j8);
                C12826.requireNonNull(enumC12571, "month");
                EnumC19947.DAY_OF_MONTH.m45273T(iM28962W);
                c20480M46184W = C20480.m46184W(i, enumC12571.getValue(), iM28962W);
                EnumC23162 enumC23162 = c10833.f30012c;
                if (enumC23162 != null) {
                    c20480M46184W = c20480M46184W.mo16117B(new C14582(enumC23162.getValue(), 1));
                }
            } else {
                EnumC12571 enumC12572 = c10833.f30010a;
                C20480 c20481 = C20480.f63257d;
                EnumC19947.YEAR.m45273T(i);
                C12826.requireNonNull(enumC12572, "month");
                EnumC19947.DAY_OF_MONTH.m45273T(b);
                c20480M46184W = C20480.m46184W(i, enumC12572.getValue(), b);
                EnumC23162 enumC23163 = c10833.f30012c;
                if (enumC23163 != null) {
                    c20480M46184W = c20480M46184W.mo16117B(new C14582(enumC23163.getValue(), i2));
                }
            }
            if (c10833.f30014e) {
                c20480M46184W = c20480M46184W.m46201l0(1L);
            }
            C24009 c24009M53182Y = C24009.m53182Y(c20480M46184W, c10833.f30013d);
            EnumC11504 enumC11504 = c10833.f30015f;
            C19550 c19550 = c10833.f30016g;
            C19550 c19551 = c10833.f30017h;
            enumC11504.getClass();
            int i4 = AbstractC22233.f70287a[enumC11504.ordinal()];
            if (i4 == 1) {
                c24009M53182Y = c24009M53182Y.m53187b0(c19551.f59520b - C19550.f59517f.f59520b);
            } else if (i4 == 2) {
                c24009M53182Y = c24009M53182Y.m53187b0(c19551.f59520b - c19550.f59520b);
            }
            c8821Arr3[i3] = new C8821(c24009M53182Y, c10833.f30017h, c10833.f30018i);
            i3++;
            i2 = 0;
        }
        if (i < 2100) {
            this.f52425h.putIfAbsent(numValueOf, c8821Arr3);
        }
        return c8821Arr3;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m39919g(C6398 c6398) {
        C19550 c19550M39914h;
        TimeZone timeZone = this.f52424g;
        if (timeZone != null) {
            c19550M39914h = m39914h(timeZone.getRawOffset());
        } else if (this.f52420c.length == 0) {
            c19550M39914h = this.f52419b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f52418a, c6398.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c19550M39914h = this.f52419b[iBinarySearch + 1];
        }
        return !c19550M39914h.equals(m39916d(c6398));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17537) {
            C17537 c17537 = (C17537) obj;
            if (C12826.equals(this.f52424g, c17537.f52424g) && Arrays.equals(this.f52418a, c17537.f52418a) && Arrays.equals(this.f52419b, c17537.f52419b) && Arrays.equals(this.f52420c, c17537.f52420c) && Arrays.equals(this.f52422e, c17537.f52422e) && Arrays.equals(this.f52423f, c17537.f52423f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((C12826.hashCode(this.f52424g) ^ Arrays.hashCode(this.f52418a)) ^ Arrays.hashCode(this.f52419b)) ^ Arrays.hashCode(this.f52420c)) ^ Arrays.hashCode(this.f52422e)) ^ Arrays.hashCode(this.f52423f);
    }

    public final String toString() {
        TimeZone timeZone = this.f52424g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        C19550[] c19550Arr = this.f52419b;
        return "ZoneRules[currentStandardOffset=" + c19550Arr[c19550Arr.length - 1] + "]";
    }
}
