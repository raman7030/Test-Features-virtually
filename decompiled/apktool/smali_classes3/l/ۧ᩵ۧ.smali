.class public final Ll/ۧ᩵ۧ;
.super Ljava/lang/Object;
.source "A8R4"


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public ۜ:I

.field public ۧ:I

.field public final ܳ:[I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ۧ᩵ۧ;->֫:Ll/ᩳ֨֫;

    const/16 v0, 0x100

    new-array v0, v0, [I

    .line 145
    iput-object v0, p0, Ll/ۧ᩵ۧ;->ܳ:[I

    return-void
.end method

.method public static ֫(Ll/ۧ᩵ۧ;Ll/ᩳ֨֫;I)V
    .locals 4

    .line 176
    iget-object v0, p0, Ll/ۧ᩵ۧ;->֫:Ll/ᩳ֨֫;

    const/4 v1, 0x4

    if-ge p2, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x3

    .line 179
    invoke-virtual {p1, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 180
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, p2, -0x4

    if-eqz v2, :cond_4

    const/4 v2, 0x7

    if-ge v3, v2, :cond_2

    goto :goto_1

    .line 187
    :cond_2
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩸()I

    move-result v2

    if-ge v2, v1, :cond_3

    goto :goto_1

    .line 191
    :cond_3
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v3

    iput v3, p0, Ll/ۧ᩵ۧ;->ܽ:I

    .line 192
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v3

    iput v3, p0, Ll/ۧ᩵ۧ;->ۧ:I

    sub-int/2addr v2, v1

    .line 193
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܽ(I)V

    add-int/lit8 v3, p2, -0xb

    .line 197
    :cond_4
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p0

    .line 198
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result p2

    if-ge p0, p2, :cond_5

    if-lez v3, :cond_5

    sub-int/2addr p2, p0

    .line 200
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 201
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    invoke-virtual {p1, p0, p2, v1}, Ll/ᩳ֨֫;->֫(II[B)V

    add-int/2addr p0, p2

    .line 202
    invoke-virtual {v0, p0}, Ll/ᩳ֨֫;->ܿ(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public static ۧ(Ll/ۧ᩵ۧ;Ll/ᩳ֨֫;I)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x13

    if-ge p2, v0, :cond_0

    return-void

    .line 210
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result p2

    iput p2, p0, Ll/ۧ᩵ۧ;->᩷:I

    .line 211
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result p2

    iput p2, p0, Ll/ۧ᩵ۧ;->ۜ:I

    const/16 p2, 0xb

    .line 212
    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 213
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result p2

    iput p2, p0, Ll/ۧ᩵ۧ;->ᩳ:I

    .line 214
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result p1

    iput p1, p0, Ll/ۧ᩵ۧ;->ܿ:I

    return-void
.end method

.method public static ܽ(Ll/ۧ᩵ۧ;Ll/ᩳ֨֫;I)V
    .locals 20

    move-object/from16 v0, p0

    .line 149
    iget-object v1, v0, Ll/ۧ᩵ۧ;->ܳ:[I

    rem-int/lit8 v2, p2, 0x5

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    return-void

    :cond_0
    move-object/from16 v2, p1

    .line 153
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v3, 0x0

    .line 155
    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([II)V

    .line 156
    div-int/lit8 v4, p2, 0x5

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 158
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    .line 159
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v7

    .line 160
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v8

    .line 161
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v9

    .line 162
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v10

    int-to-double v11, v7

    add-int/lit8 v8, v8, -0x80

    int-to-double v7, v8

    const-wide v13, 0x3ff66e978d4fdf3bL    # 1.402

    mul-double v13, v13, v7

    add-double/2addr v13, v11

    double-to-int v13, v13

    add-int/lit8 v9, v9, -0x80

    int-to-double v14, v9

    const-wide v16, 0x3fd60663c74fb54aL    # 0.34414

    mul-double v16, v16, v14

    sub-double v16, v11, v16

    const-wide v18, 0x3fe6da3c21187e7cL    # 0.71414

    mul-double v7, v7, v18

    sub-double v7, v16, v7

    double-to-int v7, v7

    const-wide v8, 0x3ffc5a1cac083127L    # 1.772

    mul-double v14, v14, v8

    add-double/2addr v14, v11

    double-to-int v8, v14

    shl-int/lit8 v9, v10, 0x18

    const/16 v10, 0xff

    .line 168
    invoke-static {v13, v3, v10}, Ll/ۘ֨֫;->֫(III)I

    move-result v11

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v9, v11

    .line 169
    invoke-static {v7, v3, v10}, Ll/ۘ֨֫;->֫(III)I

    move-result v7

    shl-int/lit8 v7, v7, 0x8

    or-int/2addr v7, v9

    .line 170
    invoke-static {v8, v3, v10}, Ll/ۘ֨֫;->֫(III)I

    move-result v8

    or-int/2addr v7, v8

    aput v7, v1, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 172
    iput-boolean v1, v0, Ll/ۧ᩵ۧ;->᩻:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩶֡֫;
    .locals 9

    .line 219
    iget v0, p0, Ll/ۧ᩵ۧ;->᩷:I

    if-eqz v0, :cond_6

    iget v0, p0, Ll/ۧ᩵ۧ;->ۜ:I

    if-eqz v0, :cond_6

    iget v0, p0, Ll/ۧ᩵ۧ;->ܽ:I

    if-eqz v0, :cond_6

    iget v0, p0, Ll/ۧ᩵ۧ;->ۧ:I

    if-eqz v0, :cond_6

    .line 223
    iget-object v0, p0, Ll/ۧ᩵ۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    if-eqz v1, :cond_6

    .line 224
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    if-ne v1, v2, :cond_6

    iget-boolean v1, p0, Ll/ۧ᩵ۧ;->᩻:Z

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v1, 0x0

    .line 229
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 230
    iget v2, p0, Ll/ۧ᩵ۧ;->ܽ:I

    iget v3, p0, Ll/ۧ᩵ۧ;->ۧ:I

    mul-int v2, v2, v3

    new-array v3, v2, [I

    const/4 v4, 0x0

    :cond_1
    :goto_0
    if-ge v4, v2, :cond_5

    .line 233
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    .line 234
    iget-object v6, p0, Ll/ۧ᩵ۧ;->ܳ:[I

    if-eqz v5, :cond_2

    add-int/lit8 v7, v4, 0x1

    .line 235
    aget v5, v6, v5

    aput v5, v3, v4

    :goto_1
    move v4, v7

    goto :goto_0

    .line 237
    :cond_2
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    if-eqz v5, :cond_1

    and-int/lit8 v7, v5, 0x40

    if-nez v7, :cond_3

    and-int/lit8 v7, v5, 0x3f

    goto :goto_2

    :cond_3
    and-int/lit8 v7, v5, 0x3f

    shl-int/lit8 v7, v7, 0x8

    .line 242
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v8

    or-int/2addr v7, v8

    :goto_2
    and-int/lit16 v5, v5, 0x80

    if-nez v5, :cond_4

    .line 244
    aget v5, v6, v1

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    aget v5, v6, v5

    :goto_3
    add-int/2addr v7, v4

    .line 245
    invoke-static {v3, v4, v7, v5}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_1

    .line 251
    :cond_5
    iget v0, p0, Ll/ۧ᩵ۧ;->ܽ:I

    iget v2, p0, Ll/ۧ᩵ۧ;->ۧ:I

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 252
    invoke-static {v3, v0, v2, v4}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 254
    new-instance v2, Ll/᩹֡֫;

    invoke-direct {v2}, Ll/᩹֡֫;-><init>()V

    .line 255
    invoke-virtual {v2, v0}, Ll/᩹֡֫;->֫(Landroid/graphics/Bitmap;)V

    iget v0, p0, Ll/ۧ᩵ۧ;->ᩳ:I

    int-to-float v0, v0

    iget v3, p0, Ll/ۧ᩵ۧ;->᩷:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    .line 256
    invoke-virtual {v2, v0}, Ll/᩹֡֫;->ۧ(F)V

    .line 257
    invoke-virtual {v2, v1}, Ll/᩹֡֫;->ۧ(I)V

    iget v0, p0, Ll/ۧ᩵ۧ;->ܿ:I

    int-to-float v0, v0

    iget v3, p0, Ll/ۧ᩵ۧ;->ۜ:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    .line 258
    invoke-virtual {v2, v0, v1}, Ll/᩹֡֫;->֫(FI)V

    .line 259
    invoke-virtual {v2, v1}, Ll/᩹֡֫;->֫(I)V

    iget v0, p0, Ll/ۧ᩵ۧ;->ܽ:I

    int-to-float v0, v0

    iget v1, p0, Ll/ۧ᩵ۧ;->᩷:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 260
    invoke-virtual {v2, v0}, Ll/᩹֡֫;->ᩳ(F)V

    iget v0, p0, Ll/ۧ᩵ۧ;->ۧ:I

    int-to-float v0, v0

    iget v1, p0, Ll/ۧ᩵ۧ;->ۜ:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 261
    invoke-virtual {v2, v0}, Ll/᩹֡֫;->֫(F)V

    .line 262
    invoke-virtual {v2}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object v0

    return-object v0

    :cond_6
    :goto_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x0

    .line 266
    iput v0, p0, Ll/ۧ᩵ۧ;->᩷:I

    .line 267
    iput v0, p0, Ll/ۧ᩵ۧ;->ۜ:I

    .line 268
    iput v0, p0, Ll/ۧ᩵ۧ;->ᩳ:I

    .line 269
    iput v0, p0, Ll/ۧ᩵ۧ;->ܿ:I

    .line 270
    iput v0, p0, Ll/ۧ᩵ۧ;->ܽ:I

    .line 271
    iput v0, p0, Ll/ۧ᩵ۧ;->ۧ:I

    .line 272
    iget-object v1, p0, Ll/ۧ᩵ۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {v1, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 273
    iput-boolean v0, p0, Ll/ۧ᩵ۧ;->᩻:Z

    return-void
.end method
