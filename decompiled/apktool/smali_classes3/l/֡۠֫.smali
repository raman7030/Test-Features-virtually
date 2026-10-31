.class public final Ll/֡۠֫;
.super Ll/ۖ۠֫;
.source "R8K9"


# instance fields
.field public ۜ:Z

.field public ۢ:Landroid/net/Uri;

.field public ܳ:J

.field public ܿ:Landroid/content/res/AssetFileDescriptor;

.field public final ᩷:Landroid/content/ContentResolver;

.field public ᩻:Ljava/io/FileInputStream;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 71
    invoke-direct {p0, v0}, Ll/ۖ۠֫;-><init>(Z)V

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    iput-object p1, p0, Ll/֡۠֫;->᩷:Landroid/content/ContentResolver;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    const/4 v0, 0x0

    .line 206
    iput-object v0, p0, Ll/֡۠֫;->ۢ:Landroid/net/Uri;

    const/16 v1, 0x7d0

    const/4 v2, 0x0

    .line 208
    :try_start_0
    iget-object v3, p0, Ll/֡۠֫;->᩻:Ljava/io/FileInputStream;

    if-eqz v3, :cond_0

    .line 209
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 214
    :cond_0
    iput-object v0, p0, Ll/֡۠֫;->᩻:Ljava/io/FileInputStream;

    .line 216
    :try_start_1
    iget-object v3, p0, Ll/֡۠֫;->ܿ:Landroid/content/res/AssetFileDescriptor;

    if-eqz v3, :cond_1

    .line 217
    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    :cond_1
    iput-object v0, p0, Ll/֡۠֫;->ܿ:Landroid/content/res/AssetFileDescriptor;

    .line 223
    iget-boolean v0, p0, Ll/֡۠֫;->ۜ:Z

    if-eqz v0, :cond_2

    .line 224
    iput-boolean v2, p0, Ll/֡۠֫;->ۜ:Z

    .line 225
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v3

    .line 220
    :try_start_2
    new-instance v4, Ll/᩵۠֫;

    .line 55
    invoke-direct {v4, v1, v3}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 220
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 222
    :goto_0
    iput-object v0, p0, Ll/֡۠֫;->ܿ:Landroid/content/res/AssetFileDescriptor;

    .line 223
    iget-boolean v0, p0, Ll/֡۠֫;->ۜ:Z

    if-eqz v0, :cond_3

    .line 224
    iput-boolean v2, p0, Ll/֡۠֫;->ۜ:Z

    .line 225
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 227
    :cond_3
    throw v1

    :catchall_1
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    .line 212
    :try_start_3
    new-instance v4, Ll/᩵۠֫;

    .line 55
    invoke-direct {v4, v1, v3}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 212
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 214
    :goto_1
    iput-object v0, p0, Ll/֡۠֫;->᩻:Ljava/io/FileInputStream;

    .line 216
    :try_start_4
    iget-object v4, p0, Ll/֡۠֫;->ܿ:Landroid/content/res/AssetFileDescriptor;

    if-eqz v4, :cond_4

    .line 217
    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 222
    :cond_4
    iput-object v0, p0, Ll/֡۠֫;->ܿ:Landroid/content/res/AssetFileDescriptor;

    .line 223
    iget-boolean v0, p0, Ll/֡۠֫;->ۜ:Z

    if-eqz v0, :cond_5

    .line 224
    iput-boolean v2, p0, Ll/֡۠֫;->ۜ:Z

    .line 225
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 228
    :cond_5
    throw v3

    :catchall_2
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v3

    .line 220
    :try_start_5
    new-instance v4, Ll/᩵۠֫;

    .line 55
    invoke-direct {v4, v1, v3}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 220
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 222
    :goto_2
    iput-object v0, p0, Ll/֡۠֫;->ܿ:Landroid/content/res/AssetFileDescriptor;

    .line 223
    iget-boolean v0, p0, Ll/֡۠֫;->ۜ:Z

    if-eqz v0, :cond_6

    .line 224
    iput-boolean v2, p0, Ll/֡۠֫;->ۜ:Z

    .line 225
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 227
    :cond_6
    throw v1
.end method

