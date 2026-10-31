.class public final Ll/᩺۫ۡ;
.super Ljava/lang/Object;
.source "B2S5"


# instance fields
.field public ֫:I

.field public ۜ:I

.field public final synthetic ۢ:Ll/ܰ۫ۡ;

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܰ۫ۡ;II)V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺۫ۡ;->ۢ:Ll/ܰ۫ۡ;

    .line 205
    iput p2, p0, Ll/᩺۫ۡ;->֫:I

    .line 206
    iput p3, p0, Ll/᩺۫ۡ;->᩷:I

    .line 207
    invoke-virtual {p0}, Ll/᩺۫ۡ;->ۧ()V

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 3

    .line 220
    iget v0, p0, Ll/᩺۫ۡ;->᩷:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Ll/᩺۫ۡ;->֫:I

    sub-int/2addr v0, v2

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 13

    .line 227
    iget-object v0, p0, Ll/᩺۫ۡ;->ۢ:Ll/ܰ۫ۡ;

    iget-object v1, v0, Ll/ܰ۫ۡ;->֫:[I

    .line 228
    iget-object v0, v0, Ll/ܰ۫ۡ;->ۧ:[I

    const v2, 0x7fffffff

    .line 237
    iget v3, p0, Ll/᩺۫ۡ;->֫:I

    const v4, 0x7fffffff

    const v5, 0x7fffffff

    const/high16 v6, -0x80000000

    const/high16 v7, -0x80000000

    const/high16 v8, -0x80000000

    const/4 v9, 0x0

    :goto_0
    iget v10, p0, Ll/᩺۫ۡ;->᩷:I

    if-gt v3, v10, :cond_6

    .line 238
    aget v10, v1, v3

    .line 239
    aget v11, v0, v10

    add-int/2addr v9, v11

    shr-int/lit8 v11, v10, 0xa

    and-int/lit8 v11, v11, 0x1f

    shr-int/lit8 v12, v10, 0x5

    and-int/lit8 v12, v12, 0x1f

    and-int/lit8 v10, v10, 0x1f

    if-le v11, v6, :cond_0

    move v6, v11

    :cond_0
    if-ge v11, v2, :cond_1

    move v2, v11

    :cond_1
    if-le v12, v7, :cond_2

    move v7, v12

    :cond_2
    if-ge v12, v4, :cond_3

    move v4, v12

    :cond_3
    if-le v10, v8, :cond_4

    move v8, v10

    :cond_4
    if-ge v10, v5, :cond_5

    move v5, v10

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 264
    :cond_6
    iput v2, p0, Ll/᩺۫ۡ;->᩻:I

    .line 265
    iput v6, p0, Ll/᩺۫ۡ;->ᩳ:I

    .line 266
    iput v4, p0, Ll/᩺۫ۡ;->ܳ:I

    .line 267
    iput v7, p0, Ll/᩺۫ۡ;->ܽ:I

    .line 268
    iput v5, p0, Ll/᩺۫ۡ;->ܿ:I

    .line 269
    iput v8, p0, Ll/᩺۫ۡ;->ۧ:I

    .line 270
    iput v9, p0, Ll/᩺۫ۡ;->ۜ:I

    return-void
.end method

.method public final ܽ()Ll/ۛ۠ۧ;
    .locals 10

    .line 354
    iget-object v0, p0, Ll/᩺۫ۡ;->ۢ:Ll/ܰ۫ۡ;

    iget-object v1, v0, Ll/ܰ۫ۡ;->֫:[I

    .line 355
    iget-object v0, v0, Ll/ܰ۫ۡ;->ۧ:[I

    const/4 v2, 0x0

    .line 361
    iget v3, p0, Ll/᩺۫ۡ;->֫:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    iget v7, p0, Ll/᩺۫ۡ;->᩷:I

    if-gt v3, v7, :cond_0

    .line 362
    aget v7, v1, v3

    .line 363
    aget v8, v0, v7

    add-int/2addr v4, v8

    shr-int/lit8 v9, v7, 0xa

    and-int/lit8 v9, v9, 0x1f

    mul-int v9, v9, v8

    add-int/2addr v2, v9

    shr-int/lit8 v9, v7, 0x5

    and-int/lit8 v9, v9, 0x1f

    mul-int v9, v9, v8

    add-int/2addr v5, v9

    and-int/lit8 v7, v7, 0x1f

    mul-int v8, v8, v7

    add-int/2addr v6, v8

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    int-to-float v0, v2

    int-to-float v1, v4

    div-float/2addr v0, v1

    .line 371
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v2, v5

    div-float/2addr v2, v1

    .line 372
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v3, v6

    div-float/2addr v3, v1

    .line 373
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 375
    new-instance v3, Ll/ۛ۠ۧ;

    invoke-static {v0, v2, v1}, Ll/ܰ۫ۡ;->֫(III)I

    move-result v0

    invoke-direct {v3, v0, v4}, Ll/ۛ۠ۧ;-><init>(II)V

    return-object v3
.end method

.method public final ܿ()Ll/᩺۫ۡ;
    .locals 9

    .line 279
    invoke-virtual {p0}, Ll/᩺۫ۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 299
    iget v0, p0, Ll/᩺۫ۡ;->ᩳ:I

    iget v1, p0, Ll/᩺۫ۡ;->᩻:I

    sub-int/2addr v0, v1

    .line 300
    iget v1, p0, Ll/᩺۫ۡ;->ܽ:I

    iget v2, p0, Ll/᩺۫ۡ;->ܳ:I

    sub-int/2addr v1, v2

    .line 301
    iget v2, p0, Ll/᩺۫ۡ;->ۧ:I

    iget v3, p0, Ll/᩺۫ۡ;->ܿ:I

    sub-int/2addr v2, v3

    if-lt v0, v1, :cond_0

    if-lt v0, v2, :cond_0

    const/4 v0, -0x3

    goto :goto_0

    :cond_0
    if-lt v1, v0, :cond_1

    if-lt v1, v2, :cond_1

    const/4 v0, -0x2

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 323
    :goto_0
    iget-object v1, p0, Ll/᩺۫ۡ;->ۢ:Ll/ܰ۫ۡ;

    iget-object v2, v1, Ll/ܰ۫ۡ;->֫:[I

    .line 324
    iget-object v3, v1, Ll/ܰ۫ۡ;->ۧ:[I

    .line 329
    iget v4, p0, Ll/᩺۫ۡ;->᩷:I

    iget v5, p0, Ll/᩺۫ۡ;->֫:I

    invoke-static {v0, v5, v4, v2}, Ll/ܰ۫ۡ;->֫(III[I)V

    .line 332
    iget v4, p0, Ll/᩺۫ۡ;->᩷:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v2, v5, v4}, Ljava/util/Arrays;->sort([III)V

    .line 335
    iget v4, p0, Ll/᩺۫ۡ;->᩷:I

    invoke-static {v0, v5, v4, v2}, Ll/ܰ۫ۡ;->֫(III[I)V

    .line 337
    iget v0, p0, Ll/᩺۫ۡ;->ۜ:I

    div-int/lit8 v0, v0, 0x2

    const/4 v4, 0x0

    move v6, v5

    .line 338
    :goto_1
    iget v7, p0, Ll/᩺۫ۡ;->᩷:I

    if-gt v6, v7, :cond_3

    .line 339
    aget v8, v2, v6

    aget v8, v3, v8

    add-int/2addr v4, v8

    if-lt v4, v0, :cond_2

    add-int/lit8 v7, v7, -0x1

    .line 343
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 286
    :cond_3
    :goto_2
    new-instance v0, Ll/᩺۫ۡ;

    add-int/lit8 v2, v5, 0x1

    iget v3, p0, Ll/᩺۫ۡ;->᩷:I

    invoke-direct {v0, v1, v2, v3}, Ll/᩺۫ۡ;-><init>(Ll/ܰ۫ۡ;II)V

    .line 289
    iput v5, p0, Ll/᩺۫ۡ;->᩷:I

    .line 290
    invoke-virtual {p0}, Ll/᩺۫ۡ;->ۧ()V

    return-object v0

    .line 280
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not split a box with only 1 color"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()I
    .locals 3

    .line 211
    iget v0, p0, Ll/᩺۫ۡ;->ᩳ:I

    iget v1, p0, Ll/᩺۫ۡ;->᩻:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ll/᩺۫ۡ;->ܽ:I

    iget v2, p0, Ll/᩺۫ۡ;->ܳ:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    mul-int v1, v1, v0

    iget v0, p0, Ll/᩺۫ۡ;->ۧ:I

    iget v2, p0, Ll/᩺۫ۡ;->ܿ:I

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x1

    mul-int v0, v0, v1

    return v0
.end method
