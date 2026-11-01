package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۫ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E79L */
/* JADX INFO: loaded from: classes3.dex */
public final class C13993 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f39494 = new LinkedHashMap();

    public C13993(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6617 abstractC6617 = (AbstractC6617) it.next();
            LinkedHashMap linkedHashMap = this.f39494;
            if (linkedHashMap.containsKey(abstractC6617.mo5353())) {
                throw new IllegalArgumentException("Duplicate MCP tool: ".concat(abstractC6617.mo5353()));
            }
            linkedHashMap.put(abstractC6617.mo5353(), abstractC6617);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONArray m31798() {
        JSONArray jSONArrayArray = JSON.array();
        for (AbstractC6617 abstractC6617 : this.f39494.values()) {
            abstractC6617.getClass();
            JSONObject jSONObjectAdd = JSON.object().add("name", abstractC6617.mo5353()).add("title", abstractC6617.mo5350()).add("description", abstractC6617.mo5349()).add("annotations", abstractC6617.mo5346()).add("inputSchema", abstractC6617.mo5351());
            JSONObject jSONObjectMo5352 = abstractC6617.mo5352();
            if (jSONObjectMo5352 != null) {
                jSONObjectAdd.add("outputSchema", jSONObjectMo5352);
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m31799(JSONObject jSONObject, String str) throws C5276 {
        AbstractC6617 abstractC6617 = (AbstractC6617) this.f39494.get(str);
        if (abstractC6617 == null) {
            throw C5276.m11406("Unknown tool", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return C11982.m27420(abstractC6617.mo5348(jSONObject));
        } catch (C5276 e) {
            return C11982.m27417(abstractC6617.mo5347(e));
        }
    }
}
