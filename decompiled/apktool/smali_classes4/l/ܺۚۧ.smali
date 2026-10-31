.class public final Ll/ܺۚۧ;
.super Ljava/lang/Object;
.source "H8MM"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֡:Z

.field public final ֨:Ll/ᩳ֨֫;

.field public ֫:I

.field public final ۖ:Ll/ۜᩴۧ;

.field public final ۘ:Ljava/util/List;

.field public ۚ:Ll/ۜۚۧ;

.field public ۜ:Ll/᩸᩷ۧ;

.field public final ۠:Landroid/util/SparseArray;

.field public ۡ:Z

.field public ۢ:I

.field public final ۧ:Landroid/util/SparseIntArray;

.field public ܳ:Ll/֡ۚۧ;

.field public ܺ:I

.field public final ܽ:Ll/᩷ۚۧ;

.field public ܿ:Z

.field public final ᩳ:I

.field public final ᩴ:Landroid/util/SparseBooleanArray;

.field public final ᩵:Landroid/util/SparseBooleanArray;

.field public final ᩷:Ll/᩷֡ۧ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(IILl/ۜᩴۧ;Ll/ۢ֨֫;Ll/᩷֡ۧ;)V
    .locals 2

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 329
    iput-object p5, p0, Ll/ܺۚۧ;->᩷:Ll/᩷֡ۧ;

    .line 331
    iput p1, p0, Ll/ܺۚۧ;->᩻:I

    .line 332
    iput p2, p0, Ll/ܺۚۧ;->ᩳ:I

    .line 333
    iput-object p3, p0, Ll/ܺۚۧ;->ۖ:Ll/ۜᩴۧ;

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 337
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܺۚۧ;->ۘ:Ljava/util/List;

    .line 338
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 335
    :cond_1
    :goto_0
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܺۚۧ;->ۘ:Ljava/util/List;

    .line 340
    :goto_1
    new-instance p1, Ll/ᩳ֨֫;

    const/16 p2, 0x24b8

    new-array p2, p2, [B

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Ll/ᩳ֨֫;-><init>([BI)V

    iput-object p1, p0, Ll/ܺۚۧ;->֨:Ll/ᩳ֨֫;

    .line 341
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Ll/ܺۚۧ;->ᩴ:Landroid/util/SparseBooleanArray;

    .line 342
    new-instance p2, Landroid/util/SparseBooleanArray;

    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p2, p0, Ll/ܺۚۧ;->᩵:Landroid/util/SparseBooleanArray;

    .line 343
    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    iput-object p2, p0, Ll/ܺۚۧ;->۠:Landroid/util/SparseArray;

    .line 344
    new-instance p4, Landroid/util/SparseIntArray;

    invoke-direct {p4}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p4, p0, Ll/ܺۚۧ;->ۧ:Landroid/util/SparseIntArray;

    .line 345
    new-instance p4, Ll/᩷ۚۧ;

    invoke-direct {p4}, Ll/᩷ۚۧ;-><init>()V

    iput-object p4, p0, Ll/ܺۚۧ;->ܽ:Ll/᩷ۚۧ;

    .line 346
    sget-object p4, Ll/᩸᩷ۧ;->ܿ:Ll/᩸᩷ۧ;

    iput-object p4, p0, Ll/ܺۚۧ;->ۜ:Ll/᩸᩷ۧ;

    const/4 p4, -0x1

    .line 347
    iput p4, p0, Ll/ܺۚۧ;->ۢ:I

    .line 614
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 615
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 145
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 618
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p4

    const/4 p5, 0x0

    :goto_2
    if-ge p5, p4, :cond_2

    .line 620
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۚۧ;

    invoke-virtual {p2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    .line 622
    :cond_2
    new-instance p1, Ll/ܿۚۧ;

    new-instance p4, Ll/ۢۚۧ;

    invoke-direct {p4, p0}, Ll/ۢۚۧ;-><init>(Ll/ܺۚۧ;)V

    invoke-direct {p1, p4}, Ll/ܿۚۧ;-><init>(Ll/ᩳۚۧ;)V

    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 p1, 0x0

    .line 623
    iput-object p1, p0, Ll/ܺۚۧ;->ܳ:Ll/֡ۚۧ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۚۧ;)Ll/֡ۚۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۚۧ;->ܳ:Ll/֡ۚۧ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܺۚۧ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺۚۧ;->ۢ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۚۧ;Ll/֡ۚۧ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺۚۧ;->ܳ:Ll/֡ۚۧ;

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܺۚۧ;)Landroid/util/SparseBooleanArray;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۚۧ;->᩵:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ܺۚۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܺۚۧ;->֡:Z

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/ܺۚۧ;)Landroid/util/SparseArray;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۚۧ;->۠:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺۚۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܺۚۧ;->᩻:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺۚۧ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺۚۧ;->ܺ:I

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܺۚۧ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۚۧ;->ۘ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܺۚۧ;)Ll/᩸᩷ۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۚۧ;->ۜ:Ll/᩸᩷ۧ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܺۚۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܺۚۧ;->ܺ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܺۚۧ;)Ll/ᩴۚۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۚۧ;->᩷:Ll/᩷֡ۧ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ܺۚۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺۚۧ;->֡:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ܺۚۧ;)Landroid/util/SparseBooleanArray;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۚۧ;->ᩴ:Landroid/util/SparseBooleanArray;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 427
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v10

    const/4 v12, 0x1

    const/4 v13, 0x0

    .line 428
    iget v14, v0, Ll/ܺۚۧ;->᩻:I

    const/4 v15, 0x2

    if-ne v14, v15, :cond_0

    const/4 v3, 0x1

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v9, 0x0

    .line 429
    :goto_0
    iget-boolean v3, v0, Ll/ܺۚۧ;->֡:Z

    const-wide/16 v16, -0x1

    if-eqz v3, :cond_5

    .line 430
    iget-object v3, v0, Ll/ܺۚۧ;->ܽ:Ll/᩷ۚۧ;

    cmp-long v4, v10, v16

    if-eqz v4, :cond_1

    if-nez v9, :cond_1

    .line 431
    invoke-virtual {v3}, Ll/᩷ۚۧ;->ܽ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 432
    iget v4, v0, Ll/ܺۚۧ;->ۢ:I

    invoke-virtual {v3, v1, v2, v4}, Ll/᩷ۚۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;I)I

    move-result v1

    return v1

    .line 540
    :cond_1
    iget-boolean v4, v0, Ll/ܺۚۧ;->ܿ:Z

    if-nez v4, :cond_3

    .line 541
    iput-boolean v12, v0, Ll/ܺۚۧ;->ܿ:Z

    .line 542
    invoke-virtual {v3}, Ll/᩷ۚۧ;->֫()J

    move-result-wide v4

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v8, v4, v6

    if-eqz v8, :cond_2

    .line 543
    new-instance v7, Ll/ۜۚۧ;

    .line 545
    invoke-virtual {v3}, Ll/᩷ۚۧ;->ۧ()Ll/ۢ֨֫;

    move-result-object v4

    .line 546
    invoke-virtual {v3}, Ll/᩷ۚۧ;->֫()J

    move-result-wide v5

    iget v8, v0, Ll/ܺۚۧ;->ۢ:I

    move-object v3, v7

    move-object v15, v7

    move/from16 v18, v8

    move-wide v7, v10

    move/from16 v19, v9

    move/from16 v9, v18

    invoke-direct/range {v3 .. v9}, Ll/ۜۚۧ;-><init>(Ll/ۢ֨֫;JJI)V

    iput-object v15, v0, Ll/ܺۚۧ;->ۚ:Ll/ۜۚۧ;

    .line 550
    iget-object v3, v0, Ll/ܺۚۧ;->ۜ:Ll/᩸᩷ۧ;

    invoke-virtual {v15}, Ll/᩻᩷ۧ;->֫()Ll/֫᩷ۧ;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    goto :goto_1

    :cond_2
    move/from16 v19, v9

    .line 552
    iget-object v4, v0, Ll/ܺۚۧ;->ۜ:Ll/᩸᩷ۧ;

    new-instance v5, Ll/᩷ۢۧ;

    invoke-virtual {v3}, Ll/᩷ۚۧ;->֫()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {v4, v5}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    goto :goto_1

    :cond_3
    move/from16 v19, v9

    .line 436
    :goto_1
    iget-boolean v3, v0, Ll/ܺۚۧ;->ۡ:Z

    if-eqz v3, :cond_4

    .line 437
    iput-boolean v13, v0, Ll/ܺۚۧ;->ۡ:Z

    const-wide/16 v3, 0x0

    .line 438
    invoke-virtual {v0, v3, v4, v3, v4}, Ll/ܺۚۧ;->֫(JJ)V

    .line 439
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-eqz v7, :cond_4

    .line 440
    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    return v12

    .line 445
    :cond_4
    iget-object v3, v0, Ll/ܺۚۧ;->ۚ:Ll/ۜۚۧ;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ll/᩻᩷ۧ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 446
    iget-object v3, v0, Ll/ܺۚۧ;->ۚ:Ll/ۜۚۧ;

    invoke-virtual {v3, v1, v2}, Ll/᩻᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v1

    return v1

    :cond_5
    move/from16 v19, v9

    .line 558
    :cond_6
    iget-object v2, v0, Ll/ܺۚۧ;->֨:Ll/ᩳ֨֫;

    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 560
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v4

    rsub-int v4, v4, 0x24b8

    const/16 v5, 0xbc

    if-ge v4, v5, :cond_8

    .line 561
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֫()I

    move-result v4

    if-lez v4, :cond_7

    .line 563
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    invoke-static {v3, v6, v3, v13, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 565
    :cond_7
    invoke-virtual {v2, v4, v3}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 568
    :cond_8
    :goto_2
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֫()I

    move-result v4

    iget-object v6, v0, Ll/ܺۚۧ;->۠:Landroid/util/SparseArray;

    if-ge v4, v5, :cond_d

    .line 569
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܿ()I

    move-result v4

    rsub-int v5, v4, 0x24b8

    .line 570
    invoke-interface {v1, v3, v4, v5}, Ll/ۢᩴ֫;->read([BII)I

    move-result v5

    const/4 v7, -0x1

    if-ne v5, v7, :cond_c

    .line 452
    :goto_3
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v13, v1, :cond_b

    .line 453
    invoke-virtual {v6, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۚۧ;

    .line 454
    instance-of v2, v1, Ll/᩺֡ۧ;

    if-eqz v2, :cond_9

    .line 455
    check-cast v1, Ll/᩺֡ۧ;

    move/from16 v8, v19

    .line 456
    invoke-virtual {v1, v8}, Ll/᩺֡ۧ;->֫(Z)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 457
    new-instance v2, Ll/ᩳ֨֫;

    invoke-direct {v2}, Ll/ᩳ֨֫;-><init>()V

    invoke-virtual {v1, v12, v2}, Ll/᩺֡ۧ;->֫(ILl/ᩳ֨֫;)V

    goto :goto_4

    :cond_9
    move/from16 v8, v19

    :cond_a
    :goto_4
    add-int/lit8 v13, v13, 0x1

    move/from16 v19, v8

    goto :goto_3

    :cond_b
    return v7

    :cond_c
    move/from16 v8, v19

    add-int/2addr v4, v5

    .line 574
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ᩳ(I)V

    const/16 v5, 0xbc

    goto :goto_2

    .line 586
    :cond_d
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 587
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    .line 589
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    move v5, v1

    :goto_5
    if-ge v5, v3, :cond_e

    .line 64
    aget-byte v7, v4, v5

    const/16 v8, 0x47

    if-eq v7, v8, :cond_e

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 592
    :cond_e
    invoke-virtual {v2, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    add-int/lit16 v4, v5, 0xbc

    const/4 v7, 0x0

    if-le v4, v3, :cond_10

    .line 595
    iget v3, v0, Ll/ܺۚۧ;->֫:I

    sub-int/2addr v5, v1

    add-int/2addr v5, v3

    iput v5, v0, Ll/ܺۚۧ;->֫:I

    const/4 v1, 0x2

    if-ne v14, v1, :cond_11

    const/16 v1, 0x178

    if-gt v5, v1, :cond_f

    goto :goto_6

    :cond_f
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 597
    invoke-static {v1, v7}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 602
    :cond_10
    iput v13, v0, Ll/ܺۚۧ;->֫:I

    .line 465
    :cond_11
    :goto_6
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    if-le v4, v1, :cond_12

    return v13

    .line 473
    :cond_12
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    const/high16 v5, 0x800000

    and-int/2addr v5, v3

    if-eqz v5, :cond_13

    .line 476
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    return v13

    :cond_13
    const/high16 v5, 0x400000

    and-int/2addr v5, v3

    if-eqz v5, :cond_14

    const/4 v5, 0x1

    goto :goto_7

    :cond_14
    const/4 v5, 0x0

    :goto_7
    const v8, 0x1fff00

    and-int/2addr v8, v3

    shr-int/lit8 v8, v8, 0x8

    and-int/lit8 v9, v3, 0x20

    if-eqz v9, :cond_15

    const/4 v9, 0x1

    goto :goto_8

    :cond_15
    const/4 v9, 0x0

    :goto_8
    and-int/lit8 v15, v3, 0x10

    if-eqz v15, :cond_16

    .line 486
    invoke-virtual {v6, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ll/֡ۚۧ;

    :cond_16
    if-nez v7, :cond_17

    .line 488
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    return v13

    :cond_17
    const/4 v6, 0x2

    if-eq v14, v6, :cond_19

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v6, v3, -0x1

    .line 495
    iget-object v15, v0, Ll/ܺۚۧ;->ۧ:Landroid/util/SparseIntArray;

    invoke-virtual {v15, v8, v6}, Landroid/util/SparseIntArray;->get(II)I

    move-result v6

    .line 496
    invoke-virtual {v15, v8, v3}, Landroid/util/SparseIntArray;->put(II)V

    if-ne v6, v3, :cond_18

    .line 499
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    return v13

    :cond_18
    add-int/2addr v6, v12

    and-int/lit8 v6, v6, 0xf

    if-eq v3, v6, :cond_19

    .line 503
    invoke-interface {v7}, Ll/֡ۚۧ;->֫()V

    :cond_19
    if-eqz v9, :cond_1b

    .line 509
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    .line 510
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    and-int/lit8 v6, v6, 0x40

    if-eqz v6, :cond_1a

    const/4 v6, 0x2

    goto :goto_9

    :cond_1a
    const/4 v6, 0x0

    :goto_9
    or-int/2addr v5, v6

    sub-int/2addr v3, v12

    .line 516
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 520
    :cond_1b
    iget-boolean v3, v0, Ll/ܺۚۧ;->֡:Z

    const/4 v6, 0x2

    if-eq v14, v6, :cond_1c

    if-nez v3, :cond_1c

    .line 608
    iget-object v6, v0, Ll/ܺۚۧ;->᩵:Landroid/util/SparseBooleanArray;

    .line 610
    invoke-virtual {v6, v8, v13}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v6

    if-nez v6, :cond_1d

    .line 522
    :cond_1c
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 523
    invoke-interface {v7, v5, v2}, Ll/֡ۚۧ;->֫(ILl/ᩳ֨֫;)V

    .line 524
    invoke-virtual {v2, v1}, Ll/ᩳ֨֫;->ᩳ(I)V

    :cond_1d
    const/4 v1, 0x2

    if-eq v14, v1, :cond_1e

    if-nez v3, :cond_1e

    .line 526
    iget-boolean v1, v0, Ll/ܺۚۧ;->֡:Z

    if-eqz v1, :cond_1e

    cmp-long v1, v10, v16

    if-eqz v1, :cond_1e

    .line 530
    iput-boolean v12, v0, Ll/ܺۚۧ;->ۡ:Z

    .line 533
    :cond_1e
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    return v13
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 10

    .line 384
    iget p1, p0, Ll/ܺۚۧ;->᩻:I

    const/4 p2, 0x2

    const/4 v0, 0x0

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 385
    iget-object p1, p0, Ll/ܺۚۧ;->ۘ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_1
    const-wide/16 v2, 0x0

    if-ge v1, p2, :cond_5

    .line 387
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢ֨֫;

    .line 393
    invoke-virtual {v4}, Ll/ۢ֨֫;->ܽ()J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v9, v5, v7

    if-nez v9, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_3

    .line 395
    invoke-virtual {v4}, Ll/ۢ֨֫;->֫()J

    move-result-wide v5

    cmp-long v9, v5, v7

    if-eqz v9, :cond_2

    cmp-long v7, v5, v2

    if-eqz v7, :cond_2

    cmp-long v2, v5, p3

    if-eqz v2, :cond_2

    const/4 v5, 0x1

    goto :goto_3

    :cond_2
    const/4 v5, 0x0

    :cond_3
    :goto_3
    if-eqz v5, :cond_4

    .line 405
    invoke-virtual {v4, p3, p4}, Ll/ۢ֨֫;->ᩳ(J)V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    cmp-long p1, p3, v2

    if-eqz p1, :cond_6

    .line 408
    iget-object p1, p0, Ll/ܺۚۧ;->ۚ:Ll/ۜۚۧ;

    if-eqz p1, :cond_6

    .line 409
    invoke-virtual {p1, p3, p4}, Ll/᩻᩷ۧ;->֫(J)V

    .line 411
    :cond_6
    iget-object p1, p0, Ll/ܺۚۧ;->֨:Ll/ᩳ֨֫;

    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 412
    iget-object p1, p0, Ll/ܺۚۧ;->ۧ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    const/4 p1, 0x0

    .line 413
    :goto_4
    iget-object p2, p0, Ll/ܺۚۧ;->۠:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p1, p3, :cond_7

    .line 414
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡ۚۧ;

    invoke-interface {p2}, Ll/֡ۚۧ;->֫()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 416
    :cond_7
    iput v0, p0, Ll/ܺۚۧ;->֫:I

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 377
    iget v0, p0, Ll/ܺۚۧ;->ᩳ:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    .line 378
    new-instance v0, Ll/ۡᩴۧ;

    iget-object v1, p0, Ll/ܺۚۧ;->ۖ:Ll/ۜᩴۧ;

    invoke-direct {v0, p1, v1}, Ll/ۡᩴۧ;-><init>(Ll/᩸᩷ۧ;Ll/ۜᩴۧ;)V

    move-object p1, v0

    .line 379
    :cond_0
    iput-object p1, p0, Ll/ܺۚۧ;->ۜ:Ll/᩸᩷ۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 6

    .line 355
    iget-object v0, p0, Ll/ܺۚۧ;->֨:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    .line 356
    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v1, 0x0

    const/16 v2, 0x3ac

    .line 157
    invoke-virtual {p1, v1, v1, v2, v0}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xbc

    if-ge v2, v3, :cond_2

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x5

    if-ge v3, v4, :cond_1

    mul-int/lit16 v4, v3, 0xbc

    add-int/2addr v4, v2

    .line 361
    aget-byte v4, v0, v4

    const/16 v5, 0x47

    if-eq v4, v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 117
    :cond_1
    invoke-virtual {p1, v2, v1}, Ll/ܺ᩷ۧ;->֫(IZ)Z

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
