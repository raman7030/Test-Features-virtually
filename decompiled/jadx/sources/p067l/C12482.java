package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12482 extends AbstractC18516 {
    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "List entries in a ZIP archive, including directories implied by file paths. Names are case-sensitive; directories end with /, and leading /, . and .. are preserved literally. Recursive results use depth-first name order. Keep the ZIP unchanged while paging and use the returned continuation; if the cursor expires, use the returned restart action. Listing does not verify integrity; use mt_zip_test for that.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "List ZIP Entries";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_zip_list";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(AbstractC18516.m42069(false).add("entryPath", C3935.m7775("string", "Exact ZIP directory path ending with /. Pass an empty string for the ZIP root; / selects the directory literally named /, not the root.")).add("recursive", C3935.m7775(ClassTransform.BOOLEAN, "Whether to include all descendants; pass false initially.")).add("simple", C3935.m7775(ClassTransform.BOOLEAN, "True returns only relative entry names; recommended for browsing. False includes sizes and encryption status.")).add("cursor", C3935.m7775("string", "Pass an empty string initially; for later pages use the returned continuation. Only limit and simple may change between pages.")), "integer", "Maximum entries per page, 1..1000; suggested 200.", "limit", "Arguments for mt_zip_list.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ᩻ */
    public final JSONObject mo28741() {
        return C3935.m7762(AbstractC18516.m42070().put("entryPath", C3935.m7775("string", "Exact ZIP directory prefix shared by all listed relative paths; empty for the root.")).add("listing", C3935.m7771("One entry per element. With simple=true, each string is the raw relative path. Otherwise: size compressedSize encryption relativePath; split only at the first three ASCII spaces. size is uncompressed bytes; compressedSize is compressed bytes. Directories sum descendants; - means unavailable. Encryption is e for encrypted files, otherwise -; directories do not summarize descendant encryption. Paths ending in / are directories. Preserve the path verbatim, including spaces and newlines. Concatenate data.entryPath and the relative path directly for other ZIP tools; never normalize leading slashes or dot segments. Empty array for no entries.")).add("pagination", C20175.m45657(JSON.object().add("hasMore", C3935.m7775(ClassTransform.BOOLEAN, "Whether another page remains.")), "string", "Opaque continuation token, or empty string at the end.", "nextCursor", "Listing continuation.")), "One ZIP directory page.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ۧ */
    public final JSONObject mo28740(JSONObject jSONObject) {
        return this.f55303.m4902(jSONObject);
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ֫ */
    public final JSONArray mo28739(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject2.getJSONObject("pagination");
        if (!jSONObject3.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C11982.m27418(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("cursor", jSONObject3.getString("nextCursor")), "mt_zip_list", "continue", "Read the next ZIP directory page."));
    }
}
