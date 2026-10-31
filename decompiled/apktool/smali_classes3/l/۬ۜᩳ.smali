.class public final Ll/۬ۜᩳ;
.super Ljava/lang/Object;
.source "O6WV"


# static fields
.field public static final ۜ:Ll/֡ۛۡ;

.field public static final ᩷:Ll/֡ۛۡ;


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public final ܳ:Ll/֡ܺᩴ;

.field public final ܽ:Ljava/io/OutputStream;

.field public ܿ:I

.field public ᩳ:Z

.field public final ᩻:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 214
    new-instance v0, Ll/֡ۛۡ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/۬ۜᩳ;->ۜ:Ll/֡ۛۡ;

    .line 216
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/۬ۜᩳ;->᩷:Ll/֡ۛۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 219
    new-instance v0, Ll/֡ܺᩴ;

    invoke-direct {v0}, Ll/֡ܺᩴ;-><init>()V

    iput-object v0, p0, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    .line 220
    new-instance v0, Ll/ۗۜᩳ;

    invoke-direct {v0, p0}, Ll/ۗۜᩳ;-><init>(Ll/۬ۜᩳ;)V

    iput-object v0, p0, Ll/۬ۜᩳ;->ܽ:Ljava/io/OutputStream;

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 245
    iput-object v0, p0, Ll/۬ۜᩳ;->᩻:[B

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 246
    iput-object v0, p0, Ll/۬ۜᩳ;->֫:[B

    return-void
.end method

.method public static ֫(Ll/֡ۛۡ;Ljava/lang/AutoCloseable;Z)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 320
    invoke-virtual {p0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 321
    :cond_0
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۜᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬ۜᩳ;->ᩳ:Z

    return p0
.end method

.method public static ۜ()Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 3

    .line 282
    sget-object v0, Ll/۬ۜᩳ;->ۜ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    if-eqz v0, :cond_0

    return-object v0

    .line 286
    :cond_0
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    const/4 v1, 0x3

    .line 288
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    move-result-object v1

    const/4 v2, 0x1

    .line 289
    invoke-virtual {v1, v2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setChecksum(Z)Lcom/github/luben/zstd/ZstdCompressCtx;

    move-result-object v1

    .line 290
    invoke-virtual {v1, v2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setContentSize(Z)Lcom/github/luben/zstd/ZstdCompressCtx;

    move-result-object v1

    .line 291
    invoke-static {}, Ll/۫ۜᩳ;->֫()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 293
    :goto_0
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 294
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to initialize smali cache compressor"

    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static bridge synthetic ۧ(Ll/۬ۜᩳ;)Ll/֡ܺᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    return-object p0
.end method

.method public static ܽ(Ll/۬ۜᩳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 273
    iput-boolean v0, p0, Ll/۬ۜᩳ;->ᩳ:Z

    .line 274
    iget-object p0, p0, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    invoke-virtual {p0}, Ll/֡ܺᩴ;->֫()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 275
    iput-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    return-void
.end method

.method public static ᩷()Lcom/github/luben/zstd/ZstdDecompressCtx;
    .locals 3

    .line 302
    sget-object v0, Ll/۬ۜᩳ;->᩷:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    if-eqz v0, :cond_0

    return-object v0

    .line 306
    :cond_0
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 308
    :try_start_0
    invoke-static {}, Ll/۫ۜᩳ;->֫()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdDecompressCtx;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 310
    :goto_0
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 311
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to initialize smali cache decompressor"

    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final ֫()V
    .locals 11

    .line 329
    sget-object v0, Ll/۬ۜᩳ;->ۜ:Ll/֡ۛۡ;

    iget-object v1, p0, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    iget v2, v1, Ll/֡ܺᩴ;->᩹:I

    iput v2, p0, Ll/۬ۜᩳ;->ܿ:I

    const/4 v3, 0x0

    .line 330
    iput v3, p0, Ll/۬ۜᩳ;->ۧ:I

    .line 331
    iget-boolean v4, p0, Ll/۬ۜᩳ;->ᩳ:Z

    if-nez v4, :cond_4

    const/high16 v4, 0x800000

    if-gt v2, v4, :cond_4

    int-to-long v4, v2

    const/4 v2, 0x0

    .line 337
    :try_start_0
    invoke-static {v4, v5}, Lcom/github/luben/zstd/Zstd;->compressBound(J)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_3

    const-wide/32 v6, 0x7ffffff7

    cmp-long v8, v4, v6

    if-gtz v8, :cond_3

    .line 341
    iget-object v6, p0, Ll/۬ۜᩳ;->֫:[B

    array-length v6, v6

    int-to-long v6, v6

    cmp-long v8, v6, v4

    if-gez v8, :cond_0

    long-to-int v5, v4

    .line 342
    new-array v4, v5, [B

    iput-object v4, p0, Ll/۬ۜᩳ;->֫:[B

    .line 344
    :cond_0
    invoke-static {}, Ll/۬ۜᩳ;->ۜ()Lcom/github/luben/zstd/ZstdCompressCtx;

    move-result-object v2

    .line 345
    iget-object v5, p0, Ll/۬ۜᩳ;->֫:[B

    array-length v7, v5

    iget-object v8, v1, Ll/֡ܺᩴ;->᩸:[B

    iget v10, p0, Ll/۬ۜᩳ;->ܿ:I

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result v1

    iput v1, p0, Ll/۬ۜᩳ;->ۧ:I

    .line 347
    iget-object v4, p0, Ll/۬ۜᩳ;->֫:[B

    const/4 v5, 0x5

    const/4 v6, 0x1

    if-lt v1, v5, :cond_1

    const/4 v1, 0x4

    .line 409
    aget-byte v5, v4, v1

    and-int/2addr v1, v5

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 348
    invoke-static {v4}, Lcom/github/luben/zstd/Zstd;->getDictIdFromFrame([B)J

    move-result-wide v4

    const-wide/32 v7, 0x69b50f19

    cmp-long v1, v4, v7

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/۬ۜᩳ;->֫:[B

    iget v4, p0, Ll/۬ۜᩳ;->ۧ:I

    .line 349
    invoke-static {v1, v3, v4}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([BII)J

    move-result-wide v4

    iget v1, p0, Ll/۬ۜᩳ;->ܿ:I

    int-to-long v7, v1

    cmp-long v1, v4, v7

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/۬ۜᩳ;->֫:[B

    iget v4, p0, Ll/۬ۜᩳ;->ۧ:I

    .line 350
    invoke-static {v1, v3, v4}, Lcom/github/luben/zstd/Zstd;->findFrameCompressedSize([BII)J

    move-result-wide v4

    iget v1, p0, Ll/۬ۜᩳ;->ۧ:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v7, v1

    cmp-long v1, v4, v7

    if-nez v1, :cond_2

    .line 358
    invoke-static {v0, v2, v6}, Ll/۬ۜᩳ;->֫(Ll/֡ۛۡ;Ljava/lang/AutoCloseable;Z)V

    return-void

    .line 352
    :cond_2
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v4, "Invalid compressed smali cache frame"

    invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    .line 339
    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v4, "Smali cache compressed buffer is too large"

    invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 356
    :goto_1
    :try_start_2
    new-instance v4, Ljava/io/IOException;

    const-string v5, "Failed to compress smali cache"

    invoke-direct {v4, v5, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 358
    :goto_2
    invoke-static {v0, v2, v3}, Ll/۬ۜᩳ;->֫(Ll/֡ۛۡ;Ljava/lang/AutoCloseable;Z)V

    .line 359
    throw v1

    .line 332
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Smali cache content is too large"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(II[B)V
    .locals 15

    move-object v1, p0

    move/from16 v0, p1

    move/from16 v8, p2

    move-object/from16 v6, p3

    .line 366
    sget-object v9, Ll/۬ۜᩳ;->᩷:Ll/֡ۛۡ;

    iget-object v2, v1, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    invoke-virtual {v2}, Ll/֡ܺᩴ;->֫()V

    const/4 v10, 0x0

    .line 367
    iput v10, v1, Ll/۬ۜᩳ;->ܿ:I

    .line 368
    iput-boolean v10, v1, Ll/۬ۜᩳ;->ᩳ:Z

    if-ltz v0, :cond_5

    if-lez v8, :cond_5

    int-to-long v3, v0

    int-to-long v11, v8

    add-long/2addr v3, v11

    .line 369
    array-length v5, v6

    int-to-long v13, v5

    cmp-long v5, v3, v13

    if-gtz v5, :cond_5

    const/4 v3, 0x5

    if-lt v8, v3, :cond_4

    add-int/lit8 v3, v0, 0x4

    .line 409
    aget-byte v3, v6, v3

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    .line 378
    :try_start_0
    invoke-static {v6, v0, v8}, Lcom/github/luben/zstd/Zstd;->findFrameCompressedSize([BII)J

    move-result-wide v4

    .line 379
    invoke-static {v4, v5}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v7

    if-nez v7, :cond_3

    cmp-long v7, v4, v11

    if-nez v7, :cond_3

    .line 382
    invoke-static {v6, v0, v8}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([BII)J

    move-result-wide v4

    const-wide/16 v11, 0x0

    cmp-long v7, v4, v11

    if-ltz v7, :cond_2

    const-wide/32 v11, 0x800000

    cmp-long v7, v4, v11

    if-gtz v7, :cond_2

    long-to-int v11, v4

    .line 387
    iget-object v4, v2, Ll/֡ܺᩴ;->᩸:[B

    array-length v4, v4

    if-ge v4, v11, :cond_0

    .line 388
    new-array v4, v11, [B

    iput-object v4, v2, Ll/֡ܺᩴ;->᩸:[B

    .line 390
    :cond_0
    invoke-static {}, Ll/۬ۜᩳ;->᩷()Lcom/github/luben/zstd/ZstdDecompressCtx;

    move-result-object v12
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 391
    :try_start_1
    iget-object v3, v2, Ll/֡ܺᩴ;->᩸:[B

    const/4 v4, 0x0

    move-object v2, v12

    move v5, v11

    move-object/from16 v6, p3

    move/from16 v7, p1

    move/from16 v8, p2

    invoke-virtual/range {v2 .. v8}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompressByteArray([BII[BII)I

    move-result v0

    if-ne v0, v11, :cond_1

    .line 396
    iput v11, v1, Ll/۬ۜᩳ;->ܿ:I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    .line 401
    invoke-static {v9, v12, v0}, Ll/۬ۜᩳ;->֫(Ll/֡ۛۡ;Ljava/lang/AutoCloseable;Z)V

    return-void

    .line 394
    :cond_1
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Smali cache decompressed length is invalid"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object v3, v12

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v3, v12

    goto :goto_0

    .line 384
    :cond_2
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Smali cache content size is invalid"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 380
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Smali cache frame length is invalid"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    .line 399
    :goto_0
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    const-string v4, "Failed to decompress smali cache"

    invoke-direct {v2, v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 401
    :goto_1
    invoke-static {v9, v3, v10}, Ll/۬ۜᩳ;->֫(Ll/֡ۛۡ;Ljava/lang/AutoCloseable;Z)V

    .line 402
    throw v0

    .line 373
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Smali cache frame checksum is missing"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 370
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Smali cache frame range is invalid"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()[B
    .locals 1

    .line 430
    iget-object v0, p0, Ll/۬ۜᩳ;->֫:[B

    return-object v0
.end method

.method public final ܳ()[B
    .locals 1

    .line 416
    iget-object v0, p0, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    iget-object v0, v0, Ll/֡ܺᩴ;->᩸:[B

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 437
    iget v0, p0, Ll/۬ۜᩳ;->ۧ:I

    return v0
.end method

.method public final ܿ()Ll/ܰۖܽ;
    .locals 4

    .line 255
    iget-object v0, p0, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    invoke-virtual {v0}, Ll/֡ܺᩴ;->֫()V

    const/4 v0, 0x0

    .line 256
    iput v0, p0, Ll/۬ۜᩳ;->ܿ:I

    .line 257
    iput v0, p0, Ll/۬ۜᩳ;->ۧ:I

    .line 258
    iput-boolean v0, p0, Ll/۬ۜᩳ;->ᩳ:Z

    .line 259
    new-instance v0, Ll/ܰۖܽ;

    new-instance v1, Ll/ۗۖܽ;

    iget-object v2, p0, Ll/۬ۜᩳ;->ܽ:Ljava/io/OutputStream;

    iget-object v3, p0, Ll/۬ۜᩳ;->᩻:[B

    invoke-direct {v1, v3, v2}, Ll/ۗۖܽ;-><init>([BLjava/io/OutputStream;)V

    invoke-direct {v0, v1}, Ll/ܰۖܽ;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 266
    iget-boolean v0, p0, Ll/۬ۜᩳ;->ᩳ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۬ۜᩳ;->ܳ:Ll/֡ܺᩴ;

    iget v0, v0, Ll/֡ܺᩴ;->᩹:I

    const/high16 v1, 0x800000

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 423
    iget v0, p0, Ll/۬ۜᩳ;->ܿ:I

    return v0
.end method
