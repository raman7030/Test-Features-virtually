.class public final Ll/ۢۡۜ;
.super Ljava/lang/Object;
.source "F6Y2"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 135
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 136
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 139
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 137
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid cursor string field"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;ZILjava/lang/String;Ll/᩷ۡۜ;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 40
    invoke-virtual {p5}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "mcp-file-list-v2"

    goto :goto_0

    :cond_0
    const-string v1, "mcp-file-search-v1"

    :goto_0
    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "directoryPath"

    .line 41
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "recursive"

    .line 42
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limit"

    .line 43
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "order"

    const-string p2, "normalized-name-asc-depth-first-v1"

    .line 44
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "policyRevision"

    .line 45
    invoke-virtual {p0, p1, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "lastPath"

    iget-object p2, p4, Ll/᩷ۡۜ;->֫:Ljava/lang/String;

    .line 46
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "traversalId"

    iget-object p2, p4, Ll/᩷ۡۜ;->ۧ:Ljava/lang/String;

    .line 47
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 48
    invoke-virtual {p5}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "queryKey"

    .line 49
    invoke-virtual {p0, p1, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 51
    :cond_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 52
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p3, 0xb

    invoke-static {p0, p3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-static {p1, p3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    .line 159
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "operation"

    const-string v2, "list_cursor"

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz p0, :cond_0

    const-string v1, "path"

    .line 161
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_0
    if-eqz p1, :cond_1

    const-string p0, "policyRevision"

    .line 164
    invoke-virtual {v0, p0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_1
    const-string p0, "warning"

    const/4 p1, 0x0

    const-string v1, "FILE_INVALID_CURSOR"

    const-string v2, "The file cursor is invalid or no longer matches this request. Restart the traversal with cursor=\"\"."

    .line 166
    invoke-static {v1, v2, p0, p1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;)Ll/᩷ۡۜ;
    .locals 4

    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    new-instance p0, Ll/᩷ۡۜ;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, ""

    invoke-direct {p0, p2, p1}, Ll/᩷ۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    .line 69
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/high16 v1, 0x10000

    if-gt v0, v1, :cond_d

    const/16 v0, 0x2e

    .line 73
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-lez v1, :cond_c

    .line 74
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ne v1, v0, :cond_c

    .line 75
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq v1, v0, :cond_c

    const/4 v0, 0x0

    .line 78
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xb

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 79
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 80
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    .line 81
    invoke-static {v1, p0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p0

    if-eqz p0, :cond_b

    .line 84
    new-instance p0, Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {p0}, Lbin/mt/json/JSON;->parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 85
    invoke-virtual {p5}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {p0, p1, p4, v1}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 86
    invoke-virtual {p5}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "mcp-file-list-v2"

    goto :goto_0

    :cond_1
    const-string v1, "mcp-file-search-v1"

    :goto_0
    const-string v2, "version"

    invoke-static {p0, v2}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 87
    invoke-virtual {p5}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "queryKey"

    invoke-static {p0, v1}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_a

    :cond_2
    const-string p5, "directoryPath"

    .line 88
    invoke-static {p0, p5}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_a

    const-string p5, "recursive"

    .line 143
    invoke-virtual {p0, p5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p5

    if-eqz p5, :cond_9

    .line 144
    invoke-virtual {p5}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 147
    invoke-virtual {p5}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p5

    if-ne p2, p5, :cond_a

    const-string p5, "limit"

    .line 151
    invoke-virtual {p0, p5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p5

    if-eqz p5, :cond_8

    .line 152
    invoke-virtual {p5}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 155
    invoke-virtual {p5}, Lbin/mt/json/JSONValue;->asInt()I

    move-result p5

    if-ne p3, p5, :cond_a

    const-string p3, "normalized-name-asc-depth-first-v1"

    const-string p5, "order"

    .line 91
    invoke-static {p0, p5}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    const-string p3, "policyRevision"

    .line 92
    invoke-static {p0, p3}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    const-string p3, "lastPath"

    .line 95
    invoke-static {p0, p3}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string p5, "traversalId"

    .line 96
    invoke-static {p0, p5}, Ll/ۢۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 97
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p5

    if-nez p5, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p5

    if-nez p5, :cond_7

    const-string p5, "/"

    const/4 v1, -0x1

    .line 100
    invoke-virtual {p3, p5, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p5

    array-length v1, p5

    :goto_1
    if-ge v0, v1, :cond_4

    aget-object v2, p5, v0

    .line 101
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, ".."

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 102
    :cond_3
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_4
    if-nez p2, :cond_6

    const/16 p2, 0x2f

    .line 105
    invoke-virtual {p3, p2}, Ljava/lang/String;->indexOf(I)I

    move-result p2

    if-gez p2, :cond_5

    goto :goto_2

    .line 106
    :cond_5
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 108
    :cond_6
    :goto_2
    new-instance p2, Ll/᩷ۡۜ;

    invoke-direct {p2, p3, p0}, Ll/᩷ۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 98
    :cond_7
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 153
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid cursor integer field"

    invoke-direct {p0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 145
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid cursor boolean field"

    invoke-direct {p0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 93
    :cond_a
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 82
    :cond_b
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 76
    :cond_c
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    :catch_0
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 110
    throw p0

    .line 70
    :cond_d
    invoke-static {p1, p4}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 118
    new-instance v0, Ljava/util/LinkedHashSet;

    const/16 v1, 0x8

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "version"

    aput-object v4, v2, v3

    const-string v4, "directoryPath"

    const/4 v5, 0x1

    aput-object v4, v2, v5

    const-string v4, "recursive"

    const/4 v5, 0x2

    aput-object v4, v2, v5

    const-string v4, "limit"

    const/4 v5, 0x3

    aput-object v4, v2, v5

    const-string v4, "order"

    const/4 v5, 0x4

    aput-object v4, v2, v5

    const-string v4, "policyRevision"

    const/4 v5, 0x5

    aput-object v4, v2, v5

    const-string v4, "lastPath"

    const/4 v5, 0x6

    aput-object v4, v2, v5

    const-string v4, "traversalId"

    const/4 v5, 0x7

    aput-object v4, v2, v5

    .line 0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v2, v3

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "duplicate element: "

    invoke-static {v5, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {v4}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 118
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    if-eqz p3, :cond_2

    const-string p3, "queryKey"

    .line 121
    invoke-interface {v0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 123
    :cond_2
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 124
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 125
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 126
    :cond_3
    invoke-static {p1, p2}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 129
    :cond_4
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    return-void

    .line 130
    :cond_5
    invoke-static {p1, p2}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
