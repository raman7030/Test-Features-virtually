package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֡ܶ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C0501 extends C21669 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m2171(int i) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m2173(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C16023.f49426;
        }
        if (size == 1) {
            C15818 c15818 = (C15818) arrayList.get(0);
            C11233.m27805(c15818, "pair");
            Map mapSingletonMap = Collections.singletonMap(c15818.m37452(), c15818.m37453());
            C11233.m27803(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m2171(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15818 c15819 = (C15818) it.next();
            linkedHashMap.put(c15819.m37450(), c15819.m37451());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m2174(LinkedHashMap linkedHashMap) {
        C11233.m27805(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return C16023.f49426;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        C11233.m27805(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C11233.m27803(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
