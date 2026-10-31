.class public final Ll/֨᩶ۧ;
.super Ljava/lang/Object;
.source "S69M"


# instance fields
.field public final ֫:Ll/ܶۗۧ;

.field public ۧ:I

.field public ܳ:Ll/ۨۤ;

.field public final ܽ:Ll/ۢۗۧ;

.field public final ܿ:Ljava/util/ArrayList;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ܶۗۧ;)V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ll/ۨۤ;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ll/ۨۤ;-><init>(I)V

    iput-object v0, p0, Ll/֨᩶ۧ;->ܳ:Ll/ۨۤ;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨᩶ۧ;->ܿ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 69
    iput v0, p0, Ll/֨᩶ۧ;->ۧ:I

    .line 76
    iput-object p1, p0, Ll/֨᩶ۧ;->֫:Ll/ܶۗۧ;

    .line 78
    new-instance p1, Ll/ۢۗۧ;

    invoke-direct {p1, p0}, Ll/ۢۗۧ;-><init>(Ll/֨᩶ۧ;)V

    iput-object p1, p0, Ll/֨᩶ۧ;->ܽ:Ll/ۢۗۧ;

    return-void
.end method

.method private ֫(Ll/ۚ᩶ۧ;)V
    .locals 12

    .line 231
    iget v0, p1, Ll/ۚ᩶ۧ;->֫:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_8

    .line 245
    iget v1, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    invoke-direct {p0, v1, v0}, Ll/֨᩶ۧ;->ᩳ(II)I

    move-result v0

    .line 250
    iget v1, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 252
    iget v2, p1, Ll/ۚ᩶ۧ;->֫:I

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    .line 260
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "op should be remove or update."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/4 v5, 0x1

    const/4 v6, 0x1

    .line 262
    :goto_1
    iget v7, p1, Ll/ۚ᩶ۧ;->ۧ:I

    iget-object v8, p0, Ll/֨᩶ۧ;->ܳ:Ll/ۨۤ;

    const/4 v9, 0x0

    if-ge v5, v7, :cond_6

    .line 263
    iget v7, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    mul-int v10, v2, v5

    add-int/2addr v10, v7

    .line 264
    iget v7, p1, Ll/ۚ᩶ۧ;->֫:I

    invoke-direct {p0, v10, v7}, Ll/֨᩶ۧ;->ᩳ(II)I

    move-result v7

    .line 269
    iget v10, p1, Ll/ۚ᩶ۧ;->֫:I

    if-eq v10, v3, :cond_3

    if-eq v10, v4, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v11, v0, 0x1

    if-ne v7, v11, :cond_4

    goto :goto_2

    :cond_3
    if-ne v7, v0, :cond_4

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 281
    :cond_4
    :goto_3
    iget-object v11, p1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    invoke-virtual {p0, v11, v10, v0, v6}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v0

    .line 285
    invoke-virtual {p0, v0, v1}, Ll/֨᩶ۧ;->֫(Ll/ۚ᩶ۧ;I)V

    .line 742
    iput-object v9, v0, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v8, v0}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    .line 287
    iget v0, p1, Ll/ۚ᩶ۧ;->֫:I

    if-ne v0, v4, :cond_5

    add-int/2addr v1, v6

    :cond_5
    const/4 v0, 0x1

    move v0, v7

    const/4 v6, 0x1

    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 294
    :cond_6
    iget-object v2, p1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 742
    iput-object v9, p1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v8, p1}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    if-lez v6, :cond_7

    .line 297
    iget p1, p1, Ll/ۚ᩶ۧ;->֫:I

    invoke-virtual {p0, v2, p1, v0, v6}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object p1

    .line 301
    invoke-virtual {p0, p1, v1}, Ll/֨᩶ۧ;->֫(Ll/ۚ᩶ۧ;I)V

    .line 742
    iput-object v9, p1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v8, p1}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    :cond_7
    return-void

    .line 232
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "should not dispatch add or move for pre layout"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۧ(Ll/ۚ᩶ۧ;)V
    .locals 4

    .line 439
    iget-object v0, p0, Ll/֨᩶ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    iget v0, p1, Ll/ۚ᩶ۧ;->֫:I

    iget-object v1, p0, Ll/֨᩶ۧ;->֫:Ll/ܶۗۧ;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/16 v3, 0x8

    if-ne v0, v3, :cond_0

    .line 445
    iget v0, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget p1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    .line 1148
    iget-object v1, v1, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0, p1}, Ll/۬۬ۧ;->offsetPositionRecordsForMove(II)V

    .line 1150
    iput-boolean v2, v1, Ll/۬۬ۧ;->mItemsAddedOrRemoved:Z

    return-void

    .line 455
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown update op type for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 452
    :cond_1
    iget v0, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v3, p1, Ll/ۚ᩶ۧ;->ۧ:I

    iget-object p1, p1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 1108
    iget-object v1, v1, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0, v3, p1}, Ll/۬۬ۧ;->viewRangeUpdate(IILjava/lang/Object;)V

    .line 1109
    iput-boolean v2, v1, Ll/۬۬ۧ;->mItemsChanged:Z

    return-void

    .line 448
    :cond_2
    iget v0, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget p1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    .line 1101
    iget-object v1, v1, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, p1, v3}, Ll/۬۬ۧ;->offsetPositionRecordsForRemove(IIZ)V

    .line 1102
    iput-boolean v2, v1, Ll/۬۬ۧ;->mItemsAddedOrRemoved:Z

    return-void

    .line 442
    :cond_3
    iget v0, p1, Ll/ۚ᩶ۧ;->ᩳ:I

    iget p1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    .line 1142
    iget-object v1, v1, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0, p1}, Ll/۬۬ۧ;->offsetPositionRecordsForInsert(II)V

    .line 1143
    iput-boolean v2, v1, Ll/۬۬ۧ;->mItemsAddedOrRemoved:Z

    return-void
