.class public final Ll/ܶ᩵ۧ;
.super Ljava/lang/Object;
.source "97TY"


# instance fields
.field public ֫:Landroid/graphics/Rect;

.field public ۜ:I

.field public final ۧ:[I

.field public ܳ:Z

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 130
    iput-object v0, p0, Ll/ܶ᩵ۧ;->ۧ:[I

    const/4 v0, -0x1

    .line 131
    iput v0, p0, Ll/ܶ᩵ۧ;->ܽ:I

    .line 132
    iput v0, p0, Ll/ܶ᩵ۧ;->ᩳ:I

    return-void
.end method

.method public static ֫(II)I
    .locals 1

    const v0, 0xffffff

    and-int/2addr p0, v0

    mul-int/lit8 p1, p1, 0x11

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p0, p1

    return p0
.end method

.method public static ֫(I[I)I
    .locals 1

    if-ltz p0, :cond_0

    .line 234
    array-length v0, p1

    if-ge p0, v0, :cond_0

    aget p0, p1, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    aget p0, p1, p0

    return p0
.end method

.method private ֫(Ll/ܽ֨֫;ZLandroid/graphics/Rect;[I)V
    .locals 7

    .line 342
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 343
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    xor-int/lit8 p2, p2, 0x1

    mul-int v1, p2, v0

    :goto_0
    const/4 v2, 0x0

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_1
    const/4 v5, 0x4

    if-ge v3, v4, :cond_2

    const/16 v6, 0x40

    if-gt v4, v6, :cond_2

    .line 375
    invoke-virtual {p1}, Ll/ܽ֨֫;->֫()I

    move-result v6

    if-ge v6, v5, :cond_1

    const/4 v3, 0x0

    const/4 v4, -0x1

    goto :goto_2

    :cond_1
    shl-int/lit8 v3, v3, 0x4

    .line 380
    invoke-virtual {p1, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    or-int/2addr v3, v5

    shl-int/lit8 v4, v4, 0x2

    goto :goto_1

    :cond_2
    and-int/lit8 v4, v3, 0x3

    if-ge v3, v5, :cond_3

    move v3, v0

    goto :goto_2

    :cond_3
    shr-int/lit8 v3, v3, 0x2

    :goto_2
    sub-int v5, v0, v2

    .line 352
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-lez v3, :cond_4

    add-int v5, v1, v3

    .line 354
    iget-object v6, p0, Ll/ܶ᩵ۧ;->ۧ:[I

    aget v4, v6, v4

    invoke-static {p4, v1, v5, v4}, Ljava/util/Arrays;->fill([IIII)V

    add-int/2addr v2, v3

    move v1, v5

    :cond_4
    if-lt v2, v0, :cond_0

    add-int/lit8 p2, p2, 0x2

    if-lt p2, p3, :cond_5

    return-void

    :cond_5
    mul-int v1, p2, v0

    .line 365
    invoke-virtual {p1}, Ll/ܽ֨֫;->ۧ()V

    goto :goto_0
.end method


# virtual methods
.method public final ֫(Ll/ᩳ֨֫;)Ll/᩶֡֫;
    .locals 5

    .line 295
    iget-object v0, p0, Ll/ܶ᩵ۧ;->᩻:[I

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܶ᩵ۧ;->ܳ:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܶ᩵ۧ;->ܿ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܶ᩵ۧ;->֫:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    iget v1, p0, Ll/ܶ᩵ۧ;->ܽ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget v1, p0, Ll/ܶ᩵ۧ;->ᩳ:I

    if-eq v1, v2, :cond_1

    .line 301
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Ll/ܶ᩵ۧ;->֫:Landroid/graphics/Rect;

    .line 302
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 305
    :cond_0
    iget-object v0, p0, Ll/ܶ᩵ۧ;->֫:Landroid/graphics/Rect;

    .line 306
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    mul-int v2, v2, v1

    new-array v1, v2, [I

    .line 307
    new-instance v2, Ll/ܽ֨֫;

    invoke-direct {v2}, Ll/ܽ֨֫;-><init>()V

    .line 309
    iget v3, p0, Ll/ܶ᩵ۧ;->ܽ:I

    invoke-virtual {p1, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 310
    invoke-virtual {v2, p1}, Ll/ܽ֨֫;->֫(Ll/ᩳ֨֫;)V

    const/4 v3, 0x1

    .line 311
    invoke-direct {p0, v2, v3, v0, v1}, Ll/ܶ᩵ۧ;->֫(Ll/ܽ֨֫;ZLandroid/graphics/Rect;[I)V

    .line 312
    iget v3, p0, Ll/ܶ᩵ۧ;->ᩳ:I

    invoke-virtual {p1, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 313
    invoke-virtual {v2, p1}, Ll/ܽ֨֫;->֫(Ll/ᩳ֨֫;)V

    const/4 p1, 0x0

    .line 314
    invoke-direct {p0, v2, p1, v0, v1}, Ll/ܶ᩵ۧ;->֫(Ll/ܽ֨֫;ZLandroid/graphics/Rect;[I)V

    .line 318
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 317
    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 320
    new-instance v2, Ll/᩹֡֫;

    invoke-direct {v2}, Ll/᩹֡֫;-><init>()V

    .line 321
    invoke-virtual {v2, v1}, Ll/᩹֡֫;->֫(Landroid/graphics/Bitmap;)V

    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v3, p0, Ll/ܶ᩵ۧ;->᩷:I

    int-to-float v3, v3

    div-float/2addr v1, v3

    .line 322
    invoke-virtual {v2, v1}, Ll/᩹֡֫;->ۧ(F)V

    .line 323
    invoke-virtual {v2, p1}, Ll/᩹֡֫;->ۧ(I)V

    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget v3, p0, Ll/ܶ᩵ۧ;->ۜ:I

    int-to-float v3, v3

    div-float/2addr v1, v3

    .line 324
    invoke-virtual {v2, v1, p1}, Ll/᩹֡֫;->֫(FI)V

    .line 325
    invoke-virtual {v2, p1}, Ll/᩹֡֫;->֫(I)V

    .line 326
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result p1

    int-to-float p1, p1

    iget v1, p0, Ll/ܶ᩵ۧ;->᩷:I

    int-to-float v1, v1

    div-float/2addr p1, v1

    invoke-virtual {v2, p1}, Ll/᩹֡֫;->ᩳ(F)V

    .line 327
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    iget v0, p0, Ll/ܶ᩵ۧ;->ۜ:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    invoke-virtual {v2, p1}, Ll/᩹֡֫;->֫(F)V

    .line 328
    invoke-virtual {v2}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 388
    iput-boolean v0, p0, Ll/ܶ᩵ۧ;->ܿ:Z

    const/4 v0, 0x0

    .line 389
    iput-object v0, p0, Ll/ܶ᩵ۧ;->֫:Landroid/graphics/Rect;

    const/4 v0, -0x1

    .line 390
    iput v0, p0, Ll/ܶ᩵ۧ;->ܽ:I

    .line 391
    iput v0, p0, Ll/ܶ᩵ۧ;->ᩳ:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 9

    .line 136
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v0, "\\r?\\n"

    const/4 v1, -0x1

    .line 1090
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 136
    array-length v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    const-string v5, "palette: "

    .line 137
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/16 v5, 0x9

    .line 138
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ","

    .line 1090
    invoke-virtual {v4, v5, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 139
    array-length v5, v4

    new-array v5, v5, [I

    iput-object v5, p0, Ll/ܶ᩵ۧ;->᩻:[I

    const/4 v5, 0x0

    .line 141
    :goto_1
    array-length v6, v4

    if-ge v5, v6, :cond_1

    .line 142
    iget-object v6, p0, Ll/ܶ᩵ۧ;->᩻:[I

    aget-object v7, v4, v5

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x10

    .line 164
    :try_start_0
    invoke-static {v7, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v7
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 v7, 0x0

    .line 142
    :goto_2
    aput v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    const-string v5, "size: "

    .line 144
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x6

    .line 147
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v5, "x"

    .line 1090
    invoke-virtual {v4, v5, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 149
    array-length v5, v4

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    .line 151
    :try_start_1
    aget-object v5, v4, v2

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    iput v5, p0, Ll/ܶ᩵ۧ;->᩷:I

    const/4 v5, 0x1

    .line 152
    aget-object v4, v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, p0, Ll/ܶ᩵ۧ;->ۜ:I

    .line 153
    iput-boolean v5, p0, Ll/ܶ᩵ۧ;->ܳ:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v4

    const-string v5, "Parsing IDX failed"

    .line 155
    invoke-static {v5, v4}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۧ(Ll/ᩳ֨֫;)V
    .locals 11

    .line 171
    iget-object v0, p0, Ll/ܶ᩵ۧ;->᩻:[I

    if-eqz v0, :cond_5

    iget-boolean v1, p0, Ll/ܶ᩵ۧ;->ܳ:Z

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 176
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    const/4 v2, 0x2

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 177
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    .line 182
    :goto_0
    :pswitch_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    if-ge v3, v1, :cond_5

    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    if-lez v3, :cond_5

    .line 183
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    iget-object v4, p0, Ll/ܶ᩵ۧ;->ۧ:[I

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x4

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    .line 283
    :pswitch_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    if-ge v3, v8, :cond_1

    goto/16 :goto_1

    .line 287
    :cond_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v3

    iput v3, p0, Ll/ܶ᩵ۧ;->ܽ:I

    .line 288
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v3

    iput v3, p0, Ll/ܶ᩵ۧ;->ᩳ:I

    goto :goto_0

    .line 259
    :pswitch_2
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    const/4 v4, 0x6

    if-ge v3, v4, :cond_2

    goto/16 :goto_1

    .line 263
    :cond_2
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    .line 264
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    .line 265
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    shl-int/2addr v3, v8

    shr-int/lit8 v6, v4, 0x4

    or-int/2addr v3, v6

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v4, v5

    .line 270
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    .line 271
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    .line 272
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v9

    shl-int/2addr v5, v8

    shr-int/lit8 v8, v6, 0x4

    or-int/2addr v5, v8

    and-int/lit8 v6, v6, 0xf

    shl-int/lit8 v6, v6, 0x8

    or-int/2addr v6, v9

    .line 277
    new-instance v8, Landroid/graphics/Rect;

    add-int/2addr v4, v7

    add-int/2addr v6, v7

    invoke-direct {v8, v3, v5, v4, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v8, p0, Ll/ܶ᩵ۧ;->֫:Landroid/graphics/Rect;

    goto :goto_0

    .line 239
    :pswitch_3
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    if-lt v3, v2, :cond_5

    iget-boolean v3, p0, Ll/ܶ᩵ۧ;->ܿ:Z

    if-nez v3, :cond_3

    goto :goto_1

    .line 243
    :cond_3
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    .line 244
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v8

    .line 246
    aget v9, v4, v6

    shr-int/lit8 v10, v3, 0x4

    invoke-static {v9, v10}, Ll/ܶ᩵ۧ;->֫(II)I

    move-result v9

    aput v9, v4, v6

    .line 247
    aget v6, v4, v2

    and-int/lit8 v3, v3, 0xf

    invoke-static {v6, v3}, Ll/ܶ᩵ۧ;->֫(II)I

    move-result v3

    aput v3, v4, v2

    .line 248
    aget v3, v4, v7

    shr-int/lit8 v6, v8, 0x4

    invoke-static {v3, v6}, Ll/ܶ᩵ۧ;->֫(II)I

    move-result v3

    aput v3, v4, v7

    .line 249
    aget v3, v4, v5

    and-int/lit8 v6, v8, 0xf

    invoke-static {v3, v6}, Ll/ܶ᩵ۧ;->֫(II)I

    move-result v3

    aput v3, v4, v5

    goto/16 :goto_0

    .line 217
    :pswitch_4
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    if-ge v3, v2, :cond_4

    goto :goto_1

    .line 221
    :cond_4
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    .line 222
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v8

    shr-int/lit8 v9, v3, 0x4

    .line 224
    invoke-static {v9, v0}, Ll/ܶ᩵ۧ;->֫(I[I)I

    move-result v9

    aput v9, v4, v6

    and-int/lit8 v3, v3, 0xf

    .line 225
    invoke-static {v3, v0}, Ll/ܶ᩵ۧ;->֫(I[I)I

    move-result v3

    aput v3, v4, v2

    shr-int/lit8 v3, v8, 0x4

    .line 226
    invoke-static {v3, v0}, Ll/ܶ᩵ۧ;->֫(I[I)I

    move-result v3

    aput v3, v4, v7

    and-int/lit8 v3, v8, 0xf

    .line 227
    invoke-static {v3, v0}, Ll/ܶ᩵ۧ;->֫(I[I)I

    move-result v3

    aput v3, v4, v5

    .line 228
    iput-boolean v7, p0, Ll/ܶ᩵ۧ;->ܿ:Z

    goto/16 :goto_0

    :cond_5
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
