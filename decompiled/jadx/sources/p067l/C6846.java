package p067l;

import bin.p000mt.json.JSONArray;
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
public final class C6846 {

    /* JADX INFO: renamed from: ֫ */
    public static List f17784;

    /* JADX INFO: renamed from: ۧ */
    public static Map f17785;

    /* JADX INFO: renamed from: ܽ */
    public static int f17786;

    static {
        m15687();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m15687() {
        int i;
        String string = ApplicationC21448.f67649.getString("ema", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    linkedHashSet.add(jSONArray.getString(i2));
                }
                m15683(m15681(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        String string2 = C7050.f18359.getString("fms", null);
        if (string2 != null) {
            C7050.f18359.edit().remove("fms").apply();
            try {
                String[] strArrSplit = string2.split("\\|");
                if (strArrSplit.length % 2 != 0) {
                    throw new Exception();
                }
                C12472 c12472 = new C12472(15, 0);
                for (int i3 = 0; i3 < strArrSplit.length; i3 += 2) {
                    c12472.mo25657(Integer.parseInt(strArrSplit[i3]), Integer.parseInt(strArrSplit[i3 + 1]));
                }
                ArrayList<InterfaceC5096> arrayList = new ArrayList(c12472.mo28703());
                Collections.sort(arrayList, C10162.comparingInt(new C21599()));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                boolean z = false;
                boolean z2 = false;
                for (InterfaceC5096 interfaceC5096 : arrayList) {
                    if (!z2 && interfaceC5096.mo10859() >= 300 && interfaceC5096.mo10859() < 500) {
                        linkedHashSet2.add("divider:secondary");
                        z2 = true;
                    } else if (!z && interfaceC5096.mo10859() >= 500) {
                        linkedHashSet2.add("divider:hidden");
                        z = true;
                    }
                    switch (interfaceC5096.mo10858()) {
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
                        linkedHashSet2.add(C23610.m52430(i));
                    }
                }
                m15683(m15681(linkedHashSet2));
                m15685();
                return;
            } catch (Exception unused2) {
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C23610(7));
        arrayList2.add(new C23610(10));
        arrayList2.add(new C23610(1));
        arrayList2.add(new C23610(2));
        arrayList2.add(new C23610(3));
        arrayList2.add(new C23610(4));
        arrayList2.add(new C23610(5));
        arrayList2.add(new C23610(14));
        arrayList2.add(new C23610(8));
        arrayList2.add(new C23610(11));
        arrayList2.add(C20517.f63369);
        arrayList2.add(new C23610(12));
        arrayList2.add(new C23610(15));
        arrayList2.add(C11129.f30852);
        arrayList2.add(new C23610(13));
        arrayList2.add(new C23610(9));
        arrayList2.add(new C23610(6));
        m15683(arrayList2);
        m15685();
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m15686() {
        return f17784;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m15684() {
        m15682();
        return f17784;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Map m15688() {
        m15682();
        return f17785;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15682() {
        int iM34317 = C14976.m34317();
        if (iM34317 == f17786) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C18249 c18249 : C14976.m34301()) {
            ArrayList arrayList = new ArrayList();
            c18249.m41527(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c18249.m41531() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC5094 abstractC5094 : f17784) {
            if (abstractC5094 instanceof C6435) {
                linkedHashSet.remove(abstractC5094.mo10845());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f17786 = iM34317;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f17784);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C6435((String) it2.next(), true));
        }
        m15683(arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m15681(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C23610.m52431());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C18249 c18249 : C14976.m34301()) {
            ArrayList arrayList = new ArrayList();
            c18249.m41527(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c18249.m41531() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC5094> list = f17784;
        if (list != null) {
            for (AbstractC5094 abstractC5094 : list) {
                if (abstractC5094 instanceof C6435) {
                    map.put(abstractC5094.mo10845(), (C6435) abstractC5094);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.startsWith("builtin:")) {
                Integer numM52429 = C23610.m52429(str);
                if (numM52429 != null) {
                    arrayList2.add(new C23610(numM52429.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C6435 c6435 = (C6435) map.get(str);
                if (c6435 == null) {
                    c6435 = new C6435(str, true);
                }
                arrayList2.add(c6435);
            } else if (str.startsWith("divider:")) {
                if (str.equals("divider:hidden")) {
                    arrayList2.add(C11129.f30852);
                } else if (str.equals("divider:secondary")) {
                    arrayList2.add(C20517.f63369);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15683(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC5094 abstractC5094 = (AbstractC5094) it.next();
            if (abstractC5094 == C20517.f63369) {
                i = 300;
            } else {
                if (abstractC5094 == C11129.f30852) {
                    break;
                }
                map.put(abstractC5094.mo10845(), Integer.valueOf(i));
                i++;
            }
        }
        f17784 = C21562.unmodifiableList(arrayList);
        f17785 = C21562.unmodifiableMap(map);
        f17786 = C14976.m34317();
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m15685() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f17784.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC5094) it.next()).mo10845());
        }
        ApplicationC21448.f67649.edit().putString("ema", jSONArray.toString()).apply();
    }
}
