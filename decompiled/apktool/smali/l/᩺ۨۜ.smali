.class public abstract Ll/᩺ۨۜ;
.super Ljava/lang/Object;
.source "66M9"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ܺܶۜ;Ll/ܰܺܳ;Ll/ᩳۜܳ;)Ll/᩺ۨۜ;
    .locals 1

    .line 86
    invoke-static {p0, p1, p2}, Ll/ᩳܰۜ;->֫(Ll/ܺܶۜ;Ll/ܰܺܳ;Ll/ᩳۜܳ;)Ll/᩺ۨۜ;

    move-result-object p0

    .line 87
    invoke-static {p2}, Ll/ۜۚۜ;->֫(Ll/ᩳۜܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ll/ۘܰۜ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۘܰۜ;-><init>(Ll/᩺ۨۜ;Ll/ܰܺܳ;Ll/ᩳۜܳ;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 1

    .line 66
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "Image source request canceled"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public ֫(Ljava/io/OutputStream;ZLl/ܿۖ᩷;)V
    .locals 3

    .line 52
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object p2

    if-eqz p2, :cond_2

    const v0, 0x8000

    :try_start_0
    new-array v0, v0, [B

    .line 56
    :cond_0
    :goto_0
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 57
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    .line 58
    invoke-static {p3}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v1, :cond_1

    .line 62
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void

    :cond_1
    if-lez v1, :cond_0

    const/4 v2, 0x0

    .line 60
    :try_start_1
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 53
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Image source returned no stream"

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_3

    .line 52
    :try_start_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw p1
.end method

.method public final ֫(Ll/ۨۨۜ;)V
    .locals 2

    .line 99
    :try_start_0
    invoke-virtual {p0}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    invoke-virtual {p1, v0}, Ll/ۨۨۜ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ll/ۛۨۜ;

    const-string v0, "Image source version changed"

    .line 175
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    throw p1

    :catch_0
    move-exception p1

    .line 101
    new-instance v0, Ll/ۛۨۜ;

    const-string v1, "Image source is no longer available"

    .line 176
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    throw v0
.end method

.method public ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۖ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ܰ᩺ۜ;

    return v0
.end method

.method public ۘ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/᩺᩺ۜ;

    return v0
.end method

.method public ۜ()Ljava/io/File;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ܳ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۘܰۜ;

    return v0
.end method

.method public ܽ()Ljava/io/File;
    .locals 1

    .line 71
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public abstract ᩳ()Ljava/lang/String;
.end method

.method public abstract ᩴ()Ljava/io/InputStream;
.end method

.method public abstract ᩵()Ll/ۨۨۜ;
.end method

.method public abstract ᩻()Ljava/lang/String;
.end method
