package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֡ܶ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C2845 extends C22963 {
    /* JADX INFO: renamed from: ֫ */
    public static int m4538(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Map m4540(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C17597.f52590;
        }
        if (size == 1) {
            C17402 c17402 = (C17402) arrayList.get(0);
            C13045.m29867(c17402, "pair");
            Map mapSingletonMap = Collections.singletonMap(c17402.m39624(), c17402.m39625());
            C13045.m29865(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m4538(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17402 c17403 = (C17402) it.next();
            linkedHashMap.put(c17403.m39622(), c17403.m39623());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Map m4541(LinkedHashMap linkedHashMap) {
        C13045.m29867(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return C17597.f52590;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        C13045.m29867(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C13045.m29865(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
