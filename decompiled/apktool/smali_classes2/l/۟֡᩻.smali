.class public final Ll/۟֡᩻;
.super Ljava/lang/Object;
.source "P50D"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final ۤ:Ll/ۗۢ᩻;

.field public final ۫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۬:Ljava/lang/String;

.field public final ᩶:J

.field public final ᩸:Ll/ۨ֡᩻;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/۟֡᩻;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    iput-object p1, p0, Ll/۟֡᩻;->ۤ:Ll/ۗۢ᩻;

    .line 36
    iput-object p2, p0, Ll/۟֡᩻;->᩹:Ljava/lang/String;

    .line 37
    iput-object p3, p0, Ll/۟֡᩻;->۬:Ljava/lang/String;

    .line 38
    invoke-static {p3}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/۟֡᩻;->ۗ:Ljava/lang/String;

    .line 39
    iput-object p4, p0, Ll/۟֡᩻;->ۙ:Ljava/lang/String;

    .line 40
    iput-wide p5, p0, Ll/۟֡᩻;->᩶:J

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, p1, Ll/۬֡᩻;

    if-eqz p1, :cond_0

    .line 42
    new-instance p1, Ll/ۨ֡᩻;

    invoke-direct {p1, p0}, Ll/ۨ֡᩻;-><init>(Ll/۟֡᩻;)V

    iput-object p1, p0, Ll/۟֡᩻;->᩸:Ll/ۨ֡᩻;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Ll/۟֡᩻;->᩸:Ll/ۨ֡᩻;

    return-void
.end method

.method public static ֫(Ll/۟֡᩻;[Ll/ܿ᩹ۡ;JLjava/io/OutputStream;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 19

    move/from16 v0, p6

    .line 60
    :try_start_0
    aget-object v1, p1, v0

    const v8, 0x19000

    int-to-long v9, v8

    int-to-long v2, v0

    mul-long v2, v2, v9

    add-long v2, v2, p2

    new-array v0, v8, [B

    move-object/from16 v15, p0

    move-wide/from16 v17, v2

    .line 65
    :goto_0
    iget-object v14, v15, Ll/۟֡᩻;->᩸:Ll/ۨ֡᩻;

    const/4 v6, 0x0

    move-object v2, v14

    move-wide/from16 v3, v17

    move-object v5, v0

    move v7, v8

    .line 104
    invoke-virtual/range {v2 .. v7}, Ll/ۨ֡᩻;->ܽ(J[BII)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    goto :goto_3

    :cond_0
    sub-int v4, v8, v2

    :goto_1
    if-lez v4, :cond_2

    int-to-long v5, v2

    add-long v12, v17, v5

    move-object v11, v14

    move-object v5, v14

    move-object v14, v0

    move v15, v2

    move/from16 v16, v4

    .line 111
    invoke-virtual/range {v11 .. v16}, Ll/ۨ֡᩻;->ܽ(J[BII)I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v6, v3, :cond_1

    goto :goto_2

    :cond_1
    add-int/2addr v2, v6

    sub-int/2addr v4, v6

    move-object/from16 v15, p0

    move-object v14, v5

    goto :goto_1

    :cond_2
    :goto_2
    move v3, v2

    :goto_3
    const/4 v2, 0x2

    int-to-long v4, v2

    mul-long v4, v4, v9

    add-long v17, v17, v4

    if-lez v3, :cond_3

    .line 69
    :try_start_1
    invoke-virtual {v1}, Ll/ܿ᩹ۡ;->֫()V

    const/4 v2, 0x0

    move-object/from16 v4, p4

    .line 70
    invoke-virtual {v4, v0, v2, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :try_start_2
    invoke-virtual {v1}, Ll/ܿ᩹ۡ;->ۧ()V

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ll/ܿ᩹ۡ;->ۧ()V

    .line 73
    throw v0

    :cond_3
    move-object/from16 v4, p4

    :goto_4
    if-ne v3, v8, :cond_7

    .line 75
    invoke-virtual/range {p5 .. p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v2, :cond_4

    goto :goto_5

    :cond_4
    move-object/from16 v15, p0

    goto :goto_0

    :catchall_1
    move-exception v0

    :cond_5
    const/4 v1, 0x0

    move-object/from16 v2, p5

    .line 0
    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual/range {p5 .. p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    :cond_7
    :goto_5
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/۟֡᩻;->᩸:Ll/ۨ֡᩻;

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {v0}, Ll/ۨ֡᩻;->close()V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;J)V
    .locals 8

    .line 49
    iget-object v0, p0, Ll/۟֡᩻;->᩸:Ll/ۨ֡᩻;

    if-nez v0, :cond_1

    .line 50
    iget-object v0, p0, Ll/۟֡᩻;->ۤ:Ll/ۗۢ᩻;

    iget-object v1, p0, Ll/۟֡᩻;->۬:Ljava/lang/String;

    invoke-virtual {v0, p2, p3, v1}, Ll/ۗۢ᩻;->֫(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p2

    const/16 p3, 0x3000

    .line 51
    :try_start_0
    invoke-static {p2, p1, p3}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 50
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw p1

    .line 56
    :cond_1
    invoke-static {}, Ll/ܿ᩹ۡ;->ܽ()[Ll/ܿ᩹ۡ;

    move-result-object v2

    .line 57
    new-instance v6, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 58
    new-instance v7, Ll/᩺֡᩻;

    move-object v0, v7

    move-object v1, p0

    move-wide v3, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Ll/᩺֡᩻;-><init>(Ll/۟֡᩻;[Ll/ܿ᩹ۡ;JLjava/io/OutputStream;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 92
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 p3, 0x0

    :goto_1
    if-ge p3, p2, :cond_2

    .line 95
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ܰ֡᩻;

    invoke-direct {v1, v7, p3}, Ll/ܰ֡᩻;-><init>(Ll/᩺֡᩻;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Future;

    .line 83
    :try_start_2
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    nop

    goto :goto_2

    :cond_3
    return-void
.end method
