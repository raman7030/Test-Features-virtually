.class public final Ll/ܳ֡ۜ;
.super Ll/ܿ֡ۜ;
.source "46KL"


# virtual methods
.method public final ۜ()[Ljava/lang/String;
    .locals 1

    const-string v0, "checkedEntries"

    .line 48
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܿ֡ۜ;->֫:Ll/֡᩵ۜ;

    invoke-virtual {v0, p1}, Ll/֡᩵ۜ;->ᩳ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Check the structure of a ZIP archive and fully read every non-directory entry to verify length and checksum or encryption authentication. Files in all directories are checked; any data attached to directory entries is skipped. Stops at the first error and reports the affected entry when available and how many entries passed. This can read the whole archive and exceed client timeouts. Success means all checks completed without a detected error."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Test ZIP Integrity"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 3

    const/4 v0, 0x1

    .line 35
    invoke-static {v0}, Ll/ܿ֡ۜ;->֫(Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "One password used for all encrypted file entries; pass an empty string if none are encrypted. Archives whose entries require different passwords cannot be fully tested with this tool."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "password"

    .line 36
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Arguments for mt_zip_test."

    .line 35
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_zip_test"

    return-object v0
.end method

.method public final ᩻()Lbin/mt/json/JSONObject;
    .locals 5

    .line 41
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Normalized absolute archive path."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    .line 42
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Non-directory entries fully read and validated."

    const-string v2, "integer"

    const-string v3, "checkedEntries"

    const-string v4, "A completed ZIP integrity test."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
