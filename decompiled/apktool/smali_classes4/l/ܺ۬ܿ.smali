.class public final synthetic Ll/ܺ۬ܿ;
.super Ljava/lang/Object;
.source "6AK0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/᩵ۛۡ;

.field public final synthetic ᩶:Ll/֡۬ܿ;

.field public final synthetic ᩸:Ll/ۡۛۡ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۛۡ;Ljava/util/concurrent/atomic/AtomicReference;Ll/֡۬ܿ;Ll/᩵ۛۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۬ܿ;->᩸:Ll/ۡۛۡ;

    iput-object p2, p0, Ll/ܺ۬ܿ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Ll/ܺ۬ܿ;->᩶:Ll/֡۬ܿ;

    iput-object p4, p0, Ll/ܺ۬ܿ;->ۙ:Ll/᩵ۛۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 2
    iget-object v0, p0, Ll/ܺ۬ܿ;->᩶:Ll/֡۬ܿ;

    .line 4
    iget-object v1, p0, Ll/ܺ۬ܿ;->ۙ:Ll/᩵ۛۡ;

    .line 122
    iget-object v2, p0, Ll/ܺ۬ܿ;->᩸:Ll/ۡۛۡ;

    invoke-interface {v2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Ll/ܺ۬ܿ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_2

    .line 126
    :cond_0
    :try_start_0
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v3

    .line 127
    invoke-virtual {v0}, Ll/֡۬ܿ;->֫()Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v5, 0x19000

    :try_start_1
    new-array v5, v5, [B

    .line 130
    :goto_0
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x0

    .line 131
    invoke-virtual {v3, v5, v7, v6}, Ljava/security/MessageDigest;->update([BII)V

    .line 132
    invoke-virtual {v1, v6}, Ll/᩵ۛۡ;->֫(I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 134
    :cond_1
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 135
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֡۬ܿ;->᩸:Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v1

    if-eqz v4, :cond_2

    .line 127
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    move-object v1, v0

    :cond_3
    const/4 v0, 0x0

    .line 0
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_2

    :catch_1
    move-exception v1

    .line 137
    iput-object v1, v0, Ll/֡۬ܿ;->᩹:Ljava/io/IOException;

    :cond_5
    :goto_2
    return-void
.end method
