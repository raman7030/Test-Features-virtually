package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20122 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19854 m46376(C19854 c19854, Collection collection) throws C18442 {
        if (!c19854.m45667().isEmpty()) {
            final C22267 c22267M45659 = c19854.m45659(collection);
            AbstractC4628 abstractC4628ListIterator = c19854.m45667().listIterator(0);
            C3923 c3923M11959 = C3923.m11959();
            while (abstractC4628ListIterator.hasNext()) {
                C22238 c22238M46377 = m46377(abstractC4628ListIterator);
                if (!c22238M46377.m49946() && C5378.stream(c22238M46377.m49941()).allMatch(new Predicate() { // from class: l.ܶۧۖ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return c22267M45659.mo3775(Integer.valueOf(((C21265) ((InterfaceC21438) obj).mo48557()).getIndex()));
                    }
                })) {
                    ArrayList arrayList = new ArrayList();
                    int iM49942 = c22238M46377.m49942();
                    arrayList.add(c22238M46377);
                    int iM49940 = -1;
                    while (abstractC4628ListIterator.hasNext()) {
                        C22238 c22238M46378 = m46377(abstractC4628ListIterator);
                        if (c22238M46378.m49946()) {
                            break;
                        }
                        arrayList.add(c22238M46378);
                        iM49940 = c22238M46378.m49940();
                    }
                    AbstractC10232 abstractC10232M25861 = AbstractC10232.m25861();
                    abstractC10232M25861.getClass();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            if (abstractC10232M25861.compare(next, next2) > 0) {
                                ArrayList arrayListM25864 = AbstractC10232.m25861().m25864(arrayList);
                                StringBuilder sb = new StringBuilder();
                                for (int i = 0; i < arrayListM25864.size(); i++) {
                                    if (i > 0) {
                                        AbstractC4628 abstractC4628ListIterator2 = ((C22238) arrayList.get(i)).m49944().listIterator(0);
                                        while (abstractC4628ListIterator2.hasNext()) {
                                            sb.append(((InterfaceC15086) abstractC4628ListIterator2.next()).getText());
                                        }
                                    }
                                    sb.append(((C22238) arrayListM25864.get(i)).m49945());
                                    if (i < arrayListM25864.size() - 1) {
                                        AbstractC4628 abstractC4628ListIterator3 = ((C22238) arrayList.get(i)).m49943().listIterator(0);
                                        while (abstractC4628ListIterator3.hasNext()) {
                                            sb.append(((InterfaceC15086) abstractC4628ListIterator3.next()).getText());
                                        }
                                    }
                                }
                                c3923M11959.m11962(C13758.m33067(Integer.valueOf(iM49942), Integer.valueOf(iM49940)), sb.toString());
                                break;
                            }
                            next = next2;
                        }
                    }
                }
            }
            Map mapM11963 = c3923M11959.m11963();
            if (!((AbstractMap) mapM11963).isEmpty()) {
                StringBuilder sb2 = new StringBuilder(c19854.m45663());
                for (Map.Entry entry : mapM11963.entrySet()) {
                    C13758 c13758 = (C13758) entry.getKey();
                    sb2.replace(((Integer) c13758.m33075()).intValue(), ((Integer) c13758.m33077()).intValue(), (String) entry.getValue());
                }
                return new C19854(sb2.toString());
            }
        }
        return c19854;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22238 m46377(Iterator it) {
        InterfaceC21438 interfaceC21438 = (InterfaceC21438) it.next();
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        c1846.m16264(interfaceC21438);
        if (!((C21265) interfaceC21438.mo48557()).getText().equals("non")) {
            AbstractC14545 abstractC14545M6131 = c1846.m6131();
            return new C22238(abstractC14545M6131, m46374(abstractC14545M6131));
        }
        if (!it.hasNext()) {
            return new C22238(AbstractC14545.of(), null);
        }
        InterfaceC21438 interfaceC21439 = (InterfaceC21438) it.next();
        c1846.m16264(interfaceC21439);
        if (!((C21265) interfaceC21439.mo48557()).getText().equals("-") || !it.hasNext()) {
            return new C22238(AbstractC14545.of(), null);
        }
        c1846.m16264((InterfaceC21438) it.next());
        AbstractC14545 abstractC14545M6132 = c1846.m6131();
        return new C22238(abstractC14545M6132, m46374(abstractC14545M6132));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2113 m46374(AbstractC14545 abstractC14545) {
        if (abstractC14545.size() == 1) {
            return m46375((InterfaceC21438) abstractC14545.get(0));
        }
        EnumC2113 enumC2113M46375 = m46375((InterfaceC21438) C8882.m22955(abstractC14545));
        if (enumC2113M46375 == null) {
            return null;
        }
        return EnumC2113.valueOf("NON_" + enumC2113M46375.name());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2113 m46375(InterfaceC21438 interfaceC21438) {
        EnumC19920 enumC19920M48283 = ((C21265) interfaceC21438.mo48557()).m48283();
        if (enumC19920M48283 != null) {
            switch (C21533.f69213[enumC19920M48283.ordinal()]) {
                case 1:
                    return EnumC2113.f7050;
                case 2:
                    return EnumC2113.f7052;
                case 3:
                    return EnumC2113.f7055;
                case 4:
                    return EnumC2113.f7060;
                case 5:
                    return EnumC2113.f7061;
                case 6:
                    return EnumC2113.f7058;
                case 7:
                    return EnumC2113.f7049;
                case 8:
                    return EnumC2113.f7047;
                case 9:
                    return EnumC2113.f7053;
                case 10:
                    return EnumC2113.f7051;
                case 11:
                    return EnumC2113.f7048;
                case 12:
                    return EnumC2113.f7057;
            }
        }
        String text = ((C21265) interfaceC21438.mo48557()).getText();
        text.getClass();
        if (text.equals("sealed")) {
            return EnumC2113.valueOf("SEALED");
        }
        return null;
    }
}
