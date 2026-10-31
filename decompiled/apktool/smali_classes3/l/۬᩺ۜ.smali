.class public final Ll/۬᩺ۜ;
.super Ljava/lang/Object;
.source "P6N0"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "image"

    if-eqz p0, :cond_c

    .line 115
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 116
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 117
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 118
    invoke-virtual {p0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    .line 119
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v3, v5

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_1

    const/16 v5, 0x5c

    if-eq v4, v5, :cond_1

    .line 120
    invoke-static {v4}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    const/16 v4, 0x5f

    :cond_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 123
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "."

    .line 124
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, ".."

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const/16 v0, 0x2e

    .line 126
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const-string v1, ".9.png"

    .line 127
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x6

    :cond_5
    if-lez v0, :cond_6

    .line 128
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v0

    const/16 v3, 0x14

    if-gt v1, v3, :cond_6

    .line 129
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 130
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_6
    const-string v1, ""

    :goto_1
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 134
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_b

    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    const/16 v5, 0x80

    if-ge v4, v5, :cond_7

    const/4 v5, 0x1

    goto :goto_3

    :cond_7
    const/16 v5, 0x800

    if-ge v4, v5, :cond_8

    const/4 v5, 0x2

    goto :goto_3

    :cond_8
    const/high16 v5, 0x10000

    if-ge v4, v5, :cond_9

    const/4 v5, 0x3

    goto :goto_3

    :cond_9
    const/4 v5, 0x4

    :goto_3
    add-int/2addr v3, v5

    const/16 v5, 0xa0

    if-le v3, v5, :cond_a

    goto :goto_4

    .line 139
    :cond_a
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v0, v4

    goto :goto_2

    .line 141
    :cond_b
    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_c
    :goto_5
    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;Ll/ۜܶۜ;)Ll/ۗ᩺ۜ;
    .locals 20

    move-object/from16 v0, p1

    .line 96
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const-string v3, "Image export must run in the background"

    if-eq v1, v2, :cond_d

    .line 33
    new-instance v1, Ljava/io/File;

    sget-object v2, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    .line 96
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    if-eq v4, v5, :cond_c

    .line 42
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v4, p0

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_b

    const/4 v4, 0x0

    .line 50
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    .line 51
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v6, v9, :cond_8

    .line 52
    invoke-static/range {p1 .. p1}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 53
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩺ۨۜ;

    invoke-static {v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    instance-of v10, v9, Ll/ۛ᩺ۜ;

    if-nez v10, :cond_7

    .line 56
    invoke-virtual {v9}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v10

    .line 57
    invoke-virtual {v9}, Ll/᩺ۨۜ;->ܽ()Ljava/io/File;

    move-result-object v11

    if-eqz v11, :cond_0

    .line 58
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-virtual {v11}, Ljava/io/File;->canRead()Z

    move-result v12

    if-eqz v12, :cond_0

    .line 59
    invoke-virtual {v9, v10}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 60
    sget-object v9, Ll/ۨ᩵ܿ;->᩸:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    goto/16 :goto_2

    .line 63
    :cond_0
    iget-wide v11, v10, Ll/ۨۨۜ;->ܽ:J

    const-wide/32 v13, 0x20000000

    sub-long/2addr v13, v7

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    const-wide/32 v2, 0x10000000

    cmp-long v19, v11, v2

    if-gtz v19, :cond_6

    cmp-long v19, v11, v13

    if-gtz v19, :cond_6

    if-nez v4, :cond_1

    .line 64
    invoke-static {v1}, Ll/۬᩺ۜ;->ۧ(Ljava/io/File;)Ljava/io/File;

    move-result-object v4

    .line 65
    :cond_1
    new-instance v11, Ljava/io/File;

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v4, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 66
    invoke-virtual {v11}, Ljava/io/File;->mkdir()Z

    move-result v12

    if-eqz v12, :cond_5

    .line 67
    new-instance v12, Ljava/io/File;

    const-string v15, ".partial"

    invoke-direct {v12, v11, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    new-instance v15, Ll/ۙ᩺ۜ;

    .line 70
    invoke-static {v2, v3, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-direct {v15, v12, v2, v3, v0}, Ll/ۙ᩺ۜ;-><init>(Ljava/io/File;JLl/ۜܶۜ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v2, 0x1

    .line 71
    :try_start_1
    invoke-virtual {v9, v15, v2, v0}, Ll/᩺ۨۜ;->֫(Ljava/io/OutputStream;ZLl/ܿۖ᩷;)V

    .line 72
    invoke-static/range {p1 .. p1}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 73
    iget-wide v2, v15, Ll/ۙ᩺ۜ;->᩹:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :try_start_2
    invoke-virtual {v15}, Ll/ۙ᩺ۜ;->close()V

    .line 75
    invoke-virtual {v9, v10}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 76
    iget-wide v13, v10, Ll/ۨۨۜ;->ܽ:J

    const-wide/16 v15, 0x0

    cmp-long v10, v13, v15

    if-ltz v10, :cond_3

    cmp-long v10, v2, v13

    if-nez v10, :cond_2

    goto :goto_1

    .line 77
    :cond_2
    new-instance v0, Ll/ۛۨۜ;

    const-string v1, "Image export size differs from source snapshot"

    .line 175
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 77
    throw v0

    .line 78
    :cond_3
    :goto_1
    new-instance v10, Ljava/io/File;

    invoke-virtual {v9}, Ll/᩺ۨۜ;->ᩳ()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/۬᩺ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v10, v11, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 79
    invoke-virtual {v12, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v9

    if-eqz v9, :cond_4

    add-long/2addr v7, v2

    .line 81
    sget-object v2, Ll/ۨ᩵ܿ;->᩸:Ljava/lang/String;

    .line 60
    invoke-virtual {v10}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 81
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto/16 :goto_0

    .line 79
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot publish image export file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 69
    :try_start_3
    invoke-virtual {v15}, Ll/ۙ᩺ۜ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1

    .line 66
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot create image export directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Image export exceeds byte limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Sharing requires the original image source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object/from16 v17, v2

    .line 83
    invoke-static/range {p1 .. p1}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    if-eqz v4, :cond_a

    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Ljava/io/File;->setLastModified(J)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_4

    .line 86
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot timestamp image export directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_a
    :goto_4
    new-instance v0, Ll/ۗ᩺ۜ;

    move-object/from16 v1, v17

    invoke-direct {v0, v5, v4, v1}, Ll/ۗ᩺ۜ;-><init>(Ljava/util/ArrayList;Ljava/io/File;Ljava/util/concurrent/Executor;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-object v0

    :catchall_2
    move-exception v0

    .line 91
    invoke-static {v4}, Ll/۬᩺ۜ;->ܽ(Ljava/io/File;)V

    .line 92
    throw v0

    .line 45
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No images selected for export"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ֫(Ljava/io/File;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۬᩺ۜ;->ܽ(Ljava/io/File;)V

    return-void
.end method

.method public static ۧ(Ljava/io/File;)Ljava/io/File;
    .locals 6

    .line 105
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Cannot create image export parent"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x8

    if-ge v0, v1, :cond_3

    .line 107
    new-instance v1, Ljava/io/File;

    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-int v3, v2

    .line 77
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    const v4, 0x6c5131e1

    add-int/2addr v2, v4

    .line 78
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "temp_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v5, 0x24

    invoke-static {v2, v5}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-static {v3, v5}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 107
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 108
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 110
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Cannot create unique image export batch"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ(Ljava/io/File;)V
    .locals 8

    if-nez p0, :cond_0

    return-void

    .line 146
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 148
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 149
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 151
    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 153
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 157
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 161
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    return-void
.end method
