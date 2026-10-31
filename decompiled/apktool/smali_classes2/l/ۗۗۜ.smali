.class public final Ll/ۗۗۜ;
.super Ljava/lang/Object;
.source "M799"

# interfaces
.implements Ll/۬ۗۜ;


# instance fields
.field public ֫:Ll/ۙۗۜ;

.field public final ۧ:Ll/ۧ۟ۜ;

.field public final ܽ:Ll/۫֡ۜ;


# direct methods
.method public constructor <init>(Ll/۫֡ۜ;Ll/ۧ۟ۜ;)V
    .locals 0

    .line 917
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 918
    iput-object p1, p0, Ll/ۗۗۜ;->ܽ:Ll/۫֡ۜ;

    .line 919
    iput-object p2, p0, Ll/ۗۗۜ;->ۧ:Ll/ۧ۟ۜ;

    return-void
.end method

.method public static ֫(Ll/۫֡ۜ;)Ll/ۗۗۜ;
    .locals 4

    .line 927
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 930
    :cond_0
    invoke-virtual {p0}, Ll/۫֡ۜ;->ۡ()Ll/۟ܰۜ;

    move-result-object v0

    if-nez v0, :cond_2

    if-eqz v0, :cond_1

    .line 939
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    :cond_1
    :goto_0
    return-object v2

    .line 934
    :cond_2
    :try_start_0
    invoke-static {v0}, Ll/֡۟ۜ;->֫(Ll/۟ܰۜ;)Ll/ۧ۟ۜ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 935
    invoke-virtual {v1}, Ll/ۧ۟ۜ;->֫()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 938
    :cond_3
    new-instance v2, Ll/ۗۗۜ;

    invoke-direct {v2, p0, v1}, Ll/ۗۗۜ;-><init>(Ll/۫֡ۜ;Ll/ۧ۟ۜ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 939
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-object v2

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-object v2

    :catchall_0
    move-exception p0

    .line 930
    :try_start_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method private ֫(I)Ll/ۙۗۜ;
    .locals 13

    .line 982
    iget-object v0, p0, Ll/ۗۗۜ;->ۧ:Ll/ۧ۟ۜ;

    iget-object v1, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    if-eqz v1, :cond_0

    .line 983
    invoke-static {v1}, Ll/ۙۗۜ;->֫(Ll/ۙۗۜ;)I

    move-result v2

    if-ne v2, p1, :cond_0

    return-object v1

    .line 1023
    :cond_0
    iget-object v1, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    const/4 v2, 0x0

    .line 1024
    iput-object v2, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    if-eqz v1, :cond_1

    .line 1026
    invoke-static {v1}, Ll/ۙۗۜ;->ܽ(Ll/ۙۗۜ;)V

    .line 987
    :cond_1
    iget-object v1, p0, Ll/ۗۗۜ;->ܽ:Ll/۫֡ۜ;

    invoke-virtual {v1}, Ll/۫֡ۜ;->ۡ()Ll/۟ܰۜ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 992
    new-instance v11, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v11}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 994
    :try_start_0
    new-instance v12, Ll/ܿۚۜ;

    .line 996
    invoke-virtual {v0}, Ll/ۧ۟ۜ;->ۧ()J

    move-result-wide v5

    .line 997
    invoke-virtual {v0, p1}, Ll/ۧ۟ۜ;->֫(I)J

    move-result-wide v7

    .line 998
    invoke-virtual {v0, p1}, Ll/ۧ۟ۜ;->ۧ(I)I

    move-result v0

    int-to-long v9, v0

    move-object v3, v12

    move-object v4, v1

    invoke-direct/range {v3 .. v10}, Ll/ܿۚۜ;-><init>(Ll/۟ܰۜ;JJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 999
    :try_start_1
    invoke-virtual {v11, v12}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 1000
    new-instance v0, Ll/ۙۗۜ;

    invoke-direct {v0, p1, v11, v12}, Ll/ۙۗۜ;-><init>(ILandroid/media/MediaMetadataRetriever;Ll/ܿۚۜ;)V

    .line 1001
    iput-object v0, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    move-object v2, v12

    goto :goto_0

    :catchall_1
    move-exception p1

    .line 1005
    :goto_0
    :try_start_2
    invoke-virtual {v11}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    nop

    .line 1008
    :goto_1
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    if-nez v2, :cond_2

    .line 1010
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1012
    :cond_2
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/io/IOException;

    .line 1013
    throw p1

    .line 1015
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to open fragmented MP4 preview chunk"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 989
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Missing fragmented MP4 preview metadata handle"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;
    .locals 2

    .line 523
    invoke-interface {p5}, Ll/᩶ۗۜ;->֫()V

    .line 945
    iget-object p5, p0, Ll/ۗۗۜ;->ۧ:Ll/ۧ۟ۜ;

    invoke-virtual {p5, p1, p2}, Ll/ۧ۟ۜ;->֫(J)I

    move-result p1

    .line 947
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۗۗۜ;->֫(I)Ll/ۙۗۜ;

    move-result-object p2

    .line 949
    invoke-static {p2}, Ll/ۙۗۜ;->ۧ(Ll/ۙۗۜ;)Landroid/media/MediaMetadataRetriever;

    move-result-object p2

    .line 951
    invoke-virtual {p5, p1}, Ll/ۧ۟ۜ;->ܽ(I)J

    move-result-wide v0

    .line 949
    invoke-static {p2, v0, v1, p3, p4}, Ll/۫ۗۜ;->֫(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 1023
    iget-object p1, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    const/4 p2, 0x0

    .line 1024
    iput-object p2, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    if-eqz p1, :cond_0

    .line 1026
    invoke-static {p1}, Ll/ۙۗۜ;->ܽ(Ll/ۙۗۜ;)V

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public final ֫()V
    .locals 2

    .line 1023
    iget-object v0, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    const/4 v1, 0x0

    .line 1024
    iput-object v1, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    if-eqz v0, :cond_0

    .line 1026
    invoke-static {v0}, Ll/ۙۗۜ;->ܽ(Ll/ۙۗۜ;)V

    :cond_0
    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic ܽ()V
    .locals 0

    return-void
.end method

.method public final ᩳ()Ll/ܰۗۜ;
    .locals 1

    .line 964
    :try_start_0
    iget-object v0, p0, Ll/ۗۗۜ;->֫:Ll/ۙۗۜ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 969
    :cond_0
    invoke-static {v0}, Ll/ۙۗۜ;->ۧ(Ll/ۙۗۜ;)Landroid/media/MediaMetadataRetriever;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۗۜ;->֫(Landroid/media/MediaMetadataRetriever;)Ll/ܰۗۜ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
