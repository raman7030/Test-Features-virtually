package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C15652 {
    /* JADX INFO: renamed from: ֫ */
    public static List m35548(ArrayList arrayList, EnumC7587 enumC7587) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C24370((CharSequence) it.next(), enumC7587));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8848 m35549(ArrayList arrayList, ArrayList arrayList2, EnumC7587 enumC7587, C6836 c6836) {
        c6836.m15650();
        List listM35548 = m35548(arrayList, enumC7587);
        List listM35549 = m35548(arrayList2, enumC7587);
        c6836.m15650();
        EnumC7587 enumC7588 = EnumC7587.IGNORE_WHITESPACES;
        if (enumC7587 != enumC7588) {
            InterfaceC8848 interfaceC8848M45890 = new C4905(listM35548, listM35549, m35550(m35547(listM35548, enumC7588), m35547(listM35549, enumC7588), c6836)).m45890();
            C16223 c16223 = new C16223(listM35548, listM35549);
            new C12301(interfaceC8848M45890, listM35548, listM35549, c16223).m28336();
            return C24941.m54812(c16223.m44486());
        }
        InterfaceC8848 interfaceC8848M45891 = new C4905(listM35548, listM35549, m35550(listM35548, listM35549, c6836)).m45890();
        ArrayList arrayList3 = new ArrayList();
        Iterator itMo8422 = interfaceC8848M45891.mo8420().f44736.mo8422();
        while (itMo8422.hasNext()) {
            C23600 c23600 = (C23600) itMo8422.next();
            C23600 c23600M12344 = C5575.m12344(listM35548, listM35549, c23600.f75123, c23600.f75124, c23600.f75121, c23600.f75122);
            if (!c23600M12344.m52411()) {
                arrayList3.add(c23600M12344);
            }
        }
        return C24941.m54812(C24941.m54809(arrayList3, listM35548.size(), listM35549.size()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8848 m35550(List list, List list2, C6836 c6836) {
        C14882 c14882M35551 = m35551(list);
        C14882 c14882M35552 = m35551(list2);
        return new C10940((C17441) c14882M35551.f42437, (C17441) c14882M35552.f42437, list, list2, C24941.m54811((List) c14882M35551.f42436, (List) c14882M35552.f42436, c6836), c6836).m40171();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14882 m35551(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        C17441 c17441 = new C17441(list.size());
        for (int i = 0; i < list.size(); i++) {
            C24370 c24370 = (C24370) list.get(i);
            if (c24370.m53726() > 3) {
                arrayList.add(c24370);
                c17441.add(i);
            }
        }
        return new C14882(arrayList, c17441);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m35547(List list, EnumC7587 enumC7587) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24370 c24370 = (C24370) it.next();
            if (c24370.f77160 != enumC7587) {
                c24370 = new C24370(c24370.m53725(), enumC7587);
            }
            arrayList.add(c24370);
        }
        return arrayList;
    }
}
