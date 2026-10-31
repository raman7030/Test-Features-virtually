package l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֫ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M1H2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1919 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11092 m6334(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C11092();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                C11233.m27803(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new C11092(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            C11233.m27800(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new C11092(linkedHashMap);
    }
}
