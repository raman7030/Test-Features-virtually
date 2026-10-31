.class public final Ll/ۜܳۜ;
.super Ljava/lang/Object;
.source "M798"


# direct methods
.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 9

    .line 390
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id for successful reads."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 391
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this read result; pass this value together with data.workspaceId for follow-up reads."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 392
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Normalized zip_entry locator reusable together with data.workspaceId and data.editSessionId."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 393
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Human-readable ZIP entry name."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "name"

    .line 394
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v4, "Maximum bytes requested for this page."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "maxBytes"

    .line 395
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 458
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Uppercase hexadecimal without separators; empty when reading at EOF."

    .line 96
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "hex"

    .line 459
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Byte offset of the first returned byte."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "byteOffset"

    .line 460
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Byte offset immediately after the returned bytes, including at EOF. Continue via nextActions."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "nextByteOffset"

    .line 461
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Total uncompressed bytes in the selected entry, including session edits. -1 if unknown or above 9007199254740991."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "totalBytes"

    .line 462
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "ZIP byte window data."

    .line 458
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 396
    invoke-static {v4}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "byteWindow"

    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 397
    invoke-static {}, Ll/ۜܳۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "pagination"

    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Successful mt_apk_read_bytes data."

    .line 390
    invoke-static {v0, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 419
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "description"

    const-string v6, "Temporary AXML encode failures when a saved AXML overlay cannot be synthesized as bytes."

    const-string v7, "type"

    const-string v8, "array"

    .line 0
    invoke-static {v7, v8, v5, v6}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 427
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Failure text locator."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 428
    invoke-virtual {v6, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Dex class descriptor, or null for entry failures."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "className"

    .line 429
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Failure code."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "errorCode"

    .line 430
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Compiler or encoder message."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "message"

    .line 431
    invoke-virtual {v3, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "0-based line in the failed text, or null."

    .line 117
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "line"

    .line 432
    invoke-virtual {v1, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "0-based column in the failed text, or null."

    .line 117
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "column"

    .line 433
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "One temporary entry synthesize failure."

    .line 427
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "items"

    invoke-virtual {v5, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "failures"

    .line 420
    invoke-virtual {v4, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_read_bytes recovery diagnostics."

    .line 419
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 37
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 38
    invoke-static {}, Ll/ۜܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_read_bytes. data.byteWindow.hex contains uppercase raw ZIP entry bytes with byteOffset metadata for a zip_entry locator; reuse data.workspaceId and data.editSessionId for follow-up reads; nextActions carries continuation or retry calls."

    .line 36
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;
    .locals 4

    .line 503
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "0-based index matching the input reads[] item."

    const-string v2, "integer"

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "index"

    .line 504
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Normalized resource locator string formatted as resource:0x plus 8 lowercase hex digits."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 505
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Requested variant that failed."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "variant"

    .line 506
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Stable item-level failure code."

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 507
    invoke-static {v2, p0}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "errorCode"

    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "Human-readable item-level failure message."

    .line 96
    invoke-static {v1, v0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "message"

    .line 508
    invoke-virtual {p0, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-eqz p1, :cond_0

    const-string p1, "Existing resource type name."

    .line 96
    invoke-static {v1, p1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "type"

    .line 510
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "Existing resource entry name."

    .line 96
    invoke-static {v1, v0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "name"

    .line 511
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_0
    const-string p1, "Item-level resource read failure."

    .line 513
    invoke-static {p0, p1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;
    .locals 5

    if-nez p0, :cond_0

    .line 328
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 330
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    .line 331
    invoke-static {p0, v1}, Ll/ۜܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "missing"

    const/4 v2, 0x0

    .line 332
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    const/4 v3, 0x0

    .line 333
    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "name"

    .line 334
    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "variant"

    .line 335
    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueKind"

    .line 336
    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueSnippet"

    .line 337
    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueTruncated"

    .line 338
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 356
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p0}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 357
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 358
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Missing resource read locator: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 15

    const-string v0, "continue"

    .line 622
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_continue"

    .line 621
    invoke-static {v1, v2, v0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 624
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_workspace_open"

    const-string v3, "retry"

    .line 623
    invoke-static {v1, v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 626
    invoke-static {}, Ll/ۧᩳܽ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "mt_apk_list"

    const-string v5, "verify_workspace"

    .line 625
    invoke-static {v2, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "mt_apk_dex_read_class_outline"

    .line 628
    invoke-static {}, Ll/ۧᩳܽ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 627
    invoke-static {v6, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "mt_apk_read_text"

    .line 630
    invoke-static {}, Ll/ۧᩳܽ;->ۢ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 629
    invoke-static {v6, v5, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_read_bytes"

    .line 632
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 631
    invoke-static {v7, v6, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "mt_apk_resource_read"

    .line 634
    invoke-static {}, Ll/ۧᩳܽ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 633
    invoke-static {v8, v7, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 201
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "string"

    const-string v10, "Workspace id."

    .line 96
    invoke-static {v9, v10}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "workspaceId"

    .line 202
    invoke-virtual {v8, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "Non-empty edit session id."

    .line 96
    invoke-static {v9, v10}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "editSessionId"

    .line 203
    invoke-virtual {v8, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "description"

    const-string v11, "Atomic resource value edits. Runtime accepts 1..200 items; suggested batch size is 20."

    const-string v12, "type"

    const-string v13, "array"

    .line 0
    invoke-static {v12, v13, v10, v11}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 207
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "Resource locator string such as resource:0x7f010000. Copy from mt_apk_resource_read data.results[].locator."

    .line 96
    invoke-static {v9, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "locator"

    .line 208
    invoke-virtual {v11, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "Exact resource variant to edit."

    .line 96
    invoke-static {v9, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "variant"

    .line 209
    invoke-virtual {v11, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "Semantic targetVersion as 16 lowercase hex digits, copied from the matching resource_read value for the same workspaceId, editSessionId, locator, and variant."

    .line 96
    invoke-static {v9, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "targetVersion"

    .line 210
    invoke-virtual {v11, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "valueXml"

    const-string v13, "Complete single-entry resource XML to compile and save."

    const-string v14, "One resource value edit."

    .line 0
    invoke-static {v11, v9, v13, v12, v14}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "items"

    .line 207
    invoke-virtual {v10, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "edits"

    .line 204
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Arguments for mt_apk_resource_edit."

    .line 201
    invoke-static {v8, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "mt_apk_resource_edit"

    .line 635
    invoke-static {v8, v9, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/16 v8, 0x8

    new-array v8, v8, [Lbin/mt/json/JSONObject;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v0, 0x1

    aput-object v1, v8, v0

    const/4 v0, 0x2

    aput-object v2, v8, v0

    const/4 v0, 0x3

    aput-object v4, v8, v0

    const/4 v0, 0x4

    aput-object v5, v8, v0

    const/4 v0, 0x5

    aput-object v6, v8, v0

    const/4 v0, 0x6

    aput-object v7, v8, v0

    const/4 v0, 0x7

    aput-object v3, v8, v0

    const-string v0, "Executable follow-up calls; copy arguments directly."

    .line 620
    invoke-static {v0, v8}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 32

    move-object/from16 v0, p0

    .line 102
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    const/4 v3, 0x0

    .line 103
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, ""

    const-string v4, "editSessionId"

    .line 104
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "resourceNamePolicy"

    .line 105
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "names_or_hex"

    const/4 v6, 0x0

    const-string v7, "hexPrefixAccepted"

    const-string v8, "systemNameReferencesAccepted"

    const-string v9, "appNameReferencesAccepted"

    const-string v10, "appReferenceOutput"

    const-string v11, "confused"

    const/4 v12, 0x1

    if-nez v4, :cond_0

    .line 308
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 309
    invoke-virtual {v4, v11, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 310
    invoke-virtual {v4, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 311
    invoke-virtual {v4, v9, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 312
    invoke-virtual {v4, v8, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 313
    invoke-virtual {v4, v7, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    goto :goto_0

    .line 315
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v13

    .line 316
    invoke-virtual {v4, v11, v6}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v13, v11, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 317
    invoke-virtual {v4, v10, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 318
    invoke-virtual {v4, v9, v12}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v5, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 319
    invoke-virtual {v4, v8, v12}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 320
    invoke-virtual {v4, v7, v12}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 105
    :goto_0
    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "variantSets"

    .line 106
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 183
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "locator"

    if-nez v4, :cond_1

    goto :goto_2

    .line 187
    :cond_1
    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONValue;

    .line 188
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 189
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 190
    invoke-virtual {v7, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-static {v9}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-virtual {v8, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "variants"

    .line 191
    invoke-virtual {v7, v9}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v7

    invoke-static {v7}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v7

    invoke-virtual {v8, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 189
    invoke-virtual {v5, v7}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 106
    :cond_2
    :goto_2
    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "results"

    .line 107
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 200
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    if-nez v4, :cond_4

    :cond_3
    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object v0, v5

    goto/16 :goto_13

    .line 204
    :cond_4
    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONValue;

    .line 205
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "index"

    const/4 v9, -0x1

    .line 367
    invoke-virtual {v7, v8, v9}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v9

    const-string v10, "Invalid resource read integer: "

    if-ltz v9, :cond_24

    .line 215
    invoke-static {v7, v6}, Ll/ۜܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "variant"

    .line 216
    invoke-static {v7, v12}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "errorCode"

    .line 217
    invoke-virtual {v7, v14, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v15, "name"

    move-object/from16 v16, v4

    const-string v4, "type"

    if-eqz v3, :cond_7

    .line 219
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 220
    invoke-virtual {v10, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 221
    invoke-virtual {v8, v6, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 222
    invoke-virtual {v8, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 223
    invoke-virtual {v8, v14, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "message"

    .line 224
    invoke-static {v7, v9}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "RESOURCE_NOT_FOUND"

    .line 225
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_4

    :cond_5
    const-string v9, "RESOURCE_VARIANT_NOT_FOUND"

    .line 228
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 229
    invoke-static {v7, v4}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 230
    invoke-static {v7, v15}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    :goto_4
    const/4 v3, 0x0

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object v0, v5

    move-object/from16 v17, v6

    goto/16 :goto_12

    .line 232
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported resource read error: "

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const-string v3, "valueKind"

    .line 234
    invoke-static {v7, v3}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 235
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 236
    invoke-virtual {v0, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 237
    invoke-virtual {v0, v6, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 238
    invoke-virtual {v0, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 239
    invoke-static {v7, v4}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v4, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 240
    invoke-static {v7, v15}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 241
    invoke-virtual {v0, v3, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 242
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-string v8, "boolean"

    const-string v9, "attribute"

    const-string v11, "text"

    const-string v12, "unparsed"

    const-string v13, "reference"

    const-string v15, "number"

    move-object/from16 v17, v6

    const-string v6, "dimension"

    move-object/from16 v18, v1

    const-string v1, "file_path"

    move-object/from16 v19, v2

    const-string v2, "fraction"

    move-object/from16 v20, v10

    const-string v10, "null_value"

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v4, "styled_text"

    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_6

    :cond_8
    const/16 v4, 0xc

    goto/16 :goto_5

    :sswitch_1
    const-string v4, "color"

    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_6

    :cond_9
    const/16 v4, 0xb

    goto/16 :goto_5

    :sswitch_2
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto/16 :goto_6

    :cond_a
    const/16 v4, 0xa

    goto/16 :goto_5

    :sswitch_3
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_6

    :cond_b
    const/16 v4, 0x9

    goto/16 :goto_5

    :sswitch_4
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_6

    :cond_c
    const/16 v4, 0x8

    goto :goto_5

    :sswitch_5
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_6

    :cond_d
    const/4 v4, 0x7

    goto :goto_5

    :sswitch_6
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_6

    :cond_e
    const/4 v4, 0x6

    goto :goto_5

    :sswitch_7
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_6

    :cond_f
    const/4 v4, 0x5

    goto :goto_5

    :sswitch_8
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    goto :goto_6

    :cond_10
    const/4 v4, 0x4

    goto :goto_5

    :sswitch_9
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_6

    :cond_11
    const/4 v4, 0x3

    goto :goto_5

    :sswitch_a
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_6

    :cond_12
    const/4 v4, 0x2

    goto :goto_5

    :sswitch_b
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto :goto_6

    :cond_13
    const/4 v4, 0x1

    goto :goto_5

    :sswitch_c
    const-string v4, "item_list"

    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_6

    :cond_14
    const/4 v4, 0x0

    :goto_5
    move-object/from16 v21, v14

    goto :goto_7

    :goto_6
    const/4 v4, -0x1

    goto :goto_5

    :goto_7
    const-string v14, "fileLocator"

    move-object/from16 v22, v5

    const-string v5, "resolvedTarget"

    move-object/from16 v23, v10

    const-string v10, "targetLocator"

    move-object/from16 v24, v2

    const-string v2, "valueTruncated"

    move-object/from16 v25, v1

    const-string v1, "value"

    packed-switch v4, :pswitch_data_0

    .line 256
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported resource value kind: "

    move-object/from16 v2, v21

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :pswitch_0
    invoke-static {v7, v1}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v3, 0x0

    .line 247
    invoke-virtual {v7, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 248
    invoke-virtual {v7, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v1, v10, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 249
    invoke-virtual {v7, v5}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/ۜܳۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_8

    :pswitch_1
    const/4 v3, 0x0

    .line 250
    invoke-static {v7, v1}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 251
    invoke-virtual {v7, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 252
    invoke-static {v7, v14}, Ll/ۜܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v14, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto :goto_8

    :pswitch_2
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 244
    invoke-virtual {v7, v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 245
    invoke-virtual {v7, v2, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    :goto_8
    move-object v2, v0

    move-object v4, v7

    goto/16 :goto_11

    :pswitch_3
    const-string v4, "items"

    .line 253
    invoke-virtual {v7, v4}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v21

    move-object/from16 v26, v7

    .line 277
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    if-nez v21, :cond_15

    const/4 v1, 0x0

    move-object v2, v0

    move-object v3, v4

    move-object v0, v7

    goto/16 :goto_10

    .line 281
    :cond_15
    invoke-virtual/range {v21 .. v21}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_9
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_22

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Lbin/mt/json/JSONValue;

    move-object/from16 v28, v0

    .line 282
    invoke-virtual/range {v27 .. v27}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v27, v4

    .line 283
    invoke-static {v0, v3}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v29, v7

    .line 284
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object/from16 v30, v14

    const-string v14, "key"

    move-object/from16 v31, v5

    const/4 v5, 0x0

    .line 285
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "keyLocator"

    .line 286
    invoke-virtual {v0, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v14

    invoke-static {v14}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v14

    invoke-virtual {v5, v7, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 287
    invoke-virtual {v5, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 288
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_1

    :goto_a
    move-object/from16 v14, v24

    move-object/from16 v7, v25

    goto/16 :goto_b

    :sswitch_d
    const-string v7, "styled_text"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    goto :goto_a

    :cond_16
    const/16 v7, 0xb

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0xb

    goto/16 :goto_d

    :sswitch_e
    const-string v7, "color"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto :goto_a

    :cond_17
    const/16 v7, 0xa

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0xa

    goto/16 :goto_d

    :sswitch_f
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    goto :goto_a

    :cond_18
    const/16 v7, 0x9

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x9

    goto/16 :goto_d

    :sswitch_10
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_19

    goto :goto_a

    :cond_19
    const/16 v7, 0x8

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x8

    goto/16 :goto_d

    :sswitch_11
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    goto :goto_a

    :cond_1a
    const/4 v7, 0x7

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x7

    goto/16 :goto_d

    :sswitch_12
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    goto :goto_a

    :cond_1b
    const/4 v7, 0x6

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x6

    goto/16 :goto_d

    :sswitch_13
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1c

    goto/16 :goto_a

    :cond_1c
    const/4 v7, 0x5

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x5

    goto/16 :goto_d

    :sswitch_14
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1d

    goto/16 :goto_a

    :cond_1d
    const/4 v7, 0x4

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x4

    goto/16 :goto_d

    :sswitch_15
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    goto/16 :goto_a

    :cond_1e
    const/4 v7, 0x3

    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x3

    goto :goto_d

    :sswitch_16
    move-object/from16 v7, v25

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1f

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    move-object/from16 v14, v24

    goto :goto_c

    :cond_1f
    const/4 v14, 0x2

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    move-object/from16 v14, v24

    const/16 v23, 0x2

    goto :goto_d

    :sswitch_17
    move-object/from16 v14, v24

    move-object/from16 v7, v25

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_20

    :goto_b
    move-object/from16 v25, v3

    move-object/from16 v3, v23

    goto :goto_c

    :cond_20
    const/16 v24, 0x1

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    const/16 v23, 0x1

    goto :goto_d

    :sswitch_18
    move-object/from16 v14, v24

    move-object/from16 v7, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v23

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_21

    goto :goto_c

    :cond_21
    const/16 v23, 0x0

    goto :goto_d

    :goto_c
    const/16 v23, -0x1

    :goto_d
    packed-switch v23, :pswitch_data_1

    .line 299
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported resource child value kind: "

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 292
    :pswitch_4
    invoke-static {v0, v1}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v23, v3

    const/4 v3, 0x0

    .line 293
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v4, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 294
    invoke-virtual {v0, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v3, v10, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v31

    .line 295
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ۜܳۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :goto_e
    move-object/from16 v0, v29

    goto :goto_f

    :pswitch_5
    move-object/from16 v23, v3

    move-object/from16 v4, v31

    .line 296
    invoke-static {v0, v1}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x0

    .line 297
    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v30

    .line 298
    invoke-static {v0, v4}, Ll/ۜܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto :goto_e

    :pswitch_6
    move-object/from16 v23, v3

    move-object/from16 v4, v30

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 290
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 291
    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    goto :goto_e

    .line 301
    :goto_f
    invoke-virtual {v0, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v24, v14

    move-object/from16 v3, v25

    move-object/from16 v4, v27

    move-object/from16 v14, v30

    move-object/from16 v5, v31

    move-object/from16 v25, v7

    move-object v7, v0

    move-object/from16 v0, v28

    goto/16 :goto_9

    :cond_22
    move-object/from16 v28, v0

    move-object/from16 v27, v4

    move-object v0, v7

    const/4 v1, 0x0

    move-object/from16 v3, v27

    move-object/from16 v2, v28

    .line 253
    :goto_10
    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "itemsTruncated"

    move-object/from16 v4, v26

    .line 254
    invoke-virtual {v4, v3, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "totalItemCount"

    const/4 v3, -0x1

    .line 367
    invoke-virtual {v4, v1, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-ltz v3, :cond_23

    .line 255
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    :goto_11
    const-string v0, "targetVersion"

    .line 265
    invoke-static {v4, v0}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueXml"

    const/4 v2, 0x0

    .line 266
    invoke-virtual {v4, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueXmlCharCount"

    .line 267
    invoke-virtual {v4, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueXmlTruncated"

    const/4 v2, 0x0

    .line 268
    invoke-virtual {v4, v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editable"

    .line 269
    invoke-virtual {v4, v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editableReason"

    const/4 v2, 0x0

    .line 270
    invoke-virtual {v4, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    move-object v3, v2

    move-object/from16 v0, v22

    .line 205
    :goto_12
    invoke-virtual {v0, v8}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object v5, v0

    move-object/from16 v4, v16

    move-object/from16 v6, v17

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    move-object/from16 v0, p0

    goto/16 :goto_3

    .line 369
    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    move-object/from16 v2, v20

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    move-object v2, v10

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_13
    move-object/from16 v1, v18

    move-object/from16 v2, v19

    .line 107
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    move-object/from16 v2, p0

    .line 108
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa31db6 -> :sswitch_c
        -0x7841c747 -> :sswitch_b
        -0x62923dfe -> :sswitch_a
        -0x4e76caf8 -> :sswitch_9
        -0x4144929a -> :sswitch_8
        -0x3da724b7 -> :sswitch_7
        -0x3724c0b5 -> :sswitch_6
        -0x67dcc16 -> :sswitch_5
        0x36452d -> :sswitch_4
        0xc7aa9c -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5a72f63 -> :sswitch_1
        0xa45f119 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7841c747 -> :sswitch_18
        -0x62923dfe -> :sswitch_17
        -0x4e76caf8 -> :sswitch_16
        -0x4144929a -> :sswitch_15
        -0x3da724b7 -> :sswitch_14
        -0x3724c0b5 -> :sswitch_13
        -0x67dcc16 -> :sswitch_12
        0x36452d -> :sswitch_11
        0xc7aa9c -> :sswitch_10
        0x3db6c28 -> :sswitch_f
        0x5a72f63 -> :sswitch_e
        0xa45f119 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 345
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    .line 347
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Missing resource read field: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܳ()Lbin/mt/json/JSONObject;
    .locals 7

    .line 375
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id for successful reads."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 376
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this read result; pass this value together with data.workspaceId for follow-up reads."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 377
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Normalized locator reusable with mt_apk_read_text together with data.workspaceId and data.editSessionId."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 378
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Human-readable target name."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "name"

    .line 379
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Text source kind such as zip_entry text, axml, dex_class, dex_method, or dex_field."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "textSourceKind"

    .line 380
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "16-digit lowercase hex version token for this exact LF-normalized text target; for editable locators (dex_class, dex_method, axml, zip_entry), pass it unchanged to mt_apk_edit_text. For dex_method and dex_field, this is based on the member text only; dex_field is read-only for edit_text and its targetVersion is informational."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "targetVersion"

    .line 381
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v3, "Line limit used by this page."

    .line 117
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "limit"

    .line 382
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "boolean"

    const-string v4, "Whether the text result is truncated."

    .line 124
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "truncated"

    .line 383
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Reason for truncation, or null when the page is complete."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "truncatedReason"

    .line 384
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 440
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Returned LF-normalized text. Smali .line N directives, if present, are original Java source debug lines; edit_text does not accept line or column positions."

    .line 96
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "text"

    .line 441
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "0-based line component of the inclusive start position within this read target."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "startLine"

    .line 442
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "0-based column component of the inclusive start position, counted by code point."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "startColumn"

    .line 443
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "0-based line component of the exclusive end position within this read target, paired with nextColumn. May remain on startLine; at EOF identifies the end position. Continue via nextActions."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "nextLine"

    .line 444
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "0-based Unicode code-point column of the exclusive end position, paired with nextLine, including at EOF."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "nextColumn"

    .line 445
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Number of distinct logical lines touched by returned text."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "returnedLineCount"

    .line 446
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Number of Unicode code points in text, including LF."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "returnedCodePoints"

    .line 447
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Total logical lines in the LF-normalized target; an empty target counts as one line, a final LF adds no empty line. -1 when the source text is truncated."

    .line 110
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "totalLineCount"

    .line 448
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Whether a returned line was truncated by character budget."

    .line 124
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "lineTruncated"

    .line 449
    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "0-based absolute class-smali line component of the start position for member reads, or JSON null for non-member reads."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "absoluteStartLine"

    .line 450
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "0-based absolute class-smali line component of the end position for member reads, or JSON null for non-member reads."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "absoluteEndLine"

    .line 451
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Text window data."

    .line 440
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 385
    invoke-static {v2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "textWindow"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 386
    invoke-static {}, Ll/ۜܳۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "pagination"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Successful mt_apk_read_text data."

    .line 375
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 410
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Suggested locator for NOT_TEXT_ENTRY AXML correction; follow nextActions to execute."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "suggestedLocator"

    .line 411
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_read_text recovery diagnostics."

    .line 410
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 28
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 29
    invoke-static {}, Ll/ۜܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_read_text. LF-normalized text in data.textWindow.text and a targetVersion for the selected target. Copy the version unchanged for subsequent edits; use nextActions to continue reading."

    .line 27
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 611
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether another page is available through nextActions."

    const-string v2, "boolean"

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "hasMore"

    .line 612
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Cursor for mt_apk_continue; null when no page remains."

    const-string v2, "string"

    .line 103
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "nextCursor"

    .line 613
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Read continuation state."

    .line 611
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 571
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Item key, or null for a default or unnamed child."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "key"

    .line 572
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Resource locator when the item key is addressable, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "keyLocator"

    .line 573
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 574
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONObject$Member;

    .line 575
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    .line 577
    :cond_0
    invoke-static {v0, p1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ()Lbin/mt/json/JSONObject;
    .locals 36

    .line 401
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id for successful reads."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 402
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this read result; pass this value together with data.workspaceId for follow-up reads."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 403
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 581
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "boolean"

    const-string v4, "Whether resources.arsc appears resource-name confused."

    .line 124
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "confused"

    .line 582
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "names_or_hex"

    const-string v5, "hex8_upper_no_0x"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "How APP resource references are emitted."

    .line 583
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "appReferenceOutput"

    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Whether APP name references are accepted in valueXml input."

    .line 124
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "appNameReferencesAccepted"

    .line 585
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Whether android: system name references are accepted in valueXml input."

    .line 124
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "systemNameReferencesAccepted"

    .line 586
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "hexPrefixAccepted"

    const-string v5, "Whether 0x-prefixed hex ids are accepted in all resource/attr id input positions."

    const-string v6, "Resource name/reference policy for this ARSC snapshot."

    .line 0
    invoke-static {v2, v3, v5, v4, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "resourceNamePolicy"

    .line 404
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Available variant sets grouped by existing resource locator."

    const-string v4, "type"

    const-string v5, "array"

    const-string v6, "description"

    .line 0
    invoke-static {v4, v5, v6, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 653
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "Normalized resource locator."

    .line 103
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "locator"

    .line 654
    invoke-virtual {v7, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "All real variants for this resource; default comes first."

    .line 0
    invoke-static {v4, v5, v6, v8}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "String item."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "items"

    .line 676
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "variants"

    .line 655
    invoke-virtual {v7, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "One resource variant set."

    .line 653
    invoke-static {v7, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-virtual {v2, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "variantSets"

    .line 405
    invoke-virtual {v0, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Flat resource read results in the same order as input reads[]."

    .line 0
    invoke-static {v4, v5, v6, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 469
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "One resource_read result. If errorCode is present, read the item-level failure branch; otherwise inspect valueKind for the applicable success fields."

    .line 470
    invoke-virtual {v7, v6, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 471
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    const-string v9, "RESOURCE_NOT_FOUND"

    const/4 v11, 0x0

    .line 472
    invoke-static {v9, v11}, Ll/ۜܳۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v8, v9}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v8

    const-string v9, "RESOURCE_VARIANT_NOT_FOUND"

    const/4 v11, 0x1

    .line 473
    invoke-static {v9, v11}, Ll/ۜܳۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v8, v9}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v8

    .line 474
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v18, "null_value"

    const-string v19, "unparsed"

    const-string v11, "text"

    const-string v12, "styled_text"

    const-string v13, "number"

    const-string v14, "boolean"

    const-string v15, "color"

    const-string v16, "dimension"

    const-string v17, "fraction"

    filled-new-array/range {v11 .. v19}, [Ljava/lang/String;

    move-result-object v11

    const-string v12, "Decoded scalar value kind."

    .line 475
    invoke-static {v12, v11}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "valueKind"

    invoke-virtual {v9, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "Decoded value text; null only when null_value or unparsed has no readable text."

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "value"

    .line 478
    invoke-virtual {v9, v13, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "Whether the decoded value summary was truncated by maxValueChars."

    .line 124
    invoke-static {v3, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "valueTruncated"

    .line 479
    invoke-virtual {v9, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "Scalar resource value."

    .line 474
    invoke-static {v9, v14}, Ll/ۜܳۜ;->ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v8, v9}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v8

    .line 480
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "reference"

    move-object/from16 v16, v0

    const-string v0, "attribute"

    move-object/from16 v17, v2

    filled-new-array {v14, v0}, [Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v7

    const-string v7, "Decoded reference kind."

    .line 481
    invoke-static {v7, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v9, v12, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "Decoded reference or attribute text."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 483
    invoke-virtual {v2, v13, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 124
    invoke-static {v3, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 484
    invoke-virtual {v2, v15, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "Direct resource target, or null for a zero or unavailable target id."

    move-object/from16 v19, v10

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    move-object/from16 v20, v9

    const-string v9, "targetLocator"

    .line 485
    invoke-virtual {v2, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 486
    invoke-static {}, Ll/ۜܳۜ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v10

    invoke-static {v10}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v10

    move-object/from16 v21, v9

    const-string v9, "resolvedTarget"

    invoke-virtual {v2, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v10, "Resource reference or attribute value."

    .line 480
    invoke-static {v2, v10}, Ll/ۜܳۜ;->ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v8, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 487
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "file_path"

    move-object/from16 v22, v9

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v9

    move-object/from16 v23, v10

    const-string v10, "Decoded file-path kind."

    .line 488
    invoke-static {v10, v9}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v8, v12, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Decoded file path text."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 489
    invoke-virtual {v8, v13, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 124
    invoke-static {v3, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 490
    invoke-virtual {v8, v15, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "ZIP entry locator for the complete decoded file path."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "fileLocator"

    .line 491
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Resource value that names a ZIP entry."

    .line 487
    invoke-static {v8, v9}, Ll/ۜܳۜ;->ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v2, v8}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 492
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "item_list"

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    const-string v11, "Decoded item-list kind."

    .line 493
    invoke-static {v11, v9}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v8, v12, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Child value summaries for item_list results."

    .line 0
    invoke-static {v4, v5, v6, v9}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 544
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v24, v4

    const-string v4, "One item_list child. Inspect valueKind for the applicable fields."

    .line 545
    invoke-virtual {v11, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 546
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v11

    move-object/from16 v25, v5

    .line 547
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v33, "null_value"

    const-string v34, "unparsed"

    const-string v26, "text"

    const-string v27, "styled_text"

    const-string v28, "number"

    const-string v29, "boolean"

    const-string v30, "color"

    const-string v31, "dimension"

    const-string v32, "fraction"

    move-object/from16 v35, v6

    filled-new-array/range {v26 .. v34}, [Ljava/lang/String;

    move-result-object v6

    move-object/from16 v26, v2

    const-string v2, "Decoded scalar child kind."

    .line 548
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v5, v12, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Decoded child text; null only when null_value or unparsed has no readable text."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 551
    invoke-virtual {v2, v13, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Whether the child summary was truncated by maxValueChars."

    .line 124
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 552
    invoke-virtual {v2, v15, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "Scalar child value."

    .line 547
    invoke-static {v2, v6}, Ll/ۜܳۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v11, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 553
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "Decoded reference child kind."

    filled-new-array {v14, v0}, [Ljava/lang/String;

    move-result-object v0

    .line 554
    invoke-static {v11, v0}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v6, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 556
    invoke-virtual {v0, v13, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 124
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 557
    invoke-virtual {v0, v15, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v6, v20

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    move-object/from16 v7, v21

    .line 558
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 559
    invoke-static {}, Ll/ۜܳۜ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-static {v6}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v6

    move-object/from16 v7, v22

    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Reference or attribute child value."

    .line 553
    invoke-static {v0, v6}, Ll/ۜܳۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 560
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "Decoded file-path child kind."

    filled-new-array/range {v23 .. v23}, [Ljava/lang/String;

    move-result-object v7

    .line 561
    invoke-static {v6, v7}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v2, v12, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "Decoded child file path text."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 562
    invoke-virtual {v2, v13, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 124
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 563
    invoke-virtual {v2, v15, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "ZIP entry locator for the complete decoded child file path."

    .line 96
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 564
    invoke-virtual {v2, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "File-path child value."

    .line 560
    invoke-static {v1, v2}, Ll/ۜܳۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "anyOf"

    .line 546
    invoke-virtual {v4, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v2, v19

    .line 669
    invoke-virtual {v9, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 494
    invoke-virtual {v8, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Whether children were limited by maxItemsPerValue."

    .line 124
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "itemsTruncated"

    .line 495
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Complete non-negative child item count."

    const-string v4, "integer"

    .line 110
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "totalItemCount"

    .line 496
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Complex resource value with child items."

    .line 492
    invoke-static {v0, v3}, Ll/ۜܳۜ;->ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v3, v26

    invoke-virtual {v3, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    move-object/from16 v3, v18

    .line 471
    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v17

    .line 662
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "results"

    move-object/from16 v3, v16

    .line 406
    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_resource_read data."

    .line 401
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "No tool-level resource_read diagnostics; per-item resource misses are returned in successful data.results[]."

    .line 415
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 53
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "mt_apk_resource_read returns per-item status in data.results[] and does not emit follow-up actions."

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v35

    .line 0
    invoke-static {v4, v5, v6, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "No follow-up action is emitted."

    .line 646
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_resource_read. data.workspaceId and data.editSessionId identify the inspected resource view. Each data.results[] item contains only the fields applicable to its errorCode or valueKind branch; data.variantSets[] lists available variants per existing resource id; data.resourceNamePolicy describes name/hex reference rules for valueXml. Successful resource reads use empty nextActions."

    .line 52
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ()Lbin/mt/json/JSONObject;
    .locals 16

    .line 594
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Referenced resource locator."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 595
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "Whether the referenced resource id is absent."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "missing"

    .line 596
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Referenced resource type, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "type"

    .line 597
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Referenced resource name, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "name"

    .line 598
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Actual variant selected for the summary, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "variant"

    .line 599
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v14, "null_value"

    const-string v15, "unparsed"

    const-string v3, "text"

    const-string v4, "styled_text"

    const-string v5, "number"

    const-string v6, "boolean"

    const-string v7, "color"

    const-string v8, "dimension"

    const-string v9, "fraction"

    const-string v10, "reference"

    const-string v11, "attribute"

    const-string v12, "file_path"

    const-string v13, "item_list"

    filled-new-array/range {v3 .. v15}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Summary value kind, or null."

    .line 600
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "valueKind"

    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Short value snippet up to 300 chars, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "valueSnippet"

    .line 603
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueTruncated"

    const-string v3, "Whether valueSnippet was truncated."

    const-string v4, "Direct referenced resource summary."

    .line 0
    invoke-static {v0, v2, v3, v1, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 7

    .line 520
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "0-based index matching the input reads[] item."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "index"

    .line 521
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "string"

    const-string v3, "Normalized resource locator string formatted as resource:0x plus 8 lowercase hex digits."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 522
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Actual public variant selected for this value."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "variant"

    .line 523
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Resource type name from the ARSC identity."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "type"

    .line 524
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Resource entry name from the ARSC identity."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "name"

    .line 525
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 526
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject$Member;

    .line 527
    invoke-virtual {v3}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_0
    const-string p0, "Version token of 16 lowercase hex digits for this exact resource id and variant; use it with mt_apk_resource_edit only when editable and complete valueXml are available."

    .line 96
    invoke-static {v2, p0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v3, "targetVersion"

    .line 529
    invoke-virtual {v0, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v3, "Complete editable single-entry resource XML when returned within maxValueXmlChars, or null. This is never a partial XML fragment."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "valueXml"

    .line 530
    invoke-virtual {p0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "Unicode code point count of complete valueXml when known, or null when unavailable."

    .line 117
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "valueXmlCharCount"

    .line 531
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "Whether complete valueXml exceeded maxValueXmlChars; valueXml is null when true."

    const-string v2, "boolean"

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "valueXmlTruncated"

    .line 532
    invoke-virtual {p0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "Whether this value can be edited when complete valueXml is available."

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editable"

    .line 533
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v5, "UNSUPPORTED_STYLED_TEXT_XML"

    const-string v6, "INVALID_VALUE_XML"

    const-string v1, "VALUE_XML_TRUNCATED"

    const-string v2, "VALUE_XML_TOO_LARGE"

    const-string v3, "VALUE_XML_UNAVAILABLE"

    const-string v4, "UNSUPPORTED_VALUE_XML"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "XML editability or truncation reason, or null."

    .line 534
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editableReason"

    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 537
    invoke-static {v0, p1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
