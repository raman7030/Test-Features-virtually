.class public final Ll/᩵֫ۜ;
.super Ljava/lang/Object;
.source "I76C"


# direct methods
.method public static ֫(Ll/ۨ۟᩻;Ljava/lang/String;JLjava/lang/String;Ll/ᩴ֫ۜ;Ll/ᩴ֫ۜ;)Ljava/lang/String;
    .locals 1

    .line 173
    iget p0, p0, Ll/ۨ۟᩻;->ۧ:I

    const/16 v0, 0x28

    if-ne p0, v0, :cond_5

    const-string p0, "virtual"

    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-wide/16 p0, 0x1

    and-long/2addr p2, p0

    cmp-long v0, p2, p0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const-string p1, "arm"

    .line 69
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-nez p0, :cond_1

    return-object p1

    .line 71
    :cond_1
    invoke-interface {p5}, Ll/ᩴ֫ۜ;->get()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_2
    const-string p1, "thumb"

    .line 75
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p0, :cond_4

    :goto_1
    return-object p1

    .line 81
    :cond_4
    invoke-interface {p6}, Ll/ᩴ֫ۜ;->get()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_5
    const-string p0, "auto"

    .line 60
    invoke-virtual {p0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    return-object p0

    .line 62
    :cond_6
    invoke-static {p4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 63
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const/4 p2, 0x0

    const-string p3, "instructionMode must be auto for non-ARM ELF"

    const-string p4, "instructionMode"

    .line 61
    invoke-static {p3, p4, p1, p0, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ۨ۟᩻;Ll/۠۟᩻;)Ljava/lang/String;
    .locals 7

    .line 30
    iget-object v1, p1, Ll/۠۟᩻;->ܽ:Ljava/lang/String;

    iget-wide v2, p1, Ll/۠۟᩻;->֫:J

    iget-object v4, p1, Ll/۠۟᩻;->ۜ:Ljava/lang/String;

    new-instance v5, Ll/ۡ֫ۜ;

    invoke-direct {v5, p1}, Ll/ۡ֫ۜ;-><init>(Ll/۠۟᩻;)V

    new-instance v6, Ll/ܺ֫ۜ;

    invoke-direct {v6, p1}, Ll/ܺ֫ۜ;-><init>(Ll/۠۟᩻;)V

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Ll/᩵֫ۜ;->֫(Ll/ۨ۟᩻;Ljava/lang/String;JLjava/lang/String;Ll/ᩴ֫ۜ;Ll/ᩴ֫ۜ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۨ۟᩻;Ll/ᩴ۟᩻;)Ljava/lang/String;
    .locals 7

    .line 19
    iget-object v1, p1, Ll/ᩴ۟᩻;->ܽ:Ljava/lang/String;

    iget-wide v2, p1, Ll/ᩴ۟᩻;->֫:J

    iget-object v4, p1, Ll/ᩴ۟᩻;->ܳ:Ljava/lang/String;

    new-instance v5, Ll/ۖ֫ۜ;

    invoke-direct {v5, p1}, Ll/ۖ֫ۜ;-><init>(Ll/ᩴ۟᩻;)V

    new-instance v6, Ll/ۘ֫ۜ;

    invoke-direct {v6, p1}, Ll/ۘ֫ۜ;-><init>(Ll/ᩴ۟᩻;)V

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Ll/᩵֫ۜ;->֫(Ll/ۨ۟᩻;Ljava/lang/String;JLjava/lang/String;Ll/ᩴ֫ۜ;Ll/ᩴ֫ۜ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۨ۟᩻;Ll/᩵۟᩻;)Ljava/lang/String;
    .locals 7

    .line 41
    iget-object v1, p1, Ll/᩵۟᩻;->ܽ:Ljava/lang/String;

    iget-wide v2, p1, Ll/᩵۟᩻;->֫:J

    iget-object v4, p1, Ll/᩵۟᩻;->ܳ:Ljava/lang/String;

    new-instance v5, Ll/᩷֫ۜ;

    invoke-direct {v5, p1}, Ll/᩷֫ۜ;-><init>(Ll/᩵۟᩻;)V

    new-instance v6, Ll/ۢ֫ۜ;

    invoke-direct {v6, p1}, Ll/ۢ֫ۜ;-><init>(Ll/᩵۟᩻;)V

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Ll/᩵֫ۜ;->֫(Ll/ۨ۟᩻;Ljava/lang/String;JLjava/lang/String;Ll/ᩴ֫ۜ;Ll/ᩴ֫ۜ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
