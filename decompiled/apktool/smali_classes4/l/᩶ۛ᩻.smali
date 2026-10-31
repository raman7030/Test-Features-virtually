.class public final Ll/᩶ۛ᩻;
.super Ljava/lang/Object;
.source "V6WN"


# direct methods
.method public static ֫(C)C
    .locals 1

    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x61

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x5a

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, 0x20

    int-to-char p0, p0

    return p0

    .line 69
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    :cond_2
    :goto_0
    return p0
.end method

.method public static ֫(ILjava/lang/String;)I
    .locals 8

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p0, v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x0

    if-gez p0, :cond_1

    const/4 p0, 0x0

    :cond_1
    const-string v2, "E"

    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt p0, v0, :cond_5

    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v1}, Ll/᩶ۛ᩻;->֫(CC)Z

    move-result v3

    if-nez v3, :cond_2

    :goto_1
    add-int/lit8 p0, p0, 0x1

    if-gt p0, v0, :cond_2

    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v1}, Ll/᩶ۛ᩻;->֫(CC)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    if-gt p0, v0, :cond_4

    add-int/lit8 v3, p0, 0x1

    add-int/lit8 v4, p0, 0x1

    const/4 v5, 0x1

    :goto_2
    if-ge v3, v4, :cond_3

    .line 41
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v6, v7}, Ll/᩶ۛ᩻;->֫(CC)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    if-ne v3, v4, :cond_4

    return p0

    :cond_4
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_5
    :goto_3
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;)Landroid/content/pm/Signature;
    .locals 5

    const/4 v0, 0x0

    .line 15
    :try_start_0
    new-instance v1, Ll/ᩳܰۡ;

    invoke-direct {v1, p0}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 16
    :try_start_1
    invoke-virtual {v1}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 17
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "META-INF/"

    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v4, ".RSA"

    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, ".DSA"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, ".EC"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1757
    :cond_2
    invoke-virtual {v1, v2, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object p0

    .line 22
    new-instance v2, Ll/ᩳܳᩳ;

    invoke-direct {v2, p0}, Ll/ᩳܳᩳ;-><init>([B)V

    .line 23
    invoke-virtual {v2}, Ll/ᩳܳᩳ;->֫()[Ljava/security/cert/X509Certificate;

    move-result-object p0

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object p0

    .line 24
    new-instance v2, Landroid/content/pm/Signature;

    invoke-direct {v2, p0}, Landroid/content/pm/Signature;-><init>([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    :try_start_2
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V

    return-object v2

    :cond_3
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-object v0

    :catchall_0
    move-exception p0

    .line 15
    :try_start_3
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 24
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ok"

    const/4 v2, 0x1

    .line 25
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "data"

    .line 26
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "error"

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 27
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "nextActions"

    .line 28
    invoke-static {p1}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 17
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iget-object v1, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {p0, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 35
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "code"

    iget-object v2, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    .line 36
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "message"

    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "severity"

    iget-object v2, p0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    .line 38
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "recoverable"

    iget-boolean v2, p0, Ll/ۗۛ᩻;->۫:Z

    .line 39
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "retrySameArguments"

    iget-boolean v2, p0, Ll/ۗۛ᩻;->ۤ:Z

    .line 40
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "argument"

    .line 0
    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "badValue"

    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 42
    iget-object p0, p0, Ll/ۗۛ᩻;->۬:Lbin/mt/json/JSONValue;

    const-string v2, "null"

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object p0, v2

    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string p0, "string"

    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string p0, "number"

    goto :goto_0

    .line 100
    :cond_3
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_4

    const-string p0, "boolean"

    goto :goto_0

    .line 102
    :cond_4
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v3

    if-eqz v3, :cond_5

    const-string p0, "array"

    goto :goto_0

    .line 104
    :cond_5
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "object"

    goto :goto_0

    :cond_6
    const-string p0, "unknown"

    :goto_0
    const-string v3, "badValueType"

    .line 43
    invoke-virtual {v0, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "allowedValues"

    .line 44
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 58
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    if-nez v3, :cond_7

    goto :goto_2

    .line 62
    :cond_7
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONValue;

    .line 63
    invoke-static {v5}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    move-object v5, v2

    .line 64
    :cond_8
    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 44
    :cond_9
    :goto_2
    invoke-virtual {p0, v0, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "example"

    .line 0
    invoke-static {v1, v0, p0, v0}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-nez p1, :cond_a

    .line 46
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :cond_a
    const-string v0, "diagnostics"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 47
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "ok"

    const/4 v1, 0x0

    .line 48
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "data"

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 49
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "error"

    .line 50
    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "nextActions"

    .line 51
    invoke-static {p2}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۛۜۜ;)Lbin/mt/json/JSONObject;
    .locals 14

    .line 55
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 56
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 57
    iget-object v2, p0, Ll/ۛۜۜ;->ۧ:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۛۜۜ;->֫:Ljava/lang/String;

    iget-object p0, p0, Ll/ۛۜۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤۜۜ;

    .line 58
    iget-object v5, v4, Ll/ۤۜۜ;->ۧ:Ljava/lang/String;

    const-string v6, "resource:"

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 59
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 60
    iget-object v7, v4, Ll/ۤۜۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "locator"

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۨۜۜ;

    .line 61
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    iget-object v11, v8, Ll/ۨۜۜ;->ۧ:Ljava/lang/String;

    const-string v12, "variant"

    invoke-virtual {v10, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "targetVersion"

    iget-object v13, v8, Ll/ۨۜۜ;->֫:Ljava/lang/String;

    invoke-virtual {v10, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    invoke-virtual {v6, v10}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 62
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    invoke-virtual {v10, v9, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v8, v8, Ll/ۨۜۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v9, v12, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v1, v8}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 64
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "index"

    iget v4, v4, Ll/ۤۜۜ;->֫:I

    invoke-virtual {v7, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4, v9, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "values"

    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    const-string v2, "workspaceId"

    const-string v4, "editSessionId"

    .line 0
    invoke-static {v2, p0, v4, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "reads"

    .line 67
    invoke-virtual {v5, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "maxValueChars"

    const/16 v6, 0x1000

    .line 68
    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "maxValueXmlChars"

    const v6, 0x8000

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "maxItemsPerValue"

    const/16 v6, 0x32

    .line 69
    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "resolveDepth"

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 0
    invoke-static {v2, p0, v4, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "results"

    .line 71
    invoke-virtual {p0, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 72
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v2, "inspect"

    const-string v3, "Read the newly added resource values"

    const-string v4, "mt_apk_resource_read"

    invoke-static {v1, v4, v2, v3}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 70
    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(CC)Z
    .locals 3

    const/16 v0, 0x7a

    const/16 v1, 0x61

    if-ge p0, v1, :cond_0

    move v2, p0

    goto :goto_0

    :cond_0
    if-gt p0, v0, :cond_1

    add-int/lit8 v2, p0, -0x20

    int-to-char v2, v2

    goto :goto_0

    .line 63
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    :goto_0
    if-ge p1, v1, :cond_2

    move v0, p1

    goto :goto_1

    :cond_2
    if-gt p1, v0, :cond_3

    add-int/lit8 v0, p1, -0x20

    int-to-char v0, v0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    :goto_1
    if-eq v2, v0, :cond_5

    .line 57
    invoke-static {p0}, Ll/᩶ۛ᩻;->֫(C)C

    move-result p0

    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(C)C

    move-result p1

    if-ne p0, p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(I)Z
    .locals 2

    const/16 v0, 0x41

    if-gt v0, p0, :cond_0

    const/16 v0, 0x5a

    if-le p0, v0, :cond_9

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x7a

    if-le p0, v0, :cond_9

    :cond_1
    const/16 v0, 0x30

    if-gt v0, p0, :cond_2

    const/16 v0, 0x39

    if-le p0, v0, :cond_9

    :cond_2
    const/16 v0, 0x24

    if-eq p0, v0, :cond_9

    const/16 v0, 0x2d

    if-eq p0, v0, :cond_9

    const/16 v0, 0x5f

    if-eq p0, v0, :cond_9

    const/16 v0, 0xa1

    if-gt v0, p0, :cond_3

    const/16 v0, 0x1fff

    if-le p0, v0, :cond_9

    :cond_3
    const/16 v0, 0x2010

    if-gt v0, p0, :cond_4

    const/16 v0, 0x2027

    if-le p0, v0, :cond_9

    :cond_4
    const/16 v0, 0x2030

    if-gt v0, p0, :cond_5

    const v0, 0xd7ff

    if-le p0, v0, :cond_9

    :cond_5
    const v0, 0xe000

    const v1, 0xfeff

    if-gt v0, p0, :cond_6

    if-lt p0, v1, :cond_9

    :cond_6
    if-ge v1, p0, :cond_7

    const v0, 0xffef

    if-le p0, v0, :cond_9

    :cond_7
    const/high16 v0, 0x10000

    if-gt v0, p0, :cond_8

    const v0, 0x10ffff

    if-gt p0, v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 p0, 0x0

    return p0

    :cond_9
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string p0, "Unknown"

    return-object p0

    :pswitch_1
    const-string p0, "undefined"

    return-object p0

    :pswitch_2
    const-string p0, "TreeSet"

    return-object p0

    :pswitch_3
    const-string p0, "Set"

    return-object p0

    :pswitch_4
    const-string p0, "EOF"

    return-object p0

    :pswitch_5
    const-string p0, "ident"

    return-object p0

    :pswitch_6
    const-string p0, ":"

    return-object p0

    :pswitch_7
    const-string p0, ","

    return-object p0

    :pswitch_8
    const-string p0, "]"

    return-object p0

    :pswitch_9
    const-string p0, "["

    return-object p0

    :pswitch_a
    const-string p0, "}"

    return-object p0

    :pswitch_b
    const-string p0, "{"

    return-object p0

    :pswitch_c
    const-string p0, ")"

    return-object p0

    :pswitch_d
    const-string p0, "("

    return-object p0

    :pswitch_e
    const-string p0, "new"

    return-object p0

    :pswitch_f
    const-string p0, "null"

    return-object p0

    :pswitch_10
    const-string p0, "false"

    return-object p0

    :pswitch_11
    const-string p0, "true"

    return-object p0

    :pswitch_12
    const-string p0, "iso8601"

    return-object p0

    :pswitch_13
    const-string p0, "string"

    return-object p0

    :pswitch_14
    const-string p0, "float"

    return-object p0

    :pswitch_15
    const-string p0, "int"

    return-object p0

    :pswitch_16
    const-string p0, "error"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