.end method

.method private ۧ(I)Z
    .locals 8

    .line 411
    iget-object v0, p0, Ll/֨᩶ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 413
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩶ۧ;

    .line 414
    iget v5, v4, Ll/ۚ᩶ۧ;->֫:I

    const/16 v6, 0x8

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    .line 415
    iget v4, v4, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {p0, v4, v5}, Ll/֨᩶ۧ;->֫(II)I

    move-result v4

    if-ne v4, p1, :cond_2

    goto :goto_2

    :cond_0
    if-ne v5, v7, :cond_2

    .line 420
    iget v5, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v4, v4, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v4, v5

    :goto_1
    if-ge v5, v4, :cond_2

    add-int/lit8 v6, v3, 0x1

    .line 422
    invoke-virtual {p0, v5, v6}, Ll/֨᩶ۧ;->֫(II)I

    move-result v6

    if-ne v6, p1, :cond_1

    :goto_2
    return v7

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method private ᩳ(II)I
    .locals 9

    .line 330
    iget-object v0, p0, Ll/֨᩶ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    const/16 v3, 0x8

    if-ltz v1, :cond_d

    .line 332
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩶ۧ;

    .line 333
    iget v5, v4, Ll/ۚ᩶ۧ;->֫:I

    const/4 v6, 0x2

    if-ne v5, v3, :cond_8

    .line 335
    iget v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v5, v4, Ll/ۚ᩶ۧ;->ۧ:I

    if-ge v3, v5, :cond_0

    move v7, v3

    move v8, v5

    goto :goto_1

    :cond_0
    move v8, v3

    move v7, v5

    :goto_1
    if-lt p1, v7, :cond_6

    if-gt p1, v8, :cond_6

    if-ne v7, v3, :cond_3

    if-ne p2, v2, :cond_1

    add-int/lit8 v5, v5, 0x1

    .line 346
    iput v5, v4, Ll/ۚ᩶ۧ;->ۧ:I

    goto :goto_2

    :cond_1
    if-ne p2, v6, :cond_2

    add-int/lit8 v5, v5, -0x1

    .line 348
    iput v5, v4, Ll/ۚ᩶ۧ;->ۧ:I

    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_3
    if-ne p2, v2, :cond_4

    add-int/lit8 v3, v3, 0x1

    .line 354
    iput v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    goto :goto_3

    :cond_4
    if-ne p2, v6, :cond_5

    add-int/lit8 v3, v3, -0x1

    .line 356
    iput v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_4

    :cond_6
    if-ge p1, v3, :cond_c

    if-ne p2, v2, :cond_7

    add-int/lit8 v3, v3, 0x1

    .line 364
    iput v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    add-int/lit8 v5, v5, 0x1

    .line 365
    iput v5, v4, Ll/ۚ᩶ۧ;->ۧ:I

    goto :goto_4

    :cond_7
    if-ne p2, v6, :cond_c

    add-int/lit8 v3, v3, -0x1

    .line 367
    iput v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    add-int/lit8 v5, v5, -0x1

    .line 368
    iput v5, v4, Ll/ۚ᩶ۧ;->ۧ:I

    goto :goto_4

    .line 372
    :cond_8
    iget v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    if-gt v3, p1, :cond_a

    if-ne v5, v2, :cond_9

    .line 374
    iget v3, v4, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr p1, v3

    goto :goto_4

    :cond_9
    if-ne v5, v6, :cond_c

    .line 376
    iget v3, v4, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr p1, v3

    goto :goto_4

    :cond_a
    if-ne p2, v2, :cond_b

    add-int/lit8 v3, v3, 0x1

    .line 380
    iput v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    goto :goto_4

    :cond_b
    if-ne p2, v6, :cond_c

    add-int/lit8 v3, v3, -0x1

    .line 382
    iput v3, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    :cond_c
    :goto_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 395
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v2

    :goto_5
    if-ltz p2, :cond_11

    .line 396
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩶ۧ;

    .line 397
    iget v2, v1, Ll/ۚ᩶ۧ;->֫:I

    iget-object v4, p0, Ll/֨᩶ۧ;->ܳ:Ll/ۨۤ;

    const/4 v5, 0x0

    if-ne v2, v3, :cond_f

    .line 398
    iget v2, v1, Ll/ۚ᩶ۧ;->ۧ:I

    iget v6, v1, Ll/ۚ᩶ۧ;->ᩳ:I

    if-eq v2, v6, :cond_e

    if-gez v2, :cond_10

    .line 399
    :cond_e
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_6

    .line 402
    :cond_f
    iget v2, v1, Ll/ۚ᩶ۧ;->ۧ:I

    if-gtz v2, :cond_10

    .line 403
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 742
    :goto_6
    iput-object v5, v1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v4, v1}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 p2, p2, -0x1

    goto :goto_5

    :cond_11
    return p1
