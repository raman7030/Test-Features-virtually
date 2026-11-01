package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܶۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 262Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C16620 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m37688(AbstractC3880 abstractC3880) {
        EnumC9677 enumC9677 = abstractC3880.f8417;
        if (enumC9677.m22557()) {
            return true;
        }
        if (!enumC9677.m22556()) {
            return false;
        }
        EnumC3031 enumC3031 = abstractC3880.f8412;
        if (enumC3031 == EnumC3031.E1) {
            return m37689(abstractC3880.mo7672());
        }
        if (enumC3031 == EnumC3031.E2) {
            return m37689(abstractC3880.mo7675()) || m37689(abstractC3880.mo7674());
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m37689(AbstractC10348 abstractC10348) {
        EnumC3642 enumC3642 = abstractC10348.f28658;
        if (!enumC3642.m6907()) {
            if (!enumC3642.m6908()) {
                return false;
            }
            int i = C19974.f60621[abstractC10348.f28660.ordinal()];
            if (i == 1) {
                return m37689(abstractC10348.mo23968());
            }
            if (i == 2) {
                if (!m37689(abstractC10348.mo4921()) && !m37689(abstractC10348.mo4923())) {
                    return false;
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m37684(C7726 c7726) {
        AbstractC3880 abstractC3880M7669;
        C15041 c15041Mo12590;
        for (AbstractC3880 abstractC3880 : c7726.f20257) {
            abstractC3880.f8416 = null;
            abstractC3880.f8414 = null;
            TreeSet treeSet = abstractC3880.f8409;
            if (treeSet == null) {
                abstractC3880.f8409 = new TreeSet(c7726.f20257);
            } else {
                treeSet.clear();
            }
        }
        Iterator it = c7726.f20257.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC3880 abstractC3881 = (AbstractC3880) it.next();
            EnumC9677 enumC9677 = abstractC3881.f8417;
            if (enumC9677.m22553() && (c15041Mo12590 = ((InterfaceC5654) abstractC3881).mo12590()) != null) {
                c15041Mo12590.f8409.add(abstractC3881);
            }
            if (enumC9677.m22554() && (abstractC3880M7669 = abstractC3881.m7669()) != null) {
                abstractC3880M7669.f8409.add(abstractC3881);
            }
            if (enumC9677.m22555()) {
                AbstractC23759 abstractC23759 = (AbstractC23759) abstractC3881;
                C15041 c15041 = abstractC23759.f75557;
                if (c15041 != null) {
                    c15041.f8409.add(abstractC3881);
                }
                for (C15041 c15042 : abstractC23759.f75556) {
                    if (c15042 != null) {
                        c15042.f8409.add(abstractC3881);
                    }
                }
            }
        }
        for (C7055 c7055 : c7726.f20264) {
            for (AbstractC3880 abstractC3880M76610 = c7055.f18393; abstractC3880M76610 != c7055.f18391; abstractC3880M76610 = abstractC3880M76610.m7669()) {
                if (m37688(abstractC3880M76610)) {
                    TreeSet treeSet2 = abstractC3880M76610.f8414;
                    if (treeSet2 == null) {
                        treeSet2 = new TreeSet(c7726.f20257);
                        abstractC3880M76610.f8414 = treeSet2;
                    }
                    for (C15041 c15043 : c7055.f18392) {
                        if (c15043 != null) {
                            c15043.f8409.add(abstractC3880M76610);
                        }
                        treeSet2.add(c15043);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m37685(C7726 c7726, InterfaceC20645 interfaceC20645) {
        Iterator it = c7726.f20257.iterator();
        while (it.hasNext()) {
            ((AbstractC3880) it.next()).f8411 = false;
        }
        Stack stack = new Stack();
        stack.add(c7726.f20257.getFirst());
        while (!stack.isEmpty()) {
            AbstractC3880 abstractC3880 = (AbstractC3880) stack.pop();
            boolean z = abstractC3880.f8411;
            EnumC9677 enumC9677 = abstractC3880.f8417;
            if (!z) {
                abstractC3880.f8411 = true;
                TreeSet treeSet = abstractC3880.f8414;
                if (treeSet != null) {
                    Iterator it2 = treeSet.iterator();
                    while (it2.hasNext()) {
                        stack.push((C15041) it2.next());
                    }
                }
                if (interfaceC20645 != null) {
                    interfaceC20645.mo42940(abstractC3880);
                }
                if (enumC9677.m22555()) {
                    AbstractC23759 abstractC23759 = (AbstractC23759) abstractC3880;
                    Collections.addAll(stack, abstractC23759.f75556);
                    stack.add(abstractC23759.f75557);
                }
                if (enumC9677.m22553()) {
                    stack.add(((InterfaceC5654) abstractC3880).mo12590());
                }
                if (enumC9677.m22554()) {
                    stack.add(abstractC3880.m7669());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m37687(C17961 c17961, InterfaceC2538 interfaceC2538) {
        C12360 c12360;
        if (c17961.m40880() == 0) {
            return;
        }
        Iterator it = c17961.iterator();
        while (true) {
            c12360 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC3880 abstractC3880 = (AbstractC3880) it.next();
            abstractC3880.f8411 = false;
            abstractC3880.f8416 = null;
        }
        Stack stack = new Stack();
        AbstractC3880 first = c17961.getFirst();
        if (first.f8417 == EnumC9677.LABEL && first.f8409.size() > 0) {
            c12360 = new C12360();
            first.f8409.add(c12360);
        }
        stack.add(first);
        first.f8416 = interfaceC2538.mo3726();
        while (!stack.isEmpty()) {
            AbstractC3880 abstractC3881 = (AbstractC3880) stack.pop();
            if (abstractC3881 != 0) {
                EnumC9677 enumC9677 = abstractC3881.f8417;
                if (!abstractC3881.f8411) {
                    abstractC3881.f8411 = true;
                    Object obj = abstractC3881.f8416;
                    TreeSet<C15041> treeSet = abstractC3881.f8414;
                    if (treeSet != null) {
                        for (C15041 c15041 : treeSet) {
                            c15041.f8416 = interfaceC2538.mo3727(obj, c15041.f8416, abstractC3881, c15041);
                            stack.push(c15041);
                        }
                    }
                    Object objMo3728 = interfaceC2538.mo3728(obj, abstractC3881);
                    if (enumC9677.m22555()) {
                        AbstractC23759 abstractC23759 = (AbstractC23759) abstractC3881;
                        for (C15041 c15042 : abstractC23759.f75556) {
                            c15042.f8416 = interfaceC2538.mo3727(objMo3728, c15042.f8416, abstractC3881, c15042);
                            stack.push(c15042);
                        }
                        C15041 c15043 = abstractC23759.f75557;
                        c15043.f8416 = interfaceC2538.mo3727(objMo3728, c15043.f8416, abstractC3881, c15043);
                        stack.push(c15043);
                    }
                    if (enumC9677.m22553()) {
                        C15041 c15041Mo12590 = ((InterfaceC5654) abstractC3881).mo12590();
                        c15041Mo12590.f8416 = interfaceC2538.mo3727(objMo3728, c15041Mo12590.f8416, abstractC3881, c15041Mo12590);
                        stack.push(c15041Mo12590);
                    }
                    if (enumC9677.m22554()) {
                        AbstractC3880 abstractC3880M7669 = abstractC3881.m7669();
                        abstractC3880M7669.f8416 = interfaceC2538.mo3727(objMo3728, abstractC3880M7669.f8416, abstractC3881, abstractC3880M7669);
                        stack.push(abstractC3880M7669);
                    }
                }
            }
        }
        if (c12360 != null) {
            first.f8409.remove(c12360);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC10348 m37691(AbstractC10348 abstractC10348, InterfaceC9915 interfaceC9915) {
        int i = C19974.f60621[abstractC10348.f28660.ordinal()];
        if (i == 1) {
            abstractC10348.mo23969(m37691(abstractC10348.mo23968(), interfaceC9915));
            return abstractC10348;
        }
        if (i == 2) {
            abstractC10348.mo4920(m37691(abstractC10348.mo4921(), interfaceC9915));
            abstractC10348.mo4922(m37691(abstractC10348.mo4923(), interfaceC9915));
            return abstractC10348;
        }
        if (i != 3) {
            if (i == 4 && abstractC10348.f28658 == EnumC3642.LOCAL) {
                return interfaceC9915.mo5549((C19736) abstractC10348);
            }
        } else {
            AbstractC10348[] abstractC10348ArrMo17753 = abstractC10348.mo17753();
            for (int i2 = 0; i2 < abstractC10348ArrMo17753.length; i2++) {
                abstractC10348ArrMo17753[i2] = m37691(abstractC10348ArrMo17753[i2], interfaceC9915);
            }
        }
        return abstractC10348;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37686(AbstractC10348 abstractC10348, InterfaceC9915 interfaceC9915) {
        int i = C19974.f60621[abstractC10348.f28660.ordinal()];
        if (i == 1) {
            m37686(abstractC10348.mo23968(), interfaceC9915);
            return;
        }
        if (i == 2) {
            m37686(abstractC10348.mo4921(), interfaceC9915);
            m37686(abstractC10348.mo4923(), interfaceC9915);
            return;
        }
        if (i != 3) {
            if (i == 4 && abstractC10348.f28658 == EnumC3642.LOCAL) {
                interfaceC9915.mo5549((C19736) abstractC10348);
                return;
            }
            return;
        }
        for (AbstractC10348 abstractC10349 : abstractC10348.mo17753()) {
            m37686(abstractC10349, interfaceC9915);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37692(AbstractC3880 abstractC3880, InterfaceC9915 interfaceC9915, boolean z) {
        ArrayList arrayList;
        int[] iArr = C19974.f60621;
        EnumC3031 enumC3031 = abstractC3880.f8412;
        EnumC9677 enumC9677 = abstractC3880.f8417;
        int i = iArr[enumC3031.ordinal()];
        if (i == 1) {
            abstractC3880.mo7668(m37691(abstractC3880.mo7672(), interfaceC9915));
            return;
        }
        if (i == 2) {
            AbstractC10348 abstractC10348Mo7675 = abstractC3880.mo7675();
            if (abstractC10348Mo7675.f28658 == EnumC3642.LOCAL && (enumC9677 == EnumC9677.ASSIGN || enumC9677 == EnumC9677.IDENTITY)) {
                abstractC3880.mo7673(m37691(abstractC3880.mo7674(), interfaceC9915));
                abstractC3880.mo7670(interfaceC9915.mo13240((C19736) abstractC10348Mo7675, (C23089) abstractC3880));
                return;
            } else {
                abstractC3880.mo7670(m37691(abstractC3880.mo7675(), interfaceC9915));
                abstractC3880.mo7673(m37691(abstractC3880.mo7674(), interfaceC9915));
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC9677 == EnumC9677.LABEL && (arrayList = ((C15041) abstractC3880).f42963) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m37692((C23089) it.next(), interfaceC9915, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37683(AbstractC3880 abstractC3880, InterfaceC9915 interfaceC9915, boolean z) {
        ArrayList arrayList;
        int[] iArr = C19974.f60621;
        EnumC3031 enumC3031 = abstractC3880.f8412;
        EnumC9677 enumC9677 = abstractC3880.f8417;
        int i = iArr[enumC3031.ordinal()];
        if (i == 1) {
            m37686(abstractC3880.mo7672(), interfaceC9915);
            return;
        }
        if (i == 2) {
            AbstractC10348 abstractC10348Mo7675 = abstractC3880.mo7675();
            if (abstractC10348Mo7675.f28658 == EnumC3642.LOCAL && (enumC9677 == EnumC9677.ASSIGN || enumC9677 == EnumC9677.IDENTITY)) {
                m37686(abstractC3880.mo7674(), interfaceC9915);
                interfaceC9915.mo13240((C19736) abstractC10348Mo7675, (C23089) abstractC3880);
                return;
            } else {
                m37686(abstractC3880.mo7675(), interfaceC9915);
                m37686(abstractC3880.mo7674(), interfaceC9915);
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC9677 == EnumC9677.LABEL && (arrayList = ((C15041) abstractC3880).f42963) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m37683((C23089) it.next(), interfaceC9915, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m37690(C7726 c7726) {
        Iterator it = c7726.f20261.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C19736) it.next()).f60034 = i;
            i++;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m37682(AbstractC3880 abstractC3880, HashSet hashSet) {
        EnumC9677 enumC9677 = abstractC3880.f8417;
        if (enumC9677.m22553()) {
            hashSet.add(((InterfaceC5654) abstractC3880).mo12590());
        }
        if (enumC9677.m22554()) {
            hashSet.add(abstractC3880.m7669());
        }
        if (enumC9677.m22555()) {
            AbstractC23759 abstractC23759 = (AbstractC23759) abstractC3880;
            hashSet.add(abstractC23759.f75557);
            for (C15041 c15041 : abstractC23759.f75556) {
                hashSet.add(c15041);
            }
        }
        TreeSet treeSet = abstractC3880.f8414;
        if (treeSet != null) {
            hashSet.addAll(treeSet);
        }
    }
}
