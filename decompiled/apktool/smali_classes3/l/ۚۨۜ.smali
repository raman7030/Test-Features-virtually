.class public final Ll/ۚۨۜ;
.super Ljava/lang/Object;
.source "46LQ"

# interfaces
.implements Ll/֨ۛۜ;
.implements Ljava/lang/AutoCloseable;
.implements Landroid/graphics/drawable/Drawable$Callback;


# instance fields
.field public ֫֫:Z

.field public ۗ:Landroid/graphics/Bitmap;

.field public final ۙ:Ll/֫ۢ֨;

.field public final ۛ:Ll/᩵ۨۜ;

.field public final ۟:J

.field public final ۤ:I

.field public ۧ֫:Z

.field public ۨ:Ljava/lang/Runnable;

.field public ۫:I

.field public final ۬:I

.field public final ܰ:Landroid/os/Handler;

.field public final ܽ֫:I

.field public final ᩳ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public volatile ᩶:Z

.field public ᩸:Z

.field public ᩹:Z

.field public final ᩺:Ll/᩹ۛۜ;


# direct methods
.method public constructor <init>(Ll/֫ۢ֨;Ll/᩵ۨۜ;Ll/᩹ۛۜ;Ll/ۛۛۜ;Landroid/graphics/Bitmap;Ljava/util/concurrent/ScheduledThreadPoolExecutor;J)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۚۨۜ;->ܰ:Landroid/os/Handler;

    .line 47
    iput-object p6, p0, Ll/ۚۨۜ;->ᩳ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iput-wide p7, p0, Ll/ۚۨۜ;->۟:J

    .line 48
    iput-object p1, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    iput-object p2, p0, Ll/ۚۨۜ;->ۛ:Ll/᩵ۨۜ;

    iput-object p3, p0, Ll/ۚۨۜ;->᩺:Ll/᩹ۛۜ;

    iput-object p5, p0, Ll/ۚۨۜ;->ۗ:Landroid/graphics/Bitmap;

    .line 49
    iget p2, p4, Ll/ۛۛۜ;->᩻:I

    iput p2, p0, Ll/ۚۨۜ;->ܽ֫:I

    iget p2, p4, Ll/ۛۛۜ;->ܽ:I

    iput p2, p0, Ll/ۚۨۜ;->ۤ:I

    .line 50
    iget p2, p4, Ll/ۛۛۜ;->ۧ:I

    iput p2, p0, Ll/ۚۨۜ;->۬:I

    .line 51
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-void
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)Ll/ۚۨۜ;
    .locals 19

    move-object/from16 v0, p2

    move-wide/from16 v1, p3

    move-object/from16 v3, p5

    const-wide/32 v4, 0x8000

    .line 154
    invoke-virtual {v0, v4, v5}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object v4

    const-string v5, "GIF reservation exceeds budget"

    if-eqz v4, :cond_b

    .line 106
    :try_start_0
    new-instance v6, Ljava/io/BufferedInputStream;

    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object v7

    const v8, 0x8000

    invoke-direct {v6, v7, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 107
    :try_start_1
    invoke-static {v6, v3}, Ll/ۚۨۜ;->֫(Ljava/io/BufferedInputStream;Ll/ۡ᩺ۜ;)Ll/ۛۛۜ;

    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v4}, Ll/᩹ۛۜ;->close()V

    .line 109
    invoke-static {v13, v1, v2}, Ll/ۚۨۜ;->֫(Ll/ۛۛۜ;J)Ll/۠ۛۜ;

    move-result-object v4

    iget-wide v6, v4, Ll/۠ۛۜ;->֫:J

    .line 110
    invoke-virtual/range {p2 .. p2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v8

    invoke-virtual/range {p2 .. p2}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v10

    sub-long/2addr v8, v10

    invoke-static {v1, v2, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-static {v13, v1, v2}, Ll/ۚۨۜ;->֫(Ll/ۛۛۜ;J)Ll/۠ۛۜ;

    move-result-object v1

    .line 111
    iget v2, v1, Ll/۠ۛۜ;->ۧ:I

    .line 112
    iget-wide v8, v1, Ll/۠ۛۜ;->֫:J

    .line 154
    invoke-virtual {v0, v8, v9}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object v1

    if-eqz v1, :cond_a

    const/4 v4, 0x0

    .line 117
    :try_start_3
    invoke-static/range {p5 .. p5}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 118
    new-instance v0, Ll/ۧۢ֨;

    .line 7
    invoke-direct {v0}, Ll/ܽۢ֨;-><init>()V

    .line 118
    invoke-virtual {v0, v2}, Ll/ܽۢ֨;->֫(I)Ll/ۧۢ֨;

    move-result-object v0

    move-object/from16 v5, p6

    .line 119
    invoke-virtual {v0, v5}, Ll/ܽۢ֨;->֫(Ljava/util/concurrent/ScheduledThreadPoolExecutor;)Ll/ۧۢ֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢ֨;->ۧ()Ll/ۧۢ֨;

    move-result-object v0

    .line 120
    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v8

    invoke-virtual {v0, v8}, Ll/ܽۢ֨;->֫(Ljava/io/File;)V

    move-object/from16 v9, p0

    move-object v8, v4

    goto :goto_0

    .line 121
    :cond_0
    new-instance v8, Ll/᩵ۨۜ;

    move-object/from16 v9, p0

    invoke-direct {v8, v9, v3}, Ll/᩵ۨۜ;-><init>(Ll/᩺ۨۜ;Ll/ۡ᩺ۜ;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_6

    :try_start_4
    invoke-virtual {v0, v8}, Ll/ܽۢ֨;->֫(Ljava/io/InputStream;)V

    .line 122
    :goto_0
    invoke-virtual {v0}, Ll/ܽۢ֨;->֫()Ll/֫ۢ֨;

    move-result-object v18
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3

    .line 123
    :try_start_5
    invoke-virtual/range {v18 .. v18}, Ll/֫ۢ֨;->stop()V

    if-eqz v8, :cond_2

    .line 389
    iget-object v0, v8, Ll/᩵ۨۜ;->᩶:Ljava/io/IOException;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    throw v0

    .line 125
    :cond_2
    :goto_1
    invoke-static/range {p5 .. p5}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 126
    invoke-virtual/range {v18 .. v18}, Ll/֫ۢ֨;->ܳ()I

    move-result v0

    iget v10, v13, Ll/ۛۛۜ;->ۧ:I

    if-ne v0, v10, :cond_6

    .line 127
    invoke-virtual/range {v18 .. v18}, Ll/֫ۢ֨;->֫()J

    move-result-wide v10

    invoke-virtual/range {v18 .. v18}, Ll/֫ۢ֨;->ܿ()J

    move-result-wide v14

    add-long/2addr v10, v14

    .line 128
    iget v0, v13, Ll/ۛۛۜ;->᩻:I

    iget v12, v13, Ll/ۛۛۜ;->ܽ:I

    invoke-static {v0, v12, v2}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v14

    const-wide/16 v16, 0x2

    mul-long v14, v14, v16

    add-long/2addr v14, v10

    invoke-virtual {v1}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v10

    cmp-long v0, v14, v10

    if-gtz v0, :cond_5

    .line 130
    invoke-virtual/range {v18 .. v18}, Ll/֫ۢ֨;->ۧ()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 131
    invoke-virtual/range {v18 .. v18}, Ll/֫ۢ֨;->ᩳ()Ll/ᩳۢ֨;

    move-result-object v0

    sget-object v2, Ll/ᩳۢ֨;->ܽ֫:Ll/ᩳۢ֨;

    if-ne v0, v2, :cond_4

    .line 132
    invoke-virtual/range {p0 .. p1}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 133
    invoke-static/range {p5 .. p5}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    if-eqz v8, :cond_3

    .line 134
    new-instance v0, Ll/ۨۘᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v8, Ll/᩵ۨۜ;->᩸:Ll/ܿۖ᩷;

    .line 135
    :cond_3
    new-instance v0, Ll/ۚۨۜ;

    move-object v9, v0

    move-object/from16 v10, v18

    move-object v11, v8

    move-object v12, v1

    move-object v14, v4

    move-object/from16 v15, p6

    move-wide/from16 v16, v6

    invoke-direct/range {v9 .. v17}, Ll/ۚۨۜ;-><init>(Ll/֫ۢ֨;Ll/᩵ۨۜ;Ll/᩹ۛۜ;Ll/ۛۛۜ;Landroid/graphics/Bitmap;Ljava/util/concurrent/ScheduledThreadPoolExecutor;J)V

    return-object v0

    .line 131
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "GIF first frame could not be decoded"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_4

    .line 129
    :cond_5
    new-instance v0, Ll/֨ۨۜ;

    const-string v2, "GIF native allocation exceeds reservation"

    .line 330
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 129
    throw v0

    .line 126
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v2, "GIF frame count changed during decode"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    :goto_2
    move-object/from16 v18, v4

    goto :goto_4

    :catch_6
    move-exception v0

    goto :goto_3

    :catch_7
    move-exception v0

    goto :goto_3

    :catch_8
    move-exception v0

    :goto_3
    move-object v8, v4

    move-object/from16 v18, v8

    :goto_4
    if-eqz v4, :cond_7

    .line 137
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_7
    if-eqz v18, :cond_8

    .line 138
    invoke-virtual/range {v18 .. v18}, Ll/֫ۢ֨;->ۜ()V

    :cond_8
    if-eqz v8, :cond_9

    .line 139
    invoke-virtual {v8}, Ll/᩵ۨۜ;->close()V

    .line 140
    :cond_9
    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    .line 141
    throw v0

    .line 155
    :cond_a
    new-instance v0, Ll/֨ۨۜ;

    .line 330
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 155
    throw v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 106
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_7
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    .line 108
    invoke-virtual {v4}, Ll/᩹ۛۜ;->close()V

    throw v0

    .line 155
    :cond_b
    new-instance v0, Ll/֨ۨۜ;

    .line 330
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 155
    throw v0
.end method

.method public static ֫(Ljava/io/BufferedInputStream;Ll/ۡ᩺ۜ;)Ll/ۛۛۜ;
    .locals 21

    .line 265
    new-instance v0, Ll/֡ۨۜ;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Ll/֡ۨۜ;-><init>(Ljava/io/BufferedInputStream;Ll/ۡ᩺ۜ;)V

    const/16 v1, 0xd

    new-array v2, v1, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 267
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v5

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 268
    :cond_0
    aget-byte v1, v2, v3

    const/16 v3, 0x47

    if-ne v1, v3, :cond_12

    const/4 v1, 0x1

    aget-byte v3, v2, v1

    const/16 v4, 0x49

    if-ne v3, v4, :cond_12

    const/4 v3, 0x2

    aget-byte v4, v2, v3

    const/16 v5, 0x46

    if-ne v4, v5, :cond_12

    const/4 v4, 0x3

    aget-byte v5, v2, v4

    const/16 v6, 0x38

    if-ne v5, v6, :cond_12

    const/4 v5, 0x4

    aget-byte v6, v2, v5

    const/16 v7, 0x37

    if-eq v6, v7, :cond_1

    const/16 v7, 0x39

    if-ne v6, v7, :cond_12

    :cond_1
    const/4 v6, 0x5

    aget-byte v6, v2, v6

    const/16 v7, 0x61

    if-ne v6, v7, :cond_12

    const/4 v6, 0x6

    .line 270
    aget-byte v6, v2, v6

    and-int/lit16 v6, v6, 0xff

    const/4 v7, 0x7

    aget-byte v8, v2, v7

    and-int/lit16 v8, v8, 0xff

    const/16 v9, 0x8

    shl-int/2addr v8, v9

    or-int v11, v6, v8

    .line 271
    aget-byte v6, v2, v9

    and-int/lit16 v6, v6, 0xff

    const/16 v8, 0x9

    aget-byte v8, v2, v8

    and-int/lit16 v8, v8, 0xff

    shl-int/2addr v8, v9

    or-int v12, v6, v8

    .line 272
    sget-object v6, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-virtual {v6, v11, v12}, Ll/᩶ۨۜ;->֫(II)V

    const/16 v6, 0xa

    .line 273
    aget-byte v2, v2, v6

    and-int/lit16 v6, v2, 0x80

    if-eqz v6, :cond_2

    and-int/2addr v2, v7

    add-int/2addr v2, v1

    shl-int v1, v4, v2

    int-to-long v1, v1

    goto :goto_1

    :cond_2
    const-wide/16 v1, 0x0

    :goto_1
    long-to-int v6, v1

    .line 274
    invoke-virtual {v0, v6}, Ll/֡ۨۜ;->֫(I)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-wide/from16 v18, v1

    const-wide/16 p0, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v15, 0x0

    const/16 v20, 0x0

    .line 279
    :goto_2
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v6

    const/16 v10, 0x3b

    if-ne v6, v10, :cond_4

    if-eqz v8, :cond_3

    .line 282
    new-instance v0, Ll/ۛۛۜ;

    move-object v10, v0

    move v13, v8

    move-wide v14, v1

    move-wide/from16 v16, p0

    invoke-direct/range {v10 .. v20}, Ll/ۛۛۜ;-><init>(IIIJJJZ)V

    return-object v0

    .line 281
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "GIF contains no frames"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/16 v10, 0x21

    if-ne v6, v10, :cond_b

    .line 285
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v6

    const/16 v10, 0xf9

    if-ne v6, v10, :cond_8

    .line 287
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v6

    if-ne v6, v5, :cond_7

    .line 288
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v5

    shr-int v3, v5, v3

    and-int/2addr v3, v7

    if-ne v3, v4, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    or-int v20, v20, v3

    .line 289
    invoke-virtual {v0, v4}, Ll/֡ۨۜ;->֫(I)V

    .line 290
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v3

    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid GIF graphics terminator"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 287
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid GIF graphics control"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const-wide/16 v3, 0x0

    .line 342
    :goto_4
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v5

    if-eqz v5, :cond_9

    int-to-long v13, v5

    add-long/2addr v3, v13

    invoke-virtual {v0, v5}, Ll/֡ۨۜ;->֫(I)V

    goto :goto_4

    :cond_9
    const/16 v5, 0xfe

    if-ne v6, v5, :cond_a

    add-long/2addr v1, v3

    :cond_a
    :goto_5
    move-wide/from16 v6, p0

    goto :goto_8

    :cond_b
    const/4 v3, 0x3

    const/16 v4, 0x2c

    if-ne v6, v4, :cond_11

    .line 296
    invoke-virtual {v0}, Ll/֡ۨۜ;->ۧ()I

    move-result v4

    invoke-virtual {v0}, Ll/֡ۨۜ;->ۧ()I

    move-result v5

    invoke-virtual {v0}, Ll/֡ۨۜ;->ۧ()I

    move-result v6

    invoke-virtual {v0}, Ll/֡ۨۜ;->ۧ()I

    move-result v7

    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v10

    if-lez v6, :cond_10

    if-lez v7, :cond_10

    add-int/2addr v4, v6

    if-gt v4, v11, :cond_10

    add-int/2addr v5, v7

    if-gt v5, v12, :cond_10

    add-int/lit8 v8, v8, 0x1

    int-to-long v4, v6

    int-to-long v6, v7

    mul-long v4, v4, v6

    cmp-long v6, v4, v15

    if-lez v6, :cond_c

    add-long v6, v15, v4

    move-wide/from16 v13, p0

    .line 301
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-wide v15, v4

    goto :goto_6

    :cond_c
    move-wide/from16 v13, p0

    move-wide v6, v13

    :goto_6
    and-int/lit16 v4, v10, 0x80

    if-eqz v4, :cond_d

    and-int/lit8 v4, v10, 0x7

    add-int/lit8 v4, v4, 0x1

    shl-int/2addr v3, v4

    int-to-long v4, v3

    add-long v18, v18, v4

    .line 305
    invoke-virtual {v0, v3}, Ll/֡ۨۜ;->֫(I)V

    .line 307
    :cond_d
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_f

    if-gt v3, v9, :cond_f

    .line 342
    :goto_7
    invoke-virtual {v0}, Ll/֡ۨۜ;->֫()I

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v0, v3}, Ll/֡ۨۜ;->֫(I)V

    goto :goto_7

    :cond_e
    :goto_8
    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v10, 0x7

    move-wide/from16 p0, v6

    const/4 v7, 0x7

    goto/16 :goto_2

    .line 308
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid GIF code size"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 298
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "GIF frame exceeds safe bounds"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 310
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid GIF block"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 269
    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid GIF header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۛۛۜ;J)Ll/۠ۛۜ;
    .locals 20

    move-object/from16 v0, p0

    .line 148
    iget v1, v0, Ll/ۛۛۜ;->ۧ:I

    int-to-long v1, v1

    const-wide/16 v3, 0x80

    mul-long v1, v1, v3

    iget-wide v3, v0, Ll/ۛۛۜ;->ܿ:J

    add-long/2addr v1, v3

    const-wide/16 v3, 0x800

    iget-wide v5, v0, Ll/ۛۛۜ;->֫:J

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    add-long v5, v3, v1

    .line 149
    iget-wide v9, v0, Ll/ۛۛۜ;->ܳ:J

    const-wide/16 v7, 0x2

    const-wide/32 v11, 0x10000

    invoke-static/range {v5 .. v12}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v13

    .line 150
    iget v15, v0, Ll/ۛۛۜ;->᩻:I

    iget v1, v0, Ll/ۛۛۜ;->ܽ:I

    iget-boolean v0, v0, Ll/ۛۛۜ;->ᩳ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    const/16 v17, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    const/16 v17, 0x3

    :goto_0
    move/from16 v16, v1

    move-wide/from16 v18, p1

    invoke-static/range {v13 .. v19}, Ll/ܶۛۜ;->֫(JIIIJ)Ll/۠ۛۜ;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۚۨۜ;I)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 199
    :try_start_0
    iget-boolean v2, p0, Ll/ۚۨۜ;->᩶:Z

    if-nez v2, :cond_4

    .line 200
    iget-object v1, p0, Ll/ۚۨۜ;->ۛ:Ll/᩵ۨۜ;

    if-eqz v1, :cond_1

    .line 389
    iget-object v1, v1, Ll/᩵ۨۜ;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    throw v1

    .line 201
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {v1}, Ll/֫ۢ֨;->ᩳ()Ll/ᩳۢ֨;

    move-result-object v1

    sget-object v2, Ll/ᩳۢ֨;->ܽ֫:Ll/ᩳۢ֨;

    if-ne v1, v2, :cond_3

    .line 202
    iget-object v1, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {v1}, Ll/֫ۢ֨;->ۧ()Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 204
    :try_start_1
    iget-object v2, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {v2}, Ll/֫ۢ֨;->᩻()Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ll/ۚۨۜ;->۬:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 205
    :cond_2
    iget-object v2, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {v2}, Ll/֫ۢ֨;->ܽ()I

    move-result v2

    iget v3, p0, Ll/ۚۨۜ;->۬:I

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, -0x1

    rem-int/2addr v2, v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    .line 206
    :goto_1
    :try_start_2
    iget-object v3, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {v3}, Ll/֫ۢ֨;->isRunning()Z

    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    nop

    goto :goto_3

    .line 201
    :cond_3
    :try_start_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "GIF frame could not be decoded"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1

    :cond_4
    const/4 v2, 0x0

    move-object v1, v0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_2
    move v8, v0

    move-object v6, v1

    move v7, v2

    goto :goto_4

    :catch_1
    move-object v1, v0

    :catch_2
    const/4 v2, 0x0

    :goto_3
    if-eqz v1, :cond_5

    .line 209
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 211
    :cond_5
    iget-object v1, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {v1}, Ll/֫ۢ֨;->stop()V

    const/4 v1, 0x0

    move-object v6, v0

    move v7, v2

    const/4 v8, 0x0

    .line 216
    :goto_4
    iget-object v0, p0, Ll/ۚۨۜ;->ܰ:Landroid/os/Handler;

    new-instance v1, Ll/᩷ۨۜ;

    move-object v3, v1

    move-object v4, p0

    move v5, p1

    invoke-direct/range {v3 .. v8}, Ll/᩷ۨۜ;-><init>(Ll/ۚۨۜ;ILandroid/graphics/Bitmap;IZ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۚۨۜ;ILandroid/graphics/Bitmap;Z)V
    .locals 2

    const/4 v0, 0x0

    .line 217
    iput-boolean v0, p0, Ll/ۚۨۜ;->᩹:Z

    .line 218
    iget-boolean v1, p0, Ll/ۚۨۜ;->᩶:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/ۚۨۜ;->᩸:Z

    if-eqz v1, :cond_3

    iget v1, p0, Ll/ۚۨۜ;->۫:I

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    .line 223
    iput-boolean v0, p0, Ll/ۚۨۜ;->᩸:Z

    return-void

    .line 224
    :cond_1
    iget-object p1, p0, Ll/ۚۨۜ;->ۗ:Landroid/graphics/Bitmap;

    .line 225
    iput-object p2, p0, Ll/ۚۨۜ;->ۗ:Landroid/graphics/Bitmap;

    .line 227
    iput-boolean p3, p0, Ll/ۚۨۜ;->᩸:Z

    .line 228
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 229
    iget-object p1, p0, Ll/ۚۨۜ;->ۨ:Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 230
    :cond_2
    iget-boolean p1, p0, Ll/ۚۨۜ;->֫֫:Z

    if-eqz p1, :cond_5

    invoke-direct {p0}, Ll/ۚۨۜ;->ᩳ()V

    return-void

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    .line 219
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    .line 220
    :cond_4
    iget-boolean p1, p0, Ll/ۚۨۜ;->᩶:Z

    if-nez p1, :cond_5

    iget-boolean p1, p0, Ll/ۚۨۜ;->᩸:Z

    if-eqz p1, :cond_5

    invoke-direct {p0}, Ll/ۚۨۜ;->ᩳ()V

    :cond_5
    return-void
