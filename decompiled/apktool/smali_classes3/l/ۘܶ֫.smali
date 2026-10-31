.class public final Ll/ۘܶ֫;
.super Ll/ۖ۠֫;
.source "W8T8"


# instance fields
.field public ۜ:Ll/ۗ۠֫;

.field public ۢ:Z

.field public ܳ:Landroid/content/res/AssetFileDescriptor;

.field public final ܿ:Landroid/content/Context;

.field public ᩷:Ljava/io/FileInputStream;

.field public ᩻:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 129
    invoke-direct {p0, v0}, Ll/ۖ۠֫;-><init>(Z)V

    .line 130
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۘܶ֫;->ܿ:Landroid/content/Context;

    return-void
.end method

.method public static buildRawResourceUri(I)Landroid/net/Uri;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "rawresource:///"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 5

    const/4 v0, 0x0

    .line 350
    iput-object v0, p0, Ll/ۘܶ֫;->ۜ:Ll/ۗ۠֫;

    const/16 v1, 0x7d0

    const/4 v2, 0x0

    .line 352
    :try_start_0
    iget-object v3, p0, Ll/ۘܶ֫;->᩷:Ljava/io/FileInputStream;

    if-eqz v3, :cond_0

    .line 353
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 359
    :cond_0
    iput-object v0, p0, Ll/ۘܶ֫;->᩷:Ljava/io/FileInputStream;

    .line 361
    :try_start_1
    iget-object v3, p0, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    if-eqz v3, :cond_1

    .line 362
    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 368
    :cond_1
    iput-object v0, p0, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    .line 369
    iget-boolean v0, p0, Ll/ۘܶ֫;->ۢ:Z

    if-eqz v0, :cond_2

    .line 370
    iput-boolean v2, p0, Ll/ۘܶ֫;->ۢ:Z

    .line 371
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v3

    .line 365
    :try_start_2
    new-instance v4, Ll/ۖܶ֫;

    .line 97
    invoke-direct {v4, v0, v3, v1}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 365
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 368
    :goto_0
    iput-object v0, p0, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    .line 369
    iget-boolean v0, p0, Ll/ۘܶ֫;->ۢ:Z

    if-eqz v0, :cond_3

    .line 370
    iput-boolean v2, p0, Ll/ۘܶ֫;->ۢ:Z

    .line 371
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 373
    :cond_3
    throw v1

    :catchall_1
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    .line 356
    :try_start_3
    new-instance v4, Ll/ۖܶ֫;

    .line 97
    invoke-direct {v4, v0, v3, v1}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 356
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 359
    :goto_1
    iput-object v0, p0, Ll/ۘܶ֫;->᩷:Ljava/io/FileInputStream;

    .line 361
    :try_start_4
    iget-object v4, p0, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    if-eqz v4, :cond_4

    .line 362
    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 368
    :cond_4
    iput-object v0, p0, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    .line 369
    iget-boolean v0, p0, Ll/ۘܶ֫;->ۢ:Z

    if-eqz v0, :cond_5

    .line 370
    iput-boolean v2, p0, Ll/ۘܶ֫;->ۢ:Z

    .line 371
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 374
    :cond_5
    throw v3

    :catchall_2
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v3

    .line 365
    :try_start_5
    new-instance v4, Ll/ۖܶ֫;

    .line 97
    invoke-direct {v4, v0, v3, v1}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 365
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 368
    :goto_2
    iput-object v0, p0, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    .line 369
    iget-boolean v0, p0, Ll/ۘܶ֫;->ۢ:Z

    if-eqz v0, :cond_6

    .line 370
    iput-boolean v2, p0, Ll/ۘܶ֫;->ۢ:Z

    .line 371
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 373
    :cond_6
    throw v1
.end method

