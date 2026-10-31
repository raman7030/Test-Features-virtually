.class public final Ll/ۜ֡ۢ;
.super Ljava/lang/Object;
.source "S7B0"


# direct methods
.method public static ֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 39
    :try_start_0
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0, p0}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 41
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/util/Map;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 49
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    if-nez p0, :cond_0

    goto :goto_1

    .line 53
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 54
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/Object;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 31
    invoke-static {p0}, Ll/ܿۚۢ;->ᩳ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;)Lbin/mt/json/JSONValue;
    .locals 3

    if-nez p0, :cond_0

    .line 68
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 70
    :cond_0
    instance-of v0, p0, Lbin/mt/json/JSONValue;

    if-eqz v0, :cond_1

    check-cast p0, Lbin/mt/json/JSONValue;

    return-object p0

    .line 73
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/String;

    .line 74
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 76
    :cond_2
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/lang/Boolean;

    .line 77
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Z)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 79
    :cond_3
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/lang/Integer;

    .line 80
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 82
    :cond_4
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/lang/Long;

    .line 83
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 85
    :cond_5
    instance-of v0, p0, Ljava/lang/Short;

    if-eqz v0, :cond_6

    check-cast p0, Ljava/lang/Short;

    .line 86
    invoke-virtual {p0}, Ljava/lang/Short;->intValue()I

    move-result p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 88
    :cond_6
    instance-of v0, p0, Ljava/lang/Byte;

    if-eqz v0, :cond_7

    check-cast p0, Ljava/lang/Byte;

    .line 89
    invoke-virtual {p0}, Ljava/lang/Byte;->intValue()I

    move-result p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 91
    :cond_7
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_8

    check-cast p0, Ljava/lang/Float;

    .line 92
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(F)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 94
    :cond_8
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_9

    check-cast p0, Ljava/lang/Double;

    .line 95
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lbin/mt/json/JSON;->value(D)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 97
    :cond_9
    instance-of v0, p0, Ljava/math/BigInteger;

    if-eqz v0, :cond_b

    check-cast p0, Ljava/math/BigInteger;

    .line 119
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x3f

    if-gt v0, v1, :cond_a

    .line 122
    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    .line 98
    invoke-static {v0, v1}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 120
    :cond_a
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string v0, "BigInteger out of long range"

    invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 100
    :cond_b
    instance-of v0, p0, Ljava/math/BigDecimal;

    if-eqz v0, :cond_c

    check-cast p0, Ljava/math/BigDecimal;

    .line 101
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lbin/mt/json/JSON;->value(D)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    .line 103
    :cond_c
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_d

    check-cast p0, Ljava/util/Map;

    .line 104
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/util/Map;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    .line 106
    :cond_d
    instance-of v0, p0, Ljava/lang/Iterable;

    if-eqz v0, :cond_f

    check-cast p0, Ljava/lang/Iterable;

    .line 129
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0}, Lbin/mt/json/JSONArray;-><init>()V

    .line 133
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 134
    invoke-static {v1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/Object;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_e
    return-object v0

    .line 109
    :cond_f
    instance-of v0, p0, Ll/ܳ᩵ۢ;

    if-eqz v0, :cond_10

    check-cast p0, Ll/ܳ᩵ۢ;

    .line 143
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "mode"

    iget-object v2, p0, Ll/ܳ᩵ۢ;->ۧ:Ljava/lang/String;

    .line 144
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "cacheKey"

    iget-object p0, p0, Ll/ܳ᩵ۢ;->֫:Ljava/lang/String;

    .line 145
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    .line 112
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported JSON value type: "

    .line 0
    invoke-static {p0, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 112
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "paths"

    .line 175
    :try_start_0
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 213
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 215
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 216
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :catch_0
    move-exception p0

    .line 220
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 177
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;
    .locals 1

    .line 254
    instance-of v0, p0, Ll/᩻֡ۢ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩻֡ۢ;

    return-object p0

    :cond_0
    new-instance v0, Ll/᩻֡ۢ;

    .line 265
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z
    .locals 0

    .line 186
    :try_start_0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->getBooleanObject(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 187
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 189
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J
    .locals 0

    .line 198
    :try_start_0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->getLongObject(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0

    if-nez p0, :cond_0

    const-wide/16 p0, 0x0

    return-wide p0

    .line 199
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p0

    .line 201
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 153
    :try_start_0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 155
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method
