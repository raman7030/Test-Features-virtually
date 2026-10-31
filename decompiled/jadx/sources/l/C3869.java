package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final class C3869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f12372 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f12373 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12376 = new LinkedHashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12374 = new LinkedHashSet();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12375 = new LinkedHashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m11687(int i, String str) {
        ArrayList arrayList;
        this.f12375.add(m11685(i, str));
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f12372.entrySet()) {
            C18686 c18686 = (C18686) entry.getValue();
            if (c18686.f59093 && c18686.f59092.f32833 == i && C11003.equals(c18686.f59092.f32831, str)) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11683((String) it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m11688(String str, String str2) {
        ArrayList arrayList;
        this.f12376.add(str);
        this.f12374.add(str2);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f12373.get(str2);
        if (linkedHashSet2 != null) {
            linkedHashSet.addAll(linkedHashSet2);
        }
        arrayList = new ArrayList();
        for (String str3 : linkedHashSet) {
            if (m11683(str3) != null) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m11689(String str, String str2, C10925 c10925) {
        ArrayList arrayListM11682;
        arrayListM11682 = m11682(c10925.f32833, str, c10925.f32831);
        Iterator it = arrayListM11682.iterator();
        while (it.hasNext()) {
            m11683((String) it.next());
        }
        this.f12376.remove(str);
        this.f12374.remove(str2);
        this.f12375.remove(m11685(c10925.f32833, c10925.f32831));
        m11684(str, str2, c10925, false);
        return arrayListM11682;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m11690(String str, String str2, C10925 c10925) {
        if (!this.f12376.contains(str) && !this.f12374.contains(str2)) {
            if (!this.f12375.contains(m11685(c10925.f32833, c10925.f32831))) {
                if (!m11686(c10925.f32833, str, c10925.f32831)) {
                    m11684(str, str2, c10925, true);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m11686(int i, String str, String str2) {
        LinkedHashMap linkedHashMap = this.f12372;
        C18686 c18686 = (C18686) linkedHashMap.get(str);
        if (c18686 != null && !c18686.f59093) {
            return true;
        }
        for (C18686 c18687 : linkedHashMap.values()) {
            if (!c18687.f59093 && c18687.f59092.f32833 == i && C11003.equals(c18687.f59092.f32831, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m11682(int i, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f12372.entrySet()) {
            C18686 c18686 = (C18686) entry.getValue();
            if (c18686.f59093 && (((String) entry.getKey()).equals(str) || (c18686.f59092.f32833 == i && C11003.equals(c18686.f59092.f32831, str2)))) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11684(String str, String str2, C10925 c10925, boolean z) {
        m11683(str);
        this.f12372.put(str, new C18686(str2, c10925, z));
        LinkedHashMap linkedHashMap = this.f12373;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(str2, linkedHashSet);
        }
        linkedHashSet.add(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18686 m11683(String str) {
        C18686 c18686 = (C18686) this.f12372.remove(str);
        if (c18686 == null) {
            return null;
        }
        String str2 = c18686.f59091;
        LinkedHashMap linkedHashMap = this.f12373;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str2);
        if (linkedHashSet != null) {
            linkedHashSet.remove(str);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(c18686.f59091);
            }
        }
        return c18686;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11685(int i, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = C0340.f1745;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        sb.append(i);
        return sb.toString();
    }
}