.method public final read([BII)I
    .locals 7

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 174
    :cond_0
    iget-wide v0, p0, Ll/֡۠֫;->ܳ:J

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v2, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v5, p3

    .line 181
    :try_start_0
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 182
    :goto_0
    iget-object v0, p0, Ll/֡۠֫;->᩻:Ljava/io/FileInputStream;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileInputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v4, :cond_3

    :goto_1
    return v4

    .line 190
    :cond_3
    iget-wide p2, p0, Ll/֡۠֫;->ܳ:J

    cmp-long v0, p2, v2

    if-eqz v0, :cond_4

    int-to-long v0, p1

    sub-long/2addr p2, v0

    .line 191
    iput-wide p2, p0, Ll/֡۠֫;->ܳ:J

    .line 193
    :cond_4
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ᩳ(I)V

    return p1

    :catch_0
    move-exception p1

    .line 184
    new-instance p2, Ll/᩵۠֫;

    const/16 p3, 0x7d0

    .line 55
    invoke-direct {p2, p3, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 184
    throw p2
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "Could not open file descriptor for: "

    .line 79
    :try_start_0
    iget-object v4, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v5, v0, Ll/ۗ۠֫;->ܳ:J

    iget-wide v7, v0, Ll/ۗ۠֫;->᩻:J

    invoke-virtual {v4}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    move-result-object v4

    .line 80
    iput-object v4, v1, Ll/֡۠֫;->ۢ:Landroid/net/Uri;

    .line 82
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    .line 85
    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v9

    const-string v10, "content"

    invoke-static {v9, v10}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9
    :try_end_0
    .catch Ll/᩵۠֫; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v10, v1, Ll/֡۠֫;->᩷:Landroid/content/ContentResolver;

    const/4 v11, 0x1

    if-eqz v9, :cond_0

    .line 86
    :try_start_1
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string v12, "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"

    .line 88
    invoke-virtual {v9, v12, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v11, "*/*"

    .line 90
    invoke-virtual {v10, v4, v11, v9}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v9

    goto :goto_0

    :cond_0
    const-string v9, "r"

    .line 94
    invoke-virtual {v10, v4, v9}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v9

    .line 96
    :goto_0
    iput-object v9, v1, Ll/֡۠֫;->ܿ:Landroid/content/res/AssetFileDescriptor;

    if-eqz v9, :cond_b

    .line 104
    invoke-virtual {v9}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v10

    .line 105
    new-instance v2, Ljava/io/FileInputStream;

    invoke-virtual {v9}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 106
    iput-object v2, v1, Ll/֡۠֫;->᩻:Ljava/io/FileInputStream;

    const/16 v4, 0x7d8

    const/4 v12, 0x0

    const-wide/16 v13, -0x1

    cmp-long v15, v10, v13

    if-eqz v15, :cond_2

    cmp-long v16, v7, v10

    if-gtz v16, :cond_1

    goto :goto_1

    .line 116
    :cond_1
    new-instance v0, Ll/᩵۠֫;

    .line 55
    invoke-direct {v0, v4, v12}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 116
    throw v0

    .line 119
    :cond_2
    :goto_1
    invoke-virtual {v9}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v16

    add-long v3, v16, v7

    .line 121
    invoke-virtual {v2, v3, v4}, Ljava/io/FileInputStream;->skip(J)J

    move-result-wide v3

    sub-long v3, v3, v16

    cmp-long v16, v3, v7

    if-nez v16, :cond_a

    const-wide/16 v7, 0x0

    if-nez v15, :cond_5

    .line 132
    invoke-static {v2}, Ll/᩶ᩴᩳ;->֫(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    cmp-long v10, v3, v7

    if-nez v10, :cond_3

    .line 135
    iput-wide v13, v1, Ll/֡۠֫;->ܳ:J

    goto :goto_2

    .line 137
    :cond_3
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->position()J

    move-result-wide v10

    sub-long/2addr v3, v10

    iput-wide v3, v1, Ll/֡۠֫;->ܳ:J

    cmp-long v2, v3, v7

    if-ltz v2, :cond_4

    goto :goto_2

    .line 140
    :cond_4
    new-instance v0, Ll/᩵۠֫;

    const/16 v2, 0x7d8

    .line 55
    invoke-direct {v0, v2, v12}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 140
    throw v0

    :cond_5
    sub-long/2addr v10, v3

    .line 145
    iput-wide v10, v1, Ll/֡۠֫;->ܳ:J
    :try_end_1
    .catch Ll/᩵۠֫; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    cmp-long v2, v10, v7

    if-ltz v2, :cond_9

    :goto_2
    cmp-long v2, v5, v13

    if-eqz v2, :cond_7

    .line 163
    iget-wide v3, v1, Ll/֡۠֫;->ܳ:J

    cmp-long v7, v3, v13

    if-nez v7, :cond_6

    move-wide v3, v5

    goto :goto_3

    :cond_6
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :goto_3
    iput-wide v3, v1, Ll/֡۠֫;->ܳ:J

    :cond_7
    const/4 v3, 0x1

    .line 165
    iput-boolean v3, v1, Ll/֡۠֫;->ۜ:Z

    .line 166
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    if-eqz v2, :cond_8

    return-wide v5

    .line 167
    :cond_8
    iget-wide v2, v1, Ll/֡۠֫;->ܳ:J

    return-wide v2

    .line 147
    :cond_9
    :try_start_2
    new-instance v0, Ll/᩵۠֫;

    const/16 v2, 0x7d8

    .line 55
    invoke-direct {v0, v2, v12}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 147
    throw v0

    .line 126
    :cond_a
    new-instance v0, Ll/᩵۠֫;

    const/16 v2, 0x7d8

    .line 55
    invoke-direct {v0, v2, v12}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 126
    throw v0

    .line 99
    :cond_b
    new-instance v0, Ll/᩵۠֫;

    new-instance v3, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ll/᩵۠֫; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    const/16 v2, 0x7d0

    .line 55
    :try_start_3
    invoke-direct {v0, v2, v3}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 99
    throw v0
    :try_end_3
    .catch Ll/᩵۠֫; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    const/16 v2, 0x7d0

    .line 154
    :goto_4
    new-instance v3, Ll/᩵۠֫;

    .line 156
    instance-of v4, v0, Ljava/io/FileNotFoundException;

    if-eqz v4, :cond_c

    const/16 v2, 0x7d5

    .line 55
    :cond_c
    invoke-direct {v3, v2, v0}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 158
    throw v3

    :catch_2
    move-exception v0

    .line 152
    throw v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 200
    iget-object v0, p0, Ll/֡۠֫;->ۢ:Landroid/net/Uri;

    return-object v0
.end method
