package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.d;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6WD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1175 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m3976(C8315 c8315, boolean z) {
        JSONObject jSONObjectAdd;
        JSONArray jSONArrayArray = JSON.array();
        for (C1259 c1259 : c8315.f25517) {
            if (!z) {
                jSONObjectAdd = JSON.object().add("schemes", C0899.m3247(c1259.f4464)).add("sha256", c1259.f4460);
            } else {
                jSONObjectAdd = JSON.object().add("schemes", C0899.m3247(c1259.f4464)).add("sizeBytes", c1259.f4453).add("hashCode", c1259.f4463).add("md5", c1259.f4459).add("sha1", c1259.f4456).add("sha256", c1259.f4460).add("crc32", c1259.f4461).add("certificateSignatureAlgorithm", c1259.f4452).add("certificateSignatureAlgorithmOid", c1259.f4458).add("subject", c1259.f4454).add("issuer", c1259.f4462).add("serialNumberHex", c1259.f4457).add("notBeforeEpochMillis", c1259.f4455).add("notAfterEpochMillis", c1259.f4465);
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return JSON.object().add("available", c8315.f25516).add("signaturePresent", c8315.f25518).add("schemes", C0899.m3247(c8315.f25520)).add("hasDifferentCertificates", c8315.f25521).add("certificates", jSONArrayArray).add(d.O, c8315.f25519);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m3977(boolean z) {
        return C1648.m5532(JSON.object().add("available", C1648.m5545(ClassTransform.BOOLEAN, "Whether signing certificate metadata is available.")).add("signaturePresent", C1648.m5545(ClassTransform.BOOLEAN, "When available=true, whether any APK signature scheme certificate was found.")).add("schemes", C1648.m5541("When available=true, APK signature schemes found in fixed order: V1, V2, V3, V3.1.")).add("hasDifferentCertificates", C1648.m5545(ClassTransform.BOOLEAN, "When available=true, whether multiple schemes use different certificate DER bytes.")).add("certificates", !z ? C7416.m19939("type", "array", "description", "When available=true, unique certificate summaries; no DER or Base64 data is returned.").add("items", C18736.m43390(JSON.object().add("schemes", C1648.m5541("Schemes using this certificate.")), "string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix; not an APK file digest.", "sha256", "One signing certificate summary.")) : C7416.m19939("type", "array", "description", "When available=true, unique X.509 certificate summaries grouped by identical DER bytes; no DER or Base64 data is returned.").add("items", C18736.m43390(JSON.object().add("schemes", C1648.m5541("Schemes that use this certificate, in fixed order: V1, V2, V3, V3.1.")).add("sizeBytes", C1648.m5545("integer", "Certificate DER size in bytes.")).add("hashCode", C1648.m5545("integer", "Java Arrays.hashCode value over certificate DER bytes.")).add("md5", C1648.m5545("string", "Lowercase certificate DER MD5 hex without colons or 0x prefix.")).add("sha1", C1648.m5545("string", "Lowercase certificate DER SHA-1 hex without colons or 0x prefix.")).add("sha256", C1648.m5545("string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix.")).add("crc32", C1648.m5545("string", "Lowercase certificate DER CRC32 hex without colons or 0x prefix.")).add("certificateSignatureAlgorithm", C1648.m5545("string", "X.509 certificate signature algorithm name; not the APK v2/v3 signer algorithm.")).add("certificateSignatureAlgorithmOid", C1648.m5545("string", "X.509 certificate signature algorithm OID; not the APK v2/v3 signer algorithm.")).add("subject", C1648.m5545("string", "Certificate subject formatted with X500Principal RFC2253.")).add("issuer", C1648.m5545("string", "Certificate issuer formatted with X500Principal RFC2253.")).add("serialNumberHex", C1648.m5545("string", "Lowercase certificate serial number hex without 0x prefix.")).add("notBeforeEpochMillis", C1648.m5545("integer", "Certificate notBefore time in epoch milliseconds.")), "integer", "Certificate notAfter time in epoch milliseconds.", "notAfterEpochMillis", "One unique signing certificate summary."))).add(d.O, C1648.m5542("string", "Why signing certificate metadata is unavailable when available=false, or null.")), "APK signing certificate summary. This is certificate metadata only and does not verify installability or signature validity.".concat(z ? "" : " Use mt_apk_read_signature for full certificate attributes."));
    }
}
