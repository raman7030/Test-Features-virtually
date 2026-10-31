package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6XD */
/* JADX INFO: loaded from: classes.dex */
public final class C22740 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f73448;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f73449;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12821 f73450;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Copy one regular local file as raw bytes. Paths may be absolute or relative to Home and must differ. The destination parent must exist; links, directories, and special nodes are rejected. overwrite=false rejects an existing destination. Large files are supported. A new destination inherits source mode, owner, group, and MT modified-time settings; overwrite preserves destination mode, owner, and group. Unsupported metadata is reported in warnings. If a call fails, inspect whether the destination changed before retrying.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Copy Local File";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_copy";
    }

    public C22740(C12821 c12821) {
        this.f73450 = c12821;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f73448 == null) {
            this.f73448 = C18736.m43390(JSON.object().add("sourcePath", C1648.m5545("string", "Non-empty absolute or Home-relative regular-file source path.")).add("destinationPath", C1648.m5545("string", "Non-empty absolute or Home-relative file destination path.")), ClassTransform.BOOLEAN, "True permits replacing an existing regular file; false requires a missing destination.", "overwrite", "Arguments for mt_file_copy.");
        }
        return this.f73448;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f73449 == null) {
            this.f73449 = C1648.m5535("Result for mt_file_copy.", C18736.m43390(JSON.object().add("sourcePath", C1648.m5545("string", "Normalized absolute source path fixed for this call.")).add("destinationPath", C1648.m5545("string", "Normalized absolute destination path fixed for this call.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C1648.m5545("string", "One warning message."))), "integer", "Number of source bytes copied.", "size", "Final state after a successful local file copy."), C3395.m10357("mt_file_copy"), C1648.m5534("mt_file_copy has no automatic follow-up action."));
        }
        return this.f73449;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_copy", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C11452(), "Invalid file copy argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m50819(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m50819(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m50819(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C15642 c15642M31191 = this.f73450.m31191(strAsString, strAsString2, jSONValue3.asBoolean());
        return new C12936(C19993.m46095(JSON.object().add("sourcePath", c15642M31191.f48141).add("destinationPath", c15642M31191.f48139).add("warnings", c15642M31191.f48142).add("size", c15642M31191.f48140), JSON.array()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m50819(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), C7416.m19939("sourcePath", "source.bin", "destinationPath", "copy.bin").add("overwrite", false));
    }
}
