package l;

import bin.mt.json.JSONArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4711 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List f14954;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Map f14955;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f14956;

    static {
        m13811();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m13811() {
        int i;
        String string = ApplicationC20075.f65008.getString("ema", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    linkedHashSet.add(jSONArray.getString(i2));
                }
                m13807(m13805(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        String string2 = C4925.f15527.getString("fms", null);
        if (string2 != null) {
            C4925.f15527.edit().remove("fms").apply();
            try {
                String[] strArrSplit = string2.split("\\|");
                if (strArrSplit.length % 2 != 0) {
                    throw new Exception();
                }
                C10630 c10630 = new C10630(15, 0);
                for (int i3 = 0; i3 < strArrSplit.length; i3 += 2) {
                    c10630.mo23658(Integer.parseInt(strArrSplit[i3]), Integer.parseInt(strArrSplit[i3 + 1]));
                }
                ArrayList<InterfaceC2869> arrayList = new ArrayList(c10630.mo26663());
                Collections.sort(arrayList, C8200.comparingInt(new C20234()));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                boolean z = false;
                boolean z2 = false;
                for (InterfaceC2869 interfaceC2869 : arrayList) {
                    if (!z2 && interfaceC2869.mo8792() >= 300 && interfaceC2869.mo8792() < 500) {
                        linkedHashSet2.add("divider:secondary");
                        z2 = true;
                    } else if (!z && interfaceC2869.mo8792() >= 500) {
                        linkedHashSet2.add("divider:hidden");
                        z = true;
                    }
                    switch (interfaceC2869.mo8791()) {
                        case 0:
                            i = 7;
                            break;
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 14;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 11;
                            break;
                        case 9:
                            i = 15;
                            break;
                        case 10:
                            i = 13;
                            break;
                        case 11:
                            i = 9;
                            break;
                        case 12:
                            i = 12;
                            break;
                        case 13:
                            i = 10;
                            break;
                        case 14:
                            i = 6;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    if (i != -1) {
                        linkedHashSet2.add(C22350.m50091(i));
                    }
                }
                m13807(m13805(linkedHashSet2));
                m13809();
                return;
            } catch (Exception unused2) {
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C22350(7));
        arrayList2.add(new C22350(10));
        arrayList2.add(new C22350(1));
        arrayList2.add(new C22350(2));
        arrayList2.add(new C22350(3));
        arrayList2.add(new C22350(4));
        arrayList2.add(new C22350(5));
        arrayList2.add(new C22350(14));
        arrayList2.add(new C22350(8));
        arrayList2.add(new C22350(11));
        arrayList2.add(C19095.f60135);
        arrayList2.add(new C22350(12));
        arrayList2.add(new C22350(15));
        arrayList2.add(C9217.f27906);
        arrayList2.add(new C22350(13));
        arrayList2.add(new C22350(9));
        arrayList2.add(new C22350(6));
        m13807(arrayList2);
        m13809();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m13810() {
        return f14954;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m13808() {
        m13806();
        return f14954;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Map m13812() {
        m13806();
        return f14955;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13806() {
        int iM32218 = C13265.m32218();
        if (iM32218 == f14956) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C16709 c16709 : C13265.m32202()) {
            ArrayList arrayList = new ArrayList();
            c16709.m39291(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c16709.m39295() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC2867 abstractC2867 : f14954) {
            if (abstractC2867 instanceof C4278) {
                linkedHashSet.remove(abstractC2867.mo8778());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f14956 = iM32218;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f14954);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C4278((String) it2.next(), true));
        }
        m13807(arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m13805(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C22350.m50092());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C16709 c16709 : C13265.m32202()) {
            ArrayList arrayList = new ArrayList();
            c16709.m39291(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c16709.m39295() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC2867> list = f14954;
        if (list != null) {
            for (AbstractC2867 abstractC2867 : list) {
                if (abstractC2867 instanceof C4278) {
                    map.put(abstractC2867.mo8778(), (C4278) abstractC2867);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.startsWith("builtin:")) {
                Integer numM50090 = C22350.m50090(str);
                if (numM50090 != null) {
                    arrayList2.add(new C22350(numM50090.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C4278 c4278 = (C4278) map.get(str);
                if (c4278 == null) {
                    c4278 = new C4278(str, true);
                }
                arrayList2.add(c4278);
            } else if (str.startsWith("divider:")) {
                if (str.equals("divider:hidden")) {
                    arrayList2.add(C9217.f27906);
                } else if (str.equals("divider:secondary")) {
                    arrayList2.add(C19095.f60135);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13807(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC2867 abstractC2867 = (AbstractC2867) it.next();
            if (abstractC2867 == C19095.f60135) {
                i = 300;
            } else {
                if (abstractC2867 == C9217.f27906) {
                    break;
                }
                map.put(abstractC2867.mo8778(), Integer.valueOf(i));
                i++;
            }
        }
        f14954 = C20195.unmodifiableList(arrayList);
        f14955 = C20195.unmodifiableMap(map);
        f14956 = C13265.m32218();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m13809() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f14954.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC2867) it.next()).mo8778());
        }
        ApplicationC20075.f65008.edit().putString("ema", jSONArray.toString()).apply();
    }
}
