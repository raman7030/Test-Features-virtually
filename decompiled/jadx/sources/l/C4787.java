package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6773 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4787 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m13969(C7292 c7292) {
        String strM43398;
        JSONArray jSONArrayArray = JSON.array();
        int i = c7292.f22392;
        int i2 = c7292.f22387;
        boolean z = i < i2;
        int i3 = c7292.f22390;
        String str = c7292.f22391;
        if (z) {
            strM43398 = C18747.m43398("available_apks", "available_apks", "", 0, JSON.object().add("prefix", str).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("offset", i));
            jSONArrayArray.add(C10115.m25398(C7416.m19939("workspaceId", "available_apks", "editSessionId", "").add("nextCursor", strM43398).add("limit", i3), "mt_apk_continue", "continue", "Continue available APK files"));
        } else {
            strM43398 = null;
        }
        JSONObject jSONObjectAdd = JSON.object().add("prefix", str);
        ArrayList<C13641> arrayList = c7292.f22388;
        JSONArray jSONArrayArray2 = JSON.array();
        for (C13641 c13641 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c13641.f40675).add("size", c13641.f40680).add("lastModified", c13641.f40674).add("appLabel", c13641.f40672).add("packageName", c13641.f40677).add("versionName", c13641.f40679);
            Long l2 = c13641.f40673;
            jSONArrayArray2.add(jSONObjectAdd2.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("manifestAvailable", c13641.f40676).add("manifestError", c13641.f40678));
        }
        return C19993.m46095(jSONObjectAdd.add("items", jSONArrayArray2).add("pagination", JSON.object().add("hasMore", i < i2).add("nextCursor", strM43398 == null ? JSON.NULL : JSON.value(strM43398)).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", c7292.f22389)), jSONArrayArray);
    }
}
