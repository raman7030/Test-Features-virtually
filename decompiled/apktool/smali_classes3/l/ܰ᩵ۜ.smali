.class public final Ll/ܰ᩵ۜ;
.super Ljava/lang/Object;
.source "H6L4"


# static fields
.field public static final ܽ:Ll/֨᩸ܿ;


# instance fields
.field public final ֫:Ll/۬ۖۜ;

.field public final ۧ:Ll/ᩳۖۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 344
    new-instance v0, Ll/۫᩵ۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰ᩵ۜ;->ܽ:Ll/֨᩸ܿ;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۖۜ;Ll/۬ۖۜ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/ܰ᩵ۜ;->ۧ:Ll/ᩳۖۜ;

    .line 38
    iput-object p2, p0, Ll/ܰ᩵ۜ;->֫:Ll/۬ۖۜ;

    return-void
.end method

.method private ֫(Ljava/lang/String;ZLl/۟ۢۜ;Ll/ۙ᩵ۜ;Ll/ᩳܰۡ;Ljava/lang/String;II)Lbin/mt/json/JSONObject;
    .locals 15

    move-object v8, p0

    move-object/from16 v9, p1

    const-string v10, "warnings"

    const-string v11, "changed"

    const-string v12, "size"

    const-string v13, "path"

    move-object/from16 v3, p4

    if-eqz p5, :cond_0

    .line 153
    iget-boolean v0, v3, Ll/ۙ᩵ۜ;->ۧ:Z

    if-nez v0, :cond_0

    .line 154
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 155
    iget-object v0, v8, Ll/ܰ᩵ۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    .line 156
    invoke-virtual {v1, v9}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v1, v9}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v1, v9}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 159
    invoke-static {v0, v9, v1}, Ll/ۚ᩵ۜ;->֫(Ll/ᩳۖۜ;Ljava/lang/String;Z)Ll/۫᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v2

    .line 160
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v13, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v12, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 161
    invoke-virtual {v0, v11, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 163
    :cond_0
    new-instance v14, Ll/ۗ᩵ۜ;

    move-object v0, v14

    move-object v1, p0

    move-object/from16 v2, p5

    move-object/from16 v3, p4

    move/from16 v4, p7

    move/from16 v5, p8

    move-object/from16 v6, p6

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Ll/ۗ᩵ۜ;-><init>(Ll/ܰ᩵ۜ;Ll/ᩳܰۡ;Ll/ۙ᩵ۜ;IILjava/lang/String;Ljava/lang/String;)V

    iget-object v0, v8, Ll/ܰ᩵ۜ;->֫:Ll/۬ۖۜ;

    move/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v9, v1, v2, v14}, Ll/۬ۖۜ;->֫(Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩵ۖۜ;)Ll/֡ۖۜ;

    move-result-object v0

    .line 226
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v0, Ll/֡ۖۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v13, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v2, v0, Ll/֡ۖۜ;->ᩳ:J

    invoke-virtual {v1, v12, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-boolean v2, v0, Ll/֡ۖۜ;->֫:Z

    .line 227
    invoke-virtual {v1, v11, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v0, v0, Ll/֡ۖۜ;->ܿ:Lbin/mt/json/JSONArray;

    invoke-virtual {v1, v10, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method private ֫(Ll/ۨ᩵ۜ;Ljava/lang/String;Ll/۟ۢۜ;I)Ljava/util/LinkedHashMap;
    .locals 17

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move-object/from16 v2, p0

    .line 244
    iget-object v3, v2, Ll/ܰ᩵ۜ;->ۧ:Ll/ᩳۖۜ;

    .line 246
    :try_start_0
    iget-object v4, v1, Ll/ۨ᩵ۜ;->ܽ:Ljava/lang/String;

    invoke-static {v4, v0}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_4

    const-string v5, "path"

    const-string v6, "The ZIP output cannot be included in its own sources"

    const-string v7, "ZIP_SOURCE_IS_OUTPUT"

    if-nez v4, :cond_8

    :try_start_1
    iget-boolean v4, v1, Ll/ۨ᩵ۜ;->֫:Z

    if-eqz v4, :cond_0

    iget-object v4, v1, Ll/ۨ᩵ۜ;->ܽ:Ljava/lang/String;

    .line 247
    invoke-static {v0, v4}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 250
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 251
    new-instance v8, Ljava/util/ArrayDeque;

    invoke-direct {v8}, Ljava/util/ArrayDeque;-><init>()V

    .line 252
    invoke-virtual {v8, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 253
    :goto_0
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_7

    .line 254
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 255
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۨ᩵ۜ;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_4

    .line 256
    :try_start_2
    iget-object v1, v9, Ll/ۨ᩵ۜ;->ܽ:Ljava/lang/String;

    iget-boolean v10, v9, Ll/ۨ᩵ۜ;->֫:Z

    iget-object v11, v9, Ll/ۨ᩵ۜ;->ۧ:Ljava/lang/String;

    move-object/from16 v12, p3

    invoke-virtual {v12, v1}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 257
    invoke-static {v3, v1, v10}, Ll/ۚ᩵ۜ;->֫(Ll/ᩳۖۜ;Ljava/lang/String;Z)Ll/۫᩵ܿ;

    move-result-object v13

    .line 258
    invoke-virtual {v3, v1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v14
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_3

    const/4 v15, 0x0

    if-nez v10, :cond_2

    .line 260
    :try_start_3
    invoke-static {v1, v0}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 263
    new-instance v1, Ll/ۛ᩵ۜ;

    move-object v10, v3

    invoke-virtual {v13}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v2

    invoke-direct {v1, v14, v15, v2, v3}, Ll/ۛ᩵ۜ;-><init>(Ll/ܶ᩵ܿ;ZJ)V

    invoke-virtual {v4, v11, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 p1, v9

    move-object/from16 v16, v10

    goto/16 :goto_5

    .line 261
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v7, v6}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    move-object v10, v3

    .line 164
    :try_start_4
    invoke-virtual {v14}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1, v13}, Ll/ۤ᩵ܿ;->֫(Ll/۫᩵ܿ;)Ljava/util/List;

    move-result-object v1
    :try_end_4
    .catch Ll/᩹᩵ܿ; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_3

    .line 267
    :try_start_5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 268
    new-instance v2, Ll/ۛ᩵ۜ;
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_3

    move-object/from16 p1, v9

    move-object/from16 v16, v10

    :try_start_6
    invoke-virtual {v13}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v9

    invoke-direct {v2, v14, v3, v9, v10}, Ll/ۛ᩵ۜ;-><init>(Ll/ܶ᩵ܿ;ZJ)V

    invoke-virtual {v4, v11, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    move-object/from16 p1, v9

    move-object/from16 v16, v10

    .line 270
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫᩵ܿ;

    .line 271
    invoke-virtual {v2}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 272
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v9, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v2, v9, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    .line 273
    :goto_3
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_5

    const-string v10, "/"

    goto :goto_4

    :cond_5
    const-string v10, ""

    :goto_4
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "entryPath"

    invoke-static {v9, v10, v15}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 274
    new-instance v10, Ll/ۨ᩵ۜ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v10, v3, v9, v2}, Ll/ۨ᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    :goto_5
    move-object/from16 v2, p0

    move-object/from16 v1, p1

    move-object/from16 v3, v16

    goto/16 :goto_0

    :catch_1
    move-exception v0

    move-object/from16 p1, v9

    .line 166
    invoke-static {v0}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_2

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    move-object/from16 p1, v9

    :goto_6
    move-object/from16 v9, p1

    goto :goto_7

    :cond_7
    return-object v4

    .line 248
    :cond_8
    :try_start_7
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v7, v6}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_4

    :catch_4
    move-exception v0

    move-object v9, v1

    :goto_7
    const-string v1, "sourcePath"

    .line 279
    iget-object v2, v9, Ll/ۨ᩵ۜ;->ܽ:Ljava/lang/String;

    iget-object v3, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v3, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    filled-new-array/range {p4 .. p4}, [I

    move-result-object v2

    .line 280
    invoke-static {v2}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "operationIndexes"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v9, Ll/ۨ᩵ۜ;->ۧ:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 281
    invoke-static {v2}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "entryPaths"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 282
    throw v0
.end method

.method public static bridge synthetic ֫()Ll/֨᩸ܿ;
    .locals 1

    .line 0
    sget-object v0, Ll/ܰ᩵ۜ;->ܽ:Ll/֨᩸ܿ;

    return-object v0
.end method

.method public static ֫(ILjava/io/IOException;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 339
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to read ZIP source content: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v0}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 341
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    filled-new-array {p0}, [I

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "operationIndexes"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p2

    const-string v0, "entryPaths"

    invoke-virtual {p0, v0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p2, "ZIP_SOURCE_READ_FAILED"

    const-string v0, "fatal"

    const/4 v1, 0x0

    .line 339
    invoke-static {p2, p1, v0, v1, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Collection;Ljava/util/ArrayList;)Ll/ۙ᩵ۜ;
    .locals 4

    .line 289
    :try_start_0
    invoke-static {p0, p1}, Ll/ۙ᩵ۜ;->֫(Ljava/util/Collection;Ljava/util/ArrayList;)Ll/ۙ᩵ۜ;

    move-result-object p0
    :try_end_0
    .catch Ll/᩹᩵ۜ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 291
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 292
    iget-object v0, p0, Ll/᩹᩵ۜ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lbin/mt/json/JSONArray;->add(I)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 293
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 294
    iget-object v1, p0, Ll/᩹᩵ۜ;->᩹:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 295
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 296
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "operationIndexes"

    invoke-virtual {v2, v3, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "entryPaths"

    invoke-virtual {p1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 295
    iget-object p0, p0, Ll/᩹᩵ۜ;->᩸:Ljava/lang/String;

    invoke-static {p1, p0, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method private ֫(Lbin/mt/json/JSONObject;Ll/۟ۢۜ;)Ll/ۨ᩵ۜ;
    .locals 7

    const-string v0, "sourcePath"

    .line 231
    invoke-static {p1, v0}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "entryPath"

    .line 232
    invoke-static {p1, v2}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x1

    invoke-static {p1, v2, v3}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "/"

    .line 233
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    .line 234
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    if-ne v5, v3, :cond_2

    .line 237
    new-instance v2, Ll/ۨ᩵ۜ;

    invoke-static {v1, p2, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2, p1, v5}, Ll/ۨ᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v2

    .line 235
    :cond_2
    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    const-string p2, "Source and ZIP destination must declare the same file or directory type"

    invoke-static {p1, v2, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܰ᩵ۜ;)Ll/ᩳۖۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ᩵ۜ;->ۧ:Ll/ᩳۖۜ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 16

    move-object/from16 v10, p0

    move-object/from16 v0, p1

    const-string v1, "outputPath"

    const-string v2, "sources"

    const-string v3, "overwrite"

    const-string v4, "level"

    const-string v5, "password"

    .line 43
    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 44
    invoke-static {v0, v1}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 45
    invoke-static {v0, v3}, Ll/ۚ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    const/16 v7, 0x9

    const/4 v8, 0x0

    .line 46
    invoke-static {v0, v4, v8, v7}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;II)I

    move-result v9

    if-nez v9, :cond_0

    const/4 v4, 0x0

    const/4 v8, 0x0

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    const/16 v8, 0x8

    .line 48
    :goto_0
    invoke-static {v0, v5}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 49
    iget-object v4, v10, Ll/ܰ᩵ۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v4}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v5

    .line 50
    invoke-static {v6, v5, v1}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 51
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    invoke-static {v0, v2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v6, 0x0

    .line 53
    :goto_1
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v12

    const-string v13, "path"

    if-ge v6, v12, :cond_1

    .line 55
    :try_start_0
    invoke-virtual {v0, v6}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v12

    invoke-static {v2, v12}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v14, "sourcePath"

    const-string v15, "entryPath"

    .line 56
    filled-new-array {v14, v15}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v14}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 57
    invoke-direct {v10, v12, v5}, Ll/ܰ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ll/۟ۢۜ;)Ll/ۨ᩵ۜ;

    move-result-object v12

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 59
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v1, v13, v11}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    filled-new-array {v6}, [I

    move-result-object v2

    invoke-static {v2}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "operationIndexes"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 60
    throw v0

    .line 63
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 64
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۨ᩵ۜ;

    iget-object v6, v6, Ll/ۨ᩵ۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 66
    :cond_2
    :try_start_1
    invoke-virtual {v4, v0}, Ll/ᩳۖۜ;->֫(Ljava/util/List;)Ll/ۤۖۜ;

    move-result-object v12
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 68
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 69
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨ᩵ۜ;

    invoke-direct {v10, v4, v11, v5, v2}, Ll/ܰ᩵ۜ;->֫(Ll/ۨ᩵ۜ;Ljava/lang/String;Ll/۟ۢۜ;I)Ljava/util/LinkedHashMap;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v6}, Ll/᩸᩵ۜ;->֫(Ljava/util/LinkedHashMap;Z)Ll/᩸᩵ۜ;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 71
    :cond_3
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v1, v0}, Ll/ܰ᩵ۜ;->֫(Ljava/util/Collection;Ljava/util/ArrayList;)Ll/ۙ᩵ۜ;

    move-result-object v0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v2, v11

    move-object v4, v5

    move-object v5, v0

    .line 72
    invoke-direct/range {v1 .. v9}, Ll/ܰ᩵ۜ;->֫(Ljava/lang/String;ZLl/۟ۢۜ;Ll/ۙ᩵ۜ;Ll/ᩳܰۡ;Ljava/lang/String;II)Lbin/mt/json/JSONObject;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :try_start_3
    invoke-virtual {v12}, Ll/ۤۖۜ;->close()V
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_1

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 66
    :try_start_4
    invoke-virtual {v12}, Ll/ۤۖۜ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_5
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception v0

    const-string v1, "FILE_OPERATION_INTERRUPTED"

    .line 150
    iget-object v2, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "ZIP operation was cancelled"

    .line 151
    iget-object v0, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "ZIP_OPERATION_CANCELLED"

    invoke-static {v0, v2, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 153
    :cond_4
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v1, v13, v11}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 74
    throw v0
.end method

.method public final ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 28

    move-object/from16 v10, p0

    move-object/from16 v0, p1

    const-string v1, "overwrite"

    const-string v2, "entryPath"

    const-string v3, "type"

    const-string v11, "path"

    const-string v4, "operations"

    const-string v5, "password"

    .line 80
    filled-new-array {v11, v4, v5}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 81
    invoke-static {v0, v5}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 82
    iget-object v5, v10, Ll/ܰ᩵ۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v5}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v6

    .line 83
    invoke-static {v0, v11}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6, v11}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 84
    invoke-virtual {v6, v12}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 85
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 86
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 88
    invoke-static {v0, v4}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v13, 0x0

    .line 89
    :goto_0
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v14

    const-string v15, "rename"

    move-object/from16 v16, v7

    const-string v7, "delete"

    move-object/from16 v17, v5

    const-string v5, "add"

    if-ge v13, v14, :cond_8

    .line 91
    :try_start_0
    invoke-virtual {v0, v13}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v14

    invoke-static {v4, v14}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 p1, v0

    .line 92
    invoke-static {v14, v3}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v24, v4

    .line 93
    invoke-static {v14, v2}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v25, v11

    .line 94
    :try_start_1
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    invoke-static {v4, v2, v11}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 95
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "sourcePath"

    .line 96
    filled-new-array {v3, v5, v2, v1}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v5}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 97
    invoke-direct {v10, v14, v6}, Ll/ܰ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ll/۟ۢۜ;)Ll/ۨ᩵ۜ;

    move-result-object v5

    .line 98
    new-instance v7, Ll/ۤ᩵ۜ;

    const-string v21, ""

    invoke-static {v14, v1}, Ll/ۚ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v22

    move-object/from16 v18, v7

    move-object/from16 v19, v0

    move-object/from16 v20, v4

    move-object/from16 v23, v5

    invoke-direct/range {v18 .. v23}, Ll/ۤ᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLl/ۨ᩵ۜ;)V

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object v0, v5, Ll/ۨ᩵ۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 100
    :cond_0
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0

    const-string v7, "/"

    if-eqz v5, :cond_3

    .line 101
    :try_start_2
    invoke-virtual {v4, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_0

    const-string v7, "recursive"

    if-eqz v5, :cond_1

    .line 103
    :try_start_3
    filled-new-array {v3, v2, v7}, [Ljava/lang/String;

    move-result-object v11

    goto :goto_1

    .line 104
    :cond_1
    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v11

    .line 102
    :goto_1
    invoke-static {v14, v11}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 105
    new-instance v11, Ll/ۤ᩵ۜ;

    const-string v21, ""

    if-eqz v5, :cond_2

    invoke-static {v14, v7}, Ll/ۚ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    const/16 v22, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    const/16 v22, 0x0

    :goto_2
    const/16 v23, 0x0

    move-object/from16 v18, v11

    move-object/from16 v19, v0

    move-object/from16 v20, v4

    invoke-direct/range {v18 .. v23}, Ll/ۤ᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLl/ۨ᩵ۜ;)V

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    move-object/from16 v26, v1

    move-object/from16 v27, v2

    goto :goto_7

    .line 106
    :cond_3
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 107
    invoke-virtual {v4, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_0

    const-string v11, "mergeDirectories"

    const-string v15, "newEntryPath"

    if-eqz v5, :cond_4

    .line 109
    :try_start_4
    filled-new-array {v3, v2, v15, v11}, [Ljava/lang/String;

    move-result-object v18

    :goto_4
    move-object/from16 v26, v1

    move-object/from16 v1, v18

    goto :goto_5

    .line 110
    :cond_4
    filled-new-array {v3, v2, v15}, [Ljava/lang/String;

    move-result-object v18

    goto :goto_4

    .line 108
    :goto_5
    invoke-static {v14, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 111
    invoke-static {v14, v15}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v27, v2

    const/4 v2, 0x0

    invoke-static {v1, v15, v2}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    invoke-virtual {v1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-ne v5, v2, :cond_6

    .line 115
    new-instance v2, Ll/ۤ᩵ۜ;

    if-eqz v5, :cond_5

    .line 116
    invoke-static {v14, v11}, Ll/ۚ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    const/16 v22, 0x1

    goto :goto_6

    :cond_5
    const/4 v5, 0x0

    const/16 v22, 0x0

    :goto_6
    const/16 v23, 0x0

    move-object/from16 v18, v2

    move-object/from16 v19, v0

    move-object/from16 v20, v4

    move-object/from16 v21, v1

    invoke-direct/range {v18 .. v23}, Ll/ۤ᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLl/ۨ᩵ۜ;)V

    .line 115
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p1

    move-object/from16 v7, v16

    move-object/from16 v5, v17

    move-object/from16 v4, v24

    move-object/from16 v11, v25

    move-object/from16 v1, v26

    move-object/from16 v2, v27

    goto/16 :goto_0

    .line 113
    :cond_6
    invoke-static {v1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "Renaming must preserve the entry type"

    invoke-static {v0, v15, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 118
    :cond_7
    invoke-static {v0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "Expected add, delete, or rename"

    invoke-static {v0, v3, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    goto :goto_8

    :catch_1
    move-exception v0

    move-object/from16 v25, v11

    .line 122
    :goto_8
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    move-object/from16 v11, v25

    invoke-virtual {v1, v11, v12}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    filled-new-array {v13}, [I

    move-result-object v2

    invoke-static {v2}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "operationIndexes"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 123
    throw v0

    :cond_8
    move-object/from16 v0, v17

    .line 126
    :try_start_5
    invoke-virtual {v0, v8}, Ll/ᩳۖۜ;->֫(Ljava/util/List;)Ll/ۤۖۜ;

    move-result-object v13
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_4

    const/4 v1, 0x0

    .line 127
    :try_start_6
    invoke-static {v0, v12, v1}, Ll/ۚ᩵ۜ;->֫(Ll/ᩳۖۜ;Ljava/lang/String;Z)Ll/۫᩵ܿ;

    .line 129
    invoke-virtual {v0, v12}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Z)Ll/ᩳܰۡ;

    move-result-object v14
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 130
    :try_start_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    :goto_9
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_c

    .line 132
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤ᩵ۜ;

    .line 133
    iget-object v3, v2, Ll/ۤ᩵ۜ;->ܿ:Ljava/lang/String;

    iget-object v4, v2, Ll/ۤ᩵ۜ;->֫:Ljava/lang/String;

    iget-boolean v8, v2, Ll/ۤ᩵ۜ;->ᩳ:Z

    move-object/from16 v17, v9

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-object/from16 v25, v11

    const v11, -0x4f997a55

    if-eq v9, v11, :cond_a

    const v11, -0x37b4c8c2

    if-eq v9, v11, :cond_9

    const v4, 0x178a1

    if-ne v9, v4, :cond_b

    :try_start_8
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 134
    iget-object v2, v2, Ll/ۤ᩵ۜ;->ۧ:Ll/ۨ᩵ۜ;

    invoke-direct {v10, v2, v12, v6, v1}, Ll/ܰ᩵ۜ;->֫(Ll/ۨ᩵ۜ;Ljava/lang/String;Ll/۟ۢۜ;I)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-static {v2, v8}, Ll/᩸᩵ۜ;->֫(Ljava/util/LinkedHashMap;Z)Ll/᩸᩵ۜ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 133
    :cond_9
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 136
    iget-object v2, v2, Ll/ۤ᩵ۜ;->ܽ:Ljava/lang/String;

    invoke-static {v4, v2, v8}, Ll/᩸᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)Ll/᩸᩵ۜ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 133
    :cond_a
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 135
    invoke-static {v4, v8}, Ll/᩸᩵ۜ;->֫(Ljava/lang/String;Z)Ll/᩸᩵ۜ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_a
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v9, v17

    move-object/from16 v11, v25

    goto :goto_9

    .line 137
    :cond_b
    new-instance v0, Ljava/lang/AssertionError;

    iget-object v1, v2, Ll/ۤ᩵ۜ;->ܿ:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_c
    move-object/from16 v25, v11

    .line 140
    invoke-virtual {v14}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ܰ᩵ۜ;->֫(Ljava/util/Collection;Ljava/util/ArrayList;)Ll/ۙ᩵ۜ;

    move-result-object v5

    const/16 v8, 0x8

    const/4 v9, -0x1

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object v2, v12

    move-object v4, v6

    move-object v6, v14

    move-object/from16 v7, v16

    invoke-direct/range {v1 .. v9}, Ll/ܰ᩵ۜ;->֫(Ljava/lang/String;ZLl/۟ۢۜ;Ll/ۙ᩵ۜ;Ll/ᩳܰۡ;Ljava/lang/String;II)Lbin/mt/json/JSONObject;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 142
    :try_start_9
    invoke-virtual {v14}, Ll/ᩳܰۡ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 143
    :try_start_a
    invoke-virtual {v13}, Ll/ۤۖۜ;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ll/ۗۛ᩻; {:try_start_a .. :try_end_a} :catch_2

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object/from16 v25, v11

    :goto_b
    move-object v1, v0

    .line 129
    :try_start_b
    invoke-virtual {v14}, Ll/ᩳܰۡ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_c
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catchall_3
    move-exception v0

    goto :goto_d

    :catchall_4
    move-exception v0

    move-object/from16 v25, v11

    :goto_d
    move-object v1, v0

    .line 126
    :try_start_d
    invoke-virtual {v13}, Ll/ۤۖۜ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_e

    :catchall_5
    move-exception v0

    move-object v2, v0

    :try_start_e
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v1
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ll/ۗۛ᩻; {:try_start_e .. :try_end_e} :catch_2

    :catch_2
    move-exception v0

    goto :goto_f

    :catch_3
    move-exception v0

    move-object/from16 v2, v25

    goto :goto_10

    :catch_4
    move-exception v0

    move-object/from16 v25, v11

    :goto_f
    const-string v1, "FILE_OPERATION_INTERRUPTED"

    .line 150
    iget-object v2, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "ZIP operation was cancelled"

    .line 151
    iget-object v0, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "ZIP_OPERATION_CANCELLED"

    invoke-static {v0, v2, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 153
    :cond_d
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    move-object/from16 v2, v25

    invoke-virtual {v1, v2, v12}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 146
    throw v0

    :catch_5
    move-exception v0

    move-object v2, v11

    .line 334
    :goto_10
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "ZIP I/O failed: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v1}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 335
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v2, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "ZIP_IO_ERROR"

    const-string v3, "fatal"

    const/4 v4, 0x0

    .line 334
    invoke-static {v2, v0, v3, v4, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 144
    throw v0
.end method