.end method


# virtual methods
.method public final ֫(II)I
    .locals 6

    .line 472
    iget-object v0, p0, Ll/֨᩶ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_6

    .line 474
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ᩶ۧ;

    .line 475
    iget v3, v2, Ll/ۚ᩶ۧ;->֫:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_2

    .line 476
    iget v3, v2, Ll/ۚ᩶ۧ;->ᩳ:I

    if-ne v3, p1, :cond_0

    .line 477
    iget p1, v2, Ll/ۚ᩶ۧ;->ۧ:I

    goto :goto_1

    :cond_0
    if-ge v3, p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    .line 482
    :cond_1
    iget v2, v2, Ll/ۚ᩶ۧ;->ۧ:I

    if-gt v2, p1, :cond_5

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 486
    :cond_2
    iget v4, v2, Ll/ۚ᩶ۧ;->ᩳ:I

    if-gt v4, p1, :cond_5

    const/4 v5, 0x2

    if-ne v3, v5, :cond_4

    .line 488
    iget v2, v2, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v4, v2

    if-ge p1, v4, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    sub-int/2addr p1, v2

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    .line 493
    iget v2, v2, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr p1, v2

    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    return p1
.end method

.method public final ֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;
    .locals 1

    .line 727
    iget-object v0, p0, Ll/֨᩶ۧ;->ܳ:Ll/ۨۤ;

    invoke-virtual {v0}, Ll/ۨۤ;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ᩶ۧ;

    if-nez v0, :cond_0

    .line 729
    new-instance v0, Ll/ۚ᩶ۧ;

    .line 651
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 652
    iput p2, v0, Ll/ۚ᩶ۧ;->֫:I

    .line 653
    iput p3, v0, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 654
    iput p4, v0, Ll/ۚ᩶ۧ;->ۧ:I

    .line 655
    iput-object p1, v0, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    return-object v0

    .line 731
    :cond_0
    iput p2, v0, Ll/ۚ᩶ۧ;->֫:I

    .line 732
    iput p3, v0, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 733
    iput p4, v0, Ll/ۚ᩶ۧ;->ۧ:I

    .line 734
    iput-object p1, v0, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫()V
    .locals 6

    .line 119
    iget-object v0, p0, Ll/֨᩶ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 121
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩶ۧ;

    .line 1137
    iget-object v5, p0, Ll/֨᩶ۧ;->֫:Ll/ܶۗۧ;

    invoke-virtual {v5, v4}, Ll/ܶۗۧ;->֫(Ll/ۚ᩶ۧ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p0, v0}, Ll/֨᩶ۧ;->֫(Ljava/util/ArrayList;)V

    .line 124
    iput v2, p0, Ll/֨᩶ۧ;->ۧ:I

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 4

    .line 748
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 750
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ᩶ۧ;

    const/4 v3, 0x0

    .line 742
    iput-object v3, v2, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    iget-object v3, p0, Ll/֨᩶ۧ;->ܳ:Ll/ۨۤ;

    invoke-virtual {v3, v2}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 752
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(Ll/ۚ᩶ۧ;I)V
    .locals 4

    .line 1114
    iget-object v0, p0, Ll/֨᩶ۧ;->֫:Ll/ܶۗۧ;

    invoke-virtual {v0, p1}, Ll/ܶۗۧ;->֫(Ll/ۚ᩶ۧ;)V

    .line 316
    iget v1, p1, Ll/ۚ᩶ۧ;->֫:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 321
    iget v1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    iget-object p1, p1, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 1108
    iget-object v0, v0, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v0, p2, v1, p1}, Ll/۬۬ۧ;->viewRangeUpdate(IILjava/lang/Object;)V

    .line 1109
    iput-boolean v3, v0, Ll/۬۬ۧ;->mItemsChanged:Z

    return-void

    .line 324
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "only remove and update ops can be dispatched in first pass"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 318
    :cond_1
    iget p1, p1, Ll/ۚ᩶ۧ;->ۧ:I

    .line 1093
    iget-object v0, v0, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v0, p2, p1, v3}, Ll/۬۬ۧ;->offsetPositionRecordsForRemove(IIZ)V

    .line 1094
    iput-boolean v3, v0, Ll/۬۬ۧ;->mItemsAddedOrRemoved:Z

    .line 1095
    iget-object p2, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    iget v0, p2, Ll/᩸۬ۧ;->֫:I

    add-int/2addr v0, p1

    iput v0, p2, Ll/᩸۬ۧ;->֫:I

    return-void
