package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75N */
/* JADX INFO: loaded from: classes4.dex */
public final class C17237 {

    /* JADX INFO: renamed from: ֫ */
    public final String f51288;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f51289;

    /* JADX INFO: renamed from: ۧ */
    public final List f51290;

    /* JADX INFO: renamed from: ܳ */
    public final int f51291;

    /* JADX INFO: renamed from: ܽ */
    public final long f51292;

    /* JADX INFO: renamed from: ܿ */
    public final int f51293;

    /* JADX INFO: renamed from: ᩳ */
    public final int f51294;

    /* JADX INFO: renamed from: ᩷ */
    public final int f51295;

    /* JADX INFO: renamed from: ᩻ */
    public final int f51296;

    /* JADX INFO: renamed from: ֫ */
    public static C17237 m39002() {
        List list = Collections.EMPTY_LIST;
        return new C17237();
    }

    public C17237(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f51296 = jSONObject.getInt("rangeCount", 0);
        this.f51294 = jSONObject.getInt("nextPhaseIndex", 0);
        this.f51293 = jSONObject.getInt("nextRangeIndex", 0);
        this.f51292 = C24614.m54251(jSONObject, "nextByteOffsetInRange", 0L);
        this.f51291 = jSONObject.getInt("nextRelocationIndex", 0);
        this.f51295 = jSONObject.getInt("scannedBytes", 0);
        boolean z = jSONObject.getBoolean("scanComplete", false);
        this.f51289 = z;
        String string = jSONObject.getString("completionReason", "");
        string = string.isEmpty() ? z ? "scan_space_exhausted" : "scan_budget_exhausted" : string;
        if (!C8377.m19517(string)) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f51288 = string;
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C10533.m24268(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        this.f51290 = listUnmodifiableList;
    }

    public C17237() {
        List list = Collections.EMPTY_LIST;
        this.f51296 = 0;
        this.f51294 = 0;
        this.f51293 = 0;
        this.f51292 = 0L;
        this.f51291 = 0;
        this.f51295 = 0;
        this.f51289 = true;
        if (!C8377.m19517("target_not_mapped")) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f51288 = "target_not_mapped";
        this.f51290 = C21562.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17237 m39003(JSONObject jSONObject) {
        return new C17237(jSONObject);
    }
}