.method public final read([BII)I
    .locals 9

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 310
    :cond_0
    iget-wide v0, p0, Ll/ۘܶ֫;->᩻:J

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x7d0

    const-wide/16 v5, -0x1

    cmp-long v3, v0, v5

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v7, p3

    .line 317
    :try_start_0
    invoke-static {v0, v1, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 318
    :goto_0
    iget-object v0, p0, Ll/ۘܶ֫;->᩷:Ljava/io/FileInputStream;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v4, :cond_4

    .line 325
    iget-wide p1, p0, Ll/ۘܶ֫;->᩻:J

    cmp-long p3, p1, v5

    if-nez p3, :cond_3

    :goto_1
    return v4

    .line 327
    :cond_3
    new-instance p1, Ll/ۖܶ֫;

    new-instance p2, Ljava/io/EOFException;

    invoke-direct {p2}, Ljava/io/EOFException;-><init>()V

    const-string p3, "End of stream reached having not read sufficient data."

    .line 97
    invoke-direct {p1, p3, p2, v2}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 327
    throw p1

    .line 334
    :cond_4
    iget-wide p2, p0, Ll/ۘܶ֫;->᩻:J

    cmp-long v0, p2, v5

    if-eqz v0, :cond_5

    int-to-long v0, p1

    sub-long/2addr p2, v0

    .line 335
    iput-wide p2, p0, Ll/ۘܶ֫;->᩻:J

    .line 337
    :cond_5
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ᩳ(I)V

    return p1

    :catch_0
    move-exception p1

    .line 320
    new-instance p2, Ll/ۖܶ֫;

    const/4 p3, 0x0

    .line 97
    invoke-direct {p2, p3, p1, v2}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 320
    throw p2
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 135
    iput-object v0, v1, Ll/ۘܶ֫;->ۜ:Ll/ۗ۠֫;

    .line 136
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    .line 211
    iget-object v2, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v3, v0, Ll/ۗ۠֫;->ܳ:J

    iget-wide v5, v0, Ll/ۗ۠֫;->᩻:J

    invoke-virtual {v2}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    move-result-object v2

    const-string v7, "rawresource"

    .line 214
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    const-string v8, "Resource identifier must be an integer."

    const/16 v9, 0x3ec

    iget-object v10, v1, Ll/ۘܶ֫;->ܿ:Landroid/content/Context;

    const/16 v11, 0x7d0

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v7, :cond_1

    .line 215
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    .line 216
    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v10

    .line 217
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v14

    if-ne v14, v12, :cond_0

    const/4 v11, 0x0

    .line 218
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 297
    :try_start_0
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    .line 299
    :catch_0
    new-instance v0, Ll/ۖܶ֫;

    .line 97
    invoke-direct {v0, v8, v13, v9}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 299
    throw v0

    .line 220
    :cond_0
    new-instance v0, Ll/ۖܶ֫;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "rawresource:// URI must have exactly one path element, found "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 81
    invoke-direct {v0, v2, v13, v11}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 223
    throw v0

    :cond_1
    const-string v7, "android.resource"

    .line 226
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v11

    .line 225
    invoke-static {v7, v11}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_12

    .line 227
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v7

    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "/"

    .line 228
    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 229
    invoke-virtual {v7, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 232
    :cond_2
    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 233
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    .line 234
    :cond_3
    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v11

    .line 235
    :goto_0
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 236
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    goto :goto_1

    .line 240
    :cond_4
    :try_start_1
    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    invoke-virtual {v10, v11}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v10
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_5

    :goto_1
    const-string v12, "\\d+"

    .line 250
    invoke-virtual {v7, v12}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 297
    :try_start_2
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_2
    move v8, v7

    goto :goto_3

    .line 299
    :catch_1
    new-instance v0, Ll/ۖܶ֫;

    .line 97
    invoke-direct {v0, v8, v13, v9}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 299
    throw v0

    :cond_5
    const-string v8, ":"

    .line 0
    invoke-static {v11, v8, v7}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "raw"

    .line 256
    invoke-virtual {v10, v7, v8, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_11

    goto :goto_2

    :goto_3
    move-object v7, v10

    .line 280
    :goto_4
    :try_start_3
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    move-result-object v7
    :try_end_3
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_3 .. :try_end_3} :catch_4

    if-eqz v7, :cond_10

    .line 137
    iput-object v7, v1, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    .line 139
    invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v7

    .line 140
    new-instance v2, Ljava/io/FileInputStream;

    iget-object v9, v1, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v9}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v9

    invoke-direct {v2, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 141
    iput-object v2, v1, Ll/ۘܶ֫;->᩷:Ljava/io/FileInputStream;

    const/16 v9, 0x7d8

    const-wide/16 v10, -0x1

    cmp-long v12, v7, v10

    if-eqz v12, :cond_7

    cmp-long v14, v5, v7

    if-gtz v14, :cond_6

    goto :goto_5

    .line 152
    :cond_6
    :try_start_4
    new-instance v0, Ll/ۖܶ֫;

    .line 97
    invoke-direct {v0, v13, v13, v9}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 152
    throw v0

    .line 157
    :cond_7
    :goto_5
    iget-object v9, v1, Ll/ۘܶ֫;->ܳ:Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v9}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v14

    add-long v10, v14, v5

    .line 159
    invoke-virtual {v2, v10, v11}, Ljava/io/FileInputStream;->skip(J)J

    move-result-wide v9

    sub-long/2addr v9, v14

    cmp-long v11, v9, v5

    if-nez v11, :cond_f

    const-wide/16 v5, 0x0

    if-nez v12, :cond_a

    .line 172
    invoke-static {v2}, Ll/᩶ᩴᩳ;->֫(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v7

    cmp-long v9, v7, v5

    if-nez v9, :cond_8

    const-wide/16 v7, -0x1

    .line 174
    iput-wide v7, v1, Ll/ۘܶ֫;->᩻:J

    goto :goto_6

    .line 176
    :cond_8
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v7

    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->position()J

    move-result-wide v9

    sub-long/2addr v7, v9

    iput-wide v7, v1, Ll/ۘܶ֫;->᩻:J

    cmp-long v2, v7, v5

    if-ltz v2, :cond_9

    goto :goto_6

    .line 179
    :cond_9
    new-instance v0, Ll/ۖܶ֫;

    const/16 v2, 0x7d8

    .line 97
    invoke-direct {v0, v13, v13, v2}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 179
    throw v0

    :cond_a
    sub-long/2addr v7, v9

    .line 186
    iput-wide v7, v1, Ll/ۘܶ֫;->᩻:J
    :try_end_4
    .catch Ll/ۖܶ֫; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    cmp-long v2, v7, v5

    if-ltz v2, :cond_e

    :goto_6
    const-wide/16 v5, -0x1

    cmp-long v2, v3, v5

    if-eqz v2, :cond_c

    .line 200
    iget-wide v7, v1, Ll/ۘܶ֫;->᩻:J

    cmp-long v9, v7, v5

    if-nez v9, :cond_b

    move-wide v5, v3

    goto :goto_7

    :cond_b
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :goto_7
    iput-wide v5, v1, Ll/ۘܶ֫;->᩻:J

    :cond_c
    const/4 v5, 0x1

    .line 202
    iput-boolean v5, v1, Ll/ۘܶ֫;->ۢ:Z

    .line 203
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    if-eqz v2, :cond_d

    return-wide v3

    .line 204
    :cond_d
    iget-wide v2, v1, Ll/ۘܶ֫;->᩻:J

    return-wide v2

    .line 188
    :cond_e
    :try_start_5
    new-instance v0, Ll/᩹۠֫;

    const/16 v2, 0x7d8

    invoke-direct {v0, v2}, Ll/᩹۠֫;-><init>(I)V

    throw v0

    .line 164
    :cond_f
    new-instance v0, Ll/ۖܶ֫;

    const/16 v2, 0x7d8

    .line 97
    invoke-direct {v0, v13, v13, v2}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 164
    throw v0
    :try_end_5
    .catch Ll/ۖܶ֫; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    move-exception v0

    .line 194
    new-instance v2, Ll/ۖܶ֫;

    const/16 v3, 0x7d0

    .line 97
    invoke-direct {v2, v13, v0, v3}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 194
    throw v2

    :catch_3
    move-exception v0

    .line 192
    throw v0

    :cond_10
    const/16 v0, 0x7d0

    .line 287
    new-instance v3, Ll/ۖܶ֫;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Resource is compressed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 97
    invoke-direct {v3, v2, v13, v0}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 287
    throw v3

    :catch_4
    move-exception v0

    move-object v2, v0

    .line 282
    new-instance v0, Ll/ۖܶ֫;

    const/16 v3, 0x7d5

    .line 97
    invoke-direct {v0, v13, v2, v3}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 282
    throw v0

    :cond_11
    const/16 v0, 0x7d5

    .line 261
    new-instance v2, Ll/ۖܶ֫;

    const-string v3, "Resource not found."

    .line 97
    invoke-direct {v2, v3, v13, v0}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 261
    throw v2

    :catch_5
    move-exception v0

    const/16 v2, 0x7d5

    .line 242
    new-instance v3, Ll/ۖܶ֫;

    const-string v4, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility."

    .line 97
    invoke-direct {v3, v4, v0, v2}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 242
    throw v3

    .line 268
    :cond_12
    new-instance v0, Ll/ۖܶ֫;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported URI scheme ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "). Only android.resource is supported."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 97
    invoke-direct {v0, v2, v13, v9}, Ll/᩹۠֫;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 270
    throw v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 344
    iget-object v0, p0, Ll/ۘܶ֫;->ۜ:Ll/ۗ۠֫;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
