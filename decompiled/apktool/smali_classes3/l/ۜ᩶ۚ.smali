.class public final Ll/ۜ᩶ۚ;
.super Ll/᩻᩶ۚ;
.source "M664"


# instance fields
.field public ֡:Ll/ۗ᩶ۚ;

.field public ֨:Ll/۟᩹ۚ;

.field public ۖ:I

.field public ۗ:I

.field public ۘ:[I

.field public ۙ:I

.field public ۚ:Ll/۟᩹ۚ;

.field public ۛ:I

.field public ۜ:Ll/ܽ᩶ۚ;

.field public ۟:I

.field public ۠:Ll/۟᩹ۚ;

.field public ۡ:Ll/ۗ᩶ۚ;

.field public ۢ:Ll/᩸᩶ۚ;

.field public ۤ:I

.field public ۨ:I

.field public ۫:Ll/ᩳ᩶ۚ;

.field public ۬:I

.field public ܰ:I

.field public ܳ:I

.field public ܶ:Ll/۟᩹ۚ;

.field public ܺ:Ll/ᩳ᩶ۚ;

.field public ܽ:I

.field public ܿ:Ll/ᩳ᩶ۚ;

.field public ᩳ:I

.field public ᩴ:Ll/ᩴ᩶ۚ;

.field public ᩵:Ll/᩸᩶ۚ;

.field public ᩶:Ll/ᩳ᩶ۚ;

.field public ᩷:Ll/ᩴ᩶ۚ;

.field public ᩸:Ll/᩶᩶ۚ;

.field public ᩹:I

.field public final ᩺:Ll/ۛ᩶ۚ;

.field public ᩻:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, v0}, Ll/᩻᩶ۚ;-><init>(Ll/᩻᩶ۚ;)V

    .line 266
    new-instance v0, Ll/ۛ᩶ۚ;

    invoke-direct {v0, p0}, Ll/ۛ᩶ۚ;-><init>(Ll/ۜ᩶ۚ;)V

    iput-object v0, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    const/4 p1, 0x4

    .line 1031
    iput p1, p0, Ll/ۜ᩶ۚ;->ᩳ:I

    return-void

    :cond_0
    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_1

    .line 1033
    iput v0, p0, Ll/ۜ᩶ۚ;->ᩳ:I

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 1035
    iput p1, p0, Ll/ۜ᩶ۚ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll/ۘ᩶ۚ;
    .locals 8

    .line 446
    new-instance v7, Ll/ᩴ᩶ۚ;

    iget-object v1, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    move-object v0, v7

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ll/ᩴ᩶ۚ;-><init>(Ll/ۛ᩶ۚ;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 448
    iget-object p1, p0, Ll/ۜ᩶ۚ;->᩷:Ll/ᩴ᩶ۚ;

    if-nez p1, :cond_0

    .line 449
    iput-object v7, p0, Ll/ۜ᩶ۚ;->᩷:Ll/ᩴ᩶ۚ;

    goto :goto_0

    .line 451
    :cond_0
    iget-object p1, p0, Ll/ۜ᩶ۚ;->ᩴ:Ll/ᩴ᩶ۚ;

    iput-object v7, p1, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    .line 453
    :goto_0
    iput-object v7, p0, Ll/ۜ᩶ۚ;->ᩴ:Ll/ᩴ᩶ۚ;

    return-object v7
.end method

.method public final ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 365
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    if-eqz p4, :cond_0

    .line 366
    iget-object p4, p0, Ll/ۜ᩶ۚ;->ܶ:Ll/۟᩹ۚ;

    .line 367
    invoke-static {v0, p1, p2, p3, p4}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;ILl/᩺᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩶ۚ;->ܶ:Ll/۟᩹ۚ;

    return-object p1

    .line 370
    :cond_0
    iget-object p4, p0, Ll/ۜ᩶ۚ;->֨:Ll/۟᩹ۚ;

    .line 371
    invoke-static {v0, p1, p2, p3, p4}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;ILl/᩺᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩶ۚ;->֨:Ll/۟᩹ۚ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 353
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    if-eqz p2, :cond_0

    .line 354
    iget-object p2, p0, Ll/ۜ᩶ۚ;->۠:Ll/۟᩹ۚ;

    .line 355
    invoke-static {v0, p1, p2}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩶ۚ;->۠:Ll/۟᩹ۚ;

    return-object p1

    .line 357
    :cond_0
    iget-object p2, p0, Ll/ۜ᩶ۚ;->ۚ:Ll/۟᩹ۚ;

    .line 358
    invoke-static {v0, p1, p2}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩶ۚ;->ۚ:Ll/۟᩹ۚ;

    return-object p1
.end method

.method public final ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;
    .locals 9

    .line 463
    new-instance v8, Ll/᩸᩶ۚ;

    iget-object v1, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    iget v7, p0, Ll/ۜ᩶ۚ;->ᩳ:I

    move-object v0, v8

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v7}, Ll/᩸᩶ۚ;-><init>(Ll/ۛ᩶ۚ;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    .line 465
    iget-object p1, p0, Ll/ۜ᩶ۚ;->ۢ:Ll/᩸᩶ۚ;

    if-nez p1, :cond_0

    .line 466
    iput-object v8, p0, Ll/ۜ᩶ۚ;->ۢ:Ll/᩸᩶ۚ;

    goto :goto_0

    .line 468
    :cond_0
    iget-object p1, p0, Ll/ۜ᩶ۚ;->᩵:Ll/᩸᩶ۚ;

    iput-object v8, p1, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    .line 470
    :goto_0
    iput-object v8, p0, Ll/ۜ᩶ۚ;->᩵:Ll/᩸᩶ۚ;

    return-object v8
.end method

.method public final ֫(ILjava/lang/String;Ljava/lang/String;)Ll/᩹᩶ۚ;
    .locals 2

    .line 329
    new-instance v0, Ll/᩶᩶ۚ;

    .line 332
    iget-object v1, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {v1, p2}, Ll/ۛ᩶ۚ;->ۧ(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p2

    iget p2, p2, Ll/۬᩶ۚ;->ۧ:I

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 334
    :cond_0
    invoke-virtual {v1, p3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p3

    :goto_0
    invoke-direct {v0, v1, p2, p1, p3}, Ll/᩶᩶ۚ;-><init>(Ll/ۛ᩶ۚ;III)V

    iput-object v0, p0, Ll/ۜ᩶ۚ;->᩸:Ll/᩶᩶ۚ;

    return-object v0
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 297
    iput p1, p0, Ll/ۜ᩶ۚ;->۟:I

    .line 298
    iput p2, p0, Ll/ۜ᩶ۚ;->ܽ:I

    const p2, 0xffff

    and-int/2addr p1, p2

    .line 299
    iget-object p2, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {p2, p1, p3}, Ll/ۛ᩶ۚ;->ۧ(ILjava/lang/String;)I

    move-result p3

    iput p3, p0, Ll/ۜ᩶ۚ;->ܰ:I

    if-eqz p4, :cond_0

    .line 301
    invoke-virtual {p2, p4}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Ll/ۜ᩶ۚ;->ۤ:I

    :cond_0
    const/4 p3, 0x0

    if-nez p5, :cond_1

    const/4 p4, 0x0

    goto :goto_0

    .line 303
    :cond_1
    invoke-virtual {p2, p5}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p4

    iget p4, p4, Ll/۬᩶ۚ;->ۧ:I

    :goto_0
    iput p4, p0, Ll/ۜ᩶ۚ;->ۨ:I

    if-eqz p6, :cond_2

    .line 304
    array-length p4, p6

    if-lez p4, :cond_2

    .line 305
    array-length p4, p6

    iput p4, p0, Ll/ۜ᩶ۚ;->ۖ:I

    .line 306
    new-array p4, p4, [I

    iput-object p4, p0, Ll/ۜ᩶ۚ;->ۘ:[I

    .line 307
    :goto_1
    iget p4, p0, Ll/ۜ᩶ۚ;->ۖ:I

    if-ge p3, p4, :cond_2

    .line 308
    iget-object p4, p0, Ll/ۜ᩶ۚ;->ۘ:[I

    aget-object p5, p6, p3

    invoke-virtual {p2, p5}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p5

    iget p5, p5, Ll/۬᩶ۚ;->ۧ:I

    aput p5, p4, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 311
    :cond_2
    iget p2, p0, Ll/ۜ᩶ۚ;->ᩳ:I

    const/4 p3, 0x1

    if-ne p2, p3, :cond_3

    const/16 p2, 0x33

    if-lt p1, p2, :cond_3

    const/4 p1, 0x2

    .line 312
    iput p1, p0, Ll/ۜ᩶ۚ;->ᩳ:I

    :cond_3
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 339
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {v0, p1}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    iput p1, p0, Ll/ۜ᩶ۚ;->᩹:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 404
    iget-object v0, p0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    if-nez v0, :cond_0

    .line 405
    new-instance v0, Ll/ᩳ᩶ۚ;

    invoke-direct {v0}, Ll/ᩳ᩶ۚ;-><init>()V

    iput-object v0, p0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    .line 413
    :cond_0
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {v0, p1}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    .line 414
    iget v1, p1, Ll/۬᩶ۚ;->ܽ:I

    if-nez v1, :cond_3

    .line 415
    iget v1, p0, Ll/ۜ᩶ۚ;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۜ᩶ۚ;->ۙ:I

    .line 416
    iget-object v1, p0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    iget v2, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v1, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 417
    iget-object v1, p0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    const/4 v2, 0x0

    if-nez p3, :cond_1

    const/4 p3, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p3}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p3

    iget p3, p3, Ll/۬᩶ۚ;->ۧ:I

    :goto_0
    invoke-virtual {v1, p3}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 418
    iget-object p3, p0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    if-nez p4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p4}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v2

    :goto_1
    invoke-virtual {p3, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 419
    iget-object p3, p0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    invoke-virtual {p3, p2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 420
    iget p2, p0, Ll/ۜ᩶ۚ;->ۙ:I

    iput p2, p1, Ll/۬᩶ۚ;->ܽ:I

    :cond_3
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 319
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {v0, p1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۜ᩶ۚ;->ۛ:I

    :cond_0
    if-eqz p2, :cond_1

    .line 322
    new-instance p1, Ll/ᩳ᩶ۚ;

    invoke-direct {p1}, Ll/ᩳ᩶ۚ;-><init>()V

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p1, v0, v1, p2}, Ll/ᩳ᩶ۚ;->֫(IILjava/lang/String;)V

    iput-object p1, p0, Ll/ۜ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 345
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {v0, p1}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    iput p1, p0, Ll/ۜ᩶ۚ;->ܳ:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 347
    invoke-virtual {v0, p2, p3}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۜ᩶ۚ;->᩻:I

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܽ᩶ۚ;)V
    .locals 1

    .line 379
    iget-object v0, p0, Ll/ۜ᩶ۚ;->ۜ:Ll/ܽ᩶ۚ;

    iput-object v0, p1, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 380
    iput-object p1, p0, Ll/ۜ᩶ۚ;->ۜ:Ll/ܽ᩶ۚ;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩶ۚ;
    .locals 2

    .line 429
    new-instance v0, Ll/ۗ᩶ۚ;

    iget-object v1, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-direct {v0, v1, p1, p2, p3}, Ll/ۗ᩶ۚ;-><init>(Ll/ۛ᩶ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    iget-object p1, p0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    if-nez p1, :cond_0

    .line 432
    iput-object v0, p0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    goto :goto_0

    .line 434
    :cond_0
    iget-object p1, p0, Ll/ۜ᩶ۚ;->֡:Ll/ۗ᩶ۚ;

    iput-object v0, p1, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    .line 436
    :goto_0
    iput-object v0, p0, Ll/ۜ᩶ۚ;->֡:Ll/ۗ᩶ۚ;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 385
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    if-nez v0, :cond_0

    .line 386
    new-instance v0, Ll/ᩳ᩶ۚ;

    invoke-direct {v0}, Ll/ᩳ᩶ۚ;-><init>()V

    iput-object v0, p0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    .line 388
    :cond_0
    iget v0, p0, Ll/ۜ᩶ۚ;->ۗ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۜ᩶ۚ;->ۗ:I

    .line 389
    iget-object v0, p0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    iget-object v1, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    return-void
.end method

.method public final ۧ()[B
    .locals 29

    move-object/from16 v0, p0

    .line 494
    iget v1, v0, Ll/ۜ᩶ۚ;->ۖ:I

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x18

    .line 496
    iget-object v2, v0, Ll/ۜ᩶ۚ;->᩷:Ll/ᩴ᩶ۚ;

    const/4 v3, 0x0

    :goto_0
    if-eqz v2, :cond_0

    add-int/lit8 v3, v3, 0x1

    .line 499
    invoke-virtual {v2}, Ll/ᩴ᩶ۚ;->ۧ()I

    move-result v4

    add-int/2addr v1, v4

    .line 500
    iget-object v2, v2, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    check-cast v2, Ll/ᩴ᩶ۚ;

    goto :goto_0

    .line 503
    :cond_0
    iget-object v2, v0, Ll/ۜ᩶ۚ;->ۢ:Ll/᩸᩶ۚ;

    const/4 v4, 0x0

    :goto_1
    if-eqz v2, :cond_1

    add-int/lit8 v4, v4, 0x1

    .line 506
    invoke-virtual {v2}, Ll/᩸᩶ۚ;->ᩳ()I

    move-result v5

    add-int/2addr v1, v5

    .line 507
    iget-object v2, v2, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    check-cast v2, Ll/᩸᩶ۚ;

    goto :goto_1

    .line 512
    :cond_1
    iget-object v2, v0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    const-string v5, "InnerClasses"

    iget-object v6, v0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    if-eqz v2, :cond_2

    .line 514
    iget v2, v2, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v2, v2, 0x8

    add-int/2addr v1, v2

    .line 515
    invoke-virtual {v6, v5}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 517
    :goto_2
    iget v7, v0, Ll/ۜ᩶ۚ;->ܳ:I

    const-string v8, "EnclosingMethod"

    if-eqz v7, :cond_3

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0xa

    .line 520
    invoke-virtual {v6, v8}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 522
    :cond_3
    iget v7, v0, Ll/ۜ᩶ۚ;->ܽ:I

    and-int/lit16 v7, v7, 0x1000

    const-string v9, "Synthetic"

    const/16 v10, 0x31

    const v11, 0xffff

    if-eqz v7, :cond_4

    iget v7, v0, Ll/ۜ᩶ۚ;->۟:I

    and-int/2addr v7, v11

    if-ge v7, v10, :cond_4

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x6

    .line 525
    invoke-virtual {v6, v9}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 527
    :cond_4
    iget v7, v0, Ll/ۜ᩶ۚ;->ۤ:I

    const-string v10, "Signature"

    if-eqz v7, :cond_5

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x8

    .line 530
    invoke-virtual {v6, v10}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 532
    :cond_5
    iget v7, v0, Ll/ۜ᩶ۚ;->ۛ:I

    const-string v11, "SourceFile"

    if-eqz v7, :cond_6

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x8

    .line 535
    invoke-virtual {v6, v11}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 537
    :cond_6
    iget-object v7, v0, Ll/ۜ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    const-string v12, "SourceDebugExtension"

    if-eqz v7, :cond_7

    add-int/lit8 v2, v2, 0x1

    .line 539
    iget v7, v7, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v7, v7, 0x6

    add-int/2addr v1, v7

    .line 540
    invoke-virtual {v6, v12}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 542
    :cond_7
    iget v7, v0, Ll/ۜ᩶ۚ;->ܽ:I

    const/high16 v13, 0x20000

    and-int/2addr v7, v13

    const-string v14, "Deprecated"

    if-eqz v7, :cond_8

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x6

    .line 545
    invoke-virtual {v6, v14}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 547
    :cond_8
    iget-object v7, v0, Ll/ۜ᩶ۚ;->۠:Ll/۟᩹ۚ;

    if-eqz v7, :cond_9

    add-int/lit8 v2, v2, 0x1

    const-string v15, "RuntimeVisibleAnnotations"

    .line 550
    invoke-virtual {v7, v15}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result v7

    add-int/2addr v1, v7

    .line 553
    :cond_9
    iget-object v7, v0, Ll/ۜ᩶ۚ;->ۚ:Ll/۟᩹ۚ;

    if-eqz v7, :cond_a

    add-int/lit8 v2, v2, 0x1

    const-string v15, "RuntimeInvisibleAnnotations"

    .line 556
    invoke-virtual {v7, v15}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result v7

    add-int/2addr v1, v7

    .line 559
    :cond_a
    iget-object v7, v0, Ll/ۜ᩶ۚ;->ܶ:Ll/۟᩹ۚ;

    if-eqz v7, :cond_b

    add-int/lit8 v2, v2, 0x1

    const-string v15, "RuntimeVisibleTypeAnnotations"

    .line 562
    invoke-virtual {v7, v15}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result v7

    add-int/2addr v1, v7

    .line 565
    :cond_b
    iget-object v7, v0, Ll/ۜ᩶ۚ;->֨:Ll/۟᩹ۚ;

    if-eqz v7, :cond_c

    add-int/lit8 v2, v2, 0x1

    const-string v15, "RuntimeInvisibleTypeAnnotations"

    .line 568
    invoke-virtual {v7, v15}, Ll/۟᩹ۚ;->ۧ(Ljava/lang/String;)I

    move-result v7

    add-int/2addr v1, v7

    .line 571
    :cond_c
    invoke-virtual {v6}, Ll/ۛ᩶ۚ;->֫()I

    move-result v7

    if-lez v7, :cond_d

    add-int/lit8 v2, v2, 0x1

    .line 573
    invoke-virtual {v6}, Ll/ۛ᩶ۚ;->֫()I

    move-result v7

    add-int/2addr v1, v7

    .line 575
    :cond_d
    iget-object v7, v0, Ll/ۜ᩶ۚ;->᩸:Ll/᩶᩶ۚ;

    if-eqz v7, :cond_e

    .line 576
    invoke-virtual {v7}, Ll/᩶᩶ۚ;->ܽ()I

    move-result v7

    add-int/2addr v2, v7

    .line 577
    iget-object v7, v0, Ll/ۜ᩶ۚ;->᩸:Ll/᩶᩶ۚ;

    invoke-virtual {v7}, Ll/᩶᩶ۚ;->ۧ()I

    move-result v7

    add-int/2addr v1, v7

    .line 579
    :cond_e
    iget v7, v0, Ll/ۜ᩶ۚ;->᩹:I

    const-string v15, "NestHost"

    if-eqz v7, :cond_f

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x8

    .line 582
    invoke-virtual {v6, v15}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 584
    :cond_f
    iget-object v7, v0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    const-string v13, "NestMembers"

    if-eqz v7, :cond_10

    add-int/lit8 v2, v2, 0x1

    .line 586
    iget v7, v7, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v7, v7, 0x8

    add-int/2addr v1, v7

    .line 587
    invoke-virtual {v6, v13}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 589
    :cond_10
    iget-object v7, v0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    move-object/from16 v16, v13

    const-string v13, "PermittedSubclasses"

    if-eqz v7, :cond_11

    add-int/lit8 v2, v2, 0x1

    .line 591
    iget v7, v7, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v7, v7, 0x8

    add-int/2addr v1, v7

    .line 592
    invoke-virtual {v6, v13}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    .line 596
    :cond_11
    iget v7, v0, Ll/ۜ᩶ۚ;->ܽ:I

    const/high16 v17, 0x10000

    and-int v7, v7, v17

    move-object/from16 v18, v13

    const-string v13, "Record"

    if-nez v7, :cond_13

    iget-object v7, v0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    if-eqz v7, :cond_12

    goto :goto_3

    :cond_12
    const/4 v7, 0x0

    const/16 v19, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    goto :goto_5

    .line 597
    :cond_13
    :goto_3
    iget-object v7, v0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_4
    if-eqz v7, :cond_14

    add-int/lit8 v20, v20, 0x1

    .line 600
    invoke-virtual {v7}, Ll/ۗ᩶ۚ;->ۧ()I

    move-result v21

    add-int v19, v19, v21

    .line 601
    iget-object v7, v7, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    check-cast v7, Ll/ۗ᩶ۚ;

    goto :goto_4

    :cond_14
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v7, v19, 0x8

    add-int/2addr v1, v7

    .line 605
    invoke-virtual {v6, v13}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move/from16 v22, v20

    .line 607
    :goto_5
    iget-object v7, v0, Ll/ۜ᩶ۚ;->ۜ:Ll/ܽ᩶ۚ;

    if-eqz v7, :cond_16

    const/16 v20, 0x0

    :goto_6
    if-eqz v7, :cond_15

    add-int/lit8 v20, v20, 0x1

    .line 292
    iget-object v7, v7, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    goto :goto_6

    :cond_15
    add-int v2, v2, v20

    .line 609
    iget-object v7, v0, Ll/ۜ᩶ۚ;->ۜ:Ll/ܽ᩶ۚ;

    invoke-virtual {v7, v6}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;)I

    move-result v7

    add-int/2addr v1, v7

    .line 613
    :cond_16
    invoke-virtual {v6}, Ll/ۛ᩶ۚ;->ᩳ()I

    move-result v7

    add-int/2addr v1, v7

    .line 614
    invoke-virtual {v6}, Ll/ۛ᩶ۚ;->ܽ()I

    move-result v7

    move-object/from16 v20, v13

    const v13, 0xffff

    if-gt v7, v13, :cond_2f

    .line 621
    new-instance v7, Ll/ᩳ᩶ۚ;

    .line 54
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 55
    new-array v1, v1, [B

    iput-object v1, v7, Ll/ᩳ᩶ۚ;->֫:[B

    const v1, -0x35014542    # -8346975.0f

    .line 622
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->۟:I

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 623
    invoke-virtual {v6, v7}, Ll/ۛ᩶ۚ;->ۧ(Ll/ᩳ᩶ۚ;)V

    .line 624
    iget v1, v0, Ll/ۜ᩶ۚ;->۟:I

    and-int/2addr v1, v13

    const/16 v13, 0x31

    if-ge v1, v13, :cond_17

    const/16 v1, 0x1000

    goto :goto_7

    :cond_17
    const/4 v1, 0x0

    .line 625
    :goto_7
    iget v13, v0, Ll/ۜ᩶ۚ;->ܽ:I

    not-int v1, v1

    and-int/2addr v1, v13

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->ܰ:I

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->ۨ:I

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 626
    iget v1, v0, Ll/ۜ᩶ۚ;->ۖ:I

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v1, 0x0

    .line 627
    :goto_8
    iget v13, v0, Ll/ۜ᩶ۚ;->ۖ:I

    if-ge v1, v13, :cond_18

    .line 628
    iget-object v13, v0, Ll/ۜ᩶ۚ;->ۘ:[I

    aget v13, v13, v1

    invoke-virtual {v7, v13}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 630
    :cond_18
    invoke-virtual {v7, v3}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 631
    iget-object v1, v0, Ll/ۜ᩶ۚ;->᩷:Ll/ᩴ᩶ۚ;

    :goto_9
    if-eqz v1, :cond_19

    .line 633
    invoke-virtual {v1, v7}, Ll/ᩴ᩶ۚ;->֫(Ll/ᩳ᩶ۚ;)V

    .line 634
    iget-object v1, v1, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    check-cast v1, Ll/ᩴ᩶ۚ;

    goto :goto_9

    .line 636
    :cond_19
    invoke-virtual {v7, v4}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 639
    iget-object v1, v0, Ll/ۜ᩶ۚ;->ۢ:Ll/᩸᩶ۚ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_a
    if-eqz v1, :cond_1a

    .line 641
    invoke-virtual {v1}, Ll/᩸᩶ۚ;->ܳ()Z

    move-result v13

    or-int/2addr v3, v13

    .line 642
    invoke-virtual {v1}, Ll/᩸᩶ۚ;->ܿ()Z

    move-result v13

    or-int/2addr v4, v13

    .line 643
    invoke-virtual {v1, v7}, Ll/᩸᩶ۚ;->֫(Ll/ᩳ᩶ۚ;)V

    .line 644
    iget-object v1, v1, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    check-cast v1, Ll/᩸᩶ۚ;

    goto :goto_a

    .line 647
    :cond_1a
    invoke-virtual {v7, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 648
    iget-object v1, v0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    if-eqz v1, :cond_1b

    .line 650
    invoke-virtual {v6, v5}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v1, v0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    iget v1, v1, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v1, v1, 0x2

    .line 651
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->ۙ:I

    .line 652
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v1, v0, Ll/ۜ᩶ۚ;->ܺ:Ll/ᩳ᩶ۚ;

    iget-object v2, v1, Ll/ᩳ᩶ۚ;->֫:[B

    iget v1, v1, Ll/ᩳ᩶ۚ;->ۧ:I

    const/4 v5, 0x0

    .line 653
    invoke-virtual {v7, v5, v1, v2}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    .line 655
    :cond_1b
    iget v1, v0, Ll/ۜ᩶ۚ;->ܳ:I

    if-eqz v1, :cond_1c

    .line 657
    invoke-virtual {v6, v8}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v1, 0x4

    .line 658
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->ܳ:I

    .line 659
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->᩻:I

    .line 660
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 662
    :cond_1c
    iget v1, v0, Ll/ۜ᩶ۚ;->ܽ:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_1d

    iget v1, v0, Ll/ۜ᩶ۚ;->۟:I

    const v2, 0xffff

    and-int/2addr v1, v2

    const/16 v2, 0x31

    if-ge v1, v2, :cond_1d

    .line 663
    invoke-virtual {v6, v9}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 665
    :cond_1d
    iget v1, v0, Ll/ۜ᩶ۚ;->ۤ:I

    if-eqz v1, :cond_1e

    .line 667
    invoke-virtual {v6, v10}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v1, 0x2

    .line 668
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v2, v0, Ll/ۜ᩶ۚ;->ۤ:I

    .line 669
    invoke-virtual {v7, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    goto :goto_b

    :cond_1e
    const/4 v1, 0x2

    .line 671
    :goto_b
    iget v2, v0, Ll/ۜ᩶ۚ;->ۛ:I

    if-eqz v2, :cond_1f

    .line 673
    invoke-virtual {v6, v11}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v7, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 674
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->ۛ:I

    .line 675
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 677
    :cond_1f
    iget-object v1, v0, Ll/ۜ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    if-eqz v1, :cond_20

    .line 678
    iget v1, v1, Ll/ᩳ᩶ۚ;->ۧ:I

    .line 680
    invoke-virtual {v6, v12}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v7, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 681
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget-object v2, v0, Ll/ۜ᩶ۚ;->ܿ:Ll/ᩳ᩶ۚ;

    iget-object v2, v2, Ll/ᩳ᩶ۚ;->֫:[B

    const/4 v5, 0x0

    .line 682
    invoke-virtual {v7, v5, v1, v2}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    goto :goto_c

    :cond_20
    const/4 v5, 0x0

    .line 684
    :goto_c
    iget v1, v0, Ll/ۜ᩶ۚ;->ܽ:I

    const/high16 v2, 0x20000

    and-int/2addr v1, v2

    if-eqz v1, :cond_21

    .line 685
    invoke-virtual {v6, v14}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    invoke-virtual {v7, v5}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 687
    :cond_21
    iget-object v1, v0, Ll/ۜ᩶ۚ;->۠:Ll/۟᩹ۚ;

    iget-object v2, v0, Ll/ۜ᩶ۚ;->ۚ:Ll/۟᩹ۚ;

    iget-object v5, v0, Ll/ۜ᩶ۚ;->ܶ:Ll/۟᩹ۚ;

    iget-object v8, v0, Ll/ۜ᩶ۚ;->֨:Ll/۟᩹ۚ;

    iget-object v9, v0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    move-object/from16 v23, v9

    move-object/from16 v24, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v5

    move-object/from16 v27, v8

    move-object/from16 v28, v7

    invoke-static/range {v23 .. v28}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/ᩳ᩶ۚ;)V

    .line 694
    invoke-virtual {v6, v7}, Ll/ۛ᩶ۚ;->֫(Ll/ᩳ᩶ۚ;)V

    .line 695
    iget-object v1, v0, Ll/ۜ᩶ۚ;->᩸:Ll/᩶᩶ۚ;

    if-eqz v1, :cond_22

    .line 696
    invoke-virtual {v1, v7}, Ll/᩶᩶ۚ;->֫(Ll/ᩳ᩶ۚ;)V

    .line 698
    :cond_22
    iget v1, v0, Ll/ۜ᩶ۚ;->᩹:I

    if-eqz v1, :cond_23

    .line 700
    invoke-virtual {v6, v15}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v1, 0x2

    .line 701
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v2, v0, Ll/ۜ᩶ۚ;->᩹:I

    .line 702
    invoke-virtual {v7, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    goto :goto_d

    :cond_23
    const/4 v1, 0x2

    .line 704
    :goto_d
    iget-object v2, v0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    if-eqz v2, :cond_24

    move-object/from16 v2, v16

    .line 706
    invoke-virtual {v6, v2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v7, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v2, v0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    iget v2, v2, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/2addr v2, v1

    .line 707
    invoke-virtual {v7, v2}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->ۗ:I

    .line 708
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v1, v0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    iget-object v2, v1, Ll/ᩳ᩶ۚ;->֫:[B

    iget v1, v1, Ll/ᩳ᩶ۚ;->ۧ:I

    const/4 v5, 0x0

    .line 709
    invoke-virtual {v7, v5, v1, v2}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    .line 711
    :cond_24
    iget-object v1, v0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    if-eqz v1, :cond_25

    move-object/from16 v1, v18

    .line 713
    invoke-virtual {v6, v1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v1, v0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    iget v1, v1, Ll/ᩳ᩶ۚ;->ۧ:I

    add-int/lit8 v1, v1, 0x2

    .line 714
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    iget v1, v0, Ll/ۜ᩶ۚ;->۬:I

    .line 715
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget-object v1, v0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    iget-object v2, v1, Ll/ᩳ᩶ۚ;->֫:[B

    iget v1, v1, Ll/ᩳ᩶ۚ;->ۧ:I

    const/4 v5, 0x0

    .line 716
    invoke-virtual {v7, v5, v1, v2}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    .line 718
    :cond_25
    iget v1, v0, Ll/ۜ᩶ۚ;->ܽ:I

    and-int v1, v1, v17

    if-nez v1, :cond_26

    iget-object v1, v0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    if-eqz v1, :cond_27

    :cond_26
    move-object/from16 v1, v20

    .line 720
    invoke-virtual {v6, v1}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    add-int/lit8 v1, v19, 0x2

    .line 721
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    move/from16 v1, v22

    .line 722
    invoke-virtual {v7, v1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 723
    iget-object v1, v0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    :goto_e
    if-eqz v1, :cond_27

    .line 725
    invoke-virtual {v1, v7}, Ll/ۗ᩶ۚ;->֫(Ll/ᩳ᩶ۚ;)V

    .line 726
    iget-object v1, v1, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    check-cast v1, Ll/ۗ᩶ۚ;

    goto :goto_e

    .line 729
    :cond_27
    iget-object v1, v0, Ll/ۜ᩶ۚ;->ۜ:Ll/ܽ᩶ۚ;

    if-eqz v1, :cond_28

    .line 730
    invoke-virtual {v1, v6, v7}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;Ll/ᩳ᩶ۚ;)V

    :cond_28
    if-eqz v4, :cond_2e

    .line 735
    iget-object v1, v7, Ll/ᩳ᩶ۚ;->֫:[B

    .line 785
    new-instance v2, Ll/ۧ᩶ۚ;

    invoke-direct {v2}, Ll/ۧ᩶ۚ;-><init>()V

    .line 786
    iget-object v4, v0, Ll/ۜ᩶ۚ;->ۜ:Ll/ܽ᩶ۚ;

    invoke-virtual {v2, v4}, Ll/ۧ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    .line 787
    iget-object v4, v0, Ll/ۜ᩶ۚ;->᩷:Ll/ᩴ᩶ۚ;

    :goto_f
    if-eqz v4, :cond_29

    .line 789
    invoke-virtual {v4, v2}, Ll/ᩴ᩶ۚ;->֫(Ll/ۧ᩶ۚ;)V

    .line 790
    iget-object v4, v4, Ll/ۘ᩶ۚ;->ۧ:Ll/ۘ᩶ۚ;

    check-cast v4, Ll/ᩴ᩶ۚ;

    goto :goto_f

    .line 792
    :cond_29
    iget-object v4, v0, Ll/ۜ᩶ۚ;->ۢ:Ll/᩸᩶ۚ;

    :goto_10
    if-eqz v4, :cond_2a

    .line 794
    invoke-virtual {v4, v2}, Ll/᩸᩶ۚ;->֫(Ll/ۧ᩶ۚ;)V

    .line 795
    iget-object v4, v4, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    check-cast v4, Ll/᩸᩶ۚ;

    goto :goto_10

    .line 797
    :cond_2a
    iget-object v4, v0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    :goto_11
    if-eqz v4, :cond_2b

    .line 799
    invoke-virtual {v4, v2}, Ll/ۗ᩶ۚ;->֫(Ll/ۧ᩶ۚ;)V

    .line 800
    iget-object v4, v4, Ll/ۙ᩶ۚ;->ۧ:Ll/ۙ᩶ۚ;

    check-cast v4, Ll/ۗ᩶ۚ;

    goto :goto_11

    .line 802
    :cond_2b
    invoke-virtual {v2}, Ll/ۧ᩶ۚ;->֫()[Ll/ܽ᩶ۚ;

    move-result-object v2

    const/4 v4, 0x0

    .line 753
    iput-object v4, v0, Ll/ۜ᩶ۚ;->᩷:Ll/ᩴ᩶ۚ;

    .line 754
    iput-object v4, v0, Ll/ۜ᩶ۚ;->ᩴ:Ll/ᩴ᩶ۚ;

    .line 755
    iput-object v4, v0, Ll/ۜ᩶ۚ;->ۢ:Ll/᩸᩶ۚ;

    .line 756
    iput-object v4, v0, Ll/ۜ᩶ۚ;->᩵:Ll/᩸᩶ۚ;

    .line 757
    iput-object v4, v0, Ll/ۜ᩶ۚ;->۠:Ll/۟᩹ۚ;

    .line 758
    iput-object v4, v0, Ll/ۜ᩶ۚ;->ۚ:Ll/۟᩹ۚ;

    .line 759
    iput-object v4, v0, Ll/ۜ᩶ۚ;->ܶ:Ll/۟᩹ۚ;

    .line 760
    iput-object v4, v0, Ll/ۜ᩶ۚ;->֨:Ll/۟᩹ۚ;

    .line 761
    iput-object v4, v0, Ll/ۜ᩶ۚ;->᩸:Ll/᩶᩶ۚ;

    const/4 v5, 0x0

    .line 762
    iput v5, v0, Ll/ۜ᩶ۚ;->᩹:I

    .line 763
    iput v5, v0, Ll/ۜ᩶ۚ;->ۗ:I

    .line 764
    iput-object v4, v0, Ll/ۜ᩶ۚ;->᩶:Ll/ᩳ᩶ۚ;

    .line 765
    iput v5, v0, Ll/ۜ᩶ۚ;->۬:I

    .line 766
    iput-object v4, v0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    .line 767
    iput-object v4, v0, Ll/ۜ᩶ۚ;->ۡ:Ll/ۗ᩶ۚ;

    .line 768
    iput-object v4, v0, Ll/ۜ᩶ۚ;->֡:Ll/ۗ᩶ۚ;

    .line 769
    iput-object v4, v0, Ll/ۜ᩶ۚ;->ۜ:Ll/ܽ᩶ۚ;

    if-eqz v3, :cond_2c

    const/4 v4, 0x3

    goto :goto_12

    :cond_2c
    const/4 v4, 0x0

    .line 770
    :goto_12
    iput v4, v0, Ll/ۜ᩶ۚ;->ᩳ:I

    .line 771
    new-instance v4, Ll/ܿ᩶ۚ;

    invoke-direct {v4, v1, v5}, Ll/ܿ᩶ۚ;-><init>([BZ)V

    if-eqz v3, :cond_2d

    const/16 v1, 0x8

    goto :goto_13

    :cond_2d
    const/4 v1, 0x0

    :goto_13
    or-int/lit16 v1, v1, 0x100

    .line 772
    invoke-virtual {v4, v0, v2, v1}, Ll/ܿ᩶ۚ;->֫(Ll/᩻᩶ۚ;[Ll/ܽ᩶ۚ;I)V

    .line 776
    invoke-virtual/range {p0 .. p0}, Ll/ۜ᩶ۚ;->ۧ()[B

    move-result-object v1

    return-object v1

    .line 737
    :cond_2e
    iget-object v1, v7, Ll/ᩳ᩶ۚ;->֫:[B

    return-object v1

    .line 616
    :cond_2f
    new-instance v1, Ll/ܳ᩶ۚ;

    invoke-virtual {v6}, Ll/ۛ᩶ۚ;->ۧ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Class too large: "

    .line 0
    invoke-static {v3, v2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 616
    throw v1
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 394
    iget-object v0, p0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    if-nez v0, :cond_0

    .line 395
    new-instance v0, Ll/ᩳ᩶ۚ;

    invoke-direct {v0}, Ll/ᩳ᩶ۚ;-><init>()V

    iput-object v0, p0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    .line 397
    :cond_0
    iget v0, p0, Ll/ۜ᩶ۚ;->۬:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۜ᩶ۚ;->۬:I

    .line 398
    iget-object v0, p0, Ll/ۜ᩶ۚ;->۫:Ll/ᩳ᩶ۚ;

    iget-object v1, p0, Ll/ۜ᩶ۚ;->᩺:Ll/ۛ᩶ۚ;

    invoke-virtual {v1, p1}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/String;)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    invoke-virtual {v0, p1}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    return-void
.end method
