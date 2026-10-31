package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14168 extends AbstractC16991 {
    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Check the structure of a ZIP archive and fully read every non-directory entry to verify length and checksum or encryption authentication. Files in all directories are checked; any data attached to directory entries is skipped. Stops at the first error and reports the affected entry when available and how many entries passed. This can read the whole archive and exceed client timeouts. Success means all checks completed without a detected error.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Test ZIP Integrity";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_zip_test";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C1648.m5532(AbstractC16991.m39826(true).put("password", C1648.m5545("string", "One password used for all encrypted file entries; pass an empty string if none are encrypted. Archives whose entries require different passwords cannot be fully tested with this tool.")), "Arguments for mt_zip_test.");
    }

    @Override // l.AbstractC16991
    /* JADX INFO: renamed from: ᩻ */
    public final JSONObject mo26702() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute archive path.")), "integer", "Non-directory entries fully read and validated.", "checkedEntries", "A completed ZIP integrity test.");
    }

    @Override // l.AbstractC16991
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String[] mo33818() {
        return new String[]{"checkedEntries"};
    }

    @Override // l.AbstractC16991
    /* JADX INFO: renamed from: ۧ */
    public final JSONObject mo26701(JSONObject jSONObject) {
        return this.f52123.m2549(jSONObject);
    }
}
