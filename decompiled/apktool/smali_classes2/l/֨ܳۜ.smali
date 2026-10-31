.class public final Ll/֨ܳۜ;
.super Ljava/lang/Object;
.source "F6WD"


# direct methods
.method public static ֫(Ll/۠ܿۜ;Z)Lbin/mt/json/JSONObject;
    .locals 7

    .line 17
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 18
    iget-object v1, p0, Ll/۠ܿۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "schemes"

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ܿۜ;

    const-string v4, "sha256"

    if-nez p1, :cond_0

    .line 32
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v6, v2, Ll/֨ܿۜ;->᩷:Ljava/util/ArrayList;

    .line 33
    invoke-static {v6}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v2, v2, Ll/֨ܿۜ;->ܺ:Ljava/lang/String;

    .line 34
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_1

    .line 36
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v6, v2, Ll/֨ܿۜ;->᩷:Ljava/util/ArrayList;

    .line 37
    invoke-static {v6}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "sizeBytes"

    iget v6, v2, Ll/֨ܿۜ;->ۖ:I

    .line 38
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "hashCode"

    iget v6, v2, Ll/֨ܿۜ;->ᩳ:I

    .line 39
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "md5"

    iget-object v6, v2, Ll/֨ܿۜ;->ܳ:Ljava/lang/String;

    .line 40
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "sha1"

    iget-object v6, v2, Ll/֨ܿۜ;->ۡ:Ljava/lang/String;

    .line 41
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v5, v2, Ll/֨ܿۜ;->ܺ:Ljava/lang/String;

    .line 42
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "crc32"

    iget-object v5, v2, Ll/֨ܿۜ;->ܽ:Ljava/lang/String;

    .line 43
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "certificateSignatureAlgorithm"

    iget-object v5, v2, Ll/֨ܿۜ;->֫:Ljava/lang/String;

    .line 44
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "certificateSignatureAlgorithmOid"

    iget-object v5, v2, Ll/֨ܿۜ;->ۧ:Ljava/lang/String;

    .line 45
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "subject"

    iget-object v5, v2, Ll/֨ܿۜ;->ۘ:Ljava/lang/String;

    .line 46
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "issuer"

    iget-object v5, v2, Ll/֨ܿۜ;->ܿ:Ljava/lang/String;

    .line 47
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "serialNumberHex"

    iget-object v5, v2, Ll/֨ܿۜ;->ۢ:Ljava/lang/String;

    .line 48
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "notBeforeEpochMillis"

    iget-wide v5, v2, Ll/֨ܿۜ;->ۜ:J

    .line 49
    invoke-virtual {v3, v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "notAfterEpochMillis"

    iget-wide v5, v2, Ll/֨ܿۜ;->᩻:J

    .line 50
    invoke-virtual {v3, v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 19
    :goto_1
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto/16 :goto_0

    .line 21
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "available"

    iget-boolean v2, p0, Ll/۠ܿۜ;->֫:Z

    .line 22
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "signaturePresent"

    iget-boolean v2, p0, Ll/۠ܿۜ;->ܳ:Z

    .line 23
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    iget-object v1, p0, Ll/۠ܿۜ;->ܿ:Ljava/util/ArrayList;

    .line 24
    invoke-static {v1}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {p1, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "hasDifferentCertificates"

    iget-boolean v2, p0, Ll/۠ܿۜ;->ᩳ:Z

    .line 25
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "certificates"

    .line 26
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "error"

    iget-object p0, p0, Ll/۠ܿۜ;->ܽ:Ljava/lang/String;

    .line 27
    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Z)Lbin/mt/json/JSONObject;
    .locals 9

    if-eqz p0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    const-string v0, " Use mt_apk_read_signature for full certificate attributes."

    :goto_0
    const-string v1, "APK signing certificate summary. This is certificate metadata only and does not verify installability or signature validity."

    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Whether signing certificate metadata is available."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "available"

    .line 57
    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "When available=true, whether any APK signature scheme certificate was found."

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "signaturePresent"

    .line 58
    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "When available=true, APK signature schemes found in fixed order: V1, V2, V3, V3.1."

    .line 59
    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "schemes"

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "When available=true, whether multiple schemes use different certificate DER bytes."

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "hasDifferentCertificates"

    .line 60
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "sha256"

    const-string v5, "items"

    const-string v6, "description"

    const-string v7, "array"

    const-string v8, "type"

    if-nez p0, :cond_1

    const-string p0, "When available=true, unique certificate summaries; no DER or Base64 data is returned."

    .line 0
    invoke-static {v8, v7, v6, p0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 72
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Schemes using this certificate."

    .line 73
    invoke-static {v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-virtual {v6, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Lowercase certificate DER SHA-256 hex without colons or 0x prefix; not an APK file digest."

    const-string v7, "One signing certificate summary."

    .line 0
    invoke-static {v4, v2, v6, v3, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 72
    invoke-virtual {p0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    goto/16 :goto_1

    :cond_1
    const-string p0, "When available=true, unique X.509 certificate summaries grouped by identical DER bytes; no DER or Base64 data is returned."

    .line 0
    invoke-static {v8, v7, v6, p0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 79
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Schemes that use this certificate, in fixed order: V1, V2, V3, V3.1."

    .line 80
    invoke-static {v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-virtual {v6, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Certificate DER size in bytes."

    const-string v7, "integer"

    .line 110
    invoke-static {v7, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "sizeBytes"

    .line 81
    invoke-virtual {v4, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Java Arrays.hashCode value over certificate DER bytes."

    .line 110
    invoke-static {v7, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "hashCode"

    .line 82
    invoke-virtual {v4, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Lowercase certificate DER MD5 hex without colons or 0x prefix."

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "md5"

    .line 83
    invoke-virtual {v4, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Lowercase certificate DER SHA-1 hex without colons or 0x prefix."

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "sha1"

    .line 84
    invoke-virtual {v4, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Lowercase certificate DER SHA-256 hex without colons or 0x prefix."

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 85
    invoke-virtual {v4, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Lowercase certificate DER CRC32 hex without colons or 0x prefix."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "crc32"

    .line 86
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "X.509 certificate signature algorithm name; not the APK v2/v3 signer algorithm."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "certificateSignatureAlgorithm"

    .line 87
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "X.509 certificate signature algorithm OID; not the APK v2/v3 signer algorithm."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "certificateSignatureAlgorithmOid"

    .line 88
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Certificate subject formatted with X500Principal RFC2253."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "subject"

    .line 89
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Certificate issuer formatted with X500Principal RFC2253."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "issuer"

    .line 90
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Lowercase certificate serial number hex without 0x prefix."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "serialNumberHex"

    .line 91
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Certificate notBefore time in epoch milliseconds."

    .line 110
    invoke-static {v7, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "notBeforeEpochMillis"

    .line 92
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "notAfterEpochMillis"

    const-string v6, "Certificate notAfter time in epoch milliseconds."

    const-string v8, "One unique signing certificate summary."

    .line 0
    invoke-static {v3, v7, v6, v4, v8}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 79
    invoke-virtual {p0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    :goto_1
    const-string v3, "certificates"

    .line 61
    invoke-virtual {v1, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "Why signing certificate metadata is unavailable when available=false, or null."

    .line 103
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "error"

    .line 62
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 55
    invoke-static {p0, v0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
