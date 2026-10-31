.class public final Ll/ᩳ᩶ۘ;
.super Ll/ܽ᩶ۘ;
.source "TAAW"


# direct methods
.method public static ֫(Ll/ᩴ۟᩵;)V
    .locals 3

    .line 22
    invoke-static {p0}, Ll/ܽ᩶ۘ;->ۧ(Ll/ᩴ۟᩵;)V

    .line 24
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 26
    :try_start_0
    invoke-virtual {p0}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v1, 0x400

    :try_start_1
    new-array v1, v1, [B

    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ltz v2, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_0
    move-exception v1

    .line 26
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    .line 24
    :try_start_5
    invoke-virtual {p0}, Ll/֡۟᩵;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :cond_1
    :goto_3
    if-eqz p0, :cond_2

    .line 32
    invoke-virtual {p0}, Ll/֡۟᩵;->close()V

    :cond_2
    return-void
.end method
