.class public final Ll/ۚᩳܺ;
.super Ljava/lang/Object;
.source "9BEU"


# instance fields
.field public final ֫:Ll/ۧᩴܺ;

.field public ۧ:I

.field public final ܽ:[I

.field public final ᩳ:Ll/ۤܺܺ;


# direct methods
.method public constructor <init>(Ll/ۧᩴܺ;)V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 94
    invoke-virtual {p1, v0}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v0

    .line 96
    iput-object p1, p0, Ll/ۚᩳܺ;->֫:Ll/ۧᩴܺ;

    .line 97
    new-instance p1, Ll/ۤܺܺ;

    invoke-direct {p1, v0}, Ll/ۤܺܺ;-><init>(I)V

    iput-object p1, p0, Ll/ۚᩳܺ;->ᩳ:Ll/ۤܺܺ;

    .line 98
    new-array p1, v0, [I

    iput-object p1, p0, Ll/ۚᩳܺ;->ܽ:[I

    const/4 p1, -0x1

    .line 99
    iput p1, p0, Ll/ۚᩳܺ;->ۧ:I

    return-void
.end method

.method private ֫(I)Ll/۬ܺܺ;
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 423
    iget-object v1, p0, Ll/ۚᩳܺ;->֫:Ll/ۧᩴܺ;

    invoke-virtual {v1, v0}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v0

    add-int/lit8 p1, p1, 0x3

    add-int/2addr v0, p1

    .line 427
    invoke-virtual {v1, p1, v0}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object p1

    .line 430
    :try_start_0
    new-instance v0, Ll/۬ܺܺ;

    invoke-direct {v0, p1}, Ll/۬ܺܺ;-><init>(Ll/ۧᩴܺ;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 433
    new-instance v0, Ll/᩺ᩳܺ;

    const/4 v1, 0x0

    .line 69
    invoke-direct {v0, v1, p1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 433
    throw v0
.end method

.method private ֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;
    .locals 10

    const-string v0, " at offset "

    const-string v1, "...while parsing cst "

    .line 270
    iget-object v2, p0, Ll/ۚᩳܺ;->֫:Ll/ۧᩴܺ;

    const-string v3, "unknown tag byte: "

    const-string v4, "Unsupported MethodHandle kind: "

    const-string v5, "Unsupported ref constant type for MethodHandle "

    iget-object v6, p0, Ll/ۚᩳܺ;->ᩳ:Ll/ۤܺܺ;

    invoke-virtual {v6, p2}, Ll/ۤܺܺ;->֫(I)Ll/ܰۡܺ;

    move-result-object v7

    if-eqz v7, :cond_0

    return-object v7

    .line 275
    :cond_0
    iget-object v7, p0, Ll/ۚᩳܺ;->ܽ:[I

    aget v7, v7, p2

    const/4 v8, 0x0

    .line 278
    :try_start_0
    invoke-virtual {v2, v7}, Ll/ۧᩴܺ;->ܿ(I)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    .line 398
    :pswitch_0
    new-instance p1, Ll/᩺ᩳܺ;

    goto/16 :goto_6

    :pswitch_1
    add-int/lit8 v3, v7, 0x1

    .line 391
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v3

    add-int/lit8 v4, v7, 0x3

    .line 392
    invoke-virtual {v2, v4}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 393
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/᩶ܺܺ;

    .line 394
    invoke-static {v3, p1}, Ll/ᩴܺܺ;->֫(ILl/᩶ܺܺ;)Ll/ᩴܺܺ;

    move-result-object p1

    goto/16 :goto_5

    :pswitch_2
    add-int/lit8 v3, v7, 0x1

    .line 385
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 386
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/۬ܺܺ;

    .line 43
    invoke-virtual {p1}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ܺܺ;->֫(Ljava/lang/String;)Ll/᩺ܺܺ;

    move-result-object p1

    .line 44
    new-instance v2, Ll/ۙܺܺ;

    invoke-direct {v2, p1}, Ll/ۙܺܺ;-><init>(Ll/᩺ܺܺ;)V

    goto/16 :goto_4

    :pswitch_3
    add-int/lit8 v3, v7, 0x1

    .line 349
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܿ(I)I

    move-result v3

    add-int/lit8 v9, v7, 0x2

    .line 350
    invoke-virtual {v2, v9}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    packed-switch v3, :pswitch_data_1

    .line 377
    new-instance p1, Ll/᩺ᩳܺ;

    goto :goto_3

    .line 374
    :pswitch_4
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/ۘܺܺ;

    goto :goto_0

    .line 365
    :pswitch_5
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    .line 366
    instance-of v2, p1, Ll/᩹ܺܺ;

    if-nez v2, :cond_2

    instance-of v2, p1, Ll/ۘܺܺ;

    if-eqz v2, :cond_1

    goto :goto_0

    .line 368
    :cond_1
    new-instance v2, Ll/᩺ᩳܺ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 60
    invoke-direct {v2, p1, v8}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 370
    throw v2

    .line 361
    :pswitch_6
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/᩹ܺܺ;

    goto :goto_0

    .line 357
    :pswitch_7
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/ۡܺܺ;

    :cond_2
    :goto_0
    packed-switch v3, :pswitch_data_2

    .line 458
    new-instance p1, Ljava/lang/IllegalArgumentException;

    goto :goto_2

    :pswitch_8
    const/16 v2, 0x8

    goto :goto_1

    :pswitch_9
    const/4 v2, 0x6

    goto :goto_1

    :pswitch_a
    const/4 v2, 0x7

    goto :goto_1

    :pswitch_b
    const/4 v2, 0x4

    goto :goto_1

    :pswitch_c
    const/4 v2, 0x5

    goto :goto_1

    :pswitch_d
    const/4 v2, 0x0

    goto :goto_1

    :pswitch_e
    const/4 v2, 0x2

    goto :goto_1

    :pswitch_f
    const/4 v2, 0x1

    goto :goto_1

    :pswitch_10
    const/4 v2, 0x3

    .line 381
    :goto_1
    invoke-static {v2, p1}, Ll/᩸ܺܺ;->֫(ILl/ܰۡܺ;)Ll/᩸ܺܺ;

    move-result-object p1

    goto/16 :goto_5

    :goto_2
    const-string v2, "invalid kind: "

    .line 0
    invoke-static {v3, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 458
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 377
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 60
    invoke-direct {p1, v2, v8}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 377
    throw p1

    :pswitch_11
    add-int/lit8 v3, v7, 0x1

    .line 341
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v3

    .line 342
    invoke-direct {p0, p1, v3}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object v3

    check-cast v3, Ll/۬ܺܺ;

    add-int/lit8 v4, v7, 0x3

    .line 343
    invoke-virtual {v2, v4}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 344
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/۬ܺܺ;

    .line 345
    new-instance v2, Ll/᩶ܺܺ;

    invoke-direct {v2, v3, p1}, Ll/᩶ܺܺ;-><init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V

    goto/16 :goto_4

    :pswitch_12
    add-int/lit8 v3, v7, 0x1

    .line 333
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v3

    .line 334
    invoke-direct {p0, p1, v3}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object v3

    check-cast v3, Ll/۫ܺܺ;

    add-int/lit8 v4, v7, 0x3

    .line 335
    invoke-virtual {v2, v4}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 336
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/᩶ܺܺ;

    .line 337
    new-instance v2, Ll/ۘܺܺ;

    invoke-direct {v2, v3, p1}, Ll/ۘܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    goto/16 :goto_4

    :pswitch_13
    add-int/lit8 v3, v7, 0x1

    .line 325
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v3

    .line 326
    invoke-direct {p0, p1, v3}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object v3

    check-cast v3, Ll/۫ܺܺ;

    add-int/lit8 v4, v7, 0x3

    .line 327
    invoke-virtual {v2, v4}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 328
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/᩶ܺܺ;

    .line 329
    new-instance v2, Ll/᩹ܺܺ;

    invoke-direct {v2, v3, p1}, Ll/᩹ܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    goto/16 :goto_4

    :pswitch_14
    add-int/lit8 v3, v7, 0x1

    .line 317
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v3

    .line 318
    invoke-direct {p0, p1, v3}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object v3

    check-cast v3, Ll/۫ܺܺ;

    add-int/lit8 v4, v7, 0x3

    .line 319
    invoke-virtual {v2, v4}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 320
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/᩶ܺܺ;

    .line 321
    new-instance v2, Ll/ۡܺܺ;

    invoke-direct {v2, v3, p1}, Ll/ۡܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    goto :goto_4

    :pswitch_15
    add-int/lit8 v3, v7, 0x1

    .line 312
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 313
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    goto :goto_5

    :pswitch_16
    add-int/lit8 v3, v7, 0x1

    .line 306
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 307
    invoke-direct {p0, p1, v2}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/۬ܺܺ;

    .line 308
    new-instance v2, Ll/۫ܺܺ;

    invoke-virtual {p1}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۟ܺܺ;->ۧ(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object p1

    invoke-direct {v2, p1}, Ll/۫ܺܺ;-><init>(Ll/۟ܺܺ;)V

    goto :goto_4

    :pswitch_17
    add-int/lit8 p1, v7, 0x1

    .line 301
    invoke-virtual {v2, p1}, Ll/ۧᩴܺ;->ܽ(I)J

    move-result-wide v2

    .line 302
    invoke-static {v2, v3}, Ll/᩷ܺܺ;->֫(J)Ll/᩷ܺܺ;

    move-result-object p1

    goto :goto_5

    :pswitch_18
    add-int/lit8 p1, v7, 0x1

    .line 296
    invoke-virtual {v2, p1}, Ll/ۧᩴܺ;->ܽ(I)J

    move-result-wide v2

    .line 297
    invoke-static {v2, v3}, Ll/۠ܺܺ;->֫(J)Ll/۠ܺܺ;

    move-result-object p1

    goto :goto_5

    :pswitch_19
    add-int/lit8 p1, v7, 0x1

    .line 291
    invoke-virtual {v2, p1}, Ll/ۧᩴܺ;->ۧ(I)I

    move-result p1

    .line 292
    invoke-static {p1}, Ll/ܺܺܺ;->֫(I)Ll/ܺܺܺ;

    move-result-object p1

    goto :goto_5

    :pswitch_1a
    add-int/lit8 p1, v7, 0x1

    .line 286
    invoke-virtual {v2, p1}, Ll/ۧᩴܺ;->ۧ(I)I

    move-result p1

    .line 287
    invoke-static {p1}, Ll/ۖܺܺ;->֫(I)Ll/ۖܺܺ;

    move-result-object p1

    goto :goto_5

    .line 281
    :pswitch_1b
    invoke-direct {p0, v7}, Ll/ۚᩳܺ;->֫(I)Ll/۬ܺܺ;

    move-result-object v2

    .line 282
    invoke-virtual {p1, p2}, Ljava/util/BitSet;->set(I)V
    :try_end_0
    .catch Ll/᩺ᩳܺ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    move-object p1, v2

    .line 412
    :goto_5
    invoke-virtual {v6, p2, p1}, Ll/ۤܺܺ;->֫(ILl/ܰۡܺ;)V

    return-object p1

    .line 398
    :goto_6
    :try_start_1
    invoke-static {v9}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 60
    invoke-direct {p1, v2, v8}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 398
    throw p1
    :try_end_1
    .catch Ll/᩺ᩳܺ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    .line 406
    new-instance v2, Ll/᩺ᩳܺ;

    .line 69
    invoke-direct {v2, v8, p1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 407
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    invoke-static {v7}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 407
    invoke-virtual {v2, p1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 409
    throw v2

    :catch_1
    move-exception p1

    .line 402
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    invoke-static {v7}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 402
    invoke-virtual {p1, p2}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 404
    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method private ܽ()V
    .locals 6

    .line 136
    iget v0, p0, Ll/ۚᩳܺ;->ۧ:I

    if-gez v0, :cond_2

    const/16 v0, 0xa

    const/4 v1, 0x1

    const/4 v2, 0x1

    .line 200
    :goto_0
    iget-object v3, p0, Ll/ۚᩳܺ;->ܽ:[I

    array-length v4, v3

    if-ge v2, v4, :cond_0

    .line 201
    aput v0, v3, v2

    .line 202
    iget-object v3, p0, Ll/ۚᩳܺ;->֫:Ll/ۧᩴܺ;

    invoke-virtual {v3, v0}, Ll/ۧᩴܺ;->ܿ(I)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 248
    :pswitch_0
    :try_start_0
    new-instance v1, Ll/᩺ᩳܺ;

    goto :goto_3

    :pswitch_1
    add-int/lit8 v0, v0, 0x4

    goto :goto_1

    :pswitch_2
    add-int/lit8 v0, v0, 0x3

    goto :goto_1

    :pswitch_3
    add-int/lit8 v0, v0, 0x9

    const/4 v3, 0x2

    goto :goto_2

    :pswitch_4
    add-int/lit8 v0, v0, 0x5

    goto :goto_1

    :pswitch_5
    add-int/lit8 v4, v0, 0x1

    .line 229
    invoke-virtual {v3, v4}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x3

    add-int/2addr v0, v3

    :goto_1
    const/4 v3, 0x1

    :goto_2
    add-int/2addr v2, v3

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_4

    .line 248
    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "unknown tag byte: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 60
    invoke-direct {v1, v3, v4}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 248
    throw v1
    :try_end_0
    .catch Ll/᩺ᩳܺ; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "...while preparsing cst "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at offset "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 253
    throw v1

    .line 257
    :cond_0
    iput v0, p0, Ll/ۚᩳܺ;->ۧ:I

    .line 158
    new-instance v0, Ljava/util/BitSet;

    array-length v2, v3

    invoke-direct {v0, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 160
    :goto_5
    array-length v2, v3

    if-ge v1, v2, :cond_2

    .line 161
    aget v2, v3, v1

    if-eqz v2, :cond_1

    .line 162
    iget-object v2, p0, Ll/ۚᩳܺ;->ᩳ:Ll/ۤܺܺ;

    invoke-virtual {v2, v1}, Ll/ۤܺܺ;->֫(I)Ll/ܰۡܺ;

    move-result-object v2

    if-nez v2, :cond_1

    .line 163
    invoke-direct {p0, v0, v1}, Ll/ۚᩳܺ;->֫(Ljava/util/BitSet;I)Ll/ܰۡܺ;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 118
    invoke-direct {p0}, Ll/ۚᩳܺ;->ܽ()V

    .line 119
    iget v0, p0, Ll/ۚᩳܺ;->ۧ:I

    return v0
.end method

.method public final ۧ()Ll/ۤܺܺ;
    .locals 1

    .line 128
    invoke-direct {p0}, Ll/ۚᩳܺ;->ܽ()V

    .line 129
    iget-object v0, p0, Ll/ۚᩳܺ;->ᩳ:Ll/ۤܺܺ;

    return-object v0
.end method
