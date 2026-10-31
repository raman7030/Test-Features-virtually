.class public final Ll/ܿ֡ۢ;
.super Ljava/lang/Object;
.source "3786"


# direct methods
.method public static ֫(Lbin/mt/json/JSONValue;)Ljava/util/ArrayList;
    .locals 4

    if-eqz p0, :cond_3

    .line 179
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 182
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 183
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 184
    :goto_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 185
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 186
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 189
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    .line 190
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 193
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 191
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "absolute path required"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0

    .line 187
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "path string required"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0

    :cond_2
    return-object v0

    .line 180
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "array required"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method

.method public static ֫()Ljava/util/LinkedHashMap;
    .locals 3

    .line 129
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 130
    invoke-static {}, Ll/ܿۧ᩻;->ܽ()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "showSystemHiddenFiles"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    invoke-static {}, Ll/ܿۧ᩻;->ۧ()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "showManuallyHiddenFiles"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "manuallyHiddenFilesText"

    .line 132
    invoke-static {}, Ll/ܿۧ᩻;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 0

    .line 151
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 152
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 4

    .line 79
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 80
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 141
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    const v0, 0x7f12082b

    if-nez p1, :cond_1

    .line 84
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v2, "paths"

    .line 86
    invoke-static {p1, v2}, Ll/ܿ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 87
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v2, v0, v1

    const v1, 0x7f120827

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 92
    :cond_2
    :try_start_1
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {p1}, Ll/ܿ֡ۢ;->֫(Lbin/mt/json/JSONValue;)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 96
    invoke-static {p1}, Ll/ܿۧ᩻;->֫(Ljava/util/List;)V

    .line 97
    invoke-static {}, Ll/ܿ֡ۢ;->֫()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 94
    :catch_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 4

    .line 104
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 105
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 141
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    const v0, 0x7f12082b

    if-nez p1, :cond_1

    .line 109
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v2, "text"

    .line 111
    invoke-static {p1, v2}, Ll/ܿ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 112
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v2, v0, v1

    const v1, 0x7f120827

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 117
    :cond_2
    :try_start_1
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 169
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 172
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 121
    invoke-static {p1}, Ll/ܿۧ᩻;->ᩳ(Ljava/lang/String;)V

    .line 122
    invoke-static {}, Ll/ܿ֡ۢ;->֫()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 170
    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v2, "string required"

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 119
    :catch_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 7

    .line 42
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 43
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 141
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    const v0, 0x7f12082b

    if-nez p1, :cond_1

    .line 47
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v2, "showSystemHiddenFiles"

    .line 49
    invoke-static {p1, v2}, Ll/ܿ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    const v5, 0x7f120827

    if-eqz v3, :cond_2

    .line 50
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v2, v0, v1

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v3, "showManuallyHiddenFiles"

    .line 53
    invoke-static {p1, v3}, Ll/ܿ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 54
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v3, v0, v1

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 60
    :cond_3
    :try_start_1
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const-string v4, "boolean required"

    if-eqz v2, :cond_7

    .line 159
    :try_start_2
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 162
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v2

    .line 61
    invoke-virtual {p1, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 159
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 162
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 66
    invoke-static {}, Ll/ܿۧ᩻;->ܽ()Z

    move-result v0

    if-eq v0, v2, :cond_4

    .line 67
    invoke-static {v2}, Ll/ܿۧ᩻;->ۧ(Z)V

    .line 69
    :cond_4
    invoke-static {}, Ll/ܿۧ᩻;->ۧ()Z

    move-result v0

    if-eq v0, p1, :cond_5

    .line 70
    invoke-static {p1}, Ll/ܿۧ᩻;->֫(Z)V

    .line 72
    :cond_5
    invoke-static {}, Ll/ܿ֡ۢ;->֫()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 160
    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 63
    :catch_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 2

    .line 32
    sget-object v0, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 33
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v1, 0x7f120824

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 35
    :cond_0
    invoke-static {}, Ll/ܿ֡ۢ;->֫()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method
