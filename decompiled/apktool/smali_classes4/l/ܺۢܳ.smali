.class public final Ll/ܺۢܳ;
.super Ljava/lang/Object;
.source "W261"


# instance fields
.field public ֫:Ljava/util/HashSet;

.field public ۧ:I

.field public final ܳ:Ll/ܽۢܳ;

.field public ܽ:I

.field public ܿ:Ll/ۜ֡ۡ;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Ll/ܺۢܳ;->ۧ:I

    const/4 v0, -0x1

    .line 74
    iput v0, p0, Ll/ܺۢܳ;->ܽ:I

    .line 22
    iput-object p1, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    return-void
.end method

.method public static ۧ(Ll/ᩳۜܳ;)Ljava/lang/String;
    .locals 2

    .line 471
    invoke-interface {p0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "/"

    return-object p0

    .line 473
    :cond_0
    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const-string p0, "."

    return-object p0

    .line 476
    :cond_1
    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ܺ()V
    .locals 2

    .line 464
    iget-object v0, p0, Ll/ܺۢܳ;->ܿ:Ll/ۜ֡ۡ;

    if-eqz v0, :cond_0

    .line 466
    iget-object v1, v0, Ll/ۜ֡ۡ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܽۢܳ;

    iget-object v0, v0, Ll/ۜ֡ۡ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۢۘܳ;

    invoke-static {v1, v0}, Ll/ܽۢܳ;->֫(Ll/ܽۢܳ;Ll/ۢۘܳ;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 449
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 451
    iput v0, p0, Ll/ܺۢܳ;->ۧ:I

    .line 452
    iput-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    const/4 v0, -0x1

    .line 453
    iput v0, p0, Ll/ܺۢܳ;->ܽ:I

    .line 454
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    .line 455
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 v0, 0x0

    .line 456
    iput-object v0, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 450
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No in selection mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 10

    .line 411
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_8

    .line 413
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, -0x1

    .line 415
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 416
    iget v1, p0, Ll/ܺۢܳ;->ۧ:I

    if-nez v1, :cond_0

    return-void

    .line 418
    :cond_0
    new-instance v1, Ll/ᩴ᩵;

    invoke-direct {v1}, Ll/ᩴ᩵;-><init>()V

    .line 419
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    .line 420
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۜܳ;

    .line 421
    invoke-interface {v4}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 422
    invoke-interface {v4}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v7

    invoke-static {p1, v7, v8}, Ll/ۚۜܳ;->֫(IJ)[J

    move-result-object v4

    .line 423
    new-instance v7, Ll/ۡۢܳ;

    aget-wide v8, v4, v5

    aget-wide v5, v4, v6

    invoke-direct {v7, v8, v9, v5, v6}, Ll/ۡۢܳ;-><init>(JJ)V

    invoke-virtual {v1, v7}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-array p1, v5, [Ll/ۡۢܳ;

    .line 426
    invoke-virtual {v1, p1}, Ll/ᩴ᩵;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۡۢܳ;

    .line 427
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 428
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    .line 430
    :cond_4
    array-length v3, p1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    aget-object v5, p1, v4

    .line 431
    invoke-interface {v2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v7

    invoke-virtual {v5, v7, v8}, Ll/ۡۢܳ;->ۧ(J)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 432
    invoke-interface {v2, v6}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 433
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v2, v6

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_1

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 438
    :cond_6
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 p1, 0x0

    .line 439
    iput-object p1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 414
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "In paste mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 412
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No in selection mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(JJ)V
    .locals 8

    .line 308
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_7

    .line 310
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, -0x1

    .line 312
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 313
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 314
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 315
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 317
    :cond_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->᩸֫()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_2

    .line 318
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 319
    invoke-interface {v2, v4}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 320
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    sub-int/2addr v2, v5

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 324
    :cond_2
    invoke-interface {v2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v6

    cmp-long v3, p1, v6

    if-gtz v3, :cond_3

    cmp-long v3, v6, p3

    if-gez v3, :cond_3

    .line 326
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-nez v3, :cond_0

    .line 327
    invoke-interface {v2, v5}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 328
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v2, v5

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 331
    :cond_3
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 332
    invoke-interface {v2, v4}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 333
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    sub-int/2addr v2, v5

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 337
    :cond_4
    invoke-virtual {p0}, Ll/ܺۢܳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 338
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 p1, 0x0

    .line 339
    iput-object p1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 341
    :cond_5
    invoke-virtual {p0}, Ll/ܺۢܳ;->֫()V

    const p1, 0x7f1206ef

    .line 342
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 311
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "In paste mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 309
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No in selection mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۜ֡ۡ;)V
    .locals 0

    .line 460
    iput-object p1, p0, Ll/ܺۢܳ;->ܿ:Ll/ۜ֡ۡ;

    return-void
.end method

.method public final ֫(Ll/۟ۤ;)V
    .locals 5

    .line 347
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_6

    .line 349
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, -0x1

    .line 351
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 352
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 353
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 354
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 356
    :cond_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ll/۟ۤ;->֫(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    .line 357
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-nez v3, :cond_0

    .line 358
    invoke-interface {v2, v4}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 359
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v2, v4

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 362
    :cond_2
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    .line 363
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 364
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    sub-int/2addr v2, v4

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 368
    :cond_3
    invoke-virtual {p0}, Ll/ܺۢܳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 369
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 p1, 0x0

    .line 370
    iput-object p1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 372
    :cond_4
    invoke-virtual {p0}, Ll/ܺۢܳ;->֫()V

    const p1, 0x7f1206ef

    .line 373
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 350
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "In paste mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 348
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No in selection mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ᩳۜܳ;Z)V
    .locals 2

    .line 120
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_3

    .line 122
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, -0x1

    .line 124
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 125
    invoke-interface {p1}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v1

    if-ne v1, p2, :cond_0

    return-void

    .line 127
    :cond_0
    invoke-interface {p1, p2}, Ll/ᩳۜܳ;->setChecked(Z)V

    if-eqz p2, :cond_1

    .line 129
    iget p1, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 131
    :cond_1
    iget p1, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܺۢܳ;->ۧ:I

    .line 132
    :goto_0
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 p1, 0x0

    .line 133
    iput-object p1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 123
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "In paste mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 121
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No in selection mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ᩳۜܳ;)Z
    .locals 3

    .line 137
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_2

    .line 139
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_1

    .line 141
    invoke-interface {p1}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v1

    xor-int/lit8 v2, v1, 0x1

    .line 142
    invoke-interface {p1, v2}, Ll/ᩳۜܳ;->setChecked(Z)V

    if-nez v1, :cond_0

    .line 144
    iget p1, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 146
    :cond_0
    iget p1, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܺۢܳ;->ۧ:I

    :goto_0
    const/4 p1, -0x1

    .line 147
    iput p1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 148
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 p1, 0x0

    .line 149
    iput-object p1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return v2

    .line 140
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "In paste mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 138
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No in selection mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ()V
    .locals 6

    .line 253
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_5

    .line 255
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, -0x1

    .line 257
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 258
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 259
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 260
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    .line 261
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 262
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    sub-int/2addr v2, v5

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 264
    :cond_1
    invoke-interface {v2, v5}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 265
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v2, v5

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 269
    :cond_2
    iget v1, p0, Ll/ܺۢܳ;->ۧ:I

    if-nez v1, :cond_3

    .line 270
    iput-boolean v3, p0, Ll/ܺۢܳ;->ᩳ:Z

    .line 271
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    .line 273
    :cond_3
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 v0, 0x0

    .line 274
    iput-object v0, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 256
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In paste mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 254
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No in selection mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۡ()V
    .locals 5

    const/4 v0, 0x0

    .line 166
    iput v0, p0, Ll/ܺۢܳ;->ۧ:I

    const/4 v1, -0x1

    .line 167
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 168
    iget-object v1, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 169
    invoke-interface {v3}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 170
    iget v3, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v3, v4

    iput v3, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 172
    :cond_1
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    if-nez v2, :cond_2

    .line 173
    iget-boolean v2, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v2, :cond_3

    .line 174
    iput-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    .line 175
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    goto :goto_1

    .line 178
    :cond_2
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-nez v0, :cond_3

    .line 179
    iput-boolean v4, p0, Ll/ܺۢܳ;->ᩳ:Z

    .line 180
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    .line 183
    :cond_3
    :goto_1
    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 v0, 0x0

    .line 184
    iput-object v0, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void
.end method

.method public final ۢ()V
    .locals 5

    .line 30
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-nez v0, :cond_3

    .line 32
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_2

    .line 34
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 35
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 36
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    goto :goto_0

    .line 39
    :cond_1
    iput v3, p0, Ll/ܺۢܳ;->ۧ:I

    const/4 v1, 0x1

    .line 40
    iput-boolean v1, p0, Ll/ܺۢܳ;->ᩳ:Z

    const/4 v1, -0x1

    .line 41
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 42
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    .line 43
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In paste mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already in selection mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, -0x1

    .line 81
    iput v0, p0, Ll/ܺۢܳ;->ܽ:I

    return-void
.end method

.method public final ۧ(JJ)V
    .locals 7

    .line 378
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_6

    .line 380
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, -0x1

    .line 382
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 383
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 384
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 385
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 387
    :cond_1
    invoke-interface {v2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v3

    const/4 v5, 0x1

    cmp-long v6, p1, v3

    if-gtz v6, :cond_2

    cmp-long v6, v3, p3

    if-gez v6, :cond_2

    .line 389
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-nez v3, :cond_0

    .line 390
    invoke-interface {v2, v5}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 391
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v2, v5

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 394
    :cond_2
    invoke-interface {v2}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    .line 395
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 396
    iget v2, p0, Ll/ܺۢܳ;->ۧ:I

    sub-int/2addr v2, v5

    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_0

    .line 400
    :cond_3
    invoke-virtual {p0}, Ll/ܺۢܳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 401
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 p1, 0x0

    .line 402
    iput-object p1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 404
    :cond_4
    invoke-virtual {p0}, Ll/ܺۢܳ;->֫()V

    const p1, 0x7f1206ef

    .line 405
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 381
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "In paste mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 379
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No in selection mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(I)Z
    .locals 8

    .line 85
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_6

    .line 87
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_5

    .line 89
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 90
    iget v2, p0, Ll/ܺۢܳ;->ܽ:I

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-ne v2, v4, :cond_2

    .line 91
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 92
    invoke-interface {v1}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v2

    if-nez v2, :cond_1

    .line 93
    invoke-interface {v1}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v2

    if-nez v2, :cond_0

    .line 94
    invoke-interface {v1, v5}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 95
    iget v1, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v1, v5

    iput v1, p0, Ll/ܺۢܳ;->ۧ:I

    .line 97
    :cond_0
    iput p1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 98
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    .line 99
    iput-object v3, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    :cond_1
    const/4 p1, 0x0

    return p1

    .line 103
    :cond_2
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 104
    iget v6, p0, Ll/ܺۢܳ;->ܽ:I

    invoke-static {p1, v6}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_0
    if-gt v2, p1, :cond_4

    .line 106
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 107
    invoke-interface {v6}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-interface {v6}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v7

    if-nez v7, :cond_3

    .line 108
    invoke-interface {v6, v5}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 109
    iget v6, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v6, v5

    iput v6, p0, Ll/ܺۢܳ;->ۧ:I

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 112
    :cond_4
    iput v4, p0, Ll/ܺۢܳ;->ܽ:I

    .line 113
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    .line 114
    iput-object v3, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return v5

    .line 88
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "In paste mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 86
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No in selection mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()Z
    .locals 2

    .line 77
    iget v0, p0, Ll/ܺۢܳ;->ܽ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 160
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_0

    .line 162
    iget v0, p0, Ll/ܺۢܳ;->ۧ:I

    return v0

    .line 161
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No in selection mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)V
    .locals 4

    .line 48
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-nez v0, :cond_4

    .line 50
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_3

    .line 52
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 53
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    .line 54
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 58
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lt p1, v2, :cond_2

    return-void

    .line 61
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 63
    iput v2, p0, Ll/ܺۢܳ;->ۧ:I

    .line 64
    iput-boolean v2, p0, Ll/ܺۢܳ;->ᩳ:Z

    .line 65
    iput p1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 66
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    .line 67
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 p1, 0x0

    .line 68
    iput-object p1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 51
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "In paste mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 49
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already in selection mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ()Z
    .locals 2

    .line 154
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_1

    .line 156
    iget v0, p0, Ll/ܺۢܳ;->ۧ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 155
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No in selection mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    return v0
.end method

.method public final ᩷()V
    .locals 6

    .line 281
    iget-boolean v0, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v0, :cond_7

    .line 283
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, -0x1

    .line 285
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 286
    iget v1, p0, Ll/ܺۢܳ;->ۧ:I

    if-nez v1, :cond_0

    return-void

    .line 288
    :cond_0
    new-instance v1, Ll/ᩴ᩵;

    invoke-direct {v1}, Ll/ᩴ᩵;-><init>()V

    .line 289
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    .line 290
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۜܳ;

    .line 291
    invoke-interface {v4}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 292
    invoke-static {v4}, Ll/ܺۢܳ;->ۧ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 295
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 296
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {v3}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    .line 298
    :cond_4
    invoke-static {v3}, Ll/ܺۢܳ;->ۧ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ᩴ᩵;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    .line 299
    invoke-interface {v3, v4}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 300
    iget v3, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v3, v4

    iput v3, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_1

    .line 303
    :cond_5
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    const/4 v0, 0x0

    .line 304
    iput-object v0, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 284
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In paste mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 282
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No in selection mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()V
    .locals 8

    .line 191
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_d

    const/4 v1, -0x1

    .line 193
    iput v1, p0, Ll/ܺۢܳ;->ܽ:I

    .line 195
    iget-boolean v1, p0, Ll/ܺۢܳ;->ᩳ:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_2

    .line 196
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 197
    invoke-interface {v5}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v6

    if-nez v6, :cond_0

    .line 198
    invoke-interface {v5, v4}, Ll/ᩳۜܳ;->setChecked(Z)V

    goto :goto_0

    .line 201
    :cond_1
    iput v4, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_2

    .line 202
    :cond_2
    iget-object v1, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    if-eqz v1, :cond_6

    .line 204
    iput v4, p0, Ll/ܺۢܳ;->ۧ:I

    .line 205
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 206
    invoke-interface {v6}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v7

    if-nez v7, :cond_3

    .line 207
    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v6, v7}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 208
    invoke-interface {v6}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 209
    iget v6, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v6, v3

    iput v6, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_1

    .line 213
    :cond_4
    iget v1, p0, Ll/ܺۢܳ;->ۧ:I

    if-nez v1, :cond_5

    .line 214
    iget-boolean v1, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v1, :cond_5

    .line 215
    iput-boolean v4, p0, Ll/ܺۢܳ;->ᩳ:Z

    .line 216
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    .line 219
    :cond_5
    iput-object v2, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    .line 220
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    return-void

    .line 223
    :cond_6
    :goto_2
    iget v1, p0, Ll/ܺۢܳ;->ۧ:I

    if-lez v1, :cond_7

    .line 224
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 226
    :cond_7
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 227
    invoke-interface {v5}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v6

    if-nez v6, :cond_8

    .line 228
    invoke-interface {v5}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v6

    if-nez v6, :cond_9

    .line 229
    invoke-interface {v5, v3}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 230
    iget v5, p0, Ll/ܺۢܳ;->ۧ:I

    add-int/2addr v5, v3

    iput v5, p0, Ll/ܺۢܳ;->ۧ:I

    goto :goto_3

    :cond_9
    if-eqz v2, :cond_8

    .line 232
    invoke-interface {v5}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 236
    :cond_a
    iget v1, p0, Ll/ܺۢܳ;->ۧ:I

    if-nez v1, :cond_b

    .line 237
    iget-boolean v1, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-eqz v1, :cond_c

    .line 238
    iput-boolean v4, p0, Ll/ܺۢܳ;->ᩳ:Z

    .line 239
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    goto :goto_4

    .line 241
    :cond_b
    iget-boolean v1, p0, Ll/ܺۢܳ;->ᩳ:Z

    if-nez v1, :cond_c

    .line 242
    iput-boolean v3, p0, Ll/ܺۢܳ;->ᩳ:Z

    .line 243
    invoke-direct {p0}, Ll/ܺۢܳ;->ܺ()V

    .line 245
    :cond_c
    :goto_4
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ֫()V

    .line 246
    iput-object v2, p0, Ll/ܺۢܳ;->֫:Ljava/util/HashSet;

    return-void

    .line 192
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In paste mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
