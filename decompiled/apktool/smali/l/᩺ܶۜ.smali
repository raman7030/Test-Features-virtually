.class public final Ll/᩺ܶۜ;
.super Ljava/lang/Object;
.source "A75O"

# interfaces
.implements Ll/۬ۗۜ;


# static fields
.field public static final ۢ:Landroid/net/Uri;

.field public static final synthetic ᩷:I


# instance fields
.field public final ֫:Ll/۬ܶۜ;

.field public ۜ:Ll/۠ᩴ֫;

.field public ۧ:Ll/ۙܶۜ;

.field public ܳ:Z

.field public final ܽ:J

.field public final ܿ:Ll/۫֡ۜ;

.field public ᩳ:Ljava/lang/String;

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "mt-ts-preview:///media.ts"

    .line 57
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Ll/᩺ܶۜ;->ۢ:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Ll/۫֡ۜ;J)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ll/۬ܶۜ;

    invoke-direct {v0}, Ll/۬ܶۜ;-><init>()V

    iput-object v0, p0, Ll/᩺ܶۜ;->֫:Ll/۬ܶۜ;

    .line 74
    iput-object p1, p0, Ll/᩺ܶۜ;->ܿ:Ll/۫֡ۜ;

    const-wide/16 v0, 0x3e8

    mul-long p2, p2, v0

    .line 75
    iput-wide p2, p0, Ll/᩺ܶۜ;->ܽ:J

    return-void
.end method

