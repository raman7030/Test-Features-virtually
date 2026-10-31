.class public abstract Ll/ܰܺܳ;
.super Ljava/lang/Object;
.source "PAJ1"


# instance fields
.field public ᩸:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
.end method

.method public abstract ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
.end method

.method public abstract ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
.end method

.method public ֫(Ll/ᩳۜܳ;)Ll/᩵ۤܳ;
    .locals 5

    const/4 v0, 0x0

    .line 113
    invoke-virtual {p0, v0, p1}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    .line 117
    :cond_0
    new-instance v0, Ll/᩵ۤܳ;

    new-instance v2, Ll/᩵ۛۡ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Ll/᩵ۛۡ;-><init>(J)V

    const/4 p1, 0x1

    invoke-direct {v0, v1, v2, p1}, Ll/᩵ۤܳ;-><init>(Ljava/io/InputStream;Ll/᩵ۛۡ;Z)V

    return-object v0
.end method

.method public abstract ֫(Ljava/security/MessageDigest;)V
.end method

.method public ֫(Ljava/util/Set;Ll/᩺ܺܳ;)V
    .locals 3

    .line 124
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 126
    :try_start_0
    invoke-interface {v0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 127
    invoke-interface {p2, v0, v2}, Ll/᩺ܺܳ;->֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V

    goto :goto_0

    .line 129
    :cond_1
    invoke-virtual {p0, v2, v0}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll/᩺ܺܳ;->֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 131
    invoke-interface {p2, v0}, Ll/᩺ܺܳ;->֫(Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 135
    :cond_2
    :goto_0
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_3
    :goto_1
    return-void
.end method

.method public ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;)V
    .locals 3

    .line 145
    invoke-virtual {p0, p1, p2}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object p1

    if-nez p1, :cond_1

    .line 147
    :try_start_0
    invoke-interface {p3}, Ll/ۗ᩻ܳ;->ܳ֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 160
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void

    .line 150
    :cond_1
    :try_start_1
    new-instance v0, Ll/᩵ۛۡ;

    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance p2, Ll/ᩳۡܳ;

    invoke-direct {p2, p3}, Ll/ᩳۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    const p2, 0x19000

    new-array p2, p2, [B

    .line 153
    :cond_2
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    .line 154
    invoke-interface {p3, v1, p2}, Ll/ۗ᩻ܳ;->֫(I[B)V

    .line 155
    invoke-virtual {v0, v1}, Ll/᩵ۛۡ;->֫(I)Z

    .line 156
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    .line 160
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_4

    .line 145
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    throw p2
.end method

.method public abstract ֫(Ll/ۤۜܽ;)V
.end method

.method public abstract ֫(Z)V
.end method

.method public final ֫()[B
    .locals 2

    .line 89
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 90
    invoke-virtual {p0}, Ll/ܰܺܳ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 91
    invoke-virtual {p0, v0}, Ll/ܰܺܳ;->֫(Ll/ۤۜܽ;)V

    .line 92
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 2

    .line 165
    invoke-virtual {p0, p1}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 167
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to get file item: "

    .line 0
    invoke-static {v1, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 167
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ܽ()Ljava/lang/String;
.end method

.method public ᩳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Ll/ܰܺܳ;->᩸:Z

    return v0
.end method
