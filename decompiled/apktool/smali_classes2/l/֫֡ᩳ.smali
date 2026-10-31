.class public final Ll/֫֡ᩳ;
.super Ljava/lang/Object;
.source "G6MK"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۜ:Z

.field public final ۡ:J

.field public final ۢ:Ll/ۜ᩸ᩳ;

.field public final ۧ:Ll/᩺᩵ᩳ;

.field public ܳ:J

.field public ܽ:Ljava/lang/Exception;

.field public ܿ:Z

.field public final ᩳ:Ll/᩻᩵ᩳ;

.field public final ᩷:Ll/ۘ᩵ᩳ;

.field public final ᩻:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ll/ۘ᩵ᩳ;Ll/᩻᩵ᩳ;)V
    .locals 3

    .line 54
    new-instance v0, Ll/᩺᩵ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Ll/֫֡ᩳ;->᩻:Landroid/os/Handler;

    .line 36
    new-instance v1, Ll/ۜ᩸ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ۜ᩸ᩳ;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Ll/֫֡ᩳ;->ۢ:Ll/ۜ᩸ᩳ;

    const-wide/16 v1, -0x1

    .line 37
    iput-wide v1, p0, Ll/֫֡ᩳ;->ܳ:J

    .line 58
    iput-object p1, p0, Ll/֫֡ᩳ;->᩷:Ll/ۘ᩵ᩳ;

    iput-object p2, p0, Ll/֫֡ᩳ;->ᩳ:Ll/᩻᩵ᩳ;

    iput-object v0, p0, Ll/֫֡ᩳ;->ۧ:Ll/᩺᩵ᩳ;

    const-wide/16 p1, 0x4e20

    iput-wide p1, p0, Ll/֫֡ᩳ;->ۡ:J

    return-void
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 101
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "version=2.26.10 (26101061)\npackage="

    .line 107
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "text-recovery-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ".zip"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".tmp"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v2, 0x0

    .line 112
    :try_start_0
    new-instance v4, Ljava/util/zip/ZipOutputStream;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v5, 0x1

    .line 113
    :try_start_1
    invoke-virtual {v4, v5}, Ljava/util/zip/ZipOutputStream;->setLevel(I)V

    const-string v5, "diagnostics.txt"

    .line 114
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nmanufacturer="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nmodel="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nandroid="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nsdk="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nstateName="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\ndirectory="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 114
    invoke-static {v4, v5, p2}, Ll/֫֡ᩳ;->֫(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "threads.txt"

    .line 119
    invoke-static {}, Ll/֫֡ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, p2, v1}, Ll/֫֡ᩳ;->֫(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "logcat.txt"

    .line 120
    invoke-static {}, Ll/֫֡ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, p2, v1}, Ll/֫֡ᩳ;->֫(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 122
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v1

    .line 124
    invoke-static {v1}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 125
    :try_start_2
    invoke-interface {v5}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷۠ᩴ;

    .line 126
    invoke-interface {v7}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v8

    invoke-interface {v8}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v8

    .line 127
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object v9

    invoke-interface {v9}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object v9

    invoke-interface {v7, v9}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    invoke-static {v8, p1}, Ll/֫֡ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    :cond_1
    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 129
    :cond_2
    :try_start_3
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    .line 130
    new-instance p0, Ll/ۤܽᩳ;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ll/ۤܽᩳ;-><init>(I)V

    invoke-static {p0}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p0

    invoke-static {p2, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 131
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Live diagnostic copy; no session locks acquired.\nFiles may change while copying; before/after sizes and timestamps follow.\n"

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "No session files found.\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const/high16 p1, 0x10000

    new-array p1, p1, [B

    .line 135
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷۠ᩴ;

    invoke-static {v4, v1, v5, p1, p0}, Ll/֫֡ᩳ;->֫(Ljava/util/zip/ZipOutputStream;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[BLjava/lang/StringBuilder;)V

    goto :goto_1

    :cond_4
    const-string p1, "manifest.txt"

    .line 136
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p1, p0}, Ll/֫֡ᩳ;->֫(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 137
    :try_start_4
    invoke-virtual {v4}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 138
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    if-eqz p0, :cond_5

    .line 140
    :try_start_5
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    const/4 v2, 0x1

    goto :goto_4

    .line 138
    :cond_5
    :try_start_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Cannot publish session diagnostics archive"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :catchall_1
    move-exception p0

    if-eqz v5, :cond_6

    .line 124
    :try_start_7
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception p0

    .line 112
    :try_start_9
    invoke-virtual {v4}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception p1

    :try_start_a
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception p0

    :goto_4
    if-nez v2, :cond_7

    .line 142
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 143
    :cond_7
    throw p0
.end method

.method public static ֫(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 194
    new-instance v0, Ljava/util/zip/ZipEntry;

    invoke-direct {v0, p1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 195
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 196
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    return-void
.end method

.method public static ֫(Ljava/util/zip/ZipOutputStream;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[BLjava/lang/StringBuilder;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, " unavailable: "

    .line 157
    const-class v5, Ll/ܶ۠ᩴ;

    const-string v6, "session/"

    invoke-interface/range {p1 .. p2}, Ll/᩷۠ᩴ;->relativize(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v7

    invoke-interface {v7}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x5c

    const/16 v9, 0x2f

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    .line 159
    :try_start_0
    sget-object v8, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v9, 0x1

    new-array v10, v9, [Ll/ܳ۠ᩴ;

    const/4 v11, 0x0

    aput-object v8, v10, v11

    invoke-static {v1, v5, v10}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object v10
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 161
    invoke-interface {v10}, Ll/ܶ۠ᩴ;->isDirectory()Z

    move-result v12

    if-eqz v12, :cond_3

    .line 162
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 163
    invoke-static/range {p2 .. p2}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object v1

    :try_start_1
    invoke-interface {v1}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷۠ᩴ;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 164
    new-instance v1, Ll/ۤܽᩳ;

    const/4 v5, 0x2

    invoke-direct {v1, v5}, Ll/ۤܽᩳ;-><init>(I)V

    invoke-static {v1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v4, v1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 165
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷۠ᩴ;

    move-object/from16 v5, p1

    invoke-static {v0, v5, v4, v2, v3}, Ll/֫֡ᩳ;->֫(Ljava/util/zip/ZipOutputStream;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[BLjava/lang/StringBuilder;)V

    goto :goto_1

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_2

    .line 163
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    throw v2

    .line 166
    :cond_3
    invoke-interface {v10}, Ll/ܶ۠ᩴ;->isRegularFile()Z

    move-result v12

    if-eqz v12, :cond_9

    :try_start_3
    new-array v12, v9, [Ll/᩻۠ᩴ;

    aput-object v8, v12, v11

    .line 168
    invoke-static {v1, v12}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 171
    :try_start_4
    new-instance v8, Ljava/util/zip/ZipEntry;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v8, v6}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 172
    invoke-interface {v10}, Ll/ܶ۠ᩴ;->size()J

    move-result-wide v12

    :goto_3
    const-wide/16 v14, 0x0

    cmp-long v6, v12, v14

    if-lez v6, :cond_6

    .line 175
    array-length v6, v2

    int-to-long v14, v6

    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    long-to-int v6, v14

    invoke-virtual {v4, v2, v11, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-gez v6, :cond_4

    goto :goto_4

    :cond_4
    if-eqz v6, :cond_5

    .line 178
    invoke-virtual {v0, v2, v11, v6}, Ljava/util/zip/ZipOutputStream;->write([BII)V

    int-to-long v14, v6

    sub-long/2addr v12, v14

    goto :goto_3

    .line 177
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Session diagnostic read made no progress"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_6
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 182
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sizeBefore="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v10}, Ll/ܶ۠ᩴ;->size()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " copied="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v10}, Ll/ܶ۠ᩴ;->size()J

    move-result-wide v6

    sub-long/2addr v6, v12

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " modifiedBefore="

    .line 183
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v10}, Ll/ܶ۠ᩴ;->lastModifiedTime()Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ۠ᩴ;->toMillis()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v4, :cond_7

    .line 184
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    :cond_7
    :try_start_5
    new-array v0, v9, [Ll/ܳ۠ᩴ;

    .line 186
    sget-object v2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v2, v0, v11

    invoke-static {v1, v5, v0}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object v0

    const-string v1, " sizeAfter="

    .line 187
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->size()J

    move-result-wide v1

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " modifiedAfter="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->lastModifiedTime()Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ۠ᩴ;->toMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    const-string v1, " afterCopy="

    .line 188
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_5
    const/16 v0, 0xa

    .line 189
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :catchall_2
    move-exception v0

    move-object v1, v0

    if-eqz v4, :cond_8

    .line 170
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_6
    throw v1

    :catch_1
    move-exception v0

    .line 169
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 190
    :cond_9
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " skipped: not a regular file or directory\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_2
    move-exception v0

    .line 160
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static synthetic ֫(Ll/֫֡ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֫֡ᩳ;->ܽ()V

    return-void
.end method

.method public static synthetic ֫(Ll/֫֡ᩳ;Ljava/lang/Exception;)V
    .locals 0

    .line 90
    iput-object p1, p0, Ll/֫֡ᩳ;->ܽ:Ljava/lang/Exception;

    return-void
.end method

.method public static synthetic ֫(Ll/֫֡ᩳ;Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Ll/֫֡ᩳ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const-string v0, ".dat"

    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_5

    const-string v1, ".tat"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, ".lit"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const-string v1, "-"

    .line 148
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 149
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v2

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    if-ge p1, v0, :cond_5

    .line 151
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x30

    if-lt v1, v3, :cond_4

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x39

    if-le v1, v3, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_2
    return v2
.end method

.method public static ۧ(Ll/֫֡ᩳ;Ljava/lang/String;)V
    .locals 3

    .line 87
    iget-object v0, p0, Ll/֫֡ᩳ;->᩻:Landroid/os/Handler;

    :try_start_0
    iget-object v1, p0, Ll/֫֡ᩳ;->ᩳ:Ll/᩻᩵ᩳ;

    iget-object v2, v1, Ll/᩻᩵ᩳ;->֫:Ljava/lang/Object;

    check-cast v2, Ll/᩷۠ᩴ;

    iget-object v1, v1, Ll/᩻᩵ᩳ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 86
    invoke-static {v2, v1, p1}, Ll/֫֡ᩳ;->֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 88
    new-instance v1, Ll/ܰ᩵ᩳ;

    invoke-direct {v1, p0, p1}, Ll/ܰ᩵ᩳ;-><init>(Ll/֫֡ᩳ;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 90
    new-instance v1, Ll/۟᩵ᩳ;

    invoke-direct {v1, p0, p1}, Ll/۟᩵ᩳ;-><init>(Ll/֫֡ᩳ;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private ܽ()V
    .locals 8

    .line 69
    iget-boolean v0, p0, Ll/֫֡ᩳ;->ۜ:Z

    if-eqz v0, :cond_0

    return-void

    .line 72
    :cond_0
    iget-object v0, p0, Ll/֫֡ᩳ;->᩷:Ll/ۘ᩵ᩳ;

    iget-object v1, v0, Ll/ۘ᩵ᩳ;->֫:Ll/᩵᩵ᩳ;

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ܿ(Ll/᩵᩵ᩳ;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ܽ(Ll/᩵᩵ᩳ;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ܳ(Ll/᩵᩵ᩳ;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v1}, Ll/᩵᩵ᩳ;->᩻(Ll/᩵᩵ᩳ;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;

    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;

    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_7

    .line 77
    iget-object v1, v0, Ll/ۘ᩵ᩳ;->֫:Ll/᩵᩵ᩳ;

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡ᩻֫;->isResumed()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {v1}, Ll/᩵᩵ᩳ;->ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۡ᩻֫;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 73
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 74
    iget-wide v3, p0, Ll/֫֡ᩳ;->ܳ:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-gez v7, :cond_1

    iput-wide v1, p0, Ll/֫֡ᩳ;->ܳ:J

    .line 75
    :cond_1
    iget-object v3, p0, Ll/֫֡ᩳ;->֫:Ljava/lang/String;

    if-nez v3, :cond_3

    iget-object v3, p0, Ll/֫֡ᩳ;->ܽ:Ljava/lang/Exception;

    if-eqz v3, :cond_2

    goto :goto_0

    .line 81
    :cond_2
    iget-boolean v3, p0, Ll/֫֡ᩳ;->ܿ:Z

    if-nez v3, :cond_6

    iget-wide v3, p0, Ll/֫֡ᩳ;->ܳ:J

    sub-long v3, v1, v3

    iget-wide v5, p0, Ll/֫֡ᩳ;->ۡ:J

    cmp-long v7, v3, v5

    if-ltz v7, :cond_6

    const/4 v3, 0x1

    .line 82
    iput-boolean v3, p0, Ll/֫֡ᩳ;->ܿ:Z

    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "foregroundWaitMs="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Ll/֫֡ᩳ;->ܳ:J

    sub-long/2addr v1, v4

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    iget-object v0, v0, Ll/ۘ᩵ᩳ;->֫:Ll/᩵᩵ᩳ;

    invoke-static {v0}, Ll/᩵᩵ᩳ;->ۜ(Ll/᩵᩵ᩳ;)Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 85
    :try_start_0
    iget-object v1, p0, Ll/֫֡ᩳ;->ۧ:Ll/᩺᩵ᩳ;

    new-instance v2, Ll/ܺᩴᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v0, v3}, Ll/ܺᩴᩳ;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-virtual {v1, v2}, Ll/᩺᩵ᩳ;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 93
    iput-object v0, p0, Ll/֫֡ᩳ;->ܽ:Ljava/lang/Exception;

    goto :goto_1

    .line 76
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ll/֫֡ᩳ;->ۧ()V

    .line 77
    iget-object v1, p0, Ll/֫֡ᩳ;->֫:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 81
    iget-object v0, v0, Ll/ۘ᩵ᩳ;->֫:Ll/᩵᩵ᩳ;

    invoke-virtual {v0}, Ll/᩵᩵ᩳ;->֫()V

    .line 83
    invoke-static {v0}, Ll/᩵᩵ᩳ;->ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;

    move-result-object v0

    .line 402
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܽ֨ᩳ;

    .line 83
    invoke-static {v0, v1}, Lbin/mt/plus/Main;->֫(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 78
    :cond_4
    iget-object v1, p0, Ll/֫֡ᩳ;->ܽ:Ljava/lang/Exception;

    .line 85
    iget-object v0, v0, Ll/ۘ᩵ᩳ;->֫:Ll/᩵᩵ᩳ;

    invoke-static {v0}, Ll/᩵᩵ᩳ;->ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;

    move-result-object v0

    iget-object v0, v0, Ll/֫ۘᩳ;->۫:Ll/᩶ܶᩳ;

    invoke-virtual {v0, v1}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    return-void

    :cond_5
    const-wide/16 v0, -0x1

    .line 71
    iput-wide v0, p0, Ll/֫֡ᩳ;->ܳ:J

    .line 96
    :cond_6
    :goto_1
    iget-object v0, p0, Ll/֫֡ᩳ;->ۢ:Ll/ۜ᩸ᩳ;

    const-wide/16 v1, 0x3e8

    iget-object v3, p0, Ll/֫֡ᩳ;->᩻:Landroid/os/Handler;

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 70
    :cond_7
    invoke-virtual {p0}, Ll/֫֡ᩳ;->ۧ()V

    return-void
.end method

.method public static ܿ()Ljava/lang/String;
    .locals 8

    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 202
    new-instance v2, Ll/۬ܺܳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/۬ܺܳ;-><init>(I)V

    invoke-static {v2}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 203
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 204
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Thread;

    const/16 v4, 0x22

    .line 205
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\" id="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " state="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 206
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/StackTraceElement;

    array-length v4, v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_0

    aget-object v6, v2, v5

    const-string v7, "    at "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 207
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 209
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ()Ljava/lang/String;
    .locals 10

    const/4 v0, 0x0

    .line 216
    :try_start_0
    new-instance v1, Ljava/lang/ProcessBuilder;

    const-string v2, "logcat"

    const-string v3, "-d"

    const-string v4, "-t"

    const-string v5, "2000"

    const-string v6, "-v"

    const-string v7, "threadtime"

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v3, 0x2000

    :try_start_2
    new-array v4, v3, [B

    .line 219
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0xbb8

    add-long/2addr v5, v7

    .line 220
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    cmp-long v9, v7, v5

    if-gez v9, :cond_2

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v7

    const/high16 v8, 0x200000

    if-ge v7, v8, :cond_2

    .line 221
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v7

    if-lez v7, :cond_1

    .line 223
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v1, v4, v8, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-gez v7, :cond_0

    goto :goto_1

    .line 225
    :cond_0
    invoke-virtual {v2, v4, v8, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 227
    :cond_1
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I
    :try_end_3
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_0
    const-wide/16 v7, 0x14

    .line 228
    :try_start_4
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    .line 231
    :cond_2
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UTF-8"

    invoke-virtual {v2, v4}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n[Log capture bounded to 2000 entries, 2 MiB and 3 seconds]\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 232
    :try_start_5
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v1, :cond_3

    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 236
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    return-object v3

    :catchall_0
    move-exception v3

    .line 217
    :try_start_7
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_8
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v2

    if-eqz v1, :cond_4

    :try_start_9
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    :try_start_a
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v1

    goto :goto_4

    :catch_1
    move-exception v1

    .line 234
    :try_start_b
    instance-of v2, v1, Ljava/lang/InterruptedException;

    if-eqz v2, :cond_5

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 235
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Logcat unavailable: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-eqz v0, :cond_6

    .line 236
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    :cond_6
    return-object v1

    :goto_4
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    :cond_7
    throw v1
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ll/֫֡ᩳ;->ܽ()V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Ll/֫֡ᩳ;->ۜ:Z

    .line 65
    iget-object v0, p0, Ll/֫֡ᩳ;->᩻:Landroid/os/Handler;

    iget-object v1, p0, Ll/֫֡ᩳ;->ۢ:Ll/ۜ᩸ᩳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
