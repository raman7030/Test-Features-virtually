.class public final Ll/ᩴ᩵ۢ;
.super Ljava/lang/Object;
.source "L7BP"


# instance fields
.field public final ֫:Ll/۠᩵ۢ;


# direct methods
.method public constructor <init>(Ll/ۗ֡ۢ;Ll/۠᩵ۢ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p2, p0, Ll/ᩴ᩵ۢ;->֫:Ll/۠᩵ۢ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 364
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "/"

    if-nez v0, :cond_2

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x2f

    .line 367
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 371
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object v1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 330
    invoke-static {}, Ll/᩹֡ܿ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 347
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 350
    :cond_0
    invoke-static {p0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "/"

    .line 351
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 354
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_2

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 0
    invoke-static {v2, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method public static ۧ(Ll/ܺܳܳ;)Ll/ۖ᩵ۢ;
    .locals 2

    .line 290
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 291
    new-instance v0, Ll/ۖ᩵ۢ;

    .line 389
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "taskId"

    .line 292
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۖ᩵ۢ;->ܿ:Ljava/lang/String;

    const-string v1, "conflictId"

    .line 293
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۖ᩵ۢ;->ܽ:Ljava/lang/String;

    const-string v1, "action"

    .line 294
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۖ᩵ۢ;->֫:Ljava/lang/String;

    const-string v1, "applyAll"

    .line 295
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Ll/ۖ᩵ۢ;->ۧ:Z

    const-string v1, "moveToRecycleBin"

    .line 296
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p0

    iput-boolean p0, v0, Ll/ۖ᩵ۢ;->ᩳ:Z

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 337
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 340
    :cond_0
    invoke-static {p0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/ܺܳܳ;)Ll/ۘ᩵ۢ;
    .locals 2

    .line 275
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 276
    new-instance v0, Ll/ۘ᩵ۢ;

    .line 377
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 383
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    const-string v1, "type"

    .line 277
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    const-string v1, "sourcePath"

    .line 278
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ᩵ۢ;->ᩳ:Ljava/lang/String;

    const-string v1, "targetPath"

    .line 279
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ᩵ۢ;->ܿ:Ljava/lang/String;

    const-string v1, "replacedName"

    .line 280
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ᩵ۢ;->ܽ:Ljava/lang/String;

    const-string v1, "moveToRecycleBin"

    .line 281
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Ll/ۘ᩵ۢ;->֫:Z

    .line 282
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object p0

    iput-object p0, v0, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 50
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v2

    .line 51
    sget-object v3, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    const v5, 0x7f12082b

    const v6, 0x7f120826

    iget-object v7, v0, Ll/ᩴ᩵ۢ;->֫:Ll/۠᩵ۢ;

    const v8, 0x7f120827

    const v9, 0x7f12082f

    const/4 v10, 0x0

    if-eqz v3, :cond_1d

    .line 72
    :try_start_0
    invoke-static/range {p1 .. p1}, Ll/ᩴ᩵ۢ;->ܽ(Ll/ܺܳܳ;)Ll/ۘ᩵ۢ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩻֡ۢ; {:try_start_0 .. :try_end_0} :catch_1

    .line 76
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    if-eqz v2, :cond_1c

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_5

    .line 79
    :cond_0
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    const-string v3, "copy"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "move"

    const-string v11, "delete"

    if-nez v2, :cond_1

    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 80
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v4, [Ljava/lang/Object;

    const-string v3, "type"

    aput-object v3, v2, v10

    .line 62
    invoke-static {v6, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 82
    :cond_1
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v12, "targetPath"

    if-nez v2, :cond_2

    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܿ:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 83
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v12, v2, v10

    .line 62
    invoke-static {v8, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 86
    :cond_2
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v8, ""

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ᩳ:Ljava/lang/String;

    iget-object v13, v1, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    if-eqz v13, :cond_9

    .line 304
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_4

    goto :goto_1

    .line 308
    :cond_4
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move-object v14, v8

    :cond_5
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 309
    invoke-static {v15}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 310
    invoke-static {v15}, Ll/ᩴ᩵ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 311
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_6

    move-object v14, v15

    goto :goto_0

    .line 315
    :cond_6
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_5

    goto :goto_1

    .line 319
    :cond_7
    invoke-static {v2}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 320
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_8

    move-object v8, v14

    goto :goto_1

    .line 323
    :cond_8
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    move-object v8, v2

    .line 87
    :cond_9
    :goto_1
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v13, "sourcePath"

    if-nez v2, :cond_a

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 88
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v13, v2, v10

    .line 62
    invoke-static {v6, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 91
    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    iget-object v6, v1, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    iget-object v6, v1, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 94
    :try_start_1
    sget-object v15, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    invoke-virtual {v15, v14}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v14

    .line 95
    iget-object v15, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_b

    .line 96
    move-object v15, v14

    check-cast v15, Ll/ܺۘܳ;

    invoke-virtual {v15}, Ll/ܺۘܳ;->getParent()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 97
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_b

    .line 98
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    const v3, 0x7f12082a

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 101
    :cond_b
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 103
    :catch_0
    sget-object v1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const v2, 0x7f120822

    new-array v3, v10, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_6

    .line 107
    :cond_c
    iget-object v6, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v11, "remoteTaskId"

    const-string v14, "ARG_PATHS"

    if-eqz v6, :cond_10

    .line 108
    iget-boolean v3, v1, Ll/ۘ᩵ۢ;->֫:Z

    if-eqz v3, :cond_e

    .line 109
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 110
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-static {v5}, Ll/ᩴ᩵ۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 111
    sget-object v1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    .line 113
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v10

    const v2, 0x7f120642

    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 111
    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 119
    :cond_e
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 120
    sget v3, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v3, Ll/֨۠ۢ;

    const-class v4, Ll/ۘܽ᩻;

    invoke-direct {v3, v4}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 120
    iget-object v4, v1, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    new-array v5, v10, [Ljava/lang/String;

    .line 121
    invoke-interface {v4, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    invoke-virtual {v3, v14, v4}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const v4, 0x7f12084e

    .line 122
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "deleteFrom"

    invoke-virtual {v3, v5, v4}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "recycle"

    iget-boolean v5, v1, Ll/ۘ᩵ۢ;->֫:Z

    .line 123
    invoke-virtual {v3, v4, v5}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    const-string v4, "speedMode"

    .line 124
    invoke-virtual {v3, v4, v10}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    iget-object v1, v1, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    .line 125
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const-string v4, "minTotal"

    invoke-virtual {v3, v1, v4}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 126
    invoke-virtual {v3, v11, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-virtual {v3}, Ll/֨۠ۢ;->ۧ()I

    move-result v1

    .line 128
    invoke-virtual {v7, v1, v2}, Ll/۠᩵ۢ;->֫(ILjava/lang/String;)V

    .line 130
    invoke-virtual {v7, v2}, Ll/۠᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v1

    if-nez v1, :cond_f

    .line 132
    sget-object v1, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    .line 62
    invoke-static {v9, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 134
    :cond_f
    invoke-static {v1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 137
    :cond_10
    iget-object v6, v1, Ll/ۘ᩵ۢ;->ܿ:Ljava/lang/String;

    invoke-static {v6}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 139
    iget-object v9, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const-string v15, "replacedName"

    if-eqz v9, :cond_15

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    .line 140
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-eq v9, v4, :cond_11

    .line 141
    sget-object v1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    const v2, 0x7f120aa9

    .line 143
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 141
    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 146
    :cond_11
    iget-object v9, v1, Ll/ۘ᩵ۢ;->ܽ:Ljava/lang/String;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 147
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v15, v2, v10

    const v3, 0x7f120827

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 149
    :cond_12
    iget-object v4, v1, Ll/ۘ᩵ۢ;->ܽ:Ljava/lang/String;

    const-string v9, "/"

    invoke-virtual {v4, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_14

    iget-object v4, v1, Ll/ۘ᩵ۢ;->ܽ:Ljava/lang/String;

    const-string v9, "\\"

    invoke-virtual {v4, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_3

    .line 155
    :cond_13
    iget-object v4, v1, Ll/ۘ᩵ۢ;->ܽ:Ljava/lang/String;

    invoke-static {v6, v4}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v9, v10, [Ljava/lang/String;

    invoke-static {v4, v9}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_15

    .line 156
    sget-object v1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    const v2, 0x7f1203a1

    .line 158
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 156
    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 150
    :cond_14
    :goto_3
    sget-object v1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    const v2, 0x7f1203ae

    .line 152
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 150
    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 163
    :cond_15
    iget-object v4, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    .line 164
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    .line 165
    sget-object v1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    const v2, 0x7f120aaa

    .line 167
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 165
    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    :cond_16
    new-array v4, v10, [Ljava/lang/String;

    .line 170
    invoke-static {v6, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 171
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 172
    invoke-interface {v5}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-interface {v5}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v9

    invoke-virtual {v4, v9}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v9

    if-eqz v9, :cond_17

    .line 173
    sget-object v1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    .line 175
    invoke-interface {v5}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v10

    const v2, 0x7f120617

    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 173
    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 181
    :cond_18
    iget-object v2, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 182
    iget-object v4, v1, Ll/ۘ᩵ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    const-class v3, Ll/ۡܽ᩻;

    goto :goto_4

    :cond_19
    const-class v3, Ll/᩵ܽ᩻;

    :goto_4
    sget v4, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v4, Ll/֨۠ۢ;

    invoke-direct {v4, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 182
    iget-object v3, v1, Ll/ۘ᩵ۢ;->ۧ:Ljava/util/List;

    new-array v5, v10, [Ljava/lang/String;

    .line 183
    invoke-interface {v3, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {v4, v14, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    .line 184
    invoke-virtual {v4, v13, v8}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    invoke-virtual {v4, v12, v6}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-virtual {v4, v11, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    iget-object v3, v1, Ll/ۘ᩵ۢ;->ܽ:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1a

    .line 188
    iget-object v1, v1, Ll/ۘ᩵ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v4, v15, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    :cond_1a
    invoke-virtual {v4}, Ll/֨۠ۢ;->ۧ()I

    move-result v1

    .line 191
    invoke-virtual {v7, v1, v2}, Ll/۠᩵ۢ;->֫(ILjava/lang/String;)V

    .line 193
    invoke-virtual {v7, v2}, Ll/۠᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v1

    if-nez v1, :cond_1b

    .line 195
    sget-object v1, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    const v3, 0x7f12082f

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 197
    :cond_1b
    invoke-static {v1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 77
    :cond_1c
    :goto_5
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "paths"

    aput-object v3, v2, v10

    const v3, 0x7f120827

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 74
    :catch_1
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    .line 62
    invoke-static {v5, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_6
    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 54
    :cond_1d
    sget-object v3, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "taskId"

    if-eqz v3, :cond_20

    .line 242
    invoke-static {v1, v4}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 243
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 244
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v10

    const v3, 0x7f120827

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 246
    :cond_1e
    invoke-virtual {v7, v1}, Ll/۠᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v1

    if-nez v1, :cond_1f

    .line 248
    sget-object v1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    const v3, 0x7f12082f

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 250
    :cond_1f
    invoke-static {v1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 57
    :cond_20
    sget-object v3, Ll/ۘܳܳ;->ۧ֫:Ll/ۘܳܳ;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_27

    .line 206
    :try_start_2
    invoke-static/range {p1 .. p1}, Ll/ᩴ᩵ۢ;->ۧ(Ll/ܺܳܳ;)Ll/ۖ᩵ۢ;

    move-result-object v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ll/ܶܳܳ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ll/᩻֡ۢ; {:try_start_2 .. :try_end_2} :catch_2

    .line 210
    iget-object v2, v1, Ll/ۖ᩵ۢ;->ܿ:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_21

    .line 211
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v10

    const v3, 0x7f120827

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    :cond_21
    const/4 v2, 0x1

    const v3, 0x7f120827

    .line 213
    iget-object v4, v1, Ll/ۖ᩵ۢ;->ܽ:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_22

    .line 214
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v4, "conflictId"

    aput-object v4, v2, v10

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 216
    :cond_22
    iget-object v3, v1, Ll/ۖ᩵ۢ;->֫:Ljava/lang/String;

    invoke-static {v3}, Ll/ᩴܽ᩻;->ܺ(Ljava/lang/String;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_23

    .line 217
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "action"

    aput-object v3, v2, v10

    .line 62
    invoke-static {v6, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 219
    :cond_23
    iget-object v2, v1, Ll/ۖ᩵ۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ll/۠᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v2

    if-nez v2, :cond_24

    .line 220
    sget-object v1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    const v3, 0x7f12082f

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 222
    :cond_24
    iget-object v12, v1, Ll/ۖ᩵ۢ;->ܿ:Ljava/lang/String;

    iget-object v13, v1, Ll/ۖ᩵ۢ;->ܽ:Ljava/lang/String;

    iget-object v14, v1, Ll/ۖ᩵ۢ;->֫:Ljava/lang/String;

    iget-boolean v15, v1, Ll/ۖ᩵ۢ;->ۧ:Z

    iget-boolean v2, v1, Ll/ۖ᩵ۢ;->ᩳ:Z

    iget-object v11, v0, Ll/ᩴ᩵ۢ;->֫:Ll/۠᩵ۢ;

    move/from16 v16, v2

    invoke-virtual/range {v11 .. v16}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    move-result v2

    if-nez v2, :cond_25

    .line 229
    sget-object v1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    const v2, 0x7f12081d

    new-array v3, v10, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 231
    :cond_25
    iget-object v1, v1, Ll/ۖ᩵ۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v7, v1}, Ll/۠᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v1

    if-nez v1, :cond_26

    .line 233
    sget-object v1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    const v3, 0x7f12082f

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 235
    :cond_26
    invoke-static {v1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 208
    :catch_2
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    .line 62
    invoke-static {v5, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 60
    :cond_27
    sget-object v3, Ll/ۘܳܳ;->ۙ:Ll/ۘܳܳ;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 257
    invoke-static {v1, v4}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 258
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_28

    .line 259
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v10

    const v3, 0x7f120827

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 261
    :cond_28
    invoke-virtual {v7, v1}, Ll/۠᩵ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_29

    .line 262
    sget-object v1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v2, v10, [Ljava/lang/Object;

    const v3, 0x7f12082f

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    :cond_29
    const v2, 0x7f12082f

    .line 264
    invoke-virtual {v7, v1}, Ll/۠᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object v1

    if-nez v1, :cond_2a

    .line 266
    sget-object v1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v3, v10, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 268
    :cond_2a
    invoke-static {v1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1

    .line 63
    :cond_2b
    sget-object v1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v2, 0x7f120824

    new-array v3, v10, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v1

    return-object v1
.end method
