.class public final Ll/ۜ֨ܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩶:Landroid/content/pm/PackageInstaller$Session;

.field public final ᩸:Ll/ܳ֨ܿ;

.field public final ᩹:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ܳ֨ܿ;Ll/ۗ᩺ۡ;Landroid/content/pm/PackageInstaller$Session;)V
    .locals 0

    .line 463
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 464
    iput-object p1, p0, Ll/ۜ֨ܿ;->᩸:Ll/ܳ֨ܿ;

    .line 465
    iput-object p2, p0, Ll/ۜ֨ܿ;->᩹:Ll/ۗ᩺ۡ;

    .line 466
    iput-object p3, p0, Ll/ۜ֨ܿ;->᩶:Landroid/content/pm/PackageInstaller$Session;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 471
    iget-object v0, p0, Ll/ۜ֨ܿ;->᩹:Ll/ۗ᩺ۡ;

    iget-object v1, p0, Ll/ۜ֨ܿ;->᩸:Ll/ܳ֨ܿ;

    iget-boolean v2, v1, Ll/ܳ֨ܿ;->ۧ:Z

    iget-object v3, v1, Ll/ܳ֨ܿ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    if-nez v2, :cond_8

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    .line 474
    :cond_0
    iget-object v2, v1, Ll/ܳ֨ܿ;->ܽ:Ll/᩵ۛۡ;

    .line 475
    :try_start_0
    iget-object v4, v1, Ll/ܳ֨ܿ;->ܿ:Ll/ܳܰۡ;

    invoke-virtual {v4}, Ll/ܳܰۡ;->֫()Ll/ᩳܰۡ;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 477
    :try_start_1
    iget-object v5, p0, Ll/ۜ֨ܿ;->᩶:Landroid/content/pm/PackageInstaller$Session;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->᩶()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v9

    const-wide/16 v7, 0x0

    invoke-virtual/range {v5 .. v10}, Landroid/content/pm/PackageInstaller$Session;->openWrite(Ljava/lang/String;JJ)Ljava/io/OutputStream;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const v5, 0x19000

    :try_start_2
    new-array v5, v5, [B

    .line 480
    :cond_1
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    .line 481
    invoke-virtual {v2, v6}, Ll/᩵ۛۡ;->֫(I)Z

    const/4 v7, 0x0

    .line 482
    invoke-virtual {v0, v5, v7, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 483
    iget-boolean v6, v1, Ll/ܳ֨ܿ;->ۧ:Z

    if-nez v6, :cond_2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v6, :cond_1

    .line 488
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    .line 487
    :cond_3
    :try_start_5
    iget-object v2, p0, Ll/ۜ֨ܿ;->᩶:Landroid/content/pm/PackageInstaller$Session;

    invoke-virtual {v2, v0}, Landroid/content/pm/PackageInstaller$Session;->fsync(Ljava/io/OutputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v0, :cond_4

    .line 488
    :try_start_6
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_4
    :try_start_7
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 494
    :try_start_8
    iget-object v0, v1, Ll/ܳ֨ܿ;->ᩳ:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_1

    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_5

    .line 475
    :try_start_9
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_a
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_b
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    :try_start_c
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    :catch_0
    move-exception v0

    :cond_6
    const/4 v1, 0x0

    .line 0
    invoke-virtual {v3, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    :catch_1
    :cond_8
    :goto_2
    return-void
.end method