.end method

.method public final ֫(I)Z
    .locals 1

    .line 464
    iget v0, p0, Ll/֨᩶ۧ;->ۧ:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(III)Z
    .locals 2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p3, v0, :cond_2

    const/4 p3, 0x0

    const/16 v1, 0x8

    .line 546
    invoke-virtual {p0, p3, v1, p1, p2}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object p1

    iget-object p2, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    iget p1, p0, Ll/֨᩶ۧ;->ۧ:I

    or-int/2addr p1, v1

    iput p1, p0, Ll/֨᩶ۧ;->ۧ:I

    .line 548
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1

    .line 544
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Moving more than 1 item is not supported yet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IILjava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    .line 507
    invoke-virtual {p0, p3, v1, p1, p2}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object p1

    iget-object p2, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    iget p1, p0, Ll/֨᩶ۧ;->ۧ:I

    or-int/2addr p1, v1

    iput p1, p0, Ll/֨᩶ۧ;->ۧ:I

    .line 509
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 9

    .line 557
    invoke-virtual {p0}, Ll/֨᩶ۧ;->֫()V

    .line 558
    iget-object v0, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    .line 560
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩶ۧ;

    .line 561
    iget v5, v4, Ll/ۚ᩶ۧ;->֫:I

    const/4 v6, 0x1

    iget-object v7, p0, Ll/֨᩶ۧ;->֫:Ll/ܶۗۧ;

    if-eq v5, v6, :cond_3

    const/4 v8, 0x2

    if-eq v5, v8, :cond_2

    const/4 v8, 0x4

    if-eq v5, v8, :cond_1

    const/16 v8, 0x8

    if-eq v5, v8, :cond_0

    goto :goto_1

    .line 1137
    :cond_0
    invoke-virtual {v7, v4}, Ll/ܶۗۧ;->֫(Ll/ۚ᩶ۧ;)V

    .line 576
    iget v5, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v4, v4, Ll/ۚ᩶ۧ;->ۧ:I

    .line 1148
    iget-object v7, v7, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v7, v5, v4}, Ll/۬۬ۧ;->offsetPositionRecordsForMove(II)V

    .line 1150
    iput-boolean v6, v7, Ll/۬۬ۧ;->mItemsAddedOrRemoved:Z

    goto :goto_1

    .line 1137
    :cond_1
    invoke-virtual {v7, v4}, Ll/ܶۗۧ;->֫(Ll/ۚ᩶ۧ;)V

    .line 572
    iget v5, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v8, v4, Ll/ۚ᩶ۧ;->ۧ:I

    iget-object v4, v4, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 1108
    iget-object v7, v7, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v7, v5, v8, v4}, Ll/۬۬ۧ;->viewRangeUpdate(IILjava/lang/Object;)V

    .line 1109
    iput-boolean v6, v7, Ll/۬۬ۧ;->mItemsChanged:Z

    goto :goto_1

    .line 1137
    :cond_2
    invoke-virtual {v7, v4}, Ll/ܶۗۧ;->֫(Ll/ۚ᩶ۧ;)V

    .line 568
    iget v5, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v4, v4, Ll/ۚ᩶ۧ;->ۧ:I

    .line 1093
    iget-object v7, v7, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v7, v5, v4, v6}, Ll/۬۬ۧ;->offsetPositionRecordsForRemove(IIZ)V

    .line 1094
    iput-boolean v6, v7, Ll/۬۬ۧ;->mItemsAddedOrRemoved:Z

    .line 1095
    iget-object v5, v7, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    iget v6, v5, Ll/᩸۬ۧ;->֫:I

    add-int/2addr v6, v4

    iput v6, v5, Ll/᩸۬ۧ;->֫:I

    goto :goto_1

    .line 1137
    :cond_3
    invoke-virtual {v7, v4}, Ll/ܶۗۧ;->֫(Ll/ۚ᩶ۧ;)V

    .line 564
    iget v5, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v4, v4, Ll/ۚ᩶ۧ;->ۧ:I

    .line 1142
    iget-object v7, v7, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v7, v5, v4}, Ll/۬۬ۧ;->offsetPositionRecordsForInsert(II)V

    .line 1143
    iput-boolean v6, v7, Ll/۬۬ۧ;->mItemsAddedOrRemoved:Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 583
    :cond_4
    invoke-virtual {p0, v0}, Ll/֨᩶ۧ;->֫(Ljava/util/ArrayList;)V

    .line 584
    iput v2, p0, Ll/֨᩶ۧ;->ۧ:I

    return-void
