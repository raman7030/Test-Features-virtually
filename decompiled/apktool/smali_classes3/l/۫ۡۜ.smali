.class public final Ll/۫ۡۜ;
.super Ljava/lang/Object;
.source "J6YG"


# direct methods
.method public static ֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5

    const-string v0, "Relative path resolves outside the current Home folder."

    const-string v1, "FILE_RELATIVE_PATH_ESCAPES_HOME"

    if-eqz p1, :cond_6

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    .line 30
    :cond_0
    invoke-static {p1, p2}, Ll/۫ۡۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 31
    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_1

    const/4 p3, 0x1

    :cond_1
    if-eqz p3, :cond_2

    move-object v2, p1

    goto :goto_0

    .line 32
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    const-string v4, "/"

    .line 0
    invoke-static {v2, v3, v4, p1}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 35
    :goto_0
    :try_start_0
    invoke-static {v2, p2}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p3, :cond_4

    .line 43
    iget-object p0, p0, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    invoke-static {v2, p0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    .line 141
    :cond_3
    invoke-static {v1, v0, p2, p1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 44
    throw p0

    :cond_4
    :goto_1
    return-object v2

    :catch_0
    move-exception p0

    if-nez p3, :cond_5

    const-string p3, "FILE_INVALID_PATH"

    .line 38
    iget-object v2, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 141
    invoke-static {v1, v0, p2, p1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 39
    throw p0

    .line 41
    :cond_5
    throw p0

    :cond_6
    :goto_2
    if-eqz p3, :cond_7

    if-eqz p1, :cond_7

    .line 26
    iget-object p0, p0, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    return-object p0

    :cond_7
    const-string p0, "FILE_EMPTY_PATH_NOT_ALLOWED"

    const-string p3, "Path must not be empty."

    .line 28
    invoke-static {p0, p3, p2, p1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 132
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "argument"

    .line 133
    invoke-virtual {v0, v1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p3, :cond_0

    .line 134
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_0
    const-string v0, "path"

    invoke-virtual {p2, v0, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "fatal"

    const/4 v0, 0x0

    .line 130
    invoke-static {p0, p1, p3, v0, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 6

    .line 94
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 p0, 0x0

    if-nez v0, :cond_0

    return p0

    :cond_0
    const-string v1, "Android/data"

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "Android/data/"

    .line 99
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "/"

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_7

    .line 53
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_7

    .line 56
    invoke-static {p0, p1}, Ll/۫ۡۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v3, -0x1

    const-string v4, "/"

    .line 58
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 59
    array-length v5, v3

    :goto_0
    if-ge v0, v5, :cond_4

    aget-object v6, v3, v0

    .line 60
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    const-string v7, "."

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    const-string v7, ".."

    .line 63
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 67
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const-string v0, "FILE_INVALID_PATH"

    const-string v1, "Path escapes the filesystem root."

    .line 65
    invoke-static {v0, v1, p1, p0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 69
    :cond_2
    invoke-virtual {v1, v6}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 72
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 74
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 76
    :cond_5
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 77
    :goto_3
    invoke-static {v4}, Ll/ܿ֡ܿ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    const-string v0, "FILE_PATH_NOT_ABSOLUTE"

    const-string v1, "Path must be absolute."

    .line 54
    invoke-static {v0, v1, p1, p0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    .line 103
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_9

    const/16 v1, 0x5c

    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_9

    const/16 v1, 0x3a

    .line 112
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    if-ge v0, v1, :cond_8

    .line 117
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7a

    const/16 v4, 0x61

    const/16 v5, 0x5a

    const/16 v6, 0x41

    if-nez v0, :cond_2

    if-lt v2, v6, :cond_1

    if-le v2, v5, :cond_7

    :cond_1
    if-lt v2, v4, :cond_6

    if-gt v2, v3, :cond_6

    goto :goto_2

    :cond_2
    if-lt v2, v6, :cond_3

    if-le v2, v5, :cond_7

    :cond_3
    if-lt v2, v4, :cond_4

    if-le v2, v3, :cond_7

    :cond_4
    const/16 v3, 0x30

    if-lt v2, v3, :cond_5

    const/16 v3, 0x39

    if-le v2, v3, :cond_7

    :cond_5
    const/16 v3, 0x2b

    if-eq v2, v3, :cond_7

    const/16 v3, 0x2d

    if-eq v2, v3, :cond_7

    const/16 v3, 0x2e

    if-ne v2, v3, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    return-void

    :cond_7
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_8
    const-string v0, "FILE_URI_UNSUPPORTED"

    const-string v1, "URI paths are not supported."

    .line 107
    invoke-static {v0, v1, p1, p0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_9
    const-string v0, "FILE_INVALID_PATH"

    const-string v1, "Path contains an unsupported form."

    .line 104
    invoke-static {v0, v1, p1, p0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
