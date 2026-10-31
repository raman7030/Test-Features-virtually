.class public final Ll/᩻֨ܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ۙ:Z

.field public final ᩶:Ll/ܶ᩵ܿ;

.field public final ᩸:Ll/ܳ֨ܿ;

.field public final ᩹:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ܳ֨ܿ;Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;Z)V
    .locals 0

    .line 645
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 646
    iput-object p1, p0, Ll/᩻֨ܿ;->᩸:Ll/ܳ֨ܿ;

    .line 647
    iput-object p2, p0, Ll/᩻֨ܿ;->᩹:Ll/ۗ᩺ۡ;

    .line 648
    iput-object p3, p0, Ll/᩻֨ܿ;->᩶:Ll/ܶ᩵ܿ;

    .line 649
    iput-boolean p4, p0, Ll/᩻֨ܿ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 654
    iget-object v0, p0, Ll/᩻֨ܿ;->᩶:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩻֨ܿ;->᩸:Ll/ܳ֨ܿ;

    iget-boolean v2, v1, Ll/ܳ֨ܿ;->ۧ:Z

    iget-object v3, v1, Ll/ܳ֨ܿ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    if-nez v2, :cond_b

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    .line 657
    :cond_0
    iget-object v2, v1, Ll/ܳ֨ܿ;->ܽ:Ll/᩵ۛۡ;

    const/4 v4, 0x0

    .line 659
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۨ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 665
    :try_start_1
    iget-object v5, v1, Ll/ܳ֨ܿ;->ܿ:Ll/ܳܰۡ;

    invoke-virtual {v5}, Ll/ܳܰۡ;->֫()Ll/ᩳܰۡ;

    move-result-object v5

    iget-object v6, p0, Ll/᩻֨ܿ;->᩹:Ll/ۗ᩺ۡ;

    invoke-virtual {v5, v6}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v6, 0x0

    .line 446
    :try_start_2
    invoke-virtual {v0, v6}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const v7, 0x19000

    :try_start_3
    new-array v7, v7, [B

    .line 669
    :cond_1
    invoke-virtual {v5, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_3

    .line 670
    invoke-virtual {v2, v8}, Ll/᩵ۛۡ;->֫(I)Z

    .line 671
    invoke-virtual {v0, v7, v6, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 672
    iget-boolean v8, v1, Ll/ܳ֨ܿ;->ۧ:Z

    if-nez v8, :cond_2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v8, :cond_1

    .line 683
    :cond_2
    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    return-void

    .line 676
    :cond_3
    :try_start_6
    iget-boolean v2, p0, Ll/᩻֨ܿ;->ۙ:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v2, :cond_4

    .line 678
    :try_start_7
    iget-object v1, v1, Ll/ܳ֨ܿ;->ᩳ:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/ArrayBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    :catch_0
    nop

    :cond_4
    :goto_0
    if-eqz v0, :cond_5

    .line 683
    :try_start_8
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :cond_5
    :try_start_9
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    goto :goto_3

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_6

    .line 665
    :try_start_a
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_b
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_1
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_c
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    :try_start_d
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    :catch_1
    move-exception v0

    .line 0
    :cond_7
    invoke-virtual {v3, v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_7

    goto :goto_3

    :catch_2
    move-exception v0

    :cond_9
    invoke-virtual {v3, v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_9

    :cond_b
    :goto_3
    return-void
.end method
