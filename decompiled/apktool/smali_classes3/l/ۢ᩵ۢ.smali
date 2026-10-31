.class public final Ll/ۢ᩵ۢ;
.super Ljava/lang/Object;
.source "S77A"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 6

    .line 108
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "path"

    .line 109
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 118
    invoke-static {p0}, Ll/ܺ᩵ۢ;->֫(Ljava/lang/String;)Ll/ۡ᩵ۢ;

    move-result-object p0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 119
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "enabled"

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p0, :cond_1

    .line 31
    new-instance p0, Ll/ۡ᩵ۢ;

    invoke-direct {p0, v2, v2}, Ll/ۡ᩵ۢ;-><init>(IZ)V

    .line 123
    :cond_1
    iget v2, p0, Ll/ۡ᩵ۢ;->֫:I

    const-string v4, "name"

    if-eqz v2, :cond_5

    if-eq v2, v3, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "type"

    goto :goto_1

    :cond_3
    const-string v4, "size"

    goto :goto_1

    :cond_4
    const-string v4, "date"

    :cond_5
    :goto_1
    const-string v2, "method"

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-boolean p0, p0, Ll/ۡ᩵ۢ;->ۧ:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v2, "reverse"

    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "folder"

    .line 110
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 0

    .line 129
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 130
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
    .locals 11

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

    .line 119
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
    const-string v2, "path"

    .line 49
    invoke-static {p1, v2}, Ll/ۢ᩵ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

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
    const-string v3, "enabled"

    .line 53
    invoke-static {p1, v3}, Ll/ۢ᩵ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

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

    .line 61
    :cond_3
    :try_start_1
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3

    const-string v6, "string required"

    if-eqz v2, :cond_b

    .line 137
    :try_start_2
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-eqz v7, :cond_b

    .line 140
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 63
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v1, [Ljava/lang/Object;

    const v3, 0x7f12073e

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 132
    :cond_4
    invoke-static {v2}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 66
    invoke-virtual {p1, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    const-string v7, "boolean required"

    if-eqz v3, :cond_a

    .line 147
    :try_start_3
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v8

    if-eqz v8, :cond_a

    .line 150
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v3
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3

    const-string v8, "local:"

    if-nez v3, :cond_5

    .line 109
    sget-object p1, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    invoke-static {}, Ll/᩶ۖ᩷;->ܽ()V

    .line 73
    invoke-static {v2}, Ll/ۢ᩵ۢ;->֫(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_5
    const-string v3, "method"

    .line 76
    invoke-static {p1, v3}, Ll/ۢ᩵ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 77
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v3, v0, v1

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_6
    const-string v9, "reverse"

    .line 80
    invoke-static {p1, v9}, Ll/ۢ᩵ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 81
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v9, v0, v1

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 88
    :cond_7
    :try_start_4
    invoke-virtual {p1, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_9

    .line 137
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v10

    if-eqz v10, :cond_9

    .line 140
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v5

    .line 89
    invoke-virtual {p1, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 147
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 150
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 95
    :try_start_5
    invoke-static {v5}, Ll/ܺ᩵ۢ;->ۧ(Ljava/lang/String;)I

    move-result v0
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    .line 101
    sget-object v1, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    .line 0
    invoke-static {v8, v2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 101
    invoke-static {v0, p1}, Ll/۟۬ܳ;->֫(IZ)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    invoke-static {}, Ll/᩶ۖ᩷;->ܽ()V

    .line 101
    invoke-static {v2}, Ll/ۢ᩵ۢ;->֫(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 97
    :catch_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v3, v0, v1

    const v1, 0x7f120826

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 148
    :cond_8
    :try_start_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1

    .line 138
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_2

    .line 91
    :catch_2
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 148
    :cond_a
    :try_start_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1

    .line 138
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_3

    .line 68
    :catch_3
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
    .locals 2

    .line 28
    sget-object v0, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 29
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "path"

    .line 40
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 132
    :cond_1
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    invoke-static {p1}, Ll/ۢ᩵ۢ;->֫(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 33
    :cond_2
    :goto_0
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12073e

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method
