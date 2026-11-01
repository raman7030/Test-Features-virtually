package p067l;

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
public final class C23772 extends AbstractC7068 implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final C23772 f75602c = new C23772();
    public static final long serialVersionUID = 459996390165777884L;

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: k */
    public final String mo10584k() {
        return "Japanese";
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: o */
    public final String mo10585o() {
        return "japanese";
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: M */
    public final InterfaceC15114 mo10579M(int i, int i2, int i3) {
        return new C7008(C20480.m46187h0(i, i2, i3));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: q */
    public final InterfaceC15114 mo10587q(int i, int i2) {
        return new C7008(C20480.m46189j0(i, i2));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: j */
    public final InterfaceC15114 mo10583j(long j) {
        return new C7008(C20480.m46188i0(j));
    }

    @Override // p067l.AbstractC7068
    /* JADX INFO: renamed from: m */
    public final InterfaceC15114 mo12725m() {
        return new C7008(C20480.m46185X(C20480.m46186g0(AbstractC11092.m25535a())));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: E */
    public final InterfaceC15114 mo10577E(InterfaceC4524 interfaceC4524) {
        if (interfaceC4524 instanceof C7008) {
            return (C7008) interfaceC4524;
        }
        return new C7008(C20480.m46185X(interfaceC4524));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: x */
    public final List mo10589x() {
        C5667[] c5667Arr = C5667.f13787e;
        return AbstractC24029.m53212B((C5667[]) Arrays.copyOf(c5667Arr, c5667Arr.length));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: S */
    public final boolean mo10582S(long j) {
        return C10361.f28676c.mo10582S(j);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: z */
    public final int mo10591z(InterfaceC6338 interfaceC6338, int i) {
        if (!(interfaceC6338 instanceof C5667)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((C5667) interfaceC6338).f13789b.f63259a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || interfaceC6338 != C5667.m12624j(C20480.m46187h0(i3, 1, 1)))) {
            throw new C17796("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: y */
    public final InterfaceC6338 mo10590y(int i) {
        return C5667.m12625o(i);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: v */
    public final C23970 mo10588v(EnumC19947 enumC19947) {
        switch (AbstractC23102.f72601a[enumC19947.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C13242("Unsupported field: " + enumC19947);
            case 5:
                C5667[] c5667Arr = C5667.f13787e;
                int i = c5667Arr[c5667Arr.length - 1].f13789b.f63259a;
                int iMin = BasicLabelFormatter.BILLION - c5667Arr[c5667Arr.length - 1].f13789b.f63259a;
                int i2 = c5667Arr[0].f13789b.f63259a;
                int i3 = 1;
                while (true) {
                    C5667[] c5667Arr2 = C5667.f13787e;
                    if (i3 >= c5667Arr2.length) {
                        return C23970.m53120g(1L, iMin, 999999999 - i);
                    }
                    C5667 c5667 = c5667Arr2[i3];
                    iMin = Math.min(iMin, (c5667.f13789b.f63259a - i2) + 1);
                    i2 = c5667.f13789b.f63259a;
                    i3++;
                }
                break;
            case 6:
                C5667 c5668 = C5667.f13786d;
                long j = EnumC19947.DAY_OF_YEAR.f60552b.f76158c;
                long jMin = j;
                for (C5667 c5669 : C5667.f13787e) {
                    long jMin2 = Math.min(jMin, (c5669.f13789b.mo16122Q() - c5669.f13789b.m46194a0()) + 1);
                    jMin = c5669.m12626k() != null ? Math.min(jMin2, c5669.m12626k().f13789b.m46194a0() - 1) : jMin2;
                }
                return C23970.m53120g(1L, jMin, EnumC19947.DAY_OF_YEAR.f60552b.f76159d);
            case 7:
                return C23970.m53119f(C7008.f18257d.f63259a, 999999999L);
            case 8:
                long j2 = C5667.f13786d.f13788a;
                C5667[] c5667Arr3 = C5667.f13787e;
                return C23970.m53119f(j2, c5667Arr3[c5667Arr3.length - 1].f13788a);
            default:
                return enumC19947.f60552b;
        }
    }

    @Override // p067l.AbstractC7068, p067l.InterfaceC4997
    /* JADX INFO: renamed from: O */
    public final InterfaceC15114 mo10580O(Map map, EnumC18645 enumC18645) {
        return (C7008) super.mo10580O(map, enumC18645);
    }

    @Override // p067l.AbstractC7068
    /* JADX INFO: renamed from: T */
    public final InterfaceC15114 mo16289T(Map map, EnumC18645 enumC18645) {
        C20480 c20480M46189j0;
        C7008 c7008M16129c0;
        EnumC19947 enumC19947 = EnumC19947.ERA;
        Long l2 = (Long) map.get(enumC19947);
        C5667 c5667M12625o = l2 != null ? C5667.m12625o(mo10588v(enumC19947).m53121a(l2.longValue(), enumC19947)) : null;
        EnumC19947 enumC19948 = EnumC19947.YEAR_OF_ERA;
        Long l3 = (Long) map.get(enumC19948);
        int iM53121a = l3 != null ? mo10588v(enumC19948).m53121a(l3.longValue(), enumC19948) : 0;
        if (c5667M12625o == null && l3 != null && !map.containsKey(EnumC19947.YEAR) && enumC18645 != EnumC18645.STRICT) {
            C5667[] c5667Arr = C5667.f13787e;
            c5667M12625o = ((C5667[]) Arrays.copyOf(c5667Arr, c5667Arr.length))[((C5667[]) Arrays.copyOf(c5667Arr, c5667Arr.length)).length - 1];
        }
        if (l3 != null && c5667M12625o != null) {
            EnumC19947 enumC19949 = EnumC19947.MONTH_OF_YEAR;
            if (map.containsKey(enumC19949)) {
                EnumC19947 enumC199410 = EnumC19947.DAY_OF_MONTH;
                if (map.containsKey(enumC199410)) {
                    map.remove(enumC19947);
                    map.remove(enumC19948);
                    if (enumC18645 == EnumC18645.LENIENT) {
                        return new C7008(C20480.m46187h0((c5667M12625o.f13789b.f63259a + iM53121a) - 1, 1, 1)).m16127a0(AbstractC24029.m53228R(((Long) map.remove(enumC19949)).longValue(), 1L), EnumC10559.MONTHS).m16127a0(AbstractC24029.m53228R(((Long) map.remove(enumC199410)).longValue(), 1L), EnumC10559.DAYS);
                    }
                    int iM53121a2 = mo10588v(enumC19949).m53121a(((Long) map.remove(enumC19949)).longValue(), enumC19949);
                    int iM53121a3 = mo10588v(enumC199410).m53121a(((Long) map.remove(enumC199410)).longValue(), enumC199410);
                    if (enumC18645 != EnumC18645.SMART) {
                        C20480 c20480 = C7008.f18257d;
                        C12826.requireNonNull(c5667M12625o, "era");
                        C20480 c20480M46187h0 = C20480.m46187h0((c5667M12625o.f13789b.f63259a + iM53121a) - 1, iM53121a2, iM53121a3);
                        if (c20480M46187h0.m46196c0(c5667M12625o.f13789b) || c5667M12625o != C5667.m12624j(c20480M46187h0)) {
                            throw new C17796("year, month, and day not valid for Era");
                        }
                        return new C7008(c5667M12625o, iM53121a, c20480M46187h0);
                    }
                    if (iM53121a < 1) {
                        throw new C17796("Invalid YearOfEra: " + iM53121a);
                    }
                    int i = (c5667M12625o.f13789b.f63259a + iM53121a) - 1;
                    try {
                        c7008M16129c0 = new C7008(C20480.m46187h0(i, iM53121a2, iM53121a3));
                    } catch (C17796 unused) {
                        c7008M16129c0 = new C7008(C20480.m46187h0(i, iM53121a2, 1)).m16129c0(new C10500(3));
                    }
                    if (c7008M16129c0.f18259b == c5667M12625o || AbstractC7877.m18193a(c7008M16129c0, EnumC19947.YEAR_OF_ERA) <= 1 || iM53121a <= 1) {
                        return c7008M16129c0;
                    }
                    throw new C17796("Invalid YearOfEra for Era: " + c5667M12625o + " " + iM53121a);
                }
            }
            EnumC19947 enumC199411 = EnumC19947.DAY_OF_YEAR;
            if (map.containsKey(enumC199411)) {
                map.remove(enumC19947);
                map.remove(enumC19948);
                if (enumC18645 == EnumC18645.LENIENT) {
                    return new C7008(C20480.m46189j0((c5667M12625o.f13789b.f63259a + iM53121a) - 1, 1)).m16127a0(AbstractC24029.m53228R(((Long) map.remove(enumC199411)).longValue(), 1L), EnumC10559.DAYS);
                }
                int iM53121a4 = mo10588v(enumC199411).m53121a(((Long) map.remove(enumC199411)).longValue(), enumC199411);
                C20480 c20481 = C7008.f18257d;
                C12826.requireNonNull(c5667M12625o, "era");
                if (iM53121a == 1) {
                    C20480 c20482 = c5667M12625o.f13789b;
                    c20480M46189j0 = C20480.m46189j0(c20482.f63259a, (c20482.m46194a0() + iM53121a4) - 1);
                } else {
                    c20480M46189j0 = C20480.m46189j0((c5667M12625o.f13789b.f63259a + iM53121a) - 1, iM53121a4);
                }
                if (c20480M46189j0.m46196c0(c5667M12625o.f13789b) || c5667M12625o != C5667.m12624j(c20480M46189j0)) {
                    throw new C17796("Invalid parameters");
                }
                return new C7008(c5667M12625o, iM53121a, c20480M46189j0);
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: P */
    public final InterfaceC23832 mo10581P(C6398 c6398, AbstractC7739 abstractC7739) {
        return C11032.m25441W(this, c6398, abstractC7739);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C9750((byte) 1, this);
    }
}
