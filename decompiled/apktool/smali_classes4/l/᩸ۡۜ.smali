.class public final Ll/᩸ۡۜ;
.super Ljava/lang/Object;
.source "M6Y4"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    const-wide v0, 0x1fffffffffffffL

    cmp-long v2, p4, v0

    if-gtz v2, :cond_2

    cmp-long v0, p2, p4

    if-gtz v0, :cond_2

    .line 28
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 29
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v0

    cmp-long v2, v0, p2

    if-ltz v2, :cond_0

    cmp-long v2, v0, p4

    if-gtz v2, :cond_0

    return-wide v0

    :cond_0
    move-object v1, p1

    move-object v2, p0

    move-wide v3, p2

    move-wide v5, p4

    .line 35
    invoke-static/range {v1 .. v6}, Ll/᩸ۡۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;JJ)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object v1, p1

    move-object v2, p0

    move-wide v3, p2

    move-wide v5, p4

    .line 39
    invoke-static/range {v1 .. v6}, Ll/᩸ۡۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;JJ)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    move-object v1, p1

    move-object v2, p0

    move-wide v3, p2

    move-wide v5, p4

    .line 30
    invoke-static/range {v1 .. v6}, Ll/᩸ۡۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;JJ)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 26
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid safe integer range"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;JJ)J
    .locals 5

    const-wide v0, 0x1fffffffffffffL

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-ltz v4, :cond_0

    cmp-long v4, p3, v2

    if-ltz v4, :cond_0

    sub-long v2, v0, p3

    cmp-long v4, p1, v2

    if-gtz v4, :cond_0

    add-long/2addr p1, p3

    return-wide p1

    .line 51
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "argument"

    .line 52
    invoke-virtual {v2, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "value"

    .line 53
    invoke-virtual {p0, v2, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "increment"

    .line 54
    invoke-virtual {p0, p1, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "maximum"

    .line 55
    invoke-virtual {p0, p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_OFFSET_OUT_OF_RANGE"

    const-string p2, "Byte offset exceeds the supported JSON integer range."

    const-string p3, "warning"

    const/4 p4, 0x0

    .line 48
    invoke-static {p1, p2, p3, p4, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Lbin/mt/json/JSONValue;JJ)Ll/ۗۛ᩻;
    .locals 3

    .line 63
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ".."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p4

    .line 64
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p5

    invoke-virtual {p5, p0, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "Invalid integer argument"

    .line 62
    invoke-static {p3, p0, p1, p4, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method
