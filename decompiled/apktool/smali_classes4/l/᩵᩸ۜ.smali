.class public final Ll/᩵᩸ۜ;
.super Ljava/lang/Object;
.source "Z7NG"


# instance fields
.field public final ֫:Landroid/graphics/Bitmap;

.field public final ۧ:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ljava/util/Random;)V
    .locals 12

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x2

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Ll/᩵᩸ۜ;->ۧ:Landroid/graphics/Bitmap;

    .line 106
    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩸ۜ;->֫:Landroid/graphics/Bitmap;

    .line 110
    invoke-virtual {p1}, Ljava/util/Random;->nextBoolean()Z

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x43b40000    # 360.0f

    const/16 v4, 0x14

    const v5, 0x3f4ccccd    # 0.8f

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x3

    const/16 v9, 0x168

    if-eqz v0, :cond_0

    .line 133
    invoke-virtual {p1, v9}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-float v0, v0

    new-array v8, v8, [F

    aput v0, v8, v7

    aput v5, v8, v6

    const v9, 0x3f51eb85    # 0.82f

    aput v9, v8, v1

    .line 139
    invoke-direct {p0, v7, v7, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    const/high16 v10, 0x42be0000    # 95.0f

    add-float/2addr v10, v0

    .line 141
    invoke-virtual {p1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v11

    int-to-float v11, v11

    add-float/2addr v10, v11

    rem-float/2addr v10, v3

    aput v10, v8, v7

    const v10, 0x3f7ae148    # 0.98f

    aput v10, v8, v6

    const v10, 0x3f47ae14    # 0.78f

    aput v10, v8, v1

    .line 144
    invoke-direct {p0, v6, v7, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    const v10, 0x43a28000    # 325.0f

    add-float/2addr v10, v0

    .line 146
    invoke-virtual {p1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v11

    int-to-float v11, v11

    add-float/2addr v10, v11

    rem-float/2addr v10, v3

    aput v10, v8, v7

    aput v2, v8, v6

    aput v5, v8, v1

    .line 149
    invoke-direct {p0, v7, v6, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    const/high16 v5, 0x437f0000    # 255.0f

    add-float/2addr v0, v5

    .line 151
    invoke-virtual {p1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    int-to-float p1, p1

    add-float/2addr v0, p1

    rem-float/2addr v0, v3

    aput v0, v8, v7

    aput v2, v8, v6

    aput v9, v8, v1

    .line 154
    invoke-direct {p0, v6, v6, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    return-void

    .line 160
    :cond_0
    invoke-virtual {p1, v9}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v10, 0x43910000    # 290.0f

    cmpl-float v10, v0, v10

    if-ltz v10, :cond_1

    const/high16 v10, 0x43a50000    # 330.0f

    cmpg-float v10, v0, v10

    if-lez v10, :cond_0

    :cond_1
    new-array v8, v8, [F

    aput v0, v8, v7

    const v9, 0x3f5c28f6    # 0.86f

    aput v9, v8, v6

    const v9, 0x3f3d70a4    # 0.74f

    aput v9, v8, v1

    .line 167
    invoke-direct {p0, v7, v7, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    add-float v9, v0, v2

    const/16 v10, 0xa

    .line 169
    invoke-virtual {p1, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v10

    int-to-float v10, v10

    add-float/2addr v9, v10

    rem-float/2addr v9, v3

    aput v9, v8, v7

    const v9, 0x3f3851ec    # 0.72f

    aput v9, v8, v6

    aput v5, v8, v1

    .line 172
    invoke-direct {p0, v6, v7, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    const/high16 v5, 0x42a00000    # 80.0f

    add-float/2addr v5, v0

    .line 174
    invoke-virtual {p1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    int-to-float v9, v9

    add-float/2addr v5, v9

    rem-float/2addr v5, v3

    aput v5, v8, v7

    aput v2, v8, v6

    const v2, 0x3f5eb852    # 0.87f

    aput v2, v8, v1

    .line 177
    invoke-direct {p0, v7, v6, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    const/high16 v2, 0x430c0000    # 140.0f

    add-float/2addr v0, v2

    .line 179
    invoke-virtual {p1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    int-to-float p1, p1

    add-float/2addr v0, p1

    rem-float/2addr v0, v3

    aput v0, v8, v7

    const p1, 0x3f428f5c    # 0.76f

    aput p1, v8, v6

    const p1, 0x3f4a3d71    # 0.79f

    aput p1, v8, v1

    .line 182
    invoke-direct {p0, v6, v6, v8}, Ll/᩵᩸ۜ;->֫(II[F)V

    return-void
.end method

.method private ֫(II[F)V
    .locals 1

    .line 126
    invoke-static {p3}, Ll/۟ۗ;->֫([F)I

    move-result p3

    .line 127
    iget-object v0, p0, Ll/᩵᩸ۜ;->ۧ:Landroid/graphics/Bitmap;

    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Bitmap;->setPixel(III)V

    const v0, 0xffffff

    and-int/2addr p3, v0

    const/high16 v0, -0x67000000

    or-int/2addr p3, v0

    const v0, -0xbdbdbe

    .line 128
    invoke-static {p3, v0}, Ll/۟ۗ;->ۧ(II)I

    move-result p3

    .line 129
    iget-object v0, p0, Ll/᩵᩸ۜ;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Bitmap;->setPixel(III)V

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Bitmap;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/᩵᩸ۜ;->֫:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final ۧ()Landroid/graphics/Bitmap;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/᩵᩸ۜ;->ۧ:Landroid/graphics/Bitmap;

    return-object v0
.end method
