package p067l;

import android.os.Bundle;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAEE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13590 {
    /* JADX INFO: renamed from: ֫ */
    public static byte m30907(byte b) {
        return (byte) ((b & 255) >>> 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30917(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        if (bundle2 == null) {
            return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m30912(C14000 c14000) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObjectObject = JSON.object();
        String str = c14000.f39504;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str);
        String str2 = c14000.f39503;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("locator", C14884.m34021("zip_entry", c14000.f39505, (String) null, (String) null, (String) null, (String) null));
        long j = c14000.f39507;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("entrySize", j).add("bytesPatched", c14000.f39502);
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c14000.f39506;
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C14670 c14670 = (C14670) it.next();
            jSONArrayArray.add(JSON.object().add("byteOffset", c14670.f41877).add("bytesPatched", c14670.f41878).add("beforeHex", m30915(c14670.f41876)).add("afterHex", m30915(c14670.f41875)));
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patches", jSONArrayArray);
        JSONArray jSONArrayArray2 = JSON.array();
        if (arrayList.isEmpty()) {
            jSONObject = jSONObjectAdd4;
            jSONArray = jSONArrayArray2;
        } else {
            C14670 c14671 = (C14670) arrayList.get(0);
            long j2 = c14671.f41877;
            long j3 = c14671.f41878;
            Iterator it2 = arrayList.iterator();
            long jMax = j2 + j3;
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C14670 c14672 = (C14670) it2.next();
                long jMin = Math.min(j2, c14672.f41877);
                jMax = Math.max(jMax, ((long) c14672.f41877) + ((long) c14672.f41878));
                jSONObjectAdd4 = jSONObjectAdd4;
                it2 = it3;
                j2 = jMin;
            }
            JSONObject jSONObject2 = jSONObjectAdd4;
            long jMin2 = jMax - j2;
            long jMax2 = Math.max(0L, j - j2);
            if (jMin2 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                jMin2 = Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, jMax2);
            }
            long jMin3 = Math.min(Math.max(jMin2, j3), jMax2);
            if (jMin3 <= 0 || jMin3 > 2147483647L) {
                jSONArray = jSONArrayArray2;
            } else {
                jSONArray = jSONArrayArray2;
                jSONArray.add(C11982.m27418(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", C14884.m34021("zip_entry", c14000.f39505, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", (int) j2).add("maxBytes", (int) jMin3), "mt_apk_read_bytes", "inspect", "Read back the window starting at the first patched offset. For sparse patches outside this window, call mt_apk_read_bytes again using data.patches[].byteOffset."));
            }
            jSONObject = jSONObject2;
        }
        return C21370.m48410(jSONObject, jSONArray);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC3531 m30916(C9566 c9566) {
        switch (c9566.mo7484()) {
            case 1:
                return C19625.f59676;
            case 2:
                return C18954.f56499;
            case 3:
                return C8896.f24110;
            case 4:
                return C22308.f70453;
            case 5:
                return C17612.f52625;
            case 6:
                return C4873.f11117;
            case 7:
                return C10237.f28361;
            case 8:
                return C5543.f13368;
            case 9:
                return C20967.f65872;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c9566.mo4819());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m30909(C19203 c19203, int i, int i2) {
        c19203.m43730(i);
        if (c19203.m43703() < 5) {
            return -9223372036854775807L;
        }
        int iM43739 = c19203.m43739();
        if ((8388608 & iM43739) != 0 || ((2096896 & iM43739) >> 8) != i2 || (iM43739 & 32) == 0 || c19203.m43702() < 7 || c19203.m43703() < 7 || (c19203.m43702() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c19203.m43707(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX INFO: renamed from: ۧ */
    public static short m30919(int i, byte[] bArr) {
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m30911(C5276 c5276) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c5276.f12412;
        JSONObject jSONObjectAdd = C18426.m41996(jSONObject, "actualHex", C18426.m41996(jSONObject, "expectedHex", C18426.m41996(jSONObject, "reason", C18426.m41996(jSONObject, "entryName", jSONObjectObject, "entryName"), "reason").add("byteOffset", m30914(jSONObject.get("byteOffset"))).add("endByteOffset", m30914(jSONObject.get("endByteOffset"))).add("entrySize", m30914(jSONObject.get("entrySize"))), "expectedHex"), "actualHex").add("firstRange", m30913(jSONObject.getJSONObject("firstRange"))).add("secondRange", m30913(jSONObject.getJSONObject("secondRange")));
        JSONArray jSONArray = c5276.f12407;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_read_bytes".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C21370.m48412(c5276, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m30914(JSONValue jSONValue) {
        return (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m30920(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m30913(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("byteOffset", m30914(jSONObject.get("byteOffset"))).add("endByteOffset", m30914(jSONObject.get("endByteOffset")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30915(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m30918() {
        return C3935.m7765("Result for mt_apk_patch_bytes. data describes the patched byte ranges in one ZIP entry and nextActions contains a mt_apk_read_bytes read-back action for the window starting at the first patched offset. A corrupt workspace whose source APK remains accessible may return an mt_apk_workspace_open retry action.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this patch.")).add("editSessionId", C3935.m7772("string", "Edit session id that was modified.")).add("locator", C3935.m7772("string", "Patched zip_entry locator.")).add("entrySize", C3935.m7775("integer", "Entry size after patch; equal-length replacement keeps it unchanged.")).add("bytesPatched", C3935.m7775("integer", "Total requested byte count covered by all patch ranges, including no-op replacements.")).add("patches", C9417.m21913("type", "array", "description", "Applied patch ranges sorted by byteOffset. Hex strings are uppercase without spaces and can be reused as expectedHex.").add("items", C20175.m45657(JSON.object().add("byteOffset", C3935.m7775("integer", "0-based patched byte offset.")).add("bytesPatched", C3935.m7775("integer", "Patched byte count for this range.")).add("beforeHex", C3935.m7775("string", "Original bytes before patch, uppercase hex without spaces.")), "string", "Replacement bytes after patch, uppercase hex without spaces.", "afterHex", "One applied patch range."))), "Successful patch_bytes data."), C3935.m7770(C3935.m7762(JSON.object().add("entryName", C3935.m7772("string", "Rejected ZIP entry name, or null.")).add("reason", C3935.m7772("string", "Unsupported-entry reason token such as resources_arsc, dex_entry, axml_entry, directory, or not_raw_zip_entry, or null for non-unsupported errors. not_raw_zip_entry means the current entry view is not raw ZIP bytes.")).add("byteOffset", C3935.m7772("integer", "Rejected byte offset, or null.")).add("endByteOffset", C3935.m7772("integer", "Exclusive rejected end offset, or null.")).add("entrySize", C3935.m7772("integer", "Entry size for range errors, or null.")).add("expectedHex", C3935.m7772("string", "Expected uppercase hex for a mismatch, or null.")).add("actualHex", C3935.m7772("string", "Actual uppercase hex read at byteOffset for a mismatch, or null.")).add("firstRange", C3935.m7774(m30910())).add("secondRange", C3935.m7774(m30910())), "patch_bytes diagnostics.")), C3935.m7768("Successful patch_bytes returns a read_bytes verification action starting at the first patched offset; mismatch errors may also return read_bytes for the actual window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "inspect"), C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "retry"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m30908(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m30910() {
        return C3935.m7762(JSON.object().add("byteOffset", C3935.m7772("integer", "Range start byte offset.")).add("endByteOffset", C3935.m7772("integer", "Exclusive range end byte offset.")), "A rejected half-open byte range.");
    }
}
