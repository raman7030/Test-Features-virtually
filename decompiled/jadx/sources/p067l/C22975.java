package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J766 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22975 {

    /* JADX INFO: renamed from: ֫ */
    public final String f72257;

    /* JADX INFO: renamed from: ۧ */
    public final List f72258;

    /* JADX INFO: renamed from: ܽ */
    public final int f72259;

    /* JADX INFO: renamed from: ܿ */
    public final int f72260;

    /* JADX INFO: renamed from: ᩳ */
    public final int f72261;

    public C22975(JSONObject jSONObject) {
        List listUnmodifiableList;
        String string = jSONObject.getString("itemKind", "");
        C16938.m38519(string);
        this.f72257 = string;
        this.f72261 = jSONObject.getInt("offset", 0);
        this.f72259 = jSONObject.getInt("limit", 0);
        this.f72260 = jSONObject.getInt("totalCount", 0);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if ("neededLibraries".equals(string)) {
                    arrayList.add(C23645.m52596(jSONObject2));
                } else if ("sections".equals(string) || "segments".equals(string)) {
                    arrayList.add(C5540.m12229(jSONObject2));
                } else if ("imports".equals(string)) {
                    arrayList.add(C7552.m17469(jSONObject2));
                } else if ("symbols".equals(string) || "entries".equals(string)) {
                    arrayList.add(C13587.m30904(jSONObject2));
                } else if ("initArray".equals(string) || "finiArray".equals(string)) {
                    arrayList.add(C3528.m6302(jSONObject2));
                } else {
                    arrayList.add(C21634.m48850(jSONObject2));
                }
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        this.f72258 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22975 m51310(JSONObject jSONObject) {
        return new C22975(jSONObject);
    }
}
