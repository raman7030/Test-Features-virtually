.class public final Ll/᩹᩵ۢ;
.super Ljava/lang/Object;
.source "07BV"


# instance fields
.field public final ֫:Ll/ۧ֡ۢ;


# direct methods
.method public constructor <init>(Ll/ۗ֡ۢ;Ll/ۧ֡ۢ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 291
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/16 v0, 0x5c

    const/16 v2, 0x2f

    .line 294
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v0, "./"

    .line 295
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 296
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    const-string v0, "/"

    .line 298
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    .line 299
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    .line 301
    :cond_2
    :goto_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v3, :cond_3

    .line 0
    invoke-static {v3, v4, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    .line 304
    :cond_3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "."

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_5

    .line 307
    :cond_4
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 308
    array-length v3, v0

    :goto_3
    if-ge v4, v3, :cond_7

    aget-object v5, v0, v4

    .line 309
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, ".."

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    return-object v1

    :cond_7
    return-object p0

    :cond_8
    :goto_5
    return-object v1
.end method

.method private ֫(Ljava/lang/String;Ljava/io/IOException;)Ll/۠ܳܳ;
    .locals 2

    .line 329
    iget-object v0, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    invoke-virtual {v0, p1}, Ll/ۧ֡ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 330
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "done"

    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 333
    :cond_0
    sget-object p1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    .line 368
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 369
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p2, 0x7f12082e

    invoke-static {p2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    .line 333
    :cond_1
    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public static ܳ(Ll/ܺܳܳ;)Ll/ܶ᩵ۢ;
    .locals 2

    .line 277
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 278
    new-instance v0, Ll/ܶ᩵ۢ;

    .line 383
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "taskId"

    .line 279
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܶ᩵ۢ;->ܽ(Ll/ܶ᩵ۢ;Ljava/lang/String;)V

    const-string v1, "conflictId"

    .line 280
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܶ᩵ۢ;->ۧ(Ll/ܶ᩵ۢ;Ljava/lang/String;)V

    const-string v1, "action"

    .line 281
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܶ᩵ۢ;->֫(Ll/ܶ᩵ۢ;Ljava/lang/String;)V

    const-string v1, "applyAll"

    .line 282
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Ll/ܶ᩵ۢ;->֫(Ll/ܶ᩵ۢ;Z)V

    const-string v1, "moveToRecycleBin"

    .line 283
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p0

    invoke-static {v0, p0}, Ll/ܶ᩵ۢ;->ۧ(Ll/ܶ᩵ۢ;Z)V

    return-object v0
.end method

.method public static ᩻(Ll/ܺܳܳ;)Ll/᩸᩵ۢ;
    .locals 7

    .line 265
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 266
    new-instance v0, Ll/᩸᩵ۢ;

    .line 375
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "targetPath"

    .line 267
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩸᩵ۢ;->֫(Ll/᩸᩵ۢ;Ljava/lang/String;)V

    const-string v1, "entries"

    .line 175
    :try_start_0
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    .line 232
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    .line 234
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 235
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 236
    new-instance v4, Ll/ܰ᩵ۢ;

    invoke-direct {v4}, Ll/ܰ᩵ۢ;-><init>()V

    const-string v5, "path"

    .line 237
    invoke-static {v3, v5}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Ll/ܰ᩵ۢ;->֫:Ljava/lang/String;

    const-string v5, "type"

    .line 238
    invoke-static {v3, v5}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Ll/ܰ᩵ۢ;->ܿ:Ljava/lang/String;

    const-string v5, "size"

    .line 239
    invoke-static {v3, v5}, Ll/ۜ֡ۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v5

    iput-wide v5, v4, Ll/ܰ᩵ۢ;->ۧ:J

    const-string v5, "time"

    .line 240
    invoke-static {v3, v5}, Ll/ۜ֡ۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v5

    iput-wide v5, v4, Ll/ܰ᩵ۢ;->ܽ:J

    const-string v5, "topLevel"

    .line 241
    invoke-static {v3, v5}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v4, Ll/ܰ᩵ۢ;->ᩳ:Z

    .line 242
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object p0, v1

    .line 268
    :goto_1
    invoke-static {v0, p0}, Ll/᩸᩵ۢ;->֫(Ll/᩸᩵ۢ;Ljava/util/ArrayList;)V

    return-object v0

    :catch_0
    move-exception p0

    .line 246
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


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 4

    .line 72
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 73
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "taskId"

    .line 75
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 76
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 77
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f120827

    .line 62
    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "path"

    .line 79
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩹᩵ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 80
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 81
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12073e

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 83
    :cond_2
    iget-object v0, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    invoke-virtual {v0, v2, p1}, Ll/ۧ֡ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_3

    .line 85
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const v0, 0x7f12082f

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 87
    :cond_3
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 3

    .line 149
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 150
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "taskId"

    .line 152
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 153
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 154
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f120827

    .line 62
    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 156
    :cond_1
    iget-object v0, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    invoke-virtual {v0, p1}, Ll/ۧ֡ۢ;->֫(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_2

    .line 158
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const v0, 0x7f12082f

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 160
    :cond_2
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 10

    .line 94
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 95
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    .line 360
    :goto_1
    invoke-virtual {p1}, Ll/۠ܳܳ;->֫()V

    return-object p1

    :cond_0
    const-string v0, "taskId"

    .line 100
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 101
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x1

    const v4, 0x7f120827

    if-eqz v2, :cond_1

    .line 102
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v3, [Ljava/lang/Object;

    aput-object v0, v2, v1

    .line 62
    invoke-static {v4, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "path"

    .line 108
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩹᩵ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 109
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 110
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12073e

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, "armToken"

    const v2, 0x7f120827

    .line 115
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 116
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 117
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v1

    .line 62
    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 125
    :cond_3
    :try_start_0
    invoke-static {p1}, Ll/ܿۚۢ;->ܳ(Ll/ܺܳܳ;)J

    move-result-wide v6
    :try_end_0
    .catch Ll/ۧۚۢ; {:try_start_0 .. :try_end_0} :catch_2

    .line 130
    :try_start_1
    iget-object v2, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܿ()Ljava/io/InputStream;

    move-result-object v8

    move-object v3, v9

    invoke-virtual/range {v2 .. v8}, Ll/ۧ֡ۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/io/InputStream;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_4

    .line 132
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v1, [Ljava/lang/Object;

    const v1, 0x7f12082f

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    .line 360
    invoke-virtual {p1}, Ll/۠ܳܳ;->֫()V

    return-object p1

    .line 137
    :cond_4
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    .line 360
    invoke-virtual {p1}, Ll/۠ܳܳ;->֫()V
    :try_end_1
    .catch Ll/ۛ᩵ۢ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 141
    invoke-direct {p0, v9, p1}, Ll/᩹᩵ۢ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/۠ܳܳ;

    move-result-object p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    .line 139
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 352
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    invoke-static {v0, p1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    goto/16 :goto_1

    :catch_2
    move-exception p1

    .line 340
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    iget v1, p1, Ll/ۧۚۢ;->᩹:I

    iget-object p1, p1, Ll/ۧۚۢ;->᩸:[Ljava/lang/Object;

    .line 62
    invoke-static {v1, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    goto/16 :goto_1
.end method

.method public final ܿ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 14

    .line 30
    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v0

    .line 31
    sget-object v1, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const v3, 0x7f12082b

    const v4, 0x7f12082f

    const v5, 0x7f120827

    iget-object v6, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    const/4 v7, 0x0

    if-eqz v1, :cond_5

    .line 169
    :try_start_0
    invoke-static {p1}, Ll/᩹᩵ۢ;->᩻(Ll/ܺܳܳ;)Ll/᩸᩵ۢ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩻֡ۢ; {:try_start_0 .. :try_end_0} :catch_1

    .line 176
    invoke-static {p1}, Ll/᩸᩵ۢ;->ۧ(Ll/᩸᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 177
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 178
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "targetPath"

    aput-object v1, v0, v7

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 180
    :cond_0
    invoke-static {p1}, Ll/᩸᩵ۢ;->֫(Ll/᩸᩵ۢ;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 181
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 186
    :cond_1
    :try_start_1
    invoke-virtual {v6, v0, p1}, Ll/ۧ֡ۢ;->֫(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 190
    invoke-virtual {v6, p1}, Ll/ۧ֡ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_2

    .line 192
    sget-object p1, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 194
    :cond_2
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 188
    sget-object v0, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    .line 368
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 369
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    const p1, 0x7f12082e

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    .line 188
    :cond_3
    invoke-static {v0, p1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    goto :goto_2

    .line 182
    :cond_4
    :goto_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "entries"

    aput-object v1, v0, v7

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 171
    :catch_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v3, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    :goto_2
    return-object p1

    .line 34
    :cond_5
    sget-object v1, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v8, "taskId"

    if-eqz v1, :cond_8

    .line 231
    invoke-static {p1, v8}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 232
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 233
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object v8, v0, v7

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 235
    :cond_6
    invoke-virtual {v6, p1}, Ll/ۧ֡ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_7

    .line 237
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 239
    :cond_7
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 37
    :cond_8
    sget-object v1, Ll/ۘܳܳ;->ۧ֫:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 203
    :try_start_2
    invoke-static {p1}, Ll/᩹᩵ۢ;->ܳ(Ll/ܺܳܳ;)Ll/ܶ᩵ۢ;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ll/ܶܳܳ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ll/᩻֡ۢ; {:try_start_2 .. :try_end_2} :catch_2

    .line 207
    invoke-static {p1}, Ll/ܶ᩵ۢ;->ܿ(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 208
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object v8, v0, v7

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 210
    :cond_9
    invoke-static {p1}, Ll/ܶ᩵ۢ;->ܽ(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 211
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "conflictId"

    aput-object v1, v0, v7

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 213
    :cond_a
    invoke-static {p1}, Ll/ܶ᩵ۢ;->֫(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "replace"

    .line 320
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "skip"

    .line 321
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "keep_both"

    .line 322
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_3

    .line 214
    :cond_b
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "action"

    aput-object v1, v0, v7

    const v1, 0x7f120826

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 216
    :cond_c
    :goto_3
    invoke-static {p1}, Ll/ܶ᩵ۢ;->ܿ(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/ۧ֡ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v0

    if-nez v0, :cond_d

    .line 217
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 219
    :cond_d
    invoke-static {p1}, Ll/ܶ᩵ۢ;->ܿ(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object v9

    invoke-static {p1}, Ll/ܶ᩵ۢ;->ܽ(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object v10

    invoke-static {p1}, Ll/ܶ᩵ۢ;->֫(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object v11

    invoke-static {p1}, Ll/ܶ᩵ۢ;->ۧ(Ll/ܶ᩵ۢ;)Z

    move-result v12

    invoke-static {p1}, Ll/ܶ᩵ۢ;->ᩳ(Ll/ܶ᩵ۢ;)Z

    move-result v13

    iget-object v8, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    invoke-virtual/range {v8 .. v13}, Ll/ۧ֡ۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 220
    invoke-static {p1}, Ll/ܶ᩵ۢ;->ܿ(Ll/ܶ᩵ۢ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ll/ۧ֡ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_e

    .line 222
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 224
    :cond_e
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 205
    :catch_2
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v3, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 40
    :cond_f
    sget-object v1, Ll/ۘܳܳ;->ۙ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 246
    invoke-static {p1, v8}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 247
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 248
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object v8, v0, v7

    .line 62
    invoke-static {v5, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 250
    :cond_10
    invoke-virtual {v6, p1}, Ll/ۧ֡ۢ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 251
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 253
    :cond_11
    invoke-virtual {v6, p1}, Ll/ۧ֡ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_12

    .line 255
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 257
    :cond_12
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 43
    :cond_13
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v7, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public final ᩳ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 3

    .line 50
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 51
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "taskId"

    .line 53
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 55
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f120827

    .line 62
    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 58
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/᩹᩵ۢ;->֫:Ll/ۧ֡ۢ;

    invoke-virtual {v0, p1}, Ll/ۧ֡ۢ;->ܽ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v0

    if-nez v0, :cond_2

    .line 60
    sget-object v0, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f12082f

    .line 62
    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {v0}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 64
    invoke-direct {p0, p1, v0}, Ll/᩹᩵ۢ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method
