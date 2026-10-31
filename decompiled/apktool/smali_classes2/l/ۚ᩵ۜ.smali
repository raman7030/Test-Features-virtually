.class public final Ll/ۚ᩵ۜ;
.super Ljava/lang/Object;
.source "S6KS"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I
    .locals 1

    .line 51
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 53
    :try_start_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-static {p0}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-lt v0, p2, :cond_0

    if-gt v0, p3, :cond_0

    return v0

    :catch_0
    :cond_0
    const-string p2, "Integer is outside the allowed range"

    .line 59
    invoke-static {p0, p1, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 1

    .line 63
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 64
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "Expected a non-empty array"

    .line 65
    invoke-static {p0, p1, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;
    .locals 1

    if-eqz p1, :cond_0

    .line 71
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "Expected an object"

    .line 71
    invoke-static {p1, p0, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "warning"

    const/4 v1, 0x0

    .line 123
    invoke-static {p1, p2, v0, v1, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 119
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, p1, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳۖۜ;Ljava/lang/String;Z)Ll/۫᩵ܿ;
    .locals 3

    .line 101
    invoke-virtual {p0, p1}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    .line 103
    sget-object v1, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    const-string v2, "path"

    if-eq v0, v1, :cond_3

    .line 106
    sget-object v1, Ll/ۗ᩵ܿ;->᩶:Ll/ۗ᩵ܿ;

    if-eq v0, v1, :cond_2

    sget-object v1, Ll/ۗ᩵ܿ;->ۗ:Ll/ۗ᩵ܿ;

    if-eq v0, v1, :cond_2

    if-eqz p2, :cond_0

    .line 111
    sget-object p2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    goto :goto_0

    :cond_0
    sget-object p2, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    :goto_0
    if-ne v0, p2, :cond_1

    return-object p0

    .line 113
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "ZIP_PATH_TYPE_MISMATCH"

    const-string p2, "The path suffix does not match the source type"

    .line 112
    invoke-static {p0, p1, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 109
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_UNSUPPORTED_TYPE"

    const-string p2, "Links and special nodes cannot be used as ZIP content sources"

    const-string v0, "fatal"

    const/4 v1, 0x0

    .line 107
    invoke-static {p1, p2, v0, v1, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 104
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_NOT_FOUND"

    const-string p2, "The source path does not exist"

    invoke-static {p0, p1, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫()V
    .locals 3

    .line 129
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ZIP operation was cancelled"

    .line 130
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "ZIP_OPERATION_CANCELLED"

    invoke-static {v1, v2, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static varargs ֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V
    .locals 5

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 27
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 28
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 29
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string p1, "Unexpected or repeated argument"

    invoke-static {p0, v3, p1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 33
    :cond_1
    array-length p0, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p0, :cond_3

    aget-object v2, p1, v0

    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    const-string p1, "Missing argument"

    invoke-static {p0, v2, p1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_3
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_2

    .line 79
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string p2, "The ZIP root cannot be modified"

    invoke-static {p0, p1, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    const/16 p2, 0x5c

    .line 81
    invoke-virtual {p0, p2}, Ljava/lang/String;->indexOf(I)I

    move-result p2

    if-gez p2, :cond_7

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_7

    .line 85
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_2

    const/4 p2, 0x1

    :cond_2
    move v0, p2

    .line 86
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gt p2, v2, :cond_6

    .line 87
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p2, v2, :cond_3

    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v1, :cond_3

    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne p2, v2, :cond_4

    if-ne v0, p2, :cond_4

    goto :goto_2

    .line 89
    :cond_4
    invoke-virtual {p0, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    add-int/lit8 v0, p2, 0x1

    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 91
    :cond_5
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string p2, "ZIP path contains an empty segment"

    invoke-static {p0, p1, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_6
    :goto_2
    return-void

    .line 82
    :cond_7
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string p2, "Expected a ZIP entry name using forward slashes without NUL"

    invoke-static {p0, p1, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 46
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "Expected a boolean"

    .line 46
    invoke-static {p0, p1, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 39
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 40
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "Expected a string"

    .line 40
    invoke-static {p0, p1, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
