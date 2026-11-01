package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X74A */
/* JADX INFO: loaded from: classes3.dex */
public final class C14257 {

    /* JADX INFO: renamed from: ֫ */
    public final List f40597;

    /* JADX INFO: renamed from: ۧ */
    public final int f40598;

    /* JADX INFO: renamed from: ܽ */
    public final long f40599;

    /* JADX INFO: renamed from: ܿ */
    public final int f40600;

    /* JADX INFO: renamed from: ᩳ */
    public final int f40601;

    public C14257(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f40601 = jSONObject.getInt("offset", 0);
        this.f40598 = jSONObject.getInt("limit", 0);
        this.f40600 = jSONObject.getInt("totalCount", 0);
        this.f40599 = C24614.m54251(jSONObject, "nextScanOffset", -1L);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C14927.m34147(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        this.f40597 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14257 m32765(JSONObject jSONObject) {
        return new C14257(jSONObject);
    }
}
