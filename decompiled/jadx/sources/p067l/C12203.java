package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12203 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m28175(C13133 c13133) {
        JSONObject jSONObjectObject = JSON.object();
        ArrayList<C4415> arrayList = c13133.f36894;
        JSONArray jSONArrayArray = JSON.array();
        for (C4415 c4415 : arrayList) {
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c4415.f9915).add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/" + c4415.f9915).add("sourcePath", c4415.f9919).add("sourceExists", c4415.f9910).add("temporary", false).add("apkFileName", c4415.f9909).add("appLabel", c4415.f9913).add("packageName", c4415.f9920).add("versionName", c4415.f9911);
            Long l2 = c4415.f9912;
            jSONArrayArray.add(jSONObjectAdd.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("createdAt", c4415.f9916).add("lastAccessedAt", c4415.f9918).add("manifestAvailable", c4415.f9917).add("manifestError", c4415.f9914));
        }
        return C21370.m48410(jSONObjectObject.add("items", jSONArrayArray).add("returnedCount", arrayList.size()).add("unavailableCount", c13133.f36895), JSON.array());
    }
}
