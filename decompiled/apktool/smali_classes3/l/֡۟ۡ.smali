.class public final Ll/֡۟ۡ;
.super Lcom/github/luben/zstd/ZstdInputStream;
.source "A6V5"


# instance fields
.field public final ᩸:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V
    .locals 0

    .line 17
    invoke-direct {p0, p2}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;)V

    .line 18
    iput-object p1, p0, Ll/֡۟ۡ;->᩸:Ll/ۗ᩺ۡ;

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 2

    .line 24
    :try_start_0
    invoke-super {p0}, Lcom/github/luben/zstd/ZstdInputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 26
    iget-object v1, p0, Ll/֡۟ۡ;->᩸:Ll/ۗ᩺ۡ;

    invoke-static {v0, v1}, Ll/ۖܰۡ;->֫(Ljava/io/IOException;Ll/ۗ᩺ۡ;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final read([BII)I
    .locals 0

    .line 33
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdInputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 35
    iget-object p2, p0, Ll/֡۟ۡ;->᩸:Ll/ۗ᩺ۡ;

    invoke-static {p1, p2}, Ll/ۖܰۡ;->֫(Ljava/io/IOException;Ll/ۗ᩺ۡ;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final skip(J)J
    .locals 0

    .line 42
    :try_start_0
    invoke-super {p0, p1, p2}, Lcom/github/luben/zstd/ZstdInputStream;->skip(J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 44
    iget-object p2, p0, Ll/֡۟ۡ;->᩸:Ll/ۗ᩺ۡ;

    invoke-static {p1, p2}, Ll/ۖܰۡ;->֫(Ljava/io/IOException;Ll/ۗ᩺ۡ;)V

    const/4 p1, 0x0

    throw p1
.end method
