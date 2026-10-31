package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22520 extends AbstractC4944 implements Serializable {
    public static final C22520 c = new C22520();
    public static final long serialVersionUID = 459996390165777884L;

    @Override // l.InterfaceC2765
    public final String k() {
        return "Japanese";
    }

    @Override // l.InterfaceC2765
    public final String o() {
        return "japanese";
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 M(int i, int i2, int i3) {
        return new C4881(C19056.h0(i, i2, i3));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 q(int i, int i2) {
        return new C4881(C19056.j0(i, i2));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 j(long j) {
        return new C4881(C19056.i0(j));
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 m() {
        return new C4881(C19056.X(C19056.g0(AbstractC9178.a())));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 E(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268 instanceof C4881) {
            return (C4881) interfaceC2268;
        }
        return new C4881(C19056.X(interfaceC2268));
    }

    @Override // l.InterfaceC2765
    public final List x() {
        C3470[] c3470Arr = C3470.e;
        return AbstractC22791.B((C3470[]) Arrays.copyOf(c3470Arr, c3470Arr.length));
    }

    @Override // l.InterfaceC2765
    public final boolean S(long j) {
        return C8409.c.S(j);
    }

    @Override // l.InterfaceC2765
    public final int z(InterfaceC4176 interfaceC4176, int i) {
        if (!(interfaceC4176 instanceof C3470)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((C3470) interfaceC4176).b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || interfaceC4176 != C3470.j(C19056.h0(i3, 1, 1)))) {
            throw new C16232("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // l.InterfaceC2765
    public final InterfaceC4176 y(int i) {
        return C3470.o(i);
    }

    @Override // l.InterfaceC2765
    public final C22729 v(EnumC18496 enumC18496) {
        switch (AbstractC21815.a[enumC18496.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C11441("Unsupported field: " + enumC18496);
            case 5:
                C3470[] c3470Arr = C3470.e;
                int i = c3470Arr[c3470Arr.length - 1].b.a;
                int iMin = BasicLabelFormatter.BILLION - c3470Arr[c3470Arr.length - 1].b.a;
                int i2 = c3470Arr[0].b.a;
                int i3 = 1;
                while (true) {
                    C3470[] c3470Arr2 = C3470.e;
                    if (i3 >= c3470Arr2.length) {
                        return C22729.g(1L, iMin, 999999999 - i);
                    }
                    C3470 c3470 = c3470Arr2[i3];
                    iMin = Math.min(iMin, (c3470.b.a - i2) + 1);
                    i2 = c3470.b.a;
                    i3++;
                }
                break;
            case 6:
                C3470 c3471 = C3470.d;
                long j = EnumC18496.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (C3470 c3472 : C3470.e) {
                    long jMin2 = Math.min(jMin, (c3472.b.Q() - c3472.b.a0()) + 1);
                    jMin = c3472.k() != null ? Math.min(jMin2, c3472.k().b.a0() - 1) : jMin2;
                }
                return C22729.g(1L, jMin, EnumC18496.DAY_OF_YEAR.b.d);
            case 7:
                return C22729.f(C4881.d.a, 999999999L);
            case 8:
                long j2 = C3470.d.a;
                C3470[] c3470Arr3 = C3470.e;
                return C22729.f(j2, c3470Arr3[c3470Arr3.length - 1].a);
            default:
                return enumC18496.b;
        }
    }

    @Override // l.AbstractC4944, l.InterfaceC2765
    public final InterfaceC13410 O(Map map, EnumC17126 enumC17126) {
        return (C4881) super.O(map, enumC17126);
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 T(Map map, EnumC17126 enumC17126) {
        C19056 c19056J0;
        C4881 c4881C0;
        EnumC18496 enumC18496 = EnumC18496.ERA;
        Long l2 = (Long) map.get(enumC18496);
        C3470 c3470O = l2 != null ? C3470.o(v(enumC18496).a(l2.longValue(), enumC18496)) : null;
        EnumC18496 enumC18497 = EnumC18496.YEAR_OF_ERA;
        Long l3 = (Long) map.get(enumC18497);
        int iA = l3 != null ? v(enumC18497).a(l3.longValue(), enumC18497) : 0;
        if (c3470O == null && l3 != null && !map.containsKey(EnumC18496.YEAR) && enumC17126 != EnumC17126.STRICT) {
            C3470[] c3470Arr = C3470.e;
            c3470O = ((C3470[]) Arrays.copyOf(c3470Arr, c3470Arr.length))[((C3470[]) Arrays.copyOf(c3470Arr, c3470Arr.length)).length - 1];
        }
        if (l3 != null && c3470O != null) {
            EnumC18496 enumC18498 = EnumC18496.MONTH_OF_YEAR;
            if (map.containsKey(enumC18498)) {
                EnumC18496 enumC18499 = EnumC18496.DAY_OF_MONTH;
                if (map.containsKey(enumC18499)) {
                    map.remove(enumC18496);
                    map.remove(enumC18497);
                    if (enumC17126 == EnumC17126.LENIENT) {
                        return new C4881(C19056.h0((c3470O.b.a + iA) - 1, 1, 1)).a0(AbstractC22791.R(((Long) map.remove(enumC18498)).longValue(), 1L), EnumC8618.MONTHS).a0(AbstractC22791.R(((Long) map.remove(enumC18499)).longValue(), 1L), EnumC8618.DAYS);
                    }
                    int iA2 = v(enumC18498).a(((Long) map.remove(enumC18498)).longValue(), enumC18498);
                    int iA3 = v(enumC18499).a(((Long) map.remove(enumC18499)).longValue(), enumC18499);
                    if (enumC17126 != EnumC17126.SMART) {
                        C19056 c19056 = C4881.d;
                        C11003.requireNonNull(c3470O, "era");
                        C19056 c19056H0 = C19056.h0((c3470O.b.a + iA) - 1, iA2, iA3);
                        if (c19056H0.c0(c3470O.b) || c3470O != C3470.j(c19056H0)) {
                            throw new C16232("year, month, and day not valid for Era");
                        }
                        return new C4881(c3470O, iA, c19056H0);
                    }
                    if (iA < 1) {
                        throw new C16232("Invalid YearOfEra: " + iA);
                    }
                    int i = (c3470O.b.a + iA) - 1;
                    try {
                        c4881C0 = new C4881(C19056.h0(i, iA2, iA3));
                    } catch (C16232 unused) {
                        c4881C0 = new C4881(C19056.h0(i, iA2, 1)).c0(new C8556(3));
                    }
                    if (c4881C0.b == c3470O || AbstractC5796.a(c4881C0, EnumC18496.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return c4881C0;
                    }
                    throw new C16232("Invalid YearOfEra for Era: " + c3470O + " " + iA);
                }
            }
            EnumC18496 enumC184910 = EnumC18496.DAY_OF_YEAR;
            if (map.containsKey(enumC184910)) {
                map.remove(enumC18496);
                map.remove(enumC18497);
                if (enumC17126 == EnumC17126.LENIENT) {
                    return new C4881(C19056.j0((c3470O.b.a + iA) - 1, 1)).a0(AbstractC22791.R(((Long) map.remove(enumC184910)).longValue(), 1L), EnumC8618.DAYS);
                }
                int iA4 = v(enumC184910).a(((Long) map.remove(enumC184910)).longValue(), enumC184910);
                C19056 c19057 = C4881.d;
                C11003.requireNonNull(c3470O, "era");
                if (iA == 1) {
                    C19056 c19058 = c3470O.b;
                    c19056J0 = C19056.j0(c19058.a, (c19058.a0() + iA4) - 1);
                } else {
                    c19056J0 = C19056.j0((c3470O.b.a + iA) - 1, iA4);
                }
                if (c19056J0.c0(c3470O.b) || c3470O != C3470.j(c19056J0)) {
                    throw new C16232("Invalid parameters");
                }
                return new C4881(c3470O, iA, c19056J0);
            }
        }
        return null;
    }

    @Override // l.InterfaceC2765
    public final InterfaceC22583 P(C4239 c4239, AbstractC5650 abstractC5650) {
        return C9115.W(this, c4239, abstractC5650);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C7766((byte) 1, this);
    }
}
