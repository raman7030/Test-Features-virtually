package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6773 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6918 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m15849(C9299 c9299) {
        String strM45665;
        JSONArray jSONArrayArray = JSON.array();
        int i = c9299.f25283;
        int i2 = c9299.f25278;
        boolean z = i < i2;
        int i3 = c9299.f25281;
        String str = c9299.f25282;
        if (z) {
            strM45665 = C20186.m45665("available_apks", "available_apks", "", 0, JSON.object().add("prefix", str).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("offset", i));
            jSONArrayArray.add(C11982.m27418(C9417.m21913("workspaceId", "available_apks", "editSessionId", "").add("nextCursor", strM45665).add("limit", i3), "mt_apk_continue", "continue", "Continue available APK files"));
        } else {
            strM45665 = null;
        }
        JSONObject jSONObjectAdd = JSON.object().add("prefix", str);
        ArrayList<C15333> arrayList = c9299.f25279;
        JSONArray jSONArrayArray2 = JSON.array();
        for (C15333 c15333 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c15333.f43756).add("size", c15333.f43761).add("lastModified", c15333.f43755).add("appLabel", c15333.f43753).add("packageName", c15333.f43758).add("versionName", c15333.f43760);
            Long l2 = c15333.f43754;
            jSONArrayArray2.add(jSONObjectAdd2.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("manifestAvailable", c15333.f43757).add("manifestError", c15333.f43759));
        }
        return C21370.m48410(jSONObjectAdd.add("items", jSONArrayArray2).add("pagination", JSON.object().add("hasMore", i < i2).add("nextCursor", strM45665 == null ? JSON.NULL : JSON.value(strM45665)).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", c9299.f25280)), jSONArrayArray);
    }
}
