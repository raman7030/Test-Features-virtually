package p067l;

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
public final class C2503 extends AbstractC5050 implements InterfaceC10825 {

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f4040;

    /* JADX INFO: renamed from: ܳ */
    public final C7198 f4041;

    /* JADX INFO: renamed from: ܽ */
    public final HashSet f4042;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f4043;

    /* JADX INFO: renamed from: ᩳ */
    public final TreeSet f4044;

    public C2503(C23292 c23292, C7198 c7198, InterfaceC1209 interfaceC1209) {
        super(2);
        this.f4042 = new HashSet();
        TreeSet<String> treeSet = new TreeSet();
        this.f4044 = treeSet;
        this.f4043 = new HashMap();
        this.f4040 = new HashMap();
        this.f4041 = c7198;
        c23292.m51873(new C20610(this, interfaceC1209));
        ArrayList<C19939> arrayList = new ArrayList(treeSet.size());
        for (String str : treeSet) {
            C19939 c19939 = new C19939();
            c19939.f60532 = -1;
            c19939.f60533 = -1;
            c19939.f60535 = str;
            c19939.f60534 = str;
            arrayList.add(c19939);
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C19939 c199310 = (C19939) arrayList.get(i2);
                String str2 = c199310.f60534;
                if (i < 0) {
                    throw new IllegalArgumentException();
                }
                int i3 = 0;
                int iIndexOf = 0;
                while (true) {
                    if (i3 >= i) {
                        int iIndexOf2 = str2.indexOf(47, iIndexOf + 1);
                        iIndexOf2 = iIndexOf2 == -1 ? str2.length() : iIndexOf2;
                        c199310.f60532 = iIndexOf;
                        c199310.f60533 = iIndexOf2;
                        c199310.f60536 = str2.substring(iIndexOf, iIndexOf2);
                        c199310.f60537 = str2.substring(0, iIndexOf);
                        break;
                    }
                    iIndexOf = str2.indexOf(47, iIndexOf) + 1;
                    if (iIndexOf == 0) {
                        c199310.f60533 = -1;
                        c199310.f60532 = -1;
                        c199310.f60536 = null;
                        c199310.f60537 = str2;
                        break;
                    }
                    i3++;
                }
            }
            i++;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C19939 c199311 : arrayList) {
                String str3 = c199311.f60536;
                if (str3 != null) {
                    String strM25286 = C10965.m25286(new StringBuilder(), c199311.f60537, str3);
                    List arrayList2 = (List) linkedHashMap.get(strM25286);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strM25286, arrayList2);
                    }
                    arrayList2.add(c199311);
                }
            }
            Collection<List> collectionValues = linkedHashMap.values();
            if (collectionValues.isEmpty()) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C19939 c199312 = (C19939) arrayList.get(i4);
                    if (c7198.m16541(c199312.f60534)) {
                        c199312.f60532 = 0;
                        c199312.m45259(m3626("pkg/"), false);
                    }
                }
                for (C19939 c199313 : arrayList) {
                    this.f4040.put(c199313.f60535, c199313.f60534);
                }
                return;
            }
            for (List<C19939> list : collectionValues) {
                C19939 c199314 = (C19939) list.get(0);
                if (c7198.m16542(c199314.f60536)) {
                    String strM3626 = m3626(c199314.f60537);
                    for (C19939 c199315 : list) {
                        c199315.m45259(strM3626, true);
                        this.f4042.add(c199315.f60534);
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3627(C5187 c5187) {
        String strM22565 = C9682.m22565(c5187);
        if (strM22565 == null) {
            throw new IllegalStateException();
        }
        int iLastIndexOf = strM22565.lastIndexOf(47);
        String strSubstring = iLastIndexOf == -1 ? "" : strM22565.substring(0, iLastIndexOf);
        String strConcat = (String) this.f4040.get(strSubstring);
        if (strConcat != null) {
            if (strSubstring.isEmpty()) {
                strConcat = strConcat.concat("/");
            }
            StringBuilder sbM17248 = C7470.m17248(strConcat);
            sbM17248.append(strM22565.substring(strSubstring.length()));
            c5187.mo14967((Object) sbM17248.toString());
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m3626(String str) {
        String string;
        HashSet hashSet;
        HashMap map = this.f4043;
        AbstractC3214 abstractC3214M5552 = (AbstractC3214) map.get(str);
        if (abstractC3214M5552 == null) {
            abstractC3214M5552 = AbstractC3214.m5552();
            map.put(str, abstractC3214M5552);
        }
        do {
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(abstractC3214M5552.mo5553());
            string = sbM17248.toString();
            hashSet = this.f4042;
        } while (hashSet.contains(string));
        hashSet.add(string);
        return string;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m3624(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }
}
