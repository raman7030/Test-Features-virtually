package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֡ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0142 extends AbstractC2821 implements InterfaceC8898 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f1265;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5082 f1266;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet f1267;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f1268;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TreeSet f1269;

    public C0142(C22016 c22016, C5082 c5082, InterfaceC7397 interfaceC7397) {
        super(2);
        this.f1267 = new HashSet();
        TreeSet<String> treeSet = new TreeSet();
        this.f1269 = treeSet;
        this.f1268 = new HashMap();
        this.f1265 = new HashMap();
        this.f1266 = c5082;
        c22016.m49537(new C19194(this, interfaceC7397));
        ArrayList<C18488> arrayList = new ArrayList(treeSet.size());
        for (String str : treeSet) {
            C18488 c18488 = new C18488();
            c18488.f57313 = -1;
            c18488.f57314 = -1;
            c18488.f57316 = str;
            c18488.f57315 = str;
            arrayList.add(c18488);
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18488 c18489 = (C18488) arrayList.get(i2);
                String str2 = c18489.f57315;
                if (i < 0) {
                    throw new IllegalArgumentException();
                }
                int i3 = 0;
                int iIndexOf = 0;
                while (true) {
                    if (i3 >= i) {
                        int iIndexOf2 = str2.indexOf(47, iIndexOf + 1);
                        iIndexOf2 = iIndexOf2 == -1 ? str2.length() : iIndexOf2;
                        c18489.f57313 = iIndexOf;
                        c18489.f57314 = iIndexOf2;
                        c18489.f57317 = str2.substring(iIndexOf, iIndexOf2);
                        c18489.f57318 = str2.substring(0, iIndexOf);
                        break;
                    }
                    iIndexOf = str2.indexOf(47, iIndexOf) + 1;
                    if (iIndexOf == 0) {
                        c18489.f57314 = -1;
                        c18489.f57313 = -1;
                        c18489.f57317 = null;
                        c18489.f57318 = str2;
                        break;
                    }
                    i3++;
                }
            }
            i++;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C18488 c184810 : arrayList) {
                String str3 = c184810.f57317;
                if (str3 != null) {
                    String strM23341 = C9045.m23341(new StringBuilder(), c184810.f57318, str3);
                    List arrayList2 = (List) linkedHashMap.get(strM23341);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strM23341, arrayList2);
                    }
                    arrayList2.add(c184810);
                }
            }
            Collection<List> collectionValues = linkedHashMap.values();
            if (collectionValues.isEmpty()) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C18488 c184811 = (C18488) arrayList.get(i4);
                    if (c5082.m14633(c184811.f57315)) {
                        c184811.f57313 = 0;
                        c184811.m42983(m1224("pkg/"), false);
                    }
                }
                for (C18488 c184812 : arrayList) {
                    this.f1265.put(c184812.f57316, c184812.f57315);
                }
                return;
            }
            for (List<C18488> list : collectionValues) {
                C18488 c184813 = (C18488) list.get(0);
                if (c5082.m14634(c184813.f57317)) {
                    String strM1224 = m1224(c184813.f57318);
                    for (C18488 c184814 : list) {
                        c184814.m42983(strM1224, true);
                        this.f1267.add(c184814.f57315);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1225(C2966 c2966) {
        String strM20585 = C7695.m20585(c2966);
        if (strM20585 == null) {
            throw new IllegalStateException();
        }
        int iLastIndexOf = strM20585.lastIndexOf(47);
        String strSubstring = iLastIndexOf == -1 ? "" : strM20585.substring(0, iLastIndexOf);
        String strConcat = (String) this.f1265.get(strSubstring);
        if (strConcat != null) {
            if (strSubstring.isEmpty()) {
                strConcat = strConcat.concat("/");
            }
            StringBuilder sbM15339 = C5368.m15339(strConcat);
            sbM15339.append(strM20585.substring(strSubstring.length()));
            c2966.mo13103((Object) sbM15339.toString());
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m1224(String str) {
        String string;
        HashSet hashSet;
        HashMap map = this.f1268;
        AbstractC0890 abstractC0890M3238 = (AbstractC0890) map.get(str);
        if (abstractC0890M3238 == null) {
            abstractC0890M3238 = AbstractC0890.m3238();
            map.put(str, abstractC0890M3238);
        }
        do {
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(abstractC0890M3238.mo3239());
            string = sbM15339.toString();
            hashSet = this.f1267;
        } while (hashSet.contains(string));
        hashSet.add(string);
        return string;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m1222(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }
}
