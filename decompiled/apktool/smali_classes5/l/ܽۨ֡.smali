.class public final Ll/ܽۨ֡;
.super Ll/ᩴ۬֡;
.source "Z556"

# interfaces
.implements Ll/ᩴ֫ۚ;


# static fields
.field public static final ۟:Ll/֡ۛۡ;

.field public static final synthetic ܰ:I


# instance fields
.field public final ۗ:I

.field public final ۙ:Ll/۬ۛ֡;

.field public final ۛ:I

.field public final ۤ:I

.field public ۨ:I

.field public ۫:I

.field public final ۬:I

.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:Ll/۠ۛ֡;

.field public ᩺:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 594
    new-instance v0, Ll/֡ۛۡ;

    sget v1, Ll/ܿ᩸ۡ;->֫:I

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/ܽۨ֡;->۟:Ll/֡ۛۡ;

    return-void
.end method

.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;Ll/۠ۛ֡;ILl/ܰܰ֡;Ll/ܰܰ֡;I)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 94
    iput v0, p0, Ll/ܽۨ֡;->ۨ:I

    .line 146
    iput-object p1, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    .line 147
    iput-object p3, p0, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    .line 148
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ۢ()I

    move-result p1

    add-int/2addr p1, p4

    .line 153
    iput p1, p0, Ll/ܽۨ֡;->ۤ:I

    .line 154
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p3

    iput p3, p0, Ll/ܽۨ֡;->᩸:I

    .line 155
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/ܽۨ֡;->᩶:I

    .line 156
    iput p7, p0, Ll/ܽۨ֡;->ۗ:I

    .line 158
    invoke-interface {p5, p1}, Ll/ܰܰ֡;->seekTo(I)I

    move-result p2

    iput p2, p0, Ll/ܽۨ֡;->۬:I

    .line 159
    invoke-interface {p6, p1}, Ll/ܰܰ֡;->seekTo(I)I

    move-result p1

    iput p1, p0, Ll/ܽۨ֡;->ۛ:I

    return-void
.end method

.method private ֨()I
    .locals 2

    .line 544
    iget v0, p0, Ll/ܽۨ֡;->۫:I

    if-nez v0, :cond_0

    .line 545
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    iget v1, p0, Ll/ܽۨ֡;->ۤ:I

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ܿ(I)I

    move-result v0

    iput v0, p0, Ll/ܽۨ֡;->۫:I

    .line 547
    :cond_0
    iget v0, p0, Ll/ܽۨ֡;->۫:I

    return v0
.end method

