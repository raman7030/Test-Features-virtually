.class public final Ll/ᩳ᩻ᩳ;
.super Ljava/lang/Object;
.source "8B3M"


# direct methods
.method public static ֫(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;
    .locals 3

    .line 375
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 376
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 377
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 378
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_6

    .line 379
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    .line 380
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 383
    :cond_1
    instance-of v2, p0, Ljava/io/IOException;

    if-eqz v2, :cond_2

    instance-of v2, p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-nez v2, :cond_2

    .line 384
    check-cast p0, Ljava/io/IOException;

    return-object p0

    .line 386
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 387
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 389
    :cond_3
    instance-of v2, p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-eqz v2, :cond_0

    check-cast p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    .line 391
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 392
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastThrown()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 394
    :cond_4
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseFirstPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 395
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseFirstPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 397
    :cond_5
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 398
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastPotentialThrown()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;[ILl/ܰܳᩳ;)V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 56
    invoke-interface {p2}, Ll/ܰܳᩳ;->ᩳ֫()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v3

    .line 58
    new-instance v4, Ll/ۨܳᩳ;

    invoke-direct {v4, p0, p2, v3, v0}, Ll/ۨܳᩳ;-><init>(Ll/ۗܺ᩷;Ll/ܰܳᩳ;Lnet/sf/sevenzipjbinding/IInArchive;[Lnet/sf/sevenzipjbinding/ISequentialOutStream;)V

    .line 166
    invoke-interface {p2}, Ll/ܰܳᩳ;->᩸()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ll/֨ܳᩳ;->ܺ(Ljava/lang/String;)V

    .line 167
    new-instance p0, Ll/ۤܳᩳ;

    invoke-direct {p0, p2}, Ll/ۤܳᩳ;-><init>(Ll/ܰܳᩳ;)V

    invoke-virtual {v4, p0}, Ll/֨ܳᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 171
    :goto_0
    :try_start_0
    invoke-interface {p2}, Ll/ܰܳᩳ;->ۧ֫()V

    .line 172
    invoke-interface {v3, p1, v1, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->extract([IZLnet/sf/sevenzipjbinding/IArchiveExtractCallback;)V

    .line 173
    invoke-virtual {v4}, Ll/֨ܳᩳ;->᩺()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 174
    invoke-virtual {v4}, Ll/֨ܳᩳ;->ܶ֫()Ljava/lang/String;

    move-result-object p0

    .line 175
    invoke-interface {p2}, Ll/ܰܳᩳ;->ۜ()Ljava/lang/String;

    move-result-object v5

    .line 174
    invoke-static {p0, v5}, Ll/᩹᩶᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :cond_0
    invoke-virtual {v4}, Ll/֨ܳᩳ;->᩹֫()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 178
    invoke-virtual {v4}, Ll/֨ܳᩳ;->ܶ֫()Ljava/lang/String;

    move-result-object p0

    .line 179
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 180
    invoke-interface {p2, p0}, Ll/ܰܳᩳ;->֫(Ljava/lang/String;)V

    .line 183
    :cond_1
    invoke-interface {p2, v3}, Ll/ܰܳᩳ;->ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    :try_end_0
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    aget-object p0, v0, v1

    instance-of p1, p0, Ljava/io/Closeable;

    if-eqz p1, :cond_4

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    move-exception p0

    .line 188
    :try_start_1
    invoke-virtual {v4}, Ll/ۨܳᩳ;->᩸֫()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 191
    aget-object p0, v0, v1

    if-eqz p0, :cond_3

    .line 192
    instance-of p1, p0, Ljava/io/Closeable;

    if-eqz p1, :cond_2

    check-cast p0, Ljava/io/Closeable;

    .line 193
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_2
    aput-object v2, v0, v1

    .line 196
    invoke-interface {p2}, Ll/ܰܳᩳ;->ۤ()V

    .line 199
    :cond_3
    invoke-interface {p2, v3}, Ll/ܰܳᩳ;->ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    :try_start_2
    invoke-interface {p2}, Ll/ܰܳᩳ;->ܽ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 223
    aget-object p0, v0, v1

    instance-of p1, p0, Ljava/io/Closeable;

    if-eqz p1, :cond_4

    .line 224
    :goto_1
    check-cast p0, Ljava/io/Closeable;

    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_4
    return-void

    :catchall_1
    move-exception p0

    goto :goto_3

    .line 204
    :cond_5
    :try_start_3
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v5, :cond_7

    .line 223
    aget-object p0, v0, v1

    instance-of p1, p0, Ljava/io/Closeable;

    if-eqz p1, :cond_6

    .line 224
    check-cast p0, Ljava/io/Closeable;

    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 226
    :cond_6
    invoke-static {v3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    .line 207
    :cond_7
    :try_start_4
    invoke-static {p0}, Ll/ᩳ᩻ᩳ;->֫(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;

    move-result-object v5

    if-nez v5, :cond_b

    .line 211
    invoke-interface {p2}, Ll/ܰܳᩳ;->᩻֫()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 212
    invoke-virtual {v4}, Ll/֨ܳᩳ;->᩹֫()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 213
    invoke-virtual {v4}, Ll/֨ܳᩳ;->ۖ()Z

    move-result p0

    if-eqz p0, :cond_8

    .line 214
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    .line 216
    :cond_8
    invoke-virtual {v4, v2}, Ll/֨ܳᩳ;->ܺ(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 218
    :cond_9
    throw p0

    .line 211
    :cond_a
    throw p0

    .line 209
    :cond_b
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    move-object v2, v3

    .line 223
    :goto_3
    aget-object p1, v0, v1

    instance-of p2, p1, Ljava/io/Closeable;

    if-eqz p2, :cond_c

    .line 224
    check-cast p1, Ljava/io/Closeable;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 226
    :cond_c
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 227
    throw p0
.end method

.method public static ֫(Ll/ۨۡᩴ;Ll/ܰܳᩳ;)V
    .locals 1

    .line 47
    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/۫ܳᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/ۧ᩺ᩴ;->toArray()[I

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {v0, p0, p1}, Ll/ᩳ᩻ᩳ;->֫(Ll/ۗܺ᩷;[ILl/ܰܳᩳ;)V

    return-void
.end method

.method public static ֫(Ll/ܰܳᩳ;)V
    .locals 12

    .line 234
    invoke-interface {p0}, Ll/ܰܳᩳ;->ᩳ֫()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    .line 235
    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IInArchive;->getArchiveFormat()Lnet/sf/sevenzipjbinding/ArchiveFormat;

    move-result-object v1

    .line 236
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 237
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 238
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 239
    new-instance v5, Ll/᩺ܳᩳ;

    invoke-direct {v5, p0, v2, v3, v4}, Ll/᩺ܳᩳ;-><init>(Ll/ܰܳᩳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 299
    invoke-interface {p0}, Ll/ܰܳᩳ;->᩸()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/֨ܳᩳ;->ܺ(Ljava/lang/String;)V

    .line 300
    new-instance v6, Ll/ۤܳᩳ;

    invoke-direct {v6, p0}, Ll/ۤܳᩳ;-><init>(Ll/ܰܳᩳ;)V

    invoke-virtual {v5, v6}, Ll/֨ܳᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 302
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v6, :cond_c

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 304
    :try_start_1
    invoke-virtual {v2, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 305
    invoke-virtual {v3, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 306
    invoke-virtual {v4, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 308
    invoke-interface {v0, v7, v6, v5}, Lnet/sf/sevenzipjbinding/IInArchive;->extract([IZLnet/sf/sevenzipjbinding/IArchiveExtractCallback;)V

    .line 309
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v9
    :try_end_1
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v9, :cond_0

    .line 355
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    .line 312
    :cond_0
    :try_start_2
    invoke-virtual {v5}, Ll/֨ܳᩳ;->᩺()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 313
    invoke-virtual {v5}, Ll/֨ܳᩳ;->ܶ֫()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p0}, Ll/ܰܳᩳ;->ۜ()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Ll/᩹᩶᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    :cond_1
    invoke-virtual {v5}, Ll/֨ܳᩳ;->᩹֫()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 316
    invoke-virtual {v5}, Ll/֨ܳᩳ;->ܶ֫()Ljava/lang/String;

    move-result-object v9

    .line 317
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_2

    .line 318
    invoke-interface {p0, v9}, Ll/ܰܳᩳ;->֫(Ljava/lang/String;)V

    .line 321
    :cond_2
    invoke-interface {p0, v0}, Ll/ܰܳᩳ;->ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    :try_end_2
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v9

    .line 325
    :try_start_3
    invoke-virtual {v2, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 326
    invoke-virtual {v3, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 327
    invoke-virtual {v5}, Ll/֨ܳᩳ;->᩸֫()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 328
    invoke-interface {p0, v0}, Ll/ܰܳᩳ;->ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 330
    :try_start_4
    invoke-interface {p0}, Ll/ܰܳᩳ;->ܽ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    return-void

    :catchall_0
    move-exception p0

    move-object v0, v7

    goto :goto_3

    .line 333
    :cond_3
    :try_start_5
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v8, :cond_4

    .line 355
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    .line 336
    :cond_4
    :try_start_6
    invoke-static {v9}, Ll/ᩳ᩻ᩳ;->֫(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;

    move-result-object v8

    if-nez v8, :cond_b

    .line 340
    invoke-virtual {v4, v7}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܽ᩻ᩳ;

    if-eqz v8, :cond_7

    .line 342
    invoke-virtual {v8}, Ll/ܽ᩻ᩳ;->ܽ()Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v10

    .line 361
    sget-object v11, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->WRONG_PASSWORD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-ne v10, v11, :cond_5

    goto :goto_2

    .line 364
    :cond_5
    sget-object v11, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    if-eq v1, v11, :cond_6

    sget-object v11, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    if-ne v1, v11, :cond_7

    .line 365
    :cond_6
    sget-object v11, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->CRCERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-eq v10, v11, :cond_8

    sget-object v11, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->DATAERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-ne v10, v11, :cond_7

    goto :goto_2

    :cond_7
    const/4 v6, 0x0

    .line 343
    :cond_8
    :goto_2
    invoke-virtual {v5}, Ll/֨ܳᩳ;->᩹֫()Z

    move-result v10

    if-eqz v10, :cond_a

    if-eqz v8, :cond_a

    .line 344
    invoke-virtual {v8}, Ll/ܽ᩻ᩳ;->֫()Z

    move-result v8

    if-eqz v8, :cond_a

    if-eqz v6, :cond_a

    .line 345
    invoke-virtual {v5}, Ll/֨ܳᩳ;->ۖ()Z

    move-result v6

    if-eqz v6, :cond_9

    .line 346
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    .line 348
    :cond_9
    invoke-virtual {v5, v7}, Ll/֨ܳᩳ;->ܺ(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 350
    :cond_a
    throw v9

    .line 338
    :cond_b
    throw v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 355
    :cond_c
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_1
    move-exception p0

    :goto_3
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 356
    throw p0
.end method
