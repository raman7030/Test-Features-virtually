package p067l;

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
public final class C6575 {

    /* JADX INFO: renamed from: h */
    public static final C10500 f16976h = new C10500(2);

    /* JADX INFO: renamed from: i */
    public static final Map f16977i;

    /* JADX INFO: renamed from: a */
    public C6575 f16978a;

    /* JADX INFO: renamed from: b */
    public final C6575 f16979b;

    /* JADX INFO: renamed from: c */
    public final List f16980c;

    /* JADX INFO: renamed from: d */
    public final boolean f16981d;

    /* JADX INFO: renamed from: e */
    public int f16982e;

    /* JADX INFO: renamed from: f */
    public char f16983f;

    /* JADX INFO: renamed from: g */
    public int f16984g;

    static {
        HashMap map = new HashMap();
        f16977i = map;
        map.put('G', EnumC19947.ERA);
        map.put('y', EnumC19947.YEAR_OF_ERA);
        map.put('u', EnumC19947.YEAR);
        EnumC16593 enumC16593 = AbstractC23300.f73302a;
        map.put('Q', enumC16593);
        map.put('q', enumC16593);
        EnumC19947 enumC19947 = EnumC19947.MONTH_OF_YEAR;
        map.put('M', enumC19947);
        map.put('L', enumC19947);
        map.put('D', EnumC19947.DAY_OF_YEAR);
        map.put('d', EnumC19947.DAY_OF_MONTH);
        map.put('F', EnumC19947.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC19947 enumC19948 = EnumC19947.DAY_OF_WEEK;
        map.put('E', enumC19948);
        map.put('c', enumC19948);
        map.put('e', enumC19948);
        map.put('a', EnumC19947.AMPM_OF_DAY);
        map.put('H', EnumC19947.HOUR_OF_DAY);
        map.put('k', EnumC19947.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC19947.HOUR_OF_AMPM);
        map.put('h', EnumC19947.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC19947.MINUTE_OF_HOUR);
        map.put('s', EnumC19947.SECOND_OF_MINUTE);
        EnumC19947 enumC19949 = EnumC19947.NANO_OF_SECOND;
        map.put('S', enumC19949);
        map.put('A', EnumC19947.MILLI_OF_DAY);
        map.put('n', enumC19949);
        map.put('N', EnumC19947.NANO_OF_DAY);
        map.put('g', AbstractC6536.f16885a);
    }

    public C6575() {
        this.f16978a = this;
        this.f16980c = new ArrayList();
        this.f16984g = -1;
        this.f16979b = null;
        this.f16981d = false;
    }

    public C6575(C6575 c6575) {
        this.f16978a = this;
        this.f16980c = new ArrayList();
        this.f16984g = -1;
        this.f16979b = c6575;
        this.f16981d = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m15022k(InterfaceC11901 interfaceC11901) {
        C12826.requireNonNull(interfaceC11901, "field");
        m15021j(new C4564(interfaceC11901, 1, 19, EnumC24680.NORMAL));
    }

    /* JADX INFO: renamed from: l */
    public final void m15023l(InterfaceC11901 interfaceC11901, int i) {
        C12826.requireNonNull(interfaceC11901, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m15021j(new C4564(interfaceC11901, i, i, EnumC24680.NOT_NEGATIVE));
    }

    /* JADX INFO: renamed from: m */
    public final void m15024m(InterfaceC11901 interfaceC11901, int i, int i2, EnumC24680 enumC24680) {
        if (i == i2 && enumC24680 == EnumC24680.NOT_NEGATIVE) {
            m15023l(interfaceC11901, i2);
            return;
        }
        C12826.requireNonNull(interfaceC11901, "field");
        C12826.requireNonNull(enumC24680, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
        m15021j(new C4564(interfaceC11901, i, i2, enumC24680));
    }

    /* JADX INFO: renamed from: j */
    public final void m15021j(C4564 c4564) {
        C4564 c4564Mo5563d;
        C6575 c6575 = this.f16978a;
        int i = c6575.f16984g;
        if (i < 0) {
            c6575.f16984g = m15014c(c4564);
            return;
        }
        C4564 c4565 = (C4564) ((ArrayList) c6575.f16980c).get(i);
        int i2 = c4564.f10233b;
        int i3 = c4564.f10234c;
        if (i2 == i3 && c4564.f10235d == EnumC24680.NOT_NEGATIVE) {
            c4564Mo5563d = c4565.mo5564e(i3);
            m15014c(c4564.mo5563d());
            this.f16978a.f16984g = i;
        } else {
            c4564Mo5563d = c4565.mo5563d();
            this.f16978a.f16984g = m15014c(c4564);
        }
        ((ArrayList) this.f16978a.f16980c).set(i, c4564Mo5563d);
    }

    /* JADX INFO: renamed from: b */
    public final void m15013b(EnumC19947 enumC19947, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            m15021j(new C8587(enumC19947, i, i2, z));
        } else {
            m15014c(new C8587(enumC19947, i, i2, z));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15020i(InterfaceC11901 interfaceC11901, EnumC21999 enumC21999) {
        C12826.requireNonNull(interfaceC11901, "field");
        C12826.requireNonNull(enumC21999, "textStyle");
        m15014c(new C16632(interfaceC11901, enumC21999, C15724.f45562c));
    }

    /* JADX INFO: renamed from: h */
    public final void m15019h(EnumC19947 enumC19947, Map map) {
        C12826.requireNonNull(enumC19947, "field");
        C12826.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        EnumC21999 enumC21999 = EnumC21999.FULL;
        m15014c(new C16632(enumC19947, enumC21999, new C24442(new C13714(Collections.singletonMap(enumC21999, linkedHashMap)))));
    }

    /* JADX INFO: renamed from: g */
    public final void m15018g(String str, String str2) {
        m15014c(new C5905(str, str2));
    }

    /* JADX INFO: renamed from: f */
    public final void m15017f(EnumC21999 enumC21999) {
        C12826.requireNonNull(enumC21999, "style");
        if (enumC21999 != EnumC21999.FULL && enumC21999 != EnumC21999.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        m15014c(new C17303(0, enumC21999));
    }

    /* JADX INFO: renamed from: d */
    public final void m15015d(char c) {
        m15014c(new C12611(c));
    }

    /* JADX INFO: renamed from: e */
    public final void m15016e(String str) {
        C12826.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            m15014c(new C12611(str.charAt(0)));
        } else {
            m15014c(new C17303(1, str));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15012a(C8349 c8349) {
        C12826.requireNonNull(c8349, "formatter");
        C19316 c19316 = c8349.f22321a;
        if (c19316.f57677b) {
            c19316 = new C19316(c19316.f57676a, false);
        }
        m15014c(c19316);
    }

    /* JADX INFO: renamed from: o */
    public final void m15026o() {
        C6575 c6575 = this.f16978a;
        c6575.f16984g = -1;
        this.f16978a = new C6575(c6575);
    }

    /* JADX INFO: renamed from: n */
    public final void m15025n() {
        C6575 c6575 = this.f16978a;
        if (c6575.f16979b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) c6575.f16980c).size() > 0) {
            C6575 c6576 = this.f16978a;
            C19316 c19316 = new C19316(c6576.f16980c, c6576.f16981d);
            this.f16978a = this.f16978a.f16979b;
            m15014c(c19316);
            return;
        }
        this.f16978a = this.f16978a.f16979b;
    }

    /* JADX INFO: renamed from: c */
    public final int m15014c(InterfaceC15962 interfaceC15962) {
        C12826.requireNonNull(interfaceC15962, "pp");
        C6575 c6575 = this.f16978a;
        int i = c6575.f16982e;
        if (i > 0) {
            if (interfaceC15962 != null) {
                interfaceC15962 = new C19987(interfaceC15962, i, c6575.f16983f);
            }
            c6575.f16982e = 0;
            c6575.f16983f = (char) 0;
        }
        ((ArrayList) c6575.f16980c).add(interfaceC15962);
        C6575 c6576 = this.f16978a;
        c6576.f16984g = -1;
        return ((ArrayList) c6576.f16980c).size() - 1;
    }

    /* JADX INFO: renamed from: p */
    public final C8349 m15027p(EnumC18645 enumC18645, InterfaceC4997 interfaceC4997) {
        return m15028q(Locale.getDefault(), enumC18645, interfaceC4997);
    }

    /* JADX INFO: renamed from: q */
    public final C8349 m15028q(Locale locale, EnumC18645 enumC18645, InterfaceC4997 interfaceC4997) {
        C12826.requireNonNull(locale, "locale");
        while (this.f16978a.f16979b != null) {
            m15025n();
        }
        C19316 c19316 = new C19316(this.f16980c, false);
        C3893 c3893 = C3893.f8438a;
        return new C8349(c19316, locale, enumC18645, interfaceC4997);
    }
}
