.class public final Ll/ۡ֨ۖ;
.super Ljava/lang/Object;
.source "49PE"


# static fields
.field public static final ܳ:Ll/ۡ֨ۖ;


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:I

.field public ܿ:[I

.field public ᩳ:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 29
    new-instance v0, Ll/ۡ֨ۖ;

    const/4 v1, 0x0

    new-array v2, v1, [I

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3, v1}, Ll/ۡ֨ۖ;-><init>(I[I[Ljava/lang/Object;Z)V

    sput-object v0, Ll/ۡ֨ۖ;->ܳ:Ll/ۡ֨ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/16 v0, 0x8

    new-array v1, v0, [I

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 76
    invoke-direct {p0, v3, v1, v0, v2}, Ll/ۡ֨ۖ;-><init>(I[I[Ljava/lang/Object;Z)V

    return-void
.end method

.method public constructor <init>(I[I[Ljava/lang/Object;Z)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 69
    iput v0, p0, Ll/ۡ֨ۖ;->ܽ:I

    .line 81
    iput p1, p0, Ll/ۡ֨ۖ;->֫:I

    .line 82
    iput-object p2, p0, Ll/ۡ֨ۖ;->ܿ:[I

    .line 83
    iput-object p3, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    .line 84
    iput-boolean p4, p0, Ll/ۡ֨ۖ;->ۧ:Z

    return-void
.end method

.method public static ֫(Ll/ۡ֨ۖ;Ll/ۡ֨ۖ;)Ll/ۡ֨ۖ;
    .locals 6

    .line 51
    iget v0, p0, Ll/ۡ֨ۖ;->֫:I

    iget v1, p1, Ll/ۡ֨ۖ;->֫:I

    add-int/2addr v0, v1

    .line 52
    iget-object v1, p0, Ll/ۡ֨ۖ;->ܿ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    .line 53
    iget-object v2, p1, Ll/ۡ֨ۖ;->ܿ:[I

    iget v3, p0, Ll/ۡ֨ۖ;->֫:I

    iget v4, p1, Ll/ۡ֨ۖ;->֫:I

    const/4 v5, 0x0

    invoke-static {v2, v5, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    .line 55
    iget-object v3, p1, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    iget p0, p0, Ll/ۡ֨ۖ;->֫:I

    iget p1, p1, Ll/ۡ֨ۖ;->֫:I

    invoke-static {v3, v5, v2, p0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    new-instance p0, Ll/ۡ֨ۖ;

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, v2, p1}, Ll/ۡ֨ۖ;-><init>(I[I[Ljava/lang/Object;Z)V

    return-object p0
.end method

.method private ֫(I)V
    .locals 3

    .line 379
    iget-object v0, p0, Ll/ۡ֨ۖ;->ܿ:[I

    array-length v1, v0

    if-le p1, v1, :cond_2

    .line 381
    iget v1, p0, Ll/ۡ֨ۖ;->֫:I

    div-int/lit8 v2, v1, 0x2

    add-int/2addr v2, v1

    if-ge v2, p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    const/16 v1, 0x8

    if-ge p1, v1, :cond_1

    const/16 p1, 0x8

    .line 393
    :cond_1
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۡ֨ۖ;->ܿ:[I

    .line 394
    iget-object v0, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public static ܿ()Ll/ۡ֨ۖ;
    .locals 1

    .line 43
    new-instance v0, Ll/ۡ֨ۖ;

    invoke-direct {v0}, Ll/ۡ֨ۖ;-><init>()V

    return-object v0
.end method

.method public static ᩳ()Ll/ۡ֨ۖ;
    .locals 1

    .line 38
    sget-object v0, Ll/ۡ֨ۖ;->ܳ:Ll/ۡ֨ۖ;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 311
    :cond_1
    instance-of v2, p1, Ll/ۡ֨ۖ;

    if-nez v2, :cond_2

    return v1

    .line 315
    :cond_2
    check-cast p1, Ll/ۡ֨ۖ;

    .line 316
    iget v2, p0, Ll/ۡ֨ۖ;->֫:I

    iget v3, p1, Ll/ۡ֨ۖ;->֫:I

    if-ne v2, v3, :cond_7

    iget-object v3, p0, Ll/ۡ֨ۖ;->ܿ:[I

    iget-object v4, p1, Ll/ۡ֨ۖ;->ܿ:[I

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_4

    .line 285
    aget v6, v3, v5

    aget v7, v4, v5

    if-eq v6, v7, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 317
    :cond_4
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    iget-object p1, p1, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    iget v3, p0, Ll/ۡ֨ۖ;->֫:I

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_6

    .line 294
    aget-object v5, v2, v4

    aget-object v6, p1, v4

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    return v0

    :cond_7
    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 8

    .line 345
    iget v0, p0, Ll/ۡ֨ۖ;->֫:I

    add-int/lit16 v1, v0, 0x20f

    mul-int/lit8 v1, v1, 0x1f

    .line 346
    iget-object v2, p0, Ll/ۡ֨ۖ;->ܿ:[I

    const/16 v3, 0x11

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x11

    :goto_0
    if-ge v5, v0, :cond_0

    mul-int/lit8 v6, v6, 0x1f

    .line 328
    aget v7, v2, v5

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v1, v6

    mul-int/lit8 v1, v1, 0x1f

    .line 347
    iget-object v0, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    iget v2, p0, Ll/ۡ֨ۖ;->֫:I

    :goto_1
    if-ge v4, v2, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    .line 336
    aget-object v5, v0, v4

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    add-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/2addr v1, v3

    return v1
.end method

.method public final ֫()I
    .locals 6

    .line 246
    iget v0, p0, Ll/ۡ֨ۖ;->ܽ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 252
    :goto_0
    iget v2, p0, Ll/ۡ֨ۖ;->֫:I

    if-ge v0, v2, :cond_6

    .line 253
    iget-object v2, p0, Ll/ۡ֨ۖ;->ܿ:[I

    aget v2, v2, v0

    ushr-int/lit8 v3, v2, 0x3

    and-int/lit8 v2, v2, 0x7

    if-eqz v2, :cond_5

    const/4 v4, 0x1

    if-eq v2, v4, :cond_4

    const/4 v4, 0x2

    if-eq v2, v4, :cond_3

    const/4 v4, 0x3

    if-eq v2, v4, :cond_2

    const/4 v4, 0x5

    if-ne v2, v4, :cond_1

    .line 260
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ll/ܳ᩷ۖ;->ܿ(I)I

    move-result v2

    goto :goto_1

    .line 274
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Ll/֫᩵ۖ;->ܿ()Ll/۟ᩴۖ;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 270
    :cond_2
    invoke-static {v3}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    iget-object v3, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v3, v3, v0

    check-cast v3, Ll/ۡ֨ۖ;

    .line 271
    invoke-virtual {v3}, Ll/ۡ֨ۖ;->֫()I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v3, v1

    move v1, v3

    goto :goto_2

    .line 266
    :cond_3
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Ll/ۛۜۖ;

    invoke-static {v3, v2}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v2

    goto :goto_1

    .line 263
    :cond_4
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    invoke-static {v3}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x8

    goto :goto_1

    .line 257
    :cond_5
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v2

    :goto_1
    add-int/2addr v2, v1

    move v1, v2

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 278
    :cond_6
    iput v1, p0, Ll/ۡ֨ۖ;->ܽ:I

    return v1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 2

    .line 100
    iget-boolean v0, p0, Ll/ۡ֨ۖ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 370
    iget v0, p0, Ll/ۡ֨ۖ;->֫:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Ll/ۡ֨ۖ;->֫(I)V

    .line 372
    iget-object v0, p0, Ll/ۡ֨ۖ;->ܿ:[I

    iget v1, p0, Ll/ۡ֨ۖ;->֫:I

    aput p1, v0, v1

    .line 373
    iget-object p1, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 374
    iput v1, p0, Ll/ۡ֨ۖ;->֫:I

    return-void

    .line 101
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 3

    const/4 v0, 0x0

    .line 361
    :goto_0
    iget v1, p0, Ll/ۡ֨ۖ;->֫:I

    if-ge v0, v1, :cond_0

    .line 362
    iget-object v1, p0, Ll/ۡ֨ۖ;->ܿ:[I

    aget v1, v1, v0

    ushr-int/lit8 v1, v1, 0x3

    .line 363
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {p1, p2, v1, v2}, Ll/ۖ֡ۖ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۜ۠ۖ;)V
    .locals 4

    .line 152
    move-object v0, p1

    check-cast v0, Ll/᩻᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    sget-object v0, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    .line 152
    sget-object v1, Ll/᩻۠ۖ;->᩶:Ll/᩻۠ۖ;

    if-ne v0, v1, :cond_0

    .line 154
    iget v0, p0, Ll/ۡ֨ۖ;->֫:I

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 155
    iget-object v1, p0, Ll/ۡ֨ۖ;->ܿ:[I

    aget v1, v1, v0

    ushr-int/lit8 v1, v1, 0x3

    .line 156
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    move-object v3, p1

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v1, v2}, Ll/᩻᩷ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 160
    :goto_1
    iget v1, p0, Ll/ۡ֨ۖ;->֫:I

    if-ge v0, v1, :cond_1

    .line 161
    iget-object v1, p0, Ll/ۡ֨ۖ;->ܿ:[I

    aget v1, v1, v0

    ushr-int/lit8 v1, v1, 0x3

    .line 162
    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    move-object v3, p1

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v1, v2}, Ll/᩻᩷ۖ;->ܽ(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۡ֨ۖ;)V
    .locals 6

    .line 482
    sget-object v0, Ll/ۡ֨ۖ;->ܳ:Ll/ۡ֨ۖ;

    invoke-virtual {p1, v0}, Ll/ۡ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 100
    :cond_0
    iget-boolean v0, p0, Ll/ۡ֨ۖ;->ۧ:Z

    if-eqz v0, :cond_1

    .line 487
    iget v0, p0, Ll/ۡ֨ۖ;->֫:I

    iget v1, p1, Ll/ۡ֨ۖ;->֫:I

    add-int/2addr v0, v1

    .line 488
    invoke-direct {p0, v0}, Ll/ۡ֨ۖ;->֫(I)V

    .line 489
    iget-object v1, p1, Ll/ۡ֨ۖ;->ܿ:[I

    iget-object v2, p0, Ll/ۡ֨ۖ;->ܿ:[I

    iget v3, p0, Ll/ۡ֨ۖ;->֫:I

    iget v4, p1, Ll/ۡ֨ۖ;->֫:I

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 490
    iget-object v1, p1, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    iget-object v2, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    iget v3, p0, Ll/ۡ֨ۖ;->֫:I

    iget p1, p1, Ll/ۡ֨ۖ;->֫:I

    invoke-static {v1, v5, v2, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 491
    iput v0, p0, Ll/ۡ֨ۖ;->֫:I

    return-void

    .line 101
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۧ()I
    .locals 7

    .line 222
    iget v0, p0, Ll/ۡ֨ۖ;->ܽ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 228
    :goto_0
    iget v2, p0, Ll/ۡ֨ۖ;->֫:I

    if-ge v0, v2, :cond_1

    .line 229
    iget-object v2, p0, Ll/ۡ֨ۖ;->ܿ:[I

    aget v2, v2, v0

    const/4 v3, 0x3

    ushr-int/2addr v2, v3

    .line 231
    iget-object v4, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v4, v4, v0

    check-cast v4, Ll/ۛۜۖ;

    const/4 v5, 0x1

    .line 668
    invoke-static {v5}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v5

    const/4 v6, 0x2

    mul-int/lit8 v5, v5, 0x2

    .line 669
    invoke-static {v6, v2}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v2

    add-int/2addr v2, v5

    .line 670
    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 235
    :cond_1
    iput v1, p0, Ll/ۡ֨ۖ;->ܽ:I

    return v1
.end method

.method public final ۧ(Ll/ۜ۠ۖ;)V
    .locals 6

    .line 169
    iget v0, p0, Ll/ۡ֨ۖ;->֫:I

    if-nez v0, :cond_0

    goto :goto_2

    .line 174
    :cond_0
    move-object v0, p1

    check-cast v0, Ll/᩻᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    sget-object v1, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    const/4 v1, 0x0

    .line 175
    :goto_0
    iget v2, p0, Ll/ۡ֨ۖ;->֫:I

    if-ge v1, v2, :cond_6

    .line 176
    iget-object v2, p0, Ll/ۡ֨ۖ;->ܿ:[I

    aget v2, v2, v1

    iget-object v3, p0, Ll/ۡ֨ۖ;->ᩳ:[Ljava/lang/Object;

    aget-object v3, v3, v1

    ushr-int/lit8 v4, v2, 0x3

    and-int/lit8 v2, v2, 0x7

    if-eqz v2, :cond_5

    const/4 v5, 0x1

    if-eq v2, v5, :cond_4

    const/4 v5, 0x2

    if-eq v2, v5, :cond_3

    const/4 v5, 0x3

    if-eq v2, v5, :cond_2

    const/4 v5, 0x5

    if-ne v2, v5, :cond_1

    .line 192
    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v4, v2}, Ll/᩻᩷ۖ;->ۧ(II)V

    goto :goto_1

    .line 213
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-static {}, Ll/֫᩵ۖ;->ܿ()Ll/۟ᩴۖ;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 201
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    sget-object v2, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    .line 202
    invoke-virtual {v0, v4}, Ll/᩻᩷ۖ;->ۧ(I)V

    .line 203
    check-cast v3, Ll/ۡ֨ۖ;

    invoke-virtual {v3, p1}, Ll/ۡ֨ۖ;->ۧ(Ll/ۜ۠ۖ;)V

    .line 204
    invoke-virtual {v0, v4}, Ll/᩻᩷ۖ;->֫(I)V

    goto :goto_1

    .line 198
    :cond_3
    check-cast v3, Ll/ۛۜۖ;

    invoke-virtual {v0, v4, v3}, Ll/᩻᩷ۖ;->֫(ILl/ۛۜۖ;)V

    goto :goto_1

    .line 195
    :cond_4
    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v4, v2, v3}, Ll/᩻᩷ۖ;->֫(IJ)V

    goto :goto_1

    .line 189
    :cond_5
    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v4, v2, v3}, Ll/᩻᩷ۖ;->ۧ(IJ)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    :goto_2
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 93
    iget-boolean v0, p0, Ll/ۡ֨ۖ;->ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 94
    iput-boolean v0, p0, Ll/ۡ֨ۖ;->ۧ:Z

    :cond_0
    return-void
.end method
