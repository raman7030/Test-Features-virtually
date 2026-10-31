package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۫ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12484 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f37512 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f37509 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f37510 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f37513 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37511 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30644(String... strArr) {
        for (String str : strArr) {
            C16990.m39823(str);
            this.f37512.add(new C3312(str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30643(String str, String... strArr) {
        C16990.m39823(str);
        if (!(strArr.length > 0)) {
            throw new C14167("No attribute names supplied.");
        }
        C3312 c3312 = new C3312(str);
        this.f37512.add(c3312);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            C16990.m39823(str2);
            hashSet.add(new C22362(str2));
        }
        HashMap map = this.f37509;
        if (map.containsKey(c3312)) {
            ((Set) map.get(c3312)).addAll(hashSet);
        } else {
            map.put(c3312, hashSet);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30641(String str, String str2) {
        C16990.m39823("input");
        C16990.m39823(str);
        C16990.m39823(str2);
        C3312 c3312 = new C3312("input");
        this.f37512.add(c3312);
        C22362 c22362 = new C22362(str);
        C20246 c20246 = new C20246(str2);
        HashMap map = this.f37510;
        if (map.containsKey(c3312)) {
            ((Map) map.get(c3312)).put(c22362, c20246);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(c22362, c20246);
        map.put(c3312, map2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30640() {
        this.f37511 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30642(String str, String str2, String... strArr) {
        Map map;
        Set set;
        C16990.m39823(str);
        C16990.m39823(str2);
        C3312 c3312 = new C3312(str);
        C22362 c22362 = new C22362(str2);
        HashMap map2 = this.f37513;
        if (map2.containsKey(c3312)) {
            map = (Map) map2.get(c3312);
        } else {
            HashMap map3 = new HashMap();
            map2.put(c3312, map3);
            map = map3;
        }
        if (map.containsKey(c22362)) {
            set = (Set) map.get(c22362);
        } else {
            HashSet hashSet = new HashSet();
            map.put(c22362, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            C16990.m39823(str3);
            set.add(new C4723(str3));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15578 m30639(String str) {
        C15578 c15578 = new C15578();
        C3312 c3312 = new C3312(str);
        HashMap map = this.f37510;
        if (map.containsKey(c3312)) {
            for (Map.Entry entry : ((Map) map.get(c3312)).entrySet()) {
                c15578.put(((C22362) entry.getKey()).toString(), ((C20246) entry.getValue()).toString());
            }
        }
        return c15578;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30645(String str, C19814 c19814, C9230 c9230) {
        C3312 c3312 = new C3312(str);
        C22362 c22362 = new C22362(c9230.getKey());
        Set set = (Set) this.f37509.get(c3312);
        if (set != null && set.contains(c22362)) {
            HashMap map = this.f37513;
            if (!map.containsKey(c3312)) {
                return true;
            }
            Map map2 = (Map) map.get(c3312);
            if (!map2.containsKey(c22362)) {
                return true;
            }
            Set set2 = (Set) map2.get(c22362);
            String strMo25043 = c19814.mo25043(c9230.getKey());
            if (strMo25043.length() == 0) {
                strMo25043 = c9230.getValue();
            }
            if (!this.f37511) {
                c9230.setValue(strMo25043);
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String string = ((C4723) it.next()).toString();
                if (!string.equals("#")) {
                    if (C23340.m51750(strMo25043).startsWith(string.concat(":"))) {
                        return true;
                    }
                } else if (strMo25043.startsWith("#") && !strMo25043.matches(".*\\s.*")) {
                    return true;
                }
            }
            return false;
        }
        if (((Map) this.f37510.get(c3312)) != null) {
            C15578 c15578M30639 = m30639(str);
            String key = c9230.getKey();
            if (c15578M30639.m36738(key)) {
                return c15578M30639.m36725(key).equals(c9230.getValue());
            }
        }
        return !str.equals(":all") && m30645(":all", c19814, c9230);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30646(String str) {
        return this.f37512.contains(new C3312(str));
    }
}
