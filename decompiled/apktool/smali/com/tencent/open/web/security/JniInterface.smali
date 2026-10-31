.class public Lcom/tencent/open/web/security/JniInterface;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ֫:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native BackSpaceChar(ZI)Z
.end method

.method public static native clearAllPWD()Z
.end method

.method public static native d1(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native d2(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native getPWDKeyToMD5(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native insetTextToArray(ILjava/lang/String;I)Z
.end method

.method public static ֫()V
    .locals 9

    const-string v0, "/"

    const-string v1, "openSDK_LOG.JniInterface"

    const-string v2, "-->load lib success:"

    const-string v3, "-->fail, because checkMD5 fail:"

    const-string v4, "-->fail, because so is not exists:"

    const-string v5, "-->load lib fail, because context is null:"

    .line 22
    sget-boolean v6, Lcom/tencent/open/web/security/JniInterface;->֫:Z

    if-eqz v6, :cond_0

    return-void

    .line 26
    :cond_0
    :try_start_0
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v6

    if-nez v6, :cond_1

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 32
    :cond_1
    new-instance v5, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v8, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 38
    :cond_2
    invoke-static {v6, v5}, Lcom/tencent/open/web/security/JniInterface;->֫(Landroid/content/Context;Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 43
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 44
    sput-boolean v0, Lcom/tencent/open/web/security/JniInterface;->֫:Z

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "-->load lib error:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;Ljava/io/File;)Z
    .locals 7

    const-string v0, "openSDK_LOG.JniInterface"

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 60
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    .line 61
    sget-object v3, Ll/۠۠ۘ;->᩷:Ljava/lang/String;

    invoke-virtual {p0, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 63
    :try_start_1
    invoke-static {p0}, Ll/ۛ᩸ۘ;->֫(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 64
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_5

    .line 47
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    if-nez v4, :cond_1

    goto :goto_2

    .line 52
    :cond_1
    :try_start_2
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    :try_start_3
    invoke-static {v4}, Ll/ۛ᩸ۘ;->֫(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v2, p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v4, v2

    :goto_0
    :try_start_4
    const-string v5, "MD5Utils"

    const-string v6, "md5 file error"

    .line 55
    invoke-static {v5, v6, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v4, :cond_2

    .line 59
    :goto_1
    :try_start_5
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    nop

    :cond_2
    :goto_2
    if-eqz v2, :cond_5

    .line 70
    :try_start_6
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_3

    .line 75
    :cond_3
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    if-eqz p0, :cond_4

    .line 81
    :try_start_7
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    :cond_4
    return p1

    :cond_5
    :goto_3
    :try_start_8
    const-string p1, "checkMD5 file md5 is null"

    .line 71
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    if-eqz p0, :cond_8

    .line 81
    :goto_4
    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    goto :goto_6

    :catchall_3
    move-exception p1

    if-eqz v4, :cond_6

    .line 59
    :try_start_a
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 63
    :catchall_4
    :cond_6
    :try_start_b
    throw p1

    :cond_7
    :goto_5
    const-string p1, "checkMD5 assets md5 is null"

    .line 65
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    if-eqz p0, :cond_8

    goto :goto_4

    :catch_1
    :cond_8
    :goto_6
    return v1

    :catchall_5
    move-exception p1

    move-object v2, p0

    goto :goto_7

    :catchall_6
    move-exception p0

    move-object p1, p0

    :goto_7
    :try_start_c
    const-string p0, "checkMD5 exception"

    .line 77
    invoke-static {v0, p0, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    if-eqz v2, :cond_9

    .line 81
    :try_start_d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_2

    :catch_2
    :cond_9
    const-string p0, "checkMD5 return false"

    .line 87
    invoke-static {v0, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :catchall_7
    move-exception p0

    if-eqz v2, :cond_a

    .line 81
    :try_start_e
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_3

    .line 86
    :catch_3
    :cond_a
    throw p0
.end method
