.class public abstract Ll/۫ܳ۠;
.super Ljava/lang/Object;
.source "U7M7"

# interfaces
.implements Ll/ᩳ᩶۠;


# static fields
.field public static final ܳ:Z

.field public static final ܿ:Ll/۟֨ᩴ;

.field public static final synthetic ᩳ:I


# instance fields
.field public final ֫:Ll/᩷ܿ۠;

.field public ۧ:Z

.field public final ܽ:Ll/᩷۠ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 79
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    sput-object v0, Ll/۫ܳ۠;->ܿ:Ll/۟֨ᩴ;

    const-string v0, "os.name"

    const-string v1, ""

    .line 80
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "OS X"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    sput-boolean v0, Ll/۫ܳ۠;->ܳ:Z

    return-void
.end method

.method public constructor <init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 307
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 308
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    const/4 p1, 0x0

    new-array p1, p1, [Ll/ܳ۠ᩴ;

    .line 309
    invoke-static {p2, p1}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 312
    iput-object p2, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    return-void

    .line 310
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "directories not supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/᩷۠ᩴ;)Ljava/lang/String;
    .locals 4

    .line 519
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    .line 520
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟֨ᩴ;->getSeparator()Ljava/lang/String;

    move-result-object p0

    const-string v1, "."

    .line 528
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 529
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 524
    :goto_0
    invoke-virtual {v0, p0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/ܽ᩶۠;)Z
    .locals 4

    .line 356
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    sget-object v0, Ll/ܽ᩶۠;->ۗ:Ll/ܽ᩶۠;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    sget-object v0, Ll/᩷ܿ۠;->۟:Ljava/util/Set;

    .line 491
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩷ܿ۠;->ۧ(Ljava/lang/String;)Ll/ܽ᩶۠;

    move-result-object v0

    if-eq v0, p2, :cond_0

    goto :goto_1

    .line 0
    :cond_0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 362
    iget-object p2, p2, Ll/ܽ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 363
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p2

    .line 364
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    goto :goto_0

    .line 368
    :cond_1
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v0

    sget-object v3, Ll/۫ܳ۠;->ܿ:Ll/۟֨ᩴ;

    if-ne v0, v3, :cond_3

    .line 369
    sget-boolean v0, Ll/۫ܳ۠;->ܳ:Z

    if-eqz v0, :cond_2

    .line 370
    sget-object v0, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    invoke-static {p2, v0}, Ljava/text/Normalizer;->isNormalized(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/text/Normalizer$Form;->NFC:Ljava/text/Normalizer$Form;

    .line 371
    invoke-static {p1, v0}, Ljava/text/Normalizer;->isNormalized(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 376
    invoke-static {p2, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v0

    .line 377
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return v2

    .line 383
    :cond_2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    :try_start_0
    new-array p2, v2, [Ll/ܳ۠ᩴ;

    .line 386
    sget-object v0, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v0, p2, v1

    invoke-interface {p0, p2}, Ll/᩷۠ᩴ;->toRealPath([Ll/ܳ۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_3
    :goto_1
    return v1
.end method

.method private ᩻()V
    .locals 3

    .line 501
    iget-boolean v0, p0, Ll/۫ܳ۠;->ۧ:Z

    if-nez v0, :cond_1

    .line 502
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    .line 503
    invoke-static {v0, v2}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-nez v2, :cond_0

    :try_start_0
    new-array v1, v1, [Ll/᩹۠ᩴ;

    .line 505
    invoke-static {v0, v1}, Ll/ܿ۠ᩴ;->createDirectories(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 507
    new-instance v1, Ljava/io/IOException;

    const-string v2, "could not create parent directories"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 510
    iput-boolean v0, p0, Ll/۫ܳ۠;->ۧ:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final delete()Z
    .locals 1

    .line 471
    :try_start_0
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-static {v0}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 487
    instance-of v0, p1, Ll/۫ܳ۠;

    if-eqz v0, :cond_0

    check-cast p1, Ll/۫ܳ۠;

    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    iget-object p1, p1, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 492
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 497
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toUri()Ljava/net/URI;
    .locals 1

    .line 407
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toUri()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Z)Ljava/lang/CharSequence;
    .locals 9

    .line 449
    iget-object v0, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    iget-object v1, v0, Ll/᩷ܿ۠;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜܿ۠;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    .line 481
    :cond_0
    iget-wide v4, v2, Ll/ۜܿ۠;->ۧ:J

    invoke-virtual {p0}, Ll/۫ܳ۠;->ᩳ()J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    .line 485
    iget-object v1, v2, Ll/ۜܿ۠;->֫:Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/nio/CharBuffer;

    goto :goto_0

    .line 454
    :cond_1
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    if-nez v3, :cond_4

    .line 434
    invoke-virtual {p0}, Ll/۫ܳ۠;->ۧ()Ljava/io/InputStream;

    move-result-object v1

    .line 435
    :try_start_0
    invoke-virtual {v0, v1}, Ll/᩷ܿ۠;->֫(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 436
    iget-object v3, v0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    invoke-virtual {v3, p0}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 438
    :try_start_1
    invoke-virtual {v0, v2, p1}, Ll/᩷ܿ۠;->֫(Ljava/nio/ByteBuffer;Z)Ljava/nio/CharBuffer;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 440
    :try_start_2
    iget-object v5, v0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    invoke-virtual {v5, v3}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 442
    invoke-virtual {v0, v2}, Ll/᩷ܿ۠;->֫(Ljava/nio/ByteBuffer;)V

    if-nez p1, :cond_2

    .line 462
    iget-object p1, v0, Ll/᩷ܿ۠;->ۙ:Ljava/util/HashMap;

    new-instance v0, Ll/ۜܿ۠;

    invoke-direct {v0, p0, v4}, Ll/ۜܿ۠;-><init>(Ll/۫ܳ۠;Ljava/nio/CharBuffer;)V

    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 446
    :cond_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v4

    :catchall_0
    move-exception p1

    .line 440
    :try_start_3
    iget-object v0, v0, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    invoke-virtual {v0, v3}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 441
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    if-eqz v1, :cond_3

    .line 434
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw p1

    :cond_4
    return-object v3
.end method

.method public abstract ֫(Ljava/util/Collection;)Ljava/lang/String;
.end method

.method public abstract ֫(Ljava/lang/String;)Ll/۫ܳ۠;
.end method

.method public ֫()Ll/ܽ᩶۠;
    .locals 1

    .line 346
    sget-object v0, Ll/᩷ܿ۠;->۟:Ljava/util/Set;

    .line 491
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩷ܿ۠;->ۧ(Ljava/lang/String;)Ll/ܽ᩶۠;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z
    .locals 1

    .line 351
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-static {v0, p1, p2}, Ll/۫ܳ۠;->֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/io/InputStream;
    .locals 2

    .line 412
    iget-object v0, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    invoke-virtual {v0}, Ll/᩷ܿ۠;->ܳ()V

    const/4 v0, 0x0

    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 413
    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-static {v1, v0}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public ܳ()Ljava/lang/String;
    .locals 1

    .line 341
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/io/Writer;
    .locals 4

    .line 453
    iget-object v0, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    invoke-virtual {v0}, Ll/᩷ܿ۠;->ܳ()V

    .line 466
    iget-object v1, v0, Ll/᩷ܿ۠;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    invoke-direct {p0}, Ll/۫ܳ۠;->᩻()V

    .line 456
    new-instance v1, Ljava/io/OutputStreamWriter;

    const/4 v2, 0x0

    new-array v2, v2, [Ll/᩻۠ᩴ;

    iget-object v3, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-static {v3, v2}, Ll/ܿ۠ᩴ;->newOutputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v0}, Ll/᩷ܿ۠;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-object v1
.end method

.method public final ܿ()Ljava/io/OutputStream;
    .locals 2

    .line 418
    iget-object v0, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    invoke-virtual {v0}, Ll/᩷ܿ۠;->ܳ()V

    .line 466
    iget-object v0, v0, Ll/᩷ܿ۠;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    invoke-direct {p0}, Ll/۫ܳ۠;->᩻()V

    const/4 v0, 0x0

    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 421
    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-static {v1, v0}, Ll/ܿ۠ᩴ;->newOutputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 462
    :try_start_0
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    const/4 v1, 0x0

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    invoke-static {v0, v1}, Ll/ܿ۠ᩴ;->getLastModifiedTime(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ۠ᩴ;->toMillis()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method
