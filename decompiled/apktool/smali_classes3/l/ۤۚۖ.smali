.class public final Ll/ۤۚۖ;
.super Ljava/lang/Object;
.source "P9QN"


# static fields
.field public static final ܽ:Ll/ۤۚۖ;


# instance fields
.field public final ֫:Ll/ᩳۘۖ;

.field public final ۧ:Ll/ܽ֨ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 110
    new-instance v0, Ll/ۤۚۖ;

    .line 112
    sget v1, Ll/ܽ֨ۖ;->֫:I

    .line 32
    invoke-static {}, Ll/ۧ֨ۖ;->֫()Ll/ܽ֨ۖ;

    move-result-object v1

    .line 112
    invoke-static {}, Ll/ᩳۘۖ;->֫()Ll/ᩳۘۖ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۤۚۖ;-><init>(Ll/ܽ֨ۖ;Ll/ᩳۘۖ;)V

    sput-object v0, Ll/ۤۚۖ;->ܽ:Ll/ۤۚۖ;

    return-void
.end method

.method public constructor <init>(Ll/ܽ֨ۖ;Ll/ᩳۘۖ;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput-object p1, p0, Ll/ۤۚۖ;->ۧ:Ll/ܽ֨ۖ;

    .line 126
    iput-object p2, p0, Ll/ۤۚۖ;->֫:Ll/ᩳۘۖ;

    return-void
.end method

.method public static ֫(Ll/ۢ֨ۖ;)Ljava/lang/String;
    .locals 2

    .line 445
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    sget v1, Ll/ۨۚۖ;->֫:I

    .line 641
    new-instance v1, Ll/ۛۚۖ;

    invoke-direct {v1, v0}, Ll/ۛۚۖ;-><init>(Ljava/lang/StringBuilder;)V

    .line 179
    invoke-static {p0, v1}, Ll/ۤۚۖ;->֫(Ll/ۢ֨ۖ;Ll/ۛۚۖ;)V

    .line 447
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 449
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic ֫()Ll/ۤۚۖ;
    .locals 1

    .line 107
    sget-object v0, Ll/ۤۚۖ;->ܽ:Ll/ۤۚۖ;

    return-object v0
.end method

.method public static ֫(IILjava/util/List;Ll/ۛۚۖ;)V
    .locals 6

    .line 611
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 612
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    const-string v1, ": "

    .line 613
    invoke-virtual {p3, v1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    and-int/lit8 v1, p1, 0x7

    if-eqz v1, :cond_4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v3, :cond_3

    const/4 v5, 0x2

    if-eq v1, v5, :cond_2

    const/4 v5, 0x3

    if-eq v1, v5, :cond_1

    const/4 v5, 0x5

    if-ne v1, v5, :cond_0

    .line 502
    check-cast v0, Ljava/lang/Integer;

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "0x%08x"

    invoke-static {v4, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 528
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bad tag: "

    .line 0
    invoke-static {p1, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 528
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 525
    :cond_1
    check-cast v0, Ll/ۢ֨ۖ;

    invoke-static {v0, p3}, Ll/ۤۚۖ;->֫(Ll/ۢ֨ۖ;Ll/ۛۚۖ;)V

    goto/16 :goto_2

    .line 510
    :cond_2
    :try_start_0
    move-object v1, v0

    check-cast v1, Ll/ۛۜۖ;

    sget v3, Ll/ۢ֨ۖ;->᩹:I

    .line 48
    invoke-static {}, Ll/ܳ֨ۖ;->֫()Ll/ܳ֨ۖ;

    move-result-object v3
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_2

    .line 514
    :try_start_1
    invoke-virtual {v1}, Ll/ۛۜۖ;->ܽ()Ll/۟ۜۖ;

    move-result-object v1

    .line 515
    invoke-virtual {v3, v1}, Ll/ܳ֨ۖ;->֫(Ll/۟ۜۖ;)V

    .line 516
    invoke-virtual {v1, v2}, Ll/۟ۜۖ;->֫(I)V
    :try_end_1
    .catch Ll/֫᩵ۖ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 246
    :try_start_2
    invoke-virtual {v3}, Ll/ܳ֨ۖ;->build()Ll/ۢ֨ۖ;

    move-result-object v1

    const-string v2, "{"

    .line 511
    invoke-virtual {p3, v2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 512
    invoke-virtual {p3}, Ll/ۛۚۖ;->֫()V

    .line 513
    invoke-virtual {p3}, Ll/ۛۚۖ;->ۧ()V

    .line 514
    invoke-static {v1, p3}, Ll/ۤۚۖ;->֫(Ll/ۢ֨ۖ;Ll/ۛۚۖ;)V

    .line 515
    invoke-virtual {p3}, Ll/ۛۚۖ;->ܽ()V

    const-string v1, "}"

    .line 516
    invoke-virtual {p3, v1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_2

    :catch_0
    move-exception v1

    .line 521
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Reading from a ByteString threw an IOException (should never happen)."

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    .line 519
    throw v1
    :try_end_2
    .catch Ll/֫᩵ۖ; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const-string v1, "\""

    invoke-virtual {p3, v1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 520
    check-cast v0, Ll/ۛۜۖ;

    sget v2, Ll/ۨۚۖ;->֫:I

    .line 2226
    invoke-static {v0}, Ll/֫֨ۖ;->֫(Ll/ۛۜۖ;)Ljava/lang/String;

    move-result-object v0

    .line 520
    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 521
    invoke-virtual {p3, v1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_2

    .line 505
    :cond_3
    check-cast v0, Ljava/lang/Long;

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "0x%016x"

    invoke-static {v4, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_2

    .line 499
    :cond_4
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget v2, Ll/ۨۚۖ;->֫:I

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_5

    .line 632
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    .line 636
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    .line 499
    :goto_1
    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 615
    :goto_2
    invoke-virtual {p3}, Ll/ۛۚۖ;->֫()V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private ֫(Ll/֡ۖۖ;Ljava/lang/Object;Ll/ۛۚۖ;)V
    .locals 6

    .line 543
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "["

    .line 544
    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 546
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    invoke-virtual {p1}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v1, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-ne v0, v1, :cond_0

    .line 548
    invoke-virtual {p1}, Ll/֡ۖۖ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 550
    invoke-virtual {p1}, Ll/֡ۖۖ;->֨()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 551
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 553
    :cond_0
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    :goto_0
    const-string v0, "]"

    .line 555
    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_1

    .line 557
    :cond_1
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۗ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 559
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_1

    .line 561
    :cond_2
    invoke-virtual {p1}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 565
    :goto_1
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_3

    const-string v0, " {"

    .line 566
    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 567
    invoke-virtual {p3}, Ll/ۛۚۖ;->֫()V

    .line 568
    invoke-virtual {p3}, Ll/ۛۚۖ;->ۧ()V

    goto :goto_2

    :cond_3
    const-string v0, ": "

    .line 570
    invoke-virtual {p3, v0}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 367
    :goto_2
    sget-object v0, Ll/ۙۚۖ;->ۧ:[I

    invoke-virtual {p1}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const-string v2, "\""

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_6

    .line 427
    :pswitch_0
    check-cast p2, Ll/ۘ֡ۖ;

    invoke-direct {p0, p2, p3}, Ll/ۤۚۖ;->֫(Ll/ۘ֡ۖ;Ll/ۛۚۖ;)V

    goto/16 :goto_6

    .line 422
    :pswitch_1
    check-cast p2, Ll/ۖۖۖ;

    invoke-virtual {p2}, Ll/ۖۖۖ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 412
    :pswitch_2
    invoke-virtual {p3, v2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 413
    instance-of v0, p2, Ll/ۛۜۖ;

    if-eqz v0, :cond_4

    .line 414
    check-cast p2, Ll/ۛۜۖ;

    sget v0, Ll/ۨۚۖ;->֫:I

    .line 2226
    invoke-static {p2}, Ll/֫֨ۖ;->֫(Ll/ۛۜۖ;)Ljava/lang/String;

    move-result-object p2

    .line 414
    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_3

    .line 416
    :cond_4
    check-cast p2, [B

    sget v0, Ll/ۨۚۖ;->֫:I

    .line 112
    new-instance v0, Ll/ܰۚۖ;

    invoke-direct {v0, p2}, Ll/ܰۚۖ;-><init>([B)V

    invoke-static {v0}, Ll/֫֨ۖ;->֫(Ll/۟ۚۖ;)Ljava/lang/String;

    move-result-object p2

    .line 416
    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 418
    :goto_3
    invoke-virtual {p3, v2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 403
    :pswitch_3
    invoke-virtual {p3, v2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 406
    check-cast p2, Ljava/lang/String;

    .line 130
    invoke-static {p2}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object p2

    invoke-static {p2}, Ll/֫֨ۖ;->֫(Ll/ۛۜۖ;)Ljava/lang/String;

    move-result-object p2

    .line 404
    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 408
    invoke-virtual {p3, v2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 399
    :pswitch_4
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget p2, Ll/ۨۚۖ;->֫:I

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    if-ltz p2, :cond_5

    .line 632
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_5
    const-wide v4, 0x7fffffffffffffffL

    and-long/2addr v2, v4

    .line 636
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p2

    const/16 v0, 0x3f

    invoke-virtual {p2, v0}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p2}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p2

    .line 399
    :goto_4
    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 394
    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget v0, Ll/ۨۚۖ;->֫:I

    if-ltz p2, :cond_6

    .line 623
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_5

    :cond_6
    int-to-long v2, p2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    .line 625
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    .line 394
    :goto_5
    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 389
    :pswitch_6
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 385
    :pswitch_7
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 381
    :pswitch_8
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 377
    :pswitch_9
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 371
    :pswitch_a
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 575
    :goto_6
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object p1

    if-ne p1, v1, :cond_7

    .line 576
    invoke-virtual {p3}, Ll/ۛۚۖ;->ܽ()V

    const-string p1, "}"

    .line 577
    invoke-virtual {p3, p1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 579
    :cond_7
    invoke-virtual {p3}, Ll/ۛۚۖ;->֫()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ֫(Ll/ۘ֡ۖ;Ll/ۛۚۖ;)V
    .locals 6

    .line 184
    invoke-interface {p1}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "google.protobuf.Any"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 198
    invoke-interface {p1}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    const/4 v1, 0x1

    .line 199
    invoke-virtual {v0, v1}, Ll/ᩳۖۖ;->֫(I)Ll/֡ۖۖ;

    move-result-object v2

    const/4 v3, 0x2

    .line 200
    invoke-virtual {v0, v3}, Ll/ᩳۖۖ;->֫(I)Ll/֡ۖۖ;

    move-result-object v0

    if-eqz v2, :cond_4

    .line 202
    invoke-virtual {v2}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v3

    sget-object v4, Ll/᩵ۖۖ;->ܿ֫:Ll/᩵ۖۖ;

    if-ne v3, v4, :cond_4

    if-eqz v0, :cond_4

    .line 204
    invoke-virtual {v0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v3

    sget-object v4, Ll/᩵ۖۖ;->ۙ:Ll/᩵ۖۖ;

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 209
    :cond_0
    invoke-interface {p1, v2}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 212
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 215
    :cond_1
    invoke-interface {p1, v0}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v0

    .line 219
    :try_start_0
    iget-object v3, p0, Ll/ۤۚۖ;->ۧ:Ll/ܽ֨ۖ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "/"

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 62
    array-length v4, v3

    if-le v4, v1, :cond_3

    .line 65
    array-length v4, v3

    sub-int/2addr v4, v1

    aget-object v1, v3, v4

    .line 43
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۖۖ;

    if-nez v1, :cond_2

    goto :goto_0

    .line 223
    :cond_2
    invoke-static {v1}, Ll/۫ۖۖ;->֫(Ll/ᩳۖۖ;)Ll/۫ۖۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۖۖ;->newBuilderForType()Ll/۬ۖۖ;

    move-result-object v1

    .line 224
    check-cast v0, Ll/ۛۜۖ;

    iget-object v3, p0, Ll/ۤۚۖ;->֫:Ll/ᩳۘۖ;

    invoke-interface {v1, v0, v3}, Ll/ܳ֡ۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    const-string p1, "["

    .line 232
    invoke-virtual {p2, p1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 233
    invoke-virtual {p2, v2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    const-string p1, "] {"

    .line 234
    invoke-virtual {p2, p1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 235
    invoke-virtual {p2}, Ll/ۛۚۖ;->֫()V

    .line 236
    invoke-virtual {p2}, Ll/ۛۚۖ;->ۧ()V

    .line 237
    invoke-direct {p0, v1, p2}, Ll/ۤۚۖ;->֫(Ll/ۘ֡ۖ;Ll/ۛۚۖ;)V

    .line 238
    invoke-virtual {p2}, Ll/ۛۚۖ;->ܽ()V

    const-string p1, "}"

    .line 239
    invoke-virtual {p2, p1}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 240
    invoke-virtual {p2}, Ll/ۛۚۖ;->֫()V

    return-void

    .line 63
    :cond_3
    :try_start_1
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "Invalid type url found: "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 63
    throw v0
    :try_end_1
    .catch Ll/֫᩵ۖ; {:try_start_1 .. :try_end_1} :catch_0

    .line 534
    :catch_0
    :cond_4
    :goto_0
    invoke-interface {p1}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 535
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۖۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 263
    invoke-virtual {v2}, Ll/֡ۖۖ;->۬()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 264
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 265
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 266
    new-instance v5, Ll/۫ۚۖ;

    invoke-direct {v5, v2, v4}, Ll/۫ۚۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/Object;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 268
    :cond_6
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 269
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ۚۖ;

    .line 270
    invoke-virtual {v3}, Ll/۫ۚۖ;->֫()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v2, v3, p2}, Ll/ۤۚۖ;->֫(Ll/֡ۖۖ;Ljava/lang/Object;Ll/ۛۚۖ;)V

    goto :goto_3

    .line 272
    :cond_7
    invoke-virtual {v2}, Ll/֡ۖۖ;->۟֫()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 274
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 275
    invoke-direct {p0, v2, v3, p2}, Ll/ۤۚۖ;->֫(Ll/֡ۖۖ;Ljava/lang/Object;Ll/ۛۚۖ;)V

    goto :goto_4

    .line 278
    :cond_8
    invoke-direct {p0, v2, v1, p2}, Ll/ۤۚۖ;->֫(Ll/֡ۖۖ;Ljava/lang/Object;Ll/ۛۚۖ;)V

    goto :goto_1

    .line 537
    :cond_9
    invoke-interface {p1}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۤۚۖ;->֫(Ll/ۢ֨ۖ;Ll/ۛۚۖ;)V

    return-void
.end method

.method public static ֫(Ll/ۢ֨ۖ;Ll/ۛۚۖ;)V
    .locals 5

    .line 584
    invoke-virtual {p0}, Ll/ۢ֨ۖ;->֫()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 585
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 586
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ֨ۖ;

    const/4 v3, 0x0

    .line 587
    invoke-virtual {v2}, Ll/ۜ֨ۖ;->ܿ()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v4, p1}, Ll/ۤۚۖ;->֫(IILjava/util/List;Ll/ۛۚۖ;)V

    const/4 v3, 0x5

    .line 588
    invoke-virtual {v2}, Ll/ۜ֨ۖ;->֫()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v4, p1}, Ll/ۤۚۖ;->֫(IILjava/util/List;Ll/ۛۚۖ;)V

    const/4 v3, 0x1

    .line 589
    invoke-virtual {v2}, Ll/ۜ֨ۖ;->ۧ()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v4, p1}, Ll/ۤۚۖ;->֫(IILjava/util/List;Ll/ۛۚۖ;)V

    const/4 v3, 0x2

    .line 593
    invoke-virtual {v2}, Ll/ۜ֨ۖ;->ᩳ()Ljava/util/List;

    move-result-object v4

    .line 590
    invoke-static {v1, v3, v4, p1}, Ll/ۤۚۖ;->֫(IILjava/util/List;Ll/ۛۚۖ;)V

    .line 595
    invoke-virtual {v2}, Ll/ۜ֨ۖ;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ֨ۖ;

    .line 596
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    const-string v3, " {"

    .line 597
    invoke-virtual {p1, v3}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 598
    invoke-virtual {p1}, Ll/ۛۚۖ;->֫()V

    .line 599
    invoke-virtual {p1}, Ll/ۛۚۖ;->ۧ()V

    .line 600
    invoke-static {v2, p1}, Ll/ۤۚۖ;->֫(Ll/ۢ֨ۖ;Ll/ۛۚۖ;)V

    .line 601
    invoke-virtual {p1}, Ll/ۛۚۖ;->ܽ()V

    const-string v2, "}"

    .line 602
    invoke-virtual {p1, v2}, Ll/ۛۚۖ;->֫(Ljava/lang/String;)V

    .line 603
    invoke-virtual {p1}, Ll/ۛۚۖ;->֫()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۘ֡ۖ;)Ljava/lang/String;
    .locals 2

    .line 435
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    sget v1, Ll/ۨۚۖ;->֫:I

    .line 641
    new-instance v1, Ll/ۛۚۖ;

    invoke-direct {v1, v0}, Ll/ۛۚۖ;-><init>(Ljava/lang/StringBuilder;)V

    .line 174
    invoke-direct {p0, p1, v1}, Ll/ۤۚۖ;->֫(Ll/ۘ֡ۖ;Ll/ۛۚۖ;)V

    .line 437
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 439
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
