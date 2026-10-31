.class public final Ll/ۨ᩺ۜ;
.super Ljava/lang/Object;
.source "S6MO"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Ljava/lang/Thread;

.field public final ۙ:J

.field public ۫:J

.field public final ۬:J

.field public final ᩶:Ljava/util/ArrayList;

.field public ᩸:Z

.field public final ᩹:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۨ᩺ۜ;->᩶:Ljava/util/ArrayList;

    .line 36
    new-instance v0, Ljava/io/File;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۨ᩺ۜ;->᩹:Ljava/io/File;

    const-wide/32 v0, 0x10000000

    .line 37
    iput-wide v0, p0, Ll/ۨ᩺ۜ;->ۙ:J

    const-wide/32 v0, 0x20000000

    .line 38
    iput-wide v0, p0, Ll/ۨ᩺ۜ;->۬:J

    return-void
.end method

.method private ֫()V
    .locals 7

    .line 110
    iget-object v0, p0, Ll/ۨ᩺ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_0
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 111
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤ᩺ۜ;

    .line 112
    iget-boolean v3, v2, Ll/ۤ᩺ۜ;->ܽ:Z

    if-eqz v3, :cond_0

    iget-object v3, v2, Ll/ۤ᩺ۜ;->ۧ:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, v2, Ll/ۤ᩺ۜ;->ۧ:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 113
    :cond_1
    iget-wide v3, p0, Ll/ۨ᩺ۜ;->۫:J

    iget-wide v5, v2, Ll/ۤ᩺ۜ;->֫:J

    sub-long/2addr v3, v5

    iput-wide v3, p0, Ll/ۨ᩺ۜ;->۫:J

    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ۨ᩺ۜ;Ll/ۤ᩺ۜ;ILl/ܿۖ᩷;)V
    .locals 7

    .line 101
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    int-to-long p2, p2

    .line 102
    iget-wide v0, p0, Ll/ۨ᩺ۜ;->ۙ:J

    iget-wide v2, p1, Ll/ۤ᩺ۜ;->֫:J

    sub-long/2addr v0, v2

    cmp-long v4, p2, v0

    if-gtz v4, :cond_0

    iget-wide v0, p0, Ll/ۨ᩺ۜ;->۬:J

    iget-wide v4, p0, Ll/ۨ᩺ۜ;->۫:J

    sub-long/2addr v0, v4

    cmp-long v6, p2, v0

    if-gtz v6, :cond_0

    add-long/2addr v2, p2

    .line 105
    iput-wide v2, p1, Ll/ۤ᩺ۜ;->֫:J

    add-long/2addr v4, p2

    .line 106
    iput-wide v4, p0, Ll/ۨ᩺ۜ;->۫:J

    return-void

    .line 103
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Image source preparation budget exhausted"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۨ᩺ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۨ᩺ۜ;->᩸:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۨ᩺ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨ᩺ۜ;->֫()V

    return-void
.end method

