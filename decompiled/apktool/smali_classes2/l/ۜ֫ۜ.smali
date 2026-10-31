.class public final Ll/ۜ֫ۜ;
.super Ljava/lang/Object;
.source "C74Z"


# direct methods
.method public static ֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 3

    .line 402
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    if-nez p0, :cond_0

    goto :goto_1

    .line 406
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 407
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 408
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ֫(Ll/۠۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 8

    .line 243
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 244
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    const-string v4, "thumb"

    .line 342
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Retry patch as Thumb"

    goto :goto_1

    :cond_0
    const-string v4, "arm"

    .line 345
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "Retry patch as ARM"

    goto :goto_1

    :cond_1
    const-string v4, "Retry patch with instructionMode=auto"

    .line 294
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "workspaceId"

    iget-object v7, p0, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    .line 295
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "editSessionId"

    iget-object v7, p0, Ll/۠۟᩻;->ᩳ:Ljava/lang/String;

    .line 296
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "locator"

    iget-object v7, p0, Ll/۠۟᩻;->᩷:Ljava/lang/String;

    .line 297
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "addressKind"

    iget-object v7, p0, Ll/۠۟᩻;->ܽ:Ljava/lang/String;

    .line 298
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "address"

    iget-object v7, p0, Ll/۠۟᩻;->ۧ:Ljava/lang/String;

    .line 299
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "instructionMode"

    .line 300
    invoke-virtual {v5, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "expectedHex"

    iget-object v6, p0, Ll/۠۟᩻;->᩻:Ljava/lang/String;

    .line 301
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "replacementAssembly"

    iget-object v6, p0, Ll/۠۟᩻;->ۡ:Ljava/lang/String;

    .line 302
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "paddingMode"

    iget-object v6, p0, Ll/۠۟᩻;->ۢ:Ljava/lang/String;

    .line 303
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_native_patch_instructions"

    const-string v6, "retry"

    .line 245
    invoke-static {v3, v5, v6, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ֫(Ll/ᩴ۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 8

    .line 222
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 223
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    const-string v4, "thumb"

    .line 322
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Retry as Thumb"

    goto :goto_1

    :cond_0
    const-string v4, "arm"

    .line 325
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "Retry as ARM"

    goto :goto_1

    :cond_1
    const-string v4, "Retry with instructionMode=auto"

    .line 265
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "workspaceId"

    iget-object v7, p0, Ll/ᩴ۟᩻;->ۡ:Ljava/lang/String;

    .line 266
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "editSessionId"

    iget-object v7, p0, Ll/ᩴ۟᩻;->ᩳ:Ljava/lang/String;

    .line 267
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "locator"

    iget-object v7, p0, Ll/ᩴ۟᩻;->᩻:Ljava/lang/String;

    .line 268
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "addressKind"

    iget-object v7, p0, Ll/ᩴ۟᩻;->ܽ:Ljava/lang/String;

    .line 269
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "address"

    iget-object v7, p0, Ll/ᩴ۟᩻;->ۧ:Ljava/lang/String;

    .line 270
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "instructionMode"

    .line 271
    invoke-virtual {v5, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "stopAtSymbolBoundary"

    iget-boolean v6, p0, Ll/ᩴ۟᩻;->ۢ:Z

    .line 272
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "maxBytes"

    iget v6, p0, Ll/ᩴ۟᩻;->ۜ:I

    .line 273
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "maxInstructions"

    iget v6, p0, Ll/ᩴ۟᩻;->᩷:I

    .line 274
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_native_disassemble"

    const-string v6, "retry"

    .line 224
    invoke-static {v3, v5, v6, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ֫(Ll/᩵۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 8

    .line 254
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 255
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    const-string v4, "thumb"

    .line 352
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Retry function CFG as Thumb; this new graph replaces the previous result"

    goto :goto_1

    :cond_0
    const-string v4, "arm"

    .line 355
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "Retry function CFG as ARM; this new graph replaces the previous result"

    goto :goto_1

    :cond_1
    const-string v4, "Retry function CFG with instructionMode=auto; this new graph replaces the previous result"

    .line 308
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "workspaceId"

    iget-object v7, p0, Ll/᩵۟᩻;->ܺ:Ljava/lang/String;

    .line 309
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "editSessionId"

    iget-object v7, p0, Ll/᩵۟᩻;->ᩳ:Ljava/lang/String;

    .line 310
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "locator"

    iget-object v7, p0, Ll/᩵۟᩻;->᩻:Ljava/lang/String;

    .line 311
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "addressKind"

    iget-object v7, p0, Ll/᩵۟᩻;->ܽ:Ljava/lang/String;

    .line 312
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "address"

    iget-object v7, p0, Ll/᩵۟᩻;->ۧ:Ljava/lang/String;

    .line 313
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "instructionMode"

    .line 314
    invoke-virtual {v5, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "outputMode"

    iget-object v6, p0, Ll/᩵۟᩻;->ۡ:Ljava/lang/String;

    .line 315
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "maxAnalysisBytes"

    iget v6, p0, Ll/᩵۟᩻;->ۜ:I

    .line 316
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "maxBlocks"

    iget v6, p0, Ll/᩵۟᩻;->᩷:I

    .line 317
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "maxInstructions"

    iget v6, p0, Ll/᩵۟᩻;->ۢ:I

    .line 318
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_native_analyze_control_flow"

    const-string v6, "retry"

    .line 256
    invoke-static {v3, v5, v6, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ֫(Ll/᩹۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 8

    .line 232
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 233
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, p1, v2

    const-string v4, "thumb"

    .line 332
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Retry xref as Thumb"

    goto :goto_1

    :cond_0
    const-string v4, "arm"

    .line 335
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "Retry xref as ARM"

    goto :goto_1

    :cond_1
    const-string v4, "Retry xref with instructionMode=auto"

    .line 279
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "workspaceId"

    iget-object v7, p0, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    .line 280
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "editSessionId"

    iget-object v7, p0, Ll/᩹۟᩻;->᩷:Ljava/lang/String;

    .line 281
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "locator"

    iget-object v7, p0, Ll/᩹۟᩻;->ۖ:Ljava/lang/String;

    .line 282
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "addressKind"

    iget-object v7, p0, Ll/᩹۟᩻;->ܽ:Ljava/lang/String;

    .line 283
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "address"

    iget-object v7, p0, Ll/᩹۟᩻;->ۧ:Ljava/lang/String;

    .line 284
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "instructionMode"

    .line 285
    invoke-virtual {v5, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "scanKind"

    iget-object v6, p0, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    .line 286
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v5, p0, Ll/᩹۟᩻;->ۚ:Ljava/util/List;

    .line 383
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    if-nez v5, :cond_2

    goto :goto_3

    .line 387
    :cond_2
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 388
    invoke-virtual {v6, v7}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_2

    :cond_3
    :goto_3
    const-string v5, "referenceKinds"

    .line 287
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "maxScanBytes"

    iget v6, p0, Ll/᩹۟᩻;->ۘ:I

    .line 288
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "limit"

    iget v6, p0, Ll/᩹۟᩻;->ܺ:I

    .line 289
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_native_xref"

    const-string v6, "retry"

    .line 234
    invoke-static {v3, v5, v6, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_4
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "locator"

    .line 211
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "addressKind"

    .line 212
    invoke-virtual {p0, p1, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "address"

    .line 213
    invoke-virtual {p0, p1, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "instructionMode"

    .line 214
    invoke-virtual {p0, p1, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "reason"

    .line 215
    invoke-virtual {p0, p1, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "addressModeHint"

    .line 216
    invoke-virtual {p0, p1, p7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 394
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 395
    array-length p2, p8

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_0

    aget-object p4, p8, p3

    .line 396
    invoke-virtual {p1, p4}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    const-string p2, "retryInstructionModes"

    .line 217
    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 142
    iget-object p0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 143
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    .line 144
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    .line 145
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    .line 146
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "addressKind"

    .line 147
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "address"

    .line 148
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "instructionMode"

    .line 149
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "reason"

    .line 374
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 150
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "addressModeHint"

    .line 151
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "retryInstructionModes"

    .line 152
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {p0}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩹۟᩻;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 9

    .line 182
    iget-object v0, p0, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    iget-object v1, p0, Ll/᩹۟᩻;->᩷:Ljava/lang/String;

    iget-object v2, p0, Ll/᩹۟᩻;->ۖ:Ljava/lang/String;

    iget-object v3, p0, Ll/᩹۟᩻;->ܽ:Ljava/lang/String;

    iget-object v4, p0, Ll/᩹۟᩻;->ۧ:Ljava/lang/String;

    iget-object v5, p0, Ll/᩹۟᩻;->ۡ:Ljava/lang/String;

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-static/range {v0 .. v8}, Ll/ۜ֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "scanKind"

    iget-object p3, p0, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    .line 185
    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    iget-object p0, p0, Ll/᩹۟᩻;->ۚ:Ljava/util/List;

    .line 383
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    if-nez p0, :cond_0

    goto :goto_1

    .line 387
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 388
    invoke-virtual {p2, p3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    :goto_1
    const-string p0, "referenceKinds"

    .line 186
    invoke-virtual {p1, p0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 378
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 379
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ll/۠۟᩻;)Ll/ۗۛ᩻;
    .locals 11

    const-string v0, "thumb"

    const-string v1, "arm"

    .line 59
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v10

    .line 64
    invoke-static {p0, v10}, Ll/ۜ֫ۜ;->֫(Ll/۠۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 192
    iget-object v2, p0, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    iget-object v3, p0, Ll/۠۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v4, p0, Ll/۠۟᩻;->᩷:Ljava/lang/String;

    iget-object v5, p0, Ll/۠۟᩻;->ܽ:Ljava/lang/String;

    iget-object v6, p0, Ll/۠۟᩻;->ۧ:Ljava/lang/String;

    iget-object v7, p0, Ll/۠۟᩻;->ۜ:Ljava/lang/String;

    const-string v8, "arm32_mode_required"

    const-string v9, "ARM32 file/even address does not identify ARM or Thumb"

    invoke-static/range {v2 .. v10}, Ll/ۜ֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "NATIVE_INSTRUCTION_MODE_REQUIRED"

    const-string v2, "ARM ELF instruction patch requires instructionMode=arm or instructionMode=thumb."

    const-string v3, "fatal"

    .line 61
    invoke-static {v1, v2, v3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴ۟᩻;)Ll/ۗۛ᩻;
    .locals 11

    const-string v0, "thumb"

    const-string v1, "arm"

    .line 32
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v10

    .line 37
    invoke-static {p0, v10}, Ll/ۜ֫ۜ;->֫(Ll/ᩴ۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 175
    iget-object v2, p0, Ll/ᩴ۟᩻;->ۡ:Ljava/lang/String;

    iget-object v3, p0, Ll/ᩴ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v4, p0, Ll/ᩴ۟᩻;->᩻:Ljava/lang/String;

    iget-object v5, p0, Ll/ᩴ۟᩻;->ܽ:Ljava/lang/String;

    iget-object v6, p0, Ll/ᩴ۟᩻;->ۧ:Ljava/lang/String;

    iget-object v7, p0, Ll/ᩴ۟᩻;->ܳ:Ljava/lang/String;

    const-string v8, "arm32_mode_required"

    const-string v9, "ARM32 file/even address does not identify ARM or Thumb"

    invoke-static/range {v2 .. v10}, Ll/ۜ֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "NATIVE_INSTRUCTION_MODE_REQUIRED"

    const-string v2, "ARM ELF disassembly requires instructionMode=arm or instructionMode=thumb."

    const-string v3, "fatal"

    .line 34
    invoke-static {v1, v2, v3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩵۟᩻;)Ll/ۗۛ᩻;
    .locals 11

    const-string v0, "thumb"

    const-string v1, "arm"

    .line 86
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v10

    .line 91
    invoke-static {p0, v10}, Ll/ۜ֫ۜ;->֫(Ll/᩵۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 200
    iget-object v2, p0, Ll/᩵۟᩻;->ܺ:Ljava/lang/String;

    iget-object v3, p0, Ll/᩵۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v4, p0, Ll/᩵۟᩻;->᩻:Ljava/lang/String;

    iget-object v5, p0, Ll/᩵۟᩻;->ܽ:Ljava/lang/String;

    iget-object v6, p0, Ll/᩵۟᩻;->ۧ:Ljava/lang/String;

    iget-object v7, p0, Ll/᩵۟᩻;->ܳ:Ljava/lang/String;

    const-string v8, "arm32_mode_required"

    const-string v9, "ARM32 file/even address does not identify ARM or Thumb"

    invoke-static/range {v2 .. v10}, Ll/ۜ֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "NATIVE_INSTRUCTION_MODE_REQUIRED"

    const-string v2, "ARM ELF function CFG requires instructionMode=arm or instructionMode=thumb."

    const-string v3, "fatal"

    .line 88
    invoke-static {v1, v2, v3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩹۟᩻;)Ll/ۗۛ᩻;
    .locals 6

    const-string v0, "auto"

    .line 127
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    .line 128
    iget-object v2, p0, Ll/᩹۟᩻;->ۡ:Ljava/lang/String;

    .line 130
    invoke-static {v2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    .line 131
    invoke-static {v3}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 132
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "instructionMode"

    invoke-virtual {v4, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "instructionMode must be auto for scanKind=data"

    .line 128
    invoke-static {v4, v5, v2, v3, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 133
    iget-object v2, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v3, "data_scan_requires_auto"

    const-string v4, "data scan does not decode instructions"

    invoke-static {p0, v3, v4, v1}, Ll/ۜ֫ۜ;->֫(Ll/᩹۟᩻;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 368
    invoke-virtual {v3}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONObject$Member;

    .line 369
    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    .line 135
    :cond_0
    invoke-static {p0, v1}, Ll/ۜ֫ۜ;->֫(Ll/᩹۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/۠۟᩻;)Ll/ۗۛ᩻;
    .locals 10

    const-string v0, "thumb"

    .line 73
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v9

    .line 77
    invoke-static {p0, v9}, Ll/ۜ֫ۜ;->֫(Ll/۠۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 192
    iget-object v1, p0, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    iget-object v2, p0, Ll/۠۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v3, p0, Ll/۠۟᩻;->᩷:Ljava/lang/String;

    iget-object v4, p0, Ll/۠۟᩻;->ܽ:Ljava/lang/String;

    iget-object v5, p0, Ll/۠۟᩻;->ۧ:Ljava/lang/String;

    iget-object v6, p0, Ll/۠۟᩻;->ۜ:Ljava/lang/String;

    const-string v7, "arm32_thumb_address_conflict"

    const-string v8, "odd virtual address indicates Thumb T-bit"

    invoke-static/range {v1 .. v9}, Ll/ۜ֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT"

    const-string v2, "ARM instruction mode conflicts with odd Thumb address."

    const-string v3, "fatal"

    .line 74
    invoke-static {v1, v2, v3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ᩴ۟᩻;)Ll/ۗۛ᩻;
    .locals 10

    const-string v0, "thumb"

    .line 46
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v9

    .line 50
    invoke-static {p0, v9}, Ll/ۜ֫ۜ;->֫(Ll/ᩴ۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 175
    iget-object v1, p0, Ll/ᩴ۟᩻;->ۡ:Ljava/lang/String;

    iget-object v2, p0, Ll/ᩴ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v3, p0, Ll/ᩴ۟᩻;->᩻:Ljava/lang/String;

    iget-object v4, p0, Ll/ᩴ۟᩻;->ܽ:Ljava/lang/String;

    iget-object v5, p0, Ll/ᩴ۟᩻;->ۧ:Ljava/lang/String;

    iget-object v6, p0, Ll/ᩴ۟᩻;->ܳ:Ljava/lang/String;

    const-string v7, "arm32_thumb_address_conflict"

    const-string v8, "odd virtual address indicates Thumb T-bit"

    invoke-static/range {v1 .. v9}, Ll/ۜ֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT"

    const-string v2, "ARM instruction mode conflicts with odd Thumb address."

    const-string v3, "fatal"

    .line 47
    invoke-static {v1, v2, v3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩵۟᩻;)Ll/ۗۛ᩻;
    .locals 10

    const-string v0, "thumb"

    .line 100
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v9

    .line 104
    invoke-static {p0, v9}, Ll/ۜ֫ۜ;->֫(Ll/᩵۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 200
    iget-object v1, p0, Ll/᩵۟᩻;->ܺ:Ljava/lang/String;

    iget-object v2, p0, Ll/᩵۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v3, p0, Ll/᩵۟᩻;->᩻:Ljava/lang/String;

    iget-object v4, p0, Ll/᩵۟᩻;->ܽ:Ljava/lang/String;

    iget-object v5, p0, Ll/᩵۟᩻;->ۧ:Ljava/lang/String;

    iget-object v6, p0, Ll/᩵۟᩻;->ܳ:Ljava/lang/String;

    const-string v7, "arm32_thumb_address_conflict"

    const-string v8, "odd virtual address indicates Thumb T-bit"

    invoke-static/range {v1 .. v9}, Ll/ۜ֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT"

    const-string v2, "ARM instruction mode conflicts with odd Thumb address."

    const-string v3, "fatal"

    .line 101
    invoke-static {v1, v2, v3, v0, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩹۟᩻;)Ll/ۗۛ᩻;
    .locals 7

    const-string v0, "thumb"

    const-string v1, "arm"

    .line 113
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 118
    invoke-static {p0, v0}, Ll/ۜ֫ۜ;->֫(Ll/᩹۟᩻;[Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "virtual"

    .line 362
    iget-object v3, p0, Ll/᩹۟᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Ll/᩹۟᩻;->֫:J

    const-wide/16 v4, 0x1

    and-long/2addr v2, v4

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    const-string v2, "odd target virtual address does not identify source instruction mode"

    goto :goto_0

    :cond_0
    const-string v2, "ARM32 file/even address does not identify ARM or Thumb"

    :goto_0
    const-string v3, "arm32_mode_required"

    .line 119
    invoke-static {p0, v3, v2, v0}, Ll/ۜ֫ۜ;->֫(Ll/᩹۟᩻;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "NATIVE_INSTRUCTION_MODE_REQUIRED"

    const-string v2, "ARM ELF xref scan requires instructionMode=thumb or instructionMode=arm."

    const-string v3, "fatal"

    .line 115
    invoke-static {v0, v2, v3, v1, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۗۛ᩻;)Z
    .locals 1

    .line 169
    iget-object p0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v0, "reason"

    invoke-static {p0, v0}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ܽ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 159
    iget-object v0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 160
    invoke-static {p0}, Ll/ۜ֫ۜ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "scanKind"

    .line 161
    invoke-static {v0, v1}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "referenceKinds"

    .line 162
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ֫ۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
