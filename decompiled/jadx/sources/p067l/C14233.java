package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۫ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LL */
/* JADX INFO: loaded from: classes3.dex */
public final class C14233 {

    /* JADX INFO: renamed from: ܿ */
    public final HashSet f40535 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f40532 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f40533 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f40536 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public boolean f40534 = false;

    /* JADX INFO: renamed from: ֫ */
    public final void m32709(String... strArr) {
        for (String str : strArr) {
            C18515.m42066(str);
            this.f40535.add(new C5516(str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32708(String str, String... strArr) {
        C18515.m42066(str);
        if (!(strArr.length > 0)) {
            throw new C15832("No attribute names supplied.");
        }
        C5516 c5516 = new C5516(str);
        this.f40535.add(c5516);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C18515.m42066(str2);
            hashSet.add(new C23621(str2));
        }
        HashMap map = this.f40532;
        if (map.containsKey(c5516)) {
            ((Set) map.get(c5516)).addAll(hashSet);
        } else {
            map.put(c5516, hashSet);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32706(String str, String str2) {
        C18515.m42066("input");
        C18515.m42066(str);
        C18515.m42066(str2);
        C5516 c5516 = new C5516("input");
        this.f40535.add(c5516);
        C23621 c23621 = new C23621(str);
        C21610 c21610 = new C21610(str2);
        HashMap map = this.f40533;
        if (map.containsKey(c5516)) {
            ((Map) map.get(c5516)).put(c23621, c21610);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(c23621, c21610);
        map.put(c5516, map2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32705() {
        this.f40534 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32707(String str, String str2, String... strArr) {
        Map map;
        Set set;
        C18515.m42066(str);
        C18515.m42066(str2);
        C5516 c5516 = new C5516(str);
        C23621 c23621 = new C23621(str2);
        HashMap map2 = this.f40536;
        if (map2.containsKey(c5516)) {
            map = (Map) map2.get(c5516);
        } else {
            HashMap map3 = new HashMap();
            map2.put(c5516, map3);
            map = map3;
        }
        if (map.containsKey(c23621)) {
            set = (Set) map.get(c23621);
        } else {
            HashSet hashSet = new HashSet();
            map.put(c23621, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            C18515.m42066(str3);
            set.add(new C6857(str3));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17173 m32704(String str) {
        C17173 c17173 = new C17173();
        C5516 c5516 = new C5516(str);
        HashMap map = this.f40533;
        if (map.containsKey(c5516)) {
            for (Map.Entry entry : ((Map) map.get(c5516)).entrySet()) {
                c17173.put(((C23621) entry.getKey()).toString(), ((C21610) entry.getValue()).toString());
            }
        }
        return c17173;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32710(String str, C21199 c21199, C11140 c11140) {
        C5516 c5516 = new C5516(str);
        C23621 c23621 = new C23621(c11140.getKey());
        Set set = (Set) this.f40532.get(c5516);
        if (set != null && set.contains(c23621)) {
            HashMap map = this.f40536;
            if (!map.containsKey(c5516)) {
                return true;
            }
            Map map2 = (Map) map.get(c5516);
            if (!map2.containsKey(c23621)) {
                return true;
            }
            Set set2 = (Set) map2.get(c23621);
            String strMo27060 = c21199.mo27060(c11140.getKey());
            if (strMo27060.length() == 0) {
                strMo27060 = c11140.getValue();
            }
            if (!this.f40534) {
                c11140.setValue(strMo27060);
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String string = ((C6857) it.next()).toString();
                if (!string.equals("#")) {
                    if (C24550.m54147(strMo27060).startsWith(string.concat(":"))) {
                        return true;
                    }
                } else if (strMo27060.startsWith("#") && !strMo27060.matches(".*\\s.*")) {
                    return true;
                }
            }
            return false;
        }
        if (((Map) this.f40533.get(c5516)) != null) {
            C17173 c17173M32704 = m32704(str);
            String key = c11140.getKey();
            if (c17173M32704.m38899(key)) {
                return c17173M32704.m38886(key).equals(c11140.getValue());
            }
        }
        return !str.equals(":all") && m32710(":all", c21199, c11140);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32711(String str) {
        return this.f40535.contains(new C5516(str));
    }
}
