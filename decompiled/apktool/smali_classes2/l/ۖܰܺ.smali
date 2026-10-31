.class public abstract Ll/ۖܰܺ;
.super Ll/᩺ܰܺ;
.source "O7SL"

# interfaces
.implements Ll/ۗܰܺ;


# static fields
.field public static final ۗ:Z

.field public static final ۙ:Ll/ܳܰܺ;

.field public static final ۫:Ll/ۙܰܺ;

.field public static final ۬:Ljava/lang/Object;


# instance fields
.field public volatile ᩶:Ll/ܺܰܺ;

.field public volatile ᩸:Ll/ۧܰܺ;

.field public volatile ᩹:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 277
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖܰܺ;->۬:Ljava/lang/Object;

    .line 284
    new-instance v0, Ll/ۙܰܺ;

    const-class v1, Ll/ܿܰܺ;

    invoke-direct {v0, v1}, Ll/ۙܰܺ;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ll/ۖܰܺ;->۫:Ll/ۙܰܺ;

    :try_start_0
    const-string v0, "guava.concurrent.generate_cancellation_cause"

    const-string v1, "false"

    .line 293
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 297
    :goto_0
    sput-boolean v0, Ll/ۖܰܺ;->ۗ:Z

    const-string v0, "java.runtime.name"

    const-string v1, ""

    .line 827
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "Android"

    .line 829
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 383
    :cond_0
    :try_start_1
    new-instance v0, Ll/᩻ܰܺ;

    .line 544
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 397
    :catch_1
    new-instance v0, Ll/ۜܰܺ;

    .line 544
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 350
    :cond_1
    :goto_1
    :try_start_2
    new-instance v0, Ll/ۡܰܺ;

    .line 544
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_2

    :goto_2
    move-object v2, v1

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    .line 355
    :goto_3
    :try_start_3
    new-instance v2, Ll/᩻ܰܺ;

    .line 544
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_5

    :catch_4
    move-exception v1

    goto :goto_4

    :catch_5
    move-exception v1

    .line 363
    :goto_4
    new-instance v2, Ll/ۜܰܺ;

    .line 544
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    :goto_5
    move-object v6, v2

    move-object v2, v0

    move-object v0, v6

    .line 400
    :goto_6
    sput-object v0, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    if-eqz v1, :cond_2

    .line 410
    sget-object v0, Ll/ۖܰܺ;->۫:Ll/ۙܰܺ;

    invoke-virtual {v0}, Ll/ۙܰܺ;->֫()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v5, "UnsafeAtomicHelper is broken!"

    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 411
    invoke-virtual {v0}, Ll/ۙܰܺ;->֫()Ljava/util/logging/Logger;

    move-result-object v0

    const-string v2, "AtomicReferenceFieldUpdaterAtomicHelper is broken!"

    .line 412
    invoke-virtual {v0, v4, v2, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 266
    invoke-direct {p0}, Ll/᩺ܰܺ;-><init>()V

    return-void
.end method

.method private ֫(Ll/ܺܰܺ;)V
    .locals 4

    const/4 v0, 0x0

    .line 508
    iput-object v0, p1, Ll/ܺܰܺ;->ۧ:Ljava/lang/Thread;

    .line 512
    :goto_0
    iget-object p1, p0, Ll/ۖܰܺ;->᩶:Ll/ܺܰܺ;

    .line 513
    sget-object v1, Ll/ܺܰܺ;->ܽ:Ll/ܺܰܺ;

    if-ne p1, v1, :cond_0

    goto :goto_3

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz p1, :cond_4

    .line 518
    iget-object v2, p1, Ll/ܺܰܺ;->֫:Ll/ܺܰܺ;

    .line 519
    iget-object v3, p1, Ll/ܺܰܺ;->ۧ:Ljava/lang/Thread;

    if-eqz v3, :cond_1

    move-object v1, p1

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    .line 522
    iput-object v2, v1, Ll/ܺܰܺ;->֫:Ll/ܺܰܺ;

    .line 523
    iget-object p1, v1, Ll/ܺܰܺ;->ۧ:Ljava/lang/Thread;

    if-nez p1, :cond_3

    goto :goto_0

    .line 485
    :cond_2
    sget-object v3, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v3, p0, p1, v2}, Ll/ܳܰܺ;->֫(Ll/ۖܰܺ;Ll/ܺܰܺ;Ll/ܺܰܺ;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    move-object p1, v2

    goto :goto_1

    :cond_4
    :goto_3
    return-void
.end method

.method public static ֫(Ll/ܺܰܺ;Ljava/lang/Thread;)V
    .locals 1

    .line 472
    sget-object v0, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v0, p0, p1}, Ll/ܳܰܺ;->֫(Ll/ܺܰܺ;Ljava/lang/Thread;)V

    return-void
