.class public final Ll/ۛܰ᩵;
.super Ljava/lang/Object;
.source "M4F8"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۜ:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/util/ArrayList;

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 977
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 969
    iput-object v0, p0, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    .line 970
    iput-object v0, p0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    const/4 v1, -0x1

    .line 972
    iput v1, p0, Ll/ۛܰ᩵;->᩻:I

    .line 973
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ۛܰ᩵;->ܽ:Ljava/util/ArrayList;

    .line 978
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1260
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1261
    iget-object v1, p0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 1262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    .line 1263
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "//"

    .line 1265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    :goto_0
    iget-object v1, p0, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/16 v2, 0x3a

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 1269
    :cond_1
    iget-object v1, p0, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1270
    iget-object v1, p0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 1271
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1272
    iget-object v1, p0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x40

    .line 1274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1277
    :cond_3
    iget-object v1, p0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    const/4 v3, -0x1

    if-eqz v1, :cond_5

    .line 1278
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-eq v1, v3, :cond_4

    const/16 v1, 0x5b

    .line 1280
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1281
    iget-object v1, p0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    .line 1282
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1284
    :cond_4
    iget-object v1, p0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1288
    :cond_5
    :goto_1
    iget v1, p0, Ll/ۛܰ᩵;->᩻:I

    if-ne v1, v3, :cond_6

    iget-object v4, p0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    if-eqz v4, :cond_9

    :cond_6
    if-eq v1, v3, :cond_7

    goto :goto_2

    .line 1039
    :cond_7
    iget-object v1, p0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۨܰ᩵;->ۧ(Ljava/lang/String;)I

    move-result v1

    .line 1290
    :goto_2
    iget-object v3, p0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-static {v3}, Ll/ۨܰ᩵;->ۧ(Ljava/lang/String;)I

    move-result v3

    if-eq v1, v3, :cond_9

    .line 1291
    :cond_8
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1292
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 552
    :cond_9
    iget-object v1, p0, Ll/ۛܰ᩵;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v2, :cond_a

    const/16 v4, 0x2f

    .line 553
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 554
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 1298
    :cond_a
    iget-object v1, p0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    if-eqz v1, :cond_b

    const/16 v1, 0x3f

    .line 1299
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1300
    iget-object v1, p0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/ۨܰ᩵;->֫(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 1303
    :cond_b
    iget-object v1, p0, Ll/ۛܰ᩵;->֫:Ljava/lang/String;

    if-eqz v1, :cond_c

    const/16 v1, 0x23

    .line 1304
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1305
    iget-object v1, p0, Ll/ۛܰ᩵;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1308
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۨܰ᩵;
    .locals 2

    .line 1254
    iget-object v0, p0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1255
    iget-object v0, p0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1256
    new-instance v0, Ll/ۨܰ᩵;

    invoke-direct {v0, p0}, Ll/ۨܰ᩵;-><init>(Ll/ۛܰ᩵;)V

    return-object v0

    .line 1255
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1254
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/ۨܰ᩵;Ljava/lang/String;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    .line 1314
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v10, 0x0

    invoke-static {v10, v2, v9}, Ll/᩶۟᩵;->ۧ(IILjava/lang/String;)I

    move-result v8

    .line 1315
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v8, v2, v9}, Ll/᩶۟᩵;->ܽ(IILjava/lang/String;)I

    move-result v13

    sub-int v2, v13, v8

    const/16 v11, 0x3a

    const/4 v12, -0x1

    const/4 v14, 0x2

    if-ge v2, v14, :cond_0

    goto :goto_2

    .line 1534
    :cond_0
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5a

    const/16 v4, 0x41

    const/16 v5, 0x7a

    const/16 v6, 0x61

    if-lt v2, v6, :cond_1

    if-le v2, v5, :cond_2

    :cond_1
    if-lt v2, v4, :cond_8

    if-le v2, v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v8, 0x1

    :goto_0
    if-ge v2, v13, :cond_8

    .line 1538
    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_3

    if-le v7, v5, :cond_7

    :cond_3
    if-lt v7, v4, :cond_4

    if-le v7, v3, :cond_7

    :cond_4
    const/16 v15, 0x30

    if-lt v7, v15, :cond_5

    const/16 v15, 0x39

    if-le v7, v15, :cond_7

    :cond_5
    const/16 v15, 0x2b

    if-eq v7, v15, :cond_7

    const/16 v15, 0x2d

    if-eq v7, v15, :cond_7

    const/16 v15, 0x2e

    if-ne v7, v15, :cond_6

    goto :goto_1

    :cond_6
    if-ne v7, v11, :cond_8

    move v15, v2

    goto :goto_3

    :cond_7
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    :goto_2
    const/4 v2, -0x1

    const/4 v15, -0x1

    :goto_3
    if-eq v15, v12, :cond_b

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v3, 0x1

    const-string v5, "https:"

    move-object/from16 v2, p2

    move v4, v8

    .line 1320
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "https"

    .line 1321
    iput-object v2, v0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    add-int/lit8 v8, v8, 0x6

    goto :goto_4

    :cond_9
    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v3, 0x1

    const-string v5, "http:"

    move-object/from16 v2, p2

    move v4, v8

    .line 1323
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "http"

    .line 1324
    iput-object v2, v0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    add-int/lit8 v8, v8, 0x5

    goto :goto_4

    .line 1327
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1328
    invoke-virtual {v9, v10, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    if-eqz v1, :cond_2f

    .line 1331
    iget-object v2, v1, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    iput-object v2, v0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    :goto_4
    const/4 v2, 0x0

    move v3, v8

    :goto_5
    const/16 v15, 0x2f

    const/16 v4, 0x5c

    if-ge v3, v13, :cond_d

    .line 1561
    invoke-virtual {v9, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v4, :cond_c

    if-ne v5, v15, :cond_d

    :cond_c
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_d
    const/16 v3, 0x3f

    .line 1341
    iget-object v7, v0, Ll/ۛܰ᩵;->ܽ:Ljava/util/ArrayList;

    const/16 v5, 0x23

    if-ge v2, v14, :cond_12

    if-eqz v1, :cond_12

    iget-object v6, v1, Ll/ۨܰ᩵;->᩻:Ljava/lang/String;

    iget-object v14, v0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_7

    .line 1413
    :cond_e
    invoke-virtual/range {p1 .. p1}, Ll/ۨܰ᩵;->ܿ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    .line 1414
    invoke-virtual/range {p1 .. p1}, Ll/ۨܰ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    .line 1415
    iget-object v2, v1, Ll/ۨܰ᩵;->ۧ:Ljava/lang/String;

    iput-object v2, v0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    .line 1416
    iget v2, v1, Ll/ۨܰ᩵;->ܿ:I

    iput v2, v0, Ll/ۛܰ᩵;->᩻:I

    .line 1417
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 1418
    invoke-virtual/range {p1 .. p1}, Ll/ۨܰ᩵;->ܽ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eq v8, v13, :cond_f

    .line 1419
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_11

    .line 1420
    :cond_f
    invoke-virtual/range {p1 .. p1}, Ll/ۨܰ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_10

    const/16 v17, 0x0

    .line 1759
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v18

    const-string v19, " \"\'<>#"

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x1

    .line 1758
    invoke-static/range {v16 .. v23}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    .line 1141
    invoke-static {v1}, Ll/ۨܰ᩵;->ᩳ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_6

    :cond_10
    const/4 v1, 0x0

    .line 1143
    :goto_6
    iput-object v1, v0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    :cond_11
    move-object/from16 p1, v7

    move-object v11, v9

    goto/16 :goto_10

    :cond_12
    :goto_7
    add-int/2addr v8, v2

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v2, v8

    move-object v1, v9

    const/4 v14, 0x0

    const/16 v16, 0x0

    :goto_8
    const-string v6, "@/\\?#"

    .line 1354
    invoke-static {v1, v2, v13, v6}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result v8

    if-eq v8, v13, :cond_13

    .line 1356
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_9

    :cond_13
    const/4 v6, -0x1

    :goto_9
    if-eq v6, v12, :cond_18

    if-eq v6, v5, :cond_18

    if-eq v6, v15, :cond_18

    if-eq v6, v4, :cond_18

    if-eq v6, v3, :cond_18

    const/16 v3, 0x40

    if-eq v6, v3, :cond_14

    move-object/from16 p1, v7

    goto/16 :goto_b

    :cond_14
    const-string v6, "%40"

    if-nez v14, :cond_17

    .line 1362
    invoke-static {v1, v2, v8, v11}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v5

    const/16 v17, 0x0

    const/16 v18, 0x1

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/16 v19, 0x1

    const/16 v20, 0x0

    move-object/from16 v1, p2

    move v3, v5

    move v15, v5

    move/from16 v5, v19

    move-object v12, v6

    move/from16 v6, v20

    move-object/from16 p1, v7

    move/from16 v7, v17

    move v10, v8

    move/from16 v8, v18

    .line 1364
    invoke-static/range {v1 .. v8}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    if-eqz v16, :cond_15

    .line 1368
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v12, v1}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1369
    :cond_15
    iput-object v1, v0, Ll/ۛܰ᩵;->ܿ:Ljava/lang/String;

    if-eq v15, v10, :cond_16

    add-int/lit8 v2, v15, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object/from16 v1, p2

    move v3, v10

    .line 1372
    invoke-static/range {v1 .. v8}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    const/4 v14, 0x1

    :cond_16
    const/16 v16, 0x1

    goto :goto_a

    :cond_17
    move-object v12, v6

    move-object/from16 p1, v7

    move v10, v8

    .line 1378
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object/from16 v1, p2

    move v3, v10

    invoke-static/range {v1 .. v8}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۛܰ᩵;->ۧ:Ljava/lang/String;

    :goto_a
    add-int/lit8 v2, v10, 0x1

    move-object v1, v9

    :goto_b
    const/16 v5, 0x23

    const/16 v4, 0x5c

    const/16 v3, 0x3f

    move-object/from16 v7, p1

    const/4 v10, 0x0

    const/4 v12, -0x1

    const/16 v15, 0x2f

    goto/16 :goto_8

    :cond_18
    move-object/from16 p1, v7

    move v10, v8

    move v8, v2

    :goto_c
    if-ge v8, v10, :cond_1b

    .line 1575
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v11, :cond_1c

    const/16 v4, 0x5b

    if-eq v3, v4, :cond_19

    goto :goto_d

    :cond_19
    add-int/lit8 v8, v8, 0x1

    if-ge v8, v10, :cond_1a

    .line 1578
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5d

    if-ne v3, v4, :cond_19

    :cond_1a
    :goto_d
    add-int/lit8 v8, v8, 0x1

    goto :goto_c

    :cond_1b
    move v8, v10

    :cond_1c
    add-int/lit8 v3, v8, 0x1

    const/16 v4, 0x22

    if-ge v3, v10, :cond_1f

    const/4 v5, 0x0

    .line 1591
    invoke-static {v1, v2, v8, v5}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v5

    .line 1592
    invoke-static {v5}, Ll/᩶۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1393
    iput-object v5, v0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    :try_start_0
    const-string v20, ""

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v1

    move/from16 v18, v3

    move/from16 v19, v10

    .line 1598
    invoke-static/range {v17 .. v24}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v5

    .line 1599
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-lez v5, :cond_1d

    const v6, 0xffff

    if-gt v5, v6, :cond_1d

    goto :goto_e

    :catch_0
    :cond_1d
    const/4 v5, -0x1

    .line 1394
    :goto_e
    iput v5, v0, Ll/ۛܰ᩵;->᩻:I

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1e

    goto :goto_f

    .line 1396
    :cond_1e
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Invalid URL port: \""

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1397
    invoke-virtual {v1, v3, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1f
    const/4 v3, 0x0

    .line 1591
    invoke-static {v1, v2, v8, v3}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v3

    .line 1592
    invoke-static {v3}, Ll/᩶۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1400
    iput-object v3, v0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    .line 1401
    iget-object v3, v0, Ll/ۛܰ᩵;->ۜ:Ljava/lang/String;

    invoke-static {v3}, Ll/ۨܰ᩵;->ۧ(Ljava/lang/String;)I

    move-result v3

    iput v3, v0, Ll/ۛܰ᩵;->᩻:I

    .line 1403
    :goto_f
    iget-object v3, v0, Ll/ۛܰ᩵;->ܳ:Ljava/lang/String;

    if-eqz v3, :cond_2e

    move-object v11, v1

    move v8, v10

    :goto_10
    const-string v1, "?#"

    .line 1425
    invoke-static {v11, v8, v13, v1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    if-ne v8, v1, :cond_20

    goto/16 :goto_18

    .line 1452
    :cond_20
    invoke-virtual {v11, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const-string v3, ""

    const/16 v4, 0x2f

    if-eq v2, v4, :cond_22

    const/16 v4, 0x5c

    if-ne v2, v4, :cond_21

    goto :goto_11

    .line 1460
    :cond_21
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v4, p1

    invoke-virtual {v4, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_22
    :goto_11
    move-object/from16 v4, p1

    .line 1455
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 1456
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    :goto_12
    move v15, v8

    :goto_13
    if-ge v15, v1, :cond_2b

    const-string v2, "/\\"

    .line 1465
    invoke-static {v11, v15, v1, v2}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result v2

    if-ge v2, v1, :cond_23

    const/4 v5, 0x1

    goto :goto_14

    :cond_23
    const/4 v5, 0x0

    :goto_14
    const/16 v20, 0x0

    const/16 v21, 0x1

    const-string v17, " \"<>^`{}|/\\?#"

    const/16 v18, 0x1

    const/16 v19, 0x0

    move-object v14, v11

    move/from16 v16, v2

    .line 1476
    invoke-static/range {v14 .. v21}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v6

    const-string v7, "."

    .line 1496
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_29

    const-string v7, "%2e"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_24

    goto :goto_17

    :cond_24
    const-string v7, ".."

    .line 1500
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_27

    const-string v7, "%2e."

    .line 1501
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_27

    const-string v7, ".%2e"

    .line 1502
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_27

    const-string v7, "%2e%2e"

    .line 1503
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_25

    goto :goto_16

    :cond_25
    const/4 v7, 0x1

    .line 0
    invoke-static {v4, v7}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v8

    .line 1485
    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_26

    .line 1486
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v7

    invoke-virtual {v4, v8, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_15

    .line 1488
    :cond_26
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_15
    if-eqz v5, :cond_29

    .line 1491
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_27
    :goto_16
    const/4 v6, 0x1

    .line 0
    invoke-static {v4, v6}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v7

    .line 1517
    check-cast v7, Ljava/lang/String;

    .line 1520
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_28

    .line 1521
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v6

    invoke-virtual {v4, v7, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_17

    .line 1523
    :cond_28
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    :goto_17
    if-eqz v5, :cond_2a

    add-int/lit8 v2, v2, 0x1

    :cond_2a
    move v15, v2

    goto/16 :goto_13

    :cond_2b
    :goto_18
    if-ge v1, v13, :cond_2c

    .line 1430
    invoke-virtual {v11, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x3f

    if-ne v2, v3, :cond_2c

    const/16 v2, 0x23

    .line 1431
    invoke-static {v11, v1, v13, v2}, Ll/᩶۟᩵;->֫(Ljava/lang/String;IIC)I

    move-result v3

    add-int/lit8 v15, v1, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x1

    const-string v17, " \"\'<>#"

    const/16 v18, 0x1

    const/16 v19, 0x0

    move-object v14, v11

    move/from16 v16, v3

    .line 1432
    invoke-static/range {v14 .. v21}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۨܰ᩵;->ᩳ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Ll/ۛܰ᩵;->ᩳ:Ljava/util/ArrayList;

    move v1, v3

    goto :goto_19

    :cond_2c
    const/16 v2, 0x23

    :goto_19
    if-ge v1, v13, :cond_2d

    .line 1438
    invoke-virtual {v11, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v2, :cond_2d

    add-int/lit8 v12, v1, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v14, ""

    const/4 v15, 0x1

    const/16 v16, 0x0

    .line 1439
    invoke-static/range {v11 .. v18}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۛܰ᩵;->֫:Ljava/lang/String;

    :cond_2d
    return-void

    .line 1404
    :cond_2e
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Invalid URL host: \""

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1405
    invoke-virtual {v1, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 1333
    :cond_2f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expected URL scheme \'http\' or \'https\' but no colon was found"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
