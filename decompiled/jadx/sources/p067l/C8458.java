package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۜ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8458 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C15694 f22688;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Add, delete, or rename entries in an existing ZIP archive. Operations are unordered and refer to the original ZIP; chains, swaps, repeated changes, competing targets, and overlapping rename/delete directory ranges are rejected before writing. ZIP names are case-sensitive; abc and abc/ are distinct, and leading /, . and .. are preserved literally. New files use deflate; replacements preserve the original compression method. Unchanged and renamed entries retain their original encryption and passwords. Updating a damaged archive may discard unreadable entries, even outside the requested changes; use mt_zip_test first if integrity needs checking. No APK signing is performed. If saving fails, check the reported destination state before retrying.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Update ZIP";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_zip_update";
    }

    public C8458(C15694 c15694) {
        this.f22688 = c15694;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute or Home-relative existing ZIP file; split archives are not supported.")).add("operations", C9417.m21913("type", "array", "description", "Non-empty unordered modifications. File operations must omit directory-only fields.").add("items", JSON.object().add("anyOf", JSON.array().add(C3935.m7762(m19679("add", "Add a local file or directory.").add("sourcePath", C3935.m7775("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")).add("entryPath", C3935.m7775("string", "Complete destination ZIP entry path, not a basename. Files have no trailing /; directory sources require / or an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.")).add("overwrite", C3935.m7775(ClassTransform.BOOLEAN, "True permits replacing original files at mapped names; recommended false. Never resolves conflicts between operations.")), "Add.")).add(C3935.m7762(m19679("delete", "Delete one original file.").add("entryPath", C3935.m7775("string", "Non-empty exact ZIP file path without a trailing /.")), "Delete file.")).add(C3935.m7762(m19679("delete", "Delete an original directory.").add("entryPath", C3935.m7775("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("recursive", C3935.m7775(ClassTransform.BOOLEAN, "True is required when the directory contains entries.")), "Delete directory.")).add(C3935.m7762(m19679("rename", "Rename one original file.").add("entryPath", C3935.m7775("string", "Non-empty exact ZIP file path without a trailing /.")).add("newEntryPath", C3935.m7775("string", "Complete destination ZIP file path, not a basename, without a trailing /. To rename in place, retain the parent: docs/a.txt to docs/b.txt. A different target file must not already exist.")), "Rename file.")).add(C3935.m7762(m19679("rename", "Rename an original directory, including its descendants.").add("entryPath", C3935.m7775("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("newEntryPath", C3935.m7775("string", "Complete destination ZIP directory path, not a basename, ending in /. Retain the parent to rename in place: docs/old/ to docs/new/. Cannot be empty or a descendant of the source directory; / is a literal directory name.")).add("mergeDirectories", C3935.m7775(ClassTransform.BOOLEAN, "True permits recursively merging an existing destination directory; recommended false. Same-name files still reject the whole request.")), "Rename directory."))))), "string", "Output password for all files added or replaced in this call: empty string writes them unencrypted; otherwise encrypts them with AES-256. The old password is not required or verified. Pass an empty string for delete/rename-only requests.", "password", "Arguments for mt_zip_update.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19679(String str, String str2) {
        return JSON.object().add("type", C3935.m7766(str, str2));
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return C21870.m49329("mt_zip_update", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21870.m49330(c5276, false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        return new C14663(C21370.m48410(this.f22688.m35755(jSONObject), JSON.array()));
    }
}
