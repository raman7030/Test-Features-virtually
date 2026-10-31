.class public Ll/᩷ۘۢ;
.super Ll/᩸ۘۢ;
.source "J68J"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 17
    iput-object p2, p0, Ll/᩷ۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v1, p0

    .line 23
    iget-object v0, v1, Ll/᩷ۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    iget-object v2, v1, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-static {v2, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v0, "550 Invalid name or chroot violation\r\n"

    goto/16 :goto_9

    .line 33
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v0, "550 Can\'t RETR a directory\r\n"

    goto/16 :goto_9

    .line 36
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-nez v3, :cond_2

    const-string v0, "550 File does not exist\r\n"

    goto/16 :goto_9

    .line 39
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ᩴ()Z

    move-result v3

    if-nez v3, :cond_3

    const-string v0, "550 No read permissions\r\n"

    goto/16 :goto_9

    .line 43
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/high16 v4, 0x10000

    :try_start_1
    new-array v4, v4, [B

    .line 46
    invoke-virtual {v2}, Ll/᩶ۘۢ;->ᩴ()Z

    move-result v5

    if-nez v5, :cond_4

    const-string v0, "425 Error opening socket\r\n"

    goto :goto_3

    :cond_4
    const-string v5, "150 Sending file\r\n"

    .line 50
    invoke-virtual {v2, v5}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    .line 51
    invoke-virtual {v2}, Ll/᩶ۘۢ;->ܺ()Z

    move-result v5

    const/4 v6, -0x1

    const-wide/16 v7, 0x0

    if-eqz v5, :cond_8

    .line 53
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v10

    const-wide/16 v12, 0x1

    sub-long/2addr v10, v12

    .line 54
    iget-wide v14, v2, Ll/᩶ۘۢ;->ܰ:J

    cmp-long v0, v14, v7

    if-ltz v0, :cond_6

    move-wide/from16 v16, v10

    .line 56
    iget-wide v9, v2, Ll/᩶ۘۢ;->ۤ:J

    cmp-long v5, v9, v14

    if-ltz v5, :cond_5

    move-wide v10, v9

    goto :goto_0

    :cond_5
    move-wide/from16 v10, v16

    :goto_0
    const-wide/16 v0, -0x1

    .line 60
    iput-wide v0, v2, Ll/᩶ۘۢ;->ܰ:J

    .line 61
    iput-wide v0, v2, Ll/᩶ۘۢ;->ۤ:J

    goto :goto_1

    :cond_6
    move-wide/from16 v16, v10

    move-wide v14, v7

    move-wide/from16 v10, v16

    :goto_1
    sub-long/2addr v10, v14

    add-long/2addr v10, v12

    .line 65
    invoke-static {v14, v15, v3}, Ll/᩹ۢ֡;->ۧ(JLjava/io/InputStream;)V

    :goto_2
    cmp-long v0, v10, v7

    if-lez v0, :cond_f

    .line 66
    invoke-virtual {v3, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    if-eq v0, v6, :cond_f

    int-to-long v0, v0

    .line 67
    invoke-static {v0, v1, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    const/4 v0, 0x0

    .line 68
    invoke-virtual {v2, v0, v1, v4}, Ll/᩶ۘۢ;->֫(II[B)Z

    move-result v5

    if-nez v5, :cond_7

    const-string v0, "426 Data socket error\r\n"

    goto :goto_3

    :cond_7
    int-to-long v12, v1

    sub-long/2addr v10, v12

    goto :goto_2

    .line 75
    :cond_8
    iget-wide v9, v2, Ll/᩶ۘۢ;->ܰ:J

    cmp-long v1, v9, v7

    if-ltz v1, :cond_9

    const-string v0, "550 Unable to seek to requested position in ASCII mode"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    :goto_3
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_9

    :cond_9
    const/4 v1, 0x0

    .line 81
    :goto_4
    :try_start_3
    invoke-virtual {v3, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-eq v5, v6, :cond_f

    const/4 v7, 0x2

    new-array v7, v7, [B

    .line 83
    fill-array-data v7, :array_0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_5
    const/16 v10, 0xd

    const/4 v11, 0x1

    if-ge v8, v5, :cond_e

    .line 85
    aget-byte v12, v4, v8

    const/16 v13, 0xa

    if-ne v12, v13, :cond_d

    sub-int v12, v8, v9

    .line 87
    invoke-virtual {v2, v9, v12, v4}, Ll/᩶ۘۢ;->֫(II[B)Z

    if-nez v8, :cond_b

    if-nez v1, :cond_a

    const/4 v0, 0x0

    .line 95
    invoke-virtual {v2, v0, v11, v7}, Ll/᩶ۘۢ;->֫(II[B)Z

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    add-int/lit8 v9, v8, -0x1

    .line 97
    aget-byte v9, v4, v9

    if-eq v9, v10, :cond_c

    .line 99
    invoke-virtual {v2, v0, v11, v7}, Ll/᩶ۘۢ;->֫(II[B)Z

    :cond_c
    :goto_6
    move v9, v8

    goto :goto_7

    :cond_d
    const/4 v0, 0x0

    :goto_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_e
    const/4 v0, 0x0

    sub-int/2addr v8, v9

    .line 107
    invoke-virtual {v2, v9, v8, v4}, Ll/᩶ۘۢ;->֫(II[B)Z

    add-int/lit8 v5, v5, -0x1

    .line 108
    aget-byte v1, v4, v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v1, v10, :cond_9

    const/4 v1, 0x1

    goto :goto_4

    .line 111
    :cond_f
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    const/4 v0, 0x0

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 43
    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_6
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    const-string v0, "425 Network error\r\n"

    goto :goto_9

    :catch_1
    const-string v0, "550 File not found\r\n"

    .line 117
    :goto_9
    invoke-virtual {v2}, Ll/᩶ۘۢ;->֫()V

    if-eqz v0, :cond_10

    .line 119
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    goto :goto_a

    :cond_10
    const-string v0, "226 Transmission finished\r\n"

    .line 121
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    :goto_a
    return-void

    :array_0
    .array-data 1
        0xdt
        0xat
    .end array-data
.end method
