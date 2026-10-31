.class public final Ll/ۘۨܳ;
.super Ljava/util/zip/InflaterInputStream;
.source "573L"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:Z

.field public ᩹:Z


# virtual methods
.method public final close()V
    .locals 2

    .line 48
    iget-boolean v0, p0, Ll/ۘۨܳ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Ll/ۘۨܳ;->᩸:Z

    .line 53
    :try_start_0
    invoke-super {p0}, Ljava/util/zip/InflaterInputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    iget-object v0, p0, Ljava/util/zip/InflaterInputStream;->inf:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ljava/util/zip/InflaterInputStream;->inf:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->end()V

    .line 56
    throw v0
.end method

.method public final read([BII)I
    .locals 0

    .line 24
    invoke-super {p0, p1, p2, p3}, Ljava/util/zip/InflaterInputStream;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    .line 33
    iget-boolean p3, p0, Ll/ۘۨܳ;->᩹:Z

    if-eqz p3, :cond_0

    goto :goto_0

    .line 36
    :cond_0
    iget-object p3, p0, Ljava/util/zip/InflaterInputStream;->inf:Ljava/util/zip/Inflater;

    invoke-virtual {p3}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result p3

    if-nez p3, :cond_2

    .line 39
    iget-object p3, p0, Ljava/util/zip/InflaterInputStream;->inf:Ljava/util/zip/Inflater;

    invoke-virtual {p3}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result p3

    if-nez p3, :cond_1

    iget-object p3, p0, Ljava/util/zip/InflaterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {p3}, Ljava/io/InputStream;->read()I

    move-result p3

    if-ne p3, p2, :cond_1

    const/4 p2, 0x1

    .line 42
    iput-boolean p2, p0, Ll/ۘۨܳ;->᩹:Z

    return p1

    .line 40
    :cond_1
    new-instance p1, Ljava/util/zip/ZipException;

    const-string p2, "Trailing data after ZLIB stream"

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 37
    :cond_2
    new-instance p1, Ljava/util/zip/ZipException;

    const-string p2, "ZLIB stream requires a preset dictionary"

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
