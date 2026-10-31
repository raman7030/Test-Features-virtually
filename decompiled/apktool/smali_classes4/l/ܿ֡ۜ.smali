.class public abstract Ll/ܿ֡ۜ;
.super Ll/ۙۛ᩻;
.source "16LA"


# instance fields
.field public final ֫:Ll/֡᩵ۜ;


# direct methods
.method public constructor <init>(Ll/֡᩵ۜ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 22
    iput-object p1, p0, Ll/ܿ֡ۜ;->֫:Ll/֡᩵ۜ;

    return-void
.end method

.method public static ֫(Z)Lbin/mt/json/JSONObject;
    .locals 4

    .line 92
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute or Home-relative ZIP file path; split archives are not supported."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 93
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz p0, :cond_0

    const-string p0, "Password for the selected entry; pass an empty string if that entry is unencrypted, even when other entries are encrypted."

    .line 96
    invoke-static {v1, p0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "password"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method public static ᩷()Lbin/mt/json/JSONObject;
    .locals 4

    .line 103
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Normalized absolute archive path."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 104
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Exact case-sensitive path inside the ZIP."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryPath"

    .line 105
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONArray;
    .locals 0

    .line 30
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 7

    .line 67
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 109
    iget-object v1, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "path"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-nez v3, :cond_0

    .line 110
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 68
    :cond_0
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "entryPath"

    .line 109
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-nez v3, :cond_1

    .line 110
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 69
    :cond_1
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 70
    invoke-virtual {p0}, Ll/ܿ֡ۜ;->ۜ()[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 109
    invoke-virtual {v1, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    if-nez v6, :cond_2

    .line 110
    sget-object v6, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 70
    :cond_2
    invoke-virtual {v0, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 71
    :cond_3
    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 77
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ܿ֡ۜ;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 78
    new-instance v1, Ll/۬ۛ᩻;

    invoke-virtual {p0, p1, v0}, Ll/ܿ֡ۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {v0, v2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 80
    instance-of v1, p0, Ll/ۧ֡ۜ;

    if-eqz v1, :cond_0

    const-string v1, "ZIP_INVALID_CURSOR"

    iget-object v2, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    new-instance v1, Lbin/mt/json/JSONObject;

    invoke-direct {v1, p1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string p1, "cursor"

    const-string v2, ""

    invoke-virtual {v1, p1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "path"

    .line 82
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 83
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "retry"

    const-string v3, "Discard earlier pages and restart the ZIP listing."

    const-string v4, "mt_zip_list"

    invoke-static {p1, v4, v2, v3}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {v1, p1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 87
    :cond_0
    throw v0
.end method

.method public ۜ()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public abstract ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 8

    .line 44
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Normalized archive path when available."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "path"

    .line 45
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Affected ZIP entry when available; empty for the archive."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryPath"

    .line 46
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 47
    invoke-virtual {p0}, Ll/ܿ֡ۜ;->ۜ()[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    const/4 v6, 0x1

    if-ge v4, v2, :cond_3

    aget-object v6, v1, v4

    .line 48
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v7, "finalColumn"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    :sswitch_1
    const-string v5, "finalLine"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    goto :goto_2

    :sswitch_2
    const-string v5, "size"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    goto :goto_2

    :goto_1
    const/4 v5, -0x1

    :cond_2
    :goto_2
    packed-switch v5, :pswitch_data_0

    const-string v5, "Number of ordinary entries fully validated before testing stopped."

    goto :goto_3

    :pswitch_0
    const-string v5, "Zero-based Unicode code-point column at the observed entry EOF."

    goto :goto_3

    :pswitch_1
    const-string v5, "Zero-based logical line at the observed entry EOF."

    goto :goto_3

    :pswitch_2
    const-string v5, "Observed uncompressed entry length in bytes for an offset error."

    :goto_3
    const-string v7, "integer"

    .line 117
    invoke-static {v7, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 48
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 55
    :cond_3
    instance-of v1, p0, Ll/ܳ֡ۜ;

    if-eqz v1, :cond_4

    const-string v1, "No automatic follow-up action."

    .line 56
    invoke-static {v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    goto :goto_4

    .line 58
    :cond_4
    invoke-virtual {p0}, Ll/ۙۛ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "continue"

    invoke-virtual {p0}, Ll/ۙۛ᩻;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4, v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 59
    invoke-virtual {p0}, Ll/ۙۛ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v2

    const-string v4, "retry"

    invoke-virtual {p0}, Ll/ۙۛ᩻;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-static {v7, v2, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    new-array v4, v5, [Lbin/mt/json/JSONObject;

    aput-object v1, v4, v3

    aput-object v2, v4, v6

    const-string v1, "Executable continuation; list cursor errors may provide a restart."

    .line 57
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 60
    :goto_4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Result for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۙۛ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ll/ܿ֡ۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "ZIP read diagnostics."

    .line 61
    invoke-static {v0, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 60
    invoke-static {v2, v3, v0, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x35e001 -> :sswitch_2
        0x15293a8a -> :sswitch_1
        0x60bd106c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract ᩻()Lbin/mt/json/JSONObject;
.end method
