.class public final Ll/ۧ֡ۜ;
.super Ll/ܿ֡ۜ;
.source "P6KT"


# virtual methods
.method public final ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONArray;
    .locals 3

    const-string v0, "pagination"

    .line 62
    invoke-virtual {p2, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "hasMore"

    .line 63
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    return-object p1

    .line 64
    :cond_0
    new-instance v1, Lbin/mt/json/JSONObject;

    invoke-direct {v1, p1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string p1, "path"

    .line 65
    invoke-virtual {p2, p1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "nextCursor"

    invoke-virtual {v0, p2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "cursor"

    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 66
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    const-string v0, "continue"

    const-string v1, "Read the next ZIP directory page."

    const-string v2, "mt_zip_list"

    invoke-static {p1, v2, v0, v1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {p2, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܿ֡ۜ;->֫:Ll/֡᩵ۜ;

    invoke-virtual {v0, p1}, Ll/֡᩵ۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "List entries in a ZIP archive, including directories implied by file paths. Names are case-sensitive; directories end with /, and leading /, . and .. are preserved literally. Recursive results use depth-first name order. Keep the ZIP unchanged while paging and use the returned continuation; if the cursor expires, use the returned restart action. Listing does not verify integrity; use mt_zip_test for that."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List ZIP Entries"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    const/4 v0, 0x0

    .line 37
    invoke-static {v0}, Ll/ܿ֡ۜ;->֫(Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Exact ZIP directory path ending with /. Pass an empty string for the ZIP root; / selects the directory literally named /, not the root."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entryPath"

    .line 38
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "Whether to include all descendants; pass false initially."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "recursive"

    .line 39
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "True returns only relative entry names; recommended for browsing. False includes sizes and encryption status."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "simple"

    .line 40
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Pass an empty string initially; for later pages use the returned continuation. Only limit and simple may change between pages."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "cursor"

    .line 41
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Maximum entries per page, 1..1000; suggested 200."

    const-string v2, "integer"

    const-string v3, "limit"

    const-string v4, "Arguments for mt_zip_list."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_zip_list"

    return-object v0
.end method

.method public final ᩻()Lbin/mt/json/JSONObject;
    .locals 6

    .line 47
    invoke-static {}, Ll/ܿ֡ۜ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Exact ZIP directory prefix shared by all listed relative paths; empty for the root."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entryPath"

    .line 48
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "One entry per element. With simple=true, each string is the raw relative path. Otherwise: size compressedSize encryption relativePath; split only at the first three ASCII spaces. size is uncompressed bytes; compressedSize is compressed bytes. Directories sum descendants; - means unavailable. Encryption is e for encrypted files, otherwise -; directories do not summarize descendant encryption. Paths ending in / are directories. Preserve the path verbatim, including spaces and newlines. Concatenate data.entryPath and the relative path directly for other ZIP tools; never normalize leading slashes or dot segments. Empty array for no entries."

    .line 49
    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "listing"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 50
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Whether another page remains."

    const-string v4, "boolean"

    .line 124
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "hasMore"

    .line 51
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "nextCursor"

    const-string v4, "Opaque continuation token, or empty string at the end."

    const-string v5, "Listing continuation."

    .line 0
    invoke-static {v2, v1, v4, v3, v5}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    .line 50
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "One ZIP directory page."

    .line 47
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
