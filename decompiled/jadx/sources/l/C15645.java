package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75N */
/* JADX INFO: loaded from: classes4.dex */
public final class C15645 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f48148;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f48149;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f48150;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f48151;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f48152;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f48153;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f48154;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f48155;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f48156;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15645 m36836() {
        List list = Collections.EMPTY_LIST;
        return new C15645();
    }

    public C15645(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f48156 = jSONObject.getInt("rangeCount", 0);
        this.f48154 = jSONObject.getInt("nextPhaseIndex", 0);
        this.f48153 = jSONObject.getInt("nextRangeIndex", 0);
        this.f48152 = C23407.m51853(jSONObject, "nextByteOffsetInRange", 0L);
        this.f48151 = jSONObject.getInt("nextRelocationIndex", 0);
        this.f48155 = jSONObject.getInt("scannedBytes", 0);
        boolean z = jSONObject.getBoolean("scanComplete", false);
        this.f48149 = z;
        String string = jSONObject.getString("completionReason", "");
        string = string.isEmpty() ? z ? "scan_space_exhausted" : "scan_budget_exhausted" : string;
        if (!C6322.m17577(string)) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f48148 = string;
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C8591.m22299(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C20195.unmodifiableList(arrayList);
        }
        this.f48150 = listUnmodifiableList;
    }

    public C15645() {
        List list = Collections.EMPTY_LIST;
        this.f48156 = 0;
        this.f48154 = 0;
        this.f48153 = 0;
        this.f48152 = 0L;
        this.f48151 = 0;
        this.f48155 = 0;
        this.f48149 = true;
        if (!C6322.m17577("target_not_mapped")) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f48148 = "target_not_mapped";
        this.f48150 = C20195.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15645 m36837(JSONObject jSONObject) {
        return new C15645(jSONObject);
    }
}
