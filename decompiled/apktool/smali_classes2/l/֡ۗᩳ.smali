.class public final Ll/֡ۗᩳ;
.super Ljava/lang/Object;
.source "56TX"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֫֫:Z

.field public volatile ۗ:Ll/ۨ᩶ᩳ;

.field public final ۙ:I

.field public ۛ:Ll/ۘۙᩳ;

.field public ۟:Z

.field public ۤ:Ll/ۚ۬ᩳ;

.field public final ۧ֫:Ll/᩻۬ᩳ;

.field public ۨ:Ll/ܶ۬ᩳ;

.field public ۫:Ll/ᩴۙᩳ;

.field public volatile ۬:Ljava/lang/Throwable;

.field public final ܰ:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ܽ֫:Ll/᩷۬ᩳ;

.field public ܿ֫:Z

.field public final ᩳ֫:Ll/᩸۬ᩳ;

.field public volatile ᩶:Ll/ۚۙᩳ;

.field public ᩸:[C

.field public volatile ᩹:Z

.field public ᩺:Ll/ᩴۗᩳ;


# direct methods
.method public constructor <init>(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;Ll/ۚۙᩳ;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 64
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    .line 65
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/֡ۗᩳ;->ܽ֫:Ll/᩷۬ᩳ;

    const p2, 0x7fffffff

    .line 67
    iput p2, p0, Ll/֡ۗᩳ;->ۙ:I

    if-nez p3, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 68
    :goto_0
    iput-boolean p2, p0, Ll/֡ۗᩳ;->֫֫:Z

    .line 69
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ۤ()Ll/᩸۬ᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    .line 70
    :try_start_0
    invoke-virtual {p1, p0, p3}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;Ll/ۚۙᩳ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 71
    :goto_1
    iget-object p2, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {p2}, Ll/᩸۬ᩳ;->᩻()V

    throw p1
.end method

.method private ֫(II)I
    .locals 5

    const/4 v0, 0x0

    :cond_0
    if-ge v0, p2, :cond_2

    .line 271
    iget-boolean v1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez v1, :cond_2

    const/16 v1, 0x400

    sub-int v2, p2, v0

    .line 272
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 273
    iget-object v2, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    iget-object v3, p0, Ll/֡ۗᩳ;->᩸:[C

    add-int v4, p1, v0

    invoke-virtual {v2, v3, v4, v1}, Ll/ۘۙᩳ;->read([CII)I

    move-result v2

    if-lez v2, :cond_1

    add-int/2addr v0, v2

    :cond_1
    if-ge v2, v1, :cond_0

    :cond_2
    return v0
.end method

.method public static ֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;)Ll/֡ۗᩳ;
    .locals 2

    .line 60
    new-instance v0, Ll/֡ۗᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/֡ۗᩳ;-><init>(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;Ll/ۚۙᩳ;)V

    return-object v0
.end method

.method public static ֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;Ljava/nio/charset/Charset;)Ll/֡ۗᩳ;
    .locals 17

    .line 43
    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->ۤ()Ll/᩸۬ᩳ;

    move-result-object v1

    .line 46
    :try_start_0
    iget-object v0, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v0}, Ll/֨۬ᩳ;->ܽ()J

    move-result-wide v2

    const-wide/16 v4, 0x20

    div-long/2addr v2, v4

    const v0, 0x8000

    const v9, 0x8000

    :goto_0
    const/16 v0, 0x400

    if-le v9, v0, :cond_0

    int-to-long v4, v9

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    .line 48
    div-int/lit8 v9, v9, 0x2

    goto :goto_0

    .line 54
    :cond_0
    invoke-static/range {p1 .. p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, Ll/᩷۬ᩳ;->identity()Ll/ۜ۬ᩳ;

    move-result-object v7

    invoke-static/range {p2 .. p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v8

    .line 61
    new-instance v0, Ll/ۚۙᩳ;

    sget-object v5, Ll/֡ۙᩳ;->۬:Ll/֡ۙᩳ;

    sget-object v6, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    const/16 v2, 0x20

    new-array v14, v2, [B

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v16}, Ll/ۚۙᩳ;-><init>(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ll/ۜ۬ᩳ;Ljava/lang/String;IJJ[BIZ)V

    .line 55
    new-instance v2, Ll/֡ۗᩳ;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v2, v3, v4, v0}, Ll/֡ۗᩳ;-><init>(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;Ll/ۚۙᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    return-object v2

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0
.end method

.method public static ֫(Ll/֡ۗᩳ;Ll/ᩴۗᩳ;Ll/֨ۙᩳ;)Ll/ۚۙᩳ;
    .locals 8

    if-eqz p2, :cond_0

    .line 165
    iget-object v0, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    invoke-interface {p2, v0}, Ll/֨ۙᩳ;->֫(Ll/᩻۬ᩳ;)V

    .line 166
    :cond_0
    iget-object v0, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v0, p0}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;)V

    .line 158
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 168
    iget-object v0, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    if-ne v0, p1, :cond_12

    invoke-static {p1}, Ll/ᩴۗᩳ;->ۧ(Ll/ᩴۗᩳ;)Ll/֡ۗᩳ;

    move-result-object v0

    if-ne v0, p0, :cond_12

    const/4 v0, 0x0

    .line 173
    :try_start_0
    iget-boolean v1, p0, Ll/֡ۗᩳ;->۟:Z

    if-nez v1, :cond_6

    iget-boolean v1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez v1, :cond_6

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_1

    :cond_1
    if-nez p2, :cond_2

    .line 175
    iget-object v2, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    iget-object v4, p0, Ll/֡ۗᩳ;->᩸:[C

    invoke-static {p1}, Ll/ᩴۗᩳ;->֫(Ll/ᩴۗᩳ;)I

    move-result v5

    invoke-static {p1}, Ll/ᩴۗᩳ;->ܽ(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;

    move-result-object v6

    iget v7, p0, Ll/֡ۗᩳ;->ۙ:I

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;I)Z

    move-result p2

    goto :goto_0

    .line 176
    :cond_2
    iget-object v2, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    iget-object v4, p0, Ll/֡ۗᩳ;->᩸:[C

    invoke-static {p1}, Ll/ᩴۗᩳ;->֫(Ll/ᩴۗᩳ;)I

    move-result v5

    invoke-static {p1}, Ll/ᩴۗᩳ;->ܽ(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;

    move-result-object v6

    iget v7, p0, Ll/֡ۗᩳ;->ۙ:I

    move-object v1, p2

    move-object v3, p0

    invoke-interface/range {v1 .. v7}, Ll/֨ۙᩳ;->֫(Ll/᩻۬ᩳ;Ll/֡ۗᩳ;[CILl/ۚۙᩳ;I)Z

    move-result p2

    :goto_0
    if-nez p2, :cond_3

    .line 177
    iget-boolean p2, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p2, :cond_3

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 178
    sget-object p2, Ll/֡ۙᩳ;->ۗ:Ll/֡ۙᩳ;

    sget-object v1, Ll/᩵ۙᩳ;->᩶:Ll/᩵ۙᩳ;

    invoke-direct {p0, p2, v1, v0}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 188
    :cond_3
    invoke-static {p1}, Ll/ᩴۗᩳ;->ᩳ(Ll/ᩴۗᩳ;)V

    .line 189
    iget-object p2, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    if-ne p2, p1, :cond_4

    iput-object v0, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    .line 190
    :cond_4
    :try_start_1
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_5

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_e

    :cond_5
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    .line 191
    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :catchall_1
    move-exception p2

    goto/16 :goto_6

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_2

    :catch_2
    move-exception p2

    goto :goto_3

    :catch_3
    move-exception p2

    goto :goto_4

    .line 173
    :cond_6
    :goto_1
    :try_start_2
    iget-object p2, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;
    :try_end_2
    .catch Ljava/io/UncheckedIOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    invoke-static {p1}, Ll/ᩴۗᩳ;->ᩳ(Ll/ᩴۗᩳ;)V

    .line 189
    iget-object v1, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    if-ne v1, p1, :cond_7

    iput-object v0, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    .line 190
    :cond_7
    :try_start_3
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_8

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_9

    :cond_8
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 191
    :cond_9
    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object p2

    :catchall_2
    move-exception p1

    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 185
    :goto_2
    :try_start_4
    sget-object v1, Ll/֡ۙᩳ;->ۙ:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->ۙ:Ll/᩵ۙᩳ;

    invoke-direct {p0, v1, v2, p2}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V

    .line 186
    throw p2

    .line 183
    :goto_3
    sget-object v1, Ll/֡ۙᩳ;->ۗ:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->᩹:Ll/᩵ۙᩳ;

    invoke-direct {p0, v1, v2, p2}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 188
    invoke-static {p1}, Ll/ᩴۗᩳ;->ᩳ(Ll/ᩴۗᩳ;)V

    .line 189
    iget-object p2, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    if-ne p2, p1, :cond_a

    iput-object v0, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    .line 190
    :cond_a
    :try_start_5
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_b

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_e

    :cond_b
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception p1

    .line 191
    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 181
    :goto_4
    :try_start_6
    sget-object v1, Ll/֡ۙᩳ;->ۙ:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->ۙ:Ll/᩵ۙᩳ;

    invoke-direct {p0, v1, v2, p2}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 188
    invoke-static {p1}, Ll/ᩴۗᩳ;->ᩳ(Ll/ᩴۗᩳ;)V

    .line 189
    iget-object p2, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    if-ne p2, p1, :cond_c

    iput-object v0, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    .line 190
    :cond_c
    :try_start_7
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_d

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_e

    :cond_d
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 191
    :cond_e
    :goto_5
    iget-object p1, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 193
    iget-object p0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    return-object p0

    :catchall_4
    move-exception p1

    .line 191
    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 188
    :goto_6
    invoke-static {p1}, Ll/ᩴۗᩳ;->ᩳ(Ll/ᩴۗᩳ;)V

    .line 189
    iget-object v1, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    if-ne v1, p1, :cond_f

    iput-object v0, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    .line 190
    :cond_f
    :try_start_8
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_10

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_11

    :cond_10
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 191
    :cond_11
    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 192
    throw p2

    :catchall_5
    move-exception p1

    .line 191
    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 169
    :cond_12
    iget-object p0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 170
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Text batch is not pending"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 159
    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Text load operation is already running"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    .locals 1

    if-eqz p3, :cond_0

    .line 297
    iput-object p3, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    .line 298
    :cond_0
    iget-object p3, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    iget-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z

    if-eqz v0, :cond_1

    sget-object p1, Ll/֡ۙᩳ;->᩹:Ll/֡ۙᩳ;

    :cond_1
    iget-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z

    if-eqz v0, :cond_2

    sget-object p2, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    :cond_2
    invoke-virtual {p3, p0, p1, p2}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)V

    return-void
.end method

.method private ۖ()V
    .locals 3

    .line 236
    iget-boolean v0, p0, Ll/֡ۗᩳ;->֫֫:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜ۬ᩳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 237
    :cond_0
    new-instance v0, Ll/᩵ۗᩳ;

    sget-object v1, Ll/᩵ۙᩳ;->ۤ:Ll/᩵ۙᩳ;

    const-string v2, "Text source cannot be reopened"

    invoke-direct {v0, v1, v2}, Ll/᩵ۗᩳ;-><init>(Ll/᩵ۙᩳ;Ljava/lang/String;)V

    throw v0

    .line 239
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->֫()I

    move-result v1

    invoke-direct {p0, v1}, Ll/֡ۗᩳ;->ܽ(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    .line 240
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->֫()I

    move-result v0

    new-array v0, v0, [C

    iput-object v0, p0, Ll/֡ۗᩳ;->᩸:[C

    .line 241
    new-instance v0, Ll/ᩴۙᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->֫()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ᩴۙᩳ;-><init>(I)V

    iput-object v0, p0, Ll/֡ۗᩳ;->۫:Ll/ᩴۙᩳ;

    .line 242
    iget-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z

    if-eqz v0, :cond_2

    goto :goto_1

    .line 243
    :cond_2
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    .line 244
    iget-object v1, p0, Ll/֡ۗᩳ;->ܽ֫:Ll/᩷۬ᩳ;

    invoke-interface {v1}, Ll/᩷۬ᩳ;->֫()Ljava/io/InputStream;

    move-result-object v1

    .line 246
    iget-object v2, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    iget-object v2, v2, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-static {v1, v0, v2}, Ll/ۨ᩶ᩳ;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;)Ll/ۨ᩶ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۗᩳ;->ۗ:Ll/ۨ᩶ᩳ;

    .line 247
    iget-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z

    if-eqz v0, :cond_3

    :goto_1
    return-void

    .line 248
    :cond_3
    new-instance v0, Ll/ۘۙᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ۗ:Ll/ۨ᩶ᩳ;

    invoke-direct {v0, v1}, Ll/ۘۙᩳ;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    return-void
.end method

.method private ۘ()V
    .locals 4

    .line 339
    iget-boolean v0, p0, Ll/֡ۗᩳ;->۟:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x1

    .line 340
    iput-boolean v0, p0, Ll/֡ۗᩳ;->۟:Z

    .line 341
    iget-object v0, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 342
    invoke-static {v0}, Ll/ᩴۗᩳ;->ᩳ(Ll/ᩴۗᩳ;)V

    .line 343
    iput-object v1, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    .line 346
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/֡ۗᩳ;->ۗ:Ll/ۨ᩶ᩳ;

    .line 347
    iput-object v1, p0, Ll/֡ۗᩳ;->ۗ:Ll/ۨ᩶ᩳ;

    if-eqz v0, :cond_2

    .line 348
    invoke-virtual {v0}, Ll/ۨ᩶ᩳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 351
    :cond_2
    iput-object v1, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    .line 352
    iput-object v1, p0, Ll/֡ۗᩳ;->᩸:[C

    .line 353
    iput-object v1, p0, Ll/֡ۗᩳ;->۫:Ll/ᩴۙᩳ;

    .line 314
    :try_start_1
    iget-object v0, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    .line 315
    iput-object v1, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    if-eqz v0, :cond_3

    .line 316
    invoke-virtual {v0}, Ll/ܶ۬ᩳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 359
    :cond_3
    :try_start_2
    iget-object v0, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 356
    :try_start_3
    iget-object v2, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    if-nez v2, :cond_4

    iput-object v0, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    goto :goto_0

    .line 357
    :cond_4
    iget-object v2, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    if-eq v2, v0, :cond_5

    iget-object v2, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 359
    :cond_5
    :goto_0
    :try_start_4
    iget-object v0, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    .line 359
    :goto_1
    :try_start_5
    iget-object v2, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 360
    :cond_6
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    .line 361
    throw v0

    :catchall_3
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    :catchall_4
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    .line 349
    :try_start_6
    iput-object v0, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 351
    iput-object v1, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    .line 352
    iput-object v1, p0, Ll/֡ۗᩳ;->᩸:[C

    .line 353
    iput-object v1, p0, Ll/֡ۗᩳ;->۫:Ll/ᩴۙᩳ;

    .line 314
    :try_start_7
    iget-object v0, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    .line 315
    iput-object v1, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    if-eqz v0, :cond_7

    .line 316
    invoke-virtual {v0}, Ll/ܶ۬ᩳ;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 359
    :cond_7
    :try_start_8
    iget-object v0, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    :catchall_6
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    .line 356
    :try_start_9
    iget-object v2, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    if-nez v2, :cond_8

    iput-object v0, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    goto :goto_2

    .line 357
    :cond_8
    iget-object v2, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    if-eq v2, v0, :cond_9

    iget-object v2, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 359
    :cond_9
    :goto_2
    :try_start_a
    iget-object v0, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 360
    :cond_a
    :goto_3
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v0, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :goto_4
    return-void

    :catchall_7
    move-exception v0

    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    .line 359
    :goto_5
    :try_start_b
    iget-object v2, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 360
    :cond_b
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    .line 361
    throw v0

    :catchall_8
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    .line 351
    :goto_6
    iput-object v1, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    .line 352
    iput-object v1, p0, Ll/֡ۗᩳ;->᩸:[C

    .line 353
    iput-object v1, p0, Ll/֡ۗᩳ;->۫:Ll/ᩴۙᩳ;

    .line 314
    :try_start_c
    iget-object v2, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    .line 315
    iput-object v1, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    if-eqz v2, :cond_c

    .line 316
    invoke-virtual {v2}, Ll/ܶ۬ᩳ;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 359
    :cond_c
    :try_start_d
    iget-object v2, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    goto :goto_8

    :catchall_9
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    :catchall_a
    move-exception v0

    goto :goto_9

    :catch_3
    move-exception v2

    .line 356
    :try_start_e
    iget-object v3, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    if-nez v3, :cond_d

    iput-object v2, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    goto :goto_7

    .line 357
    :cond_d
    iget-object v3, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    if-eq v3, v2, :cond_e

    iget-object v3, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 359
    :cond_e
    :goto_7
    :try_start_f
    iget-object v2, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 360
    :cond_f
    :goto_8
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    .line 362
    throw v0

    :catchall_b
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    .line 359
    :goto_9
    :try_start_10
    iget-object v2, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    .line 360
    :cond_10
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    .line 361
    throw v0

    :catchall_c
    move-exception v0

    .line 360
    iput-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iget-object v1, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0
.end method

.method private ۧ(I)V
    .locals 3

    .line 253
    iget-object v0, p0, Ll/֡ۗᩳ;->᩸:[C

    array-length v0, v0

    if-gt p1, v0, :cond_0

    goto :goto_1

    .line 255
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-direct {p0, p1}, Ll/֡ۗᩳ;->ܽ(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0
    :try_end_0
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_2

    .line 258
    :try_start_1
    new-array p1, p1, [C

    .line 259
    iget-object v1, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V

    iput-object v0, p0, Ll/֡ۗᩳ;->ۤ:Ll/ۚ۬ᩳ;

    iput-object p1, p0, Ll/֡ۗᩳ;->᩸:[C
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 260
    :goto_0
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    throw p1

    :catch_2
    :goto_1
    return-void
.end method

.method private ܽ(I)J
    .locals 6

    .line 264
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->֫()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x3b

    and-int/lit8 v0, v0, -0x8

    add-int/lit16 v0, v0, 0x100

    int-to-long v0, v0

    const-wide/16 v2, 0x200

    add-long/2addr v0, v2

    int-to-long v2, p1

    const-wide/16 v4, 0x2

    mul-long v2, v2, v4

    const-wide/16 v4, 0x17

    add-long/2addr v2, v4

    const-wide/16 v4, -0x8

    and-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private ᩴ()Z
    .locals 2

    .line 233
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->ܺ()Ll/֡ۙᩳ;

    move-result-object v0

    sget-object v1, Ll/֡ۙᩳ;->۬:Ll/֡ۙᩳ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ᩵()V
    .locals 9

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 282
    iget-object v1, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->᩷()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    :goto_0
    cmp-long v5, v3, v1

    if-gez v5, :cond_3

    .line 284
    iget-boolean v5, p0, Ll/֡ۗᩳ;->᩹:Z

    if-eqz v5, :cond_0

    goto :goto_1

    .line 285
    :cond_0
    iget-object v5, p0, Ll/֡ۗᩳ;->᩸:[C

    array-length v5, v5

    const/4 v6, 0x0

    invoke-direct {p0, v6, v5}, Ll/֡ۗᩳ;->֫(II)I

    move-result v5

    .line 286
    iget-boolean v7, p0, Ll/֡ۗᩳ;->᩹:Z

    if-eqz v7, :cond_1

    goto :goto_1

    .line 287
    :cond_1
    iget-object v7, p0, Ll/֡ۗᩳ;->᩸:[C

    array-length v8, v7

    if-ne v5, v8, :cond_2

    .line 288
    iget-object v8, p0, Ll/֡ۗᩳ;->۫:Ll/ᩴۙᩳ;

    .line 27
    invoke-virtual {v8, v0, v6, v5, v7}, Ll/ᩴۙᩳ;->֫([BII[C)[B

    move-result-object v0

    .line 283
    iget-object v5, p0, Ll/֡ۗᩳ;->᩸:[C

    array-length v5, v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    goto :goto_0

    .line 287
    :cond_2
    new-instance v0, Ll/᩵ۗᩳ;

    sget-object v1, Ll/᩵ۙᩳ;->۬:Ll/᩵ۙᩳ;

    const-string v2, "Text source prefix is truncated"

    invoke-direct {v0, v1, v2}, Ll/᩵ۗᩳ;-><init>(Ll/᩵ۙᩳ;Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_3
    iget-object v1, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->ۜ()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    invoke-virtual {v0}, Ll/ۘۙᩳ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->ܳ()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    .line 291
    invoke-virtual {v0}, Ll/ۘۙᩳ;->ܽ()Z

    move-result v0

    iget-object v1, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->᩻()Z

    move-result v1

    if-ne v0, v1, :cond_4

    :goto_1
    return-void

    .line 292
    :cond_4
    new-instance v0, Ll/᩵ۗᩳ;

    sget-object v1, Ll/᩵ۙᩳ;->۬:Ll/᩵ۙᩳ;

    const-string v2, "Text source prefix does not match checkpoint"

    invoke-direct {v0, v1, v2}, Ll/᩵ۗᩳ;-><init>(Ll/᩵ۙᩳ;Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 367
    invoke-virtual {p0}, Ll/֡ۗᩳ;->ܽ()V

    return-void
.end method

.method public final ֫(I)Ll/ᩴۗᩳ;
    .locals 10

    const/4 v0, 0x1

    if-lt p1, v0, :cond_21

    const/high16 v1, 0x10000

    if-gt p1, v1, :cond_21

    .line 98
    iget-object v1, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v1, p0}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;)V

    .line 158
    iget-object v1, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v2

    if-nez v2, :cond_20

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v1

    if-eqz v1, :cond_20

    .line 100
    iget-object v1, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;

    if-nez v1, :cond_1f

    const/4 v1, 0x0

    .line 105
    :try_start_0
    iget-boolean v2, p0, Ll/֡ۗᩳ;->۟:Z

    if-nez v2, :cond_16

    iget-boolean v2, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez v2, :cond_16

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 106
    :cond_0
    iget-boolean v2, p0, Ll/֡ۗᩳ;->ܿ֫:Z

    if-nez v2, :cond_7

    .line 107
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۖ()V

    .line 108
    iget-boolean v2, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez v2, :cond_5

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 109
    :cond_1
    invoke-direct {p0}, Ll/֡ۗᩳ;->᩵()V

    .line 110
    iget-boolean v2, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez v2, :cond_3

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 111
    :cond_2
    iput-boolean v0, p0, Ll/֡ۗᩳ;->ܿ֫:Z
    :try_end_0
    .catch Ll/᩵ۗᩳ; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    goto :goto_2

    .line 151
    :cond_3
    :goto_0
    :try_start_1
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_4

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_18

    :cond_4
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 151
    :cond_5
    :goto_1
    :try_start_2
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_6

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_18

    :cond_6
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_4

    :catchall_1
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 113
    :cond_7
    :goto_2
    :try_start_3
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->֫()I

    move-result v0

    int-to-long v2, p1

    .line 115
    iget-object v4, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    iget-object v4, v4, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v4}, Ll/֨۬ᩳ;->ܽ()J

    move-result-wide v4

    const-wide/16 v6, 0x10

    div-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    .line 116
    div-int/2addr v3, v0

    mul-int v3, v3, v0

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 117
    invoke-direct {p0, v2}, Ll/֡ۗᩳ;->ۧ(I)V

    .line 118
    iget-object v2, p0, Ll/֡ۗᩳ;->᩸:[C

    array-length v2, v2

    div-int/2addr p1, v0

    mul-int p1, p1, v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 121
    iget-object v2, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v2}, Ll/ۚۙᩳ;->ۜ()[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_8
    if-ge v3, p1, :cond_f

    .line 123
    iget-boolean v5, p0, Ll/֡ۗᩳ;->᩹:Z
    :try_end_3
    .catch Ll/᩵ۗᩳ; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/io/UncheckedIOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    if-eqz v5, :cond_a

    .line 151
    :try_start_4
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_9

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_18

    :cond_9
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto/16 :goto_4

    :catchall_2
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 124
    :cond_a
    :try_start_5
    invoke-direct {p0, v3, v0}, Ll/֡ۗᩳ;->֫(II)I

    move-result v5

    .line 125
    iget-boolean v6, p0, Ll/֡ۗᩳ;->᩹:Z
    :try_end_5
    .catch Ll/᩵ۗᩳ; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/UncheckedIOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    if-eqz v6, :cond_c

    .line 151
    :try_start_6
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_b

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_18

    :cond_b
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto/16 :goto_4

    :catchall_3
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_c
    if-ge v5, v0, :cond_d

    const/4 v4, 0x1

    :cond_d
    if-lez v5, :cond_e

    .line 128
    :try_start_7
    iget-object v6, p0, Ll/֡ۗᩳ;->۫:Ll/ᩴۙᩳ;

    iget-object v7, p0, Ll/֡ۗᩳ;->᩸:[C

    invoke-virtual {v6, v2, v3, v5, v7}, Ll/ᩴۙᩳ;->֫([BII[C)[B

    move-result-object v2

    add-int/2addr v3, v5

    :cond_e
    if-eqz v4, :cond_8

    :cond_f
    move-object v6, v2

    move p1, v3

    move v9, v4

    .line 133
    iget-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z
    :try_end_7
    .catch Ll/᩵ۗᩳ; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/io/UncheckedIOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    if-eqz v0, :cond_11

    .line 151
    :try_start_8
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_10

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_18

    :cond_10
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto/16 :goto_4

    :catchall_4
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 134
    :cond_11
    :try_start_9
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->᩷()J

    move-result-wide v2

    const-wide v4, 0x7fffffffffffffffL

    int-to-long v7, p1

    sub-long/2addr v4, v7

    cmp-long v0, v2, v4

    if-lez v0, :cond_13

    .line 135
    sget-object p1, Ll/֡ۙᩳ;->ۗ:Ll/֡ۙᩳ;

    sget-object v0, Ll/᩵ۙᩳ;->᩶:Ll/᩵ۙᩳ;

    invoke-direct {p0, p1, v0, v1}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    :try_end_9
    .catch Ll/᩵ۗᩳ; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/io/UncheckedIOException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 151
    :try_start_a
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_12

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_18

    :cond_12
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 138
    :cond_13
    :try_start_b
    iget-object v2, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    iget-object v0, p0, Ll/֡ۗᩳ;->ۗ:Ll/ۨ᩶ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩶ᩳ;->֫()J

    move-result-wide v4

    iget-object v0, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    invoke-virtual {v0}, Ll/ۘۙᩳ;->֫()I

    move-result v7

    iget-object v0, p0, Ll/֡ۗᩳ;->ۛ:Ll/ۘۙᩳ;

    invoke-virtual {v0}, Ll/ۘۙᩳ;->ܽ()Z

    move-result v8

    move v3, p1

    invoke-virtual/range {v2 .. v9}, Ll/ۚۙᩳ;->֫(IJ[BIZZ)Ll/ۚۙᩳ;

    move-result-object v0

    .line 139
    new-instance v2, Ll/ᩴۗᩳ;

    invoke-direct {v2, p0, p1, v0}, Ll/ᩴۗᩳ;-><init>(Ll/֡ۗᩳ;ILl/ۚۙᩳ;)V

    iput-object v2, p0, Ll/֡ۗᩳ;->᩺:Ll/ᩴۗᩳ;
    :try_end_b
    .catch Ll/᩵ۗᩳ; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4
    .catch Ljava/io/UncheckedIOException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ll/ۘ۬ᩳ; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/lang/Error; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 151
    :try_start_c
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_14

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_15

    :cond_14
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 152
    :cond_15
    iget-object p1, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v2

    :catchall_6
    move-exception p1

    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 151
    :cond_16
    :goto_3
    :try_start_d
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_17

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_18

    :cond_17
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 152
    :cond_18
    :goto_4
    iget-object p1, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    :catchall_7
    move-exception p1

    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :catchall_8
    move-exception p1

    goto :goto_8

    :catch_0
    move-exception p1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 148
    :goto_5
    :try_start_e
    sget-object v0, Ll/֡ۙᩳ;->ۙ:Ll/֡ۙᩳ;

    sget-object v1, Ll/᩵ۙᩳ;->ۙ:Ll/᩵ۙᩳ;

    invoke-direct {p0, v0, v1, p1}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V

    .line 149
    throw p1

    :catch_2
    move-exception p1

    .line 146
    sget-object v0, Ll/֡ۙᩳ;->ۗ:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->᩹:Ll/᩵ۙᩳ;

    invoke-direct {p0, v0, v2, p1}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 151
    :try_start_f
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_19

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_1c

    :cond_19
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    goto :goto_7

    :catchall_9
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :catch_3
    move-exception p1

    goto :goto_6

    :catch_4
    move-exception p1

    .line 144
    :goto_6
    :try_start_10
    sget-object v0, Ll/֡ۙᩳ;->ۙ:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->ۙ:Ll/᩵ۙᩳ;

    invoke-direct {p0, v0, v2, p1}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 151
    :try_start_11
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_1a

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_1c

    :cond_1a
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    goto :goto_7

    :catchall_a
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :catch_5
    move-exception p1

    .line 142
    :try_start_12
    sget-object v0, Ll/֡ۙᩳ;->ۙ:Ll/֡ۙᩳ;

    iget-object v2, p1, Ll/᩵ۗᩳ;->᩸:Ll/᩵ۙᩳ;

    invoke-direct {p0, v0, v2, p1}, Ll/֡ۗᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ljava/lang/Throwable;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 151
    :try_start_13
    iget-boolean p1, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez p1, :cond_1b

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_1c

    :cond_1b
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 152
    :cond_1c
    :goto_7
    iget-object p1, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    :catchall_b
    move-exception p1

    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 151
    :goto_8
    :try_start_14
    iget-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z

    if-nez v0, :cond_1d

    invoke-direct {p0}, Ll/֡ۗᩳ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_1d
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 152
    :cond_1e
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 153
    throw p1

    :catchall_c
    move-exception p1

    .line 152
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    .line 101
    :cond_1f
    iget-object p1, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 102
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Previous text batch is not published"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 159
    :cond_20
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Text load operation is already running"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 97
    :cond_21
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid preferred load batch size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 1

    .line 303
    iget-object v0, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡ۗᩳ;->ᩳ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->֫()Ll/ܶ۬ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 308
    iget-object v0, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 315
    iput-object p1, p0, Ll/֡ۗᩳ;->ۨ:Ll/ܶ۬ᩳ;

    if-eqz v0, :cond_1

    .line 316
    invoke-virtual {v0}, Ll/ܶ۬ᩳ;->close()V

    :cond_1
    :goto_0
    return-void

    .line 310
    :cond_2
    invoke-virtual {v0}, Ll/ܶ۬ᩳ;->flush()V

    return-void
.end method

.method public final ۜ()Ll/ۚۙᩳ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 76
    iget-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z

    return v0
.end method

.method public final ܽ()V
    .locals 3

    .line 325
    iget-object v0, p0, Ll/֡ۗᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    sget-object v1, Ll/֡ۙᩳ;->᩹:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    invoke-virtual {v0, p0, v1, v2}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)V

    const/4 v0, 0x1

    .line 326
    iput-boolean v0, p0, Ll/֡ۗᩳ;->᩹:Z

    .line 327
    iget-object v0, p0, Ll/֡ۗᩳ;->ۗ:Ll/ۨ᩶ᩳ;

    if-eqz v0, :cond_0

    .line 329
    :try_start_0
    invoke-virtual {v0}, Ll/ۨ᩶ᩳ;->ܽ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iput-object v0, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    .line 332
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 333
    :try_start_1
    invoke-direct {p0}, Ll/֡ۗᩳ;->ۘ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/֡ۗᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ᩳ()Ljava/lang/Throwable;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/֡ۗᩳ;->۬:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ᩻()Ll/ᩴۗᩳ;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    invoke-virtual {v0}, Ll/ۚۙᩳ;->֫()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/֡ۗᩳ;->֫(I)Ll/ᩴۗᩳ;

    move-result-object v0

    return-object v0
.end method
