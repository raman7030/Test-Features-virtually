.class public final Ll/᩵ۘۘ;
.super Ljava/lang/Object;
.source "67VX"


# static fields
.field public static final ۗ:[I

.field public static final ۬:[I


# instance fields
.field public ֡:I

.field public ֨:[[I

.field public ֫:[I

.field public ۖ:I

.field public ۘ:I

.field public final ۙ:Ll/ܶۘۘ;

.field public ۚ:[I

.field public final ۜ:Ll/֡ۘۘ;

.field public ۠:[I

.field public ۡ:I

.field public ۢ:[I

.field public ۧ:[I

.field public ܳ:[I

.field public ܶ:[[I

.field public final ܺ:Ll/ۚۘۘ;

.field public ܽ:I

.field public ܿ:[I

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:I

.field public ᩷:I

.field public ᩸:[I

.field public ᩹:[B

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    new-array v0, v0, [I

    .line 37
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ۘۘ;->۬:[I

    const/16 v0, 0x13

    new-array v0, v0, [I

    .line 42
    fill-array-data v0, :array_1

    sput-object v0, Ll/᩵ۘۘ;->ۗ:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
        0x3
        0x7
        0xf
        0x1f
        0x3f
        0x7f
        0xff
        0x1ff
        0x3ff
        0x7ff
        0xfff
        0x1fff
        0x3fff
        0x7fff
        0xffff
    .end array-data

    :array_1
    .array-data 4
        0x10
        0x11
        0x12
        0x0
        0x8
        0x7
        0x9
        0x6
        0xa
        0x5
        0xb
        0x4
        0xc
        0x3
        0xd
        0x2
        0xe
        0x1
        0xf
    .end array-data
.end method

.method public constructor <init>(Ll/ܶۘۘ;I)V
    .locals 3

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v1, v0, [I

    .line 73
    iput-object v1, p0, Ll/᩵ۘۘ;->֫:[I

    new-array v1, v0, [I

    .line 74
    iput-object v1, p0, Ll/᩵ۘۘ;->ۚ:[I

    new-array v1, v0, [I

    .line 76
    iput-object v1, p0, Ll/᩵ۘۘ;->ܿ:[I

    new-array v1, v0, [I

    .line 77
    iput-object v1, p0, Ll/᩵ۘۘ;->ۧ:[I

    new-array v1, v0, [[I

    .line 79
    iput-object v1, p0, Ll/᩵ۘۘ;->ܶ:[[I

    new-array v1, v0, [[I

    .line 80
    iput-object v1, p0, Ll/᩵ۘۘ;->֨:[[I

    new-array v1, v0, [I

    .line 81
    iput-object v1, p0, Ll/᩵ۘۘ;->᩸:[I

    new-array v1, v0, [I

    .line 82
    iput-object v1, p0, Ll/᩵ۘۘ;->۠:[I

    .line 98
    new-instance v1, Ll/ۚۘۘ;

    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    .line 136
    iput-object v2, v1, Ll/ۚۘۘ;->ۧ:[I

    .line 137
    iput-object v2, v1, Ll/ۚۘۘ;->ܿ:[I

    .line 138
    iput-object v2, v1, Ll/ۚۘۘ;->֫:[I

    .line 139
    iput-object v2, v1, Ll/ۚۘۘ;->ܽ:[I

    .line 140
    iput-object v2, v1, Ll/ۚۘۘ;->ᩳ:[I

    .line 141
    iput-object v2, v1, Ll/ۚۘۘ;->ܳ:[I

    .line 98
    iput-object v1, p0, Ll/᩵ۘۘ;->ܺ:Ll/ۚۘۘ;

    .line 103
    iput-object p1, p0, Ll/᩵ۘۘ;->ۙ:Ll/ܶۘۘ;

    .line 104
    new-instance v1, Ll/֡ۘۘ;

    invoke-direct {v1, p1, p0}, Ll/֡ۘۘ;-><init>(Ll/ܶۘۘ;Ll/᩵ۘۘ;)V

    iput-object v1, p0, Ll/᩵ۘۘ;->ۜ:Ll/֡ۘۘ;

    const/16 v1, 0x10e0

    new-array v1, v1, [I

    .line 105
    iput-object v1, p0, Ll/᩵ۘۘ;->ۢ:[I

    .line 106
    new-array v1, p2, [B

    iput-object v1, p0, Ll/᩵ۘۘ;->᩹:[B

    .line 107
    iput p2, p0, Ll/᩵ۘۘ;->᩷:I

    .line 108
    iget-object p1, p1, Ll/᩶ۘۘ;->ܿ:Ll/۠ۘۘ;

    iget p1, p1, Ll/۠ۘۘ;->ۡ:I

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iput-boolean v0, p0, Ll/᩵ۘۘ;->᩻:Z

    .line 109
    iput p2, p0, Ll/᩵ۘۘ;->ᩴ:I

    .line 110
    invoke-virtual {p0}, Ll/᩵ۘۘ;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 12

    .line 630
    iget-object v0, p0, Ll/᩵ۘۘ;->ۙ:Ll/ܶۘۘ;

    iget v1, v0, Ll/᩶ۘۘ;->ۢ:I

    .line 631
    iget v2, p0, Ll/᩵ۘۘ;->᩵:I

    .line 634
    iget v3, p0, Ll/᩵ۘۘ;->᩶:I

    iget v4, p0, Ll/᩵ۘۘ;->᩷:I

    if-gt v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    sub-int/2addr v3, v2

    .line 635
    iget v5, v0, Ll/᩶ۘۘ;->ܽ:I

    if-le v3, v5, :cond_1

    move v3, v5

    :cond_1
    const/4 v6, -0x5

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    if-ne p1, v6, :cond_2

    const/4 p1, 0x0

    :cond_2
    sub-int/2addr v5, v3

    .line 641
    iput v5, v0, Ll/᩶ۘۘ;->ܽ:I

    .line 642
    iget-wide v8, v0, Ll/᩶ۘۘ;->ܺ:J

    int-to-long v10, v3

    add-long/2addr v8, v10

    iput-wide v8, v0, Ll/᩶ۘۘ;->ܺ:J

    .line 645
    iget-boolean v5, p0, Ll/᩵ۘۘ;->᩻:Z

    if-eqz v5, :cond_3

    if-lez v3, :cond_3

    .line 646
    iget-object v8, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    iget-object v9, p0, Ll/᩵ۘۘ;->᩹:[B

    invoke-interface {v8, v9, v2, v3}, Ll/᩷ۘۘ;->update([BII)V

    .line 650
    :cond_3
    iget-object v8, p0, Ll/᩵ۘۘ;->᩹:[B

    iget-object v9, v0, Ll/᩶ۘۘ;->᩷:[B

    invoke-static {v8, v2, v9, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v3

    add-int/2addr v2, v3

    if-ne v2, v4, :cond_8

    .line 658
    iget v2, p0, Ll/᩵ۘۘ;->᩶:I

    if-ne v2, v4, :cond_4

    .line 659
    iput v7, p0, Ll/᩵ۘۘ;->᩶:I

    .line 662
    :cond_4
    iget v2, p0, Ll/᩵ۘۘ;->᩶:I

    .line 663
    iget v3, v0, Ll/᩶ۘۘ;->ܽ:I

    if-le v2, v3, :cond_5

    move v2, v3

    :cond_5
    if-eqz v2, :cond_6

    if-ne p1, v6, :cond_6

    const/4 p1, 0x0

    :cond_6
    sub-int/2addr v3, v2

    .line 669
    iput v3, v0, Ll/᩶ۘۘ;->ܽ:I

    .line 670
    iget-wide v3, v0, Ll/᩶ۘۘ;->ܺ:J

    int-to-long v8, v2

    add-long/2addr v3, v8

    iput-wide v3, v0, Ll/᩶ۘۘ;->ܺ:J

    if-eqz v5, :cond_7

    if-lez v2, :cond_7

    .line 674
    iget-object v3, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    iget-object v4, p0, Ll/᩵ۘۘ;->᩹:[B

    invoke-interface {v3, v4, v7, v2}, Ll/᩷ۘۘ;->update([BII)V

    .line 678
    :cond_7
    iget-object v3, p0, Ll/᩵ۘۘ;->᩹:[B

    iget-object v4, v0, Ll/᩶ۘۘ;->᩷:[B

    invoke-static {v3, v7, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v2

    .line 684
    :cond_8
    iput v1, v0, Ll/᩶ۘۘ;->ۢ:I

    .line 685
    iput v2, p0, Ll/᩵ۘۘ;->᩵:I

    return p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 119
    iput v0, p0, Ll/᩵ۘۘ;->ᩴ:I

    .line 120
    iput v0, p0, Ll/᩵ۘۘ;->ᩳ:I

    .line 121
    iput v0, p0, Ll/᩵ۘۘ;->ܽ:I

    .line 122
    iput v0, p0, Ll/᩵ۘۘ;->᩶:I

    iput v0, p0, Ll/᩵ۘۘ;->᩵:I

    .line 123
    iget-boolean v0, p0, Ll/᩵ۘۘ;->᩻:Z

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Ll/᩵ۘۘ;->ۙ:Ll/ܶۘۘ;

    iget-object v0, v0, Ll/᩶ۘۘ;->֫:Ll/᩷ۘۘ;

    invoke-interface {v0}, Ll/᩷ۘۘ;->reset()V

    :cond_0
    return-void
.end method

.method public final ۧ(I)I
    .locals 33

    move-object/from16 v0, p0

    .line 140
    iget-object v1, v0, Ll/᩵ۘۘ;->ۙ:Ll/ܶۘۘ;

    iget v2, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 141
    iget v3, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 142
    iget v4, v0, Ll/᩵ۘۘ;->ܽ:I

    .line 143
    iget v5, v0, Ll/᩵ۘۘ;->ᩳ:I

    .line 146
    iget v6, v0, Ll/᩵ۘۘ;->᩶:I

    .line 147
    iget v7, v0, Ll/᩵ۘۘ;->᩵:I

    iget v8, v0, Ll/᩵ۘۘ;->᩷:I

    if-ge v6, v7, :cond_0

    sub-int/2addr v7, v6

    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    :cond_0
    sub-int v7, v8, v6

    :goto_0
    move-object v10, v0

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v4

    move v4, v3

    move v3, v2

    move-object v2, v1

    move/from16 v1, p1

    .line 152
    :goto_1
    iget v11, v10, Ll/᩵ۘۘ;->ᩴ:I

    iget-object v12, v10, Ll/᩵ۘۘ;->ܺ:Ll/ۚۘۘ;

    iget-object v13, v10, Ll/᩵ۘۘ;->֫:[I

    iget-object v14, v10, Ll/᩵ۘۘ;->ۜ:Ll/֡ۘۘ;

    iget-object v15, v10, Ll/᩵ۘۘ;->ۧ:[I

    iget-object v0, v10, Ll/᩵ۘۘ;->ܿ:[I

    move-object/from16 p1, v12

    iget-object v12, v10, Ll/᩵ۘۘ;->ۚ:[I

    const/16 v16, 0x6

    const/16 v17, 0x7

    move-object/from16 v18, v12

    packed-switch v11, :pswitch_data_0

    .line 594
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 595
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 596
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 597
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v4, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v4, v3, v4

    int-to-long v4, v4

    add-long/2addr v0, v4

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 598
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 599
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x2

    .line 600
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    .line 583
    :pswitch_0
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 584
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 585
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 586
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v4, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v4, v3, v4

    int-to-long v4, v4

    add-long/2addr v0, v4

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 587
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 588
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x3

    .line 589
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :pswitch_1
    move-object/from16 v22, p1

    :goto_2
    move-object/from16 v12, v18

    goto/16 :goto_a

    :pswitch_2
    move-object/from16 v16, p1

    move-object v8, v2

    move v11, v5

    move v12, v6

    move-object/from16 v17, v13

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    const/16 v21, 0x6

    move v13, v7

    move v14, v9

    move-object v15, v10

    move v9, v3

    move v10, v4

    const/4 v3, 0x0

    const/4 v4, 0x7

    goto/16 :goto_8

    :goto_3
    :pswitch_3
    const/16 v8, 0xe

    if-ge v6, v8, :cond_2

    if-eqz v4, :cond_1

    add-int/lit8 v4, v4, -0x1

    .line 325
    iget-object v1, v2, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v8, v3, 0x1

    aget-byte v1, v1, v3

    and-int/lit16 v1, v1, 0xff

    shl-int/2addr v1, v6

    or-int/2addr v5, v1

    add-int/lit8 v6, v6, 0x8

    const/4 v1, 0x0

    move v3, v8

    goto :goto_3

    .line 316
    :cond_1
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 317
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 318
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 319
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v4, v8

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 320
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 321
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 322
    invoke-virtual {v10, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_2
    and-int/lit16 v8, v5, 0x3fff

    .line 329
    iput v8, v10, Ll/᩵ۘۘ;->֡:I

    and-int/lit8 v11, v5, 0x1f

    const/16 v12, 0x1d

    if-gt v11, v12, :cond_1f

    shr-int/lit8 v8, v8, 0x5

    and-int/lit8 v8, v8, 0x1f

    if-le v8, v12, :cond_3

    goto/16 :goto_14

    :cond_3
    add-int/lit16 v11, v11, 0x102

    add-int/2addr v11, v8

    .line 344
    iget-object v8, v10, Ll/᩵ۘۘ;->ܳ:[I

    if-eqz v8, :cond_5

    array-length v8, v8

    if-ge v8, v11, :cond_4

    goto :goto_5

    :cond_4
    const/4 v8, 0x0

    :goto_4
    if-ge v8, v11, :cond_6

    .line 348
    iget-object v12, v10, Ll/᩵ۘۘ;->ܳ:[I

    const/16 v19, 0x0

    aput v19, v12, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 345
    :cond_5
    :goto_5
    new-array v8, v11, [I

    iput-object v8, v10, Ll/᩵ۘۘ;->ܳ:[I

    :cond_6
    ushr-int/lit8 v5, v5, 0xe

    add-int/lit8 v6, v6, -0xe

    const/4 v8, 0x0

    .line 357
    iput v8, v10, Ll/᩵ۘۘ;->ۡ:I

    const/4 v11, 0x4

    .line 358
    iput v11, v10, Ll/᩵ۘۘ;->ᩴ:I

    move-object/from16 v16, p1

    move-object v8, v2

    move v11, v5

    move v12, v6

    move-object/from16 v17, v13

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    const/4 v2, 0x4

    const/16 v21, 0x6

    move v13, v7

    move v14, v9

    move-object v15, v10

    move v9, v3

    move v10, v4

    const/4 v3, 0x0

    const/4 v4, 0x7

    .line 360
    :goto_6
    iget v5, v15, Ll/᩵ۘۘ;->ۡ:I

    iget v6, v15, Ll/᩵ۘۘ;->֡:I

    ushr-int/lit8 v6, v6, 0xa

    add-int/2addr v6, v2

    sget-object v2, Ll/᩵ۘۘ;->ۗ:[I

    if-ge v5, v6, :cond_9

    :goto_7
    const/4 v5, 0x3

    if-ge v12, v5, :cond_8

    if-eqz v10, :cond_7

    add-int/lit8 v10, v10, -0x1

    .line 374
    iget-object v1, v8, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v5, v9, 0x1

    aget-byte v1, v1, v9

    and-int/lit16 v1, v1, 0xff

    shl-int/2addr v1, v12

    or-int/2addr v11, v1

    add-int/lit8 v12, v12, 0x8

    const/4 v1, 0x0

    move v9, v5

    goto :goto_7

    .line 365
    :cond_7
    iput v11, v15, Ll/᩵ۘۘ;->ܽ:I

    .line 366
    iput v12, v15, Ll/᩵ۘۘ;->ᩳ:I

    .line 367
    iput v10, v8, Ll/᩶ۘۘ;->ۧ:I

    .line 368
    iget-wide v2, v8, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v8, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v9, v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    iput-wide v2, v8, Ll/᩶ۘۘ;->ۡ:J

    .line 369
    iput v9, v8, Ll/᩶ۘۘ;->ۜ:I

    .line 370
    iput v13, v15, Ll/᩵ۘۘ;->᩶:I

    .line 371
    invoke-virtual {v15, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    .line 378
    :cond_8
    iget-object v5, v15, Ll/᩵ۘۘ;->ܳ:[I

    iget v6, v15, Ll/᩵ۘۘ;->ۡ:I

    add-int/lit8 v7, v6, 0x1

    iput v7, v15, Ll/᩵ۘۘ;->ۡ:I

    aget v2, v2, v6

    and-int/lit8 v6, v11, 0x7

    aput v6, v5, v2

    ushr-int/lit8 v5, v11, 0x3

    add-int/lit8 v6, v12, -0x3

    move v11, v5

    move v12, v6

    :goto_8
    const/4 v2, 0x4

    goto :goto_6

    .line 386
    :cond_9
    :goto_9
    iget v5, v15, Ll/᩵ۘۘ;->ۡ:I

    const/16 v6, 0x13

    if-ge v5, v6, :cond_a

    .line 387
    iget-object v6, v15, Ll/᩵ۘۘ;->ܳ:[I

    add-int/lit8 v7, v5, 0x1

    iput v7, v15, Ll/᩵ۘۘ;->ۡ:I

    aget v5, v2, v5

    aput v3, v6, v5

    goto :goto_9

    .line 390
    :cond_a
    aput v4, v17, v3

    .line 391
    iget-object v3, v15, Ll/᩵ۘۘ;->ܳ:[I

    iget-object v6, v15, Ll/᩵ۘۘ;->ۢ:[I

    move-object/from16 v2, v16

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    move-object v7, v8

    invoke-virtual/range {v2 .. v7}, Ll/ۚۘۘ;->֫([I[I[I[ILl/ܶۘۘ;)I

    move-result v2

    if-eqz v2, :cond_c

    const/4 v0, -0x3

    if-ne v2, v0, :cond_b

    const/4 v0, 0x0

    .line 395
    iput-object v0, v15, Ll/᩵ۘۘ;->ܳ:[I

    const/16 v0, 0x9

    .line 396
    iput v0, v15, Ll/᩵ۘۘ;->ᩴ:I

    .line 399
    :cond_b
    iput v11, v15, Ll/᩵ۘۘ;->ܽ:I

    .line 400
    iput v12, v15, Ll/᩵ۘۘ;->ᩳ:I

    .line 401
    iput v10, v8, Ll/᩶ۘۘ;->ۧ:I

    .line 402
    iget-wide v0, v8, Ll/᩶ۘۘ;->ۡ:J

    iget v3, v8, Ll/᩶ۘۘ;->ۜ:I

    sub-int v3, v9, v3

    int-to-long v3, v3

    add-long/2addr v0, v3

    iput-wide v0, v8, Ll/᩶ۘۘ;->ۡ:J

    .line 403
    iput v9, v8, Ll/᩶ۘۘ;->ۜ:I

    .line 404
    iput v13, v15, Ll/᩵ۘۘ;->᩶:I

    .line 405
    invoke-virtual {v15, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_c
    const/4 v2, 0x0

    .line 408
    iput v2, v15, Ll/᩵ۘۘ;->ۡ:I

    const/4 v2, 0x5

    .line 409
    iput v2, v15, Ll/᩵ۘۘ;->ᩴ:I

    move-object v2, v8

    move v3, v9

    move v4, v10

    move v5, v11

    move v6, v12

    move v7, v13

    move v9, v14

    move-object v10, v15

    move-object/from16 v22, v16

    move-object/from16 v13, v17

    move-object/from16 v12, v18

    move-object/from16 v14, v19

    move-object/from16 v15, v20

    move/from16 v16, v21

    .line 412
    :goto_a
    iget v8, v10, Ll/᩵ۘۘ;->֡:I

    .line 413
    iget v11, v10, Ll/᩵ۘۘ;->ۡ:I

    move/from16 p1, v1

    and-int/lit8 v1, v8, 0x1f

    move/from16 v17, v9

    add-int/lit16 v9, v1, 0x102

    shr-int/lit8 v8, v8, 0x5

    and-int/lit8 v8, v8, 0x1f

    add-int/2addr v9, v8

    const/16 v18, -0x1

    if-lt v11, v9, :cond_13

    const/4 v9, 0x0

    .line 504
    aput v18, v12, v9

    const/16 v11, 0x9

    .line 505
    aput v11, v0, v9

    .line 506
    aput v16, v15, v9

    add-int/lit16 v1, v1, 0x101

    add-int/lit8 v24, v8, 0x1

    .line 508
    iget-object v8, v10, Ll/᩵ۘۘ;->ܳ:[I

    iget-object v9, v10, Ll/᩵ۘۘ;->ۢ:[I

    iget-object v11, v10, Ll/᩵ۘۘ;->᩸:[I

    iget-object v12, v10, Ll/᩵ۘۘ;->۠:[I

    move/from16 v23, v1

    move-object/from16 v25, v8

    move-object/from16 v26, v0

    move-object/from16 v27, v15

    move-object/from16 v28, v11

    move-object/from16 v29, v12

    move-object/from16 v30, v9

    move-object/from16 v31, v2

    invoke-virtual/range {v22 .. v31}, Ll/ۚۘۘ;->֫(II[I[I[I[I[I[ILl/ܶۘۘ;)I

    move-result v1

    if-eqz v1, :cond_e

    const/4 v0, -0x3

    if-ne v1, v0, :cond_d

    const/4 v0, 0x0

    .line 513
    iput-object v0, v10, Ll/᩵ۘۘ;->ܳ:[I

    const/16 v0, 0x9

    .line 514
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    .line 518
    :cond_d
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 519
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 520
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 521
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v4, v8

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 522
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 523
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 524
    invoke-virtual {v10, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_e
    const/4 v1, 0x0

    .line 526
    aget v0, v0, v1

    aget v8, v15, v1

    iget-object v9, v10, Ll/᩵ۘۘ;->ۢ:[I

    aget v11, v11, v1

    aget v12, v12, v1

    .line 94
    iput v1, v14, Ll/֡ۘۘ;->ۡ:I

    int-to-byte v0, v0

    .line 95
    iput-byte v0, v14, Ll/֡ۘۘ;->ܳ:B

    int-to-byte v0, v8

    .line 96
    iput-byte v0, v14, Ll/֡ۘۘ;->֫:B

    .line 97
    iput-object v9, v14, Ll/֡ۘۘ;->᩷:[I

    .line 98
    iput v11, v14, Ll/֡ۘۘ;->ۢ:I

    .line 99
    iput-object v9, v14, Ll/֡ۘۘ;->ܽ:[I

    .line 100
    iput v12, v14, Ll/֡ۘۘ;->ᩳ:I

    const/4 v0, 0x0

    .line 101
    iput-object v0, v14, Ll/֡ۘۘ;->ۘ:[I

    const/4 v0, 0x6

    .line 528
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    move/from16 v1, p1

    move/from16 v9, v17

    .line 530
    :pswitch_4
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 531
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 532
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 533
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v11, v0

    add-long/2addr v4, v11

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 534
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 535
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 537
    invoke-virtual {v14, v1}, Ll/֡ۘۘ;->֫(I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    .line 538
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    .line 543
    :cond_f
    iget v0, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 544
    iget v3, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 545
    iget v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 546
    iget v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 547
    iget v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 548
    iget v4, v10, Ll/᩵ۘۘ;->᩵:I

    if-ge v7, v4, :cond_10

    sub-int/2addr v4, v7

    sub-int/2addr v4, v1

    goto :goto_b

    :cond_10
    sub-int v4, v9, v7

    .line 550
    :goto_b
    iget v1, v10, Ll/᩵ۘۘ;->ۖ:I

    if-nez v1, :cond_11

    const/4 v1, 0x0

    .line 551
    iput v1, v10, Ll/᩵ۘۘ;->ᩴ:I

    goto/16 :goto_1b

    :cond_11
    const/4 v1, 0x7

    .line 554
    iput v1, v10, Ll/᩵ۘۘ;->ᩴ:I

    const/4 v1, 0x0

    move v4, v3

    move v3, v0

    .line 556
    :pswitch_5
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 557
    invoke-virtual {v10, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    .line 558
    iget v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 559
    iget v1, v10, Ll/᩵ۘۘ;->᩵:I

    if-eq v1, v7, :cond_12

    .line 561
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 562
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 563
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 564
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v1, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v1, v3, v1

    int-to-long v8, v1

    add-long/2addr v4, v8

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 565
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 566
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 567
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_12
    const/16 v0, 0x8

    .line 569
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    .line 573
    :pswitch_6
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 574
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 575
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 576
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v4, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v4, v3, v4

    int-to-long v4, v4

    add-long/2addr v0, v4

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 577
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 578
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, 0x1

    .line 579
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_13
    const/4 v1, 0x0

    .line 420
    aget v1, v13, v1

    move v8, v6

    move v6, v5

    move v5, v4

    move v4, v3

    move/from16 v3, p1

    :goto_c
    if-ge v8, v1, :cond_15

    if-eqz v5, :cond_14

    add-int/lit8 v5, v5, -0x1

    .line 435
    iget-object v3, v2, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v9, v4, 0x1

    aget-byte v3, v3, v4

    and-int/lit16 v3, v3, 0xff

    shl-int/2addr v3, v8

    or-int/2addr v6, v3

    add-int/lit8 v8, v8, 0x8

    const/4 v3, 0x0

    move v4, v9

    goto :goto_c

    .line 426
    :cond_14
    iput v6, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 427
    iput v8, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 428
    iput v5, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 429
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v5, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v5, v4, v5

    int-to-long v5, v5

    add-long/2addr v0, v5

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 430
    iput v4, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 431
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 432
    invoke-virtual {v10, v3}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_15
    const/4 v9, 0x0

    .line 439
    aget v9, v12, v9

    .line 443
    iget-object v11, v10, Ll/᩵ۘۘ;->ۢ:[I

    sget-object v16, Ll/᩵ۘۘ;->۬:[I

    aget v1, v16, v1

    and-int/2addr v1, v6

    move-object/from16 p1, v0

    const/4 v0, 0x3

    move/from16 v18, v3

    const/4 v3, 0x1

    invoke-static {v9, v1, v0, v3}, Ll/᩶ۢᩴ;->֫(IIII)I

    move-result v1

    aget v1, v11, v1

    .line 444
    aget v3, v16, v1

    and-int/2addr v3, v6

    move/from16 v19, v4

    const/4 v4, 0x2

    invoke-static {v9, v3, v0, v4}, Ll/᩶ۢᩴ;->֫(IIII)I

    move-result v0

    aget v0, v11, v0

    const/16 v3, 0x10

    if-ge v0, v3, :cond_16

    ushr-int v3, v6, v1

    sub-int/2addr v8, v1

    .line 449
    iget-object v1, v10, Ll/᩵ۘۘ;->ܳ:[I

    iget v4, v10, Ll/᩵ۘۘ;->ۡ:I

    add-int/lit8 v6, v4, 0x1

    iput v6, v10, Ll/᩵ۘۘ;->ۡ:I

    aput v0, v1, v4

    move v4, v5

    move v6, v8

    move/from16 v1, v18

    move v5, v3

    move-object/from16 v18, v12

    move/from16 v3, v19

    goto/16 :goto_12

    :cond_16
    const/16 v3, 0x12

    if-ne v0, v3, :cond_17

    const/4 v4, 0x7

    goto :goto_d

    :cond_17
    add-int/lit8 v4, v0, -0xe

    :goto_d
    if-ne v0, v3, :cond_18

    const/16 v3, 0xb

    goto :goto_e

    :cond_18
    const/4 v3, 0x3

    :goto_e
    move v9, v6

    move v11, v8

    move/from16 v6, v19

    move v8, v5

    move/from16 v5, v18

    move-object/from16 v18, v12

    :goto_f
    add-int v12, v1, v4

    if-ge v11, v12, :cond_1a

    if-eqz v8, :cond_19

    add-int/lit8 v8, v8, -0x1

    .line 467
    iget-object v5, v2, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v12, v6, 0x1

    aget-byte v5, v5, v6

    and-int/lit16 v5, v5, 0xff

    shl-int/2addr v5, v11

    or-int/2addr v9, v5

    add-int/lit8 v11, v11, 0x8

    const/4 v5, 0x0

    move v6, v12

    goto :goto_f

    .line 458
    :cond_19
    iput v9, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 459
    iput v11, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 460
    iput v8, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 461
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v3, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v3, v6, v3

    int-to-long v3, v3

    add-long/2addr v0, v3

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 462
    iput v6, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 463
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 464
    invoke-virtual {v10, v5}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_1a
    ushr-int/2addr v9, v1

    sub-int/2addr v11, v1

    .line 474
    aget v1, v16, v4

    and-int/2addr v1, v9

    add-int/2addr v3, v1

    ushr-int v1, v9, v4

    sub-int/2addr v11, v4

    .line 479
    iget v4, v10, Ll/᩵ۘۘ;->ۡ:I

    .line 480
    iget v9, v10, Ll/᩵ۘۘ;->֡:I

    add-int v12, v4, v3

    move/from16 v16, v3

    and-int/lit8 v3, v9, 0x1f

    add-int/lit16 v3, v3, 0x102

    shr-int/lit8 v9, v9, 0x5

    and-int/lit8 v9, v9, 0x1f

    add-int/2addr v3, v9

    if-gt v12, v3, :cond_1e

    const/16 v3, 0x10

    if-ne v0, v3, :cond_1b

    const/4 v9, 0x1

    if-ge v4, v9, :cond_1b

    goto :goto_13

    :cond_1b
    if-ne v0, v3, :cond_1c

    .line 496
    iget-object v0, v10, Ll/᩵ۘۘ;->ܳ:[I

    add-int/lit8 v3, v4, -0x1

    aget v0, v0, v3

    goto :goto_10

    :cond_1c
    const/4 v0, 0x0

    :goto_10
    move/from16 v3, v16

    .line 498
    :goto_11
    iget-object v9, v10, Ll/᩵ۘۘ;->ܳ:[I

    add-int/lit8 v12, v4, 0x1

    aput v0, v9, v4

    add-int/lit8 v3, v3, -0x1

    if-nez v3, :cond_1d

    .line 500
    iput v12, v10, Ll/᩵ۘۘ;->ۡ:I

    move v3, v6

    move v4, v8

    move v6, v11

    move/from16 v32, v5

    move v5, v1

    move/from16 v1, v32

    :goto_12
    const/16 v16, 0x6

    move-object/from16 v0, p1

    move/from16 v9, v17

    goto/16 :goto_2

    :cond_1d
    move v4, v12

    goto :goto_11

    :cond_1e
    :goto_13
    const/4 v0, 0x0

    .line 482
    iput-object v0, v10, Ll/᩵ۘۘ;->ܳ:[I

    const/16 v0, 0x9

    .line 483
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    const-string v0, "invalid bit length repeat"

    .line 484
    iput-object v0, v2, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 487
    iput v1, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 488
    iput v11, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 489
    iput v8, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 490
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v3, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v3, v6, v3

    int-to-long v3, v3

    add-long/2addr v0, v3

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 491
    iput v6, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 492
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x3

    .line 493
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_1f
    :goto_14
    const/16 v0, 0x9

    .line 331
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    const-string v0, "too many length or distance symbols"

    .line 332
    iput-object v0, v2, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 335
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 336
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 337
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 338
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v4, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v4, v3, v4

    int-to-long v4, v4

    add-long/2addr v0, v4

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 339
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 340
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x3

    .line 341
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :pswitch_7
    if-nez v4, :cond_20

    .line 261
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 262
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 263
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 264
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v4, v8

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 265
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 266
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 267
    invoke-virtual {v10, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_20
    if-nez v8, :cond_26

    if-ne v7, v9, :cond_22

    .line 271
    iget v0, v10, Ll/᩵ۘۘ;->᩵:I

    if-eqz v0, :cond_22

    if-lez v0, :cond_21

    add-int/lit8 v0, v0, -0x1

    move v8, v0

    goto :goto_15

    :cond_21
    move v8, v9

    :goto_15
    const/4 v7, 0x0

    :cond_22
    if-nez v8, :cond_26

    .line 276
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 277
    invoke-virtual {v10, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    .line 278
    iget v1, v10, Ll/᩵ۘۘ;->᩶:I

    .line 279
    iget v7, v10, Ll/᩵ۘۘ;->᩵:I

    if-ge v1, v7, :cond_23

    sub-int v8, v7, v1

    add-int/lit8 v8, v8, -0x1

    goto :goto_16

    :cond_23
    sub-int v8, v9, v1

    :goto_16
    if-ne v1, v9, :cond_25

    if-eqz v7, :cond_25

    if-lez v7, :cond_24

    add-int/lit8 v7, v7, -0x1

    goto :goto_17

    :cond_24
    move v7, v9

    :goto_17
    const/4 v1, 0x0

    move v8, v7

    const/4 v7, 0x0

    goto :goto_18

    :cond_25
    move v7, v1

    :goto_18
    if-nez v8, :cond_26

    .line 285
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 286
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 287
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 288
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v1, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v1, v3, v1

    int-to-long v8, v1

    add-long/2addr v4, v8

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 289
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 290
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 291
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    .line 297
    :cond_26
    iget v0, v10, Ll/᩵ۘۘ;->ۘ:I

    if-le v0, v4, :cond_27

    move v0, v4

    :cond_27
    if-le v0, v8, :cond_28

    move v0, v8

    .line 302
    :cond_28
    iget-object v1, v2, Ll/᩶ۘۘ;->᩻:[B

    iget-object v11, v10, Ll/᩵ۘۘ;->᩹:[B

    invoke-static {v1, v3, v11, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int v1, v3, v0

    sub-int v3, v4, v0

    add-int/2addr v7, v0

    sub-int v4, v8, v0

    .line 307
    iget v8, v10, Ll/᩵ۘۘ;->ۘ:I

    sub-int/2addr v8, v0

    iput v8, v10, Ll/᩵ۘۘ;->ۘ:I

    if-eqz v8, :cond_29

    goto :goto_1a

    .line 309
    :cond_29
    iget v0, v10, Ll/᩵ۘۘ;->ۖ:I

    if-eqz v0, :cond_2a

    const/4 v0, 0x7

    goto :goto_19

    :cond_2a
    const/4 v0, 0x0

    :goto_19
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    :goto_1a
    move v0, v1

    :goto_1b
    const/4 v1, 0x0

    move v8, v4

    move v4, v3

    move v3, v0

    goto/16 :goto_1f

    :goto_1c
    :pswitch_8
    const/16 v0, 0x20

    if-ge v6, v0, :cond_2c

    if-eqz v4, :cond_2b

    add-int/lit8 v4, v4, -0x1

    .line 238
    iget-object v0, v2, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v1, v3, 0x1

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v6

    or-int/2addr v5, v0

    add-int/lit8 v6, v6, 0x8

    const/4 v0, 0x0

    move v3, v1

    const/4 v1, 0x0

    goto :goto_1c

    .line 229
    :cond_2b
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 230
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 231
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 232
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v4, v8

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 233
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 234
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 235
    invoke-virtual {v10, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_2c
    not-int v0, v5

    ushr-int/lit8 v0, v0, 0x10

    const v11, 0xffff

    and-int/2addr v0, v11

    and-int/2addr v11, v5

    if-eq v0, v11, :cond_2d

    const/16 v0, 0x9

    .line 243
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    const-string v0, "invalid stored block lengths"

    .line 244
    iput-object v0, v2, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 247
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 248
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 249
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 250
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v4, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v4, v3, v4

    int-to-long v4, v4

    add-long/2addr v0, v4

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 251
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 252
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x3

    .line 253
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    .line 255
    :cond_2d
    iput v11, v10, Ll/᩵ۘۘ;->ۘ:I

    if-eqz v11, :cond_2e

    const/4 v0, 0x2

    goto :goto_1d

    .line 257
    :cond_2e
    iget v0, v10, Ll/᩵ۘۘ;->ۖ:I

    if-eqz v0, :cond_2f

    const/4 v0, 0x7

    goto :goto_1d

    :cond_2f
    const/4 v0, 0x0

    :goto_1d
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto/16 :goto_1f

    :goto_1e
    :pswitch_9
    const/4 v11, 0x3

    if-ge v6, v11, :cond_31

    if-eqz v4, :cond_30

    add-int/lit8 v4, v4, -0x1

    .line 167
    iget-object v1, v2, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v11, v3, 0x1

    aget-byte v1, v1, v3

    and-int/lit16 v1, v1, 0xff

    shl-int/2addr v1, v6

    or-int/2addr v5, v1

    add-int/lit8 v6, v6, 0x8

    const/4 v1, 0x0

    move v3, v11

    goto :goto_1e

    .line 158
    :cond_30
    iput v5, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 159
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 160
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 161
    iget-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v4, v8

    iput-wide v4, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 162
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 163
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    .line 164
    invoke-virtual {v10, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_31
    and-int/lit8 v11, v5, 0x7

    and-int/lit8 v12, v5, 0x1

    .line 171
    iput v12, v10, Ll/᩵ۘۘ;->ۖ:I

    const/4 v12, 0x1

    ushr-int/2addr v11, v12

    if-eqz v11, :cond_35

    if-eq v11, v12, :cond_34

    const/4 v0, 0x2

    if-eq v11, v0, :cond_33

    const/4 v0, 0x3

    if-eq v11, v0, :cond_32

    goto :goto_1f

    :cond_32
    ushr-int/lit8 v0, v5, 0x3

    add-int/lit8 v6, v6, -0x3

    const/16 v1, 0x9

    .line 211
    iput v1, v10, Ll/᩵ۘۘ;->ᩴ:I

    const-string v1, "invalid block type"

    .line 212
    iput-object v1, v2, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 215
    iput v0, v10, Ll/᩵ۘۘ;->ܽ:I

    .line 216
    iput v6, v10, Ll/᩵ۘۘ;->ᩳ:I

    .line 217
    iput v4, v2, Ll/᩶ۘۘ;->ۧ:I

    .line 218
    iget-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    iget v4, v2, Ll/᩶ۘۘ;->ۜ:I

    sub-int v4, v3, v4

    int-to-long v4, v4

    add-long/2addr v0, v4

    iput-wide v0, v2, Ll/᩶ۘۘ;->ۡ:J

    .line 219
    iput v3, v2, Ll/᩶ۘۘ;->ۜ:I

    .line 220
    iput v7, v10, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x3

    .line 221
    invoke-virtual {v10, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :cond_33
    ushr-int/lit8 v5, v5, 0x3

    add-int/lit8 v6, v6, -0x3

    const/4 v0, 0x3

    .line 204
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    goto :goto_1f

    :cond_34
    const/4 v11, 0x0

    const/16 v12, 0x9

    .line 407
    aput v12, v0, v11

    const/4 v12, 0x5

    .line 408
    aput v12, v15, v11

    .line 409
    sget-object v12, Ll/ۚۘۘ;->ܺ:[I

    iget-object v13, v10, Ll/᩵ۘۘ;->ܶ:[[I

    aput-object v12, v13, v11

    .line 410
    iget-object v12, v10, Ll/᩵ۘۘ;->֨:[[I

    sget-object v15, Ll/ۚۘۘ;->ۡ:[I

    aput-object v15, v12, v11

    .line 189
    aget v0, v0, v11

    aget-object v12, v13, v11

    .line 94
    iput v11, v14, Ll/֡ۘۘ;->ۡ:I

    int-to-byte v0, v0

    .line 95
    iput-byte v0, v14, Ll/֡ۘۘ;->ܳ:B

    const/4 v0, 0x5

    int-to-byte v0, v0

    .line 96
    iput-byte v0, v14, Ll/֡ۘۘ;->֫:B

    .line 97
    iput-object v12, v14, Ll/֡ۘۘ;->᩷:[I

    .line 98
    iput v11, v14, Ll/֡ۘۘ;->ۢ:I

    .line 99
    iput-object v15, v14, Ll/֡ۘۘ;->ܽ:[I

    .line 100
    iput v11, v14, Ll/֡ۘۘ;->ᩳ:I

    const/4 v0, 0x0

    .line 101
    iput-object v0, v14, Ll/֡ۘۘ;->ۘ:[I

    ushr-int/lit8 v5, v5, 0x3

    add-int/lit8 v6, v6, -0x3

    const/4 v0, 0x6

    .line 196
    iput v0, v10, Ll/᩵ۘۘ;->ᩴ:I

    goto :goto_1f

    :cond_35
    ushr-int/lit8 v0, v5, 0x3

    add-int/lit8 v6, v6, -0x3

    and-int/lit8 v5, v6, 0x7

    ushr-int/2addr v0, v5

    sub-int/2addr v6, v5

    const/4 v5, 0x1

    .line 185
    iput v5, v10, Ll/᩵ۘۘ;->ᩴ:I

    move v5, v0

    :goto_1f
    move-object/from16 v0, p0

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method