.end method

.method public static synthetic ֫(Ll/ۚۨۜ;Ll/᩹ۛۜ;)V
    .locals 2

    const/4 v0, 0x0

    .line 243
    iput-boolean v0, p0, Ll/ۚۨۜ;->ۧ֫:Z

    iput-boolean v0, p0, Ll/ۚۨۜ;->᩸:Z

    const/4 v0, 0x0

    .line 244
    iput-object v0, p0, Ll/ۚۨۜ;->ۨ:Ljava/lang/Runnable;

    .line 245
    iget-object v0, p0, Ll/ۚۨۜ;->ۗ:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 246
    iget-object v0, p0, Ll/ۚۨۜ;->ᩳ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Ll/ۜۨۜ;

    invoke-direct {v1, p0, p1}, Ll/ۜۨۜ;-><init>(Ll/ۚۨۜ;Ll/᩹ۛۜ;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۚۨۜ;Z)V
    .locals 1

    .line 179
    iget-boolean v0, p0, Ll/ۚۨۜ;->᩶:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    .line 181
    iget-object p1, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {p1}, Ll/֫ۢ֨;->᩻()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p0, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {p0}, Ll/֫ۢ֨;->᩷()V

    return-void

    .line 182
    :cond_1
    iget-object p0, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {p0}, Ll/֫ۢ֨;->start()V

    return-void

    .line 183
    :cond_2
    iget-object p0, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    invoke-virtual {p0}, Ll/֫ۢ֨;->stop()V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۚۨۜ;Ll/᩹ۛۜ;)V
    .locals 0

    .line 253
    iget-object p0, p0, Ll/ۚۨۜ;->᩺:Ll/᩹ۛۜ;

    invoke-virtual {p0}, Ll/᩹ۛۜ;->close()V

    if-eqz p1, :cond_0

    .line 254
    invoke-virtual {p1}, Ll/᩹ۛۜ;->close()V

    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/ۚۨۜ;Ll/᩹ۛۜ;)V
    .locals 5

    .line 247
    iget-object v0, p0, Ll/ۚۨۜ;->ܰ:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۚۨۜ;->ᩳ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v2, p0, Ll/ۚۨۜ;->ۛ:Ll/᩵ۨۜ;

    iget-object v3, p0, Ll/ۚۨۜ;->ۙ:Ll/֫ۢ֨;

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    invoke-virtual {v3}, Ll/֫ۢ֨;->ۜ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 249
    invoke-virtual {v2}, Ll/᩵ۨۜ;->close()V

    .line 250
    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 252
    new-instance v1, Ll/ۢۨۜ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ll/ۢۨۜ;-><init>(Ll/֨ۛۜ;Ll/᩹ۛۜ;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v3

    if-eqz v2, :cond_1

    .line 249
    invoke-virtual {v2}, Ll/᩵ۨۜ;->close()V

    .line 250
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 252
    new-instance v1, Ll/ۢۨۜ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ll/ۢۨۜ;-><init>(Ll/֨ۛۜ;Ll/᩹ۛۜ;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 256
    throw v3
.end method

.method private ᩳ()V
    .locals 3

    .line 189
    iget-boolean v0, p0, Ll/ۚۨۜ;->᩶:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/ۚۨۜ;->᩸:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 190
    :cond_0
    iget-boolean v0, p0, Ll/ۚۨۜ;->᩹:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Ll/ۚۨۜ;->֫֫:Z

    return-void

    .line 191
    :cond_1
    iput-boolean v1, p0, Ll/ۚۨۜ;->᩹:Z

    const/4 v0, 0x0

    .line 192
    iput-boolean v0, p0, Ll/ۚۨۜ;->֫֫:Z

    .line 193
    iget v0, p0, Ll/ۚۨۜ;->۫:I

    .line 194
    iget-object v1, p0, Ll/ۚۨۜ;->ᩳ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v2, Ll/ۘۨۜ;

    invoke-direct {v2, p0, v0}, Ll/ۘۨۜ;-><init>(Ll/ۚۨۜ;I)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 235
    invoke-virtual {p0, v0}, Ll/ۚۨۜ;->֫(Ll/᩹ۛۜ;)V

    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 159
    invoke-direct {p0}, Ll/ۚۨۜ;->ᩳ()V

    return-void
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 160
    iget-object p1, p0, Ll/ۚۨۜ;->ܰ:Landroid/os/Handler;

    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 161
    iget-object p1, p0, Ll/ۚۨۜ;->ܰ:Landroid/os/Handler;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 164
    iget-object v0, p0, Ll/ۚۨۜ;->᩺:Ll/᩹ۛۜ;

    invoke-virtual {v0}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 2

    .line 168
    iget-boolean v0, p0, Ll/ۚۨۜ;->᩶:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۚۨۜ;->ۗ:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p2, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩹ۛۜ;)V
    .locals 2

    move-object v0, p0

    .line 238
    monitor-enter v0

    .line 239
    :try_start_0
    iget-boolean v1, p0, Ll/ۚۨۜ;->᩶:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 240
    iput-boolean v1, p0, Ll/ۚۨۜ;->᩶:Z

    .line 241
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    new-instance v0, Ll/ᩴۨۜ;

    invoke-direct {v0, p0, p1}, Ll/ᩴۨۜ;-><init>(Ll/ۚۨۜ;Ll/᩹ۛۜ;)V

    .line 259
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_1

    invoke-virtual {v0}, Ll/ᩴۨۜ;->run()V

    return-void

    .line 260
    :cond_1
    iget-object p1, p0, Ll/ۚۨۜ;->ܰ:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    .line 241
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(ZLl/۠᩺ۜ;)V
    .locals 1

    .line 171
    iget-boolean v0, p0, Ll/ۚۨۜ;->᩶:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 172
    :goto_0
    iput-object p2, p0, Ll/ۚۨۜ;->ۨ:Ljava/lang/Runnable;

    .line 165
    iget p2, p0, Ll/ۚۨۜ;->۬:I

    const/4 v0, 0x1

    if-le p2, v0, :cond_2

    const/4 p2, 0x1

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    and-int/2addr p1, p2

    .line 174
    iget-boolean p2, p0, Ll/ۚۨۜ;->ۧ֫:Z

    if-ne p1, p2, :cond_3

    :goto_2
    return-void

    .line 175
    :cond_3
    iput-boolean p1, p0, Ll/ۚۨۜ;->ۧ֫:Z

    iput-boolean p1, p0, Ll/ۚۨۜ;->᩸:Z

    .line 176
    iget p2, p0, Ll/ۚۨۜ;->۫:I

    add-int/2addr p2, v0

    iput p2, p0, Ll/ۚۨۜ;->۫:I

    .line 178
    iget-object p2, p0, Ll/ۚۨۜ;->ᩳ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v0, Ll/ۖۨۜ;

    invoke-direct {v0, p0, p1}, Ll/ۖۨۜ;-><init>(Ll/ۚۨۜ;Z)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܽ()J
    .locals 5

    .line 163
    iget-object v0, p0, Ll/ۚۨۜ;->᩺:Ll/᩹ۛۜ;

    invoke-virtual {v0}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۚۨۜ;->۟:J

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    return-wide v2

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method
