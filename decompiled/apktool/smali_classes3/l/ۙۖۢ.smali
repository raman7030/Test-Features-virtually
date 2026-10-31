.class public Ll/ۙۖۢ;
.super Ll/᩸ۘۢ;
.source "PANG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 24
    iput-object p2, p0, Ll/ۙۖۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    const-string v0, " "

    .line 29
    iget-object v2, v1, Ll/ۙۖۢ;->᩶:Ljava/lang/String;

    invoke-static {v2}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 34
    iget-object v3, v1, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-static {v3, v2}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 35
    invoke-virtual {v1, v4}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v0, "550 Invalid name or chroot violation\r\n"

    goto/16 :goto_5

    .line 38
    :cond_0
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v0, "553 Can\'t HASH a directory\r\n"

    goto/16 :goto_5

    .line 41
    :cond_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-nez v5, :cond_2

    const-string v0, "550 File does not exist\r\n"

    goto/16 :goto_5

    .line 44
    :cond_2
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ᩴ()Z

    move-result v5

    if-nez v5, :cond_3

    const-string v0, "556 No read permissions\r\n"

    goto/16 :goto_5

    .line 51
    :cond_3
    :try_start_0
    invoke-virtual {v3}, Ll/᩶ۘۢ;->ܿ()Ljava/lang/String;

    move-result-object v5

    .line 52
    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v6

    const/high16 v7, 0x10000

    new-array v7, v7, [B

    .line 54
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v8
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    :try_start_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v9

    const-wide/16 v11, 0x1

    sub-long/2addr v9, v11

    .line 58
    iget-wide v13, v3, Ll/᩶ۘۢ;->ܰ:J

    const-wide/16 v15, 0x0

    cmp-long v17, v13, v15

    if-ltz v17, :cond_5

    .line 60
    iget-wide v11, v3, Ll/᩶ۘۢ;->ۤ:J

    cmp-long v15, v13, v11

    if-gtz v15, :cond_4

    .line 61
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v15

    const-wide/16 v17, 0x1

    sub-long v15, v15, v17

    cmp-long v4, v11, v15

    if-gtz v4, :cond_4

    .line 62
    iget-wide v9, v3, Ll/᩶ۘۢ;->ۤ:J

    :cond_4
    const-wide/16 v11, -0x1

    .line 65
    iput-wide v11, v3, Ll/᩶ۘۢ;->ܰ:J

    .line 66
    iput-wide v11, v3, Ll/᩶ۘۢ;->ۤ:J

    goto :goto_0

    :cond_5
    move-wide v13, v15

    :goto_0
    sub-long v11, v9, v13

    const-wide/16 v15, 0x1

    add-long/2addr v11, v15

    .line 71
    invoke-static {v13, v14, v8}, Ll/᩹ۢ֡;->ۧ(JLjava/io/InputStream;)V

    .line 72
    :goto_1
    invoke-virtual {v8, v7}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v15, -0x1

    if-eq v4, v15, :cond_7

    move-object v15, v2

    int-to-long v1, v4

    cmp-long v16, v1, v11

    if-lez v16, :cond_6

    long-to-int v1, v11

    const/4 v2, 0x0

    .line 74
    invoke-virtual {v6, v7, v2, v1}, Ljava/security/MessageDigest;->update([BII)V

    move-object/from16 v16, v15

    goto :goto_2

    :cond_6
    move-object/from16 v16, v15

    const/4 v15, 0x0

    .line 77
    invoke-virtual {v6, v7, v15, v4}, Ljava/security/MessageDigest;->update([BII)V

    sub-long/2addr v11, v1

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    goto :goto_1

    :cond_7
    move-object/from16 v16, v2

    .line 81
    :goto_2
    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    array-length v4, v1

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v4, :cond_8

    aget-byte v7, v1, v6

    const-string v11, "%02x"

    .line 84
    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v7, v12, v15

    invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 86
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "213 "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\r\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    :try_start_2
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    const/4 v0, 0x0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_6

    :catchall_1
    move-exception v0

    const/4 v8, 0x0

    goto :goto_6

    :catch_1
    const/4 v8, 0x0

    :catch_2
    :try_start_3
    const-string v0, "550 Unknown hashing algorithm\r\n"

    if-eqz v8, :cond_9

    goto :goto_4

    :catch_3
    const/4 v8, 0x0

    :catch_4
    const-string v0, "425 Network error\r\n"

    if-eqz v8, :cond_9

    goto :goto_4

    :catch_5
    const/4 v8, 0x0

    :catch_6
    const-string v0, "550 File not found\r\n"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v8, :cond_9

    :goto_4
    :try_start_4
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7

    goto :goto_5

    :catch_7
    nop

    :cond_9
    :goto_5
    if-eqz v0, :cond_a

    .line 104
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    :cond_a
    return-void

    :goto_6
    if-eqz v8, :cond_b

    .line 98
    :try_start_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_8

    .line 101
    :catch_8
    :cond_b
    throw v0
.end method
