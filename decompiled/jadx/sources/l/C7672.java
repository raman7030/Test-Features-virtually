package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7672 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14021 f23695;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Create a ZIP archive from local files or directory contents using explicit sourcePath to entryPath mappings. Sources remain unchanged. ZIP names are case-sensitive; trailing / distinguishes directories, and leading /, . and .. are preserved literally. Conflicting mapped files are rejected. The output cannot be included in its own sources. A non-empty password encrypts file entries with AES-256. If saving fails, check the reported destination state before retrying.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Create ZIP";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_zip_create";
    }

    public C7672(C14021 c14021) {
        this.f23695 = c14021;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C18736.m43390(JSON.object().add("outputPath", C1648.m5545("string", "Absolute or Home-relative destination ZIP file; its parent must exist. Split archives are not supported.")).add("sources", JSON.object().add("type", "array").add("items", C18736.m43390(JSON.object().add("sourcePath", C1648.m5545("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")), "string", "Complete destination ZIP entry path, not a basename. For a directory source, end in / or use an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.", "entryPath", "One source mapping.")).add("description", "Non-empty source mappings; expanded targets must not conflict.")).add("overwrite", C1648.m5545(ClassTransform.BOOLEAN, "True permits replacing an existing regular output file; recommended false.")).add("level", C1648.m5545("integer", "Compression level 0 through 9: 0 stores files without compression; 1 through 9 use Deflate, from fastest to strongest compression. Recommended 6.")), "string", "Empty string for no encryption; otherwise the password for new file entries.", "password", "Arguments for mt_zip_create.");
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return C20520.m47006("mt_zip_create", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C20520.m47007(c3059, false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        return new C12936(C19993.m46095(this.f23695.m33634(jSONObject), JSON.array()));
    }
}
