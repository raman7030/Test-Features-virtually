.class public final Ll/᩻᩷ܺ;
.super Ljava/lang/Object;
.source "RBGV"


# instance fields
.field public final ֫:Ll/֫ۜܺ;

.field public final ۧ:Ll/ᩳᩴܺ;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 167
    iput-object p1, p0, Ll/᩻᩷ܺ;->֫:Ll/֫ۜܺ;

    .line 168
    iput-object p2, p0, Ll/᩻᩷ܺ;->ۧ:Ll/ᩳᩴܺ;

    return-void

    .line 160
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "file == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/֫ۜܺ;Ll/ۛۢܺ;)V
    .locals 3

    .line 454
    invoke-virtual {p0}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v0

    .line 455
    invoke-virtual {p0}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v1

    .line 457
    invoke-virtual {p1}, Ll/ۛۢܺ;->getType()Ll/۫ܺܺ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܽ᩷ܺ;->ۧ(Ll/۫ܺܺ;)Ll/ۧ᩷ܺ;

    .line 459
    invoke-virtual {p1}, Ll/ۛۢܺ;->ۚ()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۢܺ;

    .line 460
    invoke-virtual {v0}, Ll/۟ۢܺ;->getName()Ll/۬ܺܺ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֫᩷ܺ;->ۧ(Ll/۬ܺܺ;)V

    .line 461
    invoke-virtual {v0}, Ll/۟ۢܺ;->getValue()Ll/ܰۡܺ;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩻᩷ܺ;->֫(Ll/֫ۜܺ;Ll/ܰۡܺ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֫ۜܺ;Ll/ܰۡܺ;)V
    .locals 3

    .line 476
    instance-of v0, p1, Ll/۟ۡܺ;

    if-eqz v0, :cond_0

    .line 477
    check-cast p1, Ll/۟ۡܺ;

    invoke-virtual {p1}, Ll/۟ۡܺ;->ܺ()Ll/ۛۢܺ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/᩻᩷ܺ;->֫(Ll/֫ۜܺ;Ll/ۛۢܺ;)V

    return-void

    .line 478
    :cond_0
    instance-of v0, p1, Ll/ۧܺܺ;

    if-eqz v0, :cond_2

    .line 479
    check-cast p1, Ll/ۧܺܺ;

    invoke-virtual {p1}, Ll/ۧܺܺ;->ܺ()Ll/֫ܺܺ;

    move-result-object p1

    .line 480
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 482
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v2

    invoke-static {p0, v2}, Ll/᩻᩷ܺ;->֫(Ll/֫ۜܺ;Ll/ܰۡܺ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 485
    :cond_2
    invoke-virtual {p0, p1}, Ll/֫ۜܺ;->ۧ(Ll/ܰۡܺ;)V

    return-void
.end method

.method public static ۧ(Ll/ܰۡܺ;)Ljava/lang/String;
    .locals 2

    .line 430
    invoke-static {p0}, Ll/᩻᩷ܺ;->ܽ(Ll/ܰۡܺ;)I

    move-result v0

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_0

    const-string p0, "null"

    return-object p0

    .line 436
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 438
    invoke-virtual {p0}, Ll/ܰۡܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    .line 439
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 440
    invoke-interface {p0}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/ܰۡܺ;)I
    .locals 1

    .line 279
    instance-of v0, p0, Ll/ܿܺܺ;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 281
    :cond_0
    instance-of v0, p0, Ll/ۗܺܺ;

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    .line 283
    :cond_1
    instance-of v0, p0, Ll/ۜܺܺ;

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    .line 285
    :cond_2
    instance-of v0, p0, Ll/ۖܺܺ;

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    .line 287
    :cond_3
    instance-of v0, p0, Ll/۠ܺܺ;

    if-eqz v0, :cond_4

    const/4 p0, 0x6

    return p0

    .line 289
    :cond_4
    instance-of v0, p0, Ll/ܺܺܺ;

    if-eqz v0, :cond_5

    const/16 p0, 0x10

    return p0

    .line 291
    :cond_5
    instance-of v0, p0, Ll/᩷ܺܺ;

    if-eqz v0, :cond_6

    const/16 p0, 0x11

    return p0

    .line 293
    :cond_6
    instance-of v0, p0, Ll/ۙܺܺ;

    if-eqz v0, :cond_7

    const/16 p0, 0x15

    return p0

    .line 295
    :cond_7
    instance-of v0, p0, Ll/᩸ܺܺ;

    if-eqz v0, :cond_8

    const/16 p0, 0x16

    return p0

    .line 297
    :cond_8
    instance-of v0, p0, Ll/۬ܺܺ;

    if-eqz v0, :cond_9

    const/16 p0, 0x17

    return p0

    .line 299
    :cond_9
    instance-of v0, p0, Ll/۫ܺܺ;

    if-eqz v0, :cond_a

    const/16 p0, 0x18

    return p0

    .line 301
    :cond_a
    instance-of v0, p0, Ll/ۡܺܺ;

    if-eqz v0, :cond_b

    const/16 p0, 0x19

    return p0

    .line 303
    :cond_b
    instance-of v0, p0, Ll/᩹ܺܺ;

    if-eqz v0, :cond_c

    const/16 p0, 0x1a

    return p0

    .line 305
    :cond_c
    instance-of v0, p0, Ll/ۢܺܺ;

    if-eqz v0, :cond_d

    const/16 p0, 0x1b

    return p0

    .line 307
    :cond_d
    instance-of v0, p0, Ll/ۧܺܺ;

    if-eqz v0, :cond_e

    const/16 p0, 0x1c

    return p0

    .line 309
    :cond_e
    instance-of v0, p0, Ll/۟ۡܺ;

    if-eqz v0, :cond_f

    const/16 p0, 0x1d

    return p0

    .line 311
    :cond_f
    instance-of v0, p0, Ll/᩵ܺܺ;

    if-eqz v0, :cond_10

    const/16 p0, 0x1e

    return p0

    .line 313
    :cond_10
    instance-of p0, p0, Ll/ᩳܺܺ;

    if-eqz p0, :cond_11

    const/16 p0, 0x1f

    return p0

    .line 316
    :cond_11
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Shouldn\'t happen"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ۛۢܺ;Z)V
    .locals 10

    const/4 v0, 0x0

    .line 372
    iget-object v1, p0, Ll/᩻᩷ܺ;->ۧ:Ll/ᩳᩴܺ;

    if-eqz p2, :cond_0

    invoke-virtual {v1}, Ll/ᩳᩴܺ;->֫()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 373
    :goto_0
    iget-object v2, p0, Ll/᩻᩷ܺ;->֫:Ll/֫ۜܺ;

    invoke-virtual {v2}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v3

    .line 374
    invoke-virtual {v2}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v2

    .line 376
    invoke-virtual {p1}, Ll/ۛۢܺ;->getType()Ll/۫ܺܺ;

    move-result-object v4

    .line 377
    invoke-virtual {v2, v4}, Ll/ܽ᩷ܺ;->֫(Ll/۫ܺܺ;)I

    move-result v5

    const-string v6, " // "

    if-eqz p2, :cond_1

    .line 380
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "  type_idx: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    invoke-virtual {v4}, Ll/۫ܺܺ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 380
    invoke-virtual {v1, v4}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    .line 384
    :cond_1
    invoke-virtual {p1}, Ll/ۛۢܺ;->getType()Ll/۫ܺܺ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ܽ᩷ܺ;->֫(Ll/۫ܺܺ;)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 386
    invoke-virtual {p1}, Ll/ۛۢܺ;->ۚ()Ljava/util/Collection;

    move-result-object p1

    .line 387
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    if-eqz p2, :cond_2

    .line 390
    invoke-static {v2}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "  size: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    .line 393
    :cond_2
    invoke-virtual {v1, v2}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 396
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ۢܺ;

    .line 397
    invoke-virtual {v4}, Ll/۟ۢܺ;->getName()Ll/۬ܺܺ;

    move-result-object v5

    .line 398
    invoke-virtual {v3, v5}, Ll/֫᩷ܺ;->֫(Ll/۬ܺܺ;)I

    move-result v7

    .line 399
    invoke-virtual {v4}, Ll/۟ۢܺ;->getValue()Ll/ܰۡܺ;

    move-result-object v4

    if-eqz p2, :cond_3

    .line 402
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "  elements["

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "]:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v0, v8}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    .line 404
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "    name_idx: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    invoke-virtual {v5}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 404
    invoke-virtual {v1, v5}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    .line 408
    :cond_3
    invoke-virtual {v1, v7}, Ll/ᩳᩴܺ;->ۜ(I)I

    if-eqz p2, :cond_4

    .line 411
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "    value: "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ll/᩻᩷ܺ;->ۧ(Ll/ܰۡܺ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    .line 414
    :cond_4
    invoke-virtual {p0, v4}, Ll/᩻᩷ܺ;->֫(Ll/ܰۡܺ;)V

    goto :goto_1

    :cond_5
    if-eqz p2, :cond_6

    .line 418
    invoke-virtual {v1}, Ll/ᩳᩴܺ;->ۧ()V

    :cond_6
    return-void
.end method

.method public final ֫(Ll/ۧܺܺ;Z)V
    .locals 6

    const/4 v0, 0x0

    .line 334
    iget-object v1, p0, Ll/᩻᩷ܺ;->ۧ:Ll/ᩳᩴܺ;

    if-eqz p2, :cond_0

    invoke-virtual {v1}, Ll/ᩳᩴܺ;->֫()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 335
    :goto_0
    invoke-virtual {p1}, Ll/ۧܺܺ;->ܺ()Ll/֫ܺܺ;

    move-result-object p1

    .line 336
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v2

    if-eqz p2, :cond_1

    .line 339
    invoke-static {v2}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "  size: "

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    .line 342
    :cond_1
    invoke-virtual {v1, v2}, Ll/ᩳᩴܺ;->ۜ(I)I

    :goto_1
    if-ge v0, v2, :cond_3

    .line 345
    invoke-virtual {p1, v0}, Ll/ܿᩴܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v3

    if-eqz p2, :cond_2

    .line 347
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "  ["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "] "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    invoke-static {v3}, Ll/᩻᩷ܺ;->ۧ(Ll/ܰۡܺ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 347
    invoke-virtual {v1, v4}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    .line 350
    :cond_2
    invoke-virtual {p0, v3}, Ll/᩻᩷ܺ;->֫(Ll/ܰۡܺ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_4

    .line 354
    invoke-virtual {v1}, Ll/ᩳᩴܺ;->ۧ()V

    :cond_4
    return-void
.end method

.method public final ֫(Ll/ܰۡܺ;)V
    .locals 7

    .line 177
    invoke-static {p1}, Ll/᩻᩷ܺ;->ܽ(Ll/ܰۡܺ;)I

    move-result v0

    const/4 v1, 0x3

    .line 180
    iget-object v2, p0, Ll/᩻᩷ܺ;->ۧ:Ll/ᩳᩴܺ;

    if-eqz v0, :cond_3

    const/4 v3, 0x6

    if-eq v0, v3, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    if-eq v0, v1, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_3

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    const/16 v1, 0x11

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    iget-object v3, p0, Ll/᩻᩷ܺ;->֫:Ll/֫ۜܺ;

    packed-switch v0, :pswitch_data_0

    .line 262
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Shouldn\'t happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 257
    :pswitch_0
    check-cast p1, Ll/ᩳܺܺ;

    invoke-virtual {p1}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    shl-int/lit8 p1, p1, 0x5

    or-int/2addr p1, v0

    .line 258
    invoke-virtual {v2, p1}, Ll/ᩳᩴܺ;->ᩳ(I)V

    return-void

    .line 253
    :pswitch_1
    invoke-virtual {v2, v0}, Ll/ᩳᩴܺ;->ᩳ(I)V

    return-void

    .line 247
    :pswitch_2
    invoke-virtual {v2, v0}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 248
    check-cast p1, Ll/۟ۡܺ;

    invoke-virtual {p1}, Ll/۟ۡܺ;->ܺ()Ll/ۛۢܺ;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Ll/᩻᩷ܺ;->֫(Ll/ۛۢܺ;Z)V

    return-void

    .line 242
    :pswitch_3
    invoke-virtual {v2, v0}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 243
    check-cast p1, Ll/ۧܺܺ;

    invoke-virtual {p0, p1, v1}, Ll/᩻᩷ܺ;->֫(Ll/ۧܺܺ;Z)V

    return-void

    .line 236
    :pswitch_4
    check-cast p1, Ll/ۢܺܺ;

    invoke-virtual {p1}, Ll/ۢܺܺ;->ᩴ()Ll/ۡܺܺ;

    move-result-object p1

    .line 237
    invoke-virtual {v3}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۜۜܺ;->֫(Ll/ۡܺܺ;)I

    move-result p1

    int-to-long v3, p1

    .line 238
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 231
    :pswitch_5
    invoke-virtual {v3}, Ll/֫ۜܺ;->ܺ()Ll/᩸ۜܺ;

    move-result-object v1

    check-cast p1, Ll/᩹ܺܺ;

    invoke-virtual {v1, p1}, Ll/᩸ۜܺ;->֫(Ll/ܽܺܺ;)I

    move-result p1

    int-to-long v3, p1

    .line 232
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 226
    :pswitch_6
    invoke-virtual {v3}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object v1

    check-cast p1, Ll/ۡܺܺ;

    invoke-virtual {v1, p1}, Ll/ۜۜܺ;->֫(Ll/ۡܺܺ;)I

    move-result p1

    int-to-long v3, p1

    .line 227
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 221
    :pswitch_7
    invoke-virtual {v3}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v1

    check-cast p1, Ll/۫ܺܺ;

    invoke-virtual {v1, p1}, Ll/ܽ᩷ܺ;->֫(Ll/۫ܺܺ;)I

    move-result p1

    int-to-long v3, p1

    .line 222
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 216
    :pswitch_8
    invoke-virtual {v3}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v1

    check-cast p1, Ll/۬ܺܺ;

    invoke-virtual {v1, p1}, Ll/֫᩷ܺ;->֫(Ll/۬ܺܺ;)I

    move-result p1

    int-to-long v3, p1

    .line 217
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 211
    :pswitch_9
    invoke-virtual {v3}, Ll/֫ۜܺ;->ۡ()Ll/۠ۜܺ;

    move-result-object v1

    check-cast p1, Ll/᩸ܺܺ;

    invoke-virtual {v1, p1}, Ll/۠ۜܺ;->֫(Ll/᩸ܺܺ;)I

    move-result p1

    int-to-long v3, p1

    .line 212
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 206
    :pswitch_a
    invoke-virtual {v3}, Ll/֫ۜܺ;->ۖ()Ll/ۤۜܺ;

    move-result-object v1

    check-cast p1, Ll/ۙܺܺ;

    invoke-virtual {p1}, Ll/ۙܺܺ;->ܺ()Ll/᩺ܺܺ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۤۜܺ;->֫(Ll/᩺ܺܺ;)I

    move-result p1

    int-to-long v3, p1

    .line 207
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 201
    :cond_0
    check-cast p1, Ll/᩷ܺܺ;

    invoke-virtual {p1}, Ll/ۚܺܺ;->֡()J

    move-result-wide v3

    .line 202
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->֫(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 196
    :cond_1
    check-cast p1, Ll/ܺܺܺ;

    invoke-virtual {p1}, Ll/֡ܺܺ;->֡()J

    move-result-wide v3

    const/16 p1, 0x20

    shl-long/2addr v3, p1

    .line 197
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->֫(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 190
    :cond_2
    check-cast p1, Ll/֨ܺܺ;

    invoke-virtual {p1}, Ll/֨ܺܺ;->֡()J

    move-result-wide v3

    .line 191
    invoke-static {v2, v0, v3, v4}, Ll/᩶ۗ֡;->ۧ(Ll/ᩳᩴܺ;IJ)V

    return-void

    .line 185
    :cond_3
    check-cast p1, Ll/֨ܺܺ;

    invoke-virtual {p1}, Ll/֨ܺܺ;->֡()J

    move-result-wide v3

    const/16 p1, 0x3f

    shr-long v5, v3, p1

    xor-long/2addr v5, v3

    .line 42
    invoke-static {v5, v6}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x48

    shr-int/2addr p1, v1

    add-int/lit8 v1, p1, -0x1

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr v0, v1

    .line 51
    invoke-virtual {v2, v0}, Ll/ᩳᩴܺ;->ᩳ(I)V

    :goto_0
    if-lez p1, :cond_4

    long-to-int v0, v3

    int-to-byte v0, v0

    .line 55
    invoke-virtual {v2, v0}, Ll/ᩳᩴܺ;->ᩳ(I)V

    const/16 v0, 0x8

    shr-long/2addr v3, v0

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
