.class public final Ll/۫ۧܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public ֫:Z

.field public ۜ:I

.field public ۡ:I

.field public ۢ:I

.field public ۧ:J

.field public ܳ:I

.field public ܺ:J

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:I

.field public ᩳ:[I

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5273
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ۧܳ;->ܽ:Ljava/util/ArrayList;

    const/16 v0, 0x100

    new-array v0, v0, [I

    .line 5274
    iput-object v0, p0, Ll/۫ۧܳ;->ᩳ:[I

    const/4 v0, -0x1

    .line 5276
    iput v0, p0, Ll/۫ۧܳ;->ܳ:I

    .line 5281
    iput v0, p0, Ll/۫ۧܳ;->᩻:I

    return-void
.end method

.method private ֫(Ll/ۧᩳܳ;)V
    .locals 10

    .line 5411
    invoke-virtual {p1}, Ll/ۧᩳܳ;->ۧ()J

    move-result-wide v0

    const-wide/16 v2, 0x18

    invoke-static {v0, v1, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 5412
    iget-wide v2, p0, Ll/۫ۧܳ;->ܺ:J

    invoke-static {v2, v3, v0, v1}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 5413
    iget-object v2, p0, Ll/۫ۧܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    .line 5414
    iget-wide v4, p0, Ll/۫ۧܳ;->ۧ:J

    .line 5415
    invoke-virtual {p1}, Ll/ۧᩳܳ;->֫()J

    move-result-wide v6

    .line 5414
    invoke-static {v4, v5, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v4

    .line 5416
    invoke-static {v3, v4, v5}, Ll/ᩳܽܳ;->֫(IJ)J

    move-result-wide v6

    const-wide/32 v8, 0x4000000

    cmp-long v3, v0, v8

    if-gtz v3, :cond_0

    cmp-long v3, v6, v8

    if-gtz v3, :cond_0

    .line 5422
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5423
    iput-wide v0, p0, Ll/۫ۧܳ;->ܺ:J

    .line 5424
    iput-wide v4, p0, Ll/۫ۧܳ;->ۧ:J

    return-void

    .line 5420
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Replacement match index exceeds memory limit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۧ()V
    .locals 2

    .line 5401
    iget v0, p0, Ll/۫ۧܳ;->ܿ:I

    if-nez v0, :cond_0

    return-void

    .line 5404
    :cond_0
    iget-object v1, p0, Ll/۫ۧܳ;->ᩳ:[I

    invoke-static {v0, v1}, Ll/ۧᩳܳ;->֫(I[I)Ll/ۧᩳܳ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/۫ۧܳ;->֫(Ll/ۧᩳܳ;)V

    const/4 v0, 0x0

    .line 5405
    iput v0, p0, Ll/۫ۧܳ;->ܿ:I

    const/4 v0, -0x1

    .line 5406
    iput v0, p0, Ll/۫ۧܳ;->ܳ:I

    return-void
.end method

.method private ܽ()V
    .locals 8

    .line 5369
    iget v0, p0, Ll/۫ۧܳ;->ۜ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x3

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    .line 5373
    invoke-direct {p0}, Ll/۫ۧܳ;->ۧ()V

    .line 5374
    iget v0, p0, Ll/۫ۧܳ;->᩷:I

    iget v1, p0, Ll/۫ۧܳ;->ۡ:I

    iget v3, p0, Ll/۫ۧܳ;->ۜ:I

    invoke-static {v0, v1, v3}, Ll/ۧᩳܳ;->֫(III)Ll/ܽᩳܳ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/۫ۧܳ;->֫(Ll/ۧᩳܳ;)V

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    .line 5377
    :cond_2
    iget v0, p0, Ll/۫ۧܳ;->ۡ:I

    :goto_0
    const/4 v3, 0x0

    .line 5378
    :goto_1
    iget v4, p0, Ll/۫ۧܳ;->ۜ:I

    if-ge v3, v4, :cond_5

    .line 5379
    iget v4, p0, Ll/۫ۧܳ;->᩷:I

    mul-int v5, v3, v0

    add-int/2addr v5, v4

    ushr-int/lit8 v4, v5, 0x10

    .line 5388
    iget v6, p0, Ll/۫ۧܳ;->ܿ:I

    if-eqz v6, :cond_3

    iget v6, p0, Ll/۫ۧܳ;->ܳ:I

    if-eq v4, v6, :cond_3

    .line 5389
    invoke-direct {p0}, Ll/۫ۧܳ;->ۧ()V

    .line 5391
    :cond_3
    iput v4, p0, Ll/۫ۧܳ;->ܳ:I

    .line 5392
    iget v4, p0, Ll/۫ۧܳ;->ܿ:I

    iget-object v6, p0, Ll/۫ۧܳ;->ᩳ:[I

    array-length v7, v6

    if-ne v4, v7, :cond_4

    .line 5393
    array-length v4, v6

    shl-int/2addr v4, v1

    const/high16 v7, 0x10000

    .line 5394
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 5393
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    iput-object v4, p0, Ll/۫ۧܳ;->ᩳ:[I

    .line 5396
    :cond_4
    iget-object v4, p0, Ll/۫ۧܳ;->ᩳ:[I

    iget v6, p0, Ll/۫ۧܳ;->ܿ:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Ll/۫ۧܳ;->ܿ:I

    aput v5, v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 5382
    :cond_5
    :goto_2
    iput v2, p0, Ll/۫ۧܳ;->ۜ:I

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 6

    .line 5350
    iget v0, p0, Ll/۫ۧܳ;->ۜ:I

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x10

    .line 5351
    :goto_0
    iget-object v2, p0, Ll/۫ۧܳ;->ᩳ:[I

    array-length v2, v2

    int-to-long v2, v2

    const-wide/16 v4, 0x4

    mul-long v2, v2, v4

    .line 5352
    iget-wide v4, p0, Ll/۫ۧܳ;->ܺ:J

    .line 5353
    invoke-static {v0, v1, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 5352
    invoke-static {v4, v5, v0, v1}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v0

    .line 5354
    iget-object v2, p0, Ll/۫ۧܳ;->ܽ:Ljava/util/ArrayList;

    .line 5355
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-wide v3, p0, Ll/۫ۧܳ;->ۧ:J

    .line 5354
    invoke-static {v2, v3, v4}, Ll/ᩳܽܳ;->֫(IJ)J

    move-result-wide v2

    .line 5356
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Ll/ܿۖ᩷;)Ll/۬ۧܳ;
    .locals 9

    .line 5324
    iget-boolean v0, p0, Ll/۫ۧܳ;->֫:Z

    if-nez v0, :cond_5

    if-eqz p1, :cond_1

    .line 5327
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5328
    :cond_0
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 5330
    iput-boolean v0, p0, Ll/۫ۧܳ;->֫:Z

    .line 5331
    invoke-direct {p0}, Ll/۫ۧܳ;->ܽ()V

    .line 5332
    invoke-direct {p0}, Ll/۫ۧܳ;->ۧ()V

    .line 5333
    iget-object v0, p0, Ll/۫ۧܳ;->ܽ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ۧᩳܳ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ll/ۧᩳܳ;

    .line 5334
    array-length v0, v3

    new-array v4, v0, [J

    const-wide/16 v5, 0x0

    .line 5336
    :goto_1
    array-length v0, v3

    if-ge v1, v0, :cond_4

    and-int/lit16 v0, v1, 0xff

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    .line 5337
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 5338
    :cond_2
    new-instance p1, Ll/᩻ܽܳ;

    invoke-direct {p1}, Ll/᩻ܽܳ;-><init>()V

    throw p1

    .line 5340
    :cond_3
    :goto_2
    aget-object v0, v3, v1

    invoke-virtual {v0}, Ll/ۧᩳܳ;->ܽ()I

    move-result v0

    int-to-long v7, v0

    add-long/2addr v5, v7

    .line 5341
    aput-wide v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 5343
    :cond_4
    array-length p1, v3

    iget-wide v0, p0, Ll/۫ۧܳ;->ۧ:J

    invoke-static {p1, v0, v1}, Ll/ᩳܽܳ;->֫(IJ)J

    move-result-wide v7

    .line 5345
    new-instance p1, Ll/۬ۧܳ;

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Ll/۬ۧܳ;-><init>([Ll/ۧᩳܳ;[JJJ)V

    return-object p1

    .line 5325
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recipe index already built"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(III)V
    .locals 12

    .line 5288
    iget-boolean v0, p0, Ll/۫ۧܳ;->֫:Z

    if-nez v0, :cond_5

    if-ltz p1, :cond_5

    if-lez p2, :cond_5

    if-lez p3, :cond_5

    iget v0, p0, Ll/۫ۧܳ;->᩻:I

    if-le p1, v0, :cond_5

    int-to-long v0, p1

    int-to-long v2, p2

    add-int/lit8 v4, p3, -0x1

    int-to-long v5, v4

    mul-long v5, v5, v2

    add-long/2addr v5, v0

    const-wide/32 v7, 0x7fffffff

    cmp-long v9, v5, v7

    if-gtz v9, :cond_5

    .line 5293
    iget v5, p0, Ll/۫ۧܳ;->ۜ:I

    const/4 v6, 0x0

    const/4 v9, 0x1

    if-nez v5, :cond_1

    .line 5361
    iput p1, p0, Ll/۫ۧܳ;->᩷:I

    mul-int v0, v4, p2

    add-int/2addr v0, p1

    .line 5362
    iput v0, p0, Ll/۫ۧܳ;->ۢ:I

    if-ne p3, v9, :cond_0

    goto :goto_0

    :cond_0
    move v6, p2

    .line 5363
    :goto_0
    iput v6, p0, Ll/۫ۧܳ;->ۡ:I

    .line 5364
    iput p3, p0, Ll/۫ۧܳ;->ۜ:I

    goto :goto_3

    .line 5296
    :cond_1
    iget v10, p0, Ll/۫ۧܳ;->ۢ:I

    int-to-long v10, v10

    sub-long/2addr v0, v10

    if-ne v5, v9, :cond_2

    cmp-long v10, v0, v2

    if-nez v10, :cond_3

    goto :goto_1

    .line 5299
    :cond_2
    iget v2, p0, Ll/۫ۧܳ;->ۡ:I

    int-to-long v10, v2

    cmp-long v3, v0, v10

    if-nez v3, :cond_3

    if-ne p2, v2, :cond_3

    :goto_1
    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    int-to-long v1, v5

    int-to-long v10, p3

    add-long/2addr v1, v10

    if-eqz v0, :cond_4

    cmp-long v0, v1, v7

    if-gtz v0, :cond_4

    .line 5302
    iput p2, p0, Ll/۫ۧܳ;->ۡ:I

    long-to-int p3, v1

    .line 5303
    iput p3, p0, Ll/۫ۧܳ;->ۜ:I

    mul-int p3, p2, v4

    add-int/2addr p3, p1

    .line 5304
    iput p3, p0, Ll/۫ۧܳ;->ۢ:I

    goto :goto_3

    .line 5306
    :cond_4
    invoke-direct {p0}, Ll/۫ۧܳ;->ܽ()V

    .line 5361
    iput p1, p0, Ll/۫ۧܳ;->᩷:I

    mul-int v0, v4, p2

    add-int/2addr v0, p1

    .line 5362
    iput v0, p0, Ll/۫ۧܳ;->ۢ:I

    if-ne p3, v9, :cond_0

    goto :goto_0

    :goto_3
    mul-int p2, p2, v4

    add-int/2addr p2, p1

    .line 5310
    iput p2, p0, Ll/۫ۧܳ;->᩻:I

    return-void

    .line 5291
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid replacement match run"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
