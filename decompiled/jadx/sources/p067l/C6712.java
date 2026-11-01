package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6712 {
    /* JADX INFO: renamed from: ᩳ */
    public static boolean m15317(AbstractC9476 abstractC9476) {
        return abstractC9476.mo6217() == EnumC3167.f5849;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m15316(AbstractC9476 abstractC9476) {
        EnumC3167 enumC3167Mo6217 = abstractC9476.mo6217();
        return enumC3167Mo6217 == EnumC3167.f6061 || enumC3167Mo6217 == EnumC3167.f6069 || enumC3167Mo6217 == EnumC3167.f6045;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m15314(AbstractC9476 abstractC9476) {
        EnumC3167 enumC3167Mo6217 = abstractC9476.mo6217();
        return enumC3167Mo6217 == EnumC3167.f5873 || enumC3167Mo6217 == EnumC3167.f5825 || enumC3167Mo6217 == EnumC3167.f5989;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15312(AbstractC9476 abstractC9476) {
        return (abstractC9476.mo6217().f6093 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15313(AbstractC9476 abstractC9476, Set set) {
        Iterator it = abstractC9476.m22075().m39880().iterator();
        while (it.hasNext()) {
            if (!set.contains((C18845) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static int m15308(C16769 c16769, int i, int i2) {
        List list = c16769.f49421;
        Set set = c16769.f49423;
        while (i2 >= 0) {
            AbstractC9476 abstractC9476 = (AbstractC9476) list.get(i2);
            if (m15316(abstractC9476) && ((InterfaceC4059) abstractC9476).mo4189() == i) {
                return ((InterfaceC24846) abstractC9476).mo9978();
            }
            if (!m15312(abstractC9476) || m15313(abstractC9476, set)) {
                return -1;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15309(InterfaceC7568 interfaceC7568) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC7568.mo5852().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15310(Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) it.next();
            switch (interfaceC23920.mo6217().f6092) {
                case 1:
                    if (set.contains(((InterfaceC22991) ((InterfaceC12777) interfaceC23920).getReference()).getType())) {
                        return true;
                    }
                    break;
                case 2:
                    if (set.contains(((InterfaceC20309) ((InterfaceC12777) interfaceC23920).getReference()).mo10231())) {
                        return true;
                    }
                    break;
                case 3:
                    if (set.contains(((InterfaceC7568) ((InterfaceC12777) interfaceC23920).getReference()).mo5853())) {
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

    /* JADX INFO: renamed from: ۧ */
    public static boolean m15315(C16769 c16769, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C18174 c18174 : c16769.f49422) {
            C23476 c23476 = new C23476();
            c23476.f74807 = c18174.f54254.m42918().m39879();
            c23476.f74805 = c18174.f54252.m42918().m39879();
            AbstractC16192 abstractC16192M36873of = AbstractC16192.m36873of((Object) c18174.f54253);
            c23476.f74806 = new int[abstractC16192M36873of.size()];
            for (int i3 = 0; i3 < abstractC16192M36873of.size(); i3++) {
                c23476.f74806[i3] = ((AbstractC15510) abstractC16192M36873of.get(i3)).m35300().m42918().m39879();
            }
            linkedList.add(c23476);
        }
        return m15311(c16769.f49421, linkedList, i, i2, new HashSet());
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15311(List list, LinkedList linkedList, int i, int i2, HashSet hashSet) {
        C21465 c21465 = new C21465(i);
        while (i2 < list.size() && hashSet.add(Integer.valueOf(i2))) {
            Iterator it = linkedList.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                C23476 c23476 = (C23476) it.next();
                if (i2 >= c23476.f74807 && i2 < c23476.f74805) {
                    it.remove();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i3 : c23476.f74806) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (m15311(list, linkedList, i, ((Integer) it2.next()).intValue(), hashSet)) {
                        return true;
                    }
                }
            }
            AbstractC9476 abstractC9476 = (AbstractC9476) list.get(i2);
            c21465.m48627(abstractC9476);
            if (!c21465.f67709) {
                if (c21465.f67711) {
                    break;
                }
                if (!m15312(abstractC9476)) {
                    if (!(abstractC9476 instanceof AbstractC4093)) {
                        break;
                    }
                    return m15311(list, linkedList, i, ((AbstractC4093) abstractC9476).m8235().m42918().m39879(), hashSet);
                }
                int i4 = C22806.f71861[abstractC9476.mo6217().f6090.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    int iM39879 = ((AbstractC4093) abstractC9476).m8235().m42918().m39879();
                    if (!m15311(list, linkedList, i, i2 + 1, hashSet)) {
                        if (m15311(list, linkedList, i, iM39879, hashSet)) {
                        }
                    }
                } else if (i4 != 3 || (abstractC9476.mo6217() != EnumC3167.f6067 && abstractC9476.mo6217() != EnumC3167.f5975)) {
                    i2++;
                } else if (!m15311(list, linkedList, i, i2 + 1, hashSet)) {
                    Iterator it3 = ((AbstractC12811) ((AbstractC4093) abstractC9476).m8235().m42918().m39881()).mo10139().iterator();
                    while (it3.hasNext()) {
                        if (m15311(list, linkedList, i, ((C13423) it3.next()).m30569().m42918().m39879(), hashSet)) {
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
