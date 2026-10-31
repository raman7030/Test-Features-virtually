.class public Ll/᩻ۖ᩷;
.super Landroid/graphics/drawable/Drawable;
.source "FA3A"


# static fields
.field public static final synthetic ۜ:I


# instance fields
.field public final ֫:Landroid/graphics/Canvas;

.field public final ۧ:Landroid/graphics/drawable/BitmapDrawable;

.field public final ܳ:F

.field public final ܽ:Landroid/graphics/Paint;

.field public final ܿ:F

.field public ᩳ:F

.field public final ᩻:F


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;FF)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    const v10, 0xd9028c6

    sget v11, Ll/ۘۛ;->ۖۚ֡:I

    sget v12, Ll/ۘۨ;->۫᩸۠:I

    .line 40
    invoke-direct/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const-string v13, "\u06e8\u0736"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x71d1

    const v15, 0x2d8b12d9

    xor-int/2addr v14, v15

    const v15, 0x60e99008

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    const/4 v15, 0x0

    :goto_2
    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x5bf3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 42
    iput-object v2, v0, Ll/᩻ۖ᩷;->֫:Landroid/graphics/Canvas;

    move/from16 v13, p2

    .line 43
    iput v13, v0, Ll/᩻ۖ᩷;->ܳ:F

    move/from16 v14, p3

    .line 44
    iput v14, v0, Ll/᩻ۖ᩷;->᩻:F

    sget v16, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v16, :cond_a

    goto/16 :goto_a

    .line 5
    :sswitch_0
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v13, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v13, :cond_0

    goto/16 :goto_7

    :cond_0
    :goto_3
    move/from16 v13, p2

    move/from16 v14, p3

    goto/16 :goto_a

    :sswitch_1
    sget v13, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v13, :cond_8

    goto :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v13

    if-gez v13, :cond_4

    goto :goto_4

    .line 49
    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    :goto_4
    const-string v13, "\u06ec\u073a"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x73

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xbd9

    const v16, 0x7f408b64

    xor-int v14, v14, v16

    const v16, -0x74b9a5d9

    goto/16 :goto_6

    .line 22
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 49
    :sswitch_5
    invoke-virtual {v15, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    sget-object v13, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    new-instance v13, Landroid/graphics/PorterDuffXfermode;

    .line 17
    sget v14, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v14, :cond_1

    goto :goto_5

    .line 51
    :cond_1
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v13, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void

    :sswitch_6
    double-to-float v13, v6

    .line 47
    iput v13, v0, Ll/᩻ۖ᩷;->ܿ:F

    .line 48
    new-instance v15, Landroid/graphics/Paint;

    .line 46
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v13

    if-ltz v13, :cond_2

    goto :goto_3

    :cond_2
    const/4 v13, 0x1

    .line 40
    sget v14, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v14, :cond_3

    goto :goto_5

    .line 48
    :cond_3
    invoke-direct {v15, v13}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v15, v0, Ll/᩻ۖ᩷;->ܽ:Landroid/graphics/Paint;

    const/4 v9, 0x0

    .line 29
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v13

    if-eqz v13, :cond_5

    :cond_4
    :goto_5
    const-string v13, "\u1a75\u06d9"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6e33

    const v15, -0x540712a5

    xor-int/2addr v14, v15

    const v15, 0x1f409358

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u06da\u06e4"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6d1d

    const v16, -0x345df92e

    xor-int v14, v14, v16

    const v16, -0x3b0e6154

    goto :goto_6

    :sswitch_7
    add-int v6, v5, v4

    int-to-double v6, v6

    .line 47
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    .line 33
    sget v13, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v13, :cond_6

    move/from16 v13, p2

    move/from16 v14, p3

    goto/16 :goto_8

    :cond_6
    const-string v13, "\u06da\u06e0"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x54af

    const v16, -0x1186b972

    xor-int v14, v14, v16

    const v16, 0x38fa38bb

    goto :goto_6

    :sswitch_8
    mul-int v5, v3, v3

    sget v13, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v13, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v13, "\u1a76\u06e1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xf47

    const v16, -0x4fca7035

    xor-int v14, v14, v16

    const v16, -0x7a959296

    :goto_6
    xor-int v13, v13, v16

    goto/16 :goto_2

    .line 45
    :sswitch_9
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int v3, v3, v3

    sget v13, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v13, :cond_9

    move/from16 v18, v4

    move v4, v3

    move/from16 v3, v18

    :cond_8
    :goto_7
    const-string v13, "\u06e0\u06ec"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1c13

    const v16, -0x568f2580

    xor-int v14, v14, v16

    const v16, -0x4016bf9c

    goto :goto_6

    :cond_9
    const-string v13, "\u0730\u06eb"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x741b

    const v16, -0x5a65f97d

    xor-int v14, v14, v16

    const v16, -0x70a472d1

    xor-int v13, v13, v16

    move/from16 v18, v4

    move v4, v3

    move/from16 v3, v18

    goto/16 :goto_2

    :cond_a
    const-string v16, "\u06e0\u05a1"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v11

    mul-int/lit8 v16, v16, -0x4f

    xor-int v8, v16, v12

    mul-int/lit16 v8, v8, -0x5889

    const v17, 0x6cc9e37f

    xor-int v8, v8, v17

    const v17, -0x4862dab5

    xor-int v16, v16, v17

    move v14, v8

    move/from16 v13, v16

    goto/16 :goto_2

    :sswitch_a
    move/from16 v13, p2

    move/from16 v14, p3

    .line 42
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 14
    sget v8, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v8, :cond_b

    :goto_8
    const-string v8, "\u05ab\u1a78"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v11

    mul-int/lit8 v8, v8, -0x7f

    move-object/from16 v16, v2

    xor-int v2, v8, v12

    mul-int/lit16 v2, v2, -0x41bd

    const v17, -0x6d255908

    xor-int v2, v2, v17

    const v17, 0x636636d4

    goto :goto_9

    :cond_b
    const-string v8, "\u06e8\u05a1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v12

    move-object/from16 v16, v2

    xor-int v2, v8, v11

    mul-int/lit16 v2, v2, -0x4d7b

    const v17, -0x6eb82cfd

    xor-int v2, v2, v17

    const v17, 0x72626505

    :goto_9
    xor-int v8, v8, v17

    move v14, v2

    move v13, v8

    move-object/from16 v2, v16

    goto/16 :goto_2

    :sswitch_b
    move/from16 v13, p2

    move/from16 v14, p3

    .line 41
    new-instance v8, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v8, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v8, v0, Ll/᩻ۖ᩷;->ۧ:Landroid/graphics/drawable/BitmapDrawable;

    .line 26
    sget v8, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v8, :cond_c

    :goto_a
    const-string v8, "\u1a73\u1a74"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v12

    xor-int v15, v8, v11

    mul-int/lit16 v15, v15, -0x4523

    const v16, -0x267c8906

    xor-int v15, v15, v16

    const v16, -0x7577d56c

    xor-int v8, v8, v16

    move v13, v8

    move v14, v15

    goto/16 :goto_1

    :cond_c
    const-string v8, "\u073d\u1a7b"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v11, v8

    mul-int/lit8 v8, v8, -0x37

    xor-int v0, v8, v12

    mul-int/lit16 v0, v0, -0x761

    const v16, 0x23adfae2

    xor-int v0, v0, v16

    const v16, -0x1060cc1b

    xor-int v8, v8, v16

    move v14, v0

    move v13, v8

    move-object/from16 v0, p0

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c02948a -> :sswitch_3
        -0x79f594ad -> :sswitch_b
        -0x68131d52 -> :sswitch_a
        -0x6549433a -> :sswitch_0
        -0x5dd7f2fd -> :sswitch_5
        -0x587dbcc9 -> :sswitch_1
        -0x515c8434 -> :sswitch_7
        -0x411b0aa4 -> :sswitch_7
        -0x2fbfd215 -> :sswitch_0
        -0x29702019 -> :sswitch_9
        -0x26cf2b73 -> :sswitch_2
        -0x21e63a18 -> :sswitch_6
        -0xacc2573 -> :sswitch_9
        -0x65f71b7 -> :sswitch_3
        0x8180f9a -> :sswitch_a
        0x10733c3f -> :sswitch_5
        0x245e93f0 -> :sswitch_6
        0x32c2e594 -> :sswitch_b
        0x332c7946 -> :sswitch_4
        0x37d83cc6 -> :sswitch_4
        0x3e971b15 -> :sswitch_8
        0x60512941 -> :sswitch_2
        0x69b84e81 -> :sswitch_8
        0x6c6842e0 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x680e9f0e

    sget v8, Ll/ۘۨ;->۫᩸۠:I

    sget v9, Ll/֨۬;->۫ۙ᩺:I

    const-string v10, "\u06d9\u06e4"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x1f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x38ab

    const v12, -0x58ad780e

    xor-int/2addr v11, v12

    const v12, -0x1c22b0fd

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x1cb1

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 0
    sget v10, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v10, :cond_2

    goto :goto_1

    .line 33
    :sswitch_0
    sget v10, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v10, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v10, "\u1a79\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x79e9

    const v12, 0x4636dddd

    xor-int/2addr v11, v12

    const v12, -0x502627ba

    goto :goto_0

    .line 19
    :sswitch_1
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget v10, Ll/֡֡;->֫ۤܳ:I

    if-ltz v10, :cond_1

    goto/16 :goto_2

    :cond_1
    :goto_1
    const-string v10, "\u0736\u06e7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x266b

    const v12, 0x13d947b0

    xor-int/2addr v11, v12

    const v12, 0x7054eaa4

    goto :goto_0

    .line 15
    :sswitch_2
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto/16 :goto_2

    .line 33
    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    return-void

    .line 62
    :sswitch_4
    invoke-virtual {v4, v5, v6, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 63
    iget-object v0, p0, Ll/᩻ۖ᩷;->ۧ:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 62
    :sswitch_5
    iget v6, p0, Ll/᩻ۖ᩷;->᩻:F

    .line 25
    sget-boolean v10, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v10, :cond_3

    :cond_2
    const-string v10, "\u06e4\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x292d

    const v12, 0x63a5fb4a

    xor-int/2addr v11, v12

    const v12, 0x7c99d00c

    goto :goto_0

    :cond_3
    const-string v10, "\u1a7a\u05a1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x6b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1cb9

    const v12, -0x5f38d9a1

    xor-int/2addr v11, v12

    const v12, -0x3a5cb101

    goto/16 :goto_0

    .line 62
    :sswitch_6
    iget-object v4, p0, Ll/᩻ۖ᩷;->֫:Landroid/graphics/Canvas;

    iget v5, p0, Ll/᩻ۖ᩷;->ܳ:F

    sget v10, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v10, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v10, "\u05a1\u1a75"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1a5b

    const v12, -0x7892be34

    xor-int/2addr v11, v12

    const v12, 0x483b5fe6

    goto/16 :goto_0

    :sswitch_7
    mul-float v2, v0, v1

    iget-object v3, p0, Ll/᩻ۖ᩷;->ܽ:Landroid/graphics/Paint;

    .line 16
    sget-boolean v10, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v10, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v10, "\u1a7b\u06da"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x4d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x643

    const v12, 0x79716645

    xor-int/2addr v11, v12

    const v12, -0x5156efa3

    goto/16 :goto_0

    .line 62
    :sswitch_8
    iget v1, p0, Ll/᩻ۖ᩷;->ᩳ:F

    sget v10, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v10, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v10, "\u06ec\u05a1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x788b

    const v12, 0x37d08957

    xor-int/2addr v11, v12

    const v12, -0x1e08bd3a

    goto/16 :goto_0

    :sswitch_9
    iget v0, p0, Ll/᩻ۖ᩷;->ܿ:F

    sget v10, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v10, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v10, "\u1a74\u06eb"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x60d3

    const v12, 0x7ab50973    # 4.699987E35f

    xor-int/2addr v11, v12

    const v12, 0x466ea55c

    goto/16 :goto_0

    .line 21
    :sswitch_a
    sget v10, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v10, :cond_8

    goto :goto_2

    :cond_8
    const-string v10, "\u06e0\u06e2"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x33

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7ac9

    const v12, -0x59ee8eac

    xor-int/2addr v11, v12

    const v12, -0x1a9da9f2

    goto/16 :goto_0

    .line 39
    :sswitch_b
    sget-boolean v10, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v10, :cond_9

    goto :goto_3

    :cond_9
    const-string v10, "\u0730\u1a7a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x19

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4351

    const v12, -0x24515c6b

    xor-int/2addr v11, v12

    const v12, -0x35185bde    # -7590417.0f

    goto/16 :goto_0

    .line 21
    :sswitch_c
    sget v10, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v10, :cond_a

    :goto_2
    const-string v10, "\u1a77\u06d8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3727

    const v12, 0x5c9711c5

    xor-int/2addr v11, v12

    const v12, 0x6b1b6bc5

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u1a75\u05ab"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x5b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4365

    const v12, -0xd05ed4a

    xor-int/2addr v11, v12

    const v12, 0x6e5c2e92

    goto/16 :goto_0

    .line 31
    :sswitch_d
    sget v10, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v10, :cond_b

    goto :goto_3

    :cond_b
    const-string v10, "\u1a7a\u06e0"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x7f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1741

    const v12, -0x1e55e702

    xor-int/2addr v11, v12

    const v12, 0x18f67a34

    goto/16 :goto_0

    .line 26
    :sswitch_e
    sget v10, Ll/֨۟;->᩹֫᩷:I

    if-eqz v10, :cond_c

    :goto_3
    const-string v10, "\u06e8\u0733"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x4d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x92d

    const v12, -0x25517e5d

    xor-int/2addr v11, v12

    const v12, -0x695fca1b

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a7a\u05a8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5571

    const v12, 0x2d64a0b9

    xor-int/2addr v11, v12

    const v12, -0x742f3443

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7204896f -> :sswitch_3
        -0x6e273e07 -> :sswitch_c
        -0x66487dbc -> :sswitch_b
        -0x652bfb5a -> :sswitch_5
        -0x601da8e3 -> :sswitch_b
        -0x5f714642 -> :sswitch_8
        -0x5dfc5611 -> :sswitch_a
        -0x5d776f01 -> :sswitch_d
        -0x571b3734 -> :sswitch_9
        -0x552be75c -> :sswitch_4
        -0x51274ef9 -> :sswitch_5
        -0x334ce944 -> :sswitch_c
        -0x200f947d -> :sswitch_6
        -0x19d3f27e -> :sswitch_0
        -0x168c66c5 -> :sswitch_7
        -0x39bf698 -> :sswitch_3
        0x2012f57 -> :sswitch_9
        0xd7d25d1 -> :sswitch_e
        0x10277364 -> :sswitch_7
        0x16ba5d55 -> :sswitch_e
        0x23766caf -> :sswitch_8
        0x29d958ef -> :sswitch_d
        0x2dab9472 -> :sswitch_1
        0x37ca6d9d -> :sswitch_1
        0x46f1fbf1 -> :sswitch_a
        0x4ca10ff8 -> :sswitch_6
        0x5d617159 -> :sswitch_4
        0x6518d02b -> :sswitch_0
        0x660ab049 -> :sswitch_2
        0x78d00b1d -> :sswitch_2
    .end sparse-switch
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 6

    const v0, -0x292a5ef9

    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v3, "\u1a76\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ef7

    const v5, 0x5cd0dc69

    xor-int/2addr v4, v5

    const v5, -0x39903043

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x188f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 32
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_1

    .line 31
    :sswitch_0
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_7

    goto/16 :goto_2

    .line 14
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_a

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    return-void

    .line 57
    :sswitch_4
    iget-object v0, p0, Ll/᩻ۖ᩷;->ۧ:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    .line 56
    :sswitch_5
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 52
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x31d5

    const v5, 0x24a31aa2

    xor-int/2addr v4, v5

    const v5, -0x3c643cf4

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u0730\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63df

    const v5, 0x1af2904b

    xor-int/2addr v4, v5

    const v5, 0xa21ed7b

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a7b\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6b9

    const v5, 0x3383b5b3

    xor-int/2addr v4, v5

    const v5, 0x5a0d40d4

    goto/16 :goto_0

    .line 28
    :sswitch_8
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u073a\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x509b

    const v5, -0x72a80886

    xor-int/2addr v4, v5

    const v5, 0x536c0b6f

    goto/16 :goto_0

    .line 51
    :sswitch_9
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_1
    const-string v3, "\u05a1\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2423

    const v5, 0x7bc677a

    xor-int/2addr v4, v5

    const v5, 0x36bf1299

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u05ab\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x901

    const v5, -0x7efbce64

    xor-int/2addr v4, v5

    const v5, 0x128df2ba

    goto/16 :goto_0

    .line 31
    :sswitch_a
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06ec\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xe01

    const v5, -0x6db83159

    xor-int/2addr v4, v5

    const v5, -0x4ecb3c49

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u05ab\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7ff3

    const v5, 0x1bdb389b

    xor-int/2addr v4, v5

    const v5, -0x5015d9c1

    goto/16 :goto_0

    .line 46
    :sswitch_b
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_8

    :cond_7
    const-string v3, "\u06ec\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67b

    const v5, 0x620ebff3

    xor-int/2addr v4, v5

    const v5, 0x4307d0a8

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0736\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4201

    const v5, 0x5c33c5c

    xor-int/2addr v4, v5

    const v5, 0x68ddd89b

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u0736\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4859

    const v5, 0x46784dc6

    xor-int/2addr v4, v5

    const v5, -0x3c25e919

    goto/16 :goto_0

    .line 15
    :sswitch_d
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x24cd

    const v5, -0x4eb8b02b

    xor-int/2addr v4, v5

    const v5, -0x677e9b6d

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e1\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x764f

    const v5, 0x65de820a

    xor-int/2addr v4, v5

    const v5, -0x7a02d27f

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u06ec\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2065

    const v5, -0x61223055

    xor-int/2addr v4, v5

    const v5, 0x490af173

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3eb7

    const v5, -0x5ac656d1

    xor-int/2addr v4, v5

    const v5, -0x67b9e0d0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6a472d66 -> :sswitch_b
        -0x62b5401b -> :sswitch_5
        -0x620007f4 -> :sswitch_a
        -0x60da8ce3 -> :sswitch_3
        -0x5e90626e -> :sswitch_7
        -0x5d8e146d -> :sswitch_4
        -0x5c172abd -> :sswitch_2
        -0x49da28b4 -> :sswitch_1
        -0x45f481db -> :sswitch_c
        -0x43d709d2 -> :sswitch_0
        -0x2ba31cde -> :sswitch_b
        -0x1d6b833f -> :sswitch_e
        -0x1b86e918 -> :sswitch_c
        -0x1ae27054 -> :sswitch_1
        -0x18cd6745 -> :sswitch_d
        -0x1f766f1 -> :sswitch_e
        0x632da96 -> :sswitch_a
        0x8f9fe8b -> :sswitch_8
        0x119cd6d5 -> :sswitch_0
        0x21527fed -> :sswitch_9
        0x2abbcc2a -> :sswitch_5
        0x3286201c -> :sswitch_7
        0x38a9e669 -> :sswitch_4
        0x38df50b2 -> :sswitch_6
        0x3f092bfe -> :sswitch_3
        0x3fbf6df7 -> :sswitch_9
        0x5502f80f -> :sswitch_2
        0x65101d98 -> :sswitch_6
        0x73bd9968 -> :sswitch_d
        0x74ea3067 -> :sswitch_8
    .end sparse-switch
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method

.method public setProgress(F)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 68
    iput p1, p0, Ll/᩻ۖ᩷;->ᩳ:F

    .line 69
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