.end method

.method public static ֫(Ll/ܺܰܺ;Ll/ܺܰܺ;)V
    .locals 1

    .line 477
    sget-object v0, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v0, p0, p1}, Ll/ܳܰܺ;->֫(Ll/ܺܰܺ;Ll/ܺܰܺ;)V

    return-void
.end method

.method public static ֫(Ll/ۖܰܺ;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 72
    sget-object v0, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܳܰܺ;->֫(Ll/ۖܰܺ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ll/ۖܰܺ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-virtual {p0, p1, p2, p3}, Ll/ۖܰܺ;->֫(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    .line 126
    sget-object v1, Ll/ܺܰܺ;->ܽ:Ll/ܺܰܺ;

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v5

    .line 128
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v7

    if-nez v7, :cond_16

    .line 131
    iget-object v7, v0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    if-eqz v7, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 311
    :goto_0
    instance-of v9, v7, Ll/ܰ᩺ܺ;

    xor-int/lit8 v9, v9, 0x1

    and-int/2addr v8, v9

    if-eqz v8, :cond_1

    .line 133
    invoke-static {v7}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-lez v9, :cond_2

    .line 136
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    add-long/2addr v9, v5

    goto :goto_1

    :cond_2
    move-wide v9, v7

    :goto_1
    const-wide/16 v11, 0x3e8

    cmp-long v13, v5, v11

    if-ltz v13, :cond_a

    .line 139
    iget-object v13, v0, Ll/ۖܰܺ;->᩶:Ll/ܺܰܺ;

    if-eq v13, v1, :cond_9

    .line 141
    new-instance v14, Ll/ܺܰܺ;

    invoke-direct {v14}, Ll/ܺܰܺ;-><init>()V

    .line 321
    :goto_2
    invoke-static {v14, v13}, Ll/ۖܰܺ;->֫(Ll/ܺܰܺ;Ll/ܺܰܺ;)V

    .line 485
    sget-object v15, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v15, v0, v13, v14}, Ll/ܳܰܺ;->֫(Ll/ۖܰܺ;Ll/ܺܰܺ;Ll/ܺܰܺ;)Z

    move-result v13

    if-eqz v13, :cond_7

    :cond_3
    const-wide v7, 0x1dcd64ffffffffffL    # 3.98785104510193E-165

    .line 39
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 148
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v1

    if-nez v1, :cond_6

    .line 155
    iget-object v1, v0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    if-eqz v1, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    .line 311
    :goto_3
    instance-of v6, v1, Ll/ܰ᩺ܺ;

    xor-int/lit8 v6, v6, 0x1

    and-int/2addr v5, v6

    if-eqz v5, :cond_5

    .line 157
    invoke-static {v1}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 161
    :cond_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long v5, v9, v5

    cmp-long v1, v5, v11

    if-gez v1, :cond_3

    .line 164
    invoke-direct {v0, v14}, Ll/ۖܰܺ;->֫(Ll/ܺܰܺ;)V

    goto :goto_5

    .line 149
    :cond_6
    invoke-direct {v0, v14}, Ll/ۖܰܺ;->֫(Ll/ܺܰܺ;)V

    .line 150
    new-instance v1, Ljava/lang/InterruptedException;

    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    .line 169
    :cond_7
    iget-object v13, v0, Ll/ۖܰܺ;->᩶:Ll/ܺܰܺ;

    if-ne v13, v1, :cond_8

    goto :goto_4

    :cond_8
    const-wide/16 v7, 0x0

    goto :goto_2

    .line 175
    :cond_9
    :goto_4
    iget-object v1, v0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_a
    :goto_5
    move-object v1, v0

    const-wide/16 v7, 0x0

    :goto_6
    cmp-long v13, v5, v7

    if-lez v13, :cond_e

    .line 180
    iget-object v5, v1, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    if-eqz v5, :cond_b

    const/4 v6, 0x1

    goto :goto_7

    :cond_b
    const/4 v6, 0x0

    .line 311
    :goto_7
    instance-of v13, v5, Ll/ܰ᩺ܺ;

    xor-int/lit8 v13, v13, 0x1

    and-int/2addr v6, v13

    if-eqz v6, :cond_c

    .line 182
    invoke-static {v5}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 184
    :cond_c
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v5

    if-nez v5, :cond_d

    .line 187
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long v5, v9, v5

    goto :goto_6

    .line 185
    :cond_d
    new-instance v1, Ljava/lang/InterruptedException;

    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    .line 190
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 191
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v14, "Waited "

    const-string v15, " "

    .line 0
    invoke-static {v14, v15, v2, v3}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 192
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-long v13, v5, v11

    cmp-long v3, v13, v7

    if-gez v3, :cond_14

    const-string v3, " (plus "

    .line 0
    invoke-static {v2, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    neg-long v5, v5

    .line 198
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v5, v6, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v13

    .line 199
    invoke-virtual {v4, v13, v14}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    sub-long/2addr v5, v3

    cmp-long v3, v13, v7

    if-eqz v3, :cond_10

    cmp-long v4, v5, v11

    if-lez v4, :cond_f

    goto :goto_8

    :cond_f
    const/4 v4, 0x0

    goto :goto_9

    :cond_10
    :goto_8
    const/4 v4, 0x1

    :goto_9
    if-lez v3, :cond_12

    .line 203
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v4, :cond_11

    const-string v3, ","

    .line 0
    invoke-static {v2, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_11
    invoke-static {v2, v15}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_12
    if-eqz v4, :cond_13

    .line 210
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " nanoseconds "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_13
    const-string v3, "delay)"

    .line 0
    invoke-static {v2, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 218
    :cond_14
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    if-eqz v1, :cond_15

    .line 219
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    const-string v3, " but future completed as timeout expired"

    .line 0
    invoke-static {v2, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 219
    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 221
    :cond_15
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    const-string v3, " for "

    .line 0
    invoke-static {v2, v3, v9}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 221
    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 129
    :cond_16
    new-instance v1, Ljava/lang/InterruptedException;

    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1
.end method

.method public final ֫(Ll/ۧܰܺ;)Ll/ۧܰܺ;
    .locals 1

    .line 64
    sget-object v0, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v0, p0, p1}, Ll/ܳܰܺ;->֫(Ll/ۖܰܺ;Ll/ۧܰܺ;)Ll/ۧܰܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۧܰܺ;Ll/ۧܰܺ;)Z
    .locals 1

    .line 56
    sget-object v0, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ܳܰܺ;->֫(Ll/ۖܰܺ;Ll/ۧܰܺ;Ll/ۧܰܺ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 4

    .line 227
    sget-object v0, Ll/ܺܰܺ;->ܽ:Ll/ܺܰܺ;

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v1

    if-nez v1, :cond_8

    .line 230
    iget-object v1, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 311
    :goto_0
    instance-of v3, v1, Ll/ܰ᩺ܺ;

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v2, v3

    if-eqz v2, :cond_1

    .line 232
    invoke-static {v1}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 234
    :cond_1
    iget-object v1, p0, Ll/ۖܰܺ;->᩶:Ll/ܺܰܺ;

    if-eq v1, v0, :cond_7

    .line 236
    new-instance v2, Ll/ܺܰܺ;

    invoke-direct {v2}, Ll/ܺܰܺ;-><init>()V

    .line 321
    :cond_2
    invoke-static {v2, v1}, Ll/ۖܰܺ;->֫(Ll/ܺܰܺ;Ll/ܺܰܺ;)V

    .line 485
    sget-object v3, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v3, p0, v1, v2}, Ll/ܳܰܺ;->֫(Ll/ۖܰܺ;Ll/ܺܰܺ;Ll/ܺܰܺ;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 242
    :cond_3
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 244
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 250
    iget-object v0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    .line 311
    :goto_1
    instance-of v3, v0, Ll/ܰ᩺ܺ;

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v1, v3

    if-eqz v1, :cond_3

    .line 252
    invoke-static {v0}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 245
    :cond_5
    invoke-direct {p0, v2}, Ll/ۖܰܺ;->֫(Ll/ܺܰܺ;)V

    .line 246
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 256
    :cond_6
    iget-object v1, p0, Ll/ۖܰܺ;->᩶:Ll/ܺܰܺ;

    if-ne v1, v0, :cond_2

    .line 262
    :cond_7
    iget-object v0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 228
    :cond_8
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public final ܽ()V
    .locals 3

    .line 493
    sget-object v0, Ll/ۖܰܺ;->ۙ:Ll/ܳܰܺ;

    invoke-virtual {v0, p0}, Ll/ܳܰܺ;->֫(Ll/ۖܰܺ;)Ll/ܺܰܺ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 328
    iget-object v1, v0, Ll/ܺܰܺ;->ۧ:Ljava/lang/Thread;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 330
    iput-object v2, v0, Ll/ܺܰܺ;->ۧ:Ljava/lang/Thread;

    .line 331
    invoke-static {v1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 88
    :cond_0
    iget-object v0, v0, Ll/ܺܰܺ;->֫:Ll/ܺܰܺ;

    goto :goto_0

    :cond_1
    return-void
.end method
