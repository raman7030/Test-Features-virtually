package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩷ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6XW */
/* JADX INFO: loaded from: classes5.dex */
public final class C22382 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f70608;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f70609;

    /* JADX INFO: renamed from: ܽ */
    public final C24983 f70610;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "List an allowed local directory as a compact entry list. path accepts an absolute path or a Home-relative path; only this tool accepts path=\"\" as current Home. Pass cursor=\"\" initially, limit=200 unless another page size is needed, and no more than 1000. The listing includes hidden entries, uses absolute data.directoryPath as its fixed base, and recursively traverses readable directories depth-first without following recognized links. Later pages may reuse directory metadata for up to 30 seconds; start with an empty cursor for a fresh listing. This is not a filesystem snapshot. Copy nextActions[0].arguments unchanged for later pages.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "List Local Files";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_list";
    }

    public C22382(C24983 c24983) {
        this.f70610 = c24983;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f70608 == null) {
            this.f70608 = m50235();
        }
        return this.f70608;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f70609 == null) {
            this.f70609 = C3935.m7765("Result for mt_file_list.", C3935.m7762(JSON.object().add("directoryPath", C3935.m7775("string", "Normalized absolute directory used as the base for every listed path.")).add("listing", C3935.m7771("One entry per array element, formatted as type size modifiedAt relativePath. Split only at the first three ASCII spaces; preserve the remaining raw relativePath without trimming, unquoting, or splitting on newlines. Types: f=file, d=directory, l=link, o=other. Size is bytes for known regular files, otherwise -; modifiedAt is an ISO-8601 timestamp or -. Empty array for no entries.")).add("pagination", C20175.m45657(JSON.object().add("hasMore", C3935.m7775(ClassTransform.BOOLEAN, "Whether another page remains for this directory traversal.")), "string", "Opaque cursor copied unchanged; empty string on the last page.", "nextCursor", "File list pagination.")), "One local directory listing page."), C5595.m12396("mt_file_list"), C3935.m7768("Contains one directly executable mt_file_list continuation when hasMore=true; otherwise empty.", C3935.m7763(m50235(), "mt_file_list", "continue")));
        }
        return this.f70609;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_list", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C8970(), "Invalid mt_file_list argument", MotionUtils.EASING_TYPE_PATH, "recursive", "cursor", "limit");
        String strM50232 = m50232(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m50234(jSONValue, "Invalid recursive", "recursive");
        }
        boolean zAsBoolean = jSONValue.asBoolean();
        String strM50233 = m50232(jSONObject, "cursor");
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || !jSONValue2.isNumber()) {
            throw m50234(jSONValue2, "Invalid limit", "limit");
        }
        try {
            int iM5572 = C3223.m5572(jSONValue2);
            if (iM5572 >= 1 && iM5572 <= 1000) {
                C19619 c19619M54884 = this.f70610.m54884(strM50232, iM5572, strM50233, zAsBoolean);
                String str = c19619M54884.f59659;
                String str2 = c19619M54884.f59663;
                boolean z = c19619M54884.f59660;
                JSONObject jSONObjectAdd = JSON.object().add("hasMore", z).add("nextCursor", str2);
                JSONArray jSONArrayArray = JSON.array();
                Iterator it = c19619M54884.f59664.iterator();
                while (it.hasNext()) {
                    jSONArrayArray.add((String) it.next());
                }
                JSONObject jSONObjectAdd2 = JSON.object().add("directoryPath", str).add("listing", jSONArrayArray).add("pagination", jSONObjectAdd);
                JSONArray jSONArrayArray2 = JSON.array();
                if (z) {
                    jSONArrayArray2.add(C11982.m27418(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("recursive", c19619M54884.f59661).add("cursor", str2).add("limit", c19619M54884.f59662), "mt_file_list", "continue", "Continue this exact local directory traversal."));
                }
                return new C14663(C21370.m48410(jSONObjectAdd2, jSONArrayArray2));
            }
            throw m50234(jSONValue2, "limit must be between 1 and 1000", "limit");
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m50234(jSONValue2, "Invalid limit", "limit");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50232(JSONObject jSONObject, String str) throws C5276 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m50234(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m50234(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "").add("recursive", false).add("cursor", "").add("limit", 200));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m50235() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute or Home-relative directory. Pass \"\" (empty string) for the current Home directory.")).add("recursive", C3935.m7775(ClassTransform.BOOLEAN, "Whether to traverse readable subdirectories depth-first without following recognized links.")).add("cursor", C3935.m7775("string", "Pass \"\" (empty string) initially; later copy the server-provided cursor unchanged.")), "integer", "Page size from 1 to 1000; recommended value is 200 and must remain unchanged for a cursor.", "limit", "Arguments for mt_file_list.");
    }
}
