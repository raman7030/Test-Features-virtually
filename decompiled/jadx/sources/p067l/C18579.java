package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes4.dex */
public final class C18579 {

    /* JADX INFO: renamed from: ֫ */
    public final C15597 f55440;

    /* JADX INFO: renamed from: ۜ */
    public final C6211 f55441;

    /* JADX INFO: renamed from: ۧ */
    public final String f55442;

    /* JADX INFO: renamed from: ܳ */
    public final List f55443;

    /* JADX INFO: renamed from: ܽ */
    public final int f55444;

    /* JADX INFO: renamed from: ܿ */
    public final List f55445;

    /* JADX INFO: renamed from: ᩳ */
    public final List f55446;

    /* JADX INFO: renamed from: ᩷ */
    public final List f55447;

    /* JADX INFO: renamed from: ᩻ */
    public final C17908 f55448;

    public C18579(JSONObject jSONObject) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        List listUnmodifiableList3;
        List listUnmodifiableList4;
        this.f55442 = jSONObject.getString("arch", "");
        this.f55444 = jSONObject.getInt("bits", 0);
        this.f55441 = C6211.m14062(jSONObject.getJSONObject("mapping"));
        this.f55448 = C17908.m40713(jSONObject.getJSONObject("function"));
        JSONArray jSONArray = jSONObject.getJSONArray("blocks");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C9563.m22271(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        this.f55446 = listUnmodifiableList;
        JSONArray jSONArray2 = jSONObject.getJSONArray("edges");
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            listUnmodifiableList2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(jSONArray2.size());
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                arrayList2.add(C3827.m7476(jSONArray2.getJSONObject(i2)));
            }
            listUnmodifiableList2 = C21562.unmodifiableList(arrayList2);
        }
        this.f55445 = listUnmodifiableList2;
        JSONArray jSONArray3 = jSONObject.getJSONArray("externalFlows");
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            listUnmodifiableList3 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(jSONArray3.size());
            for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                arrayList3.add(C12545.m28928(jSONArray3.getJSONObject(i3)));
            }
            listUnmodifiableList3 = C21562.unmodifiableList(arrayList3);
        }
        this.f55443 = listUnmodifiableList3;
        JSONArray jSONArray4 = jSONObject.getJSONArray("unresolvedFlows");
        if (jSONArray4 == null || jSONArray4.isEmpty()) {
            listUnmodifiableList4 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList4 = new ArrayList(jSONArray4.size());
            for (int i4 = 0; i4 < jSONArray4.size(); i4++) {
                arrayList4.add(C19250.m43860(jSONArray4.getJSONObject(i4)));
            }
            listUnmodifiableList4 = C21562.unmodifiableList(arrayList4);
        }
        this.f55447 = listUnmodifiableList4;
        this.f55440 = C15597.m35450(jSONObject.getJSONObject("analysisSummary"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18579 m42275(JSONObject jSONObject) {
        return new C18579(jSONObject);
    }
}
