package p067l;

import bin.p000mt.json.JSONObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6W8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7887 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18222(JSONObject jSONObject, InterfaceC11911 interfaceC11911, String str, String... strArr) throws C5276 {
        List listAsList = Arrays.asList(strArr);
        HashSet hashSet = new HashSet();
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2) || !hashSet.add(str2)) {
                throw interfaceC11911.mo4809(jSONObject.get(str2), str, str2);
            }
        }
        for (String str3 : strArr) {
            if (!hashSet.contains(str3)) {
                throw interfaceC11911.mo4809(null, C21466.m48631("Missing parameter: ", str3), str3);
            }
        }
    }
}
