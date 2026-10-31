.class public final Ll/ܽ֡ۜ;
.super Ll/ܿ֡ۜ;
.source "L6KP"


# virtual methods
.method public final ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONArray;
    .locals 3

    const-string v0, "hasMore"

    .line 65
    invoke-virtual {p2, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    return-object p1

    .line 66
    :cond_0
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0, p1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string p1, "path"

    invoke-virtual {p2, p1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "nextByteOffset"

    .line 67
    invoke-virtual {p2, v0}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string p2, "byteOffset"

    invoke-virtual {p1, p2, v0, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 68
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    const-string v0, "continue"

    const-string v1, "Read the next byte page from the unchanged ZIP entry."

    const-string v2, "mt_zip_read_bytes"

    invoke-static {p1, v2, v0, v1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {p2, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public final ۜ()[Ljava/lang/String;
    .locals 1

    const-string v0, "size"

    .line 55
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܿ֡ۜ;->֫:Ll/֡᩵ۜ;

    invoke-virtual {v0, p1}, Ll/֡᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read a hex page of one ZIP entry\'s uncompressed bytes. Offsets refer to entry content, not the ZIP file itself. Later offsets may require decompressing from the beginning. This preview does not verify the complete entry; use mt_zip_test for integrity. Keep the ZIP unchanged and use the returned continuation to read more."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read ZIP Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    const/4 v0, 0x1

    .line 37
    invoke-static {v0}, Ll/ܿ֡ۜ;->֫(Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Exact full ZIP file path, without a trailing /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryPath"

    .line 38
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Zero-based uncompressed byte offset, 0..9007199254740991; initially 0."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    .line 39
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxBytes"

    const-string v3, "Maximum bytes per page, 1..65536; suggested 256."

    const-string v4, "Arguments for mt_zip_read_bytes."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_zip_read_bytes"

    return-object v0
.end method

.method public final ᩻()Lbin/mt/json/JSONObject;
    .locals 5

    .line 45
    invoke-static {}, Ll/ܿ֡ۜ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Zero-based offset of the first returned byte."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    .line 46
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Uppercase hexadecimal without separators; empty when reading at EOF."

    const-string v3, "string"

    .line 96
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "hex"

    .line 47
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Offset immediately after the returned bytes."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "nextByteOffset"

    .line 48
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Uncompressed entry size from ZIP metadata, or the observed length when this read reaches EOF. -1 if unavailable or above 9007199254740991. Does not require a full scan."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "totalBytes"

    .line 49
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether bytes remain after nextByteOffset."

    const-string v2, "boolean"

    const-string v3, "hasMore"

    const-string v4, "One uncompressed byte page."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
