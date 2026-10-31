.class public final Ll/۬۫ܳ;
.super Ljava/lang/Object;
.source "J4L7"


# instance fields
.field public volatile ֫:[Ljava/lang/String;

.field public ۧ:[Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    .line 291
    iput-object v0, p0, Ll/۬۫ܳ;->֫:[Ljava/lang/String;

    .line 297
    invoke-virtual {p0, p1}, Ll/۬۫ܳ;->֫(I)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 4

    const/4 v0, 0x4

    new-array v1, v0, [Z

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 306
    invoke-static {}, Ll/ۛ۫ܳ;->ۧ()[I

    move-result-object v3

    aget v3, v3, v2

    and-int/2addr v3, p1

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    aput-boolean v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 329
    :cond_1
    iput-object v1, p0, Ll/۬۫ܳ;->ۧ:[Z

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;[I)V
    .locals 7

    .line 367
    array-length v0, p2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 370
    array-length v0, p2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 371
    :goto_0
    array-length v3, p2

    if-ge v2, v3, :cond_2

    .line 372
    aget v3, p2, v2

    if-ltz v3, :cond_1

    const/4 v4, 0x4

    if-ge v3, v4, :cond_1

    .line 374
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶܺܽ;

    invoke-interface {v4}, Ll/ܶܺܽ;->֫()[B

    move-result-object v4

    invoke-static {v4}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v4

    .line 375
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {}, Ll/ۛ۫ܳ;->֫()[I

    move-result-object v6

    aget v3, v6, v3

    if-ne v5, v3, :cond_0

    .line 378
    aput-object v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 376
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected digest length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 397
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unexpected checksum item index"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 380
    :cond_2
    iget-object p1, p0, Ll/۬۫ܳ;->֫:[Ljava/lang/String;

    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 381
    :goto_1
    array-length v2, p2

    if-ge v1, v2, :cond_3

    .line 382
    aget v2, p2, v1

    aget-object v3, v0, v1

    aput-object v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 384
    :cond_3
    iput-object p1, p0, Ll/۬۫ܳ;->֫:[Ljava/lang/String;

    return-void

    .line 368
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Digest count does not match item count"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()[I
    .locals 6

    .line 346
    iget-object v0, p0, Ll/۬۫ܳ;->֫:[Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x4

    if-ge v2, v4, :cond_1

    .line 349
    iget-object v4, p0, Ll/۬۫ܳ;->ۧ:[Z

    aget-boolean v4, v4, v2

    if-eqz v4, :cond_0

    aget-object v4, v0, v2

    if-nez v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 353
    :cond_1
    new-array v2, v3, [I

    const/4 v3, 0x0

    :goto_1
    if-ge v1, v4, :cond_3

    .line 356
    iget-object v5, p0, Ll/۬۫ܳ;->ۧ:[Z

    aget-boolean v5, v5, v1

    if-eqz v5, :cond_2

    aget-object v5, v0, v1

    if-nez v5, :cond_2

    add-int/lit8 v5, v3, 0x1

    .line 357
    aput v1, v2, v3

    move v3, v5

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object v2
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 1

    .line 339
    iget-object v0, p0, Ll/۬۫ܳ;->֫:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 334
    iget-object v0, p0, Ll/۬۫ܳ;->ۧ:[Z

    aget-boolean p1, v0, p1

    return p1
.end method
