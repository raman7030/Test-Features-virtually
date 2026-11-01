package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6XD */
/* JADX INFO: loaded from: classes.dex */
public final class C23980 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f76175;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f76176;

    /* JADX INFO: renamed from: ܽ */
    public final C14553 f76177;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Copy one regular local file as raw bytes. Paths may be absolute or relative to Home and must differ. The destination parent must exist; links, directories, and special nodes are rejected. overwrite=false rejects an existing destination. Large files are supported. A new destination inherits source mode, owner, group, and MT modified-time settings; overwrite preserves destination mode, owner, and group. Unsupported metadata is reported in warnings. If a call fails, inspect whether the destination changed before retrying.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Copy Local File";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_copy";
    }

    public C23980(C14553 c14553) {
        this.f76177 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f76175 == null) {
            this.f76175 = C20175.m45657(JSON.object().add("sourcePath", C3935.m7775("string", "Non-empty absolute or Home-relative regular-file source path.")).add("destinationPath", C3935.m7775("string", "Non-empty absolute or Home-relative file destination path.")), ClassTransform.BOOLEAN, "True permits replacing an existing regular file; false requires a missing destination.", "overwrite", "Arguments for mt_file_copy.");
        }
        return this.f76175;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f76176 == null) {
            this.f76176 = C3935.m7765("Result for mt_file_copy.", C20175.m45657(JSON.object().add("sourcePath", C3935.m7775("string", "Normalized absolute source path fixed for this call.")).add("destinationPath", C3935.m7775("string", "Normalized absolute destination path fixed for this call.")).add("warnings", C9417.m21913("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C3935.m7775("string", "One warning message."))), "integer", "Number of source bytes copied.", "size", "Final state after a successful local file copy."), C5595.m12396("mt_file_copy"), C3935.m7764("mt_file_copy has no automatic follow-up action."));
        }
        return this.f76176;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_copy", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C13252(), "Invalid file copy argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m53152(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m53152(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m53152(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C17234 c17234M33277 = this.f76177.m33277(strAsString, strAsString2, jSONValue3.asBoolean());
        return new C14663(C21370.m48410(JSON.object().add("sourcePath", c17234M33277.f51281).add("destinationPath", c17234M33277.f51279).add("warnings", c17234M33277.f51282).add("size", c17234M33277.f51280), JSON.array()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m53152(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), C9417.m21913("sourcePath", "source.bin", "destinationPath", "copy.bin").add("overwrite", false));
    }
}
