package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۜ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6408 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14021 f19816;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Add, delete, or rename entries in an existing ZIP archive. Operations are unordered and refer to the original ZIP; chains, swaps, repeated changes, competing targets, and overlapping rename/delete directory ranges are rejected before writing. ZIP names are case-sensitive; abc and abc/ are distinct, and leading /, . and .. are preserved literally. New files use deflate; replacements preserve the original compression method. Unchanged and renamed entries retain their original encryption and passwords. Updating a damaged archive may discard unreadable entries, even outside the requested changes; use mt_zip_test first if integrity needs checking. No APK signing is performed. If saving fails, check the reported destination state before retrying.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Update ZIP";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_zip_update";
    }

    public C6408(C14021 c14021) {
        this.f19816 = c14021;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute or Home-relative existing ZIP file; split archives are not supported.")).add("operations", C7416.m19939("type", "array", "description", "Non-empty unordered modifications. File operations must omit directory-only fields.").add("items", JSON.object().add("anyOf", JSON.array().add(C1648.m5532(m17732("add", "Add a local file or directory.").add("sourcePath", C1648.m5545("string", "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories.")).add("entryPath", C1648.m5545("string", "Complete destination ZIP entry path, not a basename. Files have no trailing /; directory sources require / or an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png.")).add("overwrite", C1648.m5545(ClassTransform.BOOLEAN, "True permits replacing original files at mapped names; recommended false. Never resolves conflicts between operations.")), "Add.")).add(C1648.m5532(m17732("delete", "Delete one original file.").add("entryPath", C1648.m5545("string", "Non-empty exact ZIP file path without a trailing /.")), "Delete file.")).add(C1648.m5532(m17732("delete", "Delete an original directory.").add("entryPath", C1648.m5545("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("recursive", C1648.m5545(ClassTransform.BOOLEAN, "True is required when the directory contains entries.")), "Delete directory.")).add(C1648.m5532(m17732("rename", "Rename one original file.").add("entryPath", C1648.m5545("string", "Non-empty exact ZIP file path without a trailing /.")).add("newEntryPath", C1648.m5545("string", "Complete destination ZIP file path, not a basename, without a trailing /. To rename in place, retain the parent: docs/a.txt to docs/b.txt. A different target file must not already exist.")), "Rename file.")).add(C1648.m5532(m17732("rename", "Rename an original directory, including its descendants.").add("entryPath", C1648.m5545("string", "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root.")).add("newEntryPath", C1648.m5545("string", "Complete destination ZIP directory path, not a basename, ending in /. Retain the parent to rename in place: docs/old/ to docs/new/. Cannot be empty or a descendant of the source directory; / is a literal directory name.")).add("mergeDirectories", C1648.m5545(ClassTransform.BOOLEAN, "True permits recursively merging an existing destination directory; recommended false. Same-name files still reject the whole request.")), "Rename directory."))))), "string", "Output password for all files added or replaced in this call: empty string writes them unencrypted; otherwise encrypts them with AES-256. The old password is not required or verified. Pass an empty string for delete/rename-only requests.", "password", "Arguments for mt_zip_update.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17732(String str, String str2) {
        return JSON.object().add("type", C1648.m5536(str, str2));
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return C20520.m47006("mt_zip_update", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C20520.m47007(c3059, false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        return new C12936(C19993.m46095(this.f19816.m33635(jSONObject), JSON.array()));
    }
}
