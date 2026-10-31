package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4570 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m13429(AbstractC7479 abstractC7479) {
        return abstractC7479.mo3975() == EnumC0841.f3075;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m13428(AbstractC7479 abstractC7479) {
        EnumC0841 enumC0841Mo3975 = abstractC7479.mo3975();
        return enumC0841Mo3975 == EnumC0841.f3287 || enumC0841Mo3975 == EnumC0841.f3295 || enumC0841Mo3975 == EnumC0841.f3271;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13426(AbstractC7479 abstractC7479) {
        EnumC0841 enumC0841Mo3975 = abstractC7479.mo3975();
        return enumC0841Mo3975 == EnumC0841.f3099 || enumC0841Mo3975 == EnumC0841.f3051 || enumC0841Mo3975 == EnumC0841.f3215;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13424(AbstractC7479 abstractC7479) {
        return (abstractC7479.mo3975().f3319 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13425(AbstractC7479 abstractC7479, Set set) {
        Iterator it = abstractC7479.m20099().m37705().iterator();
        while (it.hasNext()) {
            if (!set.contains((C17337) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13420(C15152 c15152, int i, int i2) {
        List list = c15152.f46302;
        Set set = c15152.f46304;
        while (i2 >= 0) {
            AbstractC7479 abstractC7479 = (AbstractC7479) list.get(i2);
            if (m13428(abstractC7479) && ((InterfaceC1779) abstractC7479).mo1790() == i) {
                return ((InterfaceC23651) abstractC7479).mo7930();
            }
            if (!m13424(abstractC7479) || m13425(abstractC7479, set)) {
                return -1;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13421(InterfaceC5471 interfaceC5471) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC5471.mo3565().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13422(Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) it.next();
            switch (interfaceC22677.mo3975().f3318) {
                case 1:
                    if (set.contains(((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType())) {
                        return true;
                    }
                    break;
                case 2:
                    if (set.contains(((InterfaceC18877) ((InterfaceC10952) interfaceC22677).getReference()).mo8192())) {
                        return true;
                    }
                    break;
                case 3:
                    if (set.contains(((InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference()).mo3566())) {
                        return true;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13427(C15152 c15152, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C16631 c16631 : c15152.f46303) {
            C22209 c22209 = new C22209();
            c22209.f72086 = c16631.f51074.m40667().m37704();
            c22209.f72084 = c16631.f51072.m40667().m37704();
            AbstractC14545 abstractC14545Of = AbstractC14545.of((Object) c16631.f51073);
            c22209.f72085 = new int[abstractC14545Of.size()];
            for (int i3 = 0; i3 < abstractC14545Of.size(); i3++) {
                c22209.f72085[i3] = ((AbstractC13828) abstractC14545Of.get(i3)).m33182().m40667().m37704();
            }
            linkedList.add(c22209);
        }
        return m13423(c15152.f46302, linkedList, i, i2, new HashSet());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13423(List list, LinkedList linkedList, int i, int i2, HashSet hashSet) {
        C20093 c20093 = new C20093(i);
        while (i2 < list.size() && hashSet.add(Integer.valueOf(i2))) {
            Iterator it = linkedList.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                C22209 c22209 = (C22209) it.next();
                if (i2 >= c22209.f72086 && i2 < c22209.f72084) {
                    it.remove();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i3 : c22209.f72085) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (m13423(list, linkedList, i, ((Integer) it2.next()).intValue(), hashSet)) {
                        return true;
                    }
                }
            }
            AbstractC7479 abstractC7479 = (AbstractC7479) list.get(i2);
            c20093.m46311(abstractC7479);
            if (!c20093.f65069) {
                if (c20093.f65071) {
                    break;
                }
                if (!m13424(abstractC7479)) {
                    if (!(abstractC7479 instanceof AbstractC1815)) {
                        break;
                    }
                    return m13423(list, linkedList, i, ((AbstractC1815) abstractC7479).m6037().m40667().m37704(), hashSet);
                }
                int i4 = C21504.f69164[abstractC7479.mo3975().f3316.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    int iM37704 = ((AbstractC1815) abstractC7479).m6037().m40667().m37704();
                    if (!m13423(list, linkedList, i, i2 + 1, hashSet)) {
                        if (m13423(list, linkedList, i, iM37704, hashSet)) {
                        }
                    }
                } else if (i4 != 3 || (abstractC7479.mo3975() != EnumC0841.f3293 && abstractC7479.mo3975() != EnumC0841.f3201)) {
                    i2++;
                } else if (!m13423(list, linkedList, i, i2 + 1, hashSet)) {
                    Iterator it3 = ((AbstractC10988) ((AbstractC1815) abstractC7479).m6037().m40667().m37706()).mo8107().iterator();
                    while (it3.hasNext()) {
                        if (m13423(list, linkedList, i, ((C11632) it3.next()).m28523().m40667().m37704(), hashSet)) {
                        }
                    }
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
