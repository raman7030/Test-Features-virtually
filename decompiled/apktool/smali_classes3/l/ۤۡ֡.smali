.class public abstract Ll/ۤۡ֡;
.super Ljava/io/FilterInputStream;
.source "P2G3"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩸:Ll/ᩳ᩷ᩳ;

.field public final ᩹:Ll/ۚ᩻ܽ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/ۙۡ֡;)V
    .locals 0

    .line 146
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 147
    new-instance p1, Ll/ۚ᩻ܽ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۡ֡;->᩹:Ll/ۚ᩻ܽ;

    .line 148
    sget-object p1, Ll/֨ۡ֡;->۠:Ll/ᩳ᩷ᩳ;

    iput-object p1, p0, Ll/ۤۡ֡;->᩸:Ll/ᩳ᩷ᩳ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 232
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 449
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 456
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2}, Ll/ۤۡ֡;->֫(Ljava/io/IOException;)V

    throw v1

    :catch_1
    move-exception v0

    .line 452
    invoke-virtual {p0, v0}, Ll/ۤۡ֡;->֫(Ljava/io/IOException;)V

    throw v1

    :cond_0
    return-void
.end method

.method public read()I
    .locals 2

    .line 294
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    .line 295
    :cond_0
    invoke-virtual {p0, v1}, Ll/ۤۡ֡;->֫(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 298
    invoke-virtual {p0, v0}, Ll/ۤۡ֡;->֫(Ljava/io/IOException;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public read([BII)I
    .locals 1

    .line 346
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    .line 347
    invoke-virtual {p0, p1}, Ll/ۤۡ֡;->֫(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 350
    invoke-virtual {p0, p1}, Ll/ۤۡ֡;->֫(Ljava/io/IOException;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public skip(J)J
    .locals 1

    .line 391
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 393
    invoke-virtual {p0, p1}, Ll/ۤۡ֡;->֫(Ljava/io/IOException;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ֫(I)V
    .locals 0

    .line 170
    iget-object p1, p0, Ll/ۤۡ֡;->᩸:Ll/ᩳ᩷ᩳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Ljava/io/IOException;)V
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ۤۡ֡;->᩹:Ll/ۚ᩻ܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    throw p1
.end method
