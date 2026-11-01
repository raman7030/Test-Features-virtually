package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONHandler;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.۫ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AV2 */
/* JADX INFO: loaded from: classes4.dex */
public class C14219 extends JSONHandler {

    /* JADX INFO: renamed from: ֫ */
    public JSONValue f40507;

    @Override // bin.p000mt.json.JSONHandler
    public JSONArray startArray() {
        return new JSONArray();
    }

    @Override // bin.p000mt.json.JSONHandler
    public JSONObject startObject() {
        return new JSONObject();
    }

    @Override // bin.p000mt.json.JSONHandler
    public void endNull() {
        this.f40507 = JSON.NULL;
    }

    @Override // bin.p000mt.json.JSONHandler
    public void endBoolean(boolean z) {
        this.f40507 = z ? JSON.TRUE : JSON.FALSE;
    }

    @Override // bin.p000mt.json.JSONHandler
    public void endString(String str) {
        this.f40507 = new C9525(str);
    }

    @Override // bin.p000mt.json.JSONHandler
    public void endNumber(String str) {
        this.f40507 = new C13549(str);
    }

    @Override // bin.p000mt.json.JSONHandler
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void endArray(JSONArray jSONArray) {
        this.f40507 = jSONArray;
    }

    @Override // bin.p000mt.json.JSONHandler
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void endObject(JSONObject jSONObject) {
        this.f40507 = jSONObject;
    }

    @Override // bin.p000mt.json.JSONHandler
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public void endArrayValue(JSONArray jSONArray) {
        jSONArray.add(this.f40507);
    }

    @Override // bin.p000mt.json.JSONHandler
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void endObjectValue(JSONObject jSONObject, String str) {
        jSONObject.add(str, this.f40507);
    }

    /* JADX INFO: renamed from: ֫ */
    public JSONValue m32694() {
        return this.f40507;
    }
}
