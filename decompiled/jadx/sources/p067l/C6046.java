package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final class C6046 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f15179 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f15180 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final LinkedHashSet f15183 = new LinkedHashSet();

    /* JADX INFO: renamed from: ܽ */
    public final LinkedHashSet f15181 = new LinkedHashSet();

    /* JADX INFO: renamed from: ܿ */
    public final LinkedHashSet f15182 = new LinkedHashSet();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized ArrayList m13623(int i, String str) {
        ArrayList arrayList;
        this.f15182.add(m13621(i, str));
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f15179.entrySet()) {
            C20128 c20128 = (C20128) entry.getValue();
            if (c20128.f62316 && c20128.f62315.f35811 == i && C12826.equals(c20128.f62315.f35809, str)) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m13619((String) it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized ArrayList m13624(String str, String str2) {
        ArrayList arrayList;
        this.f15183.add(str);
        this.f15181.add(str2);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f15180.get(str2);
        if (linkedHashSet2 != null) {
            linkedHashSet.addAll(linkedHashSet2);
        }
        arrayList = new ArrayList();
        for (String str3 : linkedHashSet) {
            if (m13619(str3) != null) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized ArrayList m13625(String str, String str2, C12752 c12752) {
        ArrayList arrayListM13618;
        arrayListM13618 = m13618(c12752.f35811, str, c12752.f35809);
        Iterator it = arrayListM13618.iterator();
        while (it.hasNext()) {
            m13619((String) it.next());
        }
        this.f15183.remove(str);
        this.f15181.remove(str2);
        this.f15182.remove(m13621(c12752.f35811, c12752.f35809));
        m13620(str, str2, c12752, false);
        return arrayListM13618;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m13626(String str, String str2, C12752 c12752) {
        if (!this.f15183.contains(str) && !this.f15181.contains(str2)) {
            if (!this.f15182.contains(m13621(c12752.f35811, c12752.f35809))) {
                if (!m13622(c12752.f35811, str, c12752.f35809)) {
                    m13620(str, str2, c12752, true);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m13622(int i, String str, String str2) {
        LinkedHashMap linkedHashMap = this.f15179;
        C20128 c20128 = (C20128) linkedHashMap.get(str);
        if (c20128 != null && !c20128.f62316) {
            return true;
        }
        for (C20128 c20129 : linkedHashMap.values()) {
            if (!c20129.f62316 && c20129.f62315.f35811 == i && C12826.equals(c20129.f62315.f35809, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m13618(int i, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f15179.entrySet()) {
            C20128 c20128 = (C20128) entry.getValue();
            if (c20128.f62316 && (((String) entry.getKey()).equals(str) || (c20128.f62315.f35811 == i && C12826.equals(c20128.f62315.f35809, str2)))) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13620(String str, String str2, C12752 c12752, boolean z) {
        m13619(str);
        this.f15179.put(str, new C20128(str2, c12752, z));
        LinkedHashMap linkedHashMap = this.f15180;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(str2, linkedHashSet);
        }
        linkedHashSet.add(str);
    }

    /* JADX INFO: renamed from: ֫ */
    private C20128 m13619(String str) {
        C20128 c20128 = (C20128) this.f15179.remove(str);
        if (c20128 == null) {
            return null;
        }
        String str2 = c20128.f62314;
        LinkedHashMap linkedHashMap = this.f15180;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet != null) {
            linkedHashSet.remove(str);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(c20128.f62314);
            }
        }
        return c20128;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m13621(int i, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = C2692.f4521;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        sb.append(i);
        return sb.toString();
    }
}
