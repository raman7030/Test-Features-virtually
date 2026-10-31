.class public final Ll/֨֡ۧ;
.super Ljava/lang/Object;
.source "O8V0"


# instance fields
.field public ֡:J

.field public final ֨:Landroid/util/SparseArray;

.field public final ֫:Z

.field public ۖ:Z

.field public ۘ:Z

.field public ۚ:Ll/ۚ֡ۧ;

.field public ۜ:J

.field public final ۡ:Landroid/util/SparseArray;

.field public final ۢ:Ll/᩵ۢۧ;

.field public final ۧ:Ll/ᩳ۠֫;

.field public ܳ:Z

.field public ܺ:Ll/ۚ֡ۧ;

.field public ܽ:[B

.field public final ܿ:Z

.field public ᩳ:I

.field public ᩴ:Z

.field public ᩵:J

.field public ᩷:I

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/᩵ۢۧ;ZZ)V
    .locals 0

    .line 324
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 325
    iput-object p1, p0, Ll/֨֡ۧ;->ۢ:Ll/᩵ۢۧ;

    .line 326
    iput-boolean p2, p0, Ll/֨֡ۧ;->֫:Z

    .line 327
    iput-boolean p3, p0, Ll/֨֡ۧ;->ܿ:Z

    .line 328
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/֨֡ۧ;->֨:Landroid/util/SparseArray;

    .line 329
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/֨֡ۧ;->ۡ:Landroid/util/SparseArray;

    .line 330
    new-instance p1, Ll/ۚ֡ۧ;

    .line 544
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 330
    iput-object p1, p0, Ll/֨֡ۧ;->ܺ:Ll/ۚ֡ۧ;

    .line 331
    new-instance p1, Ll/ۚ֡ۧ;

    .line 544
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 331
    iput-object p1, p0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    const/16 p1, 0x80

    new-array p1, p1, [B

    .line 332
    iput-object p1, p0, Ll/֨֡ۧ;->ܽ:[B

    .line 333
    new-instance p2, Ll/ᩳ۠֫;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3, p3}, Ll/ᩳ۠֫;-><init>([BII)V

    iput-object p2, p0, Ll/֨֡ۧ;->ۧ:Ll/ᩳ۠֫;

    .line 334
    invoke-virtual {p0}, Ll/֨֡ۧ;->ۧ()V

    return-void
.end method


# virtual methods
.method public final ֫(II[B)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 384
    iget-boolean v2, v0, Ll/֨֡ۧ;->ܳ:Z

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    sub-int v2, p2, v1

    .line 388
    iget-object v3, v0, Ll/֨֡ۧ;->ܽ:[B

    array-length v4, v3

    iget v5, v0, Ll/֨֡ۧ;->ᩳ:I

    add-int/2addr v5, v2

    const/4 v6, 0x2

    if-ge v4, v5, :cond_1

    mul-int/lit8 v5, v5, 0x2

    .line 389
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    iput-object v3, v0, Ll/֨֡ۧ;->ܽ:[B

    .line 391
    :cond_1
    iget-object v3, v0, Ll/֨֡ۧ;->ܽ:[B

    iget v4, v0, Ll/֨֡ۧ;->ᩳ:I

    move-object/from16 v5, p3

    invoke-static {v5, v1, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 392
    iget v1, v0, Ll/֨֡ۧ;->ᩳ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/֨֡ۧ;->ᩳ:I

    .line 394
    iget-object v2, v0, Ll/֨֡ۧ;->ܽ:[B

    iget-object v3, v0, Ll/֨֡ۧ;->ۧ:Ll/ᩳ۠֫;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v1, v2}, Ll/ᩳ۠֫;->֫(II[B)V

    const/16 v1, 0x8

    .line 395
    invoke-virtual {v3, v1}, Ll/ᩳ۠֫;->֫(I)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_3

    .line 398
    :cond_2
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ܳ()V

    .line 399
    invoke-virtual {v3, v6}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v9

    const/4 v1, 0x5

    .line 400
    invoke-virtual {v3, v1}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 404
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ۧ()Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_3

    .line 407
    :cond_3
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ܿ()I

    .line 408
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ۧ()Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_3

    .line 411
    :cond_4
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ܿ()I

    move-result v10

    .line 412
    iget-boolean v2, v0, Ll/֨֡ۧ;->ܿ:Z

    if-nez v2, :cond_5

    .line 414
    iput-boolean v4, v0, Ll/֨֡ۧ;->ܳ:Z

    .line 415
    iget-object v1, v0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    invoke-virtual {v1, v10}, Ll/ۚ֡ۧ;->֫(I)V

    return-void

    .line 418
    :cond_5
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ۧ()Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_3

    .line 421
    :cond_6
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ܿ()I

    move-result v12

    .line 422
    iget-object v2, v0, Ll/֨֡ۧ;->ۡ:Landroid/util/SparseArray;

    invoke-virtual {v2, v12}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v5

    if-gez v5, :cond_7

    .line 424
    iput-boolean v4, v0, Ll/֨֡ۧ;->ܳ:Z

    return-void

    .line 427
    :cond_7
    invoke-virtual {v2, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۠֫;

    .line 428
    iget v5, v2, Ll/֫۠֫;->ܽ:I

    iget-boolean v2, v2, Ll/֫۠֫;->֫:Z

    iget-object v7, v0, Ll/֨֡ۧ;->֨:Landroid/util/SparseArray;

    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ll/ۧ۠֫;

    .line 429
    iget-boolean v5, v8, Ll/ۧ۠֫;->֡:Z

    iget v7, v8, Ll/ۧ۠֫;->ۖ:I

    iget v11, v8, Ll/ۧ۠֫;->᩷:I

    if-eqz v5, :cond_9

    .line 430
    invoke-virtual {v3, v6}, Ll/ᩳ۠֫;->֫(I)Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_3

    .line 433
    :cond_8
    invoke-virtual {v3, v6}, Ll/ᩳ۠֫;->ܽ(I)V

    .line 435
    :cond_9
    invoke-virtual {v3, v11}, Ll/ᩳ۠֫;->֫(I)Z

    move-result v5

    if-nez v5, :cond_a

    goto/16 :goto_3

    .line 441
    :cond_a
    invoke-virtual {v3, v11}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v11

    .line 442
    iget-boolean v5, v8, Ll/ۧ۠֫;->ۜ:Z

    const/4 v6, 0x1

    if-nez v5, :cond_d

    .line 443
    invoke-virtual {v3, v6}, Ll/ᩳ۠֫;->֫(I)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_3

    .line 446
    :cond_b
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_e

    .line 448
    invoke-virtual {v3, v6}, Ll/ᩳ۠֫;->֫(I)Z

    move-result v13

    if-nez v13, :cond_c

    goto/16 :goto_3

    .line 451
    :cond_c
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v13

    const/4 v14, 0x1

    move v15, v13

    move v13, v5

    goto :goto_0

    :cond_d
    const/4 v5, 0x0

    :cond_e
    const/4 v13, 0x0

    const/4 v14, 0x0

    move v13, v5

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 455
    :goto_0
    iget v5, v0, Ll/֨֡ۧ;->᩷:I

    if-ne v5, v1, :cond_f

    const/4 v1, 0x1

    const/16 v16, 0x1

    goto :goto_1

    :cond_f
    const/4 v1, 0x0

    const/16 v16, 0x0

    :goto_1
    if-eqz v16, :cond_11

    .line 458
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ۧ()Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_3

    .line 461
    :cond_10
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ܿ()I

    move-result v1

    move/from16 v17, v1

    goto :goto_2

    :cond_11
    const/4 v1, 0x0

    const/16 v17, 0x0

    .line 467
    :goto_2
    iget v1, v8, Ll/ۧ۠֫;->ۘ:I

    if-nez v1, :cond_14

    .line 468
    invoke-virtual {v3, v7}, Ll/ᩳ۠֫;->֫(I)Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_3

    .line 471
    :cond_12
    invoke-virtual {v3, v7}, Ll/ᩳ۠֫;->ۧ(I)I

    move-result v1

    if-eqz v2, :cond_19

    if-nez v13, :cond_19

    .line 473
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ۧ()Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_3

    .line 476
    :cond_13
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ᩳ()I

    move-result v2

    goto :goto_4

    :cond_14
    if-ne v1, v6, :cond_18

    .line 478
    iget-boolean v1, v8, Ll/ۧ۠֫;->᩻:Z

    if-nez v1, :cond_18

    .line 479
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ۧ()Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_3

    .line 482
    :cond_15
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ᩳ()I

    move-result v1

    if-eqz v2, :cond_17

    if-nez v13, :cond_17

    .line 484
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ۧ()Z

    move-result v2

    if-nez v2, :cond_16

    :goto_3
    return-void

    .line 487
    :cond_16
    invoke-virtual {v3}, Ll/ᩳ۠֫;->ᩳ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    move/from16 v20, v1

    move/from16 v21, v2

    const/16 v18, 0x0

    const/16 v19, 0x0

    goto :goto_6

    :cond_17
    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_5

    :cond_18
    const/4 v1, 0x0

    :cond_19
    const/4 v2, 0x0

    :goto_4
    const/4 v3, 0x0

    move v3, v2

    move v2, v1

    const/4 v1, 0x0

    :goto_5
    const/4 v5, 0x0

    move/from16 v20, v1

    move/from16 v18, v2

    move/from16 v19, v3

    const/16 v21, 0x0

    .line 490
    :goto_6
    iget-object v7, v0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    invoke-virtual/range {v7 .. v21}, Ll/ۚ֡ۧ;->֫(Ll/ۧ۠֫;IIIIZZZZIIIII)V

    .line 505
    iput-boolean v4, v0, Ll/֨֡ۧ;->ܳ:Z

    return-void
.end method

.method public final ֫(IJJZ)V
    .locals 0

    .line 357
    iput p1, p0, Ll/֨֡ۧ;->᩷:I

    .line 358
    iput-wide p4, p0, Ll/֨֡ۧ;->ۜ:J

    .line 359
    iput-wide p2, p0, Ll/֨֡ۧ;->᩻:J

    .line 360
    iput-boolean p6, p0, Ll/֨֡ۧ;->ۖ:Z

    .line 361
    iget-boolean p2, p0, Ll/֨֡ۧ;->֫:Z

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    if-eq p1, p3, :cond_1

    :cond_0
    iget-boolean p2, p0, Ll/֨֡ۧ;->ܿ:Z

    if-eqz p2, :cond_2

    const/4 p2, 0x5

    if-eq p1, p2, :cond_1

    if-eq p1, p3, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    .line 367
    :cond_1
    iget-object p1, p0, Ll/֨֡ۧ;->ܺ:Ll/ۚ֡ۧ;

    .line 368
    iget-object p2, p0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    iput-object p2, p0, Ll/֨֡ۧ;->ܺ:Ll/ۚ֡ۧ;

    .line 369
    iput-object p1, p0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    .line 370
    invoke-virtual {p1}, Ll/ۚ֡ۧ;->֫()V

    const/4 p1, 0x0

    .line 371
    iput p1, p0, Ll/֨֡ۧ;->ᩳ:I

    .line 372
    iput-boolean p3, p0, Ll/֨֡ۧ;->ܳ:Z

    :cond_2
    return-void
.end method

.method public final ֫(Ll/֫۠֫;)V
    .locals 2

    .line 346
    iget-object v0, p0, Ll/֨֡ۧ;->ۡ:Landroid/util/SparseArray;

    iget v1, p1, Ll/֫۠֫;->ۧ:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۧ۠֫;)V
    .locals 2

    .line 342
    iget-object v0, p0, Ll/֨֡ۧ;->֨:Landroid/util/SparseArray;

    iget v1, p1, Ll/ۧ۠֫;->ۚ:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 338
    iget-boolean v0, p0, Ll/֨֡ۧ;->ܿ:Z

    return v0
.end method

.method public final ֫(JIZ)Z
    .locals 11

    .line 509
    iget v0, p0, Ll/֨֡ۧ;->᩷:I

    const/16 v1, 0x9

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Ll/֨֡ۧ;->ܿ:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    iget-object v1, p0, Ll/֨֡ۧ;->ܺ:Ll/ۚ֡ۧ;

    .line 510
    invoke-static {v0, v1}, Ll/ۚ֡ۧ;->֫(Ll/ۚ֡ۧ;Ll/ۚ֡ۧ;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    if-eqz p4, :cond_2

    .line 512
    iget-boolean p4, p0, Ll/֨֡ۧ;->ۘ:Z

    if-eqz p4, :cond_2

    .line 513
    iget-wide v0, p0, Ll/֨֡ۧ;->᩻:J

    sub-long/2addr p1, v0

    long-to-int p2, p1

    add-int v9, p3, p2

    .line 536
    iget-wide v5, p0, Ll/֨֡ۧ;->֡:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v5, p1

    if-eqz p3, :cond_2

    iget-wide p1, p0, Ll/֨֡ۧ;->᩵:J

    cmp-long p3, v0, p1

    if-nez p3, :cond_1

    goto :goto_0

    .line 539
    :cond_1
    iget-boolean v7, p0, Ll/֨֡ۧ;->ᩴ:Z

    sub-long/2addr v0, p1

    long-to-int v8, v0

    .line 541
    iget-object v4, p0, Ll/֨֡ۧ;->ۢ:Ll/᩵ۢۧ;

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 516
    :cond_2
    :goto_0
    iget-wide p1, p0, Ll/֨֡ۧ;->᩻:J

    iput-wide p1, p0, Ll/֨֡ۧ;->᩵:J

    .line 517
    iget-wide p1, p0, Ll/֨֡ۧ;->ۜ:J

    iput-wide p1, p0, Ll/֨֡ۧ;->֡:J

    .line 518
    iput-boolean v3, p0, Ll/֨֡ۧ;->ᩴ:Z

    .line 519
    iput-boolean v2, p0, Ll/֨֡ۧ;->ۘ:Z

    .line 529
    :cond_3
    iget-boolean p1, p0, Ll/֨֡ۧ;->֫:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    invoke-virtual {p1}, Ll/ۚ֡ۧ;->ۧ()Z

    move-result p1

    goto :goto_1

    :cond_4
    iget-boolean p1, p0, Ll/֨֡ۧ;->ۖ:Z

    .line 530
    :goto_1
    iget-boolean p2, p0, Ll/֨֡ۧ;->ᩴ:Z

    iget p3, p0, Ll/֨֡ۧ;->᩷:I

    const/4 p4, 0x5

    if-eq p3, p4, :cond_6

    if-eqz p1, :cond_5

    if-ne p3, v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :cond_6
    :goto_2
    or-int p1, p2, v2

    iput-boolean p1, p0, Ll/֨֡ۧ;->ᩴ:Z

    const/16 p2, 0x18

    .line 523
    iput p2, p0, Ll/֨֡ۧ;->᩷:I

    return p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 350
    iput-boolean v0, p0, Ll/֨֡ۧ;->ܳ:Z

    .line 351
    iput-boolean v0, p0, Ll/֨֡ۧ;->ۘ:Z

    .line 352
    iget-object v0, p0, Ll/֨֡ۧ;->ۚ:Ll/ۚ֡ۧ;

    invoke-virtual {v0}, Ll/ۚ֡ۧ;->֫()V

    return-void
.end method
