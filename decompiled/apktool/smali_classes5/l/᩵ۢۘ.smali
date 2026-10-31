.class public final Ll/᩵ۢۘ;
.super Ljava/lang/Object;
.source "T7YQ"

# interfaces
.implements Ll/ᩴ᩷ۘ;


# instance fields
.field public ֫:Ll/֨ۢۘ;

.field public ۧ:Ll/᩶᩷ۘ;

.field public ܽ:Ljava/util/Vector;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 467
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "\n"

    invoke-static {v1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    return-void
.end method

.method public constructor <init>(Ll/᩶᩷ۘ;)V
    .locals 4

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    .line 49
    iput-object p1, p0, Ll/᩵ۢۘ;->ۧ:Ll/᩶᩷ۘ;

    .line 532
    iget-object p1, p0, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    if-nez p1, :cond_0

    const-string p1, "hmac-sha1"

    .line 533
    invoke-static {p1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 541
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/֨ۢۘ;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 542
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۢۘ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 533
    iput-object v0, p0, Ll/᩵ۢۘ;->֫:Ll/֨ۢۘ;

    goto :goto_0

    :catch_0
    move-exception v0

    .line 544
    iget-object v1, p0, Ll/᩵ۢۘ;->ۧ:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "instantiation of "

    const-string v3, " lead to an error"

    .line 0
    invoke-static {v2, p1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 546
    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 51
    :cond_0
    :goto_0
    new-instance p1, Ljava/util/Vector;

    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    iput-object p1, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵ۢۘ;)Ll/᩶᩷ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۢۘ;->ۧ:Ll/᩶᩷ۘ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;[B)I
    .locals 9

    const/4 v1, 0x1

    if-nez p1, :cond_0

    return v1

    .line 293
    :cond_0
    :try_start_0
    new-instance v2, Ll/ۘ᩷ۘ;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3, p2}, Ll/ۘ᩷ۘ;-><init>(Ljava/lang/String;I[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    iget-object v0, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    monitor-enter v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 301
    :goto_0
    :try_start_1
    iget-object v6, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v6

    if-ge v4, v6, :cond_3

    .line 302
    iget-object v6, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v6, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘ᩷ۘ;

    .line 303
    invoke-virtual {v6, p1}, Ll/ۘ᩷ۘ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget v7, v6, Ll/ۘ᩷ۘ;->ᩳ:I

    iget v8, v2, Ll/ۘ᩷ۘ;->ᩳ:I

    if-ne v7, v8, :cond_2

    .line 304
    iget-object v5, v6, Ll/ۘ᩷ۘ;->ۧ:[B

    invoke-static {v5, p2}, Ll/᩵ۡۘ;->֫([B[B)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 305
    monitor-exit v0

    return v3

    :cond_1
    const/4 v5, 0x2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 310
    :cond_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v5, v1, :cond_4

    const-string v0, "["

    .line 312
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "]:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-le v0, v1, :cond_4

    const-string v0, "]:"

    .line 313
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/᩵ۢۘ;->֫(Ljava/lang/String;[B)I

    move-result p1

    return p1

    :cond_4
    return v5

    :catchall_0
    move-exception p1

    .line 310
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 295
    :catch_0
    iget-object p1, p0, Ll/᩵ۢۘ;->ۧ:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method

.method public final ֫(Ll/ۘ᩷ۘ;Ll/ᩴۡۘ;)V
    .locals 3

    .line 321
    iget p2, p1, Ll/ۘ᩷ۘ;->ᩳ:I

    .line 96
    iget-object p2, p1, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    .line 326
    iget-object v0, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    monitor-enter v0

    const/4 v1, 0x0

    .line 327
    :goto_0
    :try_start_0
    iget-object v2, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 328
    iget-object v2, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩷ۘ;

    .line 329
    invoke-virtual {v2, p2}, Ll/ۘ᩷ۘ;->֫(Ljava/lang/String;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 336
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 340
    iget-object p2, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {p2, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 336
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)[Ll/ۘ᩷ۘ;
    .locals 7

    .line 393
    iget-object v0, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    monitor-enter v0

    .line 394
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 395
    :goto_0
    iget-object v4, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 396
    iget-object v4, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v4, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘ᩷ۘ;

    .line 397
    iget v5, v4, Ll/ۘ᩷ۘ;->ᩳ:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    .line 399
    invoke-virtual {v4, p1}, Ll/ۘ᩷ۘ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {v4}, Ll/ۘ᩷ۘ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 400
    :cond_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 403
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v4, v3, [Ll/ۘ᩷ۘ;

    const/4 v5, 0x0

    .line 404
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    .line 405
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘ᩷ۘ;

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_5

    const-string v1, "["

    .line 407
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "]:"

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v5, 0x1

    if-le v1, v5, :cond_5

    const-string v1, "]:"

    .line 408
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/᩵ۢۘ;->֫(Ljava/lang/String;Ljava/lang/String;)[Ll/ۘ᩷ۘ;

    move-result-object p1

    .line 409
    array-length p2, p1

    if-lez p2, :cond_5

    .line 410
    array-length p2, p1

    add-int/2addr p2, v3

    new-array p2, p2, [Ll/ۘ᩷ۘ;

    .line 411
    invoke-static {v4, v2, p2, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 412
    array-length v1, p1

    invoke-static {p1, v2, p2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, p2

    .line 416
    :cond_5
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception p1

    .line 417
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 428
    iget-object v0, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 429
    :goto_0
    :try_start_0
    iget-object v3, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    .line 430
    iget-object v3, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v3, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ᩷ۘ;

    if-eqz p1, :cond_0

    .line 431
    invoke-virtual {v3, p1}, Ll/ۘ᩷ۘ;->֫(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    if-eqz p2, :cond_0

    .line 432
    invoke-virtual {v3}, Ll/ۘ᩷ۘ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 96
    :cond_0
    iget-object v4, v3, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    if-eqz p1, :cond_7

    .line 434
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    instance-of v5, v3, Ll/ᩴۢۘ;

    if-eqz v5, :cond_1

    move-object v5, v3

    check-cast v5, Ll/ᩴۢۘ;

    .line 435
    invoke-virtual {v5}, Ll/ᩴۢۘ;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_5

    .line 512
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    .line 513
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_4

    const/16 v8, 0x2c

    .line 516
    invoke-virtual {v4, v8, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_2

    goto :goto_2

    .line 519
    :cond_2
    invoke-virtual {v4, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    add-int/lit8 v7, v8, 0x1

    goto :goto_1

    .line 523
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v4, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    .line 525
    :cond_4
    :goto_2
    invoke-virtual {v4, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    sub-int v7, v6, v7

    if-ne v7, v5, :cond_6

    if-ne v5, v6, :cond_5

    const/4 v5, 0x0

    goto :goto_3

    :cond_5
    sub-int/2addr v6, v5

    add-int/lit8 v5, v6, -0x1

    .line 526
    :goto_3
    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 439
    :cond_6
    :goto_4
    iput-object v4, v3, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    goto :goto_6

    .line 436
    :cond_7
    :goto_5
    iget-object v4, p0, Ll/᩵ۢۘ;->ܽ:Ljava/util/Vector;

    invoke-virtual {v4, v3}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, -0x1

    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 444
    :cond_9
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
