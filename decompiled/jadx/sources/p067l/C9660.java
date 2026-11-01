package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9660 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C15694 f26609;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Create a ZIP archive from local files or directory contents using explicit sourcePath to entryPath mappings. Sources remain unchanged. ZIP names are case-sensitive; trailing / distinguishes directories, and leading /, . and .. are preserved literally. Conflicting mapped files are rejected. The output cannot be included in its own sources. A non-empty password encrypts file entries with AES-256. If saving fails, check the reported destination state before retrying.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Create ZIP";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_zip_create";
    }

    public C9660(C15694 c15694) {
        this.f26609 = c15694;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(JSON.object().add("outputPath", C3935.m7775("string", "Absolute or Home-relative destination ZIP file; its parent must exist. Split archives are not supported.")).add("sources", JSON.object().add("type", "array").add("items", C20175.m45657(JSON.object().add("sourcePath", C3935.m7775("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")), "string", "Complete destination ZIP entry path, not a basename. For a directory source, end in / or use an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.", "entryPath", "One source mapping.")).add("description", "Non-empty source mappings; expanded targets must not conflict.")).add("overwrite", C3935.m7775(ClassTransform.BOOLEAN, "True permits replacing an existing regular output file; recommended false.")).add("level", C3935.m7775("integer", "Compression level 0 through 9: 0 stores files without compression; 1 through 9 use Deflate, from fastest to strongest compression. Recommended 6.")), "string", "Empty string for no encryption; otherwise the password for new file entries.", "password", "Arguments for mt_zip_create.");
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return C21870.m49329("mt_zip_create", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21870.m49330(c5276, false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        return new C14663(C21370.m48410(this.f26609.m35754(jSONObject), JSON.array()));
    }
}
