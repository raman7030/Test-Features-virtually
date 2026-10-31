package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6M0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1469 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9790 f5224;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Extract files or directory contents from a ZIP to explicit local destinations. Unsafe extraction paths, destination conflicts, or symbolic links in the selected entries reject the entire request before output is created. Required directories are created. Extraction cannot overwrite its source ZIP. Failure or cancellation can leave completed files and directories; check the reported progress before retrying.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Extract ZIP";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_zip_extract";
    }

    public C1469(C9790 c9790) {
        this.f5224 = c9790;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute or Home-relative source ZIP file; split archives are not supported.")).add("entries", JSON.object().add("type", "array").add("items", C18736.m43390(JSON.object().add("entryPath", C1648.m5545("string", "Exact full ZIP file path or directory path ending in /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization. An empty string selects the ZIP root. Directory mappings remove the selected prefix: docs/ to out/ maps docs/a.txt to out/a.txt; / to out/ maps /a.txt to out/a.txt.")), "string", "Absolute or Home-relative destination. For a file, specify the complete target filename; the ZIP source name does not affect it. For a directory, end in /. The remaining ZIP suffix must not start with / or contain a .. segment; . segments are removed, characters such as ? and * become _, and whitespace becomes spaces. Use individual file mappings to choose exact filenames.", "destinationPath", "One extraction mapping.")).add("description", "Non-empty extraction mappings. Expanded entries must not collide at the same local destination or require a file as a parent directory.")).add("password", C1648.m5545("string", "One password used for all selected encrypted files; pass an empty string if none are encrypted. Extract files requiring different passwords in separate calls.")), ClassTransform.BOOLEAN, "Allow replacing existing regular destination files; recommended false.", "overwrite", "Arguments for mt_zip_extract.");
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return C20520.m47006("mt_zip_extract", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C20520.m47007(c3059, true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        return new C12936(C19993.m46095(this.f5224.m24824(jSONObject), JSON.array()));
    }
}
