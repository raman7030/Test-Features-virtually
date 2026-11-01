package p067l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֫ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M1H2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4192 {
    /* JADX INFO: renamed from: ֫ */
    public static C12910 m8507(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C12910();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                C13045.m29865(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new C12910(map);
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
            C13045.m29862(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new C12910(linkedHashMap);
    }
}
