.class public final Ll/᩷᩵ۜ;
.super Ljava/io/FilterInputStream;
.source "W6LP"

# interfaces
.implements Ll/ܶ֨ᩴ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 407
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 431
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 433
    new-instance v1, Ll/ۜ᩵ۜ;

    invoke-direct {v1, v0}, Ll/ۜ᩵ۜ;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final read()I
    .locals 2

    .line 413
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 415
    new-instance v1, Ll/ۜ᩵ۜ;

    invoke-direct {v1, v0}, Ll/ۜ᩵ۜ;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final read([BII)I
    .locals 1

    .line 422
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 424
    new-instance p2, Ll/ۜ᩵ۜ;

    invoke-direct {p2, p1}, Ll/ۜ᩵ۜ;-><init>(Ljava/io/IOException;)V

    throw p2
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
