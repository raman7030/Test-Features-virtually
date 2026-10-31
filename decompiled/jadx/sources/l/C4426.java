package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4426 {
    public static final C8556 h = new C8556(2);
    public static final Map i;
    public C4426 a;
    public final C4426 b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', EnumC18496.ERA);
        map.put('y', EnumC18496.YEAR_OF_ERA);
        map.put('u', EnumC18496.YEAR);
        EnumC14967 enumC14967 = AbstractC22024.a;
        map.put('Q', enumC14967);
        map.put('q', enumC14967);
        EnumC18496 enumC18496 = EnumC18496.MONTH_OF_YEAR;
        map.put('M', enumC18496);
        map.put('L', enumC18496);
        map.put('D', EnumC18496.DAY_OF_YEAR);
        map.put('d', EnumC18496.DAY_OF_MONTH);
        map.put('F', EnumC18496.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC18496 enumC18497 = EnumC18496.DAY_OF_WEEK;
        map.put('E', enumC18497);
        map.put('c', enumC18497);
        map.put('e', enumC18497);
        map.put('a', EnumC18496.AMPM_OF_DAY);
        map.put('H', EnumC18496.HOUR_OF_DAY);
        map.put('k', EnumC18496.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC18496.HOUR_OF_AMPM);
        map.put('h', EnumC18496.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC18496.MINUTE_OF_HOUR);
        map.put('s', EnumC18496.SECOND_OF_MINUTE);
        EnumC18496 enumC18498 = EnumC18496.NANO_OF_SECOND;
        map.put('S', enumC18498);
        map.put('A', EnumC18496.MILLI_OF_DAY);
        map.put('n', enumC18498);
        map.put('N', EnumC18496.NANO_OF_DAY);
        map.put('g', AbstractC4385.a);
    }

    public C4426() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public C4426(C4426 c4426) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = c4426;
        this.d = true;
    }

    public final void k(InterfaceC10030 interfaceC10030) {
        C11003.requireNonNull(interfaceC10030, "field");
        j(new C2310(interfaceC10030, 1, 19, EnumC23476.NORMAL));
    }

    public final void l(InterfaceC10030 interfaceC10030, int i2) {
        C11003.requireNonNull(interfaceC10030, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        j(new C2310(interfaceC10030, i2, i2, EnumC23476.NOT_NEGATIVE));
    }

    public final void m(InterfaceC10030 interfaceC10030, int i2, int i3, EnumC23476 enumC23476) {
        if (i2 == i3 && enumC23476 == EnumC23476.NOT_NEGATIVE) {
            l(interfaceC10030, i3);
            return;
        }
        C11003.requireNonNull(interfaceC10030, "field");
        C11003.requireNonNull(enumC23476, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
        j(new C2310(interfaceC10030, i2, i3, enumC23476));
    }

    public final void j(C2310 c2310) {
        C2310 c2310D;
        C4426 c4426 = this.a;
        int i2 = c4426.g;
        if (i2 < 0) {
            c4426.g = c(c2310);
            return;
        }
        C2310 c2311 = (C2310) ((ArrayList) c4426.c).get(i2);
        int i3 = c2310.b;
        int i4 = c2310.c;
        if (i3 == i4 && c2310.d == EnumC23476.NOT_NEGATIVE) {
            c2310D = c2311.e(i4);
            c(c2310.d());
            this.a.g = i2;
        } else {
            c2310D = c2311.d();
            this.a.g = c(c2310);
        }
        ((ArrayList) this.a.c).set(i2, c2310D);
    }

    public final void b(EnumC18496 enumC18496, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            j(new C6543(enumC18496, i2, i3, z));
        } else {
            c(new C6543(enumC18496, i2, i3, z));
        }
    }

    public final void i(InterfaceC10030 interfaceC10030, EnumC20655 enumC20655) {
        C11003.requireNonNull(interfaceC10030, "field");
        C11003.requireNonNull(enumC20655, "textStyle");
        c(new C15008(interfaceC10030, enumC20655, C14052.c));
    }

    public final void h(EnumC18496 enumC18496, Map map) {
        C11003.requireNonNull(enumC18496, "field");
        C11003.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        EnumC20655 enumC20655 = EnumC20655.FULL;
        c(new C15008(enumC18496, enumC20655, new C23225(new C11937(Collections.singletonMap(enumC20655, linkedHashMap)))));
    }

    public final void g(String str, String str2) {
        c(new C3721(str, str2));
    }

    public final void f(EnumC20655 enumC20655) {
        C11003.requireNonNull(enumC20655, "style");
        if (enumC20655 != EnumC20655.FULL && enumC20655 != EnumC20655.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new C15714(0, enumC20655));
    }

    public final void d(char c) {
        c(new C10777(c));
    }

    public final void e(String str) {
        C11003.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new C10777(str.charAt(0)));
        } else {
            c(new C15714(1, str));
        }
    }

    public final void a(C6292 c6292) {
        C11003.requireNonNull(c6292, "formatter");
        C17832 c17832 = c6292.a;
        if (c17832.b) {
            c17832 = new C17832(c17832.a, false);
        }
        c(c17832);
    }

    public final void o() {
        C4426 c4426 = this.a;
        c4426.g = -1;
        this.a = new C4426(c4426);
    }

    public final void n() {
        C4426 c4426 = this.a;
        if (c4426.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) c4426.c).size() > 0) {
            C4426 c4427 = this.a;
            C17832 c17832 = new C17832(c4427.c, c4427.d);
            this.a = this.a.b;
            c(c17832);
            return;
        }
        this.a = this.a.b;
    }

    public final int c(InterfaceC14303 interfaceC14303) {
        C11003.requireNonNull(interfaceC14303, "pp");
        C4426 c4426 = this.a;
        int i2 = c4426.e;
        if (i2 > 0) {
            if (interfaceC14303 != null) {
                interfaceC14303 = new C18538(interfaceC14303, i2, c4426.f);
            }
            c4426.e = 0;
            c4426.f = (char) 0;
        }
        ((ArrayList) c4426.c).add(interfaceC14303);
        C4426 c4427 = this.a;
        c4427.g = -1;
        return ((ArrayList) c4427.c).size() - 1;
    }

    public final C6292 p(EnumC17126 enumC17126, InterfaceC2765 interfaceC2765) {
        return q(Locale.getDefault(), enumC17126, interfaceC2765);
    }

    public final C6292 q(Locale locale, EnumC17126 enumC17126, InterfaceC2765 interfaceC2765) {
        C11003.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        C17832 c17832 = new C17832(this.c, false);
        C1604 c1604 = C1604.a;
        return new C6292(c17832, locale, enumC17126, interfaceC2765);
    }
}
