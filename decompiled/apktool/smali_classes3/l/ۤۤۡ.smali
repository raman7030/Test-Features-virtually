.class public final Ll/ۤۤۡ;
.super Ljava/lang/Object;
.source "G7TV"

# interfaces
.implements Ll/۬ۤۡ;


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public final synthetic ۧ:Ll/ۨۤۡ;


# direct methods
.method public constructor <init>(Ll/ۨۤۡ;)V
    .locals 0

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۤۡ;->ۧ:Ll/ۨۤۡ;

    .line 215
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method private ֫()V
    .locals 4

    .line 365
    iget-object v0, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 367
    iget-object v2, p0, Ll/ۤۤۡ;->ۧ:Ll/ۨۤۡ;

    invoke-static {v2}, Ll/ۨۤۡ;->֫(Ll/ۨۤۡ;)Ll/ۧۤᩴ;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۤۡ;

    invoke-virtual {v2, v3, v1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۤۤۡ;)V
    .locals 1

    .line 341
    :try_start_0
    iget-object v0, p0, Ll/ۤۤۡ;->ۧ:Ll/ۨۤۡ;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 342
    :try_start_1
    invoke-direct {p0}, Ll/ۤۤۡ;->ۧ()V

    .line 343
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void
.end method

.method private ۧ()V
    .locals 9

    .line 372
    iget-object v0, p0, Ll/ۤۤۡ;->ۧ:Ll/ۨۤۡ;

    invoke-static {v0}, Ll/ۨۤۡ;->ۧ(Ll/ۨۤۡ;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    const-string v2, "Unable to create directory "

    if-eqz v1, :cond_1

    .line 373
    invoke-static {v0}, Ll/ۨۤۡ;->ۧ(Ll/ۨۤۡ;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Ll/ۨۤۡ;->ۧ(Ll/ۨۤۡ;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Ll/ۨۤۡ;->ۧ(Ll/ۨۤۡ;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 374
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۨۤۡ;->ۧ(Ll/ۨۤۡ;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 376
    :cond_1
    invoke-static {v0}, Ll/ۨۤۡ;->ۧ(Ll/ۨۤۡ;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_2
    :goto_0
    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 381
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    .line 382
    iget-object v3, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 383
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 384
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛۤۡ;

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    :try_start_0
    invoke-static {}, Ll/ۨۤۡ;->֫()Ll/ۛۤۡ;

    move-result-object v7

    if-ne v5, v7, :cond_4

    .line 387
    invoke-static {v0, v6}, Ll/ۨۤۡ;->֫(Ll/ۨۤۡ;Ljava/lang/String;)Ll/᩸۫ۡ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸۫ۡ;->֫()V

    goto :goto_1

    .line 389
    :cond_4
    invoke-static {v0, v6, v5, v1, v2}, Ll/ۨۤۡ;->֫(Ll/ۨۤۡ;Ljava/lang/String;Ll/ۛۤۡ;[BLjava/util/zip/CRC32;)V

    .line 390
    invoke-static {v5}, Ll/ۛۤۡ;->֫(Ll/ۛۤۡ;)[B

    move-result-object v7

    array-length v7, v7

    const/16 v8, 0x2800

    if-lt v7, v8, :cond_3

    .line 392
    invoke-static {v0}, Ll/ۨۤۡ;->֫(Ll/ۨۤۡ;)Ll/ۧۤᩴ;

    move-result-object v7

    invoke-virtual {v7, v6, v5}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v5

    if-nez v4, :cond_3

    move-object v4, v5

    goto :goto_1

    :cond_5
    if-nez v4, :cond_6

    return-void

    .line 402
    :cond_6
    throw v4

    .line 377
    :cond_7
    new-instance v1, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۨۤۡ;->ۧ(Ll/ۨۤۡ;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final apply()V
    .locals 3

    .line 338
    invoke-direct {p0}, Ll/ۤۤۡ;->֫()V

    .line 339
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ۤ֡ۢ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ۤ֡ۢ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final commit()Z
    .locals 2

    .line 352
    invoke-direct {p0}, Ll/ۤۤۡ;->֫()V

    .line 354
    :try_start_0
    iget-object v0, p0, Ll/ۤۤۡ;->ۧ:Ll/ۨۤۡ;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    :try_start_1
    invoke-direct {p0}, Ll/ۤۤۡ;->ۧ()V

    .line 356
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public final putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/16 p2, 0xff

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    int-to-byte p2, p2

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte p2, v1, v0

    .line 333
    new-instance p2, Ll/ۛۤۡ;

    const/16 v0, 0x11

    invoke-direct {p2, v0, v1}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object v0, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putFloat(Ljava/lang/String;F)Ll/۬ۤۡ;
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 276
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-static {v1, p2, v0}, Ll/ܺܰۡ;->֫(II[B)V

    .line 333
    new-instance p2, Ll/ۛۤۡ;

    const/16 v1, 0x17

    invoke-direct {p2, v1, v0}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object v0, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;
    .locals 2

    if-nez p2, :cond_0

    .line 223
    invoke-virtual {p0, p1}, Ll/ۤۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    return-object p0

    .line 225
    :cond_0
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 333
    new-instance v0, Ll/ۛۤۡ;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p2}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object p2, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final remove(Ljava/lang/String;)Ll/۬ۤۡ;
    .locals 2

    .line 327
    iget-object v0, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-static {}, Ll/ۨۤۡ;->֫()Ll/ۛۤۡ;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(BLjava/lang/String;)Ll/۬ۤۡ;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    .line 333
    new-instance p1, Ll/ۛۤۡ;

    const/16 v1, 0x12

    invoke-direct {p1, v1, v0}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object v0, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(ILjava/lang/String;)Ll/۬ۤۡ;
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 260
    invoke-static {v1, p1, v0}, Ll/ܺܰۡ;->֫(II[B)V

    .line 333
    new-instance p1, Ll/ۛۤۡ;

    const/16 v1, 0x15

    invoke-direct {p1, v1, v0}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object v0, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(JLjava/lang/String;)Ll/۬ۤۡ;
    .locals 2

    const/16 v0, 0x8

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 268
    invoke-static {p1, p2, v1, v0}, Ll/ܺܰۡ;->֫(JI[B)V

    .line 333
    new-instance p1, Ll/ۛۤۡ;

    const/16 p2, 0x16

    invoke-direct {p1, p2, v0}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object p2, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(Ljava/lang/String;[B)Ll/۬ۤۡ;
    .locals 2

    if-nez p2, :cond_0

    .line 292
    invoke-virtual {p0, p1}, Ll/ۤۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    return-object p0

    .line 294
    :cond_0
    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    .line 333
    new-instance v0, Ll/ۛۤۡ;

    const/16 v1, 0x19

    invoke-direct {v0, v1, p2}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object p2, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(Ljava/lang/String;[I)Ll/۬ۤۡ;
    .locals 4

    if-nez p2, :cond_0

    .line 301
    invoke-virtual {p0, p1}, Ll/ۤۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    return-object p0

    .line 303
    :cond_0
    array-length v0, p2

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 304
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_1

    mul-int/lit8 v2, v1, 0x4

    .line 305
    aget v3, p2, v1

    invoke-static {v2, v3, v0}, Ll/ܺܰۡ;->֫(II[B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 333
    :cond_1
    new-instance p2, Ll/ۛۤۡ;

    const/16 v1, 0x1a

    invoke-direct {p2, v1, v0}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object v0, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(Ljava/lang/String;[Ljava/lang/String;)Ll/۬ۤۡ;
    .locals 4

    if-nez p2, :cond_0

    .line 314
    invoke-virtual {p0, p1}, Ll/ۤۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    return-object p0

    .line 316
    :cond_0
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 317
    array-length v1, p2

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 318
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p2, v2

    .line 319
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 321
    :cond_1
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p2

    .line 333
    new-instance v0, Ll/ۛۤۡ;

    const/16 v1, 0x1b

    invoke-direct {v0, v1, p2}, Ll/ۛۤۡ;-><init>(I[B)V

    iget-object p2, p0, Ll/ۤۤۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
