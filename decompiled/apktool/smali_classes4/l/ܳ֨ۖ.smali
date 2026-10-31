.class public final Ll/ܳ֨ۖ;
.super Ljava/lang/Object;
.source "P9QE"

# interfaces
.implements Ll/ۢ֡ۖ;


# instance fields
.field public ᩸:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 284
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/ܳ֨ۖ;->᩸:Ljava/util/TreeMap;

    return-void
.end method

.method public static ֫()Ll/ܳ֨ۖ;
    .locals 1

    .line 287
    new-instance v0, Ll/ܳ֨ۖ;

    invoke-direct {v0}, Ll/ܳ֨ۖ;-><init>()V

    return-object v0
.end method

.method private ֫(I)Ll/᩻֨ۖ;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 297
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻֨ۖ;

    if-nez v0, :cond_1

    .line 299
    sget v0, Ll/ۜ֨ۖ;->ܳ:I

    .line 663
    invoke-static {}, Ll/᩻֨ۖ;->ۧ()Ll/᩻֨ۖ;

    move-result-object v0

    .line 300
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 280
    invoke-virtual {p0}, Ll/ܳ֨ۖ;->build()Ll/ۢ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final build()Ll/ۢ֨ۖ;
    .locals 4

    .line 312
    iget-object v0, p0, Ll/ܳ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 313
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    return-object v0

    .line 315
    :cond_0
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 316
    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 317
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֨ۖ;

    invoke-virtual {v2}, Ll/᩻֨ۖ;->֫()Ll/ۜ֨ۖ;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 319
    :cond_1
    new-instance v0, Ll/ۢ֨ۖ;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۢ֨ۖ;-><init>(Ljava/util/TreeMap;I)V

    return-object v0
.end method

.method public final buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 327
    invoke-virtual {p0}, Ll/ܳ֨ۖ;->build()Ll/ۢ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    .line 332
    sget v0, Ll/ۢ֨ۖ;->᩹:I

    .line 48
    invoke-static {}, Ll/ܳ֨ۖ;->֫()Ll/ܳ֨ۖ;

    move-result-object v0

    .line 333
    iget-object v1, p0, Ll/ܳ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 334
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 335
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֨ۖ;

    .line 336
    iget-object v4, v0, Ll/ܳ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ll/᩻֨ۖ;->clone()Ll/᩻֨ۖ;

    move-result-object v2

    invoke-virtual {v4, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 580
    invoke-virtual {p0, p1}, Ll/ܳ֨ۖ;->֫(Ll/۟ۜۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;
    .locals 1

    .line 628
    instance-of v0, p1, Ll/ۢ֨ۖ;

    if-eqz v0, :cond_0

    .line 629
    check-cast p1, Ll/ۢ֨ۖ;

    invoke-virtual {p0, p1}, Ll/ܳ֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    return-object p0

    .line 631
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mergeFrom(MessageLite) can only merge messages of the same type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final mergeFrom([B)Ll/ۢ֡ۖ;
    .locals 2

    .line 112
    :try_start_0
    array-length v0, p1

    const/4 v1, 0x0

    .line 117
    invoke-static {v1, v1, v0, p1}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object p1

    .line 534
    invoke-virtual {p0, p1}, Ll/ܳ֨ۖ;->֫(Ll/۟ۜۖ;)V

    .line 535
    invoke-virtual {p1, v1}, Ll/۟ۜۖ;->֫(I)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 540
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Reading from a byte array threw an IOException (should never happen)."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 538
    throw p1
.end method

.method public final ֫(II)V
    .locals 2

    if-lez p1, :cond_0

    .line 412
    invoke-direct {p0, p1}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p1

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ll/᩻֨ۖ;->ۧ(J)V

    return-void

    .line 410
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid field number."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(ILl/ۛۜۖ;)V
    .locals 1

    if-lez p1, :cond_0

    .line 427
    invoke-direct {p0, p1}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/᩻֨ۖ;->֫(Ll/ۛۜۖ;)V

    return-void

    .line 425
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid field number."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(ILl/ۜ֨ۖ;)V
    .locals 3

    const-string v0, " is not a valid field number."

    if-lez p1, :cond_2

    .line 433
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Ll/ܳ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 392
    invoke-direct {p0, p1}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/᩻֨ۖ;->֫(Ll/ۜ֨ۖ;)V

    return-void

    :cond_0
    if-lez p1, :cond_1

    .line 446
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget v0, Ll/ۜ֨ۖ;->ܳ:I

    .line 663
    invoke-static {}, Ll/᩻֨ۖ;->ۧ()Ll/᩻֨ۖ;

    move-result-object v0

    .line 668
    invoke-virtual {v0, p2}, Ll/᩻֨ۖ;->֫(Ll/ۜ֨ۖ;)V

    .line 446
    invoke-virtual {v2, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 444
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 389
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(Ll/۟ۜۖ;)V
    .locals 1

    .line 466
    :cond_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v0

    if-eqz v0, :cond_1

    .line 467
    invoke-virtual {p0, v0, p1}, Ll/ܳ֨ۖ;->֫(ILl/۟ۜۖ;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۢ֨ۖ;)V
    .locals 2

    .line 373
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 374
    invoke-static {p1}, Ll/ۢ֨ۖ;->֫(Ll/ۢ֨ۖ;)Ljava/util/TreeMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 375
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜ֨ۖ;

    invoke-virtual {p0, v1, v0}, Ll/ܳ֨ۖ;->֫(ILl/ۜ֨ۖ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(ILl/۟ۜۖ;)Z
    .locals 4

    ushr-int/lit8 v0, p1, 0x3

    and-int/lit8 p1, p1, 0x7

    const/4 v1, 0x1

    if-eqz p1, :cond_5

    if-eq p1, v1, :cond_4

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    const/4 v2, 0x4

    if-eq p1, v2, :cond_1

    const/4 v2, 0x5

    if-ne p1, v2, :cond_0

    .line 500
    invoke-direct {p0, v0}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p1

    invoke-virtual {p2}, Ll/۟ۜۖ;->᩷()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩻֨ۖ;->֫(I)V

    return v1

    .line 503
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ܿ()Ll/۟ᩴۖ;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1

    .line 493
    :cond_2
    sget p1, Ll/ۢ֨ۖ;->᩹:I

    .line 287
    new-instance p1, Ll/ܳ֨ۖ;

    invoke-direct {p1}, Ll/ܳ֨ۖ;-><init>()V

    .line 76
    sget-object v2, Ll/֫ۘۖ;->ۜ:Ll/֫ۘۖ;

    .line 494
    invoke-virtual {p2, v0, p1, v2}, Ll/۟ۜۖ;->֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 495
    invoke-direct {p0, v0}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܳ֨ۖ;->build()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/᩻֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    return v1

    .line 490
    :cond_3
    invoke-direct {p0, v0}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p1

    invoke-virtual {p2}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/᩻֨ۖ;->֫(Ll/ۛۜۖ;)V

    return v1

    .line 487
    :cond_4
    invoke-direct {p0, v0}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p1

    invoke-virtual {p2}, Ll/۟ۜۖ;->ۢ()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/᩻֨ۖ;->֫(J)V

    return v1

    .line 484
    :cond_5
    invoke-direct {p0, v0}, Ll/ܳ֨ۖ;->֫(I)Ll/᩻֨ۖ;

    move-result-object p1

    invoke-virtual {p2}, Ll/۟ۜۖ;->ۖ()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/᩻֨ۖ;->ۧ(J)V

    return v1
.end method
