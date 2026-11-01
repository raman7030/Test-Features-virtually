package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p052u0.C0226b;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.᩸ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6Y4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22777 {
    /* JADX INFO: renamed from: ֫ */
    public static long m50963(JSONObject jSONObject, String str, long j, long j2) throws C5276 {
        if (j < 0 || j2 > 9007199254740991L || j > j2) {
            throw new IllegalArgumentException("Invalid safe integer range");
        }
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw m50965(str, jSONValue, j, j2);
        }
        try {
            long jLongValueExact = new BigDecimal(jSONValue.toString()).longValueExact();
            if (jLongValueExact < j || jLongValueExact > j2) {
                throw m50965(str, jSONValue, j, j2);
            }
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m50965(str, jSONValue, j, j2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m50964(String str, long j, long j2) throws C5276 {
        if (j < 0 || j2 < 0 || j > 9007199254740991L - j2) {
            throw C5276.m11407("FILE_OFFSET_OUT_OF_RANGE", "Byte offset exceeds the supported JSON integer range.", "warning", (JSONArray) null, JSON.object().add("argument", str).add(C0226b.f1011d, j).add("increment", j2).add("maximum", 9007199254740991L));
        }
        return j + j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m50965(String str, JSONValue jSONValue, long j, long j2) {
        return C5276.m11406("Invalid integer argument", str, jSONValue, JSON.array().add(j + ".." + j2), JSON.object().add(str, j));
    }
}
