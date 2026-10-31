.class public final Ll/ܳۢᩴ;
.super Ll/ۨܿᩴ;
.source "25I"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583eaL


# instance fields
.field public transient ۗ:Ll/ۧۢᩴ;

.field public transient ۙ:Ll/ۧۢᩴ;

.field public transient ᩶:Ll/ۧۢᩴ;

.field public ᩸:I

.field public transient ᩹:[Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/16 v0, 0x30

    new-array v0, v0, [Z

    .line 256
    iput-object v0, p0, Ll/ܳۢᩴ;->᩹:[Z

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    const/4 v0, 0x0

    .line 59
    iput v0, p0, Ll/ܳۢᩴ;->᩸:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 2

    .line 1383
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    const/16 v0, 0x30

    new-array v0, v0, [Z

    .line 256
    iput-object v0, p0, Ll/ܳۢᩴ;->᩹:[Z

    .line 1388
    iget v0, p0, Ll/ܳۢᩴ;->᩸:I

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 1389
    invoke-static {p1, v0, v1, v1}, Ll/ܳۢᩴ;->֫(Ljava/io/ObjectInputStream;ILl/ۧۢᩴ;Ll/ۧۢᩴ;)Ll/ۧۢᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    .line 1392
    :goto_0
    invoke-virtual {p1}, Ll/ۧۢᩴ;->֫()Ll/ۧۢᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۧۢᩴ;->֫()Ll/ۧۢᩴ;

    move-result-object p1

    goto :goto_0

    .line 1393
    :cond_0
    iput-object p1, p0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 1394
    iget-object p1, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    .line 1395
    :goto_1
    invoke-virtual {p1}, Ll/ۧۢᩴ;->ܳ()Ll/ۧۢᩴ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۧۢᩴ;->ܳ()Ll/ۧۢᩴ;

    move-result-object p1

    goto :goto_1

    .line 1396
    :cond_1
    iput-object p1, p0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1339
    iget v0, p0, Ll/ܳۢᩴ;->᩸:I

    .line 1340
    new-instance v1, Ll/ܽۢᩴ;

    invoke-direct {v1, p0}, Ll/ܽۢᩴ;-><init>(Ll/ܳۢᩴ;)V

    .line 1341
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-eqz v0, :cond_0

    .line 1342
    invoke-virtual {v1}, Ll/ܽۢᩴ;->nextInt()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v0, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/io/ObjectInputStream;ILl/ۧۢᩴ;Ll/ۧۢᩴ;)Ll/ۧۢᩴ;
    .locals 6

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1356
    new-instance p1, Ll/ۧۢᩴ;

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result p0

    invoke-direct {p1, p0}, Ll/ۧۢᩴ;-><init>(I)V

    .line 1357
    invoke-virtual {p1, p2}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 1358
    invoke-virtual {p1, p3}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    return-object p1

    :cond_0
    const v1, 0x7fffffff

    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    .line 1364
    new-instance p1, Ll/ۧۢᩴ;

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    invoke-direct {p1, v2}, Ll/ۧۢᩴ;-><init>(I)V

    .line 1365
    new-instance v2, Ll/ۧۢᩴ;

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result p0

    invoke-direct {v2, p0}, Ll/ۧۢᩴ;-><init>(I)V

    .line 771
    iget p0, p1, Ll/ۧۢᩴ;->᩸:I

    and-int/2addr p0, v1

    iput p0, p1, Ll/ۧۢᩴ;->᩸:I

    .line 772
    iput-object v2, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 1366
    invoke-virtual {v2, p1}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 1367
    invoke-virtual {p1, v0}, Ll/ۧۢᩴ;->֫(I)V

    .line 1368
    invoke-virtual {p1, p2}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 1369
    iget-object p0, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    invoke-virtual {p0, p3}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    return-object p1

    .line 1373
    :cond_1
    div-int/lit8 v2, p1, 0x2

    sub-int v3, p1, v2

    sub-int/2addr v3, v0

    .line 1374
    new-instance v4, Ll/ۧۢᩴ;

    invoke-direct {v4}, Ll/ۧۢᩴ;-><init>()V

    .line 1375
    invoke-static {p0, v3, p2, v4}, Ll/ܳۢᩴ;->֫(Ljava/io/ObjectInputStream;ILl/ۧۢᩴ;Ll/ۧۢᩴ;)Ll/ۧۢᩴ;

    move-result-object p2

    .line 761
    iget v3, v4, Ll/ۧۢᩴ;->᩸:I

    const v5, -0x40000001    # -1.9999999f

    and-int/2addr v3, v5

    iput v3, v4, Ll/ۧۢᩴ;->᩸:I

    .line 762
    iput-object p2, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 1376
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result p2

    iput p2, v4, Ll/ۧۢᩴ;->᩹:I

    .line 1377
    invoke-static {p0, v2, v4, p3}, Ll/ܳۢᩴ;->֫(Ljava/io/ObjectInputStream;ILl/ۧۢᩴ;Ll/ۧۢᩴ;)Ll/ۧۢᩴ;

    move-result-object p0

    .line 771
    iget p2, v4, Ll/ۧۢᩴ;->᩸:I

    and-int/2addr p2, v1

    iput p2, v4, Ll/ۧۢᩴ;->᩸:I

    .line 772
    iput-object p0, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    neg-int p0, p1

    and-int/2addr p0, p1

    if-ne p1, p0, :cond_2

    .line 1378
    invoke-virtual {v4, v0}, Ll/ۧۢᩴ;->֫(I)V

    :cond_2
    return-object v4
.end method


# virtual methods
.method public final add(I)Z
    .locals 10

    .line 262
    iget-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 263
    iget v0, p0, Ll/ܳۢᩴ;->᩸:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܳۢᩴ;->᩸:I

    .line 264
    new-instance v0, Ll/ۧۢᩴ;

    invoke-direct {v0, p1}, Ll/ۧۢᩴ;-><init>(I)V

    iput-object v0, p0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    return v1

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v4, v2

    move-object v5, v4

    const/4 v6, 0x0

    move-object v2, v0

    .line 269
    :goto_0
    iget v7, v0, Ll/ۧۢᩴ;->᩹:I

    .line 216
    invoke-static {p1, v7}, Ljava/lang/Integer;->compare(II)I

    move-result v7

    if-nez v7, :cond_1

    return v3

    .line 781
    :cond_1
    iget v8, v0, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v8, v8

    if-eqz v8, :cond_2

    const/4 v6, 0x0

    move-object v2, v0

    move-object v5, v4

    .line 275
    :cond_2
    iget-object v4, p0, Ll/ܳۢᩴ;->᩹:[Z

    add-int/lit8 v8, v6, 0x1

    if-lez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    aput-boolean v7, v4, v6

    if-eqz v7, :cond_6

    .line 276
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 277
    iget v4, p0, Ll/ܳۢᩴ;->᩸:I

    add-int/2addr v4, v1

    iput v4, p0, Ll/ܳۢᩴ;->᩸:I

    .line 278
    new-instance v4, Ll/ۧۢᩴ;

    invoke-direct {v4, p1}, Ll/ۧۢᩴ;-><init>(I)V

    .line 279
    iget-object p1, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-nez p1, :cond_4

    iput-object v4, p0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 280
    :cond_4
    iput-object v0, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 281
    iput-object p1, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 771
    iget p1, v0, Ll/ۧۢᩴ;->᩸:I

    const v6, 0x7fffffff

    and-int/2addr p1, v6

    iput p1, v0, Ll/ۧۢᩴ;->᩸:I

    .line 772
    iput-object v4, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_2

    .line 286
    :cond_5
    iget-object v4, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto/16 :goto_b

    .line 288
    :cond_6
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 289
    iget v4, p0, Ll/ܳۢᩴ;->᩸:I

    add-int/2addr v4, v1

    iput v4, p0, Ll/ܳۢᩴ;->᩸:I

    .line 290
    new-instance v4, Ll/ۧۢᩴ;

    invoke-direct {v4, p1}, Ll/ۧۢᩴ;-><init>(I)V

    .line 291
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-nez p1, :cond_7

    iput-object v4, p0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 292
    :cond_7
    iput-object v0, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 293
    iput-object p1, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 761
    iget p1, v0, Ll/ۧۢᩴ;->᩸:I

    const v6, -0x40000001    # -1.9999999f

    and-int/2addr p1, v6

    iput p1, v0, Ll/ۧۢᩴ;->᩸:I

    .line 762
    iput-object v4, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    :goto_2
    const/4 p1, 0x0

    move-object v0, v2

    :goto_3
    if-eq v0, v4, :cond_a

    .line 304
    iget-object v6, p0, Ll/ܳۢᩴ;->᩹:[Z

    aget-boolean v6, v6, p1

    if-eqz v6, :cond_8

    .line 796
    iget v7, v0, Ll/ۧۢᩴ;->᩸:I

    and-int/lit16 v8, v7, -0x100

    int-to-byte v7, v7

    add-int/2addr v7, v1

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v7, v8

    iput v7, v0, Ll/ۧۢᩴ;->᩸:I

    goto :goto_4

    .line 801
    :cond_8
    iget v7, v0, Ll/ۧۢᩴ;->᩸:I

    and-int/lit16 v8, v7, -0x100

    int-to-byte v7, v7

    sub-int/2addr v7, v1

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v7, v8

    iput v7, v0, Ll/ۧۢᩴ;->᩸:I

    :goto_4
    add-int/lit8 p1, p1, 0x1

    if-eqz v6, :cond_9

    .line 306
    iget-object v0, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_3

    :cond_9
    iget-object v0, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_3

    .line 781
    :cond_a
    iget p1, v2, Ll/ۧۢᩴ;->᩸:I

    int-to-byte p1, p1

    const/4 v0, -0x2

    const/4 v4, -0x1

    if-ne p1, v0, :cond_11

    .line 309
    iget-object p1, v2, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 781
    iget v0, p1, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v0, v0

    if-ne v0, v4, :cond_c

    .line 312
    invoke-virtual {p1}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 313
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->ܽ(Z)V

    .line 314
    invoke-virtual {v2, p1}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    goto :goto_5

    .line 315
    :cond_b
    iget-object v0, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v0, v2, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 316
    :goto_5
    iput-object v2, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 317
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 318
    invoke-virtual {v2, v3}, Ll/ۧۢᩴ;->֫(I)V

    goto/16 :goto_a

    .line 321
    :cond_c
    iget-object v0, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 322
    iget-object v6, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v6, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 323
    iput-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 324
    iget-object v6, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v6, v2, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 325
    iput-object v2, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 781
    iget v6, v0, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v6, v6

    if-ne v6, v4, :cond_d

    .line 327
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 328
    invoke-virtual {v2, v1}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_6

    :cond_d
    if-nez v6, :cond_e

    .line 330
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 331
    invoke-virtual {v2, v3}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_6

    .line 333
    :cond_e
    invoke-virtual {p1, v4}, Ll/ۧۢᩴ;->֫(I)V

    .line 334
    invoke-virtual {v2, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 336
    :goto_6
    invoke-virtual {v0, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 337
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_f

    .line 338
    invoke-virtual {p1, v0}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    .line 339
    invoke-virtual {v0, v3}, Ll/ۧۢᩴ;->֫(Z)V

    .line 341
    :cond_f
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_10

    .line 342
    invoke-virtual {v2, v0}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 343
    invoke-virtual {v0, v3}, Ll/ۧۢᩴ;->ܽ(Z)V

    :cond_10
    :goto_7
    move-object p1, v0

    goto :goto_a

    :cond_11
    const/4 v0, 0x2

    if-ne p1, v0, :cond_19

    .line 347
    iget-object p1, v2, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 781
    iget v0, p1, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v0, v0

    if-ne v0, v1, :cond_13

    .line 350
    invoke-virtual {p1}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 351
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->֫(Z)V

    .line 352
    invoke-virtual {v2, p1}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    goto :goto_8

    .line 353
    :cond_12
    iget-object v0, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v0, v2, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 354
    :goto_8
    iput-object v2, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 355
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 356
    invoke-virtual {v2, v3}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_a

    .line 359
    :cond_13
    iget-object v0, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 360
    iget-object v6, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v6, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 361
    iput-object p1, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 362
    iget-object v6, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v6, v2, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 363
    iput-object v2, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 781
    iget v6, v0, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v6, v6

    if-ne v6, v1, :cond_14

    .line 365
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 366
    invoke-virtual {v2, v4}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_9

    :cond_14
    if-nez v6, :cond_15

    .line 368
    invoke-virtual {p1, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 369
    invoke-virtual {v2, v3}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_9

    .line 371
    :cond_15
    invoke-virtual {p1, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 372
    invoke-virtual {v2, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 374
    :goto_9
    invoke-virtual {v0, v3}, Ll/ۧۢᩴ;->֫(I)V

    .line 375
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_16

    .line 376
    invoke-virtual {v2, v0}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    .line 377
    invoke-virtual {v0, v3}, Ll/ۧۢᩴ;->֫(Z)V

    .line 379
    :cond_16
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v4

    if-eqz v4, :cond_10

    .line 380
    invoke-virtual {p1, v0}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 381
    invoke-virtual {v0, v3}, Ll/ۧۢᩴ;->ܽ(Z)V

    goto :goto_7

    :goto_a
    if-nez v5, :cond_17

    .line 385
    iput-object p1, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    return v1

    .line 387
    :cond_17
    iget-object v0, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-ne v0, v2, :cond_18

    iput-object p1, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    return v1

    .line 388
    :cond_18
    iput-object p1, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    :cond_19
    return v1

    .line 298
    :cond_1a
    iget-object v4, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    :goto_b
    move v6, v8

    move-object v9, v4

    move-object v4, v0

    move-object v0, v9

    goto/16 :goto_0
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 634
    iput v0, p0, Ll/ܳۢᩴ;->᩸:I

    const/4 v0, 0x0

    .line 635
    iput-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    .line 636
    iput-object v0, p0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v0, p0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 9

    .line 1290
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۢᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v1, 0x30

    new-array v1, v1, [Z

    .line 256
    iput-object v1, v0, Ll/ܳۢᩴ;->᩹:[Z

    .line 1295
    iget v1, p0, Ll/ܳۢᩴ;->᩸:I

    if-eqz v1, :cond_5

    .line 1297
    new-instance v1, Ll/ۧۢᩴ;

    invoke-direct {v1}, Ll/ۧۢᩴ;-><init>()V

    new-instance v2, Ll/ۧۢᩴ;

    invoke-direct {v2}, Ll/ۧۢᩴ;-><init>()V

    .line 1299
    iget-object v3, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    .line 761
    iget v4, v1, Ll/ۧۢᩴ;->᩸:I

    const v5, -0x40000001    # -1.9999999f

    and-int/2addr v4, v5

    iput v4, v1, Ll/ۧۢᩴ;->᩸:I

    .line 762
    iput-object v3, v1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    const/4 v3, 0x0

    .line 1301
    invoke-virtual {v2, v3}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    move-object v4, v2

    .line 1303
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v6

    if-nez v6, :cond_1

    .line 1304
    iget-object v6, v1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    invoke-virtual {v6}, Ll/ۧۢᩴ;->clone()Ll/ۧۢᩴ;

    move-result-object v6

    .line 1305
    iget-object v7, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    invoke-virtual {v6, v7}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 1306
    invoke-virtual {v6, v4}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    .line 761
    iget v7, v4, Ll/ۧۢᩴ;->᩸:I

    and-int/2addr v7, v5

    iput v7, v4, Ll/ۧۢᩴ;->᩸:I

    .line 762
    iput-object v6, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 1308
    iget-object v1, v1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    move-object v4, v6

    goto :goto_4

    .line 1311
    :cond_1
    :goto_1
    invoke-virtual {v1}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 1312
    iget-object v1, v1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-nez v1, :cond_3

    .line 1314
    iput-object v3, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 1315
    iget-object v1, v2, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v1, v0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    .line 1316
    iput-object v1, v0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 1317
    :goto_2
    iget-object v1, v0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    iget-object v1, v1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-eqz v1, :cond_2

    iput-object v1, v0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_2

    .line 1318
    :cond_2
    iget-object v1, v0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    iput-object v1, v0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 1319
    :goto_3
    iget-object v1, v0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iget-object v1, v1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-eqz v1, :cond_5

    iput-object v1, v0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_3

    .line 1322
    :cond_3
    iget-object v4, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_1

    .line 1324
    :cond_4
    iget-object v1, v1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 1325
    iget-object v4, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 1327
    :goto_4
    invoke-virtual {v1}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v6

    if-nez v6, :cond_0

    .line 1328
    iget-object v6, v1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    invoke-virtual {v6}, Ll/ۧۢᩴ;->clone()Ll/ۧۢᩴ;

    move-result-object v6

    .line 1329
    iget-object v7, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    invoke-virtual {v6, v7}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    .line 1330
    invoke-virtual {v6, v4}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 771
    iget v7, v4, Ll/ۧۢᩴ;->᩸:I

    const v8, 0x7fffffff

    and-int/2addr v7, v8

    iput v7, v4, Ll/ۧۢᩴ;->᩸:I

    .line 772
    iput-object v6, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_0

    :cond_5
    return-object v0

    .line 1292
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final bridge synthetic comparator()Ljava/util/Comparator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final comparator()Ll/ۙۢᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final contains(I)Z
    .locals 2

    .line 226
    iget-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    :goto_0
    if-eqz v0, :cond_1

    .line 228
    iget v1, v0, Ll/ۧۢᩴ;->᩹:I

    .line 216
    invoke-static {p1, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-eqz v1, :cond_1

    if-gez v1, :cond_0

    .line 228
    invoke-virtual {v0}, Ll/ۧۢᩴ;->֫()Ll/ۧۢᩴ;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܳ()Ll/ۧۢᩴ;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 896
    iget v0, p0, Ll/ܳۢᩴ;->᩸:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1022
    new-instance v0, Ll/ܽۢᩴ;

    invoke-direct {v0, p0}, Ll/ܽۢᩴ;-><init>(Ll/ܳۢᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/ۜۡᩴ;
    .locals 1

    .line 1022
    new-instance v0, Ll/ܽۢᩴ;

    invoke-direct {v0, p0}, Ll/ܽۢᩴ;-><init>(Ll/ܳۢᩴ;)V

    return-object v0
.end method

.method public final remove(I)Z
    .locals 10

    .line 427
    iget-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_16

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    .line 433
    :goto_0
    iget v5, v0, Ll/ۧۢᩴ;->᩹:I

    .line 216
    invoke-static {p1, v5}, Ljava/lang/Integer;->compare(II)I

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_39

    .line 442
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܽ()Ll/ۧۢᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 443
    :cond_1
    iget-object p1, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-nez p1, :cond_2

    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܿ()Ll/ۧۢᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 444
    :cond_2
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 445
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz v4, :cond_4

    if-eqz v3, :cond_3

    .line 447
    iget-object p1, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    invoke-virtual {v4, p1}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    goto/16 :goto_7

    .line 448
    :cond_3
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    invoke-virtual {v4, p1}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    goto/16 :goto_7

    :cond_4
    if-eqz v3, :cond_5

    .line 449
    iget-object p1, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_1

    :cond_5
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    :goto_1
    iput-object p1, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    goto/16 :goto_7

    .line 451
    :cond_6
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܿ()Ll/ۧۢᩴ;

    move-result-object p1

    iget-object v5, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v5, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-eqz v4, :cond_8

    if-eqz v3, :cond_7

    .line 453
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object p1, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto/16 :goto_7

    .line 454
    :cond_7
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object p1, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto/16 :goto_7

    .line 455
    :cond_8
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object p1, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    goto/16 :goto_7

    .line 458
    :cond_9
    iget-object p1, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 459
    invoke-virtual {p1}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v5

    if-eqz v5, :cond_e

    .line 460
    iget-object v5, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v5, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 461
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v5

    invoke-virtual {p1, v5}, Ll/ۧۢᩴ;->֫(Z)V

    .line 462
    invoke-virtual {p1}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {p1}, Ll/ۧۢᩴ;->ܿ()Ll/ۧۢᩴ;

    move-result-object v5

    iput-object p1, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    :cond_a
    if-eqz v4, :cond_c

    if-eqz v3, :cond_b

    .line 464
    iput-object p1, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_2

    .line 465
    :cond_b
    iput-object p1, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_2

    .line 466
    :cond_c
    iput-object p1, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    .line 781
    :goto_2
    iget v0, v0, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v0, v0

    .line 467
    invoke-virtual {p1, v0}, Ll/ۧۢᩴ;->֫(I)V

    const/4 v3, 0x1

    :cond_d
    :goto_3
    move-object v4, p1

    goto :goto_7

    .line 473
    :cond_e
    :goto_4
    iget-object v5, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 474
    invoke-virtual {v5}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v7

    if-eqz v7, :cond_38

    .line 477
    invoke-virtual {v5}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-virtual {p1, v5}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    goto :goto_5

    .line 478
    :cond_f
    iget-object v7, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v7, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 479
    :goto_5
    iget-object v7, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v7, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 480
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v7

    if-nez v7, :cond_10

    .line 481
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܿ()Ll/ۧۢᩴ;

    move-result-object v7

    iput-object v5, v7, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 482
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(Z)V

    .line 484
    :cond_10
    iget-object v7, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v7, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 485
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->ܽ(Z)V

    if-eqz v4, :cond_12

    if-eqz v3, :cond_11

    .line 487
    iput-object v5, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_6

    .line 488
    :cond_11
    iput-object v5, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_6

    .line 489
    :cond_12
    iput-object v5, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    .line 781
    :goto_6
    iget v0, v0, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v0, v0

    .line 490
    invoke-virtual {v5, v0}, Ll/ۧۢᩴ;->֫(I)V

    const/4 v3, 0x0

    goto :goto_3

    :goto_7
    if-eqz v4, :cond_37

    .line 401
    iget-object p1, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    if-ne v4, p1, :cond_13

    move-object p1, v2

    goto :goto_b

    :cond_13
    move-object p1, v4

    move-object v0, p1

    .line 405
    :goto_8
    invoke-virtual {p1}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 406
    iget-object p1, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-eqz p1, :cond_14

    .line 407
    iget-object v5, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-eq v5, v4, :cond_1a

    .line 408
    :cond_14
    :goto_9
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_15

    iget-object v0, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_9

    .line 409
    :cond_15
    iget-object p1, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_b

    .line 412
    :cond_16
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v5

    if-eqz v5, :cond_36

    .line 413
    iget-object v0, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-eqz v0, :cond_18

    .line 414
    iget-object v5, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    if-eq v5, v4, :cond_17

    goto :goto_a

    :cond_17
    move-object p1, v0

    goto :goto_b

    .line 415
    :cond_18
    :goto_a
    invoke-virtual {p1}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_19

    iget-object p1, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_a

    .line 416
    :cond_19
    iget-object p1, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    :cond_1a
    :goto_b
    const/4 v0, -0x1

    if-nez v3, :cond_28

    if-eqz p1, :cond_1b

    .line 500
    iget-object v3, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-eq v3, v4, :cond_1b

    const/4 v3, 0x1

    goto :goto_c

    :cond_1b
    const/4 v3, 0x0

    .line 796
    :goto_c
    iget v5, v4, Ll/ۧۢᩴ;->᩸:I

    and-int/lit16 v7, v5, -0x100

    int-to-byte v5, v5

    add-int/2addr v5, v6

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v7

    iput v5, v4, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v5, v5

    if-ne v5, v6, :cond_1c

    goto/16 :goto_14

    :cond_1c
    const/4 v7, 0x2

    if-ne v5, v7, :cond_d

    .line 504
    iget-object v5, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 781
    iget v7, v5, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v7, v7

    if-ne v7, v0, :cond_23

    .line 509
    iget-object v7, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 510
    iget-object v8, v7, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v8, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 511
    iput-object v5, v7, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 512
    iget-object v8, v7, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v8, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 513
    iput-object v4, v7, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 781
    iget v8, v7, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v8, v8

    if-ne v8, v6, :cond_1d

    .line 515
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 516
    invoke-virtual {v4, v0}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_d

    :cond_1d
    if-nez v8, :cond_1e

    .line 518
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 519
    invoke-virtual {v4, v1}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_d

    .line 522
    :cond_1e
    invoke-virtual {v5, v6}, Ll/ۧۢᩴ;->֫(I)V

    .line 523
    invoke-virtual {v4, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 525
    :goto_d
    invoke-virtual {v7, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 526
    invoke-virtual {v7}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 527
    invoke-virtual {v4, v7}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    .line 528
    invoke-virtual {v7, v1}, Ll/ۧۢᩴ;->֫(Z)V

    .line 530
    :cond_1f
    invoke-virtual {v7}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 531
    invoke-virtual {v5, v7}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 532
    invoke-virtual {v7, v1}, Ll/ۧۢᩴ;->ܽ(Z)V

    :cond_20
    if-eqz p1, :cond_22

    if-eqz v3, :cond_21

    .line 535
    iput-object v7, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto/16 :goto_3

    .line 536
    :cond_21
    iput-object v7, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto/16 :goto_3

    .line 537
    :cond_22
    iput-object v7, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    goto/16 :goto_3

    :cond_23
    if-eqz p1, :cond_25

    if-eqz v3, :cond_24

    .line 540
    iput-object v5, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_e

    .line 541
    :cond_24
    iput-object v5, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_e

    .line 542
    :cond_25
    iput-object v5, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    :goto_e
    if-nez v7, :cond_26

    .line 544
    iget-object p1, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object p1, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 545
    iput-object v4, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 546
    invoke-virtual {v5, v0}, Ll/ۧۢᩴ;->֫(I)V

    .line 547
    invoke-virtual {v4, v6}, Ll/ۧۢᩴ;->֫(I)V

    goto/16 :goto_14

    .line 551
    :cond_26
    invoke-virtual {v5}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_27

    .line 552
    invoke-virtual {v4, v6}, Ll/ۧۢᩴ;->ܽ(Z)V

    .line 553
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(Z)V

    goto :goto_f

    .line 554
    :cond_27
    iget-object v0, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v0, v4, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 555
    :goto_f
    iput-object v4, v5, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 556
    invoke-virtual {v4, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 557
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(I)V

    goto/16 :goto_3

    :cond_28
    if-eqz p1, :cond_29

    .line 561
    iget-object v3, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    if-eq v3, v4, :cond_29

    const/4 v3, 0x1

    goto :goto_10

    :cond_29
    const/4 v3, 0x0

    .line 801
    :goto_10
    iget v5, v4, Ll/ۧۢᩴ;->᩸:I

    and-int/lit16 v7, v5, -0x100

    int-to-byte v5, v5

    sub-int/2addr v5, v6

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v7

    iput v5, v4, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v5, v5

    if-ne v5, v0, :cond_2a

    goto/16 :goto_14

    :cond_2a
    const/4 v7, -0x2

    if-ne v5, v7, :cond_d

    .line 565
    iget-object v5, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 781
    iget v7, v5, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v7, v7

    if-ne v7, v6, :cond_31

    .line 570
    iget-object v7, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 571
    iget-object v8, v7, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    iput-object v8, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 572
    iput-object v5, v7, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 573
    iget-object v8, v7, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v8, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 574
    iput-object v4, v7, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 781
    iget v8, v7, Ll/ۧۢᩴ;->᩸:I

    int-to-byte v8, v8

    if-ne v8, v0, :cond_2b

    .line 576
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 577
    invoke-virtual {v4, v6}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_11

    :cond_2b
    if-nez v8, :cond_2c

    .line 579
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 580
    invoke-virtual {v4, v1}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_11

    .line 583
    :cond_2c
    invoke-virtual {v5, v0}, Ll/ۧۢᩴ;->֫(I)V

    .line 584
    invoke-virtual {v4, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 586
    :goto_11
    invoke-virtual {v7, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 587
    invoke-virtual {v7}, Ll/ۧۢᩴ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 588
    invoke-virtual {v5, v7}, Ll/ۧۢᩴ;->ۧ(Ll/ۧۢᩴ;)V

    .line 589
    invoke-virtual {v7, v1}, Ll/ۧۢᩴ;->֫(Z)V

    .line 591
    :cond_2d
    invoke-virtual {v7}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 592
    invoke-virtual {v4, v7}, Ll/ۧۢᩴ;->֫(Ll/ۧۢᩴ;)V

    .line 593
    invoke-virtual {v7, v1}, Ll/ۧۢᩴ;->ܽ(Z)V

    :cond_2e
    if-eqz p1, :cond_30

    if-eqz v3, :cond_2f

    .line 596
    iput-object v7, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto/16 :goto_3

    .line 597
    :cond_2f
    iput-object v7, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto/16 :goto_3

    .line 598
    :cond_30
    iput-object v7, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    goto/16 :goto_3

    :cond_31
    if-eqz p1, :cond_33

    if-eqz v3, :cond_32

    .line 601
    iput-object v5, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_12

    .line 602
    :cond_32
    iput-object v5, p1, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_12

    .line 603
    :cond_33
    iput-object v5, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    :goto_12
    if-nez v7, :cond_34

    .line 605
    iget-object p1, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object p1, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 606
    iput-object v4, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 607
    invoke-virtual {v5, v6}, Ll/ۧۢᩴ;->֫(I)V

    .line 608
    invoke-virtual {v4, v0}, Ll/ۧۢᩴ;->֫(I)V

    goto :goto_14

    .line 612
    :cond_34
    invoke-virtual {v5}, Ll/ۧۢᩴ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_35

    .line 613
    invoke-virtual {v4, v6}, Ll/ۧۢᩴ;->֫(Z)V

    .line 614
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->ܽ(Z)V

    goto :goto_13

    .line 615
    :cond_35
    iget-object v0, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iput-object v0, v4, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 616
    :goto_13
    iput-object v4, v5, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 617
    invoke-virtual {v4, v1}, Ll/ۧۢᩴ;->֫(I)V

    .line 618
    invoke-virtual {v5, v1}, Ll/ۧۢᩴ;->֫(I)V

    goto/16 :goto_3

    .line 420
    :cond_36
    iget-object v0, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 421
    iget-object p1, p1, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto/16 :goto_8

    .line 623
    :cond_37
    :goto_14
    iget p1, p0, Ll/ܳۢᩴ;->᩸:I

    sub-int/2addr p1, v6

    iput p1, p0, Ll/ܳۢᩴ;->᩸:I

    return v6

    :cond_38
    move-object p1, v5

    goto/16 :goto_4

    :cond_39
    if-lez v5, :cond_3a

    const/4 v3, 0x1

    goto :goto_15

    :cond_3a
    const/4 v3, 0x0

    :goto_15
    if-eqz v3, :cond_3b

    .line 436
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܳ()Ll/ۧۢᩴ;

    move-result-object v4

    if-nez v4, :cond_3c

    goto :goto_16

    .line 439
    :cond_3b
    invoke-virtual {v0}, Ll/ۧۢᩴ;->֫()Ll/ۧۢᩴ;

    move-result-object v4

    if-nez v4, :cond_3c

    :goto_16
    return v1

    :cond_3c
    move-object v9, v4

    move-object v4, v0

    move-object v0, v9

    goto/16 :goto_0
.end method

.method public final size()I
    .locals 1

    .line 891
    iget v0, p0, Ll/ܳۢᩴ;->᩸:I

    return v0
.end method

.method public final ֡()I
    .locals 1

    .line 901
    iget-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    if-eqz v0, :cond_0

    .line 902
    iget-object v0, p0, Ll/ܳۢᩴ;->᩶:Ll/ۧۢᩴ;

    iget v0, v0, Ll/ۧۢᩴ;->᩹:I

    return v0

    .line 901
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ֫(I)Ll/ۧۢᩴ;
    .locals 4

    .line 240
    iget-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    const/4 v1, 0x0

    move-object v1, v0

    const/4 v2, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 242
    iget v2, v0, Ll/ۧۢᩴ;->᩹:I

    .line 216
    invoke-static {p1, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    if-eqz v2, :cond_1

    if-gez v2, :cond_0

    .line 244
    invoke-virtual {v0}, Ll/ۧۢᩴ;->֫()Ll/ۧۢᩴ;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܳ()Ll/ۧۢᩴ;

    move-result-object v1

    :goto_1
    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final ۗ()Ll/ܶۡᩴ;
    .locals 1

    .line 1022
    new-instance v0, Ll/ܽۢᩴ;

    invoke-direct {v0, p0}, Ll/ܽۢᩴ;-><init>(Ll/ܳۢᩴ;)V

    return-object v0
.end method

.method public final ܳ(I)Ll/֫ܺᩴ;
    .locals 7

    .line 1042
    new-instance v6, Ll/ܿۢᩴ;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    invoke-direct/range {v0 .. v5}, Ll/ܿۢᩴ;-><init>(Ll/ܳۢᩴ;IZIZ)V

    return-object v6
.end method

.method public final ܽ(II)Ll/֫ܺᩴ;
    .locals 7

    .line 1047
    new-instance v6, Ll/ܿۢᩴ;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Ll/ܿۢᩴ;-><init>(Ll/ܳۢᩴ;IZIZ)V

    return-object v6
.end method

.method public final ᩴ(I)Ll/֫ܺᩴ;
    .locals 7

    .line 1037
    new-instance v6, Ll/ܿۢᩴ;

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    move v4, p1

    invoke-direct/range {v0 .. v5}, Ll/ܿۢᩴ;-><init>(Ll/ܳۢᩴ;IZIZ)V

    return-object v6
.end method

.method public final ᩻֫()I
    .locals 1

    .line 907
    iget-object v0, p0, Ll/ܳۢᩴ;->ۗ:Ll/ۧۢᩴ;

    if-eqz v0, :cond_0

    .line 908
    iget-object v0, p0, Ll/ܳۢᩴ;->ۙ:Ll/ۧۢᩴ;

    iget v0, v0, Ll/ۧۢᩴ;->᩹:I

    return v0

    .line 907
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
