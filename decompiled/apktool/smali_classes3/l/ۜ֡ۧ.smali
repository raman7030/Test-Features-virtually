.class public final Ll/ۜ֡ۧ;
.super Ljava/lang/Object;
.source "T8UY"

# interfaces
.implements Ll/ܺ֡ۧ;


# static fields
.field public static final ᩶:[B


# instance fields
.field public ֡:I

.field public final ֨:I

.field public final ֫:Ll/ܽ֨֫;

.field public ۖ:Z

.field public final ۘ:Ll/ᩳ֨֫;

.field public ۚ:Ll/᩵ۢۧ;

.field public ۜ:I

.field public ۠:J

.field public ۡ:Z

.field public ۢ:Ljava/lang/String;

.field public ۧ:I

.field public ܳ:J

.field public ܶ:I

.field public ܺ:Z

.field public final ܽ:Ljava/lang/String;

.field public ܿ:Ll/᩵ۢۧ;

.field public ᩳ:I

.field public ᩴ:Ll/᩵ۢۧ;

.field public final ᩵:Ljava/lang/String;

.field public ᩷:I

.field public ᩸:I

.field public ᩹:J

.field public final ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    .line 67
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜ֡ۧ;->᩶:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 3

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    new-instance v0, Ll/ܽ֨֫;

    const/4 v1, 0x7

    new-array v2, v1, [B

    .line 48
    invoke-direct {v0, v2, v1}, Ll/ܽ֨֫;-><init>([BI)V

    .line 125
    iput-object v0, p0, Ll/ۜ֡ۧ;->֫:Ll/ܽ֨֫;

    .line 126
    new-instance v0, Ll/ᩳ֨֫;

    sget-object v1, Ll/ۜ֡ۧ;->᩶:[B

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object v0, p0, Ll/ۜ֡ۧ;->ۘ:Ll/ᩳ֨֫;

    const/4 v0, -0x1

    .line 127
    iput v0, p0, Ll/ۜ֡ۧ;->᩷:I

    .line 128
    iput v0, p0, Ll/ۜ֡ۧ;->ۜ:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 129
    iput-wide v0, p0, Ll/ۜ֡ۧ;->۠:J

    .line 130
    iput-wide v0, p0, Ll/ۜ֡ۧ;->᩹:J

    .line 131
    iput-boolean p4, p0, Ll/ۜ֡ۧ;->᩻:Z

    .line 132
    iput-object p1, p0, Ll/ۜ֡ۧ;->᩵:Ljava/lang/String;

    .line 133
    iput p2, p0, Ll/ۜ֡ۧ;->֨:I

    .line 134
    iput-object p3, p0, Ll/ۜ֡ۧ;->ܽ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 241
    iput p1, p0, Ll/ۜ֡ۧ;->᩸:I

    .line 242
    iput p1, p0, Ll/ۜ֡ۧ;->ۧ:I

    const/16 p1, 0x100

    .line 243
    iput p1, p0, Ll/ۜ֡ۧ;->֡:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 145
    iput-wide v0, p0, Ll/ۜ֡ۧ;->᩹:J

    const/4 v0, 0x0

    .line 219
    iput-boolean v0, p0, Ll/ۜ֡ۧ;->ۡ:Z

    .line 241
    iput v0, p0, Ll/ۜ֡ۧ;->᩸:I

    .line 242
    iput v0, p0, Ll/ۜ֡ۧ;->ۧ:I

    const/16 v0, 0x100

    .line 243
    iput v0, p0, Ll/ۜ֡ۧ;->֡:I

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 171
    iput-wide p2, p0, Ll/ۜ֡ۧ;->᩹:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 563
    iget-object v2, v0, Ll/ۜ֡ۧ;->ۚ:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 177
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    if-lez v2, :cond_26

    .line 178
    iget v2, v0, Ll/ۜ֡ۧ;->᩸:I

    const/16 v3, 0x100

    const/4 v4, -0x1

    const/16 v5, 0xd

    iget-object v6, v0, Ll/ۜ֡ۧ;->ۘ:Ll/ᩳ֨֫;

    const/4 v7, 0x3

    iget-object v8, v0, Ll/ۜ֡ۧ;->֫:Ll/ܽ֨֫;

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v2, :cond_d

    if-eq v2, v12, :cond_9

    const/16 v4, 0xa

    if-eq v2, v11, :cond_8

    if-eq v2, v7, :cond_3

    if-ne v2, v10, :cond_2

    .line 549
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    iget v4, v0, Ll/ۜ֡ۧ;->ܶ:I

    iget v5, v0, Ll/ۜ֡ۧ;->ۧ:I

    sub-int/2addr v4, v5

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 550
    iget-object v4, v0, Ll/ۜ֡ۧ;->ܿ:Ll/᩵ۢۧ;

    invoke-interface {v4, v2, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 551
    iget v4, v0, Ll/ۜ֡ۧ;->ۧ:I

    add-int/2addr v4, v2

    iput v4, v0, Ll/ۜ֡ۧ;->ۧ:I

    .line 552
    iget v2, v0, Ll/ۜ֡ۧ;->ܶ:I

    if-ne v4, v2, :cond_0

    .line 554
    iget-wide v4, v0, Ll/ۜ֡ۧ;->᩹:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v4, v6

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    :goto_1
    invoke-static {v12}, Ll/᩺֡֫;->ۧ(Z)V

    .line 555
    iget-object v13, v0, Ll/ۜ֡ۧ;->ܿ:Ll/᩵ۢۧ;

    iget-wide v14, v0, Ll/ۜ֡ۧ;->᩹:J

    iget v2, v0, Ll/ۜ֡ۧ;->ܶ:I

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x1

    move/from16 v17, v2

    invoke-interface/range {v13 .. v19}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 556
    iget-wide v4, v0, Ll/ۜ֡ۧ;->᩹:J

    iget-wide v6, v0, Ll/ۜ֡ۧ;->ܳ:J

    add-long/2addr v4, v6

    iput-wide v4, v0, Ll/ۜ֡ۧ;->᩹:J

    goto/16 :goto_5

    .line 200
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 191
    :cond_3
    iget-boolean v2, v0, Ll/ۜ֡ۧ;->ܺ:Z

    const/4 v3, 0x5

    if-eqz v2, :cond_4

    const/4 v2, 0x7

    goto :goto_2

    :cond_4
    const/4 v2, 0x5

    .line 192
    :goto_2
    iget-object v6, v8, Ll/ܽ֨֫;->ᩳ:[B

    .line 233
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v13

    iget v14, v0, Ll/ۜ֡ۧ;->ۧ:I

    sub-int v14, v2, v14

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    .line 234
    iget v14, v0, Ll/ۜ֡ۧ;->ۧ:I

    invoke-virtual {v1, v14, v13, v6}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 235
    iget v6, v0, Ll/ۜ֡ۧ;->ۧ:I

    add-int/2addr v6, v13

    iput v6, v0, Ll/ۜ֡ۧ;->ۧ:I

    if-ne v6, v2, :cond_0

    .line 491
    invoke-virtual {v8, v9}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 493
    iget-boolean v2, v0, Ll/ۜ֡ۧ;->ۖ:Z

    if-nez v2, :cond_6

    .line 494
    invoke-virtual {v8, v11}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/2addr v2, v12

    if-eq v2, v11, :cond_5

    .line 505
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Detected audio object type: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", but assuming AAC LC."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v2, 0x2

    .line 509
    :cond_5
    invoke-virtual {v8, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 510
    invoke-virtual {v8, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 512
    iget v4, v0, Ll/ۜ֡ۧ;->ۜ:I

    shl-int/2addr v2, v7

    and-int/lit16 v2, v2, 0xf8

    shr-int/lit8 v6, v4, 0x1

    and-int/lit8 v6, v6, 0x7

    or-int/2addr v2, v6

    int-to-byte v2, v2

    shl-int/lit8 v4, v4, 0x7

    and-int/lit16 v4, v4, 0x80

    shl-int/2addr v3, v7

    and-int/lit8 v3, v3, 0x78

    or-int/2addr v3, v4

    int-to-byte v3, v3

    new-array v4, v11, [B

    aput-byte v2, v4, v9

    aput-byte v3, v4, v12

    .line 195
    new-instance v2, Ll/ܽ֨֫;

    .line 48
    invoke-direct {v2, v4, v11}, Ll/ܽ֨֫;-><init>([BI)V

    .line 195
    invoke-static {v2, v9}, Ll/۫ۜۧ;->֫(Ll/ܽ֨֫;Z)Ll/۬ۜۧ;

    move-result-object v2

    .line 516
    new-instance v3, Ll/֨ᩴ֫;

    invoke-direct {v3}, Ll/֨ᩴ֫;-><init>()V

    iget-object v6, v0, Ll/ۜ֡ۧ;->ۢ:Ljava/lang/String;

    .line 518
    invoke-virtual {v3, v6}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v6, v0, Ll/ۜ֡ۧ;->ܽ:Ljava/lang/String;

    .line 519
    invoke-virtual {v3, v6}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v6, "audio/mp4a-latm"

    .line 520
    invoke-virtual {v3, v6}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v6, v2, Ll/۬ۜۧ;->ۧ:Ljava/lang/String;

    .line 521
    invoke-virtual {v3, v6}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    iget v6, v2, Ll/۬ۜۧ;->֫:I

    .line 522
    invoke-virtual {v3, v6}, Ll/֨ᩴ֫;->ᩳ(I)V

    iget v2, v2, Ll/۬ۜۧ;->ܽ:I

    .line 523
    invoke-virtual {v3, v2}, Ll/֨ᩴ֫;->۠(I)V

    .line 524
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    iget-object v2, v0, Ll/ۜ֡ۧ;->᩵:Ljava/lang/String;

    .line 525
    invoke-virtual {v3, v2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v2, v0, Ll/ۜ֡ۧ;->֨:I

    .line 526
    invoke-virtual {v3, v2}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 527
    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v2

    .line 530
    iget v3, v2, Ll/۠ᩴ֫;->ܽ֫:I

    int-to-long v3, v3

    const-wide/32 v6, 0x3d090000

    div-long/2addr v6, v3

    iput-wide v6, v0, Ll/ۜ֡ۧ;->۠:J

    .line 531
    iget-object v3, v0, Ll/ۜ֡ۧ;->ۚ:Ll/᩵ۢۧ;

    invoke-interface {v3, v2}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 532
    iput-boolean v12, v0, Ll/ۜ֡ۧ;->ۖ:Z

    goto :goto_3

    .line 534
    :cond_6
    invoke-virtual {v8, v4}, Ll/ܽ֨֫;->ܿ(I)V

    .line 537
    :goto_3
    invoke-virtual {v8, v10}, Ll/ܽ֨֫;->ܿ(I)V

    .line 538
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/lit8 v3, v2, -0x7

    .line 539
    iget-boolean v4, v0, Ll/ۜ֡ۧ;->ܺ:Z

    if-eqz v4, :cond_7

    add-int/lit8 v3, v2, -0x9

    .line 543
    :cond_7
    iget-object v2, v0, Ll/ۜ֡ۧ;->ۚ:Ll/᩵ۢۧ;

    iget-wide v4, v0, Ll/ۜ֡ۧ;->۠:J

    .line 267
    iput v10, v0, Ll/ۜ֡ۧ;->᩸:I

    .line 268
    iput v9, v0, Ll/ۜ֡ۧ;->ۧ:I

    .line 269
    iput-object v2, v0, Ll/ۜ֡ۧ;->ܿ:Ll/᩵ۢۧ;

    goto :goto_4

    .line 183
    :cond_8
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 233
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    iget v5, v0, Ll/ۜ֡ۧ;->ۧ:I

    rsub-int/lit8 v5, v5, 0xa

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 234
    iget v5, v0, Ll/ۜ֡ۧ;->ۧ:I

    invoke-virtual {v1, v5, v3, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 235
    iget v2, v0, Ll/ۜ֡ۧ;->ۧ:I

    add-int/2addr v2, v3

    iput v2, v0, Ll/ۜ֡ۧ;->ۧ:I

    if-ne v2, v4, :cond_0

    .line 482
    iget-object v2, v0, Ll/ۜ֡ۧ;->ᩴ:Ll/᩵ۢۧ;

    invoke-interface {v2, v4, v6}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    const/4 v2, 0x6

    .line 483
    invoke-virtual {v6, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 484
    iget-object v2, v0, Ll/ۜ֡ۧ;->ᩴ:Ll/᩵ۢۧ;

    .line 485
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ۚ()I

    move-result v3

    add-int/2addr v3, v4

    .line 267
    iput v10, v0, Ll/ۜ֡ۧ;->᩸:I

    .line 268
    iput v4, v0, Ll/ۜ֡ۧ;->ۧ:I

    .line 269
    iput-object v2, v0, Ll/ۜ֡ۧ;->ܿ:Ll/᩵ۢۧ;

    const-wide/16 v4, 0x0

    .line 270
    :goto_4
    iput-wide v4, v0, Ll/ۜ֡ۧ;->ܳ:J

    .line 271
    iput v3, v0, Ll/ۜ֡ۧ;->ܶ:I

    goto/16 :goto_0

    .line 346
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_0

    .line 351
    :cond_a
    iget-object v2, v8, Ll/ܽ֨֫;->ᩳ:[B

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    aget-byte v5, v5, v6

    aput-byte v5, v2, v9

    .line 353
    invoke-virtual {v8, v11}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 354
    invoke-virtual {v8, v10}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 355
    iget v5, v0, Ll/ۜ֡ۧ;->ۜ:I

    if-eq v5, v4, :cond_b

    if-eq v2, v5, :cond_b

    .line 219
    iput-boolean v9, v0, Ll/ۜ֡ۧ;->ۡ:Z

    .line 241
    :goto_5
    iput v9, v0, Ll/ۜ֡ۧ;->᩸:I

    .line 242
    iput v9, v0, Ll/ۜ֡ۧ;->ۧ:I

    .line 243
    iput v3, v0, Ll/ۜ֡ۧ;->֡:I

    goto/16 :goto_0

    .line 362
    :cond_b
    iget-boolean v3, v0, Ll/ۜ֡ۧ;->ۡ:Z

    if-nez v3, :cond_c

    .line 363
    iput-boolean v12, v0, Ll/ۜ֡ۧ;->ۡ:Z

    .line 364
    iget v3, v0, Ll/ۜ֡ۧ;->ᩳ:I

    iput v3, v0, Ll/ۜ֡ۧ;->᩷:I

    .line 365
    iput v2, v0, Ll/ۜ֡ۧ;->ۜ:I

    .line 276
    :cond_c
    iput v7, v0, Ll/ۜ֡ۧ;->᩸:I

    .line 277
    iput v9, v0, Ll/ۜ֡ۧ;->ۧ:I

    goto/16 :goto_0

    .line 293
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 294
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    .line 295
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v4

    :goto_6
    if-ge v3, v4, :cond_25

    add-int/lit8 v5, v3, 0x1

    .line 297
    aget-byte v7, v2, v3

    and-int/lit16 v11, v7, 0xff

    .line 298
    iget v13, v0, Ll/ۜ֡ۧ;->֡:I

    const/16 v14, 0x200

    if-ne v13, v14, :cond_1f

    int-to-byte v13, v11

    and-int/lit16 v13, v13, 0xff

    const v14, 0xff00

    or-int/2addr v13, v14

    const v15, 0xfff6

    and-int/2addr v13, v15

    const v15, 0xfff0

    if-ne v13, v15, :cond_1f

    .line 299
    iget-boolean v13, v0, Ll/ۜ֡ۧ;->ۡ:Z

    if-nez v13, :cond_1c

    add-int/lit8 v13, v3, -0x1

    .line 393
    invoke-virtual {v1, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 394
    iget-object v15, v8, Ll/ܽ֨֫;->ᩳ:[B

    .line 472
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v14

    if-ge v14, v12, :cond_e

    goto/16 :goto_b

    .line 475
    :cond_e
    invoke-virtual {v1, v9, v12, v15}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 399
    invoke-virtual {v8, v10}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 400
    invoke-virtual {v8, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 401
    iget v14, v0, Ll/ۜ֡ۧ;->᩷:I

    const/4 v15, -0x1

    if-eq v14, v15, :cond_f

    if-eq v10, v14, :cond_f

    goto/16 :goto_b

    .line 406
    :cond_f
    iget v14, v0, Ll/ۜ֡ۧ;->ۜ:I

    if-eq v14, v15, :cond_12

    .line 407
    iget-object v14, v8, Ll/ܽ֨֫;->ᩳ:[B

    .line 472
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v15

    if-ge v15, v12, :cond_10

    goto/16 :goto_8

    .line 475
    :cond_10
    invoke-virtual {v1, v9, v12, v14}, Ll/ᩳ֨֫;->֫(II[B)V

    const/4 v12, 0x2

    .line 411
    invoke-virtual {v8, v12}, Ll/ܽ֨֫;->ᩳ(I)V

    const/4 v12, 0x4

    .line 412
    invoke-virtual {v8, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v14

    .line 413
    iget v15, v0, Ll/ۜ֡ۧ;->ۜ:I

    if-eq v14, v15, :cond_11

    goto/16 :goto_b

    .line 416
    :cond_11
    invoke-virtual {v1, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_7

    :cond_12
    const/4 v12, 0x4

    .line 420
    :goto_7
    iget-object v14, v8, Ll/ܽ֨֫;->ᩳ:[B

    .line 472
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v15

    if-ge v15, v12, :cond_13

    goto :goto_8

    .line 475
    :cond_13
    invoke-virtual {v1, v9, v12, v14}, Ll/ᩳ֨֫;->֫(II[B)V

    const/16 v12, 0xe

    .line 424
    invoke-virtual {v8, v12}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v12, 0xd

    .line 425
    invoke-virtual {v8, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    const/4 v14, 0x7

    if-ge v12, v14, :cond_14

    goto/16 :goto_b

    .line 432
    :cond_14
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v14

    .line 433
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v15

    add-int/2addr v13, v12

    if-lt v13, v15, :cond_15

    goto :goto_8

    .line 439
    :cond_15
    aget-byte v12, v14, v13

    const/4 v9, -0x1

    if-ne v12, v9, :cond_17

    add-int/lit8 v13, v13, 0x1

    if-ne v13, v15, :cond_16

    goto :goto_8

    .line 444
    :cond_16
    aget-byte v9, v14, v13

    and-int/lit16 v12, v9, 0xff

    const v13, 0xff00

    or-int/2addr v12, v13

    const v13, 0xfff6

    and-int/2addr v12, v13

    const v13, 0xfff0

    if-ne v12, v13, :cond_1f

    and-int/lit8 v9, v9, 0x8

    shr-int/lit8 v9, v9, 0x3

    if-ne v9, v10, :cond_1f

    goto :goto_8

    :cond_17
    const/16 v9, 0x49

    if-eq v12, v9, :cond_18

    goto :goto_b

    :cond_18
    add-int/lit8 v9, v13, 0x1

    if-ne v9, v15, :cond_19

    goto :goto_8

    .line 454
    :cond_19
    aget-byte v9, v14, v9

    const/16 v10, 0x44

    if-eq v9, v10, :cond_1a

    goto :goto_b

    :cond_1a
    add-int/lit8 v13, v13, 0x2

    if-ne v13, v15, :cond_1b

    goto :goto_8

    .line 461
    :cond_1b
    aget-byte v9, v14, v13

    const/16 v10, 0x33

    if-ne v9, v10, :cond_1f

    :cond_1c
    :goto_8
    and-int/lit8 v2, v7, 0x8

    shr-int/lit8 v2, v2, 0x3

    .line 301
    iput v2, v0, Ll/ۜ֡ۧ;->ᩳ:I

    and-int/lit8 v2, v7, 0x1

    if-nez v2, :cond_1d

    const/4 v2, 0x1

    goto :goto_9

    :cond_1d
    const/4 v2, 0x0

    .line 302
    :goto_9
    iput-boolean v2, v0, Ll/ۜ֡ۧ;->ܺ:Z

    .line 303
    iget-boolean v2, v0, Ll/ۜ֡ۧ;->ۡ:Z

    if-nez v2, :cond_1e

    const/4 v2, 0x1

    .line 282
    iput v2, v0, Ll/ۜ֡ۧ;->᩸:I

    const/4 v2, 0x0

    .line 283
    iput v2, v0, Ll/ۜ֡ۧ;->ۧ:I

    goto :goto_a

    :cond_1e
    const/4 v2, 0x0

    const/4 v3, 0x3

    .line 276
    iput v3, v0, Ll/ۜ֡ۧ;->᩸:I

    .line 277
    iput v2, v0, Ll/ۜ֡ۧ;->ۧ:I

    .line 308
    :goto_a
    invoke-virtual {v1, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    .line 313
    :cond_1f
    :goto_b
    iget v7, v0, Ll/ۜ֡ۧ;->֡:I

    or-int v9, v11, v7

    const/16 v10, 0x149

    if-eq v9, v10, :cond_24

    const/16 v10, 0x1ff

    if-eq v9, v10, :cond_23

    const/16 v10, 0x344

    if-eq v9, v10, :cond_22

    const/16 v10, 0x433

    if-eq v9, v10, :cond_21

    const/16 v9, 0x100

    if-eq v7, v9, :cond_20

    .line 331
    iput v9, v0, Ll/ۜ֡ۧ;->֡:I

    const/4 v7, 0x0

    goto :goto_d

    :cond_20
    const/4 v7, 0x0

    goto :goto_c

    :cond_21
    const/4 v2, 0x2

    .line 251
    iput v2, v0, Ll/ۜ֡ۧ;->᩸:I

    const/4 v2, 0x3

    .line 252
    iput v2, v0, Ll/ۜ֡ۧ;->ۧ:I

    const/4 v7, 0x0

    .line 253
    iput v7, v0, Ll/ۜ֡ۧ;->ܶ:I

    .line 254
    invoke-virtual {v6, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 325
    invoke-virtual {v1, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_22
    const/4 v7, 0x0

    const/16 v3, 0x400

    .line 321
    iput v3, v0, Ll/ۜ֡ۧ;->֡:I

    goto :goto_c

    :cond_23
    const/4 v7, 0x0

    const/16 v3, 0x200

    .line 315
    iput v3, v0, Ll/ۜ֡ۧ;->֡:I

    goto :goto_c

    :cond_24
    const/4 v7, 0x0

    const/16 v3, 0x300

    .line 318
    iput v3, v0, Ll/ۜ֡ۧ;->֡:I

    :goto_c
    move v3, v5

    :goto_d
    const/4 v10, 0x4

    const/4 v12, 0x1

    const/4 v9, 0x0

    goto/16 :goto_6

    .line 337
    :cond_25
    invoke-virtual {v1, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_26
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 2

    .line 151
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 152
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜ֡ۧ;->ۢ:Ljava/lang/String;

    .line 153
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ۜ֡ۧ;->ۚ:Ll/᩵ۢۧ;

    .line 154
    iput-object v0, p0, Ll/ۜ֡ۧ;->ܿ:Ll/᩵ۢۧ;

    .line 155
    iget-boolean v0, p0, Ll/ۜ֡ۧ;->᩻:Z

    if-eqz v0, :cond_0

    .line 156
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 157
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ֡ۧ;->ᩴ:Ll/᩵ۢۧ;

    .line 158
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    .line 160
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object p2, p0, Ll/ۜ֡ۧ;->ܽ:Ljava/lang/String;

    .line 161
    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string p2, "application/id3"

    .line 162
    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 163
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p2

    .line 158
    invoke-interface {p1, p2}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void

    .line 165
    :cond_0
    new-instance p1, Ll/᩵᩷ۧ;

    invoke-direct {p1}, Ll/᩵᩷ۧ;-><init>()V

    iput-object p1, p0, Ll/ۜ֡ۧ;->ᩴ:Ll/᩵ۢۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 215
    iget-wide v0, p0, Ll/ۜ֡ۧ;->۠:J

    return-wide v0
.end method