.method public static ֫(Landroid/media/Image;IILl/۠ᩴ֫;ZLandroid/media/MediaFormat;)Landroid/graphics/Bitmap;
    .locals 20

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    .line 889
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getFormat()I

    move-result v4

    const/16 v5, 0x23

    if-ne v4, v5, :cond_20

    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v4

    array-length v4, v4

    const/4 v5, 0x3

    if-lt v4, v5, :cond_20

    .line 892
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getCropRect()Landroid/graphics/Rect;

    move-result-object v4

    .line 893
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v5

    if-lez v5, :cond_1f

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-lez v5, :cond_1f

    .line 896
    new-instance v5, Ll/ۨܶۜ;

    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v6

    const/4 v7, 0x0

    aget-object v6, v6, v7

    invoke-direct {v5, v6}, Ll/ۨܶۜ;-><init>(Landroid/media/Image$Plane;)V

    .line 897
    new-instance v6, Ll/ۨܶۜ;

    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v8

    const/4 v9, 0x1

    aget-object v8, v8, v9

    invoke-direct {v6, v8}, Ll/ۨܶۜ;-><init>(Landroid/media/Image$Plane;)V

    .line 898
    new-instance v8, Ll/ۨܶۜ;

    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v9

    const/4 v10, 0x2

    aget-object v9, v9, v10

    invoke-direct {v8, v9}, Ll/ۨܶۜ;-><init>(Landroid/media/Image$Plane;)V

    .line 899
    iget v9, v2, Ll/۠ᩴ֫;->֫֫:I

    .line 994
    rem-int/lit16 v9, v9, 0x168

    add-int/lit16 v9, v9, 0x168

    rem-int/lit16 v9, v9, 0x168

    const/16 v10, 0xb4

    const/16 v11, 0x10e

    const/16 v12, 0x5a

    if-eq v9, v12, :cond_1

    if-eq v9, v10, :cond_1

    if-ne v9, v11, :cond_0

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :cond_1
    :goto_0
    if-eq v9, v12, :cond_3

    if-ne v9, v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v10, 0x1

    :goto_2
    if-eqz v10, :cond_4

    .line 901
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v11

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v11

    :goto_3
    if-eqz v10, :cond_5

    .line 902
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v12

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v12

    .line 903
    :goto_4
    iget v2, v2, Ll/۠ᩴ֫;->᩺:F

    const/4 v13, 0x0

    cmpl-float v13, v2, v13

    if-lez v13, :cond_6

    .line 904
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v13

    if-eqz v13, :cond_7

    :cond_6
    const/high16 v2, 0x3f800000    # 1.0f

    :cond_7
    if-eqz v10, :cond_8

    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_8
    move v13, v2

    :goto_5
    if-eqz v10, :cond_9

    goto :goto_6

    :cond_9
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_6
    if-nez p4, :cond_a

    .line 972
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v7, v7, v11, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 p3, v8

    move/from16 p0, v9

    goto :goto_9

    :cond_a
    int-to-double v14, v11

    move-object v10, v8

    float-to-double v7, v13

    mul-double v14, v14, v7

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    int-to-double v5, v12

    move/from16 p0, v9

    move-object/from16 p3, v10

    float-to-double v9, v2

    mul-double v18, v5, v9

    div-double v14, v14, v18

    int-to-double v2, v0

    move/from16 v18, v12

    move/from16 v19, v13

    int-to-double v12, v1

    div-double/2addr v2, v12

    cmpl-double v12, v14, v2

    if-lez v12, :cond_b

    mul-double v5, v5, v2

    mul-double v5, v5, v9

    div-double/2addr v5, v7

    .line 980
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v3, v2

    goto :goto_7

    :cond_b
    cmpg-double v5, v14, v2

    if-gez v5, :cond_c

    int-to-float v5, v11

    mul-float v5, v5, v19

    float-to-double v5, v5

    mul-double v2, v2, v9

    div-double/2addr v5, v2

    .line 983
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v3, v2

    move v2, v3

    move v3, v11

    goto :goto_8

    :cond_c
    move v3, v11

    :goto_7
    move/from16 v2, v18

    .line 986
    :goto_8
    invoke-static {v11, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v5, 0x1

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move/from16 v12, v18

    .line 987
    invoke-static {v12, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr v11, v3

    .line 988
    div-int/lit8 v11, v11, 0x2

    sub-int/2addr v12, v2

    .line 989
    div-int/lit8 v12, v12, 0x2

    .line 990
    new-instance v5, Landroid/graphics/Rect;

    add-int/2addr v3, v11

    add-int/2addr v2, v12

    invoke-direct {v5, v11, v12, v3, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v2, v5

    .line 917
    :goto_9
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x18

    if-lt v3, v5, :cond_d

    const-string v6, "color-range"

    move-object/from16 v7, p5

    .line 918
    invoke-virtual {v7, v6}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_e

    .line 919
    invoke-virtual {v7, v6}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v6

    const/4 v8, 0x1

    if-ne v6, v8, :cond_f

    const/4 v6, 0x1

    goto :goto_a

    :cond_d
    move-object/from16 v7, p5

    :cond_e
    const/4 v8, 0x1

    :cond_f
    const/4 v6, 0x0

    :goto_a
    if-lt v3, v5, :cond_10

    const-string v3, "color-standard"

    .line 921
    invoke-virtual {v7, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 922
    invoke-virtual {v7, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    if-ne v3, v8, :cond_10

    const/4 v3, 0x1

    goto :goto_b

    :cond_10
    const/4 v3, 0x0

    :goto_b
    mul-int v5, v0, v1

    .line 923
    new-array v5, v5, [I

    const/4 v7, 0x0

    :goto_c
    if-ge v7, v1, :cond_1e

    .line 925
    iget v9, v2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v9, v8

    iget v8, v2, Landroid/graphics/Rect;->top:I

    int-to-long v10, v7

    .line 927
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v12

    int-to-long v12, v12

    mul-long v10, v10, v12

    int-to-long v12, v1

    div-long/2addr v10, v12

    long-to-int v11, v10

    add-int/2addr v8, v11

    .line 925
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v9, 0x0

    :goto_d
    if-ge v9, v0, :cond_1d

    .line 929
    iget v10, v2, Landroid/graphics/Rect;->right:I

    add-int/lit8 v10, v10, -0x1

    iget v11, v2, Landroid/graphics/Rect;->left:I

    int-to-long v12, v9

    .line 931
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v14

    int-to-long v14, v14

    mul-long v12, v12, v14

    int-to-long v14, v0

    div-long/2addr v12, v14

    long-to-int v13, v12

    add-int/2addr v11, v13

    .line 929
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    const/16 v11, 0x5a

    move/from16 v12, p0

    if-eq v12, v11, :cond_13

    const/16 v11, 0xb4

    if-eq v12, v11, :cond_12

    const/16 v11, 0x10e

    if-eq v12, v11, :cond_11

    .line 948
    iget v11, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v11, v10

    .line 949
    iget v10, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v10, v8

    goto :goto_e

    .line 944
    :cond_11
    iget v11, v4, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v13

    add-int/2addr v13, v11

    add-int/lit8 v13, v13, -0x1

    sub-int v11, v13, v8

    .line 945
    iget v13, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v10, v13

    goto :goto_e

    .line 940
    :cond_12
    iget v11, v4, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v13

    add-int/2addr v13, v11

    add-int/lit8 v13, v13, -0x1

    sub-int v11, v13, v10

    .line 941
    iget v10, v4, Landroid/graphics/Rect;->top:I

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v13

    add-int/2addr v13, v10

    add-int/lit8 v13, v13, -0x1

    sub-int v10, v13, v8

    goto :goto_e

    .line 936
    :cond_13
    iget v11, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v11, v8

    .line 937
    iget v13, v4, Landroid/graphics/Rect;->top:I

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v14

    add-int/2addr v14, v13

    add-int/lit8 v14, v14, -0x1

    sub-int v10, v14, v10

    :goto_e
    move-object/from16 v13, v16

    .line 952
    invoke-static {v13, v11, v10}, Ll/ۨܶۜ;->֫(Ll/ۨܶۜ;II)I

    move-result v14

    .line 953
    div-int/lit8 v11, v11, 0x2

    div-int/lit8 v10, v10, 0x2

    move-object/from16 v15, v17

    invoke-static {v15, v11, v10}, Ll/ۨܶۜ;->֫(Ll/ۨܶۜ;II)I

    move-result v16

    move-object/from16 v17, v2

    move-object/from16 v2, p3

    .line 954
    invoke-static {v2, v11, v10}, Ll/ۨܶۜ;->֫(Ll/ۨܶۜ;II)I

    move-result v10

    mul-int v11, v7, v0

    add-int/2addr v11, v9

    add-int/lit8 v2, v16, -0x80

    add-int/lit8 v10, v10, -0x80

    if-eqz v6, :cond_18

    if-eqz v3, :cond_14

    const/16 v16, 0x193

    goto :goto_f

    :cond_14
    const/16 v16, 0x167

    :goto_f
    mul-int v16, v16, v10

    shr-int/lit8 v16, v16, 0x8

    add-int v16, v16, v14

    if-eqz v3, :cond_15

    const/16 v18, 0x30

    goto :goto_10

    :cond_15
    const/16 v18, 0x58

    :goto_10
    mul-int v18, v18, v2

    shr-int/lit8 v18, v18, 0x8

    sub-int v18, v14, v18

    if-eqz v3, :cond_16

    const/16 v19, 0x78

    goto :goto_11

    :cond_16
    const/16 v19, 0xb7

    :goto_11
    mul-int v19, v19, v10

    shr-int/lit8 v10, v19, 0x8

    sub-int v18, v18, v10

    if-eqz v3, :cond_17

    const/16 v10, 0x1db

    goto :goto_12

    :cond_17
    const/16 v10, 0x1c6

    :goto_12
    mul-int v10, v10, v2

    shr-int/lit8 v2, v10, 0x8

    add-int/2addr v14, v2

    move/from16 p0, v6

    move/from16 v6, v16

    move/from16 v2, v18

    move-object/from16 v16, v4

    goto :goto_17

    :cond_18
    add-int/lit8 v14, v14, -0x10

    move-object/from16 v16, v4

    const/4 v4, 0x0

    .line 1011
    invoke-static {v4, v14}, Ljava/lang/Math;->max(II)I

    move-result v4

    mul-int/lit16 v4, v4, 0x12a

    if-eqz v3, :cond_19

    const/16 v14, 0x1cb

    goto :goto_13

    :cond_19
    const/16 v14, 0x199

    :goto_13
    move/from16 p0, v6

    const/16 v6, 0x80

    .line 1012
    invoke-static {v14, v10, v4, v6}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v6

    shr-int/lit8 v6, v6, 0x8

    if-eqz v3, :cond_1a

    const/16 v14, 0x37

    goto :goto_14

    :cond_1a
    const/16 v14, 0x64

    :goto_14
    mul-int v14, v14, v2

    sub-int v14, v4, v14

    if-eqz v3, :cond_1b

    const/16 v18, 0x88

    goto :goto_15

    :cond_1b
    const/16 v18, 0xd0

    :goto_15
    mul-int v18, v18, v10

    sub-int v14, v14, v18

    const/16 v10, 0x80

    add-int/2addr v14, v10

    shr-int/lit8 v18, v14, 0x8

    if-eqz v3, :cond_1c

    const/16 v14, 0x21d

    goto :goto_16

    :cond_1c
    const/16 v14, 0x204

    .line 1015
    :goto_16
    invoke-static {v14, v2, v4, v10}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v2

    shr-int/lit8 v14, v2, 0x8

    move/from16 v2, v18

    :goto_17
    const/16 v4, 0xff

    .line 1024
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v10, 0x0

    invoke-static {v10, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    shl-int/lit8 v6, v6, 0x10

    const/high16 v18, -0x1000000

    or-int v6, v6, v18

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v6

    invoke-static {v4, v14}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    or-int/2addr v2, v4

    .line 955
    aput v2, v5, v11

    add-int/lit8 v9, v9, 0x1

    move/from16 v6, p0

    move/from16 p0, v12

    move-object/from16 v4, v16

    move-object/from16 v2, v17

    move-object/from16 v16, v13

    move-object/from16 v17, v15

    goto/16 :goto_d

    :cond_1d
    move/from16 v12, p0

    move/from16 p0, v6

    move-object/from16 v13, v16

    move-object/from16 v15, v17

    move-object/from16 v17, v2

    move-object/from16 v16, v4

    add-int/lit8 v7, v7, 0x1

    const/4 v8, 0x1

    move/from16 p0, v12

    move-object/from16 v16, v13

    move-object/from16 v17, v15

    goto/16 :goto_c

    .line 958
    :cond_1e
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 894
    :cond_1f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid MPEG-TS decoder crop rectangle"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 890
    :cond_20
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported MPEG-TS decoder image format"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۫֡ۜ;ILl/᩶ۗۜ;)Landroid/graphics/Bitmap;
    .locals 17

    .line 105
    invoke-virtual/range {p0 .. p0}, Ll/۫֡ۜ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    move/from16 v1, p1

    .line 108
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 109
    new-instance v10, Ll/۫ܶۜ;

    const-wide/16 v11, 0x0

    invoke-direct {v10, v9, v9, v11, v12}, Ll/۫ܶۜ;-><init>(IIJ)V

    .line 110
    new-instance v13, Ll/۬ܶۜ;

    invoke-direct {v13}, Ll/۬ܶۜ;-><init>()V

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 118
    :goto_0
    :try_start_0
    invoke-interface/range {p2 .. p2}, Ll/᩶ۗۜ;->֫()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move-object v2, v13

    move v3, v9

    move v4, v9

    move v6, v15

    move-object v14, v8

    move-object/from16 v8, p2

    .line 119
    :try_start_1
    invoke-static/range {v1 .. v8}, Ll/ۙܶۜ;->֫(Ll/۫֡ۜ;Ll/۬ܶۜ;IIZZLjava/lang/String;Ll/᩶ۗۜ;)Ll/ۙܶۜ;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v2, p2

    .line 128
    :try_start_2
    invoke-static {v1, v11, v12, v2}, Ll/ۙܶۜ;->֫(Ll/ۙܶۜ;JLl/᩶ۗۜ;)V

    .line 129
    invoke-virtual {v13, v10}, Ll/۬ܶۜ;->֫(Ll/۫ܶۜ;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_0

    .line 158
    invoke-static {v1}, Ll/ۙܶۜ;->ܳ(Ll/ۙܶۜ;)V

    .line 161
    invoke-virtual {v13}, Ll/۬ܶۜ;->֫()V

    return-object v0

    .line 131
    :cond_0
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v3, "MPEG-TS thumbnail frame was not decoded"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/io/InterruptedIOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    move-object/from16 v16, v1

    goto :goto_7

    :catch_0
    move-exception v0

    :goto_1
    move-object/from16 v16, v1

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    move-object/from16 v16, v1

    goto :goto_6

    :catch_3
    move-exception v0

    :goto_2
    move-object/from16 v2, p2

    goto :goto_4

    :catch_4
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_5
    move-exception v0

    :goto_3
    move-object/from16 v2, p2

    move-object v14, v8

    goto :goto_4

    :catch_6
    move-exception v0

    goto :goto_3

    :goto_4
    move-object v8, v0

    if-nez v15, :cond_3

    .line 137
    :try_start_4
    invoke-static {v8}, Ll/᩺ܶۜ;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez v16, :cond_1

    const/4 v7, 0x0

    goto :goto_5

    .line 139
    :cond_1
    invoke-static/range {v16 .. v16}, Ll/ۙܶۜ;->֫(Ll/ۙܶۜ;)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    :goto_5
    if-eqz v16, :cond_2

    .line 141
    invoke-static/range {v16 .. v16}, Ll/ۙܶۜ;->ܳ(Ll/ۙܶۜ;)V

    const/16 v16, 0x0

    :cond_2
    const/4 v15, 0x1

    goto :goto_0

    :cond_3
    if-eqz v14, :cond_4

    .line 148
    invoke-virtual {v8, v14}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 150
    :cond_4
    instance-of v0, v8, Ljava/io/IOException;

    if-eqz v0, :cond_5

    check-cast v8, Ljava/io/IOException;

    .line 151
    throw v8

    .line 153
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "MPEG-TS thumbnail decode failed"

    invoke-direct {v0, v1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_7
    move-exception v0

    .line 135
    :goto_6
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_7
    if-eqz v16, :cond_6

    .line 158
    invoke-static/range {v16 .. v16}, Ll/ۙܶۜ;->ܳ(Ll/ۙܶۜ;)V

    .line 161
    :cond_6
    invoke-virtual {v13}, Ll/۬ܶۜ;->֫()V

    .line 162
    throw v0

    .line 106
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported MPEG-TS thumbnail source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۫֡ۜ;J)Ll/᩺ܶۜ;
    .locals 3

    .line 90
    invoke-virtual {p0}, Ll/۫֡ۜ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const-wide/16 v0, 0x2710

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 93
    new-instance v0, Ll/᩺ܶۜ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩺ܶۜ;-><init>(Ll/۫֡ۜ;J)V

    return-object v0

    .line 91
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported MPEG-TS preview source"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/media/MediaCodec;Z)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 867
    :try_start_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_1

    const/16 v0, 0x21

    if-ge p1, v0, :cond_1

    .line 869
    invoke-virtual {p0}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 874
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/media/MediaCodec;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/Exception;)Z
    .locals 1

    :goto_0
    if-eqz p0, :cond_2

    .line 260
    instance-of v0, p0, Ll/ۗܶۜ;

    if-nez v0, :cond_1

    instance-of v0, p0, Ll/᩹ܶۜ;

    if-nez v0, :cond_1

    instance-of v0, p0, Ll/᩶ܶۜ;

    if-nez v0, :cond_1

    instance-of v0, p0, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 259
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private ۧ(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;
    .locals 9

    .line 295
    iget-object v0, p0, Ll/᩺ܶۜ;->ۧ:Ll/ۙܶۜ;

    if-eqz v0, :cond_1

    .line 297
    invoke-static {v0, p3, p4}, Ll/ۙܶۜ;->֫(Ll/ۙܶۜ;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۙܶۜ;->ܽ(Ll/ۙܶۜ;)J

    move-result-wide v1

    cmp-long v3, v1, p1

    if-lez v3, :cond_1

    .line 299
    :cond_0
    invoke-direct {p0}, Ll/᩺ܶۜ;->ܳ()V

    const/4 v0, 0x0

    :cond_1
    if-nez v0, :cond_2

    .line 303
    iget-boolean v6, p0, Ll/᩺ܶۜ;->᩻:Z

    iget-object v7, p0, Ll/᩺ܶۜ;->ᩳ:Ljava/lang/String;

    iget-object v1, p0, Ll/᩺ܶۜ;->ܿ:Ll/۫֡ۜ;

    iget-object v2, p0, Ll/᩺ܶۜ;->֫:Ll/۬ܶۜ;

    const/4 v5, 0x0

    move v3, p3

    move v4, p4

    move-object v8, p5

    invoke-static/range {v1 .. v8}, Ll/ۙܶۜ;->֫(Ll/۫֡ۜ;Ll/۬ܶۜ;IIZZLjava/lang/String;Ll/᩶ۗۜ;)Ll/ۙܶۜ;

    move-result-object v0

    .line 312
    iput-object v0, p0, Ll/᩺ܶۜ;->ۧ:Ll/ۙܶۜ;

    .line 313
    invoke-static {v0}, Ll/ۙܶۜ;->ܿ(Ll/ۙܶۜ;)Ll/۠ᩴ֫;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ܶۜ;->ۜ:Ll/۠ᩴ֫;

    .line 239
    :cond_2
    invoke-static {v0, p1, p2, p5}, Ll/ۙܶۜ;->֫(Ll/ۙܶۜ;JLl/᩶ۗۜ;)V

    .line 240
    new-instance p5, Ll/۫ܶۜ;

    invoke-direct {p5, p3, p4, p1, p2}, Ll/۫ܶۜ;-><init>(IIJ)V

    iget-object v1, p0, Ll/᩺ܶۜ;->֫:Ll/۬ܶۜ;

    invoke-virtual {v1, p5}, Ll/۬ܶۜ;->֫(Ll/۫ܶۜ;)Landroid/graphics/Bitmap;

    move-result-object p5

    if-eqz p5, :cond_3

    return-object p5

    .line 244
    :cond_3
    invoke-virtual {v1, p3, p4, p1, p2}, Ll/۬ܶۜ;->֫(IIJ)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 245
    invoke-static {v0}, Ll/ۙܶۜ;->ᩳ(Ll/ۙܶۜ;)Z

    move-result p2

    invoke-static {v0}, Ll/ۙܶۜ;->ۧ(Ll/ۙܶۜ;)Z

    move-result p3

    if-eqz p2, :cond_4

    if-nez p3, :cond_4

    return-object p1

    .line 249
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "MPEG-TS preview frame was not decoded"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ܳ()V
    .locals 2

    .line 349
    iget-object v0, p0, Ll/᩺ܶۜ;->ۧ:Ll/ۙܶۜ;

    const/4 v1, 0x0

    .line 350
    iput-object v1, p0, Ll/᩺ܶۜ;->ۧ:Ll/ۙܶۜ;

    if-eqz v0, :cond_0

    .line 352
    invoke-static {v0}, Ll/ۙܶۜ;->ܳ(Ll/ۙܶۜ;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܿ()Landroid/net/Uri;
    .locals 1

    .line 0
    sget-object v0, Ll/᩺ܶۜ;->ۢ:Landroid/net/Uri;

    return-object v0
.end method


# virtual methods
.method public final ֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;
    .locals 8

    .line 357
    iget-boolean v0, p0, Ll/᩺ܶۜ;->ܳ:Z

    if-nez v0, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_4

    .line 188
    invoke-interface {p5}, Ll/᩶ۗۜ;->֫()V

    const/4 v0, 0x1

    .line 189
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 190
    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    .line 283
    iget-wide v1, p0, Ll/᩺ܶۜ;->ܽ:J

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/32 v1, 0xf4240

    .line 284
    div-long/2addr p1, v1

    .line 192
    new-instance v1, Ll/۫ܶۜ;

    invoke-direct {v1, p3, p4, p1, p2}, Ll/۫ܶۜ;-><init>(IIJ)V

    iget-object v2, p0, Ll/᩺ܶۜ;->֫:Ll/۬ܶۜ;

    invoke-virtual {v2, v1}, Ll/۬ܶۜ;->֫(Ll/۫ܶۜ;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move-object v6, p5

    .line 198
    :try_start_0
    invoke-direct/range {v1 .. v6}, Ll/᩺ܶۜ;->ۧ(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    move-object v7, v1

    .line 205
    iget-boolean v1, p0, Ll/᩺ܶۜ;->᩻:Z

    if-nez v1, :cond_2

    invoke-static {v7}, Ll/᩺ܶۜ;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 206
    iget-object v1, p0, Ll/᩺ܶۜ;->ۧ:Ll/ۙܶۜ;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 207
    :cond_1
    invoke-static {v1}, Ll/ۙܶۜ;->֫(Ll/ۙܶۜ;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Ll/᩺ܶۜ;->ᩳ:Ljava/lang/String;

    .line 208
    invoke-direct {p0}, Ll/᩺ܶۜ;->ܳ()V

    .line 209
    iput-boolean v0, p0, Ll/᩺ܶۜ;->᩻:Z

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move-object v6, p5

    .line 211
    :try_start_1
    invoke-direct/range {v1 .. v6}, Ll/᩺ܶۜ;->ۧ(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    return-object p1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    .line 217
    :goto_2
    invoke-virtual {p1, v7}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    move-object v7, p1

    goto :goto_3

    :catch_4
    move-exception p1

    .line 214
    invoke-direct {p0}, Ll/᩺ܶۜ;->ܳ()V

    .line 215
    throw p1

    .line 221
    :cond_2
    :goto_3
    invoke-direct {p0}, Ll/᩺ܶۜ;->ܳ()V

    .line 222
    instance-of p1, v7, Ljava/io/IOException;

    if-eqz p1, :cond_3

    check-cast v7, Ljava/io/IOException;

    .line 223
    throw v7

    .line 225
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "MPEG-TS preview decode failed"

    invoke-direct {p1, p2, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_5
    move-exception p1

    .line 201
    invoke-direct {p0}, Ll/᩺ܶۜ;->ܳ()V

    .line 202
    throw p1

    .line 358
    :cond_4
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "MPEG-TS frame source was closed"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 1

    .line 338
    iget-boolean v0, p0, Ll/᩺ܶۜ;->ܳ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 341
    iput-boolean v0, p0, Ll/᩺ܶۜ;->ܳ:Z

    .line 342
    invoke-direct {p0}, Ll/᩺ܶۜ;->ܳ()V

    .line 343
    iget-object v0, p0, Ll/᩺ܶۜ;->֫:Ll/۬ܶۜ;

    invoke-virtual {v0}, Ll/۬ܶۜ;->֫()V

    const/4 v0, 0x0

    .line 344
    iput-object v0, p0, Ll/᩺ܶۜ;->ۜ:Ll/۠ᩴ֫;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()V
    .locals 0

    .line 332
    invoke-direct {p0}, Ll/᩺ܶۜ;->ܳ()V

    return-void
.end method

.method public final ᩳ()Ll/ܰۗۜ;
    .locals 4

    .line 321
    iget-object v0, p0, Ll/᩺ܶۜ;->ۜ:Ll/۠ᩴ֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    iget v1, v0, Ll/۠ᩴ֫;->᩷֫:I

    iget v2, v0, Ll/۠ᩴ֫;->۠:I

    iget v3, v0, Ll/۠ᩴ֫;->֫֫:I

    iget v0, v0, Ll/۠ᩴ֫;->᩺:F

    invoke-static {v1, v2, v3, v0}, Ll/֫۬ۜ;->֫(IIIF)Ll/ܰۗۜ;

    move-result-object v0

    return-object v0
.end method
