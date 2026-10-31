.class public final Ll/ۚܰᩳ;
.super Ljava/lang/Object;
.source "XAZX"


# instance fields
.field public ֫:[I

.field public ۧ:[C

.field public ܽ:[I

.field public ᩳ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 334
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۚܰᩳ;->֫:[I

    return-void
.end method

.method public static ֫(Ll/ۚܰᩳ;Ll/ۚܰᩳ;)Ll/ۚܰᩳ;
    .locals 9

    .line 361
    new-instance v0, Ll/ۚܰᩳ;

    iget v1, p0, Ll/ۚܰᩳ;->ᩳ:I

    iget v2, p1, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ll/ۚܰᩳ;-><init>(I)V

    .line 362
    iget v1, p0, Ll/ۚܰᩳ;->ᩳ:I

    iget v2, p1, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/ۚܰᩳ;->ᩳ:I

    .line 363
    iget-object v1, p0, Ll/ۚܰᩳ;->֫:[I

    iget-object v2, v0, Ll/ۚܰᩳ;->֫:[I

    iget v3, p0, Ll/ۚܰᩳ;->ᩳ:I

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 364
    iget-object v1, p1, Ll/ۚܰᩳ;->֫:[I

    iget-object v2, v0, Ll/ۚܰᩳ;->֫:[I

    iget v3, p0, Ll/ۚܰᩳ;->ᩳ:I

    iget v5, p1, Ll/ۚܰᩳ;->ᩳ:I

    invoke-static {v1, v4, v2, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 365
    iget v1, p0, Ll/ۚܰᩳ;->ᩳ:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Ll/ۚܰᩳ;->֫(I)I

    move-result v1

    iget v2, p1, Ll/ۚܰᩳ;->ᩳ:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p1, v2}, Ll/ۚܰᩳ;->֫(I)I

    move-result v2

    int-to-long v5, v1

    int-to-long v2, v2

    add-long/2addr v5, v2

    long-to-int v2, v5

    int-to-long v7, v2

    cmp-long v3, v5, v7

    if-nez v3, :cond_4

    if-eqz v2, :cond_3

    .line 367
    iget-object v3, v0, Ll/ۚܰᩳ;->֫:[I

    array-length v3, v3

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [I

    iput-object v3, v0, Ll/ۚܰᩳ;->ܽ:[I

    .line 368
    new-array v3, v2, [C

    iput-object v3, v0, Ll/ۚܰᩳ;->ۧ:[C

    const/4 v3, 0x0

    .line 369
    :goto_0
    iget v5, p0, Ll/ۚܰᩳ;->ᩳ:I

    if-ge v3, v5, :cond_0

    iget-object v5, v0, Ll/ۚܰᩳ;->ܽ:[I

    invoke-virtual {p0, v3}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v6

    aput v6, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 370
    :goto_1
    iget v5, p1, Ll/ۚܰᩳ;->ᩳ:I

    if-ge v3, v5, :cond_1

    iget-object v5, v0, Ll/ۚܰᩳ;->ܽ:[I

    iget v6, p0, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v6, v3

    invoke-virtual {p1, v3}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v7

    add-int/2addr v7, v1

    aput v7, v5, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 371
    :cond_1
    iget-object v3, v0, Ll/ۚܰᩳ;->ܽ:[I

    iget v5, v0, Ll/ۚܰᩳ;->ᩳ:I

    aput v2, v3, v5

    if-eqz v1, :cond_2

    .line 372
    iget-object p0, p0, Ll/ۚܰᩳ;->ۧ:[C

    iget-object v3, v0, Ll/ۚܰᩳ;->ۧ:[C

    invoke-static {p0, v4, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    if-eq v2, v1, :cond_3

    .line 373
    iget-object p0, p1, Ll/ۚܰᩳ;->ۧ:[C

    iget-object p1, v0, Ll/ۚܰᩳ;->ۧ:[C

    sub-int/2addr v2, v1

    invoke-static {p0, v4, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 0
    :cond_4
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 336
    iget-object v0, p0, Ll/ۚܰᩳ;->ܽ:[I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)Ll/ۚܰᩳ;
    .locals 6

    .line 348
    new-instance v0, Ll/ۚܰᩳ;

    sub-int v1, p2, p1

    invoke-direct {v0, v1}, Ll/ۚܰᩳ;-><init>(I)V

    .line 349
    iput v1, v0, Ll/ۚܰᩳ;->ᩳ:I

    .line 350
    iget-object v2, p0, Ll/ۚܰᩳ;->֫:[I

    iget-object v3, v0, Ll/ۚܰᩳ;->֫:[I

    const/4 v4, 0x0

    invoke-static {v2, p1, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 351
    invoke-virtual {p0, p1}, Ll/ۚܰᩳ;->ۧ(I)I

    move-result v1

    if-nez p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p0, p2}, Ll/ۚܰᩳ;->֫(I)I

    move-result p2

    :goto_0
    if-eq p2, v1, :cond_2

    .line 353
    iget-object v2, v0, Ll/ۚܰᩳ;->֫:[I

    array-length v2, v2

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [I

    iput-object v2, v0, Ll/ۚܰᩳ;->ܽ:[I

    .line 354
    :goto_1
    iget v2, v0, Ll/ۚܰᩳ;->ᩳ:I

    if-gt v4, v2, :cond_1

    iget-object v2, v0, Ll/ۚܰᩳ;->ܽ:[I

    iget-object v3, p0, Ll/ۚܰᩳ;->ܽ:[I

    add-int v5, p1, v4

    aget v3, v3, v5

    sub-int/2addr v3, v1

    aput v3, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 355
    :cond_1
    iget-object p1, p0, Ll/ۚܰᩳ;->ۧ:[C

    invoke-static {p1, v1, p2}, Ljava/util/Arrays;->copyOfRange([CII)[C

    move-result-object p1

    iput-object p1, v0, Ll/ۚܰᩳ;->ۧ:[C

    :cond_2
    return-object v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 335
    iget-object v0, p0, Ll/ۚܰᩳ;->ܽ:[I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method
