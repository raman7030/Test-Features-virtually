.class public final Ll/ۗ֫ܳ;
.super Ljava/lang/Object;
.source "A70P"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/۫֫ܳ;

.field public ܽ:I


# virtual methods
.method public final ֫()Ll/۫֫ܳ;
    .locals 2

    .line 345
    iget-boolean v0, p0, Ll/ۗ֫ܳ;->֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 348
    iput-boolean v0, p0, Ll/ۗ֫ܳ;->֫:Z

    .line 349
    iget-object v0, p0, Ll/ۗ֫ܳ;->ۧ:Ll/۫֫ܳ;

    return-object v0

    .line 346
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Dirty builder already built"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(IZ)V
    .locals 6

    .line 306
    iget-boolean v0, p0, Ll/ۗ֫ܳ;->֫:Z

    if-nez v0, :cond_2

    if-lez p1, :cond_1

    .line 312
    iget v0, p0, Ll/ۗ֫ܳ;->ܽ:I

    int-to-long v1, v0

    int-to-long v3, p1

    add-long/2addr v1, v3

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    add-int/2addr v0, p1

    .line 315
    iput v0, p0, Ll/ۗ֫ܳ;->ܽ:I

    .line 316
    iget-object v0, p0, Ll/ۗ֫ܳ;->ۧ:Ll/۫֫ܳ;

    invoke-static {p1, p2}, Ll/ܰ֫ܳ;->ۧ(IZ)Ll/۫֫ܳ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ֫ܳ;->ۧ:Ll/۫֫ܳ;

    return-void

    .line 313
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string p2, "Dirty length overflow"

    invoke-direct {p1, p2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 310
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Dirty run length must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 307
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dirty builder already built"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I[J)V
    .locals 5

    .line 321
    iget-boolean v0, p0, Ll/ۗ֫ܳ;->֫:Z

    if-nez v0, :cond_5

    if-lez p1, :cond_4

    const/high16 v0, 0x10000

    if-gt p1, v0, :cond_4

    .line 324
    array-length v0, p2

    .line 325
    invoke-static {p1}, Ll/ܰ֫ܳ;->֫(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    and-int/lit8 v0, p1, 0x3f

    if-eqz v0, :cond_1

    .line 329
    array-length v1, p2

    add-int/lit8 v1, v1, -0x1

    aget-wide v1, p2, v1

    ushr-long v0, v1, v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    .line 330
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Dirty bitmap has trailing bits"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 332
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۗ֫ܳ;->ܽ:I

    int-to-long v0, v0

    int-to-long v2, p1

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_3

    .line 335
    invoke-static {p1, p2}, Ll/ܰ֫ܳ;->֫(I[J)Ll/۫֫ܳ;

    move-result-object p2

    .line 336
    invoke-virtual {p2}, Ll/۫֫ܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 339
    iget v0, p0, Ll/ۗ֫ܳ;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۗ֫ܳ;->ܽ:I

    .line 340
    iget-object p1, p0, Ll/ۗ֫ܳ;->ۧ:Ll/۫֫ܳ;

    invoke-static {p1, p2}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ֫ܳ;->ۧ:Ll/۫֫ܳ;

    return-void

    .line 337
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Uniform dirty bitmap is not canonical"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 333
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string p2, "Dirty length overflow"

    invoke-direct {p1, p2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 326
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid dirty bitmap"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 322
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dirty builder already built"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
