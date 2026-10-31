.class public final Ll/ۤ᩻ۘ;
.super Ljava/io/InputStream;
.source "27ZX"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:J

.field public ۙ:I

.field public final synthetic ۛ:[B

.field public final synthetic ۤ:Ll/֫ۜۘ;

.field public ۫:I

.field public ۬:[B

.field public ᩶:Ll/ۛ᩻ۘ;

.field public ᩸:[B

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/֫ۜۘ;J[B)V
    .locals 0

    .line 1309
    iput-object p1, p0, Ll/ۤ᩻ۘ;->ۤ:Ll/֫ۜۘ;

    iput-object p4, p0, Ll/ۤ᩻ۘ;->ۛ:[B

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 p1, 0x0

    .line 1311
    iput-boolean p1, p0, Ll/ۤ᩻ۘ;->᩹:Z

    .line 1312
    iput p1, p0, Ll/ۤ᩻ۘ;->۫:I

    const/4 p1, 0x1

    new-array p4, p1, [B

    .line 1313
    iput-object p4, p0, Ll/ۤ᩻ۘ;->᩸:[B

    const/16 p4, 0x400

    new-array p4, p4, [B

    .line 1314
    iput-object p4, p0, Ll/ۤ᩻ۘ;->۬:[B

    .line 1315
    new-instance p4, Ll/ۛ᩻ۘ;

    .line 2897
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 1315
    iput-object p4, p0, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    .line 1316
    iput p1, p0, Ll/ۤ᩻ۘ;->ۙ:I

    .line 1317
    iput-wide p2, p0, Ll/ۤ᩻ۘ;->ۗ:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1504
    iget-boolean v0, p0, Ll/ۤ᩻ۘ;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1506
    iput-boolean v0, p0, Ll/ۤ᩻ۘ;->᩹:Z

    .line 1509
    iget-object v0, p0, Ll/ۤ᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v1

    iget-object v2, p0, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    invoke-static {v0}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ll/۟᩻ۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 1511
    :try_start_0
    iget-object v1, p0, Ll/ۤ᩻ۘ;->ۛ:[B

    iget-object v2, p0, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    invoke-static {v0, v1, v2}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[BLl/ۛ᩻ۘ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1515
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 1513
    throw v0
.end method

.method public final read()I
    .locals 4

    .line 1321
    iget-boolean v0, p0, Ll/ۤ᩻ۘ;->᩹:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1323
    iget-object v2, p0, Ll/ۤ᩻ۘ;->᩸:[B

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v0}, Ll/ۤ᩻ۘ;->read([BII)I

    move-result v0

    if-ne v0, v1, :cond_1

    :goto_0
    return v1

    .line 1327
    :cond_1
    aget-byte v0, v2, v3

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    .line 1333
    iget-boolean v0, p0, Ll/ۤ᩻ۘ;->᩹:Z

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    .line 1335
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۤ᩻ۘ;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    move/from16 v3, p3

    .line 1340
    iget-boolean v4, v1, Ll/ۤ᩻ۘ;->᩹:Z

    const/4 v5, -0x1

    if-eqz v4, :cond_0

    :goto_0
    const/4 v0, -0x1

    goto/16 :goto_5

    .line 1343
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz v2, :cond_16

    if-ltz v3, :cond_16

    add-int v4, v2, v3

    .line 1345
    array-length v6, v0

    if-gt v4, v6, :cond_16

    const/4 v4, 0x0

    if-nez v3, :cond_2

    :cond_1
    const/4 v2, 0x0

    goto/16 :goto_9

    .line 1352
    :cond_2
    iget v6, v1, Ll/ۤ᩻ۘ;->۫:I

    if-lez v6, :cond_5

    if-le v6, v3, :cond_3

    goto :goto_1

    :cond_3
    move v3, v6

    .line 1356
    :goto_1
    iget-object v5, v1, Ll/ۤ᩻ۘ;->۬:[B

    invoke-static {v5, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1357
    iget v0, v1, Ll/ۤ᩻ۘ;->۫:I

    if-eq v3, v0, :cond_4

    .line 1358
    iget-object v2, v1, Ll/ۤ᩻ۘ;->۬:[B

    sub-int/2addr v0, v3

    invoke-static {v2, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1368
    :cond_4
    iget v0, v1, Ll/ۤ᩻ۘ;->۫:I

    sub-int/2addr v0, v3

    iput v0, v1, Ll/ۤ᩻ۘ;->۫:I

    return v3

    .line 1372
    :cond_5
    iget-object v12, v1, Ll/ۤ᩻ۘ;->ۤ:Ll/֫ۜۘ;

    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v6

    iget-object v6, v6, Ll/ܺ᩻ۘ;->֫:[B

    array-length v6, v6

    add-int/lit8 v6, v6, -0xd

    if-ge v6, v3, :cond_6

    .line 1373
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v3

    iget-object v3, v3, Ll/ܺ᩻ۘ;->֫:[B

    array-length v3, v3

    add-int/lit8 v3, v3, -0xd

    .line 1375
    :cond_6
    invoke-static {v12}, Ll/֫ۜۘ;->ܿ(Ll/֫ۜۘ;)I

    move-result v6

    const/16 v7, 0x400

    if-nez v6, :cond_7

    if-le v3, v7, :cond_7

    const/16 v3, 0x400

    .line 1379
    :cond_7
    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1382
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v6

    iget-object v6, v6, Ll/ܺ᩻ۘ;->֫:[B

    array-length v6, v6

    add-int/lit8 v6, v6, -0xd

    .line 1383
    invoke-static {v12}, Ll/֫ۜۘ;->ܿ(Ll/֫ۜۘ;)I

    move-result v7

    if-nez v7, :cond_8

    const/16 v6, 0x400

    const/16 v13, 0x400

    goto :goto_2

    :cond_8
    move v13, v6

    .line 1387
    :goto_2
    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v6

    .line 1210
    iget v6, v6, Ll/۟᩻ۘ;->֫:I

    .line 1387
    iget v7, v1, Ll/ۤ᩻ۘ;->ۙ:I

    iget-object v8, v1, Ll/ۤ᩻ۘ;->ۛ:[B

    const-string v14, "error"

    if-ge v6, v7, :cond_9

    .line 1389
    :try_start_0
    iget-wide v9, v1, Ll/ۤ᩻ۘ;->ۗ:J

    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v11

    move-object v6, v12

    move-object v7, v8

    move-wide v8, v9

    move v10, v13

    invoke-static/range {v6 .. v11}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[BJILl/۟᩻ۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1393
    iget-wide v6, v1, Ll/ۤ᩻ۘ;->ۗ:J

    int-to-long v8, v13

    add-long/2addr v6, v8

    iput-wide v6, v1, Ll/ۤ᩻ۘ;->ۗ:J

    goto :goto_2

    .line 1391
    :catch_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v14}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1397
    :cond_9
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v6

    iget-object v7, v1, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    invoke-static {v12, v6, v7}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    iput-object v7, v1, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    .line 1398
    iget v6, v7, Ll/ۛ᩻ۘ;->֫:I

    iput v6, v1, Ll/ۤ᩻ۘ;->۫:I

    .line 1399
    iget v6, v7, Ll/ۛ᩻ۘ;->ܽ:I

    .line 1404
    :try_start_1
    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v7

    iget-object v9, v1, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    iget v9, v9, Ll/ۛ᩻ۘ;->ۧ:I

    invoke-virtual {v7, v9}, Ll/۟᩻ۘ;->֫(I)Ll/ܰ᩻ۘ;

    move-result-object v10
    :try_end_1
    .catch Ll/᩺᩻ۘ; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ll/ܽۡۘ; {:try_start_1 .. :try_end_1} :catch_2

    const/16 v7, 0x65

    if-eq v6, v7, :cond_b

    const/16 v9, 0x67

    if-ne v6, v9, :cond_a

    goto :goto_3

    .line 1415
    :cond_a
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v14}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_3
    const/4 v11, 0x1

    if-ne v6, v7, :cond_d

    .line 1418
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v0

    iget v2, v1, Ll/ۤ᩻ۘ;->۫:I

    invoke-static {v12, v0, v2}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;Ll/ܺ᩻ۘ;I)V

    .line 1419
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1420
    iput v4, v1, Ll/ۤ᩻ۘ;->۫:I

    if-ne v0, v11, :cond_c

    .line 1422
    invoke-virtual/range {p0 .. p0}, Ll/ۤ᩻ۘ;->close()V

    return v5

    .line 1426
    :cond_c
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v14}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1429
    :cond_d
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v6

    .line 238
    iput v4, v6, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1430
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v6

    iget-object v6, v6, Ll/ܺ᩻ۘ;->֫:[B

    invoke-static {v12, v6}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[B)V

    .line 1431
    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v6

    .line 1432
    iget v7, v1, Ll/ۤ᩻ۘ;->۫:I

    add-int/lit8 v7, v7, -0x4

    iput v7, v1, Ll/ۤ᩻ۘ;->۫:I

    sub-int/2addr v7, v6

    int-to-long v4, v6

    if-lez v6, :cond_1

    if-le v6, v3, :cond_e

    goto :goto_4

    :cond_e
    move v3, v6

    .line 1448
    :goto_4
    invoke-static {v12}, Ll/֫ۜۘ;->ۧ(Ll/֫ۜۘ;)Ljava/io/InputStream;

    move-result-object v15

    invoke-virtual {v15, v0, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-gez v0, :cond_f

    goto/16 :goto_0

    :goto_5
    return v0

    :cond_f
    sub-int/2addr v6, v0

    .line 1453
    iput v6, v1, Ll/ۤ᩻ۘ;->۫:I

    if-lez v6, :cond_12

    .line 1456
    iget-object v2, v1, Ll/ۤ᩻ۘ;->۬:[B

    array-length v2, v2

    if-ge v2, v6, :cond_10

    .line 1457
    new-array v2, v6, [B

    iput-object v2, v1, Ll/ۤ᩻ۘ;->۬:[B

    :cond_10
    const/4 v13, 0x0

    :goto_6
    if-lez v6, :cond_12

    .line 1463
    invoke-static {v12}, Ll/֫ۜۘ;->ۧ(Ll/֫ۜۘ;)Ljava/io/InputStream;

    move-result-object v2

    iget-object v3, v1, Ll/ۤ᩻ۘ;->۬:[B

    invoke-virtual {v2, v3, v13, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-gtz v2, :cond_11

    goto :goto_7

    :cond_11
    add-int/2addr v13, v2

    sub-int/2addr v6, v2

    goto :goto_6

    :cond_12
    :goto_7
    if-lez v7, :cond_13

    .line 1472
    invoke-static {v12}, Ll/֫ۜۘ;->ۧ(Ll/֫ۜۘ;)Ljava/io/InputStream;

    move-result-object v2

    int-to-long v6, v7

    invoke-virtual {v2, v6, v7}, Ljava/io/InputStream;->skip(J)J

    .line 1475
    :cond_13
    iget-wide v2, v10, Ll/ܰ᩻ۘ;->ۧ:J

    cmp-long v6, v4, v2

    if-gez v6, :cond_14

    .line 1476
    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v2

    iget-object v3, v1, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v6

    invoke-virtual {v2, v6, v3}, Ll/۟᩻ۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 1478
    :try_start_2
    iget-wide v2, v10, Ll/ܰ᩻ۘ;->ܽ:J

    add-long v6, v2, v4

    iget-wide v2, v10, Ll/ܰ᩻ۘ;->ۧ:J

    sub-long/2addr v2, v4

    long-to-int v3, v2

    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v9

    move-object v4, v12

    move-object v5, v8

    move v8, v3

    invoke-static/range {v4 .. v9}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;[BJILl/۟᩻ۘ;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 1483
    iget-wide v2, v10, Ll/ܰ᩻ۘ;->ܽ:J

    iget-wide v4, v10, Ll/ܰ᩻ۘ;->ۧ:J

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/ۤ᩻ۘ;->ۗ:J

    goto :goto_8

    .line 1481
    :catch_1
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v14}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1486
    :cond_14
    :goto_8
    iget v2, v1, Ll/ۤ᩻ۘ;->ۙ:I

    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v3

    .line 1214
    iget-object v3, v3, Ll/۟᩻ۘ;->ܽ:[Ll/ܰ᩻ۘ;

    array-length v3, v3

    if-ge v2, v3, :cond_15

    .line 1487
    iget v2, v1, Ll/ۤ᩻ۘ;->ۙ:I

    add-int/2addr v2, v11

    iput v2, v1, Ll/ۤ᩻ۘ;->ۙ:I

    :cond_15
    return v0

    :goto_9
    return v2

    :catch_2
    move-exception v0

    .line 1411
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_3
    move-exception v0

    .line 1406
    iget-wide v2, v0, Ll/᩺᩻ۘ;->᩸:J

    iput-wide v2, v1, Ll/ۤ᩻ۘ;->ۗ:J

    .line 1407
    iget-object v0, v1, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    iget v0, v0, Ll/ۛ᩻ۘ;->֫:I

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    .line 1408
    invoke-static {v12}, Ll/֫ۜۘ;->ܽ(Ll/֫ۜۘ;)Ll/۟᩻ۘ;

    move-result-object v0

    iget-object v2, v1, Ll/ۤ᩻ۘ;->᩶:Ll/ۛ᩻ۘ;

    invoke-static {v12}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;)Ll/ܺ᩻ۘ;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ll/۟᩻ۘ;->֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    const/4 v2, 0x0

    return v2

    .line 1346
    :cond_16
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
