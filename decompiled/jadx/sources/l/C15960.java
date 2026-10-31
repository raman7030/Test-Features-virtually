package l;

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
public final class C15960 implements Serializable {
    public static final long[] i = new long[0];
    public static final C8906[] j = new C8906[0];
    public static final C22770[] k = new C22770[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C6789[] f77964l = new C6789[0];
    public static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final C18078[] b;
    public final long[] c;
    public final C22770[] d;
    public final C18078[] e;
    public final C8906[] f;
    public final TimeZone g;
    public final transient ConcurrentMapC10942 h = new ConcurrentMapC10942();

    public static Object a(C22770 c22770, C6789 c6789) {
        C22770 c22771 = c6789.b;
        if (c6789.l()) {
            if (c22770.X(c22771)) {
                return c6789.c;
            }
            if (!c22770.X(c6789.b.b0(c6789.d.b - c6789.c.b))) {
                return c6789.d;
            }
        } else {
            if (!c22770.X(c22771)) {
                return c6789.d;
            }
            if (c22770.X(c6789.b.b0(c6789.d.b - c6789.c.b))) {
                return c6789.c;
            }
        }
        return c6789;
    }

    public C15960(long[] jArr, C18078[] c18078Arr, long[] jArr2, C18078[] c18078Arr2, C8906[] c8906Arr) {
        this.a = jArr;
        this.b = c18078Arr;
        this.c = jArr2;
        this.e = c18078Arr2;
        this.f = c8906Arr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                C6789 c6789 = new C6789(jArr2[i2], c18078Arr2[i2], c18078Arr2[i3]);
                if (c6789.l()) {
                    arrayList.add(c6789.b);
                    arrayList.add(c6789.b.b0(c6789.d.b - c6789.c.b));
                } else {
                    arrayList.add(c6789.b.b0(c6789.d.b - c6789.c.b));
                    arrayList.add(c6789.b);
                }
                i2 = i3;
            }
            this.d = (C22770[]) arrayList.toArray(new C22770[arrayList.size()]);
        }
        this.g = null;
    }

    public C15960(C18078 c18078) {
        C18078[] c18078Arr = {c18078};
        this.b = c18078Arr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c18078Arr;
        this.f = j;
        this.g = null;
    }

    public C15960(TimeZone timeZone) {
        C18078[] c18078Arr = {h(timeZone.getRawOffset())};
        this.b = c18078Arr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c18078Arr;
        this.f = j;
        this.g = timeZone;
    }

    public static C18078 h(int i2) {
        return C18078.e0(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C23722(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j2, C18078 c18078) {
        return C19056.i0(AbstractC22791.z(j2 + ((long) c18078.b), 86400)).a;
    }

    public final C18078 d(C4239 c4239) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(c4239.toEpochMilli()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = c4239.getEpochSecond();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (epochSecond > jArr[jArr.length - 1]) {
                C18078[] c18078Arr = this.e;
                C6789[] c6789ArrB = b(c(epochSecond, c18078Arr[c18078Arr.length - 1]));
                C6789 c6789 = null;
                for (int i2 = 0; i2 < c6789ArrB.length; i2++) {
                    c6789 = c6789ArrB[i2];
                    if (epochSecond < c6789.a) {
                        return c6789.c;
                    }
                }
                return c6789.d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    public final List f(C22770 c22770) {
        Object objE = e(c22770);
        if (!(objE instanceof C6789)) {
            return Collections.singletonList((C18078) objE);
        }
        C6789 c6789 = (C6789) objE;
        return c6789.l() ? Collections.EMPTY_LIST : AbstractC22791.B(new Object[]{c6789.c, c6789.d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r9.V(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r9.b.h0() <= r0.b.h0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(C22770 c22770) {
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            C6789[] c6789ArrB = b(c22770.a.a);
            if (c6789ArrB.length == 0) {
                return h(this.g.getOffset(AbstractC22791.j(c22770, this.b[0]) * 1000));
            }
            int length = c6789ArrB.length;
            while (i2 < length) {
                C6789 c6789 = c6789ArrB[i2];
                Object objA = a(c22770, c6789);
                if ((objA instanceof C6789) || objA.equals(c6789.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            C22770[] c22770Arr = this.d;
            C22770 c22771 = c22770Arr[c22770Arr.length - 1];
            if (c22771 == null) {
                long jH = c22770.a.H();
                long jH2 = c22771.a.H();
                if (jH <= jH2) {
                    if (jH == jH2) {
                    }
                }
                C6789[] c6789ArrB2 = b(c22770.a.a);
                int length2 = c6789ArrB2.length;
                while (i2 < length2) {
                    C6789 c67810 = c6789ArrB2[i2];
                    Object objA2 = a(c22770, c67810);
                    if ((objA2 instanceof C6789) || objA2.equals(c67810.c)) {
                        return objA2;
                    }
                    i2++;
                    obj = objA2;
                }
                return obj;
            }
            c22770.getClass();
        }
        int iBinarySearch = Arrays.binarySearch(this.d, c22770);
        if (iBinarySearch == -1) {
            return this.e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (iBinarySearch < objArr.length - 1) {
                int i3 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i3])) {
                    iBinarySearch = i3;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.e[(iBinarySearch / 2) + 1];
        }
        C22770[] c22770Arr2 = this.d;
        C22770 c22772 = c22770Arr2[iBinarySearch];
        C22770 c22773 = c22770Arr2[iBinarySearch + 1];
        C18078[] c18078Arr = this.e;
        int i4 = iBinarySearch / 2;
        C18078 c18078 = c18078Arr[i4];
        C18078 c18079 = c18078Arr[i4 + 1];
        return c18079.b > c18078.b ? new C6789(c22772, c18078, c18079) : new C6789(c22773, c18078, c18079);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C6789[] b(int i2) {
        C19056 c19056W;
        C6789[] c6789Arr = f77964l;
        Integer numValueOf = Integer.valueOf(i2);
        C6789[] c6789Arr2 = (C6789[]) this.h.get(numValueOf);
        if (c6789Arr2 != null) {
            return c6789Arr2;
        }
        long j2 = 1;
        int i3 = 0;
        if (this.g != null) {
            if (i2 < 1800) {
                return c6789Arr;
            }
            C22770 c22770 = C22770.c;
            C19056 c19056H0 = C19056.h0(i2 - 1, 12, 31);
            EnumC18496.HOUR_OF_DAY.T(0);
            long j3 = AbstractC22791.j(new C22770(c19056H0, C7248.h[0]), this.b[0]);
            int offset = this.g.getOffset(j3 * 1000);
            long j4 = 31968000 + j3;
            while (j3 < j4) {
                long j5 = j3 + 7776000;
                long j6 = j2;
                if (offset != this.g.getOffset(j5 * 1000)) {
                    for (long j7 = j6; j5 - j3 > j7; j7 = 1) {
                        long jZ = AbstractC22791.z(j5 + j3, 2L);
                        long j8 = j3;
                        if (this.g.getOffset(jZ * 1000) == offset) {
                            j3 = jZ;
                        } else {
                            j5 = jZ;
                            j3 = j8;
                        }
                    }
                    long j9 = j3;
                    j3 = this.g.getOffset(j9 * 1000) != offset ? j9 : j5;
                    C18078 c18078H = h(offset);
                    int offset2 = this.g.getOffset(j3 * 1000);
                    C18078 c18078H2 = h(offset2);
                    if (c(j3, c18078H2) == i2) {
                        c6789Arr = (C6789[]) Arrays.copyOf(c6789Arr, c6789Arr.length + 1);
                        c6789Arr[c6789Arr.length - 1] = new C6789(j3, c18078H, c18078H2);
                    }
                    offset = offset2;
                } else {
                    j3 = j5;
                }
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.h.putIfAbsent(numValueOf, c6789Arr);
            }
            return c6789Arr;
        }
        C8906[] c8906Arr = this.f;
        C6789[] c6789Arr3 = new C6789[c8906Arr.length];
        int i4 = 0;
        while (i4 < c8906Arr.length) {
            C8906 c8906 = c8906Arr[i4];
            byte b = c8906.b;
            if (b < 0) {
                EnumC10735 enumC10735 = c8906.a;
                long j10 = i2;
                int iW = enumC10735.W(C8409.c.S(j10)) + 1 + c8906.b;
                C19056 c19056 = C19056.d;
                EnumC18496.YEAR.T(j10);
                C11003.requireNonNull(enumC10735, "month");
                EnumC18496.DAY_OF_MONTH.T(iW);
                c19056W = C19056.W(i2, enumC10735.getValue(), iW);
                EnumC21878 enumC21878 = c8906.c;
                if (enumC21878 != null) {
                    c19056W = c19056W.B(new C12851(enumC21878.getValue(), 1));
                }
            } else {
                EnumC10735 enumC10736 = c8906.a;
                C19056 c19057 = C19056.d;
                EnumC18496.YEAR.T(i2);
                C11003.requireNonNull(enumC10736, "month");
                EnumC18496.DAY_OF_MONTH.T(b);
                c19056W = C19056.W(i2, enumC10736.getValue(), b);
                EnumC21878 enumC21879 = c8906.c;
                if (enumC21879 != null) {
                    c19056W = c19056W.B(new C12851(enumC21879.getValue(), i3));
                }
            }
            if (c8906.e) {
                c19056W = c19056W.l0(1L);
            }
            C22770 c22770Y = C22770.Y(c19056W, c8906.d);
            EnumC9612 enumC9612 = c8906.f;
            C18078 c18078 = c8906.g;
            C18078 c18079 = c8906.h;
            enumC9612.getClass();
            int i5 = AbstractC20901.a[enumC9612.ordinal()];
            if (i5 == 1) {
                c22770Y = c22770Y.b0(c18079.b - C18078.f.b);
            } else if (i5 == 2) {
                c22770Y = c22770Y.b0(c18079.b - c18078.b);
            }
            c6789Arr3[i4] = new C6789(c22770Y, c8906.h, c8906.i);
            i4++;
            i3 = 0;
        }
        if (i2 < 2100) {
            this.h.putIfAbsent(numValueOf, c6789Arr3);
        }
        return c6789Arr3;
    }

    public final boolean g(C4239 c4239) {
        C18078 c18078H;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            c18078H = h(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            c18078H = this.b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.a, c4239.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c18078H = this.b[iBinarySearch + 1];
        }
        return !c18078H.equals(d(c4239));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15960) {
            C15960 c15960 = (C15960) obj;
            if (C11003.equals(this.g, c15960.g) && Arrays.equals(this.a, c15960.a) && Arrays.equals(this.b, c15960.b) && Arrays.equals(this.c, c15960.c) && Arrays.equals(this.e, c15960.e) && Arrays.equals(this.f, c15960.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((C11003.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        C18078[] c18078Arr = this.b;
        return "ZoneRules[currentStandardOffset=" + c18078Arr[c18078Arr.length - 1] + "]";
    }
}
