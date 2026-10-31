.class public final Ll/᩷᩻᩻;
.super Ljava/lang/Object;
.source "07HC"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۖ:Z

.field public final ۘ:Ljava/lang/Object;

.field public final ۜ:I

.field public final ۡ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ۢ:Ljava/util/concurrent/LinkedBlockingQueue;

.field public ۧ:Ljava/lang/ThreadLocal;

.field public final ܳ:Ll/ۧۤᩴ;

.field public final ܺ:Ll/᩹ۢ᩻;

.field public ܽ:Ljava/util/concurrent/CountDownLatch;

.field public final ܿ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩳ:Ll/֫᩵ܿ;

.field public final ᩴ:Ll/ۗۢ᩻;

.field public ᩷:Ll/᩻᩻᩻;

.field public final ᩻:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ll/ۗۢ᩻;Ll/ۚ᩸ܿ;)V
    .locals 12

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩷᩻᩻;->ܿ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 53
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Ll/᩷᩻᩻;->ۢ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 55
    iput-object v0, p0, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    .line 57
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/᩷᩻᩻;->ܳ:Ll/ۧۤᩴ;

    .line 60
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/᩷᩻᩻;->ۡ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 61
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/᩷᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    .line 63
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩷᩻᩻;->ۘ:Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ll/᩷᩻᩻;->ۧ:Ljava/lang/ThreadLocal;

    .line 115
    iput-object p1, p0, Ll/᩷᩻᩻;->ᩴ:Ll/ۗۢ᩻;

    .line 116
    invoke-virtual {p1}, Ll/ۗۢ᩻;->ᩴ()I

    move-result v0

    iput v0, p0, Ll/᩷᩻᩻;->ۜ:I

    .line 139
    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۖ()Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-nez v8, :cond_0

    goto :goto_0

    .line 231
    :cond_0
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, "."

    .line 232
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 0
    invoke-static {v2, v1, v3}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 235
    :cond_1
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "["

    .line 236
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x2

    if-le v4, v5, :cond_2

    .line 0
    invoke-static {v2, v2, v3}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 239
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    move-object v0, v3

    :goto_0
    if-nez v0, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "://"

    .line 246
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_15

    const/16 v3, 0x2f

    .line 247
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_15

    const/16 v3, 0x3f

    .line 248
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_15

    const/16 v3, 0x23

    .line 249
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_15

    const-string v3, ".local"

    .line 214
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, ":"

    .line 217
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/16 v4, 0x39

    const/16 v5, 0x10

    const/16 v6, 0x30

    const/4 v7, 0x4

    if-eqz v3, :cond_c

    const/16 v2, 0x25

    .line 333
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-gez v2, :cond_15

    invoke-static {v0}, Ll/᩹᩺ܺ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_15

    const-string v2, "::1"

    .line 309
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto/16 :goto_4

    :cond_6
    const/16 v2, 0x3a

    .line 312
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-lez v2, :cond_15

    if-le v2, v7, :cond_7

    goto/16 :goto_5

    .line 316
    :cond_7
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 341
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_15

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v7, :cond_8

    goto/16 :goto_5

    :cond_8
    const/4 v2, 0x0

    .line 344
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_b

    .line 345
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v6, :cond_9

    if-le v3, v4, :cond_a

    :cond_9
    const/16 v7, 0x61

    if-lt v3, v7, :cond_15

    const/16 v7, 0x66

    if-gt v3, v7, :cond_15

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 321
    :cond_b
    :try_start_0
    invoke-static {v0, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const v2, 0xfe00

    and-int/2addr v2, v0

    const v3, 0xfc00

    if-eq v2, v3, :cond_14

    const v2, 0xffc0

    and-int/2addr v0, v2

    const v2, 0xfe80

    if-ne v0, v2, :cond_15

    goto/16 :goto_4

    :cond_c
    const-string v3, "\\."

    const/4 v9, -0x1

    .line 276
    invoke-virtual {v0, v3, v9}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 277
    array-length v3, v0

    if-eq v3, v7, :cond_d

    goto :goto_5

    :cond_d
    new-array v3, v7, [I

    const/4 v7, 0x0

    .line 281
    :goto_2
    array-length v9, v0

    if-ge v7, v9, :cond_11

    .line 282
    aget-object v9, v0, v7

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_5

    :cond_e
    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 286
    :goto_3
    aget-object v11, v0, v7

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v9, v11, :cond_10

    .line 287
    aget-object v11, v0, v7

    invoke-virtual {v11, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_15

    if-gt v11, v4, :cond_15

    mul-int/lit8 v10, v10, 0xa

    add-int/lit8 v11, v11, -0x30

    add-int/2addr v10, v11

    const/16 v11, 0xff

    if-le v10, v11, :cond_f

    goto :goto_5

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 296
    :cond_10
    aput v10, v3, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 298
    :cond_11
    aget v0, v3, v1

    const/16 v4, 0xa

    if-eq v0, v4, :cond_14

    const/16 v4, 0x7f

    if-eq v0, v4, :cond_14

    const/16 v4, 0xc0

    if-ne v0, v4, :cond_12

    aget v4, v3, v2

    const/16 v6, 0xa8

    if-eq v4, v6, :cond_14

    :cond_12
    const/16 v4, 0xac

    if-ne v0, v4, :cond_13

    aget v4, v3, v2

    if-lt v4, v5, :cond_13

    const/16 v5, 0x1f

    if-le v4, v5, :cond_14

    :cond_13
    const/16 v4, 0xa9

    if-ne v0, v4, :cond_15

    aget v0, v3, v2

    const/16 v2, 0xfe

    if-ne v0, v2, :cond_15

    :cond_14
    :goto_4
    const/4 v0, 0x1

    const/4 v3, 0x1

    goto :goto_6

    :catch_0
    :cond_15
    :goto_5
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 368
    :goto_6
    new-instance v0, Ll/᩹ۢ᩻;

    if-eqz v3, :cond_16

    const-wide/16 v4, 0x1f4

    goto :goto_7

    :cond_16
    const-wide/16 v4, 0x3e8

    :goto_7
    if-eqz v3, :cond_17

    const-wide/16 v6, 0x2

    goto :goto_8

    :cond_17
    const-wide/16 v6, 0x5

    :goto_8
    move-object v2, v0

    .line 370
    invoke-direct/range {v2 .. v8}, Ll/᩹ۢ᩻;-><init>(ZJJLjava/lang/String;)V

    .line 118
    iput-object v0, p0, Ll/᩷᩻᩻;->ܺ:Ll/᩹ۢ᩻;

    .line 119
    new-instance v0, Ll/ܿ᩻᩻;

    invoke-static {p2}, Ll/֫᩵ܿ;->֫(Ll/ۚ᩸ܿ;)Ll/֫᩵ܿ;

    move-result-object p2

    invoke-direct {v0, p0, p2}, Ll/ܿ᩻᩻;-><init>(Ll/᩷᩻᩻;Ll/֫᩵ܿ;)V

    iput-object v0, p0, Ll/᩷᩻᩻;->ᩳ:Ll/֫᩵ܿ;

    .line 127
    :try_start_1
    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۙ()Z

    move-result v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 130
    :catch_1
    iput-boolean v1, p0, Ll/᩷᩻᩻;->ۖ:Z

    return-void
.end method

.method public static ֫(Ll/᩷᩻᩻;)V
    .locals 7

    .line 301
    iget-object v1, p0, Ll/᩷᩻᩻;->ᩳ:Ll/֫᩵ܿ;

    .line 303
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Ll/֫᩵ܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_9

    .line 305
    iget-object v0, p0, Ll/᩷᩻᩻;->ۘ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 306
    :try_start_1
    invoke-direct {p0}, Ll/᩷᩻᩻;->ᩳ()Ll/ۡ᩻᩻;

    move-result-object v2

    if-nez v2, :cond_1

    .line 583
    iget-object v3, p0, Ll/᩷᩻᩻;->ۢ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 312
    monitor-exit v0

    goto/16 :goto_6

    .line 315
    :cond_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    if-nez v2, :cond_2

    const-wide/16 v2, 0x64

    .line 318
    :try_start_2
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    .line 325
    :cond_2
    iget-object v0, p0, Ll/᩷᩻᩻;->ܳ:Ll/ۧۤᩴ;

    iget-object v3, v2, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ۖ᩻᩻;

    if-nez v3, :cond_3

    .line 330
    iget-object v0, p0, Ll/᩷᩻᩻;->ۘ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 331
    :try_start_3
    iget-object v3, p0, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 332
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1

    .line 178
    :cond_3
    iget-object v0, v3, Ll/ۖ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 338
    :try_start_5
    iget-object v0, p0, Ll/᩷᩻᩻;->ᩴ:Ll/ۗۢ᩻;

    invoke-virtual {v2, v0, v3, v1}, Ll/ۡ᩻᩻;->֫(Ll/ۗۢ᩻;Ll/ۖ᩻᩻;Ll/֫᩵ܿ;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 351
    :try_start_6
    iget-object v0, p0, Ll/᩷᩻᩻;->ۘ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 352
    :try_start_7
    iget-object v4, p0, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 353
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 354
    :try_start_8
    invoke-virtual {v1}, Ll/֫᩵ܿ;->᩻()Z

    move-result v0

    invoke-virtual {v3, v2, v0}, Ll/ۖ᩻᩻;->֫(Ll/ۡ᩻᩻;Z)V

    iget-boolean v0, v3, Ll/ۖ᩻᩻;->ᩳ:Z

    if-eqz v0, :cond_0

    .line 357
    :goto_1
    iget-object v0, p0, Ll/᩷᩻᩻;->ܳ:Ll/ۧۤᩴ;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    goto :goto_4

    :catchall_1
    move-exception v1

    .line 353
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_2
    move-exception v0

    move-object v4, v0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 245
    :try_start_b
    iget-object v4, v3, Ll/ۖ᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_4
    const/4 v5, 0x0

    .line 0
    invoke-virtual {v4, v5, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 349
    :goto_2
    iget-object v4, p0, Ll/᩷᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_6
    invoke-virtual {v4, v5, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-eqz v6, :cond_6

    .line 351
    :goto_3
    :try_start_c
    iget-object v0, p0, Ll/᩷᩻᩻;->ۘ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 352
    :try_start_d
    iget-object v4, p0, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 353
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 354
    :try_start_e
    invoke-virtual {v1}, Ll/֫᩵ܿ;->᩻()Z

    move-result v0

    invoke-virtual {v3, v2, v0}, Ll/ۖ᩻᩻;->֫(Ll/ۡ᩻᩻;Z)V

    iget-boolean v0, v3, Ll/ۖ᩻᩻;->ᩳ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 357
    :goto_4
    iget-object v2, v2, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto/16 :goto_0

    :catchall_3
    move-exception v1

    .line 353
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :try_start_10
    throw v1

    .line 351
    :goto_5
    iget-object v0, p0, Ll/᩷᩻᩻;->ۘ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 352
    :try_start_11
    iget-object v5, p0, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 353
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 354
    :try_start_12
    invoke-virtual {v1}, Ll/֫᩵ܿ;->᩻()Z

    move-result v0

    invoke-virtual {v3, v2, v0}, Ll/ۖ᩻᩻;->֫(Ll/ۡ᩻᩻;Z)V

    iget-boolean v0, v3, Ll/ۖ᩻᩻;->ᩳ:Z

    if-eqz v0, :cond_8

    .line 357
    iget-object v0, p0, Ll/᩷᩻᩻;->ܳ:Ll/ۧۤᩴ;

    iget-object v1, v2, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    :cond_8
    throw v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :catchall_4
    move-exception v1

    .line 353
    :try_start_13
    monitor-exit v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    :try_start_14
    throw v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    :catchall_5
    move-exception v1

    .line 315
    :try_start_15
    monitor-exit v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    :try_start_16
    throw v1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 365
    :cond_9
    :goto_6
    iget-object p0, p0, Ll/᩷᩻᩻;->ܽ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :catchall_6
    move-exception v0

    iget-object p0, p0, Ll/᩷᩻᩻;->ܽ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 366
    throw v0
.end method

.method public static bridge synthetic ۧ(Ll/᩷᩻᩻;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩷᩻᩻;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻᩻;->ۡ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private ᩳ()Ll/ۡ᩻᩻;
    .locals 29

    move-object/from16 v1, p0

    .line 375
    iget-object v0, v1, Ll/᩷᩻᩻;->ۢ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩻᩻;

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 393
    :try_start_0
    iget-object v3, v1, Ll/᩷᩻᩻;->ܿ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v3

    .line 394
    iget-object v4, v0, Ll/ܳ᩻᩻;->᩻:Ljava/lang/String;

    iget-object v5, v0, Ll/ܳ᩻᩻;->᩷:Ll/ܶ᩵ܿ;

    const/16 v6, 0x2f

    .line 74
    invoke-virtual {v4, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v6

    if-ltz v6, :cond_0

    add-int/2addr v6, v2

    .line 75
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    :cond_0
    move-object v15, v4

    .line 396
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 397
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v11

    if-eqz v11, :cond_1

    .line 401
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ".downloading"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 402
    invoke-virtual {v5, v4}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 1147
    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v2

    move-object v10, v2

    goto :goto_0

    :cond_1
    move-object v10, v5

    :goto_0
    const-string v2, "rw"

    .line 406
    invoke-virtual {v10, v2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v2

    .line 407
    iget-wide v4, v0, Ll/ܳ᩻᩻;->֫:J

    invoke-virtual {v2, v4, v5}, Ll/᩻ۖܽ;->setLength(J)V

    .line 410
    new-instance v13, Ll/ۖ᩻᩻;

    iget-object v6, v0, Ll/ܳ᩻᩻;->ܳ:Ljava/lang/String;

    iget-object v8, v0, Ll/ܳ᩻᩻;->᩻:Ljava/lang/String;

    iget-object v9, v0, Ll/ܳ᩻᩻;->᩷:Ll/ܶ᩵ܿ;

    iget-wide v4, v0, Ll/ܳ᩻᩻;->֫:J

    move v14, v11

    iget-wide v11, v0, Ll/ܳ᩻᩻;->ۧ:J

    iget-object v7, v0, Ll/ܳ᩻᩻;->ۜ:Ljava/lang/Object;

    move-object/from16 v23, v2

    iget-object v2, v0, Ll/ܳ᩻᩻;->ܿ:Ll/ܿ᩵ܿ;

    move-object/from16 v18, v2

    iget-boolean v2, v0, Ll/ܳ᩻᩻;->ᩳ:Z

    move/from16 v19, v2

    iget-boolean v2, v0, Ll/ܳ᩻᩻;->ܽ:Z

    move-object/from16 v24, v0

    iget-object v0, v1, Ll/᩷᩻᩻;->ۧ:Ljava/lang/ThreadLocal;

    move-object/from16 v21, v0

    iget-object v0, v1, Ll/᩷᩻᩻;->᩷:Ll/᩻᩻᩻;

    move-wide/from16 v16, v4

    move-object v4, v13

    move v5, v3

    move-object/from16 v20, v7

    move-object v7, v15

    move-wide/from16 v25, v11

    move v11, v14

    move-object/from16 v12, v23

    move/from16 v27, v3

    move-object v3, v13

    move-wide/from16 v13, v16

    move-object/from16 v28, v15

    move-wide/from16 v15, v25

    move-object/from16 v17, v20

    move/from16 v20, v2

    move-object/from16 v22, v0

    invoke-direct/range {v4 .. v22}, Ll/ۖ᩻᩻;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;ZLl/᩻ۖܽ;JJLjava/lang/Object;Ll/ܿ᩵ܿ;ZZLjava/lang/ThreadLocal;Ll/᩻᩻᩻;)V

    .line 429
    iget-object v0, v1, Ll/᩷᩻᩻;->ܳ:Ll/ۧۤᩴ;

    move-object/from16 v2, v24

    iget-object v4, v2, Ll/ܳ᩻᩻;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    iget-object v0, v3, Ll/ۖ᩻᩻;->֡:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v7

    .line 433
    new-instance v0, Ll/ۡ᩻᩻;

    iget-object v8, v2, Ll/ܳ᩻᩻;->᩻:Ljava/lang/String;

    iget-wide v13, v2, Ll/ܳ᩻᩻;->֫:J

    const-wide/16 v11, 0x0

    move-object v4, v0

    move/from16 v5, v27

    move-object/from16 v6, v28

    move-wide v9, v13

    move-object/from16 v15, v23

    invoke-direct/range {v4 .. v15}, Ll/ۡ᩻᩻;-><init>(ILjava/lang/String;ILjava/lang/String;JJJLl/۠ۖܽ;)V

    .line 444
    iget-object v2, v1, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 459
    iget-object v2, v1, Ll/᩷᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_2
    const/4 v3, 0x0

    .line 0
    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_7

    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    goto/16 :goto_7

    .line 381
    :cond_4
    iget-boolean v0, v1, Ll/᩷᩻᩻;->ۖ:Z

    if-eqz v0, :cond_10

    .line 472
    iget-object v0, v1, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    move-object/from16 v16, v0

    monitor-enter v16

    .line 474
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 478
    iget-object v2, v1, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Ll/ۡ᩻᩻;

    .line 480
    iget-object v7, v1, Ll/᩷᩻᩻;->ܳ:Ll/ۧۤᩴ;

    iget-object v8, v9, Ll/ۡ᩻᩻;->᩻:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Ll/ۖ᩻᩻;

    if-eqz v10, :cond_6

    .line 266
    iget-object v7, v10, Ll/ۖ᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_5

    const/4 v7, 0x1

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_6

    goto :goto_1

    .line 183
    :cond_6
    iget-wide v7, v9, Ll/ۡ᩻᩻;->ۧ:J

    iget-object v11, v9, Ll/ۡ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v11

    sub-long v13, v7, v11

    .line 486
    iget-object v7, v9, Ll/ۡ᩻᩻;->ۜ:Ll/ۙ֡ܿ;

    invoke-virtual {v7}, Ll/ۙ֡ܿ;->֫()J

    move-result-wide v7

    const-wide/16 v17, 0x0

    long-to-double v11, v13

    const-wide/high16 v21, 0x4130000000000000L    # 1048576.0

    div-double v21, v11, v21

    const-wide/16 v19, 0x0

    cmp-long v15, v7, v19

    if-lez v15, :cond_7

    long-to-double v7, v7

    div-double v21, v11, v7

    goto :goto_3

    :cond_7
    const-wide/32 v7, 0x3200000

    cmp-long v11, v13, v7

    if-lez v11, :cond_8

    goto :goto_3

    :cond_8
    const-wide/high16 v21, -0x4010000000000000L    # -1.0

    :goto_3
    cmpg-double v7, v21, v17

    if-gez v7, :cond_9

    goto :goto_1

    .line 495
    :cond_9
    new-instance v7, Ll/ۜ᩻᩻;

    move-object v8, v7

    move-wide v11, v13

    move-wide/from16 v17, v13

    move-wide/from16 v13, v21

    invoke-direct/range {v8 .. v14}, Ll/ۜ᩻᩻;-><init>(Ll/ۡ᩻᩻;Ll/ۖ᩻᩻;JD)V

    .line 496
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-double v3, v3, v21

    add-long v5, v5, v17

    goto :goto_1

    :cond_a
    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    cmpl-double v2, v3, v9

    if-lez v2, :cond_d

    cmp-long v2, v5, v7

    if-lez v2, :cond_d

    .line 505
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۜ᩻᩻;

    .line 507
    iget-wide v11, v7, Ll/ۜ᩻᩻;->ۧ:D

    div-double/2addr v11, v3

    .line 510
    iget-wide v13, v7, Ll/ۜ᩻᩻;->֫:J

    long-to-double v13, v13

    move-wide/from16 v17, v3

    move-object v4, v2

    long-to-double v2, v5

    div-double/2addr v13, v2

    const-wide v2, 0x3fe6666666666666L    # 0.7

    mul-double v11, v11, v2

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double v13, v13, v2

    add-double v2, v13, v11

    cmpl-double v8, v2, v9

    if-lez v8, :cond_b

    move-wide v9, v2

    move-object v2, v7

    goto :goto_5

    :cond_b
    move-object v2, v4

    :goto_5
    move-wide/from16 v3, v17

    goto :goto_4

    :cond_c
    move-object v4, v2

    goto :goto_6

    :cond_d
    const/4 v2, 0x0

    .line 521
    :goto_6
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_10

    .line 524
    iget v0, v1, Ll/᩷᩻᩻;->ۜ:I

    iget-object v3, v1, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v0, v3

    if-gtz v0, :cond_e

    goto :goto_7

    .line 528
    :cond_e
    iget-object v3, v2, Ll/ۜ᩻᩻;->ܽ:Ll/ۡ᩻᩻;

    iget-object v2, v2, Ll/ۜ᩻᩻;->ᩳ:Ll/ۖ᩻᩻;

    iget-object v4, v1, Ll/᩷᩻᩻;->ܺ:Ll/᩹ۢ᩻;

    invoke-virtual {v3, v2, v0, v4}, Ll/ۡ᩻᩻;->֫(Ll/ۖ᩻᩻;ILl/᩹ۢ᩻;)Ll/ۡ᩻᩻;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 530
    iget-object v2, v1, Ll/᩷᩻᩻;->֫:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    return-object v0

    :catchall_0
    move-exception v0

    .line 521
    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_10
    :goto_7
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;JJLjava/lang/String;Ll/ܿ᩵ܿ;ZZ)V
    .locals 13

    .line 154
    new-instance v12, Ll/ܳ᩻᩻;

    move-object v0, v12

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ll/ܳ᩻᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;JJLjava/lang/Object;Ll/ܿ᩵ܿ;ZZ)V

    move-object v0, p0

    iget-object v1, v0, Ll/᩷᩻᩻;->ۢ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-interface {v1, v12}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩻᩻᩻;)V
    .locals 0

    .line 145
    iput-object p1, p0, Ll/᩷᩻᩻;->᩷:Ll/᩻᩻᩻;

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 291
    iget-object v0, p0, Ll/᩷᩻᩻;->ۡ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 6

    .line 273
    iget-object v0, p0, Ll/᩷᩻᩻;->ۡ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 275
    iget-object v0, p0, Ll/᩷᩻᩻;->ܳ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/ۖ᩻᩻;

    move-object v0, v4

    .line 0
    monitor-enter v0

    .line 335
    :try_start_0
    iget-boolean v1, v4, Ll/ۖ᩻᩻;->ᩳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 336
    monitor-exit v0

    goto :goto_0

    .line 338
    :cond_0
    :try_start_1
    iput-boolean v2, v4, Ll/ۖ᩻᩻;->ᩳ:Z

    .line 347
    iget-object v1, v4, Ll/ۖ᩻᩻;->ܺ:Ll/᩻ۖܽ;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 348
    :try_start_2
    iget-object v5, v4, Ll/ۖ᩻᩻;->ܺ:Ll/᩻ۖܽ;

    invoke-static {v5}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 349
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 384
    :try_start_3
    iget-object v1, v4, Ll/ۖ᩻᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 351
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 349
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1

    :cond_1
    return-void
.end method

.method public final ܽ()V
    .locals 4

    .line 184
    iget-object v0, p0, Ll/᩷᩻᩻;->ۢ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 200
    :cond_0
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    iget v1, p0, Ll/᩷᩻᩻;->ۜ:I

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ll/᩷᩻᩻;->ܽ:Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 205
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ᩳ᩻᩻;

    invoke-direct {v3, p0, v0}, Ll/ᩳ᩻᩻;-><init>(Ll/᩷᩻᩻;I)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 209
    :cond_1
    iget-object v0, p0, Ll/᩷᩻᩻;->ܽ:Ljava/util/concurrent/CountDownLatch;

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    iget-object v1, p0, Ll/᩷᩻᩻;->ᩳ:Ll/֫᩵ܿ;

    if-nez v0, :cond_2

    .line 210
    invoke-virtual {v1}, Ll/֫᩵ܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    invoke-virtual {p0}, Ll/᩷᩻᩻;->ۧ()V

    .line 216
    :cond_2
    invoke-virtual {v1}, Ll/֫᩵ܿ;->ۧ()V

    .line 228
    iget-object v0, p0, Ll/᩷᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    if-nez v0, :cond_3

    :goto_1
    return-void

    .line 261
    :cond_3
    throw v0
.end method
