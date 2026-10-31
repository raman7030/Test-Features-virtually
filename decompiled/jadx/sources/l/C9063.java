package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9063 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f27478;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13006 f27479;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public JSONObject f27480;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Move or rename one regular local file or directory. Paths may be absolute or relative to Home and must differ; the destination parent must exist. For files, overwrite=true permits replacing an existing regular file. Directories require overwrite=false and a missing destination; they cannot be merged, replaced, or moved into themselves or descendants. Moves that require copying then deleting are unsupported. Some storage locations cannot change the parent and basename together: move with the same basename first, then rename. After a failure, inspect the reported state before retrying.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Move Local File";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_move";
    }

    public C9063(C13006 c13006) {
        this.f27479 = c13006;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f27478 == null) {
            this.f27478 = C18736.m43390(JSON.object().add("sourcePath", C1648.m5545("string", "Non-empty absolute or Home-relative source path.")).add("destinationPath", C1648.m5545("string", "Non-empty absolute or Home-relative destination path.")), ClassTransform.BOOLEAN, "For a regular file, allow direct replacement of an existing regular file; must be false for a directory.", "overwrite", "Arguments for mt_file_move.");
        }
        return this.f27478;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f27480 == null) {
            this.f27480 = C1648.m5535("Result for mt_file_move.", C1648.m5532(JSON.object().add("sourcePath", C1648.m5545("string", "Normalized absolute source identity that no longer exists.")).add("destinationPath", C1648.m5545("string", "Normalized absolute destination identity of the moved node.")).add("type", C1648.m5545("string", "Moved node type: file or directory.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal notification or backend metadata degradation.").add("items", C1648.m5545("string", "One warning message."))), "Successful direct local file move."), C3395.m10357("mt_file_move"), C1648.m5538("Success returns one mt_file_stat verification action.", C1648.m5533(C18736.m43390(JSON.object(), "string", "Normalized absolute moved destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect")));
        }
        return this.f27480;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_move", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C9769(), "Invalid mt_file_move argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m23389(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m23389(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m23389(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C3129 c3129M31586 = this.f27479.m31586(strAsString, strAsString2, jSONValue3.asBoolean());
        String str = c3129M31586.f9789;
        return new C12936(C19993.m46095(JSON.object().add("sourcePath", c3129M31586.f9790).add("destinationPath", str).add("type", c3129M31586.f9791).add("warnings", c3129M31586.f9792), JSON.array().add(C10115.m25398(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "mt_file_stat", "inspect", "Inspect the moved node at its normalized destination path."))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m23389(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), C7416.m19939("sourcePath", "old/name.bin", "destinationPath", "new/name.bin").add("overwrite", false));
    }
}
