package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15833 extends AbstractC18516 {
    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Check the structure of a ZIP archive and fully read every non-directory entry to verify length and checksum or encryption authentication. Files in all directories are checked; any data attached to directory entries is skipped. Stops at the first error and reports the affected entry when available and how many entries passed. This can read the whole archive and exceed client timeouts. Success means all checks completed without a detected error.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Test ZIP Integrity";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_zip_test";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C3935.m7762(AbstractC18516.m42069(true).put("password", C3935.m7775("string", "One password used for all encrypted file entries; pass an empty string if none are encrypted. Archives whose entries require different passwords cannot be fully tested with this tool.")), "Arguments for mt_zip_test.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ᩻ */
    public final JSONObject mo28741() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute archive path.")), "integer", "Non-directory entries fully read and validated.", "checkedEntries", "A completed ZIP integrity test.");
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo35950() {
        return new String[]{"checkedEntries"};
    }

    @Override // p067l.AbstractC18516
    /* JADX INFO: renamed from: ۧ */
    public final JSONObject mo28740(JSONObject jSONObject) {
        return this.f55303.m4905(jSONObject);
    }
}
