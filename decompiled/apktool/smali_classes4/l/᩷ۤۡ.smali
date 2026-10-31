.class public final Ll/᩷ۤۡ;
.super Ljava/lang/Object;
.source "22T0"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 16
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/16 v0, 0x400

    new-array v2, v0, [B

    .line 24
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    .line 25
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    const/4 v3, 0x0

    .line 26
    :try_start_1
    invoke-virtual {p0, v2, v3, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    .line 27
    invoke-virtual {p1, v2, v3, v4}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object p1

    :catchall_0
    move-exception p1

    move-object v1, p0

    goto :goto_1

    :catchall_1
    move-exception p0

    move-object p1, p0

    :goto_1
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 35
    throw p1

    :catch_0
    move-object p0, v1

    .line 34
    :catch_1
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object v1
.end method

.method public static ֫(Ljava/io/File;)[B
    .locals 1

    .line 41
    :try_start_0
    sget v0, Ll/ܺۢ֡;->֫:I

    .line 2658
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 p0, 0x0

    .line 51
    :try_start_1
    invoke-static {v0, p0}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 480
    invoke-static {v0}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 45
    throw p0
.end method
