.class public final Ll/ۘۖܽ;
.super Ljava/lang/Object;
.source "E4G9"

# interfaces
.implements Ll/ۖۖܽ;


# instance fields
.field public ۗ:Landroid/net/Uri;

.field public ۙ:Landroid/os/ParcelFileDescriptor;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Z

.field public ᩹:Ljava/io/FileDescriptor;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Ll/ۘۖܽ;->᩸:Z

    .line 31
    iput-object p1, p0, Ll/ۘۖܽ;->ۗ:Landroid/net/Uri;

    .line 32
    iput-object p2, p0, Ll/ۘۖܽ;->᩶:Ljava/lang/String;

    .line 34
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۖܽ;->ۙ:Landroid/os/ParcelFileDescriptor;

    if-eqz p1, :cond_0

    .line 37
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    return-void

    .line 36
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    invoke-direct {p1}, Ljava/io/FileNotFoundException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 39
    :goto_0
    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-direct {p2}, Ljava/io/FileNotFoundException;-><init>()V

    .line 40
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 41
    throw p2
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 122
    iget-boolean v0, p0, Ll/ۘۖܽ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 125
    iput-boolean v0, p0, Ll/ۘۖܽ;->᩸:Z

    .line 126
    iget-object v0, p0, Ll/ۘۖܽ;->᩶:Ljava/lang/String;

    const-string v1, "r"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Ll/ۘۖܽ;->ۙ:Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_1

    .line 127
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    .line 129
    :cond_1
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ۘۖܽ;->ۗ:Landroid/net/Uri;

    invoke-static {v0}, Ll/ܳܶܿ;->ܽ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 117
    iget-boolean v0, p0, Ll/ۘۖܽ;->᩸:Z

    return v0
.end method

.method public final length()J
    .locals 6

    .line 79
    iget-object v0, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    :try_start_0
    sget v1, Landroid/system/OsConstants;->SEEK_CUR:I

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3, v1}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    move-result-wide v4

    .line 80
    sget v1, Landroid/system/OsConstants;->SEEK_END:I

    invoke-static {v0, v2, v3, v1}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    move-result-wide v1

    .line 81
    sget v3, Landroid/system/OsConstants;->SEEK_SET:I

    invoke-static {v0, v4, v5, v3}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v1

    :catch_0
    move-exception v0

    .line 84
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final position()J
    .locals 4

    .line 100
    :try_start_0
    iget-object v0, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    sget v1, Landroid/system/OsConstants;->SEEK_CUR:I

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3, v1}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    move-result-wide v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 102
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final read([BII)I
    .locals 1

    .line 57
    :try_start_0
    iget-object v0, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    invoke-static {v0, p1, p2, p3}, Landroid/system/Os;->read(Ljava/io/FileDescriptor;[BII)I

    move-result p1
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 p1, -0x1

    :cond_0
    return p1

    :catch_0
    move-exception p1

    .line 63
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final seek(J)V
    .locals 2

    .line 48
    :try_start_0
    iget-object v0, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    sget v1, Landroid/system/OsConstants;->SEEK_SET:I

    invoke-static {v0, p1, p2, v1}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 50
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final setLength(J)V
    .locals 1

    .line 91
    :try_start_0
    iget-object v0, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    invoke-static {v0, p1, p2}, Landroid/system/Os;->ftruncate(Ljava/io/FileDescriptor;J)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 93
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final write([BII)V
    .locals 1

    .line 70
    :try_start_0
    iget-object v0, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    invoke-static {v0, p1, p2, p3}, Landroid/system/Os;->write(Ljava/io/FileDescriptor;[BII)I
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 72
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final synthetic ֫ܽ()Ljava/nio/channels/FileChannel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۡ()Ll/ۖۖܽ;
    .locals 3

    .line 150
    new-instance v0, Ll/ۘۖܽ;

    iget-object v1, p0, Ll/ۘۖܽ;->ۗ:Landroid/net/Uri;

    iget-object v2, p0, Ll/ۘۖܽ;->᩶:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ll/ۘۖܽ;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۧ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 47
    new-instance v6, Ll/᩷ۖܽ;

    invoke-virtual {p0}, Ll/ۘۖܽ;->ۡ()Ll/ۖۖܽ;

    move-result-object v1

    move-object v0, v6

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final ܺ()V
    .locals 3

    .line 109
    :try_start_0
    iget-object v0, p0, Ll/ۘۖܽ;->᩹:Ljava/io/FileDescriptor;

    invoke-static {v0}, Landroid/system/Os;->fsync(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 111
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ܽ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 51
    new-instance v6, Ll/᩷ۖܽ;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final synthetic ᩻ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
