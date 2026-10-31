package l;

import bin.mt.json.JSONObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5807 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16297(JSONObject jSONObject, InterfaceC10041 interfaceC10041, String str, String... strArr) throws C3059 {
        List listAsList = Arrays.asList(strArr);
        HashSet hashSet = new HashSet();
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2) || !hashSet.add(str2)) {
                throw interfaceC10041.mo2454(jSONObject.get(str2), str, str2);
            }
        }
        for (String str3 : strArr) {
            if (!hashSet.contains(str3)) {
                throw interfaceC10041.mo2454(null, C20094.m46315("Missing parameter: ", str3), str3);
            }
        }
    }
}
