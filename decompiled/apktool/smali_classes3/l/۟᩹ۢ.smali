.class public final Ll/۟᩹ۢ;
.super Ljava/lang/Thread;
.source "M1TZ"


# instance fields
.field public final synthetic ᩸:Ll/ܿ᩶ۢ;

.field public final synthetic ᩹:Ljava/io/FileDescriptor;


# direct methods
.method public constructor <init>(Ll/ܿ᩶ۢ;Ljava/io/FileDescriptor;)V
    .locals 0

    .line 261
    iput-object p1, p0, Ll/۟᩹ۢ;->᩸:Ll/ܿ᩶ۢ;

    iput-object p2, p0, Ll/۟᩹ۢ;->᩹:Ljava/io/FileDescriptor;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 264
    iget-object v0, p0, Ll/۟᩹ۢ;->᩸:Ll/ܿ᩶ۢ;

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Ll/۟᩹ۢ;->᩹:Ljava/io/FileDescriptor;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v2, 0x1000

    :try_start_1
    new-array v2, v2, [B

    .line 267
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 269
    :cond_0
    invoke-static {v0}, Ll/ܿ᩶ۢ;->ᩳ(Ll/ܿ᩶ۢ;)Ll/ۨܶۢ;

    move-result-object v4

    invoke-virtual {v4, v3, v2}, Ll/ۨܶۢ;->֫(I[B)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_1

    .line 272
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    .line 270
    :cond_1
    :try_start_3
    invoke-static {v0}, Ll/ܿ᩶ۢ;->ܽ(Ll/ܿ᩶ۢ;)Landroid/os/Handler;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 264
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    .line 275
    invoke-static {v0}, Ll/ܿ᩶ۢ;->᩻(Ll/ܿ᩶ۢ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 276
    throw v1

    .line 275
    :catch_0
    :goto_3
    invoke-static {v0}, Ll/ܿ᩶ۢ;->᩻(Ll/ܿ᩶ۢ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
