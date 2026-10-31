package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13977 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m33428(ArrayList arrayList, EnumC5491 enumC5491) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C23150((CharSequence) it.next(), enumC5491));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m33429(ArrayList arrayList, ArrayList arrayList2, EnumC5491 enumC5491, C4701 c4701) {
        c4701.m13775();
        List listM33428 = m33428(arrayList, enumC5491);
        List listM33429 = m33428(arrayList2, enumC5491);
        c4701.m13775();
        EnumC5491 enumC5492 = EnumC5491.IGNORE_WHITESPACES;
        if (enumC5491 != enumC5492) {
            InterfaceC6818 interfaceC6818M43624 = new C2669(listM33428, listM33429, m33430(m33427(listM33428, enumC5492), m33427(listM33429, enumC5492), c4701)).m43624();
            C14578 c14578 = new C14578(listM33428, listM33429);
            new C10451(interfaceC6818M43624, listM33428, listM33429, c14578).m26307();
            return C23751.m52403(c14578.m42227());
        }
        InterfaceC6818 interfaceC6818M43625 = new C2669(listM33428, listM33429, m33430(listM33428, listM33429, c4701)).m43624();
        ArrayList arrayList3 = new ArrayList();
        Iterator itMo6220 = interfaceC6818M43625.mo6218().f41655.mo6220();
        while (itMo6220.hasNext()) {
            C22340 c22340 = (C22340) itMo6220.next();
            C22340 c22340M10307 = C3374.m10307(listM33428, listM33429, c22340.f72397, c22340.f72398, c22340.f72395, c22340.f72396);
            if (!c22340M10307.m50072()) {
                arrayList3.add(c22340M10307);
            }
        }
        return C23751.m52403(C23751.m52400(arrayList3, listM33428.size(), listM33429.size()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m33430(List list, List list2, C4701 c4701) {
        C13167 c13167M33431 = m33431(list);
        C13167 c13167M33432 = m33431(list2);
        return new C9019((C15859) c13167M33431.f39375, (C15859) c13167M33432.f39375, list, list2, C23751.m52402((List) c13167M33431.f39374, (List) c13167M33432.f39374, c4701), c4701).m37982();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13167 m33431(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        C15859 c15859 = new C15859(list.size());
        for (int i = 0; i < list.size(); i++) {
            C23150 c23150 = (C23150) list.get(i);
            if (c23150.m51331() > 3) {
                arrayList.add(c23150);
                c15859.add(i);
            }
        }
        return new C13167(arrayList, c15859);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m33427(List list, EnumC5491 enumC5491) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23150 c23150 = (C23150) it.next();
            if (c23150.f74414 != enumC5491) {
                c23150 = new C23150(c23150.m51330(), enumC5491);
            }
            arrayList.add(c23150);
        }
        return arrayList;
    }
}
