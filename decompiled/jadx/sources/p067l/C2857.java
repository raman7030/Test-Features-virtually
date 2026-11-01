package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2857 {

    /* JADX INFO: renamed from: ֫ */
    public final String f4933;

    /* JADX INFO: renamed from: ۧ */
    public final int f4934;

    /* JADX INFO: renamed from: ܽ */
    public final int f4935;

    /* JADX INFO: renamed from: ܿ */
    public final List f4936;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f4937;

    public C2857(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f4933 = jSONObject.getString("arch", "");
        this.f4934 = jSONObject.getInt("bits", 0);
        C24614.m54251(jSONObject, "address", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("instructions");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(new C20964(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        this.f4936 = listUnmodifiableList;
        this.f4935 = jSONObject.getInt("bytesConsumed", 0);
        this.f4937 = jSONObject.getBoolean("incompleteInstructionAtEnd", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2857 m4592(JSONObject jSONObject) {
        return new C2857(jSONObject);
    }
}
