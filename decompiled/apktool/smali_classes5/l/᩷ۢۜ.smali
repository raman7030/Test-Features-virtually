.class public final Ll/᩷ۢۜ;
.super Ljava/lang/Object;
.source "J71B"

# interfaces
.implements Ll/ܿۢۜ;


# static fields
.field public static final ܳ:Ll/᩷ۢۜ;


# instance fields
.field public final ֫:Ll/᩻ۢۜ;

.field public ۧ:Ll/ۜۢۜ;

.field public ܽ:J

.field public ܿ:Z

.field public ᩳ:Ljava/io/RandomAccessFile;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ll/᩻ۢۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v1, Ll/᩷ۢۜ;

    invoke-direct {v1, v0}, Ll/᩷ۢۜ;-><init>(Ll/᩻ۢۜ;)V

    sput-object v1, Ll/᩷ۢۜ;->ܳ:Ll/᩷ۢۜ;

    return-void
.end method

.method public constructor <init>(Ll/᩻ۢۜ;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Ll/᩷ۢۜ;->֫:Ll/᩻ۢۜ;

    return-void
.end method

.method public static ֫(Ll/᩻ۢۜ;Ljava/io/File;Ljava/io/File;)Ll/ۜۢۜ;
    .locals 12

    .line 171
    new-instance v0, Ljava/io/File;

    const-string v1, "android_api_36_public_boot_hierarchy.index.tmp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 172
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 173
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unable to delete stale boot hierarchy temp file"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 177
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ll/᩻ۢۜ;->֫()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 178
    :try_start_1
    invoke-static {p0}, Ll/֨ۨۡ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 179
    :try_start_2
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 180
    :try_start_3
    new-instance v2, Ljava/io/BufferedOutputStream;

    const v3, 0x8000

    invoke-direct {v2, v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    new-array v3, v3, [B

    const-wide/16 v4, 0x0

    .line 183
    :goto_1
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    const-wide/32 v8, 0x341cc8

    if-eq v6, v7, :cond_3

    int-to-long v10, v6

    add-long/2addr v4, v10

    cmp-long v7, v4, v8

    if-gtz v7, :cond_2

    const/4 v7, 0x0

    .line 188
    invoke-virtual {v2, v3, v7, v6}, Ljava/io/BufferedOutputStream;->write([BII)V

    goto :goto_1

    .line 186
    :cond_2
    new-instance p2, Ljava/io/IOException;

    const-string v3, "Boot hierarchy download exceeds expected size"

    invoke-direct {p2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 190
    :cond_3
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->flush()V

    .line 191
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/FileDescriptor;->sync()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 192
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    cmp-long p0, v4, v8

    if-nez p0, :cond_6

    .line 196
    invoke-static {v0}, Ll/ۜۢۜ;->֫(Ljava/io/File;)Ll/ۜۢۜ;

    move-result-object p0

    .line 71
    invoke-virtual {v0, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    if-eqz p1, :cond_5

    .line 201
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 203
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_4
    return-object p0

    .line 72
    :cond_5
    :try_start_9
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unable to publish boot hierarchy index"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 194
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Boot hierarchy download size mismatch"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    :catchall_0
    move-exception p2

    .line 177
    :try_start_a
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_b
    invoke-virtual {p2, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_c
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    :try_start_d
    invoke-virtual {p2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception p2

    :try_start_e
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p1

    :try_start_f
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :catchall_6
    move-exception p1

    :try_start_10
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_5

    :catchall_7
    move-exception p0

    :try_start_11
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception p0

    .line 201
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 203
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 205
    :cond_7
    throw p0
.end method

.method private ۧ()Z
    .locals 5

    .line 133
    iget-object v0, p0, Ll/᩷ۢۜ;->֫:Ll/᩻ۢۜ;

    iget-object v1, p0, Ll/᩷ۢۜ;->ۧ:Ll/ۜۢۜ;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 136
    :cond_0
    iget-boolean v1, p0, Ll/᩷ۢۜ;->ܿ:Z

    if-eqz v1, :cond_1

    goto :goto_3

    .line 65
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-static {}, Ll/ۙ᩸᩷;->ۜ()Ljava/io/File;

    move-result-object v3

    const-string v4, "mcp/xref"

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 141
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 142
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to create boot hierarchy directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_3
    :goto_0
    new-instance v3, Ljava/io/File;

    const-string v4, "android_api_36_public_boot_hierarchy.index"

    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 148
    :try_start_1
    invoke-static {v3}, Ll/ۜۢۜ;->֫(Ljava/io/File;)Ll/ۜۢۜ;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 150
    :catch_0
    :try_start_2
    invoke-static {v0, v1, v3}, Ll/᩷ۢۜ;->֫(Ll/᩻ۢۜ;Ljava/io/File;Ljava/io/File;)Ll/ۜۢۜ;

    move-result-object v0

    .line 153
    :goto_1
    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v4, "r"

    invoke-direct {v1, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Ll/᩷ۢۜ;->ᩳ:Ljava/io/RandomAccessFile;

    .line 154
    iput-object v0, p0, Ll/᩷ۢۜ;->ۧ:Ll/ۜۢۜ;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_2
    return v2

    .line 210
    :catch_1
    iput-boolean v2, p0, Ll/᩷ۢۜ;->ܿ:Z

    .line 211
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۢۜ;->ܽ:J

    const/4 v0, 0x0

    .line 212
    iput-object v0, p0, Ll/᩷ۢۜ;->ۧ:Ll/ۜۢۜ;

    .line 213
    iget-object v1, p0, Ll/᩷ۢۜ;->ᩳ:Ljava/io/RandomAccessFile;

    if-eqz v1, :cond_4

    .line 215
    :try_start_3
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 218
    :catch_2
    iput-object v0, p0, Ll/᩷ۢۜ;->ᩳ:Ljava/io/RandomAccessFile;

    :cond_4
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method public static ܽ()Ll/᩷ۢۜ;
    .locals 1

    .line 87
    sget-object v0, Ll/᩷ۢۜ;->ܳ:Ll/᩷ۢۜ;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܽۢۜ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 113
    :try_start_0
    invoke-direct {p0}, Ll/᩷ۢۜ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 114
    sget-object p1, Ll/ܽۢۜ;->ᩳ:Ll/ܽۢۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 117
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/᩷ۢۜ;->ۧ:Ll/ۜۢۜ;

    iget-object v2, p0, Ll/᩷ۢۜ;->ᩳ:Ljava/io/RandomAccessFile;

    invoke-virtual {v1, v2, p1, p2}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;Ljava/lang/String;Ljava/lang/String;)Ll/ܽۢۜ;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :catch_0
    const/4 p1, 0x1

    .line 210
    :try_start_2
    iput-boolean p1, p0, Ll/᩷ۢۜ;->ܿ:Z

    .line 211
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩷ۢۜ;->ܽ:J

    const/4 p1, 0x0

    .line 212
    iput-object p1, p0, Ll/᩷ۢۜ;->ۧ:Ll/ۜۢۜ;

    .line 213
    iget-object p2, p0, Ll/᩷ۢۜ;->ᩳ:Ljava/io/RandomAccessFile;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p2, :cond_1

    .line 215
    :try_start_3
    invoke-virtual {p2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 218
    :catch_1
    :try_start_4
    iput-object p1, p0, Ll/᩷ۢۜ;->ᩳ:Ljava/io/RandomAccessFile;

    .line 121
    :cond_1
    sget-object p1, Ll/ܽۢۜ;->ᩳ:Ll/ܽۢۜ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 104
    :try_start_0
    iget-object v1, p0, Ll/᩷ۢۜ;->ۧ:Ll/ۜۢۜ;

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/᩷ۢۜ;->ܿ:Z

    if-eqz v1, :cond_0

    .line 224
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Ll/᩷ۢۜ;->ܽ:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    const-wide/32 v3, 0xea60

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 105
    iput-boolean v1, p0, Ll/᩷ۢۜ;->ܿ:Z

    .line 107
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/᩷ۢۜ;->ۧ()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
