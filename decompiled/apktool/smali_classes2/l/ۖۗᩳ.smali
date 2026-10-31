.class public final Ll/ۖۗᩳ;
.super Ljava/lang/Object;
.source "G6UC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/ۚ۬ᩳ;

.field public final ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>([BLl/ۚ۬ᩳ;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 17
    iput v0, p0, Ll/ۖۗᩳ;->᩹:I

    .line 20
    iput-object p1, p0, Ll/ۖۗᩳ;->᩸:[B

    .line 21
    iput-object p2, p0, Ll/ۖۗᩳ;->᩶:Ll/ۚ۬ᩳ;

    return-void
.end method

.method public static ֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;
    .locals 4

    .line 25
    array-length v0, p1

    const/16 v1, 0x2000

    if-gt v0, v1, :cond_2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 26
    :cond_0
    array-length v0, p1

    int-to-long v0, v0

    const-wide/16 v2, 0x17

    add-long/2addr v0, v2

    const-wide/16 v2, -0x8

    and-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p0

    .line 28
    :goto_0
    :try_start_0
    new-instance v0, Ll/ۖۗᩳ;

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-direct {v0, p1, p0}, Ll/ۖۗᩳ;-><init>([BLl/ۚ۬ᩳ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    if-eqz p0, :cond_1

    .line 30
    invoke-virtual {p0}, Ll/ۚ۬ᩳ;->close()V

    .line 31
    :cond_1
    throw p1

    .line 25
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Session metadata is too large"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩸۬ᩳ;JLl/۟۬ᩳ;)Ll/ۖۗᩳ;
    .locals 6

    .line 36
    iget v0, p3, Ll/۟۬ᩳ;->ܽ:I

    const/16 v1, 0x2000

    if-gt v0, v1, :cond_0

    .line 37
    iget-object v1, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    int-to-long v2, v0

    const-wide/16 v4, 0x17

    add-long/2addr v2, v4

    const-wide/16 v4, -0x8

    and-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0

    .line 39
    :try_start_0
    new-instance v1, Ll/ۖۗᩳ;

    invoke-virtual {p0, p1, p2, p3}, Ll/᩸۬ᩳ;->֫(JLl/۟۬ᩳ;)[B

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ll/ۖۗᩳ;-><init>([BLl/ۚ۬ᩳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    .line 41
    :goto_0
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    .line 42
    throw p0

    .line 36
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Session metadata is too large"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 54
    :try_start_0
    iget v1, p0, Ll/ۖۗᩳ;->᩹:I

    if-lez v1, :cond_1

    add-int/lit8 v1, v1, -0x1

    .line 55
    iput v1, p0, Ll/ۖۗᩳ;->᩹:I

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۖۗᩳ;->᩶:Ll/ۚ۬ᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :cond_0
    monitor-exit v0

    return-void

    .line 54
    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Session metadata already released"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 56
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫()[B
    .locals 1

    .line 15
    iget-object v0, p0, Ll/ۖۗᩳ;->᩸:[B

    return-object v0
.end method

.method public final declared-synchronized ᩺ۧ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 47
    :try_start_0
    iget v1, p0, Ll/ۖۗᩳ;->᩹:I

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 48
    iput v1, p0, Ll/ۖۗᩳ;->᩹:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit v0

    return-void

    .line 47
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Session metadata is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 49
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
