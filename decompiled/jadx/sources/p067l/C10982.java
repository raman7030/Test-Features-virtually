package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10982 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f30416;

    /* JADX INFO: renamed from: ۧ */
    public final C14729 f30417;

    /* JADX INFO: renamed from: ܽ */
    public JSONObject f30418;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Move or rename one regular local file or directory. Paths may be absolute or relative to Home and must differ; the destination parent must exist. For files, overwrite=true permits replacing an existing regular file. Directories require overwrite=false and a missing destination; they cannot be merged, replaced, or moved into themselves or descendants. Moves that require copying then deleting are unsupported. Some storage locations cannot change the parent and basename together: move with the same basename first, then rename. After a failure, inspect the reported state before retrying.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Move Local File";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_move";
    }

    public C10982(C14729 c14729) {
        this.f30417 = c14729;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f30416 == null) {
            this.f30416 = C20175.m45657(JSON.object().add("sourcePath", C3935.m7775("string", "Non-empty absolute or Home-relative source path.")).add("destinationPath", C3935.m7775("string", "Non-empty absolute or Home-relative destination path.")), ClassTransform.BOOLEAN, "For a regular file, allow direct replacement of an existing regular file; must be false for a directory.", "overwrite", "Arguments for mt_file_move.");
        }
        return this.f30416;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f30418 == null) {
            this.f30418 = C3935.m7765("Result for mt_file_move.", C3935.m7762(JSON.object().add("sourcePath", C3935.m7775("string", "Normalized absolute source identity that no longer exists.")).add("destinationPath", C3935.m7775("string", "Normalized absolute destination identity of the moved node.")).add("type", C3935.m7775("string", "Moved node type: file or directory.")).add("warnings", C9417.m21913("type", "array", "description", "Non-fatal notification or backend metadata degradation.").add("items", C3935.m7775("string", "One warning message."))), "Successful direct local file move."), C5595.m12396("mt_file_move"), C3935.m7768("Success returns one mt_file_stat verification action.", C3935.m7763(C20175.m45657(JSON.object(), "string", "Normalized absolute moved destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect")));
        }
        return this.f30418;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_move", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C11653(), "Invalid mt_file_move argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m25334(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m25334(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m25334(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C5342 c5342M33671 = this.f30417.m33671(strAsString, strAsString2, jSONValue3.asBoolean());
        String str = c5342M33671.f12592;
        return new C14663(C21370.m48410(JSON.object().add("sourcePath", c5342M33671.f12593).add("destinationPath", str).add("type", c5342M33671.f12594).add("warnings", c5342M33671.f12595), JSON.array().add(C11982.m27418(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "mt_file_stat", "inspect", "Inspect the moved node at its normalized destination path."))));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m25334(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), C9417.m21913("sourcePath", "old/name.bin", "destinationPath", "new/name.bin").add("overwrite", false));
    }
}