.end method

.method public final ۧ(II)Z
    .locals 2

    const/4 v0, 0x1

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 519
    invoke-virtual {p0, v1, v0, p1, p2}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object p1

    iget-object p2, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    iget p1, p0, Ll/֨᩶ۧ;->ۧ:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/֨᩶ۧ;->ۧ:I

    .line 521
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 460
    iget-object v0, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(II)Z
    .locals 3

    const/4 v0, 0x1

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 531
    invoke-virtual {p0, v1, v2, p1, p2}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object p1

    iget-object p2, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    iget p1, p0, Ll/֨᩶ۧ;->ۧ:I

    or-int/2addr p1, v2

    iput p1, p0, Ll/֨᩶ۧ;->ۧ:I

    .line 533
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ll/֨᩶ۧ;->֫(Ljava/util/ArrayList;)V

    .line 88
    iget-object v0, p0, Ll/֨᩶ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ll/֨᩶ۧ;->֫(Ljava/util/ArrayList;)V

    const/4 v0, 0x0

    .line 89
    iput v0, p0, Ll/֨᩶ۧ;->ۧ:I

    return-void
.end method

.method public final ᩳ()V
    .locals 15

    .line 93
    iget-object v0, p0, Ll/֨᩶ۧ;->ܽ:Ll/ۢۗۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    :cond_0
    :goto_0
    iget-object v1, p0, Ll/֨᩶ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    :goto_1
    const/16 v5, 0x8

    const/4 v6, -0x1

    if-ltz v2, :cond_3

    .line 215
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚ᩶ۧ;

    .line 216
    iget v7, v7, Ll/ۚ᩶ۧ;->֫:I

    if-ne v7, v5, :cond_1

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_1
    const/4 v4, 0x1

    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_3
    const/4 v2, -0x1

    :goto_2
    const/4 v4, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x4

    if-eq v2, v6, :cond_22

    add-int/lit8 v5, v2, 0x1

    .line 39
    iget-object v6, v0, Ll/ۢۗۧ;->֫:Ll/֨᩶ۧ;

    iget-object v9, v6, Ll/֨᩶ۧ;->ܳ:Ll/ۨۤ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۚ᩶ۧ;

    .line 40
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۚ᩶ۧ;

    .line 41
    iget v12, v11, Ll/ۚ᩶ۧ;->֫:I

    if-eq v12, v3, :cond_1d

    if-eq v12, v7, :cond_b

    if-eq v12, v8, :cond_4

    goto :goto_0

    .line 179
    :cond_4
    iget v7, v10, Ll/ۚ᩶ۧ;->ۧ:I

    iget v12, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-ge v7, v12, :cond_5

    add-int/lit8 v12, v12, -0x1

    .line 180
    iput v12, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    goto :goto_3

    .line 181
    :cond_5
    iget v13, v11, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v12, v13

    if-ge v7, v12, :cond_6

    add-int/lit8 v13, v13, -0x1

    .line 183
    iput v13, v11, Ll/ۚ᩶ۧ;->ۧ:I

    .line 184
    iget v7, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget-object v12, v11, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v6, v12, v8, v7, v3}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v3

    goto :goto_4

    :cond_6
    :goto_3
    move-object v3, v4

    .line 187
    :goto_4
    iget v7, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v12, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-gt v7, v12, :cond_7

    add-int/lit8 v12, v12, 0x1

    .line 188
    iput v12, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    goto :goto_5

    .line 189
    :cond_7
    iget v13, v11, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v12, v13

    if-ge v7, v12, :cond_8

    sub-int/2addr v12, v7

    add-int/lit8 v7, v7, 0x1

    .line 192
    iget-object v13, v11, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v6, v13, v8, v7, v12}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v6

    .line 195
    iget v7, v11, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v7, v12

    iput v7, v11, Ll/ۚ᩶ۧ;->ۧ:I

    goto :goto_6

    :cond_8
    :goto_5
    move-object v6, v4

    .line 197
    :goto_6
    invoke-virtual {v1, v5, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 198
    iget v5, v11, Ll/ۚ᩶ۧ;->ۧ:I

    if-lez v5, :cond_9

    .line 199
    invoke-virtual {v1, v2, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 201
    :cond_9
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 742
    iput-object v4, v11, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v9, v11}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    :goto_7
    if-eqz v3, :cond_a

    .line 205
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_a
    if-eqz v6, :cond_0

    .line 208
    invoke-virtual {v1, v2, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 61
    :cond_b
    iget v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v8, v10, Ll/ۚ᩶ۧ;->ۧ:I

    if-ge v4, v8, :cond_d

    .line 63
    iget v12, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-ne v12, v4, :cond_c

    iget v12, v11, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int v4, v8, v4

    if-ne v12, v4, :cond_c

    const/4 v4, 0x1

    goto :goto_8

    :cond_c
    const/4 v4, 0x0

    :goto_8
    const/4 v12, 0x0

    goto :goto_a

    .line 69
    :cond_d
    iget v12, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    add-int/lit8 v13, v8, 0x1

    if-ne v12, v13, :cond_e

    iget v12, v11, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v8

    if-ne v12, v4, :cond_e

    const/4 v4, 0x1

    goto :goto_9

    :cond_e
    const/4 v4, 0x0

    :goto_9
    const/4 v12, 0x1

    .line 76
    :goto_a
    iget v13, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-ge v8, v13, :cond_f

    add-int/lit8 v13, v13, -0x1

    .line 77
    iput v13, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    goto :goto_b

    .line 78
    :cond_f
    iget v14, v11, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v13, v14

    if-ge v8, v13, :cond_10

    add-int/lit8 v14, v14, -0x1

    .line 80
    iput v14, v11, Ll/ۚ᩶ۧ;->ۧ:I

    .line 81
    iput v7, v10, Ll/ۚ᩶ۧ;->֫:I

    .line 82
    iput v3, v10, Ll/ۚ᩶ۧ;->ۧ:I

    .line 83
    iget v2, v11, Ll/ۚ᩶ۧ;->ۧ:I

    if-nez v2, :cond_0

    .line 84
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 742
    iput-object v1, v11, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v9, v11}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 92
    :cond_10
    :goto_b
    iget v3, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v8, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-gt v3, v8, :cond_11

    add-int/lit8 v8, v8, 0x1

    .line 93
    iput v8, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    goto :goto_c

    .line 94
    :cond_11
    iget v13, v11, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v8, v13

    if-ge v3, v8, :cond_12

    sub-int/2addr v8, v3

    add-int/lit8 v3, v3, 0x1

    const/4 v13, 0x0

    .line 97
    invoke-virtual {v6, v13, v7, v3, v8}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v3

    .line 98
    iget v6, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v7, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    sub-int/2addr v6, v7

    iput v6, v11, Ll/ۚ᩶ۧ;->ۧ:I

    goto :goto_d

    :cond_12
    :goto_c
    const/4 v13, 0x0

    move-object v3, v13

    :goto_d
    if-eqz v4, :cond_13

    .line 103
    invoke-virtual {v1, v2, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 104
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 742
    iput-object v13, v10, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v9, v10}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_13
    if-eqz v12, :cond_17

    if-eqz v3, :cond_15

    .line 112
    iget v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v6, v3, Ll/ۚ᩶ۧ;->ᩳ:I

    if-le v4, v6, :cond_14

    .line 113
    iget v6, v3, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 115
    :cond_14
    iget v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    iget v6, v3, Ll/ۚ᩶ۧ;->ᩳ:I

    if-le v4, v6, :cond_15

    .line 116
    iget v6, v3, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    .line 119
    :cond_15
    iget v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v6, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-le v4, v6, :cond_16

    .line 120
    iget v6, v11, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 122
    :cond_16
    iget v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    iget v6, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-le v4, v6, :cond_1b

    .line 123
    iget v6, v11, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    goto :goto_e

    :cond_17
    if-eqz v3, :cond_19

    .line 127
    iget v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v6, v3, Ll/ۚ᩶ۧ;->ᩳ:I

    if-lt v4, v6, :cond_18

    .line 128
    iget v6, v3, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 130
    :cond_18
    iget v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    iget v6, v3, Ll/ۚ᩶ۧ;->ᩳ:I

    if-lt v4, v6, :cond_19

    .line 131
    iget v6, v3, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    .line 134
    :cond_19
    iget v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v6, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-lt v4, v6, :cond_1a

    .line 135
    iget v6, v11, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 137
    :cond_1a
    iget v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    iget v6, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-lt v4, v6, :cond_1b

    .line 138
    iget v6, v11, Ll/ۚ᩶ۧ;->ۧ:I

    sub-int/2addr v4, v6

    iput v4, v10, Ll/ۚ᩶ۧ;->ۧ:I

    .line 142
    :cond_1b
    :goto_e
    invoke-virtual {v1, v2, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 143
    iget v4, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    iget v6, v10, Ll/ۚ᩶ۧ;->ۧ:I

    if-eq v4, v6, :cond_1c

    .line 144
    invoke-virtual {v1, v5, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    .line 146
    :cond_1c
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_f
    if-eqz v3, :cond_0

    .line 149
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 157
    :cond_1d
    iget v3, v10, Ll/ۚ᩶ۧ;->ۧ:I

    iget v4, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-ge v3, v4, :cond_1e

    const/4 v6, -0x1

    goto :goto_10

    :cond_1e
    const/4 v6, 0x0

    .line 160
    :goto_10
    iget v7, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    if-ge v7, v4, :cond_1f

    add-int/lit8 v6, v6, 0x1

    :cond_1f
    if-gt v4, v7, :cond_20

    .line 164
    iget v4, v11, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v7, v4

    iput v7, v10, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 166
    :cond_20
    iget v4, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    if-gt v4, v3, :cond_21

    .line 167
    iget v7, v11, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v3, v7

    iput v3, v10, Ll/ۚ᩶ۧ;->ۧ:I

    :cond_21
    add-int/2addr v4, v6

    .line 169
    iput v4, v11, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 170
    invoke-virtual {v1, v2, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 171
    invoke-virtual {v1, v5, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 94
    :cond_22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_11
    if-ge v2, v0, :cond_3a

    .line 96
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩶ۧ;

    .line 97
    iget v6, v4, Ll/ۚ᩶ۧ;->֫:I

    if-eq v6, v3, :cond_39

    iget-object v9, p0, Ll/֨᩶ۧ;->ܳ:Ll/ۨۤ;

    iget-object v10, p0, Ll/֨᩶ۧ;->֫:Ll/ܶۗۧ;

    if-eq v6, v7, :cond_2e

    if-eq v6, v8, :cond_24

    if-eq v6, v5, :cond_23

    goto/16 :goto_1d

    .line 130
    :cond_23
    invoke-direct {p0, v4}, Ll/֨᩶ۧ;->ۧ(Ll/ۚ᩶ۧ;)V

    goto/16 :goto_1d

    .line 188
    :cond_24
    iget v5, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 190
    iget v6, v4, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v6, v5

    const/4 v7, -0x1

    const/4 v8, 0x0

    move v7, v5

    const/4 v8, -0x1

    const/4 v11, 0x0

    :goto_12
    if-ge v5, v6, :cond_2b

    .line 1076
    iget-object v12, v10, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v12, v5, v3}, Ll/۬۬ۧ;->findViewHolderForPosition(IZ)Ll/ۗ۬ۧ;

    move-result-object v13

    if-nez v13, :cond_25

    goto :goto_13

    .line 1082
    :cond_25
    iget-object v12, v12, Ll/۬۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    iget-object v14, v13, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 367
    iget-object v12, v12, Ll/᩹᩶ۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_26

    .line 1083
    sget v12, Ll/۬۬ۧ;->HORIZONTAL:I

    :goto_13
    const/4 v13, 0x0

    :cond_26
    if-nez v13, :cond_29

    .line 194
    invoke-direct {p0, v5}, Ll/֨᩶ۧ;->ۧ(I)Z

    move-result v12

    if-eqz v12, :cond_27

    goto :goto_14

    :cond_27
    if-ne v8, v3, :cond_28

    .line 205
    iget-object v8, v4, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    const/4 v12, 0x4

    invoke-virtual {p0, v8, v12, v7, v11}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v7

    .line 207
    invoke-direct {p0, v7}, Ll/֨᩶ۧ;->ۧ(Ll/ۚ᩶ۧ;)V

    const/4 v11, 0x0

    move v7, v5

    :cond_28
    const/4 v8, 0x0

    goto :goto_15

    :cond_29
    :goto_14
    const/4 v12, 0x4

    if-nez v8, :cond_2a

    .line 196
    iget-object v8, v4, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    invoke-virtual {p0, v8, v12, v7, v11}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v7

    .line 198
    invoke-direct {p0, v7}, Ll/֨᩶ۧ;->֫(Ll/ۚ᩶ۧ;)V

    const/4 v11, 0x0

    move v7, v5

    :cond_2a
    const/4 v8, 0x1

    :goto_15
    add-int/2addr v11, v3

    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    .line 215
    :cond_2b
    iget v5, v4, Ll/ۚ᩶ۧ;->ۧ:I

    if-eq v11, v5, :cond_2c

    .line 216
    iget-object v5, v4, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    const/4 v6, 0x0

    .line 742
    iput-object v6, v4, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v9, v4}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    const/4 v4, 0x4

    .line 218
    invoke-virtual {p0, v5, v4, v7, v11}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v4

    :cond_2c
    if-nez v8, :cond_2d

    .line 221
    invoke-direct {p0, v4}, Ll/֨᩶ۧ;->֫(Ll/ۚ᩶ۧ;)V

    goto/16 :goto_1d

    .line 223
    :cond_2d
    invoke-direct {p0, v4}, Ll/֨᩶ۧ;->ۧ(Ll/ۚ᩶ۧ;)V

    goto/16 :goto_1d

    .line 134
    :cond_2e
    iget v5, v4, Ll/ۚ᩶ۧ;->ᩳ:I

    .line 136
    iget v6, v4, Ll/ۚ᩶ۧ;->ۧ:I

    add-int/2addr v6, v5

    const/4 v7, 0x0

    const/4 v8, -0x1

    move v11, v5

    :goto_16
    if-ge v11, v6, :cond_36

    .line 1076
    iget-object v12, v10, Ll/ܶۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v12, v11, v3}, Ll/۬۬ۧ;->findViewHolderForPosition(IZ)Ll/ۗ۬ۧ;

    move-result-object v13

    if-nez v13, :cond_2f

    goto :goto_17

    .line 1082
    :cond_2f
    iget-object v12, v12, Ll/۬۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    iget-object v14, v13, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 367
    iget-object v12, v12, Ll/᩹᩶ۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_30

    .line 1083
    sget v12, Ll/۬۬ۧ;->HORIZONTAL:I

    :goto_17
    const/4 v13, 0x0

    :cond_30
    if-nez v13, :cond_33

    .line 141
    invoke-direct {p0, v11}, Ll/֨᩶ۧ;->ۧ(I)Z

    move-result v12

    if-eqz v12, :cond_31

    goto :goto_19

    :cond_31
    const/4 v12, 0x0

    const/4 v13, 0x2

    if-ne v8, v3, :cond_32

    .line 162
    invoke-virtual {p0, v12, v13, v5, v7}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v8

    .line 163
    invoke-direct {p0, v8}, Ll/֨᩶ۧ;->ۧ(Ll/ۚ᩶ۧ;)V

    const/4 v8, 0x1

    goto :goto_18

    :cond_32
    const/4 v8, 0x0

    :goto_18
    const/4 v12, 0x0

    goto :goto_1b

    :cond_33
    :goto_19
    const/4 v12, 0x0

    const/4 v13, 0x2

    if-nez v8, :cond_34

    .line 151
    invoke-virtual {p0, v12, v13, v5, v7}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v8

    .line 152
    invoke-direct {p0, v8}, Ll/֨᩶ۧ;->֫(Ll/ۚ᩶ۧ;)V

    const/4 v8, 0x1

    goto :goto_1a

    :cond_34
    const/4 v8, 0x0

    :goto_1a
    const/4 v12, 0x1

    :goto_1b
    if-eqz v8, :cond_35

    sub-int/2addr v11, v7

    sub-int/2addr v6, v7

    const/4 v7, 0x1

    goto :goto_1c

    :cond_35
    add-int/lit8 v7, v7, 0x1

    :goto_1c
    add-int/2addr v11, v3

    move v8, v12

    goto :goto_16

    .line 176
    :cond_36
    iget v6, v4, Ll/ۚ᩶ۧ;->ۧ:I

    const/4 v10, 0x0

    if-eq v7, v6, :cond_37

    .line 742
    iput-object v10, v4, Ll/ۚ᩶ۧ;->ܽ:Ljava/lang/Object;

    .line 743
    invoke-virtual {v9, v4}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    const/4 v4, 0x2

    .line 178
    invoke-virtual {p0, v10, v4, v5, v7}, Ll/֨᩶ۧ;->֫(Ljava/lang/Object;III)Ll/ۚ᩶ۧ;

    move-result-object v4

    :cond_37
    if-nez v8, :cond_38

    .line 181
    invoke-direct {p0, v4}, Ll/֨᩶ۧ;->֫(Ll/ۚ᩶ۧ;)V

    goto :goto_1d

    .line 183
    :cond_38
    invoke-direct {p0, v4}, Ll/֨᩶ۧ;->ۧ(Ll/ۚ᩶ۧ;)V

    goto :goto_1d

    .line 432
    :cond_39
    invoke-direct {p0, v4}, Ll/֨᩶ۧ;->ۧ(Ll/ۚ᩶ۧ;)V

    :goto_1d
    add-int/lit8 v2, v2, 0x1

    const/16 v5, 0x8

    const/4 v7, 0x2

    const/4 v8, 0x4

    goto/16 :goto_11

    .line 115
    :cond_3a
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