.method private ܽ()V
    .locals 2

    .line 120
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 122
    iget-object v0, p0, Ll/ۨ᩺ۜ;->ۗ:Ljava/lang/Thread;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩺ۜ;->ۗ:Ljava/lang/Thread;

    return-void

    .line 123
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Image source store accessed from another worker"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Image source store requires a worker thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܽ(Ll/ۨ᩺ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨ᩺ۜ;->ܽ()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 131
    invoke-direct {p0}, Ll/ۨ᩺ۜ;->ܽ()V

    const/4 v0, 0x1

    .line 132
    iput-boolean v0, p0, Ll/ۨ᩺ۜ;->᩸:Z

    .line 133
    iget-object v1, p0, Ll/ۨ᩺ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤ᩺ۜ;

    iput-boolean v0, v3, Ll/ۤ᩺ۜ;->ܽ:Z

    goto :goto_0

    .line 134
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩺ۜ;->֫()V

    .line 135
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Ll/ۨ᩺ۜ;->᩹:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩺ۨۜ;ZLl/ܿۖ᩷;)Ll/ۛ᩺ۜ;
    .locals 9

    .line 43
    invoke-direct {p0}, Ll/ۨ᩺ۜ;->ܽ()V

    .line 44
    iget-boolean v0, p0, Ll/ۨ᩺ۜ;->᩸:Z

    if-nez v0, :cond_a

    .line 45
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    if-nez p2, :cond_1

    .line 48
    invoke-virtual {p1}, Ll/᩺ۨۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ll/ۤۨۜ;

    const-string p2, "Image source requires foreground preparation"

    .line 181
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v3

    .line 50
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 51
    iget-wide v0, v3, Ll/ۨۨۜ;->ܽ:J

    iget-wide v4, p0, Ll/ۨ᩺ۜ;->ۙ:J

    cmp-long v2, v0, v4

    if-gtz v2, :cond_9

    .line 52
    invoke-virtual {p1}, Ll/᩺ۨۜ;->ܽ()Ljava/io/File;

    move-result-object v4

    .line 53
    invoke-virtual {p1}, Ll/᩺ۨۜ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v4, :cond_2

    goto/16 :goto_4

    .line 56
    :cond_2
    invoke-direct {p0}, Ll/ۨ᩺ۜ;->֫()V

    .line 57
    iget-object v0, p0, Ll/ۨ᩺ۜ;->᩹:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Could not create image source directory"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_4
    :goto_1
    new-instance v6, Ll/ۤ᩺ۜ;

    const-string v1, "source-"

    const-string v2, ".part"

    invoke-static {v1, v2, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    .line 206
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v1, v6, Ll/ۤ᩺ۜ;->ۧ:Ljava/io/File;

    .line 59
    iget-object v1, p0, Ll/ۨ᩺ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v4, v6, Ll/ۤ᩺ۜ;->ۧ:Ljava/io/File;

    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 63
    :try_start_1
    new-instance v4, Ll/۫᩺ۜ;

    invoke-direct {v4, p0, v6, p3, v1}, Ll/۫᩺ۜ;-><init>(Ll/ۨ᩺ۜ;Ll/ۤ᩺ۜ;Ll/ܿۖ᩷;Ljava/io/FileOutputStream;)V

    .line 78
    invoke-virtual {p1, v4, p2, p3}, Ll/᩺ۨۜ;->֫(Ljava/io/OutputStream;ZLl/ܿۖ᩷;)V

    .line 79
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 80
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 82
    iget-wide v4, v3, Ll/ۨۨۜ;->ܽ:J

    const-wide/16 v7, 0x0

    cmp-long p2, v4, v7

    if-ltz p2, :cond_6

    iget-wide v7, v6, Ll/ۤ᩺ۜ;->֫:J

    cmp-long p2, v7, v4

    if-nez p2, :cond_5

    goto :goto_2

    .line 83
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Image source ended with a different length than its metadata"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 84
    :cond_6
    :goto_2
    invoke-virtual {p1, v3}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 85
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 86
    new-instance v4, Ljava/io/File;

    iget-object p2, v6, Ll/ۤ᩺ۜ;->ۧ:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, ".image"

    invoke-virtual {p2, v2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v4, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    iget-object p2, v6, Ll/ۤ᩺ۜ;->ۧ:Ljava/io/File;

    invoke-virtual {p2, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 88
    iput-object v4, v6, Ll/ۤ᩺ۜ;->ۧ:Ljava/io/File;

    .line 89
    new-instance p2, Ll/ۛ᩺ۜ;

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ll/ۛ᩺ۜ;-><init>(Ll/ۨ᩺ۜ;Ll/᩺ۨۜ;Ll/ۨۨۜ;Ljava/io/File;Ll/ۤ᩺ۜ;)V

    return-object p2

    .line 87
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Could not publish prepared image source"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_0
    move-exception p1

    .line 62
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    const/4 p2, 0x1

    .line 94
    iput-boolean p2, v6, Ll/ۤ᩺ۜ;->ܽ:Z

    .line 95
    invoke-direct {p0}, Ll/ۨ᩺ۜ;->֫()V

    .line 97
    throw p1

    .line 54
    :cond_8
    :goto_4
    new-instance p2, Ll/ۛ᩺ۜ;

    const/4 v5, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Ll/ۛ᩺ۜ;-><init>(Ll/ۨ᩺ۜ;Ll/᩺ۨۜ;Ll/ۨۨۜ;Ljava/io/File;Ll/ۤ᩺ۜ;)V

    return-object p2

    .line 51
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Image source exceeds the preparation byte limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 44
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Image source store is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
