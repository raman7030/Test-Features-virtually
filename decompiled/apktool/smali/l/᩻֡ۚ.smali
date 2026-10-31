.class public final Ll/᩻֡ۚ;
.super Ljava/lang/Object;
.source "UAH9"

# interfaces
.implements Ll/֡ۤۖ;


# direct methods
.method public static ֫(Ll/ۘۜۜ;)Lbin/mt/json/JSONObject;
    .locals 5

    .line 36
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 37
    iget-object v1, p0, Ll/ۘۜۜ;->᩷:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 41
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 42
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "temporary"

    const/4 v3, 0x1

    .line 43
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_workspace_open"

    const-string v3, "inspect"

    const-string v4, "Open built APK as a temporary workspace for one-time inspection"

    .line 38
    invoke-static {v1, v2, v3, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 56
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    iget-object v3, p0, Ll/ۘۜۜ;->ᩴ:Ljava/lang/String;

    .line 57
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    iget-object v3, p0, Ll/ۘۜۜ;->ۜ:Ljava/lang/String;

    .line 58
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "outputPath"

    iget-object v3, p0, Ll/ۘۜۜ;->ۢ:Ljava/lang/String;

    .line 59
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "apkFileName"

    iget-object v3, p0, Ll/ۘۜۜ;->ۧ:Ljava/lang/String;

    .line 60
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "size"

    iget-wide v3, p0, Ll/ۘۜۜ;->ۘ:J

    .line 61
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "signingPerformed"

    iget-boolean v3, p0, Ll/ۘۜۜ;->ۖ:Z

    .line 62
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۜۜ;->ۡ:Ljava/util/ArrayList;

    .line 63
    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "signSchemes"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۜۜ;->ܺ:Ll/۠ܿۜ;

    const/4 v3, 0x0

    .line 64
    invoke-static {v2, v3}, Ll/֨ܳۜ;->֫(Ll/۠ܿۜ;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "signatureSummary"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۜۜ;->ᩳ:Ljava/util/ArrayList;

    .line 65
    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "changedDexEntries"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "changedClassCount"

    iget v3, p0, Ll/ۘۜۜ;->ܽ:I

    .line 66
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "deletedClassCount"

    iget v3, p0, Ll/ۘۜۜ;->ܳ:I

    .line 67
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۜۜ;->֫:Ljava/util/ArrayList;

    .line 68
    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "addedZipEntries"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۜۜ;->ܿ:Ljava/util/ArrayList;

    .line 69
    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "changedZipEntries"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object p0, p0, Ll/ۘۜۜ;->᩻:Ljava/util/ArrayList;

    .line 70
    invoke-static {p0}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v2, "deletedZipEntries"

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 45
    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(D)Ljava/lang/String;
    .locals 5

    .line 8
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v4, v0, v2

    if-gtz v4, :cond_0

    double-to-float p0, p0

    .line 46
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    .line 47
    invoke-static {p0}, Ll/ۗᩳۘ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid number: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    .line 12
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 17
    invoke-static {p0}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
