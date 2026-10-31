package l;

import android.os.Bundle;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAEE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11807 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m28858(byte b) {
        return (byte) ((b & 255) >>> 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28868(Bundle bundle, Bundle bundle2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m28863(C12239 c12239) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObjectObject = JSON.object();
        String str = c12239.f36487;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str);
        String str2 = c12239.f36486;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("locator", C13169.m31925("zip_entry", c12239.f36488, (String) null, (String) null, (String) null, (String) null));
        long j = c12239.f36490;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("entrySize", j).add("bytesPatched", c12239.f36485);
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c12239.f36489;
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C12944 c12944 = (C12944) it.next();
            jSONArrayArray.add(JSON.object().add("byteOffset", c12944.f38833).add("bytesPatched", c12944.f38834).add("beforeHex", m28866(c12944.f38832)).add("afterHex", m28866(c12944.f38831)));
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patches", jSONArrayArray);
        JSONArray jSONArrayArray2 = JSON.array();
        if (arrayList.isEmpty()) {
            jSONObject = jSONObjectAdd4;
            jSONArray = jSONArrayArray2;
        } else {
            C12944 c12945 = (C12944) arrayList.get(0);
            long j2 = c12945.f38833;
            long j3 = c12945.f38834;
            Iterator it2 = arrayList.iterator();
            long jMax = j2 + j3;
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C12944 c12946 = (C12944) it2.next();
                long jMin = Math.min(j2, c12946.f38833);
                jMax = Math.max(jMax, ((long) c12946.f38833) + ((long) c12946.f38834));
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
                jSONArray.add(C10115.m25398(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", C13169.m31925("zip_entry", c12239.f36488, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", (int) j2).add("maxBytes", (int) jMin3), "mt_apk_read_bytes", "inspect", "Read back the window starting at the first patched offset. For sparse patches outside this window, call mt_apk_read_bytes again using data.patches[].byteOffset."));
            }
            jSONObject = jSONObject2;
        }
        return C19993.m46095(jSONObject, jSONArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC1223 m28867(C7573 c7573) {
        switch (c7573.mo5255()) {
            case 1:
                return C18157.f56462;
            case 2:
                return C17451.f53311;
            case 3:
                return C6868.f21232;
            case 4:
                return C20980.f67768;
            case 5:
                return C16039.f49461;
            case 6:
                return C2635.f8323;
            case 7:
                return C8279.f25451;
            case 8:
                return C3340.f10558;
            case 9:
                return C19569.f63254;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c7573.mo2463());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m28860(C17714 c17714, int i, int i2) {
        c17714.m41484(i);
        if (c17714.m41457() < 5) {
            return -9223372036854775807L;
        }
        int iM41493 = c17714.m41493();
        if ((8388608 & iM41493) != 0 || ((2096896 & iM41493) >> 8) != i2 || (iM41493 & 32) == 0 || c17714.m41456() < 7 || c17714.m41457() < 7 || (c17714.m41456() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c17714.m41461(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static short m28870(int i, byte[] bArr) {
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m28862(C3059 c3059) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c3059.f9609;
        JSONObject jSONObjectAdd = C16895.m39755(jSONObject, "actualHex", C16895.m39755(jSONObject, "expectedHex", C16895.m39755(jSONObject, "reason", C16895.m39755(jSONObject, "entryName", jSONObjectObject, "entryName"), "reason").add("byteOffset", m28865(jSONObject.get("byteOffset"))).add("endByteOffset", m28865(jSONObject.get("endByteOffset"))).add("entrySize", m28865(jSONObject.get("entrySize"))), "expectedHex"), "actualHex").add("firstRange", m28864(jSONObject.getJSONObject("firstRange"))).add("secondRange", m28864(jSONObject.getJSONObject("secondRange")));
        JSONArray jSONArray = c3059.f9604;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_read_bytes".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C19993.m46097(c3059, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m28865(JSONValue jSONValue) {
        return (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m28871(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m28864(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("byteOffset", m28865(jSONObject.get("byteOffset"))).add("endByteOffset", m28865(jSONObject.get("endByteOffset")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28866(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28869() {
        return C1648.m5535("Result for mt_apk_patch_bytes. data describes the patched byte ranges in one ZIP entry and nextActions contains a mt_apk_read_bytes read-back action for the window starting at the first patched offset. A corrupt workspace whose source APK remains accessible may return an mt_apk_workspace_open retry action.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this patch.")).add("editSessionId", C1648.m5542("string", "Edit session id that was modified.")).add("locator", C1648.m5542("string", "Patched zip_entry locator.")).add("entrySize", C1648.m5545("integer", "Entry size after patch; equal-length replacement keeps it unchanged.")).add("bytesPatched", C1648.m5545("integer", "Total requested byte count covered by all patch ranges, including no-op replacements.")).add("patches", C7416.m19939("type", "array", "description", "Applied patch ranges sorted by byteOffset. Hex strings are uppercase without spaces and can be reused as expectedHex.").add("items", C18736.m43390(JSON.object().add("byteOffset", C1648.m5545("integer", "0-based patched byte offset.")).add("bytesPatched", C1648.m5545("integer", "Patched byte count for this range.")).add("beforeHex", C1648.m5545("string", "Original bytes before patch, uppercase hex without spaces.")), "string", "Replacement bytes after patch, uppercase hex without spaces.", "afterHex", "One applied patch range."))), "Successful patch_bytes data."), C1648.m5540(C1648.m5532(JSON.object().add("entryName", C1648.m5542("string", "Rejected ZIP entry name, or null.")).add("reason", C1648.m5542("string", "Unsupported-entry reason token such as resources_arsc, dex_entry, axml_entry, directory, or not_raw_zip_entry, or null for non-unsupported errors. not_raw_zip_entry means the current entry view is not raw ZIP bytes.")).add("byteOffset", C1648.m5542("integer", "Rejected byte offset, or null.")).add("endByteOffset", C1648.m5542("integer", "Exclusive rejected end offset, or null.")).add("entrySize", C1648.m5542("integer", "Entry size for range errors, or null.")).add("expectedHex", C1648.m5542("string", "Expected uppercase hex for a mismatch, or null.")).add("actualHex", C1648.m5542("string", "Actual uppercase hex read at byteOffset for a mismatch, or null.")).add("firstRange", C1648.m5544(m28861())).add("secondRange", C1648.m5544(m28861())), "patch_bytes diagnostics.")), C1648.m5538("Successful patch_bytes returns a read_bytes verification action starting at the first patched offset; mismatch errors may also return read_bytes for the actual window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "inspect"), C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "retry"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28859(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m28861() {
        return C1648.m5532(JSON.object().add("byteOffset", C1648.m5542("integer", "Range start byte offset.")).add("endByteOffset", C1648.m5542("integer", "Exclusive range end byte offset.")), "A rejected half-open byte range.");
    }
}
