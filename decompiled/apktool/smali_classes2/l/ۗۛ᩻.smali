.class public final Ll/ۗۛ᩻;
.super Ljava/lang/Exception;
.source "Z79J"


# instance fields
.field public final ۗ:Lbin/mt/json/JSONArray;

.field public final ۙ:Z

.field public final ۤ:Z

.field public final ۫:Z

.field public final ۬:Lbin/mt/json/JSONValue;

.field public final ᩶:Lbin/mt/json/JSONObject;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 34
    iput-boolean p2, p0, Ll/ۗۛ᩻;->ۙ:Z

    .line 35
    iput-object p3, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    .line 36
    iput-boolean p4, p0, Ll/ۗۛ᩻;->۫:Z

    .line 37
    iput-boolean p5, p0, Ll/ۗۛ᩻;->ۤ:Z

    .line 38
    iput-object p6, p0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    if-nez p7, :cond_0

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p7

    :cond_0
    iput-object p7, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    if-nez p8, :cond_1

    .line 40
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p8

    :cond_1
    iput-object p8, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 41
    iput-object p9, p0, Ll/ۗۛ᩻;->۬:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "PATH_NOT_FOUND"

    .line 154
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "APK_CHANGED"

    .line 155
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ENTRY_READ_FAILED"

    .line 156
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "AXML_DECODE_FAILED"

    .line 157
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DEX_READ_FAILED"

    .line 158
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SMALI_READ_FAILED"

    .line 159
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "RESOURCE_TABLE_PARSE_FAILED"

    .line 160
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "fatal"

    return-object p0

    :cond_1
    :goto_0
    const-string p0, "warning"

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 7

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x1

    move-object v0, p1

    move-object v1, p2

    move-object v4, p3

    move-object v5, p0

    .line 115
    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;
    .locals 7

    const/4 v2, 0x1

    const/4 v3, 0x1

    const-string v0, "FILE_SEARCH_CANCELED"

    const-string v1, "Text search canceled. Retry the same arguments after cancellation has cleared."

    const-string v4, "warning"

    const/4 v5, 0x0

    move-object v6, p0

    .line 137
    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 7

    .line 107
    invoke-static {p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;
    .locals 11

    .line 56
    new-instance v10, Ll/ۗۛ᩻;

    .line 73
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "argument"

    .line 74
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    if-nez p2, :cond_0

    .line 75
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    const-string v1, "badValue"

    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    if-nez p3, :cond_1

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p3

    :cond_1
    const-string v0, "allowedValues"

    invoke-virtual {p1, v0, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    if-nez p4, :cond_2

    .line 77
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p4

    :cond_2
    const-string p3, "example"

    invoke-virtual {p1, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const/4 v2, 0x1

    const-string v3, "INVALID_ARGUMENT"

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v6, "warning"

    const/4 v7, 0x0

    move-object v0, v10

    move-object v1, p0

    move-object v9, p2

    .line 57
    invoke-direct/range {v0 .. v9}, Ll/ۗۛ᩻;-><init>(Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)V

    return-object v10
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;
    .locals 7

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    .line 123
    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;
    .locals 11

    .line 146
    new-instance v10, Ll/ۗۛ᩻;

    const/4 v2, 0x0

    const/4 v9, 0x0

    move-object v0, v10

    move-object v1, p1

    move-object v3, p0

    move v4, p2

    move v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v9}, Ll/ۗۛ᩻;-><init>(Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)V

    return-object v10
.end method

.method public static ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 7

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v4, p3

    move-object v5, p0

    .line 92
    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 7

    .line 84
    invoke-static {p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;
    .locals 7

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    .line 100
    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Lbin/mt/json/JSONArray;)Ll/ۗۛ᩻;
    .locals 11

    .line 64
    new-instance v10, Ll/ۗۛ᩻;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    iget-object v8, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v9, p0, Ll/ۗۛ᩻;->۬:Lbin/mt/json/JSONValue;

    iget-boolean v2, p0, Ll/ۗۛ᩻;->ۙ:Z

    iget-object v3, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    iget-boolean v4, p0, Ll/ۗۛ᩻;->۫:Z

    iget-boolean v5, p0, Ll/ۗۛ᩻;->ۤ:Z

    iget-object v6, p0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    move-object v0, v10

    move-object v7, p1

    invoke-direct/range {v0 .. v9}, Ll/ۗۛ᩻;-><init>(Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)V

    return-object v10
.end method
