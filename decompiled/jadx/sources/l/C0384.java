package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0384 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f1812;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f1813;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f1814;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6735 f1815;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6319 f1816;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2609 f1817;

    public C0384() {
        throw null;
    }

    public C0384(C6735 c6735, C2609 c2609, C2609 c26010) {
        this.f1813 = new LinkedHashMap();
        this.f1812 = new HashMap();
        this.f1817 = c2609;
        this.f1814 = c26010;
        this.f1815 = c6735;
        this.f1816 = c6735.f20923;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m1876() {
        return m1853(new C15966(1));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m1866() {
        return m1853(new C0444(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m1856() {
        return m1853(new C18282(3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m1853(Predicate predicate) {
        C18837 c18837 = new C18837();
        Iterator it = this.f1814.iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it.next());
            if (predicate.test(c0779)) {
                c18837.m43511(c0779.f14167);
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m1873(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            if (((AbstractC4308) it.next()).m12928(this.f1817)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m1871(AbstractC4308 abstractC4308) {
        C18837 c18837 = new C18837();
        for (AbstractC4308 abstractC4309 : this.f1817) {
            if (abstractC4308.mo12912(abstractC4309)) {
                c18837.m43511(abstractC4309);
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m1877(C2609 c2609) {
        C18837<AbstractC4308> c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43512(m1871((AbstractC4308) it.next()));
        }
        C18837 c18838 = new C18837();
        for (AbstractC4308 abstractC4308 : c18837) {
            if (!c18838.contains(abstractC4308)) {
                c18838.m43511(abstractC4308);
            }
        }
        return c18838.m43517();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m1868(AbstractC4308 abstractC4308) {
        return this.f1816.m17488(abstractC4308, this.f1817, this.f1814);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m1867(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511(m1868((AbstractC4308) it.next()));
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m1859(AbstractC4308 abstractC4308) {
        C2609 c2609 = this.f1817;
        C18837 c18837 = new C18837();
        Iterator it = this.f1814.iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it.next());
            c18837.m43511(c0779.m2971() != null ? c0779.m2971() : c0779.f14167);
        }
        return this.f1816.m17488(abstractC4308, c2609, c18837.m43517());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m1857(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511(m1859((AbstractC4308) it.next()));
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1864(C2609 c2609, InterfaceC3748 interfaceC3748) {
        this.f1813.put(interfaceC3748, m1877(c2609));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1872() {
        m1875(this.f1817.m8244(m1876()));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m1875(C2609 c2609) {
        LinkedHashMap linkedHashMap = this.f1813;
        C12919 c12919 = null;
        for (Map.Entry entry : new LinkedHashMap(linkedHashMap).entrySet()) {
            if (!AbstractC4308.m12903((C2609) entry.getValue(), this.f1817.m8244(c2609))) {
                try {
                    ((InterfaceC3748) entry.getKey()).mo4673(this);
                    linkedHashMap.remove(entry.getKey());
                } catch (C12919 e) {
                    if (c12919 == null) {
                        c12919 = e;
                    }
                }
            }
        }
        if (c12919 != null) {
            throw c12919;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m1874() {
        C18837 c18837 = new C18837();
        Iterator it = this.f1814.iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it.next());
            C6319 c6319 = this.f1815.f20923;
            C0779 c07710 = new C0779((C8541) c0779.f14167, c0779.f2879, c6319);
            c0779.m2964(c07710, c6319);
            c18837.m43511(c07710);
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1870(C2609 c2609) {
        C12171.m29642(c2609 != null);
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        while (c2609.m8249() && this.f1814.m8249()) {
            C2609 c26010 = this.f1814;
            C0779 c0779 = (C0779) c26010.f8240;
            C0779 c07710 = (C0779) c2609.f8240;
            if (c0779.f14167 == c07710.f14167) {
                c07710.m2964(c0779, this.f1816);
                this.f1814 = this.f1814.f8241;
                c2609 = c2609.f8241;
                c18837.m43511(c0779);
                c18838.m43511(c0779.f14167);
            } else {
                this.f1814 = c26010.f8241;
            }
        }
        this.f1814 = c18837.m43517();
        this.f1817 = c18838.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1861(C0384 c0384, boolean z) {
        C2609 c2609 = c0384.f1817;
        C2609 c2609M8244 = this.f1817.m8244(c2609);
        c2609.getClass();
        c0384.f1817 = c2609M8244.m8248(c2609);
        C2609 c2609M1874 = z ? m1874() : this.f1814;
        C2609 c26010 = c0384.f1814;
        C2609 c2609M8245 = c2609M1874.m8244(c26010);
        c26010.getClass();
        c0384.f1814 = c2609M8245.m8248(c26010);
        Iterator it = this.f1817.iterator();
        while (it.hasNext()) {
            c0384.f1813.put(new InterfaceC3748() { // from class: l.ۡۨ֨
                @Override // l.InterfaceC3748
                /* JADX INFO: renamed from: ֫ */
                public final void mo4673(C0384 c0385) {
                    this.f26950.m1872();
                }
            }, C2609.of(it.next()));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0384 m1855(C2609 c2609, boolean z, final C1386 c1386) {
        if (c2609.m8245() != this.f1817.m8245()) {
            for (AbstractC4308 abstractC4308 : this.f1817) {
                if (!abstractC4308.m12913(EnumC9454.TYPEVAR) || !((C8541) abstractC4308).mo22227()) {
                }
            }
            final C19436 c19436 = new C19436(this);
            C5378.stream(c2609).forEach(new Consumer() { // from class: l.ᩴۨ֨
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((AbstractC4308) obj).mo2962(c19436, (Object) null);
                }
            });
            if (c19436.f62872.size() != this.f1817.m8245()) {
                C2609 c2609M8235 = C2609.m8235((Iterable) c19436.f62872);
                C2609 c2609M8244 = this.f1817.m8244(c2609M8235);
                C18837 c18837 = new C18837();
                Iterator it = c2609M8235.iterator();
                while (it.hasNext()) {
                    C0779 c0779 = (C0779) m1868((AbstractC4308) it.next());
                    C12171.m29642(c0779.f2881.isEmpty());
                    C8541 c8541 = (C8541) c0779.f14167;
                    InterfaceC5013 interfaceC5013 = c0779.f2879;
                    C6319 c6319 = this.f1816;
                    C0779 c07710 = new C0779(c8541, interfaceC5013, c6319);
                    c0779.m2964(c07710, c6319);
                    EnumC19125[] enumC19125ArrValues = EnumC19125.values();
                    int length = enumC19125ArrValues.length;
                    char c = 0;
                    int i = 0;
                    while (i < length) {
                        EnumC19125 enumC19125 = enumC19125ArrValues[i];
                        EnumC19125[] enumC19125Arr = new EnumC19125[1];
                        enumC19125Arr[c] = enumC19125;
                        c07710.m2966(enumC19125, (C2609) C5378.stream(c0779.m2963(enumC19125Arr)).filter(new C3379(3, c2609M8244)).collect(C2609.m8240()));
                        i++;
                        c = 0;
                    }
                    c18837.m43511(c07710);
                }
                C0384 c0384 = new C0384(this.f1815, c2609M8235, c18837.m43517());
                for (final AbstractC4308 abstractC4309 : c0384.f1817) {
                    c0384.m1864(C2609.of((Object) abstractC4309), new InterfaceC3748() { // from class: l.᩷ۨ֨
                        @Override // l.InterfaceC3748
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo4673(C0384 c0385) {
                            AbstractC4308 abstractC43010 = abstractC4309;
                            AbstractC4308 abstractC4308M1859 = c0385.m1859(abstractC43010);
                            Iterator it2 = ((Set) c19436.f62870.get(abstractC43010)).iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                C0384 c0386 = this.f67493;
                                if (zHasNext) {
                                    ((C0779) c0386.m1868((AbstractC4308) it2.next())).m2972(abstractC4308M1859);
                                } else {
                                    c0386.f1815.m18349(c0386, c1386);
                                    c0386.m1872();
                                    return;
                                }
                            }
                        }
                    });
                }
                if (z) {
                    final C2609 c2609M8245 = c2609M8244.m8244(C2609.m8235((Iterable) c19436.f62871));
                    c0384.m1864(c2609M8235, new InterfaceC3748() { // from class: l.ۢۨ֨
                        @Override // l.InterfaceC3748
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo4673(C0384 c0385) {
                            C2609 c26010 = c2609M8245;
                            C1386 c1387 = c1386;
                            C0384 c0386 = this.f28987;
                            c0386.m1863(c26010, c1387);
                            c0386.m1872();
                        }
                    });
                }
                return c0384;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1854(AbstractC16612 abstractC16612, C1386 c1386) {
        C6735 c6735 = this.f1815;
        C11003.requireNonNull(c6735);
        C5159 c5159 = new C5159(c6735, this, c1386);
        c6735.m18349(this, c1386);
        C0219 c0219 = new C0219(c5159);
        while (!abstractC16612.mo7999()) {
            if (c6735.f20930 != null) {
                C2609 c2609 = c6735.f20925;
                StringBuilder sb = new StringBuilder();
                Iterator it = c0219.f1476.f16125.f1814.iterator();
                while (it.hasNext()) {
                    C0779 c0779 = (C0779) ((AbstractC4308) it.next());
                    sb.append(String.format("var %s - upper bounds = %s, lower bounds = %s, eq bounds = %s\\n", c0779.f14167, c0779.m2963(EnumC19125.f60272), c0779.m2963(EnumC19125.f60273), c0779.m2963(EnumC19125.f60275)));
                }
                c6735.f20925 = c2609.m8246(C5226.m15018(c0219.f1475, "inferenceGraph" + c0219.hashCode(), sb.toString()));
            }
            C19271 c19271Mo21304 = abstractC16612.mo21304(c0219);
            C2609 c2609M8235 = C2609.m8235((Iterable) c19271Mo21304.f28700);
            C2609 c2609M1874 = m1874();
            while (AbstractC4308.m12903(m1876(), c2609M8235)) {
                try {
                    EnumC18565[] enumC18565ArrValues = EnumC18565.values();
                    int length = enumC18565ArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (m1858(c2609M8235, enumC18565ArrValues[i].f57619).m8249()) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            throw C6735.m18338((C16719) null);
                        }
                    }
                    c6735.m18349(this, c1386);
                } catch (C12919 unused) {
                    m1870(c2609M1874);
                    c6735.m18352(c2609M8235, this);
                    c6735.m18349(this, c1386);
                }
            }
            C12171.m29642(c0219.f1475.contains(c19271Mo21304));
            c0219.f1475.remove(c19271Mo21304);
            c0219.m1468(c19271Mo21304, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1862(C1386 c1386) {
        C6735 c6735 = this.f1815;
        C11003.requireNonNull(c6735);
        m1854(new C15906(this, c6735), c1386);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1863(C2609 c2609, C1386 c1386) {
        C6735 c6735 = this.f1815;
        C11003.requireNonNull(c6735);
        m1854(new C2502(this, c6735, c2609, c2609), c1386);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1869(C2609 c2609, C1386 c1386) {
        C6735 c6735 = this.f1815;
        C11003.requireNonNull(c6735);
        m1854(new C3913(this, c6735, c2609.m8247(m1876())), c1386);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1865(boolean z, C1386 c1386, EnumSet enumSet) {
        C6735 c6735;
        while (true) {
            C2609 c2609M1858 = m1858(this.f1817, enumSet);
            boolean zIsEmpty = m1876().isEmpty();
            c6735 = this.f1815;
            if (zIsEmpty || z) {
                break;
            }
            if (c2609M1858.isEmpty()) {
                c6735.m18352(m1876(), this);
                break;
            }
            Iterator it = this.f1814.iterator();
            while (it.hasNext()) {
                ((C0779) ((AbstractC4308) it.next())).m2965(this.f1816, c2609M1858, m1857(c2609M1858));
            }
        }
        c6735.m18349(this, c1386);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m1858(C2609 c2609, EnumSet enumSet) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.m8247(m1876()).iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) m1868((AbstractC4308) it.next());
            Iterator it2 = enumSet.iterator();
            while (it2.hasNext()) {
                EnumC10969 enumC10969 = (EnumC10969) it2.next();
                if (enumC10969.mo5982(c0779, this)) {
                    c0779.m2972(enumC10969.mo5983(c0779, this));
                    c18837.m43511(c0779.f14167);
                    break;
                }
            }
        }
        return c18837.m43517();
    }

    public final String toString() {
        return "Inference vars: " + this.f1817 + "\nUndet vars: " + this.f1814;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m1860(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, boolean z) {
        HashMap map = this.f1812;
        AbstractC4308 abstractC4309 = (AbstractC4308) map.get(abstractC5144);
        if (abstractC4309 != null) {
            return abstractC4309;
        }
        AbstractC4308 abstractC4308M17523 = this.f1816.m17523(abstractC4308);
        if (abstractC4308M17523 != abstractC4308 && !z) {
            map.put(abstractC5144, abstractC4308M17523);
        }
        return abstractC4308M17523;
    }
}
