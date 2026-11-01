package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.umeng.analytics.pro.C0708d;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6WD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3485 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m6218(C10271 c10271, boolean z) {
        JSONObject jSONObjectAdd;
        JSONArray jSONArrayArray = JSON.array();
        for (C3565 c3565 : c10271.f28428) {
            if (!z) {
                jSONObjectAdd = JSON.object().add("schemes", C3223.m5566(c3565.f7234)).add("sha256", c3565.f7230);
            } else {
                jSONObjectAdd = JSON.object().add("schemes", C3223.m5566(c3565.f7234)).add("sizeBytes", c3565.f7223).add("hashCode", c3565.f7233).add("md5", c3565.f7229).add("sha1", c3565.f7226).add("sha256", c3565.f7230).add("crc32", c3565.f7231).add("certificateSignatureAlgorithm", c3565.f7222).add("certificateSignatureAlgorithmOid", c3565.f7228).add("subject", c3565.f7224).add("issuer", c3565.f7232).add("serialNumberHex", c3565.f7227).add("notBeforeEpochMillis", c3565.f7225).add("notAfterEpochMillis", c3565.f7235);
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return JSON.object().add("available", c10271.f28427).add("signaturePresent", c10271.f28429).add("schemes", C3223.m5566(c10271.f28431)).add("hasDifferentCertificates", c10271.f28432).add("certificates", jSONArrayArray).add(C0708d.f2599O, c10271.f28430);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m6219(boolean z) {
        return C3935.m7762(JSON.object().add("available", C3935.m7775(ClassTransform.BOOLEAN, "Whether signing certificate metadata is available.")).add("signaturePresent", C3935.m7775(ClassTransform.BOOLEAN, "When available=true, whether any APK signature scheme certificate was found.")).add("schemes", C3935.m7771("When available=true, APK signature schemes found in fixed order: V1, V2, V3, V3.1.")).add("hasDifferentCertificates", C3935.m7775(ClassTransform.BOOLEAN, "When available=true, whether multiple schemes use different certificate DER bytes.")).add("certificates", !z ? C9417.m21913("type", "array", "description", "When available=true, unique certificate summaries; no DER or Base64 data is returned.").add("items", C20175.m45657(JSON.object().add("schemes", C3935.m7771("Schemes using this certificate.")), "string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix; not an APK file digest.", "sha256", "One signing certificate summary.")) : C9417.m21913("type", "array", "description", "When available=true, unique X.509 certificate summaries grouped by identical DER bytes; no DER or Base64 data is returned.").add("items", C20175.m45657(JSON.object().add("schemes", C3935.m7771("Schemes that use this certificate, in fixed order: V1, V2, V3, V3.1.")).add("sizeBytes", C3935.m7775("integer", "Certificate DER size in bytes.")).add("hashCode", C3935.m7775("integer", "Java Arrays.hashCode value over certificate DER bytes.")).add("md5", C3935.m7775("string", "Lowercase certificate DER MD5 hex without colons or 0x prefix.")).add("sha1", C3935.m7775("string", "Lowercase certificate DER SHA-1 hex without colons or 0x prefix.")).add("sha256", C3935.m7775("string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix.")).add("crc32", C3935.m7775("string", "Lowercase certificate DER CRC32 hex without colons or 0x prefix.")).add("certificateSignatureAlgorithm", C3935.m7775("string", "X.509 certificate signature algorithm name; not the APK v2/v3 signer algorithm.")).add("certificateSignatureAlgorithmOid", C3935.m7775("string", "X.509 certificate signature algorithm OID; not the APK v2/v3 signer algorithm.")).add("subject", C3935.m7775("string", "Certificate subject formatted with X500Principal RFC2253.")).add("issuer", C3935.m7775("string", "Certificate issuer formatted with X500Principal RFC2253.")).add("serialNumberHex", C3935.m7775("string", "Lowercase certificate serial number hex without 0x prefix.")).add("notBeforeEpochMillis", C3935.m7775("integer", "Certificate notBefore time in epoch milliseconds.")), "integer", "Certificate notAfter time in epoch milliseconds.", "notAfterEpochMillis", "One unique signing certificate summary."))).add(C0708d.f2599O, C3935.m7772("string", "Why signing certificate metadata is unavailable when available=false, or null.")), "APK signing certificate summary. This is certificate metadata only and does not verify installability or signature validity.".concat(z ? "" : " Use mt_apk_read_signature for full certificate attributes."));
    }
}
