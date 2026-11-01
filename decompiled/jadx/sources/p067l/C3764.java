package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6M0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3764 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C11673 f7997;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Extract files or directory contents from a ZIP to explicit local destinations. Unsafe extraction paths, destination conflicts, or symbolic links in the selected entries reject the entire request before output is created. Required directories are created. Extraction cannot overwrite its source ZIP. Failure or cancellation can leave completed files and directories; check the reported progress before retrying.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Extract ZIP";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_zip_extract";
    }

    public C3764(C11673 c11673) {
        this.f7997 = c11673;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute or Home-relative source ZIP file; split archives are not supported.")).add("entries", JSON.object().add("type", "array").add("items", C20175.m45657(JSON.object().add("entryPath", C3935.m7775("string", "Exact full ZIP file path or directory path ending in /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization. An empty string selects the ZIP root. Directory mappings remove the selected prefix: docs/ to out/ maps docs/a.txt to out/a.txt; / to out/ maps /a.txt to out/a.txt.")), "string", "Absolute or Home-relative destination. For a file, specify the complete target filename; the ZIP source name does not affect it. For a directory, end in /. The remaining ZIP suffix must not start with / or contain a .. segment; . segments are removed, characters such as ? and * become _, and whitespace becomes spaces. Use individual file mappings to choose exact filenames.", "destinationPath", "One extraction mapping.")).add("description", "Non-empty extraction mappings. Expanded entries must not collide at the same local destination or require a file as a parent directory.")).add("password", C3935.m7775("string", "One password used for all selected encrypted files; pass an empty string if none are encrypted. Extract files requiring different passwords in separate calls.")), ClassTransform.BOOLEAN, "Allow replacing existing regular destination files; recommended false.", "overwrite", "Arguments for mt_zip_extract.");
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return C21870.m49329("mt_zip_extract", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21870.m49330(c5276, true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        return new C14663(C21370.m48410(this.f7997.m26839(jSONObject), JSON.array()));
    }
}
