package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܶۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 262Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C14996 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35532(AbstractC1591 abstractC1591) {
        EnumC7690 enumC7690 = abstractC1591.f5638;
        if (enumC7690.m20577()) {
            return true;
        }
        if (!enumC7690.m20576()) {
            return false;
        }
        EnumC0697 enumC0697 = abstractC1591.f5633;
        if (enumC0697 == EnumC0697.E1) {
            return m35533(abstractC1591.mo5442());
        }
        if (enumC0697 == EnumC0697.E2) {
            return m35533(abstractC1591.mo5445()) || m35533(abstractC1591.mo5444());
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35533(AbstractC8396 abstractC8396) {
        EnumC1340 enumC1340 = abstractC8396.f25745;
        if (!enumC1340.m4675()) {
            if (!enumC1340.m4676()) {
                return false;
            }
            int i = C18525.f57400[abstractC8396.f25747.ordinal()];
            if (i == 1) {
                return m35533(abstractC8396.mo21997());
            }
            if (i == 2) {
                if (!m35533(abstractC8396.mo2581()) && !m35533(abstractC8396.mo2583())) {
                    return false;
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35528(C5637 c5637) {
        AbstractC1591 abstractC1591M5439;
        C13334 c13334Mo10582;
        for (AbstractC1591 abstractC1591 : c5637.f17411) {
            abstractC1591.f5637 = null;
            abstractC1591.f5635 = null;
            TreeSet treeSet = abstractC1591.f5630;
            if (treeSet == null) {
                abstractC1591.f5630 = new TreeSet(c5637.f17411);
            } else {
                treeSet.clear();
            }
        }
        Iterator it = c5637.f17411.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC1591 abstractC1592 = (AbstractC1591) it.next();
            EnumC7690 enumC7690 = abstractC1592.f5638;
            if (enumC7690.m20573() && (c13334Mo10582 = ((InterfaceC3457) abstractC1592).mo10582()) != null) {
                c13334Mo10582.f5630.add(abstractC1592);
            }
            if (enumC7690.m20574() && (abstractC1591M5439 = abstractC1592.m5439()) != null) {
                abstractC1591M5439.f5630.add(abstractC1592);
            }
            if (enumC7690.m20575()) {
                AbstractC22507 abstractC22507 = (AbstractC22507) abstractC1592;
                C13334 c13334 = abstractC22507.f72831;
                if (c13334 != null) {
                    c13334.f5630.add(abstractC1592);
                }
                for (C13334 c13335 : abstractC22507.f72830) {
                    if (c13335 != null) {
                        c13335.f5630.add(abstractC1592);
                    }
                }
            }
        }
        for (C4931 c4931 : c5637.f17418) {
            for (AbstractC1591 abstractC1591M54310 = c4931.f15561; abstractC1591M54310 != c4931.f15559; abstractC1591M54310 = abstractC1591M54310.m5439()) {
                if (m35532(abstractC1591M54310)) {
                    TreeSet treeSet2 = abstractC1591M54310.f5635;
                    if (treeSet2 == null) {
                        treeSet2 = new TreeSet(c5637.f17411);
                        abstractC1591M54310.f5635 = treeSet2;
                    }
                    for (C13334 c13336 : c4931.f15560) {
                        if (c13336 != null) {
                            c13336.f5630.add(abstractC1591M54310);
                        }
                        treeSet2.add(c13336);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35529(C5637 c5637, InterfaceC19231 interfaceC19231) {
        Iterator it = c5637.f17411.iterator();
        while (it.hasNext()) {
            ((AbstractC1591) it.next()).f5632 = false;
        }
        Stack stack = new Stack();
        stack.add(c5637.f17411.getFirst());
        while (!stack.isEmpty()) {
            AbstractC1591 abstractC1591 = (AbstractC1591) stack.pop();
            boolean z = abstractC1591.f5632;
            EnumC7690 enumC7690 = abstractC1591.f5638;
            if (!z) {
                abstractC1591.f5632 = true;
                TreeSet treeSet = abstractC1591.f5635;
                if (treeSet != null) {
                    Iterator it2 = treeSet.iterator();
                    while (it2.hasNext()) {
                        stack.push((C13334) it2.next());
                    }
                }
                if (interfaceC19231 != null) {
                    interfaceC19231.mo40689(abstractC1591);
                }
                if (enumC7690.m20575()) {
                    AbstractC22507 abstractC22507 = (AbstractC22507) abstractC1591;
                    Collections.addAll(stack, abstractC22507.f72830);
                    stack.add(abstractC22507.f72831);
                }
                if (enumC7690.m20573()) {
                    stack.add(((InterfaceC3457) abstractC1591).mo10582());
                }
                if (enumC7690.m20574()) {
                    stack.add(abstractC1591.m5439());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35531(C16407 c16407, InterfaceC0179 interfaceC0179) {
        C10513 c10513;
        if (c16407.m38664() == 0) {
            return;
        }
        Iterator it = c16407.iterator();
        while (true) {
            c10513 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC1591 abstractC1591 = (AbstractC1591) it.next();
            abstractC1591.f5632 = false;
            abstractC1591.f5637 = null;
        }
        Stack stack = new Stack();
        AbstractC1591 first = c16407.getFirst();
        if (first.f5638 == EnumC7690.LABEL && first.f5630.size() > 0) {
            c10513 = new C10513();
            first.f5630.add(c10513);
        }
        stack.add(first);
        first.f5637 = interfaceC0179.mo1318();
        while (!stack.isEmpty()) {
            AbstractC1591 abstractC1592 = (AbstractC1591) stack.pop();
            if (abstractC1592 != 0) {
                EnumC7690 enumC7690 = abstractC1592.f5638;
                if (!abstractC1592.f5632) {
                    abstractC1592.f5632 = true;
                    Object obj = abstractC1592.f5637;
                    TreeSet<C13334> treeSet = abstractC1592.f5635;
                    if (treeSet != null) {
                        for (C13334 c13334 : treeSet) {
                            c13334.f5637 = interfaceC0179.mo1319(obj, c13334.f5637, abstractC1592, c13334);
                            stack.push(c13334);
                        }
                    }
                    Object objMo1320 = interfaceC0179.mo1320(obj, abstractC1592);
                    if (enumC7690.m20575()) {
                        AbstractC22507 abstractC22507 = (AbstractC22507) abstractC1592;
                        for (C13334 c13335 : abstractC22507.f72830) {
                            c13335.f5637 = interfaceC0179.mo1319(objMo1320, c13335.f5637, abstractC1592, c13335);
                            stack.push(c13335);
                        }
                        C13334 c13336 = abstractC22507.f72831;
                        c13336.f5637 = interfaceC0179.mo1319(objMo1320, c13336.f5637, abstractC1592, c13336);
                        stack.push(c13336);
                    }
                    if (enumC7690.m20573()) {
                        C13334 c13334Mo10582 = ((InterfaceC3457) abstractC1592).mo10582();
                        c13334Mo10582.f5637 = interfaceC0179.mo1319(objMo1320, c13334Mo10582.f5637, abstractC1592, c13334Mo10582);
                        stack.push(c13334Mo10582);
                    }
                    if (enumC7690.m20574()) {
                        AbstractC1591 abstractC1591M5439 = abstractC1592.m5439();
                        abstractC1591M5439.f5637 = interfaceC0179.mo1319(objMo1320, abstractC1591M5439.f5637, abstractC1592, abstractC1591M5439);
                        stack.push(abstractC1591M5439);
                    }
                }
            }
        }
        if (c10513 != null) {
            first.f5630.remove(c10513);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC8396 m35535(AbstractC8396 abstractC8396, InterfaceC7941 interfaceC7941) {
        int i = C18525.f57400[abstractC8396.f25747.ordinal()];
        if (i == 1) {
            abstractC8396.mo21998(m35535(abstractC8396.mo21997(), interfaceC7941));
            return abstractC8396;
        }
        if (i == 2) {
            abstractC8396.mo2580(m35535(abstractC8396.mo2581(), interfaceC7941));
            abstractC8396.mo2582(m35535(abstractC8396.mo2583(), interfaceC7941));
            return abstractC8396;
        }
        if (i != 3) {
            if (i == 4 && abstractC8396.f25745 == EnumC1340.LOCAL) {
                return interfaceC7941.mo3235((C18274) abstractC8396);
            }
        } else {
            AbstractC8396[] abstractC8396ArrMo15838 = abstractC8396.mo15838();
            for (int i2 = 0; i2 < abstractC8396ArrMo15838.length; i2++) {
                abstractC8396ArrMo15838[i2] = m35535(abstractC8396ArrMo15838[i2], interfaceC7941);
            }
        }
        return abstractC8396;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35530(AbstractC8396 abstractC8396, InterfaceC7941 interfaceC7941) {
        int i = C18525.f57400[abstractC8396.f25747.ordinal()];
        if (i == 1) {
            m35530(abstractC8396.mo21997(), interfaceC7941);
            return;
        }
        if (i == 2) {
            m35530(abstractC8396.mo2581(), interfaceC7941);
            m35530(abstractC8396.mo2583(), interfaceC7941);
            return;
        }
        if (i != 3) {
            if (i == 4 && abstractC8396.f25745 == EnumC1340.LOCAL) {
                interfaceC7941.mo3235((C18274) abstractC8396);
                return;
            }
            return;
        }
        for (AbstractC8396 abstractC8397 : abstractC8396.mo15838()) {
            m35530(abstractC8397, interfaceC7941);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m35536(AbstractC1591 abstractC1591, InterfaceC7941 interfaceC7941, boolean z) {
        ArrayList arrayList;
        int[] iArr = C18525.f57400;
        EnumC0697 enumC0697 = abstractC1591.f5633;
        EnumC7690 enumC7690 = abstractC1591.f5638;
        int i = iArr[enumC0697.ordinal()];
        if (i == 1) {
            abstractC1591.mo5438(m35535(abstractC1591.mo5442(), interfaceC7941));
            return;
        }
        if (i == 2) {
            AbstractC8396 abstractC8396Mo5445 = abstractC1591.mo5445();
            if (abstractC8396Mo5445.f25745 == EnumC1340.LOCAL && (enumC7690 == EnumC7690.ASSIGN || enumC7690 == EnumC7690.IDENTITY)) {
                abstractC1591.mo5443(m35535(abstractC1591.mo5444(), interfaceC7941));
                abstractC1591.mo5440(interfaceC7941.mo11293((C18274) abstractC8396Mo5445, (C21802) abstractC1591));
                return;
            } else {
                abstractC1591.mo5440(m35535(abstractC1591.mo5445(), interfaceC7941));
                abstractC1591.mo5443(m35535(abstractC1591.mo5444(), interfaceC7941));
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC7690 == EnumC7690.LABEL && (arrayList = ((C13334) abstractC1591).f39897) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m35536((C21802) it.next(), interfaceC7941, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35527(AbstractC1591 abstractC1591, InterfaceC7941 interfaceC7941, boolean z) {
        ArrayList arrayList;
        int[] iArr = C18525.f57400;
        EnumC0697 enumC0697 = abstractC1591.f5633;
        EnumC7690 enumC7690 = abstractC1591.f5638;
        int i = iArr[enumC0697.ordinal()];
        if (i == 1) {
            m35530(abstractC1591.mo5442(), interfaceC7941);
            return;
        }
        if (i == 2) {
            AbstractC8396 abstractC8396Mo5445 = abstractC1591.mo5445();
            if (abstractC8396Mo5445.f25745 == EnumC1340.LOCAL && (enumC7690 == EnumC7690.ASSIGN || enumC7690 == EnumC7690.IDENTITY)) {
                m35530(abstractC1591.mo5444(), interfaceC7941);
                interfaceC7941.mo11293((C18274) abstractC8396Mo5445, (C21802) abstractC1591);
                return;
            } else {
                m35530(abstractC1591.mo5445(), interfaceC7941);
                m35530(abstractC1591.mo5444(), interfaceC7941);
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC7690 == EnumC7690.LABEL && (arrayList = ((C13334) abstractC1591).f39897) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m35527((C21802) it.next(), interfaceC7941, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m35534(C5637 c5637) {
        Iterator it = c5637.f17415.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C18274) it.next()).f56817 = i;
            i++;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35526(AbstractC1591 abstractC1591, HashSet hashSet) {
        EnumC7690 enumC7690 = abstractC1591.f5638;
        if (enumC7690.m20573()) {
            hashSet.add(((InterfaceC3457) abstractC1591).mo10582());
        }
        if (enumC7690.m20574()) {
            hashSet.add(abstractC1591.m5439());
        }
        if (enumC7690.m20575()) {
            AbstractC22507 abstractC22507 = (AbstractC22507) abstractC1591;
            hashSet.add(abstractC22507.f72831);
            for (C13334 c13334 : abstractC22507.f72830) {
                hashSet.add(c13334);
            }
        }
        TreeSet treeSet = abstractC1591.f5635;
        if (treeSet != null) {
            hashSet.addAll(treeSet);
        }
    }
}