.method public static ֫(Ll/ۘۨ֡;ILl/֨ۗ֡;)I
    .locals 8

    const/4 v0, 0x1

    if-nez p2, :cond_0

    return v0

    .line 519
    :cond_0
    sget-object v1, Ll/ܰۛ֡;->ۧ:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-eq v1, v0, :cond_3

    if-eq v1, v3, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    .line 539
    iget-object p0, p2, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    iget p0, p0, Ll/ۘۗ֡;->᩹:I

    div-int/2addr p0, v3

    return p0

    :cond_1
    add-int/2addr p1, v3

    .line 537
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x4

    add-int/2addr p0, v3

    return p0

    :cond_2
    add-int/2addr p1, v3

    .line 535
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x2

    add-int/2addr p0, v2

    return p0

    :cond_3
    add-int/lit8 p2, p1, 0x2

    .line 521
    invoke-virtual {p0, p2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result p2

    if-nez p2, :cond_4

    return v2

    :cond_4
    add-int/2addr p1, v2

    .line 525
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->ۧ(I)I

    move-result p0

    const/4 p1, 0x0

    const/4 v1, 0x0

    if-ltz p0, :cond_6

    int-to-long v4, p2

    int-to-long v6, p0

    mul-long v4, v4, v6

    const-wide/32 v6, 0x7fffffff

    cmp-long p0, v4, v6

    if-gtz p0, :cond_5

    long-to-int p0, v4

    add-int/2addr p0, v0

    .line 533
    div-int/2addr p0, v3

    add-int/2addr p0, v2

    return p0

    .line 531
    :cond_5
    new-instance p0, Ll/ܶ᩵ۚ;

    const-string p2, "Invalid array-payload instruction: element width*count overflows"

    new-array v0, v1, [Ljava/lang/Object;

    .line 46
    invoke-direct {p0, p1, p2, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    throw p0

    .line 527
    :cond_6
    new-instance p0, Ll/ܶ᩵ۚ;

    const-string p2, "Invalid array-payload instruction: negative element count"

    new-array v0, v1, [Ljava/lang/Object;

    .line 46
    invoke-direct {p0, p1, p2, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    throw p0
.end method

.method public static ֫(Ll/֨ܶ֡;Z)Ll/ۨۖܽ;
    .locals 4

    .line 716
    sget-object v0, Ll/ܽۨ֡;->۟:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۖܽ;

    if-nez v1, :cond_0

    .line 718
    new-instance v1, Ll/ۨۖܽ;

    invoke-direct {v1}, Ll/ۨۖܽ;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 720
    invoke-virtual {v1, v2}, Ll/ۨۖܽ;->ۧ(I)V

    .line 678
    :goto_0
    :try_start_0
    new-instance v2, Ll/᩺ۖܽ;

    invoke-direct {v2, v1}, Ll/᩺ۖܽ;-><init>(Ll/ۨۖܽ;)V

    .line 691
    new-instance v3, Ll/᩺ۛ֡;

    invoke-direct {v3, v2, p1}, Ll/᩺ۛ֡;-><init>(Ljava/io/Writer;Z)V

    invoke-virtual {p0, v3}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 726
    :goto_1
    invoke-virtual {v0, v1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 682
    throw p0
.end method

.method public static ۚ()V
    .locals 1

    .line 730
    sget-object v0, Ll/ܽۨ֡;->۟:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ܽ()V

    return-void
.end method

.method private ۠()I
    .locals 2

    .line 559
    iget v0, p0, Ll/ܽۨ֡;->ۨ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 560
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    invoke-direct {p0}, Ll/ܽۨ֡;->᩸()I

    move-result v1

    add-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    iput v0, p0, Ll/ܽۨ֡;->ۨ:I

    .line 562
    :cond_0
    iget v0, p0, Ll/ܽۨ֡;->ۨ:I

    return v0
.end method

.method private ᩸()I
    .locals 3

    .line 551
    iget v0, p0, Ll/ܽۨ֡;->᩺:I

    if-nez v0, :cond_0

    .line 552
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ܽۨ֡;->֨()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    .line 553
    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۜ(I)I

    move-result v0

    iput v0, p0, Ll/ܽۨ֡;->᩺:I

    .line 555
    :cond_0
    iget v0, p0, Ll/ܽۨ֡;->᩺:I

    return v0
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 2

    .line 296
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    iget v1, p0, Ll/ܽۨ֡;->۬:I

    invoke-static {v0, v1}, Ll/ۧ۟֡;->֫(Ll/۬ۛ֡;I)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 3

    .line 198
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ܽۨ֡;->֨()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 2

    .line 222
    invoke-direct {p0}, Ll/ܽۨ֡;->۠()I

    move-result v0

    if-lez v0, :cond_0

    .line 224
    invoke-virtual {p0}, Ll/ܽۨ֡;->ۘ()Ljava/util/List;

    move-result-object v0

    .line 226
    new-instance v1, Ll/ۛۛ֡;

    invoke-direct {v1, p0, v0}, Ll/ۛۛ֡;-><init>(Ll/ܽۨ֡;Ljava/util/List;)V

    .line 240
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0

    .line 242
    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/util/List;
    .locals 2

    .line 247
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    iget v1, p0, Ll/ܽۨ֡;->ۛ:I

    invoke-static {v0, v1}, Ll/ۧ۟֡;->ۧ(Ll/۬ۛ֡;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILl/֫ۨ֡;)I
    .locals 18

    move-object/from16 v0, p0

    .line 364
    iget-object v1, v0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->᩵()Z

    move-result v2

    if-nez v2, :cond_8

    .line 367
    iget v2, v0, Ll/ܽۨ֡;->᩶:I

    if-gtz v2, :cond_0

    goto/16 :goto_4

    .line 370
    :cond_0
    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v3

    add-int/lit8 v4, v2, 0xc

    .line 371
    invoke-virtual {v3, v4}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v4

    add-int/lit8 v2, v2, 0x10

    int-to-long v5, v2

    int-to-long v7, v4

    const-wide/16 v9, 0x2

    mul-long v7, v7, v9

    add-long/2addr v7, v5

    const-wide/32 v4, 0x7fffffff

    const/4 v6, 0x0

    const/4 v11, 0x1

    cmp-long v12, v7, v4

    if-gtz v12, :cond_7

    long-to-int v4, v7

    const/4 v5, 0x0

    :goto_0
    if-ge v2, v4, :cond_6

    .line 380
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->᩷(I)I

    move-result v7

    if-nez v7, :cond_1

    .line 382
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v7

    .line 384
    :cond_1
    invoke-virtual {v1}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/۠ۗ֡;->֫(I)Ll/֨ۗ֡;

    move-result-object v7

    .line 385
    invoke-static {v3, v2, v7}, Ll/ܽۨ֡;->֫(Ll/ۘۨ֡;ILl/֨ۗ֡;)I

    move-result v8

    if-lez v8, :cond_5

    int-to-long v12, v2

    int-to-long v14, v8

    mul-long v14, v14, v9

    add-long/2addr v14, v12

    int-to-long v12, v4

    cmp-long v8, v14, v12

    if-gtz v8, :cond_4

    add-int/lit8 v8, v5, 0x1

    move/from16 v12, p1

    if-lt v5, v12, :cond_2

    if-eqz v7, :cond_2

    .line 478
    iget-object v5, v7, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    .line 479
    sget-object v13, Ll/ܰۛ֡;->֫:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v13, v5

    packed-switch v5, :pswitch_data_0

    move-object/from16 v2, p2

    const/4 v5, 0x1

    goto :goto_3

    :pswitch_0
    add-int/lit8 v2, v2, 0x2

    .line 502
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->ܽ(I)J

    move-result-wide v16

    move-wide/from16 v9, v16

    goto :goto_2

    :pswitch_1
    add-int/lit8 v2, v2, 0x2

    .line 499
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->ۧ(I)I

    move-result v2

    goto :goto_1

    :pswitch_2
    add-int/lit8 v2, v2, 0x2

    .line 496
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->᩻(I)I

    move-result v2

    goto :goto_1

    :pswitch_3
    add-int/lit8 v2, v2, 0x3

    .line 493
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    goto :goto_1

    :pswitch_4
    add-int/lit8 v2, v2, 0x2

    .line 490
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->᩻(I)I

    move-result v2

    int-to-short v2, v2

    int-to-long v9, v2

    const/16 v2, 0x30

    shl-long/2addr v9, v2

    goto :goto_2

    :pswitch_5
    add-int/lit8 v2, v2, 0x2

    .line 487
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->᩻(I)I

    move-result v2

    int-to-short v2, v2

    shl-int/lit8 v2, v2, 0x10

    goto :goto_1

    :pswitch_6
    add-int/lit8 v2, v2, 0x2

    .line 484
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->᩻(I)I

    move-result v2

    goto :goto_1

    :pswitch_7
    add-int/lit8 v2, v2, 0x1

    .line 481
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    shr-int/lit8 v2, v2, 0x1c

    :goto_1
    int-to-long v9, v2

    :goto_2
    move-object/from16 v2, p2

    .line 507
    invoke-interface {v2, v7, v9, v10}, Ll/֫ۨ֡;->֫(Ll/֨ۗ֡;J)Z

    move-result v5

    :goto_3
    if-nez v5, :cond_3

    return v8

    :cond_2
    move-object/from16 v2, p2

    :cond_3
    long-to-int v5, v14

    move v2, v5

    move v5, v8

    const-wide/16 v9, 0x2

    goto/16 :goto_0

    .line 391
    :cond_4
    new-instance v1, Ll/ܶ᩵ۚ;

    new-array v2, v11, [Ljava/lang/Object;

    aput-object v0, v2, v6

    const-string v3, "The last instruction in method %s is truncated"

    const/4 v4, 0x0

    .line 46
    invoke-direct {v1, v4, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    throw v1

    :cond_5
    const/4 v1, 0x0

    .line 387
    new-instance v3, Ll/ܶ᩵ۚ;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v6

    aput-object v2, v4, v11

    const-string v2, "Invalid instruction size in method %s at offset 0x%x"

    .line 46
    invoke-direct {v3, v1, v2, v4}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    throw v3

    :cond_6
    :goto_4
    const/4 v1, -0x1

    return v1

    :cond_7
    const/4 v1, 0x0

    .line 375
    new-instance v2, Ll/ܶ᩵ۚ;

    new-array v3, v11, [Ljava/lang/Object;

    aput-object v0, v3, v6

    const-string v4, "Instruction list for method %s is out of range"

    .line 46
    invoke-direct {v2, v1, v4, v3}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    throw v2

    .line 365
    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "replaceNeverExecutedInstructionsWithNop is unsupported for direct literal scan"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(ILl/ۧۨ֡;)I
    .locals 15

    move-object v0, p0

    .line 408
    iget-object v1, v0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->᩵()Z

    move-result v2

    if-nez v2, :cond_8

    .line 411
    iget v2, v0, Ll/ܽۨ֡;->᩶:I

    if-gtz v2, :cond_0

    goto/16 :goto_2

    .line 414
    :cond_0
    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v3

    add-int/lit8 v4, v2, 0xc

    .line 415
    invoke-virtual {v3, v4}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v4

    add-int/lit8 v2, v2, 0x10

    int-to-long v5, v2

    int-to-long v7, v4

    const-wide/16 v9, 0x2

    mul-long v7, v7, v9

    add-long/2addr v7, v5

    const-wide/32 v4, 0x7fffffff

    const/4 v6, 0x1

    cmp-long v13, v7, v4

    if-gtz v13, :cond_7

    long-to-int v4, v7

    const/4 v5, 0x0

    :goto_0
    if-ge v2, v4, :cond_6

    .line 424
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->᩷(I)I

    move-result v7

    if-nez v7, :cond_1

    .line 426
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v7

    .line 428
    :cond_1
    invoke-virtual {v1}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/۠ۗ֡;->֫(I)Ll/֨ۗ֡;

    move-result-object v7

    .line 429
    invoke-static {v3, v2, v7}, Ll/ܽۨ֡;->֫(Ll/ۘۨ֡;ILl/֨ۗ֡;)I

    move-result v8

    if-lez v8, :cond_5

    int-to-long v13, v2

    int-to-long v11, v8

    mul-long v11, v11, v9

    add-long/2addr v11, v13

    int-to-long v8, v4

    cmp-long v10, v11, v8

    if-gtz v10, :cond_4

    add-int/lit8 v8, v5, 0x1

    move/from16 v9, p1

    if-lt v5, v9, :cond_2

    if-eqz v7, :cond_2

    .line 438
    iget v10, v7, Ll/֨ۗ֡;->۬:I

    const/4 v13, 0x7

    if-eq v10, v13, :cond_2

    .line 456
    sget-object v10, Ll/ܰۛ֡;->֫:[I

    iget-object v13, v7, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v10, v10, v13

    packed-switch v10, :pswitch_data_0

    const/4 v2, -0x1

    goto :goto_1

    :pswitch_0
    add-int/lit8 v2, v2, 0x2

    .line 465
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v2

    goto :goto_1

    :pswitch_1
    add-int/lit8 v2, v2, 0x2

    .line 463
    invoke-virtual {v3, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v2

    :goto_1
    if-ltz v2, :cond_2

    .line 441
    iget v10, v7, Ll/֨ۗ֡;->۬:I

    move-object/from16 v13, p2

    invoke-interface {v13, v5, v10, v2, v7}, Ll/ۧۨ֡;->֫(IIILl/֨ۗ֡;)Z

    move-result v2

    if-nez v2, :cond_3

    return v8

    :cond_2
    move-object/from16 v13, p2

    :cond_3
    long-to-int v2, v11

    const-wide/16 v10, 0x2

    move v5, v8

    move-wide v9, v10

    goto :goto_0

    .line 435
    :cond_4
    new-instance v1, Ll/ܶ᩵ۚ;

    new-array v2, v6, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v3, "The last instruction in method %s is truncated"

    const/4 v4, 0x0

    .line 46
    invoke-direct {v1, v4, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    throw v1

    :cond_5
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 431
    new-instance v1, Ll/ܶ᩵ۚ;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v3

    aput-object v2, v5, v6

    const-string v2, "Invalid instruction size in method %s at offset 0x%x"

    .line 46
    invoke-direct {v1, v4, v2, v5}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    throw v1

    :cond_6
    :goto_2
    const/4 v1, -0x1

    return v1

    :cond_7
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 419
    new-instance v1, Ll/ܶ᩵ۚ;

    new-array v2, v6, [Ljava/lang/Object;

    aput-object v0, v2, v3

    const-string v3, "Instruction list for method %s is out of range"

    .line 46
    invoke-direct {v1, v4, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    throw v1

    .line 409
    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "replaceNeverExecutedInstructionsWithNop is unsupported for direct reference scan"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/io/Writer;)V
    .locals 3

    .line 205
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ܽۨ֡;->֨()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    const/4 v2, 0x0

    .line 206
    invoke-virtual {v0, v1, p1, v2}, Ll/۬ۛ֡;->֫(ILjava/io/Writer;Z)V

    return-void
.end method

.method public final ֫(Ll/۟ۛ֡;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 323
    iget-object v2, v0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v2}, Ll/۬ۛ֡;->᩵()Z

    move-result v3

    if-nez v3, :cond_8

    .line 326
    iget v3, v0, Ll/ܽۨ֡;->᩶:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    .line 329
    :cond_0
    invoke-virtual {v2}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v4

    add-int/lit8 v5, v3, 0xc

    .line 330
    invoke-virtual {v4, v5}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v5

    add-int/lit8 v3, v3, 0x10

    int-to-long v6, v3

    int-to-long v8, v5

    const-wide/16 v10, 0x2

    mul-long v8, v8, v10

    add-long/2addr v8, v6

    const-wide/32 v5, 0x7fffffff

    const/4 v7, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    cmp-long v14, v8, v5

    if-gtz v14, :cond_7

    long-to-int v5, v8

    :goto_0
    if-ge v3, v5, :cond_6

    .line 338
    invoke-virtual {v4, v3}, Ll/ۘۨ֡;->᩷(I)I

    move-result v6

    if-nez v6, :cond_1

    .line 340
    invoke-virtual {v4, v3}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v6

    .line 342
    :cond_1
    invoke-virtual {v2}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v8

    invoke-virtual {v8, v6}, Ll/۠ۗ֡;->֫(I)Ll/֨ۗ֡;

    move-result-object v6

    .line 343
    invoke-static {v4, v3, v6}, Ll/ܽۨ֡;->֫(Ll/ۘۨ֡;ILl/֨ۗ֡;)I

    move-result v8

    if-lez v8, :cond_5

    int-to-long v14, v3

    int-to-long v8, v8

    mul-long v8, v8, v10

    add-long/2addr v8, v14

    int-to-long v14, v5

    cmp-long v16, v8, v14

    if-gtz v16, :cond_4

    .line 351
    sget-object v14, Ll/֨ۗ֡;->ۡۧ:Ll/֨ۗ֡;

    if-ne v6, v14, :cond_2

    add-int/lit8 v3, v3, 0x2

    .line 352
    invoke-virtual {v4, v3}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v3

    invoke-interface {v1, v3}, Ll/۟ۛ֡;->֫(I)V

    goto :goto_1

    .line 353
    :cond_2
    sget-object v14, Ll/֨ۗ֡;->ܺۧ:Ll/֨ۗ֡;

    if-ne v6, v14, :cond_3

    add-int/lit8 v3, v3, 0x2

    .line 354
    invoke-virtual {v4, v3}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v3

    invoke-interface {v1, v3}, Ll/۟ۛ֡;->֫(I)V

    :cond_3
    :goto_1
    long-to-int v3, v8

    goto :goto_0

    .line 349
    :cond_4
    new-instance v1, Ll/ܶ᩵ۚ;

    new-array v2, v12, [Ljava/lang/Object;

    aput-object v0, v2, v7

    const-string v3, "The last instruction in method %s is truncated"

    .line 46
    invoke-direct {v1, v13, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    throw v1

    .line 345
    :cond_5
    new-instance v1, Ll/ܶ᩵ۚ;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v7

    aput-object v2, v3, v12

    const-string v2, "Invalid instruction size in method %s at offset 0x%x"

    .line 46
    invoke-direct {v1, v13, v2, v3}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    throw v1

    :cond_6
    :goto_2
    return-void

    .line 334
    :cond_7
    new-instance v1, Ll/ܶ᩵ۚ;

    new-array v2, v12, [Ljava/lang/Object;

    aput-object v0, v2, v7

    const-string v3, "Instruction list for method %s is out of range"

    .line 46
    invoke-direct {v1, v13, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    throw v1

    .line 324
    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "replaceNeverExecutedInstructionsWithNop is unsupported for direct const-string scan"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final ֫(Ll/ܽۨ֡;ZZZZZ)Z
    .locals 7

    .line 597
    sget-object v0, Ll/ܽۨ֡;->۟:Ll/֡ۛۡ;

    .line 183
    iget-object v1, p0, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {v1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {v2}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v2

    .line 597
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_d

    .line 598
    invoke-virtual {p0}, Ll/ܽۨ֡;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܽۨ֡;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 599
    invoke-virtual {p0}, Ll/ܽۨ֡;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܽۨ֡;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 600
    invoke-virtual {p0}, Ll/ܽۨ֡;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܽۨ֡;->ۘ()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v3}, Ll/֨᩵ۚ;->֫(Ljava/util/List;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 192
    iget v1, p0, Ll/ܽۨ֡;->᩸:I

    iget v3, p1, Ll/ܽۨ֡;->᩸:I

    if-eq v1, v3, :cond_0

    goto/16 :goto_6

    .line 610
    :cond_0
    iget v1, p0, Ll/ܽۨ֡;->۬:I

    if-nez v1, :cond_1

    iget v1, p1, Ll/ܽۨ֡;->۬:I

    if-eqz v1, :cond_2

    .line 611
    :cond_1
    invoke-virtual {p0}, Ll/ܽۨ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܽۨ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۗ᩻ۚ;->֫(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_6

    .line 616
    :cond_2
    iget v1, p0, Ll/ܽۨ֡;->ۗ:I

    const/4 v3, 0x7

    if-ne v1, v3, :cond_3

    iget v1, p1, Ll/ܽۨ֡;->ۗ:I

    if-eq v1, v3, :cond_4

    .line 618
    :cond_3
    invoke-virtual {p0}, Ll/ܽۨ֡;->᩵()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܽۨ֡;->᩵()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۗ᩻ۚ;->֫(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_6

    .line 623
    :cond_4
    invoke-virtual {p0}, Ll/ܽۨ֡;->᩷ۧ()Ll/᩷ۨ֡;

    move-result-object v1

    .line 624
    invoke-virtual {p1}, Ll/ܽۨ֡;->᩷ۧ()Ll/᩷ۨ֡;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v1, :cond_6

    .line 734
    invoke-virtual {v1}, Ll/᩷ۨ֡;->֫()I

    move-result v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    const/4 v5, 0x0

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v5, 0x1

    :goto_1
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ll/᩷ۨ֡;->֫()I

    move-result v6

    if-nez v6, :cond_7

    goto :goto_2

    :cond_7
    const/4 v6, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v6, 0x1

    :goto_3
    if-eqz v5, :cond_9

    if-eqz v6, :cond_9

    return v4

    :cond_9
    if-nez v5, :cond_d

    if-eqz v6, :cond_a

    goto/16 :goto_6

    :cond_a
    if-nez p4, :cond_b

    .line 634
    invoke-virtual {v1}, Ll/᩷ۨ֡;->᩻()I

    move-result v5

    invoke-virtual {v3}, Ll/᩷ۨ֡;->᩻()I

    move-result v6

    if-eq v5, v6, :cond_b

    goto :goto_6

    .line 638
    :cond_b
    new-instance v5, Ll/᩹ܶ֡;

    invoke-direct {v5}, Ll/᩹ܶ֡;-><init>()V

    .line 639
    iput-boolean v2, v5, Ll/᩹ܶ֡;->ܳ:Z

    .line 640
    iput-boolean v4, v5, Ll/᩹ܶ֡;->᩷:Z

    xor-int/2addr p2, v4

    .line 641
    iput-boolean p2, v5, Ll/᩹ܶ֡;->ܿ:Z

    .line 642
    iput-boolean p4, v5, Ll/᩹ܶ֡;->ۧ:Z

    .line 643
    iput-boolean p5, v5, Ll/᩹ܶ֡;->ᩳ:Z

    .line 644
    iput-boolean v4, v5, Ll/᩹ܶ֡;->ܽ:Z

    .line 645
    iput-boolean p3, v5, Ll/᩹ܶ֡;->᩻:Z

    .line 646
    iget-object p2, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {p2}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object p2

    iget p2, p2, Ll/۠ۗ֡;->֫:I

    iput p2, v5, Ll/᩹ܶ֡;->֫:I

    .line 647
    new-instance p2, Ll/֨ܶ֡;

    invoke-direct {p2, v5, p0, v1}, Ll/֨ܶ֡;-><init>(Ll/᩹ܶ֡;Ll/ᩴ֫ۚ;Ll/᩵֫ۚ;)V

    .line 648
    new-instance p3, Ll/֨ܶ֡;

    invoke-direct {p3, v5, p1, v3}, Ll/֨ܶ֡;-><init>(Ll/᩹ܶ֡;Ll/ᩴ֫ۚ;Ll/᩵֫ۚ;)V

    const/4 p1, 0x0

    .line 651
    :try_start_0
    invoke-static {p2, p6}, Ll/ܽۨ֡;->֫(Ll/֨ܶ֡;Z)Ll/ۨۖܽ;

    move-result-object p1

    .line 652
    new-instance p4, Ll/۟ۤ֡;

    invoke-direct {p4, p1}, Ll/۟ۤ֡;-><init>(Ll/ۨۖܽ;)V

    .line 691
    new-instance p5, Ll/᩺ۛ֡;

    invoke-direct {p5, p4, p6}, Ll/᩺ۛ֡;-><init>(Ljava/io/Writer;Z)V

    invoke-virtual {p3, p5}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;)V

    .line 654
    invoke-virtual {p4}, Ll/۟ۤ֡;->֫()V
    :try_end_0
    .catch Ll/ܰۤ֡; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 667
    invoke-virtual {p2}, Ll/֨ܶ֡;->ۧ()V

    .line 668
    invoke-virtual {p3}, Ll/֨ܶ֡;->ۧ()V

    .line 726
    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return v4

    :catchall_0
    move-exception p4

    goto :goto_4

    :catch_0
    move-exception p4

    .line 664
    :try_start_1
    sget-object p5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p4, p5}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 667
    invoke-virtual {p2}, Ll/֨ܶ֡;->ۧ()V

    .line 668
    invoke-virtual {p3}, Ll/֨ܶ֡;->ۧ()V

    if-eqz p1, :cond_d

    goto :goto_5

    .line 667
    :goto_4
    invoke-virtual {p2}, Ll/֨ܶ֡;->ۧ()V

    .line 668
    invoke-virtual {p3}, Ll/֨ܶ֡;->ۧ()V

    if-eqz p1, :cond_c

    .line 726
    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 672
    :cond_c
    throw p4

    .line 667
    :catch_1
    invoke-virtual {p2}, Ll/֨ܶ֡;->ۧ()V

    .line 668
    invoke-virtual {p3}, Ll/֨ܶ֡;->ۧ()V

    if-eqz p1, :cond_d

    .line 726
    :goto_5
    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    :cond_d
    :goto_6
    return v2
.end method

.method public final ۘ()Ljava/util/List;
    .locals 3

    .line 262
    invoke-direct {p0}, Ll/ܽۨ֡;->۠()I

    move-result v0

    if-lez v0, :cond_0

    .line 264
    iget-object v1, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x4

    .line 266
    new-instance v2, Ll/ۨۛ֡;

    invoke-direct {v2, p0, v0, v1}, Ll/ۨۛ֡;-><init>(Ll/ܽۨ֡;II)V

    return-object v2

    .line 279
    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/io/Writer;)V
    .locals 6

    .line 283
    invoke-direct {p0}, Ll/ܽۨ֡;->۠()I

    move-result v0

    if-lez v0, :cond_0

    .line 285
    iget-object v1, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v2

    add-int/lit8 v0, v0, 0x4

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 288
    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v4

    mul-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v0

    invoke-virtual {v4, v5}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v4

    invoke-virtual {v1, p1, v4}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {v0}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 192
    iget v0, p0, Ll/ܽۨ֡;->᩸:I

    return v0
.end method

.method public final ܽ(Ljava/io/Writer;)V
    .locals 3

    .line 216
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ܽۨ֡;->᩸()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/۬ۛ֡;->֫(Ljava/io/Writer;I)V

    return-void
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 3

    .line 212
    iget-object v0, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ܽۨ֡;->᩸()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Ljava/util/Set;
    .locals 2

    const/4 v0, 0x7

    .line 302
    iget v1, p0, Ll/ܽۨ֡;->ۗ:I

    if-ne v1, v0, :cond_0

    .line 303
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0

    .line 305
    :cond_0
    invoke-static {v1}, Ll/ᩴۗ֡;->ᩳ(I)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ᩷ۧ()Ll/᩵֫ۚ;
    .locals 1

    .line 78
    invoke-virtual {p0}, Ll/ܽۨ֡;->᩷ۧ()Ll/᩷ۨ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷ۧ()Ll/᩷ۨ֡;
    .locals 3

    .line 312
    iget v0, p0, Ll/ܽۨ֡;->᩶:I

    if-lez v0, :cond_0

    .line 313
    new-instance v1, Ll/᩷ۨ֡;

    iget-object v2, p0, Ll/ܽۨ֡;->ۙ:Ll/۬ۛ֡;

    invoke-direct {v1, v2, p0, v0}, Ll/᩷ۨ֡;-><init>(Ll/۬ۛ֡;Ll/ܽۨ֡;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
