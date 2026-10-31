.class public final Ll/۟᩸ᩳ;
.super Ljava/lang/Object;
.source "06R7"

# interfaces
.implements Ll/᩺۬ۡ;
.implements Landroid/text/GetChars;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Z

.field public ۙ:Ljava/lang/Runnable;

.field public final ۛ:I

.field public final ۤ:I

.field public ۨ:Ll/ܰ᩸ᩳ;

.field public ۫:I

.field public ۬:Z

.field public ܰ:Ll/᩺᩹ᩳ;

.field public ᩶:I

.field public ᩸:[C

.field public ᩹:I

.field public ᩺:Ll/۫᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/۫᩹ᩳ;I)V
    .locals 1

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 37
    iput v0, p0, Ll/۟᩸ᩳ;->۫:I

    .line 161
    iput-object p1, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    .line 162
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->length()I

    move-result p1

    iput p1, p0, Ll/۟᩸ᩳ;->ۤ:I

    .line 163
    iput p2, p0, Ll/۟᩸ᩳ;->ۛ:I

    return-void
.end method

.method public static ֫(Ll/۫᩹ᩳ;)Ll/۟᩸ᩳ;
    .locals 1

    const/4 v0, 0x0

    .line 167
    invoke-static {p0, v0}, Ll/۟᩸ᩳ;->֫(Ll/۫᩹ᩳ;I)Ll/۟᩸ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫᩹ᩳ;I)Ll/۟᩸ᩳ;
    .locals 1

    .line 172
    :try_start_0
    new-instance v0, Ll/۟᩸ᩳ;

    invoke-direct {v0, p0, p1}, Ll/۟᩸ᩳ;-><init>(Ll/۫᩹ᩳ;I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 174
    :goto_0
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->close()V

    .line 175
    throw p1
.end method

.method private ֫(III)V
    .locals 3

    .line 272
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ۘ()V

    .line 273
    iput p3, p0, Ll/۟᩸ᩳ;->۫:I

    const/4 p3, 0x0

    .line 274
    iput p3, p0, Ll/۟᩸ᩳ;->᩹:I

    iput p3, p0, Ll/۟᩸ᩳ;->᩶:I

    .line 276
    iget-object v0, p0, Ll/۟᩸ᩳ;->ܰ:Ll/᩺᩹ᩳ;

    if-nez v0, :cond_0

    .line 277
    new-instance v0, Ll/᩺᩹ᩳ;

    iget-object v1, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/16 v2, 0x800

    invoke-direct {v0, v1, v2}, Ll/᩺᩹ᩳ;-><init>(Ll/᩸۬ᩳ;I)V

    iput-object v0, p0, Ll/۟᩸ᩳ;->ܰ:Ll/᩺᩹ᩳ;

    .line 278
    invoke-virtual {v0}, Ll/᩺᩹ᩳ;->֫()[C

    move-result-object v0

    iput-object v0, p0, Ll/۟᩸ᩳ;->᩸:[C

    .line 280
    :cond_0
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    iget-object v1, p0, Ll/۟᩸ᩳ;->᩸:[C

    invoke-virtual {v0, p1, p2, v1, p3}, Ll/۬᩹ᩳ;->getChars(II[CI)V

    .line 281
    iput p1, p0, Ll/۟᩸ᩳ;->᩶:I

    .line 282
    iput p2, p0, Ll/۟᩸ᩳ;->᩹:I

    return-void
.end method

.method private ۘ()V
    .locals 1

    .line 371
    iget-object v0, p0, Ll/۟᩸ᩳ;->ۙ:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۟᩸ᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۟᩸ᩳ;->ۤ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/۟᩸ᩳ;)Ll/۫᩹ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/۟᩸ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/۟᩸ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ۘ()V

    return-void
.end method

.method private ᩴ()V
    .locals 2

    .line 376
    iget-boolean v0, p0, Ll/۟᩸ᩳ;->ۗ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text reader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final charAt(I)C
    .locals 3

    .line 261
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 262
    iget v0, p0, Ll/۟᩸ᩳ;->᩶:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/۟᩸ᩳ;->᩹:I

    if-lt p1, v0, :cond_2

    :cond_0
    if-ltz p1, :cond_3

    .line 263
    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    if-ge p1, v0, :cond_3

    .line 264
    iget v1, p0, Ll/۟᩸ᩳ;->۫:I

    if-le v1, p1, :cond_1

    add-int/lit16 v1, p1, -0x400

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, p1

    :goto_0
    sub-int/2addr v0, p1

    const/16 v2, 0x400

    .line 265
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, p1

    invoke-direct {p0, v1, v0, p1}, Ll/۟᩸ᩳ;->֫(III)V

    .line 267
    :cond_2
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/۟᩸ᩳ;->᩶:I

    sub-int/2addr p1, v1

    aget-char p1, v0, p1

    return p1

    .line 263
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid character index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 381
    :try_start_0
    iget-boolean v1, p0, Ll/۟᩸ᩳ;->ۗ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 382
    :try_start_1
    iput-boolean v1, p0, Ll/۟᩸ᩳ;->ۗ:Z

    const/4 v1, 0x0

    .line 383
    iput-object v1, p0, Ll/۟᩸ᩳ;->ۙ:Ljava/lang/Runnable;

    .line 384
    iget-object v2, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 385
    :try_start_2
    iput-object v1, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    .line 386
    iput-object v1, p0, Ll/۟᩸ᩳ;->᩸:[C
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 388
    :try_start_3
    iget-object v3, p0, Ll/۟᩸ᩳ;->ۨ:Ll/ܰ᩸ᩳ;

    if-eqz v3, :cond_1

    invoke-static {v3}, Ll/ܰ᩸ᩳ;->֫(Ll/ܰ᩸ᩳ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 390
    :cond_1
    :try_start_4
    iput-object v1, p0, Ll/۟᩸ᩳ;->ۨ:Ll/ܰ᩸ᩳ;

    .line 391
    iget-object v3, p0, Ll/۟᩸ᩳ;->ܰ:Ll/᩺᩹ᩳ;

    if-eqz v3, :cond_2

    .line 392
    invoke-virtual {v3}, Ll/᩺᩹ᩳ;->close()V

    .line 393
    iput-object v1, p0, Ll/۟᩸ᩳ;->ܰ:Ll/᩺᩹ᩳ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_2
    if-eqz v2, :cond_3

    .line 396
    :try_start_5
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 397
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v3

    .line 390
    :try_start_6
    iput-object v1, p0, Ll/۟᩸ᩳ;->ۨ:Ll/ܰ᩸ᩳ;

    .line 391
    iget-object v4, p0, Ll/۟᩸ᩳ;->ܰ:Ll/᩺᩹ᩳ;

    if-eqz v4, :cond_4

    .line 392
    invoke-virtual {v4}, Ll/᩺᩹ᩳ;->close()V

    .line 393
    iput-object v1, p0, Ll/۟᩸ᩳ;->ܰ:Ll/᩺᩹ᩳ;

    .line 395
    :cond_4
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v1

    if-eqz v2, :cond_5

    .line 384
    :try_start_7
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v2

    :try_start_8
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    throw v1

    :catchall_3
    move-exception v1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw v1
.end method

.method public final getChars(II[CI)V
    .locals 3

    .line 324
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 325
    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    invoke-static {p1, p2, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    sub-int v0, p2, p1

    .line 326
    invoke-static {p3, p4, v0}, Ll/۬᩹ᩳ;->֫([CII)V

    if-ne p1, p2, :cond_0

    goto :goto_1

    .line 328
    :cond_0
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ۘ()V

    .line 329
    iget v1, p0, Ll/۟᩸ᩳ;->᩶:I

    if-lt p1, v1, :cond_1

    iget v2, p0, Ll/۟᩸ᩳ;->᩹:I

    if-gt p2, v2, :cond_1

    .line 330
    iget-object p2, p0, Ll/۟᩸ᩳ;->᩸:[C

    sub-int/2addr p1, v1

    invoke-static {p2, p1, p3, p4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 331
    :cond_1
    iget-object v0, p0, Ll/۟᩸ᩳ;->ۙ:Ljava/lang/Runnable;

    if-nez v0, :cond_2

    .line 332
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۬᩹ᩳ;->getChars(II[CI)V

    return-void

    :cond_2
    :goto_0
    if-ge p1, p2, :cond_3

    .line 336
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ۘ()V

    const/16 v0, 0x1000

    sub-int v1, p2, p1

    .line 337
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, p1

    .line 338
    iget-object v1, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v1, p1, v0, p3, p4}, Ll/۬᩹ᩳ;->getChars(II[CI)V

    sub-int p1, v0, p1

    add-int/2addr p4, p1

    move p1, v0

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final indexOf(CII)I
    .locals 3

    .line 287
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    const/4 v0, 0x0

    .line 288
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 289
    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    :cond_0
    if-ge p2, p3, :cond_4

    .line 291
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ۘ()V

    .line 293
    iget v0, p0, Ll/۟᩸ᩳ;->᩶:I

    if-lt p2, v0, :cond_1

    iget v0, p0, Ll/۟᩸ᩳ;->᩹:I

    if-lt p2, v0, :cond_2

    :cond_1
    const/16 v0, 0x400

    sub-int v1, p3, p2

    .line 294
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, p2

    invoke-direct {p0, p2, v0, p2}, Ll/۟᩸ᩳ;->֫(III)V

    .line 295
    :cond_2
    iget v0, p0, Ll/۟᩸ᩳ;->᩹:I

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_0
    if-ge p2, v0, :cond_0

    .line 297
    iget-object v1, p0, Ll/۟᩸ᩳ;->᩸:[C

    iget v2, p0, Ll/۟᩸ᩳ;->᩶:I

    sub-int v2, p2, v2

    aget-char v1, v1, v2

    if-ne v1, p1, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, -0x1

    return p1
.end method

.method public final lastIndexOf(CII)I
    .locals 3

    .line 306
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    const/4 v0, 0x0

    .line 307
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 308
    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    :cond_0
    if-le p3, p2, :cond_4

    .line 310
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ۘ()V

    add-int/lit8 v0, p3, -0x1

    .line 312
    iget v1, p0, Ll/۟᩸ᩳ;->᩶:I

    if-lt v0, v1, :cond_1

    iget v1, p0, Ll/۟᩸ᩳ;->᩹:I

    if-lt v0, v1, :cond_2

    :cond_1
    add-int/lit16 v1, p3, -0x400

    .line 313
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {p0, v1, p3, v0}, Ll/۟᩸ᩳ;->֫(III)V

    .line 314
    :cond_2
    iget v0, p0, Ll/۟᩸ᩳ;->᩶:I

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_3
    if-le p3, v0, :cond_0

    .line 316
    iget-object v1, p0, Ll/۟᩸ᩳ;->᩸:[C

    add-int/lit8 p3, p3, -0x1

    iget v2, p0, Ll/۟᩸ᩳ;->᩶:I

    sub-int v2, p3, v2

    aget-char v1, v1, v2

    if-ne v1, p1, :cond_3

    return p3

    :cond_4
    const/4 p1, -0x1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 192
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    return v0
.end method

.method public final bridge synthetic subSequence(II)Ljava/lang/CharSequence;
    .locals 0

    .line 26
    invoke-virtual {p0, p1, p2}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final subSequence(II)Ljava/lang/String;
    .locals 3

    .line 348
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 349
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ۘ()V

    .line 350
    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    invoke-static {p1, p2, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    if-ne p1, p2, :cond_0

    const-string p1, ""

    return-object p1

    .line 353
    :cond_0
    iget v0, p0, Ll/۟᩸ᩳ;->᩶:I

    if-lt p1, v0, :cond_1

    iget v1, p0, Ll/۟᩸ᩳ;->᩹:I

    if-gt p2, v1, :cond_1

    .line 354
    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Ll/۟᩸ᩳ;->᩸:[C

    sub-int v0, p1, v0

    sub-int/2addr p2, p1

    invoke-direct {v1, v2, v0, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v1

    :cond_1
    sub-int v0, p2, p1

    .line 355
    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 356
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/۟᩸ᩳ;->getChars(II[CI)V

    .line 357
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([C)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 364
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 365
    iget-boolean v0, p0, Ll/۟᩸ᩳ;->۬:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 366
    :cond_0
    iget-object v0, p0, Ll/۟᩸ᩳ;->ۙ:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iget v1, p0, Ll/۟᩸ᩳ;->ۤ:I

    invoke-virtual {p0, v0, v1}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 367
    :cond_1
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ֫()Ll/۟᩸ᩳ;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 181
    :try_start_0
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 182
    new-instance v1, Ll/۫᩹ᩳ;

    iget-object v2, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v2}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v2

    iget-object v3, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v3}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V

    iget v2, p0, Ll/۟᩸ᩳ;->ۛ:I

    invoke-static {v1, v2}, Ll/۟᩸ᩳ;->֫(Ll/۫᩹ᩳ;I)Ll/۟᩸ᩳ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(II)Ll/᩺᩸ᩳ;
    .locals 1

    .line 215
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 216
    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    invoke-static {p1, p2, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 217
    new-instance v0, Ll/᩺᩸ᩳ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩺᩸ᩳ;-><init>(Ll/۟᩸ᩳ;II)V

    return-object v0
.end method

.method public final ۖ()Ll/۫᩹ᩳ;
    .locals 1

    .line 189
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    return-object v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 202
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 203
    iget v0, p0, Ll/۟᩸ᩳ;->ۤ:I

    invoke-static {p1, p1, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 204
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/۬᩹ᩳ;->ܽ(I)I

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Runnable;)V
    .locals 0

    .line 255
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 256
    iput-object p1, p0, Ll/۟᩸ᩳ;->ۙ:Ljava/lang/Runnable;

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 186
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    iget v0, p0, Ll/۟᩸ᩳ;->ۛ:I

    return v0
.end method

.method public final ܽ(I)I
    .locals 1

    .line 209
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 210
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/۬᩹ᩳ;->ᩳ(I)I

    move-result p1

    return p1
.end method

.method public final ᩳ()J
    .locals 2

    .line 196
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 197
    iget-object v0, p0, Ll/۟᩸ᩳ;->᩺:Ll/۫᩹ᩳ;

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->ᩳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩻()Ll/ܰ᩸ᩳ;
    .locals 1

    .line 49
    invoke-direct {p0}, Ll/۟᩸ᩳ;->ᩴ()V

    .line 50
    iget-object v0, p0, Ll/۟᩸ᩳ;->ۨ:Ll/ܰ᩸ᩳ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܰ᩸ᩳ;

    invoke-direct {v0, p0}, Ll/ܰ᩸ᩳ;-><init>(Ll/۟᩸ᩳ;)V

    iput-object v0, p0, Ll/۟᩸ᩳ;->ۨ:Ll/ܰ᩸ᩳ;

    .line 51
    :cond_0
    iget-object v0, p0, Ll/۟᩸ᩳ;->ۨ:Ll/ܰ᩸ᩳ;

    return-object v0
.end method
