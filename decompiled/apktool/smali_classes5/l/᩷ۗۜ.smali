.class public final Ll/᩷ۗۜ;
.super Ljava/lang/Object;
.source "274A"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:J

.field public ۧ:Ll/᩸۠֫;

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:Ll/ۗ۠֫;

.field public final synthetic ܿ:Ll/ۢۗۜ;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۢۗۜ;)V
    .locals 0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۗۜ;->ܿ:Ll/ۢۗۜ;

    .line 229
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩷ۗۜ;->ܳ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ll/ۗ۠֫;Ljava/lang/Exception;)J
    .locals 4

    .line 425
    :goto_0
    iget-object v0, p0, Ll/᩷ۗۜ;->ܿ:Ll/ۢۗۜ;

    if-eqz p2, :cond_1

    .line 426
    instance-of v1, p2, Ll/᩹᩶ۜ;

    if-eqz v1, :cond_0

    .line 344
    invoke-static {v0}, Ll/ۢۗۜ;->ܽ(Ll/ۢۗۜ;)Ll/ܶ۠֫;

    move-result-object p2

    goto :goto_1

    .line 429
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    goto :goto_0

    .line 344
    :cond_1
    invoke-static {v0}, Ll/ۢۗۜ;->ܿ(Ll/ۢۗۜ;)Ll/ܶ۠֫;

    move-result-object p2

    .line 345
    :goto_1
    invoke-interface {p2}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v1

    .line 346
    iput-object v1, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    .line 347
    invoke-direct {p0}, Ll/᩷ۗۜ;->ܳ()V

    .line 349
    :try_start_0
    invoke-interface {v1, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v2

    .line 351
    :goto_2
    invoke-static {v0}, Ll/ۢۗۜ;->ܽ(Ll/ۢۗۜ;)Ll/ܶ۠֫;

    move-result-object v3

    if-eq p2, v3, :cond_3

    invoke-static {v0}, Ll/ۢۗۜ;->ۧ(Ll/ۢۗۜ;)Z

    move-result p2

    if-eqz p2, :cond_3

    move-object p2, v2

    :goto_3
    if-eqz p2, :cond_3

    .line 426
    instance-of v3, p2, Ll/᩹᩶ۜ;

    if-eqz v3, :cond_2

    .line 407
    :try_start_1
    invoke-interface {v1}, Ll/᩸۠֫;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 357
    :catch_2
    invoke-static {v0}, Ll/ۢۗۜ;->ܽ(Ll/ۢۗۜ;)Ll/ܶ۠֫;

    move-result-object p2

    invoke-interface {p2}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object p2

    .line 358
    iput-object p2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    .line 359
    invoke-direct {p0}, Ll/᩷ۗۜ;->ܳ()V

    .line 360
    invoke-interface {p2, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide p1

    return-wide p1

    .line 429
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    goto :goto_3

    .line 354
    :cond_3
    throw v2
.end method

.method private ֫(Ljava/lang/Exception;)Z
    .locals 1

    :goto_0
    if-eqz p1, :cond_2

    .line 289
    instance-of v0, p1, Ll/۠ܶ֫;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩷ۗۜ;->ܿ:Ll/ۢۗۜ;

    invoke-static {v0}, Ll/ۢۗۜ;->ۧ(Ll/ۢۗۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Ll/᩹᩶ۜ;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 294
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private ܳ()V
    .locals 3

    .line 279
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Ll/᩷ۗۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܶ֫;

    .line 281
    iget-object v2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    invoke-interface {v2, v1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 378
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    .line 382
    :try_start_0
    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 384
    :goto_0
    :try_start_1
    iget-boolean v5, p0, Ll/᩷ۗۜ;->ᩳ:Z

    if-eqz v5, :cond_2

    invoke-direct {p0, v0}, Ll/᩷ۗۜ;->֫(Ljava/lang/Exception;)Z

    move-result v5

    if-eqz v5, :cond_2

    :goto_1
    if-eqz v0, :cond_1

    .line 415
    instance-of v5, v0, Ll/۠ܶ֫;

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_2

    .line 418
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_3

    .line 389
    iget-object v0, p0, Ll/᩷ۗۜ;->ܿ:Ll/ۢۗۜ;

    invoke-static {v0}, Ll/ۢۗۜ;->ᩳ(Ll/ۢۗۜ;)Ll/᩻۬ۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻۬ۜ;->ܽ()V

    goto :goto_4

    .line 385
    :cond_2
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 394
    :goto_3
    iput-object v4, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    .line 395
    iput-object v4, p0, Ll/᩷ۗۜ;->ܽ:Ll/ۗ۠֫;

    .line 396
    iput-wide v2, p0, Ll/᩷ۗۜ;->֫:J

    .line 397
    iput-boolean v1, p0, Ll/᩷ۗۜ;->ᩳ:Z

    .line 398
    throw v0

    .line 394
    :cond_3
    :goto_4
    iput-object v4, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    .line 395
    iput-object v4, p0, Ll/᩷ۗۜ;->ܽ:Ll/ۗ۠֫;

    .line 396
    iput-wide v2, p0, Ll/᩷ۗۜ;->֫:J

    .line 397
    iput-boolean v1, p0, Ll/᩷ۗۜ;->ᩳ:Z

    return-void
.end method

.method public final read([BII)I
    .locals 9

    .line 301
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_8

    .line 305
    :try_start_0
    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result v0

    if-lez v0, :cond_0

    .line 307
    iget-wide v1, p0, Ll/᩷ۗۜ;->֫:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷ۗۜ;->֫:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 311
    :goto_0
    iget-boolean v1, p0, Ll/᩷ۗۜ;->ᩳ:Z

    if-eqz v1, :cond_7

    invoke-direct {p0, v0}, Ll/᩷ۗۜ;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 326
    iget-object v1, p0, Ll/᩷ۗۜ;->ܽ:Ll/ۗ۠֫;

    if-eqz v1, :cond_6

    .line 330
    iget-object v2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v2, :cond_1

    goto :goto_1

    .line 407
    :cond_1
    :try_start_1
    invoke-interface {v2}, Ll/᩸۠֫;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    :catch_2
    :goto_1
    const/4 v2, 0x0

    .line 331
    iput-object v2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    move-object v2, v0

    :goto_2
    if-eqz v2, :cond_3

    .line 415
    instance-of v3, v2, Ll/۠ܶ֫;

    if-eqz v3, :cond_2

    .line 333
    iget-object v2, p0, Ll/᩷ۗۜ;->ܿ:Ll/ۢۗۜ;

    invoke-static {v2}, Ll/ۢۗۜ;->ᩳ(Ll/ۢۗۜ;)Ll/᩻۬ۜ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩻۬ۜ;->ܽ()V

    goto :goto_3

    .line 418
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_2

    :cond_3
    :goto_3
    const/4 v2, 0x0

    .line 335
    iput-boolean v2, p0, Ll/᩷ۗۜ;->ᩳ:Z

    .line 336
    iget-wide v2, p0, Ll/᩷ۗۜ;->֫:J

    .line 520
    iget-wide v4, v1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-nez v8, :cond_4

    goto :goto_4

    :cond_4
    sub-long v6, v4, v2

    :goto_4
    invoke-virtual {v1, v2, v3, v6, v7}, Ll/ۗ۠֫;->֫(JJ)Ll/ۗ۠֫;

    move-result-object v1

    .line 336
    invoke-direct {p0, v1, v0}, Ll/᩷ۗۜ;->֫(Ll/ۗ۠֫;Ljava/lang/Exception;)J

    .line 316
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    if-lez p1, :cond_5

    .line 318
    iget-wide p2, p0, Ll/᩷ۗۜ;->֫:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩷ۗۜ;->֫:J

    :cond_5
    return p1

    .line 328
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Media data spec is missing"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 312
    :cond_7
    throw v0

    .line 302
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Data source is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 5

    .line 246
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_6

    .line 249
    iget-object v0, p0, Ll/᩷ۗۜ;->ܿ:Ll/ۢۗۜ;

    invoke-static {v0}, Ll/ۢۗۜ;->֫(Ll/ۢۗۜ;)Ll/᩻ۗۜ;

    move-result-object v1

    invoke-interface {v1, p1}, Ll/᩻ۗۜ;->֫(Ll/ۗ۠֫;)Ljava/lang/String;

    move-result-object v1

    .line 250
    invoke-virtual {p1}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v2

    .line 251
    invoke-virtual {v2, v1}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    iget v1, p1, Ll/ۗ۠֫;->֫:I

    or-int/lit8 v1, v1, 0x4

    .line 252
    invoke-virtual {v2, v1}, Ll/ۙ۠֫;->֫(I)V

    .line 253
    invoke-virtual {v2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v1

    .line 254
    invoke-static {v0}, Ll/ۢۗۜ;->ᩳ(Ll/ۢۗۜ;)Ll/᩻۬ۜ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩻۬ۜ;->֫()Ll/ܺ᩸֫;

    move-result-object v2

    .line 255
    iput-object p1, p0, Ll/᩷ۗۜ;->ܽ:Ll/ۗ۠֫;

    const-wide/16 v3, 0x0

    .line 256
    iput-wide v3, p0, Ll/᩷ۗۜ;->֫:J

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 257
    :goto_0
    iput-boolean v4, p0, Ll/᩷ۗۜ;->ᩳ:Z

    if-nez v2, :cond_1

    .line 259
    invoke-static {v0}, Ll/ۢۗۜ;->ܿ(Ll/ۢۗۜ;)Ll/ܶ۠֫;

    move-result-object v2

    invoke-interface {v2}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-static {v0, v2}, Ll/ۢۗۜ;->֫(Ll/ۢۗۜ;Ll/ܺ᩸֫;)Ll/۬ܶ֫;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    .line 260
    invoke-direct {p0}, Ll/᩷ۗۜ;->ܳ()V

    .line 262
    :try_start_0
    iget-object v2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    invoke-interface {v2, v1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 264
    :goto_2
    invoke-direct {p0, v1}, Ll/᩷ۗۜ;->֫(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 268
    iget-object v2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v2, :cond_2

    goto :goto_3

    .line 407
    :cond_2
    :try_start_1
    invoke-interface {v2}, Ll/᩸۠֫;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    :catch_2
    :goto_3
    const/4 v2, 0x0

    .line 269
    iput-object v2, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_4

    .line 415
    instance-of v4, v2, Ll/۠ܶ֫;

    if-eqz v4, :cond_3

    .line 271
    invoke-static {v0}, Ll/ۢۗۜ;->ᩳ(Ll/ۢۗۜ;)Ll/᩻۬ۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻۬ۜ;->ܽ()V

    goto :goto_5

    .line 418
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_4

    .line 273
    :cond_4
    :goto_5
    iput-boolean v3, p0, Ll/᩷ۗۜ;->ᩳ:Z

    .line 274
    invoke-direct {p0, p1, v1}, Ll/᩷ۗۜ;->֫(Ll/ۗ۠֫;Ljava/lang/Exception;)J

    move-result-wide v0

    return-wide v0

    .line 265
    :cond_5
    throw v1

    .line 247
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Data source is already open"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 373
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 235
    iget-object v0, p0, Ll/᩷ۗۜ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 236
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    .line 239
    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 367
    iget-object v0, p0, Ll/᩷ۗۜ;->ۧ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
