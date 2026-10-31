.class public final Ll/֨۬ᩳ;
.super Ljava/lang/Object;
.source "56UC"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۖ:Ll/ۖ۬ᩳ;

.field public final ۜ:Ll/۬ۜܽ;

.field public ۡ:I

.field public ۢ:J

.field public ۧ:I

.field public final ܳ:J

.field public ܺ:J

.field public final ܽ:[Ll/֡۬ᩳ;

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:[B

.field public final ᩷:Ll/ۤۜܽ;

.field public final ᩻:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(J)V
    .locals 4

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    .line 24
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x2030

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    iput-object v0, p0, Ll/֨۬ᩳ;->᩷:Ll/ۤۜܽ;

    .line 25
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    iput-object v0, p0, Ll/֨۬ᩳ;->ᩳ:[B

    .line 26
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    iput-object v1, p0, Ll/֨۬ᩳ;->ۜ:Ll/۬ۜܽ;

    .line 27
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/֨۬ᩳ;->᩻:Ljava/util/zip/CRC32;

    const/4 v0, 0x4

    new-array v0, v0, [Ll/֡۬ᩳ;

    .line 30
    iput-object v0, p0, Ll/֨۬ᩳ;->ܽ:[Ll/֡۬ᩳ;

    .line 110
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    const/16 v3, 0x10

    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    const-wide/16 v0, 0x4000

    .line 111
    iput-wide v0, p0, Ll/֨۬ᩳ;->ܺ:J

    .line 112
    iput-wide v0, p0, Ll/֨۬ᩳ;->ۢ:J

    const-wide/32 v0, 0x8000

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 119
    iput-wide p1, p0, Ll/֨۬ᩳ;->ܳ:J

    .line 120
    new-instance v0, Ll/ۖ۬ᩳ;

    const-wide/16 v1, 0x8

    div-long/2addr p1, v1

    invoke-direct {v0, p1, p2}, Ll/ۖ۬ᩳ;-><init>(J)V

    iput-object v0, p0, Ll/֨۬ᩳ;->ۖ:Ll/ۖ۬ᩳ;

    return-void

    .line 118
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Page cache budget is too small"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/֨۬ᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֨۬ᩳ;->ܺ:J

    return-wide v0
.end method

.method public static bridge synthetic ֫(Ll/֨۬ᩳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֨۬ᩳ;->ܺ:J

    return-void
.end method

.method private declared-synchronized ܳ()Ll/֡۬ᩳ;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 64
    :try_start_0
    iget v1, p0, Ll/֨۬ᩳ;->ۧ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return-object v2

    .line 65
    :cond_0
    :try_start_1
    iget-object v3, p0, Ll/֨۬ᩳ;->ܽ:[Ll/֡۬ᩳ;

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/֨۬ᩳ;->ۧ:I

    aget-object v4, v3, v1

    .line 66
    aput-object v2, v3, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private ܽ(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;
    .locals 6

    .line 306
    invoke-direct {p0}, Ll/֨۬ᩳ;->ܳ()Ll/֡۬ᩳ;

    move-result-object v0

    const/4 v1, 0x0

    .line 310
    :try_start_0
    iget-wide v2, p1, Ll/۠۬ᩳ;->֫:J

    invoke-virtual {p0, v2, v3}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v2
    :try_end_0
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v4, p0

    goto/16 :goto_9

    :catch_0
    move-exception p1

    move-object v4, p0

    goto/16 :goto_8

    :catch_1
    move-exception v2

    goto :goto_0

    :catch_2
    move-exception v2

    :goto_0
    if-eqz v0, :cond_2

    .line 314
    :try_start_1
    invoke-virtual {p0, v0, v1}, Ll/֨۬ᩳ;->֫(Ll/֡۬ᩳ;Z)V

    const/4 v0, 0x0

    .line 316
    iget-wide v2, p1, Ll/۠۬ᩳ;->֫:J

    invoke-virtual {p0, v2, v3}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    if-nez v0, :cond_0

    .line 320
    :try_start_2
    invoke-virtual {p0}, Ll/֨۬ᩳ;->֫()Ll/֡۬ᩳ;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v4, p0

    goto :goto_6

    :cond_0
    :goto_2
    move-object v3, v0

    .line 321
    :try_start_3
    iget-object v0, p1, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    invoke-virtual {v0, p1, v3}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/֡۬ᩳ;)Ll/ۧ۫ᩳ;

    move-result-object v4

    move-object v0, p0

    .line 322
    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 323
    :try_start_4
    invoke-virtual {p0, p1, v4, v2}, Ll/֨۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;Ll/ۚ۬ᩳ;)V

    .line 324
    iget-object v4, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴ۬ᩳ;

    .line 325
    iget v4, p1, Ll/ᩴ۬ᩳ;->ܽ:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, p1, Ll/ᩴ۬ᩳ;->ܽ:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 328
    :try_start_5
    new-instance v1, Ll/᩵۬ᩳ;

    invoke-direct {v1, p0, p1}, Ll/᩵۬ᩳ;-><init>(Ll/֨۬ᩳ;Ll/ᩴ۬ᩳ;)V

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 330
    :try_start_6
    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v3, :cond_1

    .line 334
    invoke-virtual {p0, v3, v5}, Ll/֨۬ᩳ;->֫(Ll/֡۬ᩳ;Z)V

    :cond_1
    return-object v1

    :catchall_2
    move-exception p1

    const/4 v0, 0x1

    move-object v4, p0

    goto :goto_a

    :catch_3
    move-exception p1

    const/4 v0, 0x1

    move-object v4, p0

    move-object v0, v3

    const/4 v1, 0x1

    goto :goto_8

    :catchall_3
    move-exception p1

    const/4 v1, 0x1

    :goto_3
    move-object v4, p0

    goto :goto_4

    :catchall_4
    move-exception p1

    goto :goto_3

    .line 329
    :goto_4
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception p1

    goto :goto_5

    :catchall_6
    move-exception p1

    goto :goto_4

    :catchall_7
    move-exception p1

    move-object v4, p0

    :goto_5
    move-object v0, v3

    .line 318
    :goto_6
    :try_start_9
    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    goto :goto_7

    :catchall_8
    move-exception v2

    :try_start_a
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw p1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    :catch_4
    move-exception p1

    goto :goto_8

    .line 312
    :cond_2
    :try_start_b
    throw v2
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 332
    :goto_8
    :try_start_c
    new-instance v2, Ljava/io/UncheckedIOException;

    invoke-direct {v2, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    :catchall_9
    move-exception p1

    :goto_9
    move-object v3, v0

    move v0, v1

    :goto_a
    if-eqz v3, :cond_3

    .line 334
    invoke-virtual {v4, v3, v0}, Ll/֨۬ᩳ;->֫(Ll/֡۬ᩳ;Z)V

    .line 335
    :cond_3
    throw p1
.end method

.method private ܿ()Z
    .locals 5

    .line 80
    iget v0, p0, Ll/֨۬ᩳ;->ۧ:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x1

    sub-int/2addr v0, v1

    .line 81
    iput v0, p0, Ll/֨۬ᩳ;->ۧ:I

    iget-object v2, p0, Ll/֨۬ᩳ;->ܽ:[Ll/֡۬ᩳ;

    aget-object v3, v2, v0

    const/4 v4, 0x0

    .line 82
    aput-object v4, v2, v0

    .line 83
    iget v0, p0, Ll/֨۬ᩳ;->ۡ:I

    sub-int/2addr v0, v1

    iput v0, p0, Ll/֨۬ᩳ;->ۡ:I

    .line 84
    iget-object v0, v3, Ll/֡۬ᩳ;->ᩳ:Ll/ۚ۬ᩳ;

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    return v1
.end method

.method private ᩳ(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;
    .locals 4

    move-object v0, p1

    .line 281
    monitor-enter v0

    :goto_0
    move-object v1, p0

    .line 283
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 284
    :try_start_1
    iget-object v2, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ۬ᩳ;

    if-eqz v2, :cond_0

    .line 285
    iget-boolean v3, v2, Ll/ᩴ۬ᩳ;->֫:Z

    if-nez v3, :cond_0

    .line 286
    iget p1, v2, Ll/ᩴ۬ᩳ;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v2, Ll/ᩴ۬ᩳ;->ܽ:I

    .line 287
    new-instance p1, Ll/᩵۬ᩳ;

    invoke-direct {p1, p0, v2}, Ll/᩵۬ᩳ;-><init>(Ll/֨۬ᩳ;Ll/ᩴ۬ᩳ;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object p1

    :cond_0
    if-eqz v2, :cond_1

    .line 291
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 296
    :try_start_4
    monitor-exit v1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 293
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 294
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Interrupted while loading text page"

    invoke-direct {v2, v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 298
    :cond_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 299
    :try_start_5
    invoke-direct {p0, p1}, Ll/֨۬ᩳ;->ܽ(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;

    move-result-object p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    return-object p1

    :catchall_0
    move-exception p1

    .line 298
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw p1

    :catchall_1
    move-exception p1

    .line 301
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/֡۬ᩳ;
    .locals 4

    move-object v0, p0

    .line 35
    monitor-enter v0

    .line 36
    :try_start_0
    invoke-direct {p0}, Ll/֨۬ᩳ;->ܳ()Ll/֡۬ᩳ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 37
    monitor-exit v0

    return-object v1

    .line 38
    :cond_0
    iget v1, p0, Ll/֨۬ᩳ;->ۡ:I

    iget-object v2, p0, Ll/֨۬ᩳ;->ܽ:[Ll/֡۬ᩳ;

    array-length v2, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    monitor-exit v0

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    iput v1, p0, Ll/֨۬ᩳ;->ۡ:I

    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const-wide/16 v0, 0x4000

    .line 44
    :try_start_1
    invoke-virtual {p0, v0, v1}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0
    :try_end_1
    .catch Ll/ۘ۬ᩳ; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/UncheckedIOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :try_start_2
    new-instance v1, Ll/֡۬ᩳ;

    iget-object v2, p0, Ll/֨۬ᩳ;->ᩳ:[B

    array-length v2, v2

    invoke-direct {v1, v0, v2}, Ll/֡۬ᩳ;-><init>(Ll/ۚ۬ᩳ;I)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 54
    :goto_0
    :try_start_3
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    .line 55
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v0, p0

    .line 58
    monitor-enter v0

    :try_start_4
    iget v2, p0, Ll/֨۬ᩳ;->ۡ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/֨۬ᩳ;->ۡ:I

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 59
    throw v1

    :catchall_1
    move-exception v1

    .line 58
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1

    :catch_2
    move-object v0, p0

    monitor-enter v0

    :try_start_6
    iget v1, p0, Ll/֨۬ᩳ;->ۡ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/֨۬ᩳ;->ۡ:I

    monitor-exit v0

    return-object v3

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1

    :catchall_3
    move-exception v1

    .line 40
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v1
.end method

.method public final ֫(J)Ll/ۚ۬ᩳ;
    .locals 13

    const-wide/16 v1, 0x0

    cmp-long v0, p1, v1

    if-ltz v0, :cond_c

    .line 191
    iget-wide v3, p0, Ll/֨۬ᩳ;->ܳ:J

    const-wide/16 v5, 0x4000

    sub-long/2addr v3, v5

    cmp-long v0, p1, v3

    if-gtz v0, :cond_c

    const/4 v0, -0x1

    const/4 v3, 0x0

    move-object v5, v3

    move-object v6, v5

    const/4 v4, -0x1

    :goto_0
    move-object v0, p0

    .line 197
    monitor-enter v0

    .line 198
    :try_start_0
    iget-wide v7, p0, Ll/֨۬ᩳ;->ܳ:J

    iget-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    sub-long/2addr v7, v9

    cmp-long v11, p1, v7

    if-gtz v11, :cond_0

    add-long/2addr v9, p1

    .line 199
    iput-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    .line 200
    iget-wide v1, p0, Ll/֨۬ᩳ;->ۢ:J

    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, p0, Ll/֨۬ᩳ;->ۢ:J

    .line 201
    new-instance v1, Ll/ۚ۬ᩳ;

    invoke-direct {v1, p0, p1, p2}, Ll/ۚ۬ᩳ;-><init>(Ll/֨۬ᩳ;J)V

    monitor-exit v0

    return-object v1

    .line 204
    :cond_0
    iget-object v7, p0, Ll/֨۬ᩳ;->ۖ:Ll/ۖ۬ᩳ;

    invoke-virtual {v7}, Ll/ۖ۬ᩳ;->֫()J

    move-result-wide v7

    cmp-long v9, v7, v1

    if-eqz v9, :cond_1

    .line 206
    iget-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    sub-long/2addr v9, v7

    iput-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    .line 207
    monitor-exit v0

    goto :goto_0

    .line 209
    :cond_1
    invoke-direct {p0}, Ll/֨۬ᩳ;->ܿ()Z

    move-result v7

    if-eqz v7, :cond_2

    monitor-exit v0

    goto :goto_0

    :cond_2
    if-gez v4, :cond_3

    .line 210
    iget-object v4, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/AbstractMap;->size()I

    move-result v4

    .line 211
    :cond_3
    iget-object v7, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩴ۬ᩳ;

    if-lez v4, :cond_4

    .line 212
    iget v9, v8, Ll/ᩴ۬ᩳ;->ܽ:I

    if-nez v9, :cond_4

    iget-boolean v9, v8, Ll/ᩴ۬ᩳ;->֫:Z

    if-nez v9, :cond_4

    if-eqz v5, :cond_5

    iget-object v9, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    .line 213
    invoke-interface {v5, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    :cond_5
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_6
    move-object v8, v3

    :goto_1
    if-nez v8, :cond_8

    if-eqz v6, :cond_7

    .line 220
    new-instance p1, Ljava/io/UncheckedIOException;

    invoke-direct {p1, v6}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p1

    .line 221
    :cond_7
    new-instance p1, Ll/ۘ۬ᩳ;

    invoke-direct {p1}, Ll/ۘ۬ᩳ;-><init>()V

    throw p1

    .line 224
    :cond_8
    iget-object v7, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    iget-wide v9, v7, Ll/۠۬ᩳ;->᩻:J

    cmp-long v7, v9, v1

    if-ltz v7, :cond_9

    .line 225
    iget-object v7, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    iget-object v9, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    invoke-virtual {v7, v9}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    iget-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    iget-object v7, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    iget-wide v11, v7, Ll/۠۬ᩳ;->֫:J

    sub-long/2addr v9, v11

    iput-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    .line 227
    iput-object v3, v8, Ll/ᩴ۬ᩳ;->ۧ:Ll/ۧ۫ᩳ;

    .line 229
    monitor-exit v0

    goto/16 :goto_0

    :cond_9
    const/4 v7, 0x1

    .line 231
    iput-boolean v7, v8, Ll/ᩴ۬ᩳ;->֫:Z

    .line 232
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v7, 0x0

    .line 234
    :try_start_1
    iget-object v0, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    iget-object v9, v0, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    iget-object v10, v8, Ll/ᩴ۬ᩳ;->ۧ:Ll/ۧ۫ᩳ;

    invoke-virtual {v9, v0, v10}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;)V

    move-object v0, p0

    .line 235
    monitor-enter v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 236
    :try_start_2
    iget-object v9, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    iget-object v10, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    invoke-virtual {v9, v10}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    iget-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    iget-object v11, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    iget-wide v11, v11, Ll/۠۬ᩳ;->֫:J

    sub-long/2addr v9, v11

    iput-wide v9, p0, Ll/֨۬ᩳ;->ܺ:J

    .line 238
    iput-object v3, v8, Ll/ᩴ۬ᩳ;->ۧ:Ll/ۧ۫ᩳ;

    .line 240
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v0, p0

    .line 247
    monitor-enter v0

    .line 248
    :try_start_3
    iput-boolean v7, v8, Ll/ᩴ۬ᩳ;->֫:Z

    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 250
    monitor-exit v0

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception v9

    .line 240
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v9
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v0

    if-nez v6, :cond_a

    move-object v6, v0

    :cond_a
    if-nez v5, :cond_b

    .line 244
    :try_start_6
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 245
    :cond_b
    iget-object v0, v8, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v0, p0

    .line 247
    monitor-enter v0

    .line 248
    :try_start_7
    iput-boolean v7, v8, Ll/ᩴ۬ᩳ;->֫:Z

    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 250
    monitor-exit v0

    goto/16 :goto_0

    :catchall_3
    move-exception p1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p1

    :goto_2
    move-object v0, p0

    .line 247
    monitor-enter v0

    .line 248
    :try_start_8
    iput-boolean v7, v8, Ll/ᩴ۬ᩳ;->֫:Z

    .line 249
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 250
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 251
    throw p1

    :catchall_4
    move-exception p1

    .line 250
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    throw p1

    :catchall_5
    move-exception p1

    .line 232
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    throw p1

    .line 191
    :cond_c
    new-instance p1, Ll/ۘ۬ᩳ;

    invoke-direct {p1}, Ll/ۘ۬ᩳ;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;
    .locals 1

    .line 269
    iget-object v0, p1, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 272
    :try_start_0
    invoke-direct {p0, p1}, Ll/֨۬ᩳ;->ᩳ(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    .line 276
    iget-object p1, p1, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    invoke-virtual {p1}, Ll/᩸۬ᩳ;->᩻()V

    .line 277
    throw v0
.end method

.method public final declared-synchronized ֫(Ll/֡۬ᩳ;Z)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-eqz p2, :cond_0

    .line 72
    :try_start_0
    iget-object p2, p0, Ll/֨۬ᩳ;->ܽ:[Ll/֡۬ᩳ;

    iget v1, p0, Ll/֨۬ᩳ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֨۬ᩳ;->ۧ:I

    aput-object p1, p2, v1

    goto :goto_0

    .line 74
    :cond_0
    iget p2, p0, Ll/֨۬ᩳ;->ۡ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/֨۬ᩳ;->ۡ:I

    .line 75
    iget-object p1, p1, Ll/֡۬ᩳ;->ᩳ:Ll/ۚ۬ᩳ;

    invoke-virtual {p1}, Ll/ۚ۬ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;Ll/ۚ۬ᩳ;)V
    .locals 6

    move-object v0, p0

    .line 256
    monitor-enter v0

    .line 257
    :try_start_0
    invoke-static {p3}, Ll/ۚ۬ᩳ;->ۧ(Ll/ۚ۬ᩳ;)Ll/֨۬ᩳ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    invoke-static {p3}, Ll/ۚ۬ᩳ;->֫(Ll/ۚ۬ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-wide v1, p3, Ll/ۚ۬ᩳ;->᩹:J

    iget-wide v3, p1, Ll/۠۬ᩳ;->֫:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 258
    invoke-virtual {p2}, Ll/ۧ۫ᩳ;->֫()J

    move-result-wide v1

    iget-wide v3, p1, Ll/۠۬ᩳ;->֫:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget-object v1, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 261
    iget-object v1, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    new-instance v2, Ll/ᩴ۬ᩳ;

    invoke-direct {v2, p1, p2}, Ll/ᩴ۬ᩳ;-><init>(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;)V

    invoke-virtual {v1, p1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    invoke-static {p3}, Ll/ۚ۬ᩳ;->ܽ(Ll/ۚ۬ᩳ;)V

    .line 263
    monitor-exit v0

    return-void

    .line 259
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid page reservation transfer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 263
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩸۬ᩳ;)V
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 365
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/֨۬ᩳ;->ۖ:Ll/ۖ۬ᩳ;

    invoke-virtual {v1}, Ll/ۖ۬ᩳ;->֫()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v3, p0, Ll/֨۬ᩳ;->ܺ:J

    sub-long/2addr v3, v1

    iput-wide v3, p0, Ll/֨۬ᩳ;->ܺ:J

    goto :goto_0

    .line 366
    :cond_0
    :goto_1
    invoke-direct {p0}, Ll/֨۬ᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 370
    :goto_2
    iget-object v2, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ۬ᩳ;

    .line 371
    iget-object v4, v3, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    iget-object v4, v4, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    if-ne v4, p1, :cond_2

    iget v4, v3, Ll/ᩴ۬ᩳ;->ܽ:I

    if-nez v4, :cond_3

    iget-boolean v3, v3, Ll/ᩴ۬ᩳ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_2

    .line 378
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    .line 383
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 384
    :cond_5
    iget-object v1, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 385
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 386
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ۬ᩳ;

    .line 387
    iget-object v3, v2, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    iget-object v4, v3, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    if-eq v4, p1, :cond_6

    goto :goto_3

    .line 388
    :cond_6
    iget v4, v2, Ll/ᩴ۬ᩳ;->ܽ:I

    if-nez v4, :cond_7

    iget-boolean v4, v2, Ll/ᩴ۬ᩳ;->֫:Z

    if-nez v4, :cond_7

    .line 389
    iget-wide v4, p0, Ll/֨۬ᩳ;->ܺ:J

    iget-wide v6, v3, Ll/۠۬ᩳ;->֫:J

    sub-long/2addr v4, v6

    iput-wide v4, p0, Ll/֨۬ᩳ;->ܺ:J

    const/4 v3, 0x0

    .line 390
    iput-object v3, v2, Ll/ᩴ۬ᩳ;->ۧ:Ll/ۧ۫ᩳ;

    .line 391
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    .line 388
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Text pages are still leased"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 393
    :cond_8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 382
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫([C)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 183
    :try_start_0
    array-length v1, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    .line 184
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/֨۬ᩳ;->ۖ:Ll/ۖ۬ᩳ;

    invoke-virtual {v1, p1}, Ll/ۖ۬ᩳ;->֫([C)Z

    move-result v1

    if-nez v1, :cond_1

    iget-wide v1, p0, Ll/֨۬ᩳ;->ܺ:J

    array-length p1, p1

    invoke-static {p1}, Ll/ۖ۬ᩳ;->ۧ(I)J

    move-result-wide v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/֨۬ᩳ;->ܺ:J

    .line 185
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(I)[C
    .locals 9

    if-ltz p1, :cond_7

    if-eqz p1, :cond_2

    const/16 v0, 0x2000

    if-le p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x10

    :goto_0
    if-ge v0, p1, :cond_1

    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    move v1, p1

    :goto_2
    if-nez v1, :cond_3

    .line 152
    sget-object p1, Ll/ۖ۬ᩳ;->ܿ:[C

    return-object p1

    :cond_3
    move-object v0, p0

    .line 154
    monitor-enter v0

    .line 155
    :try_start_0
    iget-object v2, p0, Ll/֨۬ᩳ;->ۖ:Ll/ۖ۬ᩳ;

    invoke-virtual {v2, v1}, Ll/ۖ۬ᩳ;->֫(I)[C

    move-result-object v2

    if-eqz v2, :cond_4

    .line 156
    monitor-exit v0

    return-object v2

    .line 157
    :cond_4
    invoke-static {v1}, Ll/ۖ۬ᩳ;->ۧ(I)J

    move-result-wide v2

    .line 158
    iget-wide v4, p0, Ll/֨۬ᩳ;->ܳ:J

    iget-wide v6, p0, Ll/֨۬ᩳ;->ܺ:J

    sub-long/2addr v4, v6

    cmp-long v8, v2, v4

    if-gtz v8, :cond_5

    .line 159
    new-instance v4, Ll/ۚ۬ᩳ;

    invoke-direct {v4, p0, v2, v3}, Ll/ۚ۬ᩳ;-><init>(Ll/֨۬ᩳ;J)V

    add-long/2addr v6, v2

    .line 160
    iput-wide v6, p0, Ll/֨۬ᩳ;->ܺ:J

    .line 161
    iget-wide v2, p0, Ll/֨۬ᩳ;->ۢ:J

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Ll/֨۬ᩳ;->ۢ:J

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    .line 163
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v4, :cond_6

    .line 166
    invoke-static {p1}, Ll/ۖ۬ᩳ;->ۧ(I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v4

    goto :goto_4

    :cond_6
    move p1, v1

    .line 169
    :goto_4
    :try_start_1
    new-array p1, p1, [C

    move-object v0, p0

    .line 170
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 172
    :try_start_2
    invoke-static {v4}, Ll/ۚ۬ᩳ;->ܽ(Ll/ۚ۬ᩳ;)V

    .line 173
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    invoke-virtual {v4}, Ll/ۚ۬ᩳ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 173
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    .line 176
    invoke-virtual {v4}, Ll/ۚ۬ᩳ;->close()V

    .line 177
    throw p1

    :catchall_2
    move-exception p1

    .line 163
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    .line 18
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative workspace length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/۠۬ᩳ;)V
    .locals 6

    .line 341
    iget-object v0, p1, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    if-ne v0, p0, :cond_2

    .line 342
    iget-wide v0, p1, Ll/۠۬ᩳ;->᩻:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    .line 343
    :try_start_0
    invoke-virtual {p0, p1}, Ll/֨۬ᩳ;->֫(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    :try_start_1
    iget-object v1, p1, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩵۬ᩳ;->֫()Ll/ۧ۫ᩳ;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 345
    :try_start_2
    invoke-virtual {v0}, Ll/᩵۬ᩳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 343
    :try_start_3
    invoke-virtual {v0}, Ll/᩵۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 346
    new-instance v0, Ljava/io/UncheckedIOException;

    invoke-direct {v0, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_0
    :goto_1
    move-object v0, p0

    .line 349
    monitor-enter v0

    .line 350
    :try_start_5
    iget-object v1, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ۬ᩳ;

    if-eqz v1, :cond_1

    .line 351
    iget v2, v1, Ll/ᩴ۬ᩳ;->ܽ:I

    if-nez v2, :cond_1

    iget-boolean v2, v1, Ll/ᩴ۬ᩳ;->֫:Z

    if-nez v2, :cond_1

    .line 352
    iget-object v2, p0, Ll/֨۬ᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    iget-wide v2, p0, Ll/֨۬ᩳ;->ܺ:J

    iget-wide v4, p1, Ll/۠۬ᩳ;->֫:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Ll/֨۬ᩳ;->ܺ:J

    const/4 p1, 0x0

    .line 354
    iput-object p1, v1, Ll/ᩴ۬ᩳ;->ۧ:Ll/ۧ۫ᩳ;

    .line 357
    :cond_1
    monitor-exit v0

    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    .line 341
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Page belongs to another cache"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()[B
    .locals 2

    .line 105
    iget-object v0, p0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Ll/֨۬ᩳ;->ᩳ:[B

    return-object v0

    .line 105
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recovery I/O lock is not held"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()J
    .locals 2

    .line 132
    iget-wide v0, p0, Ll/֨۬ᩳ;->ܳ:J

    return-wide v0
.end method

.method public final declared-synchronized ᩳ()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 124
    :try_start_0
    iget-wide v1, p0, Ll/֨۬ᩳ;->ܺ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
