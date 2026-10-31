.class public final Ll/֫᩵ۧ;
.super Ljava/lang/Object;
.source "F8V3"

# interfaces
.implements Ll/ۢᩴۧ;


# static fields
.field public static final ۜ:[B

.field public static final ۢ:[B

.field public static final ᩷:[B


# instance fields
.field public ֫:Landroid/graphics/Bitmap;

.field public final ۧ:Landroid/graphics/Canvas;

.field public final ܳ:Landroid/graphics/Paint;

.field public final ܽ:Ll/۬ᩴۧ;

.field public final ܿ:Landroid/graphics/Paint;

.field public final ᩳ:Ll/۫ᩴۧ;

.field public final ᩻:Ll/۟ᩴۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 89
    fill-array-data v1, :array_0

    sput-object v1, Ll/֫᩵ۧ;->ۜ:[B

    new-array v0, v0, [B

    .line 90
    fill-array-data v0, :array_1

    sput-object v0, Ll/֫᩵ۧ;->᩷:[B

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 91
    fill-array-data v0, :array_2

    sput-object v0, Ll/֫᩵ۧ;->ۢ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x7t
        0x8t
        0xft
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x77t
        -0x78t
        -0x1t
    .end array-data

    :array_2
    .array-data 1
        0x0t
        0x11t
        0x22t
        0x33t
        0x44t
        0x55t
        0x66t
        0x77t
        -0x78t
        -0x67t
        -0x56t
        -0x45t
        -0x34t
        -0x23t
        -0x12t
        -0x1t
    .end array-data
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 10

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance v0, Ll/ᩳ֨֫;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-direct {v0, p1}, Ll/ᩳ֨֫;-><init>([B)V

    .line 115
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۗ()I

    move-result p1

    .line 116
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    .line 117
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Ll/֫᩵ۧ;->ܿ:Landroid/graphics/Paint;

    .line 118
    sget-object v3, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 119
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/4 v3, 0x0

    .line 120
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 121
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Ll/֫᩵ۧ;->ܳ:Landroid/graphics/Paint;

    .line 122
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 123
    new-instance v4, Landroid/graphics/PorterDuffXfermode;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 124
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 125
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2}, Landroid/graphics/Canvas;-><init>()V

    iput-object v2, p0, Ll/֫᩵ۧ;->ۧ:Landroid/graphics/Canvas;

    .line 126
    new-instance v2, Ll/۫ᩴۧ;

    const/4 v8, 0x0

    const/16 v9, 0x23f

    const/16 v4, 0x2cf

    const/16 v5, 0x23f

    const/4 v6, 0x0

    const/16 v7, 0x2cf

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Ll/۫ᩴۧ;-><init>(IIIIII)V

    iput-object v2, p0, Ll/֫᩵ۧ;->ᩳ:Ll/۫ᩴۧ;

    .line 127
    new-instance v2, Ll/۬ᩴۧ;

    const/high16 v3, -0x1000000

    const v4, -0x808081

    const/4 v5, -0x1

    .line 584
    filled-new-array {v1, v5, v3, v4}, [I

    move-result-object v3

    .line 131
    invoke-static {}, Ll/֫᩵ۧ;->֫()[I

    move-result-object v4

    .line 132
    invoke-static {}, Ll/֫᩵ۧ;->ۧ()[I

    move-result-object v5

    invoke-direct {v2, v1, v3, v4, v5}, Ll/۬ᩴۧ;-><init>(I[I[I[I)V

    iput-object v2, p0, Ll/֫᩵ۧ;->ܽ:Ll/۬ᩴۧ;

    .line 133
    new-instance v1, Ll/۟ᩴۧ;

    invoke-direct {v1, p1, v0}, Ll/۟ᩴۧ;-><init>(II)V

    iput-object v1, p0, Ll/֫᩵ۧ;->᩻:Ll/۟ᩴۧ;

    return-void
.end method

.method public static ֫(IIII)I
    .locals 0

    shl-int/lit8 p0, p0, 0x18

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x8

    or-int/2addr p0, p1

    or-int/2addr p0, p3

    return p0
.end method

.method public static ֫(Ll/ܽ֨֫;)Ll/ۤᩴۧ;
    .locals 6

    const/16 v0, 0x10

    .line 548
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    const/4 v2, 0x4

    .line 549
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v2, 0x2

    .line 550
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 551
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v3

    const/4 v4, 0x1

    .line 552
    invoke-virtual {p0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    .line 554
    sget-object v5, Ll/ۘ֨֫;->ܿ:[B

    if-ne v2, v4, :cond_0

    const/16 v0, 0x8

    .line 558
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x10

    .line 560
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_0

    :cond_0
    if-nez v2, :cond_2

    .line 562
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 563
    invoke-virtual {p0, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    if-lez v2, :cond_1

    .line 565
    new-array v5, v2, [B

    .line 566
    invoke-virtual {p0, v2, v5}, Ll/ܽ֨֫;->ۧ(I[B)V

    :cond_1
    if-lez v0, :cond_2

    .line 569
    new-array v2, v0, [B

    .line 570
    invoke-virtual {p0, v0, v2}, Ll/ܽ֨֫;->ۧ(I[B)V

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, v5

    .line 576
    :goto_1
    new-instance p0, Ll/ۤᩴۧ;

    invoke-direct {p0, v5, v2, v1, v3}, Ll/ۤᩴۧ;-><init>([B[BIZ)V

    return-object p0
.end method

.method public static ֫(Ll/ܽ֨֫;I)Ll/۬ᩴۧ;
    .locals 23

    move-object/from16 v0, p0

    const/16 v1, 0x8

    .line 481
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 482
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v3, 0x2

    add-int/lit8 v4, p1, -0x2

    const/high16 v5, -0x1000000

    const v6, -0x808081

    const/4 v7, 0x0

    const/4 v8, -0x1

    .line 584
    filled-new-array {v7, v8, v5, v6}, [I

    move-result-object v5

    .line 486
    invoke-static {}, Ll/֫᩵ۧ;->֫()[I

    move-result-object v6

    .line 487
    invoke-static {}, Ll/֫᩵ۧ;->ۧ()[I

    move-result-object v7

    :goto_0
    if-lez v4, :cond_4

    .line 490
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    .line 491
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    and-int/lit16 v10, v9, 0x80

    if-eqz v10, :cond_0

    move-object v10, v5

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v9, 0x40

    if-eqz v10, :cond_1

    move-object v10, v6

    goto :goto_1

    :cond_1
    move-object v10, v7

    :goto_1
    and-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_2

    .line 508
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 509
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 510
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    .line 511
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    add-int/lit8 v4, v4, -0x6

    goto :goto_2

    :cond_2
    const/4 v1, 0x6

    .line 514
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    shl-int/2addr v1, v3

    const/4 v9, 0x4

    .line 515
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    shl-int/2addr v11, v9

    .line 516
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    shl-int/lit8 v9, v9, 0x4

    .line 517
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    shl-int/lit8 v3, v3, 0x6

    add-int/lit8 v4, v4, -0x4

    move/from16 v21, v3

    move v3, v1

    move/from16 v1, v21

    move/from16 v22, v11

    move v11, v9

    move/from16 v9, v22

    :goto_2
    const/16 v12, 0xff

    if-nez v3, :cond_3

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/16 v1, 0xff

    :cond_3
    and-int/2addr v1, v12

    rsub-int v1, v1, 0xff

    int-to-byte v1, v1

    int-to-double v13, v3

    add-int/lit8 v9, v9, -0x80

    move-wide v15, v13

    int-to-double v12, v9

    const-wide v17, 0x3ff66e978d4fdf3bL    # 1.402

    mul-double v17, v17, v12

    move v9, v4

    add-double v3, v17, v15

    double-to-int v3, v3

    add-int/lit8 v11, v11, -0x80

    move-object v14, v5

    int-to-double v4, v11

    const-wide v17, 0x3fd60663c74fb54aL    # 0.34414

    mul-double v17, v17, v4

    sub-double v17, v15, v17

    const-wide v19, 0x3fe6da3c21187e7cL    # 0.71414

    mul-double v12, v12, v19

    sub-double v11, v17, v12

    double-to-int v11, v11

    const-wide v12, 0x3ffc5a1cac083127L    # 1.772

    mul-double v4, v4, v12

    add-double/2addr v4, v15

    double-to-int v4, v4

    const/4 v5, 0x0

    const/16 v12, 0xff

    .line 534
    invoke-static {v3, v5, v12}, Ll/ۘ֨֫;->֫(III)I

    move-result v3

    .line 535
    invoke-static {v11, v5, v12}, Ll/ۘ֨֫;->֫(III)I

    move-result v11

    .line 536
    invoke-static {v4, v5, v12}, Ll/ۘ֨֫;->֫(III)I

    move-result v4

    .line 532
    invoke-static {v1, v3, v11, v4}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v1

    aput v1, v10, v8

    const/16 v1, 0x8

    const/4 v3, 0x2

    move v4, v9

    move-object v5, v14

    goto/16 :goto_0

    :cond_4
    move-object v14, v5

    .line 539
    new-instance v0, Ll/۬ᩴۧ;

    move-object v1, v14

    invoke-direct {v0, v2, v1, v6, v7}, Ll/۬ᩴۧ;-><init>(I[I[I[I)V

    return-object v0
.end method

.method public static ֫([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v8, p5

    .line 712
    new-instance v9, Ll/ܽ֨֫;

    .line 48
    array-length v2, v0

    invoke-direct {v9, v0, v2}, Ll/ܽ֨֫;-><init>([BI)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v10, v0

    move-object v11, v2

    move-object v12, v3

    move/from16 v2, p3

    move/from16 v0, p4

    .line 719
    :goto_0
    invoke-virtual {v9}, Ll/ܽ֨֫;->֫()I

    move-result v3

    if-eqz v3, :cond_21

    const/16 v13, 0x8

    .line 720
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    const/16 v4, 0xf0

    if-eq v3, v4, :cond_20

    const/4 v14, 0x1

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x4

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    goto :goto_0

    :pswitch_0
    const/4 v3, 0x0

    move v14, v2

    .line 896
    :goto_1
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    move v15, v3

    const/16 v16, 0x1

    goto :goto_3

    .line 901
    :cond_0
    invoke-virtual {v9}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    const/4 v4, 0x7

    if-nez v2, :cond_2

    .line 902
    invoke-virtual {v9, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    const/4 v2, 0x0

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    goto :goto_3

    .line 910
    :cond_2
    invoke-virtual {v9, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    .line 911
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    :goto_2
    move v15, v3

    move/from16 v16, v4

    :goto_3
    if-eqz v16, :cond_3

    if-eqz v8, :cond_3

    .line 916
    aget v2, p1, v2

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v14

    int-to-float v4, v0

    add-int v2, v14, v16

    int-to-float v5, v2

    add-int/lit8 v2, v0, 0x1

    int-to-float v6, v2

    move-object/from16 v2, p6

    move-object/from16 v7, p5

    .line 917
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_3
    add-int v14, v14, v16

    if-eqz v15, :cond_4

    move v2, v14

    goto :goto_0

    :cond_4
    move v3, v15

    goto :goto_1

    :pswitch_1
    if-ne v1, v4, :cond_6

    if-nez v11, :cond_5

    .line 739
    sget-object v3, Ll/֫᩵ۧ;->ۢ:[B

    goto :goto_4

    :cond_5
    move-object v3, v11

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    :goto_4
    move-object v15, v3

    const/4 v3, 0x0

    move v13, v2

    const/16 v2, 0x8

    .line 838
    :goto_5
    invoke-virtual {v9, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v7

    if-eqz v7, :cond_7

    const/4 v2, 0x1

    move/from16 v17, v3

    const/16 v16, 0x1

    goto :goto_a

    .line 842
    :cond_7
    invoke-virtual {v9}, Ll/ܽ֨֫;->ܿ()Z

    move-result v7

    if-nez v7, :cond_9

    .line 843
    invoke-virtual {v9, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-eqz v2, :cond_8

    add-int/lit8 v2, v2, 0x2

    goto :goto_9

    :cond_8
    const/4 v2, 0x1

    const/4 v3, 0x1

    goto :goto_7

    .line 850
    :cond_9
    invoke-virtual {v9}, Ll/ܽ֨֫;->ܿ()Z

    move-result v7

    if-nez v7, :cond_a

    .line 851
    invoke-virtual {v9, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    .line 852
    invoke-virtual {v9, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    :goto_6
    move v7, v4

    goto :goto_8

    .line 854
    :cond_a
    invoke-virtual {v9, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v7

    if-eqz v7, :cond_e

    if-eq v7, v14, :cond_d

    if-eq v7, v5, :cond_c

    if-eq v7, v4, :cond_b

    :goto_7
    const/4 v2, 0x0

    goto :goto_9

    .line 866
    :cond_b
    invoke-virtual {v9, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x19

    .line 867
    invoke-virtual {v9, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    goto :goto_6

    .line 862
    :cond_c
    invoke-virtual {v9, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x9

    .line 863
    invoke-virtual {v9, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    goto :goto_6

    :goto_8
    move/from16 v16, v2

    move/from16 v17, v3

    goto :goto_a

    :cond_d
    const/4 v2, 0x2

    goto :goto_9

    :cond_e
    const/4 v2, 0x1

    :goto_9
    const/4 v7, 0x0

    goto :goto_8

    :goto_a
    if-eqz v16, :cond_10

    if-eqz v8, :cond_10

    if-eqz v15, :cond_f

    .line 873
    aget-byte v7, v15, v7

    :cond_f
    aget v2, p1, v7

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v13

    int-to-float v4, v0

    add-int v2, v13, v16

    int-to-float v5, v2

    add-int/lit8 v2, v0, 0x1

    int-to-float v6, v2

    move-object/from16 v2, p6

    move-object/from16 v7, p5

    .line 874
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_10
    add-int v13, v13, v16

    if-eqz v17, :cond_11

    .line 746
    invoke-virtual {v9}, Ll/ܽ֨֫;->ۧ()V

    move v2, v13

    goto/16 :goto_0

    :cond_11
    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x4

    const/16 v2, 0x8

    move/from16 v3, v17

    goto/16 :goto_5

    :pswitch_2
    const/4 v15, 0x3

    const/4 v13, 0x2

    if-ne v1, v15, :cond_13

    if-nez v10, :cond_12

    .line 725
    sget-object v3, Ll/֫᩵ۧ;->᩷:[B

    goto :goto_b

    :cond_12
    move-object/from16 v16, v10

    goto :goto_c

    :cond_13
    if-ne v1, v13, :cond_15

    if-nez v12, :cond_14

    .line 727
    sget-object v3, Ll/֫᩵ۧ;->ۜ:[B

    goto :goto_b

    :cond_14
    move-object/from16 v16, v12

    goto :goto_c

    :cond_15
    const/4 v3, 0x0

    :goto_b
    move-object/from16 v16, v3

    :goto_c
    const/4 v3, 0x0

    move v7, v2

    .line 786
    :goto_d
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_e

    .line 790
    :cond_16
    invoke-virtual {v9}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_17

    .line 791
    invoke-virtual {v9, v15}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    .line 792
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    goto :goto_f

    .line 793
    :cond_17
    invoke-virtual {v9}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_18

    const/4 v2, 0x0

    :goto_e
    const/4 v4, 0x1

    move/from16 v17, v3

    const/16 v18, 0x1

    goto :goto_11

    .line 796
    :cond_18
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-eqz v2, :cond_1c

    if-eq v2, v14, :cond_1b

    if-eq v2, v13, :cond_1a

    if-eq v2, v15, :cond_19

    const/4 v2, 0x0

    goto :goto_10

    :cond_19
    const/16 v2, 0x8

    .line 808
    invoke-virtual {v9, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1d

    .line 809
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    :goto_f
    move/from16 v18, v2

    move/from16 v17, v3

    move v2, v4

    goto :goto_11

    :cond_1a
    const/4 v2, 0x4

    .line 804
    invoke-virtual {v9, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    add-int/lit8 v4, v2, 0xc

    .line 805
    invoke-virtual {v9, v13}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    move/from16 v17, v3

    move/from16 v18, v4

    goto :goto_11

    :cond_1b
    const/4 v2, 0x0

    const/4 v4, 0x2

    move/from16 v17, v3

    const/16 v18, 0x2

    goto :goto_11

    :cond_1c
    const/4 v2, 0x0

    const/4 v3, 0x1

    :goto_10
    const/4 v4, 0x0

    move/from16 v17, v3

    const/16 v18, 0x0

    :goto_11
    if-eqz v18, :cond_1e

    if-eqz v8, :cond_1e

    if-eqz v16, :cond_1d

    .line 815
    aget-byte v2, v16, v2

    :cond_1d
    aget v2, p1, v2

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v7

    int-to-float v4, v0

    add-int v2, v7, v18

    int-to-float v5, v2

    add-int/lit8 v2, v0, 0x1

    int-to-float v6, v2

    move-object/from16 v2, p6

    move/from16 v19, v7

    move-object/from16 v7, p5

    .line 816
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_12

    :cond_1e
    move/from16 v19, v7

    :goto_12
    add-int v7, v19, v18

    if-eqz v17, :cond_1f

    .line 734
    invoke-virtual {v9}, Ll/ܽ֨֫;->ۧ()V

    move v2, v7

    goto/16 :goto_0

    :cond_1f
    move/from16 v3, v17

    goto/16 :goto_d

    :pswitch_3
    const/16 v3, 0x10

    .line 760
    invoke-static {v3, v13, v9}, Ll/֫᩵ۧ;->֫(IILl/ܽ֨֫;)[B

    move-result-object v3

    move-object v11, v3

    goto/16 :goto_0

    .line 757
    :pswitch_4
    invoke-static {v6, v13, v9}, Ll/֫᩵ۧ;->֫(IILl/ܽ֨֫;)[B

    move-result-object v3

    move-object v10, v3

    goto/16 :goto_0

    .line 754
    :pswitch_5
    invoke-static {v6, v6, v9}, Ll/֫᩵ۧ;->֫(IILl/ܽ֨֫;)[B

    move-result-object v3

    move-object v12, v3

    goto/16 :goto_0

    :cond_20
    add-int/lit8 v0, v0, 0x2

    move/from16 v2, p3

    goto/16 :goto_0

    :cond_21
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public static ֫(IILl/ܽ֨֫;)[B
    .locals 3

    .line 926
    new-array v0, p0, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    .line 928
    invoke-virtual {p2, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫()[I
    .locals 8

    const/16 v0, 0x10

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v0, :cond_7

    const/16 v3, 0x8

    const/16 v4, 0xff

    if-ge v2, v3, :cond_3

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    const/16 v3, 0xff

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_1

    const/16 v5, 0xff

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    and-int/lit8 v6, v2, 0x4

    if-eqz v6, :cond_2

    const/16 v6, 0xff

    goto :goto_3

    :cond_2
    const/4 v6, 0x0

    .line 594
    :goto_3
    invoke-static {v4, v3, v5, v6}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v3

    aput v3, v1, v2

    goto :goto_7

    :cond_3
    and-int/lit8 v3, v2, 0x1

    const/16 v5, 0x7f

    if-eqz v3, :cond_4

    const/16 v3, 0x7f

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    :goto_4
    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_5

    const/16 v6, 0x7f

    goto :goto_5

    :cond_5
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v7, v2, 0x4

    if-eqz v7, :cond_6

    goto :goto_6

    :cond_6
    const/4 v5, 0x0

    .line 601
    :goto_6
    invoke-static {v4, v3, v6, v5}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v3

    aput v3, v1, v2

    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    return-object v1
.end method

.method public static ۧ()[I
    .locals 10

    const/16 v0, 0x100

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    :goto_0
    if-ge v2, v0, :cond_20

    const/16 v3, 0x8

    const/16 v4, 0xff

    if-ge v2, v3, :cond_3

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    const/16 v3, 0xff

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_1

    const/16 v5, 0xff

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    and-int/lit8 v6, v2, 0x4

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    :goto_3
    const/16 v6, 0x3f

    .line 617
    invoke-static {v6, v3, v5, v4}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v3

    aput v3, v1, v2

    goto/16 :goto_1c

    :cond_3
    and-int/lit16 v5, v2, 0x88

    const/16 v6, 0xaa

    const/16 v7, 0x55

    if-eqz v5, :cond_19

    const/16 v8, 0x7f

    if-eq v5, v3, :cond_12

    const/16 v3, 0x80

    const/16 v6, 0x2b

    if-eq v5, v3, :cond_b

    const/16 v3, 0x88

    if-eq v5, v3, :cond_4

    goto/16 :goto_1c

    :cond_4
    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_5

    const/16 v3, 0x2b

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    and-int/lit8 v5, v2, 0x10

    if-eqz v5, :cond_6

    const/16 v5, 0x55

    goto :goto_5

    :cond_6
    const/4 v5, 0x0

    :goto_5
    add-int/2addr v3, v5

    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_7

    const/16 v5, 0x2b

    goto :goto_6

    :cond_7
    const/4 v5, 0x0

    :goto_6
    and-int/lit8 v8, v2, 0x20

    if-eqz v8, :cond_8

    const/16 v8, 0x55

    goto :goto_7

    :cond_8
    const/4 v8, 0x0

    :goto_7
    add-int/2addr v5, v8

    and-int/lit8 v8, v2, 0x4

    if-eqz v8, :cond_9

    goto :goto_8

    :cond_9
    const/4 v6, 0x0

    :goto_8
    and-int/lit8 v8, v2, 0x40

    if-eqz v8, :cond_a

    goto :goto_9

    :cond_a
    const/4 v7, 0x0

    :goto_9
    add-int/2addr v6, v7

    .line 650
    invoke-static {v4, v3, v5, v6}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v3

    aput v3, v1, v2

    goto/16 :goto_1c

    :cond_b
    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_c

    const/16 v3, 0x2b

    goto :goto_a

    :cond_c
    const/4 v3, 0x0

    :goto_a
    add-int/2addr v3, v8

    and-int/lit8 v5, v2, 0x10

    if-eqz v5, :cond_d

    const/16 v5, 0x55

    goto :goto_b

    :cond_d
    const/4 v5, 0x0

    :goto_b
    add-int/2addr v3, v5

    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_e

    const/16 v5, 0x2b

    goto :goto_c

    :cond_e
    const/4 v5, 0x0

    :goto_c
    add-int/2addr v5, v8

    and-int/lit8 v9, v2, 0x20

    if-eqz v9, :cond_f

    const/16 v9, 0x55

    goto :goto_d

    :cond_f
    const/4 v9, 0x0

    :goto_d
    add-int/2addr v5, v9

    and-int/lit8 v9, v2, 0x4

    if-eqz v9, :cond_10

    goto :goto_e

    :cond_10
    const/4 v6, 0x0

    :goto_e
    add-int/2addr v6, v8

    and-int/lit8 v8, v2, 0x40

    if-eqz v8, :cond_11

    goto :goto_f

    :cond_11
    const/4 v7, 0x0

    :goto_f
    add-int/2addr v6, v7

    .line 642
    invoke-static {v4, v3, v5, v6}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v3

    aput v3, v1, v2

    goto/16 :goto_1c

    :cond_12
    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_13

    const/16 v3, 0x55

    goto :goto_10

    :cond_13
    const/4 v3, 0x0

    :goto_10
    and-int/lit8 v4, v2, 0x10

    if-eqz v4, :cond_14

    const/16 v4, 0xaa

    goto :goto_11

    :cond_14
    const/4 v4, 0x0

    :goto_11
    add-int/2addr v3, v4

    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_15

    const/16 v4, 0x55

    goto :goto_12

    :cond_15
    const/4 v4, 0x0

    :goto_12
    and-int/lit8 v5, v2, 0x20

    if-eqz v5, :cond_16

    const/16 v5, 0xaa

    goto :goto_13

    :cond_16
    const/4 v5, 0x0

    :goto_13
    add-int/2addr v4, v5

    and-int/lit8 v5, v2, 0x4

    if-eqz v5, :cond_17

    goto :goto_14

    :cond_17
    const/4 v7, 0x0

    :goto_14
    and-int/lit8 v5, v2, 0x40

    if-eqz v5, :cond_18

    goto :goto_15

    :cond_18
    const/4 v6, 0x0

    :goto_15
    add-int/2addr v7, v6

    .line 634
    invoke-static {v8, v3, v4, v7}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v3

    aput v3, v1, v2

    goto :goto_1c

    :cond_19
    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_1a

    const/16 v3, 0x55

    goto :goto_16

    :cond_1a
    const/4 v3, 0x0

    :goto_16
    and-int/lit8 v5, v2, 0x10

    if-eqz v5, :cond_1b

    const/16 v5, 0xaa

    goto :goto_17

    :cond_1b
    const/4 v5, 0x0

    :goto_17
    add-int/2addr v3, v5

    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_1c

    const/16 v5, 0x55

    goto :goto_18

    :cond_1c
    const/4 v5, 0x0

    :goto_18
    and-int/lit8 v8, v2, 0x20

    if-eqz v8, :cond_1d

    const/16 v8, 0xaa

    goto :goto_19

    :cond_1d
    const/4 v8, 0x0

    :goto_19
    add-int/2addr v5, v8

    and-int/lit8 v8, v2, 0x4

    if-eqz v8, :cond_1e

    goto :goto_1a

    :cond_1e
    const/4 v7, 0x0

    :goto_1a
    and-int/lit8 v8, v2, 0x40

    if-eqz v8, :cond_1f

    goto :goto_1b

    :cond_1f
    const/4 v6, 0x0

    :goto_1b
    add-int/2addr v7, v6

    .line 626
    invoke-static {v4, v3, v5, v7}, Ll/֫᩵ۧ;->֫(IIII)I

    move-result v3

    aput v3, v1, v2

    :goto_1c
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_20
    return-object v1
.end method


# virtual methods
.method public final reset()V
    .locals 2

    .line 961
    iget-object v0, p0, Ll/֫᩵ۧ;->᩻:Ll/۟ᩴۧ;

    iget-object v1, v0, Ll/۟ᩴۧ;->ۜ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 962
    iget-object v1, v0, Ll/۟ᩴۧ;->ᩳ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 963
    iget-object v1, v0, Ll/۟ᩴۧ;->ܳ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 964
    iget-object v1, v0, Ll/۟ᩴۧ;->֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 965
    iget-object v1, v0, Ll/۟ᩴۧ;->ۧ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    const/4 v1, 0x0

    .line 966
    iput-object v1, v0, Ll/۟ᩴۧ;->ܿ:Ll/۫ᩴۧ;

    .line 967
    iput-object v1, v0, Ll/۟ᩴۧ;->᩻:Ll/ۛᩴۧ;

    return-void
.end method

.method public final synthetic ֫(II[B)Ll/ܰۘۧ;
    .locals 0

    .line 0
    invoke-static {p0, p3, p2}, Ll/ܳᩴۧ;->֫(Ll/ۢᩴۧ;[BI)Ll/ܰۘۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 153
    new-instance v2, Ll/ܽ֨֫;

    add-int v3, v1, p3

    move-object/from16 v4, p1

    invoke-direct {v2, v4, v3}, Ll/ܽ֨֫;-><init>([BI)V

    .line 154
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 160
    :goto_0
    invoke-virtual {v2}, Ll/ܽ֨֫;->֫()I

    move-result v1

    const/16 v3, 0x30

    const/4 v4, 0x3

    const/4 v5, 0x2

    iget-object v6, v0, Ll/֫᩵ۧ;->᩻:Ll/۟ᩴۧ;

    const/4 v7, 0x1

    if-lt v1, v3, :cond_b

    const/16 v1, 0x8

    .line 161
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    const/16 v8, 0xf

    if-ne v3, v8, :cond_b

    .line 291
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    const/16 v8, 0x10

    .line 292
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 293
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 294
    invoke-virtual {v2}, Ll/ܽ֨֫;->ܽ()I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v12, v10, 0x8

    .line 296
    invoke-virtual {v2}, Ll/ܽ֨֫;->֫()I

    move-result v13

    if-le v12, v13, :cond_0

    const-string v1, "Data field length exceeds limit"

    .line 297
    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 299
    invoke-virtual {v2}, Ll/ܽ֨֫;->֫()I

    move-result v1

    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_0

    :cond_0
    const/4 v12, 0x4

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_7

    .line 305
    :pswitch_0
    iget v1, v6, Ll/۟ᩴۧ;->᩷:I

    if-ne v9, v1, :cond_a

    .line 366
    invoke-virtual {v2, v12}, Ll/ܽ֨֫;->ܿ(I)V

    .line 367
    invoke-virtual {v2}, Ll/ܽ֨֫;->ܿ()Z

    move-result v1

    .line 368
    invoke-virtual {v2, v4}, Ll/ܽ֨֫;->ܿ(I)V

    .line 369
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v13

    .line 370
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v14

    if-eqz v1, :cond_1

    .line 377
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 378
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 379
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    .line 380
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    move v15, v1

    move/from16 v16, v3

    move/from16 v17, v4

    move/from16 v18, v5

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    const/4 v3, 0x0

    move/from16 v16, v13

    move/from16 v18, v14

    const/4 v15, 0x0

    const/16 v17, 0x0

    .line 388
    :goto_1
    new-instance v1, Ll/۫ᩴۧ;

    move-object v12, v1

    invoke-direct/range {v12 .. v18}, Ll/۫ᩴۧ;-><init>(IIIIII)V

    .line 306
    iput-object v1, v6, Ll/۟ᩴۧ;->ܿ:Ll/۫ᩴۧ;

    goto/16 :goto_7

    .line 347
    :pswitch_1
    iget v1, v6, Ll/۟ᩴۧ;->᩷:I

    if-ne v9, v1, :cond_2

    .line 348
    invoke-static {v2}, Ll/֫᩵ۧ;->֫(Ll/ܽ֨֫;)Ll/ۤᩴۧ;

    move-result-object v1

    .line 349
    iget-object v3, v6, Ll/۟ᩴۧ;->ܳ:Landroid/util/SparseArray;

    iget v4, v1, Ll/ۤᩴۧ;->ۧ:I

    invoke-virtual {v3, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    .line 350
    :cond_2
    iget v1, v6, Ll/۟ᩴۧ;->ܽ:I

    if-ne v9, v1, :cond_a

    .line 351
    invoke-static {v2}, Ll/֫᩵ۧ;->֫(Ll/ܽ֨֫;)Ll/ۤᩴۧ;

    move-result-object v1

    .line 352
    iget-object v3, v6, Ll/۟ᩴۧ;->ۧ:Landroid/util/SparseArray;

    iget v4, v1, Ll/ۤᩴۧ;->ۧ:I

    invoke-virtual {v3, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    .line 338
    :pswitch_2
    iget v1, v6, Ll/۟ᩴۧ;->᩷:I

    if-ne v9, v1, :cond_3

    .line 339
    invoke-static {v2, v10}, Ll/֫᩵ۧ;->֫(Ll/ܽ֨֫;I)Ll/۬ᩴۧ;

    move-result-object v1

    .line 340
    iget-object v3, v6, Ll/۟ᩴۧ;->ᩳ:Landroid/util/SparseArray;

    iget v4, v1, Ll/۬ᩴۧ;->ᩳ:I

    invoke-virtual {v3, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    .line 341
    :cond_3
    iget v1, v6, Ll/۟ᩴۧ;->ܽ:I

    if-ne v9, v1, :cond_a

    .line 342
    invoke-static {v2, v10}, Ll/֫᩵ۧ;->֫(Ll/ܽ֨֫;I)Ll/۬ᩴۧ;

    move-result-object v1

    .line 343
    iget-object v3, v6, Ll/۟ᩴۧ;->֫:Landroid/util/SparseArray;

    iget v4, v1, Ll/۬ᩴۧ;->ᩳ:I

    invoke-virtual {v3, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    .line 324
    :pswitch_3
    iget-object v3, v6, Ll/۟ᩴۧ;->᩻:Ll/ۛᩴۧ;

    iget-object v13, v6, Ll/۟ᩴۧ;->ۜ:Landroid/util/SparseArray;

    .line 325
    iget v6, v6, Ll/۟ᩴۧ;->᩷:I

    if-ne v9, v6, :cond_a

    if-eqz v3, :cond_a

    .line 420
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    .line 421
    invoke-virtual {v2, v12}, Ll/ܽ֨֫;->ܿ(I)V

    .line 422
    invoke-virtual {v2}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    .line 423
    invoke-virtual {v2, v4}, Ll/ܽ֨֫;->ܿ(I)V

    .line 424
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v17

    .line 425
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v18

    .line 426
    invoke-virtual {v2, v4}, Ll/ܽ֨֫;->ۧ(I)I

    .line 427
    invoke-virtual {v2, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v19

    .line 428
    invoke-virtual {v2, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 429
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v20

    .line 430
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v21

    .line 431
    invoke-virtual {v2, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v22

    .line 432
    invoke-virtual {v2, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v23

    .line 433
    invoke-virtual {v2, v5}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v10, v10, -0xa

    .line 436
    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    :goto_2
    if-lez v10, :cond_6

    .line 438
    invoke-virtual {v2, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 439
    invoke-virtual {v2, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v14

    .line 440
    invoke-virtual {v2, v5}, Ll/ܽ֨֫;->ۧ(I)I

    const/16 v15, 0xc

    .line 441
    invoke-virtual {v2, v15}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    .line 442
    invoke-virtual {v2, v12}, Ll/ܽ֨֫;->ܿ(I)V

    .line 443
    invoke-virtual {v2, v15}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v15

    add-int/lit8 v24, v10, -0x6

    if-eq v14, v7, :cond_5

    if-ne v14, v5, :cond_4

    goto :goto_3

    :cond_4
    move/from16 v10, v24

    goto :goto_4

    .line 449
    :cond_5
    :goto_3
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    .line 450
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    add-int/lit8 v10, v10, -0x8

    .line 454
    :goto_4
    new-instance v14, Ll/ܰᩴۧ;

    invoke-direct {v14, v8, v15}, Ll/ܰᩴۧ;-><init>(II)V

    invoke-virtual {v4, v9, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v8, 0x10

    goto :goto_2

    .line 465
    :cond_6
    new-instance v1, Ll/᩺ᩴۧ;

    move-object v14, v1

    move v15, v6

    move-object/from16 v24, v4

    invoke-direct/range {v14 .. v24}, Ll/᩺ᩴۧ;-><init>(IZIIIIIIILandroid/util/SparseArray;)V

    .line 327
    iget v3, v3, Ll/ۛᩴۧ;->ۧ:I

    if-nez v3, :cond_7

    .line 329
    invoke-virtual {v13, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ᩴۧ;

    if-eqz v3, :cond_7

    .line 1084
    iget-object v3, v3, Ll/᩺ᩴۧ;->᩷:Landroid/util/SparseArray;

    const/4 v4, 0x0

    .line 1085
    :goto_5
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_7

    .line 1086
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰᩴۧ;

    iget-object v7, v1, Ll/᩺ᩴۧ;->᩷:Landroid/util/SparseArray;

    invoke-virtual {v7, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 334
    :cond_7
    iget v3, v1, Ll/᩺ᩴۧ;->ܿ:I

    invoke-virtual {v13, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_7

    .line 310
    :pswitch_4
    iget v3, v6, Ll/۟ᩴۧ;->᩷:I

    if-ne v9, v3, :cond_a

    .line 311
    iget-object v3, v6, Ll/۟ᩴۧ;->᩻:Ll/ۛᩴۧ;

    .line 399
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    .line 400
    invoke-virtual {v2, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    .line 401
    invoke-virtual {v2, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v7

    .line 402
    invoke-virtual {v2, v5}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v10, v10, -0x2

    .line 405
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    :goto_6
    if-lez v10, :cond_8

    .line 407
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    .line 408
    invoke-virtual {v2, v1}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v9, 0x10

    .line 409
    invoke-virtual {v2, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    .line 410
    invoke-virtual {v2, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v13

    add-int/lit8 v10, v10, -0x6

    .line 412
    new-instance v14, Ll/ۨᩴۧ;

    invoke-direct {v14, v12, v13}, Ll/ۨᩴۧ;-><init>(II)V

    invoke-virtual {v5, v8, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_6

    .line 415
    :cond_8
    new-instance v1, Ll/ۛᩴۧ;

    invoke-direct {v1, v4, v7, v5}, Ll/ۛᩴۧ;-><init>(IILandroid/util/SparseArray;)V

    if-eqz v7, :cond_9

    .line 314
    iput-object v1, v6, Ll/۟ᩴۧ;->᩻:Ll/ۛᩴۧ;

    .line 315
    iget-object v1, v6, Ll/۟ᩴۧ;->ۜ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 316
    iget-object v1, v6, Ll/۟ᩴۧ;->ᩳ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 317
    iget-object v1, v6, Ll/۟ᩴۧ;->ܳ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    goto :goto_7

    :cond_9
    if-eqz v3, :cond_a

    .line 318
    iget v3, v3, Ll/ۛᩴۧ;->ܽ:I

    if-eq v3, v4, :cond_a

    .line 319
    iput-object v1, v6, Ll/۟ᩴۧ;->᩻:Ll/ۛᩴۧ;

    .line 361
    :cond_a
    :goto_7
    invoke-virtual {v2}, Ll/ܽ֨֫;->ܽ()I

    move-result v1

    sub-int/2addr v11, v1

    invoke-virtual {v2, v11}, Ll/ܽ֨֫;->ܳ(I)V

    goto/16 :goto_0

    .line 165
    :cond_b
    iget-object v1, v6, Ll/۟ᩴۧ;->᩻:Ll/ۛᩴۧ;

    if-nez v1, :cond_c

    .line 167
    new-instance v1, Ll/۬ۘۧ;

    .line 168
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v13

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    goto/16 :goto_10

    .line 173
    :cond_c
    iget-object v2, v6, Ll/۟ᩴۧ;->ܿ:Ll/۫ᩴۧ;

    if-eqz v2, :cond_d

    goto :goto_8

    .line 175
    :cond_d
    iget-object v2, v0, Ll/֫᩵ۧ;->ᩳ:Ll/۫ᩴۧ;

    .line 176
    :goto_8
    iget-object v3, v0, Ll/֫᩵ۧ;->֫:Landroid/graphics/Bitmap;

    iget-object v4, v0, Ll/֫᩵ۧ;->ۧ:Landroid/graphics/Canvas;

    if-eqz v3, :cond_e

    iget v5, v2, Ll/۫ᩴۧ;->ܳ:I

    add-int/2addr v5, v7

    .line 177
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-ne v5, v3, :cond_e

    iget v3, v2, Ll/۫ᩴۧ;->֫:I

    add-int/2addr v3, v7

    iget-object v5, v0, Ll/֫᩵ۧ;->֫:Landroid/graphics/Bitmap;

    .line 178
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    if-eq v3, v5, :cond_f

    .line 179
    :cond_e
    iget v3, v2, Ll/۫ᩴۧ;->ܳ:I

    add-int/2addr v3, v7

    iget v5, v2, Ll/۫ᩴۧ;->֫:I

    add-int/2addr v5, v7

    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 180
    invoke-static {v3, v5, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, v0, Ll/֫᩵ۧ;->֫:Landroid/graphics/Bitmap;

    .line 182
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 186
    :cond_f
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 187
    iget-object v1, v1, Ll/ۛᩴۧ;->֫:Landroid/util/SparseArray;

    const/4 v5, 0x0

    .line 188
    :goto_9
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v5, v7, :cond_1a

    .line 190
    invoke-virtual {v4}, Landroid/graphics/Canvas;->save()I

    .line 191
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۨᩴۧ;

    .line 192
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v8

    .line 193
    iget-object v9, v6, Ll/۟ᩴۧ;->ۜ:Landroid/util/SparseArray;

    invoke-virtual {v9, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Ll/᩺ᩴۧ;

    .line 196
    iget v8, v7, Ll/ۨᩴۧ;->֫:I

    iget v9, v2, Ll/۫ᩴۧ;->ܽ:I

    iget v14, v2, Ll/۫ᩴۧ;->֫:I

    iget v13, v2, Ll/۫ᩴۧ;->ܳ:I

    add-int v12, v8, v9

    .line 198
    iget v7, v7, Ll/ۨᩴۧ;->ۧ:I

    iget v8, v2, Ll/۫ᩴۧ;->ܿ:I

    add-int/2addr v7, v8

    .line 200
    iget v11, v15, Ll/᩺ᩴۧ;->ۢ:I

    iget v8, v15, Ll/᩺ᩴۧ;->֫:I

    iget v10, v15, Ll/᩺ᩴۧ;->ᩳ:I

    add-int v9, v12, v11

    move-object/from16 v16, v1

    iget v1, v2, Ll/۫ᩴۧ;->ۧ:I

    .line 201
    invoke-static {v9, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    move/from16 v17, v5

    add-int v5, v7, v10

    move/from16 p1, v9

    .line 204
    iget v9, v2, Ll/۫ᩴۧ;->ᩳ:I

    .line 205
    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 208
    invoke-virtual {v4, v12, v7, v1, v9}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 209
    iget-object v1, v6, Ll/۟ᩴۧ;->ᩳ:Landroid/util/SparseArray;

    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ᩴۧ;

    if-nez v1, :cond_10

    .line 211
    iget-object v1, v6, Ll/۟ᩴۧ;->֫:Landroid/util/SparseArray;

    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ᩴۧ;

    if-nez v1, :cond_10

    .line 213
    iget-object v1, v0, Ll/֫᩵ۧ;->ܽ:Ll/۬ᩴۧ;

    .line 217
    :cond_10
    iget-object v9, v15, Ll/᩺ᩴۧ;->᩷:Landroid/util/SparseArray;

    const/4 v8, 0x0

    move-object/from16 v18, v2

    .line 218
    :goto_a
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v8, v2, :cond_16

    .line 219
    invoke-virtual {v9, v8}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 220
    invoke-virtual {v9, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v20, v8

    move-object/from16 v8, v19

    check-cast v8, Ll/ܰᩴۧ;

    move-object/from16 v19, v9

    .line 221
    iget-object v9, v6, Ll/۟ᩴۧ;->ܳ:Landroid/util/SparseArray;

    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۤᩴۧ;

    if-nez v9, :cond_11

    .line 223
    iget-object v9, v6, Ll/۟ᩴۧ;->ۧ:Landroid/util/SparseArray;

    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ll/ۤᩴۧ;

    :cond_11
    move-object v2, v9

    if-eqz v2, :cond_15

    .line 226
    iget-boolean v9, v2, Ll/ۤᩴۧ;->ܽ:Z

    if-eqz v9, :cond_12

    const/4 v9, 0x0

    goto :goto_b

    :cond_12
    iget-object v9, v0, Ll/֫᩵ۧ;->ܿ:Landroid/graphics/Paint;

    :goto_b
    move-object/from16 v21, v9

    .line 227
    iget v9, v15, Ll/᩺ᩴۧ;->ۧ:I

    move-object/from16 v22, v6

    iget v6, v8, Ll/ܰᩴۧ;->֫:I

    add-int/2addr v6, v12

    iget v8, v8, Ll/ܰᩴۧ;->ۧ:I

    add-int v23, v7, v8

    const/4 v8, 0x3

    if-ne v9, v8, :cond_13

    .line 679
    iget-object v8, v1, Ll/۬ᩴۧ;->ܽ:[I

    :goto_c
    move-object/from16 v24, v8

    goto :goto_d

    :cond_13
    const/4 v8, 0x2

    if-ne v9, v8, :cond_14

    .line 681
    iget-object v8, v1, Ll/۬ᩴۧ;->ۧ:[I

    goto :goto_c

    .line 683
    :cond_14
    iget-object v8, v1, Ll/۬ᩴۧ;->֫:[I

    goto :goto_c

    .line 685
    :goto_d
    iget-object v8, v2, Ll/ۤᩴۧ;->ᩳ:[B

    move-object/from16 p2, v3

    move/from16 v25, v9

    move/from16 v3, p1

    move-object/from16 v9, v24

    move/from16 v26, v10

    move/from16 v10, v25

    move/from16 v27, v11

    move v11, v6

    move/from16 p1, v5

    move v5, v12

    move/from16 v12, v23

    move/from16 v28, v13

    move-object/from16 v13, v21

    move/from16 v29, v14

    move-object v14, v4

    invoke-static/range {v8 .. v14}, Ll/֫᩵ۧ;->֫([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 693
    iget-object v8, v2, Ll/ۤᩴۧ;->֫:[B

    add-int/lit8 v12, v23, 0x1

    invoke-static/range {v8 .. v14}, Ll/֫᩵ۧ;->֫([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_e

    :cond_15
    move-object/from16 p2, v3

    move-object/from16 v22, v6

    move/from16 v26, v10

    move/from16 v27, v11

    move/from16 v28, v13

    move/from16 v29, v14

    move/from16 v3, p1

    move/from16 p1, v5

    move v5, v12

    :goto_e
    add-int/lit8 v8, v20, 0x1

    move v12, v5

    move-object/from16 v9, v19

    move-object/from16 v6, v22

    move/from16 v10, v26

    move/from16 v11, v27

    move/from16 v13, v28

    move/from16 v14, v29

    move/from16 v5, p1

    move/from16 p1, v3

    move-object/from16 v3, p2

    goto/16 :goto_a

    :cond_16
    move-object/from16 p2, v3

    move-object/from16 v22, v6

    move/from16 v26, v10

    move/from16 v27, v11

    move/from16 v28, v13

    move/from16 v29, v14

    move/from16 v3, p1

    move/from16 p1, v5

    move v5, v12

    .line 238
    iget-boolean v2, v15, Ll/᩺ᩴۧ;->ܽ:Z

    if-eqz v2, :cond_19

    .line 240
    iget v2, v15, Ll/᩺ᩴۧ;->ۧ:I

    const/4 v6, 0x3

    if-ne v2, v6, :cond_17

    .line 241
    iget-object v1, v1, Ll/۬ᩴۧ;->ܽ:[I

    iget v2, v15, Ll/᩺ᩴۧ;->ۜ:I

    aget v1, v1, v2

    goto :goto_f

    :cond_17
    const/4 v6, 0x2

    if-ne v2, v6, :cond_18

    .line 243
    iget-object v1, v1, Ll/۬ᩴۧ;->ۧ:[I

    iget v2, v15, Ll/᩺ᩴۧ;->᩻:I

    aget v1, v1, v2

    goto :goto_f

    .line 245
    :cond_18
    iget-object v1, v1, Ll/۬ᩴۧ;->֫:[I

    iget v2, v15, Ll/᩺ᩴۧ;->ܳ:I

    aget v1, v1, v2

    .line 247
    :goto_f
    iget-object v13, v0, Ll/֫᩵ۧ;->ܳ:Landroid/graphics/Paint;

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v9, v5

    int-to-float v10, v7

    int-to-float v11, v3

    move/from16 v1, p1

    int-to-float v12, v1

    move-object v8, v4

    .line 248
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 256
    :cond_19
    new-instance v1, Ll/᩹֡֫;

    invoke-direct {v1}, Ll/᩹֡֫;-><init>()V

    iget-object v2, v0, Ll/֫᩵ۧ;->֫:Landroid/graphics/Bitmap;

    move/from16 v6, v26

    move/from16 v3, v27

    .line 259
    invoke-static {v2, v5, v7, v3, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 258
    invoke-virtual {v1, v2}, Ll/᩹֡֫;->֫(Landroid/graphics/Bitmap;)V

    int-to-float v2, v5

    move/from16 v5, v28

    int-to-float v5, v5

    div-float/2addr v2, v5

    .line 265
    invoke-virtual {v1, v2}, Ll/᩹֡֫;->ۧ(F)V

    const/4 v2, 0x0

    .line 266
    invoke-virtual {v1, v2}, Ll/᩹֡֫;->ۧ(I)V

    int-to-float v7, v7

    move/from16 v8, v29

    int-to-float v8, v8

    div-float/2addr v7, v8

    .line 267
    invoke-virtual {v1, v7, v2}, Ll/᩹֡֫;->֫(FI)V

    .line 269
    invoke-virtual {v1, v2}, Ll/᩹֡֫;->֫(I)V

    int-to-float v3, v3

    div-float/2addr v3, v5

    .line 270
    invoke-virtual {v1, v3}, Ll/᩹֡֫;->ᩳ(F)V

    int-to-float v3, v6

    div-float/2addr v3, v8

    .line 271
    invoke-virtual {v1, v3}, Ll/᩹֡֫;->֫(F)V

    .line 272
    invoke-virtual {v1}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object v1

    move-object/from16 v3, p2

    .line 256
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v4, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 276
    invoke-virtual {v4}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v5, v17, 0x1

    move-object/from16 v1, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v22

    goto/16 :goto_9

    .line 279
    :cond_1a
    new-instance v1, Ll/۬ۘۧ;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    move-object v7, v1

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    :goto_10
    move-object/from16 v2, p5

    .line 155
    invoke-interface {v2, v1}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
